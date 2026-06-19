# LaTeX (KaTeX) Math Symbols Reference Guide

> A comprehensive reference for writing mathematical operation symbols in Markdown, with a focus on symbols used in Neural Network and Machine Learning notes.

---

## 1. Basic Arithmetic

| Operation           | LaTeX Syntax   | Rendered Output |
| :------------------ | :------------- | :-------------: |
| Addition            | `+`            | $+$             |
| Subtraction         | `-`            | $-$             |
| Multiplication (cross) | `\times`   | $\times$        |
| Multiplication (dot)   | `\cdot`    | $\cdot$         |
| Division            | `\div`         | $\div$          |
| Fraction            | `\frac{a}{b}`  | $\frac{a}{b}$   |
| Plus-Minus          | `\pm`          | $\pm$           |

---

## 2. Powers, Indices, and Roots

| Operation           | LaTeX Syntax         | Rendered Output       |
| :------------------ | :------------------- | :-------------------: |
| Superscript (Power) | `x^2`                | $x^2$                 |
| Subscript (Index)   | `x_1`                | $x_1$                 |
| Grouped Superscript | `x^{(1)}`            | $x^{(1)}$             |
| Grouped Indices     | `w_{i,j}^{(1,0)}`    | $w_{i,j}^{(1,0)}$     |
| Square Root         | `\sqrt{x}`           | $\sqrt{x}$            |
| N-th Root           | `\sqrt[n]{x}`        | $\sqrt[n]{x}$         |

---

## 3. Equalities and Inequalities

| Operation              | LaTeX Syntax | Rendered Output |
| :--------------------- | :----------- | :-------------: |
| Equal                  | `=`          | $=$             |
| Not Equal              | `\neq`       | $\neq$          |
| Approximately Equal    | `\approx`    | $\approx$       |
| Less Than              | `<`          | $<$             |
| Greater Than           | `>`          | $>$             |
| Less Than or Equal     | `\leq`       | $\leq$          |
| Greater Than or Equal  | `\geq`       | $\geq$          |
| Proportional To        | `\propto`    | $\propto$       |
| Much Less Than         | `\ll`        | $\ll$           |
| Much Greater Than      | `\gg`        | $\gg$           |

---

## 4. Calculus and Advanced Mathematics

| Operation              | LaTeX Syntax                     | Rendered Output                   |
| :--------------------- | :------------------------------- | :-------------------------------: |
| Summation              | `\sum_{i=1}^{n}`                 | $\sum_{i=1}^{n}$                  |
| Product                | `\prod_{i=1}^{n}`                | $\prod_{i=1}^{n}$                 |
| Partial Derivative     | `\frac{\partial E}{\partial w}`  | $\frac{\partial E}{\partial w}$   |
| Change / Difference    | `\Delta w`                       | $\Delta w$                        |
| Gradient (Nabla)       | `\nabla E`                       | $\nabla E$                        |
| Definite Integral      | `\int_a^b`                       | $\int_a^b$                        |
| Infinity               | `\infty`                         | $\infty$                          |
| Limit                  | `\lim_{x \to 0}`                 | $\lim_{x \to 0}$                  |

---

## 5. Greek Letters (Common in Machine Learning)

| Symbol Name                | LaTeX Syntax | Rendered Output |
| :------------------------- | :----------- | :-------------: |
| Eta (Learning Rate)        | `\eta`       | $\eta$          |
| Delta (Error Term)         | `\delta`     | $\delta$        |
| Sigma (Activation/Sum)     | `\sigma`     | $\sigma$        |
| Alpha                      | `\alpha`     | $\alpha$        |
| Beta                       | `\beta`      | $\beta$         |
| Lambda (Regularization)    | `\lambda`    | $\lambda$       |
| Theta (Parameters)         | `\theta`     | $\theta$        |
| Epsilon (Small Value)      | `\epsilon`   | $\epsilon$      |
| Mu (Mean)                  | `\mu`        | $\mu$           |
| Capital Sigma (Summation)  | `\Sigma`     | $\Sigma$        |

---

## 6. Decorators and Accents

| Operation           | LaTeX Syntax       | Rendered Output     |
| :------------------ | :----------------- | :-----------------: |
| Hat (Prediction)    | `\hat{y}`          | $\hat{y}$           |
| Bar (Mean)          | `\bar{x}`          | $\bar{x}$           |
| Tilde               | `\tilde{x}`        | $\tilde{x}$         |
| Dot (Derivative)    | `\dot{x}`          | $\dot{x}$           |
| Vector Arrow        | `\vec{x}`          | $\vec{x}$           |
| Bold (Vector/Matrix)| `\mathbf{W}`       | $\mathbf{W}$        |

---

## 7. Arrows and Logic

| Operation           | LaTeX Syntax       | Rendered Output     |
| :------------------ | :----------------- | :-----------------: |
| Right Arrow         | `\rightarrow`      | $\rightarrow$       |
| Left Arrow          | `\leftarrow`       | $\leftarrow$        |
| Implies             | `\Rightarrow`      | $\Rightarrow$       |
| If and Only If      | `\Leftrightarrow`  | $\Leftrightarrow$   |
| Maps To             | `\mapsto`          | $\mapsto$           |
| Therefore           | `\therefore`       | $\therefore$        |
| For All             | `\forall`          | $\forall$           |
| There Exists        | `\exists`          | $\exists$           |
| Element Of          | `\in`              | $\in$               |
| Not Element Of      | `\notin`           | $\notin$            |

---

## 8. Brackets and Grouping

| Operation           | LaTeX Syntax                     | Rendered Output               |
| :------------------ | :------------------------------- | :---------------------------: |
| Parentheses (auto)  | `\left( \frac{a}{b} \right)`    | $\left( \frac{a}{b} \right)$ |
| Square Brackets     | `\left[ x \right]`              | $\left[ x \right]$           |
| Curly Braces        | `\left\{ x \right\}`            | $\left\{ x \right\}$         |
| Absolute Value      | `\left| x \right|`              | $\left| x \right|$           |
| Norm                | `\left\| x \right\|`            | $\left\| x \right\|$         |

---

## Block Equation Examples

Wrap formulas in `$$` on separate lines for block display:

**Generalized Delta Rule:**

$$
\Delta w_{k,j}^{(2,1)} = -\eta \frac{\partial E}{\partial w_{k,j}^{(2,1)}} = \eta \delta_{out} x_j^{(1)}
$$

**Sigmoid Function:**

$$
S(x) = \frac{1}{1 + e^{-x}}
$$

**Softmax Function:**

$$
\sigma(z_i) = \frac{e^{z_i}}{\sum_{j=1}^{K} e^{z_j}}
$$

**Mean Squared Error:**

$$
E = \frac{1}{2} \sum_{k=1}^{n} (t_k - y_k)^2
$$

---

## Quick Syntax Tips

| Tip | Example | Result |
| :-- | :------ | :----: |
| Inline math   | `$x^2$`       | $x^2$         |
| Block math    | `$$x^2$$`     | (centered)    |
| Spacing       | `a \quad b`   | $a \quad b$   |
| Small space   | `a \, b`      | $a \, b$      |
| Text in math  | `\text{if}`   | $\text{if}$   |
| Dots (cdots)  | `x_1, \dots, x_n` | $x_1, \dots, x_n$ |
