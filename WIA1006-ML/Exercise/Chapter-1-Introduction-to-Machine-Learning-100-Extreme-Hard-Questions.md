# Chapter 1: Introduction to Machine Learning: 100 Extreme-Hard Questions

> Topics: T/P/E, learning paradigms, representation, IID assumptions, MSE, LMS, validation, and evaluation. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** Using residuals=['1', '-2', '0.5', '-1.5'], compute the MSE.

**Choices:**
- **A.** MSE = 1.875
- **B.** MSE = 2.2125
- **C.** MSE = 1.5375
- **D.** MSE = 2.55

**Correct Answer:** MSE = 1.875

**Explanation:** Apply $\frac{1}{n}\sum_i r_i^2$; substitution gives MSE=1.875.

---

## Question 2

**Question:** Using w=0.4, c=0.03, feature=1, error=2, compute the updated LMS weight.

**Choices:**
- **A.** updated LMS weight = 0.6256
- **B.** updated LMS weight = 0.5428
- **C.** updated LMS weight = 0.3772
- **D.** updated LMS weight = 0.46

**Correct Answer:** updated LMS weight = 0.46

**Explanation:** Apply $w+c f_i e$; substitution gives updated LMS weight=0.46.

---

## Question 3

**Question:** Using N=100 examples and k=5 folds, compute the training examples per fold.

**Choices:**
- **A.** training examples per fold = 80
- **B.** training examples per fold = 94.4
- **C.** training examples per fold = 65.6
- **D.** training examples per fold = 108.8

**Correct Answer:** training examples per fold = 80

**Explanation:** Apply $N-\frac{N}{k}$; substitution gives training examples per fold=80.

---

## Question 4

**Question:** Using validation residuals=['0.2', '-0.3', '0.1'], compute the validation MSE.

**Choices:**
- **A.** validation MSE = -0.0243
- **B.** validation MSE = 0.1177
- **C.** validation MSE = 0.0467
- **D.** validation MSE = 0.1887

**Correct Answer:** validation MSE = 0.0467

**Explanation:** Apply $\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2$; substitution gives validation MSE=0.0467.

---

## Question 5

**Question:** Using training MSE=0.05, test MSE=0.1, compute the test-minus-training gap.

**Choices:**
- **A.** test-minus-training gap = 0.121
- **B.** test-minus-training gap = 0.05
- **C.** test-minus-training gap = -0.021
- **D.** test-minus-training gap = 0.192

**Correct Answer:** test-minus-training gap = 0.05

**Explanation:** Apply $\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}$; substitution gives test-minus-training gap=0.05.

---

## Question 6

**Question:** Compare the MSE for Case P (residuals=['1.05', '-1.97', '0.52', '-1.5']) and Case Q (residuals=['1.2', '-1.88', '0.58', '-1.5']).

**Choices:**
- **A.** The second case is larger: 1.8902 versus 1.876
- **B.** The first case is larger: 1.876 versus 1.8902 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 1.8902 versus 1.876

**Explanation:** The same formula gives 1.876 for P and 1.8902 for Q, establishing the stated comparison.

---

## Question 7

**Question:** Compare the updated LMS weight for Case P (w=0.44, c=0.035, feature=1.2, error=1.95) and Case Q (w=0.56, c=0.05, feature=1.8, error=1.8).

**Choices:**
- **A.** The first case is larger: 0.5219 versus 0.722 under the complete set of stated assumptions
- **B.** The second case is larger: 0.722 versus 0.5219
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.722 versus 0.5219

**Explanation:** The same formula gives 0.5219 for P and 0.722 for Q, establishing the stated comparison.

---

## Question 8

**Question:** Compare the training examples per fold for Case P (N=210 examples and k=10 folds) and Case Q (N=120 examples and k=5 folds).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The second case is larger: 96 versus 189
- **C.** The first case is larger: 189 versus 96
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 189 versus 96

**Explanation:** The same formula gives 189 for P and 96 for Q, establishing the stated comparison.

---

## Question 9

**Question:** Compare the validation MSE for Case P (validation residuals=['0.21', '-0.3', '0.105']) and Case Q (validation residuals=['0.24', '-0.3', '0.12']).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The first case is larger: 0.0484 versus 0.054 under the complete set of stated assumptions
- **C.** The second case is larger: 0.054 versus 0.0484
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.054 versus 0.0484

**Explanation:** The same formula gives 0.0484 for P and 0.054 for Q, establishing the stated comparison.

---

## Question 10

**Question:** Compare the test-minus-training gap for Case P (training MSE=0.058, test MSE=0.114) and Case Q (training MSE=0.082, test MSE=0.156).

**Choices:**
- **A.** The second case is larger: 0.074 versus 0.056
- **B.** The first case is larger: 0.056 versus 0.074 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.074 versus 0.056

**Explanation:** The same formula gives 0.056 for P and 0.074 for Q, establishing the stated comparison.

---

## Question 11

**Question:** How far apart are the MSE values for (residuals=['1.1', '-1.94', '0.54', '-1.5']) and (residuals=['1.4', '-1.76', '0.66', '-1.5'])?

**Choices:**
- **A.** absolute MSE difference = 0.199
- **B.** absolute MSE difference = 0.128
- **C.** absolute MSE difference = -0.014
- **D.** absolute MSE difference = 0.057

**Correct Answer:** absolute MSE difference = 0.057

**Explanation:** The two values are 1.8788 and 1.9358; their absolute difference is 0.057.

---

## Question 12

**Question:** How far apart are the updated LMS weight values for (w=0.48, c=0.04, feature=1.4, error=1.9) and (w=0.72, c=0.045, feature=2.6, error=1.6)?

**Choices:**
- **A.** absolute updated LMS weight difference = 0.3208
- **B.** absolute updated LMS weight difference = 0.3918
- **C.** absolute updated LMS weight difference = 0.2498
- **D.** absolute updated LMS weight difference = 0.4628

**Correct Answer:** absolute updated LMS weight difference = 0.3208

**Explanation:** The two values are 0.5864 and 0.9072; their absolute difference is 0.3208.

---

## Question 13

**Question:** How far apart are the training examples per fold values for (N=110 examples and k=5 folds) and (N=140 examples and k=5 folds)?

**Choices:**
- **A.** absolute training examples per fold difference = 28.32
- **B.** absolute training examples per fold difference = 24
- **C.** absolute training examples per fold difference = 19.68
- **D.** absolute training examples per fold difference = 32.64

**Correct Answer:** absolute training examples per fold difference = 24

**Explanation:** The two values are 88 and 112; their absolute difference is 24.

---

## Question 14

**Question:** How far apart are the validation MSE values for (validation residuals=['0.22', '-0.3', '0.11']) and (validation residuals=['0.28', '-0.3', '0.14'])?

**Choices:**
- **A.** absolute validation MSE difference = 0.0835
- **B.** absolute validation MSE difference = 0.0125
- **C.** absolute validation MSE difference = -0.0585
- **D.** absolute validation MSE difference = 0.1545

**Correct Answer:** absolute validation MSE difference = 0.0125

**Explanation:** The two values are 0.0502 and 0.0627; their absolute difference is 0.0125.

---

## Question 15

**Question:** How far apart are the test-minus-training gap values for (training MSE=0.066, test MSE=0.128) and (training MSE=0.114, test MSE=0.212)?

**Choices:**
- **A.** absolute test-minus-training gap difference = -0.035
- **B.** absolute test-minus-training gap difference = 0.107
- **C.** absolute test-minus-training gap difference = 0.036
- **D.** absolute test-minus-training gap difference = 0.178

**Correct Answer:** absolute test-minus-training gap difference = 0.036

**Explanation:** The two values are 0.062 and 0.098; their absolute difference is 0.036.

---

## Question 16

**Question:** Taking (residuals=['1.15', '-1.91', '0.56', '-1.5']) as baseline and (residuals=['1.05', '-1.97', '0.52', '-1.5']) as the new case, what is the percentage change in MSE?

**Choices:**
- **A.** percentage change in MSE = -0.4035
- **B.** percentage change in MSE = -0.3309
- **C.** percentage change in MSE = -0.4761
- **D.** percentage change in MSE = -0.2582

**Correct Answer:** percentage change in MSE = -0.4035

**Explanation:** The values change from 1.8835 to 1.876; (new-old)/|old|*100=-0.4035%.

---

## Question 17

**Question:** Taking (w=0.52, c=0.045, feature=1.6, error=1.85) as baseline and (w=0.44, c=0.035, feature=1.2, error=1.95) as the new case, what is the percentage change in updated LMS weight?

**Choices:**
- **A.** percentage change in updated LMS weight = -23.7192
- **B.** percentage change in updated LMS weight = -16.4829
- **C.** percentage change in updated LMS weight = -20.101
- **D.** percentage change in updated LMS weight = -12.8647

**Correct Answer:** percentage change in updated LMS weight = -20.101

**Explanation:** The values change from 0.6532 to 0.5219; (new-old)/|old|*100=-20.101%.

---

## Question 18

**Question:** Taking (N=230 examples and k=10 folds) as baseline and (N=210 examples and k=10 folds) as the new case, what is the percentage change in training examples per fold?

**Choices:**
- **A.** percentage change in training examples per fold = -10.2609
- **B.** percentage change in training examples per fold = -7.1304
- **C.** percentage change in training examples per fold = -8.6957
- **D.** percentage change in training examples per fold = -5.5652

**Correct Answer:** percentage change in training examples per fold = -8.6957

**Explanation:** The values change from 207 to 189; (new-old)/|old|*100=-8.6957%.

---

## Question 19

**Question:** Taking (validation residuals=['0.23', '-0.3', '0.115']) as baseline and (validation residuals=['0.21', '-0.3', '0.105']) as the new case, what is the percentage change in validation MSE?

**Choices:**
- **A.** percentage change in validation MSE = -8.3139
- **B.** percentage change in validation MSE = -5.7774
- **C.** percentage change in validation MSE = -7.0456
- **D.** percentage change in validation MSE = -4.5092

**Correct Answer:** percentage change in validation MSE = -7.0456

**Explanation:** The values change from 0.052 to 0.0484; (new-old)/|old|*100=-7.0456%.

---

## Question 20

**Question:** Taking (training MSE=0.074, test MSE=0.142) as baseline and (training MSE=0.058, test MSE=0.114) as the new case, what is the percentage change in test-minus-training gap?

**Choices:**
- **A.** percentage change in test-minus-training gap = -17.6471
- **B.** percentage change in test-minus-training gap = -14.4706
- **C.** percentage change in test-minus-training gap = -20.8235
- **D.** percentage change in test-minus-training gap = -11.2941

**Correct Answer:** percentage change in test-minus-training gap = -17.6471

**Explanation:** The values change from 0.068 to 0.056; (new-old)/|old|*100=-17.6471%.

---

## Question 21

**Question:** Which formula must be applied to obtain MSE from the supplied chapter quantities?

**Choices:**
- **A.** For MSE, use sum inputs without the required weighting for MSE
- **B.** For MSE, use $1-\left(\frac{1}{n}\sum_i r_i^2\right)$
- **C.** For MSE, use $\sqrt{\frac{1}{n}\sum_i r_i^2}$
- **D.** For MSE, use $\frac{1}{n}\sum_i r_i^2$

**Correct Answer:** For MSE, use $\frac{1}{n}\sum_i r_i^2$

**Explanation:** The chapter defines MSE with $\frac{1}{n}\sum_i r_i^2$; the other expressions change an operation or omit required weighting.

---

## Question 22

**Question:** Which formula must be applied to obtain updated LMS weight from the supplied chapter quantities?

**Choices:**
- **A.** For updated LMS weight, use $\sqrt{w+c f_i e}$
- **B.** For updated LMS weight, use $1-\left(w+c f_i e\right)$
- **C.** For updated LMS weight, use $w+c f_i e$
- **D.** For updated LMS weight, use sum inputs without the required weighting for updated LMS weight

**Correct Answer:** For updated LMS weight, use $w+c f_i e$

**Explanation:** The chapter defines updated LMS weight with $w+c f_i e$; the other expressions change an operation or omit required weighting.

---

## Question 23

**Question:** Which formula must be applied to obtain training examples per fold from the supplied chapter quantities?

**Choices:**
- **A.** For training examples per fold, use $1-\left(N-\frac{N}{k}\right)$
- **B.** For training examples per fold, use $N-\frac{N}{k}$
- **C.** For training examples per fold, use $\sqrt{N-\frac{N}{k}}$
- **D.** For training examples per fold, use sum inputs without the required weighting for training examples per fold

**Correct Answer:** For training examples per fold, use $N-\frac{N}{k}$

**Explanation:** The chapter defines training examples per fold with $N-\frac{N}{k}$; the other expressions change an operation or omit required weighting.

---

## Question 24

**Question:** Which formula must be applied to obtain validation MSE from the supplied chapter quantities?

**Choices:**
- **A.** For validation MSE, use $1-\left(\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2\right)$
- **B.** For validation MSE, use $\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2$
- **C.** For validation MSE, use $\sqrt{\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2}$
- **D.** For validation MSE, use sum inputs without the required weighting for validation MSE

**Correct Answer:** For validation MSE, use $\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2$

**Explanation:** The chapter defines validation MSE with $\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2$; the other expressions change an operation or omit required weighting.

---

## Question 25

**Question:** Which formula must be applied to obtain test-minus-training gap from the supplied chapter quantities?

**Choices:**
- **A.** For test-minus-training gap, use $\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}$
- **B.** For test-minus-training gap, use $1-\left(\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}\right)$
- **C.** For test-minus-training gap, use $\sqrt{\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}}$
- **D.** For test-minus-training gap, use sum inputs without the required weighting for test-minus-training gap

**Correct Answer:** For test-minus-training gap, use $\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}$

**Explanation:** The chapter defines test-minus-training gap with $\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}$; the other expressions change an operation or omit required weighting.

---

## Question 26

**Question:** Four datasets are candidates. Which one produces MSE=1.8988?

**Choices:**
- **A.** For MSE, the first dataset: residuals=['1', '-2', '0.5', '-1.5']
- **B.** For MSE, the third dataset: residuals=['1.25', '-1.85', '0.6', '-1.5']
- **C.** For MSE, the second dataset: residuals=['1.1', '-1.94', '0.54', '-1.5']
- **D.** For MSE, the fourth dataset: residuals=['1.4', '-1.76', '0.66', '-1.5']

**Correct Answer:** For MSE, the third dataset: residuals=['1.25', '-1.85', '0.6', '-1.5']

**Explanation:** Evaluating all four with $\frac{1}{n}\sum_i r_i^2$ shows that the third dataset produces 1.8988.

---

## Question 27

**Question:** Four datasets are candidates. Which one produces updated LMS weight=0.705?

**Choices:**
- **A.** For updated LMS weight, the first dataset: w=0.4, c=0.03, feature=1, error=2
- **B.** For updated LMS weight, the third dataset: w=0.6, c=0.03, feature=2, error=1.75
- **C.** For updated LMS weight, the second dataset: w=0.48, c=0.04, feature=1.4, error=1.9
- **D.** For updated LMS weight, the fourth dataset: w=0.72, c=0.045, feature=2.6, error=1.6

**Correct Answer:** For updated LMS weight, the third dataset: w=0.6, c=0.03, feature=2, error=1.75

**Explanation:** Evaluating all four with $w+c f_i e$ shows that the third dataset produces 0.705.

---

## Question 28

**Question:** Four datasets are candidates. Which one produces training examples per fold=225?

**Choices:**
- **A.** For training examples per fold, the third dataset: N=250 examples and k=10 folds
- **B.** For training examples per fold, the first dataset: N=100 examples and k=5 folds
- **C.** For training examples per fold, the second dataset: N=110 examples and k=5 folds
- **D.** For training examples per fold, the fourth dataset: N=140 examples and k=5 folds

**Correct Answer:** For training examples per fold, the third dataset: N=250 examples and k=10 folds

**Explanation:** Evaluating all four with $N-\frac{N}{k}$ shows that the third dataset produces 225.

---

## Question 29

**Question:** Four datasets are candidates. Which one produces validation MSE=0.056?

**Choices:**
- **A.** For validation MSE, the second dataset: validation residuals=['0.22', '-0.3', '0.11']
- **B.** For validation MSE, the first dataset: validation residuals=['0.2', '-0.3', '0.1']
- **C.** For validation MSE, the third dataset: validation residuals=['0.25', '-0.3', '0.125']
- **D.** For validation MSE, the fourth dataset: validation residuals=['0.28', '-0.3', '0.14']

**Correct Answer:** For validation MSE, the third dataset: validation residuals=['0.25', '-0.3', '0.125']

**Explanation:** Evaluating all four with $\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2$ shows that the third dataset produces 0.056.

---

## Question 30

**Question:** Four datasets are candidates. Which one produces test-minus-training gap=0.08?

**Choices:**
- **A.** For test-minus-training gap, the fourth dataset: training MSE=0.114, test MSE=0.212
- **B.** For test-minus-training gap, the first dataset: training MSE=0.05, test MSE=0.1
- **C.** For test-minus-training gap, the second dataset: training MSE=0.066, test MSE=0.128
- **D.** For test-minus-training gap, the third dataset: training MSE=0.09, test MSE=0.17

**Correct Answer:** For test-minus-training gap, the third dataset: training MSE=0.09, test MSE=0.17

**Explanation:** Evaluating all four with $\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}$ shows that the third dataset produces 0.08.

---

## Question 31

**Question:** For residuals=['1.3', '-1.82', '0.62', '-1.5'], a student reports MSE=2.3865. What corrected value should replace it?

**Choices:**
- **A.** corrected MSE = 2.2529
- **B.** corrected MSE = 1.9092
- **C.** corrected MSE = 1.5655
- **D.** corrected MSE = 2.5965

**Correct Answer:** corrected MSE = 1.9092

**Explanation:** Recomputing with $\frac{1}{n}\sum_i r_i^2$ gives 1.9092, so the reported 2.3865 is rejected.

---

## Question 32

**Question:** For w=0.64, c=0.035, feature=2.2, error=1.7, a student reports updated LMS weight=0.9636. What corrected value should replace it?

**Choices:**
- **A.** corrected updated LMS weight = 0.6321
- **B.** corrected updated LMS weight = 0.9097
- **C.** corrected updated LMS weight = 0.7709
- **D.** corrected updated LMS weight = 1.0484

**Correct Answer:** corrected updated LMS weight = 0.7709

**Explanation:** Recomputing with $w+c f_i e$ gives 0.7709, so the reported 0.9636 is rejected.

---

## Question 33

**Question:** For N=130 examples and k=5 folds, a student reports training examples per fold=130. What corrected value should replace it?

**Choices:**
- **A.** corrected training examples per fold = 141.44
- **B.** corrected training examples per fold = 122.72
- **C.** corrected training examples per fold = 85.28
- **D.** corrected training examples per fold = 104

**Correct Answer:** corrected training examples per fold = 104

**Explanation:** Recomputing with $N-\frac{N}{k}$ gives 104, so the reported 130 is rejected.

---

## Question 34

**Question:** For validation residuals=['0.26', '-0.3', '0.13'], a student reports validation MSE=0.1582. What corrected value should replace it?

**Choices:**
- **A.** corrected validation MSE = 0.1292
- **B.** corrected validation MSE = 0.0582
- **C.** corrected validation MSE = -0.0128
- **D.** corrected validation MSE = 0.2002

**Correct Answer:** corrected validation MSE = 0.0582

**Explanation:** Recomputing with $\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2$ gives 0.0582, so the reported 0.1582 is rejected.

---

## Question 35

**Question:** For training MSE=0.098, test MSE=0.184, a student reports test-minus-training gap=0.186. What corrected value should replace it?

**Choices:**
- **A.** corrected test-minus-training gap = 0.228
- **B.** corrected test-minus-training gap = 0.157
- **C.** corrected test-minus-training gap = 0.015
- **D.** corrected test-minus-training gap = 0.086

**Correct Answer:** corrected test-minus-training gap = 0.086

**Explanation:** Recomputing with $\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}$ gives 0.086, so the reported 0.186 is rejected.

---

## Question 36

**Question:** Compute MSE separately for (residuals=['1.35', '-1.79', '0.64', '-1.5']) and (residuals=['1', '-2', '0.5', '-1.5']), then average the two results.

**Choices:**
- **A.** mean of the two MSE values = 2.5817
- **B.** mean of the two MSE values = 2.24
- **C.** mean of the two MSE values = 1.5566
- **D.** mean of the two MSE values = 1.8983

**Correct Answer:** mean of the two MSE values = 1.8983

**Explanation:** The individual results are 1.9216 and 1.875; their arithmetic mean is 1.8983.

---

## Question 37

**Question:** Compute updated LMS weight separately for (w=0.68, c=0.04, feature=2.4, error=1.65) and (w=0.4, c=0.03, feature=1, error=2), then average the two results.

**Choices:**
- **A.** mean of the two updated LMS weight values = 0.6492
- **B.** mean of the two updated LMS weight values = 0.7661
- **C.** mean of the two updated LMS weight values = 0.5323
- **D.** mean of the two updated LMS weight values = 0.8829

**Correct Answer:** mean of the two updated LMS weight values = 0.6492

**Explanation:** The individual results are 0.8384 and 0.46; their arithmetic mean is 0.6492.

---

## Question 38

**Question:** Compute training examples per fold separately for (N=270 examples and k=10 folds) and (N=100 examples and k=5 folds), then average the two results.

**Choices:**
- **A.** mean of the two training examples per fold values = 161.5
- **B.** mean of the two training examples per fold values = 190.57
- **C.** mean of the two training examples per fold values = 132.43
- **D.** mean of the two training examples per fold values = 219.64

**Correct Answer:** mean of the two training examples per fold values = 161.5

**Explanation:** The individual results are 243 and 80; their arithmetic mean is 161.5.

---

## Question 39

**Question:** Compute validation MSE separately for (validation residuals=['0.27', '-0.3', '0.135']) and (validation residuals=['0.2', '-0.3', '0.1']), then average the two results.

**Choices:**
- **A.** mean of the two validation MSE values = 0.1955
- **B.** mean of the two validation MSE values = 0.1245
- **C.** mean of the two validation MSE values = -0.0175
- **D.** mean of the two validation MSE values = 0.0535

**Correct Answer:** mean of the two validation MSE values = 0.0535

**Explanation:** The individual results are 0.0604 and 0.0467; their arithmetic mean is 0.0535.

---

## Question 40

**Question:** Compute test-minus-training gap separately for (training MSE=0.106, test MSE=0.198) and (training MSE=0.05, test MSE=0.1), then average the two results.

**Choices:**
- **A.** mean of the two test-minus-training gap values = 0.213
- **B.** mean of the two test-minus-training gap values = 0.142
- **C.** mean of the two test-minus-training gap values = 0
- **D.** mean of the two test-minus-training gap values = 0.071

**Correct Answer:** mean of the two test-minus-training gap values = 0.071

**Explanation:** The individual results are 0.092 and 0.05; their arithmetic mean is 0.071.

---

## Question 41

**Question:** After the data change from (residuals=['1.4', '-1.76', '0.66', '-1.5']) to (residuals=['1.3', '-1.82', '0.62', '-1.5']), what is the new MSE?

**Choices:**
- **A.** MSE = 1.9092
- **B.** MSE = 2.2529
- **C.** MSE = 1.5655
- **D.** MSE = 2.5965

**Correct Answer:** MSE = 1.9092

**Explanation:** Only the new data enter $\frac{1}{n}\sum_i r_i^2$; they produce 1.9092.

---

## Question 42

**Question:** After the data change from (w=0.72, c=0.045, feature=2.6, error=1.6) to (w=0.64, c=0.035, feature=2.2, error=1.7), what is the new updated LMS weight?

**Choices:**
- **A.** updated LMS weight = 0.6321
- **B.** updated LMS weight = 0.9097
- **C.** updated LMS weight = 0.7709
- **D.** updated LMS weight = 1.0484

**Correct Answer:** updated LMS weight = 0.7709

**Explanation:** Only the new data enter $w+c f_i e$; they produce 0.7709.

---

## Question 43

**Question:** After the data change from (N=140 examples and k=5 folds) to (N=130 examples and k=5 folds), what is the new training examples per fold?

**Choices:**
- **A.** training examples per fold = 104
- **B.** training examples per fold = 122.72
- **C.** training examples per fold = 85.28
- **D.** training examples per fold = 141.44

**Correct Answer:** training examples per fold = 104

**Explanation:** Only the new data enter $N-\frac{N}{k}$; they produce 104.

---

## Question 44

**Question:** After the data change from (validation residuals=['0.28', '-0.3', '0.14']) to (validation residuals=['0.26', '-0.3', '0.13']), what is the new validation MSE?

**Choices:**
- **A.** validation MSE = 0.2002
- **B.** validation MSE = 0.1292
- **C.** validation MSE = -0.0128
- **D.** validation MSE = 0.0582

**Correct Answer:** validation MSE = 0.0582

**Explanation:** Only the new data enter $\frac{1}{n}\sum_i r_{i,\mathrm{val}}^2$; they produce 0.0582.

---

## Question 45

**Question:** After the data change from (training MSE=0.114, test MSE=0.212) to (training MSE=0.098, test MSE=0.184), what is the new test-minus-training gap?

**Choices:**
- **A.** test-minus-training gap = 0.228
- **B.** test-minus-training gap = 0.157
- **C.** test-minus-training gap = 0.015
- **D.** test-minus-training gap = 0.086

**Correct Answer:** test-minus-training gap = 0.086

**Explanation:** Only the new data enter $\mathrm{MSE}_{\mathrm{test}}-\mathrm{MSE}_{\mathrm{train}}$; they produce 0.086.

---

## Question 46

**Question:** Rank P, Q, R, S from largest to smallest MSE: P(residuals=['1.05', '-1.97', '0.52', '-1.5']), Q(residuals=['1.15', '-1.91', '0.56', '-1.5']), R(residuals=['1.3', '-1.82', '0.62', '-1.5']), S(residuals=['1.45', '-1.73', '0.68', '-1.5']).

**Choices:**
- **A.** MSE ranking: P = Q = R = S
- **B.** MSE ranking: P > Q > R > S
- **C.** MSE ranking: S > R > Q > P
- **D.** MSE ranking: Q > P > S > R

**Correct Answer:** MSE ranking: S > R > Q > P

**Explanation:** Their values are {'P': '1.876', 'Q': '1.8835', 'R': '1.9092', 'S': '1.952'}; grouping equal values and sorting descending gives MSE ranking: S > R > Q > P.

---

## Question 47

**Question:** Rank P, Q, R, S from largest to smallest updated LMS weight: P(w=0.44, c=0.035, feature=1.2, error=1.95), Q(w=0.52, c=0.045, feature=1.6, error=1.85), R(w=0.64, c=0.035, feature=2.2, error=1.7), S(w=0.76, c=0.05, feature=2.8, error=1.55).

**Choices:**
- **A.** updated LMS weight ranking: Q > P > S > R
- **B.** updated LMS weight ranking: P > Q > R > S
- **C.** updated LMS weight ranking: P = Q = R = S
- **D.** updated LMS weight ranking: S > R > Q > P

**Correct Answer:** updated LMS weight ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.5219', 'Q': '0.6532', 'R': '0.7709', 'S': '0.977'}; grouping equal values and sorting descending gives updated LMS weight ranking: S > R > Q > P.

---

## Question 48

**Question:** Rank P, Q, R, S from largest to smallest training examples per fold: P(N=210 examples and k=10 folds), Q(N=230 examples and k=10 folds), R(N=130 examples and k=5 folds), S(N=290 examples and k=10 folds).

**Choices:**
- **A.** training examples per fold ranking: R > P > Q > S
- **B.** training examples per fold ranking: S > Q > P > R
- **C.** training examples per fold ranking: P = Q = R = S
- **D.** training examples per fold ranking: P > Q > R > S

**Correct Answer:** training examples per fold ranking: S > Q > P > R

**Explanation:** Their values are {'P': '189', 'Q': '207', 'R': '104', 'S': '261'}; grouping equal values and sorting descending gives training examples per fold ranking: S > Q > P > R.

---

## Question 49

**Question:** Rank P, Q, R, S from largest to smallest validation MSE: P(validation residuals=['0.21', '-0.3', '0.105']), Q(validation residuals=['0.23', '-0.3', '0.115']), R(validation residuals=['0.26', '-0.3', '0.13']), S(validation residuals=['0.29', '-0.3', '0.145']).

**Choices:**
- **A.** validation MSE ranking: Q > P > S > R
- **B.** validation MSE ranking: P > Q > R > S
- **C.** validation MSE ranking: P = Q = R = S
- **D.** validation MSE ranking: S > R > Q > P

**Correct Answer:** validation MSE ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.0484', 'Q': '0.052', 'R': '0.0582', 'S': '0.065'}; grouping equal values and sorting descending gives validation MSE ranking: S > R > Q > P.

---

## Question 50

**Question:** Rank P, Q, R, S from largest to smallest test-minus-training gap: P(training MSE=0.058, test MSE=0.114), Q(training MSE=0.074, test MSE=0.142), R(training MSE=0.098, test MSE=0.184), S(training MSE=0.122, test MSE=0.226).

**Choices:**
- **A.** test-minus-training gap ranking: P > Q > R > S
- **B.** test-minus-training gap ranking: S > R > Q > P
- **C.** test-minus-training gap ranking: P = Q = R = S
- **D.** test-minus-training gap ranking: Q > P > S > R

**Correct Answer:** test-minus-training gap ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.056', 'Q': '0.068', 'R': '0.086', 'S': '0.104'}; grouping equal values and sorting descending gives test-minus-training gap ranking: S > R > Q > P.

---

## Question 51

**Question:** Which statement correctly characterizes T/P/E separation?

**Choices:**
- **A.** The experience is merely another name for the prediction target. for all permitted parameter values
- **B.** The task and metric can stay fixed while a changed experience alters what the learner can infer.
- **C.** The metric uniquely determines the training examples used.
- **D.** The task must change whenever the data distribution changes.

**Correct Answer:** The task and metric can stay fixed while a changed experience alters what the learner can infer.

**Explanation:** For T/P/E separation, the accurate statement is the first one because T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 52

**Question:** Which statement correctly characterizes training versus unseen performance?

**Choices:**
- **A.** Training MSE is mathematically identical to test MSE under every split. under every stated condition
- **B.** A low training MSE alone does not establish good performance on unseen examples.
- **C.** A lower training MSE proves the IID assumption was satisfied.
- **D.** Training MSE measures only the speed of the learning algorithm.

**Correct Answer:** A low training MSE alone does not establish good performance on unseen examples.

**Explanation:** For training versus unseen performance, the accurate statement is the first one because Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 53

**Question:** Which statement correctly characterizes cross-validation roles?

**Choices:**
- **A.** Every fold is used simultaneously as both training and validation data. without changing the supplied data under the complete set of stated assumptions
- **B.** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.
- **C.** Cross-validation removes the need to define a performance measure.
- **D.** The test set should guide every hyperparameter choice.

**Correct Answer:** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Explanation:** For cross-validation roles, the accurate statement is the first one because Validation supports model selection; final test data should not become tuning experience.

---

## Question 54

**Question:** Which statement correctly characterizes classification versus regression?

**Choices:**
- **A.** The distinction depends only on whether gradient descent is used.
- **B.** Classification is always supervised but regression is always unsupervised. for all permitted parameter values
- **C.** Classification predicts categories, whereas regression predicts continuous numerical values.
- **D.** Regression predicts labels while classification predicts measurements.

**Correct Answer:** Classification predicts categories, whereas regression predicts continuous numerical values.

**Explanation:** For classification versus regression, the accurate statement is the first one because The output type, not the optimizer, separates these two tasks.

---

## Question 55

**Question:** Which statement correctly characterizes self-supervised learning?

**Choices:**
- **A.** Self-supervised learning constructs a learning signal from the data itself.
- **B.** It requires reward feedback after every action.
- **C.** It forbids learning any representation from unlabelled data.
- **D.** It is identical to manually labelling every training example. under every stated condition

**Correct Answer:** Self-supervised learning constructs a learning signal from the data itself.

**Explanation:** For self-supervised learning, the accurate statement is the first one because Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 56

**Question:** Which statement correctly characterizes distribution shift?

**Choices:**
- **A.** IID guarantees that every observed feature value is identical. without changing the supplied data
- **B.** Distribution shift changes MSE into a classification metric.
- **C.** A larger training set makes any test distribution equivalent.
- **D.** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Correct Answer:** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Explanation:** For distribution shift, the accurate statement is the first one because Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 57

**Question:** Which statement correctly characterizes hypothesis representation?

**Choices:**
- **A.** Representation is another term for the performance measure.
- **B.** Representation specifies only how test examples are shuffled.
- **C.** Every representation can express every possible target equally well. for all permitted parameter values
- **D.** A hypothesis representation restricts the target functions the learner can express.

**Correct Answer:** A hypothesis representation restricts the target functions the learner can express.

**Explanation:** For hypothesis representation, the accurate statement is the first one because Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 58

**Question:** Which statement correctly characterizes the LMS rule?

**Choices:**
- **A.** LMS ignores the feature value and updates all weights equally. under every stated condition
- **B.** LMS always subtracts the absolute error from every weight.
- **C.** LMS changes a weight in proportion to learning rate, feature value, and current error.
- **D.** LMS can update weights only after test performance is known.

**Correct Answer:** LMS changes a weight in proportion to learning rate, feature value, and current error.

**Explanation:** For the LMS rule, the accurate statement is the first one because The supplied update is $w_i$ <- $w_i$ + c f_i error.

---

## Question 59

**Question:** Which statement correctly characterizes unsupervised learning?

**Choices:**
- **A.** Unsupervised learning is traditional programming with more rules.
- **B.** Unsupervised learning can seek hidden structure without supplied class labels.
- **C.** Unsupervised learning can output only continuous predictions.
- **D.** Unsupervised learning requires a scalar reward for every state transition. without changing the supplied data

**Correct Answer:** Unsupervised learning can seek hidden structure without supplied class labels.

**Explanation:** For unsupervised learning, the accurate statement is the first one because Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 60

**Question:** Which statement correctly characterizes theoretical versus experimental evaluation?

**Choices:**
- **A.** Neither form can use a stated performance measure.
- **B.** Experimental evaluation proves performance on every possible distribution. for all permitted parameter values
- **C.** Theoretical and experimental evaluation answer related but non-identical questions.
- **D.** Theoretical evaluation requires replacing the task with a new task.

**Correct Answer:** Theoretical and experimental evaluation answer related but non-identical questions.

**Explanation:** For theoretical versus experimental evaluation, the accurate statement is the first one because Empirical results concern observed experiments, while theory studies properties under assumptions.

---

## Question 61

**Question:** A student writes, “The metric uniquely determines the training examples used.” Which replacement correctly repairs the claim about T/P/E separation?

**Choices:**
- **A.** Replace it with: The task and metric can stay fixed while a changed experience alters what the learner can infer.
- **B.** Replace it with: The metric uniquely determines the training examples used.
- **C.** Replace it with: The experience is merely another name for the prediction target. under every stated condition under the complete set of stated assumptions
- **D.** Replace it with: The task must change whenever the data distribution changes.

**Correct Answer:** Replace it with: The task and metric can stay fixed while a changed experience alters what the learner can infer.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 62

**Question:** A student writes, “Training MSE is mathematically identical to test MSE under every split.” Which replacement correctly repairs the claim about training versus unseen performance?

**Choices:**
- **A.** Replace it with: Training MSE measures only the speed of the learning algorithm.
- **B.** Replace it with: Training MSE is mathematically identical to test MSE under every split. without changing the supplied data
- **C.** Replace it with: A lower training MSE proves the IID assumption was satisfied.
- **D.** Replace it with: A low training MSE alone does not establish good performance on unseen examples.

**Correct Answer:** Replace it with: A low training MSE alone does not establish good performance on unseen examples.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 63

**Question:** A student writes, “Every fold is used simultaneously as both training and validation data.” Which replacement correctly repairs the claim about cross-validation roles?

**Choices:**
- **A.** Replace it with: Every fold is used simultaneously as both training and validation data. for all permitted parameter values under the complete set of stated assumptions
- **B.** Replace it with: Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.
- **C.** Replace it with: Cross-validation removes the need to define a performance measure.
- **D.** Replace it with: The test set should guide every hyperparameter choice.

**Correct Answer:** Replace it with: Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Validation supports model selection; final test data should not become tuning experience.

---

## Question 64

**Question:** A student writes, “Classification is always supervised but regression is always unsupervised.” Which replacement correctly repairs the claim about classification versus regression?

**Choices:**
- **A.** Replace it with: Classification predicts categories, whereas regression predicts continuous numerical values.
- **B.** Replace it with: Classification is always supervised but regression is always unsupervised. under every stated condition
- **C.** Replace it with: Regression predicts labels while classification predicts measurements.
- **D.** Replace it with: The distinction depends only on whether gradient descent is used.

**Correct Answer:** Replace it with: Classification predicts categories, whereas regression predicts continuous numerical values.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The output type, not the optimizer, separates these two tasks.

---

## Question 65

**Question:** A student writes, “It requires reward feedback after every action.” Which replacement correctly repairs the claim about self-supervised learning?

**Choices:**
- **A.** Replace it with: It requires reward feedback after every action.
- **B.** Replace it with: It forbids learning any representation from unlabelled data.
- **C.** Replace it with: Self-supervised learning constructs a learning signal from the data itself.
- **D.** Replace it with: It is identical to manually labelling every training example. without changing the supplied data

**Correct Answer:** Replace it with: Self-supervised learning constructs a learning signal from the data itself.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 66

**Question:** A student writes, “Distribution shift changes MSE into a classification metric.” Which replacement correctly repairs the claim about distribution shift?

**Choices:**
- **A.** Replace it with: A larger training set makes any test distribution equivalent.
- **B.** Replace it with: Distribution shift changes MSE into a classification metric.
- **C.** Replace it with: IID guarantees that every observed feature value is identical. for all permitted parameter values
- **D.** Replace it with: A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Correct Answer:** Replace it with: A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 67

**Question:** A student writes, “Representation specifies only how test examples are shuffled.” Which replacement correctly repairs the claim about hypothesis representation?

**Choices:**
- **A.** Replace it with: Representation is another term for the performance measure.
- **B.** Replace it with: Representation specifies only how test examples are shuffled.
- **C.** Replace it with: A hypothesis representation restricts the target functions the learner can express.
- **D.** Replace it with: Every representation can express every possible target equally well. under every stated condition

**Correct Answer:** Replace it with: A hypothesis representation restricts the target functions the learner can express.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 68

**Question:** A student writes, “LMS ignores the feature value and updates all weights equally.” Which replacement correctly repairs the claim about the LMS rule?

**Choices:**
- **A.** Replace it with: LMS ignores the feature value and updates all weights equally. without changing the supplied data
- **B.** Replace it with: LMS changes a weight in proportion to learning rate, feature value, and current error.
- **C.** Replace it with: LMS always subtracts the absolute error from every weight.
- **D.** Replace it with: LMS can update weights only after test performance is known.

**Correct Answer:** Replace it with: LMS changes a weight in proportion to learning rate, feature value, and current error.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The supplied update is $w_i$ <- $w_i$ + c f_i error.

---

## Question 69

**Question:** A student writes, “Unsupervised learning requires a scalar reward for every state transition.” Which replacement correctly repairs the claim about unsupervised learning?

**Choices:**
- **A.** Replace it with: Unsupervised learning is traditional programming with more rules.
- **B.** Replace it with: Unsupervised learning requires a scalar reward for every state transition. for all permitted parameter values
- **C.** Replace it with: Unsupervised learning can output only continuous predictions.
- **D.** Replace it with: Unsupervised learning can seek hidden structure without supplied class labels.

**Correct Answer:** Replace it with: Unsupervised learning can seek hidden structure without supplied class labels.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 70

**Question:** A student writes, “Experimental evaluation proves performance on every possible distribution.” Which replacement correctly repairs the claim about theoretical versus experimental evaluation?

**Choices:**
- **A.** Replace it with: Neither form can use a stated performance measure.
- **B.** Replace it with: Experimental evaluation proves performance on every possible distribution. under every stated condition
- **C.** Replace it with: Theoretical evaluation requires replacing the task with a new task.
- **D.** Replace it with: Theoretical and experimental evaluation answer related but non-identical questions.

**Correct Answer:** Replace it with: Theoretical and experimental evaluation answer related but non-identical questions.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Empirical results concern observed experiments, while theory studies properties under assumptions.

---

## Question 71

**Question:** A student's answer about T/P/E separation contains the claim “The metric uniquely determines the training examples used.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns T/P/E separation but is only a harmless change of notation
- **B.** The quoted claim about T/P/E separation is correct without qualification
- **C.** The quoted claim about T/P/E separation is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about T/P/E separation is false and must be replaced

**Explanation:** The quoted claim contradicts T/P/E separation; it must be replaced by the chapter's stated rule.

---

## Question 72

**Question:** A student's answer about training versus unseen performance contains the claim “Training MSE is mathematically identical to test MSE under every split.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about training versus unseen performance is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns training versus unseen performance but is only a harmless change of notation
- **D.** The quoted claim about training versus unseen performance is false and must be replaced

**Correct Answer:** The quoted claim about training versus unseen performance is false and must be replaced

**Explanation:** The quoted claim contradicts training versus unseen performance; it must be replaced by the chapter's stated rule.

---

## Question 73

**Question:** A student's answer about cross-validation roles contains the claim “Every fold is used simultaneously as both training and validation data.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about cross-validation roles is false and must be replaced
- **B.** The quoted claim about cross-validation roles is correct without qualification
- **C.** The quoted claim concerns cross-validation roles but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about cross-validation roles is false and must be replaced

**Explanation:** The quoted claim contradicts cross-validation roles; it must be replaced by Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing..

---

## Question 74

**Question:** A student's answer about classification versus regression contains the claim “Classification is always supervised but regression is always unsupervised.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about classification versus regression is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns classification versus regression but is only a harmless change of notation
- **D.** The quoted claim about classification versus regression is false and must be replaced

**Correct Answer:** The quoted claim about classification versus regression is false and must be replaced

**Explanation:** The quoted claim contradicts classification versus regression; it must be replaced by Classification predicts categories, whereas regression predicts continuous numerical values..

---

## Question 75

**Question:** A student's answer about self-supervised learning contains the claim “It requires reward feedback after every action.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about self-supervised learning is correct without qualification
- **B.** The quoted claim concerns self-supervised learning but is only a harmless change of notation
- **C.** The quoted claim about self-supervised learning is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about self-supervised learning is false and must be replaced

**Explanation:** The quoted claim contradicts self-supervised learning; it must be replaced by Self-supervised learning constructs a learning signal from the data itself..

---

## Question 76

**Question:** A student's answer about distribution shift contains the claim “Distribution shift changes MSE into a classification metric.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about distribution shift is false and must be replaced
- **B.** The quoted claim about distribution shift is correct without qualification
- **C.** The quoted claim concerns distribution shift but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about distribution shift is false and must be replaced

**Explanation:** The quoted claim contradicts distribution shift; it must be replaced by A distribution shift can invalidate conclusions even when the training algorithm is unchanged..

---

## Question 77

**Question:** A student's answer about hypothesis representation contains the claim “Representation specifies only how test examples are shuffled.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about hypothesis representation is correct without qualification
- **B.** The quoted claim about hypothesis representation is false and must be replaced
- **C.** The quoted claim concerns hypothesis representation but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about hypothesis representation is false and must be replaced

**Explanation:** The quoted claim contradicts hypothesis representation; it must be replaced by the chapter's stated rule.

---

## Question 78

**Question:** A student's answer about the LMS rule contains the claim “LMS ignores the feature value and updates all weights equally.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about the LMS rule is correct without qualification
- **B.** The quoted claim about the LMS rule is false and must be replaced
- **C.** The quoted claim concerns the LMS rule but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about the LMS rule is false and must be replaced

**Explanation:** The quoted claim contradicts the LMS rule; it must be replaced by LMS changes a weight in proportion to learning rate, feature value, and current error..

---

## Question 79

**Question:** A student's answer about unsupervised learning contains the claim “Unsupervised learning requires a scalar reward for every state transition.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about unsupervised learning is false and must be replaced
- **B.** The quoted claim about unsupervised learning is correct without qualification
- **C.** The quoted claim concerns unsupervised learning but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about unsupervised learning is false and must be replaced

**Explanation:** The quoted claim contradicts unsupervised learning; it must be replaced by the chapter's stated rule.

---

## Question 80

**Question:** A student's answer about theoretical versus experimental evaluation contains the claim “Experimental evaluation proves performance on every possible distribution.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about theoretical versus experimental evaluation is correct without qualification
- **B.** The quoted claim concerns theoretical versus experimental evaluation but is only a harmless change of notation
- **C.** The quoted claim about theoretical versus experimental evaluation is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about theoretical versus experimental evaluation is false and must be replaced

**Explanation:** The quoted claim contradicts theoretical versus experimental evaluation; it must be replaced by the chapter's stated rule.

---

## Question 81

**Question:** An implementation is designed around the rule “The experience is merely another name for the prediction target.” Which principle exposes the design error concerning T/P/E separation?

**Choices:**
- **A.** Required principle: The task and metric can stay fixed while a changed experience alters what the learner can infer.
- **B.** Required principle: The metric uniquely determines the training examples used.
- **C.** Required principle: The experience is merely another name for the prediction target. for all permitted parameter values
- **D.** Required principle: The task must change whenever the data distribution changes.

**Correct Answer:** Required principle: The task and metric can stay fixed while a changed experience alters what the learner can infer.

**Explanation:** The implementation encodes a false rule. The required principle follows because T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 82

**Question:** An implementation is designed around the rule “A lower training MSE proves the IID assumption was satisfied.” Which principle exposes the design error concerning training versus unseen performance?

**Choices:**
- **A.** Required principle: Training MSE is mathematically identical to test MSE under every split. under every stated condition
- **B.** Required principle: Training MSE measures only the speed of the learning algorithm.
- **C.** Required principle: A lower training MSE proves the IID assumption was satisfied.
- **D.** Required principle: A low training MSE alone does not establish good performance on unseen examples.

**Correct Answer:** Required principle: A low training MSE alone does not establish good performance on unseen examples.

**Explanation:** The implementation encodes a false rule. The required principle follows because Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 83

**Question:** An implementation is designed around the rule “Cross-validation removes the need to define a performance measure.” Which principle exposes the design error concerning cross-validation roles?

**Choices:**
- **A.** Required principle: Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.
- **B.** Required principle: Every fold is used simultaneously as both training and validation data. without changing the supplied data under the complete set of stated assumptions
- **C.** Required principle: Cross-validation removes the need to define a performance measure.
- **D.** Required principle: The test set should guide every hyperparameter choice.

**Correct Answer:** Required principle: Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Explanation:** The implementation encodes a false rule. The required principle follows because Validation supports model selection; final test data should not become tuning experience.

---

## Question 84

**Question:** An implementation is designed around the rule “Regression predicts labels while classification predicts measurements.” Which principle exposes the design error concerning classification versus regression?

**Choices:**
- **A.** Required principle: Regression predicts labels while classification predicts measurements.
- **B.** Required principle: Classification predicts categories, whereas regression predicts continuous numerical values.
- **C.** Required principle: Classification is always supervised but regression is always unsupervised. for all permitted parameter values
- **D.** Required principle: The distinction depends only on whether gradient descent is used.

**Correct Answer:** Required principle: Classification predicts categories, whereas regression predicts continuous numerical values.

**Explanation:** The implementation encodes a false rule. The required principle follows because The output type, not the optimizer, separates these two tasks.

---

## Question 85

**Question:** An implementation is designed around the rule “It forbids learning any representation from unlabelled data.” Which principle exposes the design error concerning self-supervised learning?

**Choices:**
- **A.** Required principle: It is identical to manually labelling every training example. under every stated condition
- **B.** Required principle: It requires reward feedback after every action.
- **C.** Required principle: It forbids learning any representation from unlabelled data.
- **D.** Required principle: Self-supervised learning constructs a learning signal from the data itself.

**Correct Answer:** Required principle: Self-supervised learning constructs a learning signal from the data itself.

**Explanation:** The implementation encodes a false rule. The required principle follows because Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 86

**Question:** An implementation is designed around the rule “IID guarantees that every observed feature value is identical.” Which principle exposes the design error concerning distribution shift?

**Choices:**
- **A.** Required principle: A distribution shift can invalidate conclusions even when the training algorithm is unchanged.
- **B.** Required principle: Distribution shift changes MSE into a classification metric.
- **C.** Required principle: IID guarantees that every observed feature value is identical. without changing the supplied data
- **D.** Required principle: A larger training set makes any test distribution equivalent.

**Correct Answer:** Required principle: A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Explanation:** The implementation encodes a false rule. The required principle follows because Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 87

**Question:** An implementation is designed around the rule “Every representation can express every possible target equally well.” Which principle exposes the design error concerning hypothesis representation?

**Choices:**
- **A.** Required principle: Representation is another term for the performance measure.
- **B.** Required principle: Representation specifies only how test examples are shuffled.
- **C.** Required principle: A hypothesis representation restricts the target functions the learner can express.
- **D.** Required principle: Every representation can express every possible target equally well. for all permitted parameter values

**Correct Answer:** Required principle: A hypothesis representation restricts the target functions the learner can express.

**Explanation:** The implementation encodes a false rule. The required principle follows because Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 88

**Question:** An implementation is designed around the rule “LMS always subtracts the absolute error from every weight.” Which principle exposes the design error concerning the LMS rule?

**Choices:**
- **A.** Required principle: LMS ignores the feature value and updates all weights equally. under every stated condition
- **B.** Required principle: LMS changes a weight in proportion to learning rate, feature value, and current error.
- **C.** Required principle: LMS always subtracts the absolute error from every weight.
- **D.** Required principle: LMS can update weights only after test performance is known.

**Correct Answer:** Required principle: LMS changes a weight in proportion to learning rate, feature value, and current error.

**Explanation:** The implementation encodes a false rule. The required principle follows because The supplied update is $w_i$ <- $w_i$ + c f_i error.

---

## Question 89

**Question:** An implementation is designed around the rule “Unsupervised learning can output only continuous predictions.” Which principle exposes the design error concerning unsupervised learning?

**Choices:**
- **A.** Required principle: Unsupervised learning can output only continuous predictions.
- **B.** Required principle: Unsupervised learning requires a scalar reward for every state transition. without changing the supplied data
- **C.** Required principle: Unsupervised learning can seek hidden structure without supplied class labels.
- **D.** Required principle: Unsupervised learning is traditional programming with more rules.

**Correct Answer:** Required principle: Unsupervised learning can seek hidden structure without supplied class labels.

**Explanation:** The implementation encodes a false rule. The required principle follows because Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 90

**Question:** An implementation is designed around the rule “Theoretical evaluation requires replacing the task with a new task.” Which principle exposes the design error concerning theoretical versus experimental evaluation?

**Choices:**
- **A.** Required principle: Theoretical evaluation requires replacing the task with a new task.
- **B.** Required principle: Experimental evaluation proves performance on every possible distribution. for all permitted parameter values
- **C.** Required principle: Theoretical and experimental evaluation answer related but non-identical questions.
- **D.** Required principle: Neither form can use a stated performance measure.

**Correct Answer:** Required principle: Theoretical and experimental evaluation answer related but non-identical questions.

**Explanation:** The implementation encodes a false rule. The required principle follows because Empirical results concern observed experiments, while theory studies properties under assumptions.

---

## Question 91

**Question:** Reviewer A states, “The task and metric can stay fixed while a changed experience alters what the learner can infer.” Reviewer B states, “The task must change whenever the data distribution changes.” What is the correct verdict about T/P/E separation?

**Choices:**
- **A.** Neither reviewer is correct about T/P/E separation
- **B.** Reviewer B only is correct about T/P/E separation
- **C.** Both reviewers are correct about T/P/E separation
- **D.** Reviewer A only is correct about T/P/E separation

**Correct Answer:** Reviewer A only is correct about T/P/E separation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 92

**Question:** Reviewer A states, “A low training MSE alone does not establish good performance on unseen examples.” Reviewer B states, “Training MSE measures only the speed of the learning algorithm.” What is the correct verdict about training versus unseen performance?

**Choices:**
- **A.** Reviewer A only is correct about training versus unseen performance
- **B.** Reviewer B only is correct about training versus unseen performance
- **C.** Both reviewers are correct about training versus unseen performance
- **D.** Neither reviewer is correct about training versus unseen performance

**Correct Answer:** Reviewer A only is correct about training versus unseen performance

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 93

**Question:** Reviewer A states, “Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.” Reviewer B states, “The test set should guide every hyperparameter choice.” What is the correct verdict about cross-validation roles?

**Choices:**
- **A.** Both reviewers are correct about cross-validation roles
- **B.** Reviewer B only is correct about cross-validation roles
- **C.** Reviewer A only is correct about cross-validation roles
- **D.** Neither reviewer is correct about cross-validation roles

**Correct Answer:** Reviewer A only is correct about cross-validation roles

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Validation supports model selection; final test data should not become tuning experience.

---

## Question 94

**Question:** Reviewer A states, “Classification predicts categories, whereas regression predicts continuous numerical values.” Reviewer B states, “The distinction depends only on whether gradient descent is used.” What is the correct verdict about classification versus regression?

**Choices:**
- **A.** Reviewer B only is correct about classification versus regression
- **B.** Both reviewers are correct about classification versus regression
- **C.** Reviewer A only is correct about classification versus regression
- **D.** Neither reviewer is correct about classification versus regression

**Correct Answer:** Reviewer A only is correct about classification versus regression

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The output type, not the optimizer, separates these two tasks.

---

## Question 95

**Question:** Reviewer A states, “Self-supervised learning constructs a learning signal from the data itself.” Reviewer B states, “It is identical to manually labelling every training example.” What is the correct verdict about self-supervised learning?

**Choices:**
- **A.** Reviewer B only is correct about self-supervised learning
- **B.** Reviewer A only is correct about self-supervised learning
- **C.** Both reviewers are correct about self-supervised learning
- **D.** Neither reviewer is correct about self-supervised learning

**Correct Answer:** Reviewer A only is correct about self-supervised learning

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 96

**Question:** Reviewer A states, “A distribution shift can invalidate conclusions even when the training algorithm is unchanged.” Reviewer B states, “A larger training set makes any test distribution equivalent.” What is the correct verdict about distribution shift?

**Choices:**
- **A.** Reviewer A only is correct about distribution shift
- **B.** Reviewer B only is correct about distribution shift
- **C.** Both reviewers are correct about distribution shift
- **D.** Neither reviewer is correct about distribution shift

**Correct Answer:** Reviewer A only is correct about distribution shift

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 97

**Question:** Reviewer A states, “A hypothesis representation restricts the target functions the learner can express.” Reviewer B states, “Representation is another term for the performance measure.” What is the correct verdict about hypothesis representation?

**Choices:**
- **A.** Neither reviewer is correct about hypothesis representation
- **B.** Reviewer A only is correct about hypothesis representation
- **C.** Both reviewers are correct about hypothesis representation
- **D.** Reviewer B only is correct about hypothesis representation

**Correct Answer:** Reviewer A only is correct about hypothesis representation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 98

**Question:** Reviewer A states, “LMS changes a weight in proportion to learning rate, feature value, and current error.” Reviewer B states, “LMS can update weights only after test performance is known.” What is the correct verdict about the LMS rule?

**Choices:**
- **A.** Reviewer A only is correct about the LMS rule
- **B.** Reviewer B only is correct about the LMS rule
- **C.** Both reviewers are correct about the LMS rule
- **D.** Neither reviewer is correct about the LMS rule

**Correct Answer:** Reviewer A only is correct about the LMS rule

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The supplied update is $w_i$ <- $w_i$ + c f_i error.

---

## Question 99

**Question:** Reviewer A states, “Unsupervised learning can seek hidden structure without supplied class labels.” Reviewer B states, “Unsupervised learning is traditional programming with more rules.” What is the correct verdict about unsupervised learning?

**Choices:**
- **A.** Both reviewers are correct about unsupervised learning
- **B.** Reviewer A only is correct about unsupervised learning
- **C.** Reviewer B only is correct about unsupervised learning
- **D.** Neither reviewer is correct about unsupervised learning

**Correct Answer:** Reviewer A only is correct about unsupervised learning

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 100

**Question:** Reviewer A states, “Theoretical and experimental evaluation answer related but non-identical questions.” Reviewer B states, “Neither form can use a stated performance measure.” What is the correct verdict about theoretical versus experimental evaluation?

**Choices:**
- **A.** Reviewer B only is correct about theoretical versus experimental evaluation
- **B.** Neither reviewer is correct about theoretical versus experimental evaluation
- **C.** Both reviewers are correct about theoretical versus experimental evaluation
- **D.** Reviewer A only is correct about theoretical versus experimental evaluation

**Correct Answer:** Reviewer A only is correct about theoretical versus experimental evaluation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Empirical results concern observed experiments, while theory studies properties under assumptions.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Questions were audited for structural balance, verbatim reuse, and parameter-only duplicate prompts.
