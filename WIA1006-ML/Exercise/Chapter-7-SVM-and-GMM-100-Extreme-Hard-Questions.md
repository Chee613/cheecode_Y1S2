# Chapter 7: SVM and GMM: 100 Extreme-Hard Questions

> Topics: margins, constraints, dual coefficients, kernels, hyperparameters, Gaussian mixtures, and soft clustering. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** Using w=['2', '-1'], x=['1', '2'], $b=-0.5$, compute the hyperplane distance.

**Choices:**
- **A.** hyperplane distance = 0.3656
- **B.** hyperplane distance = 0.2946
- **C.** hyperplane distance = 0.1526
- **D.** hyperplane distance = 0.2236

**Correct Answer:** hyperplane distance = 0.2236

**Explanation:** Apply $\frac{|w^\top x+b|}{\lVert w\rVert}$; substitution gives hyperplane distance=0.2236.

---

## Question 2

**Question:** Using label y=1, score=1.1, compute the functional margin.

**Choices:**
- **A.** functional margin = 0.902
- **B.** functional margin = 1.298
- **C.** functional margin = 1.1
- **D.** functional margin = 1.496

**Correct Answer:** functional margin = 1.1

**Explanation:** Apply $y_i(w^\top x_i+b)$; substitution gives functional margin=1.1.

---

## Question 3

**Question:** Using $\alpha=[0.5, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]], compute the first component of w.

**Choices:**
- **A.** first component of w = 1.066
- **B.** first component of w = 1.534
- **C.** first component of w = 1.3
- **D.** first component of w = 1.768

**Correct Answer:** first component of w = 1.3

**Explanation:** Apply $\sum_i\alpha_i y_i x_{i,1}$; substitution gives first component of w=1.3.

---

## Question 4

**Question:** Using squared distance=1, $\sigma^2=0.5$, compute the RBF kernel value.

**Choices:**
- **A.** RBF kernel value = 0.4389
- **B.** RBF kernel value = 0.3679
- **C.** RBF kernel value = 0.2969
- **D.** RBF kernel value = 0.5099

**Correct Answer:** RBF kernel value = 0.3679

**Explanation:** Apply $\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)$; substitution gives RBF kernel value=0.3679.

---

## Question 5

**Question:** Using x=-1, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2], compute the GMM mixture density.

**Choices:**
- **A.** GMM mixture density = 0.3194
- **B.** GMM mixture density = 0.2484
- **C.** GMM mixture density = 0.1064
- **D.** GMM mixture density = 0.1774

**Correct Answer:** GMM mixture density = 0.1774

**Explanation:** Apply $\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)$; substitution gives GMM mixture density=0.1774.

---

## Question 6

**Question:** Compare the hyperplane distance for Case P (w=['2.1', '-1'], x=['1', '1.95'], $b=-0.5$) and Case Q (w=['2.4', '-1'], x=['1', '1.8'], $b=-0.5$).

**Choices:**
- **A.** The first case is larger: 0.1505 versus 0.0385
- **B.** The second case is larger: 0.0385 versus 0.1505
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 0.1505 versus 0.0385

**Explanation:** The same formula gives 0.1505 for P and 0.0385 for Q, establishing the stated comparison.

---

## Question 7

**Question:** Compare the functional margin for Case P (label y=-1, score=-1.18) and Case Q (label y=1, score=1.42).

**Choices:**
- **A.** The first case is larger: 1.18 versus 1.42 under the complete set of stated assumptions
- **B.** The second case is larger: 1.42 versus 1.18
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 1.42 versus 1.18

**Explanation:** The same formula gives 1.18 for P and 1.42 for Q, establishing the stated comparison.

---

## Question 8

**Question:** Compare the first component of w for Case P ($\alpha=[0.53, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]) and Case Q ($\alpha=[0.62, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 1.36 versus 1.54 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 1.54 versus 1.36

**Correct Answer:** The second case is larger: 1.54 versus 1.36

**Explanation:** The same formula gives 1.36 for P and 1.54 for Q, establishing the stated comparison.

---

## Question 9

**Question:** Compare the RBF kernel value for Case P (squared distance=1.4, $\sigma^2=0.7$) and Case Q (squared distance=2.6, $\sigma^2=0.5$).

**Choices:**
- **A.** The second case is larger: 0.0743 versus 0.3679
- **B.** The first case is larger: 0.3679 versus 0.0743
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 0.3679 versus 0.0743

**Explanation:** The same formula gives 0.3679 for P and 0.0743 for Q, establishing the stated comparison.

---

## Question 10

**Question:** Compare the GMM mixture density for Case P (x=-0.8, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]) and Case Q (x=-0.2, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]).

**Choices:**
- **A.** The second case is larger: 0.1663 versus 0.1803
- **B.** The first case is larger: 0.1803 versus 0.1663
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 0.1803 versus 0.1663

**Explanation:** The same formula gives 0.1803 for P and 0.1663 for Q, establishing the stated comparison.

---

## Question 11

**Question:** How far apart are the hyperplane distance values for (w=['2.2', '-1'], x=['1', '1.9'], $b=-0.5$) and (w=['2.8', '-1'], x=['1', '1.6'], $b=-0.5$)?

**Choices:**
- **A.** absolute hyperplane distance difference = 0.2237
- **B.** absolute hyperplane distance difference = 0.1527
- **C.** absolute hyperplane distance difference = 0.0817
- **D.** absolute hyperplane distance difference = 0.2947

**Correct Answer:** absolute hyperplane distance difference = 0.1527

**Explanation:** The two values are 0.0828 and 0.2354; their absolute difference is 0.1527.

---

## Question 12

**Question:** How far apart are the functional margin values for (label y=1, score=1.26) and (label y=1, score=1.74)?

**Choices:**
- **A.** absolute functional margin difference = 0.3936
- **B.** absolute functional margin difference = 0.5664
- **C.** absolute functional margin difference = 0.48
- **D.** absolute functional margin difference = 0.6528

**Correct Answer:** absolute functional margin difference = 0.48

**Explanation:** The two values are 1.26 and 1.74; their absolute difference is 0.48.

---

## Question 13

**Question:** How far apart are the first component of w values for ($\alpha=[0.56, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]) and ($\alpha=[0.74, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]])?

**Choices:**
- **A.** absolute first component of w difference = 0.36
- **B.** absolute first component of w difference = 0.431
- **C.** absolute first component of w difference = 0.289
- **D.** absolute first component of w difference = 0.502

**Correct Answer:** absolute first component of w difference = 0.36

**Explanation:** The two values are 1.42 and 1.78; their absolute difference is 0.36.

---

## Question 14

**Question:** How far apart are the RBF kernel value values for (squared distance=1.8, $\sigma^2=0.9$) and (squared distance=4.2, $\sigma^2=0.5$)?

**Choices:**
- **A.** absolute RBF kernel value difference = 0.2819
- **B.** absolute RBF kernel value difference = 0.4239
- **C.** absolute RBF kernel value difference = 0.3529
- **D.** absolute RBF kernel value difference = 0.4949

**Correct Answer:** absolute RBF kernel value difference = 0.3529

**Explanation:** The two values are 0.3679 and 0.015; their absolute difference is 0.3529.

---

## Question 15

**Question:** How far apart are the GMM mixture density values for (x=-0.6, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]) and (x=0.6, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2])?

**Choices:**
- **A.** absolute GMM mixture density difference = 0.1015
- **B.** absolute GMM mixture density difference = 0.0305
- **C.** absolute GMM mixture density difference = -0.0405
- **D.** absolute GMM mixture density difference = 0.1725

**Correct Answer:** absolute GMM mixture density difference = 0.0305

**Explanation:** The two values are 0.1785 and 0.1481; their absolute difference is 0.0305.

---

## Question 16

**Question:** Taking (w=['2.3', '-1'], x=['1', '1.85'], $b=-0.5$) as baseline and (w=['2.1', '-1'], x=['1', '1.95'], $b=-0.5$) as the new case, what is the percentage change in hyperplane distance?

**Choices:**
- **A.** percentage change in hyperplane distance = 536.9258
- **B.** percentage change in hyperplane distance = 772.6493
- **C.** percentage change in hyperplane distance = 654.7876
- **D.** percentage change in hyperplane distance = 890.5111

**Correct Answer:** percentage change in hyperplane distance = 654.7876

**Explanation:** The values change from 0.0199 to 0.1505; (new-old)/|old|*100=654.7876%.

---

## Question 17

**Question:** Taking (label y=-1, score=-1.34) as baseline and (label y=-1, score=-1.18) as the new case, what is the percentage change in functional margin?

**Choices:**
- **A.** percentage change in functional margin = -11.9403
- **B.** percentage change in functional margin = -9.791
- **C.** percentage change in functional margin = -14.0896
- **D.** percentage change in functional margin = -7.6418

**Correct Answer:** percentage change in functional margin = -11.9403

**Explanation:** The values change from 1.34 to 1.18; (new-old)/|old|*100=-11.9403%.

---

## Question 18

**Question:** Taking ($\alpha=[0.59, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]) as baseline and ($\alpha=[0.53, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]) as the new case, what is the percentage change in first component of w?

**Choices:**
- **A.** percentage change in first component of w = -9.5676
- **B.** percentage change in first component of w = -6.6486
- **C.** percentage change in first component of w = -8.1081
- **D.** percentage change in first component of w = -5.1892

**Correct Answer:** percentage change in first component of w = -8.1081

**Explanation:** The values change from 1.48 to 1.36; (new-old)/|old|*100=-8.1081%.

---

## Question 19

**Question:** Taking (squared distance=2.2, $\sigma^2=1.1$) as baseline and (squared distance=1.4, $\sigma^2=0.7$) as the new case, what is the percentage change in RBF kernel value?

**Choices:**
- **A.** percentage change in RBF kernel value = 0.142
- **B.** percentage change in RBF kernel value = 0.071
- **C.** percentage change in RBF kernel value = -0.071
- **D.** percentage change in RBF kernel value = 0

**Correct Answer:** percentage change in RBF kernel value = 0

**Explanation:** The values change from 0.3679 to 0.3679; (new-old)/|old|*100=0%.

---

## Question 20

**Question:** Taking (x=-0.4, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]) as baseline and (x=-0.8, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]) as the new case, what is the percentage change in GMM mixture density?

**Choices:**
- **A.** percentage change in GMM mixture density = 5.386
- **B.** percentage change in GMM mixture density = 4.6732
- **C.** percentage change in GMM mixture density = 3.2475
- **D.** percentage change in GMM mixture density = 3.9603

**Correct Answer:** percentage change in GMM mixture density = 3.9603

**Explanation:** The values change from 0.1734 to 0.1803; (new-old)/|old|*100=3.9603%.

---

## Question 21

**Question:** Which formula must be applied to obtain hyperplane distance from the supplied chapter quantities?

**Choices:**
- **A.** For hyperplane distance, use $\sqrt{\frac{|w^\top x+b|}{\lVert w\rVert}}$
- **B.** For hyperplane distance, use $1-\left(\frac{|w^\top x+b|}{\lVert w\rVert}\right)$
- **C.** For hyperplane distance, use $\frac{|w^\top x+b|}{\lVert w\rVert}$
- **D.** For hyperplane distance, use sum inputs without the required weighting for hyperplane distance

**Correct Answer:** For hyperplane distance, use $\frac{|w^\top x+b|}{\lVert w\rVert}$

**Explanation:** The chapter defines hyperplane distance with $\frac{|w^\top x+b|}{\lVert w\rVert}$; the other expressions change an operation or omit required weighting.

---

## Question 22

**Question:** Which formula must be applied to obtain functional margin from the supplied chapter quantities?

**Choices:**
- **A.** For functional margin, use $\sqrt{y_i(w^\top x_i+b)}$
- **B.** For functional margin, use $1-\left(y_i(w^\top x_i+b)\right)$
- **C.** For functional margin, use $y_i(w^\top x_i+b)$
- **D.** For functional margin, use sum inputs without the required weighting for functional margin

**Correct Answer:** For functional margin, use $y_i(w^\top x_i+b)$

**Explanation:** The chapter defines functional margin with $y_i(w^\top x_i+b)$; the other expressions change an operation or omit required weighting.

---

## Question 23

**Question:** Which formula must be applied to obtain first component of w from the supplied chapter quantities?

**Choices:**
- **A.** For first component of w, use $\sum_i\alpha_i y_i x_{i,1}$
- **B.** For first component of w, use $1-\left(\sum_i\alpha_i y_i x_{i,1}\right)$
- **C.** For first component of w, use $\sqrt{\sum_i\alpha_i y_i x_{i,1}}$
- **D.** For first component of w, use sum inputs without the required weighting for first component of w

**Correct Answer:** For first component of w, use $\sum_i\alpha_i y_i x_{i,1}$

**Explanation:** The chapter defines first component of w with $\sum_i\alpha_i y_i x_{i,1}$; the other expressions change an operation or omit required weighting.

---

## Question 24

**Question:** Which formula must be applied to obtain RBF kernel value from the supplied chapter quantities?

**Choices:**
- **A.** For RBF kernel value, use $\sqrt{\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)}$
- **B.** For RBF kernel value, use $1-\left(\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)\right)$
- **C.** For RBF kernel value, use $\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)$
- **D.** For RBF kernel value, use sum inputs without the required weighting for RBF kernel value

**Correct Answer:** For RBF kernel value, use $\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)$

**Explanation:** The chapter defines RBF kernel value with $\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)$; the other expressions change an operation or omit required weighting.

---

## Question 25

**Question:** Which formula must be applied to obtain GMM mixture density from the supplied chapter quantities?

**Choices:**
- **A.** For GMM mixture density, use $\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)$
- **B.** For GMM mixture density, use $1-\left(\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)\right)$
- **C.** For GMM mixture density, use $\sqrt{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)}$
- **D.** For GMM mixture density, use sum inputs without the required weighting for GMM mixture density

**Correct Answer:** For GMM mixture density, use $\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)$

**Explanation:** The chapter defines GMM mixture density with $\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)$; the other expressions change an operation or omit required weighting.

---

## Question 26

**Question:** Four datasets are candidates. Which one produces hyperplane distance=0.0928?

**Choices:**
- **A.** For hyperplane distance, the second dataset: w=['2.2', '-1'], x=['1', '1.9'], $b=-0.5$
- **B.** For hyperplane distance, the first dataset: w=['2', '-1'], x=['1', '2'], $b=-0.5$
- **C.** For hyperplane distance, the third dataset: w=['2.5', '-1'], x=['1', '1.75'], $b=-0.5$
- **D.** For hyperplane distance, the fourth dataset: w=['2.8', '-1'], x=['1', '1.6'], $b=-0.5$

**Correct Answer:** For hyperplane distance, the third dataset: w=['2.5', '-1'], x=['1', '1.75'], $b=-0.5$

**Explanation:** Evaluating all four with $\frac{|w^\top x+b|}{\lVert w\rVert}$ shows that the third dataset produces 0.0928.

---

## Question 27

**Question:** Four datasets are candidates. Which one produces functional margin=1.5?

**Choices:**
- **A.** For functional margin, the fourth dataset: label y=1, score=1.74
- **B.** For functional margin, the first dataset: label y=1, score=1.1
- **C.** For functional margin, the second dataset: label y=1, score=1.26
- **D.** For functional margin, the third dataset: label y=-1, score=-1.5

**Correct Answer:** For functional margin, the third dataset: label y=-1, score=-1.5

**Explanation:** Evaluating all four with $y_i(w^\top x_i+b)$ shows that the third dataset produces 1.5.

---

## Question 28

**Question:** Four datasets are candidates. Which one produces first component of w=1.6?

**Choices:**
- **A.** For first component of w, the fourth dataset: $\alpha=[0.74, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]
- **B.** For first component of w, the first dataset: $\alpha=[0.5, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]
- **C.** For first component of w, the second dataset: $\alpha=[0.56, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]
- **D.** For first component of w, the third dataset: $\alpha=[0.65, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]

**Correct Answer:** For first component of w, the third dataset: $\alpha=[0.65, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]

**Explanation:** Evaluating all four with $\sum_i\alpha_i y_i x_{i,1}$ shows that the third dataset produces 1.6.

---

## Question 29

**Question:** Four datasets are candidates. Which one produces RBF kernel value=0.1173?

**Choices:**
- **A.** For RBF kernel value, the fourth dataset: squared distance=4.2, $\sigma^2=0.5$
- **B.** For RBF kernel value, the first dataset: squared distance=1, $\sigma^2=0.5$
- **C.** For RBF kernel value, the second dataset: squared distance=1.8, $\sigma^2=0.9$
- **D.** For RBF kernel value, the third dataset: squared distance=3, $\sigma^2=0.7$

**Correct Answer:** For RBF kernel value, the third dataset: squared distance=3, $\sigma^2=0.7$

**Explanation:** Evaluating all four with $\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)$ shows that the third dataset produces 0.1173.

---

## Question 30

**Question:** Four datasets are candidates. Which one produces GMM mixture density=0.1591?

**Choices:**
- **A.** For GMM mixture density, the first dataset: x=-1, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]
- **B.** For GMM mixture density, the third dataset: x=0, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]
- **C.** For GMM mixture density, the second dataset: x=-0.6, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]
- **D.** For GMM mixture density, the fourth dataset: x=0.6, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]

**Correct Answer:** For GMM mixture density, the third dataset: x=0, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]

**Explanation:** Evaluating all four with $\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)$ shows that the third dataset produces 0.1591.

---

## Question 31

**Question:** For w=['2.6', '-1'], x=['1', '1.7'], $b=-0.5$, a student reports hyperplane distance=0.2436. What corrected value should replace it?

**Choices:**
- **A.** corrected hyperplane distance = 0.2856
- **B.** corrected hyperplane distance = 0.2146
- **C.** corrected hyperplane distance = 0.0726
- **D.** corrected hyperplane distance = 0.1436

**Correct Answer:** corrected hyperplane distance = 0.1436

**Explanation:** Recomputing with $\frac{|w^\top x+b|}{\lVert w\rVert}$ gives 0.1436, so the reported 0.2436 is rejected.

---

## Question 32

**Question:** For label y=1, score=1.58, a student reports functional margin=1.975. What corrected value should replace it?

**Choices:**
- **A.** corrected functional margin = 1.2956
- **B.** corrected functional margin = 1.8644
- **C.** corrected functional margin = 1.58
- **D.** corrected functional margin = 2.1488

**Correct Answer:** corrected functional margin = 1.58

**Explanation:** Recomputing with $y_i(w^\top x_i+b)$ gives 1.58, so the reported 1.975 is rejected.

---

## Question 33

**Question:** For $\alpha=[0.68, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]], a student reports first component of w=2.075. What corrected value should replace it?

**Choices:**
- **A.** corrected first component of w = 1.9588
- **B.** corrected first component of w = 1.66
- **C.** corrected first component of w = 1.3612
- **D.** corrected first component of w = 2.2576

**Correct Answer:** corrected first component of w = 1.66

**Explanation:** Recomputing with $\sum_i\alpha_i y_i x_{i,1}$ gives 1.66, so the reported 2.075 is rejected.

---

## Question 34

**Question:** For squared distance=3.4, $\sigma^2=0.9$, a student reports RBF kernel value=0.2512. What corrected value should replace it?

**Choices:**
- **A.** corrected RBF kernel value = 0.2222
- **B.** corrected RBF kernel value = 0.1512
- **C.** corrected RBF kernel value = 0.0802
- **D.** corrected RBF kernel value = 0.2932

**Correct Answer:** corrected RBF kernel value = 0.1512

**Explanation:** Recomputing with $\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)$ gives 0.1512, so the reported 0.2512 is rejected.

---

## Question 35

**Question:** For x=0.2, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2], a student reports GMM mixture density=0.253. What corrected value should replace it?

**Choices:**
- **A.** corrected GMM mixture density = 0.295
- **B.** corrected GMM mixture density = 0.224
- **C.** corrected GMM mixture density = 0.082
- **D.** corrected GMM mixture density = 0.153

**Correct Answer:** corrected GMM mixture density = 0.153

**Explanation:** Recomputing with $\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)$ gives 0.153, so the reported 0.253 is rejected.

---

## Question 36

**Question:** Compute hyperplane distance separately for (w=['2.7', '-1'], x=['1', '1.65'], $b=-0.5$) and (w=['2', '-1'], x=['1', '2'], $b=-0.5$), then average the two results.

**Choices:**
- **A.** mean of the two hyperplane distance values = 0.3493
- **B.** mean of the two hyperplane distance values = 0.2783
- **C.** mean of the two hyperplane distance values = 0.1363
- **D.** mean of the two hyperplane distance values = 0.2073

**Correct Answer:** mean of the two hyperplane distance values = 0.2073

**Explanation:** The individual results are 0.191 and 0.2236; their arithmetic mean is 0.2073.

---

## Question 37

**Question:** Compute functional margin separately for (label y=-1, score=-1.66) and (label y=1, score=1.1), then average the two results.

**Choices:**
- **A.** mean of the two functional margin values = 1.38
- **B.** mean of the two functional margin values = 1.6284
- **C.** mean of the two functional margin values = 1.1316
- **D.** mean of the two functional margin values = 1.8768

**Correct Answer:** mean of the two functional margin values = 1.38

**Explanation:** The individual results are 1.66 and 1.1; their arithmetic mean is 1.38.

---

## Question 38

**Question:** Compute first component of w separately for ($\alpha=[0.71, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]) and ($\alpha=[0.5, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]), then average the two results.

**Choices:**
- **A.** mean of the two first component of w values = 1.51
- **B.** mean of the two first component of w values = 1.7818
- **C.** mean of the two first component of w values = 1.2382
- **D.** mean of the two first component of w values = 2.0536

**Correct Answer:** mean of the two first component of w values = 1.51

**Explanation:** The individual results are 1.72 and 1.3; their arithmetic mean is 1.51.

---

## Question 39

**Question:** Compute RBF kernel value separately for (squared distance=3.8, $\sigma^2=1.1$) and (squared distance=1, $\sigma^2=0.5$), then average the two results.

**Choices:**
- **A.** mean of the two RBF kernel value values = 0.3438
- **B.** mean of the two RBF kernel value values = 0.2728
- **C.** mean of the two RBF kernel value values = 0.2018
- **D.** mean of the two RBF kernel value values = 0.4148

**Correct Answer:** mean of the two RBF kernel value values = 0.2728

**Explanation:** The individual results are 0.1778 and 0.3679; their arithmetic mean is 0.2728.

---

## Question 40

**Question:** Compute GMM mixture density separately for (x=0.4, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]) and (x=-1, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]), then average the two results.

**Choices:**
- **A.** mean of the two GMM mixture density values = 0.0923
- **B.** mean of the two GMM mixture density values = 0.2343
- **C.** mean of the two GMM mixture density values = 0.1633
- **D.** mean of the two GMM mixture density values = 0.3053

**Correct Answer:** mean of the two GMM mixture density values = 0.1633

**Explanation:** The individual results are 0.1491 and 0.1774; their arithmetic mean is 0.1633.

---

## Question 41

**Question:** After the data change from (w=['2.8', '-1'], x=['1', '1.6'], $b=-0.5$) to (w=['2.6', '-1'], x=['1', '1.7'], $b=-0.5$), what is the new hyperplane distance?

**Choices:**
- **A.** hyperplane distance = 0.0726
- **B.** hyperplane distance = 0.2146
- **C.** hyperplane distance = 0.1436
- **D.** hyperplane distance = 0.2856

**Correct Answer:** hyperplane distance = 0.1436

**Explanation:** Only the new data enter $\frac{|w^\top x+b|}{\lVert w\rVert}$; they produce 0.1436.

---

## Question 42

**Question:** After the data change from (label y=1, score=1.74) to (label y=1, score=1.58), what is the new functional margin?

**Choices:**
- **A.** functional margin = 1.58
- **B.** functional margin = 1.8644
- **C.** functional margin = 1.2956
- **D.** functional margin = 2.1488

**Correct Answer:** functional margin = 1.58

**Explanation:** Only the new data enter $y_i(w^\top x_i+b)$; they produce 1.58.

---

## Question 43

**Question:** After the data change from ($\alpha=[0.74, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]) to ($\alpha=[0.68, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]), what is the new first component of w?

**Choices:**
- **A.** first component of w = 1.66
- **B.** first component of w = 1.9588
- **C.** first component of w = 1.3612
- **D.** first component of w = 2.2576

**Correct Answer:** first component of w = 1.66

**Explanation:** Only the new data enter $\sum_i\alpha_i y_i x_{i,1}$; they produce 1.66.

---

## Question 44

**Question:** After the data change from (squared distance=4.2, $\sigma^2=0.5$) to (squared distance=3.4, $\sigma^2=0.9$), what is the new RBF kernel value?

**Choices:**
- **A.** RBF kernel value = 0.2222
- **B.** RBF kernel value = 0.1512
- **C.** RBF kernel value = 0.0802
- **D.** RBF kernel value = 0.2932

**Correct Answer:** RBF kernel value = 0.1512

**Explanation:** Only the new data enter $\exp\!\left(-\frac{\lVert x-z\rVert^2}{2\sigma^2}\right)$; they produce 0.1512.

---

## Question 45

**Question:** After the data change from (x=0.6, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]) to (x=0.2, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]), what is the new GMM mixture density?

**Choices:**
- **A.** GMM mixture density = 0.082
- **B.** GMM mixture density = 0.224
- **C.** GMM mixture density = 0.153
- **D.** GMM mixture density = 0.295

**Correct Answer:** GMM mixture density = 0.153

**Explanation:** Only the new data enter $\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\sigma_k^2)$; they produce 0.153.

---

## Question 46

**Question:** Rank P, Q, R, S from largest to smallest hyperplane distance: P(w=['2.1', '-1'], x=['1', '1.95'], $b=-0.5$), Q(w=['2.3', '-1'], x=['1', '1.85'], $b=-0.5$), R(w=['2.6', '-1'], x=['1', '1.7'], $b=-0.5$), S(w=['2.9', '-1'], x=['1', '1.55'], $b=-0.5$).

**Choices:**
- **A.** hyperplane distance ranking: P = Q = R = S
- **B.** hyperplane distance ranking: Q > R > P > S
- **C.** hyperplane distance ranking: S > P > R > Q
- **D.** hyperplane distance ranking: P > Q > R > S

**Correct Answer:** hyperplane distance ranking: S > P > R > Q

**Explanation:** Their values are {'P': '0.1505', 'Q': '0.0199', 'R': '0.1436', 'S': '0.2771'}; grouping equal values and sorting descending gives hyperplane distance ranking: S > P > R > Q.

---

## Question 47

**Question:** Rank P, Q, R, S from largest to smallest functional margin: P(label y=-1, score=-1.18), Q(label y=-1, score=-1.34), R(label y=1, score=1.58), S(label y=-1, score=-1.82).

**Choices:**
- **A.** functional margin ranking: S > R > Q > P
- **B.** functional margin ranking: P > Q > R > S
- **C.** functional margin ranking: P = Q = R = S
- **D.** functional margin ranking: Q > P > S > R

**Correct Answer:** functional margin ranking: S > R > Q > P

**Explanation:** Their values are {'P': '1.18', 'Q': '1.34', 'R': '1.58', 'S': '1.82'}; grouping equal values and sorting descending gives functional margin ranking: S > R > Q > P.

---

## Question 48

**Question:** Rank P, Q, R, S from largest to smallest first component of w: P($\alpha=[0.53, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]), Q($\alpha=[0.59, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]), R($\alpha=[0.68, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]), S($\alpha=[0.77, 0.3]$, labels=[1, -1], x=[[2, 1], [-1, 2]]).

**Choices:**
- **A.** first component of w ranking: S > R > Q > P
- **B.** first component of w ranking: P > Q > R > S
- **C.** first component of w ranking: P = Q = R = S
- **D.** first component of w ranking: Q > P > S > R

**Correct Answer:** first component of w ranking: S > R > Q > P

**Explanation:** Their values are {'P': '1.36', 'Q': '1.48', 'R': '1.66', 'S': '1.84'}; grouping equal values and sorting descending gives first component of w ranking: S > R > Q > P.

---

## Question 49

**Question:** Rank P, Q, R, S from largest to smallest RBF kernel value: P(squared distance=1.4, $\sigma^2=0.7$), Q(squared distance=2.2, $\sigma^2=1.1$), R(squared distance=3.4, $\sigma^2=0.9$), S(squared distance=4.6, $\sigma^2=0.7$).

**Choices:**
- **A.** RBF kernel value ranking: P = Q = R = S
- **B.** RBF kernel value ranking: S > R > Q > P
- **C.** RBF kernel value ranking: P = Q > R > S
- **D.** RBF kernel value ranking: P > Q > R > S

**Correct Answer:** RBF kernel value ranking: P = Q > R > S

**Explanation:** Their values are {'P': '0.3679', 'Q': '0.3679', 'R': '0.1512', 'S': '0.0374'}; grouping equal values and sorting descending gives RBF kernel value ranking: P = Q > R > S.

---

## Question 50

**Question:** Rank P, Q, R, S from largest to smallest GMM mixture density: P(x=-0.8, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]), Q(x=-0.4, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]), R(x=0.2, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]), S(x=0.8, $\pi=[0.4, 0.6]$, $\mu=[-1, 2]$, variances=[1, 2]).

**Choices:**
- **A.** GMM mixture density ranking: P = Q = R = S
- **B.** GMM mixture density ranking: S > R > Q > P
- **C.** GMM mixture density ranking: P > Q > R > S
- **D.** GMM mixture density ranking: Q > P > S > R

**Correct Answer:** GMM mixture density ranking: P > Q > R > S

**Explanation:** Their values are {'P': '0.1803', 'Q': '0.1734', 'R': '0.153', 'S': '0.1497'}; grouping equal values and sorting descending gives GMM mixture density ranking: P > Q > R > S.

---

## Question 51

**Question:** Which statement correctly characterizes support-vector influence?

**Choices:**
- **A.** Every non-support vector has a nonzero dual coefficient.
- **B.** Support vectors are the training points that determine the maximum-margin boundary.
- **C.** Support vectors are always the points farthest from the hyperplane.
- **D.** Removing all support vectors leaves the same boundary by definition. for all permitted parameter values

**Correct Answer:** Support vectors are the training points that determine the maximum-margin boundary.

**Explanation:** For support-vector influence, the accurate statement is the first one because Nonzero alpha values identify the influential closest points.

---

## Question 52

**Question:** Which statement correctly characterizes hard-margin feasibility?

**Choices:**
- **A.** Hard-margin constraints require $y_i(w^\top x_i+b)\ge 1$ for every training point.
- **B.** Hard margin accepts every point with product below zero.
- **C.** The constraint omits labels and uses only $\lVert w\rVert$.
- **D.** Hard margin requires every point to lie on the hyperplane. under every stated condition

**Correct Answer:** Hard-margin constraints require $y_i(w^\top x_i+b)\ge 1$ for every training point.

**Explanation:** For hard-margin feasibility, the accurate statement is the first one because The signed functional margin must meet at least one.

---

## Question 53

**Question:** Which statement correctly characterizes norm minimization?

**Choices:**
- **A.** The norm controls only the class-label encoding.
- **B.** Minimizing $\lVert w\rVert^2$ under the canonical constraints maximizes geometric margin.
- **C.** The objective directly maximizes the number of features. without changing the supplied data
- **D.** Maximizing $\lVert w\rVert$ always widens the margin.

**Correct Answer:** Minimizing $\lVert w\rVert^2$ under the canonical constraints maximizes geometric margin.

**Explanation:** For norm minimization, the accurate statement is the first one because Under fixed functional scaling, geometric margin varies inversely with $\lVert w\rVert$.

---

## Question 54

**Question:** Which statement correctly characterizes nonzero dual coefficients?

**Choices:**
- **A.** The equality constraint is sum $\alpha_i$=1 without labels. for all permitted parameter values
- **B.** Only nonzero dual coefficients contribute to $w=\sum_i\alpha_i y_i x_i$.
- **C.** All alpha values must be negative for support vectors.
- **D.** The dual removes every dependence on inner products.

**Correct Answer:** Only nonzero dual coefficients contribute to $w=\sum_i\alpha_i y_i x_i$.

**Explanation:** For nonzero dual coefficients, the accurate statement is the first one because Zero coefficients vanish from the weighted sum.

---

## Question 55

**Question:** Which statement correctly characterizes the kernel substitution?

**Choices:**
- **A.** A kernel is the same as the SVM penalty C.
- **B.** A kernel replaces every label with a continuous target.
- **C.** A kernel guarantees linearly separable raw inputs without parameters.
- **D.** A kernel replaces an input-space inner product with K($x_i$,$x_j$).

**Correct Answer:** A kernel replaces an input-space inner product with K($x_i$,$x_j$).

**Explanation:** For the kernel substitution, the accurate statement is the first one because The kernel trick changes similarity computation in the dual.

---

## Question 56

**Question:** Which statement correctly characterizes RBF width?

**Choices:**
- **A.** Small RBF variance produces a more localized, flexible boundary.
- **B.** Small variance makes every pair's kernel value exactly one. without changing the supplied data
- **C.** Large variance always creates more local variation.
- **D.** RBF variance is the misclassification penalty C.

**Correct Answer:** Small RBF variance produces a more localized, flexible boundary.

**Explanation:** For RBF width, the accurate statement is the first one because Narrow Gaussians decay quickly with distance.

---

## Question 57

**Question:** Which statement correctly characterizes the C trade-off?

**Choices:**
- **A.** Small C necessarily produces zero training error. for all permitted parameter values
- **B.** Large C ignores every misclassification.
- **C.** C is the Gaussian mixing coefficient sum.
- **D.** Large C penalizes violations more strongly and can increase variance.

**Correct Answer:** Large C penalizes violations more strongly and can increase variance.

**Explanation:** For the C trade-off, the accurate statement is the first one because The stated trade-off links large C with lower bias and higher variance.

---

## Question 58

**Question:** Which statement correctly characterizes soft GMM membership?

**Choices:**
- **A.** GMM cannot represent more than one Gaussian.
- **B.** GMM gives each point a probability-like membership across components.
- **C.** GMM contains no mixing coefficients.
- **D.** GMM assigns every point permanently to exactly one centroid. under every stated condition

**Correct Answer:** GMM gives each point a probability-like membership across components.

**Explanation:** For soft GMM membership, the accurate statement is the first one because GMM is soft, probabilistic clustering.

---

## Question 59

**Question:** Which statement correctly characterizes mixing coefficients?

**Choices:**
- **A.** Mixing coefficients are nonnegative and sum to one.
- **B.** Each mixing coefficient must be greater than one.
- **C.** Mixing coefficients are unconstrained SVM dual variables.
- **D.** Their sum must equal the number of data points.

**Correct Answer:** Mixing coefficients are nonnegative and sum to one.

**Explanation:** For mixing coefficients, the accurate statement is the first one because They form component prior probabilities.

---

## Question 60

**Question:** Which statement correctly characterizes K-Means versus GMM?

**Choices:**
- **A.** K-Means and GMM return identical membership probabilities by definition. for all permitted parameter values
- **B.** K-Means requires covariance matrices for every point.
- **C.** GMM has centroids but no Gaussian parameters.
- **D.** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Correct Answer:** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Explanation:** For K-Means versus GMM, the accurate statement is the first one because The tracker explicitly contrasts their assignments and representations.

---

## Question 61

**Question:** A student writes, “Every non-support vector has a nonzero dual coefficient.” Which replacement correctly repairs the claim about support-vector influence?

**Choices:**
- **A.** Replace it with: Removing all support vectors leaves the same boundary by definition. under every stated condition
- **B.** Replace it with: Support vectors are the training points that determine the maximum-margin boundary.
- **C.** Replace it with: Support vectors are always the points farthest from the hyperplane.
- **D.** Replace it with: Every non-support vector has a nonzero dual coefficient.

**Correct Answer:** Replace it with: Support vectors are the training points that determine the maximum-margin boundary.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Nonzero alpha values identify the influential closest points.

---

## Question 62

**Question:** A student writes, “Hard margin accepts every point with product below zero.” Which replacement correctly repairs the claim about hard-margin feasibility?

**Choices:**
- **A.** Replace it with: Hard-margin constraints require $y_i(w^\top x_i+b)\ge 1$ for every training point.
- **B.** Replace it with: Hard margin accepts every point with product below zero.
- **C.** Replace it with: The constraint omits labels and uses only $\lVert w\rVert$.
- **D.** Replace it with: Hard margin requires every point to lie on the hyperplane. without changing the supplied data

**Correct Answer:** Replace it with: Hard-margin constraints require $y_i(w^\top x_i+b)\ge 1$ for every training point.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The signed functional margin must meet at least one.

---

## Question 63

**Question:** A student writes, “Maximizing $\lVert w\rVert$ always widens the margin.” Which replacement correctly repairs the claim about norm minimization?

**Choices:**
- **A.** Replace it with: Minimizing $\lVert w\rVert^2$ under the canonical constraints maximizes geometric margin.
- **B.** Replace it with: Maximizing $\lVert w\rVert$ always widens the margin.
- **C.** Replace it with: The objective directly maximizes the number of features. for all permitted parameter values
- **D.** Replace it with: The norm controls only the class-label encoding.

**Correct Answer:** Replace it with: Minimizing $\lVert w\rVert^2$ under the canonical constraints maximizes geometric margin.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Under fixed functional scaling, geometric margin varies inversely with $\lVert w\rVert$.

---

## Question 64

**Question:** A student writes, “All alpha values must be negative for support vectors.” Which replacement correctly repairs the claim about nonzero dual coefficients?

**Choices:**
- **A.** Replace it with: Only nonzero dual coefficients contribute to $w=\sum_i\alpha_i y_i x_i$.
- **B.** Replace it with: All alpha values must be negative for support vectors.
- **C.** Replace it with: The equality constraint is sum $\alpha_i$=1 without labels. under every stated condition
- **D.** Replace it with: The dual removes every dependence on inner products.

**Correct Answer:** Replace it with: Only nonzero dual coefficients contribute to $w=\sum_i\alpha_i y_i x_i$.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Zero coefficients vanish from the weighted sum.

---

## Question 65

**Question:** A student writes, “A kernel replaces every label with a continuous target.” Which replacement correctly repairs the claim about the kernel substitution?

**Choices:**
- **A.** Replace it with: A kernel guarantees linearly separable raw inputs without parameters.
- **B.** Replace it with: A kernel replaces every label with a continuous target.
- **C.** Replace it with: A kernel is the same as the SVM penalty C.
- **D.** Replace it with: A kernel replaces an input-space inner product with K($x_i$,$x_j$).

**Correct Answer:** Replace it with: A kernel replaces an input-space inner product with K($x_i$,$x_j$).

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The kernel trick changes similarity computation in the dual.

---

## Question 66

**Question:** A student writes, “Small variance makes every pair's kernel value exactly one.” Which replacement correctly repairs the claim about RBF width?

**Choices:**
- **A.** Replace it with: Large variance always creates more local variation.
- **B.** Replace it with: Small variance makes every pair's kernel value exactly one. for all permitted parameter values
- **C.** Replace it with: Small RBF variance produces a more localized, flexible boundary.
- **D.** Replace it with: RBF variance is the misclassification penalty C.

**Correct Answer:** Replace it with: Small RBF variance produces a more localized, flexible boundary.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Narrow Gaussians decay quickly with distance.

---

## Question 67

**Question:** A student writes, “Large C ignores every misclassification.” Which replacement correctly repairs the claim about the C trade-off?

**Choices:**
- **A.** Replace it with: Large C penalizes violations more strongly and can increase variance.
- **B.** Replace it with: Large C ignores every misclassification.
- **C.** Replace it with: Small C necessarily produces zero training error. under every stated condition
- **D.** Replace it with: C is the Gaussian mixing coefficient sum.

**Correct Answer:** Replace it with: Large C penalizes violations more strongly and can increase variance.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The stated trade-off links large C with lower bias and higher variance.

---

## Question 68

**Question:** A student writes, “GMM assigns every point permanently to exactly one centroid.” Which replacement correctly repairs the claim about soft GMM membership?

**Choices:**
- **A.** Replace it with: GMM contains no mixing coefficients.
- **B.** Replace it with: GMM assigns every point permanently to exactly one centroid. without changing the supplied data
- **C.** Replace it with: GMM cannot represent more than one Gaussian.
- **D.** Replace it with: GMM gives each point a probability-like membership across components.

**Correct Answer:** Replace it with: GMM gives each point a probability-like membership across components.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because GMM is soft, probabilistic clustering.

---

## Question 69

**Question:** A student writes, “Each mixing coefficient must be greater than one.” Which replacement correctly repairs the claim about mixing coefficients?

**Choices:**
- **A.** Replace it with: Mixing coefficients are nonnegative and sum to one.
- **B.** Replace it with: Each mixing coefficient must be greater than one.
- **C.** Replace it with: Mixing coefficients are unconstrained SVM dual variables.
- **D.** Replace it with: Their sum must equal the number of data points.

**Correct Answer:** Replace it with: Mixing coefficients are nonnegative and sum to one.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because They form component prior probabilities.

---

## Question 70

**Question:** A student writes, “K-Means and GMM return identical membership probabilities by definition.” Which replacement correctly repairs the claim about K-Means versus GMM?

**Choices:**
- **A.** Replace it with: K-Means requires covariance matrices for every point.
- **B.** Replace it with: K-Means and GMM return identical membership probabilities by definition. under every stated condition
- **C.** Replace it with: GMM has centroids but no Gaussian parameters.
- **D.** Replace it with: K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Correct Answer:** Replace it with: K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The tracker explicitly contrasts their assignments and representations.

---

## Question 71

**Question:** A student's answer about support-vector influence contains the claim “Every non-support vector has a nonzero dual coefficient.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about support-vector influence is correct without qualification
- **B.** The quoted claim concerns support-vector influence but is only a harmless change of notation
- **C.** The quoted claim about support-vector influence is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about support-vector influence is false and must be replaced

**Explanation:** The quoted claim contradicts support-vector influence; it must be replaced by Support vectors are the training points that determine the maximum-margin boundary..

---

## Question 72

**Question:** A student's answer about hard-margin feasibility contains the claim “Hard margin accepts every point with product below zero.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about hard-margin feasibility is correct without qualification
- **B.** The quoted claim about hard-margin feasibility is false and must be replaced
- **C.** The quoted claim concerns hard-margin feasibility but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about hard-margin feasibility is false and must be replaced

**Explanation:** The quoted claim contradicts hard-margin feasibility; it must be replaced by Hard-margin constraints require $y_i(w^\top x_i+b)\ge 1$ for every training point..

---

## Question 73

**Question:** A student's answer about norm minimization contains the claim “Maximizing $\lVert w\rVert$ always widens the margin.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about norm minimization is false and must be replaced
- **B.** The quoted claim about norm minimization is correct without qualification
- **C.** The quoted claim concerns norm minimization but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about norm minimization is false and must be replaced

**Explanation:** The quoted claim contradicts norm minimization; it must be replaced by Minimizing $\lVert w\rVert^2$ under the canonical constraints maximizes geometric margin..

---

## Question 74

**Question:** A student's answer about nonzero dual coefficients contains the claim “All alpha values must be negative for support vectors.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about nonzero dual coefficients is correct without qualification
- **C.** The quoted claim concerns nonzero dual coefficients but is only a harmless change of notation
- **D.** The quoted claim about nonzero dual coefficients is false and must be replaced

**Correct Answer:** The quoted claim about nonzero dual coefficients is false and must be replaced

**Explanation:** The quoted claim contradicts nonzero dual coefficients; it must be replaced by the chapter's stated rule.

---

## Question 75

**Question:** A student's answer about the kernel substitution contains the claim “A kernel replaces every label with a continuous target.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about the kernel substitution is false and must be replaced
- **B.** The quoted claim about the kernel substitution is correct without qualification
- **C.** The quoted claim concerns the kernel substitution but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about the kernel substitution is false and must be replaced

**Explanation:** The quoted claim contradicts the kernel substitution; it must be replaced by A kernel replaces an input-space inner product with K($x_i$,$x_j$)..

---

## Question 76

**Question:** A student's answer about RBF width contains the claim “Small variance makes every pair's kernel value exactly one.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about RBF width is false and must be replaced
- **B.** The quoted claim about RBF width is correct without qualification
- **C.** The quoted claim concerns RBF width but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about RBF width is false and must be replaced

**Explanation:** The quoted claim contradicts RBF width; it must be replaced by Small RBF variance produces a more localized, flexible boundary..

---

## Question 77

**Question:** A student's answer about the C trade-off contains the claim “Large C ignores every misclassification.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns the C trade-off but is only a harmless change of notation
- **B.** The quoted claim about the C trade-off is false and must be replaced
- **C.** The quoted claim about the C trade-off is correct without qualification
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about the C trade-off is false and must be replaced

**Explanation:** The quoted claim contradicts the C trade-off; it must be replaced by Large C penalizes violations more strongly and can increase variance..

---

## Question 78

**Question:** A student's answer about soft GMM membership contains the claim “GMM assigns every point permanently to exactly one centroid.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about soft GMM membership is false and must be replaced
- **B.** The quoted claim about soft GMM membership is correct without qualification
- **C.** The quoted claim concerns soft GMM membership but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about soft GMM membership is false and must be replaced

**Explanation:** The quoted claim contradicts soft GMM membership; it must be replaced by the chapter's stated rule.

---

## Question 79

**Question:** A student's answer about mixing coefficients contains the claim “Each mixing coefficient must be greater than one.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about mixing coefficients is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns mixing coefficients but is only a harmless change of notation
- **D.** The quoted claim about mixing coefficients is false and must be replaced

**Correct Answer:** The quoted claim about mixing coefficients is false and must be replaced

**Explanation:** The quoted claim contradicts mixing coefficients; it must be replaced by Mixing coefficients are nonnegative and sum to one..

---

## Question 80

**Question:** A student's answer about K-Means versus GMM contains the claim “K-Means and GMM return identical membership probabilities by definition.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about K-Means versus GMM is false and must be replaced
- **C.** The quoted claim concerns K-Means versus GMM but is only a harmless change of notation
- **D.** The quoted claim about K-Means versus GMM is correct without qualification

**Correct Answer:** The quoted claim about K-Means versus GMM is false and must be replaced

**Explanation:** The quoted claim contradicts K-Means versus GMM; it must be replaced by K-Means is distance-based hard clustering; GMM is density-based soft clustering..

---

## Question 81

**Question:** An implementation is designed around the rule “Support vectors are always the points farthest from the hyperplane.” Which principle exposes the design error concerning support-vector influence?

**Choices:**
- **A.** Required principle: Removing all support vectors leaves the same boundary by definition. for all permitted parameter values
- **B.** Required principle: Every non-support vector has a nonzero dual coefficient.
- **C.** Required principle: Support vectors are always the points farthest from the hyperplane.
- **D.** Required principle: Support vectors are the training points that determine the maximum-margin boundary.

**Correct Answer:** Required principle: Support vectors are the training points that determine the maximum-margin boundary.

**Explanation:** The implementation encodes a false rule. The required principle follows because Nonzero alpha values identify the influential closest points.

---

## Question 82

**Question:** An implementation is designed around the rule “The constraint omits labels and uses only $\lVert w\rVert$.” Which principle exposes the design error concerning hard-margin feasibility?

**Choices:**
- **A.** Required principle: Hard-margin constraints require $y_i(w^\top x_i+b)\ge 1$ for every training point.
- **B.** Required principle: Hard margin accepts every point with product below zero.
- **C.** Required principle: The constraint omits labels and uses only $\lVert w\rVert$.
- **D.** Required principle: Hard margin requires every point to lie on the hyperplane. under every stated condition

**Correct Answer:** Required principle: Hard-margin constraints require $y_i(w^\top x_i+b)\ge 1$ for every training point.

**Explanation:** The implementation encodes a false rule. The required principle follows because The signed functional margin must meet at least one.

---

## Question 83

**Question:** An implementation is designed around the rule “The objective directly maximizes the number of features.” Which principle exposes the design error concerning norm minimization?

**Choices:**
- **A.** Required principle: Minimizing $\lVert w\rVert^2$ under the canonical constraints maximizes geometric margin.
- **B.** Required principle: Maximizing $\lVert w\rVert$ always widens the margin.
- **C.** Required principle: The objective directly maximizes the number of features. without changing the supplied data
- **D.** Required principle: The norm controls only the class-label encoding.

**Correct Answer:** Required principle: Minimizing $\lVert w\rVert^2$ under the canonical constraints maximizes geometric margin.

**Explanation:** The implementation encodes a false rule. The required principle follows because Under fixed functional scaling, geometric margin varies inversely with $\lVert w\rVert$.

---

## Question 84

**Question:** An implementation is designed around the rule “The equality constraint is sum $\alpha_i$=1 without labels.” Which principle exposes the design error concerning nonzero dual coefficients?

**Choices:**
- **A.** Required principle: All alpha values must be negative for support vectors.
- **B.** Required principle: The equality constraint is sum $\alpha_i$=1 without labels. for all permitted parameter values
- **C.** Required principle: Only nonzero dual coefficients contribute to $w=\sum_i\alpha_i y_i x_i$.
- **D.** Required principle: The dual removes every dependence on inner products.

**Correct Answer:** Required principle: Only nonzero dual coefficients contribute to $w=\sum_i\alpha_i y_i x_i$.

**Explanation:** The implementation encodes a false rule. The required principle follows because Zero coefficients vanish from the weighted sum.

---

## Question 85

**Question:** An implementation is designed around the rule “A kernel guarantees linearly separable raw inputs without parameters.” Which principle exposes the design error concerning the kernel substitution?

**Choices:**
- **A.** Required principle: A kernel is the same as the SVM penalty C.
- **B.** Required principle: A kernel replaces an input-space inner product with K($x_i$,$x_j$).
- **C.** Required principle: A kernel guarantees linearly separable raw inputs without parameters.
- **D.** Required principle: A kernel replaces every label with a continuous target.

**Correct Answer:** Required principle: A kernel replaces an input-space inner product with K($x_i$,$x_j$).

**Explanation:** The implementation encodes a false rule. The required principle follows because The kernel trick changes similarity computation in the dual.

---

## Question 86

**Question:** An implementation is designed around the rule “Large variance always creates more local variation.” Which principle exposes the design error concerning RBF width?

**Choices:**
- **A.** Required principle: RBF variance is the misclassification penalty C.
- **B.** Required principle: Small variance makes every pair's kernel value exactly one. without changing the supplied data
- **C.** Required principle: Large variance always creates more local variation.
- **D.** Required principle: Small RBF variance produces a more localized, flexible boundary.

**Correct Answer:** Required principle: Small RBF variance produces a more localized, flexible boundary.

**Explanation:** The implementation encodes a false rule. The required principle follows because Narrow Gaussians decay quickly with distance.

---

## Question 87

**Question:** An implementation is designed around the rule “Small C necessarily produces zero training error.” Which principle exposes the design error concerning the C trade-off?

**Choices:**
- **A.** Required principle: Large C ignores every misclassification.
- **B.** Required principle: Small C necessarily produces zero training error. for all permitted parameter values
- **C.** Required principle: Large C penalizes violations more strongly and can increase variance.
- **D.** Required principle: C is the Gaussian mixing coefficient sum.

**Correct Answer:** Required principle: Large C penalizes violations more strongly and can increase variance.

**Explanation:** The implementation encodes a false rule. The required principle follows because The stated trade-off links large C with lower bias and higher variance.

---

## Question 88

**Question:** An implementation is designed around the rule “GMM contains no mixing coefficients.” Which principle exposes the design error concerning soft GMM membership?

**Choices:**
- **A.** Required principle: GMM contains no mixing coefficients.
- **B.** Required principle: GMM assigns every point permanently to exactly one centroid. under every stated condition
- **C.** Required principle: GMM gives each point a probability-like membership across components.
- **D.** Required principle: GMM cannot represent more than one Gaussian.

**Correct Answer:** Required principle: GMM gives each point a probability-like membership across components.

**Explanation:** The implementation encodes a false rule. The required principle follows because GMM is soft, probabilistic clustering.

---

## Question 89

**Question:** An implementation is designed around the rule “Mixing coefficients are unconstrained SVM dual variables.” Which principle exposes the design error concerning mixing coefficients?

**Choices:**
- **A.** Required principle: Each mixing coefficient must be greater than one.
- **B.** Required principle: Mixing coefficients are nonnegative and sum to one.
- **C.** Required principle: Mixing coefficients are unconstrained SVM dual variables.
- **D.** Required principle: Their sum must equal the number of data points.

**Correct Answer:** Required principle: Mixing coefficients are nonnegative and sum to one.

**Explanation:** The implementation encodes a false rule. The required principle follows because They form component prior probabilities.

---

## Question 90

**Question:** An implementation is designed around the rule “GMM has centroids but no Gaussian parameters.” Which principle exposes the design error concerning K-Means versus GMM?

**Choices:**
- **A.** Required principle: K-Means requires covariance matrices for every point.
- **B.** Required principle: K-Means is distance-based hard clustering; GMM is density-based soft clustering.
- **C.** Required principle: GMM has centroids but no Gaussian parameters.
- **D.** Required principle: K-Means and GMM return identical membership probabilities by definition. for all permitted parameter values

**Correct Answer:** Required principle: K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Explanation:** The implementation encodes a false rule. The required principle follows because The tracker explicitly contrasts their assignments and representations.

---

## Question 91

**Question:** Reviewer A states, “Support vectors are the training points that determine the maximum-margin boundary.” Reviewer B states, “Removing all support vectors leaves the same boundary by definition.” What is the correct verdict about support-vector influence?

**Choices:**
- **A.** Both reviewers are correct about support-vector influence
- **B.** Reviewer B only is correct about support-vector influence
- **C.** Reviewer A only is correct about support-vector influence
- **D.** Neither reviewer is correct about support-vector influence

**Correct Answer:** Reviewer A only is correct about support-vector influence

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Nonzero alpha values identify the influential closest points.

---

## Question 92

**Question:** Reviewer A states, “Hard-margin constraints require $y_i(w^\top x_i+b)\ge 1$ for every training point.” Reviewer B states, “Hard margin requires every point to lie on the hyperplane.” What is the correct verdict about hard-margin feasibility?

**Choices:**
- **A.** Neither reviewer is correct about hard-margin feasibility
- **B.** Reviewer B only is correct about hard-margin feasibility
- **C.** Both reviewers are correct about hard-margin feasibility
- **D.** Reviewer A only is correct about hard-margin feasibility

**Correct Answer:** Reviewer A only is correct about hard-margin feasibility

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The signed functional margin must meet at least one.

---

## Question 93

**Question:** Reviewer A states, “Minimizing $\lVert w\rVert^2$ under the canonical constraints maximizes geometric margin.” Reviewer B states, “The norm controls only the class-label encoding.” What is the correct verdict about norm minimization?

**Choices:**
- **A.** Both reviewers are correct about norm minimization
- **B.** Reviewer A only is correct about norm minimization
- **C.** Reviewer B only is correct about norm minimization
- **D.** Neither reviewer is correct about norm minimization

**Correct Answer:** Reviewer A only is correct about norm minimization

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Under fixed functional scaling, geometric margin varies inversely with $\lVert w\rVert$.

---

## Question 94

**Question:** Reviewer A states, “Only nonzero dual coefficients contribute to $w=\sum_i\alpha_i y_i x_i$.” Reviewer B states, “The dual removes every dependence on inner products.” What is the correct verdict about nonzero dual coefficients?

**Choices:**
- **A.** Reviewer B only is correct about nonzero dual coefficients
- **B.** Both reviewers are correct about nonzero dual coefficients
- **C.** Reviewer A only is correct about nonzero dual coefficients
- **D.** Neither reviewer is correct about nonzero dual coefficients

**Correct Answer:** Reviewer A only is correct about nonzero dual coefficients

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Zero coefficients vanish from the weighted sum.

---

## Question 95

**Question:** Reviewer A states, “A kernel replaces an input-space inner product with K($x_i$,$x_j$).” Reviewer B states, “A kernel is the same as the SVM penalty C.” What is the correct verdict about the kernel substitution?

**Choices:**
- **A.** Reviewer B only is correct about the kernel substitution
- **B.** Neither reviewer is correct about the kernel substitution
- **C.** Both reviewers are correct about the kernel substitution
- **D.** Reviewer A only is correct about the kernel substitution

**Correct Answer:** Reviewer A only is correct about the kernel substitution

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The kernel trick changes similarity computation in the dual.

---

## Question 96

**Question:** Reviewer A states, “Small RBF variance produces a more localized, flexible boundary.” Reviewer B states, “RBF variance is the misclassification penalty C.” What is the correct verdict about RBF width?

**Choices:**
- **A.** Both reviewers are correct about RBF width
- **B.** Reviewer B only is correct about RBF width
- **C.** Reviewer A only is correct about RBF width
- **D.** Neither reviewer is correct about RBF width

**Correct Answer:** Reviewer A only is correct about RBF width

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Narrow Gaussians decay quickly with distance.

---

## Question 97

**Question:** Reviewer A states, “Large C penalizes violations more strongly and can increase variance.” Reviewer B states, “C is the Gaussian mixing coefficient sum.” What is the correct verdict about the C trade-off?

**Choices:**
- **A.** Reviewer B only is correct about the C trade-off
- **B.** Reviewer A only is correct about the C trade-off
- **C.** Both reviewers are correct about the C trade-off
- **D.** Neither reviewer is correct about the C trade-off

**Correct Answer:** Reviewer A only is correct about the C trade-off

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The stated trade-off links large C with lower bias and higher variance.

---

## Question 98

**Question:** Reviewer A states, “GMM gives each point a probability-like membership across components.” Reviewer B states, “GMM cannot represent more than one Gaussian.” What is the correct verdict about soft GMM membership?

**Choices:**
- **A.** Reviewer B only is correct about soft GMM membership
- **B.** Neither reviewer is correct about soft GMM membership
- **C.** Both reviewers are correct about soft GMM membership
- **D.** Reviewer A only is correct about soft GMM membership

**Correct Answer:** Reviewer A only is correct about soft GMM membership

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, GMM is soft, probabilistic clustering.

---

## Question 99

**Question:** Reviewer A states, “Mixing coefficients are nonnegative and sum to one.” Reviewer B states, “Their sum must equal the number of data points.” What is the correct verdict about mixing coefficients?

**Choices:**
- **A.** Reviewer B only is correct about mixing coefficients
- **B.** Reviewer A only is correct about mixing coefficients
- **C.** Both reviewers are correct about mixing coefficients
- **D.** Neither reviewer is correct about mixing coefficients

**Correct Answer:** Reviewer A only is correct about mixing coefficients

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, They form component prior probabilities.

---

## Question 100

**Question:** Reviewer A states, “K-Means is distance-based hard clustering; GMM is density-based soft clustering.” Reviewer B states, “K-Means requires covariance matrices for every point.” What is the correct verdict about K-Means versus GMM?

**Choices:**
- **A.** Both reviewers are correct about K-Means versus GMM
- **B.** Reviewer B only is correct about K-Means versus GMM
- **C.** Neither reviewer is correct about K-Means versus GMM
- **D.** Reviewer A only is correct about K-Means versus GMM

**Correct Answer:** Reviewer A only is correct about K-Means versus GMM

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The tracker explicitly contrasts their assignments and representations.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Questions were audited for structural balance, verbatim reuse, and parameter-only duplicate prompts.
