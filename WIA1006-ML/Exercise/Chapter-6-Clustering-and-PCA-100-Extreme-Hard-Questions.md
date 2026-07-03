# Chapter 6: Clustering and PCA: 100 Extreme-Hard Questions

> Topics: distance measures, K-Means, hierarchical and spectral clustering, graph Laplacians, PCA, and eigenfaces. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** For x=['1', '2', '-1'], y=['-1', '1', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6, 3.7417, -0.1667)
- **B.** (3.7417, 6, 1.1667)
- **C.** (3.7417, 6, -0.1667)
- **D.** (14, 6, -0.1667)

**Correct Answer:** (3.7417, 6, -0.1667)

**Explanation:** Direct substitution gives Euclidean=3.7417, Manhattan=6, and cosine=-0.1667.

---

## Question 2

**Question:** One K-Means iteration uses points [(0.0, 0), (2, 2.0), (8, 8), (10.0, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** ('1', '1') and ('9', '9')
- **B.** (0.0, 0) and (10.0, 10)
- **C.** ('0', '1') and ('9', '9')
- **D.** ('9', '9') and ('1', '1')

**Correct Answer:** ('1', '1') and ('9', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.0, 1.0), (9.0, 9.0)].

---

## Question 3

**Question:** All cross-cluster pair distances are ['1', '3', '5', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (5, 1, 3.25)
- **B.** (1, 3.25, 5)
- **C.** (1, 5, 3.25)
- **D.** (3.25, 5, 1)

**Correct Answer:** (1, 5, 3.25)

**Explanation:** Minimum=1, maximum=5, and arithmetic average=3.25.

---

## Question 4

**Question:** For W=[[0, 1.0, 0], [1.0, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1', '3', '2'], ['0', '0', '0'])
- **B.** (['1', '3', '2'], ['1', '3', '2'])
- **C.** (['0', '0', '0'], ['1', '3', '2'])
- **D.** (['-1', '-3', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1', '3', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1', '3', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 5

**Question:** PCA eigenvalues are ['5', '3', '1', '0.5']. Keeping two components, and using z=[2.0, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1579, ['1', '2'])
- **B.** (0.8421, ['1', '2'])
- **C.** (0.8421, ['2', '-1'])
- **D.** (0.5263, ['2', '1'])

**Correct Answer:** (0.8421, ['1', '2'])

**Explanation:** Ratio=(5+3)/9.5=0.8421; U_reduce z=['1', '2'].

---

## Question 6

**Question:** For x=['1.2', '2', '-1'], y=['-1', '1.1', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.1, 3.8275, -0.1581)
- **B.** (3.8275, 6.1, 1.1581)
- **C.** (14.65, 6.1, -0.1581)
- **D.** (3.8275, 6.1, -0.1581)

**Correct Answer:** (3.8275, 6.1, -0.1581)

**Explanation:** Direct substitution gives Euclidean=3.8275, Manhattan=6.1, and cosine=-0.1581.

---

## Question 7

**Question:** One K-Means iteration uses points [(0.1, 0), (2, 2.1), (8, 8), (9.9, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** (0.1, 0) and (9.9, 10)
- **B.** ('0', '1') and ('9', '9')
- **C.** ('1.05', '1.05') and ('8.95', '9')
- **D.** ('8.95', '9') and ('1.05', '1.05')

**Correct Answer:** ('1.05', '1.05') and ('8.95', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.05, 1.05), (8.95, 9.0)].

---

## Question 8

**Question:** All cross-cluster pair distances are ['1.1', '3.1', '4.95', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (4.95, 1.1, 3.2875)
- **B.** (1.1, 3.2875, 4.95)
- **C.** (1.1, 4.95, 3.2875)
- **D.** (3.2875, 4.95, 1.1)

**Correct Answer:** (1.1, 4.95, 3.2875)

**Explanation:** Minimum=1.1, maximum=4.95, and arithmetic average=3.2875.

---

## Question 9

**Question:** For W=[[0, 1.1, 0], [1.1, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.1', '3.1', '2'], ['1.1', '3.1', '2'])
- **B.** (['0', '0', '0'], ['1.1', '3.1', '2'])
- **C.** (['1.1', '3.1', '2'], ['0', '0', '0'])
- **D.** (['-1.1', '-3.1', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1.1', '3.1', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.1', '3.1', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 10

**Question:** PCA eigenvalues are ['6', '3.5', '1.1', '0.5']. Keeping two components, and using z=[2.1, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1441, ['1.08', '2.06'])
- **B.** (0.8559, ['1.08', '2.06'])
- **C.** (0.8559, ['2.1', '-1'])
- **D.** (0.5405, ['2.06', '1.08'])

**Correct Answer:** (0.8559, ['1.08', '2.06'])

**Explanation:** Ratio=(6+3.5)/11.1=0.8559; U_reduce z=['1.08', '2.06'].

---

## Question 11

**Question:** For x=['1.4', '2', '-1'], y=['-1', '1.2', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.2, 3.9243, -0.1494)
- **B.** (3.9243, 6.2, 1.1494)
- **C.** (15.4, 6.2, -0.1494)
- **D.** (3.9243, 6.2, -0.1494)

**Correct Answer:** (3.9243, 6.2, -0.1494)

**Explanation:** Direct substitution gives Euclidean=3.9243, Manhattan=6.2, and cosine=-0.1494.

---

## Question 12

**Question:** One K-Means iteration uses points [(0.2, 0), (2, 2.2), (8, 8), (9.8, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** ('1.1', '1.1') and ('8.9', '9')
- **B.** (0.2, 0) and (9.8, 10)
- **C.** ('0', '1') and ('9', '9')
- **D.** ('8.9', '9') and ('1.1', '1.1')

**Correct Answer:** ('1.1', '1.1') and ('8.9', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.1, 1.1), (8.9, 9.0)].

---

## Question 13

**Question:** All cross-cluster pair distances are ['1.2', '3.2', '4.9', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (1.2, 4.9, 3.325)
- **B.** (4.9, 1.2, 3.325)
- **C.** (1.2, 3.325, 4.9)
- **D.** (3.325, 4.9, 1.2)

**Correct Answer:** (1.2, 4.9, 3.325)

**Explanation:** Minimum=1.2, maximum=4.9, and arithmetic average=3.325.

---

## Question 14

**Question:** For W=[[0, 1.2, 0], [1.2, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.2', '3.2', '2'], ['1.2', '3.2', '2'])
- **B.** (['0', '0', '0'], ['1.2', '3.2', '2'])
- **C.** (['1.2', '3.2', '2'], ['0', '0', '0'])
- **D.** (['-1.2', '-3.2', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1.2', '3.2', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.2', '3.2', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 15

**Question:** PCA eigenvalues are ['7', '4', '1.2', '0.5']. Keeping two components, and using z=[2.2, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1339, ['1.16', '2.12'])
- **B.** (0.8661, ['2.2', '-1'])
- **C.** (0.5512, ['2.12', '1.16'])
- **D.** (0.8661, ['1.16', '2.12'])

**Correct Answer:** (0.8661, ['1.16', '2.12'])

**Explanation:** Ratio=(7+4)/12.7=0.8661; U_reduce z=['1.16', '2.12'].

---

## Question 16

**Question:** For x=['1.6', '2', '-1'], y=['-1', '1.3', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.3, 4.0311, -0.1406)
- **B.** (4.0311, 6.3, -0.1406)
- **C.** (4.0311, 6.3, 1.1406)
- **D.** (16.25, 6.3, -0.1406)

**Correct Answer:** (4.0311, 6.3, -0.1406)

**Explanation:** Direct substitution gives Euclidean=4.0311, Manhattan=6.3, and cosine=-0.1406.

---

## Question 17

**Question:** One K-Means iteration uses points [(0.3, 0), (2, 2.3), (8, 8), (9.7, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** (0.3, 0) and (9.7, 10)
- **B.** ('0', '1') and ('9', '9')
- **C.** ('8.85', '9') and ('1.15', '1.15')
- **D.** ('1.15', '1.15') and ('8.85', '9')

**Correct Answer:** ('1.15', '1.15') and ('8.85', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.15, 1.15), (8.85, 9.0)].

---

## Question 18

**Question:** All cross-cluster pair distances are ['1.3', '3.3', '4.85', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (4.85, 1.3, 3.3625)
- **B.** (1.3, 3.3625, 4.85)
- **C.** (1.3, 4.85, 3.3625)
- **D.** (3.3625, 4.85, 1.3)

**Correct Answer:** (1.3, 4.85, 3.3625)

**Explanation:** Minimum=1.3, maximum=4.85, and arithmetic average=3.3625.

---

## Question 19

**Question:** For W=[[0, 1.3, 0], [1.3, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.3', '3.3', '2'], ['0', '0', '0'])
- **B.** (['1.3', '3.3', '2'], ['1.3', '3.3', '2'])
- **C.** (['0', '0', '0'], ['1.3', '3.3', '2'])
- **D.** (['-1.3', '-3.3', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1.3', '3.3', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.3', '3.3', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 20

**Question:** PCA eigenvalues are ['8', '4.5', '1.3', '0.5']. Keeping two components, and using z=[2.3, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.8741, ['1.24', '2.18'])
- **B.** (0.1259, ['1.24', '2.18'])
- **C.** (0.8741, ['2.3', '-1'])
- **D.** (0.5594, ['2.18', '1.24'])

**Correct Answer:** (0.8741, ['1.24', '2.18'])

**Explanation:** Ratio=(8+4.5)/14.3=0.8741; U_reduce z=['1.24', '2.18'].

---

## Question 21

**Question:** For x=['1.8', '2', '-1'], y=['-1', '1.4', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.4, 4.1473, -0.132)
- **B.** (4.1473, 6.4, -0.132)
- **C.** (4.1473, 6.4, 1.132)
- **D.** (17.2, 6.4, -0.132)

**Correct Answer:** (4.1473, 6.4, -0.132)

**Explanation:** Direct substitution gives Euclidean=4.1473, Manhattan=6.4, and cosine=-0.132.

---

## Question 22

**Question:** One K-Means iteration uses points [(0.4, 0), (2, 2.4), (8, 8), (9.6, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** (0.4, 0) and (9.6, 10)
- **B.** ('0', '1') and ('9', '9')
- **C.** ('1.2', '1.2') and ('8.8', '9')
- **D.** ('8.8', '9') and ('1.2', '1.2')

**Correct Answer:** ('1.2', '1.2') and ('8.8', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.2, 1.2), (8.8, 9.0)].

---

## Question 23

**Question:** All cross-cluster pair distances are ['1.4', '3.4', '4.8', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (4.8, 1.4, 3.4)
- **B.** (1.4, 3.4, 4.8)
- **C.** (3.4, 4.8, 1.4)
- **D.** (1.4, 4.8, 3.4)

**Correct Answer:** (1.4, 4.8, 3.4)

**Explanation:** Minimum=1.4, maximum=4.8, and arithmetic average=3.4.

---

## Question 24

**Question:** For W=[[0, 1.4, 0], [1.4, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.4', '3.4', '2'], ['1.4', '3.4', '2'])
- **B.** (['0', '0', '0'], ['1.4', '3.4', '2'])
- **C.** (['1.4', '3.4', '2'], ['0', '0', '0'])
- **D.** (['-1.4', '-3.4', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1.4', '3.4', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.4', '3.4', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 25

**Question:** PCA eigenvalues are ['9', '5', '1.4', '0.5']. Keeping two components, and using z=[2.4, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1195, ['1.32', '2.24'])
- **B.** (0.8805, ['1.32', '2.24'])
- **C.** (0.8805, ['2.4', '-1'])
- **D.** (0.566, ['2.24', '1.32'])

**Correct Answer:** (0.8805, ['1.32', '2.24'])

**Explanation:** Ratio=(9+5)/15.9=0.8805; U_reduce z=['1.32', '2.24'].

---

## Question 26

**Question:** For x=['2', '2', '-1'], y=['-1', '1.5', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.5, 4.272, -0.1238)
- **B.** (4.272, 6.5, 1.1238)
- **C.** (18.25, 6.5, -0.1238)
- **D.** (4.272, 6.5, -0.1238)

**Correct Answer:** (4.272, 6.5, -0.1238)

**Explanation:** Direct substitution gives Euclidean=4.272, Manhattan=6.5, and cosine=-0.1238.

---

## Question 27

**Question:** One K-Means iteration uses points [(0.5, 0), (2, 2.5), (8, 8), (9.5, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** ('1.25', '1.25') and ('8.75', '9')
- **B.** (0.5, 0) and (9.5, 10)
- **C.** ('0', '1') and ('9', '9')
- **D.** ('8.75', '9') and ('1.25', '1.25')

**Correct Answer:** ('1.25', '1.25') and ('8.75', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.25, 1.25), (8.75, 9.0)].

---

## Question 28

**Question:** All cross-cluster pair distances are ['1.5', '3.5', '4.75', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (4.75, 1.5, 3.4375)
- **B.** (1.5, 3.4375, 4.75)
- **C.** (1.5, 4.75, 3.4375)
- **D.** (3.4375, 4.75, 1.5)

**Correct Answer:** (1.5, 4.75, 3.4375)

**Explanation:** Minimum=1.5, maximum=4.75, and arithmetic average=3.4375.

---

## Question 29

**Question:** For W=[[0, 1.5, 0], [1.5, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.5', '3.5', '2'], ['1.5', '3.5', '2'])
- **B.** (['0', '0', '0'], ['1.5', '3.5', '2'])
- **C.** (['-1.5', '-3.5', '-2'], ['0', '0', '0'])
- **D.** (['1.5', '3.5', '2'], ['0', '0', '0'])

**Correct Answer:** (['1.5', '3.5', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.5', '3.5', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 30

**Question:** PCA eigenvalues are ['10', '5.5', '1.5', '0.5']. Keeping two components, and using z=[2.5, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1143, ['1.4', '2.3'])
- **B.** (0.8857, ['2.5', '-1'])
- **C.** (0.5714, ['2.3', '1.4'])
- **D.** (0.8857, ['1.4', '2.3'])

**Correct Answer:** (0.8857, ['1.4', '2.3'])

**Explanation:** Ratio=(10+5.5)/17.5=0.8857; U_reduce z=['1.4', '2.3'].

---

## Question 31

**Question:** For x=['2.2', '2', '-1'], y=['-1', '1.6', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.6, 4.4045, -0.1159)
- **B.** (4.4045, 6.6, 1.1159)
- **C.** (19.4, 6.6, -0.1159)
- **D.** (4.4045, 6.6, -0.1159)

**Correct Answer:** (4.4045, 6.6, -0.1159)

**Explanation:** Direct substitution gives Euclidean=4.4045, Manhattan=6.6, and cosine=-0.1159.

---

## Question 32

**Question:** One K-Means iteration uses points [(0.6, 0), (2, 2.6), (8, 8), (9.4, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** (0.6, 0) and (9.4, 10)
- **B.** ('1.3', '1.3') and ('8.7', '9')
- **C.** ('0', '1') and ('9', '9')
- **D.** ('8.7', '9') and ('1.3', '1.3')

**Correct Answer:** ('1.3', '1.3') and ('8.7', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.3, 1.3), (8.7, 9.0)].

---

## Question 33

**Question:** All cross-cluster pair distances are ['1.6', '3.6', '4.7', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (4.7, 1.6, 3.475)
- **B.** (1.6, 3.475, 4.7)
- **C.** (3.475, 4.7, 1.6)
- **D.** (1.6, 4.7, 3.475)

**Correct Answer:** (1.6, 4.7, 3.475)

**Explanation:** Minimum=1.6, maximum=4.7, and arithmetic average=3.475.

---

## Question 34

**Question:** For W=[[0, 1.6, 0], [1.6, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.6', '3.6', '2'], ['1.6', '3.6', '2'])
- **B.** (['0', '0', '0'], ['1.6', '3.6', '2'])
- **C.** (['1.6', '3.6', '2'], ['0', '0', '0'])
- **D.** (['-1.6', '-3.6', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1.6', '3.6', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.6', '3.6', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 35

**Question:** PCA eigenvalues are ['11', '6', '1.6', '0.5']. Keeping two components, and using z=[2.6, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1099, ['1.48', '2.36'])
- **B.** (0.8901, ['2.6', '-1'])
- **C.** (0.5759, ['2.36', '1.48'])
- **D.** (0.8901, ['1.48', '2.36'])

**Correct Answer:** (0.8901, ['1.48', '2.36'])

**Explanation:** Ratio=(11+6)/19.1=0.8901; U_reduce z=['1.48', '2.36'].

---

## Question 36

**Question:** For x=['2.4', '2', '-1'], y=['-1', '1.7', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.7, 4.5442, -0.1085)
- **B.** (4.5442, 6.7, 1.1085)
- **C.** (4.5442, 6.7, -0.1085)
- **D.** (20.65, 6.7, -0.1085)

**Correct Answer:** (4.5442, 6.7, -0.1085)

**Explanation:** Direct substitution gives Euclidean=4.5442, Manhattan=6.7, and cosine=-0.1085.

---

## Question 37

**Question:** One K-Means iteration uses points [(0.7, 0), (2, 2.7), (8, 8), (9.3, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** (0.7, 0) and (9.3, 10)
- **B.** ('0', '1') and ('9', '9')
- **C.** ('8.65', '9') and ('1.35', '1.35')
- **D.** ('1.35', '1.35') and ('8.65', '9')

**Correct Answer:** ('1.35', '1.35') and ('8.65', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.35, 1.35), (8.65, 9.0)].

---

## Question 38

**Question:** All cross-cluster pair distances are ['1.7', '3.7', '4.65', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (1.7, 4.65, 3.5125)
- **B.** (4.65, 1.7, 3.5125)
- **C.** (1.7, 3.5125, 4.65)
- **D.** (3.5125, 4.65, 1.7)

**Correct Answer:** (1.7, 4.65, 3.5125)

**Explanation:** Minimum=1.7, maximum=4.65, and arithmetic average=3.5125.

---

## Question 39

**Question:** For W=[[0, 1.7, 0], [1.7, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.7', '3.7', '2'], ['1.7', '3.7', '2'])
- **B.** (['0', '0', '0'], ['1.7', '3.7', '2'])
- **C.** (['1.7', '3.7', '2'], ['0', '0', '0'])
- **D.** (['-1.7', '-3.7', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1.7', '3.7', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.7', '3.7', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 40

**Question:** PCA eigenvalues are ['12', '6.5', '1.7', '0.5']. Keeping two components, and using z=[2.7, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1063, ['1.56', '2.42'])
- **B.** (0.8937, ['2.7', '-1'])
- **C.** (0.8937, ['1.56', '2.42'])
- **D.** (0.5797, ['2.42', '1.56'])

**Correct Answer:** (0.8937, ['1.56', '2.42'])

**Explanation:** Ratio=(12+6.5)/20.7=0.8937; U_reduce z=['1.56', '2.42'].

---

## Question 41

**Question:** For x=['2.6', '2', '-1'], y=['-1', '1.8', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.8, 4.6904, -0.1016)
- **B.** (4.6904, 6.8, -0.1016)
- **C.** (4.6904, 6.8, 1.1016)
- **D.** (22, 6.8, -0.1016)

**Correct Answer:** (4.6904, 6.8, -0.1016)

**Explanation:** Direct substitution gives Euclidean=4.6904, Manhattan=6.8, and cosine=-0.1016.

---

## Question 42

**Question:** One K-Means iteration uses points [(0.8, 0), (2, 2.8), (8, 8), (9.2, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** (0.8, 0) and (9.2, 10)
- **B.** ('1.4', '1.4') and ('8.6', '9')
- **C.** ('0', '1') and ('9', '9')
- **D.** ('8.6', '9') and ('1.4', '1.4')

**Correct Answer:** ('1.4', '1.4') and ('8.6', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.4, 1.4), (8.6, 9.0)].

---

## Question 43

**Question:** All cross-cluster pair distances are ['1.8', '3.8', '4.6', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (4.6, 1.8, 3.55)
- **B.** (1.8, 3.55, 4.6)
- **C.** (1.8, 4.6, 3.55)
- **D.** (3.55, 4.6, 1.8)

**Correct Answer:** (1.8, 4.6, 3.55)

**Explanation:** Minimum=1.8, maximum=4.6, and arithmetic average=3.55.

---

## Question 44

**Question:** For W=[[0, 1.8, 0], [1.8, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.8', '3.8', '2'], ['1.8', '3.8', '2'])
- **B.** (['0', '0', '0'], ['1.8', '3.8', '2'])
- **C.** (['1.8', '3.8', '2'], ['0', '0', '0'])
- **D.** (['-1.8', '-3.8', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1.8', '3.8', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.8', '3.8', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 45

**Question:** PCA eigenvalues are ['13', '7', '1.8', '0.5']. Keeping two components, and using z=[2.8, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1031, ['1.64', '2.48'])
- **B.** (0.8969, ['2.8', '-1'])
- **C.** (0.8969, ['1.64', '2.48'])
- **D.** (0.583, ['2.48', '1.64'])

**Correct Answer:** (0.8969, ['1.64', '2.48'])

**Explanation:** Ratio=(13+7)/22.3=0.8969; U_reduce z=['1.64', '2.48'].

---

## Question 46

**Question:** For x=['2.8', '2', '-1'], y=['-1', '1.9', '2'], what is (Euclidean distance, Manhattan distance, cosine similarity)?

**Choices:**
- **A.** (6.9, 4.8425, -0.0951)
- **B.** (4.8425, 6.9, 1.0951)
- **C.** (23.45, 6.9, -0.0951)
- **D.** (4.8425, 6.9, -0.0951)

**Correct Answer:** (4.8425, 6.9, -0.0951)

**Explanation:** Direct substitution gives Euclidean=4.8425, Manhattan=6.9, and cosine=-0.0951.

---

## Question 47

**Question:** One K-Means iteration uses points [(0.9, 0), (2, 2.9), (8, 8), (9.1, 10)] and centroids (0,1),(9,9). After assignment and mean update, what are the new centroids?

**Choices:**
- **A.** (0.9, 0) and (9.1, 10)
- **B.** ('1.45', '1.45') and ('8.55', '9')
- **C.** ('0', '1') and ('9', '9')
- **D.** ('8.55', '9') and ('1.45', '1.45')

**Correct Answer:** ('1.45', '1.45') and ('8.55', '9')

**Explanation:** The first two points join cluster 1 and the last two join cluster 2; their coordinate-wise means are [(1.45, 1.45), (8.55, 9.0)].

---

## Question 48

**Question:** All cross-cluster pair distances are ['1.9', '3.9', '4.55', '4']. What triple (single, complete, average linkage) follows?

**Choices:**
- **A.** (4.55, 1.9, 3.5875)
- **B.** (1.9, 3.5875, 4.55)
- **C.** (3.5875, 4.55, 1.9)
- **D.** (1.9, 4.55, 3.5875)

**Correct Answer:** (1.9, 4.55, 3.5875)

**Explanation:** Minimum=1.9, maximum=4.55, and arithmetic average=3.5875.

---

## Question 49

**Question:** For W=[[0, 1.9, 0], [1.9, 0, 2], [0, 2, 0]], form L=D-W. Which (diagonal of D, row sums of L) is correct?

**Choices:**
- **A.** (['1.9', '3.9', '2'], ['1.9', '3.9', '2'])
- **B.** (['1.9', '3.9', '2'], ['0', '0', '0'])
- **C.** (['0', '0', '0'], ['1.9', '3.9', '2'])
- **D.** (['-1.9', '-3.9', '-2'], ['0', '0', '0'])

**Correct Answer:** (['1.9', '3.9', '2'], ['0', '0', '0'])

**Explanation:** Degrees are W row sums ['1.9', '3.9', '2']; subtracting W makes each Laplacian row sum zero: ['0', '0', '0'].

---

## Question 50

**Question:** PCA eigenvalues are ['14', '7.5', '1.9', '0.5']. Keeping two components, and using z=[2.9, -1], U_reduce columns represented by rows [[0.8, 0.6], [0.6, -0.8]], what are (explained ratio, reconstructed x)?

**Choices:**
- **A.** (0.1004, ['1.72', '2.54'])
- **B.** (0.8996, ['2.9', '-1'])
- **C.** (0.5858, ['2.54', '1.72'])
- **D.** (0.8996, ['1.72', '2.54'])

**Correct Answer:** (0.8996, ['1.72', '2.54'])

**Explanation:** Ratio=(14+7.5)/23.9=0.8996; U_reduce z=['1.72', '2.54'].

---

## Question 51

**Question:** An unsupervised-learning calculation is interpreted. Case 1: Which conclusion is the single most defensible?

**Choices:**
- **A.** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.
- **B.** Cosine similarity is always the Euclidean distance.
- **C.** Cosine similarity increases whenever both vector norms increase., under both the training and evaluation conditions stated
- **D.** Cosine similarity is undefined for every non-unit vector.

**Correct Answer:** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Explanation:** The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 52

**Question:** An unsupervised-learning calculation is interpreted. Case 2: Which conclusion is the single most defensible?

**Choices:**
- **A.** K-Means updates centroids using the farthest point only.
- **B.** K-Means infers K exclusively from zero Laplacian eigenvalues., even when the other quantities in the formula are fixed
- **C.** K-Means assigns fractional memberships that must sum to one.
- **D.** K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Correct Answer:** K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Explanation:** The chapter describes hard assignment followed by arithmetic means.

---

## Question 53

**Question:** An unsupervised-learning calculation is interpreted. Case 3: Which conclusion is the single most defensible?

**Choices:**
- **A.** Single linkage uses the minimum cross-cluster pair distance.
- **B.** Single linkage uses the maximum cross-cluster pair distance.
- **C.** Single linkage averages only within-cluster distances.
- **D.** Single linkage is the PCA explained-variance ratio.

**Correct Answer:** Single linkage uses the minimum cross-cluster pair distance.

**Explanation:** Minimum pairwise distance defines single linkage.

---

## Question 54

**Question:** An unsupervised-learning calculation is interpreted. Case 4: Which conclusion is the single most defensible?

**Choices:**
- **A.** Complete linkage uses the minimum pair distance.
- **B.** Complete linkage uses the maximum cross-cluster pair distance.
- **C.** Complete linkage is always identical to average linkage., without needing any additional modeling assumption
- **D.** Complete linkage projects points onto eigenvectors.

**Correct Answer:** Complete linkage uses the maximum cross-cluster pair distance.

**Explanation:** Maximum pairwise separation defines complete linkage.

---

## Question 55

**Question:** An unsupervised-learning calculation is interpreted. Case 5: Which conclusion is the single most defensible?

**Choices:**
- **A.** The unnormalized graph Laplacian is L=D-W.
- **B.** The graph Laplacian is W-D with no sign convention in the chapter.
- **C.** The graph Laplacian is the covariance X^T X only.
- **D.** The degree matrix contains eigenvectors in its diagonal.

**Correct Answer:** The unnormalized graph Laplacian is L=D-W.

**Explanation:** D contains row sums of W and L subtracts W.

---

## Question 56

**Question:** An unsupervised-learning calculation is interpreted. Case 6: Which conclusion is the single most defensible?

**Choices:**
- **A.** Every graph has exactly two zero eigenvalues.
- **B.** The number of zero Laplacian eigenvalues is related to connected-component count.
- **C.** A zero eigenvalue proves every edge weight is negative.
- **D.** Zero eigenvalues determine the requested K-Means centroid values., even when the other quantities in the formula are fixed

**Correct Answer:** The number of zero Laplacian eigenvalues is related to connected-component count.

**Explanation:** Disconnected components contribute independent constant eigenvectors.

---

## Question 57

**Question:** An unsupervised-learning calculation is interpreted. Case 7: Which conclusion is the single most defensible?

**Choices:**
- **A.** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.
- **B.** It uses the largest covariance eigenvector to assign labels., as a consequence that holds for every permitted input
- **C.** It uses the all-ones zero-eigenvalue vector for every split.
- **D.** It sorts points by Euclidean norm and ignores the graph.

**Correct Answer:** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Explanation:** The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 58

**Question:** An unsupervised-learning calculation is interpreted. Case 8: Which conclusion is the single most defensible?

**Choices:**
- **A.** PCA first centers data before forming the stated covariance matrix.
- **B.** PCA must one-hot encode each principal component.
- **C.** PCA chooses directions of minimum retained variance first., without needing any additional modeling assumption
- **D.** PCA requires labelled class targets for covariance.

**Correct Answer:** PCA first centers data before forming the stated covariance matrix.

**Explanation:** Mean normalization makes covariance describe variation about the center.

---

## Question 59

**Question:** An unsupervised-learning calculation is interpreted. Case 9: Which conclusion is the single most defensible?

**Choices:**
- **A.** PCA retains eigenvectors associated with the largest eigenvalues.
- **B.** PCA retains only zero-eigenvalue directions.
- **C.** PCA sorts eigenvectors alphabetically by feature name., under both the training and evaluation conditions stated
- **D.** PCA chooses components using class-label accuracy.

**Correct Answer:** PCA retains eigenvectors associated with the largest eigenvalues.

**Explanation:** Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 60

**Question:** An unsupervised-learning calculation is interpreted. Case 10: Which conclusion is the single most defensible?

**Choices:**
- **A.** Projection preserves every coordinate exactly for any k.
- **B.** Reconstruction requires a supervised target label.
- **C.** PCA reconstruction after dimensionality reduction is generally approximate.
- **D.** Eigenfaces cannot be linearly combined into an approximate face., even when the other quantities in the formula are fixed

**Correct Answer:** PCA reconstruction after dimensionality reduction is generally approximate.

**Explanation:** Discarded components lose variance, so U_reduce z approximates the centered input.

---

## Question 61

**Question:** An unsupervised-learning calculation is interpreted. Case 11: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Cosine similarity is always the Euclidean distance.
- **B.** Cosine similarity increases whenever both vector norms increase., as a consequence that holds for every permitted input
- **C.** Cosine similarity is undefined for every non-unit vector.
- **D.** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Correct Answer:** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Explanation:** The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 62

**Question:** An unsupervised-learning calculation is interpreted. Case 12: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** K-Means updates centroids using the farthest point only.
- **B.** K-Means infers K exclusively from zero Laplacian eigenvalues., without needing any additional modeling assumption
- **C.** K-Means alternates nearest-centroid assignment and mean-based centroid updates.
- **D.** K-Means assigns fractional memberships that must sum to one.

**Correct Answer:** K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Explanation:** The chapter describes hard assignment followed by arithmetic means.

---

## Question 63

**Question:** An unsupervised-learning calculation is interpreted. Case 13: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Single linkage uses the maximum cross-cluster pair distance.
- **B.** Single linkage averages only within-cluster distances.
- **C.** Single linkage is the PCA explained-variance ratio.
- **D.** Single linkage uses the minimum cross-cluster pair distance.

**Correct Answer:** Single linkage uses the minimum cross-cluster pair distance.

**Explanation:** Minimum pairwise distance defines single linkage.

---

## Question 64

**Question:** An unsupervised-learning calculation is interpreted. Case 14: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Complete linkage uses the minimum pair distance.
- **B.** Complete linkage uses the maximum cross-cluster pair distance.
- **C.** Complete linkage is always identical to average linkage., even when the other quantities in the formula are fixed
- **D.** Complete linkage projects points onto eigenvectors.

**Correct Answer:** Complete linkage uses the maximum cross-cluster pair distance.

**Explanation:** Maximum pairwise separation defines complete linkage.

---

## Question 65

**Question:** An unsupervised-learning calculation is interpreted. Case 15: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The unnormalized graph Laplacian is L=D-W.
- **B.** The graph Laplacian is W-D with no sign convention in the chapter.
- **C.** The graph Laplacian is the covariance X^T X only.
- **D.** The degree matrix contains eigenvectors in its diagonal.

**Correct Answer:** The unnormalized graph Laplacian is L=D-W.

**Explanation:** D contains row sums of W and L subtracts W.

---

## Question 66

**Question:** An unsupervised-learning calculation is interpreted. Case 16: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Every graph has exactly two zero eigenvalues.
- **B.** A zero eigenvalue proves every edge weight is negative.
- **C.** The number of zero Laplacian eigenvalues is related to connected-component count.
- **D.** Zero eigenvalues determine the requested K-Means centroid values., without needing any additional modeling assumption

**Correct Answer:** The number of zero Laplacian eigenvalues is related to connected-component count.

**Explanation:** Disconnected components contribute independent constant eigenvectors.

---

## Question 67

**Question:** An unsupervised-learning calculation is interpreted. Case 17: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** It uses the largest covariance eigenvector to assign labels., under both the training and evaluation conditions stated
- **B.** It uses the all-ones zero-eigenvalue vector for every split.
- **C.** It sorts points by Euclidean norm and ignores the graph.
- **D.** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Correct Answer:** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Explanation:** The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 68

**Question:** An unsupervised-learning calculation is interpreted. Case 18: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** PCA first centers data before forming the stated covariance matrix.
- **B.** PCA must one-hot encode each principal component.
- **C.** PCA chooses directions of minimum retained variance first., even when the other quantities in the formula are fixed
- **D.** PCA requires labelled class targets for covariance.

**Correct Answer:** PCA first centers data before forming the stated covariance matrix.

**Explanation:** Mean normalization makes covariance describe variation about the center.

---

## Question 69

**Question:** An unsupervised-learning calculation is interpreted. Case 19: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** PCA retains only zero-eigenvalue directions.
- **B.** PCA retains eigenvectors associated with the largest eigenvalues.
- **C.** PCA sorts eigenvectors alphabetically by feature name., as a consequence that holds for every permitted input
- **D.** PCA chooses components using class-label accuracy.

**Correct Answer:** PCA retains eigenvectors associated with the largest eigenvalues.

**Explanation:** Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 70

**Question:** An unsupervised-learning calculation is interpreted. Case 20: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** PCA reconstruction after dimensionality reduction is generally approximate.
- **B.** Projection preserves every coordinate exactly for any k.
- **C.** Reconstruction requires a supervised target label.
- **D.** Eigenfaces cannot be linearly combined into an approximate face., without needing any additional modeling assumption

**Correct Answer:** PCA reconstruction after dimensionality reduction is generally approximate.

**Explanation:** Discarded components lose variance, so U_reduce z approximates the centered input.

---

## Question 71

**Question:** An unsupervised-learning calculation is interpreted. Case 21: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Cosine similarity is always the Euclidean distance.
- **B.** Cosine similarity increases whenever both vector norms increase., under both the training and evaluation conditions stated
- **C.** Cosine similarity is undefined for every non-unit vector.
- **D.** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Correct Answer:** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Explanation:** The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 72

**Question:** An unsupervised-learning calculation is interpreted. Case 22: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** K-Means alternates nearest-centroid assignment and mean-based centroid updates.
- **B.** K-Means updates centroids using the farthest point only.
- **C.** K-Means infers K exclusively from zero Laplacian eigenvalues., even when the other quantities in the formula are fixed
- **D.** K-Means assigns fractional memberships that must sum to one.

**Correct Answer:** K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Explanation:** The chapter describes hard assignment followed by arithmetic means.

---

## Question 73

**Question:** An unsupervised-learning calculation is interpreted. Case 23: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Single linkage uses the maximum cross-cluster pair distance.
- **B.** Single linkage uses the minimum cross-cluster pair distance.
- **C.** Single linkage averages only within-cluster distances.
- **D.** Single linkage is the PCA explained-variance ratio.

**Correct Answer:** Single linkage uses the minimum cross-cluster pair distance.

**Explanation:** Minimum pairwise distance defines single linkage.

---

## Question 74

**Question:** An unsupervised-learning calculation is interpreted. Case 24: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Complete linkage uses the maximum cross-cluster pair distance.
- **B.** Complete linkage uses the minimum pair distance.
- **C.** Complete linkage is always identical to average linkage., without needing any additional modeling assumption
- **D.** Complete linkage projects points onto eigenvectors.

**Correct Answer:** Complete linkage uses the maximum cross-cluster pair distance.

**Explanation:** Maximum pairwise separation defines complete linkage.

---

## Question 75

**Question:** An unsupervised-learning calculation is interpreted. Case 25: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The graph Laplacian is W-D with no sign convention in the chapter.
- **B.** The unnormalized graph Laplacian is L=D-W.
- **C.** The graph Laplacian is the covariance X^T X only.
- **D.** The degree matrix contains eigenvectors in its diagonal.

**Correct Answer:** The unnormalized graph Laplacian is L=D-W.

**Explanation:** D contains row sums of W and L subtracts W.

---

## Question 76

**Question:** An unsupervised-learning calculation is interpreted. Case 26: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The number of zero Laplacian eigenvalues is related to connected-component count.
- **B.** Every graph has exactly two zero eigenvalues.
- **C.** A zero eigenvalue proves every edge weight is negative.
- **D.** Zero eigenvalues determine the requested K-Means centroid values., even when the other quantities in the formula are fixed

**Correct Answer:** The number of zero Laplacian eigenvalues is related to connected-component count.

**Explanation:** Disconnected components contribute independent constant eigenvectors.

---

## Question 77

**Question:** An unsupervised-learning calculation is interpreted. Case 27: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** It uses the largest covariance eigenvector to assign labels., as a consequence that holds for every permitted input
- **B.** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.
- **C.** It uses the all-ones zero-eigenvalue vector for every split.
- **D.** It sorts points by Euclidean norm and ignores the graph.

**Correct Answer:** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Explanation:** The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 78

**Question:** An unsupervised-learning calculation is interpreted. Case 28: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** PCA must one-hot encode each principal component.
- **B.** PCA chooses directions of minimum retained variance first., without needing any additional modeling assumption
- **C.** PCA requires labelled class targets for covariance.
- **D.** PCA first centers data before forming the stated covariance matrix.

**Correct Answer:** PCA first centers data before forming the stated covariance matrix.

**Explanation:** Mean normalization makes covariance describe variation about the center.

---

## Question 79

**Question:** An unsupervised-learning calculation is interpreted. Case 29: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** PCA retains eigenvectors associated with the largest eigenvalues.
- **B.** PCA retains only zero-eigenvalue directions.
- **C.** PCA sorts eigenvectors alphabetically by feature name., under both the training and evaluation conditions stated
- **D.** PCA chooses components using class-label accuracy.

**Correct Answer:** PCA retains eigenvectors associated with the largest eigenvalues.

**Explanation:** Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 80

**Question:** An unsupervised-learning calculation is interpreted. Case 30: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Projection preserves every coordinate exactly for any k.
- **B.** Reconstruction requires a supervised target label.
- **C.** PCA reconstruction after dimensionality reduction is generally approximate.
- **D.** Eigenfaces cannot be linearly combined into an approximate face., even when the other quantities in the formula are fixed

**Correct Answer:** PCA reconstruction after dimensionality reduction is generally approximate.

**Explanation:** Discarded components lose variance, so U_reduce z approximates the centered input.

---

## Question 81

**Question:** An unsupervised-learning calculation is interpreted. Case 31: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Cosine similarity is always the Euclidean distance.
- **B.** Cosine similarity increases whenever both vector norms increase., as a consequence that holds for every permitted input
- **C.** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.
- **D.** Cosine similarity is undefined for every non-unit vector.

**Correct Answer:** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Explanation:** The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 82

**Question:** An unsupervised-learning calculation is interpreted. Case 32: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** K-Means updates centroids using the farthest point only.
- **B.** K-Means alternates nearest-centroid assignment and mean-based centroid updates.
- **C.** K-Means infers K exclusively from zero Laplacian eigenvalues., without needing any additional modeling assumption
- **D.** K-Means assigns fractional memberships that must sum to one.

**Correct Answer:** K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Explanation:** The chapter describes hard assignment followed by arithmetic means.

---

## Question 83

**Question:** An unsupervised-learning calculation is interpreted. Case 33: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Single linkage uses the minimum cross-cluster pair distance.
- **B.** Single linkage uses the maximum cross-cluster pair distance.
- **C.** Single linkage averages only within-cluster distances.
- **D.** Single linkage is the PCA explained-variance ratio.

**Correct Answer:** Single linkage uses the minimum cross-cluster pair distance.

**Explanation:** Minimum pairwise distance defines single linkage.

---

## Question 84

**Question:** An unsupervised-learning calculation is interpreted. Case 34: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Complete linkage uses the minimum pair distance.
- **B.** Complete linkage uses the maximum cross-cluster pair distance.
- **C.** Complete linkage is always identical to average linkage., even when the other quantities in the formula are fixed
- **D.** Complete linkage projects points onto eigenvectors.

**Correct Answer:** Complete linkage uses the maximum cross-cluster pair distance.

**Explanation:** Maximum pairwise separation defines complete linkage.

---

## Question 85

**Question:** An unsupervised-learning calculation is interpreted. Case 35: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The graph Laplacian is W-D with no sign convention in the chapter.
- **B.** The unnormalized graph Laplacian is L=D-W.
- **C.** The graph Laplacian is the covariance X^T X only.
- **D.** The degree matrix contains eigenvectors in its diagonal.

**Correct Answer:** The unnormalized graph Laplacian is L=D-W.

**Explanation:** D contains row sums of W and L subtracts W.

---

## Question 86

**Question:** An unsupervised-learning calculation is interpreted. Case 36: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Every graph has exactly two zero eigenvalues.
- **B.** The number of zero Laplacian eigenvalues is related to connected-component count.
- **C.** A zero eigenvalue proves every edge weight is negative.
- **D.** Zero eigenvalues determine the requested K-Means centroid values., without needing any additional modeling assumption

**Correct Answer:** The number of zero Laplacian eigenvalues is related to connected-component count.

**Explanation:** Disconnected components contribute independent constant eigenvectors.

---

## Question 87

**Question:** An unsupervised-learning calculation is interpreted. Case 37: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** It uses the largest covariance eigenvector to assign labels., under both the training and evaluation conditions stated
- **B.** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.
- **C.** It uses the all-ones zero-eigenvalue vector for every split.
- **D.** It sorts points by Euclidean norm and ignores the graph.

**Correct Answer:** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Explanation:** The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 88

**Question:** An unsupervised-learning calculation is interpreted. Case 38: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** PCA first centers data before forming the stated covariance matrix.
- **B.** PCA must one-hot encode each principal component.
- **C.** PCA chooses directions of minimum retained variance first., even when the other quantities in the formula are fixed
- **D.** PCA requires labelled class targets for covariance.

**Correct Answer:** PCA first centers data before forming the stated covariance matrix.

**Explanation:** Mean normalization makes covariance describe variation about the center.

---

## Question 89

**Question:** An unsupervised-learning calculation is interpreted. Case 39: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** PCA retains only zero-eigenvalue directions.
- **B.** PCA sorts eigenvectors alphabetically by feature name., as a consequence that holds for every permitted input
- **C.** PCA chooses components using class-label accuracy.
- **D.** PCA retains eigenvectors associated with the largest eigenvalues.

**Correct Answer:** PCA retains eigenvectors associated with the largest eigenvalues.

**Explanation:** Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 90

**Question:** An unsupervised-learning calculation is interpreted. Case 40: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Projection preserves every coordinate exactly for any k.
- **B.** Reconstruction requires a supervised target label.
- **C.** PCA reconstruction after dimensionality reduction is generally approximate.
- **D.** Eigenfaces cannot be linearly combined into an approximate face., without needing any additional modeling assumption

**Correct Answer:** PCA reconstruction after dimensionality reduction is generally approximate.

**Explanation:** Discarded components lose variance, so U_reduce z approximates the centered input.

---

## Question 91

**Question:** An unsupervised-learning calculation is interpreted. Case 41: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Cosine similarity is always the Euclidean distance.
- **B.** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.
- **C.** Cosine similarity increases whenever both vector norms increase., under both the training and evaluation conditions stated
- **D.** Cosine similarity is undefined for every non-unit vector.

**Correct Answer:** Cosine similarity depends on direction and is unchanged by positive rescaling of one vector.

**Explanation:** The dot product and norm scale cancel for positive scalar multiplication.

---

## Question 92

**Question:** An unsupervised-learning calculation is interpreted. Case 42: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** K-Means alternates nearest-centroid assignment and mean-based centroid updates.
- **B.** K-Means updates centroids using the farthest point only.
- **C.** K-Means infers K exclusively from zero Laplacian eigenvalues., even when the other quantities in the formula are fixed
- **D.** K-Means assigns fractional memberships that must sum to one.

**Correct Answer:** K-Means alternates nearest-centroid assignment and mean-based centroid updates.

**Explanation:** The chapter describes hard assignment followed by arithmetic means.

---

## Question 93

**Question:** An unsupervised-learning calculation is interpreted. Case 43: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Single linkage uses the maximum cross-cluster pair distance.
- **B.** Single linkage averages only within-cluster distances.
- **C.** Single linkage uses the minimum cross-cluster pair distance.
- **D.** Single linkage is the PCA explained-variance ratio.

**Correct Answer:** Single linkage uses the minimum cross-cluster pair distance.

**Explanation:** Minimum pairwise distance defines single linkage.

---

## Question 94

**Question:** An unsupervised-learning calculation is interpreted. Case 44: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Complete linkage uses the minimum pair distance.
- **B.** Complete linkage uses the maximum cross-cluster pair distance.
- **C.** Complete linkage is always identical to average linkage., without needing any additional modeling assumption
- **D.** Complete linkage projects points onto eigenvectors.

**Correct Answer:** Complete linkage uses the maximum cross-cluster pair distance.

**Explanation:** Maximum pairwise separation defines complete linkage.

---

## Question 95

**Question:** An unsupervised-learning calculation is interpreted. Case 45: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The graph Laplacian is W-D with no sign convention in the chapter.
- **B.** The graph Laplacian is the covariance X^T X only.
- **C.** The degree matrix contains eigenvectors in its diagonal.
- **D.** The unnormalized graph Laplacian is L=D-W.

**Correct Answer:** The unnormalized graph Laplacian is L=D-W.

**Explanation:** D contains row sums of W and L subtracts W.

---

## Question 96

**Question:** An unsupervised-learning calculation is interpreted. Case 46: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Every graph has exactly two zero eigenvalues.
- **B.** A zero eigenvalue proves every edge weight is negative.
- **C.** Zero eigenvalues determine the requested K-Means centroid values., even when the other quantities in the formula are fixed
- **D.** The number of zero Laplacian eigenvalues is related to connected-component count.

**Correct Answer:** The number of zero Laplacian eigenvalues is related to connected-component count.

**Explanation:** Disconnected components contribute independent constant eigenvectors.

---

## Question 97

**Question:** An unsupervised-learning calculation is interpreted. Case 47: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** It uses the largest covariance eigenvector to assign labels., as a consequence that holds for every permitted input
- **B.** It uses the all-ones zero-eigenvalue vector for every split.
- **C.** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.
- **D.** It sorts points by Euclidean norm and ignores the graph.

**Correct Answer:** A Fiedler-vector sign split uses the eigenvector of the second-smallest eigenvalue.

**Explanation:** The second Laplacian eigenvector carries the two-way partition signal.

---

## Question 98

**Question:** An unsupervised-learning calculation is interpreted. Case 48: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** PCA must one-hot encode each principal component.
- **B.** PCA first centers data before forming the stated covariance matrix.
- **C.** PCA chooses directions of minimum retained variance first., without needing any additional modeling assumption
- **D.** PCA requires labelled class targets for covariance.

**Correct Answer:** PCA first centers data before forming the stated covariance matrix.

**Explanation:** Mean normalization makes covariance describe variation about the center.

---

## Question 99

**Question:** An unsupervised-learning calculation is interpreted. Case 49: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** PCA retains eigenvectors associated with the largest eigenvalues.
- **B.** PCA retains only zero-eigenvalue directions.
- **C.** PCA sorts eigenvectors alphabetically by feature name., under both the training and evaluation conditions stated
- **D.** PCA chooses components using class-label accuracy.

**Correct Answer:** PCA retains eigenvectors associated with the largest eigenvalues.

**Explanation:** Eigenvalues quantify variance captured along their eigenvectors.

---

## Question 100

**Question:** An unsupervised-learning calculation is interpreted. Case 50: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Projection preserves every coordinate exactly for any k.
- **B.** Reconstruction requires a supervised target label.
- **C.** Eigenfaces cannot be linearly combined into an approximate face., even when the other quantities in the formula are fixed
- **D.** PCA reconstruction after dimensionality reduction is generally approximate.

**Correct Answer:** PCA reconstruction after dimensionality reduction is generally approximate.

**Explanation:** Discarded components lose variance, so U_reduce z approximates the centered input.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Distractors are designed around plausible definition, sign, denominator, update-order, and rounding errors.
