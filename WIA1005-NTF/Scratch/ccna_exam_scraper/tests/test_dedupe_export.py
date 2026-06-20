import tempfile
import unittest
from pathlib import Path

from ccna_scraper.dedupe import deduplicate_questions, normalize_question_text
from ccna_scraper.exporter import ExamPage, export_all, export_exam_pages, slugify_filename
from ccna_scraper.models import Question, QuestionImage


def make_question(text, url, number=1):
    return Question(
        id="",
        number=number,
        question_text=text,
        choices=["A", "B"],
        correct_answer="B",
        explanation="Because B is correct.",
        source_urls=[url],
        version="v7.0",
        ccna_course="CCNA2",
        chapter="Chapter_01",
        chapter_title="Switching Concepts",
    )


class DedupeExportTests(unittest.TestCase):
    def test_normalization_ignores_case_punctuation_spaces_and_numbering(self):
        self.assertEqual(
            normalize_question_text("1. Which route is BEST?"),
            normalize_question_text("which route is best"),
        )

    def test_deduplicate_merges_duplicate_source_urls(self):
        questions = [
            make_question("1. Which route is best?", "https://example.test/a"),
            make_question("Which route is best", "https://example.test/b", number=7),
        ]

        deduped = deduplicate_questions(questions, fuzzy_threshold=95)

        self.assertEqual(len(deduped), 1)
        self.assertEqual(deduped[0].duplicate_count, 2)
        self.assertEqual(
            deduped[0].source_urls,
            ["https://example.test/a", "https://example.test/b"],
        )

    def test_export_writes_chapter_markdown_combined_csv_and_log_target(self):
        questions = [make_question("Which route is best?", "https://example.test/a")]
        with tempfile.TemporaryDirectory() as tmp:
            output_dir = Path(tmp) / "output"

            export_all(questions, output_dir)

            self.assertTrue((output_dir / "CCNA2" / "Chapter_01.md").exists())
            self.assertTrue((output_dir / "all_questions_deduplicated.md").exists())
            self.assertTrue((output_dir / "questions_index.csv").exists())
            chapter_text = (output_dir / "CCNA2" / "Chapter_01.md").read_text(encoding="utf-8")
            self.assertIn("# CCNA 2 - Chapter 1: Switching Concepts", chapter_text)
            self.assertIn("Source pages:", chapter_text)

    def test_export_writes_final_exam_markdown_when_chapter_is_unknown(self):
        question = make_question("Which route is selected?", "https://example.test/final")
        question.chapter = "Final_Exam"
        question.chapter_title = "Final Exam"
        with tempfile.TemporaryDirectory() as tmp:
            output_dir = Path(tmp) / "output"

            export_all([question], output_dir)

            final_path = output_dir / "CCNA2" / "Final_Exam.md"
            self.assertTrue(final_path.exists())
            self.assertIn("# CCNA 2 - Final Exam", final_path.read_text(encoding="utf-8"))

    def test_slugify_filename_keeps_order_prefix_and_plain_words(self):
        self.assertEqual(
            slugify_filename(3, "Modules 1 - 3: Basic Network Connectivity and Communications Exam Answers"),
            "03_Modules_1_3_Basic_Network_Connectivity_and_Communications_Exam_Answers.md",
        )

    def test_export_exam_pages_writes_one_markdown_per_link_without_sources(self):
        page = ExamPage(
            course="CCNA1",
            label="Modules 1 - 3: Basic Network Connectivity and Communications Exam Answers",
            url="https://example.test/ccna1-modules-1-3",
            questions=[make_question("Which route is best?", "https://example.test/a")],
            index=2,
        )
        page.questions[0].ccna_course = "CCNA1"
        with tempfile.TemporaryDirectory() as tmp:
            output_dir = Path(tmp) / "output"

            export_exam_pages([page], output_dir)

            path = output_dir / "CCNA1" / "02_Modules_1_3_Basic_Network_Connectivity_and_Communications_Exam_Answers.md"
            self.assertTrue(path.exists())
            text = path.read_text(encoding="utf-8")
            self.assertIn("# CCNA 1 - Modules 1 - 3: Basic Network Connectivity and Communications Exam Answers", text)
            self.assertIn("## Question 1", text)
            self.assertIn("**Correct Answer:**", text)
            self.assertIn("- **A.** A", text)
            self.assertIn("- **B.** B", text)
            self.assertNotIn("Source", text)

    def test_export_exam_pages_renders_question_images(self):
        question = make_question("Refer to the exhibit. What happens?", "https://example.test/a")
        question.images.append(
            QuestionImage(
                src="https://example.test/exhibit.png",
                alt="Network exhibit",
                local_path="../assets/CCNA2/01_Page/exhibit.png",
            )
        )
        page = ExamPage(
            course="CCNA2",
            label="Page",
            url="https://example.test/page",
            questions=[question],
            index=1,
        )
        with tempfile.TemporaryDirectory() as tmp:
            output_dir = Path(tmp) / "output"

            export_exam_pages([page], output_dir)

            text = (output_dir / "CCNA2" / "01_Page.md").read_text(encoding="utf-8")
            self.assertIn("![Network exhibit](../assets/CCNA2/01_Page/exhibit.png)", text)


if __name__ == "__main__":
    unittest.main()
