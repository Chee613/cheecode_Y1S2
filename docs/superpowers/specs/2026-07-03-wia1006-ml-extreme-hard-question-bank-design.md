# WIA1006 Machine Learning Extreme-Hard Question Bank Design

## Objective

Create eight new Markdown question-bank files in `WIA1006-ML/Exercise`, one for each chapter in the supplied progress tracker. Each file contains exactly 100 extreme-hard multiple-choice questions and follows the structure of `WIA1002-DS/Exercise/C1-OOP-Revision-100-Extreme-Hard-Questions.md`.

Existing exercise files must remain unchanged.

## Source and Scope

The pasted progress tracker is the authoritative content boundary. Questions may combine, transform, or calculate from concepts and formulas listed there, but must not introduce assessable material outside those chapter topics.

The eight chapter scopes are:

1. Introduction to Machine Learning
2. Data Preprocessing and Regression Analysis
3. Decision Tree
4. Neural Network
5. Bayes Theorem, Markov Models, and HMM
6. Clustering and PCA
7. SVM and GMM
8. EM, Reinforcement Learning, and Genetic Algorithm

## Output Files

Create these new files:

- `Chapter-1-Introduction-to-Machine-Learning-100-Extreme-Hard-Questions.md`
- `Chapter-2-Data-Preprocessing-and-Regression-Analysis-100-Extreme-Hard-Questions.md`
- `Chapter-3-Decision-Tree-100-Extreme-Hard-Questions.md`
- `Chapter-4-Neural-Network-100-Extreme-Hard-Questions.md`
- `Chapter-5-Bayes-Theorem-Markov-Models-and-HMM-100-Extreme-Hard-Questions.md`
- `Chapter-6-Clustering-and-PCA-100-Extreme-Hard-Questions.md`
- `Chapter-7-SVM-and-GMM-100-Extreme-Hard-Questions.md`
- `Chapter-8-EM-Reinforcement-Learning-and-Genetic-Algorithm-100-Extreme-Hard-Questions.md`

## Per-File Format

Each file will contain:

- An H1 chapter title and a short topic/difficulty description.
- Questions numbered sequentially from 1 through 100.
- A `## Question N` heading for every question.
- A bold `Question:` prompt.
- A `Choices:` section with exactly four options labelled A, B, C, and D.
- A `Correct Answer:` line containing the answer text.
- A concise `Explanation:` that justifies the answer and, for calculations, shows enough working to verify it.
- A horizontal divider between questions.
- A final answer-distribution self-check.

## Difficulty and Question Mix

Questions will emphasize deep comprehension rather than recall. Each chapter will mix:

- Easily confused theoretical distinctions and boundary cases.
- Multi-step numerical calculations using the formulas in the tracker.
- Counterfactual questions asking what changes when an assumption or parameter changes.
- Error diagnosis and selection of the single best conclusion.
- Integrated scenarios that combine multiple concepts from the same chapter.
- Large calculation problems where one scenario supports a demanding single question.

Questions must remain solvable from the supplied chapter material. Numerical questions will state all required values and any rounding convention.

## Answer and Distractor Controls

Every file will have exactly 25 correct answers in each position A, B, C, and D. Positions will be shuffled so that no obvious repeating sequence appears.

Distractors will be plausible and based on common mistakes, such as sign errors, incorrect denominators, swapped definitions, premature rounding, wrong update order, or confusion between related algorithms. Options within a question will use comparable specificity and length. The correct choice must not be identifiable merely because it is the longest or most qualified option.

## Validation

Automated checks will verify for every file:

- Exactly 100 numbered question headings.
- Exactly four labelled choices per question.
- Exactly one correct answer and one explanation per question.
- Question numbering is complete and sequential.
- Correct-position counts are A=25, B=25, C=25, and D=25.
- No duplicate question prompts within a file.
- All eight expected filenames exist and existing exercise files were not overwritten.

A manual spot-check will review calculation correctness, chapter-scope compliance, distractor plausibility, Markdown rendering, and option-length bias.
