# Java Error Handling & Exceptions: 100 Extreme-Hard Trick Questions

> For each snippet, decide the outcome: a **compile-time error**, a **runtime exception** (name the exact one), or **no error at all** (with the exact output). Many are deliberate traps — the "obvious" answer is often wrong. Assume Java 8+ and that each snippet is inside a valid `main` unless a class is shown.

---

## Question 1

**Question:** What happens?

```java
int x = 10, y = 0;
System.out.println(x / y);
```

**Choices:**
- **A.** Runtime: ArithmeticException
- **B.** Compile error
- **C.** No error; prints Infinity
- **D.** No error; prints 0

**Correct Answer:** Runtime: ArithmeticException

**Explanation:** Integer division by zero throws `ArithmeticException` at runtime; it compiles fine because `y` is a variable, not a constant zero.

---

## Question 2

**Question:** What happens?

```java
double x = 10, y = 0;
System.out.println(x / y);
```

**Choices:**
- **A.** Runtime: ArithmeticException
- **B.** No error; prints Infinity
- **C.** Compile error
- **D.** No error; prints 0.0

**Correct Answer:** No error; prints Infinity

**Explanation:** Floating-point division by zero does not throw; `10.0 / 0.0` yields `Infinity`.

---

## Question 3

**Question:** What happens?

```java
System.out.println(0.0 / 0.0);
```

**Choices:**
- **A.** Runtime: ArithmeticException
- **B.** No error; prints 0.0
- **C.** No error; prints NaN
- **D.** Compile error

**Correct Answer:** No error; prints NaN

**Explanation:** `0.0 / 0.0` is Not-a-Number (`NaN`) in IEEE floating point; no exception occurs.

---

## Question 4

**Question:** What happens?

```java
double d = 1 / 2;
System.out.println(d);
```

**Choices:**
- **A.** No error; prints 0.5
- **B.** Compile error
- **C.** Runtime exception
- **D.** No error; prints 0.0

**Correct Answer:** No error; prints 0.0

**Explanation:** `1 / 2` is integer division = 0, then widened to `0.0`. The division happens before the assignment's widening.

---

## Question 5

**Question:** What happens?

```java
int[] arr = new int[3];
System.out.println(arr[3]);
```

**Choices:**
- **A.** Runtime: ArrayIndexOutOfBoundsException
- **B.** No error; prints 0
- **C.** Compile error
- **D.** Runtime: NullPointerException

**Correct Answer:** Runtime: ArrayIndexOutOfBoundsException

**Explanation:** Valid indices are 0..2; accessing index 3 throws `ArrayIndexOutOfBoundsException`.

---

## Question 6

**Question:** What happens?

```java
int[] arr = new int[-2];
```

**Choices:**
- **A.** Compile error
- **B.** Runtime: NegativeArraySizeException
- **C.** No error; creates an empty array
- **D.** Runtime: ArrayIndexOutOfBoundsException

**Correct Answer:** Runtime: NegativeArraySizeException

**Explanation:** A negative array size compiles but throws `NegativeArraySizeException` at runtime.

---

## Question 7

**Question:** What happens?

```java
String s = null;
System.out.println(s.length());
```

**Choices:**
- **A.** No error; prints 0
- **B.** Compile error
- **C.** Runtime: NullPointerException
- **D.** No error; prints null

**Correct Answer:** Runtime: NullPointerException

**Explanation:** Calling an instance method on a null reference throws `NullPointerException`.

---

## Question 8

**Question:** What happens?

```java
Integer i = null;
int x = i;
```

**Choices:**
- **A.** No error; x becomes 0
- **B.** Compile error
- **C.** Runtime: ClassCastException
- **D.** Runtime: NullPointerException

**Correct Answer:** Runtime: NullPointerException

**Explanation:** Auto-unboxing `null` calls `i.intValue()` on null, throwing `NullPointerException`.

---

## Question 9

**Question:** What happens?

```java
Object o = "text";
Integer n = (Integer) o;
```

**Choices:**
- **A.** Runtime: ClassCastException
- **B.** Compile error
- **C.** No error; n becomes 0
- **D.** Runtime: NumberFormatException

**Correct Answer:** Runtime: ClassCastException

**Explanation:** The cast compiles (Object could be Integer) but fails at runtime because the object is actually a `String`.

---

## Question 10

**Question:** What happens?

```java
String str = "abc";
Integer n = (Integer) str;
```

**Choices:**
- **A.** Runtime: ClassCastException
- **B.** Compile error
- **C.** No error; n becomes null
- **D.** Runtime: NumberFormatException

**Correct Answer:** Compile error

**Explanation:** `String` and `Integer` are unrelated types, so the cast is "inconvertible" — a compile-time error, not a runtime one.

---

## Question 11

**Question:** What happens?

```java
System.out.println(Integer.parseInt("12x"));
```

**Choices:**
- **A.** No error; prints 12
- **B.** Compile error
- **C.** Runtime: NumberFormatException
- **D.** Runtime: IllegalArgumentException named differently

**Correct Answer:** Runtime: NumberFormatException

**Explanation:** `"12x"` is not a valid integer, so `parseInt` throws `NumberFormatException` (a subclass of `IllegalArgumentException`).

---

## Question 12

**Question:** What happens?

```java
List<Integer> list = Arrays.asList(1, 2, 3);
list.add(4);
```

**Choices:**
- **A.** No error; list becomes [1,2,3,4]
- **B.** Compile error
- **C.** Runtime: IndexOutOfBoundsException
- **D.** Runtime: UnsupportedOperationException

**Correct Answer:** Runtime: UnsupportedOperationException

**Explanation:** `Arrays.asList` returns a fixed-size list backed by the array; structural modification via `add` throws `UnsupportedOperationException`.

---

## Question 13

**Question:** What happens?

```java
List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
for (String s : list) {
    if (s.equals("b")) list.remove(s);
}
```

**Choices:**
- **A.** Runtime: ConcurrentModificationException
- **B.** No error; list becomes [a,c,d]
- **C.** Compile error
- **D.** Runtime: UnsupportedOperationException

**Correct Answer:** Runtime: ConcurrentModificationException

**Explanation:** Modifying a list during a for-each (iterator) traversal triggers `ConcurrentModificationException` on the next `next()` call.

---

## Question 14

**Question:** What happens? (Note the list size)

```java
List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
for (String s : list) {
    if (s.equals("b")) list.remove(s);
}
System.out.println(list);
```

**Choices:**
- **A.** Runtime: ConcurrentModificationException
- **B.** No error; prints [a, c]
- **C.** Compile error
- **D.** Runtime: IndexOutOfBoundsException

**Correct Answer:** No error; prints [a, c]

**Explanation:** Removing the **second-to-last** element is the classic exception: after removing "b", the iterator's `cursor` (2) equals the new `size` (2), so `hasNext()` is false and `next()` is never called — the comodification check never runs. Contrast with Q13's 4-element list.

---

## Question 15

**Question:** What happens?

```java
Object[] arr = new String[2];
arr[0] = 42;
```

**Choices:**
- **A.** Compile error
- **B.** No error; autoboxes 42
- **C.** Runtime: ArrayStoreException
- **D.** Runtime: ClassCastException

**Correct Answer:** Runtime: ArrayStoreException

**Explanation:** Arrays are covariant, so this compiles, but storing an `Integer` into an actual `String[]` throws `ArrayStoreException` at runtime.

---

## Question 16

**Question:** What happens?

```java
final int x = 5;
x = 10;
```

**Choices:**
- **A.** Runtime: IllegalStateException
- **B.** No error; x becomes 10
- **C.** Runtime exception
- **D.** Compile error

**Correct Answer:** Compile error

**Explanation:** A `final` variable cannot be reassigned; the compiler rejects it.

---

## Question 17

**Question:** What happens?

```java
int x;
System.out.println(x);
```

**Choices:**
- **A.** Compile error
- **B.** No error; prints 0
- **C.** Runtime: NullPointerException
- **D.** No error; prints garbage

**Correct Answer:** Compile error

**Explanation:** A **local** variable must be definitely assigned before use; the compiler reports "variable x might not have been initialized". (Instance fields would default to 0.)

---

## Question 18

**Question:** What happens?

```java
class A { int x; }
System.out.println(new A().x);
```

**Choices:**
- **A.** Compile error
- **B.** No error; prints 0
- **C.** Runtime: NullPointerException
- **D.** No error; prints null

**Correct Answer:** No error; prints 0

**Explanation:** Unlike local variables, instance fields receive default values — an `int` field defaults to 0.

---

## Question 19

**Question:** What happens?

```java
public static int f() {
    int x = 5;
}
```

**Choices:**
- **A.** No error
- **B.** Runtime: returns 0
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** Compile error

**Explanation:** A non-void method must return a value on every path; "missing return statement" is a compile-time error.

---

## Question 20

**Question:** What happens?

```java
public static void f() {
    return;
    System.out.println("after");
}
```

**Choices:**
- **A.** No error; prints nothing
- **B.** No error; prints "after"
- **C.** Runtime exception
- **D.** Compile error

**Correct Answer:** Compile error

**Explanation:** The statement after `return` is unreachable — "unreachable statement" is a compile-time error.

---

## Question 21

**Question:** What happens?

```java
while (true) { }
System.out.println("done");
```

**Choices:**
- **A.** Compile error
- **B.** No error; loops forever
- **C.** No error; prints "done"
- **D.** Runtime: StackOverflowError

**Correct Answer:** Compile error

**Explanation:** `while (true)` with a constant condition makes the following statement unreachable, which is a compile-time error (even though the loop itself would run forever).

---

## Question 22

**Question:** What happens?

```java
public static void f() {
    throw new Exception();
}
```

**Choices:**
- **A.** No error
- **B.** Compile error
- **C.** Runtime: Exception
- **D.** Runtime: RuntimeException

**Correct Answer:** Compile error

**Explanation:** `Exception` is checked; it must be caught or declared with `throws`. Not doing so is a compile-time error.

---

## Question 23

**Question:** What happens?

```java
try {
    int x = 5;
} catch (java.io.IOException e) {
    System.out.println("io");
}
```

**Choices:**
- **A.** No error
- **B.** Runtime: IOException
- **C.** Compile error
- **D.** No error; prints "io"

**Correct Answer:** Compile error

**Explanation:** Nothing in the `try` can throw `IOException` (a checked exception), so the compiler rejects the catch: "exception IOException is never thrown in body of corresponding try statement".

---

## Question 24

**Question:** What happens?

```java
try {
    Integer.parseInt("x");
} catch (Exception e) {
    System.out.println("1");
} catch (NumberFormatException e) {
    System.out.println("2");
}
```

**Choices:**
- **A.** No error; prints "2"
- **B.** No error; prints "1"
- **C.** Runtime: NumberFormatException
- **D.** Compile error

**Correct Answer:** Compile error

**Explanation:** A more general `catch (Exception)` before `catch (NumberFormatException)` makes the second catch unreachable — "exception has already been caught" is a compile error.

---

## Question 25

**Question:** What happens?

```java
long big = 10000000000;
```

**Choices:**
- **A.** Compile error
- **B.** No error
- **C.** Runtime: overflow
- **D.** No error; big becomes negative

**Correct Answer:** Compile error

**Explanation:** `10000000000` is an `int` literal out of range; it needs an `L` suffix. "Integer number too large" is a compile error even though the target is `long`.

---

## Question 26

**Question:** What happens?

```java
byte b = 200;
```

**Choices:**
- **A.** No error; b becomes -56
- **B.** Compile error
- **C.** No error; b becomes 200
- **D.** Runtime exception

**Correct Answer:** Compile error

**Explanation:** 200 exceeds `byte`'s range (-128..127); implicit narrowing of an out-of-range constant is a compile error. An explicit `(byte)` cast would wrap to -56.

---

## Question 27

**Question:** What happens?

```java
int x = 3.5;
```

**Choices:**
- **A.** No error; x becomes 3
- **B.** No error; x becomes 4
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** Compile error

**Explanation:** Assigning a `double` to an `int` is a lossy narrowing conversion; without an explicit cast it is a compile error.

---

## Question 28

**Question:** What happens?

```java
char c = 65;
System.out.println(c);
```

**Choices:**
- **A.** No error; prints 65
- **B.** Compile error
- **C.** Runtime exception
- **D.** No error; prints A

**Correct Answer:** No error; prints A

**Explanation:** 65 is within `char` range and prints as the character 'A'.

---

## Question 29

**Question:** What happens?

```java
System.out.println('A' + 1);
```

**Choices:**
- **A.** No error; prints 66
- **B.** No error; prints A1
- **C.** No error; prints B
- **D.** Compile error

**Correct Answer:** No error; prints 66

**Explanation:** `'A'` promotes to its int value 65; `65 + 1 = 66` is printed as an int.

---

## Question 30

**Question:** What happens?

```java
System.out.println(1 + 2 + "3" + 4 + 5);
```

**Choices:**
- **A.** No error; prints 12345
- **B.** No error; prints 3345
- **C.** No error; prints 33345
- **D.** Compile error

**Correct Answer:** No error; prints 3345

**Explanation:** Left to right: `1+2=3`, then `"3"` makes it string `"33"`, then `+4` → `"334"`, `+5` → `"3345"`.

---

## Question 31

**Question:** What happens?

```java
int x = Integer.MAX_VALUE + 1;
System.out.println(x);
```

**Choices:**
- **A.** Runtime: ArithmeticException
- **B.** Compile error
- **C.** No error; prints -2147483648
- **D.** No error; prints 2147483648

**Correct Answer:** No error; prints -2147483648

**Explanation:** Integer overflow wraps around silently (no exception); `MAX_VALUE + 1` becomes `MIN_VALUE`.

---

## Question 32

**Question:** What happens?

```java
Integer a = 127, b = 127;
System.out.println(a == b);
```

**Choices:**
- **A.** No error; prints false
- **B.** Compile error
- **C.** Runtime exception
- **D.** No error; prints true

**Correct Answer:** No error; prints true

**Explanation:** The Integer cache holds -128..127, so both refer to the same cached object; `==` is true.

---

## Question 33

**Question:** What happens?

```java
Integer a = 128, b = 128;
System.out.println(a == b);
```

**Choices:**
- **A.** No error; prints false
- **B.** No error; prints true
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** No error; prints false

**Explanation:** 128 is outside the cache, so two distinct objects are created; `==` compares references and prints false. (`equals` would be true.)

---

## Question 34

**Question:** What happens?

```java
String a = new String("hi");
String b = "hi";
System.out.println(a == b);
```

**Choices:**
- **A.** No error; prints true
- **B.** No error; prints false
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** No error; prints false

**Explanation:** `new String` creates a distinct object off the string pool, so `==` (reference equality) is false; `equals` would be true.

---

## Question 35

**Question:** What happens?

```java
public static int f() {
    try { return 1; }
    finally { return 2; }
}
```

**Choices:**
- **A.** No error; returns 1
- **B.** Compile error
- **C.** No error; returns 2
- **D.** Runtime exception

**Correct Answer:** No error; returns 2

**Explanation:** A `return` in `finally` overrides the `try` block's return; the method returns 2.

---

## Question 36

**Question:** What happens?

```java
public static int f() {
    try { throw new RuntimeException(); }
    finally { return 0; }
}
```

**Choices:**
- **A.** Runtime: RuntimeException propagates
- **B.** Compile error
- **C.** No error; returns 1
- **D.** No error; returns 0

**Correct Answer:** No error; returns 0

**Explanation:** A `return` in `finally` swallows the pending exception; the method quietly returns 0 (a notorious anti-pattern).

---

## Question 37

**Question:** What happens?

```java
int x = 5;
switch (x) {
    case 5: System.out.print("a");
    case 6: System.out.print("b");
}
```

**Choices:**
- **A.** No error; prints ab
- **B.** No error; prints a
- **C.** Compile error
- **D.** No error; prints b

**Correct Answer:** No error; prints ab

**Explanation:** No `break` after case 5 causes fall-through into case 6, printing "ab".

---

## Question 38

**Question:** What happens?

```java
static int f(int n) { return f(n - 1); }
public static void main(String[] a) { f(5); }
```

**Choices:**
- **A.** No error; returns 0
- **B.** Runtime: StackOverflowError
- **C.** Compile error
- **D.** Runtime: ArithmeticException

**Correct Answer:** Runtime: StackOverflowError

**Explanation:** Missing base case makes the recursion infinite, exhausting the call stack: `StackOverflowError`.

---

## Question 39

**Question:** What happens?

```java
abstract class A { }
class Test { public static void main(String[] x) { new A(); } }
```

**Choices:**
- **A.** No error
- **B.** Runtime: InstantiationException
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** Compile error

**Explanation:** Abstract classes cannot be instantiated with `new`; the compiler rejects it.

---

## Question 40

**Question:** What happens?

```java
class M {
    void g() { }
    public static void main(String[] a) { g(); }
}
```

**Choices:**
- **A.** No error
- **B.** Runtime: NullPointerException
- **C.** Runtime exception
- **D.** Compile error

**Correct Answer:** Compile error

**Explanation:** `g()` is an instance method; calling it from `static main` without an instance is "non-static method cannot be referenced from a static context".

---

## Question 41

**Question:** What happens?

```java
System.out.println(10 % 0);
```

**Choices:**
- **A.** Runtime: ArithmeticException
- **B.** No error; prints 0
- **C.** Compile error
- **D.** No error; prints NaN

**Correct Answer:** Runtime: ArithmeticException

**Explanation:** Integer modulo by zero throws `ArithmeticException`, just like integer division by zero.

---

## Question 42

**Question:** What happens?

```java
System.out.println(10.0 % 0);
```

**Choices:**
- **A.** Runtime: ArithmeticException
- **B.** No error; prints NaN
- **C.** No error; prints 0.0
- **D.** Compile error

**Correct Answer:** No error; prints NaN

**Explanation:** Floating-point modulo by zero yields `NaN`, no exception.

---

## Question 43

**Question:** What happens?

```java
System.out.println(null);
```

**Choices:**
- **A.** No error; prints null
- **B.** Runtime: NullPointerException
- **C.** Compile error
- **D.** No error; prints nothing

**Correct Answer:** Compile error

**Explanation:** `println(null)` is ambiguous between `println(char[])` and `println(String)` (both accept null, neither is more specific), so it fails to compile. `println((Object) null)` would print "null".

---

## Question 44

**Question:** What happens?

```java
Object o = null;
System.out.println(o instanceof String);
```

**Choices:**
- **A.** Runtime: NullPointerException
- **B.** No error; prints true
- **C.** Compile error
- **D.** No error; prints false

**Correct Answer:** No error; prints false

**Explanation:** `instanceof` on a null reference always evaluates to false without throwing.

---

## Question 45

**Question:** What happens?

```java
Object result = true ? Integer.valueOf(1) : Double.valueOf(2.0);
System.out.println(result);
```

**Choices:**
- **A.** No error; prints 1.0
- **B.** No error; prints 1
- **C.** Compile error
- **D.** Runtime: ClassCastException

**Correct Answer:** No error; prints 1.0

**Explanation:** A conditional expression mixing `Integer` and `Double` applies binary numeric promotion to `double`, so the `Integer` is unboxed and widened, printing `1.0` — not `1`.

---

## Question 46

**Question:** What happens?

```java
List<Integer> l = new ArrayList<>();
l.add(1); l.add(2); l.add(3);
l.remove(1);
System.out.println(l);
```

**Choices:**
- **A.** No error; prints [2, 3]
- **B.** No error; prints [1, 3]
- **C.** No error; prints [1, 2]
- **D.** Runtime: IndexOutOfBoundsException

**Correct Answer:** No error; prints [1, 3]

**Explanation:** `remove(int)` is chosen over `remove(Object)`, removing **index 1** (the value 2), leaving [1, 3].

---

## Question 47

**Question:** What happens?

```java
List<Integer> l = new ArrayList<>();
l.add(1); l.add(2);
l.remove(Integer.valueOf(1));
System.out.println(l);
```

**Choices:**
- **A.** No error; prints [1]
- **B.** Compile error
- **C.** No error; prints [2]
- **D.** Runtime exception

**Correct Answer:** No error; prints [2]

**Explanation:** `Integer.valueOf(1)` forces the `remove(Object)` overload, removing the **value** 1 and leaving [2].

---

## Question 48

**Question:** What happens?

```java
Map<String, Integer> m = new HashMap<>();
int x = m.get("missing");
```

**Choices:**
- **A.** No error; x becomes 0
- **B.** Compile error
- **C.** Runtime: NoSuchElementException
- **D.** Runtime: NullPointerException

**Correct Answer:** Runtime: NullPointerException

**Explanation:** `get` returns `null` for a missing key; unboxing `null` into `int x` throws `NullPointerException`.

---

## Question 49

**Question:** What happens?

```java
Map<String, Integer> m = new HashMap<>();
Integer x = m.get("missing");
System.out.println(x);
```

**Choices:**
- **A.** No error; prints null
- **B.** Runtime: NullPointerException
- **C.** No error; prints 0
- **D.** Compile error

**Correct Answer:** No error; prints null

**Explanation:** Keeping the result as `Integer` (no unboxing) simply holds `null`, which prints as "null".

---

## Question 50

**Question:** What happens?

```java
String s = "abc";
s.concat("d");
System.out.println(s);
```

**Choices:**
- **A.** No error; prints abcd
- **B.** No error; prints abc
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** No error; prints abc

**Explanation:** Strings are immutable; `concat` returns a new string that is discarded, so `s` is unchanged.

---

## Question 51

**Question:** What happens?

```java
int x = 5;
x =+ 3;
System.out.println(x);
```

**Choices:**
- **A.** No error; prints 8
- **B.** Compile error
- **C.** No error; prints 3
- **D.** No error; prints 5

**Correct Answer:** No error; prints 3

**Explanation:** `=+` is `= (+3)`, not `+=`. It assigns positive 3 to `x`, printing 3.

---

## Question 52

**Question:** What happens?

```java
boolean b = false;
if (b = true) System.out.println("yes");
```

**Choices:**
- **A.** No error; prints nothing
- **B.** Compile error
- **C.** Runtime exception
- **D.** No error; prints yes

**Correct Answer:** No error; prints yes

**Explanation:** `b = true` is an assignment whose value is `true`; the `if` runs. (With an `int` condition this would be a compile error, but boolean assignment is legal.)

---

## Question 53

**Question:** What happens?

```java
int i = 1;
if (i = 2) System.out.println("hi");
```

**Choices:**
- **A.** Compile error
- **B.** No error; prints hi
- **C.** No error; prints nothing
- **D.** Runtime exception

**Correct Answer:** Compile error

**Explanation:** `i = 2` is of type `int`, but `if` requires a `boolean`; "incompatible types: int cannot be converted to boolean".

---

## Question 54

**Question:** What happens?

```java
final int[] arr = {1, 2, 3};
arr[0] = 9;
System.out.println(arr[0]);
```

**Choices:**
- **A.** Compile error
- **B.** No error; prints 9
- **C.** Runtime exception
- **D.** No error; prints 1

**Correct Answer:** No error; prints 9

**Explanation:** `final` fixes the reference, not the contents; mutating an element is allowed.

---

## Question 55

**Question:** What happens?

```java
final int[] arr = {1, 2, 3};
arr = new int[2];
```

**Choices:**
- **A.** No error
- **B.** Runtime exception
- **C.** Compile error
- **D.** No error; arr becomes length 2

**Correct Answer:** Compile error

**Explanation:** Reassigning the `final` reference `arr` is a compile error, even though its elements are mutable.

---

## Question 56

**Question:** What happens?

```java
System.out.println("Hello".substring(5));
```

**Choices:**
- **A.** Runtime: StringIndexOutOfBoundsException
- **B.** Compile error
- **C.** No error; prints Hello
- **D.** No error; prints an empty string

**Correct Answer:** No error; prints an empty string

**Explanation:** `substring(length)` is valid and returns `""`. Only an index greater than the length (e.g., 6) would throw.

---

## Question 57

**Question:** What happens?

```java
System.out.println("Hello".substring(6));
```

**Choices:**
- **A.** Runtime: StringIndexOutOfBoundsException
- **B.** No error; prints an empty string
- **C.** Compile error
- **D.** No error; prints o

**Correct Answer:** Runtime: StringIndexOutOfBoundsException

**Explanation:** 6 exceeds the length (5), so `substring` throws `StringIndexOutOfBoundsException`.

---

## Question 58

**Question:** What happens?

```java
int x = 08;
```

**Choices:**
- **A.** No error; x becomes 8
- **B.** Compile error
- **C.** No error; x becomes 0
- **D.** Runtime exception

**Correct Answer:** Compile error

**Explanation:** A leading 0 denotes octal, where 8 is not a valid digit — "integer number too large" / invalid octal, a compile error.

---

## Question 59

**Question:** What happens?

```java
int x = 07;
System.out.println(x);
```

**Choices:**
- **A.** No error; prints 07
- **B.** Compile error
- **C.** No error; prints 7
- **D.** No error; prints 0

**Correct Answer:** No error; prints 7

**Explanation:** `07` is a valid octal literal equal to decimal 7.

---

## Question 60

**Question:** What happens?

```java
System.out.println(1_000_000);
```

**Choices:**
- **A.** Compile error
- **B.** No error; prints 1_000_000
- **C.** Runtime exception
- **D.** No error; prints 1000000

**Correct Answer:** No error; prints 1000000

**Explanation:** Underscores are legal digit separators in numeric literals; the value is 1000000.

---

## Question 61

**Question:** What happens?

```java
long l = 1000 * 1000 * 1000 * 1000;
System.out.println(l);
```

**Choices:**
- **A.** No error; prints -727379968
- **B.** No error; prints 1000000000000
- **C.** Compile error
- **D.** Runtime: ArithmeticException

**Correct Answer:** No error; prints -727379968

**Explanation:** The multiplications are done in `int` (overflowing) **before** widening to `long`, so the result is the wrapped value -727379968, not 10¹².

---

## Question 62

**Question:** What happens?

```java
int[] a = null;
for (int x : a) System.out.println(x);
```

**Choices:**
- **A.** No error; prints nothing
- **B.** Runtime: NullPointerException
- **C.** Compile error
- **D.** Runtime: ArrayIndexOutOfBoundsException

**Correct Answer:** Runtime: NullPointerException

**Explanation:** The enhanced-for calls `a.length`/iteration internals on a null array, throwing `NullPointerException`.

---

## Question 63

**Question:** What happens?

```java
System.out.println(Integer.parseInt("2147483648"));
```

**Choices:**
- **A.** No error; prints 2147483648
- **B.** Compile error
- **C.** Runtime: NumberFormatException
- **D.** No error; prints -2147483648

**Correct Answer:** Runtime: NumberFormatException

**Explanation:** 2147483648 exceeds `Integer.MAX_VALUE`, so `parseInt` throws `NumberFormatException` (it does not silently overflow).

---

## Question 64

**Question:** What happens?

```java
List<Object> lo = new ArrayList<String>();
```

**Choices:**
- **A.** No error
- **B.** Runtime: ClassCastException
- **C.** Runtime: ArrayStoreException
- **D.** Compile error

**Correct Answer:** Compile error

**Explanation:** Generics are invariant; `ArrayList<String>` is not an `ArrayList<Object>`, so the assignment fails to compile.

---

## Question 65

**Question:** What happens?

```java
List<String> ls = new ArrayList<>();
ls.add(1);
```

**Choices:**
- **A.** Compile error
- **B.** Runtime: ClassCastException
- **C.** No error; autoboxes 1
- **D.** Runtime: ArrayStoreException

**Correct Answer:** Compile error

**Explanation:** `ls` accepts only `String`; adding an `Integer` is caught at compile time.

---

## Question 66

**Question:** What happens?

```java
try {
    int[] a = new int[5];
    a[10] = 1;
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("caught");
}
```

**Choices:**
- **A.** Runtime: ArrayIndexOutOfBoundsException propagates
- **B.** No error; prints caught
- **C.** Compile error
- **D.** No error; prints nothing

**Correct Answer:** No error; prints caught

**Explanation:** The out-of-bounds access is caught by the matching handler, which prints "caught"; no exception escapes.

---

## Question 67

**Question:** What happens?

```java
try {
    throw new RuntimeException("x");
} catch (java.io.IOException | RuntimeException e) {
    System.out.println("caught");
}
```

**Choices:**
- **A.** No error; prints caught
- **B.** Runtime: RuntimeException
- **C.** Compile error
- **D.** No error; prints nothing

**Correct Answer:** Compile error

**Explanation:** The multi-catch is fine syntactically, but the `try` cannot throw the checked `IOException`, so that alternative is "never thrown" — a compile error. (Also, unrelated: `IOException | Exception` would be illegal for a different reason.)

---

## Question 68

**Question:** What happens?

```java
Object o = 5;
String s = (String) o;
```

**Choices:**
- **A.** Compile error
- **B.** No error; s becomes "5"
- **C.** Runtime: NumberFormatException
- **D.** Runtime: ClassCastException

**Correct Answer:** Runtime: ClassCastException

**Explanation:** `o` holds an `Integer` (autoboxed 5); casting it to `String` compiles (via `Object`) but throws `ClassCastException` at runtime.

---

## Question 69

**Question:** What happens?

```java
"hi".getClass();
Object x = "hi" instanceof Integer;
```

**Choices:**
- **A.** Compile error
- **B.** No error; x is false
- **C.** Runtime: ClassCastException
- **D.** No error; x is true

**Correct Answer:** Compile error

**Explanation:** `"hi"` has compile-time type `String`; `String` and `Integer` are unrelated, so `instanceof Integer` is "inconvertible types" — a compile error. (Casting to `Object` first would compile and yield false.)

---

## Question 70

**Question:** What happens?

```java
int x = 5 / 2;
System.out.println(x);
```

**Choices:**
- **A.** No error; prints 2.5
- **B.** No error; prints 2
- **C.** No error; prints 3
- **D.** Compile error

**Correct Answer:** No error; prints 2

**Explanation:** Integer division truncates toward zero: `5 / 2 = 2`.

---

## Question 71

**Question:** What happens?

```java
System.out.println(-7 % 3);
```

**Choices:**
- **A.** No error; prints 2
- **B.** No error; prints 1
- **C.** No error; prints -1
- **D.** Runtime exception

**Correct Answer:** No error; prints -1

**Explanation:** Java's `%` takes the sign of the dividend: `-7 % 3 = -1`.

---

## Question 72

**Question:** What happens?

```java
List<Integer> l = new ArrayList<>();
Iterator<Integer> it = l.iterator();
System.out.println(it.next());
```

**Choices:**
- **A.** No error; prints null
- **B.** Compile error
- **C.** Runtime: NullPointerException
- **D.** Runtime: NoSuchElementException

**Correct Answer:** Runtime: NoSuchElementException

**Explanation:** Calling `next()` on an empty iterator (without checking `hasNext()`) throws `NoSuchElementException`.

---

## Question 73

**Question:** What happens?

```java
StringBuilder sb = new StringBuilder("abc");
sb.append("d").reverse();
System.out.println(sb);
```

**Choices:**
- **A.** No error; prints dcba
- **B.** No error; prints abcd
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** No error; prints dcba

**Explanation:** `append` returns the same builder ("abcd"), then `reverse` mutates it in place to "dcba".

---

## Question 74

**Question:** What happens?

```java
int x = 10;
int y = x++ + ++x;
System.out.println(y);
```

**Choices:**
- **A.** No error; prints 21
- **B.** No error; prints 22
- **C.** No error; prints 20
- **D.** Compile error

**Correct Answer:** No error; prints 22

**Explanation:** `x++` uses 10 (x→11), `++x` makes x 12 and uses 12; `10 + 12 = 22`.

---

## Question 75

**Question:** What happens?

```java
System.out.println(Math.sqrt(-1));
```

**Choices:**
- **A.** Runtime: ArithmeticException
- **B.** Compile error
- **C.** No error; prints NaN
- **D.** No error; prints 0.0

**Correct Answer:** No error; prints NaN

**Explanation:** `Math.sqrt` of a negative returns `NaN`; it does not throw.

---

## Question 76

**Question:** What happens?

```java
String s = null;
System.out.println("value: " + s);
```

**Choices:**
- **A.** Runtime: NullPointerException
- **B.** Compile error
- **C.** No error; prints value:
- **D.** No error; prints value: null

**Correct Answer:** No error; prints value: null

**Explanation:** String concatenation with a null reference converts it to the text "null"; no exception.

---

## Question 77

**Question:** What happens?

```java
char c = 'a';
c++;
System.out.println(c);
```

**Choices:**
- **A.** No error; prints b
- **B.** Compile error
- **C.** No error; prints 98
- **D.** Runtime exception

**Correct Answer:** No error; prints b

**Explanation:** `c++` increments the char code (97→98), which prints as 'b'. (`char` supports `++` via implicit int arithmetic.)

---

## Question 78

**Question:** What happens?

```java
Integer a = 1000, b = 1000;
System.out.println(a.equals(b));
```

**Choices:**
- **A.** No error; prints false
- **B.** No error; prints true
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** No error; prints true

**Explanation:** `equals` compares values, so even outside the cache it prints true (unlike `==`, which would be false at 1000).

---

## Question 79

**Question:** What happens?

```java
new ArrayList<Integer>(-1);
```

**Choices:**
- **A.** Compile error
- **B.** No error; empty list
- **C.** Runtime: IllegalArgumentException
- **D.** Runtime: NegativeArraySizeException

**Correct Answer:** Runtime: IllegalArgumentException

**Explanation:** `ArrayList(int initialCapacity)` throws `IllegalArgumentException` ("Illegal Capacity: -1") for a negative capacity.

---

## Question 80

**Question:** What happens?

```java
String s = "racecar";
System.out.println(s.charAt(-1));
```

**Choices:**
- **A.** No error; prints r
- **B.** Compile error
- **C.** Runtime: ArrayIndexOutOfBoundsException
- **D.** Runtime: StringIndexOutOfBoundsException

**Correct Answer:** Runtime: StringIndexOutOfBoundsException

**Explanation:** A negative index to `charAt` throws `StringIndexOutOfBoundsException`.

---

## Question 81

**Question:** What happens?

```java
Object o = new int[3];
System.out.println(o instanceof int[]);
```

**Choices:**
- **A.** No error; prints true
- **B.** Compile error
- **C.** No error; prints false
- **D.** Runtime exception

**Correct Answer:** No error; prints true

**Explanation:** Arrays are objects; an `int[]` referenced as `Object` is indeed an instance of `int[]`.

---

## Question 82

**Question:** What happens?

```java
int x = (int) 3.99;
System.out.println(x);
```

**Choices:**
- **A.** No error; prints 4
- **B.** No error; prints 3
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** No error; prints 3

**Explanation:** Casting `double` to `int` truncates toward zero (no rounding), giving 3.

---

## Question 83

**Question:** What happens?

```java
List<String> list = List.of("a", "b");
list.set(0, "z");
```

**Choices:**
- **A.** No error; list becomes [z, b]
- **B.** Compile error
- **C.** Runtime: UnsupportedOperationException
- **D.** Runtime: IndexOutOfBoundsException

**Correct Answer:** Runtime: UnsupportedOperationException

**Explanation:** `List.of(...)` returns an immutable list; any mutation, including `set`, throws `UnsupportedOperationException`.

---

## Question 84

**Question:** What happens?

```java
int x = 5;
System.out.println(x == 5 ? "five" : 5);
```

**Choices:**
- **A.** Compile error
- **B.** No error; prints 5
- **C.** Runtime exception
- **D.** No error; prints five

**Correct Answer:** No error; prints five

**Explanation:** The ternary's branches are `String` and `int`; the common type resolves so `println` prints "five". (It compiles; the two branch types unify to a printable value.)

---

## Question 85

**Question:** What happens?

```java
public class T {
    int x = y;
    int y = 5;
}
```

**Choices:**
- **A.** Compile error
- **B.** No error; x is 0
- **C.** No error; x is 5
- **D.** Runtime exception

**Correct Answer:** Compile error

**Explanation:** "Illegal forward reference": `x`'s initializer refers to `y`, which is declared later. (Reordering the fields would fix it.)

---

## Question 86

**Question:** What happens?

```java
int[] a = {1, 2, 3};
int[] b = a;
b[0] = 99;
System.out.println(a[0]);
```

**Choices:**
- **A.** No error; prints 1
- **B.** No error; prints 99
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** No error; prints 99

**Explanation:** `b = a` copies the reference; both point to the same array, so mutating through `b` is visible via `a`.

---

## Question 87

**Question:** What happens?

```java
try {
    System.exit(0);
} finally {
    System.out.println("finally");
}
```

**Choices:**
- **A.** No error; prints finally
- **B.** Compile error
- **C.** No error; prints nothing
- **D.** Runtime exception

**Correct Answer:** No error; prints nothing

**Explanation:** `System.exit(0)` terminates the JVM immediately; the `finally` block does **not** run — a famous exception to "finally always runs".

---

## Question 88

**Question:** What happens?

```java
String s = "5";
int x = s;
```

**Choices:**
- **A.** No error; x becomes 5
- **B.** Runtime: NumberFormatException
- **C.** Runtime: ClassCastException
- **D.** Compile error

**Correct Answer:** Compile error

**Explanation:** A `String` cannot be assigned to an `int`; "incompatible types". You'd need `Integer.parseInt(s)`.

---

## Question 89

**Question:** What happens?

```java
System.out.println(0.1 + 0.2 == 0.3);
```

**Choices:**
- **A.** No error; prints false
- **B.** No error; prints true
- **C.** Compile error
- **D.** Runtime exception

**Correct Answer:** No error; prints false

**Explanation:** Floating-point rounding makes `0.1 + 0.2` = 0.30000000000000004, so the equality is false — no error, just a classic surprise.

---

## Question 90

**Question:** What happens?

```java
int count = 0;
for (int i = 0; i < 5; i++);
    count++;
System.out.println(count);
```

**Choices:**
- **A.** No error; prints 5
- **B.** No error; prints 1
- **C.** Compile error
- **D.** No error; prints 0

**Correct Answer:** No error; prints 1

**Explanation:** The `;` after the `for` header is the (empty) loop body, so `count++` runs once after the loop — printing 1, not 5.

---

## Question 91

**Question:** What happens?

```java
Integer i = 42;
switch (i) {
    case 42: System.out.println("yes"); break;
    default: System.out.println("no");
}
```

**Choices:**
- **A.** Compile error
- **B.** Runtime: NullPointerException
- **C.** No error; prints yes
- **D.** No error; prints no

**Correct Answer:** No error; prints yes

**Explanation:** `switch` unboxes the non-null `Integer` to `int`; it matches case 42 and prints "yes". (A null `Integer` here would throw NPE.)

---

## Question 92

**Question:** What happens?

```java
Integer i = null;
switch (i) {
    case 1: break;
    default: break;
}
```

**Choices:**
- **A.** No error; hits default
- **B.** Compile error
- **C.** No error; skips switch
- **D.** Runtime: NullPointerException

**Correct Answer:** Runtime: NullPointerException

**Explanation:** `switch` on an `Integer` unboxes it; unboxing `null` throws `NullPointerException`.

---

## Question 93

**Question:** What happens?

```java
class A { A() { this(5); } A(int x) { this(); } }
```

**Choices:**
- **A.** Compile error
- **B.** No error
- **C.** Runtime: StackOverflowError
- **D.** Runtime exception

**Correct Answer:** Compile error

**Explanation:** The two constructors call each other via `this(...)`, forming a recursive constructor invocation the compiler detects and rejects.

---

## Question 94

**Question:** What happens?

```java
List<Integer> l = new ArrayList<>(List.of(1, 2, 3));
l.removeIf(x -> x == 2);
System.out.println(l);
```

**Choices:**
- **A.** Runtime: ConcurrentModificationException
- **B.** No error; prints [1, 3]
- **C.** Compile error
- **D.** Runtime: UnsupportedOperationException

**Correct Answer:** No error; prints [1, 3]

**Explanation:** `removeIf` safely removes matching elements without a `ConcurrentModificationException`, and the list is mutable (wrapped in a new `ArrayList`), giving [1, 3].

---

## Question 95

**Question:** What happens?

```java
public static <T> T[] make() {
    return (T[]) new Object[5];
}
String[] s = make();
```

**Choices:**
- **A.** Compile error
- **B.** No error
- **C.** Runtime: ClassCastException
- **D.** Runtime: ArrayStoreException

**Correct Answer:** Runtime: ClassCastException

**Explanation:** Erasure makes the unchecked cast compile (with a warning), but assigning an actual `Object[]` to `String[]` fails at runtime with `ClassCastException` — the "heap pollution" trap.

---

## Question 96

**Question:** What happens?

```java
double d = 9;
int x = d;
```

**Choices:**
- **A.** No error; x becomes 9
- **B.** Runtime exception
- **C.** No error; x becomes 0
- **D.** Compile error

**Correct Answer:** Compile error

**Explanation:** Even though 9 fits, `double`→`int` is a narrowing conversion that requires an explicit cast; assigning a `double` variable to `int` is a compile error.

---

## Question 97

**Question:** What happens?

```java
System.out.println(true ? "a" : throwError());
static String throwError() { throw new RuntimeException(); }
```

**Choices:**
- **A.** No error; prints a
- **B.** Runtime: RuntimeException
- **C.** Compile error
- **D.** No error; prints nothing

**Correct Answer:** No error; prints a

**Explanation:** The condition is `true`, so only the "a" branch is evaluated; the `throwError()` branch is never called. (Ternary evaluates only the taken branch.)

---

## Question 98

**Question:** What happens?

```java
byte b1 = 10, b2 = 20;
byte b3 = b1 + b2;
```

**Choices:**
- **A.** No error; b3 becomes 30
- **B.** Compile error
- **C.** Runtime: overflow
- **D.** No error; b3 becomes 0

**Correct Answer:** Compile error

**Explanation:** Arithmetic on `byte` promotes to `int`, so `b1 + b2` is an `int`; assigning it back to `byte` without a cast is a compile error ("possible lossy conversion").

---

## Question 99

**Question:** What happens?

```java
String s = "hello";
StringBuilder sb = new StringBuilder(s);
System.out.println(sb.equals(s));
```

**Choices:**
- **A.** No error; prints true
- **B.** Compile error
- **C.** No error; prints false
- **D.** Runtime exception

**Correct Answer:** No error; prints false

**Explanation:** `StringBuilder` does not override `equals` to compare content with `String`, so it uses reference identity and prints false (a different object, different type).

---

## Question 100

**Question:** What happens?

```java
public static void main(String[] args) {
    try {
        recurse(0);
    } catch (StackOverflowError e) {
        System.out.println("caught");
    }
}
static void recurse(int n) { recurse(n + 1); }
```

**Choices:**
- **A.** Compile error
- **B.** Runtime: StackOverflowError propagates
- **C.** No error; prints nothing
- **D.** No error; prints caught

**Correct Answer:** No error; prints caught

**Explanation:** `StackOverflowError` is a `Throwable` (an `Error`), and `catch` can catch it. Though catching `Error` is discouraged, here it is caught and prints "caught" — a trap for those who think only `Exception` is catchable.

---

### How to use this set
Cover the choices and predict the outcome before revealing. Track which category fools you most: **compile-time** (types, definite assignment, unreachable code, checked exceptions), **runtime** (NPE, out-of-bounds, ClassCast, Arithmetic, UnsupportedOperation), or **no-error traps** (integer division, overflow, autoboxing cache, immutability, `finally`/`System.exit`).
