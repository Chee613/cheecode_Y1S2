from __future__ import annotations

from dataclasses import dataclass, field


@dataclass
class QuestionImage:
    src: str
    alt: str = ""
    local_path: str = ""


@dataclass
class Question:
    id: str
    number: int | None
    question_text: str
    choices: list[str]
    correct_answer: str
    explanation: str
    source_urls: list[str]
    version: str
    ccna_course: str
    chapter: str
    chapter_title: str
    duplicate_count: int = 1
    normalized_text: str = ""
    images: list[QuestionImage] = field(default_factory=list)
    extra: dict[str, str] = field(default_factory=dict)
