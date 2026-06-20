from __future__ import annotations

import logging
import csv
import re
import time
import urllib.robotparser
from dataclasses import dataclass
from pathlib import Path
from urllib.parse import urlparse

import requests


@dataclass
class FetchConfig:
    user_agent: str = "CCNAStudyScraper/1.0 (+educational local script; contact: local-user)"
    timeout_seconds: int = 25
    retries: int = 2
    delay_seconds: float = 3.0


@dataclass
class ExamManifestEntry:
    course: str
    label: str
    url: str


class PoliteFetcher:
    def __init__(self, config: FetchConfig, logger: logging.Logger):
        self.config = config
        self.logger = logger
        self.session = requests.Session()
        self.session.headers.update({"User-Agent": config.user_agent})
        self._robots: dict[str, urllib.robotparser.RobotFileParser] = {}

    def fetch(self, url: str) -> str | None:
        if not self.allowed_by_robots(url):
            self.logger.warning("Skipped by robots.txt: %s", url)
            return None

        for attempt in range(1, self.config.retries + 2):
            try:
                self.logger.info("Fetching %s (attempt %s)", url, attempt)
                response = self.session.get(url, timeout=self.config.timeout_seconds)
                if response.status_code in {401, 403, 429, 503}:
                    self.logger.warning("Skipped protected/rate-limited URL %s: HTTP %s", url, response.status_code)
                    return None
                response.raise_for_status()
                content_type = response.headers.get("content-type", "")
                if "text/html" not in content_type:
                    self.logger.warning("Skipped non-HTML URL %s: %s", url, content_type)
                    return None
                time.sleep(self.config.delay_seconds)
                return response.text
            except requests.RequestException as exc:
                self.logger.warning("Fetch error for %s on attempt %s: %s", url, attempt, exc)
                if attempt > self.config.retries:
                    return None
                time.sleep(self.config.delay_seconds)
        return None

    def fetch_binary(self, url: str) -> tuple[bytes, str] | None:
        if not self.allowed_by_robots(url):
            self.logger.warning("Skipped image by robots.txt: %s", url)
            return None

        for attempt in range(1, self.config.retries + 2):
            try:
                self.logger.info("Fetching image %s (attempt %s)", url, attempt)
                response = self.session.get(url, timeout=self.config.timeout_seconds)
                if response.status_code in {401, 403, 429, 503}:
                    self.logger.warning("Skipped protected/rate-limited image %s: HTTP %s", url, response.status_code)
                    return None
                response.raise_for_status()
                content_type = response.headers.get("content-type", "")
                if "image/" not in content_type:
                    self.logger.warning("Skipped non-image asset %s: %s", url, content_type)
                    return None
                time.sleep(self.config.delay_seconds)
                return response.content, content_type
            except requests.RequestException as exc:
                self.logger.warning("Image fetch error for %s on attempt %s: %s", url, attempt, exc)
                if attempt > self.config.retries:
                    return None
                time.sleep(self.config.delay_seconds)
        return None

    def allowed_by_robots(self, url: str) -> bool:
        parser = self._robots_parser(url)
        return parser.can_fetch(self.config.user_agent, url)

    def _robots_parser(self, url: str) -> urllib.robotparser.RobotFileParser:
        parsed = urlparse(url)
        base = f"{parsed.scheme}://{parsed.netloc}"
        if base not in self._robots:
            robots_url = f"{base}/robots.txt"
            parser = urllib.robotparser.RobotFileParser()
            parser.set_url(robots_url)
            try:
                response = self.session.get(robots_url, timeout=self.config.timeout_seconds)
                response.raise_for_status()
                parser.parse(response.text.splitlines())
                self.logger.info("Loaded robots.txt: %s", robots_url)
            except Exception as exc:
                self.logger.warning("Could not read robots.txt %s: %s", robots_url, exc)
                parser.disallow_all = True
            self._robots[base] = parser
        return self._robots[base]


def load_urls(path: Path) -> list[str]:
    urls: list[str] = []
    for line in path.read_text(encoding="utf-8").splitlines():
        line = line.strip()
        if not line or line.startswith("#"):
            continue
        urls.append(line)
    return urls


def load_exam_manifest(path: Path) -> list[ExamManifestEntry]:
    entries: list[ExamManifestEntry] = []
    with path.open(encoding="utf-8", newline="") as handle:
        reader = csv.DictReader(handle)
        required = {"course", "label", "url"}
        if not reader.fieldnames or not required.issubset(set(reader.fieldnames)):
            raise ValueError("Manifest must contain course,label,url columns")
        for row in reader:
            course = row["course"].strip().replace(" ", "")
            label = row["label"].strip()
            url = row["url"].strip()
            if not course or not label or not url:
                continue
            if not re.match(r"^CCNA[12](?:_v\d+)?$", course, re.IGNORECASE):
                raise ValueError(f"Unsupported course in manifest: {course}")
            entries.append(ExamManifestEntry(course=course, label=label, url=url))
    return entries
