from __future__ import annotations

import csv
import re
from collections import defaultdict
from dataclasses import dataclass
from pathlib import Path

import pandas as pd

from .models import Question


@dataclass
class ExamPage:
    course: str
    label: str
    url: str
    questions: list[Question]
    index: int


def export_all(questions: list[Question], output_dir: Path) -> None:
    output_dir.mkdir(parents=True, exist_ok=True)
    grouped: dict[tuple[str, str], list[Question]] = defaultdict(list)
    for question in questions:
        grouped[(question.ccna_course, question.chapter)].append(question)

    for (course, chapter), chapter_questions in sorted(grouped.items()):
        course_dir = output_dir / course
        course_dir.mkdir(parents=True, exist_ok=True)
        (course_dir / f"{chapter}.md").write_text(
            _render_chapter_markdown(course, chapter, chapter_questions),
            encoding="utf-8",
        )

    (output_dir / "all_questions_deduplicated.md").write_text(
        _render_combined_markdown(questions),
        encoding="utf-8",
    )
    _write_index_csv(questions, output_dir / "questions_index.csv")


def export_exam_pages(pages: list[ExamPage], output_dir: Path) -> None:
    output_dir.mkdir(parents=True, exist_ok=True)
    for page in pages:
        course_dir = output_dir / page.course
        course_dir.mkdir(parents=True, exist_ok=True)
        path = course_dir / slugify_filename(page.index, page.label)
        path.write_text(_render_exam_page_markdown(page), encoding="utf-8")


def slugify_filename(index: int, label: str) -> str:
    cleaned = re.sub(r"[^A-Za-z0-9]+", "_", label).strip("_")
    cleaned = re.sub(r"_+", "_", cleaned)
    return f"{index:02d}_{cleaned or 'Exam'}.md"


def _render_exam_page_markdown(page: ExamPage) -> str:
    lines = [f"# {_course_label(page.course)} - {page.label}", ""]
    if not page.questions:
        lines.extend(["No questions were parsed from this page.", ""])
    for index, question in enumerate(page.questions, start=1):
        lines.extend(_render_question(question, index, include_source=False))
    return "\n".join(lines).rstrip() + "\n"


def _render_chapter_markdown(course: str, chapter: str, questions: list[Question]) -> str:
    if chapter == "Final_Exam":
        title = questions[0].chapter_title if questions else "Final Exam"
        heading = f"# {_course_label(course)} - Final Exam"
    else:
        chapter_number = _chapter_number(chapter)
        title = questions[0].chapter_title if questions else f"Chapter {chapter_number}"
        heading = f"# {_course_label(course)} - Chapter {chapter_number}: {title}"
    lines = [heading, "", "Source pages:", ""]
    for url in _source_urls(questions):
        lines.append(f"* {url}")
    lines.extend(["", "---", ""])

    for index, question in enumerate(questions, start=1):
        lines.extend(_render_question(question, index))
    return "\n".join(lines).rstrip() + "\n"


def _render_combined_markdown(questions: list[Question]) -> str:
    lines = ["# All CCNA Questions - Deduplicated", ""]
    for index, question in enumerate(questions, start=1):
        lines.extend(_render_question(question, index, include_metadata=True))
    return "\n".join(lines).rstrip() + "\n"


def _render_question(
    question: Question,
    display_number: int,
    include_metadata: bool = False,
    include_source: bool = True,
) -> list[str]:
    lines = [f"## Question {display_number}", "", "**Question:**", question.question_text, ""]
    if include_metadata:
        lines.extend(
            [
                "**Metadata:**",
                f"{_course_label(question.ccna_course)} | {question.version or 'unknown version'} | {question.chapter}",
                "",
            ]
        )
    if question.images:
        lines.extend(["**Images:**"])
        for image in question.images:
            target = image.local_path or image.src
            lines.append(f"![{image.alt or 'Question image'}]({target})")
        lines.append("")
    if question.choices:
        lines.extend(["**Choices:**"])
        for offset, choice in enumerate(question.choices):
            label = chr(ord("A") + offset)
            lines.append(f"- **{label}.** {choice}")
        lines.append("")
    if question.correct_answer:
        lines.extend(["**Correct Answer:**", question.correct_answer, ""])
    if question.explanation:
        lines.extend(["**Explanation:**", question.explanation, ""])
    if include_source:
        lines.extend(["**Source:**", ", ".join(question.source_urls), ""])
    lines.extend(["---", ""])
    return lines


def _write_index_csv(questions: list[Question], path: Path) -> None:
    rows = [
        {
            "id": question.id,
            "ccna_course": question.ccna_course,
            "version": question.version,
            "chapter": question.chapter,
            "question_text": question.question_text,
            "correct_answer": question.correct_answer,
            "source_urls": " | ".join(question.source_urls),
            "duplicate_count": question.duplicate_count,
        }
        for question in questions
    ]
    if rows:
        pd.DataFrame(rows).to_csv(path, index=False, quoting=csv.QUOTE_MINIMAL)
    else:
        pd.DataFrame(
            columns=[
                "id",
                "ccna_course",
                "version",
                "chapter",
                "question_text",
                "correct_answer",
                "source_urls",
                "duplicate_count",
            ]
        ).to_csv(path, index=False)


def _course_label(course: str) -> str:
    if course == "CCNA1":
        return "CCNA 1"
    if course == "CCNA2":
        return "CCNA 2"
    if course.lower().startswith("ccna1_v"):
        return "CCNA 1 " + course.split("_", 1)[1]
    if course.lower().startswith("ccna2_v"):
        return "CCNA 2 " + course.split("_", 1)[1]
    return course or "CCNA"


def _chapter_number(chapter: str) -> int:
    try:
        return int(chapter.rsplit("_", 1)[1])
    except (IndexError, ValueError):
        return 0


def _source_urls(questions: list[Question]) -> list[str]:
    seen: set[str] = set()
    result: list[str] = []
    for question in questions:
        for url in question.source_urls:
            if url not in seen:
                seen.add(url)
                result.append(url)
    return result
