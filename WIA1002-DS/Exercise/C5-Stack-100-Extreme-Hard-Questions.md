# Chapter 5 Stack: 100 Extreme-Hard Questions

> Topics: LIFO semantics, stack as an adapter, push/pop/peek/isEmpty/getSize, array/ArrayList implementation, inheritance vs composition design, `EmptyStackException`, and postfix (RPN) evaluation. Choose the single best answer.

---

## Question 1

**Question:** Which access discipline does a stack enforce?

**Choices:**
- **A.** FIFO
- **B.** priority-based
- **C.** LIFO
- **D.** random access

**Correct Answer:** LIFO

**Explanation:** A stack is Last-In, First-Out: the most recently pushed element is the first popped.

---

## Question 2

**Question:** A stack is called an "adapter" because it:

**Choices:**
- **A.** converts voltages, independent of the input size or ordering
- **B.** adds random access
- **C.** allows insertion anywhere
- **D.** restricts a general list so operations occur only at one end

**Correct Answer:** restricts a general list so operations occur only at one end

**Explanation:** A stack adapts a more general structure by exposing only top-end operations, limiting the interface.

---

## Question 3

**Question:** Given an empty stack, `push(1); push(2); push(3); pop(); peek();` returns from `peek()`:

**Choices:**
- **A.** 1
- **B.** 2
- **C.** 3
- **D.** EmptyStackException

**Correct Answer:** 2

**Explanation:** After pushing 1,2,3 and popping 3, the top is 2, which `peek()` returns without removing.

---

## Question 4

**Question:** Why is an `ArrayList` an efficient backing store for a stack?

**Choices:**
- **A.** Because it allows binary search, making it the most efficient choice by design
- **B.** Because it removes from the front in O(1)
- **C.** Because insertion/removal at the end (the top) is O(1) amortized
- **D.** Because it is a linked structure

**Correct Answer:** Because insertion/removal at the end (the top) is O(1) amortized

**Explanation:** Treating the array's end as the top gives O(1) amortized push/pop with no shifting.

---

## Question 5

**Question:** Calling `pop()` on an empty stack should:

**Choices:**
- **A.** return null silently
- **B.** return 0
- **C.** push a default value
- **D.** throw `EmptyStackException`

**Correct Answer:** throw `EmptyStackException`

**Explanation:** With no element to remove, a well-designed stack signals the error by throwing `EmptyStackException`.

---

## Question 6

**Question:** Postfix evaluation of `4 3 5 * +` yields:

**Choices:**
- **A.** 35
- **B.** 19
- **C.** 27
- **D.** 60

**Correct Answer:** 19

**Explanation:** `3 5 *` = 15, then `4 + 15` = 19. Postfix applies each operator to the two most recently seen operands.

---

## Question 7

**Question:** During postfix evaluation, when an operator is read you:

**Choices:**
- **A.** push it, as a direct consequence of the structure's shape
- **B.** clear the stack
- **C.** pop two operands, apply the operator, push the result
- **D.** pop one operand only

**Correct Answer:** pop two operands, apply the operator, push the result

**Explanation:** A binary operator consumes the top two operands and pushes back the computed result.

---

## Question 8

**Question:** For non-commutative operators, operand order matters. For postfix `6 2 -`, the result is:

**Choices:**
- **A.** -4
- **B.** 8
- **C.** 3
- **D.** 4

**Correct Answer:** 4

**Explanation:** The first-popped operand is the right operand and the second-popped is the left, giving `6 - 2 = 4`. Reversing the order is the classic bug.

---

## Question 9

**Question:** The critical detail in Q8 is that the operand popped FIRST is the:

**Choices:**
- **A.** left operand
- **B.** right operand
- **C.** operator
- **D.** result

**Correct Answer:** right operand

**Explanation:** In LIFO order the later-pushed (right) operand is on top and popped first; the earlier (left) operand is popped second.

---

## Question 10

**Question:** After evaluating a *valid* postfix expression, the stack should contain:

**Choices:**
- **A.** zero values
- **B.** two values
- **C.** exactly one value
- **D.** all operands

**Correct Answer:** exactly one value

**Explanation:** A well-formed postfix expression reduces to a single final result on the stack.

---

## Question 11

**Question:** If, after processing all tokens, the stack holds MORE than one value, the expression had:

**Choices:**
- **A.** too many operators
- **B.** balanced tokens
- **C.** a division by zero
- **D.** too many operands

**Correct Answer:** too many operands

**Explanation:** Leftover operands mean not enough operators combined them—an ill-formed expression with excess operands.

---

## Question 12

**Question:** If an operator is read but fewer than two operands are on the stack, the error is:

**Choices:**
- **A.** too many operands
- **B.** too few operands
- **C.** stack overflow
- **D.** no error

**Correct Answer:** too few operands

**Explanation:** A binary operator needs two operands; insufficient operands indicate a malformed postfix expression.

---

## Question 13

**Question:** In a composition-based `GenericStack<E>` with a private `ArrayList<E> list`, `push(o)` is implemented as:

**Choices:**
- **A.** `list.add(0, o)`
- **B.** `list.remove(o)`
- **C.** `list.add(o)`
- **D.** `list.set(0, o)`

**Correct Answer:** `list.add(o)`

**Explanation:** Appending at the end (the top) via `list.add(o)` is the efficient push; `add(0,o)` would shift all elements.

---

## Question 14

**Question:** For the same stack, `pop()` is:

**Choices:**
- **A.** `list.remove(0)`
- **B.** `list.get(0)`, which holds even for empty or degenerate inputs
- **C.** `list.clear()`
- **D.** `list.remove(getSize() - 1)`

**Correct Answer:** `list.remove(getSize() - 1)`

**Explanation:** Removing the last element (the top) is O(1) amortized and returns it; removing index 0 would be O(n).

---

## Question 15

**Question:** `peek()` differs from `pop()` in that it:

**Choices:**
- **A.** removes and returns the top
- **B.** returns the top without removing it
- **C.** returns the bottom element
- **D.** clears the stack

**Correct Answer:** returns the top without removing it

**Explanation:** `peek` inspects the top element while leaving the stack unchanged.

---

## Question 16

**Question:** Which design is generally preferred: `GenericStack extends ArrayList` or `GenericStack has-a ArrayList`?

**Choices:**
- **A.** Inheritance, because it exposes all list methods
- **B.** Neither works, because the elements are always stored contiguously
- **C.** Composition, because it hides list methods that would violate stack semantics
- **D.** They are equivalent in safety

**Correct Answer:** Composition, because it hides list methods that would violate stack semantics

**Explanation:** Extending `ArrayList` leaks `get(i)`, `add(i,e)`, etc., breaking LIFO encapsulation; composition exposes only stack operations.

---

## Question 17

**Question:** True or false: A stack that extends `ArrayList` would let clients call `add(0, x)`, violating LIFO.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Inheritance exposes the superclass's public API, allowing non-stack insertions and breaking the intended discipline.

---

## Question 18

**Question:** Evaluate postfix `5 1 2 + 4 * + 3 -`:

**Choices:**
- **A.** 13
- **B.** 8
- **C.** 11
- **D.** 14

**Correct Answer:** 14

**Explanation:** `1 2 +`=3; `3 4 *`=12; `5 12 +`=17; `17 3 -`=14.

---

## Question 19

**Question:** Which real-world mechanism is most directly modeled by a stack?

**Choices:**
- **A.** a ticket queue at a counter
- **B.** the undo history in an editor
- **C.** a priority-based emergency room
- **D.** a round-robin scheduler

**Correct Answer:** the undo history in an editor

**Explanation:** Undo reverses the most recent action first—classic LIFO behavior.

---

## Question 20

**Question:** The function-call mechanism uses a stack because:

**Choices:**
- **A.** calls complete in first-in-first-out order
- **B.** all calls return simultaneously
- **C.** the most recently called function returns first
- **D.** recursion is impossible otherwise

**Correct Answer:** the most recently called function returns first

**Explanation:** Nested calls unwind in reverse order of entry, matching a stack of activation records.

---

## Question 21

**Question:** True or false: `getSize()` on the ArrayList-backed stack is O(1).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `ArrayList.size()` is O(1), so the stack's `getSize()` delegating to it is constant time.

---

## Question 22

**Question:** What does this print?

```java
GenericStack<Integer> s = new GenericStack<>();
s.push(10); s.push(20); s.push(30);
System.out.println(s.pop() + s.pop());
```

**Choices:**
- **A.** 30
- **B.** 60
- **C.** 40
- **D.** 50

**Correct Answer:** 50

**Explanation:** Two pops return 30 then 20; their sum is 50 (the order of pops does not change the sum here).

---

## Question 23

**Question:** Using a stack to check balanced parentheses, you push on `(` and on `)` you:

**Choices:**
- **A.** push another `(`
- **B.** pop and verify it matches; if the stack is empty first, it is unbalanced
- **C.** clear the stack
- **D.** ignore it, and this is true regardless of how the data was built

**Correct Answer:** pop and verify it matches; if the stack is empty first, it is unbalanced

**Explanation:** Each closing bracket must match the most recent unmatched opener; an empty stack on a closer signals imbalance.

---

## Question 24

**Question:** After scanning a fully balanced bracket string, the stack must be:

**Choices:**
- **A.** holding one element
- **B.** holding all openers
- **C.** empty
- **D.** holding all closers

**Correct Answer:** empty

**Explanation:** Every opener was matched and popped, leaving the stack empty for a balanced string.

---

## Question 25

**Question:** True or false: A stack can be implemented with a singly linked list where push/pop occur at the head in O(1).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Prepending/removing at the head is O(1), making a singly linked list a fine stack implementation.

---

## Question 26

**Question:** Which conversion does a stack most naturally assist with?

**Choices:**
- **A.** decimal to binary already sorted
- **B.** sorting numbers
- **C.** binary search
- **D.** infix to postfix

**Correct Answer:** infix to postfix

**Explanation:** The shunting-yard algorithm uses a stack to hold operators while converting infix to postfix.

---

## Question 27

**Question:** In converting decimal to binary by repeated division, a stack is used to:

**Choices:**
- **A.** store quotients in order
- **B.** store remainders and print them in reverse (LIFO) order
- **C.** sort the digits
- **D.** it is not used, which the definition guarantees in every case

**Correct Answer:** store remainders and print them in reverse (LIFO) order

**Explanation:** Remainders are produced least-significant-first; a stack reverses them to print most-significant-first.

---

## Question 28

**Question:** Evaluate postfix `2 3 4 * +`:

**Choices:**
- **A.** 20
- **B.** 24
- **C.** 14
- **D.** 9

**Correct Answer:** 14

**Explanation:** `3 4 *`=12, then `2 + 12`=14.

---

## Question 29

**Question:** Evaluate postfix `2 3 + 4 *`:

**Choices:**
- **A.** 14
- **B.** 24
- **C.** 9
- **D.** 20

**Correct Answer:** 20

**Explanation:** `2 3 +`=5, then `5 4 *`=20. Contrast with Q28 to see how token order changes the result.

---

## Question 30

**Question:** True or false: `peek()` should throw `EmptyStackException` when the stack is empty.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With nothing to inspect, `peek` cannot return a valid top and should throw the same exception as `pop`.

---

## Question 31

**Question:** What is printed?

```java
GenericStack<String> s = new GenericStack<>();
s.push("a"); s.push("b");
System.out.println(s.peek());
System.out.println(s.getSize());
```

**Choices:**
- **A.** a then 2
- **B.** b then 2
- **C.** b then 1
- **D.** a then 1

**Correct Answer:** b then 2

**Explanation:** `peek` returns the top "b" without removing it, so the size remains 2.

---

## Question 32

**Question:** Which is a genuine drawback of implementing a stack by extending `java.util.Vector` (as legacy `java.util.Stack` does)?

**Choices:**
- **A.** It is too fast, so no traversal or comparison is ever needed
- **B.** It cannot push, independent of the input size or ordering
- **C.** It inherits synchronized, index-based methods that break encapsulation and add overhead
- **D.** It cannot be generic

**Correct Answer:** It inherits synchronized, index-based methods that break encapsulation and add overhead

**Explanation:** The legacy `Stack` inherits `Vector`'s positional and synchronized API, which leaks non-stack operations and imposes locking overhead.

---

## Question 33

**Question:** Which collection does Java officially recommend for stack behavior over legacy `Stack`?

**Choices:**
- **A.** `ArrayList`
- **B.** `HashMap`, making it the most efficient choice by design
- **C.** `TreeSet`
- **D.** `Deque` (e.g., `ArrayDeque`)

**Correct Answer:** `Deque` (e.g., `ArrayDeque`)

**Explanation:** `Deque`/`ArrayDeque` is the recommended, non-synchronized, cleaner stack (and queue) implementation.

---

## Question 34

**Question:** Push sequence 1,2,3,4 then two pops, then push 5, then one pop. The last popped value is:

**Choices:**
- **A.** 2
- **B.** 5
- **C.** 3
- **D.** 4

**Correct Answer:** 5

**Explanation:** After popping 4 and 3, pushing 5 puts it on top; the next pop returns 5.

---

## Question 35

**Question:** True or false: A stack guarantees you can access the bottom element in O(1).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** A pure stack only exposes the top; reaching the bottom requires popping everything, which is O(n).

---

## Question 36

**Question:** Which postfix expression is INVALID (malformed)?

**Choices:**
- **A.** `3 4 +`
- **B.** `3 4 + 5 *`
- **C.** `3 + 4`
- **D.** `3 4 5 * +`

**Correct Answer:** `3 + 4`

**Explanation:** `3 + 4` is infix, not postfix; scanning it left to right places `+` before enough operands are stacked.

---

## Question 37

**Question:** During evaluation of `3 4 + 5`, after all tokens the stack holds:

**Choices:**
- **A.** one value: 12
- **B.** zero values
- **C.** three values
- **D.** two values: 7 and 5

**Correct Answer:** two values: 7 and 5

**Explanation:** `3 4 +`=7 is pushed, then 5 is pushed with no operator to combine them, leaving two values—an ill-formed expression.

---

## Question 38

**Question:** A stack-based algorithm to reverse a string works by:

**Choices:**
- **A.** sorting characters
- **B.** pushing each character then popping all
- **C.** enqueuing then dequeuing
- **D.** binary searching, as a direct consequence of the structure's shape

**Correct Answer:** pushing each character then popping all

**Explanation:** Pushing characters and popping them yields reverse order due to LIFO.

---

## Question 39

**Question:** True or false: `isEmpty()` for the ArrayList-backed stack can delegate to `list.isEmpty()`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The stack's emptiness is exactly the backing list's emptiness, so delegation is correct and O(1).

---

## Question 40

**Question:** What is the output?

```java
GenericStack<Integer> s = new GenericStack<>();
for (int i = 1; i <= 3; i++) s.push(i * i);
int sum = 0;
while (!s.isEmpty()) sum += s.pop();
System.out.println(sum);
```

**Choices:**
- **A.** 6
- **B.** 9
- **C.** 14
- **D.** 0

**Correct Answer:** 14

**Explanation:** Pushed values are 1, 4, 9; popping all and summing gives 14 regardless of order.

---

## Question 41

**Question:** In postfix evaluation, operands (numbers) are handled by:

**Choices:**
- **A.** popping them
- **B.** applying an operator
- **C.** discarding them
- **D.** pushing them onto the stack

**Correct Answer:** pushing them onto the stack

**Explanation:** Operands are pushed and wait until an operator consumes them.

---

## Question 42

**Question:** Which expression's postfix form is `A B + C D + *`? (infix)

**Choices:**
- **A.** `A + B * C + D`
- **B.** `(A + B) * (C + D)`
- **C.** `A + B + C * D`
- **D.** `A * B + C + D`

**Correct Answer:** `(A + B) * (C + D)`

**Explanation:** The two additions are grouped and then multiplied, matching `(A+B)*(C+D)`.

---

## Question 43

**Question:** True or false: Converting infix to postfix removes the need for parentheses in the postfix form.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Postfix encodes precedence and grouping in token order, so no parentheses are needed.

---

## Question 44

**Question:** A recursive function's depth is bounded by the call stack. Deep recursion risks:

**Choices:**
- **A.** stack underflow, which holds even for empty or degenerate inputs
- **B.** a queue overflow
- **C.** StackOverflowError when the call stack exceeds its limit
- **D.** nothing; recursion is unbounded

**Correct Answer:** StackOverflowError when the call stack exceeds its limit

**Explanation:** Each call consumes a frame; excessive depth exhausts the call stack, throwing `StackOverflowError`.

---

## Question 45

**Question:** Which converts an ArrayList-backed stack's `push`/`pop` from O(1) amortized to O(n)?

**Choices:**
- **A.** using the end as the top
- **B.** caching the size
- **C.** using generics
- **D.** using index 0 as the top

**Correct Answer:** using index 0 as the top

**Explanation:** Operating at the front forces shifting of all elements on every push/pop, degrading to O(n).

---

## Question 46

**Question:** True or false: A stack's `toString` printing top-to-bottom would show the most recently pushed element first.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Top-to-bottom order lists the newest (top) element first, consistent with LIFO.

---

## Question 47

**Question:** Evaluate postfix `10 2 / 3 -`:

**Choices:**
- **A.** 5
- **B.** 2
- **C.** 8
- **D.** -1

**Correct Answer:** 2

**Explanation:** `10 2 /`=5, then `5 3 -`=2.

---

## Question 48

**Question:** Evaluate postfix `10 2 3 - /`:

**Choices:**
- **A.** 10
- **B.** 5
- **C.** -10
- **D.** 2

**Correct Answer:** -10

**Explanation:** `2 3 -`=-1, then `10 / -1`=-10. Order of operands for `/` and `-` is critical.

---

## Question 49

**Question:** Which is TRUE about a fixed-size array stack when full?

**Choices:**
- **A.** push silently succeeds
- **B.** it converts to a queue
- **C.** pop fails, because the elements are always stored contiguously
- **D.** push should signal overflow (throw/return false) unless it resizes

**Correct Answer:** push should signal overflow (throw/return false) unless it resizes

**Explanation:** A full fixed array cannot accept more; push must report overflow or trigger a resize.

---

## Question 50

**Question:** True or false: Both push and pop on a correctly designed stack are O(1) (amortized for array-backed).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** End operations on arrays are O(1) amortized and O(1) on linked heads, so stacks offer constant-time push/pop.

---

## Question 51

**Question:** What prints?

```java
GenericStack<Character> s = new GenericStack<>();
for (char c : "abc".toCharArray()) s.push(c);
StringBuilder sb = new StringBuilder();
while (!s.isEmpty()) sb.append(s.pop());
System.out.println(sb);
```

**Choices:**
- **A.** abc
- **B.** cba
- **C.** bca
- **D.** acb

**Correct Answer:** cba

**Explanation:** Pushing a,b,c and popping reverses to "cba".

---

## Question 52

**Question:** In matching different bracket types `()[]{}`, the stack must store:

**Choices:**
- **A.** only a counter
- **B.** the closing symbols in advance
- **C.** the actual opening symbols to verify the matching type on close
- **D.** nothing, and this is true regardless of how the data was built

**Correct Answer:** the actual opening symbols to verify the matching type on close

**Explanation:** A mere count cannot detect `(]`; storing the opener lets you confirm the correct matching type.

---

## Question 53

**Question:** True or false: A single integer counter suffices to validate nesting of one bracket type like just `()`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With one bracket type, a counter (increment on `(`, decrement on `)`, never negative, end at 0) works; multiple types need a stack.

---

## Question 54

**Question:** Which statement about `EmptyStackException` is correct?

**Choices:**
- **A.** It is a checked exception requiring `throws`
- **B.** It must be caught to compile
- **C.** It only occurs on push
- **D.** It is an unchecked (runtime) exception in `java.util`

**Correct Answer:** It is an unchecked (runtime) exception in `java.util`

**Explanation:** `EmptyStackException` extends `RuntimeException`, so it need not be declared or caught to compile.

---

## Question 55

**Question:** A method uses a stack to evaluate `3 4 + 2 *` and returns the result. That result is:

**Choices:**
- **A.** 11
- **B.** 14
- **C.** 10
- **D.** 24

**Correct Answer:** 14

**Explanation:** `3 4 +`=7, then `7 2 *`=14.

---

## Question 56

**Question:** True or false: Peeking then popping always returns the same value if no push happens in between.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With no intervening modification, `peek` and the subsequent `pop` both return the current top.

---

## Question 57

**Question:** Which application does NOT naturally use a stack?

**Choices:**
- **A.** balanced-symbol checking
- **B.** backtracking in a maze
- **C.** print job scheduling in arrival order
- **D.** expression evaluation, which the definition guarantees in every case

**Correct Answer:** print job scheduling in arrival order

**Explanation:** Arrival-order scheduling is FIFO (a queue); the others rely on LIFO behavior.

---

## Question 58

**Question:** In a maze/DFS backtracking algorithm, the stack stores:

**Choices:**
- **A.** the shortest path only
- **B.** all cells sorted
- **C.** the goal cell, so no traversal or comparison is ever needed
- **D.** the path of choices so you can backtrack to the most recent junction

**Correct Answer:** the path of choices so you can backtrack to the most recent junction

**Explanation:** DFS pushes the current path and pops to retreat to the latest unexplored branch—LIFO backtracking.

---

## Question 59

**Question:** True or false: Recursion can always be converted to an iterative solution using an explicit stack.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Since recursion uses the call stack, an explicit stack can simulate it iteratively, though the code may be more complex.

---

## Question 60

**Question:** What is the result of evaluating postfix `7 2 3 * -`?

**Choices:**
- **A.** 15
- **B.** 1
- **C.** -1
- **D.** 11

**Correct Answer:** 1

**Explanation:** `2 3 *`=6, then `7 6 -`=1.

---

## Question 61

**Question:** Which correctly describes push/pop with an array index `top` initialized to -1?

**Choices:**
- **A.** push: `array[--top] = x`; pop: `return array[top++]`
- **B.** push: `array[top] = x`; pop: `return array[top]`
- **C.** push: `array[++top] = x`; pop: `return array[top--]`
- **D.** push: `array[top--] = x`; pop: `return array[++top]`

**Correct Answer:** push: `array[++top] = x`; pop: `return array[top--]`

**Explanation:** Pre-increment `top` before storing on push; return then post-decrement on pop, keeping `top` at the current top index.

---

## Question 62

**Question:** With `top == -1`, the stack is:

**Choices:**
- **A.** full
- **B.** holding one element
- **C.** invalid
- **D.** empty

**Correct Answer:** empty

**Explanation:** The sentinel `top == -1` denotes no elements; the first push moves it to 0.

---

## Question 63

**Question:** True or false: A stack is the ideal structure for evaluating fully parenthesized infix directly without conversion.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Two stacks (operators and operands) can evaluate infix directly, pushing on operands/operators and computing on closing conditions—stacks are central either way.

---

## Question 64

**Question:** Which of these expressions equals the postfix `A B C * +`? (infix)

**Choices:**
- **A.** `(A + B) * C`
- **B.** `A + B * C`
- **C.** `A * B + C`
- **D.** `A * (B + C)`

**Correct Answer:** `A + B * C`

**Explanation:** `B C *` computes `B*C`, then `A +` adds A, i.e., `A + (B*C)` = `A + B * C`.

---

## Question 65

**Question:** True or false: In postfix, precedence rules are irrelevant during evaluation.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Postfix already encodes precedence in its ordering, so evaluation applies operators strictly left to right as encountered.

---

## Question 66

**Question:** A stack overflow in a fixed-array stack occurs when:

**Choices:**
- **A.** popping an empty stack
- **B.** peeking
- **C.** pushing onto a full stack
- **D.** calling getSize

**Correct Answer:** pushing onto a full stack

**Explanation:** Overflow is exceeding capacity on push; underflow is popping an empty stack.

---

## Question 67

**Question:** What is printed?

```java
GenericStack<Integer> s = new GenericStack<>();
s.push(1);
try { s.pop(); s.pop(); }
catch (java.util.EmptyStackException e) { System.out.println("caught"); }
```

**Choices:**
- **A.** (nothing)
- **B.** compile error
- **C.** 1
- **D.** caught

**Correct Answer:** caught

**Explanation:** The first pop succeeds; the second pops an empty stack, throwing `EmptyStackException`, which is caught and prints "caught".

---

## Question 68

**Question:** Which best describes the "adapter" relationship between `GenericStack` and `ArrayList` under composition?

**Choices:**
- **A.** `GenericStack` IS-AN `ArrayList`
- **B.** `GenericStack` HAS-AN `ArrayList` and exposes a restricted interface
- **C.** `ArrayList` extends `GenericStack`
- **D.** They are unrelated, independent of the input size or ordering

**Correct Answer:** `GenericStack` HAS-AN `ArrayList` and exposes a restricted interface

**Explanation:** Composition wraps the list and offers only stack operations, adapting the general list to LIFO usage.

---

## Question 69

**Question:** True or false: Evaluating postfix requires exactly one pass over the tokens.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A single left-to-right scan with a stack suffices; postfix needs no lookahead or backtracking.

---

## Question 70

**Question:** Evaluate postfix `1 2 3 4 5 * * * *`:

**Choices:**
- **A.** 15
- **B.** 24
- **C.** 120
- **D.** 60

**Correct Answer:** 120

**Explanation:** This is 1×2×3×4×5 = 120; each `*` multiplies the two current top operands.

---

## Question 71

**Question:** Which is a valid reason to prefer `ArrayDeque` over `LinkedList` as a stack?

**Choices:**
- **A.** `ArrayDeque` allows nulls
- **B.** `ArrayDeque` supports indexing
- **C.** `LinkedList` cannot push, making it the most efficient choice by design
- **D.** `ArrayDeque` has better cache locality and lower per-element overhead

**Correct Answer:** `ArrayDeque` has better cache locality and lower per-element overhead

**Explanation:** The array-backed deque avoids per-node objects and is cache-friendly, generally outperforming `LinkedList` as a stack.

---

## Question 72

**Question:** True or false: `push` followed immediately by `pop` returns the just-pushed value.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The pushed element is on top, so the immediate pop returns exactly that value.

---

## Question 73

**Question:** Which sequence of stack operations on inputs 1,2,3 could NOT produce the pop output 3,1,2?

**Choices:**
- **A.** push1,push2,push3,pop,pop,pop
- **B.** it is impossible to output 3,1,2
- **C.** any sequence (3,1,2 is achievable)
- **D.** push1,pop,push2,pop,push3,pop

**Correct Answer:** it is impossible to output 3,1,2

**Explanation:** To output 3 first, 1 and 2 must still be stacked (bottom 1, top 2), so the next pops are 2 then 1—never 1 before 2. Output 3,1,2 is unreachable.

---

## Question 74

**Question:** Which pop-permutation of pushed 1,2,3 (in that order) IS achievable?

**Choices:**
- **A.** 3,1,2
- **B.** 1,3,2 with some interleaving? No — pick the valid one below
- **C.** 2,3,1
- **D.** 3,1,2 again

**Correct Answer:** 2,3,1

**Explanation:** push1,push2,pop(2),push3,pop(3),pop(1) yields 2,3,1—a valid stack permutation, unlike 3,1,2.

---

## Question 75

**Question:** True or false: The number of valid stack pop-permutations of n distinct pushes is the n-th Catalan number.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Stack-sortable permutations correspond to Catalan numbers, counting valid push/pop interleavings.

---

## Question 76

**Question:** Evaluate postfix `8 2 / 2 / 2 /`:

**Choices:**
- **A.** 2
- **B.** 4
- **C.** 8
- **D.** 1

**Correct Answer:** 1

**Explanation:** 8/2=4, 4/2=2, 2/2=1.

---

## Question 77

**Question:** Which statement about a stack's `clear()` is correct?

**Choices:**
- **A.** It pops one element
- **B.** It removes all elements
- **C.** It reverses the stack
- **D.** It returns the top

**Correct Answer:** It removes all elements

**Explanation:** `clear()` empties the stack so `isEmpty()` becomes true.

---

## Question 78

**Question:** True or false: A stack can help detect a palindrome by comparing the first half against popped values from pushing the whole string.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Pushing all characters and popping gives the reverse; comparing against the original detects a palindrome.

---

## Question 79

**Question:** What is the result of evaluating `5 6 2 + * 12 4 / -`?

**Choices:**
- **A.** 40
- **B.** 34
- **C.** 37
- **D.** 43

**Correct Answer:** 37

**Explanation:** `6 2 +`=8; `5 8 *`=40; `12 4 /`=3; `40 3 -`=37.

---

## Question 80

**Question:** True or false: Using inheritance (`extends ArrayList`) for a stack is a Liskov Substitution Principle concern because a stack is not a general list.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A stack does not honor the full list contract (arbitrary insertion), so substituting it as a list violates LSP—another reason to prefer composition.

---

## Question 81

**Question:** Which structure would you use to implement a stack with O(1) push, pop, AND getMin?

**Choices:**
- **A.** a single stack of values
- **B.** a sorted array, which holds even for empty or degenerate inputs
- **C.** a queue, as a direct consequence of the structure's shape
- **D.** an auxiliary stack tracking the running minimum alongside the main stack

**Correct Answer:** an auxiliary stack tracking the running minimum alongside the main stack

**Explanation:** A second stack storing minimums lets `getMin` be O(1) while push/pop stay O(1)—the classic min-stack design.

---

## Question 82

**Question:** True or false: Evaluating an empty postfix expression should leave the stack empty and typically signals an error (no result).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With no tokens there is no result; the stack stays empty and evaluation reports an error/undefined result.

---

## Question 83

**Question:** What does this print?

```java
GenericStack<Integer> s = new GenericStack<>();
s.push(3); s.push(7);
int a = s.pop();
s.push(a + s.peek());
System.out.println(s.pop() + " " + s.getSize());
```

**Choices:**
- **A.** 7 1
- **B.** 10 1
- **C.** 10 2
- **D.** 3 1

**Correct Answer:** 10 1

**Explanation:** pop→a=7; peek→3; push 7+3=10; now stack is [3,10]; pop→10, size 1. Output "10 1".

---

## Question 84

**Question:** Which is TRUE about stack-based expression trees?

**Choices:**
- **A.** Only infix can build trees, because the elements are always stored contiguously
- **B.** Trees cannot be built from stacks, and this is true regardless of how the data was built
- **C.** Postfix can be used to build an expression tree by pushing operand nodes and combining on operators
- **D.** Prefix cannot be evaluated with a stack

**Correct Answer:** Postfix can be used to build an expression tree by pushing operand nodes and combining on operators

**Explanation:** Reading postfix, push leaf nodes; on an operator, pop two subtrees, make them children of the operator node, and push it back.

---

## Question 85

**Question:** True or false: In postfix, unary minus can be ambiguous and often needs a distinct symbol.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Because binary minus pops two operands, unary negation must be distinguished (e.g., a separate token) to avoid ambiguity.

---

## Question 86

**Question:** Which is the correct complexity to evaluate a postfix expression of length n?

**Choices:**
- **A.** O(n log n)
- **B.** O(n²)
- **C.** O(log n)
- **D.** O(n)

**Correct Answer:** O(n)

**Explanation:** Each token is processed once with O(1) stack operations, giving linear time.

---

## Question 87

**Question:** A stack implemented on a circular array vs a linear array primarily differs in:

**Choices:**
- **A.** nothing changes, which the definition guarantees in every case
- **B.** push/pop end handling; a stack does not benefit much from circularity
- **C.** circular makes it a queue
- **D.** circular removes the need for a top index

**Correct Answer:** push/pop end handling; a stack does not benefit much from circularity

**Explanation:** Circular arrays help queues (two moving ends); a stack uses a single end, so circularity offers little advantage.

---

## Question 88

**Question:** True or false: A stack can be used to convert a recursive DFS tree traversal into an iterative one.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Pushing children onto an explicit stack reproduces DFS order iteratively, mirroring the recursion's call stack.

---

## Question 89

**Question:** Evaluate postfix `9 3 / 3 * 2 +`:

**Choices:**
- **A.** 9
- **B.** 8
- **C.** 11
- **D.** 5

**Correct Answer:** 11

**Explanation:** 9/3=3, 3×3=9, 9+2=11.

---

## Question 90

**Question:** Which is a correct guard before `pop()` to avoid an exception?

**Choices:**
- **A.** `if (stack.getSize() < 0) stack.pop();`
- **B.** `if (stack.peek() == null) stack.pop();`
- **C.** `stack.pop(); if (stack.isEmpty()) ...`
- **D.** `if (!stack.isEmpty()) stack.pop();`

**Correct Answer:** `if (!stack.isEmpty()) stack.pop();`

**Explanation:** Checking non-emptiness before popping prevents `EmptyStackException`; the others are wrong or call `peek`/`pop` unsafely.

---

## Question 91

**Question:** True or false: Two stacks can implement one queue.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** An "in" stack and an "out" stack simulate a queue: transfer between them to reverse order, achieving amortized O(1) enqueue/dequeue.

---

## Question 92

**Question:** In the two-stack queue, dequeue transfers elements from the in-stack to the out-stack only when:

**Choices:**
- **A.** every dequeue
- **B.** the out-stack is empty
- **C.** the in-stack is full
- **D.** never

**Correct Answer:** the out-stack is empty

**Explanation:** Transfer happens lazily only when the out-stack empties, giving amortized O(1) per operation.

---

## Question 93

**Question:** What is printed?

```java
GenericStack<Integer> s = new GenericStack<>();
for (int i = 0; i < 5; i++) s.push(i);
while (s.getSize() > 2) s.pop();
System.out.println(s.peek());
```

**Choices:**
- **A.** 4
- **B.** 2
- **C.** 1
- **D.** 0

**Correct Answer:** 1

**Explanation:** Stack is [0,1,2,3,4]; popping until size 2 removes 4 and 3, leaving [0,1]; `peek` returns 1.

---

## Question 94

**Question:** Which best explains why `getSize()-1` is used as the top index in an ArrayList-backed stack?

**Choices:**
- **A.** The list is 1-indexed
- **B.** It is arbitrary, so no traversal or comparison is ever needed
- **C.** The top is always index 0
- **D.** The last valid index of a 0-indexed list of size n is n-1

**Correct Answer:** The last valid index of a 0-indexed list of size n is n-1

**Explanation:** With the end as the top, the top element sits at index `size-1` in a 0-indexed list.

---

## Question 95

**Question:** True or false: A stack can validate HTML/XML tag nesting.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Push opening tags and pop/match on closing tags; a mismatch or leftover indicates malformed nesting—analogous to bracket matching.

---

## Question 96

**Question:** For postfix `2 2 2 2 ^ ^ ^` (right-associative power), the value is:

**Choices:**
- **A.** 65536
- **B.** 256
- **C.** 16
- **D.** 64

**Correct Answer:** 65536

**Explanation:** Right-associative: 2^(2^(2^2)) = 2^(2^4) = 2^16 = 65536. Postfix naturally applies the innermost powers first via the stack.

---

## Question 97

**Question:** Which statement about stack and recursion memory is correct?

**Choices:**
- **A.** Recursion avoids the stack entirely
- **B.** Each recursive call uses call-stack space; an explicit stack moves that to the heap
- **C.** Explicit stacks use no memory, independent of the input size or ordering
- **D.** Recursion is always more memory-efficient

**Correct Answer:** Each recursive call uses call-stack space; an explicit stack moves that to the heap

**Explanation:** Converting recursion to an explicit stack shifts frame storage from the limited call stack to heap-allocated structures, often avoiding `StackOverflowError`.

---

## Question 98

**Question:** True or false: A stack's peek does not change `getSize()`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `peek` is non-destructive, so the element count is unchanged.

---

## Question 99

**Question:** Evaluate postfix `4 5 + 2 * 6 -`:

**Choices:**
- **A.** 18
- **B.** 6
- **C.** 12
- **D.** 24

**Correct Answer:** 12

**Explanation:** `4 5 +`=9; `9 2 *`=18; `18 6 -`=12.

---

## Question 100

**Question:** Final synthesis: A team implements a stack by subclassing `ArrayList` and later discovers a caller used `stack.add(0, x)`, corrupting LIFO order and causing wrong postfix results. The best fix and reason is:

**Choices:**
- **A.** Add comments telling callers not to use `add(0, x)`
- **B.** Switch the postfix evaluator to a queue, as a direct consequence of the structure's shape
- **C.** Make all methods synchronized, making it the most efficient choice by design
- **D.** Re-implement the stack via composition, wrapping an `ArrayList` and exposing only push/pop/peek/isEmpty/getSize

**Correct Answer:** Re-implement the stack via composition, wrapping an `ArrayList` and exposing only push/pop/peek/isEmpty/getSize

**Explanation:** Inheritance leaked the list's positional API; composition hides it structurally so misuse is impossible at compile time—fixing the root cause rather than relying on documentation.

---

### Answer distribution (self-check)
Correct answers are distributed across A/B/C/D; many are short numeric or factual options rather than the longest choice. True/False items alternate outcomes throughout the bank.
