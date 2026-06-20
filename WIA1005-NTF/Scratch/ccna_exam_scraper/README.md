# CCNA Exam Practice Scraper

Polite scraper for public CCNA 1 and CCNA 2 practice-question pages on ITExamAnswers.net.

## Scraping Strategy

- Reads exam pages from `exam_manifest.csv`; add one public CCNA 1 or CCNA 2 row per link.
- Checks `robots.txt` before fetching a page.
- Uses a clear User-Agent, timeout, retry limit, and delay between requests.
- Skips login/paywall/protected/rate-limited responses instead of trying to bypass them.
- Parses the article body, splits numbered question blocks, extracts choices, correct answers, explanations, metadata, and source URLs.
- Downloads images that appear inside question blocks and embeds local Markdown image links beside the matching question.
- Deduplicates by normalized question text, with RapidFuzz for very similar wording.
- Exports chapter Markdown, a combined Markdown file, a CSV index, and `scrape_log.txt`.

## Install

```powershell
cd "C:\Users\Chee\Documents\cheecode_Y1S2\WIA1005-NTF\Scratch\ccna_exam_scraper"
python -m venv .venv
.\.venv\Scripts\python -m pip install -r requirements.txt
```

If `python` is not on PATH in this Codex workspace, use the bundled Python path shown by Codex, or any local Python 3.10+ installation.

## Run

```powershell
.\.venv\Scripts\python -m ccna_scraper.cli --manifest exam_manifest.csv --output output --delay 3 --retries 2 --timeout 25
```

Run the v5/v6 manifests into a separate folder:

```powershell
.\.venv\Scripts\python -m ccna_scraper.cli --manifest exam_manifest_v2.csv --output output_v2 --delay 3 --retries 2 --timeout 25
```

## Expected Output

```text
output/
  CCNA1/
    01_System_Test_Exam.md
    02_Modules_1_3_Basic_Network_Connectivity_and_Communications_Exam_Answers.md
  CCNA2/
    01_System_Test_Exam.md
    02_Modules_1_4_Switching_Concepts_VLANs_and_InterVLAN_Routing_Exam_Answers.md
  assets/
    CCNA1/
    CCNA2/
  scrape_log.txt
```

Each manifest row becomes one Markdown file in the matching course folder. Markdown omits source URLs by design.
Choices are rendered as Markdown bullets, for example `- **A.** option text`.
