import unittest

from ccna_scraper.parser import parse_page


HTML = """
<html>
  <head><title>CCNA 2 (v7.0) Chapter 1 Exam Answers</title></head>
  <body>
    <article class="article">
      <div class="entry-content">
        <h1>CCNA 2 (v7.0) Chapter 1 Exam Answers - Switching Concepts</h1>
        <p><strong>1. Which command saves the running configuration?</strong></p>
        <ul>
          <li>erase startup-config</li>
          <li><span style="color: red;"><strong>copy running-config startup-config</strong></span></li>
          <li>reload</li>
          <li>show running-config</li>
        </ul>
        <div class="message_box success"><p><strong>Explanation:</strong> This command copies RAM configuration into NVRAM.</p></div>
        <p><strong>2. Fill in the blank.</strong></p>
        <p>A router uses the ____ table to choose a path.</p>
        <p>Correct Answer: routing</p>
      </div>
    </article>
  </body>
</html>
"""


class ParsePageTests(unittest.TestCase):
    def test_extracts_numbered_questions_options_answers_and_metadata(self):
        questions = parse_page(
            html=HTML,
            source_url="https://itexamanswers.net/ccna-2-v7-0-chapter-1-exam-answers.html",
        )

        self.assertEqual(len(questions), 2)
        self.assertEqual(questions[0].number, 1)
        self.assertEqual(questions[0].ccna_course, "CCNA2")
        self.assertEqual(questions[0].version, "v7.0")
        self.assertEqual(questions[0].chapter, "Chapter_01")
        self.assertEqual(questions[0].chapter_title, "Switching Concepts")
        self.assertIn("Which command saves", questions[0].question_text)
        self.assertEqual(len(questions[0].choices), 4)
        self.assertEqual(
            questions[0].correct_answer,
            "copy running-config startup-config",
        )
        self.assertIn("copies RAM", questions[0].explanation)

        self.assertEqual(questions[1].number, 2)
        self.assertIn("A router uses", questions[1].question_text)
        self.assertEqual(questions[1].correct_answer, "routing")

    def test_extracts_questions_from_nested_thecontent_wrapper(self):
        html = """
        <html><head><title>CCNA 2 Chapter 1 Exam Answers</title></head><body>
          <div class="entry-content">
            <div class="topad"></div>
            <div class="thecontent clearfix">
              <p><strong>1. What is stored in NVRAM?</strong></p>
              <ul><li><span style="color: red;"><strong>startup configuration</strong></span></li><li>running processes</li></ul>
            </div>
          </div>
        </body></html>
        """

        questions = parse_page(html, "https://itexamanswers.net/ccna-2-chapter-1-exam-answers.html")

        self.assertEqual(len(questions), 1)
        self.assertEqual(questions[0].correct_answer, "startup configuration")

    def test_extracts_questions_from_plain_nested_content_div(self):
        html = """
        <html><head><title>CCNA 1 Final Exam Answers</title></head><body>
          <div class="thecontent clearfix">
            <div>
              <h2>Version 6.0:</h2>
              <p><strong>1. What is fault tolerance?</strong></p>
              <ul><li>fast growth</li><li><span style="color: red;">quick recovery after failure</span></li></ul>
              <p>Explanation: Redundancy limits impact.</p>
            </div>
          </div>
        </body></html>
        """

        questions = parse_page(html, "https://itexamanswers.net/ccna-1-final.html", course_override="CCNA1")

        self.assertEqual(len(questions), 1)
        self.assertEqual(questions[0].correct_answer, "quick recovery after failure")

    def test_marks_final_exam_pages_without_chapter_as_final_exam(self):
        html = """
        <html><head><title>CCNA 2 v7.0 Final Exam Answers Full</title></head><body>
          <div class="thecontent">
            <p><strong>1. Which route is selected?</strong></p>
            <ul><li><span style="color: red;">static route</span></li><li>RIP route</li></ul>
          </div>
        </body></html>
        """

        questions = parse_page(html, "https://itexamanswers.net/ccna-2-v7-0-final-exam-answers.html")

        self.assertEqual(questions[0].chapter, "Final_Exam")
        self.assertEqual(questions[0].chapter_title, "Final Exam")

    def test_course_override_keeps_questions_when_title_has_no_ccna_number(self):
        html = """
        <html><head><title>CCNAv7 System Test Course Exam Answers</title></head><body>
          <div class="thecontent">
            <p><strong>1. Which protocol resolves names?</strong></p>
            <ul><li>FTP</li><li><span style="color: red;">DNS</span></li></ul>
          </div>
        </body></html>
        """

        questions = parse_page(
            html,
            "https://itexamanswers.net/ccnav7-system-test-course-version-1-1-system-test-exam-answers.html",
            course_override="CCNA1",
        )

        self.assertEqual(len(questions), 1)
        self.assertEqual(questions[0].ccna_course, "CCNA1")

    def test_extracts_images_inside_the_matching_question_block(self):
        html = """
        <html><head><title>CCNA 2 Chapter 1 Exam Answers</title></head><body>
          <div class="thecontent">
            <p><strong>1. Refer to the exhibit. What happens next?</strong></p>
            <p><img src="/wp-content/uploads/exhibit-1.png" alt="Network exhibit"></p>
            <ul><li>drop it</li><li><span style="color: red;">forward it</span></li></ul>
            <p><strong>2. Which device forwards frames?</strong></p>
            <ul><li><span style="color: red;">switch</span></li><li>hub</li></ul>
          </div>
        </body></html>
        """

        questions = parse_page(html, "https://itexamanswers.net/ccna-2-v7-modules-1-4.html")

        self.assertEqual(len(questions), 2)
        self.assertEqual(questions[0].images[0].src, "https://itexamanswers.net/wp-content/uploads/exhibit-1.png")
        self.assertEqual(questions[0].images[0].alt, "Network exhibit")
        self.assertEqual(questions[1].images, [])

    def test_ignores_download_manager_file_type_icons(self):
        html = """
        <html><head><title>CCNA 1 Chapter 1 Exam Answers</title></head><body>
          <div class="thecontent">
            <p><strong>1. Which option is correct?</strong></p>
            <p><img src="/wp-content/plugins/download-manager/assets/file-type-icons/pdf.svg" alt="PDF"></p>
            <ul><li><span style="color: red;">answer</span></li><li>wrong</li></ul>
          </div>
        </body></html>
        """

        questions = parse_page(html, "https://itexamanswers.net/ccna-1-chapter-1.html")

        self.assertEqual(questions[0].images, [])


if __name__ == "__main__":
    unittest.main()
