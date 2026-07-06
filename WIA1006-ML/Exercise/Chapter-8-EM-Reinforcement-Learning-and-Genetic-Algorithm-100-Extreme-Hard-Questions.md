# Chapter 8: EM, Reinforcement Learning, and Genetic Algorithm: 100 Extreme-Hard Questions

> Topics: EM responsibilities and updates, RL returns and Q-learning, plus GA fitness, crossover, and mutation. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** Using unnormalized component terms=['0.12', '0.18', '0.1'], compute the first EM responsibility.

**Choices:**
- **A.** first EM responsibility = 0.371
- **B.** first EM responsibility = 0.3
- **C.** first EM responsibility = 0.229
- **D.** first EM responsibility = 0.442

**Correct Answer:** first EM responsibility = 0.3

**Explanation:** Apply $\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}$; substitution gives first EM responsibility=0.3.

---

## Question 2

**Question:** Using x=[0, 2, 5], responsibilities=['0.2', '0.5', '0.8'], compute the updated EM mean.

**Choices:**
- **A.** updated EM mean = 3.9333
- **B.** updated EM mean = 3.3333
- **C.** updated EM mean = 2.7333
- **D.** updated EM mean = 4.5333

**Correct Answer:** updated EM mean = 3.3333

**Explanation:** Apply $\frac{\sum_n r_nx_n}{\sum_n r_n}$; substitution gives updated EM mean=3.3333.

---

## Question 3

**Question:** Using rewards=['2', '-1', '4', '1'], $\gamma=0.5$, compute the discounted return.

**Choices:**
- **A.** discounted return = 2.625
- **B.** discounted return = 3.0975
- **C.** discounted return = 2.1525
- **D.** discounted return = 3.57

**Correct Answer:** discounted return = 2.625

**Explanation:** Apply $\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}$; substitution gives discounted return=2.625.

---

## Question 4

**Question:** Using $Q(s,a)=1$, $\alpha=0.2$, r=2, $\gamma=0.8$, $\max_{a'}Q(s',a')=3$, compute the updated Q-value.

**Choices:**
- **A.** updated Q-value = 2.2848
- **B.** updated Q-value = 1.9824
- **C.** updated Q-value = 1.3776
- **D.** updated Q-value = 1.68

**Correct Answer:** updated Q-value = 1.68

**Explanation:** Apply $Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]$; substitution gives updated Q-value=1.68.

---

## Question 5

**Question:** Using chromosome score=20, population average=14, compute the relative GA fitness.

**Choices:**
- **A.** relative GA fitness = 1.6857
- **B.** relative GA fitness = 1.4286
- **C.** relative GA fitness = 1.1714
- **D.** relative GA fitness = 1.9429

**Correct Answer:** relative GA fitness = 1.4286

**Explanation:** Apply $\frac{g(c)}{A}$; substitution gives relative GA fitness=1.4286.

---

## Question 6

**Question:** Compare the first EM responsibility for Case P (unnormalized component terms=['0.13', '0.176', '0.102']) and Case Q (unnormalized component terms=['0.16', '0.164', '0.108']).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The first case is larger: 0.3186 versus 0.3704 under the complete set of stated assumptions
- **C.** The second case is larger: 0.3704 versus 0.3186
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.3704 versus 0.3186

**Explanation:** The same formula gives 0.3186 for P and 0.3704 for Q, establishing the stated comparison.

---

## Question 7

**Question:** Compare the updated EM mean for Case P (x=[0, 2, 5], responsibilities=['0.22', '0.5', '0.79']) and Case Q (x=[0, 2, 5], responsibilities=['0.28', '0.5', '0.76']).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The second case is larger: 3.1169 versus 3.2781
- **C.** The first case is larger: 3.2781 versus 3.1169
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 3.2781 versus 3.1169

**Explanation:** The same formula gives 3.2781 for P and 3.1169 for Q, establishing the stated comparison.

---

## Question 8

**Question:** Compare the discounted return for Case P (rewards=['2.1', '-1', '4', '1'], $\gamma=0.52$) and Case Q (rewards=['2.4', '-1', '4', '1'], $\gamma=0.58$).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The first case is larger: 2.8022 versus 3.3607 under the complete set of stated assumptions
- **C.** The second case is larger: 3.3607 versus 2.8022
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 3.3607 versus 2.8022

**Explanation:** The same formula gives 2.8022 for P and 3.3607 for Q, establishing the stated comparison.

---

## Question 9

**Question:** Compare the updated Q-value for Case P ($Q(s,a)=1.1$, $\alpha=0.2$, r=1.95, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.04$) and Case Q ($Q(s,a)=1.4$, $\alpha=0.2$, r=1.8, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.16$).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 1.7564 versus 1.9856 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 1.9856 versus 1.7564

**Correct Answer:** The second case is larger: 1.9856 versus 1.7564

**Explanation:** The same formula gives 1.7564 for P and 1.9856 for Q, establishing the stated comparison.

---

## Question 10

**Question:** Compare the relative GA fitness for Case P (chromosome score=21, population average=14.4) and Case Q (chromosome score=24, population average=15.6).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The first case is larger: 1.4583 versus 1.5385 under the complete set of stated assumptions
- **C.** The second case is larger: 1.5385 versus 1.4583
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 1.5385 versus 1.4583

**Explanation:** The same formula gives 1.4583 for P and 1.5385 for Q, establishing the stated comparison.

---

## Question 11

**Question:** How far apart are the first EM responsibility values for (unnormalized component terms=['0.14', '0.172', '0.104']) and (unnormalized component terms=['0.2', '0.148', '0.116'])?

**Choices:**
- **A.** absolute first EM responsibility difference = 0.0235
- **B.** absolute first EM responsibility difference = 0.1655
- **C.** absolute first EM responsibility difference = 0.0945
- **D.** absolute first EM responsibility difference = 0.2365

**Correct Answer:** absolute first EM responsibility difference = 0.0945

**Explanation:** The two values are 0.3365 and 0.431; their absolute difference is 0.0945.

---

## Question 12

**Question:** How far apart are the updated EM mean values for (x=[0, 2, 5], responsibilities=['0.24', '0.5', '0.78']) and (x=[0, 2, 5], responsibilities=['0.36', '0.5', '0.72'])?

**Choices:**
- **A.** absolute updated EM mean difference = 0.3833
- **B.** absolute updated EM mean difference = 0.3123
- **C.** absolute updated EM mean difference = 0.2413
- **D.** absolute updated EM mean difference = 0.4543

**Correct Answer:** absolute updated EM mean difference = 0.3123

**Explanation:** The two values are 3.2237 and 2.9114; their absolute difference is 0.3123.

---

## Question 13

**Question:** How far apart are the discounted return values for (rewards=['2.2', '-1', '4', '1'], $\gamma=0.54$) and (rewards=['2.8', '-1', '4', '1'], $\gamma=0.56$)?

**Choices:**
- **A.** absolute discounted return difference = 0.8097
- **B.** absolute discounted return difference = 0.6862
- **C.** absolute discounted return difference = 0.5626
- **D.** absolute discounted return difference = 0.9332

**Correct Answer:** absolute discounted return difference = 0.6862

**Explanation:** The two values are 2.9839 and 3.67; their absolute difference is 0.6862.

---

## Question 14

**Question:** How far apart are the updated Q-value values for ($Q(s,a)=1.2$, $\alpha=0.2$, r=1.9, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.08$) and ($Q(s,a)=1.8$, $\alpha=0.2$, r=1.6, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.32$)?

**Choices:**
- **A.** absolute updated Q-value difference = 0.5409
- **B.** absolute updated Q-value difference = 0.4584
- **C.** absolute updated Q-value difference = 0.3759
- **D.** absolute updated Q-value difference = 0.6234

**Correct Answer:** absolute updated Q-value difference = 0.4584

**Explanation:** The two values are 1.8328 and 2.2912; their absolute difference is 0.4584.

---

## Question 15

**Question:** How far apart are the relative GA fitness values for (chromosome score=22, population average=14.8) and (chromosome score=28, population average=17.2)?

**Choices:**
- **A.** absolute relative GA fitness difference = 0.0704
- **B.** absolute relative GA fitness difference = 0.2124
- **C.** absolute relative GA fitness difference = 0.1414
- **D.** absolute relative GA fitness difference = 0.2834

**Correct Answer:** absolute relative GA fitness difference = 0.1414

**Explanation:** The two values are 1.4865 and 1.6279; their absolute difference is 0.1414.

---

## Question 16

**Question:** Taking (unnormalized component terms=['0.15', '0.168', '0.106']) as baseline and (unnormalized component terms=['0.13', '0.176', '0.102']) as the new case, what is the percentage change in first EM responsibility?

**Choices:**
- **A.** percentage change in first EM responsibility = -11.7229
- **B.** percentage change in first EM responsibility = -8.1464
- **C.** percentage change in first EM responsibility = -9.9346
- **D.** percentage change in first EM responsibility = -6.3582

**Correct Answer:** percentage change in first EM responsibility = -9.9346

**Explanation:** The values change from 0.3538 to 0.3186; (new-old)/|old|*100=-9.9346%.

---

## Question 17

**Question:** Taking (x=[0, 2, 5], responsibilities=['0.26', '0.5', '0.77']) as baseline and (x=[0, 2, 5], responsibilities=['0.22', '0.5', '0.79']) as the new case, what is the percentage change in updated EM mean?

**Choices:**
- **A.** percentage change in updated EM mean = 3.4137
- **B.** percentage change in updated EM mean = 4.0281
- **C.** percentage change in updated EM mean = 2.7992
- **D.** percentage change in updated EM mean = 4.6426

**Correct Answer:** percentage change in updated EM mean = 3.4137

**Explanation:** The values change from 3.1699 to 3.2781; (new-old)/|old|*100=3.4137%.

---

## Question 18

**Question:** Taking (rewards=['2.3', '-1', '4', '1'], $\gamma=0.56$) as baseline and (rewards=['2.1', '-1', '4', '1'], $\gamma=0.52$) as the new case, what is the percentage change in discounted return?

**Choices:**
- **A.** percentage change in discounted return = -11.6027
- **B.** percentage change in discounted return = -9.5142
- **C.** percentage change in discounted return = -13.6912
- **D.** percentage change in discounted return = -7.4257

**Correct Answer:** percentage change in discounted return = -11.6027

**Explanation:** The values change from 3.17 to 2.8022; (new-old)/|old|*100=-11.6027%.

---

## Question 19

**Question:** Taking ($Q(s,a)=1.3$, $\alpha=0.2$, r=1.85, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.12$) as baseline and ($Q(s,a)=1.1$, $\alpha=0.2$, r=1.95, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.04$) as the new case, what is the percentage change in updated Q-value?

**Choices:**
- **A.** percentage change in updated Q-value = -8.0034
- **B.** percentage change in updated Q-value = -6.5627
- **C.** percentage change in updated Q-value = -9.444
- **D.** percentage change in updated Q-value = -5.1221

**Correct Answer:** percentage change in updated Q-value = -8.0034

**Explanation:** The values change from 1.9092 to 1.7564; (new-old)/|old|*100=-8.0034%.

---

## Question 20

**Question:** Taking (chromosome score=23, population average=15.2) as baseline and (chromosome score=21, population average=14.4) as the new case, what is the percentage change in relative GA fitness?

**Choices:**
- **A.** percentage change in relative GA fitness = -2.3188
- **B.** percentage change in relative GA fitness = -2.971
- **C.** percentage change in relative GA fitness = -4.2754
- **D.** percentage change in relative GA fitness = -3.6232

**Correct Answer:** percentage change in relative GA fitness = -3.6232

**Explanation:** The values change from 1.5132 to 1.4583; (new-old)/|old|*100=-3.6232%.

---

## Question 21

**Question:** Which formula must be applied to obtain first EM responsibility from the supplied chapter quantities?

**Choices:**
- **A.** For first EM responsibility, use $\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}$
- **B.** For first EM responsibility, use $1-\left(\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}\right)$
- **C.** For first EM responsibility, use $\sqrt{\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}}$
- **D.** For first EM responsibility, use sum inputs without the required weighting for first EM responsibility

**Correct Answer:** For first EM responsibility, use $\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}$

**Explanation:** The chapter defines first EM responsibility with $\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}$; the other expressions change an operation or omit required weighting.

---

## Question 22

**Question:** Which formula must be applied to obtain updated EM mean from the supplied chapter quantities?

**Choices:**
- **A.** For updated EM mean, use $1-\left(\frac{\sum_n r_nx_n}{\sum_n r_n}\right)$
- **B.** For updated EM mean, use $\frac{\sum_n r_nx_n}{\sum_n r_n}$
- **C.** For updated EM mean, use $\sqrt{\frac{\sum_n r_nx_n}{\sum_n r_n}}$
- **D.** For updated EM mean, use sum inputs without the required weighting for updated EM mean

**Correct Answer:** For updated EM mean, use $\frac{\sum_n r_nx_n}{\sum_n r_n}$

**Explanation:** The chapter defines updated EM mean with $\frac{\sum_n r_nx_n}{\sum_n r_n}$; the other expressions change an operation or omit required weighting.

---

## Question 23

**Question:** Which formula must be applied to obtain discounted return from the supplied chapter quantities?

**Choices:**
- **A.** For discounted return, use $\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}$
- **B.** For discounted return, use $1-\left(\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}\right)$
- **C.** For discounted return, use $\sqrt{\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}}$
- **D.** For discounted return, use sum inputs without the required weighting for discounted return

**Correct Answer:** For discounted return, use $\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}$

**Explanation:** The chapter defines discounted return with $\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}$; the other expressions change an operation or omit required weighting.

---

## Question 24

**Question:** Which formula must be applied to obtain updated Q-value from the supplied chapter quantities?

**Choices:**
- **A.** For updated Q-value, use $Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]$
- **B.** For updated Q-value, use $1-\left(Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]\right)$
- **C.** For updated Q-value, use $\sqrt{Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]}$
- **D.** For updated Q-value, use sum inputs without the required weighting for updated Q-value

**Correct Answer:** For updated Q-value, use $Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]$

**Explanation:** The chapter defines updated Q-value with $Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]$; the other expressions change an operation or omit required weighting.

---

## Question 25

**Question:** Which formula must be applied to obtain relative GA fitness from the supplied chapter quantities?

**Choices:**
- **A.** For relative GA fitness, use $\sqrt{\frac{g(c)}{A}}$
- **B.** For relative GA fitness, use $1-\left(\frac{g(c)}{A}\right)$
- **C.** For relative GA fitness, use $\frac{g(c)}{A}$
- **D.** For relative GA fitness, use sum inputs without the required weighting for relative GA fitness

**Correct Answer:** For relative GA fitness, use $\frac{g(c)}{A}$

**Explanation:** The chapter defines relative GA fitness with $\frac{g(c)}{A}$; the other expressions change an operation or omit required weighting.

---

## Question 26

**Question:** Four datasets are candidates. Which one produces first EM responsibility=0.3864?

**Choices:**
- **A.** For first EM responsibility, the second dataset: unnormalized component terms=['0.14', '0.172', '0.104']
- **B.** For first EM responsibility, the first dataset: unnormalized component terms=['0.12', '0.18', '0.1']
- **C.** For first EM responsibility, the third dataset: unnormalized component terms=['0.17', '0.16', '0.11']
- **D.** For first EM responsibility, the fourth dataset: unnormalized component terms=['0.2', '0.148', '0.116']

**Correct Answer:** For first EM responsibility, the third dataset: unnormalized component terms=['0.17', '0.16', '0.11']

**Explanation:** Evaluating all four with $\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}$ shows that the third dataset produces 0.3864.

---

## Question 27

**Question:** Four datasets are candidates. Which one produces updated EM mean=3.0645?

**Choices:**
- **A.** For updated EM mean, the fourth dataset: x=[0, 2, 5], responsibilities=['0.36', '0.5', '0.72']
- **B.** For updated EM mean, the first dataset: x=[0, 2, 5], responsibilities=['0.2', '0.5', '0.8']
- **C.** For updated EM mean, the second dataset: x=[0, 2, 5], responsibilities=['0.24', '0.5', '0.78']
- **D.** For updated EM mean, the third dataset: x=[0, 2, 5], responsibilities=['0.3', '0.5', '0.75']

**Correct Answer:** For updated EM mean, the third dataset: x=[0, 2, 5], responsibilities=['0.3', '0.5', '0.75']

**Explanation:** Evaluating all four with $\frac{\sum_n r_nx_n}{\sum_n r_n}$ shows that the third dataset produces 3.0645.

---

## Question 28

**Question:** Four datasets are candidates. Which one produces discounted return=3.125?

**Choices:**
- **A.** For discounted return, the second dataset: rewards=['2.2', '-1', '4', '1'], $\gamma=0.54$
- **B.** For discounted return, the first dataset: rewards=['2', '-1', '4', '1'], $\gamma=0.5$
- **C.** For discounted return, the third dataset: rewards=['2.5', '-1', '4', '1'], $\gamma=0.5$
- **D.** For discounted return, the fourth dataset: rewards=['2.8', '-1', '4', '1'], $\gamma=0.56$

**Correct Answer:** For discounted return, the third dataset: rewards=['2.5', '-1', '4', '1'], $\gamma=0.5$

**Explanation:** Evaluating all four with $\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}$ shows that the third dataset produces 3.125.

---

## Question 29

**Question:** Four datasets are candidates. Which one produces updated Q-value=2.062?

**Choices:**
- **A.** For updated Q-value, the second dataset: $Q(s,a)=1.2$, $\alpha=0.2$, r=1.9, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.08$
- **B.** For updated Q-value, the first dataset: $Q(s,a)=1$, $\alpha=0.2$, r=2, $\gamma=0.8$, $\max_{a'}Q(s',a')=3$
- **C.** For updated Q-value, the third dataset: $Q(s,a)=1.5$, $\alpha=0.2$, r=1.75, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.2$
- **D.** For updated Q-value, the fourth dataset: $Q(s,a)=1.8$, $\alpha=0.2$, r=1.6, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.32$

**Correct Answer:** For updated Q-value, the third dataset: $Q(s,a)=1.5$, $\alpha=0.2$, r=1.75, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.2$

**Explanation:** Evaluating all four with $Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]$ shows that the third dataset produces 2.062.

---

## Question 30

**Question:** Four datasets are candidates. Which one produces relative GA fitness=1.5625?

**Choices:**
- **A.** For relative GA fitness, the fourth dataset: chromosome score=28, population average=17.2
- **B.** For relative GA fitness, the first dataset: chromosome score=20, population average=14
- **C.** For relative GA fitness, the second dataset: chromosome score=22, population average=14.8
- **D.** For relative GA fitness, the third dataset: chromosome score=25, population average=16

**Correct Answer:** For relative GA fitness, the third dataset: chromosome score=25, population average=16

**Explanation:** Evaluating all four with $\frac{g(c)}{A}$ shows that the third dataset produces 1.5625.

---

## Question 31

**Question:** For unnormalized component terms=['0.18', '0.156', '0.112'], a student reports first EM responsibility=0.5022. What corrected value should replace it?

**Choices:**
- **A.** corrected first EM responsibility = 0.4741
- **B.** corrected first EM responsibility = 0.4018
- **C.** corrected first EM responsibility = 0.3295
- **D.** corrected first EM responsibility = 0.5464

**Correct Answer:** corrected first EM responsibility = 0.4018

**Explanation:** Recomputing with $\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}$ gives 0.4018, so the reported 0.5022 is rejected.

---

## Question 32

**Question:** For x=[0, 2, 5], responsibilities=['0.32', '0.5', '0.74'], a student reports updated EM mean=3.766. What corrected value should replace it?

**Choices:**
- **A.** corrected updated EM mean = 4.0974
- **B.** corrected updated EM mean = 3.5551
- **C.** corrected updated EM mean = 2.4705
- **D.** corrected updated EM mean = 3.0128

**Correct Answer:** corrected updated EM mean = 3.0128

**Explanation:** Recomputing with $\frac{\sum_n r_nx_n}{\sum_n r_n}$ gives 3.0128, so the reported 3.766 is rejected.

---

## Question 33

**Question:** For rewards=['2.6', '-1', '4', '1'], $\gamma=0.52$, a student reports discounted return=4.1278. What corrected value should replace it?

**Choices:**
- **A.** corrected discounted return = 4.491
- **B.** corrected discounted return = 3.8966
- **C.** corrected discounted return = 2.7078
- **D.** corrected discounted return = 3.3022

**Correct Answer:** corrected discounted return = 3.3022

**Explanation:** Recomputing with $\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}$ gives 3.3022, so the reported 4.1278 is rejected.

---

## Question 34

**Question:** For $Q(s,a)=1.6$, $\alpha=0.2$, r=1.7, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.24$, a student reports updated Q-value=2.673. What corrected value should replace it?

**Choices:**
- **A.** corrected updated Q-value = 2.1384
- **B.** corrected updated Q-value = 2.5233
- **C.** corrected updated Q-value = 1.7535
- **D.** corrected updated Q-value = 2.9082

**Correct Answer:** corrected updated Q-value = 2.1384

**Explanation:** Recomputing with $Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]$ gives 2.1384, so the reported 2.673 is rejected.

---

## Question 35

**Question:** For chromosome score=26, population average=16.4, a student reports relative GA fitness=1.9817. What corrected value should replace it?

**Choices:**
- **A.** corrected relative GA fitness = 2.1561
- **B.** corrected relative GA fitness = 1.8707
- **C.** corrected relative GA fitness = 1.3
- **D.** corrected relative GA fitness = 1.5854

**Correct Answer:** corrected relative GA fitness = 1.5854

**Explanation:** Recomputing with $\frac{g(c)}{A}$ gives 1.5854, so the reported 1.9817 is rejected.

---

## Question 36

**Question:** Compute first EM responsibility separately for (unnormalized component terms=['0.19', '0.152', '0.114']) and (unnormalized component terms=['0.12', '0.18', '0.1']), then average the two results.

**Choices:**
- **A.** mean of the two first EM responsibility values = 0.2873
- **B.** mean of the two first EM responsibility values = 0.4293
- **C.** mean of the two first EM responsibility values = 0.3583
- **D.** mean of the two first EM responsibility values = 0.5003

**Correct Answer:** mean of the two first EM responsibility values = 0.3583

**Explanation:** The individual results are 0.4167 and 0.3; their arithmetic mean is 0.3583.

---

## Question 37

**Question:** Compute updated EM mean separately for (x=[0, 2, 5], responsibilities=['0.34', '0.5', '0.73']) and (x=[0, 2, 5], responsibilities=['0.2', '0.5', '0.8']), then average the two results.

**Choices:**
- **A.** mean of the two updated EM mean values = 2.581
- **B.** mean of the two updated EM mean values = 3.7141
- **C.** mean of the two updated EM mean values = 3.1476
- **D.** mean of the two updated EM mean values = 4.2807

**Correct Answer:** mean of the two updated EM mean values = 3.1476

**Explanation:** The individual results are 2.9618 and 3.3333; their arithmetic mean is 3.1476.

---

## Question 38

**Question:** Compute discounted return separately for (rewards=['2.7', '-1', '4', '1'], $\gamma=0.54$) and (rewards=['2', '-1', '4', '1'], $\gamma=0.5$), then average the two results.

**Choices:**
- **A.** mean of the two discounted return values = 3.6042
- **B.** mean of the two discounted return values = 3.0544
- **C.** mean of the two discounted return values = 2.5046
- **D.** mean of the two discounted return values = 4.154

**Correct Answer:** mean of the two discounted return values = 3.0544

**Explanation:** The individual results are 3.4839 and 2.625; their arithmetic mean is 3.0544.

---

## Question 39

**Question:** Compute updated Q-value separately for ($Q(s,a)=1.7$, $\alpha=0.2$, r=1.65, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.28$) and ($Q(s,a)=1$, $\alpha=0.2$, r=2, $\gamma=0.8$, $\max_{a'}Q(s',a')=3$), then average the two results.

**Choices:**
- **A.** mean of the two updated Q-value values = 2.6485
- **B.** mean of the two updated Q-value values = 2.2979
- **C.** mean of the two updated Q-value values = 1.5969
- **D.** mean of the two updated Q-value values = 1.9474

**Correct Answer:** mean of the two updated Q-value values = 1.9474

**Explanation:** The individual results are 2.2148 and 1.68; their arithmetic mean is 1.9474.

---

## Question 40

**Question:** Compute relative GA fitness separately for (chromosome score=27, population average=16.8) and (chromosome score=20, population average=14), then average the two results.

**Choices:**
- **A.** mean of the two relative GA fitness values = 1.2446
- **B.** mean of the two relative GA fitness values = 1.7911
- **C.** mean of the two relative GA fitness values = 1.5179
- **D.** mean of the two relative GA fitness values = 2.0643

**Correct Answer:** mean of the two relative GA fitness values = 1.5179

**Explanation:** The individual results are 1.6071 and 1.4286; their arithmetic mean is 1.5179.

---

## Question 41

**Question:** After the data change from (unnormalized component terms=['0.2', '0.148', '0.116']) to (unnormalized component terms=['0.18', '0.156', '0.112']), what is the new first EM responsibility?

**Choices:**
- **A.** first EM responsibility = 0.4018
- **B.** first EM responsibility = 0.4741
- **C.** first EM responsibility = 0.3295
- **D.** first EM responsibility = 0.5464

**Correct Answer:** first EM responsibility = 0.4018

**Explanation:** Only the new data enter $\frac{\pi_1\mathcal{N}(x\mid\mu_1,\Sigma_1)}{\sum_k\pi_k\mathcal{N}(x\mid\mu_k,\Sigma_k)}$; they produce 0.4018.

---

## Question 42

**Question:** After the data change from (x=[0, 2, 5], responsibilities=['0.36', '0.5', '0.72']) to (x=[0, 2, 5], responsibilities=['0.32', '0.5', '0.74']), what is the new updated EM mean?

**Choices:**
- **A.** updated EM mean = 3.0128
- **B.** updated EM mean = 3.5551
- **C.** updated EM mean = 2.4705
- **D.** updated EM mean = 4.0974

**Correct Answer:** updated EM mean = 3.0128

**Explanation:** Only the new data enter $\frac{\sum_n r_nx_n}{\sum_n r_n}$; they produce 3.0128.

---

## Question 43

**Question:** After the data change from (rewards=['2.8', '-1', '4', '1'], $\gamma=0.56$) to (rewards=['2.6', '-1', '4', '1'], $\gamma=0.52$), what is the new discounted return?

**Choices:**
- **A.** discounted return = 3.8966
- **B.** discounted return = 3.3022
- **C.** discounted return = 2.7078
- **D.** discounted return = 4.491

**Correct Answer:** discounted return = 3.3022

**Explanation:** Only the new data enter $\sum_{k=0}^{\infty}\gamma^kR_{t+k+1}$; they produce 3.3022.

---

## Question 44

**Question:** After the data change from ($Q(s,a)=1.8$, $\alpha=0.2$, r=1.6, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.32$) to ($Q(s,a)=1.6$, $\alpha=0.2$, r=1.7, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.24$), what is the new updated Q-value?

**Choices:**
- **A.** updated Q-value = 1.7535
- **B.** updated Q-value = 2.5233
- **C.** updated Q-value = 2.1384
- **D.** updated Q-value = 2.9082

**Correct Answer:** updated Q-value = 2.1384

**Explanation:** Only the new data enter $Q(s,a)+\alpha\left[r+\gamma\max_{a'}Q(s',a')-Q(s,a)\right]$; they produce 2.1384.

---

## Question 45

**Question:** After the data change from (chromosome score=28, population average=17.2) to (chromosome score=26, population average=16.4), what is the new relative GA fitness?

**Choices:**
- **A.** relative GA fitness = 1.5854
- **B.** relative GA fitness = 1.8707
- **C.** relative GA fitness = 1.3
- **D.** relative GA fitness = 2.1561

**Correct Answer:** relative GA fitness = 1.5854

**Explanation:** Only the new data enter $\frac{g(c)}{A}$; they produce 1.5854.

---

## Question 46

**Question:** Rank P, Q, R, S from largest to smallest first EM responsibility: P(unnormalized component terms=['0.13', '0.176', '0.102']), Q(unnormalized component terms=['0.15', '0.168', '0.106']), R(unnormalized component terms=['0.18', '0.156', '0.112']), S(unnormalized component terms=['0.21', '0.144', '0.118']).

**Choices:**
- **A.** first EM responsibility ranking: S > R > Q > P
- **B.** first EM responsibility ranking: P > Q > R > S
- **C.** first EM responsibility ranking: P = Q = R = S
- **D.** first EM responsibility ranking: Q > P > S > R

**Correct Answer:** first EM responsibility ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.3186', 'Q': '0.3538', 'R': '0.4018', 'S': '0.4449'}; grouping equal values and sorting descending gives first EM responsibility ranking: S > R > Q > P.

---

## Question 47

**Question:** Rank P, Q, R, S from largest to smallest updated EM mean: P(x=[0, 2, 5], responsibilities=['0.22', '0.5', '0.79']), Q(x=[0, 2, 5], responsibilities=['0.26', '0.5', '0.77']), R(x=[0, 2, 5], responsibilities=['0.32', '0.5', '0.74']), S(x=[0, 2, 5], responsibilities=['0.38', '0.5', '0.71']).

**Choices:**
- **A.** updated EM mean ranking: P > Q > R > S
- **B.** updated EM mean ranking: S > R > Q > P
- **C.** updated EM mean ranking: P = Q = R = S
- **D.** updated EM mean ranking: Q > P > S > R

**Correct Answer:** updated EM mean ranking: P > Q > R > S

**Explanation:** Their values are {'P': '3.2781', 'Q': '3.1699', 'R': '3.0128', 'S': '2.8616'}; grouping equal values and sorting descending gives updated EM mean ranking: P > Q > R > S.

---

## Question 48

**Question:** Rank P, Q, R, S from largest to smallest discounted return: P(rewards=['2.1', '-1', '4', '1'], $\gamma=0.52$), Q(rewards=['2.3', '-1', '4', '1'], $\gamma=0.56$), R(rewards=['2.6', '-1', '4', '1'], $\gamma=0.52$), S(rewards=['2.9', '-1', '4', '1'], $\gamma=0.58$).

**Choices:**
- **A.** discounted return ranking: S > R > Q > P
- **B.** discounted return ranking: P > Q > R > S
- **C.** discounted return ranking: P = Q = R = S
- **D.** discounted return ranking: Q > P > S > R

**Correct Answer:** discounted return ranking: S > R > Q > P

**Explanation:** Their values are {'P': '2.8022', 'Q': '3.17', 'R': '3.3022', 'S': '3.8607'}; grouping equal values and sorting descending gives discounted return ranking: S > R > Q > P.

---

## Question 49

**Question:** Rank P, Q, R, S from largest to smallest updated Q-value: P($Q(s,a)=1.1$, $\alpha=0.2$, r=1.95, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.04$), Q($Q(s,a)=1.3$, $\alpha=0.2$, r=1.85, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.12$), R($Q(s,a)=1.6$, $\alpha=0.2$, r=1.7, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.24$), S($Q(s,a)=1.9$, $\alpha=0.2$, r=1.55, $\gamma=0.8$, $\max_{a'}Q(s',a')=3.36$).

**Choices:**
- **A.** updated Q-value ranking: S > R > Q > P
- **B.** updated Q-value ranking: P > Q > R > S
- **C.** updated Q-value ranking: P = Q = R = S
- **D.** updated Q-value ranking: Q > P > S > R

**Correct Answer:** updated Q-value ranking: S > R > Q > P

**Explanation:** Their values are {'P': '1.7564', 'Q': '1.9092', 'R': '2.1384', 'S': '2.3676'}; grouping equal values and sorting descending gives updated Q-value ranking: S > R > Q > P.

---

## Question 50

**Question:** Rank P, Q, R, S from largest to smallest relative GA fitness: P(chromosome score=21, population average=14.4), Q(chromosome score=23, population average=15.2), R(chromosome score=26, population average=16.4), S(chromosome score=29, population average=17.6).

**Choices:**
- **A.** relative GA fitness ranking: Q > P > S > R
- **B.** relative GA fitness ranking: P > Q > R > S
- **C.** relative GA fitness ranking: P = Q = R = S
- **D.** relative GA fitness ranking: S > R > Q > P

**Correct Answer:** relative GA fitness ranking: S > R > Q > P

**Explanation:** Their values are {'P': '1.4583', 'Q': '1.5132', 'R': '1.5854', 'S': '1.6477'}; grouping equal values and sorting descending gives relative GA fitness ranking: S > R > Q > P.

---

## Question 51

**Question:** Which statement correctly characterizes the E-step?

**Choices:**
- **A.** The E-step permanently assigns every point to one component.
- **B.** The E-step updates chromosomes by crossover.
- **C.** The E-step computes posterior responsibilities using the old parameters.
- **D.** The E-step ignores both mixing coefficients and Gaussian density. for all permitted parameter values

**Correct Answer:** The E-step computes posterior responsibilities using the old parameters.

**Explanation:** For the E-step, the accurate statement is the first one because Responsibilities are posterior weights over latent component labels.

---

## Question 52

**Question:** Which statement correctly characterizes the M-step?

**Choices:**
- **A.** The M-step replaces likelihood with Euclidean distance only. under every stated condition
- **B.** The M-step updates parameters using responsibility-weighted sufficient totals.
- **C.** The M-step keeps all parameters fixed by definition.
- **D.** The M-step chooses a reinforcement-learning action.

**Correct Answer:** The M-step updates parameters using responsibility-weighted sufficient totals.

**Explanation:** For the M-step, the accurate statement is the first one because Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 53

**Question:** Which statement correctly characterizes EM convergence?

**Choices:**
- **A.** Jensen's inequality removes every latent variable exactly.
- **B.** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.
- **C.** EM must reduce observed-data likelihood at each valid iteration.
- **D.** EM guarantees the same global solution from every initialization. without changing the supplied data

**Correct Answer:** EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.

**Explanation:** For EM convergence, the accurate statement is the first one because EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 54

**Question:** Which statement correctly characterizes discounted return?

**Choices:**
- **A.** Gamma is the probability of mutating a chromosome.
- **B.** A return includes only the immediately preceding reward.
- **C.** Gamma greater than one is required for every continuing task. for all permitted parameter values
- **D.** An RL return discounts rewards farther in the future by increasing powers of gamma.

**Correct Answer:** An RL return discounts rewards farther in the future by increasing powers of gamma.

**Explanation:** For discounted return, the accurate statement is the first one because G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 55

**Question:** Which statement correctly characterizes V versus Q?

**Choices:**
- **A.** $V(s)$ is a Gaussian covariance matrix.
- **B.** $Q(s,a)$ evaluates an action in a state, while $V(s)$ evaluates the state under a policy.
- **C.** $Q(s,a)$ records only the immediate reward and never future reward. under every stated condition
- **D.** A policy is the same object as a return scalar.

**Correct Answer:** $Q(s,a)$ evaluates an action in a state, while $V(s)$ evaluates the state under a policy.

**Explanation:** For V versus Q, the accurate statement is the first one because The conditioning distinguishes state value from action value.

---

## Question 56

**Question:** Which statement correctly characterizes the Q-learning target?

**Choices:**
- **A.** Q-learning targets the minimum action value in the current state.
- **B.** Q-learning updates every state-action pair to the same reward.
- **C.** Q-learning replaces alpha with a crossover point.
- **D.** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Correct Answer:** Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Explanation:** For the Q-learning target, the accurate statement is the first one because The supplied update uses the best estimated next action.

---

## Question 57

**Question:** Which statement correctly characterizes exploration versus exploitation?

**Choices:**
- **A.** Exploration and exploitation are identical policies.
- **B.** Exploration is possible only after an episode terminates.
- **C.** Exploitation means selecting an action uniformly at random. for all permitted parameter values
- **D.** Exploration tests alternatives; exploitation chooses the best-known action.

**Correct Answer:** Exploration tests alternatives; exploitation chooses the best-known action.

**Explanation:** For exploration versus exploitation, the accurate statement is the first one because Their tension concerns information gathering versus current reward.

---

## Question 58

**Question:** Which statement correctly characterizes GA operator roles?

**Choices:**
- **A.** Mutation must occur with probability greater than 50%.
- **B.** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.
- **C.** Selection flips every bit and crossover evaluates fitness. under every stated condition under the complete set of stated assumptions
- **D.** Crossover guarantees a globally optimal child.

**Correct Answer:** Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Explanation:** For GA operator roles, the accurate statement is the first one because These are distinct stages of the classical GA loop.

---

## Question 59

**Question:** Which statement correctly characterizes fractional expected copies?

**Choices:**
- **A.** The fractional part is discarded with no chance of a copy.
- **B.** Relative fitness 1.47 guarantees exactly two copies.
- **C.** Fitness 1.47 means the chromosome mutates 147% of its genes. without changing the supplied data under the complete set of stated assumptions
- **D.** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Correct Answer:** A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Explanation:** For fractional expected copies, the accurate statement is the first one because The example interprets integer and fractional expected copies separately.

---

## Question 60

**Question:** Which statement correctly characterizes mutation and local maxima?

**Choices:**
- **A.** Mutation probability must be exactly zero after crossover.
- **B.** Mutation always preserves every gene unchanged.
- **C.** Mutation is equivalent to selecting the current best individual. for all permitted parameter values
- **D.** Mutation can help a GA escape a local maximum by restoring variation.

**Correct Answer:** Mutation can help a GA escape a local maximum by restoring variation.

**Explanation:** For mutation and local maxima, the accurate statement is the first one because Occasional random changes explore regions absent from current recombinations.

---

## Question 61

**Question:** A student writes, “The E-step permanently assigns every point to one component.” Which replacement correctly repairs the claim about the E-step?

**Choices:**
- **A.** Replace it with: The E-step updates chromosomes by crossover.
- **B.** Replace it with: The E-step computes posterior responsibilities using the old parameters.
- **C.** Replace it with: The E-step permanently assigns every point to one component.
- **D.** Replace it with: The E-step ignores both mixing coefficients and Gaussian density. under every stated condition

**Correct Answer:** Replace it with: The E-step computes posterior responsibilities using the old parameters.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Responsibilities are posterior weights over latent component labels.

---

## Question 62

**Question:** A student writes, “The M-step chooses a reinforcement-learning action.” Which replacement correctly repairs the claim about the M-step?

**Choices:**
- **A.** Replace it with: The M-step replaces likelihood with Euclidean distance only. without changing the supplied data
- **B.** Replace it with: The M-step chooses a reinforcement-learning action.
- **C.** Replace it with: The M-step keeps all parameters fixed by definition.
- **D.** Replace it with: The M-step updates parameters using responsibility-weighted sufficient totals.

**Correct Answer:** Replace it with: The M-step updates parameters using responsibility-weighted sufficient totals.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 63

**Question:** A student writes, “EM guarantees the same global solution from every initialization.” Which replacement correctly repairs the claim about EM convergence?

**Choices:**
- **A.** Replace it with: EM guarantees the same global solution from every initialization. for all permitted parameter values
- **B.** Replace it with: EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.
- **C.** Replace it with: EM must reduce observed-data likelihood at each valid iteration.
- **D.** Replace it with: Jensen's inequality removes every latent variable exactly.

**Correct Answer:** Replace it with: EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 64

**Question:** A student writes, “A return includes only the immediately preceding reward.” Which replacement correctly repairs the claim about discounted return?

**Choices:**
- **A.** Replace it with: An RL return discounts rewards farther in the future by increasing powers of gamma.
- **B.** Replace it with: A return includes only the immediately preceding reward.
- **C.** Replace it with: Gamma is the probability of mutating a chromosome.
- **D.** Replace it with: Gamma greater than one is required for every continuing task. under every stated condition

**Correct Answer:** Replace it with: An RL return discounts rewards farther in the future by increasing powers of gamma.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 65

**Question:** A student writes, “$V(s)$ is a Gaussian covariance matrix.” Which replacement correctly repairs the claim about V versus Q?

**Choices:**
- **A.** Replace it with: $V(s)$ is a Gaussian covariance matrix.
- **B.** Replace it with: $Q(s,a)$ records only the immediate reward and never future reward. without changing the supplied data
- **C.** Replace it with: $Q(s,a)$ evaluates an action in a state, while $V(s)$ evaluates the state under a policy.
- **D.** Replace it with: A policy is the same object as a return scalar.

**Correct Answer:** Replace it with: $Q(s,a)$ evaluates an action in a state, while $V(s)$ evaluates the state under a policy.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The conditioning distinguishes state value from action value.

---

## Question 66

**Question:** A student writes, “Q-learning targets the minimum action value in the current state.” Which replacement correctly repairs the claim about the Q-learning target?

**Choices:**
- **A.** Replace it with: Q-learning targets the minimum action value in the current state.
- **B.** Replace it with: Q-learning updates every state-action pair to the same reward.
- **C.** Replace it with: Q-learning replaces alpha with a crossover point.
- **D.** Replace it with: Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Correct Answer:** Replace it with: Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The supplied update uses the best estimated next action.

---

## Question 67

**Question:** A student writes, “Exploration and exploitation are identical policies.” Which replacement correctly repairs the claim about exploration versus exploitation?

**Choices:**
- **A.** Replace it with: Exploration and exploitation are identical policies.
- **B.** Replace it with: Exploration tests alternatives; exploitation chooses the best-known action.
- **C.** Replace it with: Exploitation means selecting an action uniformly at random. under every stated condition
- **D.** Replace it with: Exploration is possible only after an episode terminates.

**Correct Answer:** Replace it with: Exploration tests alternatives; exploitation chooses the best-known action.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Their tension concerns information gathering versus current reward.

---

## Question 68

**Question:** A student writes, “Selection flips every bit and crossover evaluates fitness.” Which replacement correctly repairs the claim about GA operator roles?

**Choices:**
- **A.** Replace it with: Crossover guarantees a globally optimal child.
- **B.** Replace it with: Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.
- **C.** Replace it with: Mutation must occur with probability greater than 50%.
- **D.** Replace it with: Selection flips every bit and crossover evaluates fitness. without changing the supplied data under the complete set of stated assumptions

**Correct Answer:** Replace it with: Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because These are distinct stages of the classical GA loop.

---

## Question 69

**Question:** A student writes, “Relative fitness 1.47 guarantees exactly two copies.” Which replacement correctly repairs the claim about fractional expected copies?

**Choices:**
- **A.** Replace it with: Fitness 1.47 means the chromosome mutates 147% of its genes. for all permitted parameter values under the complete set of stated assumptions
- **B.** Replace it with: Relative fitness 1.47 guarantees exactly two copies.
- **C.** Replace it with: A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.
- **D.** Replace it with: The fractional part is discarded with no chance of a copy.

**Correct Answer:** Replace it with: A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The example interprets integer and fractional expected copies separately.

---

## Question 70

**Question:** A student writes, “Mutation always preserves every gene unchanged.” Which replacement correctly repairs the claim about mutation and local maxima?

**Choices:**
- **A.** Replace it with: Mutation always preserves every gene unchanged.
- **B.** Replace it with: Mutation can help a GA escape a local maximum by restoring variation.
- **C.** Replace it with: Mutation is equivalent to selecting the current best individual. under every stated condition
- **D.** Replace it with: Mutation probability must be exactly zero after crossover.

**Correct Answer:** Replace it with: Mutation can help a GA escape a local maximum by restoring variation.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Occasional random changes explore regions absent from current recombinations.

---

## Question 71

**Question:** A student's answer about the E-step contains the claim “The E-step permanently assigns every point to one component.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about the E-step is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns the E-step but is only a harmless change of notation
- **D.** The quoted claim about the E-step is false and must be replaced

**Correct Answer:** The quoted claim about the E-step is false and must be replaced

**Explanation:** The quoted claim contradicts the E-step; it must be replaced by the chapter's stated rule.

---

## Question 72

**Question:** A student's answer about the M-step contains the claim “The M-step chooses a reinforcement-learning action.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about the M-step is false and must be replaced
- **B.** The quoted claim about the M-step is correct without qualification
- **C.** The quoted claim concerns the M-step but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about the M-step is false and must be replaced

**Explanation:** The quoted claim contradicts the M-step; it must be replaced by the chapter's stated rule.

---

## Question 73

**Question:** A student's answer about EM convergence contains the claim “EM guarantees the same global solution from every initialization.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about EM convergence is false and must be replaced
- **B.** The quoted claim about EM convergence is correct without qualification
- **C.** The quoted claim concerns EM convergence but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about EM convergence is false and must be replaced

**Explanation:** The quoted claim contradicts EM convergence; it must be replaced by the chapter's stated rule.

---

## Question 74

**Question:** A student's answer about discounted return contains the claim “A return includes only the immediately preceding reward.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about discounted return is correct without qualification
- **C.** The quoted claim concerns discounted return but is only a harmless change of notation
- **D.** The quoted claim about discounted return is false and must be replaced

**Correct Answer:** The quoted claim about discounted return is false and must be replaced

**Explanation:** The quoted claim contradicts discounted return; it must be replaced by the chapter's stated rule.

---

## Question 75

**Question:** A student's answer about V versus Q contains the claim “$V(s)$ is a Gaussian covariance matrix.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns V versus Q but is only a harmless change of notation
- **B.** The quoted claim about V versus Q is correct without qualification
- **C.** The quoted claim becomes correct merely by changing the dataset size
- **D.** The quoted claim about V versus Q is false and must be replaced

**Correct Answer:** The quoted claim about V versus Q is false and must be replaced

**Explanation:** The quoted claim contradicts V versus Q; it must be replaced by $Q(s,a)$ evaluates an action in a state, while $V(s)$ evaluates the state under a policy..

---

## Question 76

**Question:** A student's answer about the Q-learning target contains the claim “Q-learning targets the minimum action value in the current state.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about the Q-learning target is false and must be replaced
- **C.** The quoted claim concerns the Q-learning target but is only a harmless change of notation
- **D.** The quoted claim about the Q-learning target is correct without qualification

**Correct Answer:** The quoted claim about the Q-learning target is false and must be replaced

**Explanation:** The quoted claim contradicts the Q-learning target; it must be replaced by Q-learning bootstraps toward r+gamma max_a' Q(s',a')..

---

## Question 77

**Question:** A student's answer about exploration versus exploitation contains the claim “Exploration and exploitation are identical policies.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about exploration versus exploitation is false and must be replaced
- **B.** The quoted claim about exploration versus exploitation is correct without qualification
- **C.** The quoted claim concerns exploration versus exploitation but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about exploration versus exploitation is false and must be replaced

**Explanation:** The quoted claim contradicts exploration versus exploitation; it must be replaced by Exploration tests alternatives; exploitation chooses the best-known action..

---

## Question 78

**Question:** A student's answer about GA operator roles contains the claim “Selection flips every bit and crossover evaluates fitness.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about GA operator roles is false and must be replaced
- **B.** The quoted claim about GA operator roles is correct without qualification
- **C.** The quoted claim concerns GA operator roles but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about GA operator roles is false and must be replaced

**Explanation:** The quoted claim contradicts GA operator roles; it must be replaced by the chapter's stated rule.

---

## Question 79

**Question:** A student's answer about fractional expected copies contains the claim “Relative fitness 1.47 guarantees exactly two copies.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about fractional expected copies is correct without qualification
- **C.** The quoted claim concerns fractional expected copies but is only a harmless change of notation
- **D.** The quoted claim about fractional expected copies is false and must be replaced

**Correct Answer:** The quoted claim about fractional expected copies is false and must be replaced

**Explanation:** The quoted claim contradicts fractional expected copies; it must be replaced by A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme..

---

## Question 80

**Question:** A student's answer about mutation and local maxima contains the claim “Mutation always preserves every gene unchanged.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns mutation and local maxima but is only a harmless change of notation
- **B.** The quoted claim about mutation and local maxima is correct without qualification
- **C.** The quoted claim about mutation and local maxima is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about mutation and local maxima is false and must be replaced

**Explanation:** The quoted claim contradicts mutation and local maxima; it must be replaced by the chapter's stated rule.

---

## Question 81

**Question:** An implementation is designed around the rule “The E-step updates chromosomes by crossover.” Which principle exposes the design error concerning the E-step?

**Choices:**
- **A.** Required principle: The E-step permanently assigns every point to one component.
- **B.** Required principle: The E-step computes posterior responsibilities using the old parameters.
- **C.** Required principle: The E-step updates chromosomes by crossover.
- **D.** Required principle: The E-step ignores both mixing coefficients and Gaussian density. for all permitted parameter values

**Correct Answer:** Required principle: The E-step computes posterior responsibilities using the old parameters.

**Explanation:** The implementation encodes a false rule. The required principle follows because Responsibilities are posterior weights over latent component labels.

---

## Question 82

**Question:** An implementation is designed around the rule “The M-step keeps all parameters fixed by definition.” Which principle exposes the design error concerning the M-step?

**Choices:**
- **A.** Required principle: The M-step chooses a reinforcement-learning action.
- **B.** Required principle: The M-step replaces likelihood with Euclidean distance only. under every stated condition
- **C.** Required principle: The M-step keeps all parameters fixed by definition.
- **D.** Required principle: The M-step updates parameters using responsibility-weighted sufficient totals.

**Correct Answer:** Required principle: The M-step updates parameters using responsibility-weighted sufficient totals.

**Explanation:** The implementation encodes a false rule. The required principle follows because Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 83

**Question:** An implementation is designed around the rule “EM must reduce observed-data likelihood at each valid iteration.” Which principle exposes the design error concerning EM convergence?

**Choices:**
- **A.** Required principle: EM must reduce observed-data likelihood at each valid iteration.
- **B.** Required principle: EM guarantees the same global solution from every initialization. without changing the supplied data
- **C.** Required principle: EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.
- **D.** Required principle: Jensen's inequality removes every latent variable exactly.

**Correct Answer:** Required principle: EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.

**Explanation:** The implementation encodes a false rule. The required principle follows because EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 84

**Question:** An implementation is designed around the rule “Gamma is the probability of mutating a chromosome.” Which principle exposes the design error concerning discounted return?

**Choices:**
- **A.** Required principle: An RL return discounts rewards farther in the future by increasing powers of gamma.
- **B.** Required principle: A return includes only the immediately preceding reward.
- **C.** Required principle: Gamma is the probability of mutating a chromosome.
- **D.** Required principle: Gamma greater than one is required for every continuing task. for all permitted parameter values

**Correct Answer:** Required principle: An RL return discounts rewards farther in the future by increasing powers of gamma.

**Explanation:** The implementation encodes a false rule. The required principle follows because G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 85

**Question:** An implementation is designed around the rule “$Q(s,a)$ records only the immediate reward and never future reward.” Which principle exposes the design error concerning V versus Q?

**Choices:**
- **A.** Required principle: $Q(s,a)$ records only the immediate reward and never future reward. under every stated condition
- **B.** Required principle: $Q(s,a)$ evaluates an action in a state, while $V(s)$ evaluates the state under a policy.
- **C.** Required principle: $V(s)$ is a Gaussian covariance matrix.
- **D.** Required principle: A policy is the same object as a return scalar.

**Correct Answer:** Required principle: $Q(s,a)$ evaluates an action in a state, while $V(s)$ evaluates the state under a policy.

**Explanation:** The implementation encodes a false rule. The required principle follows because The conditioning distinguishes state value from action value.

---

## Question 86

**Question:** An implementation is designed around the rule “Q-learning replaces alpha with a crossover point.” Which principle exposes the design error concerning the Q-learning target?

**Choices:**
- **A.** Required principle: Q-learning replaces alpha with a crossover point.
- **B.** Required principle: Q-learning bootstraps toward r+gamma max_a' Q(s',a').
- **C.** Required principle: Q-learning targets the minimum action value in the current state.
- **D.** Required principle: Q-learning updates every state-action pair to the same reward.

**Correct Answer:** Required principle: Q-learning bootstraps toward r+gamma max_a' Q(s',a').

**Explanation:** The implementation encodes a false rule. The required principle follows because The supplied update uses the best estimated next action.

---

## Question 87

**Question:** An implementation is designed around the rule “Exploitation means selecting an action uniformly at random.” Which principle exposes the design error concerning exploration versus exploitation?

**Choices:**
- **A.** Required principle: Exploration is possible only after an episode terminates.
- **B.** Required principle: Exploration and exploitation are identical policies.
- **C.** Required principle: Exploitation means selecting an action uniformly at random. for all permitted parameter values
- **D.** Required principle: Exploration tests alternatives; exploitation chooses the best-known action.

**Correct Answer:** Required principle: Exploration tests alternatives; exploitation chooses the best-known action.

**Explanation:** The implementation encodes a false rule. The required principle follows because Their tension concerns information gathering versus current reward.

---

## Question 88

**Question:** An implementation is designed around the rule “Mutation must occur with probability greater than 50%.” Which principle exposes the design error concerning GA operator roles?

**Choices:**
- **A.** Required principle: Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.
- **B.** Required principle: Selection flips every bit and crossover evaluates fitness. under every stated condition under the complete set of stated assumptions
- **C.** Required principle: Mutation must occur with probability greater than 50%.
- **D.** Required principle: Crossover guarantees a globally optimal child.

**Correct Answer:** Required principle: Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.

**Explanation:** The implementation encodes a false rule. The required principle follows because These are distinct stages of the classical GA loop.

---

## Question 89

**Question:** An implementation is designed around the rule “The fractional part is discarded with no chance of a copy.” Which principle exposes the design error concerning fractional expected copies?

**Choices:**
- **A.** Required principle: The fractional part is discarded with no chance of a copy.
- **B.** Required principle: Relative fitness 1.47 guarantees exactly two copies.
- **C.** Required principle: A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.
- **D.** Required principle: Fitness 1.47 means the chromosome mutates 147% of its genes. without changing the supplied data under the complete set of stated assumptions

**Correct Answer:** Required principle: A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.

**Explanation:** The implementation encodes a false rule. The required principle follows because The example interprets integer and fractional expected copies separately.

---

## Question 90

**Question:** An implementation is designed around the rule “Mutation is equivalent to selecting the current best individual.” Which principle exposes the design error concerning mutation and local maxima?

**Choices:**
- **A.** Required principle: Mutation can help a GA escape a local maximum by restoring variation.
- **B.** Required principle: Mutation always preserves every gene unchanged.
- **C.** Required principle: Mutation is equivalent to selecting the current best individual. for all permitted parameter values
- **D.** Required principle: Mutation probability must be exactly zero after crossover.

**Correct Answer:** Required principle: Mutation can help a GA escape a local maximum by restoring variation.

**Explanation:** The implementation encodes a false rule. The required principle follows because Occasional random changes explore regions absent from current recombinations.

---

## Question 91

**Question:** Reviewer A states, “The E-step computes posterior responsibilities using the old parameters.” Reviewer B states, “The E-step ignores both mixing coefficients and Gaussian density.” What is the correct verdict about the E-step?

**Choices:**
- **A.** Both reviewers are correct about the E-step
- **B.** Reviewer B only is correct about the E-step
- **C.** Reviewer A only is correct about the E-step
- **D.** Neither reviewer is correct about the E-step

**Correct Answer:** Reviewer A only is correct about the E-step

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Responsibilities are posterior weights over latent component labels.

---

## Question 92

**Question:** Reviewer A states, “The M-step updates parameters using responsibility-weighted sufficient totals.” Reviewer B states, “The M-step replaces likelihood with Euclidean distance only.” What is the correct verdict about the M-step?

**Choices:**
- **A.** Neither reviewer is correct about the M-step
- **B.** Reviewer B only is correct about the M-step
- **C.** Reviewer A only is correct about the M-step
- **D.** Both reviewers are correct about the M-step

**Correct Answer:** Reviewer A only is correct about the M-step

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Nk and weighted sums produce new means, covariances, and mixing weights.

---

## Question 93

**Question:** Reviewer A states, “EM iteratively improves a likelihood lower-bound objective but need not find a global optimum.” Reviewer B states, “Jensen's inequality removes every latent variable exactly.” What is the correct verdict about EM convergence?

**Choices:**
- **A.** Reviewer B only is correct about EM convergence
- **B.** Reviewer A only is correct about EM convergence
- **C.** Both reviewers are correct about EM convergence
- **D.** Neither reviewer is correct about EM convergence

**Correct Answer:** Reviewer A only is correct about EM convergence

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, EM is monotonic under proper steps but initialization can lead to different local solutions.

---

## Question 94

**Question:** Reviewer A states, “An RL return discounts rewards farther in the future by increasing powers of gamma.” Reviewer B states, “Gamma greater than one is required for every continuing task.” What is the correct verdict about discounted return?

**Choices:**
- **A.** Reviewer B only is correct about discounted return
- **B.** Neither reviewer is correct about discounted return
- **C.** Both reviewers are correct about discounted return
- **D.** Reviewer A only is correct about discounted return

**Correct Answer:** Reviewer A only is correct about discounted return

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, G_t sums future rewards with gamma^0, gamma^1, and so on.

---

## Question 95

**Question:** Reviewer A states, “$Q(s,a)$ evaluates an action in a state, while $V(s)$ evaluates the state under a policy.” Reviewer B states, “A policy is the same object as a return scalar.” What is the correct verdict about V versus Q?

**Choices:**
- **A.** Neither reviewer is correct about V versus Q
- **B.** Reviewer B only is correct about V versus Q
- **C.** Reviewer A only is correct about V versus Q
- **D.** Both reviewers are correct about V versus Q

**Correct Answer:** Reviewer A only is correct about V versus Q

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The conditioning distinguishes state value from action value.

---

## Question 96

**Question:** Reviewer A states, “Q-learning bootstraps toward r+gamma max_a' Q(s',a').” Reviewer B states, “Q-learning updates every state-action pair to the same reward.” What is the correct verdict about the Q-learning target?

**Choices:**
- **A.** Reviewer A only is correct about the Q-learning target
- **B.** Reviewer B only is correct about the Q-learning target
- **C.** Both reviewers are correct about the Q-learning target
- **D.** Neither reviewer is correct about the Q-learning target

**Correct Answer:** Reviewer A only is correct about the Q-learning target

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The supplied update uses the best estimated next action.

---

## Question 97

**Question:** Reviewer A states, “Exploration tests alternatives; exploitation chooses the best-known action.” Reviewer B states, “Exploration is possible only after an episode terminates.” What is the correct verdict about exploration versus exploitation?

**Choices:**
- **A.** Reviewer A only is correct about exploration versus exploitation
- **B.** Reviewer B only is correct about exploration versus exploitation
- **C.** Both reviewers are correct about exploration versus exploitation
- **D.** Neither reviewer is correct about exploration versus exploitation

**Correct Answer:** Reviewer A only is correct about exploration versus exploitation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Their tension concerns information gathering versus current reward.

---

## Question 98

**Question:** Reviewer A states, “Selection favors candidates by fitness, crossover recombines parents, and mutation introduces random changes.” Reviewer B states, “Crossover guarantees a globally optimal child.” What is the correct verdict about GA operator roles?

**Choices:**
- **A.** Reviewer B only is correct about GA operator roles
- **B.** Reviewer A only is correct about GA operator roles
- **C.** Both reviewers are correct about GA operator roles
- **D.** Neither reviewer is correct about GA operator roles

**Correct Answer:** Reviewer A only is correct about GA operator roles

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, These are distinct stages of the classical GA loop.

---

## Question 99

**Question:** Reviewer A states, “A chromosome with relative fitness 1.47 gets one guaranteed copy and a 0.47 chance of another under the stated scheme.” Reviewer B states, “Fitness 1.47 means the chromosome mutates 147% of its genes.” What is the correct verdict about fractional expected copies?

**Choices:**
- **A.** Both reviewers are correct about fractional expected copies
- **B.** Reviewer B only is correct about fractional expected copies
- **C.** Reviewer A only is correct about fractional expected copies
- **D.** Neither reviewer is correct about fractional expected copies

**Correct Answer:** Reviewer A only is correct about fractional expected copies

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The example interprets integer and fractional expected copies separately.

---

## Question 100

**Question:** Reviewer A states, “Mutation can help a GA escape a local maximum by restoring variation.” Reviewer B states, “Mutation probability must be exactly zero after crossover.” What is the correct verdict about mutation and local maxima?

**Choices:**
- **A.** Reviewer B only is correct about mutation and local maxima
- **B.** Neither reviewer is correct about mutation and local maxima
- **C.** Both reviewers are correct about mutation and local maxima
- **D.** Reviewer A only is correct about mutation and local maxima

**Correct Answer:** Reviewer A only is correct about mutation and local maxima

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Occasional random changes explore regions absent from current recombinations.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Questions were audited for structural balance, verbatim reuse, and parameter-only duplicate prompts.
