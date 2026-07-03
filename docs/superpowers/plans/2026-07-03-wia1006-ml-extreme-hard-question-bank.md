# WIA1006 ML Extreme-Hard Question Bank Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Produce eight new chapter-named Markdown files containing 100 difficult, explained WIA1006 multiple-choice questions each.

**Architecture:** Treat each chapter file as an independent question bank generated from the approved tracker scope. Use a deterministic content generator to enforce the common Markdown schema, rotate varied scenario templates, and assign a shuffled 25/25/25/25 answer-position schedule; then run structural and bias-oriented validation over all artifacts.

**Tech Stack:** Python 3 standard library for deterministic artifact generation and validation; Markdown for final deliverables; PowerShell and Git for verification.

---

## File Structure

- Create eight `WIA1006-ML/Exercise/Chapter-*-100-Extreme-Hard-Questions.md` files listed in the approved design; each owns one chapter's 100-question assessment.
- Create `tools/generate_wia1006_ml_question_banks.py` temporarily; it holds chapter-specific scenario factories, answer shuffling, and Markdown rendering.
- Create `tools/validate_wia1006_ml_question_banks.py` temporarily; it checks counts, numbering, answer distribution, uniqueness, and option-length signals.
- Remove both temporary scripts after their checks pass so the requested output remains exactly the eight question-bank files.

### Task 1: Build the shared generator and Chapter 1–2 content

**Files:**
- Create: `tools/generate_wia1006_ml_question_banks.py`
- Create: `WIA1006-ML/Exercise/Chapter-1-Introduction-to-Machine-Learning-100-Extreme-Hard-Questions.md`
- Create: `WIA1006-ML/Exercise/Chapter-2-Data-Preprocessing-and-Regression-Analysis-100-Extreme-Hard-Questions.md`

- [ ] **Step 1:** Define a `Question` record containing prompt, four choices, correct choice text, explanation, and topic tag.
- [ ] **Step 2:** Define deterministic answer-position schedules containing exactly 25 each of A, B, C, and D with no four-answer periodic cycle.
- [ ] **Step 3:** Add Chapter 1 factories covering T/P/E, learning categories, target representation, IID and distribution shift, MSE/LMS, gradient descent, cross-validation, hypothesis search, and evaluation.
- [ ] **Step 4:** Add Chapter 2 factories covering cleaning, encoding, scaling, train/test leakage, regression prediction and cost, gradient updates, normal equation concepts, under/overfitting, and evaluation.
- [ ] **Step 5:** Render both files in the approved example format and confirm each contains questions 1–100.

### Task 2: Add Chapter 3–4 content

**Files:**
- Modify: `tools/generate_wia1006_ml_question_banks.py`
- Create: `WIA1006-ML/Exercise/Chapter-3-Decision-Tree-100-Extreme-Hard-Questions.md`
- Create: `WIA1006-ML/Exercise/Chapter-4-Neural-Network-100-Extreme-Hard-Questions.md`

- [ ] **Step 1:** Add Chapter 3 factories for entropy, weighted child entropy, information gain, split comparison, recursive construction, stopping, prediction paths, pruning, and Random Forest behavior.
- [ ] **Step 2:** Add Chapter 4 factories for weighted sums, perceptrons, sigmoid and derivative, layer dimensions, forward propagation, threshold decisions, error attribution, and parameter effects.
- [ ] **Step 3:** Render both files with varied conceptual, diagnostic, and multi-step calculation scenarios.

### Task 3: Add Chapter 5–6 content

**Files:**
- Modify: `tools/generate_wia1006_ml_question_banks.py`
- Create: `WIA1006-ML/Exercise/Chapter-5-Bayes-Theorem-Markov-Models-and-HMM-100-Extreme-Hard-Questions.md`
- Create: `WIA1006-ML/Exercise/Chapter-6-Clustering-and-PCA-100-Extreme-Hard-Questions.md`

- [ ] **Step 1:** Add Chapter 5 factories for conditional probability, Bayes normalization, independence traps, Naive Bayes comparisons, Markov sequence probability, HMM hidden/observed distinctions, and forward recursion.
- [ ] **Step 2:** Add Chapter 6 factories for Euclidean/Manhattan/cosine measures, K-Means assignment and updates, linkage criteria, graph Laplacians, zero eigenvalues, Fiedler splits, PCA covariance/eigensystems, projection, reconstruction, and explained variance.
- [ ] **Step 3:** Render both files and ensure all numerical scenarios state required rounding rules.

### Task 4: Add Chapter 7–8 content

**Files:**
- Modify: `tools/generate_wia1006_ml_question_banks.py`
- Create: `WIA1006-ML/Exercise/Chapter-7-SVM-and-GMM-100-Extreme-Hard-Questions.md`
- Create: `WIA1006-ML/Exercise/Chapter-8-EM-Reinforcement-Learning-and-Genetic-Algorithm-100-Extreme-Hard-Questions.md`

- [ ] **Step 1:** Add Chapter 7 factories for hyperplane distance, functional/geometric margins, constraints, dual coefficients, support vectors, kernels, C/width trade-offs, Gaussian density, mixture density, and soft membership.
- [ ] **Step 2:** Add Chapter 8 factories for EM responsibilities and parameter updates, log-likelihood reasoning, RL returns/values/Q-learning and exploration, plus GA fitness, expected copies, crossover, mutation, and selection.
- [ ] **Step 3:** Render both files with balanced coverage across each chapter's major parts.

### Task 5: Validate all eight artifacts

**Files:**
- Create: `tools/validate_wia1006_ml_question_banks.py`

- [ ] **Step 1:** Parse every new file into question blocks and fail unless headings are exactly 1–100 with four choices, one answer, and one explanation each.
- [ ] **Step 2:** Resolve each answer text to exactly one choice and fail unless every file has A=25, B=25, C=25, and D=25.
- [ ] **Step 3:** Fail on duplicate normalized prompts or missing expected filenames.
- [ ] **Step 4:** Report longest-option answer rate and flag files above 40% for manual correction.
- [ ] **Step 5:** Run `python tools/validate_wia1006_ml_question_banks.py`; expected output is eight PASS lines and a final `800 questions validated` summary.

### Task 6: Manual quality review and cleanup

**Files:**
- Modify: any newly generated chapter file with a detected content issue
- Delete: `tools/generate_wia1006_ml_question_banks.py`
- Delete: `tools/validate_wia1006_ml_question_banks.py`

- [ ] **Step 1:** Spot-check at least five calculation and five theory questions per chapter for correctness, scope, distractor plausibility, and explanation sufficiency.
- [ ] **Step 2:** Search for malformed encoding, repeated boilerplate, accidental answer clues, and references to material absent from the tracker; correct every detected issue.
- [ ] **Step 3:** Record SHA-256 hashes of the pre-existing exercise files and confirm they remain unchanged.
- [ ] **Step 4:** Delete temporary generator and validator scripts after validation succeeds.
- [ ] **Step 5:** Run final PowerShell structural checks directly against the eight Markdown files and inspect `git diff --stat` plus `git status --short`.
