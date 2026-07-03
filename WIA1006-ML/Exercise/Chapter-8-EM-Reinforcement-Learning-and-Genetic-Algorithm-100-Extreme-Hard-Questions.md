# Chapter 8: EM, Reinforcement Learning, and Genetic Algorithm: 100 Extreme-Hard Questions

> Topics: EM responsibilities and updates, RL returns and Q-learning, plus GA fitness, crossover, and mutation. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.12', '0.18', '0.1']. What responsibility vector follows?

**Choices:**
- **A.** ['0.12', '0.18', '0.1']
- **B.** ['0.3', '0.45', '0.25']
- **C.** ['0.04', '0.06', '0.0333']
- **D.** ['0.7', '0.55', '0.75']

**Correct Answer:** ['0.3', '0.45', '0.25']

**Explanation:** Divide every term by their sum 0.4, giving responsibilities ['0.3', '0.45', '0.25'], which sum to one.

---

## Question 2

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.2', '0.5', '0.8']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (3, 2.3333, 3.5556, 1.5)
- **B.** (1.5, 5, 2.3704, 0.5)
- **C.** (0.5, 3.3333, 3.5556, 1.5)
- **D.** (1.5, 3.3333, 3.5556, 0.5)

**Correct Answer:** (1.5, 3.3333, 3.5556, 0.5)

**Explanation:** N_k=1.5; weighted mean=3.3333; weighted variance=3.5556; pi_k=N_k/3=0.5.

---

## Question 3

**Question:** Future rewards are ['2', '-1', '4', '1'] and gamma=0.5. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6
- **B.** 1.3125
- **C.** 2.625
- **D.** 4

**Correct Answer:** 2.625

**Explanation:** G_t=2(0.5^0)+-1(0.5^1)+4(0.5^2)+1(0.5^3)=2.625.

---

## Question 4

**Question:** Q(s,a)=1, alpha=0.2, r=2, gamma=0.8, and max Q(s',a')=3. What is the updated Q(s,a)?

**Choices:**
- **A.** 1.68
- **B.** 4.4
- **C.** 1.2
- **D.** 0.32

**Correct Answer:** 1.68

**Explanation:** TD target=2+0.8(3)=4.4; update gives 1+0.2(4.4-1)=1.68.

---

## Question 5

**Question:** A chromosome scores 20 in a population averaging 14. Parents 110101 and 001011 cross after bit 2. What are (relative fitness, children)?

**Choices:**
- **A.** (0.7, 111011 and 000101)
- **B.** (1.4286, 110101 and 001011)
- **C.** (6, 000101 and 111011)
- **D.** (1.4286, 111011 and 000101)

**Correct Answer:** (1.4286, 111011 and 000101)

**Explanation:** Relative fitness=20/14=1.4286; exchange suffixes after position 2 to obtain 111011 and 000101.

---

## Question 6

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.13', '0.175', '0.102']. What responsibility vector follows?

**Choices:**
- **A.** ['0.13', '0.175', '0.102']
- **B.** ['0.0433', '0.0583', '0.034']
- **C.** ['0.6806', '0.57', '0.7494']
- **D.** ['0.3194', '0.43', '0.2506']

**Correct Answer:** ['0.3194', '0.43', '0.2506']

**Explanation:** Divide every term by their sum 0.407, giving responsibilities ['0.3194', '0.43', '0.2506'], which sum to one.

---

## Question 7

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.22', '0.5', '0.79']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (3, 2.3333, 3.6577, 1.51)
- **B.** (1.51, 4.95, 2.4223, 0.5033)
- **C.** (1.51, 3.2781, 3.6577, 0.5033)
- **D.** (0.5033, 3.2781, 3.6577, 1.51)

**Correct Answer:** (1.51, 3.2781, 3.6577, 0.5033)

**Explanation:** N_k=1.51; weighted mean=3.2781; weighted variance=3.6577; pi_k=N_k/3=0.5033.

---

## Question 8

**Question:** Future rewards are ['2.1', '-1', '4', '1'] and gamma=0.53. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6.1
- **B.** 1.5065
- **C.** 2.8425
- **D.** 4.22

**Correct Answer:** 2.8425

**Explanation:** G_t=2.1(0.53^0)+-1(0.53^1)+4(0.53^2)+1(0.53^3)=2.8425.

---

## Question 9

**Question:** Q(s,a)=1.1, alpha=0.2, r=1.9, gamma=0.8, and max Q(s',a')=3.05. What is the updated Q(s,a)?

**Choices:**
- **A.** 4.34
- **B.** 1.26
- **C.** 1.748
- **D.** 0.452

**Correct Answer:** 1.748

**Explanation:** TD target=1.9+0.8(3.05)=4.34; update gives 1.1+0.2(4.34-1.1)=1.748.

---

## Question 10

**Question:** A chromosome scores 21 in a population averaging 14.5. Parents 110101 and 001011 cross after bit 3. What are (relative fitness, children)?

**Choices:**
- **A.** (0.6905, 110011 and 001101)
- **B.** (1.4483, 110101 and 001011)
- **C.** (1.4483, 110011 and 001101)
- **D.** (6.5, 001101 and 110011)

**Correct Answer:** (1.4483, 110011 and 001101)

**Explanation:** Relative fitness=21/14.5=1.4483; exchange suffixes after position 3 to obtain 110011 and 001101.

---

## Question 11

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.14', '0.17', '0.104']. What responsibility vector follows?

**Choices:**
- **A.** ['0.14', '0.17', '0.104']
- **B.** ['0.3382', '0.4106', '0.2512']
- **C.** ['0.0467', '0.0567', '0.0347']
- **D.** ['0.6618', '0.5894', '0.7488']

**Correct Answer:** ['0.3382', '0.4106', '0.2512']

**Explanation:** Divide every term by their sum 0.414, giving responsibilities ['0.3382', '0.4106', '0.2512'], which sum to one.

---

## Question 12

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.24', '0.5', '0.78']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (1.52, 3.2237, 3.7526, 0.5067)
- **B.** (3, 2.3333, 3.7526, 1.52)
- **C.** (1.52, 4.9, 2.4688, 0.5067)
- **D.** (0.5067, 3.2237, 3.7526, 1.52)

**Correct Answer:** (1.52, 3.2237, 3.7526, 0.5067)

**Explanation:** N_k=1.52; weighted mean=3.2237; weighted variance=3.7526; pi_k=N_k/3=0.5067.

---

## Question 13

**Question:** Future rewards are ['2.2', '-1', '4', '1'] and gamma=0.56. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6.2
- **B.** 1.7192
- **C.** 3.07
- **D.** 4.44

**Correct Answer:** 3.07

**Explanation:** G_t=2.2(0.56^0)+-1(0.56^1)+4(0.56^2)+1(0.56^3)=3.07.

---

## Question 14

**Question:** Q(s,a)=1.2, alpha=0.2, r=1.8, gamma=0.8, and max Q(s',a')=3.1. What is the updated Q(s,a)?

**Choices:**
- **A.** 4.28
- **B.** 1.816
- **C.** 1.32
- **D.** 0.584

**Correct Answer:** 1.816

**Explanation:** TD target=1.8+0.8(3.1)=4.28; update gives 1.2+0.2(4.28-1.2)=1.816.

---

## Question 15

**Question:** A chromosome scores 22 in a population averaging 15. Parents 110101 and 001011 cross after bit 4. What are (relative fitness, children)?

**Choices:**
- **A.** (0.6818, 110111 and 001001)
- **B.** (1.4667, 110111 and 001001)
- **C.** (1.4667, 110101 and 001011)
- **D.** (7, 001001 and 110111)

**Correct Answer:** (1.4667, 110111 and 001001)

**Explanation:** Relative fitness=22/15=1.4667; exchange suffixes after position 4 to obtain 110111 and 001001.

---

## Question 16

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.15', '0.165', '0.106']. What responsibility vector follows?

**Choices:**
- **A.** ['0.15', '0.165', '0.106']
- **B.** ['0.05', '0.055', '0.0353']
- **C.** ['0.6437', '0.6081', '0.7482']
- **D.** ['0.3563', '0.3919', '0.2518']

**Correct Answer:** ['0.3563', '0.3919', '0.2518']

**Explanation:** Divide every term by their sum 0.421, giving responsibilities ['0.3563', '0.3919', '0.2518'], which sum to one.

---

## Question 17

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.26', '0.5', '0.77']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (3, 2.3333, 3.8404, 1.53)
- **B.** (1.53, 4.85, 2.5101, 0.51)
- **C.** (0.51, 3.1699, 3.8404, 1.53)
- **D.** (1.53, 3.1699, 3.8404, 0.51)

**Correct Answer:** (1.53, 3.1699, 3.8404, 0.51)

**Explanation:** N_k=1.53; weighted mean=3.1699; weighted variance=3.8404; pi_k=N_k/3=0.51.

---

## Question 18

**Question:** Future rewards are ['2.3', '-1', '4', '1'] and gamma=0.59. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6.3
- **B.** 3.3078
- **C.** 1.9516
- **D.** 4.66

**Correct Answer:** 3.3078

**Explanation:** G_t=2.3(0.59^0)+-1(0.59^1)+4(0.59^2)+1(0.59^3)=3.3078.

---

## Question 19

**Question:** Q(s,a)=1.3, alpha=0.2, r=1.7, gamma=0.8, and max Q(s',a')=3.15. What is the updated Q(s,a)?

**Choices:**
- **A.** 4.22
- **B.** 1.38
- **C.** 1.884
- **D.** 0.716

**Correct Answer:** 1.884

**Explanation:** TD target=1.7+0.8(3.15)=4.22; update gives 1.3+0.2(4.22-1.3)=1.884.

---

## Question 20

**Question:** A chromosome scores 23 in a population averaging 15.5. Parents 110101 and 001011 cross after bit 2. What are (relative fitness, children)?

**Choices:**
- **A.** (0.6739, 111011 and 000101)
- **B.** (1.4839, 110101 and 001011)
- **C.** (1.4839, 111011 and 000101)
- **D.** (7.5, 000101 and 111011)

**Correct Answer:** (1.4839, 111011 and 000101)

**Explanation:** Relative fitness=23/15.5=1.4839; exchange suffixes after position 2 to obtain 111011 and 000101.

---

## Question 21

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.16', '0.16', '0.108']. What responsibility vector follows?

**Choices:**
- **A.** ['0.16', '0.16', '0.108']
- **B.** ['0.3738', '0.3738', '0.2523']
- **C.** ['0.0533', '0.0533', '0.036']
- **D.** ['0.6262', '0.6262', '0.7477']

**Correct Answer:** ['0.3738', '0.3738', '0.2523']

**Explanation:** Divide every term by their sum 0.428, giving responsibilities ['0.3738', '0.3738', '0.2523'], which sum to one.

---

## Question 22

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.28', '0.5', '0.76']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (3, 2.3333, 3.9214, 1.54)
- **B.** (1.54, 4.8, 2.5464, 0.5133)
- **C.** (0.5133, 3.1169, 3.9214, 1.54)
- **D.** (1.54, 3.1169, 3.9214, 0.5133)

**Correct Answer:** (1.54, 3.1169, 3.9214, 0.5133)

**Explanation:** N_k=1.54; weighted mean=3.1169; weighted variance=3.9214; pi_k=N_k/3=0.5133.

---

## Question 23

**Question:** Future rewards are ['2.4', '-1', '4', '1'] and gamma=0.62. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6.4
- **B.** 2.2047
- **C.** 4.88
- **D.** 3.5559

**Correct Answer:** 3.5559

**Explanation:** G_t=2.4(0.62^0)+-1(0.62^1)+4(0.62^2)+1(0.62^3)=3.5559.

---

## Question 24

**Question:** Q(s,a)=1.4, alpha=0.2, r=1.6, gamma=0.8, and max Q(s',a')=3.2. What is the updated Q(s,a)?

**Choices:**
- **A.** 4.16
- **B.** 1.952
- **C.** 1.44
- **D.** 0.848

**Correct Answer:** 1.952

**Explanation:** TD target=1.6+0.8(3.2)=4.16; update gives 1.4+0.2(4.16-1.4)=1.952.

---

## Question 25

**Question:** A chromosome scores 24 in a population averaging 16. Parents 110101 and 001011 cross after bit 3. What are (relative fitness, children)?

**Choices:**
- **A.** (1.5, 110011 and 001101)
- **B.** (0.6667, 110011 and 001101)
- **C.** (1.5, 110101 and 001011)
- **D.** (8, 001101 and 110011)

**Correct Answer:** (1.5, 110011 and 001101)

**Explanation:** Relative fitness=24/16=1.5; exchange suffixes after position 3 to obtain 110011 and 001101.

---

## Question 26

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.17', '0.155', '0.11']. What responsibility vector follows?

**Choices:**
- **A.** ['0.17', '0.155', '0.11']
- **B.** ['0.0567', '0.0517', '0.0367']
- **C.** ['0.6092', '0.6437', '0.7471']
- **D.** ['0.3908', '0.3563', '0.2529']

**Correct Answer:** ['0.3908', '0.3563', '0.2529']

**Explanation:** Divide every term by their sum 0.435, giving responsibilities ['0.3908', '0.3563', '0.2529'], which sum to one.

---

## Question 27

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.3', '0.5', '0.75']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (3, 2.3333, 3.9958, 1.55)
- **B.** (1.55, 3.0645, 3.9958, 0.5167)
- **C.** (1.55, 4.75, 2.578, 0.5167)
- **D.** (0.5167, 3.0645, 3.9958, 1.55)

**Correct Answer:** (1.55, 3.0645, 3.9958, 0.5167)

**Explanation:** N_k=1.55; weighted mean=3.0645; weighted variance=3.9958; pi_k=N_k/3=0.5167.

---

## Question 28

**Question:** Future rewards are ['2.5', '-1', '4', '1'] and gamma=0.5. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6.5
- **B.** 3.125
- **C.** 1.5625
- **D.** 4.5

**Correct Answer:** 3.125

**Explanation:** G_t=2.5(0.5^0)+-1(0.5^1)+4(0.5^2)+1(0.5^3)=3.125.

---

## Question 29

**Question:** Q(s,a)=1.5, alpha=0.2, r=1.5, gamma=0.8, and max Q(s',a')=3.25. What is the updated Q(s,a)?

**Choices:**
- **A.** 2.02
- **B.** 4.1
- **C.** 1.5
- **D.** 0.98

**Correct Answer:** 2.02

**Explanation:** TD target=1.5+0.8(3.25)=4.1; update gives 1.5+0.2(4.1-1.5)=2.02.

---

## Question 30

**Question:** A chromosome scores 25 in a population averaging 16.5. Parents 110101 and 001011 cross after bit 4. What are (relative fitness, children)?

**Choices:**
- **A.** (1.5152, 110111 and 001001)
- **B.** (0.66, 110111 and 001001)
- **C.** (1.5152, 110101 and 001011)
- **D.** (8.5, 001001 and 110111)

**Correct Answer:** (1.5152, 110111 and 001001)

**Explanation:** Relative fitness=25/16.5=1.5152; exchange suffixes after position 4 to obtain 110111 and 001001.

---

## Question 31

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.18', '0.15', '0.112']. What responsibility vector follows?

**Choices:**
- **A.** ['0.4072', '0.3394', '0.2534']
- **B.** ['0.18', '0.15', '0.112']
- **C.** ['0.06', '0.05', '0.0373']
- **D.** ['0.5928', '0.6606', '0.7466']

**Correct Answer:** ['0.4072', '0.3394', '0.2534']

**Explanation:** Divide every term by their sum 0.442, giving responsibilities ['0.4072', '0.3394', '0.2534'], which sum to one.

---

## Question 32

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.32', '0.5', '0.74']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (3, 2.3333, 4.0639, 1.56)
- **B.** (1.56, 4.7, 2.6051, 0.52)
- **C.** (1.56, 3.0128, 4.0639, 0.52)
- **D.** (0.52, 3.0128, 4.0639, 1.56)

**Correct Answer:** (1.56, 3.0128, 4.0639, 0.52)

**Explanation:** N_k=1.56; weighted mean=3.0128; weighted variance=4.0639; pi_k=N_k/3=0.52.

---

## Question 33

**Question:** Future rewards are ['2.6', '-1', '4', '1'] and gamma=0.53. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 3.3425
- **B.** 6.6
- **C.** 1.7715
- **D.** 4.72

**Correct Answer:** 3.3425

**Explanation:** G_t=2.6(0.53^0)+-1(0.53^1)+4(0.53^2)+1(0.53^3)=3.3425.

---

## Question 34

**Question:** Q(s,a)=1.6, alpha=0.2, r=1.4, gamma=0.8, and max Q(s',a')=3.3. What is the updated Q(s,a)?

**Choices:**
- **A.** 4.04
- **B.** 1.56
- **C.** 1.112
- **D.** 2.088

**Correct Answer:** 2.088

**Explanation:** TD target=1.4+0.8(3.3)=4.04; update gives 1.6+0.2(4.04-1.6)=2.088.

---

## Question 35

**Question:** A chromosome scores 26 in a population averaging 17. Parents 110101 and 001011 cross after bit 2. What are (relative fitness, children)?

**Choices:**
- **A.** (0.6538, 111011 and 000101)
- **B.** (1.5294, 110101 and 001011)
- **C.** (9, 000101 and 111011)
- **D.** (1.5294, 111011 and 000101)

**Correct Answer:** (1.5294, 111011 and 000101)

**Explanation:** Relative fitness=26/17=1.5294; exchange suffixes after position 2 to obtain 111011 and 000101.

---

## Question 36

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.19', '0.145', '0.114']. What responsibility vector follows?

**Choices:**
- **A.** ['0.19', '0.145', '0.114']
- **B.** ['0.0633', '0.0483', '0.038']
- **C.** ['0.5768', '0.6771', '0.7461']
- **D.** ['0.4232', '0.3229', '0.2539']

**Correct Answer:** ['0.4232', '0.3229', '0.2539']

**Explanation:** Divide every term by their sum 0.449, giving responsibilities ['0.4232', '0.3229', '0.2539'], which sum to one.

---

## Question 37

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.34', '0.5', '0.73']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (1.57, 2.9618, 4.1259, 0.5233)
- **B.** (3, 2.3333, 4.1259, 1.57)
- **C.** (1.57, 4.65, 2.628, 0.5233)
- **D.** (0.5233, 2.9618, 4.1259, 1.57)

**Correct Answer:** (1.57, 2.9618, 4.1259, 0.5233)

**Explanation:** N_k=1.57; weighted mean=2.9618; weighted variance=4.1259; pi_k=N_k/3=0.5233.

---

## Question 38

**Question:** Future rewards are ['2.7', '-1', '4', '1'] and gamma=0.56. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6.7
- **B.** 1.9992
- **C.** 3.57
- **D.** 4.94

**Correct Answer:** 3.57

**Explanation:** G_t=2.7(0.56^0)+-1(0.56^1)+4(0.56^2)+1(0.56^3)=3.57.

---

## Question 39

**Question:** Q(s,a)=1.7, alpha=0.2, r=1.3, gamma=0.8, and max Q(s',a')=3.35. What is the updated Q(s,a)?

**Choices:**
- **A.** 3.98
- **B.** 1.62
- **C.** 2.156
- **D.** 1.244

**Correct Answer:** 2.156

**Explanation:** TD target=1.3+0.8(3.35)=3.98; update gives 1.7+0.2(3.98-1.7)=2.156.

---

## Question 40

**Question:** A chromosome scores 27 in a population averaging 17.5. Parents 110101 and 001011 cross after bit 3. What are (relative fitness, children)?

**Choices:**
- **A.** (0.6481, 110011 and 001101)
- **B.** (1.5429, 110101 and 001011)
- **C.** (1.5429, 110011 and 001101)
- **D.** (9.5, 001101 and 110011)

**Correct Answer:** (1.5429, 110011 and 001101)

**Explanation:** Relative fitness=27/17.5=1.5429; exchange suffixes after position 3 to obtain 110011 and 001101.

---

## Question 41

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.2', '0.14', '0.116']. What responsibility vector follows?

**Choices:**
- **A.** ['0.2', '0.14', '0.116']
- **B.** ['0.0667', '0.0467', '0.0387']
- **C.** ['0.4386', '0.307', '0.2544']
- **D.** ['0.5614', '0.693', '0.7456']

**Correct Answer:** ['0.4386', '0.307', '0.2544']

**Explanation:** Divide every term by their sum 0.456, giving responsibilities ['0.4386', '0.307', '0.2544'], which sum to one.

---

## Question 42

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.36', '0.5', '0.72']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (3, 2.3333, 4.182, 1.58)
- **B.** (1.58, 2.9114, 4.182, 0.5267)
- **C.** (1.58, 4.6, 2.6468, 0.5267)
- **D.** (0.5267, 2.9114, 4.182, 1.58)

**Correct Answer:** (1.58, 2.9114, 4.182, 0.5267)

**Explanation:** N_k=1.58; weighted mean=2.9114; weighted variance=4.182; pi_k=N_k/3=0.5267.

---

## Question 43

**Question:** Future rewards are ['2.8', '-1', '4', '1'] and gamma=0.59. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6.8
- **B.** 2.2466
- **C.** 5.16
- **D.** 3.8078

**Correct Answer:** 3.8078

**Explanation:** G_t=2.8(0.59^0)+-1(0.59^1)+4(0.59^2)+1(0.59^3)=3.8078.

---

## Question 44

**Question:** Q(s,a)=1.8, alpha=0.2, r=1.2, gamma=0.8, and max Q(s',a')=3.4. What is the updated Q(s,a)?

**Choices:**
- **A.** 2.224
- **B.** 3.92
- **C.** 1.68
- **D.** 1.376

**Correct Answer:** 2.224

**Explanation:** TD target=1.2+0.8(3.4)=3.92; update gives 1.8+0.2(3.92-1.8)=2.224.

---

## Question 45

**Question:** A chromosome scores 28 in a population averaging 18. Parents 110101 and 001011 cross after bit 4. What are (relative fitness, children)?

**Choices:**
- **A.** (0.6429, 110111 and 001001)
- **B.** (1.5556, 110101 and 001011)
- **C.** (10, 001001 and 110111)
- **D.** (1.5556, 110111 and 001001)

**Correct Answer:** (1.5556, 110111 and 001001)

**Explanation:** Relative fitness=28/18=1.5556; exchange suffixes after position 4 to obtain 110111 and 001001.

---

## Question 46

**Question:** For one GMM point, the unnormalized pi_k N_k terms are ['0.21', '0.135', '0.118']. What responsibility vector follows?

**Choices:**
- **A.** ['0.21', '0.135', '0.118']
- **B.** ['0.07', '0.045', '0.0393']
- **C.** ['0.4536', '0.2916', '0.2549']
- **D.** ['0.5464', '0.7084', '0.7451']

**Correct Answer:** ['0.4536', '0.2916', '0.2549']

**Explanation:** Divide every term by their sum 0.463, giving responsibilities ['0.4536', '0.2916', '0.2549'], which sum to one.

---

## Question 47

**Question:** For x=[0, 2, 5], one component has responsibilities ['0.38', '0.5', '0.71']. Compute (N_k, mu_k, variance_k, pi_k).

**Choices:**
- **A.** (3, 2.3333, 4.2324, 1.59)
- **B.** (1.59, 2.8616, 4.2324, 0.53)
- **C.** (1.59, 4.55, 2.6619, 0.53)
- **D.** (0.53, 2.8616, 4.2324, 1.59)

**Correct Answer:** (1.59, 2.8616, 4.2324, 0.53)

**Explanation:** N_k=1.59; weighted mean=2.8616; weighted variance=4.2324; pi_k=N_k/3=0.53.

---

## Question 48

**Question:** Future rewards are ['2.9', '-1', '4', '1'] and gamma=0.62. What is G_t beginning with the first listed reward?

**Choices:**
- **A.** 6.9
- **B.** 2.5147
- **C.** 5.38
- **D.** 4.0559

**Correct Answer:** 4.0559

**Explanation:** G_t=2.9(0.62^0)+-1(0.62^1)+4(0.62^2)+1(0.62^3)=4.0559.

---

## Question 49

**Question:** Q(s,a)=1.9, alpha=0.2, r=1.1, gamma=0.8, and max Q(s',a')=3.45. What is the updated Q(s,a)?

**Choices:**
- **A.** 2.292
- **B.** 3.86
- **C.** 1.74
- **D.** 1.508

**Correct Answer:** 2.292

**Explanation:** TD target=1.1+0.8(3.45)=3.86; update gives 1.9+0.2(3.86-1.9)=2.292.

---

## Question 50

**Question:** A chromosome scores 29 in a population averaging 18.5. Parents 110101 and 001011 cross after bit 2. What are (relative fitness, children)?

**Choices:**
- **A.** (0.6379, 111011 and 000101)
- **B.** (1.5676, 110101 and 001011)
- **C.** (1.5676, 111011 and 000101)
- **D.** (10.5, 000101 and 111011)

**Correct Answer:** (1.5676, 111011 and 000101)

**Explanation:** Relative fitness=29/18.5=1.5676; exchange suffixes after position 2 to obtain 111011 and 000101.

---

## Question 51

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 1: Which conclusion is the single most defensible?

**Choices:**
- **A.** The E-step permanently assigns every point to one component.
- **B.** The E-step computes posterior responsibilities using the old parameters.
- **C.** The E-step updates chromosomes by crossover.
- **D.** The E-step ignores both mixing coefficients and Gaussian density., under both the training and evaluation conditions stated

**Correct Answer:** The E-step computes posterior responsibilities using the old parameters.

**Explanation:** Responsibilities are posterior weights over latent component labels.

---

## Question 52

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 2: Which conclusion is the single most defensible?

**Choices:**
- **A.** The M-step updates parameters using responsibility-weighted sufficient totals.
- **B.** The M-step chooses a reinforcement-learning action.
- **C.** The M-step keeps all parameters fixed by definition.
- **D.** The M-step replaces likelihood with Euclidean distance only., even when the other quantities in the formula are fixed

**Correct Answer:** The M-step updates parameters using responsibility-weighted sufficient totals.

**Explanation:** Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 53

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 3: Which conclusion is the single most defensible?

**Choices:**
- **A.** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.
- **B.** EM guarantees the same global solution from every initialization., as a consequence that holds for every permitted input
- **C.** EM must reduce observed-data likelihood at each valid iteration.
- **D.** Jensen's inequality removes every latent variable exactly.

**Correct Answer:** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.

**Explanation:** EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 54

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 4: Which conclusion is the single most defensible?

**Choices:**
- **A.** A return includes only the immediately preceding reward.
- **B.** Gamma is the probability of mutating a chromosome.
- **C.** An RL return discounts rewards farther in the future by increasing powers of gamma.
- **D.** Gamma greater than one is required for every continuing task., without needing any additional modeling assumption

**Correct Answer:** An RL return discounts rewards farther in the future by increasing powers of gamma.

**Explanation:** G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 55

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 5: Which conclusion is the single most defensible?

**Choices:**
- **A.** V(s) is a Gaussian covariance matrix.
- **B.** Q(s,a) records only the immediate reward and never future reward., under both the training and evaluation conditions stated
- **C.** A policy is the same object as a return scalar.
- **D.** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.

**Correct Answer:** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.

**Explanation:** The conditioning distinguishes state value from action value.

---

## Question 56

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 6: Which conclusion is the single most defensible?

**Choices:**
- **A.** Q-learning targets the minimum action value in the current state.
- **B.** Q-learning replaces alpha with a crossover point.
- **C.** Q-learning updates every state-action pair to the same reward.
- **D.** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Correct Answer:** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Explanation:** The supplied update uses the best estimated next action.

---

## Question 57

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 7: Which conclusion is the single most defensible?

**Choices:**
- **A.** Exploration and exploitation are identical policies.
- **B.** Exploitation means selecting an action uniformly at random., as a consequence that holds for every permitted input
- **C.** Exploration tests alternatives; exploitation chooses the best-known action.
- **D.** Exploration is possible only after an episode terminates.

**Correct Answer:** Exploration tests alternatives; exploitation chooses the best-known action.

**Explanation:** Their tension concerns information gathering versus current reward.

---

## Question 58

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 8: Which conclusion is the single most defensible?

**Choices:**
- **A.** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.
- **B.** Selection flips every bit and crossover evaluates fitness., without needing any additional modeling assumption
- **C.** Mutation must occur with probability greater than 50%.
- **D.** Crossover guarantees a globally optimal child.

**Correct Answer:** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Explanation:** These are distinct stages of the classical GA loop.

---

## Question 59

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 9: Which conclusion is the single most defensible?

**Choices:**
- **A.** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.
- **B.** Relative fitness 1.47 guarantees exactly two copies.
- **C.** The fractional part is discarded with no chance of a copy.
- **D.** Fitness 1.47 means the chromosome mutates 147% of its genes., under both the training and evaluation conditions stated

**Correct Answer:** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Explanation:** The example interprets integer and fractional expected copies separately.

---

## Question 60

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 10: Which conclusion is the single most defensible?

**Choices:**
- **A.** Mutation always preserves every gene unchanged.
- **B.** Mutation is equivalent to selecting the current best individual., even when the other quantities in the formula are fixed
- **C.** Mutation can help a GA escape a local maximum by restoring variation.
- **D.** Mutation probability must be exactly zero after crossover.

**Correct Answer:** Mutation can help a GA escape a local maximum by restoring variation.

**Explanation:** Occasional random changes explore regions absent from current recombinations.

---

## Question 61

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 11: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The E-step permanently assigns every point to one component.
- **B.** The E-step updates chromosomes by crossover.
- **C.** The E-step ignores both mixing coefficients and Gaussian density., as a consequence that holds for every permitted input
- **D.** The E-step computes posterior responsibilities using the old parameters.

**Correct Answer:** The E-step computes posterior responsibilities using the old parameters.

**Explanation:** Responsibilities are posterior weights over latent component labels.

---

## Question 62

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 12: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The M-step updates parameters using responsibility-weighted sufficient totals.
- **B.** The M-step chooses a reinforcement-learning action.
- **C.** The M-step keeps all parameters fixed by definition.
- **D.** The M-step replaces likelihood with Euclidean distance only., without needing any additional modeling assumption

**Correct Answer:** The M-step updates parameters using responsibility-weighted sufficient totals.

**Explanation:** Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 63

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 13: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** EM guarantees the same global solution from every initialization., under both the training and evaluation conditions stated
- **B.** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.
- **C.** EM must reduce observed-data likelihood at each valid iteration.
- **D.** Jensen's inequality removes every latent variable exactly.

**Correct Answer:** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.

**Explanation:** EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 64

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 14: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A return includes only the immediately preceding reward.
- **B.** Gamma is the probability of mutating a chromosome.
- **C.** Gamma greater than one is required for every continuing task., even when the other quantities in the formula are fixed
- **D.** An RL return discounts rewards farther in the future by increasing powers of gamma.

**Correct Answer:** An RL return discounts rewards farther in the future by increasing powers of gamma.

**Explanation:** G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 65

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 15: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** V(s) is a Gaussian covariance matrix.
- **B.** Q(s,a) records only the immediate reward and never future reward., as a consequence that holds for every permitted input
- **C.** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.
- **D.** A policy is the same object as a return scalar.

**Correct Answer:** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.

**Explanation:** The conditioning distinguishes state value from action value.

---

## Question 66

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 16: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Q-learning targets the minimum action value in the current state.
- **B.** Q-learning replaces alpha with a crossover point.
- **C.** Q-learning updates every state-action pair to the same reward.
- **D.** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Correct Answer:** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Explanation:** The supplied update uses the best estimated next action.

---

## Question 67

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 17: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Exploration and exploitation are identical policies.
- **B.** Exploitation means selecting an action uniformly at random., under both the training and evaluation conditions stated
- **C.** Exploration tests alternatives; exploitation chooses the best-known action.
- **D.** Exploration is possible only after an episode terminates.

**Correct Answer:** Exploration tests alternatives; exploitation chooses the best-known action.

**Explanation:** Their tension concerns information gathering versus current reward.

---

## Question 68

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 18: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.
- **B.** Selection flips every bit and crossover evaluates fitness., even when the other quantities in the formula are fixed
- **C.** Mutation must occur with probability greater than 50%.
- **D.** Crossover guarantees a globally optimal child.

**Correct Answer:** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Explanation:** These are distinct stages of the classical GA loop.

---

## Question 69

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 19: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Relative fitness 1.47 guarantees exactly two copies.
- **B.** The fractional part is discarded with no chance of a copy.
- **C.** Fitness 1.47 means the chromosome mutates 147% of its genes., as a consequence that holds for every permitted input
- **D.** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Correct Answer:** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Explanation:** The example interprets integer and fractional expected copies separately.

---

## Question 70

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 20: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Mutation always preserves every gene unchanged.
- **B.** Mutation is equivalent to selecting the current best individual., without needing any additional modeling assumption
- **C.** Mutation probability must be exactly zero after crossover.
- **D.** Mutation can help a GA escape a local maximum by restoring variation.

**Correct Answer:** Mutation can help a GA escape a local maximum by restoring variation.

**Explanation:** Occasional random changes explore regions absent from current recombinations.

---

## Question 71

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 21: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The E-step computes posterior responsibilities using the old parameters.
- **B.** The E-step permanently assigns every point to one component.
- **C.** The E-step updates chromosomes by crossover.
- **D.** The E-step ignores both mixing coefficients and Gaussian density., under both the training and evaluation conditions stated

**Correct Answer:** The E-step computes posterior responsibilities using the old parameters.

**Explanation:** Responsibilities are posterior weights over latent component labels.

---

## Question 72

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 22: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The M-step updates parameters using responsibility-weighted sufficient totals.
- **B.** The M-step chooses a reinforcement-learning action.
- **C.** The M-step keeps all parameters fixed by definition.
- **D.** The M-step replaces likelihood with Euclidean distance only., even when the other quantities in the formula are fixed

**Correct Answer:** The M-step updates parameters using responsibility-weighted sufficient totals.

**Explanation:** Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 73

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 23: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** EM guarantees the same global solution from every initialization., as a consequence that holds for every permitted input
- **B.** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.
- **C.** EM must reduce observed-data likelihood at each valid iteration.
- **D.** Jensen's inequality removes every latent variable exactly.

**Correct Answer:** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.

**Explanation:** EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 74

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 24: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A return includes only the immediately preceding reward.
- **B.** An RL return discounts rewards farther in the future by increasing powers of gamma.
- **C.** Gamma is the probability of mutating a chromosome.
- **D.** Gamma greater than one is required for every continuing task., without needing any additional modeling assumption

**Correct Answer:** An RL return discounts rewards farther in the future by increasing powers of gamma.

**Explanation:** G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 75

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 25: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** V(s) is a Gaussian covariance matrix.
- **B.** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.
- **C.** Q(s,a) records only the immediate reward and never future reward., under both the training and evaluation conditions stated
- **D.** A policy is the same object as a return scalar.

**Correct Answer:** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.

**Explanation:** The conditioning distinguishes state value from action value.

---

## Question 76

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 26: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Q-learning targets the minimum action value in the current state.
- **B.** Q-learning replaces alpha with a crossover point.
- **C.** Q-learning bootstraps toward r+gamma max_a' Q(s',a').
- **D.** Q-learning updates every state-action pair to the same reward.

**Correct Answer:** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Explanation:** The supplied update uses the best estimated next action.

---

## Question 77

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 27: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Exploration and exploitation are identical policies.
- **B.** Exploration tests alternatives; exploitation chooses the best-known action.
- **C.** Exploitation means selecting an action uniformly at random., as a consequence that holds for every permitted input
- **D.** Exploration is possible only after an episode terminates.

**Correct Answer:** Exploration tests alternatives; exploitation chooses the best-known action.

**Explanation:** Their tension concerns information gathering versus current reward.

---

## Question 78

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 28: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Selection flips every bit and crossover evaluates fitness., without needing any additional modeling assumption
- **B.** Mutation must occur with probability greater than 50%.
- **C.** Crossover guarantees a globally optimal child.
- **D.** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Correct Answer:** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Explanation:** These are distinct stages of the classical GA loop.

---

## Question 79

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 29: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Relative fitness 1.47 guarantees exactly two copies.
- **B.** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.
- **C.** The fractional part is discarded with no chance of a copy.
- **D.** Fitness 1.47 means the chromosome mutates 147% of its genes., under both the training and evaluation conditions stated

**Correct Answer:** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Explanation:** The example interprets integer and fractional expected copies separately.

---

## Question 80

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 30: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Mutation always preserves every gene unchanged.
- **B.** Mutation is equivalent to selecting the current best individual., even when the other quantities in the formula are fixed
- **C.** Mutation can help a GA escape a local maximum by restoring variation.
- **D.** Mutation probability must be exactly zero after crossover.

**Correct Answer:** Mutation can help a GA escape a local maximum by restoring variation.

**Explanation:** Occasional random changes explore regions absent from current recombinations.

---

## Question 81

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 31: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The E-step permanently assigns every point to one component.
- **B.** The E-step computes posterior responsibilities using the old parameters.
- **C.** The E-step updates chromosomes by crossover.
- **D.** The E-step ignores both mixing coefficients and Gaussian density., as a consequence that holds for every permitted input

**Correct Answer:** The E-step computes posterior responsibilities using the old parameters.

**Explanation:** Responsibilities are posterior weights over latent component labels.

---

## Question 82

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 32: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The M-step chooses a reinforcement-learning action.
- **B.** The M-step updates parameters using responsibility-weighted sufficient totals.
- **C.** The M-step keeps all parameters fixed by definition.
- **D.** The M-step replaces likelihood with Euclidean distance only., without needing any additional modeling assumption

**Correct Answer:** The M-step updates parameters using responsibility-weighted sufficient totals.

**Explanation:** Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 83

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 33: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** EM guarantees the same global solution from every initialization., under both the training and evaluation conditions stated
- **B.** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.
- **C.** EM must reduce observed-data likelihood at each valid iteration.
- **D.** Jensen's inequality removes every latent variable exactly.

**Correct Answer:** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.

**Explanation:** EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 84

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 34: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A return includes only the immediately preceding reward.
- **B.** An RL return discounts rewards farther in the future by increasing powers of gamma.
- **C.** Gamma is the probability of mutating a chromosome.
- **D.** Gamma greater than one is required for every continuing task., even when the other quantities in the formula are fixed

**Correct Answer:** An RL return discounts rewards farther in the future by increasing powers of gamma.

**Explanation:** G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 85

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 35: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.
- **B.** V(s) is a Gaussian covariance matrix.
- **C.** Q(s,a) records only the immediate reward and never future reward., as a consequence that holds for every permitted input
- **D.** A policy is the same object as a return scalar.

**Correct Answer:** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.

**Explanation:** The conditioning distinguishes state value from action value.

---

## Question 86

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 36: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Q-learning targets the minimum action value in the current state.
- **B.** Q-learning bootstraps toward r+gamma max_a' Q(s',a').
- **C.** Q-learning replaces alpha with a crossover point.
- **D.** Q-learning updates every state-action pair to the same reward.

**Correct Answer:** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Explanation:** The supplied update uses the best estimated next action.

---

## Question 87

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 37: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Exploration and exploitation are identical policies.
- **B.** Exploitation means selecting an action uniformly at random., under both the training and evaluation conditions stated
- **C.** Exploration tests alternatives; exploitation chooses the best-known action.
- **D.** Exploration is possible only after an episode terminates.

**Correct Answer:** Exploration tests alternatives; exploitation chooses the best-known action.

**Explanation:** Their tension concerns information gathering versus current reward.

---

## Question 88

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 38: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.
- **B.** Selection flips every bit and crossover evaluates fitness., even when the other quantities in the formula are fixed
- **C.** Mutation must occur with probability greater than 50%.
- **D.** Crossover guarantees a globally optimal child.

**Correct Answer:** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Explanation:** These are distinct stages of the classical GA loop.

---

## Question 89

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 39: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Relative fitness 1.47 guarantees exactly two copies.
- **B.** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.
- **C.** The fractional part is discarded with no chance of a copy.
- **D.** Fitness 1.47 means the chromosome mutates 147% of its genes., as a consequence that holds for every permitted input

**Correct Answer:** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Explanation:** The example interprets integer and fractional expected copies separately.

---

## Question 90

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 40: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Mutation always preserves every gene unchanged.
- **B.** Mutation is equivalent to selecting the current best individual., without needing any additional modeling assumption
- **C.** Mutation probability must be exactly zero after crossover.
- **D.** Mutation can help a GA escape a local maximum by restoring variation.

**Correct Answer:** Mutation can help a GA escape a local maximum by restoring variation.

**Explanation:** Occasional random changes explore regions absent from current recombinations.

---

## Question 91

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 41: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The E-step permanently assigns every point to one component.
- **B.** The E-step computes posterior responsibilities using the old parameters.
- **C.** The E-step updates chromosomes by crossover.
- **D.** The E-step ignores both mixing coefficients and Gaussian density., under both the training and evaluation conditions stated

**Correct Answer:** The E-step computes posterior responsibilities using the old parameters.

**Explanation:** Responsibilities are posterior weights over latent component labels.

---

## Question 92

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 42: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The M-step updates parameters using responsibility-weighted sufficient totals.
- **B.** The M-step chooses a reinforcement-learning action.
- **C.** The M-step keeps all parameters fixed by definition.
- **D.** The M-step replaces likelihood with Euclidean distance only., even when the other quantities in the formula are fixed

**Correct Answer:** The M-step updates parameters using responsibility-weighted sufficient totals.

**Explanation:** Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 93

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 43: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.
- **B.** EM guarantees the same global solution from every initialization., as a consequence that holds for every permitted input
- **C.** EM must reduce observed-data likelihood at each valid iteration.
- **D.** Jensen's inequality removes every latent variable exactly.

**Correct Answer:** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.

**Explanation:** EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 94

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 44: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** An RL return discounts rewards farther in the future by increasing powers of gamma.
- **B.** A return includes only the immediately preceding reward.
- **C.** Gamma is the probability of mutating a chromosome.
- **D.** Gamma greater than one is required for every continuing task., without needing any additional modeling assumption

**Correct Answer:** An RL return discounts rewards farther in the future by increasing powers of gamma.

**Explanation:** G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 95

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 45: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** V(s) is a Gaussian covariance matrix.
- **B.** Q(s,a) records only the immediate reward and never future reward., under both the training and evaluation conditions stated
- **C.** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.
- **D.** A policy is the same object as a return scalar.

**Correct Answer:** Q(s,a) evaluates an action in a state, while V(s) evaluates the state under a policy.

**Explanation:** The conditioning distinguishes state value from action value.

---

## Question 96

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 46: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Q-learning targets the minimum action value in the current state.
- **B.** Q-learning replaces alpha with a crossover point.
- **C.** Q-learning updates every state-action pair to the same reward.
- **D.** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Correct Answer:** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Explanation:** The supplied update uses the best estimated next action.

---

## Question 97

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 47: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Exploration tests alternatives; exploitation chooses the best-known action.
- **B.** Exploration and exploitation are identical policies.
- **C.** Exploitation means selecting an action uniformly at random., as a consequence that holds for every permitted input
- **D.** Exploration is possible only after an episode terminates.

**Correct Answer:** Exploration tests alternatives; exploitation chooses the best-known action.

**Explanation:** Their tension concerns information gathering versus current reward.

---

## Question 98

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 48: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Selection flips every bit and crossover evaluates fitness., without needing any additional modeling assumption
- **B.** Mutation must occur with probability greater than 50%.
- **C.** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.
- **D.** Crossover guarantees a globally optimal child.

**Correct Answer:** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Explanation:** These are distinct stages of the classical GA loop.

---

## Question 99

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 49: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.
- **B.** Relative fitness 1.47 guarantees exactly two copies.
- **C.** The fractional part is discarded with no chance of a copy.
- **D.** Fitness 1.47 means the chromosome mutates 147% of its genes., under both the training and evaluation conditions stated

**Correct Answer:** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Explanation:** The example interprets integer and fractional expected copies separately.

---

## Question 100

**Question:** A latent-variable, control, or evolutionary procedure is audited. Case 50: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Mutation always preserves every gene unchanged.
- **B.** Mutation is equivalent to selecting the current best individual., even when the other quantities in the formula are fixed
- **C.** Mutation probability must be exactly zero after crossover.
- **D.** Mutation can help a GA escape a local maximum by restoring variation.

**Correct Answer:** Mutation can help a GA escape a local maximum by restoring variation.

**Explanation:** Occasional random changes explore regions absent from current recombinations.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Distractors are designed around plausible definition, sign, denominator, update-order, and rounding errors.
