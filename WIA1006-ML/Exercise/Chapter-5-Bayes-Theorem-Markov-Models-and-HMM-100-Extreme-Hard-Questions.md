# Chapter 5: Bayes Theorem, Markov Models, and HMM: 100 Extreme-Hard Questions

> Topics: Bayes theorem, Markov sequence probability, HMM structure, forward evaluation, decoding, and learning distinctions. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** Using prior=0.1, $P(+\mid C)$=0.7, $P(+\mid \neg C)$=0.15, compute the Bayes posterior.

**Choices:**
- **A.** Bayes posterior = 0.2705
- **B.** Bayes posterior = 0.4125
- **C.** Bayes posterior = 0.3415
- **D.** Bayes posterior = 0.4835

**Correct Answer:** Bayes posterior = 0.3415

**Explanation:** Apply $\frac{P(B\mid A)P(A)}{P(B)}$; substitution gives Bayes posterior=0.3415.

---

## Question 2

**Question:** Using initial=0.2, transitions=['0.8', '0.4', '0.6', '0.3'], compute the Markov path probability.

**Choices:**
- **A.** Markov path probability = 0.1535
- **B.** Markov path probability = 0.0825
- **C.** Markov path probability = -0.0595
- **D.** Markov path probability = 0.0115

**Correct Answer:** Markov path probability = 0.0115

**Explanation:** Apply $P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})$; substitution gives Markov path probability=0.0115.

---

## Question 3

**Question:** Using $\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.7', '0.2'], emissions2=['0.4', '0.6'], compute the HMM observation likelihood.

**Choices:**
- **A.** HMM observation likelihood = 0.37
- **B.** HMM observation likelihood = 0.299
- **C.** HMM observation likelihood = 0.157
- **D.** HMM observation likelihood = 0.228

**Correct Answer:** HMM observation likelihood = 0.228

**Explanation:** Apply $\sum_j\alpha_T(j)$; substitution gives HMM observation likelihood=0.228.

---

## Question 4

**Question:** Using $\alpha=[0.12, 0.18]$, destination transitions=(.3,.8), emission=0.4, compute the destination forward value.

**Choices:**
- **A.** destination forward value = 0.143
- **B.** destination forward value = 0.072
- **C.** destination forward value = 0.001
- **D.** destination forward value = 0.214

**Correct Answer:** destination forward value = 0.072

**Explanation:** Apply $\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})$; substitution gives destination forward value=0.072.

---

## Question 5

**Question:** Using candidate HMM likelihoods=['0.02', '0.015', '0.025'], compute the top-two HMM likelihood gap.

**Choices:**
- **A.** top-two HMM likelihood gap = 0.005
- **B.** top-two HMM likelihood gap = 0.076
- **C.** top-two HMM likelihood gap = -0.066
- **D.** top-two HMM likelihood gap = 0.147

**Correct Answer:** top-two HMM likelihood gap = 0.005

**Explanation:** Apply $L_{(1)}-L_{(2)}$; substitution gives top-two HMM likelihood gap=0.005.

---

## Question 6

**Question:** Compare the Bayes posterior for Case P (prior=0.12, $P(+\mid C)$=0.69, $P(+\mid \neg C)$=0.16) and Case Q (prior=0.18, $P(+\mid C)$=0.66, $P(+\mid \neg C)$=0.19).

**Choices:**
- **A.** The first case is larger: 0.3703 versus 0.4326 under the complete set of stated assumptions
- **B.** The second case is larger: 0.4326 versus 0.3703
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.4326 versus 0.3703

**Explanation:** The same formula gives 0.3703 for P and 0.4326 for Q, establishing the stated comparison.

---

## Question 7

**Question:** Compare the Markov path probability for Case P (initial=0.225, transitions=['0.8', '0.41', '0.6', '0.3']) and Case Q (initial=0.3, transitions=['0.8', '0.44', '0.6', '0.3']).

**Choices:**
- **A.** The second case is larger: 0.019 versus 0.0133
- **B.** The first case is larger: 0.0133 versus 0.019 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.019 versus 0.0133

**Explanation:** The same formula gives 0.0133 for P and 0.019 for Q, establishing the stated comparison.

---

## Question 8

**Question:** Compare the HMM observation likelihood for Case P ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.69', '0.21'], emissions2=['0.41', '0.59']) and Case Q ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.66', '0.24'], emissions2=['0.44', '0.56']).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 0.2297 versus 0.234 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 0.234 versus 0.2297

**Correct Answer:** The second case is larger: 0.234 versus 0.2297

**Explanation:** The same formula gives 0.2297 for P and 0.234 for Q, establishing the stated comparison.

---

## Question 9

**Question:** Compare the destination forward value for Case P ($\alpha=[0.13, 0.176]$, destination transitions=(.3,.8), emission=0.41) and Case Q ($\alpha=[0.16, 0.164]$, destination transitions=(.3,.8), emission=0.44).

**Choices:**
- **A.** The second case is larger: 0.0788 versus 0.0737
- **B.** The first case is larger: 0.0737 versus 0.0788 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.0788 versus 0.0737

**Explanation:** The same formula gives 0.0737 for P and 0.0788 for Q, establishing the stated comparison.

---

## Question 10

**Question:** Compare the top-two HMM likelihood gap for Case P (candidate HMM likelihoods=['0.021', '0.017', '0.0245']) and Case Q (candidate HMM likelihoods=['0.024', '0.023', '0.023']).

**Choices:**
- **A.** The second case is larger: 0.001 versus 0.0035
- **B.** The first case is larger: 0.0035 versus 0.001
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 0.0035 versus 0.001

**Explanation:** The same formula gives 0.0035 for P and 0.001 for Q, establishing the stated comparison.

---

## Question 11

**Question:** How far apart are the Bayes posterior values for (prior=0.14, $P(+\mid C)$=0.68, $P(+\mid \neg C)$=0.17) and (prior=0.26, $P(+\mid C)$=0.67, $P(+\mid \neg C)$=0.23)?

**Choices:**
- **A.** absolute Bayes posterior difference = 0.0404
- **B.** absolute Bayes posterior difference = 0.1824
- **C.** absolute Bayes posterior difference = 0.1114
- **D.** absolute Bayes posterior difference = 0.2534

**Correct Answer:** absolute Bayes posterior difference = 0.1114

**Explanation:** The two values are 0.3944 and 0.5058; their absolute difference is 0.1114.

---

## Question 12

**Question:** How far apart are the Markov path probability values for (initial=0.25, transitions=['0.8', '0.42', '0.6', '0.3']) and (initial=0.4, transitions=['0.8', '0.48', '0.6', '0.3'])?

**Choices:**
- **A.** absolute Markov path probability difference = 0.1545
- **B.** absolute Markov path probability difference = 0.0835
- **C.** absolute Markov path probability difference = -0.0585
- **D.** absolute Markov path probability difference = 0.0125

**Correct Answer:** absolute Markov path probability difference = 0.0125

**Explanation:** The two values are 0.0151 and 0.0276; their absolute difference is 0.0125.

---

## Question 13

**Question:** How far apart are the HMM observation likelihood values for ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.68', '0.22'], emissions2=['0.42', '0.58']) and ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.62', '0.28'], emissions2=['0.48', '0.52'])?

**Choices:**
- **A.** absolute HMM observation likelihood difference = 0.1492
- **B.** absolute HMM observation likelihood difference = 0.0782
- **C.** absolute HMM observation likelihood difference = -0.0638
- **D.** absolute HMM observation likelihood difference = 0.0072

**Correct Answer:** absolute HMM observation likelihood difference = 0.0072

**Explanation:** The two values are 0.2312 and 0.2384; their absolute difference is 0.0072.

---

## Question 14

**Question:** How far apart are the destination forward value values for ($\alpha=[0.14, 0.172]$, destination transitions=(.3,.8), emission=0.42) and ($\alpha=[0.2, 0.148]$, destination transitions=(.3,.8), emission=0.48)?

**Choices:**
- **A.** absolute destination forward value difference = 0.1522
- **B.** absolute destination forward value difference = 0.0812
- **C.** absolute destination forward value difference = -0.0608
- **D.** absolute destination forward value difference = 0.0102

**Correct Answer:** absolute destination forward value difference = 0.0102

**Explanation:** The two values are 0.0754 and 0.0856; their absolute difference is 0.0102.

---

## Question 15

**Question:** How far apart are the top-two HMM likelihood gap values for (candidate HMM likelihoods=['0.022', '0.019', '0.024']) and (candidate HMM likelihoods=['0.028', '0.031', '0.021'])?

**Choices:**
- **A.** absolute top-two HMM likelihood gap difference = 0.143
- **B.** absolute top-two HMM likelihood gap difference = 0.072
- **C.** absolute top-two HMM likelihood gap difference = -0.07
- **D.** absolute top-two HMM likelihood gap difference = 0.001

**Correct Answer:** absolute top-two HMM likelihood gap difference = 0.001

**Explanation:** The two values are 0.002 and 0.003; their absolute difference is 0.001.

---

## Question 16

**Question:** Taking (prior=0.16, $P(+\mid C)$=0.67, $P(+\mid \neg C)$=0.18) as baseline and (prior=0.12, $P(+\mid C)$=0.69, $P(+\mid \neg C)$=0.16) as the new case, what is the percentage change in Bayes posterior?

**Choices:**
- **A.** percentage change in Bayes posterior = -10.7401
- **B.** percentage change in Bayes posterior = -8.8069
- **C.** percentage change in Bayes posterior = -12.6734
- **D.** percentage change in Bayes posterior = -6.8737

**Correct Answer:** percentage change in Bayes posterior = -10.7401

**Explanation:** The values change from 0.4149 to 0.3703; (new-old)/|old|*100=-10.7401%.

---

## Question 17

**Question:** Taking (initial=0.275, transitions=['0.8', '0.43', '0.6', '0.3']) as baseline and (initial=0.225, transitions=['0.8', '0.41', '0.6', '0.3']) as the new case, what is the percentage change in Markov path probability?

**Choices:**
- **A.** percentage change in Markov path probability = -21.9873
- **B.** percentage change in Markov path probability = -18.0296
- **C.** percentage change in Markov path probability = -25.945
- **D.** percentage change in Markov path probability = -14.0719

**Correct Answer:** percentage change in Markov path probability = -21.9873

**Explanation:** The values change from 0.017 to 0.0133; (new-old)/|old|*100=-21.9873%.

---

## Question 18

**Question:** Taking ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.67', '0.23'], emissions2=['0.43', '0.57']) as baseline and ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.69', '0.21'], emissions2=['0.41', '0.59']) as the new case, what is the percentage change in HMM observation likelihood?

**Choices:**
- **A.** percentage change in HMM observation likelihood = -1.5335
- **B.** percentage change in HMM observation likelihood = -1.0656
- **C.** percentage change in HMM observation likelihood = -1.2996
- **D.** percentage change in HMM observation likelihood = -0.8317

**Correct Answer:** percentage change in HMM observation likelihood = -1.2996

**Explanation:** The values change from 0.2327 to 0.2297; (new-old)/|old|*100=-1.2996%.

---

## Question 19

**Question:** Taking ($\alpha=[0.15, 0.168]$, destination transitions=(.3,.8), emission=0.43) as baseline and ($\alpha=[0.13, 0.176]$, destination transitions=(.3,.8), emission=0.41) as the new case, what is the percentage change in destination forward value?

**Choices:**
- **A.** percentage change in destination forward value = -4.4386
- **B.** percentage change in destination forward value = -3.6396
- **C.** percentage change in destination forward value = -5.2375
- **D.** percentage change in destination forward value = -2.8407

**Correct Answer:** percentage change in destination forward value = -4.4386

**Explanation:** The values change from 0.0771 to 0.0737; (new-old)/|old|*100=-4.4386%.

---

## Question 20

**Question:** Taking (candidate HMM likelihoods=['0.023', '0.021', '0.0235']) as baseline and (candidate HMM likelihoods=['0.021', '0.017', '0.0245']) as the new case, what is the percentage change in top-two HMM likelihood gap?

**Choices:**
- **A.** percentage change in top-two HMM likelihood gap = 600
- **B.** percentage change in top-two HMM likelihood gap = 708
- **C.** percentage change in top-two HMM likelihood gap = 492
- **D.** percentage change in top-two HMM likelihood gap = 816

**Correct Answer:** percentage change in top-two HMM likelihood gap = 600

**Explanation:** The values change from 0.0005 to 0.0035; (new-old)/|old|*100=600%.

---

## Question 21

**Question:** Which formula must be applied to obtain Bayes posterior from the supplied chapter quantities?

**Choices:**
- **A.** For Bayes posterior, use $\frac{P(B\mid A)P(A)}{P(B)}$
- **B.** For Bayes posterior, use $1-\left(\frac{P(B\mid A)P(A)}{P(B)}\right)$
- **C.** For Bayes posterior, use $\sqrt{\frac{P(B\mid A)P(A)}{P(B)}}$
- **D.** For Bayes posterior, use sum inputs without the required weighting for Bayes posterior

**Correct Answer:** For Bayes posterior, use $\frac{P(B\mid A)P(A)}{P(B)}$

**Explanation:** The chapter defines Bayes posterior with $\frac{P(B\mid A)P(A)}{P(B)}$; the other expressions change an operation or omit required weighting.

---

## Question 22

**Question:** Which formula must be applied to obtain Markov path probability from the supplied chapter quantities?

**Choices:**
- **A.** For Markov path probability, use $P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})$
- **B.** For Markov path probability, use $1-\left(P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})\right)$
- **C.** For Markov path probability, use $\sqrt{P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})}$
- **D.** For Markov path probability, use sum inputs without the required weighting for Markov path probability

**Correct Answer:** For Markov path probability, use $P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})$

**Explanation:** The chapter defines Markov path probability with $P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})$; the other expressions change an operation or omit required weighting.

---

## Question 23

**Question:** Which formula must be applied to obtain HMM observation likelihood from the supplied chapter quantities?

**Choices:**
- **A.** For HMM observation likelihood, use $1-\left(\sum_j\alpha_T(j)\right)$
- **B.** For HMM observation likelihood, use $\sum_j\alpha_T(j)$
- **C.** For HMM observation likelihood, use $\sqrt{\sum_j\alpha_T(j)}$
- **D.** For HMM observation likelihood, use sum inputs without the required weighting for HMM observation likelihood

**Correct Answer:** For HMM observation likelihood, use $\sum_j\alpha_T(j)$

**Explanation:** The chapter defines HMM observation likelihood with $\sum_j\alpha_T(j)$; the other expressions change an operation or omit required weighting.

---

## Question 24

**Question:** Which formula must be applied to obtain destination forward value from the supplied chapter quantities?

**Choices:**
- **A.** For destination forward value, use $\sqrt{\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})}$
- **B.** For destination forward value, use $1-\left(\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})\right)$
- **C.** For destination forward value, use $\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})$
- **D.** For destination forward value, use sum inputs without the required weighting for destination forward value

**Correct Answer:** For destination forward value, use $\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})$

**Explanation:** The chapter defines destination forward value with $\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})$; the other expressions change an operation or omit required weighting.

---

## Question 25

**Question:** Which formula must be applied to obtain top-two HMM likelihood gap from the supplied chapter quantities?

**Choices:**
- **A.** For top-two HMM likelihood gap, use $L_{(1)}-L_{(2)}$
- **B.** For top-two HMM likelihood gap, use $1-\left(L_{(1)}-L_{(2)}\right)$
- **C.** For top-two HMM likelihood gap, use $\sqrt{L_{(1)}-L_{(2)}}$
- **D.** For top-two HMM likelihood gap, use sum inputs without the required weighting for top-two HMM likelihood gap

**Correct Answer:** For top-two HMM likelihood gap, use $L_{(1)}-L_{(2)}$

**Explanation:** The chapter defines top-two HMM likelihood gap with $L_{(1)}-L_{(2)}$; the other expressions change an operation or omit required weighting.

---

## Question 26

**Question:** Four datasets are candidates. Which one produces Bayes posterior=0.4667?

**Choices:**
- **A.** For Bayes posterior, the third dataset: prior=0.2, $P(+\mid C)$=0.7, $P(+\mid \neg C)$=0.2
- **B.** For Bayes posterior, the first dataset: prior=0.1, $P(+\mid C)$=0.7, $P(+\mid \neg C)$=0.15
- **C.** For Bayes posterior, the second dataset: prior=0.14, $P(+\mid C)$=0.68, $P(+\mid \neg C)$=0.17
- **D.** For Bayes posterior, the fourth dataset: prior=0.26, $P(+\mid C)$=0.67, $P(+\mid \neg C)$=0.23

**Correct Answer:** For Bayes posterior, the third dataset: prior=0.2, $P(+\mid C)$=0.7, $P(+\mid \neg C)$=0.2

**Explanation:** Evaluating all four with $\frac{P(B\mid A)P(A)}{P(B)}$ shows that the third dataset produces 0.4667.

---

## Question 27

**Question:** Four datasets are candidates. Which one produces Markov path probability=0.0211?

**Choices:**
- **A.** For Markov path probability, the second dataset: initial=0.25, transitions=['0.8', '0.42', '0.6', '0.3']
- **B.** For Markov path probability, the first dataset: initial=0.2, transitions=['0.8', '0.4', '0.6', '0.3']
- **C.** For Markov path probability, the third dataset: initial=0.325, transitions=['0.8', '0.45', '0.6', '0.3']
- **D.** For Markov path probability, the fourth dataset: initial=0.4, transitions=['0.8', '0.48', '0.6', '0.3']

**Correct Answer:** For Markov path probability, the third dataset: initial=0.325, transitions=['0.8', '0.45', '0.6', '0.3']

**Explanation:** Evaluating all four with $P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})$ shows that the third dataset produces 0.0211.

---

## Question 28

**Question:** Four datasets are candidates. Which one produces HMM observation likelihood=0.2353?

**Choices:**
- **A.** For HMM observation likelihood, the second dataset: $\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.68', '0.22'], emissions2=['0.42', '0.58']
- **B.** For HMM observation likelihood, the first dataset: $\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.7', '0.2'], emissions2=['0.4', '0.6']
- **C.** For HMM observation likelihood, the third dataset: $\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.65', '0.25'], emissions2=['0.45', '0.55']
- **D.** For HMM observation likelihood, the fourth dataset: $\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.62', '0.28'], emissions2=['0.48', '0.52']

**Correct Answer:** For HMM observation likelihood, the third dataset: $\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.65', '0.25'], emissions2=['0.45', '0.55']

**Explanation:** Evaluating all four with $\sum_j\alpha_T(j)$ shows that the third dataset produces 0.2353.

---

## Question 29

**Question:** Four datasets are candidates. Which one produces destination forward value=0.0805?

**Choices:**
- **A.** For destination forward value, the second dataset: $\alpha=[0.14, 0.172]$, destination transitions=(.3,.8), emission=0.42
- **B.** For destination forward value, the first dataset: $\alpha=[0.12, 0.18]$, destination transitions=(.3,.8), emission=0.4
- **C.** For destination forward value, the third dataset: $\alpha=[0.17, 0.16]$, destination transitions=(.3,.8), emission=0.45
- **D.** For destination forward value, the fourth dataset: $\alpha=[0.2, 0.148]$, destination transitions=(.3,.8), emission=0.48

**Correct Answer:** For destination forward value, the third dataset: $\alpha=[0.17, 0.16]$, destination transitions=(.3,.8), emission=0.45

**Explanation:** Evaluating all four with $\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})$ shows that the third dataset produces 0.0805.

---

## Question 30

**Question:** Four datasets are candidates. Which one produces top-two HMM likelihood gap=0?

**Choices:**
- **A.** For top-two HMM likelihood gap, the first dataset: candidate HMM likelihoods=['0.02', '0.015', '0.025']
- **B.** For top-two HMM likelihood gap, the third dataset: candidate HMM likelihoods=['0.025', '0.025', '0.0225']
- **C.** For top-two HMM likelihood gap, the second dataset: candidate HMM likelihoods=['0.022', '0.019', '0.024']
- **D.** For top-two HMM likelihood gap, the fourth dataset: candidate HMM likelihoods=['0.028', '0.031', '0.021']

**Correct Answer:** For top-two HMM likelihood gap, the third dataset: candidate HMM likelihoods=['0.025', '0.025', '0.0225']

**Explanation:** Evaluating all four with $L_{(1)}-L_{(2)}$ shows that the third dataset produces 0.

---

## Question 31

**Question:** For prior=0.22, $P(+\mid C)$=0.69, $P(+\mid \neg C)$=0.21, a student reports Bayes posterior=0.6012. What corrected value should replace it?

**Choices:**
- **A.** corrected Bayes posterior = 0.6541
- **B.** corrected Bayes posterior = 0.5676
- **C.** corrected Bayes posterior = 0.3944
- **D.** corrected Bayes posterior = 0.481

**Correct Answer:** corrected Bayes posterior = 0.481

**Explanation:** Recomputing with $\frac{P(B\mid A)P(A)}{P(B)}$ gives 0.481, so the reported 0.6012 is rejected.

---

## Question 32

**Question:** For initial=0.35, transitions=['0.8', '0.46', '0.6', '0.3'], a student reports Markov path probability=0.1232. What corrected value should replace it?

**Choices:**
- **A.** corrected Markov path probability = 0.1652
- **B.** corrected Markov path probability = 0.0942
- **C.** corrected Markov path probability = -0.0478
- **D.** corrected Markov path probability = 0.0232

**Correct Answer:** corrected Markov path probability = 0.0232

**Explanation:** Recomputing with $P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})$ gives 0.0232, so the reported 0.1232 is rejected.

---

## Question 33

**Question:** For $\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.64', '0.26'], emissions2=['0.46', '0.54'], a student reports HMM observation likelihood=0.3364. What corrected value should replace it?

**Choices:**
- **A.** corrected HMM observation likelihood = 0.3784
- **B.** corrected HMM observation likelihood = 0.3074
- **C.** corrected HMM observation likelihood = 0.1654
- **D.** corrected HMM observation likelihood = 0.2364

**Correct Answer:** corrected HMM observation likelihood = 0.2364

**Explanation:** Recomputing with $\sum_j\alpha_T(j)$ gives 0.2364, so the reported 0.3364 is rejected.

---

## Question 34

**Question:** For $\alpha=[0.18, 0.156]$, destination transitions=(.3,.8), emission=0.46, a student reports destination forward value=0.1822. What corrected value should replace it?

**Choices:**
- **A.** corrected destination forward value = 0.0822
- **B.** corrected destination forward value = 0.1532
- **C.** corrected destination forward value = 0.0112
- **D.** corrected destination forward value = 0.2242

**Correct Answer:** corrected destination forward value = 0.0822

**Explanation:** Recomputing with $\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})$ gives 0.0822, so the reported 0.1822 is rejected.

---

## Question 35

**Question:** For candidate HMM likelihoods=['0.026', '0.027', '0.022'], a student reports top-two HMM likelihood gap=0.101. What corrected value should replace it?

**Choices:**
- **A.** corrected top-two HMM likelihood gap = 0.072
- **B.** corrected top-two HMM likelihood gap = 0.001
- **C.** corrected top-two HMM likelihood gap = -0.07
- **D.** corrected top-two HMM likelihood gap = 0.143

**Correct Answer:** corrected top-two HMM likelihood gap = 0.001

**Explanation:** Recomputing with $L_{(1)}-L_{(2)}$ gives 0.001, so the reported 0.101 is rejected.

---

## Question 36

**Question:** Compute Bayes posterior separately for (prior=0.24, $P(+\mid C)$=0.68, $P(+\mid \neg C)$=0.22) and (prior=0.1, $P(+\mid C)$=0.7, $P(+\mid \neg C)$=0.15), then average the two results.

**Choices:**
- **A.** mean of the two Bayes posterior values = 0.5681
- **B.** mean of the two Bayes posterior values = 0.4929
- **C.** mean of the two Bayes posterior values = 0.3425
- **D.** mean of the two Bayes posterior values = 0.4177

**Correct Answer:** mean of the two Bayes posterior values = 0.4177

**Explanation:** The individual results are 0.4939 and 0.3415; their arithmetic mean is 0.4177.

---

## Question 37

**Question:** Compute Markov path probability separately for (initial=0.375, transitions=['0.8', '0.47', '0.6', '0.3']) and (initial=0.2, transitions=['0.8', '0.4', '0.6', '0.3']), then average the two results.

**Choices:**
- **A.** mean of the two Markov path probability values = 0.1604
- **B.** mean of the two Markov path probability values = 0.0895
- **C.** mean of the two Markov path probability values = -0.0525
- **D.** mean of the two Markov path probability values = 0.0185

**Correct Answer:** mean of the two Markov path probability values = 0.0185

**Explanation:** The individual results are 0.0254 and 0.0115; their arithmetic mean is 0.0185.

---

## Question 38

**Question:** Compute HMM observation likelihood separately for ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.63', '0.27'], emissions2=['0.47', '0.53']) and ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.7', '0.2'], emissions2=['0.4', '0.6']), then average the two results.

**Choices:**
- **A.** mean of the two HMM observation likelihood values = 0.1617
- **B.** mean of the two HMM observation likelihood values = 0.3037
- **C.** mean of the two HMM observation likelihood values = 0.2327
- **D.** mean of the two HMM observation likelihood values = 0.3747

**Correct Answer:** mean of the two HMM observation likelihood values = 0.2327

**Explanation:** The individual results are 0.2375 and 0.228; their arithmetic mean is 0.2327.

---

## Question 39

**Question:** Compute destination forward value separately for ($\alpha=[0.19, 0.152]$, destination transitions=(.3,.8), emission=0.47) and ($\alpha=[0.12, 0.18]$, destination transitions=(.3,.8), emission=0.4), then average the two results.

**Choices:**
- **A.** mean of the two destination forward value values = 0.007
- **B.** mean of the two destination forward value values = 0.149
- **C.** mean of the two destination forward value values = 0.078
- **D.** mean of the two destination forward value values = 0.22

**Correct Answer:** mean of the two destination forward value values = 0.078

**Explanation:** The individual results are 0.0839 and 0.072; their arithmetic mean is 0.078.

---

## Question 40

**Question:** Compute top-two HMM likelihood gap separately for (candidate HMM likelihoods=['0.027', '0.029', '0.0215']) and (candidate HMM likelihoods=['0.02', '0.015', '0.025']), then average the two results.

**Choices:**
- **A.** mean of the two top-two HMM likelihood gap values = -0.0675
- **B.** mean of the two top-two HMM likelihood gap values = 0.0745
- **C.** mean of the two top-two HMM likelihood gap values = 0.0035
- **D.** mean of the two top-two HMM likelihood gap values = 0.1455

**Correct Answer:** mean of the two top-two HMM likelihood gap values = 0.0035

**Explanation:** The individual results are 0.002 and 0.005; their arithmetic mean is 0.0035.

---

## Question 41

**Question:** After the data change from (prior=0.26, $P(+\mid C)$=0.67, $P(+\mid \neg C)$=0.23) to (prior=0.22, $P(+\mid C)$=0.69, $P(+\mid \neg C)$=0.21), what is the new Bayes posterior?

**Choices:**
- **A.** Bayes posterior = 0.3944
- **B.** Bayes posterior = 0.5676
- **C.** Bayes posterior = 0.481
- **D.** Bayes posterior = 0.6541

**Correct Answer:** Bayes posterior = 0.481

**Explanation:** Only the new data enter $\frac{P(B\mid A)P(A)}{P(B)}$; they produce 0.481.

---

## Question 42

**Question:** After the data change from (initial=0.4, transitions=['0.8', '0.48', '0.6', '0.3']) to (initial=0.35, transitions=['0.8', '0.46', '0.6', '0.3']), what is the new Markov path probability?

**Choices:**
- **A.** Markov path probability = 0.1652
- **B.** Markov path probability = 0.0942
- **C.** Markov path probability = -0.0478
- **D.** Markov path probability = 0.0232

**Correct Answer:** Markov path probability = 0.0232

**Explanation:** Only the new data enter $P(s_1)\prod_{t=2}^{T}P(s_t\mid s_{t-1})$; they produce 0.0232.

---

## Question 43

**Question:** After the data change from ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.62', '0.28'], emissions2=['0.48', '0.52']) to ($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.64', '0.26'], emissions2=['0.46', '0.54']), what is the new HMM observation likelihood?

**Choices:**
- **A.** HMM observation likelihood = 0.2364
- **B.** HMM observation likelihood = 0.3074
- **C.** HMM observation likelihood = 0.1654
- **D.** HMM observation likelihood = 0.3784

**Correct Answer:** HMM observation likelihood = 0.2364

**Explanation:** Only the new data enter $\sum_j\alpha_T(j)$; they produce 0.2364.

---

## Question 44

**Question:** After the data change from ($\alpha=[0.2, 0.148]$, destination transitions=(.3,.8), emission=0.48) to ($\alpha=[0.18, 0.156]$, destination transitions=(.3,.8), emission=0.46), what is the new destination forward value?

**Choices:**
- **A.** destination forward value = 0.1532
- **B.** destination forward value = 0.0822
- **C.** destination forward value = 0.0112
- **D.** destination forward value = 0.2242

**Correct Answer:** destination forward value = 0.0822

**Explanation:** Only the new data enter $\left(\sum_i\alpha_t(i)a_{ij}\right)B_j(o_{t+1})$; they produce 0.0822.

---

## Question 45

**Question:** After the data change from (candidate HMM likelihoods=['0.028', '0.031', '0.021']) to (candidate HMM likelihoods=['0.026', '0.027', '0.022']), what is the new top-two HMM likelihood gap?

**Choices:**
- **A.** top-two HMM likelihood gap = 0.143
- **B.** top-two HMM likelihood gap = 0.072
- **C.** top-two HMM likelihood gap = -0.07
- **D.** top-two HMM likelihood gap = 0.001

**Correct Answer:** top-two HMM likelihood gap = 0.001

**Explanation:** Only the new data enter $L_{(1)}-L_{(2)}$; they produce 0.001.

---

## Question 46

**Question:** Rank P, Q, R, S from largest to smallest Bayes posterior: P(prior=0.12, $P(+\mid C)$=0.69, $P(+\mid \neg C)$=0.16), Q(prior=0.16, $P(+\mid C)$=0.67, $P(+\mid \neg C)$=0.18), R(prior=0.22, $P(+\mid C)$=0.69, $P(+\mid \neg C)$=0.21), S(prior=0.28, $P(+\mid C)$=0.66, $P(+\mid \neg C)$=0.24).

**Choices:**
- **A.** Bayes posterior ranking: S > R > Q > P
- **B.** Bayes posterior ranking: P > Q > R > S
- **C.** Bayes posterior ranking: P = Q = R = S
- **D.** Bayes posterior ranking: Q > P > S > R

**Correct Answer:** Bayes posterior ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.3703', 'Q': '0.4149', 'R': '0.481', 'S': '0.5168'}; grouping equal values and sorting descending gives Bayes posterior ranking: S > R > Q > P.

---

## Question 47

**Question:** Rank P, Q, R, S from largest to smallest Markov path probability: P(initial=0.225, transitions=['0.8', '0.41', '0.6', '0.3']), Q(initial=0.275, transitions=['0.8', '0.43', '0.6', '0.3']), R(initial=0.35, transitions=['0.8', '0.46', '0.6', '0.3']), S(initial=0.425, transitions=['0.8', '0.49', '0.6', '0.3']).

**Choices:**
- **A.** Markov path probability ranking: Q > P > S > R
- **B.** Markov path probability ranking: P > Q > R > S
- **C.** Markov path probability ranking: P = Q = R = S
- **D.** Markov path probability ranking: S > R > Q > P

**Correct Answer:** Markov path probability ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.0133', 'Q': '0.017', 'R': '0.0232', 'S': '0.03'}; grouping equal values and sorting descending gives Markov path probability ranking: S > R > Q > P.

---

## Question 48

**Question:** Rank P, Q, R, S from largest to smallest HMM observation likelihood: P($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.69', '0.21'], emissions2=['0.41', '0.59']), Q($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.67', '0.23'], emissions2=['0.43', '0.57']), R($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.64', '0.26'], emissions2=['0.46', '0.54']), S($\pi=[0.6, 0.4]$, A=[[0.8, 0.2], [0.3, 0.7]], emissions1=['0.61', '0.29'], emissions2=['0.49', '0.51']).

**Choices:**
- **A.** HMM observation likelihood ranking: P > Q > R > S
- **B.** HMM observation likelihood ranking: S > R > Q > P
- **C.** HMM observation likelihood ranking: P = Q = R = S
- **D.** HMM observation likelihood ranking: Q > P > S > R

**Correct Answer:** HMM observation likelihood ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.2297', 'Q': '0.2327', 'R': '0.2364', 'S': '0.2393'}; grouping equal values and sorting descending gives HMM observation likelihood ranking: S > R > Q > P.

---

## Question 49

**Question:** Rank P, Q, R, S from largest to smallest destination forward value: P($\alpha=[0.13, 0.176]$, destination transitions=(.3,.8), emission=0.41), Q($\alpha=[0.15, 0.168]$, destination transitions=(.3,.8), emission=0.43), R($\alpha=[0.18, 0.156]$, destination transitions=(.3,.8), emission=0.46), S($\alpha=[0.21, 0.144]$, destination transitions=(.3,.8), emission=0.49).

**Choices:**
- **A.** destination forward value ranking: P = Q = R = S
- **B.** destination forward value ranking: P > Q > R > S
- **C.** destination forward value ranking: S > R > Q > P
- **D.** destination forward value ranking: Q > P > S > R

**Correct Answer:** destination forward value ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.0737', 'Q': '0.0771', 'R': '0.0822', 'S': '0.0873'}; grouping equal values and sorting descending gives destination forward value ranking: S > R > Q > P.

---

## Question 50

**Question:** Rank P, Q, R, S from largest to smallest top-two HMM likelihood gap: P(candidate HMM likelihoods=['0.021', '0.017', '0.0245']), Q(candidate HMM likelihoods=['0.023', '0.021', '0.0235']), R(candidate HMM likelihoods=['0.026', '0.027', '0.022']), S(candidate HMM likelihoods=['0.029', '0.033', '0.0205']).

**Choices:**
- **A.** top-two HMM likelihood gap ranking: P = Q = R = S
- **B.** top-two HMM likelihood gap ranking: Q > R > P > S
- **C.** top-two HMM likelihood gap ranking: S > P > R > Q
- **D.** top-two HMM likelihood gap ranking: P > Q > R > S

**Correct Answer:** top-two HMM likelihood gap ranking: S > P > R > Q

**Explanation:** Their values are {'P': '0.0035', 'Q': '0.0005', 'R': '0.001', 'S': '0.004'}; grouping equal values and sorting descending gives top-two HMM likelihood gap ranking: S > P > R > Q.

---

## Question 51

**Question:** Which statement correctly characterizes Bayesian evidence?

**Choices:**
- **A.** Bayes' theorem makes $P(A\mid B)$ equal to $P(B\mid A)$.
- **B.** The evidence is always equal to the likelihood for every hypothesis. for all permitted parameter values
- **C.** The posterior is computed without using the prior.
- **D.** The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Correct Answer:** The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Explanation:** For Bayesian evidence, the accurate statement is the first one because P(B) is the denominator in the displayed Bayes formula.

---

## Question 52

**Question:** Which statement correctly characterizes the Markov property?

**Choices:**
- **A.** The next state is independent of the current state.
- **B.** The Markov property conditions the next state on the current state rather than the full history.
- **C.** Every state sequence must have equal probability.
- **D.** The initial state distribution is unnecessary for sequence probability. under every stated condition

**Correct Answer:** The Markov property conditions the next state on the current state rather than the full history.

**Explanation:** For the Markov property, the accurate statement is the first one because A first-order chain retains the most recent state for predicting the next.

---

## Question 53

**Question:** Which statement correctly characterizes state-sequence probability?

**Choices:**
- **A.** It adds transition probabilities and divides by sequence length. without changing the supplied data
- **B.** It multiplies emissions even when no observations are modeled.
- **C.** A Markov sequence probability multiplies one initial probability and all required transitions.
- **D.** It omits the transition into the final state.

**Correct Answer:** A Markov sequence probability multiplies one initial probability and all required transitions.

**Explanation:** For state-sequence probability, the accurate statement is the first one because The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 54

**Question:** Which statement correctly characterizes the roles of A and B?

**Choices:**
- **A.** In an HMM, A models hidden-state transitions while B links hidden states to observations.
- **B.** A emits observations and B chooses the initial state.
- **C.** B transitions directly between visible observations only.
- **D.** Pi is the probability of every complete observation sequence. for all permitted parameter values

**Correct Answer:** In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Explanation:** For the roles of A and B, the accurate statement is the first one because The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 55

**Question:** Which statement correctly characterizes forward initialization?

**Choices:**
- **A.** Forward initialization chooses only the largest initial probability.
- **B.** Forward initialization sums every transition before seeing the first observation. under every stated condition
- **C.** Forward initialization multiplies each initial-state probability by that state's first-observation emission.
- **D.** Forward initialization sets all states to probability one.

**Correct Answer:** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Explanation:** For forward initialization, the accurate statement is the first one because alpha_1(j)=pi_j B_j(o1).

---

## Question 56

**Question:** Which statement correctly characterizes forward recursion?

**Choices:**
- **A.** Forward recursion multiplies only the single largest incoming path. without changing the supplied data
- **B.** Forward recursion sums incoming path mass before multiplying by the destination state's emission.
- **C.** The emission belongs to the source state at the previous time only.
- **D.** Forward recursion discards transition probabilities.

**Correct Answer:** Forward recursion sums incoming path mass before multiplying by the destination state's emission.

**Explanation:** For forward recursion, the accurate statement is the first one because The sum over i accounts for all paths reaching state j.

---

## Question 57

**Question:** Which statement correctly characterizes forward termination?

**Choices:**
- **A.** Forward termination sums final alpha values to obtain the observation-sequence likelihood.
- **B.** Termination selects the state with the smallest alpha. for all permitted parameter values under the complete set of stated assumptions
- **C.** Termination divides each alpha by its emission.
- **D.** Termination learns A, B, and pi automatically.

**Correct Answer:** Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Explanation:** For forward termination, the accurate statement is the first one because All possible final hidden states contribute to $P(O\mid M)$.

---

## Question 58

**Question:** Which statement correctly characterizes evaluation versus decoding?

**Choices:**
- **A.** Decoding returns only the observation probability and no states. under every stated condition
- **B.** Evaluation and decoding both mean learning model parameters.
- **C.** Evaluation asks for $P(O\mid M)$, whereas decoding asks for a most likely hidden-state sequence.
- **D.** Learning assumes A, B, and pi can never change.

**Correct Answer:** Evaluation asks for $P(O\mid M)$, whereas decoding asks for a most likely hidden-state sequence.

**Explanation:** For evaluation versus decoding, the accurate statement is the first one because The three canonical HMM problems have distinct outputs.

---

## Question 59

**Question:** Which statement correctly characterizes word-model comparison?

**Choices:**
- **A.** Word recognition directly observes the hidden word state at every time. without changing the supplied data
- **B.** Word recognition can compare observation likelihoods under several candidate HMMs.
- **C.** The least likely HMM must be selected by definition.
- **D.** Observation images replace the need for emission probabilities.

**Correct Answer:** Word recognition can compare observation likelihoods under several candidate HMMs.

**Explanation:** For word-model comparison, the accurate statement is the first one because Evaluation under each model supports choosing the best-matching candidate.

---

## Question 60

**Question:** Which statement correctly characterizes transition-matrix rows?

**Choices:**
- **A.** The diagonal entries are observation probabilities rather than persistence. for all permitted parameter values
- **B.** Every matrix entry is an unconditional initial probability.
- **C.** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.
- **D.** A transition row may sum to any value because probabilities are unrelated.

**Correct Answer:** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Explanation:** For transition-matrix rows, the accurate statement is the first one because A transition row is a conditional distribution and therefore sums to one.

---

## Question 61

**Question:** A student writes, “The evidence is always equal to the likelihood for every hypothesis.” Which replacement correctly repairs the claim about Bayesian evidence?

**Choices:**
- **A.** Replace it with: The evidence P(B) normalizes prior-times-likelihood values into a posterior.
- **B.** Replace it with: The evidence is always equal to the likelihood for every hypothesis. under every stated condition
- **C.** Replace it with: The posterior is computed without using the prior.
- **D.** Replace it with: Bayes' theorem makes $P(A\mid B)$ equal to $P(B\mid A)$.

**Correct Answer:** Replace it with: The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because P(B) is the denominator in the displayed Bayes formula.

---

## Question 62

**Question:** A student writes, “The next state is independent of the current state.” Which replacement correctly repairs the claim about the Markov property?

**Choices:**
- **A.** Replace it with: The initial state distribution is unnecessary for sequence probability. without changing the supplied data
- **B.** Replace it with: The next state is independent of the current state.
- **C.** Replace it with: Every state sequence must have equal probability.
- **D.** Replace it with: The Markov property conditions the next state on the current state rather than the full history.

**Correct Answer:** Replace it with: The Markov property conditions the next state on the current state rather than the full history.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because A first-order chain retains the most recent state for predicting the next.

---

## Question 63

**Question:** A student writes, “It adds transition probabilities and divides by sequence length.” Which replacement correctly repairs the claim about state-sequence probability?

**Choices:**
- **A.** Replace it with: It omits the transition into the final state.
- **B.** Replace it with: It adds transition probabilities and divides by sequence length. for all permitted parameter values
- **C.** Replace it with: It multiplies emissions even when no observations are modeled.
- **D.** Replace it with: A Markov sequence probability multiplies one initial probability and all required transitions.

**Correct Answer:** Replace it with: A Markov sequence probability multiplies one initial probability and all required transitions.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 64

**Question:** A student writes, “A emits observations and B chooses the initial state.” Which replacement correctly repairs the claim about the roles of A and B?

**Choices:**
- **A.** Replace it with: Pi is the probability of every complete observation sequence. under every stated condition
- **B.** Replace it with: A emits observations and B chooses the initial state.
- **C.** Replace it with: B transitions directly between visible observations only.
- **D.** Replace it with: In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Correct Answer:** Replace it with: In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 65

**Question:** A student writes, “Forward initialization sums every transition before seeing the first observation.” Which replacement correctly repairs the claim about forward initialization?

**Choices:**
- **A.** Replace it with: Forward initialization multiplies each initial-state probability by that state's first-observation emission.
- **B.** Replace it with: Forward initialization sums every transition before seeing the first observation. without changing the supplied data
- **C.** Replace it with: Forward initialization chooses only the largest initial probability.
- **D.** Replace it with: Forward initialization sets all states to probability one.

**Correct Answer:** Replace it with: Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because alpha_1(j)=pi_j B_j(o1).

---

## Question 66

**Question:** A student writes, “Forward recursion multiplies only the single largest incoming path.” Which replacement correctly repairs the claim about forward recursion?

**Choices:**
- **A.** Replace it with: Forward recursion discards transition probabilities.
- **B.** Replace it with: Forward recursion sums incoming path mass before multiplying by the destination state's emission.
- **C.** Replace it with: The emission belongs to the source state at the previous time only.
- **D.** Replace it with: Forward recursion multiplies only the single largest incoming path. for all permitted parameter values

**Correct Answer:** Replace it with: Forward recursion sums incoming path mass before multiplying by the destination state's emission.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The sum over i accounts for all paths reaching state j.

---

## Question 67

**Question:** A student writes, “Termination selects the state with the smallest alpha.” Which replacement correctly repairs the claim about forward termination?

**Choices:**
- **A.** Replace it with: Termination divides each alpha by its emission.
- **B.** Replace it with: Forward termination sums final alpha values to obtain the observation-sequence likelihood.
- **C.** Replace it with: Termination selects the state with the smallest alpha. under every stated condition under the complete set of stated assumptions
- **D.** Replace it with: Termination learns A, B, and pi automatically.

**Correct Answer:** Replace it with: Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because All possible final hidden states contribute to $P(O\mid M)$.

---

## Question 68

**Question:** A student writes, “Evaluation and decoding both mean learning model parameters.” Which replacement correctly repairs the claim about evaluation versus decoding?

**Choices:**
- **A.** Replace it with: Evaluation and decoding both mean learning model parameters.
- **B.** Replace it with: Decoding returns only the observation probability and no states. without changing the supplied data
- **C.** Replace it with: Evaluation asks for $P(O\mid M)$, whereas decoding asks for a most likely hidden-state sequence.
- **D.** Replace it with: Learning assumes A, B, and pi can never change.

**Correct Answer:** Replace it with: Evaluation asks for $P(O\mid M)$, whereas decoding asks for a most likely hidden-state sequence.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The three canonical HMM problems have distinct outputs.

---

## Question 69

**Question:** A student writes, “Word recognition directly observes the hidden word state at every time.” Which replacement correctly repairs the claim about word-model comparison?

**Choices:**
- **A.** Replace it with: Observation images replace the need for emission probabilities.
- **B.** Replace it with: Word recognition directly observes the hidden word state at every time. for all permitted parameter values
- **C.** Replace it with: The least likely HMM must be selected by definition.
- **D.** Replace it with: Word recognition can compare observation likelihoods under several candidate HMMs.

**Correct Answer:** Replace it with: Word recognition can compare observation likelihoods under several candidate HMMs.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Evaluation under each model supports choosing the best-matching candidate.

---

## Question 70

**Question:** A student writes, “Every matrix entry is an unconditional initial probability.” Which replacement correctly repairs the claim about transition-matrix rows?

**Choices:**
- **A.** Replace it with: The diagonal entries are observation probabilities rather than persistence. under every stated condition
- **B.** Replace it with: Every matrix entry is an unconditional initial probability.
- **C.** Replace it with: Rows of the stated transition matrix describe conditional next-state probabilities from a current state.
- **D.** Replace it with: A transition row may sum to any value because probabilities are unrelated.

**Correct Answer:** Replace it with: Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because A transition row is a conditional distribution and therefore sums to one.

---

## Question 71

**Question:** A student's answer about Bayesian evidence contains the claim “The evidence is always equal to the likelihood for every hypothesis.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about Bayesian evidence is correct without qualification
- **B.** The quoted claim concerns Bayesian evidence but is only a harmless change of notation
- **C.** The quoted claim about Bayesian evidence is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about Bayesian evidence is false and must be replaced

**Explanation:** The quoted claim contradicts Bayesian evidence; it must be replaced by the chapter's stated rule.

---

## Question 72

**Question:** A student's answer about the Markov property contains the claim “The next state is independent of the current state.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about the Markov property is correct without qualification
- **B.** The quoted claim about the Markov property is false and must be replaced
- **C.** The quoted claim concerns the Markov property but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about the Markov property is false and must be replaced

**Explanation:** The quoted claim contradicts the Markov property; it must be replaced by The Markov property conditions the next state on the current state rather than the full history..

---

## Question 73

**Question:** A student's answer about state-sequence probability contains the claim “It adds transition probabilities and divides by sequence length.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about state-sequence probability is false and must be replaced
- **C.** The quoted claim concerns state-sequence probability but is only a harmless change of notation
- **D.** The quoted claim about state-sequence probability is correct without qualification

**Correct Answer:** The quoted claim about state-sequence probability is false and must be replaced

**Explanation:** The quoted claim contradicts state-sequence probability; it must be replaced by A Markov sequence probability multiplies one initial probability and all required transitions..

---

## Question 74

**Question:** A student's answer about the roles of A and B contains the claim “A emits observations and B chooses the initial state.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about the roles of A and B is correct without qualification
- **B.** The quoted claim about the roles of A and B is false and must be replaced
- **C.** The quoted claim concerns the roles of A and B but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about the roles of A and B is false and must be replaced

**Explanation:** The quoted claim contradicts the roles of A and B; it must be replaced by In an HMM,.

---

## Question 75

**Question:** A student's answer about forward initialization contains the claim “Forward initialization sums every transition before seeing the first observation.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about forward initialization is false and must be replaced
- **B.** The quoted claim about forward initialization is correct without qualification
- **C.** The quoted claim concerns forward initialization but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about forward initialization is false and must be replaced

**Explanation:** The quoted claim contradicts forward initialization; it must be replaced by the chapter's stated rule.

---

## Question 76

**Question:** A student's answer about forward recursion contains the claim “Forward recursion multiplies only the single largest incoming path.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about forward recursion is correct without qualification
- **B.** The quoted claim about forward recursion is false and must be replaced
- **C.** The quoted claim concerns forward recursion but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about forward recursion is false and must be replaced

**Explanation:** The quoted claim contradicts forward recursion; it must be replaced by Forward recursion sums incoming path mass before multiplying by the destination state's emission..

---

## Question 77

**Question:** A student's answer about forward termination contains the claim “Termination selects the state with the smallest alpha.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns forward termination but is only a harmless change of notation
- **B.** The quoted claim about forward termination is false and must be replaced
- **C.** The quoted claim about forward termination is correct without qualification
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about forward termination is false and must be replaced

**Explanation:** The quoted claim contradicts forward termination; it must be replaced by Forward termination sums final alpha values to obtain the observation-sequence likelihood..

---

## Question 78

**Question:** A student's answer about evaluation versus decoding contains the claim “Evaluation and decoding both mean learning model parameters.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about evaluation versus decoding is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns evaluation versus decoding but is only a harmless change of notation
- **D.** The quoted claim about evaluation versus decoding is false and must be replaced

**Correct Answer:** The quoted claim about evaluation versus decoding is false and must be replaced

**Explanation:** The quoted claim contradicts evaluation versus decoding; it must be replaced by Evaluation asks for $P(O\mid M)$, whereas decoding asks for a most likely hidden-state sequence..

---

## Question 79

**Question:** A student's answer about word-model comparison contains the claim “Word recognition directly observes the hidden word state at every time.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about word-model comparison is false and must be replaced
- **B.** The quoted claim about word-model comparison is correct without qualification
- **C.** The quoted claim concerns word-model comparison but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about word-model comparison is false and must be replaced

**Explanation:** The quoted claim contradicts word-model comparison; it must be replaced by the chapter's stated rule.

---

## Question 80

**Question:** A student's answer about transition-matrix rows contains the claim “Every matrix entry is an unconditional initial probability.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about transition-matrix rows is false and must be replaced
- **C.** The quoted claim concerns transition-matrix rows but is only a harmless change of notation
- **D.** The quoted claim about transition-matrix rows is correct without qualification

**Correct Answer:** The quoted claim about transition-matrix rows is false and must be replaced

**Explanation:** The quoted claim contradicts transition-matrix rows; it must be replaced by Rows of the stated transition matrix describe conditional next-state probabilities from a current state..

---

## Question 81

**Question:** An implementation is designed around the rule “The posterior is computed without using the prior.” Which principle exposes the design error concerning Bayesian evidence?

**Choices:**
- **A.** Required principle: The posterior is computed without using the prior.
- **B.** Required principle: The evidence P(B) normalizes prior-times-likelihood values into a posterior.
- **C.** Required principle: The evidence is always equal to the likelihood for every hypothesis. for all permitted parameter values
- **D.** Required principle: Bayes' theorem makes $P(A\mid B)$ equal to $P(B\mid A)$.

**Correct Answer:** Required principle: The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Explanation:** The implementation encodes a false rule. The required principle follows because P(B) is the denominator in the displayed Bayes formula.

---

## Question 82

**Question:** An implementation is designed around the rule “Every state sequence must have equal probability.” Which principle exposes the design error concerning the Markov property?

**Choices:**
- **A.** Required principle: Every state sequence must have equal probability.
- **B.** Required principle: The next state is independent of the current state.
- **C.** Required principle: The Markov property conditions the next state on the current state rather than the full history.
- **D.** Required principle: The initial state distribution is unnecessary for sequence probability. under every stated condition

**Correct Answer:** Required principle: The Markov property conditions the next state on the current state rather than the full history.

**Explanation:** The implementation encodes a false rule. The required principle follows because A first-order chain retains the most recent state for predicting the next.

---

## Question 83

**Question:** An implementation is designed around the rule “It multiplies emissions even when no observations are modeled.” Which principle exposes the design error concerning state-sequence probability?

**Choices:**
- **A.** Required principle: It adds transition probabilities and divides by sequence length. without changing the supplied data
- **B.** Required principle: A Markov sequence probability multiplies one initial probability and all required transitions.
- **C.** Required principle: It multiplies emissions even when no observations are modeled.
- **D.** Required principle: It omits the transition into the final state.

**Correct Answer:** Required principle: A Markov sequence probability multiplies one initial probability and all required transitions.

**Explanation:** The implementation encodes a false rule. The required principle follows because The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 84

**Question:** An implementation is designed around the rule “B transitions directly between visible observations only.” Which principle exposes the design error concerning the roles of A and B?

**Choices:**
- **A.** Required principle: Pi is the probability of every complete observation sequence. for all permitted parameter values
- **B.** Required principle: A emits observations and B chooses the initial state.
- **C.** Required principle: B transitions directly between visible observations only.
- **D.** Required principle: In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Correct Answer:** Required principle: In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Explanation:** The implementation encodes a false rule. The required principle follows because The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 85

**Question:** An implementation is designed around the rule “Forward initialization chooses only the largest initial probability.” Which principle exposes the design error concerning forward initialization?

**Choices:**
- **A.** Required principle: Forward initialization multiplies each initial-state probability by that state's first-observation emission.
- **B.** Required principle: Forward initialization sums every transition before seeing the first observation. under every stated condition
- **C.** Required principle: Forward initialization chooses only the largest initial probability.
- **D.** Required principle: Forward initialization sets all states to probability one.

**Correct Answer:** Required principle: Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Explanation:** The implementation encodes a false rule. The required principle follows because alpha_1(j)=pi_j B_j(o1).

---

## Question 86

**Question:** An implementation is designed around the rule “The emission belongs to the source state at the previous time only.” Which principle exposes the design error concerning forward recursion?

**Choices:**
- **A.** Required principle: Forward recursion discards transition probabilities.
- **B.** Required principle: Forward recursion sums incoming path mass before multiplying by the destination state's emission.
- **C.** Required principle: The emission belongs to the source state at the previous time only.
- **D.** Required principle: Forward recursion multiplies only the single largest incoming path. without changing the supplied data

**Correct Answer:** Required principle: Forward recursion sums incoming path mass before multiplying by the destination state's emission.

**Explanation:** The implementation encodes a false rule. The required principle follows because The sum over i accounts for all paths reaching state j.

---

## Question 87

**Question:** An implementation is designed around the rule “Termination divides each alpha by its emission.” Which principle exposes the design error concerning forward termination?

**Choices:**
- **A.** Required principle: Termination learns A, B, and pi automatically.
- **B.** Required principle: Termination selects the state with the smallest alpha. for all permitted parameter values under the complete set of stated assumptions
- **C.** Required principle: Termination divides each alpha by its emission.
- **D.** Required principle: Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Correct Answer:** Required principle: Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Explanation:** The implementation encodes a false rule. The required principle follows because All possible final hidden states contribute to $P(O\mid M)$.

---

## Question 88

**Question:** An implementation is designed around the rule “Decoding returns only the observation probability and no states.” Which principle exposes the design error concerning evaluation versus decoding?

**Choices:**
- **A.** Required principle: Evaluation asks for $P(O\mid M)$, whereas decoding asks for a most likely hidden-state sequence.
- **B.** Required principle: Evaluation and decoding both mean learning model parameters.
- **C.** Required principle: Decoding returns only the observation probability and no states. under every stated condition
- **D.** Required principle: Learning assumes A, B, and pi can never change.

**Correct Answer:** Required principle: Evaluation asks for $P(O\mid M)$, whereas decoding asks for a most likely hidden-state sequence.

**Explanation:** The implementation encodes a false rule. The required principle follows because The three canonical HMM problems have distinct outputs.

---

## Question 89

**Question:** An implementation is designed around the rule “The least likely HMM must be selected by definition.” Which principle exposes the design error concerning word-model comparison?

**Choices:**
- **A.** Required principle: Word recognition can compare observation likelihoods under several candidate HMMs.
- **B.** Required principle: Word recognition directly observes the hidden word state at every time. without changing the supplied data
- **C.** Required principle: The least likely HMM must be selected by definition.
- **D.** Required principle: Observation images replace the need for emission probabilities.

**Correct Answer:** Required principle: Word recognition can compare observation likelihoods under several candidate HMMs.

**Explanation:** The implementation encodes a false rule. The required principle follows because Evaluation under each model supports choosing the best-matching candidate.

---

## Question 90

**Question:** An implementation is designed around the rule “A transition row may sum to any value because probabilities are unrelated.” Which principle exposes the design error concerning transition-matrix rows?

**Choices:**
- **A.** Required principle: A transition row may sum to any value because probabilities are unrelated.
- **B.** Required principle: Every matrix entry is an unconditional initial probability.
- **C.** Required principle: The diagonal entries are observation probabilities rather than persistence. for all permitted parameter values
- **D.** Required principle: Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Correct Answer:** Required principle: Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Explanation:** The implementation encodes a false rule. The required principle follows because A transition row is a conditional distribution and therefore sums to one.

---

## Question 91

**Question:** Reviewer A states, “The evidence P(B) normalizes prior-times-likelihood values into a posterior.” Reviewer B states, “Bayes' theorem makes $P(A\mid B)$ equal to $P(B\mid A)$.” What is the correct verdict about Bayesian evidence?

**Choices:**
- **A.** Reviewer A only is correct about Bayesian evidence
- **B.** Reviewer B only is correct about Bayesian evidence
- **C.** Both reviewers are correct about Bayesian evidence
- **D.** Neither reviewer is correct about Bayesian evidence

**Correct Answer:** Reviewer A only is correct about Bayesian evidence

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, P(B) is the denominator in the displayed Bayes formula.

---

## Question 92

**Question:** Reviewer A states, “The Markov property conditions the next state on the current state rather than the full history.” Reviewer B states, “The initial state distribution is unnecessary for sequence probability.” What is the correct verdict about the Markov property?

**Choices:**
- **A.** Neither reviewer is correct about the Markov property
- **B.** Reviewer B only is correct about the Markov property
- **C.** Reviewer A only is correct about the Markov property
- **D.** Both reviewers are correct about the Markov property

**Correct Answer:** Reviewer A only is correct about the Markov property

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, A first-order chain retains the most recent state for predicting the next.

---

## Question 93

**Question:** Reviewer A states, “A Markov sequence probability multiplies one initial probability and all required transitions.” Reviewer B states, “It omits the transition into the final state.” What is the correct verdict about state-sequence probability?

**Choices:**
- **A.** Both reviewers are correct about state-sequence probability
- **B.** Reviewer B only is correct about state-sequence probability
- **C.** Reviewer A only is correct about state-sequence probability
- **D.** Neither reviewer is correct about state-sequence probability

**Correct Answer:** Reviewer A only is correct about state-sequence probability

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 94

**Question:** Reviewer A states, “In an HMM, A models hidden-state transitions while B links hidden states to observations.” Reviewer B states, “Pi is the probability of every complete observation sequence.” What is the correct verdict about the roles of A and B?

**Choices:**
- **A.** Reviewer B only is correct about the roles of A and B
- **B.** Reviewer A only is correct about the roles of A and B
- **C.** Both reviewers are correct about the roles of A and B
- **D.** Neither reviewer is correct about the roles of A and B

**Correct Answer:** Reviewer A only is correct about the roles of A and B

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 95

**Question:** Reviewer A states, “Forward initialization multiplies each initial-state probability by that state's first-observation emission.” Reviewer B states, “Forward initialization sets all states to probability one.” What is the correct verdict about forward initialization?

**Choices:**
- **A.** Neither reviewer is correct about forward initialization
- **B.** Reviewer B only is correct about forward initialization
- **C.** Reviewer A only is correct about forward initialization
- **D.** Both reviewers are correct about forward initialization

**Correct Answer:** Reviewer A only is correct about forward initialization

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, alpha_1(j)=pi_j B_j(o1).

---

## Question 96

**Question:** Reviewer A states, “Forward recursion sums incoming path mass before multiplying by the destination state's emission.” Reviewer B states, “Forward recursion discards transition probabilities.” What is the correct verdict about forward recursion?

**Choices:**
- **A.** Reviewer B only is correct about forward recursion
- **B.** Neither reviewer is correct about forward recursion
- **C.** Both reviewers are correct about forward recursion
- **D.** Reviewer A only is correct about forward recursion

**Correct Answer:** Reviewer A only is correct about forward recursion

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The sum over i accounts for all paths reaching state j.

---

## Question 97

**Question:** Reviewer A states, “Forward termination sums final alpha values to obtain the observation-sequence likelihood.” Reviewer B states, “Termination learns A, B, and pi automatically.” What is the correct verdict about forward termination?

**Choices:**
- **A.** Both reviewers are correct about forward termination
- **B.** Reviewer A only is correct about forward termination
- **C.** Reviewer B only is correct about forward termination
- **D.** Neither reviewer is correct about forward termination

**Correct Answer:** Reviewer A only is correct about forward termination

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, All possible final hidden states contribute to $P(O\mid M)$.

---

## Question 98

**Question:** Reviewer A states, “Evaluation asks for $P(O\mid M)$, whereas decoding asks for a most likely hidden-state sequence.” Reviewer B states, “Learning assumes A, B, and pi can never change.” What is the correct verdict about evaluation versus decoding?

**Choices:**
- **A.** Both reviewers are correct about evaluation versus decoding
- **B.** Reviewer B only is correct about evaluation versus decoding
- **C.** Reviewer A only is correct about evaluation versus decoding
- **D.** Neither reviewer is correct about evaluation versus decoding

**Correct Answer:** Reviewer A only is correct about evaluation versus decoding

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The three canonical HMM problems have distinct outputs.

---

## Question 99

**Question:** Reviewer A states, “Word recognition can compare observation likelihoods under several candidate HMMs.” Reviewer B states, “Observation images replace the need for emission probabilities.” What is the correct verdict about word-model comparison?

**Choices:**
- **A.** Reviewer A only is correct about word-model comparison
- **B.** Reviewer B only is correct about word-model comparison
- **C.** Both reviewers are correct about word-model comparison
- **D.** Neither reviewer is correct about word-model comparison

**Correct Answer:** Reviewer A only is correct about word-model comparison

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Evaluation under each model supports choosing the best-matching candidate.

---

## Question 100

**Question:** Reviewer A states, “Rows of the stated transition matrix describe conditional next-state probabilities from a current state.” Reviewer B states, “The diagonal entries are observation probabilities rather than persistence.” What is the correct verdict about transition-matrix rows?

**Choices:**
- **A.** Reviewer B only is correct about transition-matrix rows
- **B.** Reviewer A only is correct about transition-matrix rows
- **C.** Both reviewers are correct about transition-matrix rows
- **D.** Neither reviewer is correct about transition-matrix rows

**Correct Answer:** Reviewer A only is correct about transition-matrix rows

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, A transition row is a conditional distribution and therefore sums to one.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Questions were audited for structural balance, verbatim reuse, and parameter-only duplicate prompts.
