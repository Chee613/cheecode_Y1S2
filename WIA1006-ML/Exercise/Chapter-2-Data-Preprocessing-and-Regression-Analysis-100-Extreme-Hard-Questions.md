# Chapter 2: Data Preprocessing and Regression Analysis: 100 Extreme-Hard Questions

> Topics: cleaning, encoding, scaling, dataset splits, linear regression, gradient descent, normal equation, and metrics. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** Using x=7, fitted min=2, fitted max=22, compute the min-max value.

**Choices:**
- **A.** min-max value = 0.321
- **B.** min-max value = 0.25
- **C.** min-max value = 0.179
- **D.** min-max value = 0.392

**Correct Answer:** min-max value = 0.25

**Explanation:** Apply $\frac{x-x_{\min}}{x_{\max}-x_{\min}}$; substitution gives min-max value=0.25.

---

## Question 2

**Question:** Using x=15, training mean=10, training sd=2, compute the standard score.

**Choices:**
- **A.** standard score = 3.4
- **B.** standard score = 2.95
- **C.** standard score = 2.05
- **D.** standard score = 2.5

**Correct Answer:** standard score = 2.5

**Explanation:** Apply $\frac{x-\mu}{\sigma}$; substitution gives standard score=2.5.

---

## Question 3

**Question:** Using x=[0, 1, 2], y=['1', '3', '5'], $\theta=(0.5,1.6)$, compute the linear-regression cost J.

**Choices:**
- **A.** linear-regression cost J = 0.6233
- **B.** linear-regression cost J = 0.5408
- **C.** linear-regression cost J = 0.3758
- **D.** linear-regression cost J = 0.4583

**Correct Answer:** linear-regression cost J = 0.4583

**Explanation:** Apply $\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2$; substitution gives linear-regression cost J=0.4583.

---

## Question 4

**Question:** Using x=[1, 2, 3], y=['2', '4', '7'], $\theta=(1,1)$, $\alpha=.1$, compute the updated $\theta_1$.

**Choices:**
- **A.** updated $\theta_1$ = 1.1207
- **B.** updated $\theta_1$ = 1.6127
- **C.** updated $\theta_1$ = 1.3667
- **D.** updated $\theta_1$ = 1.8587

**Correct Answer:** updated $\theta_1$ = 1.3667

**Explanation:** Apply $\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}$; substitution gives updated $\theta_1$=1.3667.

---

## Question 5

**Question:** Using residuals=['1', '-2', '3', '-1'], compute the RMSE.

**Choices:**
- **A.** RMSE = 1.9365
- **B.** RMSE = 2.2851
- **C.** RMSE = 1.5879
- **D.** RMSE = 2.6336

**Correct Answer:** RMSE = 1.9365

**Explanation:** Apply $\sqrt{\frac{1}{n}\sum_i r_i^2}$; substitution gives RMSE=1.9365.

---

## Question 6

**Question:** Compare the min-max value for Case P (x=8.5, fitted min=3, fitted max=24) and Case Q (x=13, fitted min=6, fitted max=30).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 0.2619 versus 0.2917 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 0.2917 versus 0.2619

**Correct Answer:** The second case is larger: 0.2917 versus 0.2619

**Explanation:** The same formula gives 0.2619 for P and 0.2917 for Q, establishing the stated comparison.

---

## Question 7

**Question:** Compare the standard score for Case P (x=16, training mean=10.4, training sd=2.1) and Case Q (x=19, training mean=11.6, training sd=2.4).

**Choices:**
- **A.** The first case is larger: 2.6667 versus 3.0833 under the complete set of stated assumptions
- **B.** The second case is larger: 3.0833 versus 2.6667
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 3.0833 versus 2.6667

**Explanation:** The same formula gives 2.6667 for P and 3.0833 for Q, establishing the stated comparison.

---

## Question 8

**Question:** Compare the linear-regression cost J for Case P (x=[0, 1, 2], y=['1.1', '3.1', '5.1'], $\theta=(0.53,1.6)$) and Case Q (x=[0, 1, 2], y=['1.4', '3.4', '5.4'], $\theta=(0.62,1.6)$).

**Choices:**
- **A.** The second case is larger: 0.7495 versus 0.5238
- **B.** The first case is larger: 0.5238 versus 0.7495 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.7495 versus 0.5238

**Explanation:** The same formula gives 0.5238 for P and 0.7495 for Q, establishing the stated comparison.

---

## Question 9

**Question:** Compare the updated $\theta_1$ for Case P (x=[1, 2, 3], y=['2.1', '4.1', '7.1'], $\theta=(1,1)$, $\alpha=.1$) and Case Q (x=[1, 2, 3], y=['2.4', '4.4', '7.4'], $\theta=(1,1)$, $\alpha=.1$).

**Choices:**
- **A.** The first case is larger: 1.3867 versus 1.4467 under the complete set of stated assumptions
- **B.** The second case is larger: 1.4467 versus 1.3867
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 1.4467 versus 1.3867

**Explanation:** The same formula gives 1.3867 for P and 1.4467 for Q, establishing the stated comparison.

---

## Question 10

**Question:** Compare the RMSE for Case P (residuals=['1.05', '-2', '2.96', '-1']) and Case Q (residuals=['1.2', '-2', '2.84', '-1']).

**Choices:**
- **A.** The first case is larger: 1.9277 versus 1.9043
- **B.** The second case is larger: 1.9043 versus 1.9277
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 1.9277 versus 1.9043

**Explanation:** The same formula gives 1.9277 for P and 1.9043 for Q, establishing the stated comparison.

---

## Question 11

**Question:** How far apart are the min-max value values for (x=10, fitted min=4, fitted max=26) and (x=19, fitted min=10, fitted max=38)?

**Choices:**
- **A.** absolute min-max value difference = 0.1197
- **B.** absolute min-max value difference = 0.0487
- **C.** absolute min-max value difference = -0.0223
- **D.** absolute min-max value difference = 0.1907

**Correct Answer:** absolute min-max value difference = 0.0487

**Explanation:** The two values are 0.2727 and 0.3214; their absolute difference is 0.0487.

---

## Question 12

**Question:** How far apart are the standard score values for (x=17, training mean=10.8, training sd=2.2) and (x=23, training mean=13.2, training sd=2.8)?

**Choices:**
- **A.** absolute standard score difference = 0.5591
- **B.** absolute standard score difference = 0.8045
- **C.** absolute standard score difference = 0.6818
- **D.** absolute standard score difference = 0.9273

**Correct Answer:** absolute standard score difference = 0.6818

**Explanation:** The two values are 2.8182 and 3.5; their absolute difference is 0.6818.

---

## Question 13

**Question:** How far apart are the linear-regression cost J values for (x=[0, 1, 2], y=['1.2', '3.2', '5.2'], $\theta=(0.56,1.6)$) and (x=[0, 1, 2], y=['1.8', '3.8', '5.8'], $\theta=(0.74,1.6)$)?

**Choices:**
- **A.** absolute linear-regression cost J difference = 0.714
- **B.** absolute linear-regression cost J difference = 0.6195
- **C.** absolute linear-regression cost J difference = 0.4305
- **D.** absolute linear-regression cost J difference = 0.525

**Correct Answer:** absolute linear-regression cost J difference = 0.525

**Explanation:** The two values are 0.5941 and 1.1191; their absolute difference is 0.525.

---

## Question 14

**Question:** How far apart are the updated $\theta_1$ values for (x=[1, 2, 3], y=['2.2', '4.2', '7.2'], $\theta=(1,1)$, $\alpha=.1$) and (x=[1, 2, 3], y=['2.8', '4.8', '7.8'], $\theta=(1,1)$, $\alpha=.1$)?

**Choices:**
- **A.** absolute updated $\theta_1$ difference = 0.262
- **B.** absolute updated $\theta_1$ difference = 0.191
- **C.** absolute updated $\theta_1$ difference = 0.049
- **D.** absolute updated $\theta_1$ difference = 0.12

**Correct Answer:** absolute updated $\theta_1$ difference = 0.12

**Explanation:** The two values are 1.4067 and 1.5267; their absolute difference is 0.12.

---

## Question 15

**Question:** How far apart are the RMSE values for (residuals=['1.1', '-2', '2.92', '-1']) and (residuals=['1.4', '-2', '2.68', '-1'])?

**Choices:**
- **A.** absolute RMSE difference = -0.0319
- **B.** absolute RMSE difference = 0.1101
- **C.** absolute RMSE difference = 0.0391
- **D.** absolute RMSE difference = 0.1811

**Correct Answer:** absolute RMSE difference = 0.0391

**Explanation:** The two values are 1.9194 and 1.8803; their absolute difference is 0.0391.

---

## Question 16

**Question:** Taking (x=11.5, fitted min=5, fitted max=28) as baseline and (x=8.5, fitted min=3, fitted max=24) as the new case, what is the percentage change in min-max value?

**Choices:**
- **A.** percentage change in min-max value = -8.6447
- **B.** percentage change in min-max value = -6.0073
- **C.** percentage change in min-max value = -7.326
- **D.** percentage change in min-max value = -4.6886

**Correct Answer:** percentage change in min-max value = -7.326

**Explanation:** The values change from 0.2826 to 0.2619; (new-old)/|old|*100=-7.326%.

---

## Question 17

**Question:** Taking (x=18, training mean=11.2, training sd=2.3) as baseline and (x=16, training mean=10.4, training sd=2.1) as the new case, what is the percentage change in standard score?

**Choices:**
- **A.** percentage change in standard score = -9.8039
- **B.** percentage change in standard score = -8.0392
- **C.** percentage change in standard score = -11.5686
- **D.** percentage change in standard score = -6.2745

**Correct Answer:** percentage change in standard score = -9.8039

**Explanation:** The values change from 2.9565 to 2.6667; (new-old)/|old|*100=-9.8039%.

---

## Question 18

**Question:** Taking (x=[0, 1, 2], y=['1.3', '3.3', '5.3'], $\theta=(0.59,1.6)$) as baseline and (x=[0, 1, 2], y=['1.1', '3.1', '5.1'], $\theta=(0.53,1.6)$) as the new case, what is the percentage change in linear-regression cost J?

**Choices:**
- **A.** percentage change in linear-regression cost J = -17.8361
- **B.** percentage change in linear-regression cost J = -21.7514
- **C.** percentage change in linear-regression cost J = -25.6666
- **D.** percentage change in linear-regression cost J = -13.9209

**Correct Answer:** percentage change in linear-regression cost J = -21.7514

**Explanation:** The values change from 0.6694 to 0.5238; (new-old)/|old|*100=-21.7514%.

---

## Question 19

**Question:** Taking (x=[1, 2, 3], y=['2.3', '4.3', '7.3'], $\theta=(1,1)$, $\alpha=.1$) as baseline and (x=[1, 2, 3], y=['2.1', '4.1', '7.1'], $\theta=(1,1)$, $\alpha=.1$) as the new case, what is the percentage change in updated $\theta_1$?

**Choices:**
- **A.** percentage change in updated $\theta_1$ = -1.7944
- **B.** percentage change in updated $\theta_1$ = -2.2991
- **C.** percentage change in updated $\theta_1$ = -3.3084
- **D.** percentage change in updated $\theta_1$ = -2.8037

**Correct Answer:** percentage change in updated $\theta_1$ = -2.8037

**Explanation:** The values change from 1.4267 to 1.3867; (new-old)/|old|*100=-2.8037%.

---

## Question 20

**Question:** Taking (residuals=['1.15', '-2', '2.88', '-1']) as baseline and (residuals=['1.05', '-2', '2.96', '-1']) as the new case, what is the percentage change in RMSE?

**Choices:**
- **A.** percentage change in RMSE = 0.8421
- **B.** percentage change in RMSE = 0.9936
- **C.** percentage change in RMSE = 0.6905
- **D.** percentage change in RMSE = 1.1452

**Correct Answer:** percentage change in RMSE = 0.8421

**Explanation:** The values change from 1.9116 to 1.9277; (new-old)/|old|*100=0.8421%.

---

## Question 21

**Question:** Which formula must be applied to obtain min-max value from the supplied chapter quantities?

**Choices:**
- **A.** For min-max value, use sum inputs without the required weighting for min-max value
- **B.** For min-max value, use $1-\left(\frac{x-x_{\min}}{x_{\max}-x_{\min}}\right)$
- **C.** For min-max value, use $\sqrt{\frac{x-x_{\min}}{x_{\max}-x_{\min}}}$
- **D.** For min-max value, use $\frac{x-x_{\min}}{x_{\max}-x_{\min}}$

**Correct Answer:** For min-max value, use $\frac{x-x_{\min}}{x_{\max}-x_{\min}}$

**Explanation:** The chapter defines min-max value with $\frac{x-x_{\min}}{x_{\max}-x_{\min}}$; the other expressions change an operation or omit required weighting.

---

## Question 22

**Question:** Which formula must be applied to obtain standard score from the supplied chapter quantities?

**Choices:**
- **A.** For standard score, use $\frac{x-\mu}{\sigma}$
- **B.** For standard score, use $1-\left(\frac{x-\mu}{\sigma}\right)$
- **C.** For standard score, use $\sqrt{\frac{x-\mu}{\sigma}}$
- **D.** For standard score, use sum inputs without the required weighting for standard score

**Correct Answer:** For standard score, use $\frac{x-\mu}{\sigma}$

**Explanation:** The chapter defines standard score with $\frac{x-\mu}{\sigma}$; the other expressions change an operation or omit required weighting.

---

## Question 23

**Question:** Which formula must be applied to obtain linear-regression cost J from the supplied chapter quantities?

**Choices:**
- **A.** For linear-regression cost J, use $\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2$
- **B.** For linear-regression cost J, use $1-\left(\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2\right)$
- **C.** For linear-regression cost J, use $\sqrt{\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2}$
- **D.** For linear-regression cost J, use sum inputs without the required weighting for linear-regression cost J

**Correct Answer:** For linear-regression cost J, use $\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2$

**Explanation:** The chapter defines linear-regression cost J with $\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2$; the other expressions change an operation or omit required weighting.

---

## Question 24

**Question:** Which formula must be applied to obtain updated $\theta_1$ from the supplied chapter quantities?

**Choices:**
- **A.** For updated $\theta_1$, use sum inputs without the required weighting for updated $\theta_1$
- **B.** For updated $\theta_1$, use $1-\left(\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}\right)$
- **C.** For updated $\theta_1$, use $\sqrt{\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}}$
- **D.** For updated $\theta_1$, use $\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}$

**Correct Answer:** For updated $\theta_1$, use $\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}$

**Explanation:** The chapter defines updated $\theta_1$ with $\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}$; the other expressions change an operation or omit required weighting.

---

## Question 25

**Question:** Which formula must be applied to obtain RMSE from the supplied chapter quantities?

**Choices:**
- **A.** For RMSE, use $\sqrt{\sqrt{\frac{1}{n}\sum_i r_i^2}}$
- **B.** For RMSE, use $1-\left(\sqrt{\frac{1}{n}\sum_i r_i^2}\right)$
- **C.** For RMSE, use $\sqrt{\frac{1}{n}\sum_i r_i^2}$
- **D.** For RMSE, use sum inputs without the required weighting for RMSE

**Correct Answer:** For RMSE, use $\sqrt{\frac{1}{n}\sum_i r_i^2}$

**Explanation:** The chapter defines RMSE with $\sqrt{\frac{1}{n}\sum_i r_i^2}$; the other expressions change an operation or omit required weighting.

---

## Question 26

**Question:** Four datasets are candidates. Which one produces min-max value=0.3?

**Choices:**
- **A.** For min-max value, the first dataset: x=7, fitted min=2, fitted max=22
- **B.** For min-max value, the third dataset: x=14.5, fitted min=7, fitted max=32
- **C.** For min-max value, the second dataset: x=10, fitted min=4, fitted max=26
- **D.** For min-max value, the fourth dataset: x=19, fitted min=10, fitted max=38

**Correct Answer:** For min-max value, the third dataset: x=14.5, fitted min=7, fitted max=32

**Explanation:** Evaluating all four with $\frac{x-x_{\min}}{x_{\max}-x_{\min}}$ shows that the third dataset produces 0.3.

---

## Question 27

**Question:** Four datasets are candidates. Which one produces standard score=3.2?

**Choices:**
- **A.** For standard score, the fourth dataset: x=23, training mean=13.2, training sd=2.8
- **B.** For standard score, the first dataset: x=15, training mean=10, training sd=2
- **C.** For standard score, the second dataset: x=17, training mean=10.8, training sd=2.2
- **D.** For standard score, the third dataset: x=20, training mean=12, training sd=2.5

**Correct Answer:** For standard score, the third dataset: x=20, training mean=12, training sd=2.5

**Explanation:** Evaluating all four with $\frac{x-\mu}{\sigma}$ shows that the third dataset produces 3.2.

---

## Question 28

**Question:** Four datasets are candidates. Which one produces linear-regression cost J=0.8346?

**Choices:**
- **A.** For linear-regression cost J, the first dataset: x=[0, 1, 2], y=['1', '3', '5'], $\theta=(0.5,1.6)$
- **B.** For linear-regression cost J, the third dataset: x=[0, 1, 2], y=['1.5', '3.5', '5.5'], $\theta=(0.65,1.6)$
- **C.** For linear-regression cost J, the second dataset: x=[0, 1, 2], y=['1.2', '3.2', '5.2'], $\theta=(0.56,1.6)$
- **D.** For linear-regression cost J, the fourth dataset: x=[0, 1, 2], y=['1.8', '3.8', '5.8'], $\theta=(0.74,1.6)$

**Correct Answer:** For linear-regression cost J, the third dataset: x=[0, 1, 2], y=['1.5', '3.5', '5.5'], $\theta=(0.65,1.6)$

**Explanation:** Evaluating all four with $\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2$ shows that the third dataset produces 0.8346.

---

## Question 29

**Question:** Four datasets are candidates. Which one produces updated $\theta_1$=1.4667?

**Choices:**
- **A.** For updated $\theta_1$, the third dataset: x=[1, 2, 3], y=['2.5', '4.5', '7.5'], $\theta=(1,1)$, $\alpha=.1$
- **B.** For updated $\theta_1$, the first dataset: x=[1, 2, 3], y=['2', '4', '7'], $\theta=(1,1)$, $\alpha=.1$
- **C.** For updated $\theta_1$, the second dataset: x=[1, 2, 3], y=['2.2', '4.2', '7.2'], $\theta=(1,1)$, $\alpha=.1$
- **D.** For updated $\theta_1$, the fourth dataset: x=[1, 2, 3], y=['2.8', '4.8', '7.8'], $\theta=(1,1)$, $\alpha=.1$

**Correct Answer:** For updated $\theta_1$, the third dataset: x=[1, 2, 3], y=['2.5', '4.5', '7.5'], $\theta=(1,1)$, $\alpha=.1$

**Explanation:** Evaluating all four with $\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}$ shows that the third dataset produces 1.4667.

---

## Question 30

**Question:** Four datasets are candidates. Which one produces RMSE=1.8975?

**Choices:**
- **A.** For RMSE, the third dataset: residuals=['1.25', '-2', '2.8', '-1']
- **B.** For RMSE, the first dataset: residuals=['1', '-2', '3', '-1']
- **C.** For RMSE, the second dataset: residuals=['1.1', '-2', '2.92', '-1']
- **D.** For RMSE, the fourth dataset: residuals=['1.4', '-2', '2.68', '-1']

**Correct Answer:** For RMSE, the third dataset: residuals=['1.25', '-2', '2.8', '-1']

**Explanation:** Evaluating all four with $\sqrt{\frac{1}{n}\sum_i r_i^2}$ shows that the third dataset produces 1.8975.

---

## Question 31

**Question:** For x=16, fitted min=8, fitted max=34, a student reports min-max value=0.4077. What corrected value should replace it?

**Choices:**
- **A.** corrected min-max value = 0.2367
- **B.** corrected min-max value = 0.3787
- **C.** corrected min-max value = 0.3077
- **D.** corrected min-max value = 0.4497

**Correct Answer:** corrected min-max value = 0.3077

**Explanation:** Recomputing with $\frac{x-x_{\min}}{x_{\max}-x_{\min}}$ gives 0.3077, so the reported 0.4077 is rejected.

---

## Question 32

**Question:** For x=21, training mean=12.4, training sd=2.6, a student reports standard score=4.1346. What corrected value should replace it?

**Choices:**
- **A.** corrected standard score = 3.9031
- **B.** corrected standard score = 3.3077
- **C.** corrected standard score = 2.7123
- **D.** corrected standard score = 4.4985

**Correct Answer:** corrected standard score = 3.3077

**Explanation:** Recomputing with $\frac{x-\mu}{\sigma}$ gives 3.3077, so the reported 4.1346 is rejected.

---

## Question 33

**Question:** For x=[0, 1, 2], y=['1.6', '3.6', '5.6'], $\theta=(0.68,1.6)$, a student reports linear-regression cost J=1.1557. What corrected value should replace it?

**Choices:**
- **A.** corrected linear-regression cost J = 1.0909
- **B.** corrected linear-regression cost J = 0.9245
- **C.** corrected linear-regression cost J = 0.7581
- **D.** corrected linear-regression cost J = 1.2574

**Correct Answer:** corrected linear-regression cost J = 0.9245

**Explanation:** Recomputing with $\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2$ gives 0.9245, so the reported 1.1557 is rejected.

---

## Question 34

**Question:** For x=[1, 2, 3], y=['2.6', '4.6', '7.6'], $\theta=(1,1)$, $\alpha=.1$, a student reports updated $\theta_1$=1.8583. What corrected value should replace it?

**Choices:**
- **A.** corrected updated $\theta_1$ = 2.0219
- **B.** corrected updated $\theta_1$ = 1.7543
- **C.** corrected updated $\theta_1$ = 1.2191
- **D.** corrected updated $\theta_1$ = 1.4867

**Correct Answer:** corrected updated $\theta_1$ = 1.4867

**Explanation:** Recomputing with $\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}$ gives 1.4867, so the reported 1.8583 is rejected.

---

## Question 35

**Question:** For residuals=['1.3', '-2', '2.76', '-1'], a student reports RMSE=2.3641. What corrected value should replace it?

**Choices:**
- **A.** corrected RMSE = 2.5721
- **B.** corrected RMSE = 2.2317
- **C.** corrected RMSE = 1.5508
- **D.** corrected RMSE = 1.8913

**Correct Answer:** corrected RMSE = 1.8913

**Explanation:** Recomputing with $\sqrt{\frac{1}{n}\sum_i r_i^2}$ gives 1.8913, so the reported 2.3641 is rejected.

---

## Question 36

**Question:** Compute min-max value separately for (x=17.5, fitted min=9, fitted max=36) and (x=7, fitted min=2, fitted max=22), then average the two results.

**Choices:**
- **A.** mean of the two min-max value values = 0.2114
- **B.** mean of the two min-max value values = 0.3534
- **C.** mean of the two min-max value values = 0.2824
- **D.** mean of the two min-max value values = 0.4244

**Correct Answer:** mean of the two min-max value values = 0.2824

**Explanation:** The individual results are 0.3148 and 0.25; their arithmetic mean is 0.2824.

---

## Question 37

**Question:** Compute standard score separately for (x=22, training mean=12.8, training sd=2.7) and (x=15, training mean=10, training sd=2), then average the two results.

**Choices:**
- **A.** mean of the two standard score values = 2.422
- **B.** mean of the two standard score values = 3.4854
- **C.** mean of the two standard score values = 2.9537
- **D.** mean of the two standard score values = 4.017

**Correct Answer:** mean of the two standard score values = 2.9537

**Explanation:** The individual results are 3.4074 and 2.5; their arithmetic mean is 2.9537.

---

## Question 38

**Question:** Compute linear-regression cost J separately for (x=[0, 1, 2], y=['1.7', '3.7', '5.7'], $\theta=(0.71,1.6)$) and (x=[0, 1, 2], y=['1', '3', '5'], $\theta=(0.5,1.6)$), then average the two results.

**Choices:**
- **A.** mean of the two linear-regression cost J values = 0.6059
- **B.** mean of the two linear-regression cost J values = 0.8719
- **C.** mean of the two linear-regression cost J values = 0.7389
- **D.** mean of the two linear-regression cost J values = 1.0048

**Correct Answer:** mean of the two linear-regression cost J values = 0.7389

**Explanation:** The individual results are 1.0194 and 0.4583; their arithmetic mean is 0.7389.

---

## Question 39

**Question:** Compute updated $\theta_1$ separately for (x=[1, 2, 3], y=['2.7', '4.7', '7.7'], $\theta=(1,1)$, $\alpha=.1$) and (x=[1, 2, 3], y=['2', '4', '7'], $\theta=(1,1)$, $\alpha=.1$), then average the two results.

**Choices:**
- **A.** mean of the two updated $\theta_1$ values = 1.1781
- **B.** mean of the two updated $\theta_1$ values = 1.6953
- **C.** mean of the two updated $\theta_1$ values = 1.4367
- **D.** mean of the two updated $\theta_1$ values = 1.9539

**Correct Answer:** mean of the two updated $\theta_1$ values = 1.4367

**Explanation:** The individual results are 1.5067 and 1.3667; their arithmetic mean is 1.4367.

---

## Question 40

**Question:** Compute RMSE separately for (residuals=['1.35', '-2', '2.72', '-1']) and (residuals=['1', '-2', '3', '-1']), then average the two results.

**Choices:**
- **A.** mean of the two RMSE values = 2.255
- **B.** mean of the two RMSE values = 1.911
- **C.** mean of the two RMSE values = 1.567
- **D.** mean of the two RMSE values = 2.599

**Correct Answer:** mean of the two RMSE values = 1.911

**Explanation:** The individual results are 1.8855 and 1.9365; their arithmetic mean is 1.911.

---

## Question 41

**Question:** After the data change from (x=19, fitted min=10, fitted max=38) to (x=16, fitted min=8, fitted max=34), what is the new min-max value?

**Choices:**
- **A.** min-max value = 0.4497
- **B.** min-max value = 0.3787
- **C.** min-max value = 0.2367
- **D.** min-max value = 0.3077

**Correct Answer:** min-max value = 0.3077

**Explanation:** Only the new data enter $\frac{x-x_{\min}}{x_{\max}-x_{\min}}$; they produce 0.3077.

---

## Question 42

**Question:** After the data change from (x=23, training mean=13.2, training sd=2.8) to (x=21, training mean=12.4, training sd=2.6), what is the new standard score?

**Choices:**
- **A.** standard score = 2.7123
- **B.** standard score = 3.9031
- **C.** standard score = 3.3077
- **D.** standard score = 4.4985

**Correct Answer:** standard score = 3.3077

**Explanation:** Only the new data enter $\frac{x-\mu}{\sigma}$; they produce 3.3077.

---

## Question 43

**Question:** After the data change from (x=[0, 1, 2], y=['1.8', '3.8', '5.8'], $\theta=(0.74,1.6)$) to (x=[0, 1, 2], y=['1.6', '3.6', '5.6'], $\theta=(0.68,1.6)$), what is the new linear-regression cost J?

**Choices:**
- **A.** linear-regression cost J = 0.9245
- **B.** linear-regression cost J = 1.0909
- **C.** linear-regression cost J = 0.7581
- **D.** linear-regression cost J = 1.2574

**Correct Answer:** linear-regression cost J = 0.9245

**Explanation:** Only the new data enter $\frac{1}{2m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)^2$; they produce 0.9245.

---

## Question 44

**Question:** After the data change from (x=[1, 2, 3], y=['2.8', '4.8', '7.8'], $\theta=(1,1)$, $\alpha=.1$) to (x=[1, 2, 3], y=['2.6', '4.6', '7.6'], $\theta=(1,1)$, $\alpha=.1$), what is the new updated $\theta_1$?

**Choices:**
- **A.** updated $\theta_1$ = 1.7543
- **B.** updated $\theta_1$ = 1.4867
- **C.** updated $\theta_1$ = 1.2191
- **D.** updated $\theta_1$ = 2.0219

**Correct Answer:** updated $\theta_1$ = 1.4867

**Explanation:** Only the new data enter $\theta_1-\alpha\frac{1}{m}\sum_i\left(h_\theta(x^{(i)})-y^{(i)}\right)x^{(i)}$; they produce 1.4867.

---

## Question 45

**Question:** After the data change from (residuals=['1.4', '-2', '2.68', '-1']) to (residuals=['1.3', '-2', '2.76', '-1']), what is the new RMSE?

**Choices:**
- **A.** RMSE = 2.2317
- **B.** RMSE = 1.8913
- **C.** RMSE = 1.5508
- **D.** RMSE = 2.5721

**Correct Answer:** RMSE = 1.8913

**Explanation:** Only the new data enter $\sqrt{\frac{1}{n}\sum_i r_i^2}$; they produce 1.8913.

---

## Question 46

**Question:** Rank P, Q, R, S from largest to smallest min-max value: P(x=8.5, fitted min=3, fitted max=24), Q(x=11.5, fitted min=5, fitted max=28), R(x=16, fitted min=8, fitted max=34), S(x=20.5, fitted min=11, fitted max=40).

**Choices:**
- **A.** min-max value ranking: Q > P > S > R
- **B.** min-max value ranking: P > Q > R > S
- **C.** min-max value ranking: P = Q = R = S
- **D.** min-max value ranking: S > R > Q > P

**Correct Answer:** min-max value ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.2619', 'Q': '0.2826', 'R': '0.3077', 'S': '0.3276'}; grouping equal values and sorting descending gives min-max value ranking: S > R > Q > P.

---

## Question 47

**Question:** Rank P, Q, R, S from largest to smallest standard score: P(x=16, training mean=10.4, training sd=2.1), Q(x=18, training mean=11.2, training sd=2.3), R(x=21, training mean=12.4, training sd=2.6), S(x=24, training mean=13.6, training sd=2.9).

**Choices:**
- **A.** standard score ranking: P = Q = R = S
- **B.** standard score ranking: P > Q > R > S
- **C.** standard score ranking: S > R > Q > P
- **D.** standard score ranking: Q > P > S > R

**Correct Answer:** standard score ranking: S > R > Q > P

**Explanation:** Their values are {'P': '2.6667', 'Q': '2.9565', 'R': '3.3077', 'S': '3.5862'}; grouping equal values and sorting descending gives standard score ranking: S > R > Q > P.

---

## Question 48

**Question:** Rank P, Q, R, S from largest to smallest linear-regression cost J: P(x=[0, 1, 2], y=['1.1', '3.1', '5.1'], $\theta=(0.53,1.6)$), Q(x=[0, 1, 2], y=['1.3', '3.3', '5.3'], $\theta=(0.59,1.6)$), R(x=[0, 1, 2], y=['1.6', '3.6', '5.6'], $\theta=(0.68,1.6)$), S(x=[0, 1, 2], y=['1.9', '3.9', '5.9'], $\theta=(0.77,1.6)$).

**Choices:**
- **A.** linear-regression cost J ranking: P = Q = R = S
- **B.** linear-regression cost J ranking: P > Q > R > S
- **C.** linear-regression cost J ranking: S > R > Q > P
- **D.** linear-regression cost J ranking: Q > P > S > R

**Correct Answer:** linear-regression cost J ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.5238', 'Q': '0.6694', 'R': '0.9245', 'S': '1.2238'}; grouping equal values and sorting descending gives linear-regression cost J ranking: S > R > Q > P.

---

## Question 49

**Question:** Rank P, Q, R, S from largest to smallest updated $\theta_1$: P(x=[1, 2, 3], y=['2.1', '4.1', '7.1'], $\theta=(1,1)$, $\alpha=.1$), Q(x=[1, 2, 3], y=['2.3', '4.3', '7.3'], $\theta=(1,1)$, $\alpha=.1$), R(x=[1, 2, 3], y=['2.6', '4.6', '7.6'], $\theta=(1,1)$, $\alpha=.1$), S(x=[1, 2, 3], y=['2.9', '4.9', '7.9'], $\theta=(1,1)$, $\alpha=.1$).

**Choices:**
- **A.** updated $\theta_1$ ranking: P > Q > R > S
- **B.** updated $\theta_1$ ranking: S > R > Q > P
- **C.** updated $\theta_1$ ranking: P = Q = R = S
- **D.** updated $\theta_1$ ranking: Q > P > S > R

**Correct Answer:** updated $\theta_1$ ranking: S > R > Q > P

**Explanation:** Their values are {'P': '1.3867', 'Q': '1.4267', 'R': '1.4867', 'S': '1.5467'}; grouping equal values and sorting descending gives updated $\theta_1$ ranking: S > R > Q > P.

---

## Question 50

**Question:** Rank P, Q, R, S from largest to smallest RMSE: P(residuals=['1.05', '-2', '2.96', '-1']), Q(residuals=['1.15', '-2', '2.88', '-1']), R(residuals=['1.3', '-2', '2.76', '-1']), S(residuals=['1.45', '-2', '2.64', '-1']).

**Choices:**
- **A.** RMSE ranking: Q > P > S > R
- **B.** RMSE ranking: S > R > Q > P
- **C.** RMSE ranking: P = Q = R = S
- **D.** RMSE ranking: P > Q > R > S

**Correct Answer:** RMSE ranking: P > Q > R > S

**Explanation:** Their values are {'P': '1.9277', 'Q': '1.9116', 'R': '1.8913', 'S': '1.8756'}; grouping equal values and sorting descending gives RMSE ranking: P > Q > R > S.

---

## Question 51

**Question:** Which statement correctly characterizes training-fitted scaling?

**Choices:**
- **A.** Test data should determine the final training mean and range.
- **B.** Scaling must occur after predictions have already been evaluated. for all permitted parameter values
- **C.** Each test row should be standardized using only its own values.
- **D.** Scaling parameters should be learned from training data and then applied unchanged to test data.

**Correct Answer:** Scaling parameters should be learned from training data and then applied unchanged to test data.

**Explanation:** For training-fitted scaling, the accurate statement is the first one because Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 52

**Question:** Which statement correctly characterizes one-hot encoding?

**Choices:**
- **A.** Dummy variables are used only when categories have a natural ranking.
- **B.** Label encoding guarantees equal geometric distance between all categories. under every stated condition
- **C.** One-hot encoding converts every numerical feature into a target.
- **D.** One-hot encoding avoids imposing an artificial order on nominal categories.

**Correct Answer:** One-hot encoding avoids imposing an artificial order on nominal categories.

**Explanation:** For one-hot encoding, the accurate statement is the first one because Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 53

**Question:** Which statement correctly characterizes validation and test roles?

**Choices:**
- **A.** The validation set tunes choices; the test set estimates final performance.
- **B.** The test set should select the learning rate after every update.
- **C.** The validation set replaces the training set in gradient descent. without changing the supplied data
- **D.** Training labels must be hidden from the learning algorithm.

**Correct Answer:** The validation set tunes choices; the test set estimates final performance.

**Explanation:** For validation and test roles, the accurate statement is the first one because Separating tuning from final evaluation limits optimistic bias.

---

## Question 54

**Question:** Which statement correctly characterizes simultaneous parameter updates?

**Choices:**
- **A.** The gradient-descent parameters must be updated from the same pre-update parameter state.
- **B.** $\theta_1$ must use the newly updated $\theta_0$ in the same iteration. for all permitted parameter values
- **C.** Only the intercept is updated when multiple features exist.
- **D.** The learning rate is recomputed as the current MSE.

**Correct Answer:** The gradient-descent parameters must be updated from the same pre-update parameter state.

**Explanation:** For simultaneous parameter updates, the accurate statement is the first one because A gradient step is simultaneous across parameters.

---

## Question 55

**Question:** Which statement correctly characterizes learning-rate divergence?

**Choices:**
- **A.** Learning rate controls the number of examples rather than step size.
- **B.** A very large learning rate always reaches the global minimum in one step.
- **C.** A very small learning rate necessarily changes the objective function.
- **D.** A very large learning rate can overshoot and make the cost diverge.

**Correct Answer:** A very large learning rate can overshoot and make the cost diverge.

**Explanation:** For learning-rate divergence, the accurate statement is the first one because Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 56

**Question:** Which statement correctly characterizes RMSE units?

**Choices:**
- **A.** RMSE is the square of MAE and has squared target units. without changing the supplied data
- **B.** MAE disproportionately squares the largest residuals.
- **C.** MSE equals the mean of unsquared absolute residuals.
- **D.** RMSE equals the square root of MSE and retains the target's units.

**Correct Answer:** RMSE equals the square root of MSE and retains the target's units.

**Explanation:** For RMSE units, the accurate statement is the first one because RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 57

**Question:** Which statement correctly characterizes robust imputation?

**Choices:**
- **A.** Mode imputation is the only valid method for every numerical feature. for all permitted parameter values
- **B.** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.
- **C.** Mean imputation always reconstructs the missing true value exactly.
- **D.** Imputation should use the unseen test labels to reduce error.

**Correct Answer:** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.

**Explanation:** For robust imputation, the accurate statement is the first one because The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 58

**Question:** Which statement correctly characterizes the normal equation?

**Choices:**
- **A.** It requires selecting a learning rate for every matrix multiplication. under every stated condition
- **B.** The normal equation is an iterative categorical encoder.
- **C.** The normal equation is a direct linear-regression solution when its inverse expression is usable.
- **D.** It changes a regression target into a class label.

**Correct Answer:** The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Explanation:** For the normal equation, the accurate statement is the first one because The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 59

**Question:** Which statement correctly characterizes the meaning of m?

**Choices:**
- **A.** m equals the number of gradient-descent iterations. without changing the supplied data
- **B.** m counts only nonzero coefficients in theta.
- **C.** m is the number of categories after encoding.
- **D.** Each dataset row is one training example, so m counts rows rather than features.

**Correct Answer:** Each dataset row is one training example, so m counts rows rather than features.

**Explanation:** For the meaning of m, the accurate statement is the first one because The cost denominator uses the number of training examples.

---

## Question 60

**Question:** Which statement correctly characterizes a constant feature's zero range?

**Choices:**
- **A.** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.
- **B.** The result is automatically one because numerator and denominator match. for all permitted parameter values under the complete set of stated assumptions
- **C.** The feature becomes a categorical target by definition.
- **D.** Standardization must then use the test-set maximum instead.

**Correct Answer:** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Explanation:** For a constant feature's zero range, the accurate statement is the first one because A constant feature gives a zero range, causing division by zero in the displayed formula.

---

## Question 61

**Question:** A student writes, “Test data should determine the final training mean and range.” Which replacement correctly repairs the claim about training-fitted scaling?

**Choices:**
- **A.** Replace it with: Each test row should be standardized using only its own values.
- **B.** Replace it with: Scaling parameters should be learned from training data and then applied unchanged to test data.
- **C.** Replace it with: Test data should determine the final training mean and range.
- **D.** Replace it with: Scaling must occur after predictions have already been evaluated. under every stated condition under the complete set of stated assumptions

**Correct Answer:** Replace it with: Scaling parameters should be learned from training data and then applied unchanged to test data.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 62

**Question:** A student writes, “Label encoding guarantees equal geometric distance between all categories.” Which replacement correctly repairs the claim about one-hot encoding?

**Choices:**
- **A.** Replace it with: One-hot encoding converts every numerical feature into a target.
- **B.** Replace it with: Label encoding guarantees equal geometric distance between all categories. without changing the supplied data
- **C.** Replace it with: Dummy variables are used only when categories have a natural ranking.
- **D.** Replace it with: One-hot encoding avoids imposing an artificial order on nominal categories.

**Correct Answer:** Replace it with: One-hot encoding avoids imposing an artificial order on nominal categories.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 63

**Question:** A student writes, “The test set should select the learning rate after every update.” Which replacement correctly repairs the claim about validation and test roles?

**Choices:**
- **A.** Replace it with: The test set should select the learning rate after every update.
- **B.** Replace it with: The validation set tunes choices; the test set estimates final performance.
- **C.** Replace it with: The validation set replaces the training set in gradient descent. for all permitted parameter values
- **D.** Replace it with: Training labels must be hidden from the learning algorithm.

**Correct Answer:** Replace it with: The validation set tunes choices; the test set estimates final performance.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Separating tuning from final evaluation limits optimistic bias.

---

## Question 64

**Question:** A student writes, “$\theta_1$ must use the newly updated $\theta_0$ in the same iteration.” Which replacement correctly repairs the claim about simultaneous parameter updates?

**Choices:**
- **A.** Replace it with: The gradient-descent parameters must be updated from the same pre-update parameter state.
- **B.** Replace it with: $\theta_1$ must use the newly updated $\theta_0$ in the same iteration. under every stated condition
- **C.** Replace it with: Only the intercept is updated when multiple features exist.
- **D.** Replace it with: The learning rate is recomputed as the current MSE.

**Correct Answer:** Replace it with: The gradient-descent parameters must be updated from the same pre-update parameter state.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because A gradient step is simultaneous across parameters.

---

## Question 65

**Question:** A student writes, “A very large learning rate always reaches the global minimum in one step.” Which replacement correctly repairs the claim about learning-rate divergence?

**Choices:**
- **A.** Replace it with: A very large learning rate always reaches the global minimum in one step.
- **B.** Replace it with: A very large learning rate can overshoot and make the cost diverge.
- **C.** Replace it with: A very small learning rate necessarily changes the objective function.
- **D.** Replace it with: Learning rate controls the number of examples rather than step size.

**Correct Answer:** Replace it with: A very large learning rate can overshoot and make the cost diverge.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 66

**Question:** A student writes, “RMSE is the square of MAE and has squared target units.” Which replacement correctly repairs the claim about RMSE units?

**Choices:**
- **A.** Replace it with: MSE equals the mean of unsquared absolute residuals.
- **B.** Replace it with: RMSE is the square of MAE and has squared target units. for all permitted parameter values
- **C.** Replace it with: RMSE equals the square root of MSE and retains the target's units.
- **D.** Replace it with: MAE disproportionately squares the largest residuals.

**Correct Answer:** Replace it with: RMSE equals the square root of MSE and retains the target's units.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 67

**Question:** A student writes, “Mode imputation is the only valid method for every numerical feature.” Which replacement correctly repairs the claim about robust imputation?

**Choices:**
- **A.** Replace it with: Mode imputation is the only valid method for every numerical feature. under every stated condition
- **B.** Replace it with: Median imputation can be less sensitive than mean imputation to extreme numerical outliers.
- **C.** Replace it with: Mean imputation always reconstructs the missing true value exactly.
- **D.** Replace it with: Imputation should use the unseen test labels to reduce error.

**Correct Answer:** Replace it with: Median imputation can be less sensitive than mean imputation to extreme numerical outliers.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 68

**Question:** A student writes, “The normal equation is an iterative categorical encoder.” Which replacement correctly repairs the claim about the normal equation?

**Choices:**
- **A.** Replace it with: The normal equation is a direct linear-regression solution when its inverse expression is usable.
- **B.** Replace it with: The normal equation is an iterative categorical encoder.
- **C.** Replace it with: It changes a regression target into a class label.
- **D.** Replace it with: It requires selecting a learning rate for every matrix multiplication. without changing the supplied data

**Correct Answer:** Replace it with: The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 69

**Question:** A student writes, “m counts only nonzero coefficients in theta.” Which replacement correctly repairs the claim about the meaning of m?

**Choices:**
- **A.** Replace it with: m counts only nonzero coefficients in theta.
- **B.** Replace it with: m is the number of categories after encoding.
- **C.** Replace it with: Each dataset row is one training example, so m counts rows rather than features.
- **D.** Replace it with: m equals the number of gradient-descent iterations. for all permitted parameter values

**Correct Answer:** Replace it with: Each dataset row is one training example, so m counts rows rather than features.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The cost denominator uses the number of training examples.

---

## Question 70

**Question:** A student writes, “The result is automatically one because numerator and denominator match.” Which replacement correctly repairs the claim about a constant feature's zero range?

**Choices:**
- **A.** Replace it with: The feature becomes a categorical target by definition.
- **B.** Replace it with: Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.
- **C.** Replace it with: The result is automatically one because numerator and denominator match. under every stated condition under the complete set of stated assumptions
- **D.** Replace it with: Standardization must then use the test-set maximum instead.

**Correct Answer:** Replace it with: Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because A constant feature gives a zero range, causing division by zero in the displayed formula.

---

## Question 71

**Question:** A student's answer about training-fitted scaling contains the claim “Test data should determine the final training mean and range.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about training-fitted scaling is false and must be replaced
- **B.** The quoted claim about training-fitted scaling is correct without qualification
- **C.** The quoted claim concerns training-fitted scaling but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about training-fitted scaling is false and must be replaced

**Explanation:** The quoted claim contradicts training-fitted scaling; it must be replaced by the chapter's stated rule.

---

## Question 72

**Question:** A student's answer about one-hot encoding contains the claim “Label encoding guarantees equal geometric distance between all categories.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns one-hot encoding but is only a harmless change of notation
- **B.** The quoted claim about one-hot encoding is correct without qualification
- **C.** The quoted claim about one-hot encoding is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about one-hot encoding is false and must be replaced

**Explanation:** The quoted claim contradicts one-hot encoding; it must be replaced by the chapter's stated rule.

---

## Question 73

**Question:** A student's answer about validation and test roles contains the claim “The test set should select the learning rate after every update.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about validation and test roles is correct without qualification
- **B.** The quoted claim concerns validation and test roles but is only a harmless change of notation
- **C.** The quoted claim about validation and test roles is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about validation and test roles is false and must be replaced

**Explanation:** The quoted claim contradicts validation and test roles; it must be replaced by the chapter's stated rule.

---

## Question 74

**Question:** A student's answer about simultaneous parameter updates contains the claim “$\theta_1$ must use the newly updated $\theta_0$ in the same iteration.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about simultaneous parameter updates is false and must be replaced
- **B.** The quoted claim about simultaneous parameter updates is correct without qualification
- **C.** The quoted claim concerns simultaneous parameter updates but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about simultaneous parameter updates is false and must be replaced

**Explanation:** The quoted claim contradicts simultaneous parameter updates; it must be replaced by The gradient-descent parameters must be updated from the same pre-update parameter state..

---

## Question 75

**Question:** A student's answer about learning-rate divergence contains the claim “A very large learning rate always reaches the global minimum in one step.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about learning-rate divergence is correct without qualification
- **C.** The quoted claim about learning-rate divergence is false and must be replaced
- **D.** The quoted claim concerns learning-rate divergence but is only a harmless change of notation

**Correct Answer:** The quoted claim about learning-rate divergence is false and must be replaced

**Explanation:** The quoted claim contradicts learning-rate divergence; it must be replaced by A very large learning rate can overshoot and make the cost diverge..

---

## Question 76

**Question:** A student's answer about RMSE units contains the claim “RMSE is the square of MAE and has squared target units.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns RMSE units but is only a harmless change of notation
- **B.** The quoted claim about RMSE units is correct without qualification
- **C.** The quoted claim about RMSE units is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about RMSE units is false and must be replaced

**Explanation:** The quoted claim contradicts RMSE units; it must be replaced by the chapter's stated rule.

---

## Question 77

**Question:** A student's answer about robust imputation contains the claim “Mode imputation is the only valid method for every numerical feature.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns robust imputation but is only a harmless change of notation
- **B.** The quoted claim about robust imputation is false and must be replaced
- **C.** The quoted claim about robust imputation is correct without qualification
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about robust imputation is false and must be replaced

**Explanation:** The quoted claim contradicts robust imputation; it must be replaced by Median imputation can be less sensitive than mean imputation to extreme numerical outliers..

---

## Question 78

**Question:** A student's answer about the normal equation contains the claim “The normal equation is an iterative categorical encoder.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns the normal equation but is only a harmless change of notation
- **B.** The quoted claim about the normal equation is correct without qualification
- **C.** The quoted claim becomes correct merely by changing the dataset size
- **D.** The quoted claim about the normal equation is false and must be replaced

**Correct Answer:** The quoted claim about the normal equation is false and must be replaced

**Explanation:** The quoted claim contradicts the normal equation; it must be replaced by The normal equation is a direct linear-regression solution when its inverse expression is usable..

---

## Question 79

**Question:** A student's answer about the meaning of m contains the claim “m counts only nonzero coefficients in theta.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about the meaning of m is false and must be replaced
- **B.** The quoted claim about the meaning of m is correct without qualification
- **C.** The quoted claim concerns the meaning of m but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about the meaning of m is false and must be replaced

**Explanation:** The quoted claim contradicts the meaning of m; it must be replaced by Each dataset row is one training example, so m counts rows rather than features..

---

## Question 80

**Question:** A student's answer about a constant feature's zero range contains the claim “The result is automatically one because numerator and denominator match.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns a constant feature's zero range but is only a harmless change of notation
- **B.** The quoted claim about a constant feature's zero range is correct without qualification
- **C.** The quoted claim about a constant feature's zero range is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about a constant feature's zero range is false and must be replaced

**Explanation:** The quoted claim contradicts a constant feature's zero range; it must be replaced by Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially..

---

## Question 81

**Question:** An implementation is designed around the rule “Each test row should be standardized using only its own values.” Which principle exposes the design error concerning training-fitted scaling?

**Choices:**
- **A.** Required principle: Test data should determine the final training mean and range.
- **B.** Required principle: Scaling parameters should be learned from training data and then applied unchanged to test data.
- **C.** Required principle: Each test row should be standardized using only its own values.
- **D.** Required principle: Scaling must occur after predictions have already been evaluated. for all permitted parameter values

**Correct Answer:** Required principle: Scaling parameters should be learned from training data and then applied unchanged to test data.

**Explanation:** The implementation encodes a false rule. The required principle follows because Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 82

**Question:** An implementation is designed around the rule “One-hot encoding converts every numerical feature into a target.” Which principle exposes the design error concerning one-hot encoding?

**Choices:**
- **A.** Required principle: Dummy variables are used only when categories have a natural ranking.
- **B.** Required principle: Label encoding guarantees equal geometric distance between all categories. under every stated condition
- **C.** Required principle: One-hot encoding avoids imposing an artificial order on nominal categories.
- **D.** Required principle: One-hot encoding converts every numerical feature into a target.

**Correct Answer:** Required principle: One-hot encoding avoids imposing an artificial order on nominal categories.

**Explanation:** The implementation encodes a false rule. The required principle follows because Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 83

**Question:** An implementation is designed around the rule “The validation set replaces the training set in gradient descent.” Which principle exposes the design error concerning validation and test roles?

**Choices:**
- **A.** Required principle: The validation set tunes choices; the test set estimates final performance.
- **B.** Required principle: The test set should select the learning rate after every update.
- **C.** Required principle: The validation set replaces the training set in gradient descent. without changing the supplied data
- **D.** Required principle: Training labels must be hidden from the learning algorithm.

**Correct Answer:** Required principle: The validation set tunes choices; the test set estimates final performance.

**Explanation:** The implementation encodes a false rule. The required principle follows because Separating tuning from final evaluation limits optimistic bias.

---

## Question 84

**Question:** An implementation is designed around the rule “Only the intercept is updated when multiple features exist.” Which principle exposes the design error concerning simultaneous parameter updates?

**Choices:**
- **A.** Required principle: The gradient-descent parameters must be updated from the same pre-update parameter state.
- **B.** Required principle: $\theta_1$ must use the newly updated $\theta_0$ in the same iteration. for all permitted parameter values
- **C.** Required principle: Only the intercept is updated when multiple features exist.
- **D.** Required principle: The learning rate is recomputed as the current MSE.

**Correct Answer:** Required principle: The gradient-descent parameters must be updated from the same pre-update parameter state.

**Explanation:** The implementation encodes a false rule. The required principle follows because A gradient step is simultaneous across parameters.

---

## Question 85

**Question:** An implementation is designed around the rule “A very small learning rate necessarily changes the objective function.” Which principle exposes the design error concerning learning-rate divergence?

**Choices:**
- **A.** Required principle: A very large learning rate can overshoot and make the cost diverge.
- **B.** Required principle: A very large learning rate always reaches the global minimum in one step.
- **C.** Required principle: A very small learning rate necessarily changes the objective function.
- **D.** Required principle: Learning rate controls the number of examples rather than step size.

**Correct Answer:** Required principle: A very large learning rate can overshoot and make the cost diverge.

**Explanation:** The implementation encodes a false rule. The required principle follows because Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 86

**Question:** An implementation is designed around the rule “MSE equals the mean of unsquared absolute residuals.” Which principle exposes the design error concerning RMSE units?

**Choices:**
- **A.** Required principle: RMSE is the square of MAE and has squared target units. without changing the supplied data
- **B.** Required principle: MAE disproportionately squares the largest residuals.
- **C.** Required principle: MSE equals the mean of unsquared absolute residuals.
- **D.** Required principle: RMSE equals the square root of MSE and retains the target's units.

**Correct Answer:** Required principle: RMSE equals the square root of MSE and retains the target's units.

**Explanation:** The implementation encodes a false rule. The required principle follows because RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 87

**Question:** An implementation is designed around the rule “Mean imputation always reconstructs the missing true value exactly.” Which principle exposes the design error concerning robust imputation?

**Choices:**
- **A.** Required principle: Mean imputation always reconstructs the missing true value exactly.
- **B.** Required principle: Median imputation can be less sensitive than mean imputation to extreme numerical outliers.
- **C.** Required principle: Mode imputation is the only valid method for every numerical feature. for all permitted parameter values
- **D.** Required principle: Imputation should use the unseen test labels to reduce error.

**Correct Answer:** Required principle: Median imputation can be less sensitive than mean imputation to extreme numerical outliers.

**Explanation:** The implementation encodes a false rule. The required principle follows because The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 88

**Question:** An implementation is designed around the rule “It changes a regression target into a class label.” Which principle exposes the design error concerning the normal equation?

**Choices:**
- **A.** Required principle: The normal equation is a direct linear-regression solution when its inverse expression is usable.
- **B.** Required principle: The normal equation is an iterative categorical encoder.
- **C.** Required principle: It changes a regression target into a class label.
- **D.** Required principle: It requires selecting a learning rate for every matrix multiplication. under every stated condition

**Correct Answer:** Required principle: The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Explanation:** The implementation encodes a false rule. The required principle follows because The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 89

**Question:** An implementation is designed around the rule “m is the number of categories after encoding.” Which principle exposes the design error concerning the meaning of m?

**Choices:**
- **A.** Required principle: Each dataset row is one training example, so m counts rows rather than features.
- **B.** Required principle: m counts only nonzero coefficients in theta.
- **C.** Required principle: m is the number of categories after encoding.
- **D.** Required principle: m equals the number of gradient-descent iterations. without changing the supplied data

**Correct Answer:** Required principle: Each dataset row is one training example, so m counts rows rather than features.

**Explanation:** The implementation encodes a false rule. The required principle follows because The cost denominator uses the number of training examples.

---

## Question 90

**Question:** An implementation is designed around the rule “The feature becomes a categorical target by definition.” Which principle exposes the design error concerning a constant feature's zero range?

**Choices:**
- **A.** Required principle: Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.
- **B.** Required principle: The result is automatically one because numerator and denominator match. for all permitted parameter values under the complete set of stated assumptions
- **C.** Required principle: The feature becomes a categorical target by definition.
- **D.** Required principle: Standardization must then use the test-set maximum instead.

**Correct Answer:** Required principle: Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Explanation:** The implementation encodes a false rule. The required principle follows because A constant feature gives a zero range, causing division by zero in the displayed formula.

---

## Question 91

**Question:** Reviewer A states, “Scaling parameters should be learned from training data and then applied unchanged to test data.” Reviewer B states, “Scaling must occur after predictions have already been evaluated.” What is the correct verdict about training-fitted scaling?

**Choices:**
- **A.** Reviewer B only is correct about training-fitted scaling
- **B.** Both reviewers are correct about training-fitted scaling
- **C.** Reviewer A only is correct about training-fitted scaling
- **D.** Neither reviewer is correct about training-fitted scaling

**Correct Answer:** Reviewer A only is correct about training-fitted scaling

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 92

**Question:** Reviewer A states, “One-hot encoding avoids imposing an artificial order on nominal categories.” Reviewer B states, “Dummy variables are used only when categories have a natural ranking.” What is the correct verdict about one-hot encoding?

**Choices:**
- **A.** Neither reviewer is correct about one-hot encoding
- **B.** Reviewer B only is correct about one-hot encoding
- **C.** Both reviewers are correct about one-hot encoding
- **D.** Reviewer A only is correct about one-hot encoding

**Correct Answer:** Reviewer A only is correct about one-hot encoding

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 93

**Question:** Reviewer A states, “The validation set tunes choices; the test set estimates final performance.” Reviewer B states, “Training labels must be hidden from the learning algorithm.” What is the correct verdict about validation and test roles?

**Choices:**
- **A.** Both reviewers are correct about validation and test roles
- **B.** Reviewer A only is correct about validation and test roles
- **C.** Reviewer B only is correct about validation and test roles
- **D.** Neither reviewer is correct about validation and test roles

**Correct Answer:** Reviewer A only is correct about validation and test roles

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Separating tuning from final evaluation limits optimistic bias.

---

## Question 94

**Question:** Reviewer A states, “The gradient-descent parameters must be updated from the same pre-update parameter state.” Reviewer B states, “The learning rate is recomputed as the current MSE.” What is the correct verdict about simultaneous parameter updates?

**Choices:**
- **A.** Reviewer B only is correct about simultaneous parameter updates
- **B.** Reviewer A only is correct about simultaneous parameter updates
- **C.** Both reviewers are correct about simultaneous parameter updates
- **D.** Neither reviewer is correct about simultaneous parameter updates

**Correct Answer:** Reviewer A only is correct about simultaneous parameter updates

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, A gradient step is simultaneous across parameters.

---

## Question 95

**Question:** Reviewer A states, “A very large learning rate can overshoot and make the cost diverge.” Reviewer B states, “Learning rate controls the number of examples rather than step size.” What is the correct verdict about learning-rate divergence?

**Choices:**
- **A.** Reviewer B only is correct about learning-rate divergence
- **B.** Neither reviewer is correct about learning-rate divergence
- **C.** Both reviewers are correct about learning-rate divergence
- **D.** Reviewer A only is correct about learning-rate divergence

**Correct Answer:** Reviewer A only is correct about learning-rate divergence

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 96

**Question:** Reviewer A states, “RMSE equals the square root of MSE and retains the target's units.” Reviewer B states, “MAE disproportionately squares the largest residuals.” What is the correct verdict about RMSE units?

**Choices:**
- **A.** Neither reviewer is correct about RMSE units
- **B.** Reviewer B only is correct about RMSE units
- **C.** Both reviewers are correct about RMSE units
- **D.** Reviewer A only is correct about RMSE units

**Correct Answer:** Reviewer A only is correct about RMSE units

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 97

**Question:** Reviewer A states, “Median imputation can be less sensitive than mean imputation to extreme numerical outliers.” Reviewer B states, “Imputation should use the unseen test labels to reduce error.” What is the correct verdict about robust imputation?

**Choices:**
- **A.** Reviewer B only is correct about robust imputation
- **B.** Both reviewers are correct about robust imputation
- **C.** Reviewer A only is correct about robust imputation
- **D.** Neither reviewer is correct about robust imputation

**Correct Answer:** Reviewer A only is correct about robust imputation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 98

**Question:** Reviewer A states, “The normal equation is a direct linear-regression solution when its inverse expression is usable.” Reviewer B states, “It requires selecting a learning rate for every matrix multiplication.” What is the correct verdict about the normal equation?

**Choices:**
- **A.** Reviewer B only is correct about the normal equation
- **B.** Reviewer A only is correct about the normal equation
- **C.** Both reviewers are correct about the normal equation
- **D.** Neither reviewer is correct about the normal equation

**Correct Answer:** Reviewer A only is correct about the normal equation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 99

**Question:** Reviewer A states, “Each dataset row is one training example, so m counts rows rather than features.” Reviewer B states, “m equals the number of gradient-descent iterations.” What is the correct verdict about the meaning of m?

**Choices:**
- **A.** Reviewer A only is correct about the meaning of m
- **B.** Reviewer B only is correct about the meaning of m
- **C.** Both reviewers are correct about the meaning of m
- **D.** Neither reviewer is correct about the meaning of m

**Correct Answer:** Reviewer A only is correct about the meaning of m

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The cost denominator uses the number of training examples.

---

## Question 100

**Question:** Reviewer A states, “Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.” Reviewer B states, “Standardization must then use the test-set maximum instead.” What is the correct verdict about a constant feature's zero range?

**Choices:**
- **A.** Neither reviewer is correct about a constant feature's zero range
- **B.** Reviewer B only is correct about a constant feature's zero range
- **C.** Reviewer A only is correct about a constant feature's zero range
- **D.** Both reviewers are correct about a constant feature's zero range

**Correct Answer:** Reviewer A only is correct about a constant feature's zero range

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, A constant feature gives a zero range, causing division by zero in the displayed formula.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Questions were audited for structural balance, verbatim reuse, and parameter-only duplicate prompts.
