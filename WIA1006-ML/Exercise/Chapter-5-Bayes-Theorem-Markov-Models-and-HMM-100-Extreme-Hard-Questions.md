# Chapter 5: Bayes Theorem, Markov Models, and HMM: 100 Extreme-Hard Questions

> Topics: Bayes theorem, Markov sequence probability, HMM structure, forward evaluation, decoding, and learning distinctions. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** A condition has prior 0.1, sensitivity P(+|C)=0.7, and false-positive rate P(+|not C)=0.15. What is P(C|+)?

**Choices:**
- **A.** 0.07
- **B.** 0.205
- **C.** 0.3415
- **D.** 0.6585

**Correct Answer:** 0.3415

**Explanation:** Evidence=0.7(0.1)+0.15(1-0.1)=0.205; posterior=0.3415.

---

## Question 2

**Question:** A Markov path has initial probability 0.2 and successive transition probabilities ['0.8', '0.4', '0.6']. What is its joint probability?

**Choices:**
- **A.** 0.36
- **B.** 0.192
- **C.** 0.0128
- **D.** 0.0384

**Correct Answer:** 0.0384

**Explanation:** Multiply the one initial term and every transition: 0.2 x 0.8 x 0.4 x 0.6=0.0384.

---

## Question 3

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.7', '0.2'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.4', '0.6']. What is P(o1,o2)?

**Choices:**
- **A.** 0.5
- **B.** 0.144
- **C.** 0.228
- **D.** 0.0121

**Correct Answer:** 0.228

**Explanation:** alpha1=['0.42', '0.08']; alpha2=['0.144', '0.084']; summing final alphas gives 0.228.

---

## Question 4

**Question:** Current forward vector is ['0.12', '0.18'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.06, 0.072)
- **B.** (0.069, 0.0672)
- **C.** (0.15, 0.12)
- **D.** (0.09, 0.072)

**Correct Answer:** (0.06, 0.072)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.06', '0.072'].

---

## Question 5

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.02', '0.015', '0.025']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 3 with 0.025
- **B.** Model 2 with 0.015
- **C.** All models with 0.06
- **D.** Model 3 with 0.4167

**Correct Answer:** Model 3 with 0.025

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 3's 0.025.

---

## Question 6

**Question:** A condition has prior 0.12, sensitivity P(+|C)=0.68, and false-positive rate P(+|not C)=0.16. What is P(C|+)?

**Choices:**
- **A.** 0.0816
- **B.** 0.3669
- **C.** 0.2224
- **D.** 0.6331

**Correct Answer:** 0.3669

**Explanation:** Evidence=0.68(0.12)+0.16(1-0.12)=0.2224; posterior=0.3669.

---

## Question 7

**Question:** A Markov path has initial probability 0.23 and successive transition probabilities ['0.8', '0.4', '0.6', '0.3']. What is its joint probability?

**Choices:**
- **A.** 0.483
- **B.** 0.0576
- **C.** 0.0033
- **D.** 0.0132

**Correct Answer:** 0.0132

**Explanation:** Multiply the one initial term and every transition: 0.23 x 0.8 x 0.4 x 0.6 x 0.3=0.0132.

---

## Question 8

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.69', '0.21'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.41', '0.59']. What is P(o1,o2)?

**Choices:**
- **A.** 0.498
- **B.** 0.2297
- **C.** 0.1461
- **D.** 0.0122

**Correct Answer:** 0.2297

**Explanation:** alpha1=['0.414', '0.084']; alpha2=['0.1461', '0.0835']; summing final alphas gives 0.2297.

---

## Question 9

**Question:** Current forward vector is ['0.13', '0.175'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.063, 0.0716)
- **B.** (0.0717, 0.0664)
- **C.** (0.1525, 0.122)
- **D.** (0.0875, 0.07)

**Correct Answer:** (0.063, 0.0716)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.063', '0.0716'].

---

## Question 10

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.022', '0.018', '0.024']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 2 with 0.018
- **B.** All models with 0.064
- **C.** Model 3 with 0.024
- **D.** Model 3 with 0.375

**Correct Answer:** Model 3 with 0.024

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 3's 0.024.

---

## Question 11

**Question:** A condition has prior 0.14, sensitivity P(+|C)=0.66, and false-positive rate P(+|not C)=0.17. What is P(C|+)?

**Choices:**
- **A.** 0.3873
- **B.** 0.0924
- **C.** 0.2386
- **D.** 0.6127

**Correct Answer:** 0.3873

**Explanation:** Evidence=0.66(0.14)+0.17(1-0.14)=0.2386; posterior=0.3873.

---

## Question 12

**Question:** A Markov path has initial probability 0.26 and successive transition probabilities ['0.8', '0.4', '0.6']. What is its joint probability?

**Choices:**
- **A.** 0.0499
- **B.** 0.468
- **C.** 0.192
- **D.** 0.0166

**Correct Answer:** 0.0499

**Explanation:** Multiply the one initial term and every transition: 0.26 x 0.8 x 0.4 x 0.6=0.0499.

---

## Question 13

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.68', '0.22'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.42', '0.58']. What is P(o1,o2)?

**Choices:**
- **A.** 0.496
- **B.** 0.1482
- **C.** 0.2312
- **D.** 0.0123

**Correct Answer:** 0.2312

**Explanation:** alpha1=['0.408', '0.088']; alpha2=['0.1482', '0.0831']; summing final alphas gives 0.2312.

---

## Question 14

**Question:** Current forward vector is ['0.14', '0.17'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.0745, 0.0656)
- **B.** (0.066, 0.0712)
- **C.** (0.155, 0.124)
- **D.** (0.085, 0.068)

**Correct Answer:** (0.066, 0.0712)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.066', '0.0712'].

---

## Question 15

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.024', '0.021', '0.023']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 2 with 0.021
- **B.** All models with 0.068
- **C.** Model 1 with 0.3529
- **D.** Model 1 with 0.024

**Correct Answer:** Model 1 with 0.024

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 1's 0.024.

---

## Question 16

**Question:** A condition has prior 0.16, sensitivity P(+|C)=0.64, and false-positive rate P(+|not C)=0.18. What is P(C|+)?

**Choices:**
- **A.** 0.4038
- **B.** 0.1024
- **C.** 0.2536
- **D.** 0.5962

**Correct Answer:** 0.4038

**Explanation:** Evidence=0.64(0.16)+0.18(1-0.16)=0.2536; posterior=0.4038.

---

## Question 17

**Question:** A Markov path has initial probability 0.29 and successive transition probabilities ['0.8', '0.4', '0.6', '0.3']. What is its joint probability?

**Choices:**
- **A.** 0.0167
- **B.** 0.609
- **C.** 0.0576
- **D.** 0.0042

**Correct Answer:** 0.0167

**Explanation:** Multiply the one initial term and every transition: 0.29 x 0.8 x 0.4 x 0.6 x 0.3=0.0167.

---

## Question 18

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.67', '0.23'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.43', '0.57']. What is P(o1,o2)?

**Choices:**
- **A.** 0.494
- **B.** 0.2327
- **C.** 0.1502
- **D.** 0.0124

**Correct Answer:** 0.2327

**Explanation:** alpha1=['0.402', '0.092']; alpha2=['0.1502', '0.0825']; summing final alphas gives 0.2327.

---

## Question 19

**Question:** Current forward vector is ['0.15', '0.165'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.0772, 0.0648)
- **B.** (0.1575, 0.126)
- **C.** (0.0825, 0.066)
- **D.** (0.069, 0.0708)

**Correct Answer:** (0.069, 0.0708)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.069', '0.0708'].

---

## Question 20

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.026', '0.024', '0.022']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 1 with 0.026
- **B.** Model 3 with 0.022
- **C.** All models with 0.072
- **D.** Model 1 with 0.3611

**Correct Answer:** Model 1 with 0.026

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 1's 0.026.

---

## Question 21

**Question:** A condition has prior 0.18, sensitivity P(+|C)=0.62, and false-positive rate P(+|not C)=0.19. What is P(C|+)?

**Choices:**
- **A.** 0.1116
- **B.** 0.4174
- **C.** 0.2674
- **D.** 0.5826

**Correct Answer:** 0.4174

**Explanation:** Evidence=0.62(0.18)+0.19(1-0.18)=0.2674; posterior=0.4174.

---

## Question 22

**Question:** A Markov path has initial probability 0.32 and successive transition probabilities ['0.8', '0.4', '0.6']. What is its joint probability?

**Choices:**
- **A.** 0.0614
- **B.** 0.576
- **C.** 0.192
- **D.** 0.0205

**Correct Answer:** 0.0614

**Explanation:** Multiply the one initial term and every transition: 0.32 x 0.8 x 0.4 x 0.6=0.0614.

---

## Question 23

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.66', '0.24'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.44', '0.56']. What is P(o1,o2)?

**Choices:**
- **A.** 0.492
- **B.** 0.1521
- **C.** 0.234
- **D.** 0.0125

**Correct Answer:** 0.234

**Explanation:** alpha1=['0.396', '0.096']; alpha2=['0.1521', '0.082']; summing final alphas gives 0.234.

---

## Question 24

**Question:** Current forward vector is ['0.16', '0.16'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.08, 0.064), even when the other quantities in the formula are fixed
- **B.** (0.16, 0.128)
- **C.** (0.08, 0.064)
- **D.** (0.072, 0.0704)

**Correct Answer:** (0.072, 0.0704)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.072', '0.0704'].

---

## Question 25

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.028', '0.027', '0.021']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 3 with 0.021
- **B.** All models with 0.076
- **C.** Model 1 with 0.3684
- **D.** Model 1 with 0.028

**Correct Answer:** Model 1 with 0.028

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 1's 0.028.

---

## Question 26

**Question:** A condition has prior 0.2, sensitivity P(+|C)=0.7, and false-positive rate P(+|not C)=0.2. What is P(C|+)?

**Choices:**
- **A.** 0.14
- **B.** 0.3
- **C.** 0.4667
- **D.** 0.5333

**Correct Answer:** 0.4667

**Explanation:** Evidence=0.7(0.2)+0.2(1-0.2)=0.3; posterior=0.4667.

---

## Question 27

**Question:** A Markov path has initial probability 0.35 and successive transition probabilities ['0.8', '0.4', '0.6', '0.3']. What is its joint probability?

**Choices:**
- **A.** 0.735
- **B.** 0.0576
- **C.** 0.005
- **D.** 0.0202

**Correct Answer:** 0.0202

**Explanation:** Multiply the one initial term and every transition: 0.35 x 0.8 x 0.4 x 0.6 x 0.3=0.0202.

---

## Question 28

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.65', '0.25'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.45', '0.55']. What is P(o1,o2)?

**Choices:**
- **A.** 0.49
- **B.** 0.2353
- **C.** 0.1539
- **D.** 0.0125

**Correct Answer:** 0.2353

**Explanation:** alpha1=['0.39', '0.1']; alpha2=['0.1539', '0.0814']; summing final alphas gives 0.2353.

---

## Question 29

**Question:** Current forward vector is ['0.17', '0.155'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.0827, 0.0632)
- **B.** (0.1625, 0.13)
- **C.** (0.085, 0.068)
- **D.** (0.075, 0.07)

**Correct Answer:** (0.075, 0.07)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.075', '0.07'].

---

## Question 30

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.03', '0.03', '0.02']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 1 with 0.03
- **B.** Model 3 with 0.02
- **C.** All models with 0.08
- **D.** Model 1 with 0.375

**Correct Answer:** Model 1 with 0.03

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 1's 0.03.

---

## Question 31

**Question:** A condition has prior 0.22, sensitivity P(+|C)=0.68, and false-positive rate P(+|not C)=0.21. What is P(C|+)?

**Choices:**
- **A.** 0.1496
- **B.** 0.3134
- **C.** 0.4773
- **D.** 0.5227

**Correct Answer:** 0.4773

**Explanation:** Evidence=0.68(0.22)+0.21(1-0.22)=0.3134; posterior=0.4773.

---

## Question 32

**Question:** A Markov path has initial probability 0.38 and successive transition probabilities ['0.8', '0.4', '0.6']. What is its joint probability?

**Choices:**
- **A.** 0.073
- **B.** 0.684
- **C.** 0.192
- **D.** 0.0243

**Correct Answer:** 0.073

**Explanation:** Multiply the one initial term and every transition: 0.38 x 0.8 x 0.4 x 0.6=0.073.

---

## Question 33

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.64', '0.26'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.46', '0.54']. What is P(o1,o2)?

**Choices:**
- **A.** 0.2364
- **B.** 0.488
- **C.** 0.1557
- **D.** 0.0126

**Correct Answer:** 0.2364

**Explanation:** alpha1=['0.384', '0.104']; alpha2=['0.1557', '0.0808']; summing final alphas gives 0.2364.

---

## Question 34

**Question:** Current forward vector is ['0.18', '0.15'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.0855, 0.0624)
- **B.** (0.078, 0.0696)
- **C.** (0.165, 0.132)
- **D.** (0.09, 0.072)

**Correct Answer:** (0.078, 0.0696)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.078', '0.0696'].

---

## Question 35

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.032', '0.033', '0.019']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 3 with 0.019
- **B.** All models with 0.084
- **C.** Model 2 with 0.3929
- **D.** Model 2 with 0.033

**Correct Answer:** Model 2 with 0.033

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 2's 0.033.

---

## Question 36

**Question:** A condition has prior 0.24, sensitivity P(+|C)=0.66, and false-positive rate P(+|not C)=0.22. What is P(C|+)?

**Choices:**
- **A.** 0.1584
- **B.** 0.3256
- **C.** 0.4865
- **D.** 0.5135

**Correct Answer:** 0.4865

**Explanation:** Evidence=0.66(0.24)+0.22(1-0.24)=0.3256; posterior=0.4865.

---

## Question 37

**Question:** A Markov path has initial probability 0.41 and successive transition probabilities ['0.8', '0.4', '0.6', '0.3']. What is its joint probability?

**Choices:**
- **A.** 0.0236
- **B.** 0.861
- **C.** 0.0576
- **D.** 0.0059

**Correct Answer:** 0.0236

**Explanation:** Multiply the one initial term and every transition: 0.41 x 0.8 x 0.4 x 0.6 x 0.3=0.0236.

---

## Question 38

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.63', '0.27'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.47', '0.53']. What is P(o1,o2)?

**Choices:**
- **A.** 0.2375
- **B.** 0.486
- **C.** 0.1574
- **D.** 0.0126

**Correct Answer:** 0.2375

**Explanation:** alpha1=['0.378', '0.108']; alpha2=['0.1574', '0.0801']; summing final alphas gives 0.2375.

---

## Question 39

**Question:** Current forward vector is ['0.19', '0.145'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.0882, 0.0616)
- **B.** (0.1675, 0.134)
- **C.** (0.095, 0.076)
- **D.** (0.081, 0.0692)

**Correct Answer:** (0.081, 0.0692)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.081', '0.0692'].

---

## Question 40

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.034', '0.036', '0.018']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 3 with 0.018
- **B.** Model 2 with 0.036
- **C.** All models with 0.088
- **D.** Model 2 with 0.4091

**Correct Answer:** Model 2 with 0.036

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 2's 0.036.

---

## Question 41

**Question:** A condition has prior 0.26, sensitivity P(+|C)=0.64, and false-positive rate P(+|not C)=0.23. What is P(C|+)?

**Choices:**
- **A.** 0.1664
- **B.** 0.3366
- **C.** 0.4944
- **D.** 0.5056

**Correct Answer:** 0.4944

**Explanation:** Evidence=0.64(0.26)+0.23(1-0.26)=0.3366; posterior=0.4944.

---

## Question 42

**Question:** A Markov path has initial probability 0.44 and successive transition probabilities ['0.8', '0.4', '0.6']. What is its joint probability?

**Choices:**
- **A.** 0.792
- **B.** 0.192
- **C.** 0.0845
- **D.** 0.0282

**Correct Answer:** 0.0845

**Explanation:** Multiply the one initial term and every transition: 0.44 x 0.8 x 0.4 x 0.6=0.0845.

---

## Question 43

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.62', '0.28'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.48', '0.52']. What is P(o1,o2)?

**Choices:**
- **A.** 0.484
- **B.** 0.159
- **C.** 0.0126
- **D.** 0.2384

**Correct Answer:** 0.2384

**Explanation:** alpha1=['0.372', '0.112']; alpha2=['0.159', '0.0795']; summing final alphas gives 0.2384.

---

## Question 44

**Question:** Current forward vector is ['0.2', '0.14'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.091, 0.0608)
- **B.** (0.17, 0.136)
- **C.** (0.084, 0.0688)
- **D.** (0.1, 0.08)

**Correct Answer:** (0.084, 0.0688)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.084', '0.0688'].

---

## Question 45

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.036', '0.039', '0.017']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 3 with 0.017
- **B.** Model 2 with 0.039
- **C.** All models with 0.092
- **D.** Model 2 with 0.4239

**Correct Answer:** Model 2 with 0.039

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 2's 0.039.

---

## Question 46

**Question:** A condition has prior 0.28, sensitivity P(+|C)=0.62, and false-positive rate P(+|not C)=0.24. What is P(C|+)?

**Choices:**
- **A.** 0.1736
- **B.** 0.3464
- **C.** 0.4988
- **D.** 0.5012

**Correct Answer:** 0.5012

**Explanation:** Evidence=0.62(0.28)+0.24(1-0.28)=0.3464; posterior=0.5012.

---

## Question 47

**Question:** A Markov path has initial probability 0.47 and successive transition probabilities ['0.8', '0.4', '0.6', '0.3']. What is its joint probability?

**Choices:**
- **A.** 0.987
- **B.** 0.0576
- **C.** 0.0068
- **D.** 0.0271

**Correct Answer:** 0.0271

**Explanation:** Multiply the one initial term and every transition: 0.47 x 0.8 x 0.4 x 0.6 x 0.3=0.0271.

---

## Question 48

**Question:** For a two-state HMM, pi=[0.6, 0.4], first-emission=['0.61', '0.29'], A=[[0.8, 0.2], [0.3, 0.7]], second-emission=['0.49', '0.51']. What is P(o1,o2)?

**Choices:**
- **A.** 0.482
- **B.** 0.1605
- **C.** 0.2393
- **D.** 0.0126

**Correct Answer:** 0.2393

**Explanation:** alpha1=['0.366', '0.116']; alpha2=['0.1605', '0.0787']; summing final alphas gives 0.2393.

---

## Question 49

**Question:** Current forward vector is ['0.21', '0.135'], A=[[0.7, 0.3], [0.2, 0.8]], and next-symbol emissions=[0.5, 0.4]. What is the next forward vector?

**Choices:**
- **A.** (0.0938, 0.06)
- **B.** (0.1725, 0.138)
- **C.** (0.105, 0.084)
- **D.** (0.087, 0.0684)

**Correct Answer:** (0.087, 0.0684)

**Explanation:** For each destination j, sum alpha_i a_ij, then multiply by its emission, yielding ['0.087', '0.0684'].

---

## Question 50

**Question:** Three word HMMs assign an observed image sequence likelihoods ['0.038', '0.042', '0.016']. Under maximum likelihood, which model and likelihood are selected?

**Choices:**
- **A.** Model 3 with 0.016
- **B.** Model 2 with 0.042
- **C.** All models with 0.096
- **D.** Model 2 with 0.4375

**Correct Answer:** Model 2 with 0.042

**Explanation:** Evaluation supplies one likelihood per candidate; the largest is model 2's 0.042.

---

## Question 51

**Question:** A probabilistic sequence model is reviewed. Case 1: Which conclusion is the single most defensible?

**Choices:**
- **A.** The evidence P(B) normalizes prior-times-likelihood values into a posterior.
- **B.** The evidence is always equal to the likelihood for every hypothesis., under both the training and evaluation conditions stated
- **C.** The posterior is computed without using the prior.
- **D.** Bayes' theorem makes P(A|B) equal to P(B|A).

**Correct Answer:** The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Explanation:** P(B) is the denominator in the displayed Bayes formula.

---

## Question 52

**Question:** A probabilistic sequence model is reviewed. Case 2: Which conclusion is the single most defensible?

**Choices:**
- **A.** The next state is independent of the current state.
- **B.** The Markov property conditions the next state on the current state rather than the full history.
- **C.** Every state sequence must have equal probability.
- **D.** The initial state distribution is unnecessary for sequence probability., even when the other quantities in the formula are fixed

**Correct Answer:** The Markov property conditions the next state on the current state rather than the full history.

**Explanation:** A first-order chain retains the most recent state for predicting the next.

---

## Question 53

**Question:** A probabilistic sequence model is reviewed. Case 3: Which conclusion is the single most defensible?

**Choices:**
- **A.** It adds transition probabilities and divides by sequence length., as a consequence that holds for every permitted input
- **B.** It multiplies emissions even when no observations are modeled.
- **C.** It omits the transition into the final state.
- **D.** A Markov sequence probability multiplies one initial probability and all required transitions.

**Correct Answer:** A Markov sequence probability multiplies one initial probability and all required transitions.

**Explanation:** The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 54

**Question:** A probabilistic sequence model is reviewed. Case 4: Which conclusion is the single most defensible?

**Choices:**
- **A.** A emits observations and B chooses the initial state.
- **B.** In an HMM, A models hidden-state transitions while B links hidden states to observations.
- **C.** B transitions directly between visible observations only.
- **D.** Pi is the probability of every complete observation sequence., without needing any additional modeling assumption

**Correct Answer:** In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Explanation:** The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 55

**Question:** A probabilistic sequence model is reviewed. Case 5: Which conclusion is the single most defensible?

**Choices:**
- **A.** Forward initialization sums every transition before seeing the first observation., under both the training and evaluation conditions stated
- **B.** Forward initialization chooses only the largest initial probability.
- **C.** Forward initialization sets all states to probability one.
- **D.** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Correct Answer:** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Explanation:** alpha_1(j)=pi_j B_j(o1).

---

## Question 56

**Question:** A probabilistic sequence model is reviewed. Case 6: Which conclusion is the single most defensible?

**Choices:**
- **A.** Forward recursion multiplies only the single largest incoming path., even when the other quantities in the formula are fixed
- **B.** The emission belongs to the source state at the previous time only.
- **C.** Forward recursion sums incoming path mass before multiplying by the destination state's emission.
- **D.** Forward recursion discards transition probabilities.

**Correct Answer:** Forward recursion sums incoming path mass before multiplying by the destination state's emission.

**Explanation:** The sum over i accounts for all paths reaching state j.

---

## Question 57

**Question:** A probabilistic sequence model is reviewed. Case 7: Which conclusion is the single most defensible?

**Choices:**
- **A.** Termination selects the state with the smallest alpha., as a consequence that holds for every permitted input
- **B.** Forward termination sums final alpha values to obtain the observation-sequence likelihood.
- **C.** Termination divides each alpha by its emission.
- **D.** Termination learns A, B, and pi automatically.

**Correct Answer:** Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Explanation:** All possible final hidden states contribute to P(O|M).

---

## Question 58

**Question:** A probabilistic sequence model is reviewed. Case 8: Which conclusion is the single most defensible?

**Choices:**
- **A.** Evaluation and decoding both mean learning model parameters.
- **B.** Decoding returns only the observation probability and no states., without needing any additional modeling assumption
- **C.** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.
- **D.** Learning assumes A, B, and pi can never change.

**Correct Answer:** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.

**Explanation:** The three canonical HMM problems have distinct outputs.

---

## Question 59

**Question:** A probabilistic sequence model is reviewed. Case 9: Which conclusion is the single most defensible?

**Choices:**
- **A.** Word recognition directly observes the hidden word state at every time., under both the training and evaluation conditions stated
- **B.** The least likely HMM must be selected by definition.
- **C.** Observation images replace the need for emission probabilities.
- **D.** Word recognition can compare observation likelihoods under several candidate HMMs.

**Correct Answer:** Word recognition can compare observation likelihoods under several candidate HMMs.

**Explanation:** Evaluation under each model supports choosing the best-matching candidate.

---

## Question 60

**Question:** A probabilistic sequence model is reviewed. Case 10: Which conclusion is the single most defensible?

**Choices:**
- **A.** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.
- **B.** Every matrix entry is an unconditional initial probability.
- **C.** A transition row may sum to any value because probabilities are unrelated.
- **D.** The diagonal entries are observation probabilities rather than persistence., even when the other quantities in the formula are fixed

**Correct Answer:** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Explanation:** A transition row is a conditional distribution and therefore sums to one.

---

## Question 61

**Question:** A probabilistic sequence model is reviewed. Case 11: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The evidence is always equal to the likelihood for every hypothesis., as a consequence that holds for every permitted input
- **B.** The evidence P(B) normalizes prior-times-likelihood values into a posterior.
- **C.** The posterior is computed without using the prior.
- **D.** Bayes' theorem makes P(A|B) equal to P(B|A).

**Correct Answer:** The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Explanation:** P(B) is the denominator in the displayed Bayes formula.

---

## Question 62

**Question:** A probabilistic sequence model is reviewed. Case 12: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The next state is independent of the current state.
- **B.** Every state sequence must have equal probability.
- **C.** The Markov property conditions the next state on the current state rather than the full history.
- **D.** The initial state distribution is unnecessary for sequence probability., without needing any additional modeling assumption

**Correct Answer:** The Markov property conditions the next state on the current state rather than the full history.

**Explanation:** A first-order chain retains the most recent state for predicting the next.

---

## Question 63

**Question:** A probabilistic sequence model is reviewed. Case 13: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A Markov sequence probability multiplies one initial probability and all required transitions.
- **B.** It adds transition probabilities and divides by sequence length., under both the training and evaluation conditions stated
- **C.** It multiplies emissions even when no observations are modeled.
- **D.** It omits the transition into the final state.

**Correct Answer:** A Markov sequence probability multiplies one initial probability and all required transitions.

**Explanation:** The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 64

**Question:** A probabilistic sequence model is reviewed. Case 14: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A emits observations and B chooses the initial state.
- **B.** B transitions directly between visible observations only.
- **C.** Pi is the probability of every complete observation sequence., even when the other quantities in the formula are fixed
- **D.** In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Correct Answer:** In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Explanation:** The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 65

**Question:** A probabilistic sequence model is reviewed. Case 15: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Forward initialization sums every transition before seeing the first observation., as a consequence that holds for every permitted input
- **B.** Forward initialization chooses only the largest initial probability.
- **C.** Forward initialization multiplies each initial-state probability by that state's first-observation emission.
- **D.** Forward initialization sets all states to probability one.

**Correct Answer:** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Explanation:** alpha_1(j)=pi_j B_j(o1).

---

## Question 66

**Question:** A probabilistic sequence model is reviewed. Case 16: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Forward recursion multiplies only the single largest incoming path., without needing any additional modeling assumption
- **B.** Forward recursion sums incoming path mass before multiplying by the destination state's emission.
- **C.** The emission belongs to the source state at the previous time only.
- **D.** Forward recursion discards transition probabilities.

**Correct Answer:** Forward recursion sums incoming path mass before multiplying by the destination state's emission.

**Explanation:** The sum over i accounts for all paths reaching state j.

---

## Question 67

**Question:** A probabilistic sequence model is reviewed. Case 17: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Termination selects the state with the smallest alpha., under both the training and evaluation conditions stated
- **B.** Termination divides each alpha by its emission.
- **C.** Forward termination sums final alpha values to obtain the observation-sequence likelihood.
- **D.** Termination learns A, B, and pi automatically.

**Correct Answer:** Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Explanation:** All possible final hidden states contribute to P(O|M).

---

## Question 68

**Question:** A probabilistic sequence model is reviewed. Case 18: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Evaluation and decoding both mean learning model parameters.
- **B.** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.
- **C.** Decoding returns only the observation probability and no states., even when the other quantities in the formula are fixed
- **D.** Learning assumes A, B, and pi can never change.

**Correct Answer:** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.

**Explanation:** The three canonical HMM problems have distinct outputs.

---

## Question 69

**Question:** A probabilistic sequence model is reviewed. Case 19: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Word recognition directly observes the hidden word state at every time., as a consequence that holds for every permitted input
- **B.** Word recognition can compare observation likelihoods under several candidate HMMs.
- **C.** The least likely HMM must be selected by definition.
- **D.** Observation images replace the need for emission probabilities.

**Correct Answer:** Word recognition can compare observation likelihoods under several candidate HMMs.

**Explanation:** Evaluation under each model supports choosing the best-matching candidate.

---

## Question 70

**Question:** A probabilistic sequence model is reviewed. Case 20: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Every matrix entry is an unconditional initial probability.
- **B.** A transition row may sum to any value because probabilities are unrelated.
- **C.** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.
- **D.** The diagonal entries are observation probabilities rather than persistence., without needing any additional modeling assumption

**Correct Answer:** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Explanation:** A transition row is a conditional distribution and therefore sums to one.

---

## Question 71

**Question:** A probabilistic sequence model is reviewed. Case 21: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The evidence is always equal to the likelihood for every hypothesis., under both the training and evaluation conditions stated
- **B.** The posterior is computed without using the prior.
- **C.** The evidence P(B) normalizes prior-times-likelihood values into a posterior.
- **D.** Bayes' theorem makes P(A|B) equal to P(B|A).

**Correct Answer:** The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Explanation:** P(B) is the denominator in the displayed Bayes formula.

---

## Question 72

**Question:** A probabilistic sequence model is reviewed. Case 22: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The next state is independent of the current state.
- **B.** The Markov property conditions the next state on the current state rather than the full history.
- **C.** Every state sequence must have equal probability.
- **D.** The initial state distribution is unnecessary for sequence probability., even when the other quantities in the formula are fixed

**Correct Answer:** The Markov property conditions the next state on the current state rather than the full history.

**Explanation:** A first-order chain retains the most recent state for predicting the next.

---

## Question 73

**Question:** A probabilistic sequence model is reviewed. Case 23: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A Markov sequence probability multiplies one initial probability and all required transitions.
- **B.** It adds transition probabilities and divides by sequence length., as a consequence that holds for every permitted input
- **C.** It multiplies emissions even when no observations are modeled.
- **D.** It omits the transition into the final state.

**Correct Answer:** A Markov sequence probability multiplies one initial probability and all required transitions.

**Explanation:** The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 74

**Question:** A probabilistic sequence model is reviewed. Case 24: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** In an HMM, A models hidden-state transitions while B links hidden states to observations.
- **B.** A emits observations and B chooses the initial state.
- **C.** B transitions directly between visible observations only.
- **D.** Pi is the probability of every complete observation sequence., without needing any additional modeling assumption

**Correct Answer:** In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Explanation:** The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 75

**Question:** A probabilistic sequence model is reviewed. Case 25: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Forward initialization sums every transition before seeing the first observation., under both the training and evaluation conditions stated
- **B.** Forward initialization chooses only the largest initial probability.
- **C.** Forward initialization sets all states to probability one.
- **D.** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Correct Answer:** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Explanation:** alpha_1(j)=pi_j B_j(o1).

---

## Question 76

**Question:** A probabilistic sequence model is reviewed. Case 26: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Forward recursion multiplies only the single largest incoming path., even when the other quantities in the formula are fixed
- **B.** Forward recursion sums incoming path mass before multiplying by the destination state's emission.
- **C.** The emission belongs to the source state at the previous time only.
- **D.** Forward recursion discards transition probabilities.

**Correct Answer:** Forward recursion sums incoming path mass before multiplying by the destination state's emission.

**Explanation:** The sum over i accounts for all paths reaching state j.

---

## Question 77

**Question:** A probabilistic sequence model is reviewed. Case 27: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Termination selects the state with the smallest alpha., as a consequence that holds for every permitted input
- **B.** Termination divides each alpha by its emission.
- **C.** Forward termination sums final alpha values to obtain the observation-sequence likelihood.
- **D.** Termination learns A, B, and pi automatically.

**Correct Answer:** Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Explanation:** All possible final hidden states contribute to P(O|M).

---

## Question 78

**Question:** A probabilistic sequence model is reviewed. Case 28: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Evaluation and decoding both mean learning model parameters.
- **B.** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.
- **C.** Decoding returns only the observation probability and no states., without needing any additional modeling assumption
- **D.** Learning assumes A, B, and pi can never change.

**Correct Answer:** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.

**Explanation:** The three canonical HMM problems have distinct outputs.

---

## Question 79

**Question:** A probabilistic sequence model is reviewed. Case 29: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Word recognition can compare observation likelihoods under several candidate HMMs.
- **B.** Word recognition directly observes the hidden word state at every time., under both the training and evaluation conditions stated
- **C.** The least likely HMM must be selected by definition.
- **D.** Observation images replace the need for emission probabilities.

**Correct Answer:** Word recognition can compare observation likelihoods under several candidate HMMs.

**Explanation:** Evaluation under each model supports choosing the best-matching candidate.

---

## Question 80

**Question:** A probabilistic sequence model is reviewed. Case 30: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Every matrix entry is an unconditional initial probability.
- **B.** A transition row may sum to any value because probabilities are unrelated.
- **C.** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.
- **D.** The diagonal entries are observation probabilities rather than persistence., even when the other quantities in the formula are fixed

**Correct Answer:** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Explanation:** A transition row is a conditional distribution and therefore sums to one.

---

## Question 81

**Question:** A probabilistic sequence model is reviewed. Case 31: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The evidence is always equal to the likelihood for every hypothesis., as a consequence that holds for every permitted input
- **B.** The posterior is computed without using the prior.
- **C.** Bayes' theorem makes P(A|B) equal to P(B|A).
- **D.** The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Correct Answer:** The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Explanation:** P(B) is the denominator in the displayed Bayes formula.

---

## Question 82

**Question:** A probabilistic sequence model is reviewed. Case 32: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The next state is independent of the current state.
- **B.** Every state sequence must have equal probability.
- **C.** The Markov property conditions the next state on the current state rather than the full history.
- **D.** The initial state distribution is unnecessary for sequence probability., without needing any additional modeling assumption

**Correct Answer:** The Markov property conditions the next state on the current state rather than the full history.

**Explanation:** A first-order chain retains the most recent state for predicting the next.

---

## Question 83

**Question:** A probabilistic sequence model is reviewed. Case 33: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** It adds transition probabilities and divides by sequence length., under both the training and evaluation conditions stated
- **B.** It multiplies emissions even when no observations are modeled.
- **C.** A Markov sequence probability multiplies one initial probability and all required transitions.
- **D.** It omits the transition into the final state.

**Correct Answer:** A Markov sequence probability multiplies one initial probability and all required transitions.

**Explanation:** The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 84

**Question:** A probabilistic sequence model is reviewed. Case 34: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** In an HMM, A models hidden-state transitions while B links hidden states to observations.
- **B.** A emits observations and B chooses the initial state.
- **C.** B transitions directly between visible observations only.
- **D.** Pi is the probability of every complete observation sequence., even when the other quantities in the formula are fixed

**Correct Answer:** In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Explanation:** The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 85

**Question:** A probabilistic sequence model is reviewed. Case 35: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Forward initialization sums every transition before seeing the first observation., as a consequence that holds for every permitted input
- **B.** Forward initialization chooses only the largest initial probability.
- **C.** Forward initialization sets all states to probability one.
- **D.** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Correct Answer:** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Explanation:** alpha_1(j)=pi_j B_j(o1).

---

## Question 86

**Question:** A probabilistic sequence model is reviewed. Case 36: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Forward recursion sums incoming path mass before multiplying by the destination state's emission.
- **B.** Forward recursion multiplies only the single largest incoming path., without needing any additional modeling assumption
- **C.** The emission belongs to the source state at the previous time only.
- **D.** Forward recursion discards transition probabilities.

**Correct Answer:** Forward recursion sums incoming path mass before multiplying by the destination state's emission.

**Explanation:** The sum over i accounts for all paths reaching state j.

---

## Question 87

**Question:** A probabilistic sequence model is reviewed. Case 37: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Termination selects the state with the smallest alpha., under both the training and evaluation conditions stated
- **B.** Termination divides each alpha by its emission.
- **C.** Termination learns A, B, and pi automatically.
- **D.** Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Correct Answer:** Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Explanation:** All possible final hidden states contribute to P(O|M).

---

## Question 88

**Question:** A probabilistic sequence model is reviewed. Case 38: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Evaluation and decoding both mean learning model parameters.
- **B.** Decoding returns only the observation probability and no states., even when the other quantities in the formula are fixed
- **C.** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.
- **D.** Learning assumes A, B, and pi can never change.

**Correct Answer:** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.

**Explanation:** The three canonical HMM problems have distinct outputs.

---

## Question 89

**Question:** A probabilistic sequence model is reviewed. Case 39: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Word recognition directly observes the hidden word state at every time., as a consequence that holds for every permitted input
- **B.** The least likely HMM must be selected by definition.
- **C.** Observation images replace the need for emission probabilities.
- **D.** Word recognition can compare observation likelihoods under several candidate HMMs.

**Correct Answer:** Word recognition can compare observation likelihoods under several candidate HMMs.

**Explanation:** Evaluation under each model supports choosing the best-matching candidate.

---

## Question 90

**Question:** A probabilistic sequence model is reviewed. Case 40: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Every matrix entry is an unconditional initial probability.
- **B.** A transition row may sum to any value because probabilities are unrelated.
- **C.** The diagonal entries are observation probabilities rather than persistence., without needing any additional modeling assumption
- **D.** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Correct Answer:** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Explanation:** A transition row is a conditional distribution and therefore sums to one.

---

## Question 91

**Question:** A probabilistic sequence model is reviewed. Case 41: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The evidence is always equal to the likelihood for every hypothesis., under both the training and evaluation conditions stated
- **B.** The evidence P(B) normalizes prior-times-likelihood values into a posterior.
- **C.** The posterior is computed without using the prior.
- **D.** Bayes' theorem makes P(A|B) equal to P(B|A).

**Correct Answer:** The evidence P(B) normalizes prior-times-likelihood values into a posterior.

**Explanation:** P(B) is the denominator in the displayed Bayes formula.

---

## Question 92

**Question:** A probabilistic sequence model is reviewed. Case 42: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The Markov property conditions the next state on the current state rather than the full history.
- **B.** The next state is independent of the current state.
- **C.** Every state sequence must have equal probability.
- **D.** The initial state distribution is unnecessary for sequence probability., even when the other quantities in the formula are fixed

**Correct Answer:** The Markov property conditions the next state on the current state rather than the full history.

**Explanation:** A first-order chain retains the most recent state for predicting the next.

---

## Question 93

**Question:** A probabilistic sequence model is reviewed. Case 43: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A Markov sequence probability multiplies one initial probability and all required transitions.
- **B.** It adds transition probabilities and divides by sequence length., as a consequence that holds for every permitted input
- **C.** It multiplies emissions even when no observations are modeled.
- **D.** It omits the transition into the final state.

**Correct Answer:** A Markov sequence probability multiplies one initial probability and all required transitions.

**Explanation:** The joint sequence formula is P(s1) product from t=2 to k.

---

## Question 94

**Question:** A probabilistic sequence model is reviewed. Case 44: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A emits observations and B chooses the initial state.
- **B.** In an HMM, A models hidden-state transitions while B links hidden states to observations.
- **C.** B transitions directly between visible observations only.
- **D.** Pi is the probability of every complete observation sequence., without needing any additional modeling assumption

**Correct Answer:** In an HMM, A models hidden-state transitions while B links hidden states to observations.

**Explanation:** The model tuple assigns distinct transition, emission, and initial roles.

---

## Question 95

**Question:** A probabilistic sequence model is reviewed. Case 45: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Forward initialization multiplies each initial-state probability by that state's first-observation emission.
- **B.** Forward initialization sums every transition before seeing the first observation., under both the training and evaluation conditions stated
- **C.** Forward initialization chooses only the largest initial probability.
- **D.** Forward initialization sets all states to probability one.

**Correct Answer:** Forward initialization multiplies each initial-state probability by that state's first-observation emission.

**Explanation:** alpha_1(j)=pi_j B_j(o1).

---

## Question 96

**Question:** A probabilistic sequence model is reviewed. Case 46: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Forward recursion multiplies only the single largest incoming path., even when the other quantities in the formula are fixed
- **B.** Forward recursion sums incoming path mass before multiplying by the destination state's emission.
- **C.** The emission belongs to the source state at the previous time only.
- **D.** Forward recursion discards transition probabilities.

**Correct Answer:** Forward recursion sums incoming path mass before multiplying by the destination state's emission.

**Explanation:** The sum over i accounts for all paths reaching state j.

---

## Question 97

**Question:** A probabilistic sequence model is reviewed. Case 47: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Termination selects the state with the smallest alpha., as a consequence that holds for every permitted input
- **B.** Forward termination sums final alpha values to obtain the observation-sequence likelihood.
- **C.** Termination divides each alpha by its emission.
- **D.** Termination learns A, B, and pi automatically.

**Correct Answer:** Forward termination sums final alpha values to obtain the observation-sequence likelihood.

**Explanation:** All possible final hidden states contribute to P(O|M).

---

## Question 98

**Question:** A probabilistic sequence model is reviewed. Case 48: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Evaluation and decoding both mean learning model parameters.
- **B.** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.
- **C.** Decoding returns only the observation probability and no states., without needing any additional modeling assumption
- **D.** Learning assumes A, B, and pi can never change.

**Correct Answer:** Evaluation asks for P(O|M), whereas decoding asks for a most likely hidden-state sequence.

**Explanation:** The three canonical HMM problems have distinct outputs.

---

## Question 99

**Question:** A probabilistic sequence model is reviewed. Case 49: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Word recognition directly observes the hidden word state at every time., under both the training and evaluation conditions stated
- **B.** The least likely HMM must be selected by definition.
- **C.** Word recognition can compare observation likelihoods under several candidate HMMs.
- **D.** Observation images replace the need for emission probabilities.

**Correct Answer:** Word recognition can compare observation likelihoods under several candidate HMMs.

**Explanation:** Evaluation under each model supports choosing the best-matching candidate.

---

## Question 100

**Question:** A probabilistic sequence model is reviewed. Case 50: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Every matrix entry is an unconditional initial probability.
- **B.** A transition row may sum to any value because probabilities are unrelated.
- **C.** The diagonal entries are observation probabilities rather than persistence., even when the other quantities in the formula are fixed
- **D.** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Correct Answer:** Rows of the stated transition matrix describe conditional next-state probabilities from a current state.

**Explanation:** A transition row is a conditional distribution and therefore sums to one.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Distractors are designed around plausible definition, sign, denominator, update-order, and rounding errors.
