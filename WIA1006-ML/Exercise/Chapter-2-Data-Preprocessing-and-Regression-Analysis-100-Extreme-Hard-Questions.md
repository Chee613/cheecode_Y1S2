# Chapter 2: Data Preprocessing and Regression Analysis: 100 Extreme-Hard Questions

> Topics: cleaning, encoding, scaling, dataset splits, linear regression, gradient descent, normal equation, and metrics. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** A training feature has fitted min=5, max=25; a value x=10 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.5
- **B.** 0.2
- **C.** 0.25
- **D.** -0.75

**Correct Answer:** 0.25

**Explanation:** x'=(10-5)/(25-5)=0.25. The range and minimum must both come from training data.

---

## Question 2

**Question:** For x=20, training mean=14, standard deviation=2, and range=12, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (3, 0.5)
- **B.** (0.5, 3)
- **C.** (10, 1.6667)
- **D.** (-3, -0.5)

**Correct Answer:** (3, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 3; mean normalization divides the same numerator by range: 0.5.

---

## Question 3

**Question:** For x=[0, 1, 2], y=['1', '3', '5'], theta_0=0.5, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 1.1667
- **B.** 0.5833
- **C.** 1.0801
- **D.** 1

**Correct Answer:** 0.5833

**Explanation:** Predictions are ['0.5', '2', '3.5']; SSE=3.5, so J=3.5/6=0.5833.

---

## Question 4

**Question:** Using x=[1, 2, 3], y=['2', '4', '7'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.3667, 1.1333)
- **B.** (1.1333, 1.3667)
- **C.** (0.8667, 0.6333)
- **D.** (1.1333, 1.1333)

**Correct Answer:** (1.1333, 1.3667)

**Explanation:** The mean residual is -1.3333 and the mean x-weighted residual is -3.6667; simultaneous subtraction gives (1.1333,1.3667).

---

## Question 5

**Question:** Residuals are ['1', '-2', '3', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (1.75, 3.75, 1.9365)
- **B.** (3.75, 1.75, 1.9365)
- **C.** (1.75, 1.9365, 3.75)
- **D.** (1.3229, 3.75, 1.75)

**Correct Answer:** (1.75, 3.75, 1.9365)

**Explanation:** Average absolute error=1.75, average squared error=3.75, and its square root=1.9365.

---

## Question 6

**Question:** A training feature has fitted min=4, max=26; a value x=12 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.5455
- **B.** 0.3636
- **C.** 0.3077
- **D.** -0.6364

**Correct Answer:** 0.3636

**Explanation:** x'=(12-4)/(26-4)=0.3636. The range and minimum must both come from training data.

---

## Question 7

**Question:** For x=21, training mean=14.5, standard deviation=3, and range=13, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (0.5, 2.1667)
- **B.** (2.1667, 0.5)
- **C.** (7, 1.6154)
- **D.** (-2.1667, -0.5)

**Correct Answer:** (2.1667, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 2.1667; mean normalization divides the same numerator by range: 0.5.

---

## Question 8

**Question:** For x=[0, 1, 2], y=['1.2', '3.2', '5.2'], theta_0=0.6, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 1.3767
- **B.** 1.1733
- **C.** 1.1
- **D.** 0.6883

**Correct Answer:** 0.6883

**Explanation:** Predictions are ['0.6', '2.1', '3.6']; SSE=4.13, so J=4.13/6=0.6883.

---

## Question 9

**Question:** Using x=[1, 2, 3], y=['2.1', '4.1', '7.1'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.1433, 1.3867)
- **B.** (1.3867, 1.1433)
- **C.** (0.8567, 0.6133)
- **D.** (1.1433, 1.1433)

**Correct Answer:** (1.1433, 1.3867)

**Explanation:** The mean residual is -1.4333 and the mean x-weighted residual is -3.8667; simultaneous subtraction gives (1.1433,1.3867).

---

## Question 10

**Question:** Residuals are ['1.1', '-2', '2.95', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (3.7281, 1.7625, 1.9308)
- **B.** (1.7625, 3.7281, 1.9308)
- **C.** (1.7625, 1.9308, 3.7281)
- **D.** (1.3276, 3.7281, 1.7625)

**Correct Answer:** (1.7625, 3.7281, 1.9308)

**Explanation:** Average absolute error=1.7625, average squared error=3.7281, and its square root=1.9308.

---

## Question 11

**Question:** A training feature has fitted min=3, max=27; a value x=14 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.5833
- **B.** 0.4583
- **C.** 0.4074
- **D.** -0.5417

**Correct Answer:** 0.4583

**Explanation:** x'=(14-3)/(27-3)=0.4583. The range and minimum must both come from training data.

---

## Question 12

**Question:** For x=22, training mean=15, standard deviation=4, and range=14, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (0.5, 1.75)
- **B.** (5.5, 1.5714)
- **C.** (1.75, 0.5)
- **D.** (-1.75, -0.5)

**Correct Answer:** (1.75, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 1.75; mean normalization divides the same numerator by range: 0.5.

---

## Question 13

**Question:** For x=[0, 1, 2], y=['1.4', '3.4', '5.4'], theta_0=0.7, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 0.8033
- **B.** 1.6067
- **C.** 1.2675
- **D.** 1.2

**Correct Answer:** 0.8033

**Explanation:** Predictions are ['0.7', '2.2', '3.7']; SSE=4.82, so J=4.82/6=0.8033.

---

## Question 14

**Question:** Using x=[1, 2, 3], y=['2.2', '4.2', '7.2'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.4067, 1.1533)
- **B.** (0.8467, 0.5933)
- **C.** (1.1533, 1.1533)
- **D.** (1.1533, 1.4067)

**Correct Answer:** (1.1533, 1.4067)

**Explanation:** The mean residual is -1.5333 and the mean x-weighted residual is -4.0667; simultaneous subtraction gives (1.1533,1.4067).

---

## Question 15

**Question:** Residuals are ['1.2', '-2', '2.9', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (1.775, 3.7125, 1.9268)
- **B.** (3.7125, 1.775, 1.9268)
- **C.** (1.775, 1.9268, 3.7125)
- **D.** (1.3323, 3.7125, 1.775)

**Correct Answer:** (1.775, 3.7125, 1.9268)

**Explanation:** Average absolute error=1.775, average squared error=3.7125, and its square root=1.9268.

---

## Question 16

**Question:** A training feature has fitted min=2, max=28; a value x=16 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.6154
- **B.** 0.5
- **C.** -0.4615
- **D.** 0.5385

**Correct Answer:** 0.5385

**Explanation:** x'=(16-2)/(28-2)=0.5385. The range and minimum must both come from training data.

---

## Question 17

**Question:** For x=23, training mean=15.5, standard deviation=2, and range=15, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (0.5, 3.75)
- **B.** (3.75, 0.5)
- **C.** (11.5, 1.5333)
- **D.** (-3.75, -0.5)

**Correct Answer:** (3.75, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 3.75; mean normalization divides the same numerator by range: 0.5.

---

## Question 18

**Question:** For x=[0, 1, 2], y=['1.6', '3.6', '5.6'], theta_0=0.8, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 1.8567
- **B.** 1.3626
- **C.** 1.3
- **D.** 0.9283

**Correct Answer:** 0.9283

**Explanation:** Predictions are ['0.8', '2.3', '3.8']; SSE=5.57, so J=5.57/6=0.9283.

---

## Question 19

**Question:** Using x=[1, 2, 3], y=['2.3', '4.3', '7.3'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.4267, 1.1633)
- **B.** (1.1633, 1.4267)
- **C.** (0.8367, 0.5733)
- **D.** (1.1633, 1.1633)

**Correct Answer:** (1.1633, 1.4267)

**Explanation:** The mean residual is -1.6333 and the mean x-weighted residual is -4.2667; simultaneous subtraction gives (1.1633,1.4267).

---

## Question 20

**Question:** Residuals are ['1.3', '-2', '2.85', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (1.7875, 3.7031, 1.9244)
- **B.** (3.7031, 1.7875, 1.9244)
- **C.** (1.7875, 1.9244, 3.7031)
- **D.** (1.337, 3.7031, 1.7875)

**Correct Answer:** (1.7875, 3.7031, 1.9244)

**Explanation:** Average absolute error=1.7875, average squared error=3.7031, and its square root=1.9244.

---

## Question 21

**Question:** A training feature has fitted min=1, max=29; a value x=18 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.6429
- **B.** 0.5862
- **C.** -0.3929
- **D.** 0.6071

**Correct Answer:** 0.6071

**Explanation:** x'=(18-1)/(29-1)=0.6071. The range and minimum must both come from training data.

---

## Question 22

**Question:** For x=24, training mean=16, standard deviation=3, and range=16, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (0.5, 2.6667)
- **B.** (8, 1.5)
- **C.** (-2.6667, -0.5)
- **D.** (2.6667, 0.5)

**Correct Answer:** (2.6667, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 2.6667; mean normalization divides the same numerator by range: 0.5.

---

## Question 23

**Question:** For x=[0, 1, 2], y=['1.8', '3.8', '5.8'], theta_0=0.9, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 1.0633
- **B.** 2.1267
- **C.** 1.4583
- **D.** 1.4

**Correct Answer:** 1.0633

**Explanation:** Predictions are ['0.9', '2.4', '3.9']; SSE=6.38, so J=6.38/6=1.0633.

---

## Question 24

**Question:** Using x=[1, 2, 3], y=['2.4', '4.4', '7.4'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.4467, 1.1733)
- **B.** (0.8267, 0.5533)
- **C.** (1.1733, 1.1733)
- **D.** (1.1733, 1.4467)

**Correct Answer:** (1.1733, 1.4467)

**Explanation:** The mean residual is -1.7333 and the mean x-weighted residual is -4.4667; simultaneous subtraction gives (1.1733,1.4467).

---

## Question 25

**Question:** Residuals are ['1.4', '-2', '2.8', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (3.7, 1.8, 1.9235)
- **B.** (1.8, 1.9235, 3.7)
- **C.** (1.8, 3.7, 1.9235)
- **D.** (1.3416, 3.7, 1.8)

**Correct Answer:** (1.8, 3.7, 1.9235)

**Explanation:** Average absolute error=1.8, average squared error=3.7, and its square root=1.9235.

---

## Question 26

**Question:** A training feature has fitted min=0, max=30; a value x=20 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.8037
- **B.** 0.4737
- **C.** 0.9377
- **D.** 0.6667

**Correct Answer:** 0.6667

**Explanation:** x'=(20-0)/(30-0)=0.6667. The range and minimum must both come from training data.

---

## Question 27

**Question:** For x=25, training mean=16.5, standard deviation=4, and range=17, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (2.125, 0.5)
- **B.** (0.5, 2.125)
- **C.** (6.25, 1.4706)
- **D.** (-2.125, -0.5)

**Correct Answer:** (2.125, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 2.125; mean normalization divides the same numerator by range: 0.5.

---

## Question 28

**Question:** For x=[0, 1, 2], y=['2', '4', '6'], theta_0=1, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 2.4167
- **B.** 1.5546
- **C.** 1.5
- **D.** 1.2083

**Correct Answer:** 1.2083

**Explanation:** Predictions are ['1', '2.5', '4']; SSE=7.25, so J=7.25/6=1.2083.

---

## Question 29

**Question:** Using x=[1, 2, 3], y=['2.5', '4.5', '7.5'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.4667, 1.1833)
- **B.** (0.8167, 0.5333)
- **C.** (1.1833, 1.1833)
- **D.** (1.1833, 1.4667)

**Correct Answer:** (1.1833, 1.4667)

**Explanation:** The mean residual is -1.8333 and the mean x-weighted residual is -4.6667; simultaneous subtraction gives (1.1833,1.4667).

---

## Question 30

**Question:** Residuals are ['1.5', '-2', '2.75', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (3.7031, 1.8125, 1.9244)
- **B.** (1.8125, 3.7031, 1.9244)
- **C.** (1.8125, 1.9244, 3.7031)
- **D.** (1.3463, 3.7031, 1.8125)

**Correct Answer:** (1.8125, 3.7031, 1.9244)

**Explanation:** Average absolute error=1.8125, average squared error=3.7031, and its square root=1.9244.

---

## Question 31

**Question:** A training feature has fitted min=-1, max=31; a value x=22 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.6875
- **B.** 0.7419
- **C.** -0.2812
- **D.** 0.7188

**Correct Answer:** 0.7188

**Explanation:** x'=(22--1)/(31--1)=0.7188. The range and minimum must both come from training data.

---

## Question 32

**Question:** For x=26, training mean=17, standard deviation=2, and range=18, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (4.5, 0.5)
- **B.** (0.5, 4.5)
- **C.** (13, 1.4444)
- **D.** (-4.5, -0.5)

**Correct Answer:** (4.5, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 4.5; mean normalization divides the same numerator by range: 0.5.

---

## Question 33

**Question:** For x=[0, 1, 2], y=['2.2', '4.2', '6.2'], theta_0=1.1, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 1.3633
- **B.** 2.7267
- **C.** 1.6513
- **D.** 1.6

**Correct Answer:** 1.3633

**Explanation:** Predictions are ['1.1', '2.6', '4.1']; SSE=8.18, so J=8.18/6=1.3633.

---

## Question 34

**Question:** Using x=[1, 2, 3], y=['2.6', '4.6', '7.6'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.4867, 1.1933)
- **B.** (0.8067, 0.5133)
- **C.** (1.1933, 1.4867)
- **D.** (1.1933, 1.1933)

**Correct Answer:** (1.1933, 1.4867)

**Explanation:** The mean residual is -1.9333 and the mean x-weighted residual is -4.8667; simultaneous subtraction gives (1.1933,1.4867).

---

## Question 35

**Question:** Residuals are ['1.6', '-2', '2.7', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (1.825, 3.7125, 1.9268)
- **B.** (3.7125, 1.825, 1.9268)
- **C.** (1.825, 1.9268, 3.7125)
- **D.** (1.3509, 3.7125, 1.825)

**Correct Answer:** (1.825, 3.7125, 1.9268)

**Explanation:** Average absolute error=1.825, average squared error=3.7125, and its square root=1.9268.

---

## Question 36

**Question:** A training feature has fitted min=-2, max=32; a value x=24 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.7059
- **B.** 0.8125
- **C.** 0.7647
- **D.** -0.2353

**Correct Answer:** 0.7647

**Explanation:** x'=(24--2)/(32--2)=0.7647. The range and minimum must both come from training data.

---

## Question 37

**Question:** For x=27, training mean=17.5, standard deviation=3, and range=19, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (0.5, 3.1667)
- **B.** (9, 1.4211)
- **C.** (-3.1667, -0.5)
- **D.** (3.1667, 0.5)

**Correct Answer:** (3.1667, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 3.1667; mean normalization divides the same numerator by range: 0.5.

---

## Question 38

**Question:** For x=[0, 1, 2], y=['2.4', '4.4', '6.4'], theta_0=1.2, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 3.0567
- **B.** 1.7483
- **C.** 1.5283
- **D.** 1.7

**Correct Answer:** 1.5283

**Explanation:** Predictions are ['1.2', '2.7', '4.2']; SSE=9.17, so J=9.17/6=1.5283.

---

## Question 39

**Question:** Using x=[1, 2, 3], y=['2.7', '4.7', '7.7'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.5067, 1.2033)
- **B.** (1.2033, 1.5067)
- **C.** (0.7967, 0.4933)
- **D.** (1.2033, 1.2033)

**Correct Answer:** (1.2033, 1.5067)

**Explanation:** The mean residual is -2.0333 and the mean x-weighted residual is -5.0667; simultaneous subtraction gives (1.2033,1.5067).

---

## Question 40

**Question:** Residuals are ['1.7', '-2', '2.65', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (3.7281, 1.8375, 1.9308)
- **B.** (1.8375, 1.9308, 3.7281)
- **C.** (1.8375, 3.7281, 1.9308)
- **D.** (1.3555, 3.7281, 1.8375)

**Correct Answer:** (1.8375, 3.7281, 1.9308)

**Explanation:** Average absolute error=1.8375, average squared error=3.7281, and its square root=1.9308.

---

## Question 41

**Question:** A training feature has fitted min=-3, max=33; a value x=26 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.7222
- **B.** 0.8788
- **C.** 0.8056
- **D.** -0.1944

**Correct Answer:** 0.8056

**Explanation:** x'=(26--3)/(33--3)=0.8056. The range and minimum must both come from training data.

---

## Question 42

**Question:** For x=28, training mean=18, standard deviation=4, and range=20, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (0.5, 2.5)
- **B.** (7, 1.4)
- **C.** (-2.5, -0.5)
- **D.** (2.5, 0.5)

**Correct Answer:** (2.5, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 2.5; mean normalization divides the same numerator by range: 0.5.

---

## Question 43

**Question:** For x=[0, 1, 2], y=['2.6', '4.6', '6.6'], theta_0=1.3, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 1.7033
- **B.** 3.4067
- **C.** 1.8457
- **D.** 1.8

**Correct Answer:** 1.7033

**Explanation:** Predictions are ['1.3', '2.8', '4.3']; SSE=10.22, so J=10.22/6=1.7033.

---

## Question 44

**Question:** Using x=[1, 2, 3], y=['2.8', '4.8', '7.8'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.5267, 1.2133)
- **B.** (0.7867, 0.4733)
- **C.** (1.2133, 1.2133)
- **D.** (1.2133, 1.5267)

**Correct Answer:** (1.2133, 1.5267)

**Explanation:** The mean residual is -2.1333 and the mean x-weighted residual is -5.2667; simultaneous subtraction gives (1.2133,1.5267).

---

## Question 45

**Question:** Residuals are ['1.8', '-2', '2.6', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (3.75, 1.85, 1.9365)
- **B.** (1.85, 1.9365, 3.75)
- **C.** (1.3601, 3.75, 1.85)
- **D.** (1.85, 3.75, 1.9365)

**Correct Answer:** (1.85, 3.75, 1.9365)

**Explanation:** Average absolute error=1.85, average squared error=3.75, and its square root=1.9365.

---

## Question 46

**Question:** A training feature has fitted min=-4, max=34; a value x=28 is transformed by min-max scaling. What is x'?

**Choices:**
- **A.** 0.7368
- **B.** 0.9412
- **C.** -0.1579
- **D.** 0.8421

**Correct Answer:** 0.8421

**Explanation:** x'=(28--4)/(34--4)=0.8421. The range and minimum must both come from training data.

---

## Question 47

**Question:** For x=29, training mean=18.5, standard deviation=2, and range=21, what are (standardized z, mean-normalized value)?

**Choices:**
- **A.** (0.5, 5.25)
- **B.** (14.5, 1.381)
- **C.** (5.25, 0.5)
- **D.** (-5.25, -0.5)

**Correct Answer:** (5.25, 0.5)

**Explanation:** Standardization divides x-mu by sigma: 5.25; mean normalization divides the same numerator by range: 0.5.

---

## Question 48

**Question:** For x=[0, 1, 2], y=['2.8', '4.8', '6.8'], theta_0=1.4, theta_1=1.5, compute J=(1/(2m)) sum(h-y)^2.

**Choices:**
- **A.** 3.7767
- **B.** 1.9434
- **C.** 1.9
- **D.** 1.8883

**Correct Answer:** 1.8883

**Explanation:** Predictions are ['1.4', '2.9', '4.4']; SSE=11.33, so J=11.33/6=1.8883.

---

## Question 49

**Question:** Using x=[1, 2, 3], y=['2.9', '4.9', '7.9'], theta=(1,1), alpha=0.1, perform one simultaneous linear-regression gradient step. What is new theta?

**Choices:**
- **A.** (1.2233, 1.5467)
- **B.** (1.5467, 1.2233)
- **C.** (0.7767, 0.4533)
- **D.** (1.2233, 1.2233)

**Correct Answer:** (1.2233, 1.5467)

**Explanation:** The mean residual is -2.2333 and the mean x-weighted residual is -5.4667; simultaneous subtraction gives (1.2233,1.5467).

---

## Question 50

**Question:** Residuals are ['1.9', '-2', '2.55', '-1']. What ordered triple (MAE, MSE, RMSE) is correct?

**Choices:**
- **A.** (3.7781, 1.8625, 1.9437)
- **B.** (1.8625, 3.7781, 1.9437)
- **C.** (1.8625, 1.9437, 3.7781)
- **D.** (1.3647, 3.7781, 1.8625)

**Correct Answer:** (1.8625, 3.7781, 1.9437)

**Explanation:** Average absolute error=1.8625, average squared error=3.7781, and its square root=1.9437.

---

## Question 51

**Question:** A preprocessing-and-regression pipeline is audited. Case 1: Which conclusion is the single most defensible?

**Choices:**
- **A.** Test data should determine the final training mean and range.
- **B.** Scaling parameters should be learned from training data and then applied unchanged to test data.
- **C.** Each test row should be standardized using only its own values.
- **D.** Scaling must occur after predictions have already been evaluated., under both the training and evaluation conditions stated

**Correct Answer:** Scaling parameters should be learned from training data and then applied unchanged to test data.

**Explanation:** Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 52

**Question:** A preprocessing-and-regression pipeline is audited. Case 2: Which conclusion is the single most defensible?

**Choices:**
- **A.** Label encoding guarantees equal geometric distance between all categories., even when the other quantities in the formula are fixed
- **B.** One-hot encoding avoids imposing an artificial order on nominal categories.
- **C.** One-hot encoding converts every numerical feature into a target.
- **D.** Dummy variables are used only when categories have a natural ranking.

**Correct Answer:** One-hot encoding avoids imposing an artificial order on nominal categories.

**Explanation:** Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 53

**Question:** A preprocessing-and-regression pipeline is audited. Case 3: Which conclusion is the single most defensible?

**Choices:**
- **A.** The test set should select the learning rate after every update.
- **B.** The validation set tunes choices; the test set estimates final performance.
- **C.** The validation set replaces the training set in gradient descent., as a consequence that holds for every permitted input
- **D.** Training labels must be hidden from the learning algorithm.

**Correct Answer:** The validation set tunes choices; the test set estimates final performance.

**Explanation:** Separating tuning from final evaluation limits optimistic bias.

---

## Question 54

**Question:** A preprocessing-and-regression pipeline is audited. Case 4: Which conclusion is the single most defensible?

**Choices:**
- **A.** Theta_1 must use the newly updated theta_0 in the same iteration., without needing any additional modeling assumption
- **B.** Only the intercept is updated when multiple features exist.
- **C.** The learning rate is recomputed as the current MSE.
- **D.** The gradient-descent parameters must be updated from the same pre-update parameter state.

**Correct Answer:** The gradient-descent parameters must be updated from the same pre-update parameter state.

**Explanation:** A gradient step is simultaneous across parameters.

---

## Question 55

**Question:** A preprocessing-and-regression pipeline is audited. Case 5: Which conclusion is the single most defensible?

**Choices:**
- **A.** A very large learning rate always reaches the global minimum in one step.
- **B.** A very small learning rate necessarily changes the objective function.
- **C.** A very large learning rate can overshoot and make the cost diverge.
- **D.** Learning rate controls the number of examples rather than step size.

**Correct Answer:** A very large learning rate can overshoot and make the cost diverge.

**Explanation:** Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 56

**Question:** A preprocessing-and-regression pipeline is audited. Case 6: Which conclusion is the single most defensible?

**Choices:**
- **A.** RMSE is the square of MAE and has squared target units., even when the other quantities in the formula are fixed
- **B.** MSE equals the mean of unsquared absolute residuals.
- **C.** RMSE equals the square root of MSE and retains the target's units.
- **D.** MAE disproportionately squares the largest residuals.

**Correct Answer:** RMSE equals the square root of MSE and retains the target's units.

**Explanation:** RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 57

**Question:** A preprocessing-and-regression pipeline is audited. Case 7: Which conclusion is the single most defensible?

**Choices:**
- **A.** Mode imputation is the only valid method for every numerical feature., as a consequence that holds for every permitted input
- **B.** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.
- **C.** Mean imputation always reconstructs the missing true value exactly.
- **D.** Imputation should use the unseen test labels to reduce error.

**Correct Answer:** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.

**Explanation:** The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 58

**Question:** A preprocessing-and-regression pipeline is audited. Case 8: Which conclusion is the single most defensible?

**Choices:**
- **A.** The normal equation is an iterative categorical encoder.
- **B.** The normal equation is a direct linear-regression solution when its inverse expression is usable.
- **C.** It changes a regression target into a class label.
- **D.** It requires selecting a learning rate for every matrix multiplication., without needing any additional modeling assumption

**Correct Answer:** The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Explanation:** The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 59

**Question:** A preprocessing-and-regression pipeline is audited. Case 9: Which conclusion is the single most defensible?

**Choices:**
- **A.** m counts only nonzero coefficients in theta.
- **B.** Each dataset row is one training example, so m counts rows rather than features.
- **C.** m is the number of categories after encoding.
- **D.** m equals the number of gradient-descent iterations., under both the training and evaluation conditions stated

**Correct Answer:** Each dataset row is one training example, so m counts rows rather than features.

**Explanation:** The cost denominator uses the number of training examples.

---

## Question 60

**Question:** A preprocessing-and-regression pipeline is audited. Case 10: Which conclusion is the single most defensible?

**Choices:**
- **A.** The result is automatically one because numerator and denominator match., even when the other quantities in the formula are fixed
- **B.** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.
- **C.** The feature becomes a categorical target by definition.
- **D.** Standardization must then use the test-set maximum instead.

**Correct Answer:** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Explanation:** A constant feature gives a zero range, causing division by zero in the displayed formula.

---

## Question 61

**Question:** A preprocessing-and-regression pipeline is audited. Case 11: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Test data should determine the final training mean and range.
- **B.** Each test row should be standardized using only its own values.
- **C.** Scaling parameters should be learned from training data and then applied unchanged to test data.
- **D.** Scaling must occur after predictions have already been evaluated., as a consequence that holds for every permitted input

**Correct Answer:** Scaling parameters should be learned from training data and then applied unchanged to test data.

**Explanation:** Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 62

**Question:** A preprocessing-and-regression pipeline is audited. Case 12: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Label encoding guarantees equal geometric distance between all categories., without needing any additional modeling assumption
- **B.** One-hot encoding converts every numerical feature into a target.
- **C.** One-hot encoding avoids imposing an artificial order on nominal categories.
- **D.** Dummy variables are used only when categories have a natural ranking.

**Correct Answer:** One-hot encoding avoids imposing an artificial order on nominal categories.

**Explanation:** Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 63

**Question:** A preprocessing-and-regression pipeline is audited. Case 13: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The validation set tunes choices; the test set estimates final performance.
- **B.** The test set should select the learning rate after every update.
- **C.** The validation set replaces the training set in gradient descent., under both the training and evaluation conditions stated
- **D.** Training labels must be hidden from the learning algorithm.

**Correct Answer:** The validation set tunes choices; the test set estimates final performance.

**Explanation:** Separating tuning from final evaluation limits optimistic bias.

---

## Question 64

**Question:** A preprocessing-and-regression pipeline is audited. Case 14: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Theta_1 must use the newly updated theta_0 in the same iteration., even when the other quantities in the formula are fixed
- **B.** Only the intercept is updated when multiple features exist.
- **C.** The learning rate is recomputed as the current MSE.
- **D.** The gradient-descent parameters must be updated from the same pre-update parameter state.

**Correct Answer:** The gradient-descent parameters must be updated from the same pre-update parameter state.

**Explanation:** A gradient step is simultaneous across parameters.

---

## Question 65

**Question:** A preprocessing-and-regression pipeline is audited. Case 15: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A very large learning rate always reaches the global minimum in one step.
- **B.** A very small learning rate necessarily changes the objective function.
- **C.** A very large learning rate can overshoot and make the cost diverge.
- **D.** Learning rate controls the number of examples rather than step size.

**Correct Answer:** A very large learning rate can overshoot and make the cost diverge.

**Explanation:** Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 66

**Question:** A preprocessing-and-regression pipeline is audited. Case 16: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** RMSE is the square of MAE and has squared target units., without needing any additional modeling assumption
- **B.** MSE equals the mean of unsquared absolute residuals.
- **C.** RMSE equals the square root of MSE and retains the target's units.
- **D.** MAE disproportionately squares the largest residuals.

**Correct Answer:** RMSE equals the square root of MSE and retains the target's units.

**Explanation:** RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 67

**Question:** A preprocessing-and-regression pipeline is audited. Case 17: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Mode imputation is the only valid method for every numerical feature., under both the training and evaluation conditions stated
- **B.** Mean imputation always reconstructs the missing true value exactly.
- **C.** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.
- **D.** Imputation should use the unseen test labels to reduce error.

**Correct Answer:** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.

**Explanation:** The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 68

**Question:** A preprocessing-and-regression pipeline is audited. Case 18: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The normal equation is an iterative categorical encoder.
- **B.** The normal equation is a direct linear-regression solution when its inverse expression is usable.
- **C.** It changes a regression target into a class label.
- **D.** It requires selecting a learning rate for every matrix multiplication., even when the other quantities in the formula are fixed

**Correct Answer:** The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Explanation:** The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 69

**Question:** A preprocessing-and-regression pipeline is audited. Case 19: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** m counts only nonzero coefficients in theta.
- **B.** m is the number of categories after encoding.
- **C.** Each dataset row is one training example, so m counts rows rather than features.
- **D.** m equals the number of gradient-descent iterations., as a consequence that holds for every permitted input

**Correct Answer:** Each dataset row is one training example, so m counts rows rather than features.

**Explanation:** The cost denominator uses the number of training examples.

---

## Question 70

**Question:** A preprocessing-and-regression pipeline is audited. Case 20: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The result is automatically one because numerator and denominator match., without needing any additional modeling assumption
- **B.** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.
- **C.** The feature becomes a categorical target by definition.
- **D.** Standardization must then use the test-set maximum instead.

**Correct Answer:** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Explanation:** A constant feature gives a zero range, causing division by zero in the displayed formula.

---

## Question 71

**Question:** A preprocessing-and-regression pipeline is audited. Case 21: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Test data should determine the final training mean and range.
- **B.** Each test row should be standardized using only its own values.
- **C.** Scaling parameters should be learned from training data and then applied unchanged to test data.
- **D.** Scaling must occur after predictions have already been evaluated., under both the training and evaluation conditions stated

**Correct Answer:** Scaling parameters should be learned from training data and then applied unchanged to test data.

**Explanation:** Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 72

**Question:** A preprocessing-and-regression pipeline is audited. Case 22: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** One-hot encoding avoids imposing an artificial order on nominal categories.
- **B.** Label encoding guarantees equal geometric distance between all categories., even when the other quantities in the formula are fixed
- **C.** One-hot encoding converts every numerical feature into a target.
- **D.** Dummy variables are used only when categories have a natural ranking.

**Correct Answer:** One-hot encoding avoids imposing an artificial order on nominal categories.

**Explanation:** Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 73

**Question:** A preprocessing-and-regression pipeline is audited. Case 23: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The test set should select the learning rate after every update.
- **B.** The validation set tunes choices; the test set estimates final performance.
- **C.** The validation set replaces the training set in gradient descent., as a consequence that holds for every permitted input
- **D.** Training labels must be hidden from the learning algorithm.

**Correct Answer:** The validation set tunes choices; the test set estimates final performance.

**Explanation:** Separating tuning from final evaluation limits optimistic bias.

---

## Question 74

**Question:** A preprocessing-and-regression pipeline is audited. Case 24: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The gradient-descent parameters must be updated from the same pre-update parameter state.
- **B.** Theta_1 must use the newly updated theta_0 in the same iteration., without needing any additional modeling assumption
- **C.** Only the intercept is updated when multiple features exist.
- **D.** The learning rate is recomputed as the current MSE.

**Correct Answer:** The gradient-descent parameters must be updated from the same pre-update parameter state.

**Explanation:** A gradient step is simultaneous across parameters.

---

## Question 75

**Question:** A preprocessing-and-regression pipeline is audited. Case 25: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A very large learning rate can overshoot and make the cost diverge.
- **B.** A very large learning rate always reaches the global minimum in one step.
- **C.** A very small learning rate necessarily changes the objective function.
- **D.** Learning rate controls the number of examples rather than step size.

**Correct Answer:** A very large learning rate can overshoot and make the cost diverge.

**Explanation:** Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 76

**Question:** A preprocessing-and-regression pipeline is audited. Case 26: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** RMSE is the square of MAE and has squared target units., even when the other quantities in the formula are fixed
- **B.** MSE equals the mean of unsquared absolute residuals.
- **C.** RMSE equals the square root of MSE and retains the target's units.
- **D.** MAE disproportionately squares the largest residuals.

**Correct Answer:** RMSE equals the square root of MSE and retains the target's units.

**Explanation:** RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 77

**Question:** A preprocessing-and-regression pipeline is audited. Case 27: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.
- **B.** Mode imputation is the only valid method for every numerical feature., as a consequence that holds for every permitted input
- **C.** Mean imputation always reconstructs the missing true value exactly.
- **D.** Imputation should use the unseen test labels to reduce error.

**Correct Answer:** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.

**Explanation:** The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 78

**Question:** A preprocessing-and-regression pipeline is audited. Case 28: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The normal equation is an iterative categorical encoder.
- **B.** The normal equation is a direct linear-regression solution when its inverse expression is usable.
- **C.** It changes a regression target into a class label.
- **D.** It requires selecting a learning rate for every matrix multiplication., without needing any additional modeling assumption

**Correct Answer:** The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Explanation:** The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 79

**Question:** A preprocessing-and-regression pipeline is audited. Case 29: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** m counts only nonzero coefficients in theta.
- **B.** m is the number of categories after encoding.
- **C.** Each dataset row is one training example, so m counts rows rather than features.
- **D.** m equals the number of gradient-descent iterations., under both the training and evaluation conditions stated

**Correct Answer:** Each dataset row is one training example, so m counts rows rather than features.

**Explanation:** The cost denominator uses the number of training examples.

---

## Question 80

**Question:** A preprocessing-and-regression pipeline is audited. Case 30: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The result is automatically one because numerator and denominator match., even when the other quantities in the formula are fixed
- **B.** The feature becomes a categorical target by definition.
- **C.** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.
- **D.** Standardization must then use the test-set maximum instead.

**Correct Answer:** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Explanation:** A constant feature gives a zero range, causing division by zero in the displayed formula.

---

## Question 81

**Question:** A preprocessing-and-regression pipeline is audited. Case 31: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Scaling parameters should be learned from training data and then applied unchanged to test data.
- **B.** Test data should determine the final training mean and range.
- **C.** Each test row should be standardized using only its own values.
- **D.** Scaling must occur after predictions have already been evaluated., as a consequence that holds for every permitted input

**Correct Answer:** Scaling parameters should be learned from training data and then applied unchanged to test data.

**Explanation:** Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 82

**Question:** A preprocessing-and-regression pipeline is audited. Case 32: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** One-hot encoding avoids imposing an artificial order on nominal categories.
- **B.** Label encoding guarantees equal geometric distance between all categories., without needing any additional modeling assumption
- **C.** One-hot encoding converts every numerical feature into a target.
- **D.** Dummy variables are used only when categories have a natural ranking.

**Correct Answer:** One-hot encoding avoids imposing an artificial order on nominal categories.

**Explanation:** Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 83

**Question:** A preprocessing-and-regression pipeline is audited. Case 33: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The test set should select the learning rate after every update.
- **B.** The validation set replaces the training set in gradient descent., under both the training and evaluation conditions stated
- **C.** Training labels must be hidden from the learning algorithm.
- **D.** The validation set tunes choices; the test set estimates final performance.

**Correct Answer:** The validation set tunes choices; the test set estimates final performance.

**Explanation:** Separating tuning from final evaluation limits optimistic bias.

---

## Question 84

**Question:** A preprocessing-and-regression pipeline is audited. Case 34: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Theta_1 must use the newly updated theta_0 in the same iteration., even when the other quantities in the formula are fixed
- **B.** Only the intercept is updated when multiple features exist.
- **C.** The gradient-descent parameters must be updated from the same pre-update parameter state.
- **D.** The learning rate is recomputed as the current MSE.

**Correct Answer:** The gradient-descent parameters must be updated from the same pre-update parameter state.

**Explanation:** A gradient step is simultaneous across parameters.

---

## Question 85

**Question:** A preprocessing-and-regression pipeline is audited. Case 35: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A very large learning rate always reaches the global minimum in one step.
- **B.** A very small learning rate necessarily changes the objective function.
- **C.** Learning rate controls the number of examples rather than step size.
- **D.** A very large learning rate can overshoot and make the cost diverge.

**Correct Answer:** A very large learning rate can overshoot and make the cost diverge.

**Explanation:** Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 86

**Question:** A preprocessing-and-regression pipeline is audited. Case 36: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** RMSE is the square of MAE and has squared target units., without needing any additional modeling assumption
- **B.** RMSE equals the square root of MSE and retains the target's units.
- **C.** MSE equals the mean of unsquared absolute residuals.
- **D.** MAE disproportionately squares the largest residuals.

**Correct Answer:** RMSE equals the square root of MSE and retains the target's units.

**Explanation:** RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 87

**Question:** A preprocessing-and-regression pipeline is audited. Case 37: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Mode imputation is the only valid method for every numerical feature., under both the training and evaluation conditions stated
- **B.** Mean imputation always reconstructs the missing true value exactly.
- **C.** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.
- **D.** Imputation should use the unseen test labels to reduce error.

**Correct Answer:** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.

**Explanation:** The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 88

**Question:** A preprocessing-and-regression pipeline is audited. Case 38: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The normal equation is a direct linear-regression solution when its inverse expression is usable.
- **B.** The normal equation is an iterative categorical encoder.
- **C.** It changes a regression target into a class label.
- **D.** It requires selecting a learning rate for every matrix multiplication., even when the other quantities in the formula are fixed

**Correct Answer:** The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Explanation:** The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 89

**Question:** A preprocessing-and-regression pipeline is audited. Case 39: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** m counts only nonzero coefficients in theta.
- **B.** m is the number of categories after encoding.
- **C.** Each dataset row is one training example, so m counts rows rather than features.
- **D.** m equals the number of gradient-descent iterations., as a consequence that holds for every permitted input

**Correct Answer:** Each dataset row is one training example, so m counts rows rather than features.

**Explanation:** The cost denominator uses the number of training examples.

---

## Question 90

**Question:** A preprocessing-and-regression pipeline is audited. Case 40: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The result is automatically one because numerator and denominator match., without needing any additional modeling assumption
- **B.** The feature becomes a categorical target by definition.
- **C.** Standardization must then use the test-set maximum instead.
- **D.** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Correct Answer:** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Explanation:** A constant feature gives a zero range, causing division by zero in the displayed formula.

---

## Question 91

**Question:** A preprocessing-and-regression pipeline is audited. Case 41: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Test data should determine the final training mean and range.
- **B.** Each test row should be standardized using only its own values.
- **C.** Scaling must occur after predictions have already been evaluated., under both the training and evaluation conditions stated
- **D.** Scaling parameters should be learned from training data and then applied unchanged to test data.

**Correct Answer:** Scaling parameters should be learned from training data and then applied unchanged to test data.

**Explanation:** Using test statistics during preprocessing leaks evaluation information into training.

---

## Question 92

**Question:** A preprocessing-and-regression pipeline is audited. Case 42: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** One-hot encoding avoids imposing an artificial order on nominal categories.
- **B.** Label encoding guarantees equal geometric distance between all categories., even when the other quantities in the formula are fixed
- **C.** One-hot encoding converts every numerical feature into a target.
- **D.** Dummy variables are used only when categories have a natural ranking.

**Correct Answer:** One-hot encoding avoids imposing an artificial order on nominal categories.

**Explanation:** Binary indicator columns represent nominal membership without ordinal integers.

---

## Question 93

**Question:** A preprocessing-and-regression pipeline is audited. Case 43: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The validation set tunes choices; the test set estimates final performance.
- **B.** The test set should select the learning rate after every update.
- **C.** The validation set replaces the training set in gradient descent., as a consequence that holds for every permitted input
- **D.** Training labels must be hidden from the learning algorithm.

**Correct Answer:** The validation set tunes choices; the test set estimates final performance.

**Explanation:** Separating tuning from final evaluation limits optimistic bias.

---

## Question 94

**Question:** A preprocessing-and-regression pipeline is audited. Case 44: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Theta_1 must use the newly updated theta_0 in the same iteration., without needing any additional modeling assumption
- **B.** The gradient-descent parameters must be updated from the same pre-update parameter state.
- **C.** Only the intercept is updated when multiple features exist.
- **D.** The learning rate is recomputed as the current MSE.

**Correct Answer:** The gradient-descent parameters must be updated from the same pre-update parameter state.

**Explanation:** A gradient step is simultaneous across parameters.

---

## Question 95

**Question:** A preprocessing-and-regression pipeline is audited. Case 45: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A very large learning rate can overshoot and make the cost diverge.
- **B.** A very large learning rate always reaches the global minimum in one step.
- **C.** A very small learning rate necessarily changes the objective function.
- **D.** Learning rate controls the number of examples rather than step size.

**Correct Answer:** A very large learning rate can overshoot and make the cost diverge.

**Explanation:** Alpha scales the update; excessive steps can oscillate or diverge.

---

## Question 96

**Question:** A preprocessing-and-regression pipeline is audited. Case 46: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** RMSE is the square of MAE and has squared target units., even when the other quantities in the formula are fixed
- **B.** RMSE equals the square root of MSE and retains the target's units.
- **C.** MSE equals the mean of unsquared absolute residuals.
- **D.** MAE disproportionately squares the largest residuals.

**Correct Answer:** RMSE equals the square root of MSE and retains the target's units.

**Explanation:** RMSE reverses the squaring in MSE at the aggregate level.

---

## Question 97

**Question:** A preprocessing-and-regression pipeline is audited. Case 47: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Mode imputation is the only valid method for every numerical feature., as a consequence that holds for every permitted input
- **B.** Mean imputation always reconstructs the missing true value exactly.
- **C.** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.
- **D.** Imputation should use the unseen test labels to reduce error.

**Correct Answer:** Median imputation can be less sensitive than mean imputation to extreme numerical outliers.

**Explanation:** The median is robust to extreme magnitude, though imputation remains an approximation.

---

## Question 98

**Question:** A preprocessing-and-regression pipeline is audited. Case 48: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The normal equation is an iterative categorical encoder.
- **B.** It changes a regression target into a class label.
- **C.** It requires selecting a learning rate for every matrix multiplication., without needing any additional modeling assumption
- **D.** The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Correct Answer:** The normal equation is a direct linear-regression solution when its inverse expression is usable.

**Explanation:** The stated formula computes theta directly rather than by iterative gradient steps.

---

## Question 99

**Question:** A preprocessing-and-regression pipeline is audited. Case 49: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Each dataset row is one training example, so m counts rows rather than features.
- **B.** m counts only nonzero coefficients in theta.
- **C.** m is the number of categories after encoding.
- **D.** m equals the number of gradient-descent iterations., under both the training and evaluation conditions stated

**Correct Answer:** Each dataset row is one training example, so m counts rows rather than features.

**Explanation:** The cost denominator uses the number of training examples.

---

## Question 100

**Question:** A preprocessing-and-regression pipeline is audited. Case 50: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The result is automatically one because numerator and denominator match., even when the other quantities in the formula are fixed
- **B.** The feature becomes a categorical target by definition.
- **C.** Standardization must then use the test-set maximum instead.
- **D.** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Correct Answer:** Min-max scaling is undefined when the fitted maximum equals the fitted minimum unless the constant feature is handled specially.

**Explanation:** A constant feature gives a zero range, causing division by zero in the displayed formula.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Distractors are designed around plausible definition, sign, denominator, update-order, and rounding errors.
