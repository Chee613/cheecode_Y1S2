import logging
import tempfile
import unittest
from pathlib import Path

from ccna_scraper.assets import download_page_images
from ccna_scraper.exporter import ExamPage
from ccna_scraper.models import Question, QuestionImage


class FakeFetcher:
    def __init__(self):
        self.urls = []

    def fetch_binary(self, url):
        self.urls.append(url)
        return b"image-bytes", "image/png"


class AssetDownloadTests(unittest.TestCase):
    def test_download_page_images_saves_asset_and_sets_relative_markdown_path(self):
        question = Question(
            id="",
            number=1,
            question_text="Refer to the exhibit.",
            choices=[],
            correct_answer="",
            explanation="",
            source_urls=["https://example.test/page"],
            version="v7.0",
            ccna_course="CCNA2",
            chapter="Chapter_01",
            chapter_title="Chapter 1",
            images=[QuestionImage(src="https://example.test/uploads/exhibit.png", alt="Exhibit")],
        )
        page = ExamPage("CCNA2", "Modules 1 - 4", "https://example.test/page", [question], 2)
        fetcher = FakeFetcher()
        with tempfile.TemporaryDirectory() as tmp:
            output_dir = Path(tmp) / "output"

            download_page_images([page], output_dir, fetcher, logging.getLogger("test"))

            asset = output_dir / "assets" / "CCNA2" / "02_Modules_1_4" / "Q001_01_exhibit.png"
            self.assertTrue(asset.exists())
            self.assertEqual(asset.read_bytes(), b"image-bytes")
            self.assertEqual(question.images[0].local_path, "../assets/CCNA2/02_Modules_1_4/Q001_01_exhibit.png")

    def test_download_page_images_keeps_windows_paths_short(self):
        long_name = "CCNA-1-v7-Modules-1-3-Basic-Network-Connectivity-and-Communications-Exam-Answers-14.jpg"
        question = Question(
            id="",
            number=18,
            question_text="Refer to the exhibit.",
            choices=[],
            correct_answer="",
            explanation="",
            source_urls=["https://example.test/page"],
            version="v7.0",
            ccna_course="CCNA1",
            chapter="Chapter_01",
            chapter_title="Chapter 1",
            images=[QuestionImage(src=f"https://example.test/uploads/{long_name}", alt="Exhibit")],
        )
        page = ExamPage(
            "CCNA1",
            "Modules 1 - 3 Basic Network Connectivity and Communications Exam Answers",
            "https://example.test/page",
            [question],
            2,
        )
        with tempfile.TemporaryDirectory() as tmp:
            output_dir = Path(tmp) / "output"

            download_page_images([page], output_dir, FakeFetcher(), logging.getLogger("test"))

            asset_paths = list((output_dir / "assets").rglob("*.jpg"))
            self.assertEqual(len(asset_paths), 1)
            self.assertLessEqual(len(asset_paths[0].parent.name), 55)
            self.assertLessEqual(len(asset_paths[0].name), 80)
            self.assertLess(len(str(asset_paths[0])), 240)


if __name__ == "__main__":
    unittest.main()
