from __future__ import annotations

import re
from collections.abc import Iterable
from urllib.parse import urljoin, urlparse

from bs4 import BeautifulSoup, NavigableString, Tag

from .models import Question, QuestionImage

QUESTION_RE = re.compile(r"^\s*(?:question\s*)?(\d{1,3})[\).]\s+(.+)", re.IGNORECASE | re.DOTALL)
VERSION_RE = re.compile(r"\bv(?:ersion\s*)?(\d+(?:\.\d+){0,2})\b", re.IGNORECASE)
CHAPTER_RE = re.compile(r"\b(?:chapter|module)\s*(\d{1,2})\b", re.IGNORECASE)
COURSE_RE = re.compile(r"\bccna\s*([12])\b", re.IGNORECASE)
ANSWER_PREFIX_RE = re.compile(r"^(?:correct\s+answer|answer)\s*:?\s*(.+)$", re.IGNORECASE | re.DOTALL)
EXPLANATION_PREFIX_RE = re.compile(r"^(?:explanation|explain)\s*:?\s*", re.IGNORECASE)


def parse_page(html: str, source_url: str, course_override: str | None = None) -> list[Question]:
    soup = BeautifulSoup(html, "html.parser")
    article = _find_article_body(soup)
    metadata = detect_metadata(soup, source_url)
    if course_override:
        metadata["ccna_course"] = course_override
    blocks = _split_question_blocks(article)

    questions: list[Question] = []
    for number, nodes in blocks:
        parsed = _parse_question_block(number, nodes, source_url, metadata)
        if parsed and parsed.ccna_course in {"CCNA1", "CCNA2"}:
            questions.append(parsed)
    return questions


def detect_metadata(soup: BeautifulSoup, source_url: str) -> dict[str, str]:
    page_title = soup.title.get_text(" ", strip=True) if soup.title else ""
    heading_text = _first_heading_text(soup)
    metadata_text = _clean_text(
        " ".join(
            part
            for part in [
                page_title,
                heading_text,
                source_url.replace("-", " "),
            ]
            if part
        )
    )

    course_match = COURSE_RE.search(metadata_text)
    version_match = VERSION_RE.search(metadata_text)
    chapter_match = CHAPTER_RE.search(metadata_text)

    course = f"CCNA{course_match.group(1)}" if course_match else ""
    version = f"v{version_match.group(1)}" if version_match else ""
    chapter_number = int(chapter_match.group(1)) if chapter_match else 0
    is_final_exam = "final exam" in metadata_text.lower()
    chapter = f"Chapter_{chapter_number:02d}" if chapter_number else ("Final_Exam" if is_final_exam else "Chapter_00")
    chapter_title = _detect_chapter_title(_clean_text(heading_text or page_title or metadata_text), chapter_number)

    return {
        "ccna_course": course,
        "version": version,
        "chapter": chapter,
        "chapter_title": chapter_title,
    }


def _find_article_body(soup: BeautifulSoup) -> Tag:
    for selector in [".thecontent", ".entry-content", ".td-post-content", ".post-content", "article", "main"]:
        found = soup.select_one(selector)
        if found:
            return found
    return soup.body or soup


def _first_heading_text(soup: BeautifulSoup) -> str:
    heading = soup.find(["h1", "h2"])
    return heading.get_text(" ", strip=True) if heading else ""


def _split_question_blocks(article: Tag) -> list[tuple[int, list[Tag]]]:
    blocks: list[tuple[int, list[Tag]]] = []
    current_number: int | None = None
    current_nodes: list[Tag] = []

    for node in _iter_content_nodes(article):
        text = _clean_text(node.get_text(" ", strip=True))
        if _is_noise_node(node, text):
            continue
        match = QUESTION_RE.match(text)
        if match and _looks_like_question_start(node, text):
            if current_number is not None and current_nodes:
                blocks.append((current_number, current_nodes))
            current_number = int(match.group(1))
            current_nodes = [node]
        elif current_number is not None:
            current_nodes.append(node)

    if current_number is not None and current_nodes:
        blocks.append((current_number, current_nodes))
    return blocks


def _iter_content_nodes(article: Tag) -> Iterable[Tag]:
    for child in article.children:
        if isinstance(child, NavigableString):
            continue
        if not isinstance(child, Tag):
            continue
        if child.name in {"script", "style", "noscript", "iframe", "form"}:
            continue
        text = _clean_text(child.get_text(" ", strip=True))
        if child.name in {"p", "ul", "ol", "h2", "h3", "h4"} or _is_explanation_node(child, text):
            yield child
            continue
        yield from _iter_content_nodes(child)


def _is_noise_node(node: Tag, text: str) -> bool:
    classes = " ".join(node.get("class", []))
    if not text and not node.find("img"):
        return True
    noisy_classes = ("sharedaddy", "code-block", "wpdiscuz", "navigation", "yarpp", "adngin")
    return any(marker in classes.lower() for marker in noisy_classes)


def _looks_like_question_start(node: Tag, text: str) -> bool:
    if node.name in {"h2", "h3", "h4", "p"}:
        return True
    return bool(node.find(["strong", "b"])) and "?" in text[:300]


def _parse_question_block(
    number: int,
    nodes: list[Tag],
    source_url: str,
    metadata: dict[str, str],
) -> Question | None:
    if not nodes:
        return None

    question_parts: list[str] = []
    choices: list[str] = []
    correct_answers: list[str] = []
    explanation_parts: list[str] = []
    images: list[QuestionImage] = []
    before_choices = True

    first_text = _strip_question_number(_clean_text(nodes[0].get_text(" ", strip=True)))
    if first_text:
        question_parts.append(first_text)
    images.extend(_extract_images(nodes[0], source_url))

    for node in nodes[1:]:
        images.extend(_extract_images(node, source_url))
        text = _clean_text(node.get_text(" ", strip=True))
        if not text:
            continue

        answer_match = ANSWER_PREFIX_RE.match(text)
        if answer_match:
            correct_answers.append(_clean_text(answer_match.group(1)))
            before_choices = False
            continue

        if node.name in {"ul", "ol"}:
            before_choices = False
            for item in node.find_all("li", recursive=False):
                choice_text = _clean_text(item.get_text(" ", strip=True))
                if not choice_text:
                    continue
                choices.append(choice_text)
                if _is_correct_choice(item):
                    correct_answers.append(choice_text)
            continue

        if _is_explanation_node(node, text):
            explanation_parts.append(EXPLANATION_PREFIX_RE.sub("", text).strip())
            before_choices = False
            continue

        if before_choices:
            question_parts.append(text)
        else:
            explanation_parts.append(EXPLANATION_PREFIX_RE.sub("", text).strip())

    question_text = _clean_text(" ".join(question_parts))
    if not question_text:
        return None

    return Question(
        id="",
        number=number,
        question_text=question_text,
        choices=_dedupe_preserve_order(choices),
        correct_answer="; ".join(_dedupe_preserve_order(correct_answers)),
        explanation=_clean_text(" ".join(part for part in explanation_parts if part)),
        source_urls=[source_url],
        version=metadata["version"],
        ccna_course=metadata["ccna_course"],
        chapter=metadata["chapter"],
        chapter_title=metadata["chapter_title"],
        images=_dedupe_images(images),
    )


def _is_correct_choice(item: Tag) -> bool:
    text_style = " ".join(
        [
            item.get("style", ""),
            " ".join(tag.get("style", "") for tag in item.find_all(True)),
            " ".join(item.get("class", [])),
            " ".join(" ".join(tag.get("class", [])) for tag in item.find_all(True)),
        ]
    ).lower()
    has_answer_marker = any(marker in text_style for marker in ["color: red", "color:red", "answer", "correct"])
    return has_answer_marker or bool(item.find(["strong", "b"]) and "color" in text_style)


def _is_explanation_node(node: Tag, text: str) -> bool:
    classes = " ".join(node.get("class", [])).lower()
    if "message_box" in classes or "success" in classes or "explanation" in classes:
        return True
    return bool(EXPLANATION_PREFIX_RE.match(text))


def _strip_question_number(text: str) -> str:
    return _clean_text(QUESTION_RE.sub(r"\2", text, count=1))


def _detect_chapter_title(title: str, chapter_number: int) -> str:
    if not chapter_number:
        if "final exam" in title.lower():
            return "Final Exam"
        return "Unknown Chapter"

    explicit = re.search(
        rf"\b(?:chapter|module)\s*{chapter_number}\b.*?(?:-|–|—|:)\s*([^|]+)$",
        title,
        re.IGNORECASE,
    )
    if explicit:
        candidate = explicit.group(1).strip(" :-–—")
        if candidate and "exam answers" not in candidate.lower() and "itexamanswers" not in candidate.lower():
            return candidate

    pattern = re.compile(
        rf"(?:chapter|module)\s*{chapter_number}\b\s*(?:exam answers|answers|:|-|–|—)*\s*(.*)",
        re.IGNORECASE,
    )
    match = pattern.search(title)
    if not match:
        return f"Chapter {chapter_number}"
    candidate = match.group(1)
    candidate = re.split(r"\s+-\s+|\s+\|\s+|100%|Full\b", candidate, maxsplit=1, flags=re.IGNORECASE)[0]
    candidate = candidate.strip(" :-–—")
    return candidate or f"Chapter {chapter_number}"


def _clean_text(text: str) -> str:
    text = text.replace("\xa0", " ")
    text = re.sub(r"\s+", " ", text)
    return text.strip()


def _dedupe_preserve_order(values: list[str]) -> list[str]:
    seen: set[str] = set()
    result: list[str] = []
    for value in values:
        key = value.casefold()
        if key in seen:
            continue
        seen.add(key)
        result.append(value)
    return result


def _extract_images(node: Tag, source_url: str) -> list[QuestionImage]:
    images: list[QuestionImage] = []
    for img in node.find_all("img"):
        src = img.get("src") or img.get("data-src") or img.get("data-lazy-src")
        if not src:
            srcset = img.get("srcset") or img.get("data-srcset")
            if srcset:
                src = srcset.split(",", 1)[0].strip().split(" ", 1)[0]
        if not src or src.startswith("data:"):
            continue
        absolute_src = urljoin(source_url, src)
        if _is_non_question_image(absolute_src):
            continue
        images.append(
            QuestionImage(
                src=absolute_src,
                alt=_clean_text(img.get("alt", "")) or "Question image",
            )
        )
    return images


def _is_non_question_image(src: str) -> bool:
    lowered = src.lower()
    return "/wp-content/plugins/" in lowered or "file-type-icons" in lowered


def _dedupe_images(images: list[QuestionImage]) -> list[QuestionImage]:
    seen: set[str] = set()
    result: list[QuestionImage] = []
    for image in images:
        if image.src in seen:
            continue
        seen.add(image.src)
        result.append(image)
    return result
