# Chapter 4: Neural Network: 100 Extreme-Hard Questions

> Topics: neurons, activations, perceptrons, sigmoid derivatives, forward propagation, backpropagation, and gradient updates. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** Using x=(1,-2,.5), w=(.4,-.3,.8), $b=-.2$, compute the sigmoid output.

**Choices:**
- **A.** sigmoid output = 0.9069
- **B.** sigmoid output = 0.7685
- **C.** sigmoid output = 0.6302
- **D.** sigmoid output = 1.0452

**Correct Answer:** sigmoid output = 0.7685

**Explanation:** Apply $\frac{1}{1+e^{-\mathrm{net}}}$; substitution gives sigmoid output=0.7685.

---

## Question 2

**Question:** Using sigmoid input x=-2, compute the sigmoid derivative.

**Choices:**
- **A.** sigmoid derivative = 0.105
- **B.** sigmoid derivative = 0.176
- **C.** sigmoid derivative = 0.034
- **D.** sigmoid derivative = 0.247

**Correct Answer:** sigmoid derivative = 0.105

**Explanation:** Apply $S(x)\left(1-S(x)\right)$; substitution gives sigmoid derivative=0.105.

---

## Question 3

**Question:** Using x=(1,0.5), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2), compute the network output.

**Choices:**
- **A.** network output = 0.4906
- **B.** network output = 0.7059
- **C.** network output = 0.5983
- **D.** network output = 0.8136

**Correct Answer:** network output = 0.5983

**Explanation:** Apply $S\!\left(\sum_j w_jh_j+b\right)$; substitution gives network output=0.5983.

---

## Question 4

**Question:** Using w=0.5, gradient=-0.2, $\alpha=0.1$, compute the updated weight.

**Choices:**
- **A.** updated weight = 0.4264
- **B.** updated weight = 0.6136
- **C.** updated weight = 0.52
- **D.** updated weight = 0.7072

**Correct Answer:** updated weight = 0.52

**Explanation:** Apply $w-\alpha\frac{\partial E}{\partial w}$; substitution gives updated weight=0.52.

---

## Question 5

**Question:** Using inputs=(0,0), w=(1,1), $b=-1$, compute the perceptron net input.

**Choices:**
- **A.** perceptron net input = -1.18
- **B.** perceptron net input = -0.82
- **C.** perceptron net input = -1
- **D.** perceptron net input = -0.64

**Correct Answer:** perceptron net input = -1

**Explanation:** Apply $\sum_i x_iw_i+b$; substitution gives perceptron net input=-1.

---

## Question 6

**Question:** Compare the sigmoid output for Case P (x=(1.1,-2,.5), w=(.4,-.3,.8), $b=-.2$) and Case Q (x=(1.4,-2,.5), w=(.4,-.3,.8), $b=-.2$).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 0.7756 versus 0.7958 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 0.7958 versus 0.7756

**Correct Answer:** The second case is larger: 0.7958 versus 0.7756

**Explanation:** The same formula gives 0.7756 for P and 0.7958 for Q, establishing the stated comparison.

---

## Question 7

**Question:** Compare the sigmoid derivative for Case P (sigmoid input x=-1.65) and Case Q (sigmoid input x=-0.6).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The first case is larger: 0.1352 versus 0.2288 under the complete set of stated assumptions
- **C.** The second case is larger: 0.2288 versus 0.1352
- **D.** Only their sum can be determined

**Correct Answer:** The second case is larger: 0.2288 versus 0.1352

**Explanation:** The same formula gives 0.1352 for P and 0.2288 for Q, establishing the stated comparison.

---

## Question 8

**Question:** Compare the network output for Case P (x=(1,0.53), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)) and Case Q (x=(1,0.62), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)).

**Choices:**
- **A.** The cases are exactly equal
- **B.** The second case is larger: 0.5935 versus 0.5971
- **C.** The first case is larger: 0.5971 versus 0.5935
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 0.5971 versus 0.5935

**Explanation:** The same formula gives 0.5971 for P and 0.5935 for Q, establishing the stated comparison.

---

## Question 9

**Question:** Compare the updated weight for Case P (w=0.54, gradient=0.22, $\alpha=0.1$) and Case Q (w=0.66, gradient=-0.28, $\alpha=0.1$).

**Choices:**
- **A.** Only their sum can be determined
- **B.** The first case is larger: 0.518 versus 0.688 under the complete set of stated assumptions
- **C.** The cases are exactly equal
- **D.** The second case is larger: 0.688 versus 0.518

**Correct Answer:** The second case is larger: 0.688 versus 0.518

**Explanation:** The same formula gives 0.518 for P and 0.688 for Q, establishing the stated comparison.

---

## Question 10

**Question:** Compare the perceptron net input for Case P (inputs=(1,0), w=(1,1), $b=-1$) and Case Q (inputs=(0,0), w=(1,1), $b=-1$).

**Choices:**
- **A.** The first case is larger: 0 versus -1
- **B.** The second case is larger: -1 versus 0
- **C.** The cases are exactly equal
- **D.** Only their sum can be determined

**Correct Answer:** The first case is larger: 0 versus -1

**Explanation:** The same formula gives 0 for P and -1 for Q, establishing the stated comparison.

---

## Question 11

**Question:** How far apart are the sigmoid output values for (x=(1.2,-2,.5), w=(.4,-.3,.8), $b=-.2$) and (x=(1.8,-2,.5), w=(.4,-.3,.8), $b=-.2$)?

**Choices:**
- **A.** absolute sigmoid output difference = 0.1091
- **B.** absolute sigmoid output difference = 0.0381
- **C.** absolute sigmoid output difference = -0.0329
- **D.** absolute sigmoid output difference = 0.1801

**Correct Answer:** absolute sigmoid output difference = 0.0381

**Explanation:** The two values are 0.7824 and 0.8205; their absolute difference is 0.0381.

---

## Question 12

**Question:** How far apart are the sigmoid derivative values for (sigmoid input x=-1.3) and (sigmoid input x=0.8)?

**Choices:**
- **A.** absolute sigmoid derivative difference = -0.0254
- **B.** absolute sigmoid derivative difference = 0.1166
- **C.** absolute sigmoid derivative difference = 0.0456
- **D.** absolute sigmoid derivative difference = 0.1876

**Correct Answer:** absolute sigmoid derivative difference = 0.0456

**Explanation:** The two values are 0.1683 and 0.2139; their absolute difference is 0.0456.

---

## Question 13

**Question:** How far apart are the network output values for (x=(1,0.56), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)) and (x=(1,0.74), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2))?

**Choices:**
- **A.** absolute network output difference = 0.1492
- **B.** absolute network output difference = 0.0782
- **C.** absolute network output difference = -0.0638
- **D.** absolute network output difference = 0.0072

**Correct Answer:** absolute network output difference = 0.0072

**Explanation:** The two values are 0.5959 and 0.5886; their absolute difference is 0.0072.

---

## Question 14

**Question:** How far apart are the updated weight values for (w=0.58, gradient=-0.24, $\alpha=0.1$) and (w=0.82, gradient=-0.36, $\alpha=0.1$)?

**Choices:**
- **A.** absolute updated weight difference = 0.181
- **B.** absolute updated weight difference = 0.323
- **C.** absolute updated weight difference = 0.252
- **D.** absolute updated weight difference = 0.394

**Correct Answer:** absolute updated weight difference = 0.252

**Explanation:** The two values are 0.604 and 0.856; their absolute difference is 0.252.

---

## Question 15

**Question:** How far apart are the perceptron net input values for (inputs=(0,1), w=(1,1), $b=-1$) and (inputs=(0,0), w=(1,1), $b=-1$)?

**Choices:**
- **A.** absolute perceptron net input difference = 1
- **B.** absolute perceptron net input difference = 1.18
- **C.** absolute perceptron net input difference = 0.82
- **D.** absolute perceptron net input difference = 1.36

**Correct Answer:** absolute perceptron net input difference = 1

**Explanation:** The two values are 0 and -1; their absolute difference is 1.

---

## Question 16

**Question:** Taking (x=(1.3,-2,.5), w=(.4,-.3,.8), $b=-.2$) as baseline and (x=(1.1,-2,.5), w=(.4,-.3,.8), $b=-.2$) as the new case, what is the percentage change in sigmoid output?

**Choices:**
- **A.** percentage change in sigmoid output = -1.1043
- **B.** percentage change in sigmoid output = -1.4149
- **C.** percentage change in sigmoid output = -2.0361
- **D.** percentage change in sigmoid output = -1.7255

**Correct Answer:** percentage change in sigmoid output = -1.7255

**Explanation:** The values change from 0.7892 to 0.7756; (new-old)/|old|*100=-1.7255%.

---

## Question 17

**Question:** Taking (sigmoid input x=-0.95) as baseline and (sigmoid input x=-1.65) as the new case, what is the percentage change in sigmoid derivative?

**Choices:**
- **A.** percentage change in sigmoid derivative = -20.9894
- **B.** percentage change in sigmoid derivative = -26.8926
- **C.** percentage change in sigmoid derivative = -38.6992
- **D.** percentage change in sigmoid derivative = -32.7959

**Correct Answer:** percentage change in sigmoid derivative = -32.7959

**Explanation:** The values change from 0.2011 to 0.1352; (new-old)/|old|*100=-32.7959%.

---

## Question 18

**Question:** Taking (x=(1,0.59), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)) as baseline and (x=(1,0.53), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)) as the new case, what is the percentage change in network output?

**Choices:**
- **A.** percentage change in network output = 0.5489
- **B.** percentage change in network output = 0.4762
- **C.** percentage change in network output = 0.3309
- **D.** percentage change in network output = 0.4036

**Correct Answer:** percentage change in network output = 0.4036

**Explanation:** The values change from 0.5947 to 0.5971; (new-old)/|old|*100=0.4036%.

---

## Question 19

**Question:** Taking (w=0.62, gradient=0.26, $\alpha=0.1$) as baseline and (w=0.54, gradient=0.22, $\alpha=0.1$) as the new case, what is the percentage change in updated weight?

**Choices:**
- **A.** percentage change in updated weight = -10.4916
- **B.** percentage change in updated weight = -12.7946
- **C.** percentage change in updated weight = -15.0976
- **D.** percentage change in updated weight = -8.1886

**Correct Answer:** percentage change in updated weight = -12.7946

**Explanation:** The values change from 0.594 to 0.518; (new-old)/|old|*100=-12.7946%.

---

## Question 20

**Question:** Taking (inputs=(1,1), w=(1,1), $b=-1$) as baseline and (inputs=(1,0), w=(1,1), $b=-1$) as the new case, what is the percentage change in perceptron net input?

**Choices:**
- **A.** percentage change in perceptron net input = -100
- **B.** percentage change in perceptron net input = -82
- **C.** percentage change in perceptron net input = -118
- **D.** percentage change in perceptron net input = -64

**Correct Answer:** percentage change in perceptron net input = -100

**Explanation:** The values change from 1 to 0; (new-old)/|old|*100=-100%.

---

## Question 21

**Question:** Which formula must be applied to obtain sigmoid output from the supplied chapter quantities?

**Choices:**
- **A.** For sigmoid output, use $\frac{1}{1+e^{-\mathrm{net}}}$
- **B.** For sigmoid output, use $1-\left(\frac{1}{1+e^{-\mathrm{net}}}\right)$
- **C.** For sigmoid output, use $\sqrt{\frac{1}{1+e^{-\mathrm{net}}}}$
- **D.** For sigmoid output, use sum inputs without the required weighting for sigmoid output

**Correct Answer:** For sigmoid output, use $\frac{1}{1+e^{-\mathrm{net}}}$

**Explanation:** The chapter defines sigmoid output with $\frac{1}{1+e^{-\mathrm{net}}}$; the other expressions change an operation or omit required weighting.

---

## Question 22

**Question:** Which formula must be applied to obtain sigmoid derivative from the supplied chapter quantities?

**Choices:**
- **A.** For sigmoid derivative, use $\sqrt{S(x)\left(1-S(x)\right)}$
- **B.** For sigmoid derivative, use $1-\left(S(x)\left(1-S(x)\right)\right)$
- **C.** For sigmoid derivative, use $S(x)\left(1-S(x)\right)$
- **D.** For sigmoid derivative, use sum inputs without the required weighting for sigmoid derivative

**Correct Answer:** For sigmoid derivative, use $S(x)\left(1-S(x)\right)$

**Explanation:** The chapter defines sigmoid derivative with $S(x)\left(1-S(x)\right)$; the other expressions change an operation or omit required weighting.

---

## Question 23

**Question:** Which formula must be applied to obtain network output from the supplied chapter quantities?

**Choices:**
- **A.** For network output, use $S\!\left(\sum_j w_jh_j+b\right)$
- **B.** For network output, use $1-\left(S\!\left(\sum_j w_jh_j+b\right)\right)$
- **C.** For network output, use $\sqrt{S\!\left(\sum_j w_jh_j+b\right)}$
- **D.** For network output, use sum inputs without the required weighting for network output

**Correct Answer:** For network output, use $S\!\left(\sum_j w_jh_j+b\right)$

**Explanation:** The chapter defines network output with $S\!\left(\sum_j w_jh_j+b\right)$; the other expressions change an operation or omit required weighting.

---

## Question 24

**Question:** Which formula must be applied to obtain updated weight from the supplied chapter quantities?

**Choices:**
- **A.** For updated weight, use $w-\alpha\frac{\partial E}{\partial w}$
- **B.** For updated weight, use $1-\left(w-\alpha\frac{\partial E}{\partial w}\right)$
- **C.** For updated weight, use $\sqrt{w-\alpha\frac{\partial E}{\partial w}}$
- **D.** For updated weight, use sum inputs without the required weighting for updated weight

**Correct Answer:** For updated weight, use $w-\alpha\frac{\partial E}{\partial w}$

**Explanation:** The chapter defines updated weight with $w-\alpha\frac{\partial E}{\partial w}$; the other expressions change an operation or omit required weighting.

---

## Question 25

**Question:** Which formula must be applied to obtain perceptron net input from the supplied chapter quantities?

**Choices:**
- **A.** For perceptron net input, use $1-\left(\sum_i x_iw_i+b\right)$
- **B.** For perceptron net input, use $\sum_i x_iw_i+b$
- **C.** For perceptron net input, use $\sqrt{\sum_i x_iw_i+b}$
- **D.** For perceptron net input, use sum inputs without the required weighting for perceptron net input

**Correct Answer:** For perceptron net input, use $\sum_i x_iw_i+b$

**Explanation:** The chapter defines perceptron net input with $\sum_i x_iw_i+b$; the other expressions change an operation or omit required weighting.

---

## Question 26

**Question:** Four datasets are candidates. Which one produces sigmoid output=0.8022?

**Choices:**
- **A.** For sigmoid output, the first dataset: x=(1,-2,.5), w=(.4,-.3,.8), $b=-.2$
- **B.** For sigmoid output, the third dataset: x=(1.5,-2,.5), w=(.4,-.3,.8), $b=-.2$
- **C.** For sigmoid output, the second dataset: x=(1.2,-2,.5), w=(.4,-.3,.8), $b=-.2$
- **D.** For sigmoid output, the fourth dataset: x=(1.8,-2,.5), w=(.4,-.3,.8), $b=-.2$

**Correct Answer:** For sigmoid output, the third dataset: x=(1.5,-2,.5), w=(.4,-.3,.8), $b=-.2$

**Explanation:** Evaluating all four with $\frac{1}{1+e^{-\mathrm{net}}}$ shows that the third dataset produces 0.8022.

---

## Question 27

**Question:** Four datasets are candidates. Which one produces sigmoid derivative=0.2461?

**Choices:**
- **A.** For sigmoid derivative, the fourth dataset: sigmoid input x=0.8
- **B.** For sigmoid derivative, the first dataset: sigmoid input x=-2
- **C.** For sigmoid derivative, the second dataset: sigmoid input x=-1.3
- **D.** For sigmoid derivative, the third dataset: sigmoid input x=-0.25

**Correct Answer:** For sigmoid derivative, the third dataset: sigmoid input x=-0.25

**Explanation:** Evaluating all four with $S(x)\left(1-S(x)\right)$ shows that the third dataset produces 0.2461.

---

## Question 28

**Question:** Four datasets are candidates. Which one produces network output=0.5923?

**Choices:**
- **A.** For network output, the fourth dataset: x=(1,0.74), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)
- **B.** For network output, the first dataset: x=(1,0.5), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)
- **C.** For network output, the second dataset: x=(1,0.56), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)
- **D.** For network output, the third dataset: x=(1,0.65), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)

**Correct Answer:** For network output, the third dataset: x=(1,0.65), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)

**Explanation:** Evaluating all four with $S\!\left(\sum_j w_jh_j+b\right)$ shows that the third dataset produces 0.5923.

---

## Question 29

**Question:** Four datasets are candidates. Which one produces updated weight=0.67?

**Choices:**
- **A.** For updated weight, the second dataset: w=0.58, gradient=-0.24, $\alpha=0.1$
- **B.** For updated weight, the first dataset: w=0.5, gradient=-0.2, $\alpha=0.1$
- **C.** For updated weight, the third dataset: w=0.7, gradient=0.3, $\alpha=0.1$
- **D.** For updated weight, the fourth dataset: w=0.82, gradient=-0.36, $\alpha=0.1$

**Correct Answer:** For updated weight, the third dataset: w=0.7, gradient=0.3, $\alpha=0.1$

**Explanation:** Evaluating all four with $w-\alpha\frac{\partial E}{\partial w}$ shows that the third dataset produces 0.67.

---

## Question 30

**Question:** Four datasets are candidates. Which one produces perceptron net input=0?

**Choices:**
- **A.** For perceptron net input, the third dataset: inputs=(1,0), w=(1,1), $b=-1$
- **B.** For perceptron net input, the first dataset: inputs=(0,0), w=(1,1), $b=-1$
- **C.** For perceptron net input, the second dataset: inputs=(0,1), w=(1,1), $b=-1$
- **D.** For perceptron net input, the fourth dataset: inputs=(0,0), w=(1,1), $b=-1$

**Correct Answer:** For perceptron net input, the third dataset: inputs=(1,0), w=(1,1), $b=-1$

**Explanation:** Evaluating all four with $\sum_i x_iw_i+b$ shows that the third dataset produces 0.

---

## Question 31

**Question:** For x=(1.6,-2,.5), w=(.4,-.3,.8), $b=-.2$, a student reports sigmoid output=1.0106. What corrected value should replace it?

**Choices:**
- **A.** corrected sigmoid output = 0.8085
- **B.** corrected sigmoid output = 0.954
- **C.** corrected sigmoid output = 0.6629
- **D.** corrected sigmoid output = 1.0995

**Correct Answer:** corrected sigmoid output = 0.8085

**Explanation:** Recomputing with $\frac{1}{1+e^{-\mathrm{net}}}$ gives 0.8085, so the reported 1.0106 is rejected.

---

## Question 32

**Question:** For sigmoid input x=0.1, a student reports sigmoid derivative=0.3494. What corrected value should replace it?

**Choices:**
- **A.** corrected sigmoid derivative = 0.3204
- **B.** corrected sigmoid derivative = 0.2494
- **C.** corrected sigmoid derivative = 0.1784
- **D.** corrected sigmoid derivative = 0.3914

**Correct Answer:** corrected sigmoid derivative = 0.2494

**Explanation:** Recomputing with $S(x)\left(1-S(x)\right)$ gives 0.2494, so the reported 0.3494 is rejected.

---

## Question 33

**Question:** For x=(1,0.68), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2), a student reports network output=0.7388. What corrected value should replace it?

**Choices:**
- **A.** corrected network output = 0.6974
- **B.** corrected network output = 0.591
- **C.** corrected network output = 0.4847
- **D.** corrected network output = 0.8038

**Correct Answer:** corrected network output = 0.591

**Explanation:** Recomputing with $S\!\left(\sum_j w_jh_j+b\right)$ gives 0.591, so the reported 0.7388 is rejected.

---

## Question 34

**Question:** For w=0.74, gradient=-0.32, $\alpha=0.1$, a student reports updated weight=0.965. What corrected value should replace it?

**Choices:**
- **A.** corrected updated weight = 0.772
- **B.** corrected updated weight = 0.911
- **C.** corrected updated weight = 0.633
- **D.** corrected updated weight = 1.0499

**Correct Answer:** corrected updated weight = 0.772

**Explanation:** Recomputing with $w-\alpha\frac{\partial E}{\partial w}$ gives 0.772, so the reported 0.965 is rejected.

---

## Question 35

**Question:** For inputs=(0,1), w=(1,1), $b=-1$, a student reports perceptron net input=0.1. What corrected value should replace it?

**Choices:**
- **A.** corrected perceptron net input = 0.071
- **B.** corrected perceptron net input = 0
- **C.** corrected perceptron net input = -0.071
- **D.** corrected perceptron net input = 0.142

**Correct Answer:** corrected perceptron net input = 0

**Explanation:** Recomputing with $\sum_i x_iw_i+b$ gives 0, so the reported 0.1 is rejected.

---

## Question 36

**Question:** Compute sigmoid output separately for (x=(1.7,-2,.5), w=(.4,-.3,.8), $b=-.2$) and (x=(1,-2,.5), w=(.4,-.3,.8), $b=-.2$), then average the two results.

**Choices:**
- **A.** mean of the two sigmoid output values = 0.934
- **B.** mean of the two sigmoid output values = 0.7915
- **C.** mean of the two sigmoid output values = 0.6491
- **D.** mean of the two sigmoid output values = 1.0765

**Correct Answer:** mean of the two sigmoid output values = 0.7915

**Explanation:** The individual results are 0.8146 and 0.7685; their arithmetic mean is 0.7915.

---

## Question 37

**Question:** Compute sigmoid derivative separately for (sigmoid input x=0.45) and (sigmoid input x=-2), then average the two results.

**Choices:**
- **A.** mean of the two sigmoid derivative values = 0.1004
- **B.** mean of the two sigmoid derivative values = 0.2424
- **C.** mean of the two sigmoid derivative values = 0.1714
- **D.** mean of the two sigmoid derivative values = 0.3134

**Correct Answer:** mean of the two sigmoid derivative values = 0.1714

**Explanation:** The individual results are 0.2378 and 0.105; their arithmetic mean is 0.1714.

---

## Question 38

**Question:** Compute network output separately for (x=(1,0.71), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)) and (x=(1,0.5), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)), then average the two results.

**Choices:**
- **A.** mean of the two network output values = 0.594
- **B.** mean of the two network output values = 0.701
- **C.** mean of the two network output values = 0.4871
- **D.** mean of the two network output values = 0.8079

**Correct Answer:** mean of the two network output values = 0.594

**Explanation:** The individual results are 0.5898 and 0.5983; their arithmetic mean is 0.594.

---

## Question 39

**Question:** Compute updated weight separately for (w=0.78, gradient=0.34, $\alpha=0.1$) and (w=0.5, gradient=-0.2, $\alpha=0.1$), then average the two results.

**Choices:**
- **A.** mean of the two updated weight values = 0.633
- **B.** mean of the two updated weight values = 0.7469
- **C.** mean of the two updated weight values = 0.5191
- **D.** mean of the two updated weight values = 0.8609

**Correct Answer:** mean of the two updated weight values = 0.633

**Explanation:** The individual results are 0.746 and 0.52; their arithmetic mean is 0.633.

---

## Question 40

**Question:** Compute perceptron net input separately for (inputs=(1,1), w=(1,1), $b=-1$) and (inputs=(0,0), w=(1,1), $b=-1$), then average the two results.

**Choices:**
- **A.** mean of the two perceptron net input values = 0.142
- **B.** mean of the two perceptron net input values = 0.071
- **C.** mean of the two perceptron net input values = -0.071
- **D.** mean of the two perceptron net input values = 0

**Correct Answer:** mean of the two perceptron net input values = 0

**Explanation:** The individual results are 1 and -1; their arithmetic mean is 0.

---

## Question 41

**Question:** After the data change from (x=(1.8,-2,.5), w=(.4,-.3,.8), $b=-.2$) to (x=(1.6,-2,.5), w=(.4,-.3,.8), $b=-.2$), what is the new sigmoid output?

**Choices:**
- **A.** sigmoid output = 1.0995
- **B.** sigmoid output = 0.954
- **C.** sigmoid output = 0.6629
- **D.** sigmoid output = 0.8085

**Correct Answer:** sigmoid output = 0.8085

**Explanation:** Only the new data enter $\frac{1}{1+e^{-\mathrm{net}}}$; they produce 0.8085.

---

## Question 42

**Question:** After the data change from (sigmoid input x=0.8) to (sigmoid input x=0.1), what is the new sigmoid derivative?

**Choices:**
- **A.** sigmoid derivative = 0.3914
- **B.** sigmoid derivative = 0.3204
- **C.** sigmoid derivative = 0.1784
- **D.** sigmoid derivative = 0.2494

**Correct Answer:** sigmoid derivative = 0.2494

**Explanation:** Only the new data enter $S(x)\left(1-S(x)\right)$; they produce 0.2494.

---

## Question 43

**Question:** After the data change from (x=(1,0.74), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)) to (x=(1,0.68), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)), what is the new network output?

**Choices:**
- **A.** network output = 0.6974
- **B.** network output = 0.591
- **C.** network output = 0.4847
- **D.** network output = 0.8038

**Correct Answer:** network output = 0.591

**Explanation:** Only the new data enter $S\!\left(\sum_j w_jh_j+b\right)$; they produce 0.591.

---

## Question 44

**Question:** After the data change from (w=0.82, gradient=-0.36, $\alpha=0.1$) to (w=0.74, gradient=-0.32, $\alpha=0.1$), what is the new updated weight?

**Choices:**
- **A.** updated weight = 0.633
- **B.** updated weight = 0.911
- **C.** updated weight = 0.772
- **D.** updated weight = 1.0499

**Correct Answer:** updated weight = 0.772

**Explanation:** Only the new data enter $w-\alpha\frac{\partial E}{\partial w}$; they produce 0.772.

---

## Question 45

**Question:** After the data change from (inputs=(0,0), w=(1,1), $b=-1$) to (inputs=(0,1), w=(1,1), $b=-1$), what is the new perceptron net input?

**Choices:**
- **A.** perceptron net input = 0.142
- **B.** perceptron net input = 0.071
- **C.** perceptron net input = -0.071
- **D.** perceptron net input = 0

**Correct Answer:** perceptron net input = 0

**Explanation:** Only the new data enter $\sum_i x_iw_i+b$; they produce 0.

---

## Question 46

**Question:** Rank P, Q, R, S from largest to smallest sigmoid output: P(x=(1.1,-2,.5), w=(.4,-.3,.8), $b=-.2$), Q(x=(1.3,-2,.5), w=(.4,-.3,.8), $b=-.2$), R(x=(1.6,-2,.5), w=(.4,-.3,.8), $b=-.2$), S(x=(1.9,-2,.5), w=(.4,-.3,.8), $b=-.2$).

**Choices:**
- **A.** sigmoid output ranking: Q > P > S > R
- **B.** sigmoid output ranking: P > Q > R > S
- **C.** sigmoid output ranking: P = Q = R = S
- **D.** sigmoid output ranking: S > R > Q > P

**Correct Answer:** sigmoid output ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.7756', 'Q': '0.7892', 'R': '0.8085', 'S': '0.8264'}; grouping equal values and sorting descending gives sigmoid output ranking: S > R > Q > P.

---

## Question 47

**Question:** Rank P, Q, R, S from largest to smallest sigmoid derivative: P(sigmoid input x=-1.65), Q(sigmoid input x=-0.95), R(sigmoid input x=0.1), S(sigmoid input x=1.15).

**Choices:**
- **A.** sigmoid derivative ranking: P = Q = R = S
- **B.** sigmoid derivative ranking: P > S > Q > R
- **C.** sigmoid derivative ranking: R > Q > S > P
- **D.** sigmoid derivative ranking: P > Q > R > S

**Correct Answer:** sigmoid derivative ranking: R > Q > S > P

**Explanation:** Their values are {'P': '0.1352', 'Q': '0.2011', 'R': '0.2494', 'S': '0.1827'}; grouping equal values and sorting descending gives sigmoid derivative ranking: R > Q > S > P.

---

## Question 48

**Question:** Rank P, Q, R, S from largest to smallest network output: P(x=(1,0.53), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)), Q(x=(1,0.59), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)), R(x=(1,0.68), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)), S(x=(1,0.77), h1=S(.6-.4x2+.1), h2=S(-.2+.8x2-.3), y=S(.7h1-.5h2+.2)).

**Choices:**
- **A.** network output ranking: S > R > Q > P
- **B.** network output ranking: P > Q > R > S
- **C.** network output ranking: P = Q = R = S
- **D.** network output ranking: Q > P > S > R

**Correct Answer:** network output ranking: P > Q > R > S

**Explanation:** Their values are {'P': '0.5971', 'Q': '0.5947', 'R': '0.591', 'S': '0.5874'}; grouping equal values and sorting descending gives network output ranking: P > Q > R > S.

---

## Question 49

**Question:** Rank P, Q, R, S from largest to smallest updated weight: P(w=0.54, gradient=0.22, $\alpha=0.1$), Q(w=0.62, gradient=0.26, $\alpha=0.1$), R(w=0.74, gradient=-0.32, $\alpha=0.1$), S(w=0.86, gradient=0.38, $\alpha=0.1$).

**Choices:**
- **A.** updated weight ranking: P > Q > R > S
- **B.** updated weight ranking: S > R > Q > P
- **C.** updated weight ranking: P = Q = R = S
- **D.** updated weight ranking: Q > P > S > R

**Correct Answer:** updated weight ranking: S > R > Q > P

**Explanation:** Their values are {'P': '0.518', 'Q': '0.594', 'R': '0.772', 'S': '0.822'}; grouping equal values and sorting descending gives updated weight ranking: S > R > Q > P.

---

## Question 50

**Question:** Rank P, Q, R, S from largest to smallest perceptron net input: P(inputs=(1,0), w=(1,1), $b=-1$), Q(inputs=(1,1), w=(1,1), $b=-1$), R(inputs=(0,1), w=(1,1), $b=-1$), S(inputs=(1,0), w=(1,1), $b=-1$).

**Choices:**
- **A.** perceptron net input ranking: P = Q = R = S
- **B.** perceptron net input ranking: S > R > P > Q
- **C.** perceptron net input ranking: Q > P = R = S
- **D.** perceptron net input ranking: P > Q > R > S

**Correct Answer:** perceptron net input ranking: Q > P = R = S

**Explanation:** Their values are {'P': '0', 'Q': '1', 'R': '0', 'S': '0'}; grouping equal values and sorting descending gives perceptron net input ranking: Q > P = R = S.

---

## Question 51

**Question:** Which statement correctly characterizes the bias term?

**Choices:**
- **A.** A bias shifts the neuron's pre-activation independently of the input-feature values.
- **B.** A bias is the derivative of every activation function.
- **C.** A bias forces all connection weights to be equal.
- **D.** A bias is used only after the final prediction is evaluated. for all permitted parameter values

**Correct Answer:** A bias shifts the neuron's pre-activation independently of the input-feature values.

**Explanation:** For the bias term, the accurate statement is the first one because The bias is the additive term in v=sum $x_i$ $w_i$+b.

---

## Question 52

**Question:** Which statement correctly characterizes sigmoid saturation?

**Choices:**
- **A.** Sigmoid has no derivative because it is a threshold function.
- **B.** Sigmoid's derivative is exactly one for every input.
- **C.** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.
- **D.** Sigmoid's derivative is negative whenever its output exceeds 0.5. under every stated condition

**Correct Answer:** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Explanation:** For sigmoid saturation, the accurate statement is the first one because $S'(x)=S(x)(1-S(x))$, maximized at S=0.5.

---

## Question 53

**Question:** Which statement correctly characterizes backpropagation's chain rule?

**Choices:**
- **A.** Backpropagation changes labels to eliminate prediction errors.
- **B.** Backpropagation uses the chain rule to attribute output error to earlier weights.
- **C.** Backpropagation requires every activation to be a hard step.
- **D.** Backpropagation updates weights without reference to an error function. without changing the supplied data

**Correct Answer:** Backpropagation uses the chain rule to attribute output error to earlier weights.

**Explanation:** For backpropagation's chain rule, the accurate statement is the first one because Layered compositions require chain-rule derivatives.

---

## Question 54

**Question:** Which statement correctly characterizes negative-gradient movement?

**Choices:**
- **A.** Weights should move opposite the error gradient when minimizing error.
- **B.** Weights must always increase, regardless of gradient sign.
- **C.** The gradient is used only to choose the number of hidden layers. for all permitted parameter values
- **D.** Error minimization moves in the positive gradient direction.

**Correct Answer:** Weights should move opposite the error gradient when minimizing error.

**Explanation:** For negative-gradient movement, the accurate statement is the first one because The supplied rule states $\Delta w$ is proportional to -$\frac{\partial E}{\partial w}$.

---

## Question 55

**Question:** Which statement correctly characterizes feed-forward flow?

**Choices:**
- **A.** Feed-forward means outputs are copied directly to training labels. under every stated condition under the complete set of stated assumptions
- **B.** Every feed-forward network has no hidden layer.
- **C.** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.
- **D.** Feed-forward requires knowledge to be stored outside connections.

**Correct Answer:** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Explanation:** For feed-forward flow, the accurate statement is the first one because The chapter's BP architecture sends layer outputs to later layers.

---

## Question 56

**Question:** Which statement correctly characterizes ReLU?

**Choices:**
- **A.** ReLU maps every input to a probability summing to one.
- **B.** ReLU returns zero for a negative pre-activation and the input itself for a positive one.
- **C.** ReLU always returns a value strictly between zero and one.
- **D.** ReLU is the linear function f(x)=x for negative inputs only. without changing the supplied data

**Correct Answer:** ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Explanation:** For ReLU, the accurate statement is the first one because ReLU is max(0,x).

---

## Question 57

**Question:** Which statement correctly characterizes softmax?

**Choices:**
- **A.** Softmax is associated with multi-class probability output.
- **B.** Softmax is the binary mutation operator in a neural layer.
- **C.** Softmax is identical to a hard threshold at zero.
- **D.** Softmax replaces every feature with its training mean.

**Correct Answer:** Softmax is associated with multi-class probability output.

**Explanation:** For softmax, the accurate statement is the first one because The tracker identifies softmax as the multi-class probability activation.

---

## Question 58

**Question:** Which statement correctly characterizes the AND perceptron?

**Choices:**
- **A.** Its bias of -1 makes every input pair output -1.
- **B.** The AND example outputs 1 whenever either input is 1. under every stated condition
- **C.** Its step rule outputs 1 when v is exactly zero.
- **D.** The AND example outputs 1 only when both binary inputs are 1.

**Correct Answer:** The AND example outputs 1 only when both binary inputs are 1.

**Explanation:** For the AND perceptron, the accurate statement is the first one because With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 59

**Question:** Which statement correctly characterizes hidden-layer transformation?

**Choices:**
- **A.** A hidden layer can contain no adjustable connections.
- **B.** A hidden layer is another name for the labelled dataset. without changing the supplied data under the complete set of stated assumptions
- **C.** A hidden layer must always use a linear activation.
- **D.** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Correct Answer:** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Explanation:** For hidden-layer transformation, the accurate statement is the first one because Hidden units transform signals between input and output layers.

---

## Question 60

**Question:** Which statement correctly characterizes backpropagation limitations?

**Choices:**
- **A.** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.
- **B.** BP is guaranteed to find the global minimum in one update.
- **C.** BP cannot represent nonlinear mappings under any activation.
- **D.** BP requires no parameter choices because all values are fixed. for all permitted parameter values

**Correct Answer:** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.

**Explanation:** For backpropagation limitations, the accurate statement is the first one because The chapter explicitly lists these BP problems.

---

## Question 61

**Question:** A student writes, “A bias is the derivative of every activation function.” Which replacement correctly repairs the claim about the bias term?

**Choices:**
- **A.** Replace it with: A bias forces all connection weights to be equal.
- **B.** Replace it with: A bias is the derivative of every activation function.
- **C.** Replace it with: A bias shifts the neuron's pre-activation independently of the input-feature values.
- **D.** Replace it with: A bias is used only after the final prediction is evaluated. under every stated condition

**Correct Answer:** Replace it with: A bias shifts the neuron's pre-activation independently of the input-feature values.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The bias is the additive term in v=sum $x_i$ $w_i$+b.

---

## Question 62

**Question:** A student writes, “Sigmoid's derivative is exactly one for every input.” Which replacement correctly repairs the claim about sigmoid saturation?

**Choices:**
- **A.** Replace it with: Sigmoid's derivative is negative whenever its output exceeds 0.5. without changing the supplied data
- **B.** Replace it with: Sigmoid's derivative is exactly one for every input.
- **C.** Replace it with: Sigmoid has no derivative because it is a threshold function.
- **D.** Replace it with: Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Correct Answer:** Replace it with: Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because $S'(x)=S(x)(1-S(x))$, maximized at S=0.5.

---

## Question 63

**Question:** A student writes, “Backpropagation changes labels to eliminate prediction errors.” Which replacement correctly repairs the claim about backpropagation's chain rule?

**Choices:**
- **A.** Replace it with: Backpropagation requires every activation to be a hard step.
- **B.** Replace it with: Backpropagation uses the chain rule to attribute output error to earlier weights.
- **C.** Replace it with: Backpropagation changes labels to eliminate prediction errors.
- **D.** Replace it with: Backpropagation updates weights without reference to an error function. for all permitted parameter values

**Correct Answer:** Replace it with: Backpropagation uses the chain rule to attribute output error to earlier weights.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Layered compositions require chain-rule derivatives.

---

## Question 64

**Question:** A student writes, “Weights must always increase, regardless of gradient sign.” Which replacement correctly repairs the claim about negative-gradient movement?

**Choices:**
- **A.** Replace it with: Error minimization moves in the positive gradient direction.
- **B.** Replace it with: Weights should move opposite the error gradient when minimizing error.
- **C.** Replace it with: The gradient is used only to choose the number of hidden layers. under every stated condition
- **D.** Replace it with: Weights must always increase, regardless of gradient sign.

**Correct Answer:** Replace it with: Weights should move opposite the error gradient when minimizing error.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The supplied rule states $\Delta w$ is proportional to -$\frac{\partial E}{\partial w}$.

---

## Question 65

**Question:** A student writes, “Feed-forward means outputs are copied directly to training labels.” Which replacement correctly repairs the claim about feed-forward flow?

**Choices:**
- **A.** Replace it with: Feed-forward requires knowledge to be stored outside connections.
- **B.** Replace it with: Feed-forward means outputs are copied directly to training labels. without changing the supplied data under the complete set of stated assumptions
- **C.** Replace it with: A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.
- **D.** Replace it with: Every feed-forward network has no hidden layer.

**Correct Answer:** Replace it with: A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The chapter's BP architecture sends layer outputs to later layers.

---

## Question 66

**Question:** A student writes, “ReLU maps every input to a probability summing to one.” Which replacement correctly repairs the claim about ReLU?

**Choices:**
- **A.** Replace it with: ReLU always returns a value strictly between zero and one.
- **B.** Replace it with: ReLU maps every input to a probability summing to one.
- **C.** Replace it with: ReLU returns zero for a negative pre-activation and the input itself for a positive one.
- **D.** Replace it with: ReLU is the linear function f(x)=x for negative inputs only. for all permitted parameter values

**Correct Answer:** Replace it with: ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because ReLU is max(0,x).

---

## Question 67

**Question:** A student writes, “Softmax is the binary mutation operator in a neural layer.” Which replacement correctly repairs the claim about softmax?

**Choices:**
- **A.** Replace it with: Softmax is the binary mutation operator in a neural layer.
- **B.** Replace it with: Softmax is associated with multi-class probability output.
- **C.** Replace it with: Softmax is identical to a hard threshold at zero.
- **D.** Replace it with: Softmax replaces every feature with its training mean.

**Correct Answer:** Replace it with: Softmax is associated with multi-class probability output.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The tracker identifies softmax as the multi-class probability activation.

---

## Question 68

**Question:** A student writes, “The AND example outputs 1 whenever either input is 1.” Which replacement correctly repairs the claim about the AND perceptron?

**Choices:**
- **A.** Replace it with: Its bias of -1 makes every input pair output -1.
- **B.** Replace it with: The AND example outputs 1 whenever either input is 1. without changing the supplied data
- **C.** Replace it with: The AND example outputs 1 only when both binary inputs are 1.
- **D.** Replace it with: Its step rule outputs 1 when v is exactly zero.

**Correct Answer:** Replace it with: The AND example outputs 1 only when both binary inputs are 1.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 69

**Question:** A student writes, “A hidden layer is another name for the labelled dataset.” Which replacement correctly repairs the claim about hidden-layer transformation?

**Choices:**
- **A.** Replace it with: A hidden layer performs an intermediate transformation rather than serving as the final prediction.
- **B.** Replace it with: A hidden layer is another name for the labelled dataset. for all permitted parameter values under the complete set of stated assumptions
- **C.** Replace it with: A hidden layer can contain no adjustable connections.
- **D.** Replace it with: A hidden layer must always use a linear activation.

**Correct Answer:** Replace it with: A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because Hidden units transform signals between input and output layers.

---

## Question 70

**Question:** A student writes, “BP is guaranteed to find the global minimum in one update.” Which replacement correctly repairs the claim about backpropagation limitations?

**Choices:**
- **A.** Replace it with: Long convergence, local minima, and black-box behavior are stated limitations of BP learning.
- **B.** Replace it with: BP is guaranteed to find the global minimum in one update.
- **C.** Replace it with: BP cannot represent nonlinear mappings under any activation.
- **D.** Replace it with: BP requires no parameter choices because all values are fixed. under every stated condition under the complete set of stated assumptions

**Correct Answer:** Replace it with: Long convergence, local minima, and black-box behavior are stated limitations of BP learning.

**Explanation:** The student's claim confuses the chapter definitions. The correction is required because The chapter explicitly lists these BP problems.

---

## Question 71

**Question:** A student's answer about the bias term contains the claim “A bias is the derivative of every activation function.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns the bias term but is only a harmless change of notation
- **B.** The quoted claim about the bias term is correct without qualification
- **C.** The quoted claim becomes correct merely by changing the dataset size
- **D.** The quoted claim about the bias term is false and must be replaced

**Correct Answer:** The quoted claim about the bias term is false and must be replaced

**Explanation:** The quoted claim contradicts the bias term; it must be replaced by A bias shifts the neuron's pre-activation independently of the input-feature values..

---

## Question 72

**Question:** A student's answer about sigmoid saturation contains the claim “Sigmoid's derivative is exactly one for every input.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about sigmoid saturation is correct without qualification
- **B.** The quoted claim about sigmoid saturation is false and must be replaced
- **C.** The quoted claim concerns sigmoid saturation but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about sigmoid saturation is false and must be replaced

**Explanation:** The quoted claim contradicts sigmoid saturation; it must be replaced by the chapter's stated rule.

---

## Question 73

**Question:** A student's answer about backpropagation's chain rule contains the claim “Backpropagation changes labels to eliminate prediction errors.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about backpropagation's chain rule is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns backpropagation's chain rule but is only a harmless change of notation
- **D.** The quoted claim about backpropagation's chain rule is false and must be replaced

**Correct Answer:** The quoted claim about backpropagation's chain rule is false and must be replaced

**Explanation:** The quoted claim contradicts backpropagation's chain rule; it must be replaced by the chapter's stated rule.

---

## Question 74

**Question:** A student's answer about negative-gradient movement contains the claim “Weights must always increase, regardless of gradient sign.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about negative-gradient movement is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns negative-gradient movement but is only a harmless change of notation
- **D.** The quoted claim about negative-gradient movement is false and must be replaced

**Correct Answer:** The quoted claim about negative-gradient movement is false and must be replaced

**Explanation:** The quoted claim contradicts negative-gradient movement; it must be replaced by Weights should move opposite the error gradient when minimizing error..

---

## Question 75

**Question:** A student's answer about feed-forward flow contains the claim “Feed-forward means outputs are copied directly to training labels.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns feed-forward flow but is only a harmless change of notation
- **B.** The quoted claim about feed-forward flow is correct without qualification
- **C.** The quoted claim about feed-forward flow is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about feed-forward flow is false and must be replaced

**Explanation:** The quoted claim contradicts feed-forward flow; it must be replaced by A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture..

---

## Question 76

**Question:** A student's answer about ReLU contains the claim “ReLU maps every input to a probability summing to one.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about ReLU is correct without qualification
- **B.** The quoted claim becomes correct merely by changing the dataset size
- **C.** The quoted claim concerns ReLU but is only a harmless change of notation
- **D.** The quoted claim about ReLU is false and must be replaced

**Correct Answer:** The quoted claim about ReLU is false and must be replaced

**Explanation:** The quoted claim contradicts ReLU; it must be replaced by the chapter's stated rule.

---

## Question 77

**Question:** A student's answer about softmax contains the claim “Softmax is the binary mutation operator in a neural layer.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns softmax but is only a harmless change of notation
- **B.** The quoted claim about softmax is false and must be replaced
- **C.** The quoted claim about softmax is correct without qualification
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about softmax is false and must be replaced

**Explanation:** The quoted claim contradicts softmax; it must be replaced by Softmax is associated with multi-class probability output..

---

## Question 78

**Question:** A student's answer about the AND perceptron contains the claim “The AND example outputs 1 whenever either input is 1.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim becomes correct merely by changing the dataset size
- **B.** The quoted claim about the AND perceptron is correct without qualification
- **C.** The quoted claim concerns the AND perceptron but is only a harmless change of notation
- **D.** The quoted claim about the AND perceptron is false and must be replaced

**Correct Answer:** The quoted claim about the AND perceptron is false and must be replaced

**Explanation:** The quoted claim contradicts the AND perceptron; it must be replaced by the chapter's stated rule.

---

## Question 79

**Question:** A student's answer about hidden-layer transformation contains the claim “A hidden layer is another name for the labelled dataset.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim concerns hidden-layer transformation but is only a harmless change of notation
- **B.** The quoted claim about hidden-layer transformation is correct without qualification
- **C.** The quoted claim about hidden-layer transformation is false and must be replaced
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about hidden-layer transformation is false and must be replaced

**Explanation:** The quoted claim contradicts hidden-layer transformation; it must be replaced by the chapter's stated rule.

---

## Question 80

**Question:** A student's answer about backpropagation limitations contains the claim “BP is guaranteed to find the global minimum in one update.” Which assessment is correct?

**Choices:**
- **A.** The quoted claim about backpropagation limitations is false and must be replaced
- **B.** The quoted claim about backpropagation limitations is correct without qualification
- **C.** The quoted claim concerns backpropagation limitations but is only a harmless change of notation
- **D.** The quoted claim becomes correct merely by changing the dataset size

**Correct Answer:** The quoted claim about backpropagation limitations is false and must be replaced

**Explanation:** The quoted claim contradicts backpropagation limitations; it must be replaced by Long convergence, local minima, and black-box behavior are stated limitations of BP learning..

---

## Question 81

**Question:** An implementation is designed around the rule “A bias forces all connection weights to be equal.” Which principle exposes the design error concerning the bias term?

**Choices:**
- **A.** Required principle: A bias shifts the neuron's pre-activation independently of the input-feature values.
- **B.** Required principle: A bias is the derivative of every activation function.
- **C.** Required principle: A bias forces all connection weights to be equal.
- **D.** Required principle: A bias is used only after the final prediction is evaluated. for all permitted parameter values

**Correct Answer:** Required principle: A bias shifts the neuron's pre-activation independently of the input-feature values.

**Explanation:** The implementation encodes a false rule. The required principle follows because The bias is the additive term in v=sum $x_i$ $w_i$+b.

---

## Question 82

**Question:** An implementation is designed around the rule “Sigmoid's derivative is negative whenever its output exceeds 0.5.” Which principle exposes the design error concerning sigmoid saturation?

**Choices:**
- **A.** Required principle: Sigmoid's derivative is negative whenever its output exceeds 0.5. under every stated condition
- **B.** Required principle: Sigmoid's derivative is exactly one for every input.
- **C.** Required principle: Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.
- **D.** Required principle: Sigmoid has no derivative because it is a threshold function.

**Correct Answer:** Required principle: Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Explanation:** The implementation encodes a false rule. The required principle follows because $S'(x)=S(x)(1-S(x))$, maximized at S=0.5.

---

## Question 83

**Question:** An implementation is designed around the rule “Backpropagation requires every activation to be a hard step.” Which principle exposes the design error concerning backpropagation's chain rule?

**Choices:**
- **A.** Required principle: Backpropagation changes labels to eliminate prediction errors.
- **B.** Required principle: Backpropagation updates weights without reference to an error function. without changing the supplied data
- **C.** Required principle: Backpropagation requires every activation to be a hard step.
- **D.** Required principle: Backpropagation uses the chain rule to attribute output error to earlier weights.

**Correct Answer:** Required principle: Backpropagation uses the chain rule to attribute output error to earlier weights.

**Explanation:** The implementation encodes a false rule. The required principle follows because Layered compositions require chain-rule derivatives.

---

## Question 84

**Question:** An implementation is designed around the rule “The gradient is used only to choose the number of hidden layers.” Which principle exposes the design error concerning negative-gradient movement?

**Choices:**
- **A.** Required principle: Weights should move opposite the error gradient when minimizing error.
- **B.** Required principle: Weights must always increase, regardless of gradient sign.
- **C.** Required principle: The gradient is used only to choose the number of hidden layers. for all permitted parameter values
- **D.** Required principle: Error minimization moves in the positive gradient direction.

**Correct Answer:** Required principle: Weights should move opposite the error gradient when minimizing error.

**Explanation:** The implementation encodes a false rule. The required principle follows because The supplied rule states $\Delta w$ is proportional to -$\frac{\partial E}{\partial w}$.

---

## Question 85

**Question:** An implementation is designed around the rule “Every feed-forward network has no hidden layer.” Which principle exposes the design error concerning feed-forward flow?

**Choices:**
- **A.** Required principle: Feed-forward requires knowledge to be stored outside connections.
- **B.** Required principle: Feed-forward means outputs are copied directly to training labels. under every stated condition under the complete set of stated assumptions
- **C.** Required principle: Every feed-forward network has no hidden layer.
- **D.** Required principle: A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Correct Answer:** Required principle: A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Explanation:** The implementation encodes a false rule. The required principle follows because The chapter's BP architecture sends layer outputs to later layers.

---

## Question 86

**Question:** An implementation is designed around the rule “ReLU always returns a value strictly between zero and one.” Which principle exposes the design error concerning ReLU?

**Choices:**
- **A.** Required principle: ReLU always returns a value strictly between zero and one.
- **B.** Required principle: ReLU returns zero for a negative pre-activation and the input itself for a positive one.
- **C.** Required principle: ReLU maps every input to a probability summing to one.
- **D.** Required principle: ReLU is the linear function f(x)=x for negative inputs only. without changing the supplied data

**Correct Answer:** Required principle: ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Explanation:** The implementation encodes a false rule. The required principle follows because ReLU is max(0,x).

---

## Question 87

**Question:** An implementation is designed around the rule “Softmax is identical to a hard threshold at zero.” Which principle exposes the design error concerning softmax?

**Choices:**
- **A.** Required principle: Softmax is identical to a hard threshold at zero.
- **B.** Required principle: Softmax is the binary mutation operator in a neural layer.
- **C.** Required principle: Softmax is associated with multi-class probability output.
- **D.** Required principle: Softmax replaces every feature with its training mean.

**Correct Answer:** Required principle: Softmax is associated with multi-class probability output.

**Explanation:** The implementation encodes a false rule. The required principle follows because The tracker identifies softmax as the multi-class probability activation.

---

## Question 88

**Question:** An implementation is designed around the rule “Its bias of -1 makes every input pair output -1.” Which principle exposes the design error concerning the AND perceptron?

**Choices:**
- **A.** Required principle: Its step rule outputs 1 when v is exactly zero.
- **B.** Required principle: The AND example outputs 1 only when both binary inputs are 1.
- **C.** Required principle: Its bias of -1 makes every input pair output -1.
- **D.** Required principle: The AND example outputs 1 whenever either input is 1. under every stated condition

**Correct Answer:** Required principle: The AND example outputs 1 only when both binary inputs are 1.

**Explanation:** The implementation encodes a false rule. The required principle follows because With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 89

**Question:** An implementation is designed around the rule “A hidden layer can contain no adjustable connections.” Which principle exposes the design error concerning hidden-layer transformation?

**Choices:**
- **A.** Required principle: A hidden layer can contain no adjustable connections.
- **B.** Required principle: A hidden layer is another name for the labelled dataset. without changing the supplied data under the complete set of stated assumptions
- **C.** Required principle: A hidden layer must always use a linear activation.
- **D.** Required principle: A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Correct Answer:** Required principle: A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Explanation:** The implementation encodes a false rule. The required principle follows because Hidden units transform signals between input and output layers.

---

## Question 90

**Question:** An implementation is designed around the rule “BP cannot represent nonlinear mappings under any activation.” Which principle exposes the design error concerning backpropagation limitations?

**Choices:**
- **A.** Required principle: BP cannot represent nonlinear mappings under any activation.
- **B.** Required principle: BP is guaranteed to find the global minimum in one update.
- **C.** Required principle: Long convergence, local minima, and black-box behavior are stated limitations of BP learning.
- **D.** Required principle: BP requires no parameter choices because all values are fixed. for all permitted parameter values

**Correct Answer:** Required principle: Long convergence, local minima, and black-box behavior are stated limitations of BP learning.

**Explanation:** The implementation encodes a false rule. The required principle follows because The chapter explicitly lists these BP problems.

---

## Question 91

**Question:** Reviewer A states, “A bias shifts the neuron's pre-activation independently of the input-feature values.” Reviewer B states, “A bias is used only after the final prediction is evaluated.” What is the correct verdict about the bias term?

**Choices:**
- **A.** Reviewer B only is correct about the bias term
- **B.** Reviewer A only is correct about the bias term
- **C.** Both reviewers are correct about the bias term
- **D.** Neither reviewer is correct about the bias term

**Correct Answer:** Reviewer A only is correct about the bias term

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The bias is the additive term in v=sum $x_i$ $w_i$+b.

---

## Question 92

**Question:** Reviewer A states, “Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.” Reviewer B states, “Sigmoid has no derivative because it is a threshold function.” What is the correct verdict about sigmoid saturation?

**Choices:**
- **A.** Reviewer A only is correct about sigmoid saturation
- **B.** Reviewer B only is correct about sigmoid saturation
- **C.** Both reviewers are correct about sigmoid saturation
- **D.** Neither reviewer is correct about sigmoid saturation

**Correct Answer:** Reviewer A only is correct about sigmoid saturation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, $S'(x)=S(x)(1-S(x))$, maximized at S=0.5.

---

## Question 93

**Question:** Reviewer A states, “Backpropagation uses the chain rule to attribute output error to earlier weights.” Reviewer B states, “Backpropagation updates weights without reference to an error function.” What is the correct verdict about backpropagation's chain rule?

**Choices:**
- **A.** Reviewer B only is correct about backpropagation's chain rule
- **B.** Reviewer A only is correct about backpropagation's chain rule
- **C.** Both reviewers are correct about backpropagation's chain rule
- **D.** Neither reviewer is correct about backpropagation's chain rule

**Correct Answer:** Reviewer A only is correct about backpropagation's chain rule

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Layered compositions require chain-rule derivatives.

---

## Question 94

**Question:** Reviewer A states, “Weights should move opposite the error gradient when minimizing error.” Reviewer B states, “Error minimization moves in the positive gradient direction.” What is the correct verdict about negative-gradient movement?

**Choices:**
- **A.** Reviewer B only is correct about negative-gradient movement
- **B.** Neither reviewer is correct about negative-gradient movement
- **C.** Both reviewers are correct about negative-gradient movement
- **D.** Reviewer A only is correct about negative-gradient movement

**Correct Answer:** Reviewer A only is correct about negative-gradient movement

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The supplied rule states $\Delta w$ is proportional to -$\frac{\partial E}{\partial w}$.

---

## Question 95

**Question:** Reviewer A states, “A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.” Reviewer B states, “Feed-forward requires knowledge to be stored outside connections.” What is the correct verdict about feed-forward flow?

**Choices:**
- **A.** Reviewer A only is correct about feed-forward flow
- **B.** Reviewer B only is correct about feed-forward flow
- **C.** Both reviewers are correct about feed-forward flow
- **D.** Neither reviewer is correct about feed-forward flow

**Correct Answer:** Reviewer A only is correct about feed-forward flow

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The chapter's BP architecture sends layer outputs to later layers.

---

## Question 96

**Question:** Reviewer A states, “ReLU returns zero for a negative pre-activation and the input itself for a positive one.” Reviewer B states, “ReLU is the linear function f(x)=x for negative inputs only.” What is the correct verdict about ReLU?

**Choices:**
- **A.** Reviewer A only is correct about ReLU
- **B.** Reviewer B only is correct about ReLU
- **C.** Both reviewers are correct about ReLU
- **D.** Neither reviewer is correct about ReLU

**Correct Answer:** Reviewer A only is correct about ReLU

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, ReLU is max(0,x).

---

## Question 97

**Question:** Reviewer A states, “Softmax is associated with multi-class probability output.” Reviewer B states, “Softmax replaces every feature with its training mean.” What is the correct verdict about softmax?

**Choices:**
- **A.** Neither reviewer is correct about softmax
- **B.** Reviewer A only is correct about softmax
- **C.** Both reviewers are correct about softmax
- **D.** Reviewer B only is correct about softmax

**Correct Answer:** Reviewer A only is correct about softmax

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The tracker identifies softmax as the multi-class probability activation.

---

## Question 98

**Question:** Reviewer A states, “The AND example outputs 1 only when both binary inputs are 1.” Reviewer B states, “Its step rule outputs 1 when v is exactly zero.” What is the correct verdict about the AND perceptron?

**Choices:**
- **A.** Reviewer A only is correct about the AND perceptron
- **B.** Reviewer B only is correct about the AND perceptron
- **C.** Both reviewers are correct about the AND perceptron
- **D.** Neither reviewer is correct about the AND perceptron

**Correct Answer:** Reviewer A only is correct about the AND perceptron

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 99

**Question:** Reviewer A states, “A hidden layer performs an intermediate transformation rather than serving as the final prediction.” Reviewer B states, “A hidden layer must always use a linear activation.” What is the correct verdict about hidden-layer transformation?

**Choices:**
- **A.** Both reviewers are correct about hidden-layer transformation
- **B.** Reviewer A only is correct about hidden-layer transformation
- **C.** Reviewer B only is correct about hidden-layer transformation
- **D.** Neither reviewer is correct about hidden-layer transformation

**Correct Answer:** Reviewer A only is correct about hidden-layer transformation

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, Hidden units transform signals between input and output layers.

---

## Question 100

**Question:** Reviewer A states, “Long convergence, local minima, and black-box behavior are stated limitations of BP learning.” Reviewer B states, “BP requires no parameter choices because all values are fixed.” What is the correct verdict about backpropagation limitations?

**Choices:**
- **A.** Both reviewers are correct about backpropagation limitations
- **B.** Reviewer B only is correct about backpropagation limitations
- **C.** Reviewer A only is correct about backpropagation limitations
- **D.** Neither reviewer is correct about backpropagation limitations

**Correct Answer:** Reviewer A only is correct about backpropagation limitations

**Explanation:** Reviewer A states the chapter's rule, while Reviewer B contradicts it. In particular, The chapter explicitly lists these BP problems.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Questions were audited for structural balance, verbatim reuse, and parameter-only duplicate prompts.
