from __future__ import annotations

import re
import string

from rapidfuzz import fuzz

from .models import Question

PUNCT_TRANSLATION = str.maketrans("", "", string.punctuation)


def normalize_question_text(text: str) -> str:
    text = re.sub(r"^\s*(?:question\s*)?\d{1,3}[\).]\s*", "", text, flags=re.IGNORECASE)
    text = text.casefold()
    text = text.translate(PUNCT_TRANSLATION)
    text = re.sub(r"\s+", " ", text)
    return text.strip()


def deduplicate_questions(questions: list[Question], fuzzy_threshold: int = 94) -> list[Question]:
    deduped: list[Question] = []
    normalized_seen: dict[str, Question] = {}

    for question in questions:
        normalized = normalize_question_text(question.question_text)
        question.normalized_text = normalized
        duplicate = normalized_seen.get(normalized)
        if duplicate is None and fuzzy_threshold:
            duplicate = _find_fuzzy_duplicate(normalized, deduped, fuzzy_threshold)

        if duplicate:
            _merge_question(duplicate, question)
        else:
            normalized_seen[normalized] = question
            deduped.append(question)

    for index, question in enumerate(deduped, start=1):
        question.id = f"Q{index:05d}"
    return deduped


def _find_fuzzy_duplicate(normalized: str, questions: list[Question], threshold: int) -> Question | None:
    if not normalized:
        return None
    for existing in questions:
        if abs(len(normalized) - len(existing.normalized_text)) > max(30, len(normalized) * 0.25):
            continue
        if fuzz.ratio(normalized, existing.normalized_text) >= threshold:
            return existing
    return None


def _merge_question(target: Question, incoming: Question) -> None:
    target.duplicate_count += incoming.duplicate_count
    for url in incoming.source_urls:
        if url not in target.source_urls:
            target.source_urls.append(url)
    if not target.correct_answer and incoming.correct_answer:
        target.correct_answer = incoming.correct_answer
    if not target.explanation and incoming.explanation:
        target.explanation = incoming.explanation
    if len(incoming.choices) > len(target.choices):
        target.choices = incoming.choices
