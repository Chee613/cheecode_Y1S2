# Chapter 3: Decision Tree: 100 Extreme-Hard Questions

> Topics: tree semantics, entropy, information gain, Gini impurity, threshold splits, rules, overfitting, and pruning. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** A binary node contains 1 positive and 9 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.18
- **B.** 0.469
- **C.** 0.2345
- **D.** 0.531

**Correct Answer:** 0.469

**Explanation:** With p+=0.1000, entropy=-sum p log2 p=0.469 bits.

---

## Question 2

**Question:** A split creates children with (+,-) counts (2, 1) and (1, 4). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.7956
- **B.** 0.9544
- **C.** 0.1589
- **D.** 1.75

**Correct Answer:** 0.1589

**Explanation:** Parent entropy=0.9544; weighted child entropy=0.7956; IG=0.9544-0.7956=0.1589.

---

## Question 3

**Question:** A node has class counts (2,8). What is its Gini impurity?

**Choices:**
- **A.** 0.32
- **B.** 0.7219
- **C.** 0.68
- **D.** 6.8

**Correct Answer:** 0.32

**Explanation:** Gini=1-[(2/10)^2+(8/10)^2]=0.32.

---

## Question 4

**Question:** Two candidate splits have weighted child entropies A=0.35 and B=0.52 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose A; IG=0.6
- **B.** Choose B; IG=0.43
- **C.** Choose A; IG=1.3
- **D.** Choose B; IG=1.47

**Correct Answer:** Choose A; IG=0.6

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.6 and IG_B=0.43, so split A is selected with gain 0.6.

---

## Question 5

**Question:** A three-way split yields child (+,-) counts [(3, 0), (1, 2), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (0.3444, 0.6556)
- **B.** (1, 0.3444)
- **C.** (0.6556, 0.3444)
- **D.** (0.1148, 0.8852)

**Correct Answer:** (0.3444, 0.6556)

**Explanation:** Weight each child by its size/8. Weighted entropy=0.3444, parent entropy=1, hence IG=0.6556.

---

## Question 6

**Question:** A binary node contains 2 positive and 8 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.32
- **B.** 0.361
- **C.** 0.2781
- **D.** 0.7219

**Correct Answer:** 0.7219

**Explanation:** With p+=0.2000, entropy=-sum p log2 p=0.7219 bits.

---

## Question 7

**Question:** A split creates children with (+,-) counts (3, 1) and (1, 5). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.7145
- **B.** 0.971
- **C.** 0.2564
- **D.** 1.6855

**Correct Answer:** 0.2564

**Explanation:** Parent entropy=0.971; weighted child entropy=0.7145; IG=0.971-0.7145=0.2564.

---

## Question 8

**Question:** A node has class counts (3,8). What is its Gini impurity?

**Choices:**
- **A.** 0.3967
- **B.** 0.8454
- **C.** 0.6033
- **D.** 6.6364

**Correct Answer:** 0.3967

**Explanation:** Gini=1-[(3/11)^2+(8/11)^2]=0.3967.

---

## Question 9

**Question:** Two candidate splits have weighted child entropies A=0.37 and B=0.51 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose B; IG=0.44
- **B.** Choose A; IG=0.58
- **C.** Choose A; IG=1.32
- **D.** Choose B; IG=1.46

**Correct Answer:** Choose A; IG=0.58

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.58 and IG_B=0.44, so split A is selected with gain 0.58.

---

## Question 10

**Question:** A three-way split yields child (+,-) counts [(4, 0), (1, 3), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (1, 0.3245)
- **B.** (0.6755, 0.3245)
- **C.** (0.1082, 0.8918)
- **D.** (0.3245, 0.6755)

**Correct Answer:** (0.3245, 0.6755)

**Explanation:** Weight each child by its size/10. Weighted entropy=0.3245, parent entropy=1, hence IG=0.6755.

---

## Question 11

**Question:** A binary node contains 3 positive and 7 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.42
- **B.** 0.4406
- **C.** 0.8813
- **D.** 0.1187

**Correct Answer:** 0.8813

**Explanation:** With p+=0.3000, entropy=-sum p log2 p=0.8813 bits.

---

## Question 12

**Question:** A split creates children with (+,-) counts (4, 1) and (1, 6). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.3339
- **B.** 0.6459
- **C.** 0.9799
- **D.** 1.6258

**Correct Answer:** 0.3339

**Explanation:** Parent entropy=0.9799; weighted child entropy=0.6459; IG=0.9799-0.6459=0.3339.

---

## Question 13

**Question:** A node has class counts (4,8). What is its Gini impurity?

**Choices:**
- **A.** 0.9183
- **B.** 0.4444
- **C.** 0.5556
- **D.** 6.6667

**Correct Answer:** 0.4444

**Explanation:** Gini=1-[(4/12)^2+(8/12)^2]=0.4444.

---

## Question 14

**Question:** Two candidate splits have weighted child entropies A=0.39 and B=0.5 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose B; IG=0.45
- **B.** Choose A; IG=1.34
- **C.** Choose B; IG=1.45
- **D.** Choose A; IG=0.56

**Correct Answer:** Choose A; IG=0.56

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.56 and IG_B=0.45, so split A is selected with gain 0.56.

---

## Question 15

**Question:** A three-way split yields child (+,-) counts [(5, 0), (1, 4), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (0.3008, 0.6992)
- **B.** (1, 0.3008)
- **C.** (0.6992, 0.3008)
- **D.** (0.1003, 0.8997)

**Correct Answer:** (0.3008, 0.6992)

**Explanation:** Weight each child by its size/12. Weighted entropy=0.3008, parent entropy=1, hence IG=0.6992.

---

## Question 16

**Question:** A binary node contains 4 positive and 6 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.48
- **B.** 0.4855
- **C.** 0.971
- **D.** 0.029

**Correct Answer:** 0.971

**Explanation:** With p+=0.4000, entropy=-sum p log2 p=0.971 bits.

---

## Question 17

**Question:** A split creates children with (+,-) counts (5, 1) and (1, 7). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.5892
- **B.** 0.9852
- **C.** 1.5744
- **D.** 0.396

**Correct Answer:** 0.396

**Explanation:** Parent entropy=0.9852; weighted child entropy=0.5892; IG=0.9852-0.5892=0.396.

---

## Question 18

**Question:** A node has class counts (5,8). What is its Gini impurity?

**Choices:**
- **A.** 0.4734
- **B.** 0.9612
- **C.** 0.5266
- **D.** 6.8462

**Correct Answer:** 0.4734

**Explanation:** Gini=1-[(5/13)^2+(8/13)^2]=0.4734.

---

## Question 19

**Question:** Two candidate splits have weighted child entropies A=0.41 and B=0.49 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose B; IG=0.46
- **B.** Choose A; IG=0.54
- **C.** Choose A; IG=1.36
- **D.** Choose B; IG=1.44

**Correct Answer:** Choose A; IG=0.54

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.54 and IG_B=0.46, so split A is selected with gain 0.54.

---

## Question 20

**Question:** A three-way split yields child (+,-) counts [(6, 0), (1, 5), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (1, 0.2786)
- **B.** (0.7214, 0.2786)
- **C.** (0.0929, 0.9071)
- **D.** (0.2786, 0.7214)

**Correct Answer:** (0.2786, 0.7214)

**Explanation:** Weight each child by its size/14. Weighted entropy=0.2786, parent entropy=1, hence IG=0.7214.

---

## Question 21

**Question:** A binary node contains 5 positive and 5 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 1.137
- **B.** 0.807
- **C.** 1
- **D.** 1.271

**Correct Answer:** 1

**Explanation:** With p+=0.5000, entropy=-sum p log2 p=1 bits.

---

## Question 22

**Question:** A split creates children with (+,-) counts (6, 1) and (1, 8). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.5419
- **B.** 0.9887
- **C.** 1.5306
- **D.** 0.4468

**Correct Answer:** 0.4468

**Explanation:** Parent entropy=0.9887; weighted child entropy=0.5419; IG=0.9887-0.5419=0.4468.

---

## Question 23

**Question:** A node has class counts (6,8). What is its Gini impurity?

**Choices:**
- **A.** 0.9852
- **B.** 0.5102
- **C.** 7.1429
- **D.** 0.4898

**Correct Answer:** 0.4898

**Explanation:** Gini=1-[(6/14)^2+(8/14)^2]=0.4898.

---

## Question 24

**Question:** Two candidate splits have weighted child entropies A=0.43 and B=0.48 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose A; IG=0.52
- **B.** Choose B; IG=0.47
- **C.** Choose A; IG=1.38
- **D.** Choose B; IG=1.43

**Correct Answer:** Choose A; IG=0.52

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.52 and IG_B=0.47, so split A is selected with gain 0.52.

---

## Question 25

**Question:** A three-way split yields child (+,-) counts [(7, 0), (1, 6), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (1, 0.2589)
- **B.** (0.2589, 0.7411)
- **C.** (0.7411, 0.2589)
- **D.** (0.0863, 0.9137)

**Correct Answer:** (0.2589, 0.7411)

**Explanation:** Weight each child by its size/16. Weighted entropy=0.2589, parent entropy=1, hence IG=0.7411.

---

## Question 26

**Question:** A binary node contains 6 positive and 4 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.48
- **B.** 0.971
- **C.** 0.4855
- **D.** 0.029

**Correct Answer:** 0.971

**Explanation:** With p+=0.6000, entropy=-sum p log2 p=0.971 bits.

---

## Question 27

**Question:** A split creates children with (+,-) counts (7, 1) and (1, 9). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.5021
- **B.** 0.4889
- **C.** 0.9911
- **D.** 1.4932

**Correct Answer:** 0.4889

**Explanation:** Parent entropy=0.9911; weighted child entropy=0.5021; IG=0.9911-0.5021=0.4889.

---

## Question 28

**Question:** A node has class counts (7,8). What is its Gini impurity?

**Choices:**
- **A.** 0.4978
- **B.** 0.9968
- **C.** 0.5022
- **D.** 7.5333

**Correct Answer:** 0.4978

**Explanation:** Gini=1-[(7/15)^2+(8/15)^2]=0.4978.

---

## Question 29

**Question:** Two candidate splits have weighted child entropies A=0.45 and B=0.47 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose B; IG=0.48
- **B.** Choose A; IG=0.5
- **C.** Choose A; IG=1.4
- **D.** Choose B; IG=1.42

**Correct Answer:** Choose A; IG=0.5

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.5 and IG_B=0.48, so split A is selected with gain 0.5.

---

## Question 30

**Question:** A three-way split yields child (+,-) counts [(8, 0), (1, 7), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (1, 0.2416)
- **B.** (0.7584, 0.2416)
- **C.** (0.2416, 0.7584)
- **D.** (0.0805, 0.9195)

**Correct Answer:** (0.2416, 0.7584)

**Explanation:** Weight each child by its size/18. Weighted entropy=0.2416, parent entropy=1, hence IG=0.7584.

---

## Question 31

**Question:** A binary node contains 7 positive and 3 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.8813
- **B.** 0.42
- **C.** 0.4406
- **D.** 0.1187

**Correct Answer:** 0.8813

**Explanation:** With p+=0.7000, entropy=-sum p log2 p=0.8813 bits.

---

## Question 32

**Question:** A split creates children with (+,-) counts (8, 1) and (1, 10). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.4682
- **B.** 0.9928
- **C.** 0.5246
- **D.** 1.461

**Correct Answer:** 0.5246

**Explanation:** Parent entropy=0.9928; weighted child entropy=0.4682; IG=0.9928-0.4682=0.5246.

---

## Question 33

**Question:** A node has class counts (8,8). What is its Gini impurity?

**Choices:**
- **A.** 0.637
- **B.** 0.307
- **C.** 0.771
- **D.** 0.5

**Correct Answer:** 0.5

**Explanation:** Gini=1-[(8/16)^2+(8/16)^2]=0.5.

---

## Question 34

**Question:** Two candidate splits have weighted child entropies A=0.47 and B=0.46 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose A; IG=0.48
- **B.** Choose B; IG=1.41
- **C.** Choose B; IG=0.49
- **D.** Choose A; IG=1.42

**Correct Answer:** Choose B; IG=0.49

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.48 and IG_B=0.49, so split B is selected with gain 0.49.

---

## Question 35

**Question:** A three-way split yields child (+,-) counts [(9, 0), (1, 8), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (1, 0.2265)
- **B.** (0.7735, 0.2265)
- **C.** (0.2265, 0.7735)
- **D.** (0.0755, 0.9245)

**Correct Answer:** (0.2265, 0.7735)

**Explanation:** Weight each child by its size/20. Weighted entropy=0.2265, parent entropy=1, hence IG=0.7735.

---

## Question 36

**Question:** A binary node contains 8 positive and 2 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.32
- **B.** 0.361
- **C.** 0.2781
- **D.** 0.7219

**Correct Answer:** 0.7219

**Explanation:** With p+=0.8000, entropy=-sum p log2 p=0.7219 bits.

---

## Question 37

**Question:** A split creates children with (+,-) counts (9, 1) and (1, 11). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.4389
- **B.** 0.994
- **C.** 1.4329
- **D.** 0.5551

**Correct Answer:** 0.5551

**Explanation:** Parent entropy=0.994; weighted child entropy=0.4389; IG=0.994-0.4389=0.5551.

---

## Question 38

**Question:** A node has class counts (9,8). What is its Gini impurity?

**Choices:**
- **A.** 0.9975
- **B.** 0.5017
- **C.** 8.5294
- **D.** 0.4983

**Correct Answer:** 0.4983

**Explanation:** Gini=1-[(9/17)^2+(8/17)^2]=0.4983.

---

## Question 39

**Question:** Two candidate splits have weighted child entropies A=0.49 and B=0.45 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose B; IG=0.5
- **B.** Choose A; IG=0.46
- **C.** Choose B; IG=1.4
- **D.** Choose A; IG=1.44

**Correct Answer:** Choose B; IG=0.5

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.46 and IG_B=0.5, so split B is selected with gain 0.5.

---

## Question 40

**Question:** A three-way split yields child (+,-) counts [(10, 0), (1, 9), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (1, 0.2132)
- **B.** (0.2132, 0.7868)
- **C.** (0.7868, 0.2132)
- **D.** (0.0711, 0.9289)

**Correct Answer:** (0.2132, 0.7868)

**Explanation:** Weight each child by its size/22. Weighted entropy=0.2132, parent entropy=1, hence IG=0.7868.

---

## Question 41

**Question:** A binary node contains 9 positive and 1 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.18
- **B.** 0.2345
- **C.** 0.469
- **D.** 0.531

**Correct Answer:** 0.469

**Explanation:** With p+=0.9000, entropy=-sum p log2 p=0.469 bits.

---

## Question 42

**Question:** A split creates children with (+,-) counts (10, 1) and (1, 12). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.4134
- **B.** 0.995
- **C.** 0.5816
- **D.** 1.4083

**Correct Answer:** 0.5816

**Explanation:** Parent entropy=0.995; weighted child entropy=0.4134; IG=0.995-0.4134=0.5816.

---

## Question 43

**Question:** A node has class counts (10,8). What is its Gini impurity?

**Choices:**
- **A.** 0.9911
- **B.** 0.4938
- **C.** 0.5062
- **D.** 9.1111

**Correct Answer:** 0.4938

**Explanation:** Gini=1-[(10/18)^2+(8/18)^2]=0.4938.

---

## Question 44

**Question:** Two candidate splits have weighted child entropies A=0.51 and B=0.44 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose B; IG=0.51
- **B.** Choose A; IG=0.44
- **C.** Choose B; IG=1.39
- **D.** Choose A; IG=1.46

**Correct Answer:** Choose B; IG=0.51

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.44 and IG_B=0.51, so split B is selected with gain 0.51.

---

## Question 45

**Question:** A three-way split yields child (+,-) counts [(11, 0), (1, 10), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (1, 0.2014)
- **B.** (0.7986, 0.2014)
- **C.** (0.0671, 0.9329)
- **D.** (0.2014, 0.7986)

**Correct Answer:** (0.2014, 0.7986)

**Explanation:** Weight each child by its size/24. Weighted entropy=0.2014, parent entropy=1, hence IG=0.7986.

---

## Question 46

**Question:** A binary node contains 10 positive and 1 negative cases. What is its entropy in bits?

**Choices:**
- **A.** 0.1653
- **B.** 0.2197
- **C.** 0.4395
- **D.** 0.5605

**Correct Answer:** 0.4395

**Explanation:** With p+=0.9091, entropy=-sum p log2 p=0.4395 bits.

---

## Question 47

**Question:** A split creates children with (+,-) counts (11, 1) and (1, 13). Compute information gain from the implied parent. Round to four decimals.

**Choices:**
- **A.** 0.3909
- **B.** 0.9957
- **C.** 1.3866
- **D.** 0.6048

**Correct Answer:** 0.6048

**Explanation:** Parent entropy=0.9957; weighted child entropy=0.3909; IG=0.9957-0.3909=0.6048.

---

## Question 48

**Question:** A node has class counts (11,8). What is its Gini impurity?

**Choices:**
- **A.** 0.9819
- **B.** 0.4875
- **C.** 0.5125
- **D.** 9.7368

**Correct Answer:** 0.4875

**Explanation:** Gini=1-[(11/19)^2+(8/19)^2]=0.4875.

---

## Question 49

**Question:** Two candidate splits have weighted child entropies A=0.53 and B=0.43 under parent entropy 0.95. Which choice and gain are correct?

**Choices:**
- **A.** Choose A; IG=0.42
- **B.** Choose B; IG=0.52
- **C.** Choose B; IG=1.38
- **D.** Choose A; IG=1.48

**Correct Answer:** Choose B; IG=0.52

**Explanation:** The smaller weighted entropy gives larger gain. IG_A=0.42 and IG_B=0.52, so split B is selected with gain 0.52.

---

## Question 50

**Question:** A three-way split yields child (+,-) counts [(12, 0), (1, 11), (0, 2)]. What pair (weighted entropy, information gain) is correct?

**Choices:**
- **A.** (0.191, 0.809)
- **B.** (1, 0.191)
- **C.** (0.809, 0.191)
- **D.** (0.0637, 0.9363)

**Correct Answer:** (0.191, 0.809)

**Explanation:** Weight each child by its size/26. Weighted entropy=0.191, parent entropy=1, hence IG=0.809.

---

## Question 51

**Question:** A tree-induction result is being challenged. Case 1: Which conclusion is the single most defensible?

**Choices:**
- **A.** A pure node maximizes both entropy and Gini impurity.
- **B.** A pure node must contain equal counts of every class.
- **C.** A pure node has entropy zero and Gini impurity zero.
- **D.** Purity is determined by feature values without using labels.

**Correct Answer:** A pure node has entropy zero and Gini impurity zero.

**Explanation:** When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 52

**Question:** A tree-induction result is being challenged. Case 2: Which conclusion is the single most defensible?

**Choices:**
- **A.** ID3 chooses the candidate split with the largest information gain.
- **B.** ID3 chooses the split with the largest weighted child entropy., even when the other quantities in the formula are fixed
- **C.** ID3 always selects the feature with the most values.
- **D.** ID3 ranks splits only by the depth they would create.

**Correct Answer:** ID3 chooses the candidate split with the largest information gain.

**Explanation:** Information gain is parent entropy minus weighted post-split entropy.

---

## Question 53

**Question:** A tree-induction result is being challenged. Case 3: Which conclusion is the single most defensible?

**Choices:**
- **A.** Continuous features must be discarded before tree induction., as a consequence that holds for every permitted input
- **B.** Every distinct continuous value must become a class label.
- **C.** Thresholds are valid only for regression trees.
- **D.** A continuous feature can be tested using a threshold such as length < 3.

**Correct Answer:** A continuous feature can be tested using a threshold such as length < 3.

**Explanation:** Threshold branches allow decision trees to partition continuous inputs.

---

## Question 54

**Question:** A tree-induction result is being challenged. Case 4: Which conclusion is the single most defensible?

**Choices:**
- **A.** Post-pruning forbids the tree from growing beyond its root.
- **B.** Post-pruning grows a tree first and then removes weak branches.
- **C.** Pre-pruning removes branches only after full growth.
- **D.** Pruning guarantees zero error on both training and test sets., without needing any additional modeling assumption

**Correct Answer:** Post-pruning grows a tree first and then removes weak branches.

**Explanation:** The timing distinguishes post-pruning from early stopping.

---

## Question 55

**Question:** A tree-induction result is being challenged. Case 5: Which conclusion is the single most defensible?

**Choices:**
- **A.** A classification leaf must contain a continuous threshold., under both the training and evaluation conditions stated
- **B.** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.
- **C.** A regression leaf may output only a category name.
- **D.** The two tree types differ only in drawing style.

**Correct Answer:** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Explanation:** Their output types follow the classification/regression distinction.

---

## Question 56

**Question:** A tree-induction result is being challenged. Case 6: Which conclusion is the single most defensible?

**Choices:**
- **A.** A single path is a disjunction of every incompatible branch.
- **B.** A root-to-leaf path corresponds to a conjunction of tests.
- **C.** Leaves are evaluated before any internal test.
- **D.** A path ignores feature outcomes and uses only class frequency.

**Correct Answer:** A root-to-leaf path corresponds to a conjunction of tests.

**Explanation:** All tests along a path must be satisfied, forming an AND condition.

---

## Question 57

**Question:** A tree-induction result is being challenged. Case 7: Which conclusion is the single most defensible?

**Choices:**
- **A.** Every child receives weight one regardless of size.
- **B.** Only the purest child contributes to information gain., as a consequence that holds for every permitted input
- **C.** Weights are the logarithms of the number of features.
- **D.** Weighted child entropy accounts for the relative sizes of child subsets.

**Correct Answer:** Weighted child entropy accounts for the relative sizes of child subsets.

**Explanation:** The formula weights each child by |S_v|/|S|.

---

## Question 58

**Question:** A tree-induction result is being challenged. Case 8: Which conclusion is the single most defensible?

**Choices:**
- **A.** Information gain mathematically guarantees best test accuracy., without needing any additional modeling assumption
- **B.** Overfitting can occur only in linear regression.
- **C.** A fully grown tree is always simpler than a pruned tree.
- **D.** A high-information-gain training split can still contribute to overfitting.

**Correct Answer:** A high-information-gain training split can still contribute to overfitting.

**Explanation:** Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 59

**Question:** A tree-induction result is being challenged. Case 9: Which conclusion is the single most defensible?

**Choices:**
- **A.** Missing or noisy data motivates special handling and possibly pruning.
- **B.** Any missing value makes a decision tree definitionally impossible., under both the training and evaluation conditions stated
- **C.** Noise always increases information gain for the true feature.
- **D.** Pruning is used solely to increase the number of leaves.

**Correct Answer:** Missing or noisy data motivates special handling and possibly pruning.

**Explanation:** Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 60

**Question:** A tree-induction result is being challenged. Case 10: Which conclusion is the single most defensible?

**Choices:**
- **A.** Decision trees can be rewritten as rule sets such as DNF.
- **B.** Decision trees represent only a single linear inequality.
- **C.** A decision tree cannot express conjunctions or disjunctions.
- **D.** Rule conversion changes all leaf predictions into features.

**Correct Answer:** Decision trees can be rewritten as rule sets such as DNF.

**Explanation:** Paths yield conjunctions and multiple positive paths can be disjoined.

---

## Question 61

**Question:** A tree-induction result is being challenged. Case 11: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A pure node maximizes both entropy and Gini impurity.
- **B.** A pure node has entropy zero and Gini impurity zero.
- **C.** A pure node must contain equal counts of every class.
- **D.** Purity is determined by feature values without using labels.

**Correct Answer:** A pure node has entropy zero and Gini impurity zero.

**Explanation:** When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 62

**Question:** A tree-induction result is being challenged. Case 12: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** ID3 chooses the candidate split with the largest information gain.
- **B.** ID3 chooses the split with the largest weighted child entropy., without needing any additional modeling assumption
- **C.** ID3 always selects the feature with the most values.
- **D.** ID3 ranks splits only by the depth they would create.

**Correct Answer:** ID3 chooses the candidate split with the largest information gain.

**Explanation:** Information gain is parent entropy minus weighted post-split entropy.

---

## Question 63

**Question:** A tree-induction result is being challenged. Case 13: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Continuous features must be discarded before tree induction., under both the training and evaluation conditions stated
- **B.** Every distinct continuous value must become a class label.
- **C.** A continuous feature can be tested using a threshold such as length < 3.
- **D.** Thresholds are valid only for regression trees.

**Correct Answer:** A continuous feature can be tested using a threshold such as length < 3.

**Explanation:** Threshold branches allow decision trees to partition continuous inputs.

---

## Question 64

**Question:** A tree-induction result is being challenged. Case 14: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Post-pruning forbids the tree from growing beyond its root.
- **B.** Pre-pruning removes branches only after full growth.
- **C.** Post-pruning grows a tree first and then removes weak branches.
- **D.** Pruning guarantees zero error on both training and test sets., even when the other quantities in the formula are fixed

**Correct Answer:** Post-pruning grows a tree first and then removes weak branches.

**Explanation:** The timing distinguishes post-pruning from early stopping.

---

## Question 65

**Question:** A tree-induction result is being challenged. Case 15: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A classification leaf must contain a continuous threshold., as a consequence that holds for every permitted input
- **B.** A regression leaf may output only a category name.
- **C.** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.
- **D.** The two tree types differ only in drawing style.

**Correct Answer:** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Explanation:** Their output types follow the classification/regression distinction.

---

## Question 66

**Question:** A tree-induction result is being challenged. Case 16: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A single path is a disjunction of every incompatible branch.
- **B.** Leaves are evaluated before any internal test.
- **C.** A root-to-leaf path corresponds to a conjunction of tests.
- **D.** A path ignores feature outcomes and uses only class frequency.

**Correct Answer:** A root-to-leaf path corresponds to a conjunction of tests.

**Explanation:** All tests along a path must be satisfied, forming an AND condition.

---

## Question 67

**Question:** A tree-induction result is being challenged. Case 17: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Every child receives weight one regardless of size.
- **B.** Weighted child entropy accounts for the relative sizes of child subsets.
- **C.** Only the purest child contributes to information gain., under both the training and evaluation conditions stated
- **D.** Weights are the logarithms of the number of features.

**Correct Answer:** Weighted child entropy accounts for the relative sizes of child subsets.

**Explanation:** The formula weights each child by |S_v|/|S|.

---

## Question 68

**Question:** A tree-induction result is being challenged. Case 18: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A high-information-gain training split can still contribute to overfitting.
- **B.** Information gain mathematically guarantees best test accuracy., even when the other quantities in the formula are fixed
- **C.** Overfitting can occur only in linear regression.
- **D.** A fully grown tree is always simpler than a pruned tree.

**Correct Answer:** A high-information-gain training split can still contribute to overfitting.

**Explanation:** Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 69

**Question:** A tree-induction result is being challenged. Case 19: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Any missing value makes a decision tree definitionally impossible., as a consequence that holds for every permitted input
- **B.** Noise always increases information gain for the true feature.
- **C.** Missing or noisy data motivates special handling and possibly pruning.
- **D.** Pruning is used solely to increase the number of leaves.

**Correct Answer:** Missing or noisy data motivates special handling and possibly pruning.

**Explanation:** Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 70

**Question:** A tree-induction result is being challenged. Case 20: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Decision trees represent only a single linear inequality.
- **B.** Decision trees can be rewritten as rule sets such as DNF.
- **C.** A decision tree cannot express conjunctions or disjunctions.
- **D.** Rule conversion changes all leaf predictions into features.

**Correct Answer:** Decision trees can be rewritten as rule sets such as DNF.

**Explanation:** Paths yield conjunctions and multiple positive paths can be disjoined.

---

## Question 71

**Question:** A tree-induction result is being challenged. Case 21: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A pure node has entropy zero and Gini impurity zero.
- **B.** A pure node maximizes both entropy and Gini impurity.
- **C.** A pure node must contain equal counts of every class.
- **D.** Purity is determined by feature values without using labels.

**Correct Answer:** A pure node has entropy zero and Gini impurity zero.

**Explanation:** When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 72

**Question:** A tree-induction result is being challenged. Case 22: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** ID3 chooses the candidate split with the largest information gain.
- **B.** ID3 chooses the split with the largest weighted child entropy., even when the other quantities in the formula are fixed
- **C.** ID3 always selects the feature with the most values.
- **D.** ID3 ranks splits only by the depth they would create.

**Correct Answer:** ID3 chooses the candidate split with the largest information gain.

**Explanation:** Information gain is parent entropy minus weighted post-split entropy.

---

## Question 73

**Question:** A tree-induction result is being challenged. Case 23: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Continuous features must be discarded before tree induction., as a consequence that holds for every permitted input
- **B.** Every distinct continuous value must become a class label.
- **C.** Thresholds are valid only for regression trees.
- **D.** A continuous feature can be tested using a threshold such as length < 3.

**Correct Answer:** A continuous feature can be tested using a threshold such as length < 3.

**Explanation:** Threshold branches allow decision trees to partition continuous inputs.

---

## Question 74

**Question:** A tree-induction result is being challenged. Case 24: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Post-pruning forbids the tree from growing beyond its root.
- **B.** Pre-pruning removes branches only after full growth.
- **C.** Post-pruning grows a tree first and then removes weak branches.
- **D.** Pruning guarantees zero error on both training and test sets., without needing any additional modeling assumption

**Correct Answer:** Post-pruning grows a tree first and then removes weak branches.

**Explanation:** The timing distinguishes post-pruning from early stopping.

---

## Question 75

**Question:** A tree-induction result is being challenged. Case 25: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.
- **B.** A classification leaf must contain a continuous threshold., under both the training and evaluation conditions stated
- **C.** A regression leaf may output only a category name.
- **D.** The two tree types differ only in drawing style.

**Correct Answer:** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Explanation:** Their output types follow the classification/regression distinction.

---

## Question 76

**Question:** A tree-induction result is being challenged. Case 26: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A single path is a disjunction of every incompatible branch.
- **B.** Leaves are evaluated before any internal test.
- **C.** A root-to-leaf path corresponds to a conjunction of tests.
- **D.** A path ignores feature outcomes and uses only class frequency.

**Correct Answer:** A root-to-leaf path corresponds to a conjunction of tests.

**Explanation:** All tests along a path must be satisfied, forming an AND condition.

---

## Question 77

**Question:** A tree-induction result is being challenged. Case 27: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Every child receives weight one regardless of size.
- **B.** Only the purest child contributes to information gain., as a consequence that holds for every permitted input
- **C.** Weights are the logarithms of the number of features.
- **D.** Weighted child entropy accounts for the relative sizes of child subsets.

**Correct Answer:** Weighted child entropy accounts for the relative sizes of child subsets.

**Explanation:** The formula weights each child by |S_v|/|S|.

---

## Question 78

**Question:** A tree-induction result is being challenged. Case 28: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Information gain mathematically guarantees best test accuracy., without needing any additional modeling assumption
- **B.** Overfitting can occur only in linear regression.
- **C.** A fully grown tree is always simpler than a pruned tree.
- **D.** A high-information-gain training split can still contribute to overfitting.

**Correct Answer:** A high-information-gain training split can still contribute to overfitting.

**Explanation:** Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 79

**Question:** A tree-induction result is being challenged. Case 29: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Any missing value makes a decision tree definitionally impossible., under both the training and evaluation conditions stated
- **B.** Missing or noisy data motivates special handling and possibly pruning.
- **C.** Noise always increases information gain for the true feature.
- **D.** Pruning is used solely to increase the number of leaves.

**Correct Answer:** Missing or noisy data motivates special handling and possibly pruning.

**Explanation:** Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 80

**Question:** A tree-induction result is being challenged. Case 30: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Decision trees represent only a single linear inequality.
- **B.** Decision trees can be rewritten as rule sets such as DNF.
- **C.** A decision tree cannot express conjunctions or disjunctions.
- **D.** Rule conversion changes all leaf predictions into features.

**Correct Answer:** Decision trees can be rewritten as rule sets such as DNF.

**Explanation:** Paths yield conjunctions and multiple positive paths can be disjoined.

---

## Question 81

**Question:** A tree-induction result is being challenged. Case 31: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A pure node maximizes both entropy and Gini impurity.
- **B.** A pure node has entropy zero and Gini impurity zero.
- **C.** A pure node must contain equal counts of every class.
- **D.** Purity is determined by feature values without using labels.

**Correct Answer:** A pure node has entropy zero and Gini impurity zero.

**Explanation:** When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 82

**Question:** A tree-induction result is being challenged. Case 32: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** ID3 chooses the split with the largest weighted child entropy., without needing any additional modeling assumption
- **B.** ID3 always selects the feature with the most values.
- **C.** ID3 ranks splits only by the depth they would create.
- **D.** ID3 chooses the candidate split with the largest information gain.

**Correct Answer:** ID3 chooses the candidate split with the largest information gain.

**Explanation:** Information gain is parent entropy minus weighted post-split entropy.

---

## Question 83

**Question:** A tree-induction result is being challenged. Case 33: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A continuous feature can be tested using a threshold such as length < 3.
- **B.** Continuous features must be discarded before tree induction., under both the training and evaluation conditions stated
- **C.** Every distinct continuous value must become a class label.
- **D.** Thresholds are valid only for regression trees.

**Correct Answer:** A continuous feature can be tested using a threshold such as length < 3.

**Explanation:** Threshold branches allow decision trees to partition continuous inputs.

---

## Question 84

**Question:** A tree-induction result is being challenged. Case 34: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Post-pruning forbids the tree from growing beyond its root.
- **B.** Pre-pruning removes branches only after full growth.
- **C.** Pruning guarantees zero error on both training and test sets., even when the other quantities in the formula are fixed
- **D.** Post-pruning grows a tree first and then removes weak branches.

**Correct Answer:** Post-pruning grows a tree first and then removes weak branches.

**Explanation:** The timing distinguishes post-pruning from early stopping.

---

## Question 85

**Question:** A tree-induction result is being challenged. Case 35: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A classification leaf must contain a continuous threshold., as a consequence that holds for every permitted input
- **B.** A regression leaf may output only a category name.
- **C.** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.
- **D.** The two tree types differ only in drawing style.

**Correct Answer:** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Explanation:** Their output types follow the classification/regression distinction.

---

## Question 86

**Question:** A tree-induction result is being challenged. Case 36: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A single path is a disjunction of every incompatible branch.
- **B.** Leaves are evaluated before any internal test.
- **C.** A root-to-leaf path corresponds to a conjunction of tests.
- **D.** A path ignores feature outcomes and uses only class frequency.

**Correct Answer:** A root-to-leaf path corresponds to a conjunction of tests.

**Explanation:** All tests along a path must be satisfied, forming an AND condition.

---

## Question 87

**Question:** A tree-induction result is being challenged. Case 37: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Every child receives weight one regardless of size.
- **B.** Weighted child entropy accounts for the relative sizes of child subsets.
- **C.** Only the purest child contributes to information gain., under both the training and evaluation conditions stated
- **D.** Weights are the logarithms of the number of features.

**Correct Answer:** Weighted child entropy accounts for the relative sizes of child subsets.

**Explanation:** The formula weights each child by |S_v|/|S|.

---

## Question 88

**Question:** A tree-induction result is being challenged. Case 38: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A high-information-gain training split can still contribute to overfitting.
- **B.** Information gain mathematically guarantees best test accuracy., even when the other quantities in the formula are fixed
- **C.** Overfitting can occur only in linear regression.
- **D.** A fully grown tree is always simpler than a pruned tree.

**Correct Answer:** A high-information-gain training split can still contribute to overfitting.

**Explanation:** Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 89

**Question:** A tree-induction result is being challenged. Case 39: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Any missing value makes a decision tree definitionally impossible., as a consequence that holds for every permitted input
- **B.** Missing or noisy data motivates special handling and possibly pruning.
- **C.** Noise always increases information gain for the true feature.
- **D.** Pruning is used solely to increase the number of leaves.

**Correct Answer:** Missing or noisy data motivates special handling and possibly pruning.

**Explanation:** Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 90

**Question:** A tree-induction result is being challenged. Case 40: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Decision trees represent only a single linear inequality.
- **B.** A decision tree cannot express conjunctions or disjunctions.
- **C.** Decision trees can be rewritten as rule sets such as DNF.
- **D.** Rule conversion changes all leaf predictions into features.

**Correct Answer:** Decision trees can be rewritten as rule sets such as DNF.

**Explanation:** Paths yield conjunctions and multiple positive paths can be disjoined.

---

## Question 91

**Question:** A tree-induction result is being challenged. Case 41: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A pure node maximizes both entropy and Gini impurity.
- **B.** A pure node must contain equal counts of every class.
- **C.** A pure node has entropy zero and Gini impurity zero.
- **D.** Purity is determined by feature values without using labels.

**Correct Answer:** A pure node has entropy zero and Gini impurity zero.

**Explanation:** When one class has probability one, both impurity formulas evaluate to zero.

---

## Question 92

**Question:** A tree-induction result is being challenged. Case 42: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** ID3 chooses the split with the largest weighted child entropy., even when the other quantities in the formula are fixed
- **B.** ID3 always selects the feature with the most values.
- **C.** ID3 ranks splits only by the depth they would create.
- **D.** ID3 chooses the candidate split with the largest information gain.

**Correct Answer:** ID3 chooses the candidate split with the largest information gain.

**Explanation:** Information gain is parent entropy minus weighted post-split entropy.

---

## Question 93

**Question:** A tree-induction result is being challenged. Case 43: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A continuous feature can be tested using a threshold such as length < 3.
- **B.** Continuous features must be discarded before tree induction., as a consequence that holds for every permitted input
- **C.** Every distinct continuous value must become a class label.
- **D.** Thresholds are valid only for regression trees.

**Correct Answer:** A continuous feature can be tested using a threshold such as length < 3.

**Explanation:** Threshold branches allow decision trees to partition continuous inputs.

---

## Question 94

**Question:** A tree-induction result is being challenged. Case 44: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Post-pruning forbids the tree from growing beyond its root.
- **B.** Pre-pruning removes branches only after full growth.
- **C.** Post-pruning grows a tree first and then removes weak branches.
- **D.** Pruning guarantees zero error on both training and test sets., without needing any additional modeling assumption

**Correct Answer:** Post-pruning grows a tree first and then removes weak branches.

**Explanation:** The timing distinguishes post-pruning from early stopping.

---

## Question 95

**Question:** A tree-induction result is being challenged. Case 45: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A classification leaf must contain a continuous threshold., under both the training and evaluation conditions stated
- **B.** A regression leaf may output only a category name.
- **C.** The two tree types differ only in drawing style.
- **D.** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Correct Answer:** A classification leaf stores a class decision; a regression leaf stores a real-valued prediction.

**Explanation:** Their output types follow the classification/regression distinction.

---

## Question 96

**Question:** A tree-induction result is being challenged. Case 46: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A single path is a disjunction of every incompatible branch.
- **B.** Leaves are evaluated before any internal test.
- **C.** A path ignores feature outcomes and uses only class frequency.
- **D.** A root-to-leaf path corresponds to a conjunction of tests.

**Correct Answer:** A root-to-leaf path corresponds to a conjunction of tests.

**Explanation:** All tests along a path must be satisfied, forming an AND condition.

---

## Question 97

**Question:** A tree-induction result is being challenged. Case 47: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Every child receives weight one regardless of size.
- **B.** Weighted child entropy accounts for the relative sizes of child subsets.
- **C.** Only the purest child contributes to information gain., as a consequence that holds for every permitted input
- **D.** Weights are the logarithms of the number of features.

**Correct Answer:** Weighted child entropy accounts for the relative sizes of child subsets.

**Explanation:** The formula weights each child by |S_v|/|S|.

---

## Question 98

**Question:** A tree-induction result is being challenged. Case 48: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A high-information-gain training split can still contribute to overfitting.
- **B.** Information gain mathematically guarantees best test accuracy., without needing any additional modeling assumption
- **C.** Overfitting can occur only in linear regression.
- **D.** A fully grown tree is always simpler than a pruned tree.

**Correct Answer:** A high-information-gain training split can still contribute to overfitting.

**Explanation:** Greedy training improvement is not a guarantee of unseen-data generalization.

---

## Question 99

**Question:** A tree-induction result is being challenged. Case 49: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Any missing value makes a decision tree definitionally impossible., under both the training and evaluation conditions stated
- **B.** Noise always increases information gain for the true feature.
- **C.** Pruning is used solely to increase the number of leaves.
- **D.** Missing or noisy data motivates special handling and possibly pruning.

**Correct Answer:** Missing or noisy data motivates special handling and possibly pruning.

**Explanation:** Trees can accommodate imperfect data, while pruning can reduce brittle structure.

---

## Question 100

**Question:** A tree-induction result is being challenged. Case 50: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Decision trees represent only a single linear inequality.
- **B.** Decision trees can be rewritten as rule sets such as DNF.
- **C.** A decision tree cannot express conjunctions or disjunctions.
- **D.** Rule conversion changes all leaf predictions into features.

**Correct Answer:** Decision trees can be rewritten as rule sets such as DNF.

**Explanation:** Paths yield conjunctions and multiple positive paths can be disjoined.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Distractors are designed around plausible definition, sign, denominator, update-order, and rounding errors.
