# Chapter 4: Neural Network: 100 Extreme-Hard Questions

> Topics: neurons, activations, perceptrons, sigmoid derivatives, forward propagation, backpropagation, and gradient updates. Mix of multi-step calculations, application, and theory traps. Choose the single best answer.

---

## Question 1

**Question:** A sigmoid neuron receives x=['1', '-2', '0.5'], w=[0.4, -0.3, 0.8], b=-0.2. What pair (net,y) is correct?

**Choices:**
- **A.** (1.4, 0.8022)
- **B.** (-1.2, 0.2315)
- **C.** (1.2, 0.7685)
- **D.** (0.7685, 1.2)

**Correct Answer:** (1.2, 0.7685)

**Explanation:** net=sum xw+b=1.2 and sigmoid(net)=0.7685.

---

## Question 2

**Question:** At x=-2, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.105, 0.1192)
- **B.** (0.1192, 0.105)
- **C.** (0.1192, 0.895)
- **D.** (0.8808, 0.895)

**Correct Answer:** (0.1192, 0.105)

**Explanation:** S=0.1192 and S'=S(1-S)=0.105.

---

## Question 3

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.5)+0.1), h2=S(-0.2(1)+0.8(0.5)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.5983
- **B.** 0.7054
- **C.** 0.3982
- **D.** 0.5487

**Correct Answer:** 0.5983

**Explanation:** h1=0.6225, h2=0.475, output net=0.3982, so y=0.5983.

---

## Question 4

**Question:** A weight is 0.5, its error gradient is -0.2, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.52
- **B.** 0.48
- **C.** 0.7
- **D.** 0.3

**Correct Answer:** 0.52

**Explanation:** Use w' = w-alpha*dE/dw = 0.5-0.1(-0.2)=0.52.

---

## Question 5

**Question:** Perceptron audit 1: for w1=w2=1, b=-1, output 1 only if v>0, input (0,0) gives which (v,y)?

**Choices:**
- **A.** (0, -1)
- **B.** (-1, -1)
- **C.** (-1, 1)
- **D.** (-2, -1)

**Correct Answer:** (-1, -1)

**Explanation:** v=0+0-1=-1; the strict condition v>0 gives y=-1.

---

## Question 6

**Question:** A sigmoid neuron receives x=['1.1', '-1.95', '0.5'], w=[0.4, -0.3, 0.8], b=-0.18. What pair (net,y) is correct?

**Choices:**
- **A.** (1.425, 0.8061)
- **B.** (1.245, 0.7764)
- **C.** (-1.245, 0.2236)
- **D.** (0.7764, 1.245)

**Correct Answer:** (1.245, 0.7764)

**Explanation:** net=sum xw+b=1.245 and sigmoid(net)=0.7764.

---

## Question 7

**Question:** At x=-1.6, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.1398, 0.168)
- **B.** (0.168, 0.8602)
- **C.** (0.832, 0.8602)
- **D.** (0.168, 0.1398)

**Correct Answer:** (0.168, 0.1398)

**Explanation:** S=0.168 and S'=S(1-S)=0.1398.

---

## Question 8

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.55)+0.1), h2=S(-0.2(1)+0.8(0.55)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.7058
- **B.** 0.3899
- **C.** 0.5514
- **D.** 0.5963

**Correct Answer:** 0.5963

**Explanation:** h1=0.6177, h2=0.485, output net=0.3899, so y=0.5963.

---

## Question 9

**Question:** A weight is 0.55, its error gradient is 0.23, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.527
- **B.** 0.573
- **C.** 0.32
- **D.** 0.78

**Correct Answer:** 0.527

**Explanation:** Use w' = w-alpha*dE/dw = 0.55-0.1(0.23)=0.527.

---

## Question 10

**Question:** Perceptron audit 2: for w1=w2=1, b=-1, output 1 only if v>0, input (1,0) gives which (v,y)?

**Choices:**
- **A.** (0, -1)
- **B.** (1, -1)
- **C.** (0, 1)
- **D.** (-1, 1)

**Correct Answer:** (0, -1)

**Explanation:** v=1+0-1=0; the strict condition v>0 gives y=-1.

---

## Question 11

**Question:** A sigmoid neuron receives x=['1.2', '-1.9', '0.5'], w=[0.4, -0.3, 0.8], b=-0.16. What pair (net,y) is correct?

**Choices:**
- **A.** (1.29, 0.7841)
- **B.** (1.45, 0.81)
- **C.** (-1.29, 0.2159)
- **D.** (0.7841, 1.29)

**Correct Answer:** (1.29, 0.7841)

**Explanation:** net=sum xw+b=1.29 and sigmoid(net)=0.7841.

---

## Question 12

**Question:** At x=-1.2, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.1779, 0.2315)
- **B.** (0.2315, 0.8221)
- **C.** (0.2315, 0.1779)
- **D.** (0.7685, 0.8221)

**Correct Answer:** (0.2315, 0.1779)

**Explanation:** S=0.2315 and S'=S(1-S)=0.1779.

---

## Question 13

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.6)+0.1), h2=S(-0.2(1)+0.8(0.6)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.7061
- **B.** 0.5943
- **C.** 0.3816
- **D.** 0.554

**Correct Answer:** 0.5943

**Explanation:** h1=0.613, h2=0.495, output net=0.3816, so y=0.5943.

---

## Question 14

**Question:** A weight is 0.6, its error gradient is -0.26, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.626
- **B.** 0.574
- **C.** 0.86
- **D.** 0.34

**Correct Answer:** 0.626

**Explanation:** Use w' = w-alpha*dE/dw = 0.6-0.1(-0.26)=0.626.

---

## Question 15

**Question:** Perceptron audit 3: for w1=w2=1, b=-1, output 1 only if v>0, input (0,1) gives which (v,y)?

**Choices:**
- **A.** (0, -1)
- **B.** (1, -1)
- **C.** (0, 1)
- **D.** (-1, 1)

**Correct Answer:** (0, -1)

**Explanation:** v=0+1-1=0; the strict condition v>0 gives y=-1.

---

## Question 16

**Question:** A sigmoid neuron receives x=['1.3', '-1.85', '0.5'], w=[0.4, -0.3, 0.8], b=-0.14. What pair (net,y) is correct?

**Choices:**
- **A.** (1.475, 0.8138)
- **B.** (-1.335, 0.2083)
- **C.** (1.335, 0.7917)
- **D.** (0.7917, 1.335)

**Correct Answer:** (1.335, 0.7917)

**Explanation:** net=sum xw+b=1.335 and sigmoid(net)=0.7917.

---

## Question 17

**Question:** At x=-0.8, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.2139, 0.31)
- **B.** (0.31, 0.2139)
- **C.** (0.31, 0.7861)
- **D.** (0.69, 0.7861)

**Correct Answer:** (0.31, 0.2139)

**Explanation:** S=0.31 and S'=S(1-S)=0.2139.

---

## Question 18

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.65)+0.1), h2=S(-0.2(1)+0.8(0.65)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.7065
- **B.** 0.3733
- **C.** 0.5566
- **D.** 0.5923

**Correct Answer:** 0.5923

**Explanation:** h1=0.6083, h2=0.505, output net=0.3733, so y=0.5923.

---

## Question 19

**Question:** A weight is 0.65, its error gradient is 0.29, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.679
- **B.** 0.36
- **C.** 0.94
- **D.** 0.621

**Correct Answer:** 0.621

**Explanation:** Use w' = w-alpha*dE/dw = 0.65-0.1(0.29)=0.621.

---

## Question 20

**Question:** Perceptron audit 4: for w1=w2=1, b=-1, output 1 only if v>0, input (1,1) gives which (v,y)?

**Choices:**
- **A.** (2, 1)
- **B.** (1, 1)
- **C.** (1, -1)
- **D.** (0, 1)

**Correct Answer:** (1, 1)

**Explanation:** v=1+1-1=1; the strict condition v>0 gives y=1.

---

## Question 21

**Question:** A sigmoid neuron receives x=['1.4', '-1.8', '0.5'], w=[0.4, -0.3, 0.8], b=-0.12. What pair (net,y) is correct?

**Choices:**
- **A.** (1.38, 0.799)
- **B.** (1.5, 0.8176)
- **C.** (-1.38, 0.201)
- **D.** (0.799, 1.38)

**Correct Answer:** (1.38, 0.799)

**Explanation:** net=sum xw+b=1.38 and sigmoid(net)=0.799.

---

## Question 22

**Question:** At x=-0.4, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.2403, 0.4013)
- **B.** (0.4013, 0.7597)
- **C.** (0.5987, 0.7597)
- **D.** (0.4013, 0.2403)

**Correct Answer:** (0.4013, 0.2403)

**Explanation:** S=0.4013 and S'=S(1-S)=0.2403.

---

## Question 23

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.7)+0.1), h2=S(-0.2(1)+0.8(0.7)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.7068
- **B.** 0.5902
- **C.** 0.3649
- **D.** 0.5592

**Correct Answer:** 0.5902

**Explanation:** h1=0.6035, h2=0.515, output net=0.3649, so y=0.5902.

---

## Question 24

**Question:** A weight is 0.7, its error gradient is -0.32, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.668
- **B.** 1.02
- **C.** 0.732
- **D.** 0.38

**Correct Answer:** 0.732

**Explanation:** Use w' = w-alpha*dE/dw = 0.7-0.1(-0.32)=0.732.

---

## Question 25

**Question:** Perceptron audit 5: for w1=w2=1, b=-1, output 1 only if v>0, input (0,0) gives which (v,y)?

**Choices:**
- **A.** (0, -1)
- **B.** (-1, 1)
- **C.** (-2, -1)
- **D.** (-1, -1)

**Correct Answer:** (-1, -1)

**Explanation:** v=0+0-1=-1; the strict condition v>0 gives y=-1.

---

## Question 26

**Question:** A sigmoid neuron receives x=['1.5', '-1.75', '0.5'], w=[0.4, -0.3, 0.8], b=-0.1. What pair (net,y) is correct?

**Choices:**
- **A.** (1.525, 0.8213)
- **B.** (1.425, 0.8061)
- **C.** (-1.425, 0.1939)
- **D.** (0.8061, 1.425)

**Correct Answer:** (1.425, 0.8061)

**Explanation:** net=sum xw+b=1.425 and sigmoid(net)=0.8061.

---

## Question 27

**Question:** At x=0, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.25, 0.5)
- **B.** (0.5, 0.75)
- **C.** (0.5, 0.75)
- **D.** (0.5, 0.25)

**Correct Answer:** (0.5, 0.25)

**Explanation:** S=0.5 and S'=S(1-S)=0.25.

---

## Question 28

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.75)+0.1), h2=S(-0.2(1)+0.8(0.75)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.7071
- **B.** 0.3566
- **C.** 0.5882
- **D.** 0.5618

**Correct Answer:** 0.5882

**Explanation:** h1=0.5987, h2=0.525, output net=0.3566, so y=0.5882.

---

## Question 29

**Question:** A weight is 0.75, its error gradient is 0.35, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.785
- **B.** 0.4
- **C.** 1.1
- **D.** 0.715

**Correct Answer:** 0.715

**Explanation:** Use w' = w-alpha*dE/dw = 0.75-0.1(0.35)=0.715.

---

## Question 30

**Question:** Perceptron audit 6: for w1=w2=1, b=-1, output 1 only if v>0, input (1,0) gives which (v,y)?

**Choices:**
- **A.** (1, -1)
- **B.** (0, 1)
- **C.** (-1, 1)
- **D.** (0, -1)

**Correct Answer:** (0, -1)

**Explanation:** v=1+0-1=0; the strict condition v>0 gives y=-1.

---

## Question 31

**Question:** A sigmoid neuron receives x=['1.6', '-1.7', '0.5'], w=[0.4, -0.3, 0.8], b=-0.08. What pair (net,y) is correct?

**Choices:**
- **A.** (1.55, 0.8249)
- **B.** (-1.47, 0.1869)
- **C.** (1.47, 0.8131)
- **D.** (0.8131, 1.47)

**Correct Answer:** (1.47, 0.8131)

**Explanation:** net=sum xw+b=1.47 and sigmoid(net)=0.8131.

---

## Question 32

**Question:** At x=0.4, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.5987, 0.2403)
- **B.** (0.2403, 0.5987)
- **C.** (0.5987, 0.7597)
- **D.** (0.4013, 0.7597)

**Correct Answer:** (0.5987, 0.2403)

**Explanation:** S=0.5987 and S'=S(1-S)=0.2403.

---

## Question 33

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.8)+0.1), h2=S(-0.2(1)+0.8(0.8)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.7075
- **B.** 0.3482
- **C.** 0.5862
- **D.** 0.5644

**Correct Answer:** 0.5862

**Explanation:** h1=0.5939, h2=0.5349, output net=0.3482, so y=0.5862.

---

## Question 34

**Question:** A weight is 0.8, its error gradient is -0.38, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.838
- **B.** 0.762
- **C.** 1.18
- **D.** 0.42

**Correct Answer:** 0.838

**Explanation:** Use w' = w-alpha*dE/dw = 0.8-0.1(-0.38)=0.838.

---

## Question 35

**Question:** Perceptron audit 7: for w1=w2=1, b=-1, output 1 only if v>0, input (0,1) gives which (v,y)?

**Choices:**
- **A.** (1, -1)
- **B.** (0, 1)
- **C.** (0, -1)
- **D.** (-1, 1)

**Correct Answer:** (0, -1)

**Explanation:** v=0+1-1=0; the strict condition v>0 gives y=-1.

---

## Question 36

**Question:** A sigmoid neuron receives x=['1.7', '-1.65', '0.5'], w=[0.4, -0.3, 0.8], b=-0.06. What pair (net,y) is correct?

**Choices:**
- **A.** (1.575, 0.8285)
- **B.** (-1.515, 0.1802)
- **C.** (0.8198, 1.515)
- **D.** (1.515, 0.8198)

**Correct Answer:** (1.515, 0.8198)

**Explanation:** net=sum xw+b=1.515 and sigmoid(net)=0.8198.

---

## Question 37

**Question:** At x=0.8, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.2139, 0.69)
- **B.** (0.69, 0.7861)
- **C.** (0.69, 0.2139)
- **D.** (0.31, 0.7861)

**Correct Answer:** (0.69, 0.2139)

**Explanation:** S=0.69 and S'=S(1-S)=0.2139.

---

## Question 38

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.85)+0.1), h2=S(-0.2(1)+0.8(0.85)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.7078
- **B.** 0.5842
- **C.** 0.3399
- **D.** 0.567

**Correct Answer:** 0.5842

**Explanation:** h1=0.589, h2=0.5449, output net=0.3399, so y=0.5842.

---

## Question 39

**Question:** A weight is 0.85, its error gradient is 0.41, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.891
- **B.** 0.44
- **C.** 1.26
- **D.** 0.809

**Correct Answer:** 0.809

**Explanation:** Use w' = w-alpha*dE/dw = 0.85-0.1(0.41)=0.809.

---

## Question 40

**Question:** Perceptron audit 8: for w1=w2=1, b=-1, output 1 only if v>0, input (1,1) gives which (v,y)?

**Choices:**
- **A.** (1, 1)
- **B.** (2, 1)
- **C.** (1, -1)
- **D.** (0, 1)

**Correct Answer:** (1, 1)

**Explanation:** v=1+1-1=1; the strict condition v>0 gives y=1.

---

## Question 41

**Question:** A sigmoid neuron receives x=['1.8', '-1.6', '0.5'], w=[0.4, -0.3, 0.8], b=-0.04. What pair (net,y) is correct?

**Choices:**
- **A.** (1.6, 0.832)
- **B.** (-1.56, 0.1736)
- **C.** (0.8264, 1.56)
- **D.** (1.56, 0.8264)

**Correct Answer:** (1.56, 0.8264)

**Explanation:** net=sum xw+b=1.56 and sigmoid(net)=0.8264.

---

## Question 42

**Question:** At x=1.2, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.1779, 0.7685)
- **B.** (0.7685, 0.8221)
- **C.** (0.7685, 0.1779)
- **D.** (0.2315, 0.8221)

**Correct Answer:** (0.7685, 0.1779)

**Explanation:** S=0.7685 and S'=S(1-S)=0.1779.

---

## Question 43

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.9)+0.1), h2=S(-0.2(1)+0.8(0.9)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.7081
- **B.** 0.5821
- **C.** 0.3315
- **D.** 0.5695

**Correct Answer:** 0.5821

**Explanation:** h1=0.5842, h2=0.5548, output net=0.3315, so y=0.5821.

---

## Question 44

**Question:** A weight is 0.9, its error gradient is -0.44, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.944
- **B.** 0.856
- **C.** 1.34
- **D.** 0.46

**Correct Answer:** 0.944

**Explanation:** Use w' = w-alpha*dE/dw = 0.9-0.1(-0.44)=0.944.

---

## Question 45

**Question:** Perceptron audit 9: for w1=w2=1, b=-1, output 1 only if v>0, input (0,0) gives which (v,y)?

**Choices:**
- **A.** (0, -1)
- **B.** (-1, 1)
- **C.** (-2, -1)
- **D.** (-1, -1)

**Correct Answer:** (-1, -1)

**Explanation:** v=0+0-1=-1; the strict condition v>0 gives y=-1.

---

## Question 46

**Question:** A sigmoid neuron receives x=['1.9', '-1.55', '0.5'], w=[0.4, -0.3, 0.8], b=-0.02. What pair (net,y) is correct?

**Choices:**
- **A.** (1.625, 0.8355)
- **B.** (-1.605, 0.1673)
- **C.** (0.8327, 1.605)
- **D.** (1.605, 0.8327)

**Correct Answer:** (1.605, 0.8327)

**Explanation:** net=sum xw+b=1.605 and sigmoid(net)=0.8327.

---

## Question 47

**Question:** At x=1.6, compute the ordered pair (S(x), S'(x)) for sigmoid.

**Choices:**
- **A.** (0.1398, 0.832)
- **B.** (0.832, 0.1398)
- **C.** (0.832, 0.8602)
- **D.** (0.168, 0.8602)

**Correct Answer:** (0.832, 0.1398)

**Explanation:** S=0.832 and S'=S(1-S)=0.1398.

---

## Question 48

**Question:** Two sigmoid hidden units are h1=S(0.6(1)-0.4(0.95)+0.1), h2=S(-0.2(1)+0.8(0.95)-0.3). Output y=S(0.7h1-0.5h2+0.2). What is y?

**Choices:**
- **A.** 0.5801
- **B.** 0.7084
- **C.** 0.3232
- **D.** 0.572

**Correct Answer:** 0.5801

**Explanation:** h1=0.5793, h2=0.5646, output net=0.3232, so y=0.5801.

---

## Question 49

**Question:** A weight is 0.95, its error gradient is 0.47, and learning rate is 0.1. Under gradient descent, what is the new weight?

**Choices:**
- **A.** 0.997
- **B.** 0.48
- **C.** 0.903
- **D.** 1.42

**Correct Answer:** 0.903

**Explanation:** Use w' = w-alpha*dE/dw = 0.95-0.1(0.47)=0.903.

---

## Question 50

**Question:** Perceptron audit 10: for w1=w2=1, b=-1, output 1 only if v>0, input (1,0) gives which (v,y)?

**Choices:**
- **A.** (0, -1)
- **B.** (1, -1)
- **C.** (0, 1)
- **D.** (-1, 1)

**Correct Answer:** (0, -1)

**Explanation:** v=1+0-1=0; the strict condition v>0 gives y=-1.

---

## Question 51

**Question:** A neural-network derivation contains several plausible claims. Case 1: Which conclusion is the single most defensible?

**Choices:**
- **A.** A bias is the derivative of every activation function.
- **B.** A bias forces all connection weights to be equal.
- **C.** A bias shifts the neuron's pre-activation independently of the input-feature values.
- **D.** A bias is used only after the final prediction is evaluated., under both the training and evaluation conditions stated

**Correct Answer:** A bias shifts the neuron's pre-activation independently of the input-feature values.

**Explanation:** The bias is the additive term in v=sum x_i w_i+b.

---

## Question 52

**Question:** A neural-network derivation contains several plausible claims. Case 2: Which conclusion is the single most defensible?

**Choices:**
- **A.** Sigmoid's derivative is exactly one for every input.
- **B.** Sigmoid's derivative is negative whenever its output exceeds 0.5., even when the other quantities in the formula are fixed
- **C.** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.
- **D.** Sigmoid has no derivative because it is a threshold function.

**Correct Answer:** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Explanation:** S'(x)=S(x)(1-S(x)), maximized at S=0.5.

---

## Question 53

**Question:** A neural-network derivation contains several plausible claims. Case 3: Which conclusion is the single most defensible?

**Choices:**
- **A.** Backpropagation changes labels to eliminate prediction errors.
- **B.** Backpropagation requires every activation to be a hard step.
- **C.** Backpropagation updates weights without reference to an error function., as a consequence that holds for every permitted input
- **D.** Backpropagation uses the chain rule to attribute output error to earlier weights.

**Correct Answer:** Backpropagation uses the chain rule to attribute output error to earlier weights.

**Explanation:** Layered compositions require chain-rule derivatives.

---

## Question 54

**Question:** A neural-network derivation contains several plausible claims. Case 4: Which conclusion is the single most defensible?

**Choices:**
- **A.** Weights must always increase, regardless of gradient sign.
- **B.** Weights should move opposite the error gradient when minimizing error.
- **C.** The gradient is used only to choose the number of hidden layers., without needing any additional modeling assumption
- **D.** Error minimization moves in the positive gradient direction.

**Correct Answer:** Weights should move opposite the error gradient when minimizing error.

**Explanation:** The supplied rule states Delta w is proportional to -partial E/partial w.

---

## Question 55

**Question:** A neural-network derivation contains several plausible claims. Case 5: Which conclusion is the single most defensible?

**Choices:**
- **A.** Feed-forward means outputs are copied directly to training labels., under both the training and evaluation conditions stated
- **B.** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.
- **C.** Every feed-forward network has no hidden layer.
- **D.** Feed-forward requires knowledge to be stored outside connections.

**Correct Answer:** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Explanation:** The chapter's BP architecture sends layer outputs to later layers.

---

## Question 56

**Question:** A neural-network derivation contains several plausible claims. Case 6: Which conclusion is the single most defensible?

**Choices:**
- **A.** ReLU returns zero for a negative pre-activation and the input itself for a positive one.
- **B.** ReLU maps every input to a probability summing to one.
- **C.** ReLU always returns a value strictly between zero and one.
- **D.** ReLU is the linear function f(x)=x for negative inputs only., even when the other quantities in the formula are fixed

**Correct Answer:** ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Explanation:** ReLU is max(0,x).

---

## Question 57

**Question:** A neural-network derivation contains several plausible claims. Case 7: Which conclusion is the single most defensible?

**Choices:**
- **A.** Softmax is the binary mutation operator in a neural layer.
- **B.** Softmax is identical to a hard threshold at zero.
- **C.** Softmax is associated with multi-class probability output.
- **D.** Softmax replaces every feature with its training mean.

**Correct Answer:** Softmax is associated with multi-class probability output.

**Explanation:** The tracker identifies softmax as the multi-class probability activation.

---

## Question 58

**Question:** A neural-network derivation contains several plausible claims. Case 8: Which conclusion is the single most defensible?

**Choices:**
- **A.** The AND example outputs 1 whenever either input is 1., without needing any additional modeling assumption
- **B.** The AND example outputs 1 only when both binary inputs are 1.
- **C.** Its bias of -1 makes every input pair output -1.
- **D.** Its step rule outputs 1 when v is exactly zero.

**Correct Answer:** The AND example outputs 1 only when both binary inputs are 1.

**Explanation:** With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 59

**Question:** A neural-network derivation contains several plausible claims. Case 9: Which conclusion is the single most defensible?

**Choices:**
- **A.** A hidden layer is another name for the labelled dataset., under both the training and evaluation conditions stated
- **B.** A hidden layer can contain no adjustable connections.
- **C.** A hidden layer must always use a linear activation.
- **D.** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Correct Answer:** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Explanation:** Hidden units transform signals between input and output layers.

---

## Question 60

**Question:** A neural-network derivation contains several plausible claims. Case 10: Which conclusion is the single most defensible?

**Choices:**
- **A.** BP is guaranteed to find the global minimum in one update.
- **B.** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.
- **C.** BP cannot represent nonlinear mappings under any activation.
- **D.** BP requires no parameter choices because all values are fixed., even when the other quantities in the formula are fixed

**Correct Answer:** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.

**Explanation:** The chapter explicitly lists these BP problems.

---

## Question 61

**Question:** A neural-network derivation contains several plausible claims. Case 11: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A bias is the derivative of every activation function.
- **B.** A bias forces all connection weights to be equal.
- **C.** A bias shifts the neuron's pre-activation independently of the input-feature values.
- **D.** A bias is used only after the final prediction is evaluated., as a consequence that holds for every permitted input

**Correct Answer:** A bias shifts the neuron's pre-activation independently of the input-feature values.

**Explanation:** The bias is the additive term in v=sum x_i w_i+b.

---

## Question 62

**Question:** A neural-network derivation contains several plausible claims. Case 12: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Sigmoid's derivative is exactly one for every input.
- **B.** Sigmoid's derivative is negative whenever its output exceeds 0.5., without needing any additional modeling assumption
- **C.** Sigmoid has no derivative because it is a threshold function.
- **D.** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Correct Answer:** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Explanation:** S'(x)=S(x)(1-S(x)), maximized at S=0.5.

---

## Question 63

**Question:** A neural-network derivation contains several plausible claims. Case 13: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Backpropagation changes labels to eliminate prediction errors.
- **B.** Backpropagation requires every activation to be a hard step.
- **C.** Backpropagation uses the chain rule to attribute output error to earlier weights.
- **D.** Backpropagation updates weights without reference to an error function., under both the training and evaluation conditions stated

**Correct Answer:** Backpropagation uses the chain rule to attribute output error to earlier weights.

**Explanation:** Layered compositions require chain-rule derivatives.

---

## Question 64

**Question:** A neural-network derivation contains several plausible claims. Case 14: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Weights must always increase, regardless of gradient sign.
- **B.** The gradient is used only to choose the number of hidden layers., even when the other quantities in the formula are fixed
- **C.** Weights should move opposite the error gradient when minimizing error.
- **D.** Error minimization moves in the positive gradient direction.

**Correct Answer:** Weights should move opposite the error gradient when minimizing error.

**Explanation:** The supplied rule states Delta w is proportional to -partial E/partial w.

---

## Question 65

**Question:** A neural-network derivation contains several plausible claims. Case 15: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.
- **B.** Feed-forward means outputs are copied directly to training labels., as a consequence that holds for every permitted input
- **C.** Every feed-forward network has no hidden layer.
- **D.** Feed-forward requires knowledge to be stored outside connections.

**Correct Answer:** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Explanation:** The chapter's BP architecture sends layer outputs to later layers.

---

## Question 66

**Question:** A neural-network derivation contains several plausible claims. Case 16: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** ReLU maps every input to a probability summing to one.
- **B.** ReLU always returns a value strictly between zero and one.
- **C.** ReLU returns zero for a negative pre-activation and the input itself for a positive one.
- **D.** ReLU is the linear function f(x)=x for negative inputs only., without needing any additional modeling assumption

**Correct Answer:** ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Explanation:** ReLU is max(0,x).

---

## Question 67

**Question:** A neural-network derivation contains several plausible claims. Case 17: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** Softmax is the binary mutation operator in a neural layer.
- **B.** Softmax is associated with multi-class probability output.
- **C.** Softmax is identical to a hard threshold at zero.
- **D.** Softmax replaces every feature with its training mean.

**Correct Answer:** Softmax is associated with multi-class probability output.

**Explanation:** The tracker identifies softmax as the multi-class probability activation.

---

## Question 68

**Question:** A neural-network derivation contains several plausible claims. Case 18: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** The AND example outputs 1 whenever either input is 1., even when the other quantities in the formula are fixed
- **B.** The AND example outputs 1 only when both binary inputs are 1.
- **C.** Its bias of -1 makes every input pair output -1.
- **D.** Its step rule outputs 1 when v is exactly zero.

**Correct Answer:** The AND example outputs 1 only when both binary inputs are 1.

**Explanation:** With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 69

**Question:** A neural-network derivation contains several plausible claims. Case 19: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** A hidden layer performs an intermediate transformation rather than serving as the final prediction.
- **B.** A hidden layer is another name for the labelled dataset., as a consequence that holds for every permitted input
- **C.** A hidden layer can contain no adjustable connections.
- **D.** A hidden layer must always use a linear activation.

**Correct Answer:** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Explanation:** Hidden units transform signals between input and output layers.

---

## Question 70

**Question:** A neural-network derivation contains several plausible claims. Case 20: A student must reject three claims. Which claim should be retained?

**Choices:**
- **A.** BP is guaranteed to find the global minimum in one update.
- **B.** BP cannot represent nonlinear mappings under any activation.
- **C.** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.
- **D.** BP requires no parameter choices because all values are fixed., without needing any additional modeling assumption

**Correct Answer:** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.

**Explanation:** The chapter explicitly lists these BP problems.

---

## Question 71

**Question:** A neural-network derivation contains several plausible claims. Case 21: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A bias is the derivative of every activation function.
- **B.** A bias shifts the neuron's pre-activation independently of the input-feature values.
- **C.** A bias forces all connection weights to be equal.
- **D.** A bias is used only after the final prediction is evaluated., under both the training and evaluation conditions stated

**Correct Answer:** A bias shifts the neuron's pre-activation independently of the input-feature values.

**Explanation:** The bias is the additive term in v=sum x_i w_i+b.

---

## Question 72

**Question:** A neural-network derivation contains several plausible claims. Case 22: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.
- **B.** Sigmoid's derivative is exactly one for every input.
- **C.** Sigmoid's derivative is negative whenever its output exceeds 0.5., even when the other quantities in the formula are fixed
- **D.** Sigmoid has no derivative because it is a threshold function.

**Correct Answer:** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Explanation:** S'(x)=S(x)(1-S(x)), maximized at S=0.5.

---

## Question 73

**Question:** A neural-network derivation contains several plausible claims. Case 23: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Backpropagation uses the chain rule to attribute output error to earlier weights.
- **B.** Backpropagation changes labels to eliminate prediction errors.
- **C.** Backpropagation requires every activation to be a hard step.
- **D.** Backpropagation updates weights without reference to an error function., as a consequence that holds for every permitted input

**Correct Answer:** Backpropagation uses the chain rule to attribute output error to earlier weights.

**Explanation:** Layered compositions require chain-rule derivatives.

---

## Question 74

**Question:** A neural-network derivation contains several plausible claims. Case 24: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Weights should move opposite the error gradient when minimizing error.
- **B.** Weights must always increase, regardless of gradient sign.
- **C.** The gradient is used only to choose the number of hidden layers., without needing any additional modeling assumption
- **D.** Error minimization moves in the positive gradient direction.

**Correct Answer:** Weights should move opposite the error gradient when minimizing error.

**Explanation:** The supplied rule states Delta w is proportional to -partial E/partial w.

---

## Question 75

**Question:** A neural-network derivation contains several plausible claims. Case 25: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Feed-forward means outputs are copied directly to training labels., under both the training and evaluation conditions stated
- **B.** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.
- **C.** Every feed-forward network has no hidden layer.
- **D.** Feed-forward requires knowledge to be stored outside connections.

**Correct Answer:** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Explanation:** The chapter's BP architecture sends layer outputs to later layers.

---

## Question 76

**Question:** A neural-network derivation contains several plausible claims. Case 26: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** ReLU maps every input to a probability summing to one.
- **B.** ReLU always returns a value strictly between zero and one.
- **C.** ReLU is the linear function f(x)=x for negative inputs only., even when the other quantities in the formula are fixed
- **D.** ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Correct Answer:** ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Explanation:** ReLU is max(0,x).

---

## Question 77

**Question:** A neural-network derivation contains several plausible claims. Case 27: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** Softmax is the binary mutation operator in a neural layer.
- **B.** Softmax is identical to a hard threshold at zero.
- **C.** Softmax replaces every feature with its training mean.
- **D.** Softmax is associated with multi-class probability output.

**Correct Answer:** Softmax is associated with multi-class probability output.

**Explanation:** The tracker identifies softmax as the multi-class probability activation.

---

## Question 78

**Question:** A neural-network derivation contains several plausible claims. Case 28: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** The AND example outputs 1 whenever either input is 1., without needing any additional modeling assumption
- **B.** The AND example outputs 1 only when both binary inputs are 1.
- **C.** Its bias of -1 makes every input pair output -1.
- **D.** Its step rule outputs 1 when v is exactly zero.

**Correct Answer:** The AND example outputs 1 only when both binary inputs are 1.

**Explanation:** With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 79

**Question:** A neural-network derivation contains several plausible claims. Case 29: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** A hidden layer is another name for the labelled dataset., under both the training and evaluation conditions stated
- **B.** A hidden layer performs an intermediate transformation rather than serving as the final prediction.
- **C.** A hidden layer can contain no adjustable connections.
- **D.** A hidden layer must always use a linear activation.

**Correct Answer:** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Explanation:** Hidden units transform signals between input and output layers.

---

## Question 80

**Question:** A neural-network derivation contains several plausible claims. Case 30: Which statement remains correct under the definitions in this chapter?

**Choices:**
- **A.** BP is guaranteed to find the global minimum in one update.
- **B.** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.
- **C.** BP cannot represent nonlinear mappings under any activation.
- **D.** BP requires no parameter choices because all values are fixed., even when the other quantities in the formula are fixed

**Correct Answer:** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.

**Explanation:** The chapter explicitly lists these BP problems.

---

## Question 81

**Question:** A neural-network derivation contains several plausible claims. Case 31: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A bias shifts the neuron's pre-activation independently of the input-feature values.
- **B.** A bias is the derivative of every activation function.
- **C.** A bias forces all connection weights to be equal.
- **D.** A bias is used only after the final prediction is evaluated., as a consequence that holds for every permitted input

**Correct Answer:** A bias shifts the neuron's pre-activation independently of the input-feature values.

**Explanation:** The bias is the additive term in v=sum x_i w_i+b.

---

## Question 82

**Question:** A neural-network derivation contains several plausible claims. Case 32: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Sigmoid's derivative is exactly one for every input.
- **B.** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.
- **C.** Sigmoid's derivative is negative whenever its output exceeds 0.5., without needing any additional modeling assumption
- **D.** Sigmoid has no derivative because it is a threshold function.

**Correct Answer:** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Explanation:** S'(x)=S(x)(1-S(x)), maximized at S=0.5.

---

## Question 83

**Question:** A neural-network derivation contains several plausible claims. Case 33: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Backpropagation changes labels to eliminate prediction errors.
- **B.** Backpropagation uses the chain rule to attribute output error to earlier weights.
- **C.** Backpropagation requires every activation to be a hard step.
- **D.** Backpropagation updates weights without reference to an error function., under both the training and evaluation conditions stated

**Correct Answer:** Backpropagation uses the chain rule to attribute output error to earlier weights.

**Explanation:** Layered compositions require chain-rule derivatives.

---

## Question 84

**Question:** A neural-network derivation contains several plausible claims. Case 34: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Weights must always increase, regardless of gradient sign.
- **B.** The gradient is used only to choose the number of hidden layers., even when the other quantities in the formula are fixed
- **C.** Error minimization moves in the positive gradient direction.
- **D.** Weights should move opposite the error gradient when minimizing error.

**Correct Answer:** Weights should move opposite the error gradient when minimizing error.

**Explanation:** The supplied rule states Delta w is proportional to -partial E/partial w.

---

## Question 85

**Question:** A neural-network derivation contains several plausible claims. Case 35: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.
- **B.** Feed-forward means outputs are copied directly to training labels., as a consequence that holds for every permitted input
- **C.** Every feed-forward network has no hidden layer.
- **D.** Feed-forward requires knowledge to be stored outside connections.

**Correct Answer:** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Explanation:** The chapter's BP architecture sends layer outputs to later layers.

---

## Question 86

**Question:** A neural-network derivation contains several plausible claims. Case 36: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** ReLU maps every input to a probability summing to one.
- **B.** ReLU returns zero for a negative pre-activation and the input itself for a positive one.
- **C.** ReLU always returns a value strictly between zero and one.
- **D.** ReLU is the linear function f(x)=x for negative inputs only., without needing any additional modeling assumption

**Correct Answer:** ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Explanation:** ReLU is max(0,x).

---

## Question 87

**Question:** A neural-network derivation contains several plausible claims. Case 37: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Softmax is associated with multi-class probability output.
- **B.** Softmax is the binary mutation operator in a neural layer.
- **C.** Softmax is identical to a hard threshold at zero.
- **D.** Softmax replaces every feature with its training mean.

**Correct Answer:** Softmax is associated with multi-class probability output.

**Explanation:** The tracker identifies softmax as the multi-class probability activation.

---

## Question 88

**Question:** A neural-network derivation contains several plausible claims. Case 38: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** The AND example outputs 1 whenever either input is 1., even when the other quantities in the formula are fixed
- **B.** Its bias of -1 makes every input pair output -1.
- **C.** Its step rule outputs 1 when v is exactly zero.
- **D.** The AND example outputs 1 only when both binary inputs are 1.

**Correct Answer:** The AND example outputs 1 only when both binary inputs are 1.

**Explanation:** With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 89

**Question:** A neural-network derivation contains several plausible claims. Case 39: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** A hidden layer is another name for the labelled dataset., as a consequence that holds for every permitted input
- **B.** A hidden layer can contain no adjustable connections.
- **C.** A hidden layer must always use a linear activation.
- **D.** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Correct Answer:** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Explanation:** Hidden units transform signals between input and output layers.

---

## Question 90

**Question:** A neural-network derivation contains several plausible claims. Case 40: Which interpretation avoids the most tempting conceptual error?

**Choices:**
- **A.** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.
- **B.** BP is guaranteed to find the global minimum in one update.
- **C.** BP cannot represent nonlinear mappings under any activation.
- **D.** BP requires no parameter choices because all values are fixed., without needing any additional modeling assumption

**Correct Answer:** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.

**Explanation:** The chapter explicitly lists these BP problems.

---

## Question 91

**Question:** A neural-network derivation contains several plausible claims. Case 41: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A bias is the derivative of every activation function.
- **B.** A bias forces all connection weights to be equal.
- **C.** A bias shifts the neuron's pre-activation independently of the input-feature values.
- **D.** A bias is used only after the final prediction is evaluated., under both the training and evaluation conditions stated

**Correct Answer:** A bias shifts the neuron's pre-activation independently of the input-feature values.

**Explanation:** The bias is the additive term in v=sum x_i w_i+b.

---

## Question 92

**Question:** A neural-network derivation contains several plausible claims. Case 42: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Sigmoid's derivative is exactly one for every input.
- **B.** Sigmoid's derivative is negative whenever its output exceeds 0.5., even when the other quantities in the formula are fixed
- **C.** Sigmoid has no derivative because it is a threshold function.
- **D.** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Correct Answer:** Sigmoid's derivative is largest near an output of 0.5 and small near 0 or 1.

**Explanation:** S'(x)=S(x)(1-S(x)), maximized at S=0.5.

---

## Question 93

**Question:** A neural-network derivation contains several plausible claims. Case 43: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Backpropagation changes labels to eliminate prediction errors.
- **B.** Backpropagation requires every activation to be a hard step.
- **C.** Backpropagation uses the chain rule to attribute output error to earlier weights.
- **D.** Backpropagation updates weights without reference to an error function., as a consequence that holds for every permitted input

**Correct Answer:** Backpropagation uses the chain rule to attribute output error to earlier weights.

**Explanation:** Layered compositions require chain-rule derivatives.

---

## Question 94

**Question:** A neural-network derivation contains several plausible claims. Case 44: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Weights should move opposite the error gradient when minimizing error.
- **B.** Weights must always increase, regardless of gradient sign.
- **C.** The gradient is used only to choose the number of hidden layers., without needing any additional modeling assumption
- **D.** Error minimization moves in the positive gradient direction.

**Correct Answer:** Weights should move opposite the error gradient when minimizing error.

**Explanation:** The supplied rule states Delta w is proportional to -partial E/partial w.

---

## Question 95

**Question:** A neural-network derivation contains several plausible claims. Case 45: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Feed-forward means outputs are copied directly to training labels., under both the training and evaluation conditions stated
- **B.** Every feed-forward network has no hidden layer.
- **C.** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.
- **D.** Feed-forward requires knowledge to be stored outside connections.

**Correct Answer:** A multilayer feed-forward network passes activations forward without recurrent loops in the stated architecture.

**Explanation:** The chapter's BP architecture sends layer outputs to later layers.

---

## Question 96

**Question:** A neural-network derivation contains several plausible claims. Case 46: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** ReLU maps every input to a probability summing to one.
- **B.** ReLU always returns a value strictly between zero and one.
- **C.** ReLU is the linear function f(x)=x for negative inputs only., even when the other quantities in the formula are fixed
- **D.** ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Correct Answer:** ReLU returns zero for a negative pre-activation and the input itself for a positive one.

**Explanation:** ReLU is max(0,x).

---

## Question 97

**Question:** A neural-network derivation contains several plausible claims. Case 47: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** Softmax is the binary mutation operator in a neural layer.
- **B.** Softmax is identical to a hard threshold at zero.
- **C.** Softmax is associated with multi-class probability output.
- **D.** Softmax replaces every feature with its training mean.

**Correct Answer:** Softmax is associated with multi-class probability output.

**Explanation:** The tracker identifies softmax as the multi-class probability activation.

---

## Question 98

**Question:** A neural-network derivation contains several plausible claims. Case 48: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** The AND example outputs 1 whenever either input is 1., without needing any additional modeling assumption
- **B.** Its bias of -1 makes every input pair output -1.
- **C.** Its step rule outputs 1 when v is exactly zero.
- **D.** The AND example outputs 1 only when both binary inputs are 1.

**Correct Answer:** The AND example outputs 1 only when both binary inputs are 1.

**Explanation:** With weights (1,1), bias -1, and 1 only for v>0, only (1,1) fires.

---

## Question 99

**Question:** A neural-network derivation contains several plausible claims. Case 49: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** A hidden layer is another name for the labelled dataset., under both the training and evaluation conditions stated
- **B.** A hidden layer can contain no adjustable connections.
- **C.** A hidden layer performs an intermediate transformation rather than serving as the final prediction.
- **D.** A hidden layer must always use a linear activation.

**Correct Answer:** A hidden layer performs an intermediate transformation rather than serving as the final prediction.

**Explanation:** Hidden units transform signals between input and output layers.

---

## Question 100

**Question:** A neural-network derivation contains several plausible claims. Case 50: An examiner changes only the wording, not the underlying assumptions. Which answer is still valid?

**Choices:**
- **A.** BP is guaranteed to find the global minimum in one update.
- **B.** BP cannot represent nonlinear mappings under any activation.
- **C.** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.
- **D.** BP requires no parameter choices because all values are fixed., even when the other quantities in the formula are fixed

**Correct Answer:** Long convergence, local minima, and black-box behavior are stated limitations of BP learning.

**Explanation:** The chapter explicitly lists these BP problems.

---

### Answer distribution (self-check)

Correct-choice positions: A=25, B=25, C=25, D=25. Distractors are designed around plausible definition, sign, denominator, update-order, and rounding errors.
