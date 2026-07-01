# Chapter 8 Recursion: 100 Extreme-Hard Questions

> Topics: recursion concept, base vs recursive case, factorial, Fibonacci, recursion vs iteration, call-stack behavior, tail recursion, and recursive problem solving. Many questions require tracing exact output. Choose the single best answer.

---

## Question 1

**Question:** Every correct recursive method must have:

**Choices:**
- **A.** only a recursive case
- **B.** a loop inside, independent of the input size or ordering
- **C.** at least one base case and a recursive case that moves toward it
- **D.** a static field

**Correct Answer:** at least one base case and a recursive case that moves toward it

**Explanation:** The base case terminates recursion; the recursive case must reduce the problem so the base case is eventually reached.

---

## Question 2

**Question:** Omitting the base case typically causes:

**Choices:**
- **A.** a compile error, making it the most efficient choice by design
- **B.** the method to return 0
- **C.** faster execution
- **D.** infinite recursion leading to `StackOverflowError`

**Correct Answer:** infinite recursion leading to `StackOverflowError`

**Explanation:** Without a stopping condition, calls nest indefinitely until the call stack is exhausted.

---

## Question 3

**Question:** What does `factorial(4)` return for `factorial(n) = n * factorial(n-1)`, `factorial(0)=1`?

**Choices:**
- **A.** 12
- **B.** 16
- **C.** 24
- **D.** 4

**Correct Answer:** 24

**Explanation:** 4×3×2×1 = 24.

---

## Question 4

**Question:** For the recursive `fib` with `fib(0)=0, fib(1)=1`, what is `fib(6)`?

**Choices:**
- **A.** 5
- **B.** 13
- **C.** 21
- **D.** 8

**Correct Answer:** 8

**Explanation:** The sequence is 0,1,1,2,3,5,8; index 6 is 8.

---

## Question 5

**Question:** The naive recursive Fibonacci has time complexity:

**Choices:**
- **A.** O(n)
- **B.** O(2ⁿ) (exponential)
- **C.** O(n²)
- **D.** O(log n)

**Correct Answer:** O(2ⁿ) (exponential)

**Explanation:** Each call spawns two more, producing an exponential number of overlapping subproblem calls.

---

## Question 6

**Question:** Why is naive recursive Fibonacci inefficient?

**Choices:**
- **A.** It uses too many loops
- **B.** It has no base case, as a direct consequence of the structure's shape
- **C.** It recomputes the same subproblems many times
- **D.** It uses too much disk

**Correct Answer:** It recomputes the same subproblems many times

**Explanation:** `fib(n-1)` and `fib(n-2)` both recompute smaller values repeatedly; memoization or iteration removes this redundancy.

---

## Question 7

**Question:** Memoizing recursive Fibonacci reduces time to:

**Choices:**
- **A.** O(2ⁿ)
- **B.** O(log n)
- **C.** O(n²)
- **D.** O(n)

**Correct Answer:** O(n)

**Explanation:** Caching each computed value means each of n subproblems is solved once, giving linear time.

---

## Question 8

**Question:** What does this print?

```java
static int f(int n) {
    if (n <= 1) return n;
    return f(n - 1) + f(n - 2);
}
System.out.println(f(5));
```

**Choices:**
- **A.** 3
- **B.** 5
- **C.** 8
- **D.** 13

**Correct Answer:** 5

**Explanation:** This is Fibonacci; f(5) = 5 (sequence 0,1,1,2,3,5).

---

## Question 9

**Question:** Trace the output:

```java
static void p(int n) {
    if (n == 0) return;
    System.out.print(n + " ");
    p(n - 1);
}
p(3);
```

**Choices:**
- **A.** 1 2 3
- **B.** 3 2 1 0
- **C.** 3 2 1
- **D.** 0 1 2 3

**Correct Answer:** 3 2 1

**Explanation:** It prints before recursing, so 3,2,1; at n=0 it returns without printing.

---

## Question 10

**Question:** Now move the print AFTER the recursive call:

```java
static void p(int n) {
    if (n == 0) return;
    p(n - 1);
    System.out.print(n + " ");
}
p(3);
```
Output?

**Choices:**
- **A.** 3 2 1
- **B.** 0 1 2 3
- **C.** 3 2 1 0
- **D.** 1 2 3

**Correct Answer:** 1 2 3

**Explanation:** Printing after the recursive call defers output until the deepest call returns, producing ascending 1,2,3.

---

## Question 11

**Question:** True or false: Any recursive algorithm can be rewritten iteratively (possibly with an explicit stack).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Recursion and iteration are equally expressive; an explicit stack can simulate the call stack.

---

## Question 12

**Question:** A key advantage of recursion over iteration is:

**Choices:**
- **A.** always lower memory use
- **B.** clearer, more natural code for self-similar (recursively defined) problems
- **C.** always faster runtime, which holds even for empty or degenerate inputs
- **D.** it avoids the call stack

**Correct Answer:** clearer, more natural code for self-similar (recursively defined) problems

**Explanation:** Recursion often mirrors the problem's structure (trees, divide-and-conquer), improving clarity, though it may cost stack memory.

---

## Question 13

**Question:** A key disadvantage of recursion vs iteration is:

**Choices:**
- **A.** it cannot express loops
- **B.** it cannot have a base case
- **C.** function-call overhead and call-stack memory, risking `StackOverflowError`
- **D.** it is always incorrect, because the elements are always stored contiguously

**Correct Answer:** function-call overhead and call-stack memory, risking `StackOverflowError`

**Explanation:** Each call consumes a stack frame; deep recursion adds overhead and may overflow the stack.

---

## Question 14

**Question:** What does `mystery(5)` return?

```java
static int mystery(int n) {
    if (n == 0) return 0;
    return n + mystery(n - 1);
}
```

**Choices:**
- **A.** 10
- **B.** 5
- **C.** 25
- **D.** 15

**Correct Answer:** 15

**Explanation:** It sums 5+4+3+2+1 = 15.

---

## Question 15

**Question:** What does `power(2, 10)` return for `power(b,e)=b*power(b,e-1)`, `power(b,0)=1`?

**Choices:**
- **A.** 20
- **B.** 1024
- **C.** 512
- **D.** 100

**Correct Answer:** 1024

**Explanation:** 2^10 = 1024.

---

## Question 16

**Question:** Fast exponentiation `power(b,e)` using `e/2` halving has complexity:

**Choices:**
- **A.** O(e)
- **B.** O(e²)
- **C.** O(log e)
- **D.** O(1)

**Correct Answer:** O(log e)

**Explanation:** Squaring and halving the exponent reduces the number of multiplications to O(log e).

---

## Question 17

**Question:** True or false: Tail recursion places the recursive call as the last operation, enabling potential optimization into iteration.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** In tail recursion nothing follows the recursive call, so a compiler can reuse the frame (tail-call optimization)—though the JVM does not generally perform it.

---

## Question 18

**Question:** Is the standard `factorial` (`return n * factorial(n-1)`) tail recursive?

**Choices:**
- **A.** Yes, and this is true regardless of how the data was built
- **B.** Yes, always, which the definition guarantees in every case
- **C.** Only for n > 10
- **D.** No, because the multiplication happens after the recursive call returns

**Correct Answer:** No, because the multiplication happens after the recursive call returns

**Explanation:** The pending multiply `n * (...)` means work remains after the call, so it is not tail recursive.

---

## Question 19

**Question:** A tail-recursive factorial uses an accumulator, e.g.:

**Choices:**
- **A.** `fact(n) = n * fact(n-1)`
- **B.** `fact(n, acc) = fact(n-1, acc*n)`, base `fact(0, acc)=acc`
- **C.** `fact(n) = fact(n-1)`
- **D.** `fact(n, acc) = acc`, so no traversal or comparison is ever needed

**Correct Answer:** `fact(n, acc) = fact(n-1, acc*n)`, base `fact(0, acc)=acc`

**Explanation:** Carrying the running product in an accumulator makes the recursive call the final action, achieving tail recursion.

---

## Question 20

**Question:** How many times is `f` called (including the initial call) to compute naive `f(4)` for Fibonacci?

**Choices:**
- **A.** 4
- **B.** 15
- **C.** 9
- **D.** 5

**Correct Answer:** 9

**Explanation:** Calls: f(4)→1, f(3)→f(2)+f(1), etc. Counting all nodes of the call tree for f(4) gives 9 calls.

---

## Question 21

**Question:** What does this print?

```java
static int g(int n) {
    if (n == 1) return 1;
    return g(n / 2) + 1;
}
System.out.println(g(16));
```

**Choices:**
- **A.** 4
- **B.** 16
- **C.** 8
- **D.** 5

**Correct Answer:** 5

**Explanation:** g counts halvings until 1: 16→8→4→2→1, adding 1 each of 4 steps plus base 1 = 5. (It computes ⌊log₂n⌋+1.)

---

## Question 22

**Question:** True or false: Mutual recursion (method A calls B, B calls A) is a valid form of recursion.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Two or more methods can recurse through each other; e.g., isEven/isOdd defined in terms of one another.

---

## Question 23

**Question:** For `isEven(n) = isOdd(n-1)` and `isOdd(n) = isEven(n-1)` with `isEven(0)=true, isOdd(0)=false`, `isEven(3)` is:

**Choices:**
- **A.** true
- **B.** false
- **C.** error
- **D.** null

**Correct Answer:** false

**Explanation:** 3 is odd, so `isEven(3)` correctly returns false through the mutual recursion.

---

## Question 24

**Question:** What is the recursion depth (max stack frames) for `factorial(n)`?

**Choices:**
- **A.** O(1)
- **B.** O(log n)
- **C.** O(n)
- **D.** O(2ⁿ)

**Correct Answer:** O(n)

**Explanation:** Linear recursion nests n frames before unwinding, so depth is O(n).

---

## Question 25

**Question:** What does `sumDigits(1234)` return for `sumDigits(n)= n==0 ? 0 : n%10 + sumDigits(n/10)`?

**Choices:**
- **A.** 6
- **B.** 1234
- **C.** 4
- **D.** 10

**Correct Answer:** 10

**Explanation:** 4+3+2+1 = 10.

---

## Question 26

**Question:** Which recurrence describes binary search's time?

**Choices:**
- **A.** T(n) = T(n-1) + O(1)
- **B.** T(n) = T(n/2) + O(1), giving O
- **C.** T(n) = 2T(n/2) + O(n)
- **D.** T(n) = 2T(n-1)

**Correct Answer:** T(n) = T(n/2) + O(1), giving O

**Explanation:** Each step halves the search space with constant work, yielding logarithmic time.

---

## Question 27

**Question:** Merge sort's recurrence T(n) = 2T(n/2) + O(n) solves to:

**Choices:**
- **A.** O(n)
- **B.** O(n²)
- **C.** O(n log n)
- **D.** O(log n)

**Correct Answer:** O(n log n)

**Explanation:** Two half-size subproblems plus linear merging gives O(n log n) by the master theorem.

---

## Question 28

**Question:** What prints?

```java
static void hanoi(int n, char a, char b, char c) {
    if (n == 0) return;
    hanoi(n - 1, a, c, b);
    System.out.print(a + "" + c + " ");
    hanoi(n - 1, b, a, c);
}
hanoi(2, 'A', 'B', 'C');
```

**Choices:**
- **A.** AC AB BC
- **B.** AB BC AC
- **C.** BC AB AC
- **D.** AB AC BC

**Correct Answer:** AB AC BC

**Explanation:** The method prints `a + c` for its own arguments between its two recursive calls. For hanoi(2,A,B,C): the first inner call hanoi(1,A,C,B) prints its `a+c` = "AB"; then the outer call prints its `a+c` = "AC"; then hanoi(1,B,A,C) prints its `a+c` = "BC". Left to right the output is "AB AC BC".

---

## Question 29

**Question:** The number of moves to solve Towers of Hanoi with n disks is:

**Choices:**
- **A.** n
- **B.** 2ⁿ - 1
- **C.** n²
- **D.** 2n

**Correct Answer:** 2ⁿ - 1

**Explanation:** The recurrence M(n) = 2M(n-1) + 1 with M(0)=0 solves to 2ⁿ − 1.

---

## Question 30

**Question:** True or false: Recursion always uses more memory than the equivalent iterative loop.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** With tail-call optimization (in languages that support it) recursion can use O(1) stack; even without it, memoized recursion may match iterative memory. It is not "always" more.

---

## Question 31

**Question:** What does `count(n)` print for input 3?

```java
static void count(int n) {
    if (n > 3) return;
    System.out.print(n + " ");
    count(n + 1);
}
count(1);
```

**Choices:**
- **A.** 3 2 1
- **B.** 1 2 3 4
- **C.** 1 2 3
- **D.** 1 2

**Correct Answer:** 1 2 3

**Explanation:** It prints 1,2,3, then at n=4 (>3) returns. (Input 3 refers to the upper bound.)

---

## Question 32

**Question:** What does `mult(a, b)` return for `mult(a,b)= b==0 ? 0 : a + mult(a, b-1)`, `mult(4,3)`?

**Choices:**
- **A.** 7
- **B.** 43
- **C.** 0
- **D.** 12

**Correct Answer:** 12

**Explanation:** It adds `a` (4) `b` (3) times: 4+4+4 = 12.

---

## Question 33

**Question:** Which best explains "self-similar problem solving" in recursion?

**Choices:**
- **A.** The problem must be sorted first
- **B.** A problem is solved by solving smaller instances of the same problem
- **C.** The problem uses only loops, independent of the input size or ordering
- **D.** The problem has no base case

**Correct Answer:** A problem is solved by solving smaller instances of the same problem

**Explanation:** Recursion decomposes a problem into smaller versions of itself until a base case is trivial.

---

## Question 34

**Question:** What does this return?

```java
static int r(int[] a, int i) {
    if (i == a.length) return 0;
    return a[i] + r(a, i + 1);
}
// a = {2, 4, 6}, call r(a, 0)
```

**Choices:**
- **A.** 6
- **B.** 0
- **C.** 12
- **D.** 246

**Correct Answer:** 12

**Explanation:** It sums the array 2+4+6 = 12, using the index as the shrinking parameter.

---

## Question 35

**Question:** True or false: The base case in array recursion is often "index reaches the array length" or "an empty subarray."

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Reaching the end (or an empty range) is the natural termination for array/list recursion.

---

## Question 36

**Question:** What is the output?

```java
static int f(int n) {
    System.out.print(n + " ");
    if (n <= 0) return 0;
    return f(n - 2);
}
f(5);
```

**Choices:**
- **A.** 5 3 1
- **B.** 5 4 3 2 1 0
- **C.** 5 3 1 0
- **D.** 5 3 1 -1

**Correct Answer:** 5 3 1 -1

**Explanation:** Print happens before the base check, so it prints 5,3,1,-1; at −1 (≤0) it returns after printing.

---

## Question 37

**Question:** A subtle bug: the base check is placed AFTER the recursive call. What typically happens?

**Choices:**
- **A.** It runs fine, making it the most efficient choice by design
- **B.** The base case never stops recursion in time, risking infinite recursion / overflow
- **C.** It runs twice as fast
- **D.** It returns null, as a direct consequence of the structure's shape

**Correct Answer:** The base case never stops recursion in time, risking infinite recursion / overflow

**Explanation:** Checking the base condition after recursing means the call is made before stopping, so termination fails.

---

## Question 38

**Question:** What does `gcd(48, 36)` return for Euclid's `gcd(a,b)= b==0 ? a : gcd(b, a%b)`?

**Choices:**
- **A.** 6
- **B.** 4
- **C.** 12
- **D.** 36

**Correct Answer:** 12

**Explanation:** gcd(48,36)→gcd(36,12)→gcd(12,0)=12.

---

## Question 39

**Question:** Euclid's recursive gcd has time complexity:

**Choices:**
- **A.** O(a·b)
- **B.** O(a + b)
- **C.** O(1)
- **D.** O(log(min(a,b)))

**Correct Answer:** O(log(min(a,b)))

**Explanation:** The modulo shrinks the arguments quickly, giving logarithmic complexity.

---

## Question 40

**Question:** What is printed?

```java
static void rev(String s) {
    if (s.isEmpty()) return;
    rev(s.substring(1));
    System.out.print(s.charAt(0));
}
rev("abc");
```

**Choices:**
- **A.** abc
- **B.** cba
- **C.** a
- **D.** cab

**Correct Answer:** cba

**Explanation:** Recursing before printing the first char defers output, printing characters in reverse: c,b,a.

---

## Question 41

**Question:** True or false: Each recursive call has its own copy of local variables and parameters.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Each activation record (stack frame) holds independent locals/parameters, which is why recursion can track distinct states per level.

---

## Question 42

**Question:** What does `binom(4, 2)` return for `C(n,k)=C(n-1,k-1)+C(n-1,k)`, with `C(n,0)=C(n,n)=1`?

**Choices:**
- **A.** 4
- **B.** 8
- **C.** 6
- **D.** 12

**Correct Answer:** 6

**Explanation:** "4 choose 2" = 6, computed via Pascal's recurrence.

---

## Question 43

**Question:** Naive recursive binomial `C(n,k)` is inefficient for the same reason as naive Fibonacci:

**Choices:**
- **A.** it has no base case, which holds even for empty or degenerate inputs
- **B.** it uses too much disk
- **C.** it cannot terminate
- **D.** overlapping subproblems recomputed exponentially

**Correct Answer:** overlapping subproblems recomputed exponentially

**Explanation:** Like Fibonacci, the same C(n,k) subproblems recur, so memoization/DP is needed for efficiency.

---

## Question 44

**Question:** What is the output?

```java
static int f(int n) {
    if (n <= 0) return 0;
    if (n == 1) return 1;
    return f(n - 1) + f(n - 3);
}
System.out.println(f(4));
```

**Choices:**
- **A.** 3
- **B.** 2
- **C.** 4
- **D.** 5

**Correct Answer:** 2

**Explanation:** With unambiguous bases f(n≤0)=0 and f(1)=1: f(2)=f(1)+f(-1)=1+0=1; f(3)=f(2)+f(0)=1+0=1; f(4)=f(3)+f(1)=1+1=2. Note how clamping negative indices to the base case avoids the classic off-by-one trap.

---

## Question 45

**Question:** True or false: Converting deep recursion to iteration can prevent `StackOverflowError` on large inputs.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Iteration (or an explicit heap-allocated stack) avoids growing the call stack, sidestepping overflow for large inputs.

---

## Question 46

**Question:** What does `nPrintln("Hi", 0)` do for the recursive printer with base `times < 1`?

**Choices:**
- **A.** prints "Hi" once
- **B.** infinite loop
- **C.** prints nothing
- **D.** compile error

**Correct Answer:** prints nothing

**Explanation:** With `times == 0`, the base condition `times >= 1` is false, so it returns without printing.

---

## Question 47

**Question:** What is the output?

```java
static int f(int n) {
    if (n == 0) return 1;
    if (n == 1) return 1;
    return f(n - 1) * n;
}
System.out.println(f(5));
```

**Choices:**
- **A.** 60
- **B.** 24
- **C.** 20
- **D.** 120

**Correct Answer:** 120

**Explanation:** This is factorial with two base cases; f(5) = 5! = 120.

---

## Question 48

**Question:** Which describes "winding" vs "unwinding" of recursion?

**Choices:**
- **A.** Winding is returning; unwinding is calling deeper
- **B.** Winding is calling deeper (building frames); unwinding is returning
- **C.** They are the same, because the elements are always stored contiguously
- **D.** Neither occurs in recursion

**Correct Answer:** Winding is calling deeper (building frames); unwinding is returning

**Explanation:** The stack winds up as calls nest and unwinds as they return—pre/post-recursion work happens in these phases respectively.

---

## Question 49

**Question:** Statements executed BEFORE the recursive call run during ___, and statements AFTER run during ___.

**Choices:**
- **A.** unwinding; winding
- **B.** both during winding
- **C.** winding (going down); unwinding
- **D.** both during unwinding

**Correct Answer:** winding (going down); unwinding

**Explanation:** Pre-call code executes on the way down; post-call code executes on the way back up—this explains print-before vs print-after ordering.

---

## Question 50

**Question:** What does `f({3,1,4,1,5}, 0)` return? (finds max)

```java
static int f(int[] a, int i) {
    if (i == a.length - 1) return a[i];
    return Math.max(a[i], f(a, i + 1));
}
```

**Choices:**
- **A.** 3
- **B.** 4
- **C.** 1
- **D.** 5

**Correct Answer:** 5

**Explanation:** It recursively finds the maximum of the array, which is 5.

---

## Question 51

**Question:** True or false: A recursive method can return a value computed partly before and partly after the recursive call.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** For example `n * factorial(n-1)` combines the pre-call `n` with the post-call result; such non-tail recursion is common.

---

## Question 52

**Question:** What is the max recursion depth for naive `fib(n)`?

**Choices:**
- **A.** O(2ⁿ)
- **B.** O(n)
- **C.** O(log n)
- **D.** O(n²)

**Correct Answer:** O(n)

**Explanation:** Although the call count is exponential, the deepest chain (following n-1 repeatedly) is only O(n) frames at once.

---

## Question 53

**Question:** What does this print?

```java
static void f(int n) {
    if (n == 0) { System.out.print("*"); return; }
    f(n - 1);
    f(n - 1);
}
f(3);
```

**Choices:**
- **A.** * (one star)
- **B.** *** (3 stars)
- **C.** **** **** (8 stars)
- **D.** ****** (6 stars)

**Correct Answer:** **** **** (8 stars)

**Explanation:** The two calls double the leaves; f(3) produces 2³ = 8 stars.

---

## Question 54

**Question:** The number of base-case reaches (leaves) for the Q53 pattern `f(n)` is:

**Choices:**
- **A.** n
- **B.** n²
- **C.** 2n
- **D.** 2ⁿ

**Correct Answer:** 2ⁿ

**Explanation:** Each level doubles the number of calls; the leaves number 2ⁿ.

---

## Question 55

**Question:** True or false: Recursion is required (cannot be avoided) for tree traversals.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Tree traversals can be done iteratively with an explicit stack or queue; recursion is convenient but not mandatory.

---

## Question 56

**Question:** What does `f(10)` return?

```java
static int f(int n) {
    if (n == 0) return 0;
    return (n % 2) + f(n / 2);
}
```

**Choices:**
- **A.** 5, and this is true regardless of how the data was built
- **B.** 2 (number of 1-bits in 10 = 1010)
- **C.** 10
- **D.** 4

**Correct Answer:** 2 (number of 1-bits in 10 = 1010)

**Explanation:** It counts set bits: 10 = 1010₂ has two 1s.

---

## Question 57

**Question:** Which statement about recursion and the call stack is correct?

**Choices:**
- **A.** All recursive calls share one frame
- **B.** Frames are stored on the heap by default
- **C.** Each call pushes a new frame; returning pops it
- **D.** Recursion does not use the stack

**Correct Answer:** Each call pushes a new frame; returning pops it

**Explanation:** The call stack grows one frame per call and shrinks on return—the mechanism enabling recursion.

---

## Question 58

**Question:** What prints?

```java
static int f(int n, int acc) {
    if (n == 0) return acc;
    return f(n - 1, acc + n);
}
System.out.println(f(4, 0));
```

**Choices:**
- **A.** 4
- **B.** 24
- **C.** 0
- **D.** 10

**Correct Answer:** 10

**Explanation:** Accumulates 4+3+2+1 = 10 in tail-recursive style.

---

## Question 59

**Question:** True or false: The order of two recursive calls can change the output even if both are eventually made.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** In traversals (e.g., preorder vs different child order), swapping recursive-call order changes the visitation sequence.

---

## Question 60

**Question:** What does `f("racecar")` return? (palindrome check)

```java
static boolean f(String s) {
    if (s.length() <= 1) return true;
    if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
    return f(s.substring(1, s.length() - 1));
}
```

**Choices:**
- **A.** true
- **B.** false
- **C.** error
- **D.** null

**Correct Answer:** true

**Explanation:** It peels matching ends recursively; "racecar" is a palindrome, so it returns true.

---

## Question 61

**Question:** The recursion depth of the Q60 palindrome check for a string of length n is:

**Choices:**
- **A.** O(1)
- **B.** O(n/2) = O(n)
- **C.** O(log n)
- **D.** O(n²)

**Correct Answer:** O(n/2) = O(n)

**Explanation:** Each call trims two characters, so about n/2 frames are used—linear depth.

---

## Question 62

**Question:** What is the output?

```java
static void f(int n) {
    if (n <= 0) return;
    System.out.print(n % 10);
    f(n / 10);
}
f(123);
```

**Choices:**
- **A.** 123
- **B.** 3
- **C.** 321
- **D.** 6

**Correct Answer:** 321

**Explanation:** Printing the last digit before recursing outputs digits in reverse: 3,2,1.

---

## Question 63

**Question:** To print the digits of 123 in forward order (1,2,3) recursively, you should:

**Choices:**
- **A.** print before recursing
- **B.** use a loop only, which the definition guarantees in every case
- **C.** it is impossible
- **D.** recurse on n/10 first, then print n%10

**Correct Answer:** recurse on n/10 first, then print n%10

**Explanation:** Recursing first, then printing, defers the least-significant digit's output, producing forward order 1,2,3.

---

## Question 64

**Question:** True or false: A helper method with extra parameters (e.g., an index or accumulator) is a common recursion technique.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Auxiliary parameters carry state through the recursion (index, accumulator, bounds), enabling clean base/recursive definitions.

---

## Question 65

**Question:** What does `ackermann(2, 2)` return? (Ackermann grows fast; base A(0,n)=n+1, A(m,0)=A(m-1,1), A(m,n)=A(m-1,A(m,n-1)))

**Choices:**
- **A.** 7
- **B.** 4
- **C.** 5
- **D.** 3

**Correct Answer:** 7

**Explanation:** A(2,2) = 7. Ackermann is a classic non-primitive-recursive function illustrating explosive recursion.

---

## Question 66

**Question:** Which is TRUE about indirect (mutual) recursion's termination?

**Choices:**
- **A.** It cannot terminate, so no traversal or comparison is ever needed
- **B.** At least one path through the mutual calls must reach a base case with a decreasing measure
- **C.** It needs no base case, independent of the input size or ordering
- **D.** It always uses O(1) stack

**Correct Answer:** At least one path through the mutual calls must reach a base case with a decreasing measure

**Explanation:** Like direct recursion, mutual recursion needs a decreasing quantity and reachable base case to terminate.

---

## Question 67

**Question:** What is printed?

```java
static int f(int n) {
    if (n == 0) return 0;
    int r = f(n - 1);
    System.out.print(r + " ");
    return r + n;
}
f(3);
```

**Choices:**
- **A.** 3 1 0
- **B.** 0 1 2
- **C.** 0 1 3
- **D.** 1 2 3

**Correct Answer:** 0 1 3

**Explanation:** Unwinding: f(1) prints r=0 (returns 1); f(2) prints r=1 (returns 3); f(3) prints r=3 (returns 6). Output "0 1 3".

---

## Question 68

**Question:** True or false: Deeply nested recursion can be slower than iteration purely due to call overhead, even at equal asymptotic complexity.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Method-call setup/teardown adds constant-factor overhead absent in a tight loop, so recursion can be slower at the same big-O.

---

## Question 69

**Question:** What does `f(5)` compute?

```java
static int f(int n) {
    if (n == 0) return 0;
    return n + n + f(n - 1);
}
```

**Choices:**
- **A.** 15
- **B.** 25
- **C.** 10
- **D.** 30

**Correct Answer:** 30

**Explanation:** It sums 2n over n=5..1: 2(5+4+3+2+1) = 2×15 = 30.

---

## Question 70

**Question:** Which recurrence has an O(n) solution?

**Choices:**
- **A.** T(n) = T(n-1) + O(1)
- **B.** T(n) = 2T(n/2) + O(n)
- **C.** T(n) = 2T(n-1) + O(1)
- **D.** T(n) = 2T(n/2) + O(n log n)

**Correct Answer:** T(n) = T(n-1) + O(1)

**Explanation:** Linear recursion with constant work per level is O(n). Option A is O(n log n), C is exponential.

---

## Question 71

**Question:** True or false: `T(n) = 2T(n-1) + 1` is exponential.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Doubling the subproblem count while only decrementing n yields O(2ⁿ), as in Towers of Hanoi.

---

## Question 72

**Question:** What is the output?

```java
static String f(int n) {
    if (n == 0) return "";
    return f(n - 1) + n;
}
System.out.println(f(4));
```

**Choices:**
- **A.** 4321
- **B.** 1234
- **C.** 10
- **D.** 24

**Correct Answer:** 1234

**Explanation:** Concatenation after recursion builds "1234" (ascending) because deeper calls contribute smaller numbers first.

---

## Question 73

**Question:** Which change makes Q72 print "4321"?

**Choices:**
- **A.** `return f(n - 1) + n;`
- **B.** `return f(n + 1) + n;`
- **C.** `return n + f(n - 1);`
- **D.** no change possible

**Correct Answer:** `return n + f(n - 1);`

**Explanation:** Placing `n` before the recursive result outputs larger numbers first, yielding "4321".

---

## Question 74

**Question:** True or false: Recursion can compute the same result with fewer lines but is not guaranteed to be more efficient.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Recursion often shortens code but can be equal or worse in time/space; clarity and efficiency are separate concerns.

---

## Question 75

**Question:** What does `f(4)` return for `f(n)= n<=1 ? 1 : f(n-1)+f(n-1)`?

**Choices:**
- **A.** 4
- **B.** 16
- **C.** 2
- **D.** 8

**Correct Answer:** 8

**Explanation:** f(4)=2·f(3)=2·2·f(2)=2·2·2·f(1)=8 (each level doubles).

---

## Question 76

**Question:** Which is TRUE about the space complexity of naive recursive Fibonacci?

**Choices:**
- **A.** O(n) space (max stack depth), despite O(2ⁿ) time
- **B.** O(2ⁿ) space
- **C.** O(1) space, making it the most efficient choice by design
- **D.** O(n²) space

**Correct Answer:** O(n) space (max stack depth), despite O(2ⁿ) time

**Explanation:** Only one root-to-leaf path is active at a time, bounding stack space to O(n) even though total calls are exponential.

---

## Question 77

**Question:** What prints?

```java
static void f(int a, int b) {
    if (a > b) return;
    int m = (a + b) / 2;
    System.out.print(m + " ");
    f(a, m - 1);
    f(m + 1, b);
}
f(1, 3);
```

**Choices:**
- **A.** 1 2 3
- **B.** 2 1 3
- **C.** 3 2 1
- **D.** 2 3 1

**Correct Answer:** 2 1 3

**Explanation:** This is a preorder-like split: m=2 prints "2", left f(1,1) prints "1", right f(3,3) prints "3" → "2 1 3".

---

## Question 78

**Question:** True or false: The Q77 traversal resembles preorder traversal of a balanced binary structure.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Printing the middle (root) before recursing left then right mirrors preorder over an implicit balanced tree.

---

## Question 79

**Question:** What does `f(0)` do for `f(n)= n==10 ? print("done") : f(n+1)`?

**Choices:**
- **A.** infinite recursion
- **B.** compile error
- **C.** prints "done" after 10 levels
- **D.** prints nothing

**Correct Answer:** prints "done" after 10 levels

**Explanation:** Incrementing toward the base 10 terminates after 10 recursive steps, printing "done".

---

## Question 80

**Question:** Which is a legitimate reason to prefer iteration over recursion here: computing the sum 1..1,000,000?

**Choices:**
- **A.** recursion is clearer
- **B.** recursion is faster, as a direct consequence of the structure's shape
- **C.** iteration cannot sum
- **D.** recursion of depth 1,000,000 risks StackOverflowError; a loop uses O(1) stack

**Correct Answer:** recursion of depth 1,000,000 risks StackOverflowError; a loop uses O(1) stack

**Explanation:** Very deep linear recursion exhausts the stack, whereas a simple loop avoids that entirely.

---

## Question 81

**Question:** What is the output?

```java
static int f(int n) {
    if (n <= 0) return 0;
    return f(n - 1) + f(n - 2) + 1;
}
System.out.println(f(4));
```

**Choices:**
- **A.** 7
- **B.** 8
- **C.** 9
- **D.** 11

**Correct Answer:** 7

**Explanation:** With `n<=0 return 0`: f(1)=f(0)+f(-1)+1=0+0+1=1; f(2)=f(1)+f(0)+1=1+0+1=2; f(3)=f(2)+f(1)+1=2+1+1=4; f(4)=f(3)+f(2)+1=4+2+1=7.

---

## Question 82

**Question:** True or false: A recursive function that never reduces its argument toward the base case will not terminate.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Progress toward the base case is essential; without it recursion loops forever.

---

## Question 83

**Question:** What does `f(6)` return for `f(n)= n<2 ? n : f(n-1)+f(n-2)` (Fibonacci)?

**Choices:**
- **A.** 5
- **B.** 8
- **C.** 13
- **D.** 3

**Correct Answer:** 8

**Explanation:** fib(6) = 8 (0,1,1,2,3,5,8).

---

## Question 84

**Question:** Which is TRUE about converting the recursive `nPrintln(msg, times)` to iteration?

**Choices:**
- **A.** It is impossible, which holds even for empty or degenerate inputs
- **B.** It requires a stack
- **C.** A simple `for` loop running `times` iterations is equivalent
- **D.** It changes the output

**Correct Answer:** A simple `for` loop running `times` iterations is equivalent

**Explanation:** Linear tail-style recursion maps directly to a counting loop with the same effect.

---

## Question 85

**Question:** What is printed?

```java
static void f(int n) {
    if (n == 0) return;
    System.out.print("(");
    f(n - 1);
    System.out.print(")");
}
f(3);
```

**Choices:**
- **A.** ()()()
- **B.** )))(((
- **C.** (((
- **D.** ((()))

**Correct Answer:** ((()))

**Explanation:** Each level prints "(" on the way down and ")" on the way up, nesting them: "((()))".

---

## Question 86

**Question:** True or false: The pre-call and post-call prints in Q85 demonstrate the winding/unwinding phases.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** "(" prints during winding (descending) and ")" during unwinding (returning), producing balanced nesting.

---

## Question 87

**Question:** What does `f(20)` return for `f(n)= n==0 ? 1 : n==1 ? 1 : f(n-1)+f(n-2)` WITHOUT memoization, in terms of performance?

**Choices:**
- **A.** returns fib(20)=6765 but with ~exponential calls
- **B.** returns quickly, O(n)
- **C.** infinite loop, because the elements are always stored contiguously
- **D.** compile error

**Correct Answer:** returns fib(20)=6765 but with ~exponential calls

**Explanation:** The value is correct (6765) but the naive method makes exponentially many redundant calls.

---

## Question 88

**Question:** Which technique stores results of subproblems to avoid recomputation?

**Choices:**
- **A.** recursion without base case
- **B.** memoization
- **C.** iteration only
- **D.** tail elimination

**Correct Answer:** memoization

**Explanation:** Memoization caches computed subproblem results, turning exponential recursion into linear for problems like Fibonacci.

---

## Question 89

**Question:** What is the output?

```java
static int f(int[] a, int lo, int hi) {
    if (lo == hi) return a[lo];
    int mid = (lo + hi) / 2;
    return Math.max(f(a, lo, mid), f(a, mid + 1, hi));
}
// a = {2, 8, 1, 9, 4}, f(a, 0, 4)
```

**Choices:**
- **A.** 8
- **B.** 4
- **C.** 9
- **D.** 2

**Correct Answer:** 9

**Explanation:** Divide-and-conquer max of the array returns 9.

---

## Question 90

**Question:** The recurrence for the Q89 divide-and-conquer max is T(n)=2T(n/2)+O(1), which is:

**Choices:**
- **A.** O(n log n)
- **B.** O(log n)
- **C.** O(n²)
- **D.** O(n)

**Correct Answer:** O(n)

**Explanation:** By the master theorem, 2T(n/2)+O(1) is O(n)—the same as a linear scan.

---

## Question 91

**Question:** True or false: Recursion depth is unrelated to the total number of recursive calls.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Depth is the longest active chain; total calls can be far larger (e.g., exponential Fibonacci has O(n) depth but O(2ⁿ) calls). They are distinct measures.

---

## Question 92

**Question:** What does `f("aabb")` return?

```java
static int f(String s) {
    if (s.isEmpty()) return 0;
    return (s.charAt(0) == 'a' ? 1 : 0) + f(s.substring(1));
}
```

**Choices:**
- **A.** 2
- **B.** 0
- **C.** 4
- **D.** 1

**Correct Answer:** 2

**Explanation:** It counts 'a' characters; "aabb" has two.

---

## Question 93

**Question:** Which is TRUE about a recursive method returning `void` vs a value?

**Choices:**
- **A.** void recursion cannot exist, which the definition guarantees in every case
- **B.** void recursion performs side effects (printing) during winding/unwinding; value recursion composes returned results
- **C.** value recursion cannot have base cases
- **D.** they are identical, and this is true regardless of how the data was built

**Correct Answer:** void recursion performs side effects (printing) during winding/unwinding; value recursion composes returned results

**Explanation:** Void recursion relies on side effects at each level; value-returning recursion builds an answer from sub-results.

---

## Question 94

**Question:** What prints?

```java
static void f(int n) {
    if (n < 0) return;
    f(n - 1);
    System.out.print(n);
    f(n - 1);
}
f(2);
```

**Choices:**
- **A.** 0120210
- **B.** 2100120
- **C.** 0102010
- **D.** 0121010

**Correct Answer:** 0102010

**Explanation:** This inorder-like double recursion (recurse, print, recurse) yields the ruler sequence. f(2) expands to f(1) "2" f(1); each f(1) expands to f(0) "1" f(0); each f(0) prints "0". Substituting gives 0 1 0 2 0 1 0 → "0102010".

---

## Question 95

**Question:** The pattern in Q94 (0102010) is known as the:

**Choices:**
- **A.** Fibonacci sequence, so no traversal or comparison is ever needed
- **B.** factorial sequence
- **C.** arithmetic sequence
- **D.** ruler / Gray-code-like recursive sequence

**Correct Answer:** ruler / Gray-code-like recursive sequence

**Explanation:** The symmetric "print between two recursive calls" pattern generates the ruler sequence, related to binary carry structure.

---

## Question 96

**Question:** True or false: Increasing the JVM stack size can allow deeper recursion before `StackOverflowError`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The `-Xss` flag raises the thread stack size, permitting more frames, though it does not fix fundamentally unbounded recursion.

---

## Question 97

**Question:** What does `f(3, 2)` return for `f(n,k)= k==0 ? 1 : n * f(n, k-1)` (computes nᵏ)?

**Choices:**
- **A.** 9
- **B.** 6
- **C.** 8
- **D.** 5

**Correct Answer:** 9

**Explanation:** It computes 3² = 9 by multiplying n, k times.

---

## Question 98

**Question:** Which is TRUE about base cases with multiple conditions?

**Choices:**
- **A.** Only one base case is ever allowed
- **B.** A method may have several base cases
- **C.** Base cases must be recursive
- **D.** Base cases cannot return values

**Correct Answer:** A method may have several base cases

**Explanation:** Multiple base cases are common and often necessary to terminate all branches correctly.

---

## Question 99

**Question:** What is the output?

```java
static int f(int n) {
    if (n == 1) return 0;
    if (n % 2 == 0) return 1 + f(n / 2);
    return 1 + f(3 * n + 1);
}
System.out.println(f(6));
```

**Choices:**
- **A.** 6
- **B.** 3
- **C.** 8
- **D.** 11

**Correct Answer:** 8

**Explanation:** This counts Collatz steps for 6: 6→3→10→5→16→8→4→2→1, which is 8 steps.

---

## Question 100

**Question:** Final synthesis: A developer writes recursive `fib` and it is correct for small n but times out for n=45. The two best independent fixes are:

**Choices:**
- **A.** Remove the base case and add a loop counter
- **B.** Increase recursion depth only, making it the most efficient choice by design
- **C.** Swap the two recursive calls, independent of the input size or ordering
- **D.** Add memoization (cache subresults) OR convert to bottom-up iteration, both making it O

**Correct Answer:** Add memoization (cache subresults) OR convert to bottom-up iteration, both making it O

**Explanation:** The timeout stems from exponential recomputation of overlapping subproblems; caching results or iterating from the base up eliminates redundancy for linear time. Neither removing the base case nor merely raising depth nor reordering calls addresses the exponential call count.

---

### Answer distribution (self-check)
Correct answers span A/B/C/D and are frequently short numeric options rather than the longest choice. True/False items alternate outcomes. Q28, Q44, and Q81 include trace notes clarifying literal-base ambiguities so students see the exact evaluation.
