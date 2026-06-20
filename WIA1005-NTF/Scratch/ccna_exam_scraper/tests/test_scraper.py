import logging
import unittest

from pathlib import Path
import tempfile

from ccna_scraper.cli import _is_allowed_exam_url
from ccna_scraper.scraper import FetchConfig, PoliteFetcher, load_exam_manifest


class FakeResponse:
    status_code = 200
    text = "User-agent: *\nDisallow: /wp-admin/\nAllow: /\n"

    def raise_for_status(self):
        return None


class FakeSession:
    def __init__(self):
        self.headers = {}
        self.urls = []

    def get(self, url, timeout):
        self.urls.append((url, timeout))
        return FakeResponse()


class PoliteFetcherTests(unittest.TestCase):
    def test_allowed_by_robots_fetches_and_parses_robots_with_session(self):
        fetcher = PoliteFetcher(FetchConfig(timeout_seconds=7), logging.getLogger("test"))
        fake_session = FakeSession()
        fetcher.session = fake_session

        self.assertTrue(fetcher.allowed_by_robots("https://example.test/public-page.html"))
        self.assertFalse(fetcher.allowed_by_robots("https://example.test/wp-admin/"))
        self.assertEqual(fake_session.urls, [("https://example.test/robots.txt", 7)])

    def test_load_exam_manifest_reads_course_label_url_rows(self):
        with tempfile.TemporaryDirectory() as tmp:
            path = Path(tmp) / "manifest.csv"
            path.write_text(
                "course,label,url\n"
                "CCNA1,System Test Exam,https://example.test/system\n"
                "CCNA2,Final Exam,https://example.test/final\n",
                encoding="utf-8",
            )

            entries = load_exam_manifest(path)

            self.assertEqual(len(entries), 2)
            self.assertEqual(entries[0].course, "CCNA1")
            self.assertEqual(entries[0].label, "System Test Exam")
            self.assertEqual(entries[1].url, "https://example.test/final")

    def test_load_exam_manifest_preserves_v2_course_folder_names(self):
        with tempfile.TemporaryDirectory() as tmp:
            path = Path(tmp) / "manifest.csv"
            path.write_text(
                "course,label,url\n"
                "CCNA1_v2,Chapter 1,https://example.test/chapter-1\n",
                encoding="utf-8",
            )

            entries = load_exam_manifest(path)

            self.assertEqual(entries[0].course, "CCNA1_v2")

    def test_manifest_filter_allows_ccna_l2_security_urls(self):
        self.assertTrue(
            _is_allowed_exam_url(
                "https://itexamanswers.net/ccna-2-v7-modules-10-13-l2-security-and-wlans-exam-answers.html"
            )
        )
        self.assertFalse(_is_allowed_exam_url("https://itexamanswers.net/linux-essentials-final.html"))


if __name__ == "__main__":
    unittest.main()
