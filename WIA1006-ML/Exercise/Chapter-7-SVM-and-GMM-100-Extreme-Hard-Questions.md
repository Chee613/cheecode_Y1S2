# Chapter 7: SVM and GMM: 100 Extreme-Hard Questions

> Topics: margins, constraints, dual coefficients, kernels, hyperparameters, Gaussian mixtures, and soft clustering. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** For w=['2', '-1'], x=['1', '2'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (-0.5, 1, 0.5)
- **B.** (-0.5, -1, 0.2236)
- **C.** (0.5, -1, 0.2236), as a consequence that holds for every permitted input
- **D.** (-0.5, -1, 0.5)

**Correct Answer:** (-0.5, -1, 0.2236)

**Explanation:** score=w^T x+b=-0.5; its sign is -1; distance=|score|/||w||=0.2236.

---

## Question 2

**Question:** A labelled point has y=1 and decision score w^T x+b=1.2. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (-1.2, 0)
- **B.** (1.2, 1)
- **C.** (1.2, 0)
- **D.** (1.2, 2.2)

**Correct Answer:** (1.2, 0)

**Explanation:** Multiply by y: 1(1.2)=1.2; violation is max(0,1-1.2)=0.

---

## Question 3

**Question:** Two dual terms have alpha=['0.5', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['1.3', '-0.1'], 0.2)
- **B.** (['0.7', '1.1'], 0.8)
- **C.** (['-1.3', '0.1'], -0.2)
- **D.** (['1.3', '-0.1'], 0.8)

**Correct Answer:** (['1.3', '-0.1'], 0.2)

**Explanation:** w is the signed weighted vector sum ['1.3', '-0.1']; the equality expression is 0.2.

---

## Question 4

**Question:** Two points have squared distance 1. For RBF variance sigma^2=0.5, what is K(x,z)?

**Choices:**
- **A.** 0.3679
- **B.** 0.5049
- **C.** 0.1749
- **D.** 0.6389

**Correct Answer:** 0.3679

**Explanation:** K=exp(-1/(2(0.5)))=0.3679.

---

## Question 5

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=-1, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.1596, 0.8994)
- **B.** (0.1774, 0.1596)
- **C.** (0.4287, 0.1006)
- **D.** (0.1774, 0.8994)

**Correct Answer:** (0.1774, 0.8994)

**Explanation:** Weighted component terms are ['0.1596', '0.0178']; density is their sum 0.1774, and normalized component-1 share is 0.8994.

---

## Question 6

**Question:** For w=['2.1', '-1'], x=['1', '1.9'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (-0.3, 1, 0.3)
- **B.** (-0.3, -1, 0.129)
- **C.** (0.3, -1, 0.129), without needing any additional modeling assumption
- **D.** (-0.3, -1, 0.3)

**Correct Answer:** (-0.3, -1, 0.129)

**Explanation:** score=w^T x+b=-0.3; its sign is -1; distance=|score|/||w||=0.129.

---

## Question 7

**Question:** A labelled point has y=-1 and decision score w^T x+b=-1.3. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (-1.3, 0)
- **B.** (-1.3, 1)
- **C.** (1.3, 2.3)
- **D.** (1.3, 0)

**Correct Answer:** (1.3, 0)

**Explanation:** Multiply by y: -1(-1.3)=1.3; violation is max(0,1-1.3)=0.

---

## Question 8

**Question:** Two dual terms have alpha=['0.55', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['0.8', '1.15'], 0.85)
- **B.** (['-1.4', '0.05'], -0.25)
- **C.** (['1.4', '-0.05'], 0.85)
- **D.** (['1.4', '-0.05'], 0.25)

**Correct Answer:** (['1.4', '-0.05'], 0.25)

**Explanation:** w is the signed weighted vector sum ['1.4', '-0.05']; the equality expression is 0.25.

---

## Question 9

**Question:** Two points have squared distance 1.5. For RBF variance sigma^2=1, what is K(x,z)?

**Choices:**
- **A.** 0.4724
- **B.** 0.2231
- **C.** 0.5421
- **D.** 0.5276

**Correct Answer:** 0.4724

**Explanation:** K=exp(-1.5/(2(1)))=0.4724.

---

## Question 10

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=-0.75, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.1547, 0.8582)
- **B.** (0.1802, 0.1547)
- **C.** (0.4293, 0.1418)
- **D.** (0.1802, 0.8582)

**Correct Answer:** (0.1802, 0.8582)

**Explanation:** Weighted component terms are ['0.1547', '0.0256']; density is their sum 0.1802, and normalized component-1 share is 0.8582.

---

## Question 11

**Question:** For w=['2.2', '-1'], x=['1', '1.8'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (-0.1, -1, 0.0414)
- **B.** (-0.1, 1, 0.1)
- **C.** (0.1, -1, 0.0414), under both the training and evaluation conditions stated
- **D.** (-0.1, -1, 0.1)

**Correct Answer:** (-0.1, -1, 0.0414)

**Explanation:** score=w^T x+b=-0.1; its sign is -1; distance=|score|/||w||=0.0414.

---

## Question 12

**Question:** A labelled point has y=1 and decision score w^T x+b=1.4. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (1.4, 0)
- **B.** (-1.4, 0)
- **C.** (1.4, 1)
- **D.** (1.4, 2.4)

**Correct Answer:** (1.4, 0)

**Explanation:** Multiply by y: 1(1.4)=1.4; violation is max(0,1-1.4)=0.

---

## Question 13

**Question:** Two dual terms have alpha=['0.6', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['0.9', '1.2'], 0.9)
- **B.** (['1.5', '0'], 0.3)
- **C.** (['-1.5', '0'], -0.3)
- **D.** (['1.5', '0'], 0.9)

**Correct Answer:** (['1.5', '0'], 0.3)

**Explanation:** w is the signed weighted vector sum ['1.5', '0']; the equality expression is 0.3.

---

## Question 14

**Question:** Two points have squared distance 2. For RBF variance sigma^2=1.5, what is K(x,z)?

**Choices:**
- **A.** 0.2636
- **B.** 0.6241
- **C.** 0.5134
- **D.** 0.4866

**Correct Answer:** 0.5134

**Explanation:** K=exp(-2/(2(1.5)))=0.5134.

---

## Question 15

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=-0.5, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.1408, 0.7988)
- **B.** (0.1763, 0.1408)
- **C.** (0.4112, 0.2012)
- **D.** (0.1763, 0.7988)

**Correct Answer:** (0.1763, 0.7988)

**Explanation:** Weighted component terms are ['0.1408', '0.0355']; density is their sum 0.1763, and normalized component-1 share is 0.7988.

---

## Question 16

**Question:** For w=['2.3', '-1'], x=['1', '1.7'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (0.1, -1, 0.1)
- **B.** (-0.1, 1, 0.0399)
- **C.** (0.1, 1, 0.0399)
- **D.** (0.1, 1, 0.1)

**Correct Answer:** (0.1, 1, 0.0399)

**Explanation:** score=w^T x+b=0.1; its sign is 1; distance=|score|/||w||=0.0399.

---

## Question 17

**Question:** A labelled point has y=-1 and decision score w^T x+b=-1.5. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (-1.5, 0)
- **B.** (-1.5, 1)
- **C.** (1.5, 0)
- **D.** (1.5, 2.5)

**Correct Answer:** (1.5, 0)

**Explanation:** Multiply by y: -1(-1.5)=1.5; violation is max(0,1-1.5)=0.

---

## Question 18

**Question:** Two dual terms have alpha=['0.65', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['1', '1.25'], 0.95)
- **B.** (['-1.6', '-0.05'], -0.35)
- **C.** (['1.6', '0.05'], 0.35)
- **D.** (['1.6', '0.05'], 0.95)

**Correct Answer:** (['1.6', '0.05'], 0.35)

**Explanation:** w is the signed weighted vector sum ['1.6', '0.05']; the equality expression is 0.35.

---

## Question 19

**Question:** Two points have squared distance 2.5. For RBF variance sigma^2=2, what is K(x,z)?

**Choices:**
- **A.** 0.2865
- **B.** 0.6735
- **C.** 0.5353
- **D.** 0.4647

**Correct Answer:** 0.5353

**Explanation:** K=exp(-2.5/(2(2)))=0.5353.

---

## Question 20

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=-0.25, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.1205, 0.7162)
- **B.** (0.1682, 0.7162)
- **C.** (0.1682, 0.1205)
- **D.** (0.3807, 0.2838)

**Correct Answer:** (0.1682, 0.7162)

**Explanation:** Weighted component terms are ['0.1205', '0.0477']; density is their sum 0.1682, and normalized component-1 share is 0.7162.

---

## Question 21

**Question:** For w=['2.4', '-1'], x=['1', '1.6'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (0.3, -1, 0.3)
- **B.** (0.3, 1, 0.1154)
- **C.** (-0.3, 1, 0.1154)
- **D.** (0.3, 1, 0.3)

**Correct Answer:** (0.3, 1, 0.1154)

**Explanation:** score=w^T x+b=0.3; its sign is 1; distance=|score|/||w||=0.1154.

---

## Question 22

**Question:** A labelled point has y=1 and decision score w^T x+b=1.6. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (-1.6, 0)
- **B.** (1.6, 1)
- **C.** (1.6, 0)
- **D.** (1.6, 2.6)

**Correct Answer:** (1.6, 0)

**Explanation:** Multiply by y: 1(1.6)=1.6; violation is max(0,1-1.6)=0.

---

## Question 23

**Question:** Two dual terms have alpha=['0.7', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['1.1', '1.3'], 1)
- **B.** (['1.7', '0.1'], 0.4)
- **C.** (['-1.7', '-0.1'], -0.4)
- **D.** (['1.7', '0.1'], 1)

**Correct Answer:** (['1.7', '0.1'], 0.4)

**Explanation:** w is the signed weighted vector sum ['1.7', '0.1']; the equality expression is 0.4.

---

## Question 24

**Question:** Two points have squared distance 3. For RBF variance sigma^2=0.5, what is K(x,z)?

**Choices:**
- **A.** 0.0025
- **B.** 0.1769
- **C.** 0.0498
- **D.** 0.9502

**Correct Answer:** 0.0498

**Explanation:** K=exp(-3/(2(0.5)))=0.0498.

---

## Question 25

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=0, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.1591, 0.6085)
- **B.** (0.0968, 0.6085)
- **C.** (0.1591, 0.0968)
- **D.** (0.3457, 0.3915)

**Correct Answer:** (0.1591, 0.6085)

**Explanation:** Weighted component terms are ['0.0968', '0.0623']; density is their sum 0.1591, and normalized component-1 share is 0.6085.

---

## Question 26

**Question:** For w=['2.5', '-1'], x=['1', '1.5'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (0.5, -1, 0.5)
- **B.** (0.5, 1, 0.1857)
- **C.** (-0.5, 1, 0.1857)
- **D.** (0.5, 1, 0.5)

**Correct Answer:** (0.5, 1, 0.1857)

**Explanation:** score=w^T x+b=0.5; its sign is 1; distance=|score|/||w||=0.1857.

---

## Question 27

**Question:** A labelled point has y=-1 and decision score w^T x+b=-1.7. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (-1.7, 0)
- **B.** (1.7, 0)
- **C.** (-1.7, 1)
- **D.** (1.7, 2.7)

**Correct Answer:** (1.7, 0)

**Explanation:** Multiply by y: -1(-1.7)=1.7; violation is max(0,1-1.7)=0.

---

## Question 28

**Question:** Two dual terms have alpha=['0.75', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['1.2', '1.35'], 1.05)
- **B.** (['1.8', '0.15'], 0.45)
- **C.** (['-1.8', '-0.15'], -0.45)
- **D.** (['1.8', '0.15'], 1.05)

**Correct Answer:** (['1.8', '0.15'], 0.45)

**Explanation:** w is the signed weighted vector sum ['1.8', '0.15']; the equality expression is 0.45.

---

## Question 29

**Question:** Two points have squared distance 3.5. For RBF variance sigma^2=1, what is K(x,z)?

**Choices:**
- **A.** 0.0302
- **B.** 0.3924
- **C.** 0.1738
- **D.** 0.8262

**Correct Answer:** 0.1738

**Explanation:** K=exp(-3.5/(2(1)))=0.1738.

---

## Question 30

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=0.25, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.0731, 0.4814)
- **B.** (0.1518, 0.4814)
- **C.** (0.1518, 0.0731)
- **D.** (0.3138, 0.5186)

**Correct Answer:** (0.1518, 0.4814)

**Explanation:** Weighted component terms are ['0.0731', '0.0787']; density is their sum 0.1518, and normalized component-1 share is 0.4814.

---

## Question 31

**Question:** For w=['2.6', '-1'], x=['1', '1.4'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (0.7, 1, 0.2513)
- **B.** (0.7, -1, 0.7)
- **C.** (-0.7, 1, 0.2513)
- **D.** (0.7, 1, 0.7)

**Correct Answer:** (0.7, 1, 0.2513)

**Explanation:** score=w^T x+b=0.7; its sign is 1; distance=|score|/||w||=0.2513.

---

## Question 32

**Question:** A labelled point has y=1 and decision score w^T x+b=1.8. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (1.8, 0)
- **B.** (-1.8, 0)
- **C.** (1.8, 1)
- **D.** (1.8, 2.8)

**Correct Answer:** (1.8, 0)

**Explanation:** Multiply by y: 1(1.8)=1.8; violation is max(0,1-1.8)=0.

---

## Question 33

**Question:** Two dual terms have alpha=['0.8', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['1.3', '1.4'], 1.1)
- **B.** (['-1.9', '-0.2'], -0.5)
- **C.** (['1.9', '0.2'], 1.1)
- **D.** (['1.9', '0.2'], 0.5)

**Correct Answer:** (['1.9', '0.2'], 0.5)

**Explanation:** w is the signed weighted vector sum ['1.9', '0.2']; the equality expression is 0.5.

---

## Question 34

**Question:** Two points have squared distance 4. For RBF variance sigma^2=1.5, what is K(x,z)?

**Choices:**
- **A.** 0.0695
- **B.** 0.5134
- **C.** 0.2636
- **D.** 0.7364

**Correct Answer:** 0.2636

**Explanation:** K=exp(-4/(2(1.5)))=0.2636.

---

## Question 35

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=0.5, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.0518, 0.3495)
- **B.** (0.1482, 0.3495)
- **C.** (0.1482, 0.0518)
- **D.** (0.2903, 0.6505)

**Correct Answer:** (0.1482, 0.3495)

**Explanation:** Weighted component terms are ['0.0518', '0.0964']; density is their sum 0.1482, and normalized component-1 share is 0.3495.

---

## Question 36

**Question:** For w=['2.7', '-1'], x=['1', '1.3'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (0.9, -1, 0.9)
- **B.** (-0.9, 1, 0.3126)
- **C.** (0.9, 1, 0.3126)
- **D.** (0.9, 1, 0.9)

**Correct Answer:** (0.9, 1, 0.3126)

**Explanation:** score=w^T x+b=0.9; its sign is 1; distance=|score|/||w||=0.3126.

---

## Question 37

**Question:** A labelled point has y=-1 and decision score w^T x+b=-1.9. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (-1.9, 0)
- **B.** (-1.9, 1)
- **C.** (1.9, 0)
- **D.** (1.9, 2.9)

**Correct Answer:** (1.9, 0)

**Explanation:** Multiply by y: -1(-1.9)=1.9; violation is max(0,1-1.9)=0.

---

## Question 38

**Question:** Two dual terms have alpha=['0.85', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['2', '0.25'], 0.55)
- **B.** (['1.4', '1.45'], 1.15)
- **C.** (['-2', '-0.25'], -0.55)
- **D.** (['2', '0.25'], 1.15)

**Correct Answer:** (['2', '0.25'], 0.55)

**Explanation:** w is the signed weighted vector sum ['2', '0.25']; the equality expression is 0.55.

---

## Question 39

**Question:** Two points have squared distance 4.5. For RBF variance sigma^2=2, what is K(x,z)?

**Choices:**
- **A.** 0.3247
- **B.** 0.1054
- **C.** 0.5884
- **D.** 0.6753

**Correct Answer:** 0.3247

**Explanation:** K=exp(-4.5/(2(2)))=0.3247.

---

## Question 40

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=0.75, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.0345, 0.2316)
- **B.** (0.149, 0.2316)
- **C.** (0.149, 0.0345)
- **D.** (0.2772, 0.7684)

**Correct Answer:** (0.149, 0.2316)

**Explanation:** Weighted component terms are ['0.0345', '0.1145']; density is their sum 0.149, and normalized component-1 share is 0.2316.

---

## Question 41

**Question:** For w=['2.8', '-1'], x=['1', '1.2'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (1.1, -1, 1.1)
- **B.** (-1.1, 1, 0.37)
- **C.** (1.1, 1, 0.37)
- **D.** (1.1, 1, 1.1)

**Correct Answer:** (1.1, 1, 0.37)

**Explanation:** score=w^T x+b=1.1; its sign is 1; distance=|score|/||w||=0.37.

---

## Question 42

**Question:** A labelled point has y=1 and decision score w^T x+b=2. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (-2, 0)
- **B.** (2, 0)
- **C.** (2, 1)
- **D.** (2, 3)

**Correct Answer:** (2, 0)

**Explanation:** Multiply by y: 1(2)=2; violation is max(0,1-2)=0.

---

## Question 43

**Question:** Two dual terms have alpha=['0.9', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['1.5', '1.5'], 1.2)
- **B.** (['-2.1', '-0.3'], -0.6)
- **C.** (['2.1', '0.3'], 1.2)
- **D.** (['2.1', '0.3'], 0.6)

**Correct Answer:** (['2.1', '0.3'], 0.6)

**Explanation:** w is the signed weighted vector sum ['2.1', '0.3']; the equality expression is 0.6.

---

## Question 44

**Question:** Two points have squared distance 5. For RBF variance sigma^2=0.5, what is K(x,z)?

**Choices:**
- **A.** 0
- **B.** 0.1069
- **C.** 0.0067
- **D.** 0.9933

**Correct Answer:** 0.0067

**Explanation:** K=exp(-5/(2(0.5)))=0.0067.

---

## Question 45

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=1, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.0216, 0.1408)
- **B.** (0.1534, 0.0216)
- **C.** (0.2737, 0.8592)
- **D.** (0.1534, 0.1408)

**Correct Answer:** (0.1534, 0.1408)

**Explanation:** Weighted component terms are ['0.0216', '0.1318']; density is their sum 0.1534, and normalized component-1 share is 0.1408.

---

## Question 46

**Question:** For w=['2.9', '-1'], x=['1', '1.1'], b=-0.5, compute (score, predicted sign, distance to hyperplane).

**Choices:**
- **A.** (1.3, -1, 1.3)
- **B.** (1.3, 1, 0.4238)
- **C.** (-1.3, 1, 0.4238)
- **D.** (1.3, 1, 1.3)

**Correct Answer:** (1.3, 1, 0.4238)

**Explanation:** score=w^T x+b=1.3; its sign is 1; distance=|score|/||w||=0.4238.

---

## Question 47

**Question:** A labelled point has y=-1 and decision score w^T x+b=-2.1. What are (functional-margin product, hard-margin violation amount max(0,1-product))?

**Choices:**
- **A.** (2.1, 0)
- **B.** (-2.1, 0)
- **C.** (-2.1, 1)
- **D.** (2.1, 3.1)

**Correct Answer:** (2.1, 0)

**Explanation:** Multiply by y: -1(-2.1)=2.1; violation is max(0,1-2.1)=0.

---

## Question 48

**Question:** Two dual terms have alpha=['0.95', '0.3'], y=[1, -1], x=[[2, 1], [-1, 2]]. What pair (w, sum alpha_i y_i) results?

**Choices:**
- **A.** (['2.2', '0.35'], 0.65)
- **B.** (['1.6', '1.55'], 1.25)
- **C.** (['-2.2', '-0.35'], -0.65)
- **D.** (['2.2', '0.35'], 1.25)

**Correct Answer:** (['2.2', '0.35'], 0.65)

**Explanation:** w is the signed weighted vector sum ['2.2', '0.35']; the equality expression is 0.65.

---

## Question 49

**Question:** Two points have squared distance 5.5. For RBF variance sigma^2=1, what is K(x,z)?

**Choices:**
- **A.** 0.0041
- **B.** 0.3096
- **C.** 0.9361
- **D.** 0.0639

**Correct Answer:** 0.0639

**Explanation:** K=exp(-5.5/(2(1)))=0.0639.

---

## Question 50

**Question:** A 1D GMM has pi=[0.4, 0.6], mu=[-1, 2], variances=[1, 2]. At x=1.25, what pair (mixture density, component-1 normalized membership) is correct?

**Choices:**
- **A.** (0.1597, 0.0795)
- **B.** (0.0127, 0.0795)
- **C.** (0.1597, 0.0127)
- **D.** (0.2768, 0.9205)

**Correct Answer:** (0.1597, 0.0795)

**Explanation:** Weighted component terms are ['0.0127', '0.1471']; density is their sum 0.1597, and normalized component-1 share is 0.0795.

---

## Question 51

**Question:** An SVM/GMM model-selection argument is examined. Case 1: Which conclusion is the single most defensible?

**Choices:**
- **A.** Every non-support vector has a nonzero dual coefficient.
- **B.** Support vectors are always the points farthest from the hyperplane.
- **C.** Support vectors are the training points that determine the maximum-margin boundary.
- **D.** Removing all support vectors leaves the same boundary by definition., under both the training and evaluation conditions stated

**Correct Answer:** Support vectors are the training points that determine the maximum-margin boundary.

**Explanation:** Nonzero alpha values identify the influential closest points.

---

## Question 52

**Question:** An SVM/GMM model-selection argument is examined. Case 2: Which conclusion is the single most defensible?

**Choices:**
- **A.** Hard margin accepts every point with product below zero.
- **B.** The constraint omits labels and uses only ||w||.
- **C.** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.
- **D.** Hard margin requires every point to lie on the hyperplane., even when the other quantities in the formula are fixed

**Correct Answer:** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.

**Explanation:** The signed functional margin must meet at least one.

---

## Question 53

**Question:** An SVM/GMM model-selection argument is examined. Case 3: Which conclusion is the single most defensible?

**Choices:**
- **A.** Maximizing ||w|| always widens the margin.
- **B.** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.
- **C.** The objective directly maximizes the number of features., as a consequence that holds for every permitted input
- **D.** The norm controls only the class-label encoding.

**Correct Answer:** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.

**Explanation:** Under fixed functional scaling, geometric margin varies inversely with ||w||.

---

## Question 54

**Question:** An SVM/GMM model-selection argument is examined. Case 4: Which conclusion is the single most defensible?

**Choices:**
- **A.** All alpha values must be negative for support vectors.
- **B.** The equality constraint is sum alpha_i=1 without labels., without needing any additional modeling assumption
- **C.** The dual removes every dependence on inner products.
- **D.** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.

**Correct Answer:** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.

**Explanation:** Zero coefficients vanish from the weighted sum.

---

## Question 55

**Question:** An SVM/GMM model-selection argument is examined. Case 5: Which conclusion is the single most defensible?

**Choices:**
- **A.** A kernel replaces every label with a continuous target.
- **B.** A kernel guarantees linearly separable raw inputs without parameters.
- **C.** A kernel replaces an input-space inner product with K(x_i,x_j).
- **D.** A kernel is the same as the SVM penalty C.

**Correct Answer:** A kernel replaces an input-space inner product with K(x_i,x_j).

**Explanation:** The kernel trick changes similarity computation in the dual.

---

## Question 56

**Question:** An SVM/GMM model-selection argument is examined. Case 6: Which conclusion is the single most defensible?

**Choices:**
- **A.** Small variance makes every pair's kernel value exactly one., even when the other quantities in the formula are fixed
- **B.** Large variance always creates more local variation.
- **C.** RBF variance is the misclassification penalty C.
- **D.** Small RBF variance produces a more localized, flexible boundary.

**Correct Answer:** Small RBF variance produces a more localized, flexible boundary.

**Explanation:** Narrow Gaussians decay quickly with distance.

---

## Question 57

**Question:** An SVM/GMM model-selection argument is examined. Case 7: Which conclusion is the single most defensible?

**Choices:**
- **A.** Large C penalizes violations more strongly and can increase variance.
- **B.** Large C ignores every misclassification.
- **C.** Small C necessarily produces zero training error., as a consequence that holds for every permitted input
- **D.** C is the Gaussian mixing coefficient sum.

**Correct Answer:** Large C penalizes violations more strongly and can increase variance.

**Explanation:** The stated trade-off links large C with lower bias and higher variance.

---

## Question 58

**Question:** An SVM/GMM model-selection argument is examined. Case 8: Which conclusion is the single most defensible?

**Choices:**
- **A.** GMM gives each point a probability-like membership across components.
- **B.** GMM assigns every point permanently to exactly one centroid., without needing any additional modeling assumption
- **C.** GMM contains no mixing coefficients.
- **D.** GMM cannot represent more than one Gaussian.

**Correct Answer:** GMM gives each point a probability-like membership across components.

**Explanation:** GMM is soft, probabilistic clustering.

---

## Question 59

**Question:** An SVM/GMM model-selection argument is examined. Case 9: Which conclusion is the single most defensible?

**Choices:**
- **A.** Each mixing coefficient must be greater than one.
- **B.** Mixing coefficients are unconstrained SVM dual variables.
- **C.** Their sum must equal the number of data points.
- **D.** Mixing coefficients are nonnegative and sum to one.

**Correct Answer:** Mixing coefficients are nonnegative and sum to one.

**Explanation:** They form component prior probabilities.

---

## Question 60

**Question:** An SVM/GMM model-selection argument is examined. Case 10: Which conclusion is the single most defensible?

**Choices:**
- **A.** K-Means and GMM return identical membership probabilities by definition., even when the other quantities in the formula are fixed
- **B.** K-Means is distance-based hard clustering; GMM is density-based soft clustering.
- **C.** GMM has centroids but no Gaussian parameters.
- **D.** K-Means requires covariance matrices for every point.

**Correct Answer:** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Explanation:** The tracker explicitly contrasts their assignments and representations.

---

## Question 61

**Question:** An SVM/GMM model-selection argument is examined. Case 11: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Support vectors are the training points that determine the maximum-margin boundary.
- **B.** Every non-support vector has a nonzero dual coefficient.
- **C.** Support vectors are always the points farthest from the hyperplane.
- **D.** Removing all support vectors leaves the same boundary by definition., as a consequence that holds for every permitted input

**Correct Answer:** Support vectors are the training points that determine the maximum-margin boundary.

**Explanation:** Nonzero alpha values identify the influential closest points.

---

## Question 62

**Question:** An SVM/GMM model-selection argument is examined. Case 12: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Hard margin accepts every point with product below zero.
- **B.** The constraint omits labels and uses only ||w||.
- **C.** Hard margin requires every point to lie on the hyperplane., without needing any additional modeling assumption
- **D.** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.

**Correct Answer:** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.

**Explanation:** The signed functional margin must meet at least one.

---

## Question 63

**Question:** An SVM/GMM model-selection argument is examined. Case 13: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Maximizing ||w|| always widens the margin.
- **B.** The objective directly maximizes the number of features., under both the training and evaluation conditions stated
- **C.** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.
- **D.** The norm controls only the class-label encoding.

**Correct Answer:** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.

**Explanation:** Under fixed functional scaling, geometric margin varies inversely with ||w||.

---

## Question 64

**Question:** An SVM/GMM model-selection argument is examined. Case 14: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.
- **B.** All alpha values must be negative for support vectors.
- **C.** The equality constraint is sum alpha_i=1 without labels., even when the other quantities in the formula are fixed
- **D.** The dual removes every dependence on inner products.

**Correct Answer:** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.

**Explanation:** Zero coefficients vanish from the weighted sum.

---

## Question 65

**Question:** An SVM/GMM model-selection argument is examined. Case 15: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A kernel replaces every label with a continuous target.
- **B.** A kernel guarantees linearly separable raw inputs without parameters.
- **C.** A kernel is the same as the SVM penalty C.
- **D.** A kernel replaces an input-space inner product with K(x_i,x_j).

**Correct Answer:** A kernel replaces an input-space inner product with K(x_i,x_j).

**Explanation:** The kernel trick changes similarity computation in the dual.

---

## Question 66

**Question:** An SVM/GMM model-selection argument is examined. Case 16: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Small variance makes every pair's kernel value exactly one., without needing any additional modeling assumption
- **B.** Large variance always creates more local variation.
- **C.** Small RBF variance produces a more localized, flexible boundary.
- **D.** RBF variance is the misclassification penalty C.

**Correct Answer:** Small RBF variance produces a more localized, flexible boundary.

**Explanation:** Narrow Gaussians decay quickly with distance.

---

## Question 67

**Question:** An SVM/GMM model-selection argument is examined. Case 17: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Large C ignores every misclassification.
- **B.** Small C necessarily produces zero training error., under both the training and evaluation conditions stated
- **C.** C is the Gaussian mixing coefficient sum.
- **D.** Large C penalizes violations more strongly and can increase variance.

**Correct Answer:** Large C penalizes violations more strongly and can increase variance.

**Explanation:** The stated trade-off links large C with lower bias and higher variance.

---

## Question 68

**Question:** An SVM/GMM model-selection argument is examined. Case 18: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** GMM assigns every point permanently to exactly one centroid., even when the other quantities in the formula are fixed
- **B.** GMM contains no mixing coefficients.
- **C.** GMM gives each point a probability-like membership across components.
- **D.** GMM cannot represent more than one Gaussian.

**Correct Answer:** GMM gives each point a probability-like membership across components.

**Explanation:** GMM is soft, probabilistic clustering.

---

## Question 69

**Question:** An SVM/GMM model-selection argument is examined. Case 19: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Each mixing coefficient must be greater than one.
- **B.** Mixing coefficients are nonnegative and sum to one.
- **C.** Mixing coefficients are unconstrained SVM dual variables.
- **D.** Their sum must equal the number of data points.

**Correct Answer:** Mixing coefficients are nonnegative and sum to one.

**Explanation:** They form component prior probabilities.

---

## Question 70

**Question:** An SVM/GMM model-selection argument is examined. Case 20: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** K-Means and GMM return identical membership probabilities by definition., without needing any additional modeling assumption
- **B.** GMM has centroids but no Gaussian parameters.
- **C.** K-Means requires covariance matrices for every point.
- **D.** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Correct Answer:** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Explanation:** The tracker explicitly contrasts their assignments and representations.

---

## Question 71

**Question:** An SVM/GMM model-selection argument is examined. Case 21: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Every non-support vector has a nonzero dual coefficient.
- **B.** Support vectors are always the points farthest from the hyperplane.
- **C.** Removing all support vectors leaves the same boundary by definition., under both the training and evaluation conditions stated
- **D.** Support vectors are the training points that determine the maximum-margin boundary.

**Correct Answer:** Support vectors are the training points that determine the maximum-margin boundary.

**Explanation:** Nonzero alpha values identify the influential closest points.

---

## Question 72

**Question:** An SVM/GMM model-selection argument is examined. Case 22: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Hard margin accepts every point with product below zero.
- **B.** The constraint omits labels and uses only ||w||.
- **C.** Hard margin requires every point to lie on the hyperplane., even when the other quantities in the formula are fixed
- **D.** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.

**Correct Answer:** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.

**Explanation:** The signed functional margin must meet at least one.

---

## Question 73

**Question:** An SVM/GMM model-selection argument is examined. Case 23: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.
- **B.** Maximizing ||w|| always widens the margin.
- **C.** The objective directly maximizes the number of features., as a consequence that holds for every permitted input
- **D.** The norm controls only the class-label encoding.

**Correct Answer:** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.

**Explanation:** Under fixed functional scaling, geometric margin varies inversely with ||w||.

---

## Question 74

**Question:** An SVM/GMM model-selection argument is examined. Case 24: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** All alpha values must be negative for support vectors.
- **B.** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.
- **C.** The equality constraint is sum alpha_i=1 without labels., without needing any additional modeling assumption
- **D.** The dual removes every dependence on inner products.

**Correct Answer:** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.

**Explanation:** Zero coefficients vanish from the weighted sum.

---

## Question 75

**Question:** An SVM/GMM model-selection argument is examined. Case 25: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A kernel replaces every label with a continuous target.
- **B.** A kernel guarantees linearly separable raw inputs without parameters.
- **C.** A kernel replaces an input-space inner product with K(x_i,x_j).
- **D.** A kernel is the same as the SVM penalty C.

**Correct Answer:** A kernel replaces an input-space inner product with K(x_i,x_j).

**Explanation:** The kernel trick changes similarity computation in the dual.

---

## Question 76

**Question:** An SVM/GMM model-selection argument is examined. Case 26: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Small variance makes every pair's kernel value exactly one., even when the other quantities in the formula are fixed
- **B.** Large variance always creates more local variation.
- **C.** RBF variance is the misclassification penalty C.
- **D.** Small RBF variance produces a more localized, flexible boundary.

**Correct Answer:** Small RBF variance produces a more localized, flexible boundary.

**Explanation:** Narrow Gaussians decay quickly with distance.

---

## Question 77

**Question:** An SVM/GMM model-selection argument is examined. Case 27: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Large C ignores every misclassification.
- **B.** Small C necessarily produces zero training error., as a consequence that holds for every permitted input
- **C.** Large C penalizes violations more strongly and can increase variance.
- **D.** C is the Gaussian mixing coefficient sum.

**Correct Answer:** Large C penalizes violations more strongly and can increase variance.

**Explanation:** The stated trade-off links large C with lower bias and higher variance.

---

## Question 78

**Question:** An SVM/GMM model-selection argument is examined. Case 28: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** GMM gives each point a probability-like membership across components.
- **B.** GMM assigns every point permanently to exactly one centroid., without needing any additional modeling assumption
- **C.** GMM contains no mixing coefficients.
- **D.** GMM cannot represent more than one Gaussian.

**Correct Answer:** GMM gives each point a probability-like membership across components.

**Explanation:** GMM is soft, probabilistic clustering.

---

## Question 79

**Question:** An SVM/GMM model-selection argument is examined. Case 29: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Each mixing coefficient must be greater than one.
- **B.** Mixing coefficients are nonnegative and sum to one.
- **C.** Mixing coefficients are unconstrained SVM dual variables.
- **D.** Their sum must equal the number of data points.

**Correct Answer:** Mixing coefficients are nonnegative and sum to one.

**Explanation:** They form component prior probabilities.

---

## Question 80

**Question:** An SVM/GMM model-selection argument is examined. Case 30: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** K-Means and GMM return identical membership probabilities by definition., even when the other quantities in the formula are fixed
- **B.** K-Means is distance-based hard clustering; GMM is density-based soft clustering.
- **C.** GMM has centroids but no Gaussian parameters.
- **D.** K-Means requires covariance matrices for every point.

**Correct Answer:** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Explanation:** The tracker explicitly contrasts their assignments and representations.

---

## Question 81

**Question:** An SVM/GMM model-selection argument is examined. Case 31: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Every non-support vector has a nonzero dual coefficient.
- **B.** Support vectors are always the points farthest from the hyperplane.
- **C.** Removing all support vectors leaves the same boundary by definition., as a consequence that holds for every permitted input
- **D.** Support vectors are the training points that determine the maximum-margin boundary.

**Correct Answer:** Support vectors are the training points that determine the maximum-margin boundary.

**Explanation:** Nonzero alpha values identify the influential closest points.

---

## Question 82

**Question:** An SVM/GMM model-selection argument is examined. Case 32: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Hard margin accepts every point with product below zero.
- **B.** The constraint omits labels and uses only ||w||.
- **C.** Hard margin requires every point to lie on the hyperplane., without needing any additional modeling assumption
- **D.** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.

**Correct Answer:** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.

**Explanation:** The signed functional margin must meet at least one.

---

## Question 83

**Question:** An SVM/GMM model-selection argument is examined. Case 33: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.
- **B.** Maximizing ||w|| always widens the margin.
- **C.** The objective directly maximizes the number of features., under both the training and evaluation conditions stated
- **D.** The norm controls only the class-label encoding.

**Correct Answer:** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.

**Explanation:** Under fixed functional scaling, geometric margin varies inversely with ||w||.

---

## Question 84

**Question:** An SVM/GMM model-selection argument is examined. Case 34: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** All alpha values must be negative for support vectors.
- **B.** The equality constraint is sum alpha_i=1 without labels., even when the other quantities in the formula are fixed
- **C.** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.
- **D.** The dual removes every dependence on inner products.

**Correct Answer:** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.

**Explanation:** Zero coefficients vanish from the weighted sum.

---

## Question 85

**Question:** An SVM/GMM model-selection argument is examined. Case 35: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A kernel replaces an input-space inner product with K(x_i,x_j).
- **B.** A kernel replaces every label with a continuous target.
- **C.** A kernel guarantees linearly separable raw inputs without parameters.
- **D.** A kernel is the same as the SVM penalty C.

**Correct Answer:** A kernel replaces an input-space inner product with K(x_i,x_j).

**Explanation:** The kernel trick changes similarity computation in the dual.

---

## Question 86

**Question:** An SVM/GMM model-selection argument is examined. Case 36: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Small RBF variance produces a more localized, flexible boundary.
- **B.** Small variance makes every pair's kernel value exactly one., without needing any additional modeling assumption
- **C.** Large variance always creates more local variation.
- **D.** RBF variance is the misclassification penalty C.

**Correct Answer:** Small RBF variance produces a more localized, flexible boundary.

**Explanation:** Narrow Gaussians decay quickly with distance.

---

## Question 87

**Question:** An SVM/GMM model-selection argument is examined. Case 37: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Large C ignores every misclassification.
- **B.** Large C penalizes violations more strongly and can increase variance.
- **C.** Small C necessarily produces zero training error., under both the training and evaluation conditions stated
- **D.** C is the Gaussian mixing coefficient sum.

**Correct Answer:** Large C penalizes violations more strongly and can increase variance.

**Explanation:** The stated trade-off links large C with lower bias and higher variance.

---

## Question 88

**Question:** An SVM/GMM model-selection argument is examined. Case 38: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** GMM assigns every point permanently to exactly one centroid., even when the other quantities in the formula are fixed
- **B.** GMM contains no mixing coefficients.
- **C.** GMM gives each point a probability-like membership across components.
- **D.** GMM cannot represent more than one Gaussian.

**Correct Answer:** GMM gives each point a probability-like membership across components.

**Explanation:** GMM is soft, probabilistic clustering.

---

## Question 89

**Question:** An SVM/GMM model-selection argument is examined. Case 39: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Each mixing coefficient must be greater than one.
- **B.** Mixing coefficients are nonnegative and sum to one.
- **C.** Mixing coefficients are unconstrained SVM dual variables.
- **D.** Their sum must equal the number of data points.

**Correct Answer:** Mixing coefficients are nonnegative and sum to one.

**Explanation:** They form component prior probabilities.

---

## Question 90

**Question:** An SVM/GMM model-selection argument is examined. Case 40: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** K-Means and GMM return identical membership probabilities by definition., without needing any additional modeling assumption
- **B.** GMM has centroids but no Gaussian parameters.
- **C.** K-Means requires covariance matrices for every point.
- **D.** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Correct Answer:** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Explanation:** The tracker explicitly contrasts their assignments and representations.

---

## Question 91

**Question:** An SVM/GMM model-selection argument is examined. Case 41: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Support vectors are the training points that determine the maximum-margin boundary.
- **B.** Every non-support vector has a nonzero dual coefficient.
- **C.** Support vectors are always the points farthest from the hyperplane.
- **D.** Removing all support vectors leaves the same boundary by definition., under both the training and evaluation conditions stated

**Correct Answer:** Support vectors are the training points that determine the maximum-margin boundary.

**Explanation:** Nonzero alpha values identify the influential closest points.

---

## Question 92

**Question:** An SVM/GMM model-selection argument is examined. Case 42: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Hard margin accepts every point with product below zero.
- **B.** The constraint omits labels and uses only ||w||.
- **C.** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.
- **D.** Hard margin requires every point to lie on the hyperplane., even when the other quantities in the formula are fixed

**Correct Answer:** Hard-margin constraints require y_i(w^T x_i+b) >= 1 for every training point.

**Explanation:** The signed functional margin must meet at least one.

---

## Question 93

**Question:** An SVM/GMM model-selection argument is examined. Case 43: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Maximizing ||w|| always widens the margin.
- **B.** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.
- **C.** The objective directly maximizes the number of features., as a consequence that holds for every permitted input
- **D.** The norm controls only the class-label encoding.

**Correct Answer:** Minimizing ||w||^2 under the canonical constraints maximizes geometric margin.

**Explanation:** Under fixed functional scaling, geometric margin varies inversely with ||w||.

---

## Question 94

**Question:** An SVM/GMM model-selection argument is examined. Case 44: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** All alpha values must be negative for support vectors.
- **B.** The equality constraint is sum alpha_i=1 without labels., without needing any additional modeling assumption
- **C.** The dual removes every dependence on inner products.
- **D.** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.

**Correct Answer:** Only nonzero dual coefficients contribute to w=sum alpha_i y_i x_i.

**Explanation:** Zero coefficients vanish from the weighted sum.

---

## Question 95

**Question:** An SVM/GMM model-selection argument is examined. Case 45: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A kernel replaces every label with a continuous target.
- **B.** A kernel replaces an input-space inner product with K(x_i,x_j).
- **C.** A kernel guarantees linearly separable raw inputs without parameters.
- **D.** A kernel is the same as the SVM penalty C.

**Correct Answer:** A kernel replaces an input-space inner product with K(x_i,x_j).

**Explanation:** The kernel trick changes similarity computation in the dual.

---

## Question 96

**Question:** An SVM/GMM model-selection argument is examined. Case 46: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Small variance makes every pair's kernel value exactly one., even when the other quantities in the formula are fixed
- **B.** Large variance always creates more local variation.
- **C.** RBF variance is the misclassification penalty C.
- **D.** Small RBF variance produces a more localized, flexible boundary.

**Correct Answer:** Small RBF variance produces a more localized, flexible boundary.

**Explanation:** Narrow Gaussians decay quickly with distance.

---

## Question 97

**Question:** An SVM/GMM model-selection argument is examined. Case 47: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Large C penalizes violations more strongly and can increase variance.
- **B.** Large C ignores every misclassification.
- **C.** Small C necessarily produces zero training error., as a consequence that holds for every permitted input
- **D.** C is the Gaussian mixing coefficient sum.

**Correct Answer:** Large C penalizes violations more strongly and can increase variance.

**Explanation:** The stated trade-off links large C with lower bias and higher variance.

---

## Question 98

**Question:** An SVM/GMM model-selection argument is examined. Case 48: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** GMM gives each point a probability-like membership across components.
- **B.** GMM assigns every point permanently to exactly one centroid., without needing any additional modeling assumption
- **C.** GMM contains no mixing coefficients.
- **D.** GMM cannot represent more than one Gaussian.

**Correct Answer:** GMM gives each point a probability-like membership across components.

**Explanation:** GMM is soft, probabilistic clustering.

---

## Question 99

**Question:** An SVM/GMM model-selection argument is examined. Case 49: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Each mixing coefficient must be greater than one.
- **B.** Mixing coefficients are unconstrained SVM dual variables.
- **C.** Their sum must equal the number of data points.
- **D.** Mixing coefficients are nonnegative and sum to one.

**Correct Answer:** Mixing coefficients are nonnegative and sum to one.

**Explanation:** They form component prior probabilities.

---

## Question 100

**Question:** An SVM/GMM model-selection argument is examined. Case 50: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** K-Means and GMM return identical membership probabilities by definition., even when the other quantities in the formula are fixed
- **B.** K-Means is distance-based hard clustering; GMM is density-based soft clustering.
- **C.** GMM has centroids but no Gaussian parameters.
- **D.** K-Means requires covariance matrices for every point.

**Correct Answer:** K-Means is distance-based hard clustering; GMM is density-based soft clustering.

**Explanation:** The tracker explicitly contrasts their assignments and representations.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Distractors are designed around plausible definition, sign, denominator, update-order, and rounding errors.
