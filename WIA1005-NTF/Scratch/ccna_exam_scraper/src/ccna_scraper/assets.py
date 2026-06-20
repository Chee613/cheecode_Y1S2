from __future__ import annotations

import logging
import re
from pathlib import Path
from urllib.parse import urlparse

from .exporter import ExamPage, slugify_filename


def download_page_images(pages: list[ExamPage], output_dir: Path, fetcher, logger: logging.Logger) -> None:
    cache: dict[str, Path] = {}
    for page in pages:
        page_stem = _shorten(Path(slugify_filename(page.index, page.label)).stem, 55)
        asset_dir = output_dir / "assets" / page.course / page_stem
        for question_index, question in enumerate(page.questions, start=1):
            for image_index, image in enumerate(question.images, start=1):
                if image.src in cache:
                    image.local_path = _markdown_relative_path(page.course, cache[image.src])
                    continue
                fetched = fetcher.fetch_binary(image.src)
                if not fetched:
                    logger.warning("Could not download image: %s", image.src)
                    continue
                data, content_type = fetched
                asset_dir.mkdir(parents=True, exist_ok=True)
                filename = _image_filename(question_index, image_index, image.src, content_type)
                target = asset_dir / filename
                target.write_bytes(data)
                cache[image.src] = target
                image.local_path = _markdown_relative_path(page.course, target)
                logger.info("Downloaded image %s -> %s", image.src, target)


def _markdown_relative_path(course: str, target: Path) -> str:
    marker = Path("assets") / course
    parts = target.parts
    try:
        index = parts.index("assets")
        relative = Path(*parts[index:])
    except ValueError:
        relative = target
    return "../" + relative.as_posix()


def _image_filename(question_index: int, image_index: int, url: str, content_type: str) -> str:
    parsed_name = Path(urlparse(url).path).name
    stem = re.sub(r"[^A-Za-z0-9]+", "_", Path(parsed_name).stem).strip("_") or "image"
    stem = _shorten(stem, 65)
    ext = Path(parsed_name).suffix.lower()
    if not ext:
        ext = _extension_from_content_type(content_type)
    return f"Q{question_index:03d}_{image_index:02d}_{stem}{ext}"


def _shorten(value: str, max_length: int) -> str:
    if len(value) <= max_length:
        return value
    return value[:max_length].rstrip("_")


def _extension_from_content_type(content_type: str) -> str:
    lowered = content_type.lower()
    if "jpeg" in lowered or "jpg" in lowered:
        return ".jpg"
    if "gif" in lowered:
        return ".gif"
    if "webp" in lowered:
        return ".webp"
    if "svg" in lowered:
        return ".svg"
    return ".png"
