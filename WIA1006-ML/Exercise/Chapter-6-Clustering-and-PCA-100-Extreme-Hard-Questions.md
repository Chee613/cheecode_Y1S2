# Chapter 6: Clustering and PCA: 100 Extreme-Hard Questions

> Topics: distance measures, K-Means, hierarchical and spectral clustering, graph Laplacians, PCA, and eigenfaces. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** Using x=['1', '2', '-1'], y=['-1', '1', '2'], compute the Euclidean distance.

**Choices:**
- **A.** Euclidean distance = 3.7417
- **B.** Euclidean distance = 4.4152
- **C.** Euclidean distance = 3.0682
- **D.** Euclidean distance = 5.0887

**Correct Answer:** Euclidean distance = 3.7417

**Explanation:** Apply $\sqrt{\sum_i(x_i-y_i)^2}$; substitution gives Euclidean distance=3.7417.

---

## Question 2

**Question:** Using x=['1', '2', '-1'], y=['-1', '1', '2'], compute the cosine similarity.

**Choices:**
- **A.** cosine similarity = -0.2377
- **B.** cosine similarity = -0.0957
- **C.** cosine similarity = -0.1667
- **D.** cosine similarity = -0.0247

**Correct Answer:** cosine similarity = -0.1667

**Explanation:** Apply $\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}$; substitution gives cosine similarity=-0.1667.

---

## Question 3

**Question:** Using cluster points=[('0', '0'), ('2', '2')], compute the updated centroid x-coordinate.

**Choices:**
- **A.** updated centroid x-coordinate = 0.82
- **B.** updated centroid x-coordinate = 1.18
- **C.** updated centroid x-coordinate = 1
- **D.** updated centroid x-coordinate = 1.36

**Correct Answer:** updated centroid x-coordinate = 1

**Explanation:** Apply $\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i$; substitution gives updated centroid x-coordinate=1.

---

## Question 4

**Question:** Using cross-cluster distances=['1', '3', '5', '4'], compute the average linkage.

**Choices:**
- **A.** average linkage = 3.25
- **B.** average linkage = 3.835
- **C.** average linkage = 2.665
- **D.** average linkage = 4.42

**Correct Answer:** average linkage = 3.25

**Explanation:** Apply $\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)$; substitution gives average linkage=3.25.

---

## Question 5

**Question:** Using eigenvalues=['5', '3', '1', '0.5'], retain k=2, compute the PCA explained-variance ratio.

**Choices:**
- **A.** PCA explained-variance ratio = 0.9937
- **B.** PCA explained-variance ratio = 0.8421
- **C.** PCA explained-variance ratio = 0.6905
- **D.** PCA explained-variance ratio = 1.1453

**Correct Answer:** PCA explained-variance ratio = 0.8421

**Explanation:** Apply $\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}$; substitution gives PCA explained-variance ratio=0.8421.

---

## Question 6

**Question:** Compare the Euclidean distance for Case P (x=['1.1', '2', '-1'], y=['-1', '1.05', '2']) and Case Q (x=['1.4', '2', '-1'], y=['-1', '1.2', '2']).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 3.7832 versus 3.9243 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 3.9243 versus 3.7832

**Correct Answer:** The second case is larger: 3.9243 versus 3.7832

**Explanation:** The same formula gives 3.7832 for P and 3.9243 for Q, establishing the stated comparison.

---

## Question 7

**Question:** Compare the cosine similarity for Case P (x=['1.1', '2', '-1'], y=['-1', '1.05', '2']) and Case Q (x=['1.4', '2', '-1'], y=['-1', '1.2', '2']).

**Choices:**
- **A.** The first case is larger: -0.1624 versus -0.1494 under the complete set of stated assumptions
- **B.** The second case is larger: -0.1494 versus -0.1624
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: -0.1494 versus -0.1624

**Explanation:** The same formula gives -0.1624 for P and -0.1494 for Q, establishing the stated comparison.

---

## Question 8

**Question:** Compare the updated centroid x-coordinate for Case P (cluster points=[('0.1', '0'), ('2', '2.1')]) and Case Q (cluster points=[('0.4', '0'), ('2', '2.4')]).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 1.05 versus 1.2 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 1.2 versus 1.05

**Correct Answer:** The second case is larger: 1.2 versus 1.05

**Explanation:** The same formula gives 1.05 for P and 1.2 for Q, establishing the stated comparison.

---

## Question 9

**Question:** Compare the average linkage for Case P (cross-cluster distances=['1.1', '3.05', '4.97', '4']) and Case Q (cross-cluster distances=['1.4', '3.2', '4.88', '4']).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 3.28 versus 3.37 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 3.37 versus 3.28

**Correct Answer:** The second case is larger: 3.37 versus 3.28

**Explanation:** The same formula gives 3.28 for P and 3.37 for Q, establishing the stated comparison.

---

## Question 10

**Question:** Compare the PCA explained-variance ratio for Case P (eigenvalues=['6', '3.5', '1.1', '0.5'], retain k=2) and Case Q (eigenvalues=['9', '5', '1.4', '0.5'], retain k=2).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The first case is larger: 0.8559 versus 0.8805 under the complete set of stated assumptions
- **C.** The second case is larger: 0.8805 versus 0.8559
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.8805 versus 0.8559

**Explanation:** The same formula gives 0.8559 for P and 0.8805 for Q, establishing the stated comparison.

---

## Question 11

**Question:** How far apart are the Euclidean distance values for (x=['1.2', '2', '-1'], y=['-1', '1.1', '2']) and (x=['1.8', '2', '-1'], y=['-1', '1.4', '2'])?

**Choices:**
- **A.** absolute Euclidean distance difference = 0.3908
- **B.** absolute Euclidean distance difference = 0.3198
- **C.** absolute Euclidean distance difference = 0.2488
- **D.** absolute Euclidean distance difference = 0.4618

**Correct Answer:** absolute Euclidean distance difference = 0.3198

**Explanation:** The two values are 3.8275 and 4.1473; their absolute difference is 0.3198.

---

## Question 12

**Question:** How far apart are the cosine similarity values for (x=['1.2', '2', '-1'], y=['-1', '1.1', '2']) and (x=['1.8', '2', '-1'], y=['-1', '1.4', '2'])?

**Choices:**
- **A.** absolute cosine similarity difference = 0.0261
- **B.** absolute cosine similarity difference = 0.0971
- **C.** absolute cosine similarity difference = -0.0449
- **D.** absolute cosine similarity difference = 0.1681

**Correct Answer:** absolute cosine similarity difference = 0.0261

**Explanation:** The two values are -0.1581 and -0.132; their absolute difference is 0.0261.

---

## Question 13

**Question:** How far apart are the updated centroid x-coordinate values for (cluster points=[('0.2', '0'), ('2', '2.2')]) and (cluster points=[('0.8', '0'), ('2', '2.8')])?

**Choices:**
- **A.** absolute updated centroid x-coordinate difference = 0.371
- **B.** absolute updated centroid x-coordinate difference = 0.3
- **C.** absolute updated centroid x-coordinate difference = 0.229
- **D.** absolute updated centroid x-coordinate difference = 0.442

**Correct Answer:** absolute updated centroid x-coordinate difference = 0.3

**Explanation:** The two values are 1.1 and 1.4; their absolute difference is 0.3.

---

## Question 14

**Question:** How far apart are the average linkage values for (cross-cluster distances=['1.2', '3.1', '4.94', '4']) and (cross-cluster distances=['1.8', '3.4', '4.76', '4'])?

**Choices:**
- **A.** absolute average linkage difference = 0.18
- **B.** absolute average linkage difference = 0.251
- **C.** absolute average linkage difference = 0.109
- **D.** absolute average linkage difference = 0.322

**Correct Answer:** absolute average linkage difference = 0.18

**Explanation:** The two values are 3.31 and 3.49; their absolute difference is 0.18.

---

## Question 15

**Question:** How far apart are the PCA explained-variance ratio values for (eigenvalues=['7', '4', '1.2', '0.5'], retain k=2) and (eigenvalues=['13', '7', '1.8', '0.5'], retain k=2)?

**Choices:**
- **A.** absolute PCA explained-variance ratio difference = 0.1017
- **B.** absolute PCA explained-variance ratio difference = 0.0307
- **C.** absolute PCA explained-variance ratio difference = -0.0403
- **D.** absolute PCA explained-variance ratio difference = 0.1727

**Correct Answer:** absolute PCA explained-variance ratio difference = 0.0307

**Explanation:** The two values are 0.8661 and 0.8969; their absolute difference is 0.0307.

---

## Question 16

**Question:** Taking (x=['1.3', '2', '-1'], y=['-1', '1.15', '2']) as baseline and (x=['1.1', '2', '-1'], y=['-1', '1.05', '2']) as the new case, what is the percentage change in Euclidean distance?

**Choices:**
- **A.** percentage change in Euclidean distance = -2.7839
- **B.** percentage change in Euclidean distance = -1.9346
- **C.** percentage change in Euclidean distance = -2.3592
- **D.** percentage change in Euclidean distance = -1.5099

**Correct Answer:** percentage change in Euclidean distance = -2.3592

**Explanation:** The values change from 3.8746 to 3.7832; (new-old)/|old|*100=-2.3592%.

---

## Question 17

**Question:** Taking (x=['1.3', '2', '-1'], y=['-1', '1.15', '2']) as baseline and (x=['1.1', '2', '-1'], y=['-1', '1.05', '2']) as the new case, what is the percentage change in cosine similarity?

**Choices:**
- **A.** percentage change in cosine similarity = -4.6307
- **B.** percentage change in cosine similarity = -5.6471
- **C.** percentage change in cosine similarity = -6.6636
- **D.** percentage change in cosine similarity = -3.6142

**Correct Answer:** percentage change in cosine similarity = -5.6471

**Explanation:** The values change from -0.1538 to -0.1624; (new-old)/|old|*100=-5.6471%.

---

## Question 18

**Question:** Taking (cluster points=[('0.3', '0'), ('2', '2.3')]) as baseline and (cluster points=[('0.1', '0'), ('2', '2.1')]) as the new case, what is the percentage change in updated centroid x-coordinate?

**Choices:**
- **A.** percentage change in updated centroid x-coordinate = -10.2609
- **B.** percentage change in updated centroid x-coordinate = -7.1304
- **C.** percentage change in updated centroid x-coordinate = -8.6957
- **D.** percentage change in updated centroid x-coordinate = -5.5652

**Correct Answer:** percentage change in updated centroid x-coordinate = -8.6957

**Explanation:** The values change from 1.15 to 1.05; (new-old)/|old|*100=-8.6957%.

---

## Question 19

**Question:** Taking (cross-cluster distances=['1.3', '3.15', '4.91', '4']) as baseline and (cross-cluster distances=['1.1', '3.05', '4.97', '4']) as the new case, what is the percentage change in average linkage?

**Choices:**
- **A.** percentage change in average linkage = -1.1497
- **B.** percentage change in average linkage = -1.4731
- **C.** percentage change in average linkage = -2.1198
- **D.** percentage change in average linkage = -1.7964

**Correct Answer:** percentage change in average linkage = -1.7964

**Explanation:** The values change from 3.34 to 3.28; (new-old)/|old|*100=-1.7964%.

---

## Question 20

**Question:** Taking (eigenvalues=['8', '4.5', '1.3', '0.5'], retain k=2) as baseline and (eigenvalues=['6', '3.5', '1.1', '0.5'], retain k=2) as the new case, what is the percentage change in PCA explained-variance ratio?

**Choices:**
- **A.** percentage change in PCA explained-variance ratio = -1.7139
- **B.** percentage change in PCA explained-variance ratio = -2.0901
- **C.** percentage change in PCA explained-variance ratio = -2.4663
- **D.** percentage change in PCA explained-variance ratio = -1.3377

**Correct Answer:** percentage change in PCA explained-variance ratio = -2.0901

**Explanation:** The values change from 0.8741 to 0.8559; (new-old)/|old|*100=-2.0901%.

---

## Question 21

**Question:** Which formula must be applied to obtain Euclidean distance from the supplied chapter quantities?

**Choices:**
- **A.** For Euclidean distance, use $\sqrt{\sum_i(x_i-y_i)^2}$
- **B.** For Euclidean distance, use $1-\left(\sqrt{\sum_i(x_i-y_i)^2}\right)$
- **C.** For Euclidean distance, use $\sqrt{\sqrt{\sum_i(x_i-y_i)^2}}$
- **D.** For Euclidean distance, use sum inputs without the required weighting for Euclidean distance

**Correct Answer:** For Euclidean distance, use $\sqrt{\sum_i(x_i-y_i)^2}$

**Explanation:** The chapter defines Euclidean distance with $\sqrt{\sum_i(x_i-y_i)^2}$; the other expressions change an operation or omit required weighting.

---

## Question 22

**Question:** Which formula must be applied to obtain cosine similarity from the supplied chapter quantities?

**Choices:**
- **A.** For cosine similarity, use $\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}$
- **B.** For cosine similarity, use $1-\left(\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}\right)$
- **C.** For cosine similarity, use $\sqrt{\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}}$
- **D.** For cosine similarity, use sum inputs without the required weighting for cosine similarity

**Correct Answer:** For cosine similarity, use $\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}$

**Explanation:** The chapter defines cosine similarity with $\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}$; the other expressions change an operation or omit required weighting.

---

## Question 23

**Question:** Which formula must be applied to obtain updated centroid x-coordinate from the supplied chapter quantities?

**Choices:**
- **A.** For updated centroid x-coordinate, use $\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i$
- **B.** For updated centroid x-coordinate, use $1-\left(\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i\right)$
- **C.** For updated centroid x-coordinate, use $\sqrt{\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i}$
- **D.** For updated centroid x-coordinate, use sum inputs without the required weighting for updated centroid x-coordinate

**Correct Answer:** For updated centroid x-coordinate, use $\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i$

**Explanation:** The chapter defines updated centroid x-coordinate with $\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i$; the other expressions change an operation or omit required weighting.

---

## Question 24

**Question:** Which formula must be applied to obtain average linkage from the supplied chapter quantities?

**Choices:**
- **A.** For average linkage, use $\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)$
- **B.** For average linkage, use $1-\left(\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)\right)$
- **C.** For average linkage, use $\sqrt{\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)}$
- **D.** For average linkage, use sum inputs without the required weighting for average linkage

**Correct Answer:** For average linkage, use $\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)$

**Explanation:** The chapter defines average linkage with $\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)$; the other expressions change an operation or omit required weighting.

---

## Question 25

**Question:** Which formula must be applied to obtain PCA explained-variance ratio from the supplied chapter quantities?

**Choices:**
- **A.** For PCA explained-variance ratio, use sum inputs without the required weighting for PCA explained-variance ratio
- **B.** For PCA explained-variance ratio, use $1-\left(\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}\right)$
- **C.** For PCA explained-variance ratio, use $\sqrt{\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}}$
- **D.** For PCA explained-variance ratio, use $\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}$

**Correct Answer:** For PCA explained-variance ratio, use $\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}$

**Explanation:** The chapter defines PCA explained-variance ratio with $\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}$; the other expressions change an operation or omit required weighting.

---

## Question 26

**Question:** Four datasets are candidates. Which one produces Euclidean distance=3.9765?

**Choices:**
- **A.** For Euclidean distance, the first dataset: x=['1', '2', '-1'], y=['-1', '1', '2']
- **B.** For Euclidean distance, the third dataset: x=['1.5', '2', '-1'], y=['-1', '1.25', '2']
- **C.** For Euclidean distance, the second dataset: x=['1.2', '2', '-1'], y=['-1', '1.1', '2']
- **D.** For Euclidean distance, the fourth dataset: x=['1.8', '2', '-1'], y=['-1', '1.4', '2']

**Correct Answer:** For Euclidean distance, the third dataset: x=['1.5', '2', '-1'], y=['-1', '1.25', '2']

**Explanation:** Evaluating all four with $\sqrt{\sum_i(x_i-y_i)^2}$ shows that the third dataset produces 3.9765.

---

## Question 27

**Question:** Four datasets are candidates. Which one produces cosine similarity=-0.145?

**Choices:**
- **A.** For cosine similarity, the first dataset: x=['1', '2', '-1'], y=['-1', '1', '2']
- **B.** For cosine similarity, the third dataset: x=['1.5', '2', '-1'], y=['-1', '1.25', '2']
- **C.** For cosine similarity, the second dataset: x=['1.2', '2', '-1'], y=['-1', '1.1', '2']
- **D.** For cosine similarity, the fourth dataset: x=['1.8', '2', '-1'], y=['-1', '1.4', '2']

**Correct Answer:** For cosine similarity, the third dataset: x=['1.5', '2', '-1'], y=['-1', '1.25', '2']

**Explanation:** Evaluating all four with $\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}$ shows that the third dataset produces -0.145.

---

## Question 28

**Question:** Four datasets are candidates. Which one produces updated centroid x-coordinate=1.25?

**Choices:**
- **A.** For updated centroid x-coordinate, the second dataset: cluster points=[('0.2', '0'), ('2', '2.2')]
- **B.** For updated centroid x-coordinate, the first dataset: cluster points=[('0', '0'), ('2', '2')]
- **C.** For updated centroid x-coordinate, the third dataset: cluster points=[('0.5', '0'), ('2', '2.5')]
- **D.** For updated centroid x-coordinate, the fourth dataset: cluster points=[('0.8', '0'), ('2', '2.8')]

**Correct Answer:** For updated centroid x-coordinate, the third dataset: cluster points=[('0.5', '0'), ('2', '2.5')]

**Explanation:** Evaluating all four with $\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i$ shows that the third dataset produces 1.25.

---

## Question 29

**Question:** Four datasets are candidates. Which one produces average linkage=3.4?

**Choices:**
- **A.** For average linkage, the first dataset: cross-cluster distances=['1', '3', '5', '4']
- **B.** For average linkage, the third dataset: cross-cluster distances=['1.5', '3.25', '4.85', '4']
- **C.** For average linkage, the second dataset: cross-cluster distances=['1.2', '3.1', '4.94', '4']
- **D.** For average linkage, the fourth dataset: cross-cluster distances=['1.8', '3.4', '4.76', '4']

**Correct Answer:** For average linkage, the third dataset: cross-cluster distances=['1.5', '3.25', '4.85', '4']

**Explanation:** Evaluating all four with $\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)$ shows that the third dataset produces 3.4.

---

## Question 30

**Question:** Four datasets are candidates. Which one produces PCA explained-variance ratio=0.8857?

**Choices:**
- **A.** For PCA explained-variance ratio, the first dataset: eigenvalues=['5', '3', '1', '0.5'], retain k=2
- **B.** For PCA explained-variance ratio, the third dataset: eigenvalues=['10', '5.5', '1.5', '0.5'], retain k=2
- **C.** For PCA explained-variance ratio, the second dataset: eigenvalues=['7', '4', '1.2', '0.5'], retain k=2
- **D.** For PCA explained-variance ratio, the fourth dataset: eigenvalues=['13', '7', '1.8', '0.5'], retain k=2 under the complete set of stated assumptions

**Correct Answer:** For PCA explained-variance ratio, the third dataset: eigenvalues=['10', '5.5', '1.5', '0.5'], retain k=2

**Explanation:** Evaluating all four with $\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}$ shows that the third dataset produces 0.8857.

---

## Question 31

**Question:** For x=['1.6', '2', '-1'], y=['-1', '1.3', '2'], a student reports Euclidean distance=5.0389. What corrected value should replace it?

**Choices:**
- **A.** corrected Euclidean distance = 4.0311
- **B.** corrected Euclidean distance = 4.7567
- **C.** corrected Euclidean distance = 3.3055
- **D.** corrected Euclidean distance = 5.4823

**Correct Answer:** corrected Euclidean distance = 4.0311

**Explanation:** Recomputing with $\sqrt{\sum_i(x_i-y_i)^2}$ gives 4.0311, so the reported 5.0389 is rejected.

---

## Question 32

**Question:** For x=['1.6', '2', '-1'], y=['-1', '1.3', '2'], a student reports cosine similarity=-0.0406. What corrected value should replace it?

**Choices:**
- **A.** corrected cosine similarity = -0.1406
- **B.** corrected cosine similarity = -0.0696
- **C.** corrected cosine similarity = -0.2116
- **D.** corrected cosine similarity = 0.0014

**Correct Answer:** corrected cosine similarity = -0.1406

**Explanation:** Recomputing with $\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}$ gives -0.1406, so the reported -0.0406 is rejected.

---

## Question 33

**Question:** For cluster points=[('0.6', '0'), ('2', '2.6')], a student reports updated centroid x-coordinate=1.625. What corrected value should replace it?

**Choices:**
- **A.** corrected updated centroid x-coordinate = 1.534
- **B.** corrected updated centroid x-coordinate = 1.3
- **C.** corrected updated centroid x-coordinate = 1.066
- **D.** corrected updated centroid x-coordinate = 1.768

**Correct Answer:** corrected updated centroid x-coordinate = 1.3

**Explanation:** Recomputing with $\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i$ gives 1.3, so the reported 1.625 is rejected.

---

## Question 34

**Question:** For cross-cluster distances=['1.6', '3.3', '4.82', '4'], a student reports average linkage=4.2875. What corrected value should replace it?

**Choices:**
- **A.** corrected average linkage = 4.6648
- **B.** corrected average linkage = 4.0474
- **C.** corrected average linkage = 2.8126
- **D.** corrected average linkage = 3.43

**Correct Answer:** corrected average linkage = 3.43

**Explanation:** Recomputing with $\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)$ gives 3.43, so the reported 4.2875 is rejected.

---

## Question 35

**Question:** For eigenvalues=['11', '6', '1.6', '0.5'], retain k=2, a student reports PCA explained-variance ratio=1.1126. What corrected value should replace it?

**Choices:**
- **A.** corrected PCA explained-variance ratio = 0.8901
- **B.** corrected PCA explained-variance ratio = 1.0503
- **C.** corrected PCA explained-variance ratio = 0.7298
- **D.** corrected PCA explained-variance ratio = 1.2105

**Correct Answer:** corrected PCA explained-variance ratio = 0.8901

**Explanation:** Recomputing with $\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}$ gives 0.8901, so the reported 1.1126 is rejected.

---

## Question 36

**Question:** Compute Euclidean distance separately for (x=['1.7', '2', '-1'], y=['-1', '1.35', '2']) and (x=['1', '2', '-1'], y=['-1', '1', '2']), then average the two results.

**Choices:**
- **A.** mean of the two Euclidean distance values = 5.3242
- **B.** mean of the two Euclidean distance values = 4.6196
- **C.** mean of the two Euclidean distance values = 3.2102
- **D.** mean of the two Euclidean distance values = 3.9149

**Correct Answer:** mean of the two Euclidean distance values = 3.9149

**Explanation:** The individual results are 4.0881 and 3.7417; their arithmetic mean is 3.9149.

---

## Question 37

**Question:** Compute cosine similarity separately for (x=['1.7', '2', '-1'], y=['-1', '1.35', '2']) and (x=['1', '2', '-1'], y=['-1', '1', '2']), then average the two results.

**Choices:**
- **A.** mean of the two cosine similarity values = -0.0805
- **B.** mean of the two cosine similarity values = -0.1515
- **C.** mean of the two cosine similarity values = -0.2225
- **D.** mean of the two cosine similarity values = -0.0095

**Correct Answer:** mean of the two cosine similarity values = -0.1515

**Explanation:** The individual results are -0.1363 and -0.1667; their arithmetic mean is -0.1515.

---

## Question 38

**Question:** Compute updated centroid x-coordinate separately for (cluster points=[('0.7', '0'), ('2', '2.7')]) and (cluster points=[('0', '0'), ('2', '2')]), then average the two results.

**Choices:**
- **A.** mean of the two updated centroid x-coordinate values = 1.598
- **B.** mean of the two updated centroid x-coordinate values = 1.3865
- **C.** mean of the two updated centroid x-coordinate values = 0.9635
- **D.** mean of the two updated centroid x-coordinate values = 1.175

**Correct Answer:** mean of the two updated centroid x-coordinate values = 1.175

**Explanation:** The individual results are 1.35 and 1; their arithmetic mean is 1.175.

---

## Question 39

**Question:** Compute average linkage separately for (cross-cluster distances=['1.7', '3.35', '4.79', '4']) and (cross-cluster distances=['1', '3', '5', '4']), then average the two results.

**Choices:**
- **A.** mean of the two average linkage values = 2.7511
- **B.** mean of the two average linkage values = 3.9589
- **C.** mean of the two average linkage values = 3.355
- **D.** mean of the two average linkage values = 4.5628

**Correct Answer:** mean of the two average linkage values = 3.355

**Explanation:** The individual results are 3.46 and 3.25; their arithmetic mean is 3.355.

---

## Question 40

**Question:** Compute PCA explained-variance ratio separately for (eigenvalues=['12', '6.5', '1.7', '0.5'], retain k=2) and (eigenvalues=['5', '3', '1', '0.5'], retain k=2), then average the two results.

**Choices:**
- **A.** mean of the two PCA explained-variance ratio values = 1.0241
- **B.** mean of the two PCA explained-variance ratio values = 0.8679
- **C.** mean of the two PCA explained-variance ratio values = 0.7117
- **D.** mean of the two PCA explained-variance ratio values = 1.1804

**Correct Answer:** mean of the two PCA explained-variance ratio values = 0.8679

**Explanation:** The individual results are 0.8937 and 0.8421; their arithmetic mean is 0.8679.

---

## Question 41

**Question:** After the data change from (x=['1.8', '2', '-1'], y=['-1', '1.4', '2']) to (x=['1.6', '2', '-1'], y=['-1', '1.3', '2']), what is the new Euclidean distance?

**Choices:**
- **A.** Euclidean distance = 4.0311
- **B.** Euclidean distance = 4.7567
- **C.** Euclidean distance = 3.3055
- **D.** Euclidean distance = 5.4823

**Correct Answer:** Euclidean distance = 4.0311

**Explanation:** Only the new data enter $\sqrt{\sum_i(x_i-y_i)^2}$; they produce 4.0311.

---

## Question 42

**Question:** After the data change from (x=['1.8', '2', '-1'], y=['-1', '1.4', '2']) to (x=['1.6', '2', '-1'], y=['-1', '1.3', '2']), what is the new cosine similarity?

**Choices:**
- **A.** cosine similarity = -0.1406
- **B.** cosine similarity = -0.0696
- **C.** cosine similarity = -0.2116
- **D.** cosine similarity = 0.0014

**Correct Answer:** cosine similarity = -0.1406

**Explanation:** Only the new data enter $\frac{x^\top y}{\lVert x\rVert\lVert y\rVert}$; they produce -0.1406.

---

## Question 43

**Question:** After the data change from (cluster points=[('0.8', '0'), ('2', '2.8')]) to (cluster points=[('0.6', '0'), ('2', '2.6')]), what is the new updated centroid x-coordinate?

**Choices:**
- **A.** updated centroid x-coordinate = 1.066
- **B.** updated centroid x-coordinate = 1.534
- **C.** updated centroid x-coordinate = 1.3
- **D.** updated centroid x-coordinate = 1.768

**Correct Answer:** updated centroid x-coordinate = 1.3

**Explanation:** Only the new data enter $\frac{1}{|C_k|}\sum_{x_i\in C_k}x_i$; they produce 1.3.

---

## Question 44

**Question:** After the data change from (cross-cluster distances=['1.8', '3.4', '4.76', '4']) to (cross-cluster distances=['1.6', '3.3', '4.82', '4']), what is the new average linkage?

**Choices:**
- **A.** average linkage = 2.8126
- **B.** average linkage = 4.0474
- **C.** average linkage = 3.43
- **D.** average linkage = 4.6648

**Correct Answer:** average linkage = 3.43

**Explanation:** Only the new data enter $\frac{1}{|A||B|}\sum_{x\in A}\sum_{y\in B}d(x,y)$; they produce 3.43.

---

## Question 45

**Question:** After the data change from (eigenvalues=['13', '7', '1.8', '0.5'], retain k=2) to (eigenvalues=['11', '6', '1.6', '0.5'], retain k=2), what is the new PCA explained-variance ratio?

**Choices:**
- **A.** PCA explained-variance ratio = 0.8901
- **B.** PCA explained-variance ratio = 1.0503
- **C.** PCA explained-variance ratio = 0.7298
- **D.** PCA explained-variance ratio = 1.2105

**Correct Answer:** PCA explained-variance ratio = 0.8901

**Explanation:** Only the new data enter $\frac{\sum_{i=1}^{k}\lambda_i}{\sum_{i=1}^{n}\lambda_i}$; they produce 0.8901.

---

## Question 46

**Question:** Rank P, Q, R, S from largest to smallest Euclidean distance: P(x=['1.1', '2', '-1'], y=['-1', '1.05', '2']), Q(x=['1.3', '2', '-1'], y=['-1', '1.15', '2']), R(x=['1.6', '2', '-1'], y=['-1', '1.3', '2']), S(x=['1.9', '2', '-1'], y=['-1', '1.45', '2']).

**Choices:**
- **A.** Euclidean distance ranking: P > Q > R > S
- **B.** Euclidean distance ranking: S > R > Q > P
- **C.** Euclidean distance ranking: P = Q = R = S
- **D.** Euclidean distance ranking: Q > P > S > R

**Correct Answer:** Euclidean distance ranking: S > R > Q > P

**Explanation:** Their values are {'P': '3.7832', 'Q': '3.8746', 'R': '4.0311', 'S': '4.2086'}; grouping equal values and sorting descending gives Euclidean distance ranking: S > R > Q > P.

---

## Question 47

**Question:** Rank P, Q, R, S from largest to smallest cosine similarity: P(x=['1.1', '2', '-1'], y=['-1', '1.05', '2']), Q(x=['1.3', '2', '-1'], y=['-1', '1.15', '2']), R(x=['1.6', '2', '-1'], y=['-1', '1.3', '2']), S(x=['1.9', '2', '-1'], y=['-1', '1.45', '2']).

**Choices:**
- **A.** cosine similarity ranking: Q > P > S > R
- **B.** cosine similarity ranking: P > Q > R > S
- **C.** cosine similarity ranking: P = Q = R = S
- **D.** cosine similarity ranking: S > R > Q > P

**Correct Answer:** cosine similarity ranking: S > R > Q > P

**Explanation:** Their values are {'P': '-0.1624', 'Q': '-0.1538', 'R': '-0.1406', 'S': '-0.1279'}; grouping equal values and sorting descending gives cosine similarity ranking: S > R > Q > P.

---

## Question 48

**Question:** Rank P, Q, R, S from largest to smallest updated centroid x-coordinate: P(cluster points=[('0.1', '0'), ('2', '2.1')]), Q(cluster points=[('0.3', '0'), ('2', '2.3')]), R(cluster points=[('0.6', '0'), ('2', '2.6')]), S(cluster points=[('0.9', '0'), ('2', '2.9')]).

**Choices:**
- **A.** updated centroid x-coordinate ranking: Q > P > S > R
- **B.** updated centroid x-coordinate ranking: P > Q > R > S
- **C.** updated centroid x-coordinate ranking: P = Q = R = S
- **D.** updated centroid x-coordinate ranking: S > R > Q > P

**Correct Answer:** updated centroid x-coordinate ranking: S > R > Q > P

**Explanation:** Their values are {'P': '1.05', 'Q': '1.15', 'R': '1.3', 'S': '1.45'}; grouping equal values and sorting descending gives updated centroid x-coordinate ranking: S > R > Q > P.

---

## Question 49

**Question:** Rank P, Q, R, S from largest to smallest average linkage: P(cross-cluster distances=['1.1', '3.05', '4.97', '4']), Q(cross-cluster distances=['1.3', '3.15', '4.91', '4']), R(cross-cluster distances=['1.6', '3.3', '4.82', '4']), S(cross-cluster distances=['1.9', '3.45', '4.73', '4']).

**Choices:**
- **A.** average linkage ranking: Q > P > S > R
- **B.** average linkage ranking: P > Q > R > S
- **C.** average linkage ranking: P = Q = R = S
- **D.** average linkage ranking: S > R > Q > P

**Correct Answer:** average linkage ranking: S > R > Q > P

**Explanation:** Their values are {'P': '3.28', 'Q': '3.34', 'R': '3.43', 'S': '3.52'}; grouping equal values and sorting descending gives average linkage ranking: S > R > Q > P.

---

## Question 50

**Question:** Rank P, Q, R, S from largest to smallest PCA explained-variance ratio: P(eigenvalues=['6', '3.5', '1.1', '0.5'], retain k=2), Q(eigenvalues=['8', '4.5', '1.3', '0.5'], retain k=2), R(eigenvalues=['11', '6', '1.6', '0.5'], retain k=2), S(eigenvalues=['14', '7.5', '1.9', '0.5'], retain k=2).

**Choices:**
- **A.** PCA explained-variance ratio ranking: P = Q = R = S
- **B.** PCA explained-variance ratio ranking: P > Q > R > S
- **C.** PCA explained-variance ratio ranking: S > R > Q > P
- **D.** PCA explained-variance ratio ranking: Q > P > S > R

**Correct Answer:** PCA explained-variance ratio ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.8559', 'Q': '0.8741', 'R': '0.8901', 'S': '0.8996'}; grouping equal values and sorting descending gives PCA explained-variance ratio ranking: S > R > Q > P.

---

## Question 51

**Question:** Which statement correctly characterizes cosine scale invariance?

**Choices:**
- **A.** Cosine similarity increases whenever both vector norms increase. for all permitted parameter values
- **B.** Cosine similarity is always the Euclidean distance.
- **C.** Cosine similarity is undefined for every non-unit vector.
- **D.** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Correct Answer:** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Explanation:** For cosine scale invariance, the accurate statement is the first one because The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 52

**Question:** Which statement correctly characterizes K-Means alternation?

**Choices:**
- **A.** K-Means updates centroids using the farthest point only.
- **B.** K-Means infers K exclusively from zero Laplacian eigenvalues. under every stated condition
- **C.** K-Means alternates nearest-centroid assignment and mean-based centroid updates.
- **D.** K-Means assigns fractional memberships that must sum to one.

**Correct Answer:** K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Explanation:** For K-Means alternation, the accurate statement is the first one because The chapter describes hard assignment followed by arithmetic means.

---

## Question 53

**Question:** Which statement correctly characterizes single linkage?

**Choices:**
- **A.** Single linkage is the PCA explained-variance ratio.
- **B.** Single linkage uses the maximum cross-cluster pair distance.
- **C.** Single linkage averages only within-cluster distances.
- **D.** Single linkage uses the minimum cross-cluster pair distance.

**Correct Answer:** Single linkage uses the minimum cross-cluster pair distance.

**Explanation:** For single linkage, the accurate statement is the first one because Minimum pairwise distance defines single linkage.

---

## Question 54

**Question:** Which statement correctly characterizes complete linkage?

**Choices:**
- **A.** Complete linkage uses the maximum cross-cluster pair distance.
- **B.** Complete linkage uses the minimum pair distance.
- **C.** Complete linkage is always identical to average linkage. for all permitted parameter values
- **D.** Complete linkage projects points onto eigenvectors.

**Correct Answer:** Complete linkage uses the maximum cross-cluster pair distance.

**Explanation:** For complete linkage, the accurate statement is the first one because Maximum pairwise separation defines complete linkage.

---

## Question 55

**Question:** Which statement correctly characterizes $L=D-W$?

**Choices:**
- **A.** The unnormalized graph Laplacian is $L=D-W$.
- **B.** The graph Laplacian is W-D with no sign convention in the chapter.
- **C.** The graph Laplacian is the covariance X^T X only.
- **D.** The degree matrix contains eigenvectors in its diagonal.

**Correct Answer:** The unnormalized graph Laplacian is $L=D-W$.

**Explanation:** For $L=D-W$, the accurate statement is the first one because D contains row sums of W and L subtracts W.

---

## Question 56

**Question:** Which statement correctly characterizes zero Laplacian eigenvalues?

**Choices:**
- **A.** The number of zero Laplacian eigenvalues is related to connected-component count.
- **B.** Every graph has exactly two zero eigenvalues.
- **C.** A zero eigenvalue proves every edge weight is negative.
- **D.** Zero eigenvalues determine the requested K-Means centroid values. without changing the supplied data

**Correct Answer:** The number of zero Laplacian eigenvalues is related to connected-component count.

**Explanation:** For zero Laplacian eigenvalues, the accurate statement is the first one because Disconnected components contribute independent constant eigenvectors.

---

## Question 57

**Question:** Which statement correctly characterizes the Fiedler vector?

**Choices:**
- **A.** It sorts points by Euclidean norm and ignores the graph.
- **B.** It uses the largest covariance eigenvector to assign labels. for all permitted parameter values
- **C.** It uses the all-ones zero-eigenvalue vector for every split.
- **D.** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Correct Answer:** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Explanation:** For the Fiedler vector, the accurate statement is the first one because The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 58

**Question:** Which statement correctly characterizes PCA centering?

**Choices:**
- **A.** PCA chooses directions of minimum retained variance first. under every stated condition
- **B.** PCA must one-hot encode each principal component.
- **C.** PCA first centers data before forming the stated covariance matrix.
- **D.** PCA requires labelled class targets for covariance.

**Correct Answer:** PCA first centers data before forming the stated covariance matrix.

**Explanation:** For PCA centering, the accurate statement is the first one because Mean normalization makes covariance describe variation about the center.

---

## Question 59

**Question:** Which statement correctly characterizes eigenvalue ordering?

**Choices:**
- **A.** PCA retains only zero-eigenvalue directions.
- **B.** PCA sorts eigenvectors alphabetically by feature name. without changing the supplied data
- **C.** PCA retains eigenvectors associated with the largest eigenvalues.
- **D.** PCA chooses components using class-label accuracy.

**Correct Answer:** PCA retains eigenvectors associated with the largest eigenvalues.

**Explanation:** For eigenvalue ordering, the accurate statement is the first one because Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 60

**Question:** Which statement correctly characterizes approximate reconstruction?

**Choices:**
- **A.** Projection preserves every coordinate exactly for any k.
- **B.** Reconstruction requires a supervised target label.
- **C.** PCA reconstruction after dimensionality reduction is generally approximate.
- **D.** Eigenfaces cannot be linearly combined into an approximate face. for all permitted parameter values

**Correct Answer:** PCA reconstruction after dimensionality reduction is generally approximate.

**Explanation:** For approximate reconstruction, the accurate statement is the first one because Discarded components lose variance, so U_reduce z approximates the centered input.

---

## Question 61

**Question:** A student writes, “Cosine similarity is always the Euclidean distance.” Which replacement correctly repairs the claim about cosine scale invariance?

**Choices:**
- **A.** Replace it with: Cosine similarity is undefined for every non-unit vector.
- **B.** Replace it with: Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.
- **C.** Replace it with: Cosine similarity increases whenever both vector norms increase. under every stated condition
- **D.** Replace it with: Cosine similarity is always the Euclidean distance.

**Correct Answer:** Replace it with: Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 62

**Question:** A student writes, “K-Means updates centroids using the farthest point only.” Which replacement correctly repairs the claim about K-Means alternation?

**Choices:**
- **A.** Replace it with: K-Means alternates nearest-centroid assignment and mean-based centroid updates.
- **B.** Replace it with: K-Means updates centroids using the farthest point only.
- **C.** Replace it with: K-Means infers K exclusively from zero Laplacian eigenvalues. without changing the supplied data
- **D.** Replace it with: K-Means assigns fractional memberships that must sum to one.

**Correct Answer:** Replace it with: K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The chapter describes hard assignment followed by arithmetic means.

---

## Question 63

**Question:** A student writes, “Single linkage uses the maximum cross-cluster pair distance.” Which replacement correctly repairs the claim about single linkage?

**Choices:**
- **A.** Replace it with: Single linkage uses the minimum cross-cluster pair distance.
- **B.** Replace it with: Single linkage uses the maximum cross-cluster pair distance.
- **C.** Replace it with: Single linkage averages only within-cluster distances.
- **D.** Replace it with: Single linkage is the PCA explained-variance ratio.

**Correct Answer:** Replace it with: Single linkage uses the minimum cross-cluster pair distance.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Minimum pairwise distance defines single linkage.

---

## Question 64

**Question:** A student writes, “Complete linkage uses the minimum pair distance.” Which replacement correctly repairs the claim about complete linkage?

**Choices:**
- **A.** Replace it with: Complete linkage is always identical to average linkage. under every stated condition
- **B.** Replace it with: Complete linkage uses the maximum cross-cluster pair distance.
- **C.** Replace it with: Complete linkage uses the minimum pair distance.
- **D.** Replace it with: Complete linkage projects points onto eigenvectors.

**Correct Answer:** Replace it with: Complete linkage uses the maximum cross-cluster pair distance.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Maximum pairwise separation defines complete linkage.

---

## Question 65

**Question:** A student writes, “The graph Laplacian is W-D with no sign convention in the chapter.” Which replacement correctly repairs the claim about $L=D-W$?

**Choices:**
- **A.** Replace it with: The graph Laplacian is the covariance X^T X only.
- **B.** Replace it with: The graph Laplacian is W-D with no sign convention in the chapter.
- **C.** Replace it with: The unnormalized graph Laplacian is $L=D-W$.
- **D.** Replace it with: The degree matrix contains eigenvectors in its diagonal.

**Correct Answer:** Replace it with: The unnormalized graph Laplacian is $L=D-W$.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because D contains row sums of W and L subtracts W.

---

## Question 66

**Question:** A student writes, “Every graph has exactly two zero eigenvalues.” Which replacement correctly repairs the claim about zero Laplacian eigenvalues?

**Choices:**
- **A.** Replace it with: The number of zero Laplacian eigenvalues is related to connected-component count.
- **B.** Replace it with: Every graph has exactly two zero eigenvalues.
- **C.** Replace it with: A zero eigenvalue proves every edge weight is negative.
- **D.** Replace it with: Zero eigenvalues determine the requested K-Means centroid values. for all permitted parameter values

**Correct Answer:** Replace it with: The number of zero Laplacian eigenvalues is related to connected-component count.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Disconnected components contribute independent constant eigenvectors.

---

## Question 67

**Question:** A student writes, “It uses the largest covariance eigenvector to assign labels.” Which replacement correctly repairs the claim about the Fiedler vector?

**Choices:**
- **A.** Replace it with: It uses the all-ones zero-eigenvalue vector for every split.
- **B.** Replace it with: It uses the largest covariance eigenvector to assign labels. under every stated condition
- **C.** Replace it with: A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.
- **D.** Replace it with: It sorts points by Euclidean norm and ignores the graph.

**Correct Answer:** Replace it with: A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 68

**Question:** A student writes, “PCA must one-hot encode each principal component.” Which replacement correctly repairs the claim about PCA centering?

**Choices:**
- **A.** Replace it with: PCA chooses directions of minimum retained variance first. without changing the supplied data
- **B.** Replace it with: PCA must one-hot encode each principal component.
- **C.** Replace it with: PCA first centers data before forming the stated covariance matrix.
- **D.** Replace it with: PCA requires labelled class targets for covariance.

**Correct Answer:** Replace it with: PCA first centers data before forming the stated covariance matrix.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Mean normalization makes covariance describe variation about the center.

---

## Question 69

**Question:** A student writes, “PCA retains only zero-eigenvalue directions.” Which replacement correctly repairs the claim about eigenvalue ordering?

**Choices:**
- **A.** Replace it with: PCA chooses components using class-label accuracy.
- **B.** Replace it with: PCA retains only zero-eigenvalue directions.
- **C.** Replace it with: PCA retains eigenvectors associated with the largest eigenvalues.
- **D.** Replace it with: PCA sorts eigenvectors alphabetically by feature name. for all permitted parameter values

**Correct Answer:** Replace it with: PCA retains eigenvectors associated with the largest eigenvalues.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 70

**Question:** A student writes, “Projection preserves every coordinate exactly for any k.” Which replacement correctly repairs the claim about approximate reconstruction?

**Choices:**
- **A.** Replace it with: PCA reconstruction after dimensionality reduction is generally approximate.
- **B.** Replace it with: Projection preserves every coordinate exactly for any k.
- **C.** Replace it with: Reconstruction requires a supervised target label.
- **D.** Replace it with: Eigenfaces cannot be linearly combined into an approximate face. under every stated condition

**Correct Answer:** Replace it with: PCA reconstruction after dimensionality reduction is generally approximate.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Discarded components lose variance, so U_reduce z approximates the centered input.

---

## Question 71

**Question:** A student's answer about cosine scale invariance contains the claim “Cosine similarity is always the Euclidean distance.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns cosine scale invariance but is only a harmless change of notation
- **B.** The quoted claim about cosine scale invariance is correct without qualification
- **C.** The quoted claim about cosine scale invariance is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about cosine scale invariance is false and must be replaced

**Explanation:** The quoted claim contradicts cosine scale invariance; it must be replaced by Cosine similarity depends on direction and is unchanged by positive rescaling of one vector..

---

## Question 72

**Question:** A student's answer about K-Means alternation contains the claim “K-Means updates centroids using the farthest point only.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about K-Means alternation is correct without qualification
- **C.** The quoted claim about K-Means alternation is false and must be replaced
- **D.** The quoted claim concerns K-Means alternation but is only a harmless change of notation

**Correct Answer:** The quoted claim about K-Means alternation is false and must be replaced

**Explanation:** The quoted claim contradicts K-Means alternation; it must be replaced by K-Means alternates nearest-centroid assignment and mean-based centroid updates..

---

## Question 73

**Question:** A student's answer about single linkage contains the claim “Single linkage uses the maximum cross-cluster pair distance.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns single linkage but is only a harmless change of notation
- **B.** The quoted claim about single linkage is correct without qualification
- **C.** The quoted claim about single linkage is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about single linkage is false and must be replaced

**Explanation:** The quoted claim contradicts single linkage; it must be replaced by Single linkage uses the minimum cross-cluster pair distance..

---

## Question 74

**Question:** A student's answer about complete linkage contains the claim “Complete linkage uses the minimum pair distance.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about complete linkage is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns complete linkage but is only a harmless change of notation
- **D.** The quoted claim about complete linkage is false and must be replaced

**Correct Answer:** The quoted claim about complete linkage is false and must be replaced

**Explanation:** The quoted claim contradicts complete linkage; it must be replaced by Complete linkage uses the maximum cross-cluster pair distance..

---

## Question 75

**Question:** A student's answer about $L=D-W$ contains the claim “The graph Laplacian is W-D with no sign convention in the chapter.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about $L=D-W$ is correct without qualification
- **B.** The quoted claim concerns $L=D-W$ but is only a harmless change of notation
- **C.** The quoted claim about $L=D-W$ is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about $L=D-W$ is false and must be replaced

**Explanation:** The quoted claim contradicts $L=D-W$; it must be replaced by The unnormalized graph Laplacian is $L=D-W$..

---

## Question 76

**Question:** A student's answer about zero Laplacian eigenvalues contains the claim “Every graph has exactly two zero eigenvalues.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about zero Laplacian eigenvalues is correct without qualification
- **B.** The quoted claim about zero Laplacian eigenvalues is false and must be replaced
- **C.** The quoted claim concerns zero Laplacian eigenvalues but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about zero Laplacian eigenvalues is false and must be replaced

**Explanation:** The quoted claim contradicts zero Laplacian eigenvalues; it must be replaced by the chapter's stated rule.

---

## Question 77

**Question:** A student's answer about the Fiedler vector contains the claim “It uses the largest covariance eigenvector to assign labels.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about the Fiedler vector is correct without qualification
- **B.** The quoted claim about the Fiedler vector is false and must be replaced
- **C.** The quoted claim concerns the Fiedler vector but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about the Fiedler vector is false and must be replaced

**Explanation:** The quoted claim contradicts the Fiedler vector; it must be replaced by A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue..

---

## Question 78

**Question:** A student's answer about PCA centering contains the claim “PCA must one-hot encode each principal component.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about PCA centering is false and must be replaced
- **B.** The quoted claim about PCA centering is correct without qualification
- **C.** The quoted claim concerns PCA centering but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about PCA centering is false and must be replaced

**Explanation:** The quoted claim contradicts PCA centering; it must be replaced by the chapter's stated rule.

---

## Question 79

**Question:** A student's answer about eigenvalue ordering contains the claim “PCA retains only zero-eigenvalue directions.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about eigenvalue ordering is false and must be replaced
- **B.** The quoted claim about eigenvalue ordering is correct without qualification
- **C.** The quoted claim concerns eigenvalue ordering but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about eigenvalue ordering is false and must be replaced

**Explanation:** The quoted claim contradicts eigenvalue ordering; it must be replaced by PCA retains eigenvectors associated with the largest eigenvalues..

---

## Question 80

**Question:** A student's answer about approximate reconstruction contains the claim “Projection preserves every coordinate exactly for any k.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about approximate reconstruction is correct without qualification
- **B.** The quoted claim concerns approximate reconstruction but is only a harmless change of notation
- **C.** The quoted claim about approximate reconstruction is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about approximate reconstruction is false and must be replaced

**Explanation:** The quoted claim contradicts approximate reconstruction; it must be replaced by PCA reconstruction after dimensionality reduction is generally approximate..

---

## Question 81

**Question:** An implementation is designed around the rule “Cosine similarity increases whenever both vector norms increase.” Which principle exposes the design error concerning cosine scale invariance?

**Choices:**
- **A.** Required principle: Cosine similarity is undefined for every non-unit vector.
- **B.** Required principle: Cosine similarity is always the Euclidean distance.
- **C.** Required principle: Cosine similarity increases whenever both vector norms increase. for all permitted parameter values
- **D.** Required principle: Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Correct Answer:** Required principle: Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Explanation:** The implementation encodes a false rule. The required principle follows because The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 82

**Question:** An implementation is designed around the rule “K-Means infers K exclusively from zero Laplacian eigenvalues.” Which principle exposes the design error concerning K-Means alternation?

**Choices:**
- **A.** Required principle: K-Means updates centroids using the farthest point only.
- **B.** Required principle: K-Means alternates nearest-centroid assignment and mean-based centroid updates.
- **C.** Required principle: K-Means infers K exclusively from zero Laplacian eigenvalues. under every stated condition
- **D.** Required principle: K-Means assigns fractional memberships that must sum to one.

**Correct Answer:** Required principle: K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Explanation:** The implementation encodes a false rule. The required principle follows because The chapter describes hard assignment followed by arithmetic means.

---

## Question 83

**Question:** An implementation is designed around the rule “Single linkage averages only within-cluster distances.” Which principle exposes the design error concerning single linkage?

**Choices:**
- **A.** Required principle: Single linkage averages only within-cluster distances.
- **B.** Required principle: Single linkage uses the maximum cross-cluster pair distance.
- **C.** Required principle: Single linkage is the PCA explained-variance ratio.
- **D.** Required principle: Single linkage uses the minimum cross-cluster pair distance.

**Correct Answer:** Required principle: Single linkage uses the minimum cross-cluster pair distance.

**Explanation:** The implementation encodes a false rule. The required principle follows because Minimum pairwise distance defines single linkage.

---

## Question 84

**Question:** An implementation is designed around the rule “Complete linkage is always identical to average linkage.” Which principle exposes the design error concerning complete linkage?

**Choices:**
- **A.** Required principle: Complete linkage projects points onto eigenvectors.
- **B.** Required principle: Complete linkage uses the minimum pair distance.
- **C.** Required principle: Complete linkage is always identical to average linkage. for all permitted parameter values
- **D.** Required principle: Complete linkage uses the maximum cross-cluster pair distance.

**Correct Answer:** Required principle: Complete linkage uses the maximum cross-cluster pair distance.

**Explanation:** The implementation encodes a false rule. The required principle follows because Maximum pairwise separation defines complete linkage.

---

## Question 85

**Question:** An implementation is designed around the rule “The graph Laplacian is the covariance X^T X only.” Which principle exposes the design error concerning $L=D-W$?

**Choices:**
- **A.** Required principle: The graph Laplacian is W-D with no sign convention in the chapter.
- **B.** Required principle: The unnormalized graph Laplacian is $L=D-W$.
- **C.** Required principle: The graph Laplacian is the covariance X^T X only.
- **D.** Required principle: The degree matrix contains eigenvectors in its diagonal.

**Correct Answer:** Required principle: The unnormalized graph Laplacian is $L=D-W$.

**Explanation:** The implementation encodes a false rule. The required principle follows because D contains row sums of W and L subtracts W.

---

## Question 86

**Question:** An implementation is designed around the rule “A zero eigenvalue proves every edge weight is negative.” Which principle exposes the design error concerning zero Laplacian eigenvalues?

**Choices:**
- **A.** Required principle: A zero eigenvalue proves every edge weight is negative.
- **B.** Required principle: Every graph has exactly two zero eigenvalues.
- **C.** Required principle: The number of zero Laplacian eigenvalues is related to connected-component count.
- **D.** Required principle: Zero eigenvalues determine the requested K-Means centroid values. without changing the supplied data

**Correct Answer:** Required principle: The number of zero Laplacian eigenvalues is related to connected-component count.

**Explanation:** The implementation encodes a false rule. The required principle follows because Disconnected components contribute independent constant eigenvectors.

---

## Question 87

**Question:** An implementation is designed around the rule “It uses the all-ones zero-eigenvalue vector for every split.” Which principle exposes the design error concerning the Fiedler vector?

**Choices:**
- **A.** Required principle: It sorts points by Euclidean norm and ignores the graph.
- **B.** Required principle: A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.
- **C.** Required principle: It uses the all-ones zero-eigenvalue vector for every split.
- **D.** Required principle: It uses the largest covariance eigenvector to assign labels. for all permitted parameter values

**Correct Answer:** Required principle: A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Explanation:** The implementation encodes a false rule. The required principle follows because The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 88

**Question:** An implementation is designed around the rule “PCA chooses directions of minimum retained variance first.” Which principle exposes the design error concerning PCA centering?

**Choices:**
- **A.** Required principle: PCA must one-hot encode each principal component.
- **B.** Required principle: PCA requires labelled class targets for covariance.
- **C.** Required principle: PCA chooses directions of minimum retained variance first. under every stated condition
- **D.** Required principle: PCA first centers data before forming the stated covariance matrix.

**Correct Answer:** Required principle: PCA first centers data before forming the stated covariance matrix.

**Explanation:** The implementation encodes a false rule. The required principle follows because Mean normalization makes covariance describe variation about the center.

---

## Question 89

**Question:** An implementation is designed around the rule “PCA sorts eigenvectors alphabetically by feature name.” Which principle exposes the design error concerning eigenvalue ordering?

**Choices:**
- **A.** Required principle: PCA chooses components using class-label accuracy.
- **B.** Required principle: PCA retains only zero-eigenvalue directions.
- **C.** Required principle: PCA sorts eigenvectors alphabetically by feature name. without changing the supplied data
- **D.** Required principle: PCA retains eigenvectors associated with the largest eigenvalues.

**Correct Answer:** Required principle: PCA retains eigenvectors associated with the largest eigenvalues.

**Explanation:** The implementation encodes a false rule. The required principle follows because Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 90

**Question:** An implementation is designed around the rule “Reconstruction requires a supervised target label.” Which principle exposes the design error concerning approximate reconstruction?

**Choices:**
- **A.** Required principle: PCA reconstruction after dimensionality reduction is generally approximate.
- **B.** Required principle: Projection preserves every coordinate exactly for any k.
- **C.** Required principle: Reconstruction requires a supervised target label.
- **D.** Required principle: Eigenfaces cannot be linearly combined into an approximate face. for all permitted parameter values

**Correct Answer:** Required principle: PCA reconstruction after dimensionality reduction is generally approximate.

**Explanation:** The implementation encodes a false rule. The required principle follows because Discarded components lose variance, so U_reduce z approximates the centered input.

---

## Question 91

**Question:** Reviewer A states, “Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.” Reviewer B states, “Cosine similarity is undefined for every non-unit vector.” What is the correct verdict about cosine scale invariance?

**Choices:**
- **A.** Both reviewers are correct about cosine scale invariance
- **B.** Reviewer B only is correct about cosine scale invariance
- **C.** Neither reviewer is correct about cosine scale invariance
- **D.** Reviewer A only is correct about cosine scale invariance

**Correct Answer:** Reviewer A only is correct about cosine scale invariance

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 92

**Question:** Reviewer A states, “K-Means alternates nearest-centroid assignment and mean-based centroid updates.” Reviewer B states, “K-Means assigns fractional memberships that must sum to one.” What is the correct verdict about K-Means alternation?

**Choices:**
- **A.** Both reviewers are correct about K-Means alternation
- **B.** Reviewer B only is correct about K-Means alternation
- **C.** Neither reviewer is correct about K-Means alternation
- **D.** Reviewer A only is correct about K-Means alternation

**Correct Answer:** Reviewer A only is correct about K-Means alternation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The chapter describes hard assignment followed by arithmetic means.

---

## Question 93

**Question:** Reviewer A states, “Single linkage uses the minimum cross-cluster pair distance.” Reviewer B states, “Single linkage is the PCA explained-variance ratio.” What is the correct verdict about single linkage?

**Choices:**
- **A.** Reviewer A only is correct about single linkage
- **B.** Reviewer B only is correct about single linkage
- **C.** Both reviewers are correct about single linkage
- **D.** Neither reviewer is correct about single linkage

**Correct Answer:** Reviewer A only is correct about single linkage

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Minimum pairwise distance defines single linkage.

---

## Question 94

**Question:** Reviewer A states, “Complete linkage uses the maximum cross-cluster pair distance.” Reviewer B states, “Complete linkage projects points onto eigenvectors.” What is the correct verdict about complete linkage?

**Choices:**
- **A.** Both reviewers are correct about complete linkage
- **B.** Reviewer B only is correct about complete linkage
- **C.** Reviewer A only is correct about complete linkage
- **D.** Neither reviewer is correct about complete linkage

**Correct Answer:** Reviewer A only is correct about complete linkage

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Maximum pairwise separation defines complete linkage.

---

## Question 95

**Question:** Reviewer A states, “The unnormalized graph Laplacian is $L=D-W$.” Reviewer B states, “The degree matrix contains eigenvectors in its diagonal.” What is the correct verdict about $L=D-W$?

**Choices:**
- **A.** Neither reviewer is correct about $L=D-W$
- **B.** Reviewer B only is correct about $L=D-W$
- **C.** Both reviewers are correct about $L=D-W$
- **D.** Reviewer A only is correct about $L=D-W$

**Correct Answer:** Reviewer A only is correct about $L=D-W$

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, D contains row sums of W and L subtracts W.

---

## Question 96

**Question:** Reviewer A states, “The number of zero Laplacian eigenvalues is related to connected-component count.” Reviewer B states, “Zero eigenvalues determine the requested K-Means centroid values.” What is the correct verdict about zero Laplacian eigenvalues?

**Choices:**
- **A.** Both reviewers are correct about zero Laplacian eigenvalues
- **B.** Reviewer A only is correct about zero Laplacian eigenvalues
- **C.** Reviewer B only is correct about zero Laplacian eigenvalues
- **D.** Neither reviewer is correct about zero Laplacian eigenvalues

**Correct Answer:** Reviewer A only is correct about zero Laplacian eigenvalues

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Disconnected components contribute independent constant eigenvectors.

---

## Question 97

**Question:** Reviewer A states, “A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.” Reviewer B states, “It sorts points by Euclidean norm and ignores the graph.” What is the correct verdict about the Fiedler vector?

**Choices:**
- **A.** Both reviewers are correct about the Fiedler vector
- **B.** Reviewer B only is correct about the Fiedler vector
- **C.** Neither reviewer is correct about the Fiedler vector
- **D.** Reviewer A only is correct about the Fiedler vector

**Correct Answer:** Reviewer A only is correct about the Fiedler vector

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 98

**Question:** Reviewer A states, “PCA first centers data before forming the stated covariance matrix.” Reviewer B states, “PCA requires labelled class targets for covariance.” What is the correct verdict about PCA centering?

**Choices:**
- **A.** Reviewer B only is correct about PCA centering
- **B.** Reviewer A only is correct about PCA centering
- **C.** Both reviewers are correct about PCA centering
- **D.** Neither reviewer is correct about PCA centering

**Correct Answer:** Reviewer A only is correct about PCA centering

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Mean normalization makes covariance describe variation about the center.

---

## Question 99

**Question:** Reviewer A states, “PCA retains eigenvectors associated with the largest eigenvalues.” Reviewer B states, “PCA chooses components using class-label accuracy.” What is the correct verdict about eigenvalue ordering?

**Choices:**
- **A.** Neither reviewer is correct about eigenvalue ordering
- **B.** Reviewer B only is correct about eigenvalue ordering
- **C.** Both reviewers are correct about eigenvalue ordering
- **D.** Reviewer A only is correct about eigenvalue ordering

**Correct Answer:** Reviewer A only is correct about eigenvalue ordering

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 100

**Question:** Reviewer A states, “PCA reconstruction after dimensionality reduction is generally approximate.” Reviewer B states, “Eigenfaces cannot be linearly combined into an approximate face.” What is the correct verdict about approximate reconstruction?

**Choices:**
- **A.** Reviewer B only is correct about approximate reconstruction
- **B.** Reviewer A only is correct about approximate reconstruction
- **C.** Both reviewers are correct about approximate reconstruction
- **D.** Neither reviewer is correct about approximate reconstruction

**Correct Answer:** Reviewer A only is correct about approximate reconstruction

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Discarded components lose variance, so U_reduce z approximates the centered input.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Questions were audited for structural balance, verbatim reuse, and parameter-only duplicate prompts.
