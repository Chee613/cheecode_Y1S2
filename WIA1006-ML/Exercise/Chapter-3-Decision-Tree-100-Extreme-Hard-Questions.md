# Chapter 3: Decision Tree: 100 Extreme-Hard Questions

> Topics: tree semantics, entropy, information gain, Gini impurity, threshold splits, rules, overfitting, and pruning. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** Using binary counts=(1,11), compute the entropy.

**Choices:**
- **A.** entropy = 0.4138
- **B.** entropy = 0.4883
- **C.** entropy = 0.3393
- **D.** entropy = 0.5628

**Correct Answer:** entropy = 0.4138

**Explanation:** Apply $-\sum_i p_i\log_2 p_i$; substitution gives entropy=0.4138.

---

## Question 2

**Question:** Using child (+,-) counts=(2, 1) and (1, 5), compute the information gain.

**Choices:**
- **A.** information gain = 0.3208
- **B.** information gain = 0.2498
- **C.** information gain = 0.1078
- **D.** information gain = 0.1788

**Correct Answer:** information gain = 0.1788

**Explanation:** Apply $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$; substitution gives information gain=0.1788.

---

## Question 3

**Question:** Using class counts=(2,9), compute the Gini impurity.

**Choices:**
- **A.** Gini impurity = 0.2975
- **B.** Gini impurity = 0.3685
- **C.** Gini impurity = 0.2265
- **D.** Gini impurity = 0.4395

**Correct Answer:** Gini impurity = 0.2975

**Explanation:** Apply $1-\sum_i p_i^2$; substitution gives Gini impurity=0.2975.

---

## Question 4

**Question:** Using child entropies=(0.2,0.7), sizes=(3,8), compute the weighted child entropy.

**Choices:**
- **A.** weighted child entropy = 0.5636
- **B.** weighted child entropy = 0.6651
- **C.** weighted child entropy = 0.4622
- **D.** weighted child entropy = 0.7665

**Correct Answer:** weighted child entropy = 0.5636

**Explanation:** Apply $\sum_v\frac{|S_v|}{|S|}H(S_v)$; substitution gives weighted child entropy=0.5636.

---

## Question 5

**Question:** Using three child counts=[(3, 0), (1, 2), (0, 2)], compute the multiway information gain.

**Choices:**
- **A.** multiway information gain = 0.7737
- **B.** multiway information gain = 0.6556
- **C.** multiway information gain = 0.5376
- **D.** multiway information gain = 0.8917

**Correct Answer:** multiway information gain = 0.6556

**Explanation:** Apply $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$; substitution gives multiway information gain=0.6556.

---

## Question 6

**Question:** Compare the entropy for Case P (binary counts=(2,10)) and Case Q (binary counts=(5,7)).

**Choices:**
- **A.** The second case is larger: 0.9799 versus 0.65
- **B.** The first case is larger: 0.65 versus 0.9799 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.9799 versus 0.65

**Explanation:** The same formula gives 0.65 for P and 0.9799 for Q, establishing the stated comparison.

---

## Question 7

**Question:** Compare the information gain for Case P (child (+,-) counts=(3, 1) and (1, 6)) and Case Q (child (+,-) counts=(6, 1) and (1, 9)).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 0.2741 versus 0.4579 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 0.4579 versus 0.2741

**Correct Answer:** The second case is larger: 0.4579 versus 0.2741

**Explanation:** The same formula gives 0.2741 for P and 0.4579 for Q, establishing the stated comparison.

---

## Question 8

**Question:** Compare the Gini impurity for Case P (class counts=(3,9)) and Case Q (class counts=(6,9)).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 0.375 versus 0.48 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 0.48 versus 0.375

**Correct Answer:** The second case is larger: 0.48 versus 0.375

**Explanation:** The same formula gives 0.375 for P and 0.48 for Q, establishing the stated comparison.

---

## Question 9

**Question:** Compare the weighted child entropy for Case P (child entropies=(0.22,0.69), sizes=(4,8)) and Case Q (child entropies=(0.28,0.66), sizes=(7,8)).

**Choices:**
- **A.** The first case is larger: 0.5333 versus 0.4827
- **B.** The second case is larger: 0.4827 versus 0.5333
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 0.5333 versus 0.4827

**Explanation:** The same formula gives 0.5333 for P and 0.4827 for Q, establishing the stated comparison.

---

## Question 10

**Question:** Compare the multiway information gain for Case P (three child counts=[(4, 0), (1, 3), (0, 2)]) and Case Q (three child counts=[(7, 0), (1, 6), (0, 2)]).

**Choices:**
- **A.** The second case is larger: 0.7411 versus 0.6755
- **B.** The first case is larger: 0.6755 versus 0.7411 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.7411 versus 0.6755

**Explanation:** The same formula gives 0.6755 for P and 0.7411 for Q, establishing the stated comparison.

---

## Question 11

**Question:** How far apart are the entropy values for (binary counts=(3,9)) and (binary counts=(9,3))?

**Choices:**
- **A.** absolute entropy difference = 0.142
- **B.** absolute entropy difference = 0.071
- **C.** absolute entropy difference = -0.071
- **D.** absolute entropy difference = 0

**Correct Answer:** absolute entropy difference = 0

**Explanation:** The two values are 0.8113 and 0.8113; their absolute difference is 0.

---

## Question 12

**Question:** How far apart are the information gain values for (child (+,-) counts=(4, 1) and (1, 7)) and (child (+,-) counts=(10, 1) and (1, 13))?

**Choices:**
- **A.** absolute information gain difference = 0.2392
- **B.** absolute information gain difference = 0.3102
- **C.** absolute information gain difference = 0.1682
- **D.** absolute information gain difference = 0.3812

**Correct Answer:** absolute information gain difference = 0.2392

**Explanation:** The two values are 0.3491 and 0.5883; their absolute difference is 0.2392.

---

## Question 13

**Question:** How far apart are the Gini impurity values for (class counts=(4,9)) and (class counts=(10,9))?

**Choices:**
- **A.** absolute Gini impurity difference = 0.0016
- **B.** absolute Gini impurity difference = 0.1436
- **C.** absolute Gini impurity difference = 0.0726
- **D.** absolute Gini impurity difference = 0.2146

**Correct Answer:** absolute Gini impurity difference = 0.0726

**Explanation:** The two values are 0.426 and 0.4986; their absolute difference is 0.0726.

---

## Question 14

**Question:** How far apart are the weighted child entropy values for (child entropies=(0.24,0.68), sizes=(5,8)) and (child entropies=(0.36,0.62), sizes=(11,8))?

**Choices:**
- **A.** absolute weighted child entropy difference = 0.0413
- **B.** absolute weighted child entropy difference = 0.1123
- **C.** absolute weighted child entropy difference = -0.0297
- **D.** absolute weighted child entropy difference = 0.1833

**Correct Answer:** absolute weighted child entropy difference = 0.0413

**Explanation:** The two values are 0.5108 and 0.4695; their absolute difference is 0.0413.

---

## Question 15

**Question:** How far apart are the multiway information gain values for (three child counts=[(5, 0), (1, 4), (0, 2)]) and (three child counts=[(11, 0), (1, 10), (0, 2)])?

**Choices:**
- **A.** absolute multiway information gain difference = 0.1704
- **B.** absolute multiway information gain difference = 0.0994
- **C.** absolute multiway information gain difference = 0.0284
- **D.** absolute multiway information gain difference = 0.2414

**Correct Answer:** absolute multiway information gain difference = 0.0994

**Explanation:** The two values are 0.6992 and 0.7986; their absolute difference is 0.0994.

---

## Question 16

**Question:** Taking (binary counts=(4,8)) as baseline and (binary counts=(2,10)) as the new case, what is the percentage change in entropy?

**Choices:**
- **A.** percentage change in entropy = -34.4728
- **B.** percentage change in entropy = -23.9557
- **C.** percentage change in entropy = -29.2143
- **D.** percentage change in entropy = -18.6971

**Correct Answer:** percentage change in entropy = -29.2143

**Explanation:** The values change from 0.9183 to 0.65; (new-old)/|old|*100=-29.2143%.

---

## Question 17

**Question:** Taking (child (+,-) counts=(5, 1) and (1, 8)) as baseline and (child (+,-) counts=(3, 1) and (1, 6)) as the new case, what is the percentage change in information gain?

**Choices:**
- **A.** percentage change in information gain = -38.9083
- **B.** percentage change in information gain = -27.0379
- **C.** percentage change in information gain = -32.9731
- **D.** percentage change in information gain = -21.1028

**Correct Answer:** percentage change in information gain = -32.9731

**Explanation:** The values change from 0.409 to 0.2741; (new-old)/|old|*100=-32.9731%.

---

## Question 18

**Question:** Taking (class counts=(5,9)) as baseline and (class counts=(3,9)) as the new case, what is the percentage change in Gini impurity?

**Choices:**
- **A.** percentage change in Gini impurity = -21.6333
- **B.** percentage change in Gini impurity = -15.0333
- **C.** percentage change in Gini impurity = -18.3333
- **D.** percentage change in Gini impurity = -11.7333

**Correct Answer:** percentage change in Gini impurity = -18.3333

**Explanation:** The values change from 0.4592 to 0.375; (new-old)/|old|*100=-18.3333%.

---

## Question 19

**Question:** Taking (child entropies=(0.26,0.67), sizes=(6,8)) as baseline and (child entropies=(0.22,0.69), sizes=(4,8)) as the new case, what is the percentage change in weighted child entropy?

**Choices:**
- **A.** percentage change in weighted child entropy = 9.3218
- **B.** percentage change in weighted child entropy = 7.8998
- **C.** percentage change in weighted child entropy = 6.4778
- **D.** percentage change in weighted child entropy = 10.7437

**Correct Answer:** percentage change in weighted child entropy = 7.8998

**Explanation:** The values change from 0.4943 to 0.5333; (new-old)/|old|*100=7.8998%.

---

## Question 20

**Question:** Taking (three child counts=[(6, 0), (1, 5), (0, 2)]) as baseline and (three child counts=[(4, 0), (1, 3), (0, 2)]) as the new case, what is the percentage change in multiway information gain?

**Choices:**
- **A.** percentage change in multiway information gain = -7.5126
- **B.** percentage change in multiway information gain = -5.2207
- **C.** percentage change in multiway information gain = -6.3666
- **D.** percentage change in multiway information gain = -4.0747

**Correct Answer:** percentage change in multiway information gain = -6.3666

**Explanation:** The values change from 0.7214 to 0.6755; (new-old)/|old|*100=-6.3666%.

---

## Question 21

**Question:** Which formula must be applied to obtain entropy from the supplied chapter quantities?

**Choices:**
- **A.** For entropy, use $\sqrt{-\sum_i p_i\log_2 p_i}$
- **B.** For entropy, use $1-\left(-\sum_i p_i\log_2 p_i\right)$
- **C.** For entropy, use $-\sum_i p_i\log_2 p_i$
- **D.** For entropy, use sum inputs without the required weighting for entropy

**Correct Answer:** For entropy, use $-\sum_i p_i\log_2 p_i$

**Explanation:** The chapter defines entropy with $-\sum_i p_i\log_2 p_i$; the other expressions change an operation or omit required weighting.

---

## Question 22

**Question:** Which formula must be applied to obtain information gain from the supplied chapter quantities?

**Choices:**
- **A.** For information gain, use $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$
- **B.** For information gain, use $1-\left(H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)\right)$
- **C.** For information gain, use $\sqrt{H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)}$
- **D.** For information gain, use sum inputs without the required weighting for information gain

**Correct Answer:** For information gain, use $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$

**Explanation:** The chapter defines information gain with $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$; the other expressions change an operation or omit required weighting.

---

## Question 23

**Question:** Which formula must be applied to obtain Gini impurity from the supplied chapter quantities?

**Choices:**
- **A.** For Gini impurity, use $\sqrt{1-\sum_i p_i^2}$
- **B.** For Gini impurity, use $1-\left(1-\sum_i p_i^2\right)$
- **C.** For Gini impurity, use $1-\sum_i p_i^2$
- **D.** For Gini impurity, use sum inputs without the required weighting for Gini impurity

**Correct Answer:** For Gini impurity, use $1-\sum_i p_i^2$

**Explanation:** The chapter defines Gini impurity with $1-\sum_i p_i^2$; the other expressions change an operation or omit required weighting.

---

## Question 24

**Question:** Which formula must be applied to obtain weighted child entropy from the supplied chapter quantities?

**Choices:**
- **A.** For weighted child entropy, use sum inputs without the required weighting for weighted child entropy
- **B.** For weighted child entropy, use $1-\left(\sum_v\frac{|S_v|}{|S|}H(S_v)\right)$
- **C.** For weighted child entropy, use $\sqrt{\sum_v\frac{|S_v|}{|S|}H(S_v)}$
- **D.** For weighted child entropy, use $\sum_v\frac{|S_v|}{|S|}H(S_v)$

**Correct Answer:** For weighted child entropy, use $\sum_v\frac{|S_v|}{|S|}H(S_v)$

**Explanation:** The chapter defines weighted child entropy with $\sum_v\frac{|S_v|}{|S|}H(S_v)$; the other expressions change an operation or omit required weighting.

---

## Question 25

**Question:** Which formula must be applied to obtain multiway information gain from the supplied chapter quantities?

**Choices:**
- **A.** For multiway information gain, use $1-\left(H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)\right)$
- **B.** For multiway information gain, use $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$
- **C.** For multiway information gain, use $\sqrt{H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)}$
- **D.** For multiway information gain, use sum inputs without the required weighting for multiway information gain

**Correct Answer:** For multiway information gain, use $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$

**Explanation:** The chapter defines multiway information gain with $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$; the other expressions change an operation or omit required weighting.

---

## Question 26

**Question:** Four datasets are candidates. Which one produces entropy=1?

**Choices:**
- **A.** For entropy, the first dataset: binary counts=(1,11)
- **B.** For entropy, the third dataset: binary counts=(6,6)
- **C.** For entropy, the second dataset: binary counts=(3,9)
- **D.** For entropy, the fourth dataset: binary counts=(9,3)

**Correct Answer:** For entropy, the third dataset: binary counts=(6,6)

**Explanation:** Evaluating all four with $-\sum_i p_i\log_2 p_i$ shows that the third dataset produces 1.

---

## Question 27

**Question:** Four datasets are candidates. Which one produces information gain=0.4986?

**Choices:**
- **A.** For information gain, the fourth dataset: child (+,-) counts=(10, 1) and (1, 13)
- **B.** For information gain, the first dataset: child (+,-) counts=(2, 1) and (1, 5)
- **C.** For information gain, the second dataset: child (+,-) counts=(4, 1) and (1, 7)
- **D.** For information gain, the third dataset: child (+,-) counts=(7, 1) and (1, 10)

**Correct Answer:** For information gain, the third dataset: child (+,-) counts=(7, 1) and (1, 10)

**Explanation:** Evaluating all four with $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$ shows that the third dataset produces 0.4986.

---

## Question 28

**Question:** Four datasets are candidates. Which one produces Gini impurity=0.4922?

**Choices:**
- **A.** For Gini impurity, the first dataset: class counts=(2,9)
- **B.** For Gini impurity, the third dataset: class counts=(7,9)
- **C.** For Gini impurity, the second dataset: class counts=(4,9)
- **D.** For Gini impurity, the fourth dataset: class counts=(10,9)

**Correct Answer:** For Gini impurity, the third dataset: class counts=(7,9)

**Explanation:** Evaluating all four with $1-\sum_i p_i^2$ shows that the third dataset produces 0.4922.

---

## Question 29

**Question:** Four datasets are candidates. Which one produces weighted child entropy=0.475?

**Choices:**
- **A.** For weighted child entropy, the third dataset: child entropies=(0.3,0.65), sizes=(8,8)
- **B.** For weighted child entropy, the first dataset: child entropies=(0.2,0.7), sizes=(3,8)
- **C.** For weighted child entropy, the second dataset: child entropies=(0.24,0.68), sizes=(5,8)
- **D.** For weighted child entropy, the fourth dataset: child entropies=(0.36,0.62), sizes=(11,8)

**Correct Answer:** For weighted child entropy, the third dataset: child entropies=(0.3,0.65), sizes=(8,8)

**Explanation:** Evaluating all four with $\sum_v\frac{|S_v|}{|S|}H(S_v)$ shows that the third dataset produces 0.475.

---

## Question 30

**Question:** Four datasets are candidates. Which one produces multiway information gain=0.7584?

**Choices:**
- **A.** For multiway information gain, the third dataset: three child counts=[(8, 0), (1, 7), (0, 2)]
- **B.** For multiway information gain, the first dataset: three child counts=[(3, 0), (1, 2), (0, 2)]
- **C.** For multiway information gain, the second dataset: three child counts=[(5, 0), (1, 4), (0, 2)]
- **D.** For multiway information gain, the fourth dataset: three child counts=[(11, 0), (1, 10), (0, 2)]

**Correct Answer:** For multiway information gain, the third dataset: three child counts=[(8, 0), (1, 7), (0, 2)]

**Explanation:** Evaluating all four with $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$ shows that the third dataset produces 0.7584.

---

## Question 31

**Question:** For binary counts=(7,5), a student reports entropy=1.2248. What corrected value should replace it?

**Choices:**
- **A.** corrected entropy = 1.3326
- **B.** corrected entropy = 1.1562
- **C.** corrected entropy = 0.8035
- **D.** corrected entropy = 0.9799

**Correct Answer:** corrected entropy = 0.9799

**Explanation:** Recomputing with $-\sum_i p_i\log_2 p_i$ gives 0.9799, so the reported 1.2248 is rejected.

---

## Question 32

**Question:** For child (+,-) counts=(8, 1) and (1, 11), a student reports information gain=0.6663. What corrected value should replace it?

**Choices:**
- **A.** corrected information gain = 0.725
- **B.** corrected information gain = 0.629
- **C.** corrected information gain = 0.4371
- **D.** corrected information gain = 0.5331

**Correct Answer:** corrected information gain = 0.5331

**Explanation:** Recomputing with $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$ gives 0.5331, so the reported 0.6663 is rejected.

---

## Question 33

**Question:** For class counts=(8,9), a student reports Gini impurity=0.6228. What corrected value should replace it?

**Choices:**
- **A.** corrected Gini impurity = 0.4983
- **B.** corrected Gini impurity = 0.588
- **C.** corrected Gini impurity = 0.4086
- **D.** corrected Gini impurity = 0.6776

**Correct Answer:** corrected Gini impurity = 0.4983

**Explanation:** Recomputing with $1-\sum_i p_i^2$ gives 0.4983, so the reported 0.6228 is rejected.

---

## Question 34

**Question:** For child entropies=(0.32,0.64), sizes=(9,8), a student reports weighted child entropy=0.5882. What corrected value should replace it?

**Choices:**
- **A.** corrected weighted child entropy = 0.3859
- **B.** corrected weighted child entropy = 0.5553
- **C.** corrected weighted child entropy = 0.4706
- **D.** corrected weighted child entropy = 0.64

**Correct Answer:** corrected weighted child entropy = 0.4706

**Explanation:** Recomputing with $\sum_v\frac{|S_v|}{|S|}H(S_v)$ gives 0.4706, so the reported 0.5882 is rejected.

---

## Question 35

**Question:** For three child counts=[(9, 0), (1, 8), (0, 2)], a student reports multiway information gain=0.9669. What corrected value should replace it?

**Choices:**
- **A.** corrected multiway information gain = 1.052
- **B.** corrected multiway information gain = 0.9128
- **C.** corrected multiway information gain = 0.6343
- **D.** corrected multiway information gain = 0.7735

**Correct Answer:** corrected multiway information gain = 0.7735

**Explanation:** Recomputing with $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$ gives 0.7735, so the reported 0.9669 is rejected.

---

## Question 36

**Question:** Compute entropy separately for (binary counts=(8,4)) and (binary counts=(1,11)), then average the two results.

**Choices:**
- **A.** mean of the two entropy values = 0.9058
- **B.** mean of the two entropy values = 0.7859
- **C.** mean of the two entropy values = 0.5462
- **D.** mean of the two entropy values = 0.6661

**Correct Answer:** mean of the two entropy values = 0.6661

**Explanation:** The individual results are 0.9183 and 0.4138; their arithmetic mean is 0.6661.

---

## Question 37

**Question:** Compute information gain separately for (child (+,-) counts=(9, 1) and (1, 12)) and (child (+,-) counts=(2, 1) and (1, 5)), then average the two results.

**Choices:**
- **A.** mean of the two information gain values = 0.2997
- **B.** mean of the two information gain values = 0.4417
- **C.** mean of the two information gain values = 0.3707
- **D.** mean of the two information gain values = 0.5127

**Correct Answer:** mean of the two information gain values = 0.3707

**Explanation:** The individual results are 0.5626 and 0.1788; their arithmetic mean is 0.3707.

---

## Question 38

**Question:** Compute Gini impurity separately for (class counts=(9,9)) and (class counts=(2,9)), then average the two results.

**Choices:**
- **A.** mean of the two Gini impurity values = 0.3988
- **B.** mean of the two Gini impurity values = 0.4705
- **C.** mean of the two Gini impurity values = 0.327
- **D.** mean of the two Gini impurity values = 0.5423

**Correct Answer:** mean of the two Gini impurity values = 0.3988

**Explanation:** The individual results are 0.5 and 0.2975; their arithmetic mean is 0.3988.

---

## Question 39

**Question:** Compute weighted child entropy separately for (child entropies=(0.34,0.63), sizes=(10,8)) and (child entropies=(0.2,0.7), sizes=(3,8)), then average the two results.

**Choices:**
- **A.** mean of the two weighted child entropy values = 0.6092
- **B.** mean of the two weighted child entropy values = 0.5163
- **C.** mean of the two weighted child entropy values = 0.4233
- **D.** mean of the two weighted child entropy values = 0.7021

**Correct Answer:** mean of the two weighted child entropy values = 0.5163

**Explanation:** The individual results are 0.4689 and 0.5636; their arithmetic mean is 0.5163.

---

## Question 40

**Question:** Compute multiway information gain separately for (three child counts=[(10, 0), (1, 9), (0, 2)]) and (three child counts=[(3, 0), (1, 2), (0, 2)]), then average the two results.

**Choices:**
- **A.** mean of the two multiway information gain values = 0.7212
- **B.** mean of the two multiway information gain values = 0.8511
- **C.** mean of the two multiway information gain values = 0.5914
- **D.** mean of the two multiway information gain values = 0.9809

**Correct Answer:** mean of the two multiway information gain values = 0.7212

**Explanation:** The individual results are 0.7868 and 0.6556; their arithmetic mean is 0.7212.

---

## Question 41

**Question:** After the data change from (binary counts=(9,3)) to (binary counts=(7,5)), what is the new entropy?

**Choices:**
- **A.** entropy = 0.8035
- **B.** entropy = 1.1562
- **C.** entropy = 0.9799
- **D.** entropy = 1.3326

**Correct Answer:** entropy = 0.9799

**Explanation:** Only the new data enter $-\sum_i p_i\log_2 p_i$; they produce 0.9799.

---

## Question 42

**Question:** After the data change from (child (+,-) counts=(10, 1) and (1, 13)) to (child (+,-) counts=(8, 1) and (1, 11)), what is the new information gain?

**Choices:**
- **A.** information gain = 0.4371
- **B.** information gain = 0.629
- **C.** information gain = 0.5331
- **D.** information gain = 0.725

**Correct Answer:** information gain = 0.5331

**Explanation:** Only the new data enter $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$; they produce 0.5331.

---

## Question 43

**Question:** After the data change from (class counts=(10,9)) to (class counts=(8,9)), what is the new Gini impurity?

**Choices:**
- **A.** Gini impurity = 0.4983
- **B.** Gini impurity = 0.588
- **C.** Gini impurity = 0.4086
- **D.** Gini impurity = 0.6776

**Correct Answer:** Gini impurity = 0.4983

**Explanation:** Only the new data enter $1-\sum_i p_i^2$; they produce 0.4983.

---

## Question 44

**Question:** After the data change from (child entropies=(0.36,0.62), sizes=(11,8)) to (child entropies=(0.32,0.64), sizes=(9,8)), what is the new weighted child entropy?

**Choices:**
- **A.** weighted child entropy = 0.4706
- **B.** weighted child entropy = 0.5553
- **C.** weighted child entropy = 0.3859
- **D.** weighted child entropy = 0.64

**Correct Answer:** weighted child entropy = 0.4706

**Explanation:** Only the new data enter $\sum_v\frac{|S_v|}{|S|}H(S_v)$; they produce 0.4706.

---

## Question 45

**Question:** After the data change from (three child counts=[(11, 0), (1, 10), (0, 2)]) to (three child counts=[(9, 0), (1, 8), (0, 2)]), what is the new multiway information gain?

**Choices:**
- **A.** multiway information gain = 0.9128
- **B.** multiway information gain = 0.7735
- **C.** multiway information gain = 0.6343
- **D.** multiway information gain = 1.052

**Correct Answer:** multiway information gain = 0.7735

**Explanation:** Only the new data enter $H(S)-\sum_v\frac{|S_v|}{|S|}H(S_v)$; they produce 0.7735.

---

## Question 46

**Question:** Rank P, Q, R, S from largest to smallest entropy: P(binary counts=(2,10)), Q(binary counts=(4,8)), R(binary counts=(7,5)), S(binary counts=(10,2)).

**Choices:**
- **A.** entropy ranking: P > Q > R > S
- **B.** entropy ranking: S > P > Q > R
- **C.** entropy ranking: P = Q = R = S
- **D.** entropy ranking: R > Q > P = S

**Correct Answer:** entropy ranking: R > Q > P = S

**Explanation:** Their values are {'P': '0.65', 'Q': '0.9183', 'R': '0.9799', 'S': '0.65'}; grouping equal values and sorting descending gives entropy ranking: R > Q > P = S.

---

## Question 47

**Question:** Rank P, Q, R, S from largest to smallest information gain: P(child (+,-) counts=(3, 1) and (1, 6)), Q(child (+,-) counts=(5, 1) and (1, 8)), R(child (+,-) counts=(8, 1) and (1, 11)), S(child (+,-) counts=(11, 1) and (1, 14)).

**Choices:**
- **A.** information gain ranking: P > Q > R > S
- **B.** information gain ranking: S > R > Q > P
- **C.** information gain ranking: P = Q = R = S
- **D.** information gain ranking: Q > P > S > R

**Correct Answer:** information gain ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.2741', 'Q': '0.409', 'R': '0.5331', 'S': '0.6108'}; grouping equal values and sorting descending gives information gain ranking: S > R > Q > P.

---

## Question 48

**Question:** Rank P, Q, R, S from largest to smallest Gini impurity: P(class counts=(3,9)), Q(class counts=(5,9)), R(class counts=(8,9)), S(class counts=(11,9)).

**Choices:**
- **A.** Gini impurity ranking: P = Q = R = S
- **B.** Gini impurity ranking: P > Q > S > R
- **C.** Gini impurity ranking: R > S > Q > P
- **D.** Gini impurity ranking: P > Q > R > S

**Correct Answer:** Gini impurity ranking: R > S > Q > P

**Explanation:** Their values are {'P': '0.375', 'Q': '0.4592', 'R': '0.4983', 'S': '0.495'}; grouping equal values and sorting descending gives Gini impurity ranking: R > S > Q > P.

---

## Question 49

**Question:** Rank P, Q, R, S from largest to smallest weighted child entropy: P(child entropies=(0.22,0.69), sizes=(4,8)), Q(child entropies=(0.26,0.67), sizes=(6,8)), R(child entropies=(0.32,0.64), sizes=(9,8)), S(child entropies=(0.38,0.61), sizes=(12,8)).

**Choices:**
- **A.** weighted child entropy ranking: P = Q = R = S
- **B.** weighted child entropy ranking: R > S > Q > P
- **C.** weighted child entropy ranking: P > Q > S > R
- **D.** weighted child entropy ranking: P > Q > R > S

**Correct Answer:** weighted child entropy ranking: P > Q > S > R

**Explanation:** Their values are {'P': '0.5333', 'Q': '0.4943', 'R': '0.4706', 'S': '0.472'}; grouping equal values and sorting descending gives weighted child entropy ranking: P > Q > S > R.

---

## Question 50

**Question:** Rank P, Q, R, S from largest to smallest multiway information gain: P(three child counts=[(4, 0), (1, 3), (0, 2)]), Q(three child counts=[(6, 0), (1, 5), (0, 2)]), R(three child counts=[(9, 0), (1, 8), (0, 2)]), S(three child counts=[(12, 0), (1, 11), (0, 2)]).

**Choices:**
- **A.** multiway information gain ranking: P = Q = R = S
- **B.** multiway information gain ranking: P > Q > R > S
- **C.** multiway information gain ranking: S > R > Q > P
- **D.** multiway information gain ranking: Q > P > S > R

**Correct Answer:** multiway information gain ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.6755', 'Q': '0.7214', 'R': '0.7735', 'S': '0.809'}; grouping equal values and sorting descending gives multiway information gain ranking: S > R > Q > P.

---

## Question 51

**Question:** Which statement correctly characterizes pure-node impurity?

**Choices:**
- **A.** A pure node has entropy zero and Gini impurity zero.
- **B.** A pure node maximizes both entropy and Gini impurity.
- **C.** A pure node must contain equal counts of every class.
- **D.** Purity is determined by feature values without using labels.

**Correct Answer:** A pure node has entropy zero and Gini impurity zero.

**Explanation:** For pure-node impurity, the accurate statement is the first one because When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 52

**Question:** Which statement correctly characterizes ID3 split selection?

**Choices:**
- **A.** ID3 always selects the feature with the most values.
- **B.** ID3 chooses the split with the largest weighted child entropy. under every stated condition
- **C.** ID3 chooses the candidate split with the largest information gain.
- **D.** ID3 ranks splits only by the depth they would create.

**Correct Answer:** ID3 chooses the candidate split with the largest information gain.

**Explanation:** For ID3 split selection, the accurate statement is the first one because Information gain is parent entropy minus weighted post-split entropy.

---

## Question 53

**Question:** Which statement correctly characterizes continuous thresholds?

**Choices:**
- **A.** A continuous feature can be tested using a threshold such as length < 3.
- **B.** Continuous features must be discarded before tree induction. without changing the supplied data
- **C.** Every distinct continuous value must become a class label.
- **D.** Thresholds are valid only for regression trees.

**Correct Answer:** A continuous feature can be tested using a threshold such as length < 3.

**Explanation:** For continuous thresholds, the accurate statement is the first one because Threshold branches allow decision trees to partition continuous inputs.

---

## Question 54

**Question:** Which statement correctly characterizes post-pruning?

**Choices:**
- **A.** Pruning guarantees zero error on both training and test sets. for all permitted parameter values
- **B.** Post-pruning forbids the tree from growing beyond its root.
- **C.** Pre-pruning removes branches only after full growth.
- **D.** Post-pruning grows a tree first and then removes weak branches.

**Correct Answer:** Post-pruning grows a tree first and then removes weak branches.

**Explanation:** For post-pruning, the accurate statement is the first one because The timing distinguishes post-pruning from early stopping.

---

## Question 55

**Question:** Which statement correctly characterizes classification and regression leaves?

**Choices:**
- **A.** A classification leaf must contain a continuous threshold. under every stated condition under the complete set of stated assumptions
- **B.** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.
- **C.** A regression leaf may output only a category name.
- **D.** The two tree types differ only in drawing style.

**Correct Answer:** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Explanation:** For classification and regression leaves, the accurate statement is the first one because Their output types follow the classification/regression distinction.

---

## Question 56

**Question:** Which statement correctly characterizes root-to-leaf rules?

**Choices:**
- **A.** A path ignores feature outcomes and uses only class frequency.
- **B.** A single path is a disjunction of every incompatible branch.
- **C.** Leaves are evaluated before any internal test.
- **D.** A root-to-leaf path corresponds to a conjunction of tests.

**Correct Answer:** A root-to-leaf path corresponds to a conjunction of tests.

**Explanation:** For root-to-leaf rules, the accurate statement is the first one because All tests along a path must be satisfied, forming an AND condition.

---

## Question 57

**Question:** Which statement correctly characterizes weighted child entropy?

**Choices:**
- **A.** Weights are the logarithms of the number of features.
- **B.** Every child receives weight one regardless of size.
- **C.** Only the purest child contributes to information gain. for all permitted parameter values
- **D.** Weighted child entropy accounts for the relative sizes of child subsets.

**Correct Answer:** Weighted child entropy accounts for the relative sizes of child subsets.

**Explanation:** For weighted child entropy, the accurate statement is the first one because The formula weights each child by |S_v|/|S|.

---

## Question 58

**Question:** Which statement correctly characterizes greedy gain and overfitting?

**Choices:**
- **A.** A fully grown tree is always simpler than a pruned tree.
- **B.** A high-information-gain training split can still contribute to overfitting.
- **C.** Overfitting can occur only in linear regression.
- **D.** Information gain mathematically guarantees best test accuracy. under every stated condition

**Correct Answer:** A high-information-gain training split can still contribute to overfitting.

**Explanation:** For greedy gain and overfitting, the accurate statement is the first one because Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 59

**Question:** Which statement correctly characterizes noisy or missing data?

**Choices:**
- **A.** Noise always increases information gain for the true feature.
- **B.** Any missing value makes a decision tree definitionally impossible. without changing the supplied data
- **C.** Missing or noisy data motivates special handling and possibly pruning.
- **D.** Pruning is used solely to increase the number of leaves.

**Correct Answer:** Missing or noisy data motivates special handling and possibly pruning.

**Explanation:** For noisy or missing data, the accurate statement is the first one because Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 60

**Question:** Which statement correctly characterizes tree-to-rule conversion?

**Choices:**
- **A.** Decision trees represent only a single linear inequality.
- **B.** Decision trees can be rewritten as rule sets such as DNF.
- **C.** A decision tree cannot express conjunctions or disjunctions.
- **D.** Rule conversion changes all leaf predictions into features.

**Correct Answer:** Decision trees can be rewritten as rule sets such as DNF.

**Explanation:** For tree-to-rule conversion, the accurate statement is the first one because Paths yield conjunctions and multiple positive paths can be disjoined.

---

## Question 61

**Question:** A student writes, “A pure node maximizes both entropy and Gini impurity.” Which replacement correctly repairs the claim about pure-node impurity?

**Choices:**
- **A.** Replace it with: A pure node must contain equal counts of every class.
- **B.** Replace it with: A pure node has entropy zero and Gini impurity zero.
- **C.** Replace it with: A pure node maximizes both entropy and Gini impurity.
- **D.** Replace it with: Purity is determined by feature values without using labels.

**Correct Answer:** Replace it with: A pure node has entropy zero and Gini impurity zero.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 62

**Question:** A student writes, “ID3 chooses the split with the largest weighted child entropy.” Which replacement correctly repairs the claim about ID3 split selection?

**Choices:**
- **A.** Replace it with: ID3 chooses the candidate split with the largest information gain.
- **B.** Replace it with: ID3 chooses the split with the largest weighted child entropy. without changing the supplied data
- **C.** Replace it with: ID3 always selects the feature with the most values.
- **D.** Replace it with: ID3 ranks splits only by the depth they would create.

**Correct Answer:** Replace it with: ID3 chooses the candidate split with the largest information gain.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Information gain is parent entropy minus weighted post-split entropy.

---

## Question 63

**Question:** A student writes, “Continuous features must be discarded before tree induction.” Which replacement correctly repairs the claim about continuous thresholds?

**Choices:**
- **A.** Replace it with: Thresholds are valid only for regression trees.
- **B.** Replace it with: Continuous features must be discarded before tree induction. for all permitted parameter values
- **C.** Replace it with: Every distinct continuous value must become a class label.
- **D.** Replace it with: A continuous feature can be tested using a threshold such as length < 3.

**Correct Answer:** Replace it with: A continuous feature can be tested using a threshold such as length < 3.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Threshold branches allow decision trees to partition continuous inputs.

---

## Question 64

**Question:** A student writes, “Post-pruning forbids the tree from growing beyond its root.” Which replacement correctly repairs the claim about post-pruning?

**Choices:**
- **A.** Replace it with: Post-pruning forbids the tree from growing beyond its root.
- **B.** Replace it with: Pruning guarantees zero error on both training and test sets. under every stated condition
- **C.** Replace it with: Pre-pruning removes branches only after full growth.
- **D.** Replace it with: Post-pruning grows a tree first and then removes weak branches.

**Correct Answer:** Replace it with: Post-pruning grows a tree first and then removes weak branches.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The timing distinguishes post-pruning from early stopping.

---

## Question 65

**Question:** A student writes, “A classification leaf must contain a continuous threshold.” Which replacement correctly repairs the claim about classification and regression leaves?

**Choices:**
- **A.** Replace it with: A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.
- **B.** Replace it with: A classification leaf must contain a continuous threshold. without changing the supplied data under the complete set of stated assumptions
- **C.** Replace it with: A regression leaf may output only a category name.
- **D.** Replace it with: The two tree types differ only in drawing style.

**Correct Answer:** Replace it with: A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Their output types follow the classification/regression distinction.

---

## Question 66

**Question:** A student writes, “A single path is a disjunction of every incompatible branch.” Which replacement correctly repairs the claim about root-to-leaf rules?

**Choices:**
- **A.** Replace it with: A path ignores feature outcomes and uses only class frequency.
- **B.** Replace it with: A single path is a disjunction of every incompatible branch.
- **C.** Replace it with: Leaves are evaluated before any internal test.
- **D.** Replace it with: A root-to-leaf path corresponds to a conjunction of tests.

**Correct Answer:** Replace it with: A root-to-leaf path corresponds to a conjunction of tests.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because All tests along a path must be satisfied, forming an AND condition.

---

## Question 67

**Question:** A student writes, “Every child receives weight one regardless of size.” Which replacement correctly repairs the claim about weighted child entropy?

**Choices:**
- **A.** Replace it with: Every child receives weight one regardless of size.
- **B.** Replace it with: Weighted child entropy accounts for the relative sizes of child subsets.
- **C.** Replace it with: Only the purest child contributes to information gain. under every stated condition
- **D.** Replace it with: Weights are the logarithms of the number of features.

**Correct Answer:** Replace it with: Weighted child entropy accounts for the relative sizes of child subsets.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The formula weights each child by |S_v|/|S|.

---

## Question 68

**Question:** A student writes, “Information gain mathematically guarantees best test accuracy.” Which replacement correctly repairs the claim about greedy gain and overfitting?

**Choices:**
- **A.** Replace it with: A high-information-gain training split can still contribute to overfitting.
- **B.** Replace it with: Information gain mathematically guarantees best test accuracy. without changing the supplied data
- **C.** Replace it with: Overfitting can occur only in linear regression.
- **D.** Replace it with: A fully grown tree is always simpler than a pruned tree.

**Correct Answer:** Replace it with: A high-information-gain training split can still contribute to overfitting.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 69

**Question:** A student writes, “Any missing value makes a decision tree definitionally impossible.” Which replacement correctly repairs the claim about noisy or missing data?

**Choices:**
- **A.** Replace it with: Pruning is used solely to increase the number of leaves.
- **B.** Replace it with: Any missing value makes a decision tree definitionally impossible. for all permitted parameter values
- **C.** Replace it with: Missing or noisy data motivates special handling and possibly pruning.
- **D.** Replace it with: Noise always increases information gain for the true feature.

**Correct Answer:** Replace it with: Missing or noisy data motivates special handling and possibly pruning.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 70

**Question:** A student writes, “Decision trees represent only a single linear inequality.” Which replacement correctly repairs the claim about tree-to-rule conversion?

**Choices:**
- **A.** Replace it with: Rule conversion changes all leaf predictions into features.
- **B.** Replace it with: Decision trees represent only a single linear inequality.
- **C.** Replace it with: Decision trees can be rewritten as rule sets such as DNF.
- **D.** Replace it with: A decision tree cannot express conjunctions or disjunctions.

**Correct Answer:** Replace it with: Decision trees can be rewritten as rule sets such as DNF.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Paths yield conjunctions and multiple positive paths can be disjoined.

---

## Question 71

**Question:** A student's answer about pure-node impurity contains the claim “A pure node maximizes both entropy and Gini impurity.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about pure-node impurity is correct without qualification
- **C.** The quoted claim concerns pure-node impurity but is only a harmless change of notation
- **D.** The quoted claim about pure-node impurity is false and must be replaced

**Correct Answer:** The quoted claim about pure-node impurity is false and must be replaced

**Explanation:** The quoted claim contradicts pure-node impurity; it must be replaced by the chapter's stated rule.

---

## Question 72

**Question:** A student's answer about ID3 split selection contains the claim “ID3 chooses the split with the largest weighted child entropy.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about ID3 split selection is false and must be replaced
- **B.** The quoted claim about ID3 split selection is correct without qualification
- **C.** The quoted claim concerns ID3 split selection but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about ID3 split selection is false and must be replaced

**Explanation:** The quoted claim contradicts ID3 split selection; it must be replaced by ID3 chooses the candidate split with the largest information gain..

---

## Question 73

**Question:** A student's answer about continuous thresholds contains the claim “Continuous features must be discarded before tree induction.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about continuous thresholds is correct without qualification
- **B.** The quoted claim about continuous thresholds is false and must be replaced
- **C.** The quoted claim concerns continuous thresholds but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about continuous thresholds is false and must be replaced

**Explanation:** The quoted claim contradicts continuous thresholds; it must be replaced by the chapter's stated rule.

---

## Question 74

**Question:** A student's answer about post-pruning contains the claim “Post-pruning forbids the tree from growing beyond its root.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about post-pruning is correct without qualification
- **B.** The quoted claim about post-pruning is false and must be replaced
- **C.** The quoted claim concerns post-pruning but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about post-pruning is false and must be replaced

**Explanation:** The quoted claim contradicts post-pruning; it must be replaced by Post-pruning grows a tree first and then removes weak branches..

---

## Question 75

**Question:** A student's answer about classification and regression leaves contains the claim “A classification leaf must contain a continuous threshold.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about classification and regression leaves is correct without qualification
- **B.** The quoted claim about classification and regression leaves is false and must be replaced
- **C.** The quoted claim concerns classification and regression leaves but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about classification and regression leaves is false and must be replaced

**Explanation:** The quoted claim contradicts classification and regression leaves; it must be replaced by A classification leaf stores a class decision; a regression leaf stores a real-valued prediction..

---

## Question 76

**Question:** A student's answer about root-to-leaf rules contains the claim “A single path is a disjunction of every incompatible branch.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about root-to-leaf rules is correct without qualification
- **C.** The quoted claim concerns root-to-leaf rules but is only a harmless change of notation
- **D.** The quoted claim about root-to-leaf rules is false and must be replaced

**Correct Answer:** The quoted claim about root-to-leaf rules is false and must be replaced

**Explanation:** The quoted claim contradicts root-to-leaf rules; it must be replaced by A root-to-leaf path corresponds to a conjunction of tests..

---

## Question 77

**Question:** A student's answer about weighted child entropy contains the claim “Every child receives weight one regardless of size.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns weighted child entropy but is only a harmless change of notation
- **B.** The quoted claim about weighted child entropy is correct without qualification
- **C.** The quoted claim about weighted child entropy is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about weighted child entropy is false and must be replaced

**Explanation:** The quoted claim contradicts weighted child entropy; it must be replaced by Weighted child entropy accounts for the relative sizes of child subsets..

---

## Question 78

**Question:** A student's answer about greedy gain and overfitting contains the claim “Information gain mathematically guarantees best test accuracy.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about greedy gain and overfitting is false and must be replaced
- **C.** The quoted claim concerns greedy gain and overfitting but is only a harmless change of notation
- **D.** The quoted claim about greedy gain and overfitting is correct without qualification

**Correct Answer:** The quoted claim about greedy gain and overfitting is false and must be replaced

**Explanation:** The quoted claim contradicts greedy gain and overfitting; it must be replaced by the chapter's stated rule.

---

## Question 79

**Question:** A student's answer about noisy or missing data contains the claim “Any missing value makes a decision tree definitionally impossible.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about noisy or missing data is correct without qualification
- **C.** The quoted claim about noisy or missing data is false and must be replaced
- **D.** The quoted claim concerns noisy or missing data but is only a harmless change of notation

**Correct Answer:** The quoted claim about noisy or missing data is false and must be replaced

**Explanation:** The quoted claim contradicts noisy or missing data; it must be replaced by the chapter's stated rule.

---

## Question 80

**Question:** A student's answer about tree-to-rule conversion contains the claim “Decision trees represent only a single linear inequality.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about tree-to-rule conversion is false and must be replaced
- **C.** The quoted claim concerns tree-to-rule conversion but is only a harmless change of notation
- **D.** The quoted claim about tree-to-rule conversion is correct without qualification

**Correct Answer:** The quoted claim about tree-to-rule conversion is false and must be replaced

**Explanation:** The quoted claim contradicts tree-to-rule conversion; it must be replaced by the chapter's stated rule.

---

## Question 81

**Question:** An implementation is designed around the rule “A pure node must contain equal counts of every class.” Which principle exposes the design error concerning pure-node impurity?

**Choices:**
- **A.** Required principle: A pure node must contain equal counts of every class.
- **B.** Required principle: A pure node has entropy zero and Gini impurity zero.
- **C.** Required principle: A pure node maximizes both entropy and Gini impurity.
- **D.** Required principle: Purity is determined by feature values without using labels.

**Correct Answer:** Required principle: A pure node has entropy zero and Gini impurity zero.

**Explanation:** The implementation encodes a false rule. The required principle follows because When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 82

**Question:** An implementation is designed around the rule “ID3 always selects the feature with the most values.” Which principle exposes the design error concerning ID3 split selection?

**Choices:**
- **A.** Required principle: ID3 ranks splits only by the depth they would create.
- **B.** Required principle: ID3 chooses the split with the largest weighted child entropy. under every stated condition
- **C.** Required principle: ID3 always selects the feature with the most values.
- **D.** Required principle: ID3 chooses the candidate split with the largest information gain.

**Correct Answer:** Required principle: ID3 chooses the candidate split with the largest information gain.

**Explanation:** The implementation encodes a false rule. The required principle follows because Information gain is parent entropy minus weighted post-split entropy.

---

## Question 83

**Question:** An implementation is designed around the rule “Every distinct continuous value must become a class label.” Which principle exposes the design error concerning continuous thresholds?

**Choices:**
- **A.** Required principle: Thresholds are valid only for regression trees.
- **B.** Required principle: A continuous feature can be tested using a threshold such as length < 3.
- **C.** Required principle: Every distinct continuous value must become a class label.
- **D.** Required principle: Continuous features must be discarded before tree induction. without changing the supplied data

**Correct Answer:** Required principle: A continuous feature can be tested using a threshold such as length < 3.

**Explanation:** The implementation encodes a false rule. The required principle follows because Threshold branches allow decision trees to partition continuous inputs.

---

## Question 84

**Question:** An implementation is designed around the rule “Pre-pruning removes branches only after full growth.” Which principle exposes the design error concerning post-pruning?

**Choices:**
- **A.** Required principle: Post-pruning grows a tree first and then removes weak branches.
- **B.** Required principle: Post-pruning forbids the tree from growing beyond its root.
- **C.** Required principle: Pre-pruning removes branches only after full growth.
- **D.** Required principle: Pruning guarantees zero error on both training and test sets. for all permitted parameter values

**Correct Answer:** Required principle: Post-pruning grows a tree first and then removes weak branches.

**Explanation:** The implementation encodes a false rule. The required principle follows because The timing distinguishes post-pruning from early stopping.

---

## Question 85

**Question:** An implementation is designed around the rule “A regression leaf may output only a category name.” Which principle exposes the design error concerning classification and regression leaves?

**Choices:**
- **A.** Required principle: The two tree types differ only in drawing style.
- **B.** Required principle: A classification leaf must contain a continuous threshold. under every stated condition under the complete set of stated assumptions
- **C.** Required principle: A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.
- **D.** Required principle: A regression leaf may output only a category name.

**Correct Answer:** Required principle: A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Explanation:** The implementation encodes a false rule. The required principle follows because Their output types follow the classification/regression distinction.

---

## Question 86

**Question:** An implementation is designed around the rule “Leaves are evaluated before any internal test.” Which principle exposes the design error concerning root-to-leaf rules?

**Choices:**
- **A.** Required principle: Leaves are evaluated before any internal test.
- **B.** Required principle: A single path is a disjunction of every incompatible branch.
- **C.** Required principle: A path ignores feature outcomes and uses only class frequency.
- **D.** Required principle: A root-to-leaf path corresponds to a conjunction of tests.

**Correct Answer:** Required principle: A root-to-leaf path corresponds to a conjunction of tests.

**Explanation:** The implementation encodes a false rule. The required principle follows because All tests along a path must be satisfied, forming an AND condition.

---

## Question 87

**Question:** An implementation is designed around the rule “Only the purest child contributes to information gain.” Which principle exposes the design error concerning weighted child entropy?

**Choices:**
- **A.** Required principle: Every child receives weight one regardless of size.
- **B.** Required principle: Only the purest child contributes to information gain. for all permitted parameter values
- **C.** Required principle: Weighted child entropy accounts for the relative sizes of child subsets.
- **D.** Required principle: Weights are the logarithms of the number of features.

**Correct Answer:** Required principle: Weighted child entropy accounts for the relative sizes of child subsets.

**Explanation:** The implementation encodes a false rule. The required principle follows because The formula weights each child by |S_v|/|S|.

---

## Question 88

**Question:** An implementation is designed around the rule “Overfitting can occur only in linear regression.” Which principle exposes the design error concerning greedy gain and overfitting?

**Choices:**
- **A.** Required principle: A high-information-gain training split can still contribute to overfitting.
- **B.** Required principle: Information gain mathematically guarantees best test accuracy. under every stated condition
- **C.** Required principle: Overfitting can occur only in linear regression.
- **D.** Required principle: A fully grown tree is always simpler than a pruned tree.

**Correct Answer:** Required principle: A high-information-gain training split can still contribute to overfitting.

**Explanation:** The implementation encodes a false rule. The required principle follows because Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 89

**Question:** An implementation is designed around the rule “Noise always increases information gain for the true feature.” Which principle exposes the design error concerning noisy or missing data?

**Choices:**
- **A.** Required principle: Noise always increases information gain for the true feature.
- **B.** Required principle: Any missing value makes a decision tree definitionally impossible. without changing the supplied data
- **C.** Required principle: Missing or noisy data motivates special handling and possibly pruning.
- **D.** Required principle: Pruning is used solely to increase the number of leaves.

**Correct Answer:** Required principle: Missing or noisy data motivates special handling and possibly pruning.

**Explanation:** The implementation encodes a false rule. The required principle follows because Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 90

**Question:** An implementation is designed around the rule “A decision tree cannot express conjunctions or disjunctions.” Which principle exposes the design error concerning tree-to-rule conversion?

**Choices:**
- **A.** Required principle: A decision tree cannot express conjunctions or disjunctions.
- **B.** Required principle: Decision trees represent only a single linear inequality.
- **C.** Required principle: Decision trees can be rewritten as rule sets such as DNF.
- **D.** Required principle: Rule conversion changes all leaf predictions into features.

**Correct Answer:** Required principle: Decision trees can be rewritten as rule sets such as DNF.

**Explanation:** The implementation encodes a false rule. The required principle follows because Paths yield conjunctions and multiple positive paths can be disjoined.

---

## Question 91

**Question:** Reviewer A states, “A pure node has entropy zero and Gini impurity zero.” Reviewer B states, “Purity is determined by feature values without using labels.” What is the correct verdict about pure-node impurity?

**Choices:**
- **A.** Reviewer B only is correct about pure-node impurity
- **B.** Reviewer A only is correct about pure-node impurity
- **C.** Both reviewers are correct about pure-node impurity
- **D.** Neither reviewer is correct about pure-node impurity

**Correct Answer:** Reviewer A only is correct about pure-node impurity

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 92

**Question:** Reviewer A states, “ID3 chooses the candidate split with the largest information gain.” Reviewer B states, “ID3 ranks splits only by the depth they would create.” What is the correct verdict about ID3 split selection?

**Choices:**
- **A.** Reviewer B only is correct about ID3 split selection
- **B.** Reviewer A only is correct about ID3 split selection
- **C.** Both reviewers are correct about ID3 split selection
- **D.** Neither reviewer is correct about ID3 split selection

**Correct Answer:** Reviewer A only is correct about ID3 split selection

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Information gain is parent entropy minus weighted post-split entropy.

---

## Question 93

**Question:** Reviewer A states, “A continuous feature can be tested using a threshold such as length < 3.” Reviewer B states, “Thresholds are valid only for regression trees.” What is the correct verdict about continuous thresholds?

**Choices:**
- **A.** Both reviewers are correct about continuous thresholds
- **B.** Reviewer B only is correct about continuous thresholds
- **C.** Reviewer A only is correct about continuous thresholds
- **D.** Neither reviewer is correct about continuous thresholds

**Correct Answer:** Reviewer A only is correct about continuous thresholds

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Threshold branches allow decision trees to partition continuous inputs.

---

## Question 94

**Question:** Reviewer A states, “Post-pruning grows a tree first and then removes weak branches.” Reviewer B states, “Pruning guarantees zero error on both training and test sets.” What is the correct verdict about post-pruning?

**Choices:**
- **A.** Reviewer A only is correct about post-pruning
- **B.** Reviewer B only is correct about post-pruning
- **C.** Both reviewers are correct about post-pruning
- **D.** Neither reviewer is correct about post-pruning

**Correct Answer:** Reviewer A only is correct about post-pruning

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The timing distinguishes post-pruning from early stopping.

---

## Question 95

**Question:** Reviewer A states, “A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.” Reviewer B states, “The two tree types differ only in drawing style.” What is the correct verdict about classification and regression leaves?

**Choices:**
- **A.** Both reviewers are correct about classification and regression leaves
- **B.** Reviewer A only is correct about classification and regression leaves
- **C.** Reviewer B only is correct about classification and regression leaves
- **D.** Neither reviewer is correct about classification and regression leaves

**Correct Answer:** Reviewer A only is correct about classification and regression leaves

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Their output types follow the classification/regression distinction.

---

## Question 96

**Question:** Reviewer A states, “A root-to-leaf path corresponds to a conjunction of tests.” Reviewer B states, “A path ignores feature outcomes and uses only class frequency.” What is the correct verdict about root-to-leaf rules?

**Choices:**
- **A.** Neither reviewer is correct about root-to-leaf rules
- **B.** Reviewer A only is correct about root-to-leaf rules
- **C.** Both reviewers are correct about root-to-leaf rules
- **D.** Reviewer B only is correct about root-to-leaf rules

**Correct Answer:** Reviewer A only is correct about root-to-leaf rules

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, All tests along a path must be satisfied, forming an AND condition.

---

## Question 97

**Question:** Reviewer A states, “Weighted child entropy accounts for the relative sizes of child subsets.” Reviewer B states, “Weights are the logarithms of the number of features.” What is the correct verdict about weighted child entropy?

**Choices:**
- **A.** Both reviewers are correct about weighted child entropy
- **B.** Reviewer B only is correct about weighted child entropy
- **C.** Neither reviewer is correct about weighted child entropy
- **D.** Reviewer A only is correct about weighted child entropy

**Correct Answer:** Reviewer A only is correct about weighted child entropy

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The formula weights each child by |S_v|/|S|.

---

## Question 98

**Question:** Reviewer A states, “A high-information-gain training split can still contribute to overfitting.” Reviewer B states, “A fully grown tree is always simpler than a pruned tree.” What is the correct verdict about greedy gain and overfitting?

**Choices:**
- **A.** Neither reviewer is correct about greedy gain and overfitting
- **B.** Reviewer B only is correct about greedy gain and overfitting
- **C.** Both reviewers are correct about greedy gain and overfitting
- **D.** Reviewer A only is correct about greedy gain and overfitting

**Correct Answer:** Reviewer A only is correct about greedy gain and overfitting

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 99

**Question:** Reviewer A states, “Missing or noisy data motivates special handling and possibly pruning.” Reviewer B states, “Pruning is used solely to increase the number of leaves.” What is the correct verdict about noisy or missing data?

**Choices:**
- **A.** Neither reviewer is correct about noisy or missing data
- **B.** Reviewer B only is correct about noisy or missing data
- **C.** Both reviewers are correct about noisy or missing data
- **D.** Reviewer A only is correct about noisy or missing data

**Correct Answer:** Reviewer A only is correct about noisy or missing data

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 100

**Question:** Reviewer A states, “Decision trees can be rewritten as rule sets such as DNF.” Reviewer B states, “Rule conversion changes all leaf predictions into features.” What is the correct verdict about tree-to-rule conversion?

**Choices:**
- **A.** Neither reviewer is correct about tree-to-rule conversion
- **B.** Reviewer B only is correct about tree-to-rule conversion
- **C.** Both reviewers are correct about tree-to-rule conversion
- **D.** Reviewer A only is correct about tree-to-rule conversion

**Correct Answer:** Reviewer A only is correct about tree-to-rule conversion

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Paths yield conjunctions and multiple positive paths can be disjoined.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Questions were audited for structural balance, verbatim reuse, and parameter-only duplicate prompts.
