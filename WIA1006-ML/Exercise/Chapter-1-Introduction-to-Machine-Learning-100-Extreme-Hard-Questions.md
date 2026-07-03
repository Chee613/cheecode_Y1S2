# Chapter 1: Introduction to Machine Learning: 100 Extreme-Hard Questions

> Topics: T/P/E, learning paradigms, representation, IID assumptions, MSE, LMS, validation, and evaluation. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** For four predictions, y=['2', '5', '-1', '4'] and y_hat=['1', '4', '0', '5']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 1.137
- **B.** 1
- **C.** 0.807
- **D.** 1.271

**Correct Answer:** 1

**Explanation:** The squared errors sum to 4; dividing by n=4 gives MSE=1.

---

## Question 2

**Question:** An LMS learner has w_i=0.4, c=0.05, f_i=2, V_train=3, and V=1.1. What is the updated w_i?

**Choices:**
- **A.** 0.21
- **B.** 0.495
- **C.** 0.59
- **D.** 4.2

**Correct Answer:** 0.59

**Explanation:** error=V_train-V=1.9 and w_i'=0.4+0.05(2)(1.9)=0.59.

---

## Question 3

**Question:** A 5-fold cross-validation run uses 90 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 72 train, 18 validate
- **B.** 18 train, 72 validate
- **C.** 90 train, 18 validate
- **D.** 72 train, 90 validate

**Correct Answer:** 72 train, 18 validate

**Explanation:** One of 5 equal folds (18 examples) validates; the other 4 folds (72 examples) train.

---

## Question 4

**Question:** Two hypotheses tie on training loss. On validation targets ['1', '2', '3'], hypothesis H gives ['1.2', '1.7', '3.2']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.2333
- **B.** 0.0567
- **C.** 0.238
- **D.** 0.0283

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 5

**Question:** A fixed task and metric yield training MSE=0.08 and shifted-distribution test MSE=0.1. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.18
- **B.** -0.02
- **C.** 0.02
- **D.** 1.25

**Correct Answer:** 0.02

**Explanation:** Using the stated direction, gap=0.1-0.08=0.02. The value describes a gap, not its cause.

---

## Question 6

**Question:** For four predictions, y=['3', '4.67', '-0.75', '4.5'] and y_hat=['1.5', '3.8', '0.25', '5.25']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 0.5705
- **B.** 1.1409
- **C.** 1.0681
- **D.** 1.0292

**Correct Answer:** 1.1409

**Explanation:** The squared errors sum to 4.5636; dividing by n=4 gives MSE=1.1409.

---

## Question 7

**Question:** An LMS learner has w_i=0.5, c=0.06, f_i=1.5, V_train=3.2, and V=1.2. What is the updated w_i?

**Choices:**
- **A.** 0.32
- **B.** 0.62
- **C.** 3.5
- **D.** 0.68

**Correct Answer:** 0.68

**Explanation:** error=V_train-V=2 and w_i'=0.5+0.06(1.5)(2)=0.68.

---

## Question 8

**Question:** A 10-fold cross-validation run uses 100 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 90 train, 10 validate
- **B.** 10 train, 90 validate
- **C.** 100 train, 10 validate
- **D.** 90 train, 100 validate

**Correct Answer:** 90 train, 10 validate

**Explanation:** One of 10 equal folds (10 examples) validates; the other 9 folds (90 examples) train.

---

## Question 9

**Question:** Two hypotheses tie on training loss. On validation targets ['1.1', '1.95', '3.07'], hypothesis H gives ['1.3', '1.65', '3.27']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.2333
- **B.** 0.0567
- **C.** 0.238
- **D.** 0.0283

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 10

**Question:** A fixed task and metric yield training MSE=0.09 and shifted-distribution test MSE=0.13. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.22
- **B.** -0.04
- **C.** 1.4444
- **D.** 0.04

**Correct Answer:** 0.04

**Explanation:** Using the stated direction, gap=0.13-0.09=0.04. The value describes a gap, not its cause.

---

## Question 11

**Question:** For four predictions, y=['4', '4.33', '-0.5', '5'] and y_hat=['2', '3.6', '0.5', '5.5']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 1.4469
- **B.** 0.7235
- **C.** 1.2029
- **D.** 1.0583

**Correct Answer:** 1.4469

**Explanation:** The squared errors sum to 5.7878; dividing by n=4 gives MSE=1.4469.

---

## Question 12

**Question:** An LMS learner has w_i=0.6, c=0.07, f_i=1, V_train=3.4, and V=1.3. What is the updated w_i?

**Choices:**
- **A.** 0.747
- **B.** 0.884
- **C.** 0.554
- **D.** 1.018

**Correct Answer:** 0.747

**Explanation:** error=V_train-V=2.1 and w_i'=0.6+0.07(1)(2.1)=0.747.

---

## Question 13

**Question:** A 5-fold cross-validation run uses 110 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 22 train, 88 validate
- **B.** 88 train, 22 validate
- **C.** 110 train, 22 validate
- **D.** 88 train, 110 validate

**Correct Answer:** 88 train, 22 validate

**Explanation:** One of 5 equal folds (22 examples) validates; the other 4 folds (88 examples) train.

---

## Question 14

**Question:** Two hypotheses tie on training loss. On validation targets ['1.2', '1.9', '3.13'], hypothesis H gives ['1.4', '1.6', '3.33']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.0567
- **B.** 0.2333
- **C.** 0.238
- **D.** 0.0283

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 15

**Question:** A fixed task and metric yield training MSE=0.1 and shifted-distribution test MSE=0.16. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.26
- **B.** -0.06
- **C.** 1.6
- **D.** 0.06

**Correct Answer:** 0.06

**Explanation:** Using the stated direction, gap=0.16-0.1=0.06. The value describes a gap, not its cause.

---

## Question 16

**Question:** For four predictions, y=['5', '4', '-0.25', '5.5'] and y_hat=['2.5', '3.4', '0.75', '5.75']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 0.9591
- **B.** 1.385
- **C.** 1.9181
- **D.** 1.0875

**Correct Answer:** 1.9181

**Explanation:** The squared errors sum to 7.6725; dividing by n=4 gives MSE=1.9181.

---

## Question 17

**Question:** An LMS learner has w_i=0.7, c=0.08, f_i=2, V_train=3.6, and V=1.4. What is the updated w_i?

**Choices:**
- **A.** 0.348
- **B.** 0.876
- **C.** 1.052
- **D.** 5.1

**Correct Answer:** 1.052

**Explanation:** error=V_train-V=2.2 and w_i'=0.7+0.08(2)(2.2)=1.052.

---

## Question 18

**Question:** A 10-fold cross-validation run uses 120 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 12 train, 108 validate
- **B.** 108 train, 12 validate
- **C.** 120 train, 12 validate
- **D.** 108 train, 120 validate

**Correct Answer:** 108 train, 12 validate

**Explanation:** One of 10 equal folds (12 examples) validates; the other 9 folds (108 examples) train.

---

## Question 19

**Question:** Two hypotheses tie on training loss. On validation targets ['1.3', '1.85', '3.2'], hypothesis H gives ['1.5', '1.55', '3.4']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.2333
- **B.** 0.238
- **C.** 0.0283
- **D.** 0.0567

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 20

**Question:** A fixed task and metric yield training MSE=0.11 and shifted-distribution test MSE=0.19. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.3
- **B.** -0.08
- **C.** 1.7273
- **D.** 0.08

**Correct Answer:** 0.08

**Explanation:** Using the stated direction, gap=0.19-0.11=0.08. The value describes a gap, not its cause.

---

## Question 21

**Question:** For four predictions, y=['6', '3.67', '0', '6'] and y_hat=['3', '3.2', '1', '6']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 1.2772
- **B.** 1.5983
- **C.** 1.1167
- **D.** 2.5544

**Correct Answer:** 2.5544

**Explanation:** The squared errors sum to 10.2178; dividing by n=4 gives MSE=2.5544.

---

## Question 22

**Question:** An LMS learner has w_i=0.8, c=0.05, f_i=1.5, V_train=3.8, and V=1.5. What is the updated w_i?

**Choices:**
- **A.** 0.6275
- **B.** 0.915
- **C.** 4.25
- **D.** 0.9725

**Correct Answer:** 0.9725

**Explanation:** error=V_train-V=2.3 and w_i'=0.8+0.05(1.5)(2.3)=0.9725.

---

## Question 23

**Question:** A 5-fold cross-validation run uses 130 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 26 train, 104 validate
- **B.** 130 train, 26 validate
- **C.** 104 train, 130 validate
- **D.** 104 train, 26 validate

**Correct Answer:** 104 train, 26 validate

**Explanation:** One of 5 equal folds (26 examples) validates; the other 4 folds (104 examples) train.

---

## Question 24

**Question:** Two hypotheses tie on training loss. On validation targets ['1.4', '1.8', '3.27'], hypothesis H gives ['1.6', '1.5', '3.47']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.2333
- **B.** 0.0567
- **C.** 0.238
- **D.** 0.0283

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 25

**Question:** A fixed task and metric yield training MSE=0.12 and shifted-distribution test MSE=0.22. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.34
- **B.** -0.1
- **C.** 0.1
- **D.** 1.8333

**Correct Answer:** 0.1

**Explanation:** Using the stated direction, gap=0.22-0.12=0.1. The value describes a gap, not its cause.

---

## Question 26

**Question:** For four predictions, y=['7', '3.33', '0.25', '6.5'] and y_hat=['3.5', '3', '1.25', '6.25']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 1.678
- **B.** 1.8319
- **C.** 3.3559
- **D.** 1.2708

**Correct Answer:** 3.3559

**Explanation:** The squared errors sum to 13.4236; dividing by n=4 gives MSE=3.3559.

---

## Question 27

**Question:** An LMS learner has w_i=0.9, c=0.06, f_i=1, V_train=4, and V=1.6. What is the updated w_i?

**Choices:**
- **A.** 1.181
- **B.** 0.851
- **C.** 1.044
- **D.** 1.315

**Correct Answer:** 1.044

**Explanation:** error=V_train-V=2.4 and w_i'=0.9+0.06(1)(2.4)=1.044.

---

## Question 28

**Question:** A 10-fold cross-validation run uses 140 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 14 train, 126 validate
- **B.** 126 train, 14 validate
- **C.** 140 train, 14 validate
- **D.** 126 train, 140 validate

**Correct Answer:** 126 train, 14 validate

**Explanation:** One of 10 equal folds (14 examples) validates; the other 9 folds (126 examples) train.

---

## Question 29

**Question:** Two hypotheses tie on training loss. On validation targets ['1.5', '1.75', '3.33'], hypothesis H gives ['1.7', '1.45', '3.53']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.0567
- **B.** 0.2333
- **C.** 0.238
- **D.** 0.0283

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 30

**Question:** A fixed task and metric yield training MSE=0.13 and shifted-distribution test MSE=0.25. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.12
- **B.** 0.38
- **C.** -0.12
- **D.** 1.9231

**Correct Answer:** 0.12

**Explanation:** Using the stated direction, gap=0.25-0.13=0.12. The value describes a gap, not its cause.

---

## Question 31

**Question:** For four predictions, y=['8', '3', '0.5', '7'] and y_hat=['4', '2.8', '1.5', '6.5']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 2.1612
- **B.** 4.3225
- **C.** 2.0791
- **D.** 1.425

**Correct Answer:** 4.3225

**Explanation:** The squared errors sum to 17.29; dividing by n=4 gives MSE=4.3225.

---

## Question 32

**Question:** An LMS learner has w_i=1, c=0.07, f_i=2, V_train=4.2, and V=1.7. What is the updated w_i?

**Choices:**
- **A.** 0.65
- **B.** 1.35
- **C.** 1.175
- **D.** 6

**Correct Answer:** 1.35

**Explanation:** error=V_train-V=2.5 and w_i'=1+0.07(2)(2.5)=1.35.

---

## Question 33

**Question:** A 5-fold cross-validation run uses 150 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 30 train, 120 validate
- **B.** 150 train, 30 validate
- **C.** 120 train, 30 validate
- **D.** 120 train, 150 validate

**Correct Answer:** 120 train, 30 validate

**Explanation:** One of 5 equal folds (30 examples) validates; the other 4 folds (120 examples) train.

---

## Question 34

**Question:** Two hypotheses tie on training loss. On validation targets ['1.6', '1.7', '3.4'], hypothesis H gives ['1.8', '1.4', '3.6']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.2333
- **B.** 0.238
- **C.** 0.0567
- **D.** 0.0283

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 35

**Question:** A fixed task and metric yield training MSE=0.14 and shifted-distribution test MSE=0.28. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.14
- **B.** 0.42
- **C.** -0.14
- **D.** 2

**Correct Answer:** 0.14

**Explanation:** Using the stated direction, gap=0.28-0.14=0.14. The value describes a gap, not its cause.

---

## Question 36

**Question:** For four predictions, y=['9', '2.67', '0.75', '7.5'] and y_hat=['4.5', '2.6', '1.75', '6.75']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 2.7271
- **B.** 5.4542
- **C.** 2.3354
- **D.** 1.5792

**Correct Answer:** 5.4542

**Explanation:** The squared errors sum to 21.8169; dividing by n=4 gives MSE=5.4542.

---

## Question 37

**Question:** An LMS learner has w_i=1.1, c=0.08, f_i=1.5, V_train=4.4, and V=1.8. What is the updated w_i?

**Choices:**
- **A.** 1.412
- **B.** 0.788
- **C.** 1.308
- **D.** 5

**Correct Answer:** 1.412

**Explanation:** error=V_train-V=2.6 and w_i'=1.1+0.08(1.5)(2.6)=1.412.

---

## Question 38

**Question:** A 10-fold cross-validation run uses 160 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 16 train, 144 validate
- **B.** 160 train, 16 validate
- **C.** 144 train, 160 validate
- **D.** 144 train, 16 validate

**Correct Answer:** 144 train, 16 validate

**Explanation:** One of 10 equal folds (16 examples) validates; the other 9 folds (144 examples) train.

---

## Question 39

**Question:** Two hypotheses tie on training loss. On validation targets ['1.7', '1.65', '3.47'], hypothesis H gives ['1.9', '1.35', '3.67']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.2333
- **B.** 0.238
- **C.** 0.0283
- **D.** 0.0567

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 40

**Question:** A fixed task and metric yield training MSE=0.15 and shifted-distribution test MSE=0.31. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.46
- **B.** -0.16
- **C.** 0.16
- **D.** 2.0667

**Correct Answer:** 0.16

**Explanation:** Using the stated direction, gap=0.31-0.15=0.16. The value describes a gap, not its cause.

---

## Question 41

**Question:** For four predictions, y=['10', '2.33', '1', '8'] and y_hat=['5', '2.4', '2', '7']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 3.3756
- **B.** 2.5983
- **C.** 6.7511
- **D.** 1.7667

**Correct Answer:** 6.7511

**Explanation:** The squared errors sum to 27.0044; dividing by n=4 gives MSE=6.7511.

---

## Question 42

**Question:** An LMS learner has w_i=1.2, c=0.05, f_i=1, V_train=4.6, and V=1.9. What is the updated w_i?

**Choices:**
- **A.** 1.472
- **B.** 1.142
- **C.** 1.606
- **D.** 1.335

**Correct Answer:** 1.335

**Explanation:** error=V_train-V=2.7 and w_i'=1.2+0.05(1)(2.7)=1.335.

---

## Question 43

**Question:** A 5-fold cross-validation run uses 170 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 34 train, 136 validate
- **B.** 170 train, 34 validate
- **C.** 136 train, 170 validate
- **D.** 136 train, 34 validate

**Correct Answer:** 136 train, 34 validate

**Explanation:** One of 5 equal folds (34 examples) validates; the other 4 folds (136 examples) train.

---

## Question 44

**Question:** Two hypotheses tie on training loss. On validation targets ['1.8', '1.6', '3.53'], hypothesis H gives ['2', '1.3', '3.73']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.2333
- **B.** 0.238
- **C.** 0.0567
- **D.** 0.0283

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 45

**Question:** A fixed task and metric yield training MSE=0.16 and shifted-distribution test MSE=0.34. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.5
- **B.** -0.18
- **C.** 0.18
- **D.** 2.125

**Correct Answer:** 0.18

**Explanation:** Using the stated direction, gap=0.34-0.16=0.18. The value describes a gap, not its cause.

---

## Question 46

**Question:** For four predictions, y=['11', '2', '1.25', '8.5'] and y_hat=['5.5', '2.2', '2.25', '7.25']. Using the chapter definition, what is the MSE? Round to four decimals.

**Choices:**
- **A.** 4.1066
- **B.** 2.8659
- **C.** 1.9875
- **D.** 8.2131

**Correct Answer:** 8.2131

**Explanation:** The squared errors sum to 32.8525; dividing by n=4 gives MSE=8.2131.

---

## Question 47

**Question:** An LMS learner has w_i=1.3, c=0.06, f_i=2, V_train=4.8, and V=2. What is the updated w_i?

**Choices:**
- **A.** 1.636
- **B.** 0.964
- **C.** 1.468
- **D.** 6.9

**Correct Answer:** 1.636

**Explanation:** error=V_train-V=2.8 and w_i'=1.3+0.06(2)(2.8)=1.636.

---

## Question 48

**Question:** A 10-fold cross-validation run uses 180 IID examples. In one fold, how many examples train the model and how many validate it?

**Choices:**
- **A.** 18 train, 162 validate
- **B.** 162 train, 18 validate
- **C.** 180 train, 18 validate
- **D.** 162 train, 180 validate

**Correct Answer:** 162 train, 18 validate

**Explanation:** One of 10 equal folds (18 examples) validates; the other 9 folds (162 examples) train.

---

## Question 49

**Question:** Two hypotheses tie on training loss. On validation targets ['1.9', '1.55', '3.6'], hypothesis H gives ['2.1', '1.25', '3.8']. What validation MSE should be attached to H?

**Choices:**
- **A.** 0.2333
- **B.** 0.238
- **C.** 0.0283
- **D.** 0.0567

**Correct Answer:** 0.0567

**Explanation:** The squared residuals are summed and divided by three, producing 0.0567; neither MAE nor RMSE is requested.

---

## Question 50

**Question:** A fixed task and metric yield training MSE=0.17 and shifted-distribution test MSE=0.37. What is the test-minus-training generalization gap?

**Choices:**
- **A.** 0.54
- **B.** 0.2
- **C.** -0.2
- **D.** 2.1765

**Correct Answer:** 0.2

**Explanation:** Using the stated direction, gap=0.37-0.17=0.2. The value describes a gap, not its cause.

---

## Question 51

**Question:** A learning-system design review is underway. Case 1: Which conclusion is the single most defensible?

**Choices:**
- **A.** The task and metric can stay fixed while a changed experience alters what the learner can infer.
- **B.** The metric uniquely determines the training examples used.
- **C.** The experience is merely another name for the prediction target., under both the training and evaluation conditions stated
- **D.** The task must change whenever the data distribution changes.

**Correct Answer:** The task and metric can stay fixed while a changed experience alters what the learner can infer.

**Explanation:** T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 52

**Question:** A learning-system design review is underway. Case 2: Which conclusion is the single most defensible?

**Choices:**
- **A.** Training MSE is mathematically identical to test MSE under every split., even when the other quantities in the formula are fixed
- **B.** A lower training MSE proves the IID assumption was satisfied.
- **C.** A low training MSE alone does not establish good performance on unseen examples.
- **D.** Training MSE measures only the speed of the learning algorithm.

**Correct Answer:** A low training MSE alone does not establish good performance on unseen examples.

**Explanation:** Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 53

**Question:** A learning-system design review is underway. Case 3: Which conclusion is the single most defensible?

**Choices:**
- **A.** Every fold is used simultaneously as both training and validation data., as a consequence that holds for every permitted input
- **B.** Cross-validation removes the need to define a performance measure.
- **C.** The test set should guide every hyperparameter choice.
- **D.** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Correct Answer:** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Explanation:** Validation supports model selection; final test data should not become tuning experience.

---

## Question 54

**Question:** A learning-system design review is underway. Case 4: Which conclusion is the single most defensible?

**Choices:**
- **A.** Classification is always supervised but regression is always unsupervised., without needing any additional modeling assumption
- **B.** Classification predicts categories, whereas regression predicts continuous numerical values.
- **C.** Regression predicts labels while classification predicts measurements.
- **D.** The distinction depends only on whether gradient descent is used.

**Correct Answer:** Classification predicts categories, whereas regression predicts continuous numerical values.

**Explanation:** The output type, not the optimizer, separates these two tasks.

---

## Question 55

**Question:** A learning-system design review is underway. Case 5: Which conclusion is the single most defensible?

**Choices:**
- **A.** It requires reward feedback after every action.
- **B.** It forbids learning any representation from unlabelled data.
- **C.** Self-supervised learning constructs a learning signal from the data itself.
- **D.** It is identical to manually labelling every training example., under both the training and evaluation conditions stated

**Correct Answer:** Self-supervised learning constructs a learning signal from the data itself.

**Explanation:** Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 56

**Question:** A learning-system design review is underway. Case 6: Which conclusion is the single most defensible?

**Choices:**
- **A.** Distribution shift changes MSE into a classification metric.
- **B.** IID guarantees that every observed feature value is identical., even when the other quantities in the formula are fixed
- **C.** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.
- **D.** A larger training set makes any test distribution equivalent.

**Correct Answer:** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Explanation:** Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 57

**Question:** A learning-system design review is underway. Case 7: Which conclusion is the single most defensible?

**Choices:**
- **A.** A hypothesis representation restricts the target functions the learner can express.
- **B.** Representation specifies only how test examples are shuffled.
- **C.** Every representation can express every possible target equally well., as a consequence that holds for every permitted input
- **D.** Representation is another term for the performance measure.

**Correct Answer:** A hypothesis representation restricts the target functions the learner can express.

**Explanation:** Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 58

**Question:** A learning-system design review is underway. Case 8: Which conclusion is the single most defensible?

**Choices:**
- **A.** LMS ignores the feature value and updates all weights equally., without needing any additional modeling assumption
- **B.** LMS always subtracts the absolute error from every weight.
- **C.** LMS can update weights only after test performance is known.
- **D.** LMS changes a weight in proportion to learning rate, feature value, and current error.

**Correct Answer:** LMS changes a weight in proportion to learning rate, feature value, and current error.

**Explanation:** The supplied update is w_i <- w_i + c f_i error.

---

## Question 59

**Question:** A learning-system design review is underway. Case 9: Which conclusion is the single most defensible?

**Choices:**
- **A.** Unsupervised learning requires a scalar reward for every state transition., under both the training and evaluation conditions stated
- **B.** Unsupervised learning can output only continuous predictions.
- **C.** Unsupervised learning is traditional programming with more rules.
- **D.** Unsupervised learning can seek hidden structure without supplied class labels.

**Correct Answer:** Unsupervised learning can seek hidden structure without supplied class labels.

**Explanation:** Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 60

**Question:** A learning-system design review is underway. Case 10: Which conclusion is the single most defensible?

**Choices:**
- **A.** Theoretical and experimental evaluation answer related but non-identical questions.
- **B.** Experimental evaluation proves performance on every possible distribution., even when the other quantities in the formula are fixed
- **C.** Theoretical evaluation requires replacing the task with a new task.
- **D.** Neither form can use a stated performance measure.

**Correct Answer:** Theoretical and experimental evaluation answer related but non-identical questions.

**Explanation:** Empirical results concern observed experiments, while theory studies properties under assumptions.

---

## Question 61

**Question:** A learning-system design review is underway. Case 11: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The metric uniquely determines the training examples used.
- **B.** The task and metric can stay fixed while a changed experience alters what the learner can infer.
- **C.** The experience is merely another name for the prediction target., as a consequence that holds for every permitted input
- **D.** The task must change whenever the data distribution changes.

**Correct Answer:** The task and metric can stay fixed while a changed experience alters what the learner can infer.

**Explanation:** T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 62

**Question:** A learning-system design review is underway. Case 12: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Training MSE is mathematically identical to test MSE under every split., without needing any additional modeling assumption
- **B.** A lower training MSE proves the IID assumption was satisfied.
- **C.** A low training MSE alone does not establish good performance on unseen examples.
- **D.** Training MSE measures only the speed of the learning algorithm.

**Correct Answer:** A low training MSE alone does not establish good performance on unseen examples.

**Explanation:** Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 63

**Question:** A learning-system design review is underway. Case 13: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.
- **B.** Every fold is used simultaneously as both training and validation data., under both the training and evaluation conditions stated
- **C.** Cross-validation removes the need to define a performance measure.
- **D.** The test set should guide every hyperparameter choice.

**Correct Answer:** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Explanation:** Validation supports model selection; final test data should not become tuning experience.

---

## Question 64

**Question:** A learning-system design review is underway. Case 14: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Classification predicts categories, whereas regression predicts continuous numerical values.
- **B.** Classification is always supervised but regression is always unsupervised., even when the other quantities in the formula are fixed
- **C.** Regression predicts labels while classification predicts measurements.
- **D.** The distinction depends only on whether gradient descent is used.

**Correct Answer:** Classification predicts categories, whereas regression predicts continuous numerical values.

**Explanation:** The output type, not the optimizer, separates these two tasks.

---

## Question 65

**Question:** A learning-system design review is underway. Case 15: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** It requires reward feedback after every action.
- **B.** Self-supervised learning constructs a learning signal from the data itself.
- **C.** It forbids learning any representation from unlabelled data.
- **D.** It is identical to manually labelling every training example., as a consequence that holds for every permitted input

**Correct Answer:** Self-supervised learning constructs a learning signal from the data itself.

**Explanation:** Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 66

**Question:** A learning-system design review is underway. Case 16: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.
- **B.** Distribution shift changes MSE into a classification metric.
- **C.** IID guarantees that every observed feature value is identical., without needing any additional modeling assumption
- **D.** A larger training set makes any test distribution equivalent.

**Correct Answer:** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Explanation:** Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 67

**Question:** A learning-system design review is underway. Case 17: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A hypothesis representation restricts the target functions the learner can express.
- **B.** Representation specifies only how test examples are shuffled.
- **C.** Every representation can express every possible target equally well., under both the training and evaluation conditions stated
- **D.** Representation is another term for the performance measure.

**Correct Answer:** A hypothesis representation restricts the target functions the learner can express.

**Explanation:** Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 68

**Question:** A learning-system design review is underway. Case 18: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** LMS ignores the feature value and updates all weights equally., even when the other quantities in the formula are fixed
- **B.** LMS always subtracts the absolute error from every weight.
- **C.** LMS changes a weight in proportion to learning rate, feature value, and current error.
- **D.** LMS can update weights only after test performance is known.

**Correct Answer:** LMS changes a weight in proportion to learning rate, feature value, and current error.

**Explanation:** The supplied update is w_i <- w_i + c f_i error.

---

## Question 69

**Question:** A learning-system design review is underway. Case 19: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Unsupervised learning requires a scalar reward for every state transition., as a consequence that holds for every permitted input
- **B.** Unsupervised learning can seek hidden structure without supplied class labels.
- **C.** Unsupervised learning can output only continuous predictions.
- **D.** Unsupervised learning is traditional programming with more rules.

**Correct Answer:** Unsupervised learning can seek hidden structure without supplied class labels.

**Explanation:** Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 70

**Question:** A learning-system design review is underway. Case 20: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Theoretical and experimental evaluation answer related but non-identical questions.
- **B.** Experimental evaluation proves performance on every possible distribution., without needing any additional modeling assumption
- **C.** Theoretical evaluation requires replacing the task with a new task.
- **D.** Neither form can use a stated performance measure.

**Correct Answer:** Theoretical and experimental evaluation answer related but non-identical questions.

**Explanation:** Empirical results concern observed experiments, while theory studies properties under assumptions.

---

## Question 71

**Question:** A learning-system design review is underway. Case 21: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The metric uniquely determines the training examples used.
- **B.** The experience is merely another name for the prediction target., under both the training and evaluation conditions stated
- **C.** The task and metric can stay fixed while a changed experience alters what the learner can infer.
- **D.** The task must change whenever the data distribution changes.

**Correct Answer:** The task and metric can stay fixed while a changed experience alters what the learner can infer.

**Explanation:** T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 72

**Question:** A learning-system design review is underway. Case 22: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Training MSE is mathematically identical to test MSE under every split., even when the other quantities in the formula are fixed
- **B.** A low training MSE alone does not establish good performance on unseen examples.
- **C.** A lower training MSE proves the IID assumption was satisfied.
- **D.** Training MSE measures only the speed of the learning algorithm.

**Correct Answer:** A low training MSE alone does not establish good performance on unseen examples.

**Explanation:** Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 73

**Question:** A learning-system design review is underway. Case 23: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Every fold is used simultaneously as both training and validation data., as a consequence that holds for every permitted input
- **B.** Cross-validation removes the need to define a performance measure.
- **C.** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.
- **D.** The test set should guide every hyperparameter choice.

**Correct Answer:** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Explanation:** Validation supports model selection; final test data should not become tuning experience.

---

## Question 74

**Question:** A learning-system design review is underway. Case 24: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Classification is always supervised but regression is always unsupervised., without needing any additional modeling assumption
- **B.** Regression predicts labels while classification predicts measurements.
- **C.** The distinction depends only on whether gradient descent is used.
- **D.** Classification predicts categories, whereas regression predicts continuous numerical values.

**Correct Answer:** Classification predicts categories, whereas regression predicts continuous numerical values.

**Explanation:** The output type, not the optimizer, separates these two tasks.

---

## Question 75

**Question:** A learning-system design review is underway. Case 25: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** It requires reward feedback after every action.
- **B.** It forbids learning any representation from unlabelled data.
- **C.** It is identical to manually labelling every training example., under both the training and evaluation conditions stated
- **D.** Self-supervised learning constructs a learning signal from the data itself.

**Correct Answer:** Self-supervised learning constructs a learning signal from the data itself.

**Explanation:** Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 76

**Question:** A learning-system design review is underway. Case 26: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Distribution shift changes MSE into a classification metric.
- **B.** IID guarantees that every observed feature value is identical., even when the other quantities in the formula are fixed
- **C.** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.
- **D.** A larger training set makes any test distribution equivalent.

**Correct Answer:** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Explanation:** Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 77

**Question:** A learning-system design review is underway. Case 27: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Representation specifies only how test examples are shuffled.
- **B.** Every representation can express every possible target equally well., as a consequence that holds for every permitted input
- **C.** Representation is another term for the performance measure.
- **D.** A hypothesis representation restricts the target functions the learner can express.

**Correct Answer:** A hypothesis representation restricts the target functions the learner can express.

**Explanation:** Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 78

**Question:** A learning-system design review is underway. Case 28: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** LMS ignores the feature value and updates all weights equally., without needing any additional modeling assumption
- **B.** LMS changes a weight in proportion to learning rate, feature value, and current error.
- **C.** LMS always subtracts the absolute error from every weight.
- **D.** LMS can update weights only after test performance is known.

**Correct Answer:** LMS changes a weight in proportion to learning rate, feature value, and current error.

**Explanation:** The supplied update is w_i <- w_i + c f_i error.

---

## Question 79

**Question:** A learning-system design review is underway. Case 29: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Unsupervised learning requires a scalar reward for every state transition., under both the training and evaluation conditions stated
- **B.** Unsupervised learning can output only continuous predictions.
- **C.** Unsupervised learning can seek hidden structure without supplied class labels.
- **D.** Unsupervised learning is traditional programming with more rules.

**Correct Answer:** Unsupervised learning can seek hidden structure without supplied class labels.

**Explanation:** Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 80

**Question:** A learning-system design review is underway. Case 30: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Theoretical and experimental evaluation answer related but non-identical questions.
- **B.** Experimental evaluation proves performance on every possible distribution., even when the other quantities in the formula are fixed
- **C.** Theoretical evaluation requires replacing the task with a new task.
- **D.** Neither form can use a stated performance measure.

**Correct Answer:** Theoretical and experimental evaluation answer related but non-identical questions.

**Explanation:** Empirical results concern observed experiments, while theory studies properties under assumptions.

---

## Question 81

**Question:** A learning-system design review is underway. Case 31: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The task and metric can stay fixed while a changed experience alters what the learner can infer.
- **B.** The metric uniquely determines the training examples used.
- **C.** The experience is merely another name for the prediction target., as a consequence that holds for every permitted input
- **D.** The task must change whenever the data distribution changes.

**Correct Answer:** The task and metric can stay fixed while a changed experience alters what the learner can infer.

**Explanation:** T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 82

**Question:** A learning-system design review is underway. Case 32: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A low training MSE alone does not establish good performance on unseen examples.
- **B.** Training MSE is mathematically identical to test MSE under every split., without needing any additional modeling assumption
- **C.** A lower training MSE proves the IID assumption was satisfied.
- **D.** Training MSE measures only the speed of the learning algorithm.

**Correct Answer:** A low training MSE alone does not establish good performance on unseen examples.

**Explanation:** Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 83

**Question:** A learning-system design review is underway. Case 33: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Every fold is used simultaneously as both training and validation data., under both the training and evaluation conditions stated
- **B.** Cross-validation removes the need to define a performance measure.
- **C.** The test set should guide every hyperparameter choice.
- **D.** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Correct Answer:** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Explanation:** Validation supports model selection; final test data should not become tuning experience.

---

## Question 84

**Question:** A learning-system design review is underway. Case 34: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Classification predicts categories, whereas regression predicts continuous numerical values.
- **B.** Classification is always supervised but regression is always unsupervised., even when the other quantities in the formula are fixed
- **C.** Regression predicts labels while classification predicts measurements.
- **D.** The distinction depends only on whether gradient descent is used.

**Correct Answer:** Classification predicts categories, whereas regression predicts continuous numerical values.

**Explanation:** The output type, not the optimizer, separates these two tasks.

---

## Question 85

**Question:** A learning-system design review is underway. Case 35: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** It requires reward feedback after every action.
- **B.** Self-supervised learning constructs a learning signal from the data itself.
- **C.** It forbids learning any representation from unlabelled data.
- **D.** It is identical to manually labelling every training example., as a consequence that holds for every permitted input

**Correct Answer:** Self-supervised learning constructs a learning signal from the data itself.

**Explanation:** Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 86

**Question:** A learning-system design review is underway. Case 36: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Distribution shift changes MSE into a classification metric.
- **B.** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.
- **C.** IID guarantees that every observed feature value is identical., without needing any additional modeling assumption
- **D.** A larger training set makes any test distribution equivalent.

**Correct Answer:** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Explanation:** Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 87

**Question:** A learning-system design review is underway. Case 37: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Representation specifies only how test examples are shuffled.
- **B.** A hypothesis representation restricts the target functions the learner can express.
- **C.** Every representation can express every possible target equally well., under both the training and evaluation conditions stated
- **D.** Representation is another term for the performance measure.

**Correct Answer:** A hypothesis representation restricts the target functions the learner can express.

**Explanation:** Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 88

**Question:** A learning-system design review is underway. Case 38: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** LMS changes a weight in proportion to learning rate, feature value, and current error.
- **B.** LMS ignores the feature value and updates all weights equally., even when the other quantities in the formula are fixed
- **C.** LMS always subtracts the absolute error from every weight.
- **D.** LMS can update weights only after test performance is known.

**Correct Answer:** LMS changes a weight in proportion to learning rate, feature value, and current error.

**Explanation:** The supplied update is w_i <- w_i + c f_i error.

---

## Question 89

**Question:** A learning-system design review is underway. Case 39: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Unsupervised learning can seek hidden structure without supplied class labels.
- **B.** Unsupervised learning requires a scalar reward for every state transition., as a consequence that holds for every permitted input
- **C.** Unsupervised learning can output only continuous predictions.
- **D.** Unsupervised learning is traditional programming with more rules.

**Correct Answer:** Unsupervised learning can seek hidden structure without supplied class labels.

**Explanation:** Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 90

**Question:** A learning-system design review is underway. Case 40: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Experimental evaluation proves performance on every possible distribution., without needing any additional modeling assumption
- **B.** Theoretical and experimental evaluation answer related but non-identical questions.
- **C.** Theoretical evaluation requires replacing the task with a new task.
- **D.** Neither form can use a stated performance measure.

**Correct Answer:** Theoretical and experimental evaluation answer related but non-identical questions.

**Explanation:** Empirical results concern observed experiments, while theory studies properties under assumptions.

---

## Question 91

**Question:** A learning-system design review is underway. Case 41: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The metric uniquely determines the training examples used.
- **B.** The experience is merely another name for the prediction target., under both the training and evaluation conditions stated
- **C.** The task and metric can stay fixed while a changed experience alters what the learner can infer.
- **D.** The task must change whenever the data distribution changes.

**Correct Answer:** The task and metric can stay fixed while a changed experience alters what the learner can infer.

**Explanation:** T, P, and E describe different parts of a learning problem; changing E need not redefine T or P.

---

## Question 92

**Question:** A learning-system design review is underway. Case 42: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Training MSE is mathematically identical to test MSE under every split., even when the other quantities in the formula are fixed
- **B.** A low training MSE alone does not establish good performance on unseen examples.
- **C.** A lower training MSE proves the IID assumption was satisfied.
- **D.** Training MSE measures only the speed of the learning algorithm.

**Correct Answer:** A low training MSE alone does not establish good performance on unseen examples.

**Explanation:** Generalization must be evaluated on held-out data; training fit alone can be misleading.

---

## Question 93

**Question:** A learning-system design review is underway. Case 43: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Every fold is used simultaneously as both training and validation data., as a consequence that holds for every permitted input
- **B.** Cross-validation removes the need to define a performance measure.
- **C.** The test set should guide every hyperparameter choice.
- **D.** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Correct Answer:** Cross-validation uses held-out folds for repeated validation while preserving a separate role for final testing.

**Explanation:** Validation supports model selection; final test data should not become tuning experience.

---

## Question 94

**Question:** A learning-system design review is underway. Case 44: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Classification is always supervised but regression is always unsupervised., without needing any additional modeling assumption
- **B.** Regression predicts labels while classification predicts measurements.
- **C.** Classification predicts categories, whereas regression predicts continuous numerical values.
- **D.** The distinction depends only on whether gradient descent is used.

**Correct Answer:** Classification predicts categories, whereas regression predicts continuous numerical values.

**Explanation:** The output type, not the optimizer, separates these two tasks.

---

## Question 95

**Question:** A learning-system design review is underway. Case 45: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Self-supervised learning constructs a learning signal from the data itself.
- **B.** It requires reward feedback after every action.
- **C.** It forbids learning any representation from unlabelled data.
- **D.** It is identical to manually labelling every training example., under both the training and evaluation conditions stated

**Correct Answer:** Self-supervised learning constructs a learning signal from the data itself.

**Explanation:** Self-supervision derives targets or structure from the data rather than external labels.

---

## Question 96

**Question:** A learning-system design review is underway. Case 46: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Distribution shift changes MSE into a classification metric.
- **B.** IID guarantees that every observed feature value is identical., even when the other quantities in the formula are fixed
- **C.** A larger training set makes any test distribution equivalent.
- **D.** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Correct Answer:** A distribution shift can invalidate conclusions even when the training algorithm is unchanged.

**Explanation:** Training and test distributions matter to generalization; algorithmic sameness does not remove mismatch.

---

## Question 97

**Question:** A learning-system design review is underway. Case 47: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Representation specifies only how test examples are shuffled.
- **B.** Every representation can express every possible target equally well., as a consequence that holds for every permitted input
- **C.** Representation is another term for the performance measure.
- **D.** A hypothesis representation restricts the target functions the learner can express.

**Correct Answer:** A hypothesis representation restricts the target functions the learner can express.

**Explanation:** Linear functions, trees, networks, and probabilistic models impose different expressive forms.

---

## Question 98

**Question:** A learning-system design review is underway. Case 48: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** LMS ignores the feature value and updates all weights equally., without needing any additional modeling assumption
- **B.** LMS changes a weight in proportion to learning rate, feature value, and current error.
- **C.** LMS always subtracts the absolute error from every weight.
- **D.** LMS can update weights only after test performance is known.

**Correct Answer:** LMS changes a weight in proportion to learning rate, feature value, and current error.

**Explanation:** The supplied update is w_i <- w_i + c f_i error.

---

## Question 99

**Question:** A learning-system design review is underway. Case 49: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Unsupervised learning requires a scalar reward for every state transition., under both the training and evaluation conditions stated
- **B.** Unsupervised learning can output only continuous predictions.
- **C.** Unsupervised learning can seek hidden structure without supplied class labels.
- **D.** Unsupervised learning is traditional programming with more rules.

**Correct Answer:** Unsupervised learning can seek hidden structure without supplied class labels.

**Explanation:** Clustering and PCA use unlabelled structure rather than target labels.

---

## Question 100

**Question:** A learning-system design review is underway. Case 50: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Experimental evaluation proves performance on every possible distribution., even when the other quantities in the formula are fixed
- **B.** Theoretical evaluation requires replacing the task with a new task.
- **C.** Neither form can use a stated performance measure.
- **D.** Theoretical and experimental evaluation answer related but non-identical questions.

**Correct Answer:** Theoretical and experimental evaluation answer related but non-identical questions.

**Explanation:** Empirical results concern observed experiments, while theory studies properties under assumptions.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Distractors are designed around plausible definition, sign, denominator, update-order, and rounding errors.
