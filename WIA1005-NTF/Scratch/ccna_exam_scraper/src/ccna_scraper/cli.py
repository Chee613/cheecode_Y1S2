from __future__ import annotations

import argparse
import logging
import sys
from collections import defaultdict
from pathlib import Path

from .assets import download_page_images
from .dedupe import deduplicate_questions
from .exporter import ExamPage, export_all, export_exam_pages
from .parser import parse_page
from .scraper import FetchConfig, PoliteFetcher, load_exam_manifest, load_urls


def main(argv: list[str] | None = None) -> int:
    args = build_parser().parse_args(argv)
    log_path = args.output / "scrape_log.txt"
    logger = configure_logging(log_path)

    manifest_entries = load_exam_manifest(args.manifest) if args.manifest else []
    urls = load_urls(args.urls) if args.urls else []
    fetcher = PoliteFetcher(
        FetchConfig(
            user_agent=args.user_agent,
            timeout_seconds=args.timeout,
            retries=args.retries,
            delay_seconds=args.delay,
        ),
        logger,
    )

    if manifest_entries:
        pages = []
        html_cache: dict[str, str | None] = {}
        per_course_counts: dict[str, int] = defaultdict(int)
        for entry in manifest_entries:
            if not _is_allowed_exam_url(entry.url):
                logger.info("Skipped unrelated URL from manifest: %s", entry.url)
                continue
            if entry.url not in html_cache:
                html_cache[entry.url] = fetcher.fetch(entry.url)
            html = html_cache[entry.url]
            per_course_counts[entry.course] += 1
            page_index = per_course_counts[entry.course]
            if not html:
                pages.append(ExamPage(entry.course, entry.label, entry.url, [], page_index))
                continue
            questions = parse_page(html, entry.url, course_override=_base_course_name(entry.course))
            for question in questions:
                question.ccna_course = entry.course
                if not question.version:
                    question.version = "v7.0"
            logger.info("Parsed %s questions for %s - %s", len(questions), entry.course, entry.label)
            pages.append(ExamPage(entry.course, entry.label, entry.url, questions, page_index))

        if not args.skip_images:
            download_page_images(pages, args.output, fetcher, logger)
        export_exam_pages(pages, args.output)
        logger.info("Exported %s exam page files to %s", len(pages), args.output.resolve())
        return 0

    all_questions = []
    for url in urls:
        if not _is_ccna_1_or_2_url(url):
            logger.info("Skipped non-CCNA1/CCNA2 URL: %s", url)
            continue
        html = fetcher.fetch(url)
        if not html:
            continue
        questions = parse_page(html, url)
        if not questions:
            logger.warning("No questions parsed from %s", url)
            continue
        logger.info("Parsed %s questions from %s", len(questions), url)
        all_questions.extend(questions)

    deduped = deduplicate_questions(all_questions, fuzzy_threshold=args.fuzzy_threshold)
    duplicate_removed = len(all_questions) - len(deduped)
    logger.info("Questions before dedupe: %s", len(all_questions))
    logger.info("Questions after dedupe: %s", len(deduped))
    logger.info("Duplicates removed: %s", duplicate_removed)

    export_all(deduped, args.output)
    logger.info("Exported files to %s", args.output.resolve())
    return 0


def build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(description="Scrape public CCNA 1/2 practice Q&A pages into Markdown/CSV.")
    parser.add_argument("--manifest", type=Path, default=Path("exam_manifest.csv"), help="CSV with course,label,url columns.")
    parser.add_argument("--urls", type=Path, default=None, help="Legacy text file containing one URL per line.")
    parser.add_argument("--output", type=Path, default=Path("output"), help="Output directory.")
    parser.add_argument("--delay", type=float, default=3.0, help="Delay between requests in seconds.")
    parser.add_argument("--timeout", type=int, default=25, help="Request timeout in seconds.")
    parser.add_argument("--retries", type=int, default=2, help="Retry count after the first attempt.")
    parser.add_argument("--fuzzy-threshold", type=int, default=94, help="RapidFuzz ratio for near-duplicate questions.")
    parser.add_argument("--skip-images", action="store_true", help="Do not download or embed question images.")
    parser.add_argument(
        "--user-agent",
        default="CCNAStudyScraper/1.0 (+educational local script; contact: local-user)",
        help="Polite User-Agent sent with requests.",
    )
    return parser


def configure_logging(log_path: Path) -> logging.Logger:
    log_path.parent.mkdir(parents=True, exist_ok=True)
    logger = logging.getLogger("ccna_scraper")
    logger.setLevel(logging.INFO)
    logger.handlers.clear()
    formatter = logging.Formatter("%(asctime)s %(levelname)s %(message)s")

    file_handler = logging.FileHandler(log_path, encoding="utf-8")
    file_handler.setFormatter(formatter)
    logger.addHandler(file_handler)

    stream_handler = logging.StreamHandler()
    stream_handler.setFormatter(formatter)
    logger.addHandler(stream_handler)
    return logger


def _is_ccna_1_or_2_url(url: str) -> bool:
    lowered = url.lower()
    if any(blocked in lowered for blocked in ["cyberops", "security", "devnet", "linux", "it-essentials"]):
        return False
    return "ccna-1" in lowered or "ccna-2" in lowered or "itn" in lowered or "srwe" in lowered


def _is_allowed_exam_url(url: str) -> bool:
    lowered = url.lower()
    return not any(blocked in lowered for blocked in ["cyberops", "devnet", "linux"])


def _base_course_name(course: str) -> str:
    lowered = course.lower()
    if lowered.startswith("ccna1"):
        return "CCNA1"
    if lowered.startswith("ccna2"):
        return "CCNA2"
    return course


if __name__ == "__main__":
    sys.exit(main())
