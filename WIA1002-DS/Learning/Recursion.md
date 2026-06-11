# Recursion Revision Notes

# Part 1: What is Recursion?

## Simple Meaning

Recursion means:

A method calls itself.

It is also known as self-invocation.

Example:

```java
public static void hello() {
    hello();
}
````

This method calls itself.

But this example is dangerous because it never stops.

---

## Real-Life Idea

Imagine standing between two mirrors.

You see:

```text
You inside mirror
    inside mirror
        inside mirror
            inside mirror
                ...
```

That is recursion.

Something repeats itself in a smaller version.

---

## Programming Example

A recursive method looks like this:

```java
public static void method() {
    method();
}
```

The method calls itself.

But correct recursion cannot call itself forever.

It needs a stopping point.

---

# Part 2: Two Important Parts of Recursion

Every recursive method must have:

```text
1. Base case
2. Recursive case
```

---

## Base Case

The base case is the stopping condition.

It tells the method:

```text
Stop calling yourself.
```

Example:

```java
if (n == 0) {
    return 1;
}
```

Without a base case, recursion becomes infinite.

---

## Recursive Case

The recursive case is the part where the method calls itself.

Example:

```java
return n * factorial(n - 1);
```

This line calls:

```java
factorial(n - 1)
```

So the method is calling itself with a smaller value.

---

## Most Important Rule

Every recursive call must move closer to the base case.

Example:

```java
factorial(n - 1)
```

If `n` is 5:

```text
factorial(5)
factorial(4)
factorial(3)
factorial(2)
factorial(1)
factorial(0)
```

It moves closer to 0.

Then it stops.

---

## Recursion Memory Trick

```text
Base case = stop

Recursive case = call itself

Progress = move closer to stop
```

If any one of these is missing, recursion is wrong.

---

# Part 3: Bad Recursion Example

```java
public static void count(int n) {
    System.out.println(n);
    count(n + 1);
}
```

Call:

```java
count(1);
```

It becomes:

```text
count(1)
count(2)
count(3)
count(4)
count(5)
...
```

It never stops.

Why?

Because there is no base case.

---

# Part 4: Better Recursion Example

```java
public static void countDown(int n) {
    if (n == 0) {
        return;
    }

    System.out.println(n);
    countDown(n - 1);
}
```

Call:

```java
countDown(5);
```

Output:

```text
5
4
3
2
1
```

When `n == 0`, the method stops.

---

## Code Flow

```text
countDown(5)
    print 5
    countDown(4)
        print 4
        countDown(3)
            print 3
            countDown(2)
                print 2
                countDown(1)
                    print 1
                    countDown(0)
                        stop
```

This is recursion.

---

# Part 5: General Recursion Template

Most recursive methods follow this pattern:

```java
public static returnType method(parameter) {
    if (base case condition) {
        return base case answer;
    }

    return recursive case;
}
```

Example:

```java
public static int method(int n) {
    if (n == 0) {
        return 0;
    }

    return method(n - 1);
}
```

---

# Part 6: Factorial Recursion

## What is Factorial?

Factorial means multiplying a number down to 1.

Example:

```text
3! = 3 × 2 × 1 = 6
```

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

So:

```text
n! = n × (n - 1) × (n - 2) × ... × 1
```

---

## Recursive Definition

Factorial can be defined as:

```text
0! = 1
n! = n × (n - 1)!
```

In method form:

```text
factorial(0) = 1
factorial(n) = n × factorial(n - 1)
```

---

## Why Factorial is Suitable for Recursion

Look at this:

```text
5! = 5 × 4!
```

And:

```text
4! = 4 × 3!
```

And:

```text
3! = 3 × 2!
```

So factorial keeps reducing into a smaller version of itself.

That is recursion.

---

## Factorial Java Code

```java
public static long factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```

---

## Base Case

```java
if (n == 0) {
    return 1;
}
```

Meaning:

When `n` becomes 0, stop recursion.

---

## Recursive Case

```java
return n * factorial(n - 1);
```

Meaning:

To calculate `factorial(n)`, calculate `factorial(n - 1)` first.

Example:

```text
factorial(4) = 4 × factorial(3)
```

---

## Trace factorial(4)

Call:

```java
factorial(4)
```

Expansion phase:

```text
factorial(4)
= 4 × factorial(3)
= 4 × (3 × factorial(2))
= 4 × (3 × (2 × factorial(1)))
= 4 × (3 × (2 × (1 × factorial(0))))
```

Now reach base case:

```text
factorial(0) = 1
```

Return phase:

```text
= 4 × (3 × (2 × (1 × 1)))
= 4 × (3 × (2 × 1))
= 4 × (3 × 2)
= 4 × 6
= 24
```

Final answer:

```text
factorial(4) = 24
```

---

## Two Phases of Recursion

Recursion has two phases:

```text
1. Going down
2. Coming back up
```

---

## Phase 1: Going Down

The method keeps calling itself:

```text
factorial(4)
factorial(3)
factorial(2)
factorial(1)
factorial(0)
```

This phase stops when it reaches the base case.

---

## Phase 2: Coming Back Up

After reaching the base case, Java returns values back upward:

```text
factorial(0) returns 1
factorial(1) returns 1 × 1 = 1
factorial(2) returns 2 × 1 = 2
factorial(3) returns 3 × 2 = 6
factorial(4) returns 4 × 6 = 24
```

---

## Stack View for factorial(4)

Think of it like plates stacked on top of each other.

```text
Top
factorial(0)
factorial(1)
factorial(2)
factorial(3)
factorial(4)
Bottom
```

When `factorial(0)` returns, the stack starts removing from the top.

---

## Better Factorial Version with Input Checking

```java
public static long factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("n must be non-negative");
    }

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

This prevents negative input.

---

# Part 7: Common Recursion Errors

A correct recursive method needs:

```text
1. Base case
2. Recursive case
3. Movement toward base case
```

If the method does not reach the base case, it will keep calling itself forever.

This causes:

```text
StackOverflowError
```

---

# Tutorial Question 1

```java
public static int f(int n) {
    if (n == 1)
        return n;
    else 
        return n * f(n - 1);
}
```

Question:

```text
Explain the problem that occurs when executing f(0).
```

---

## Identify Base Case

The base case is:

```java
if (n == 1)
    return n;
```

So this method stops only when:

```text
n == 1
```

---

## What Happens When We Call f(0)?

Call:

```java
f(0)
```

Check:

```java
if (n == 1)
```

Is `0 == 1`?

```text
No.
```

So it goes to:

```java
return n * f(n - 1);
```

Meaning:

```java
return 0 * f(-1);
```

Java still needs to calculate:

```java
f(-1)
```

before it can complete the multiplication.

---

## Trace f(0)

```text
f(0)
= 0 * f(-1)

f(-1)
= -1 * f(-2)

f(-2)
= -2 * f(-3)

f(-3)
= -3 * f(-4)

...
```

It keeps going:

```text
0, -1, -2, -3, -4, ...
```

It will never reach:

```text
n == 1
```

So it never stops.

---

## Problem in One Sentence

```text
f(0) causes infinite recursion because n keeps decreasing away from the base case n == 1.
```

Eventually, the program crashes with:

```text
StackOverflowError
```

---

## How to Fix Question 1

This method looks like factorial.

For factorial, the base case should be:

```java
if (n == 0)
    return 1;
```

Correct version:

```java
public static int f(int n) {
    if (n == 0)
        return 1;
    else
        return n * f(n - 1);
}
```

Now:

```java
f(0)
```

returns:

```text
1
```

and stops.

---

# Tutorial Question 2

```java
public static int f(int n) {
    if (n == 0)
        return n;
    else 
        return f(n + 1) + n;
}
```

Question:

```text
Explain the problem that occurs when executing the recursive method f().
```

---

## Identify Base Case

Base case:

```java
if (n == 0)
    return n;
```

So the method stops only when:

```text
n == 0
```

---

## Recursive Case

```java
return f(n + 1) + n;
```

This means the method calls itself with a bigger number.

Example:

```java
f(1)
```

becomes:

```java
f(2) + 1
```

Then:

```java
f(2)
```

becomes:

```java
f(3) + 2
```

---

## Why This is Wrong

If we start with positive `n`, the value moves:

```text
1 → 2 → 3 → 4 → 5 → ...
```

But the base case is:

```text
n == 0
```

So the method is moving away from the base case.

It will never reach 0.

---

## Trace f(1)

```text
f(1)
= f(2) + 1

f(2)
= f(3) + 2

f(3)
= f(4) + 3

f(4)
= f(5) + 4

...
```

It never stops.

Eventually:

```text
StackOverflowError
```

---

## Problem in One Sentence

```text
The method causes infinite recursion for positive n because the recursive call uses f(n + 1), which moves further away from the base case n == 0.
```

---

## How to Fix Question 2

If the method wants to calculate:

```text
n + (n - 1) + ... + 0
```

then it should call:

```java
f(n - 1)
```

not:

```java
f(n + 1)
```

Correct version:

```java
public static int f(int n) {
    if (n == 0)
        return 0;
    else
        return f(n - 1) + n;
}
```

Example:

```text
f(5)
= f(4) + 5
= f(3) + 4 + 5
= f(2) + 3 + 4 + 5
= f(1) + 2 + 3 + 4 + 5
= f(0) + 1 + 2 + 3 + 4 + 5
= 0 + 1 + 2 + 3 + 4 + 5
= 15
```

---

## Common Recursion Errors Summary

```text
1. No base case
2. Wrong base case
3. Recursive call moves away from base case
4. Input value can skip or never reach base case
5. Recursive call does not reduce the problem
6. Infinite recursion causes StackOverflowError
```

Most important rule:

```text
Every recursive call must make the problem smaller and closer to the base case.
```

---

# Part 8: Recursive Sum

Problem:

```text
Calculate:

5 + 4 + 3 + 2 + 1
```

Answer:

```text
15
```

---

## Think Recursively

To calculate:

```text
sum(5)
```

we can say:

```text
sum(5) = 5 + sum(4)
```

Then:

```text
sum(4) = 4 + sum(3)
sum(3) = 3 + sum(2)
sum(2) = 2 + sum(1)
sum(1) = 1
```

Now it stops.

---

## Base Case

```java
if (n == 1)
    return 1;
```

Why?

Because:

```text
sum(1) = 1
```

---

## Recursive Case

```java
return n + sum(n - 1);
```

Why?

Because:

```text
sum(n) = n + sum(n - 1)
```

Example:

```text
sum(5) = 5 + sum(4)
```

The problem becomes smaller because `n` decreases.

```text
5 → 4 → 3 → 2 → 1
```

---

## Java Code

```java
public static int sum(int n) {
    if (n == 1) {
        return 1;
    } else {
        return n + sum(n - 1);
    }
}
```

---

## Trace sum(5)

Expansion phase:

```text
sum(5)
= 5 + sum(4)
= 5 + (4 + sum(3))
= 5 + (4 + (3 + sum(2)))
= 5 + (4 + (3 + (2 + sum(1))))
```

Base case:

```text
sum(1) = 1
```

Return phase:

```text
= 5 + (4 + (3 + (2 + 1)))
= 5 + (4 + (3 + 3))
= 5 + (4 + 6)
= 5 + 10
= 15
```

---

## Code Flow

```text
sum(5)
    n is not 1
    return 5 + sum(4)

    sum(4)
        n is not 1
        return 4 + sum(3)

        sum(3)
            n is not 1
            return 3 + sum(2)

            sum(2)
                n is not 1
                return 2 + sum(1)

                sum(1)
                    n is 1
                    return 1
```

Then Java returns upward:

```text
sum(1) = 1
sum(2) = 2 + 1 = 3
sum(3) = 3 + 3 = 6
sum(4) = 4 + 6 = 10
sum(5) = 5 + 10 = 15
```

---

## Safer Sum Version

```java
public static int sum(int n) {
    if (n <= 0) {
        return 0;
    } else {
        return n + sum(n - 1);
    }
}
```

Now:

```text
sum(5) = 15
sum(0) = 0
```

But for the tutorial question, use:

```java
if (n == 1)
    return 1;
```

because the question specifically says base case is 1.

---

## Full Test Code

```java
public class SumRecursion {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}
```

Output:

```text
15
```

---

# Part 9: Reverse String Recursion

Problem:

```text
String → gnirtS
```

Input:

```text
"String"
```

Output:

```text
"gnirtS"
```

---

## Think Recursively

To reverse `"String"`:

```text
reverse("String")
```

Take the first character:

```text
S
```

Then reverse the rest:

```text
"tring"
```

So:

```text
reverse("String") = reverse("tring") + "S"
```

Then:

```text
reverse("tring") = reverse("ring") + "t"
reverse("ring") = reverse("ing") + "r"
reverse("ing") = reverse("ng") + "i"
reverse("ng") = reverse("g") + "n"
reverse("g") = "g"
```

Now return upward.

---

## Base Case

```java
if (str.length() <= 1) {
    return str;
}
```

Why?

Because if the string has only one character, it is already reversed.

Example:

```text
reverse("g") = "g"
```

Also:

```text
reverse("") = ""
```

An empty string is also already reversed.

---

## Recursive Case

```java
return reverse(str.substring(1)) + str.charAt(0);
```

Meaning:

Reverse the rest of the string, then put the first character at the back.

Example:

```text
reverse("String") = reverse("tring") + "S"
```

---

## Java Code

```java
public static String reverse(String str) {
    if (str.length() <= 1) {
        return str;
    } else {
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
```

---

## Understanding substring(1)

For:

```java
str = "String";
```

Index:

```text
S  t  r  i  n  g
0  1  2  3  4  5
```

```java
"String".substring(1)
```

returns:

```text
"tring"
```

---

## Understanding charAt(0)

For:

```java
str = "String";
```

```java
str.charAt(0)
```

returns:

```text
'S'
```

So:

```java
return reverse(str.substring(1)) + str.charAt(0);
```

becomes:

```text
reverse("tring") + "S"
```

---

## Trace reverse("String")

Expansion phase:

```text
reverse("String")
= reverse("tring") + "S"

reverse("tring")
= reverse("ring") + "t"

reverse("ring")
= reverse("ing") + "r"

reverse("ing")
= reverse("ng") + "i"

reverse("ng")
= reverse("g") + "n"

reverse("g")
= "g"
```

Return phase:

```text
reverse("ng")
= "g" + "n"
= "gn"

reverse("ing")
= "gn" + "i"
= "gni"

reverse("ring")
= "gni" + "r"
= "gnir"

reverse("tring")
= "gnir" + "t"
= "gnirt"

reverse("String")
= "gnirt" + "S"
= "gnirtS"
```

Final answer:

```text
gnirtS
```

---

## Full Test Code

```java
public class ReverseStringRecursion {
    public static void main(String[] args) {
        String word = "String";

        System.out.println(reverse(word));
    }

    public static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
```

Output:

```text
gnirtS
```

---

## Another Reverse String Method

Using the last character first:

```java
public static String reverse(String str) {
    if (str.length() <= 1) {
        return str;
    } else {
        return str.charAt(str.length() - 1)
                + reverse(str.substring(0, str.length() - 1));
    }
}
```

Example:

```text
reverse("String")
= "g" + reverse("Strin")
= "g" + "n" + reverse("Stri")
= "g" + "n" + "i" + reverse("Str")
= "g" + "n" + "i" + "r" + reverse("St")
= "g" + "n" + "i" + "r" + "t" + reverse("S")
= "gnirtS"
```

Both versions are correct.

---

## Common Mistake 1

Wrong version:

```java
public static String reverse(String str) {
    return reverse(str.substring(1)) + str.charAt(0);
}
```

Problem:

```text
No base case.
```

Eventually the string becomes empty, then:

```java
str.charAt(0)
```

causes an error because there is no character at index 0.

---

## Common Mistake 2

Wrong logic:

```java
return str.charAt(0) + reverse(str.substring(1));
```

This does not reverse the string.

It keeps the first character in front.

Correct logic:

```java
return reverse(str.substring(1)) + str.charAt(0);
```

Because the first character must move to the back.

---

# Part 10: printDigit Recursion

Problem:

```text
Write a recursive method printDigit that prints an integer argument as its constituent digits,
with a blank space separating each digit.

Example:
4567 → 4 5 6 7
```

---

## Important Operators

To solve this, we need:

```java
n % 10
```

This gets the last digit.

Example:

```text
4567 % 10 = 7
```

---

```java
n / 10
```

This removes the last digit.

Example:

```text
4567 / 10 = 456
```

Because integer division removes the decimal part.

---

## Example

For:

```text
4567
```

Last digit:

```text
4567 % 10 = 7
```

Remaining number:

```text
4567 / 10 = 456
```

Then:

```text
456 % 10 = 6
456 / 10 = 45
```

Then:

```text
45 % 10 = 5
45 / 10 = 4
```

Then:

```text
4 % 10 = 4
4 / 10 = 0
```

---

## But We Need Left to Right

If we immediately print `n % 10`, we get:

```text
7 6 5 4
```

That is wrong.

We want:

```text
4 5 6 7
```

So the trick is:

```text
First recursively process n / 10,
then print n % 10.
```

---

## Recursive Idea

```text
printDigit(4567)
= printDigit(456), then print 7

printDigit(456)
= printDigit(45), then print 6

printDigit(45)
= printDigit(4), then print 5

printDigit(4)
= print 4
```

So output becomes:

```text
4 5 6 7
```

---

## Base Case

```java
if (n < 10)
```

Why?

Because a number less than 10 has only one digit.

Example:

```text
4
```

Already one digit.

So just print it.

```java
System.out.print(n + " ");
```

---

## Recursive Case

```java
printDigit(n / 10);
System.out.print(n % 10 + " ");
```

Meaning:

Print all digits before the last digit first.

Then print the last digit.

---

## Java Code

```java
public static void printDigit(int n) {
    if (n < 10) {
        System.out.print(n + " ");
    } else {
        printDigit(n / 10);
        System.out.print(n % 10 + " ");
    }
}
```

---

## Full Test Code

```java
public class PrintDigitRecursion {
    public static void main(String[] args) {
        printDigit(4567);
    }

    public static void printDigit(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printDigit(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
```

Output:

```text
4 5 6 7
```

---

## Trace printDigit(4567)

```text
printDigit(4567)
    n is not less than 10
    call printDigit(456)

    printDigit(456)
        n is not less than 10
        call printDigit(45)

        printDigit(45)
            n is not less than 10
            call printDigit(4)

            printDigit(4)
                n is less than 10
                print 4

            print 5

        print 6

    print 7
```

Output:

```text
4 5 6 7
```

---

## Why Print After Recursion?

Code:

```java
printDigit(n / 10);
System.out.print(n % 10 + " ");
```

For 4567:

```text
printDigit(456) happens first
print 7 happens later
```

That is why the digits print from left to right.

---

## What If We Reverse the Order?

Wrong version:

```java
System.out.print(n % 10 + " ");
printDigit(n / 10);
```

For:

```java
printDigit(4567)
```

Output becomes:

```text
7 6 5 4
```

That prints from right to left.

---

## Safer Version for Negative Numbers

```java
public static void printDigit(int n) {
    if (n < 0) {
        System.out.print("- ");
        printDigit(-n);
    } else if (n < 10) {
        System.out.print(n + " ");
    } else {
        printDigit(n / 10);
        System.out.print(n % 10 + " ");
    }
}
```

Example:

```java
printDigit(-4567);
```

Output:

```text
- 4 5 6 7
```

For tutorial, the positive-number version is enough.

---

# Part 11: Fibonacci Recursion

## What is Fibonacci?

Fibonacci starts with:

```text
fib(0) = 0
fib(1) = 1
```

Then:

```text
fib(2) = fib(1) + fib(0) = 1 + 0 = 1
fib(3) = fib(2) + fib(1) = 1 + 1 = 2
fib(4) = fib(3) + fib(2) = 2 + 1 = 3
fib(5) = fib(4) + fib(3) = 3 + 2 = 5
```

Sequence:

```text
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

---

## Recursive Definition

```text
fib(0) = 0
fib(1) = 1
fib(index) = fib(index - 1) + fib(index - 2), index >= 2
```

---

## Base Cases

```java
if (index == 0) {
    return 0;
}

if (index == 1) {
    return 1;
}
```

Because Fibonacci already defines:

```text
fib(0) = 0
fib(1) = 1
```

---

## Recursive Case

```java
return fib(index - 1) + fib(index - 2);
```

Meaning:

To find the current Fibonacci number, add the previous two Fibonacci numbers.

Example:

```text
fib(5) = fib(4) + fib(3)
```

---

## Java Code

```java
public static int fib(int index) {
    if (index == 0) {
        return 0;
    } else if (index == 1) {
        return 1;
    } else {
        return fib(index - 1) + fib(index - 2);
    }
}
```

Shorter version:

```java
public static int fib(int index) {
    if (index <= 1) {
        return index;
    }

    return fib(index - 1) + fib(index - 2);
}
```

---

## Trace fib(3)

```text
fib(3)
= fib(2) + fib(1)
= (fib(1) + fib(0)) + fib(1)
= (1 + 0) + 1
= 2
```

So:

```text
fib(3) = 2
```

---

## Trace fib(5)

```text
fib(5)
= fib(4) + fib(3)
```

Expand:

```text
fib(4)
= fib(3) + fib(2)

fib(3)
= fib(2) + fib(1)

fib(2)
= fib(1) + fib(0)
```

Base cases:

```text
fib(1) = 1
fib(0) = 0
```

Calculate upward:

```text
fib(2) = 1 + 0 = 1
fib(3) = fib(2) + fib(1) = 1 + 1 = 2
fib(4) = fib(3) + fib(2) = 2 + 1 = 3
fib(5) = fib(4) + fib(3) = 3 + 2 = 5
```

So:

```text
fib(5) = 5
```

---

## Call Tree for fib(5)

```text
fib(5)
├── fib(4)
│   ├── fib(3)
│   │   ├── fib(2)
│   │   │   ├── fib(1)
│   │   │   └── fib(0)
│   │   └── fib(1)
│   └── fib(2)
│       ├── fib(1)
│       └── fib(0)
└── fib(3)
    ├── fib(2)
    │   ├── fib(1)
    │   └── fib(0)
    └── fib(1)
```

Notice some values are repeated many times:

```text
fib(3)
fib(2)
fib(1)
```

This is why simple Fibonacci recursion is slow for large numbers.

---

## Why Fibonacci Recursion is Slower Than Factorial

Factorial has one recursive call:

```java
return n * factorial(n - 1);
```

Call chain:

```text
factorial(5)
→ factorial(4)
→ factorial(3)
→ factorial(2)
→ factorial(1)
→ factorial(0)
```

Fibonacci has two recursive calls:

```java
return fib(index - 1) + fib(index - 2);
```

It branches:

```text
fib(5)
→ fib(4) and fib(3)
→ fib(3), fib(2), fib(2), fib(1)
→ ...
```

That means it repeats a lot of work.

---

## Full Test Code

```java
public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
    }

    public static int fib(int index) {
        if (index <= 1) {
            return index;
        }

        return fib(index - 1) + fib(index - 2);
    }
}
```

Output:

```text
0
1
1
2
3
5
8
```

---

## Print First 10 Fibonacci Numbers

```java
public class FibonacciPrint {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int index) {
        if (index <= 1) {
            return index;
        }

        return fib(index - 1) + fib(index - 2);
    }
}
```

Output:

```text
0 1 1 2 3 5 8 13 21 34
```

---

## Common Fibonacci Mistake 1

Wrong:

```java
public static int fib(int index) {
    if (index == 0) {
        return 0;
    }

    return fib(index - 1) + fib(index - 2);
}
```

Problem:

Missing base case for `index == 1`.

If we call:

```java
fib(1)
```

It becomes:

```text
fib(0) + fib(-1)
```

`fib(-1)` will continue wrongly.

---

## Common Fibonacci Mistake 2

Wrong:

```java
public static int fib(int index) {
    if (index <= 1) {
        return index;
    }

    return fib(index + 1) + fib(index + 2);
}
```

Problem:

`index` becomes larger and moves away from 0 or 1.

This causes infinite recursion.

---

## Common Fibonacci Mistake 3

Wrong:

```java
return index + fib(index - 1);
```

This calculates something like sum, not Fibonacci.

Correct Fibonacci:

```java
return fib(index - 1) + fib(index - 2);
```

because each Fibonacci number depends on the previous two numbers.

---

# Part 12: Recursion vs Iteration

## What is Recursion?

Recursion means:

```text
A method calls itself.
```

Example:

```java
public static int sum(int n) {
    if (n == 1) {
        return 1;
    }

    return n + sum(n - 1);
}
```

This method calls itself here:

```java
sum(n - 1)
```

---

## What is Iteration?

Iteration means repeating using a loop.

Examples:

```java
for
while
do-while
```

Example:

```java
public static int sumLoop(int n) {
    int total = 0;

    while (n > 0) {
        total += n;
        n--;
    }

    return total;
}
```

This repeats using:

```java
while (n > 0)
```

---

## Same Problem, Two Methods

Calculate:

```text
5 + 4 + 3 + 2 + 1
```

---

## Recursive Version

```java
public static int sumRecursive(int n) {
    if (n == 1) {
        return 1;
    }

    return n + sumRecursive(n - 1);
}
```

Trace:

```text
sumRecursive(5)
= 5 + sumRecursive(4)
= 5 + 4 + sumRecursive(3)
= 5 + 4 + 3 + sumRecursive(2)
= 5 + 4 + 3 + 2 + sumRecursive(1)
= 5 + 4 + 3 + 2 + 1
= 15
```

---

## Iterative Version

```java
public static int sumLoop(int n) {
    int total = 0;

    while (n > 0) {
        total += n;
        n--;
    }

    return total;
}
```

Trace:

```text
n = 5, total = 0
total = 5

n = 4
total = 9

n = 3
total = 12

n = 2
total = 14

n = 1
total = 15

n = 0
stop
```

Result:

```text
15
```

Both methods give the same answer.

---

## Factorial Recursion vs Loop

Recursive factorial:

```java
public static long factorialRecursive(int n) {
    if (n == 0) {
        return 1;
    }

    return n * factorialRecursive(n - 1);
}
```

Iterative factorial:

```java
public static long factorialLoop(int n) {
    long result = 1;

    while (n > 0) {
        result *= n;
        n--;
    }

    return result;
}
```

---

## Trace factorialLoop(4)

Initial:

```text
result = 1
n = 4
```

Loop:

```text
result = result * n = 1 * 4 = 4
n becomes 3
```

Loop:

```text
result = result * n = 4 * 3 = 12
n becomes 2
```

Loop:

```text
result = result * n = 12 * 2 = 24
n becomes 1
```

Loop:

```text
result = result * n = 24 * 1 = 24
n becomes 0
```

Stop because:

```java
n > 0
```

is false.

Return:

```text
24
```

---

## Main Difference

Recursion stops when base case is reached.

Example:

```java
if (n == 0) {
    return 1;
}
```

Iteration stops when loop condition becomes false.

Example:

```java
while (n > 0)
```

When `n` becomes 0, the condition becomes false and the loop stops.

---

## Memory Difference

Recursion uses stack memory.

Each recursive call creates a new stack frame.

Example:

```text
factorial(4)
factorial(3)
factorial(2)
factorial(1)
factorial(0)
```

Each call needs memory.

Iteration does not create new stack frames.

A loop repeats in the same method call.

---

## Error Difference

Recursion error:

```text
StackOverflowError
```

This happens when recursion never reaches base case.

Iteration error:

```text
Infinite loop
```

Example:

```java
while (true) {
    System.out.println("Hello");
}
```

This may keep running forever.

---

## Recursion vs Iteration Table

| Aspect     | Recursion                                           | Iteration             |
| ---------- | --------------------------------------------------- | --------------------- |
| Meaning    | Method calls itself                                 | Repeats using loop    |
| Stops when | Base case reached                                   | Loop condition false  |
| Memory     | Uses extra stack memory                             | Usually less memory   |
| Error      | StackOverflowError                                  | Infinite loop         |
| Good for   | Problems naturally split into smaller same problems | Simple repeated tasks |
| Example    | `factorial(n - 1)`                                  | `while (n > 0)`       |

---

## When Recursion is Better

Recursion is usually better when the problem naturally has smaller subproblems.

Examples:

```text
Tree traversal
Graph DFS
Backtracking
Divide and conquer
Factorial
Fibonacci
```

---

## When Iteration is Better

Iteration is usually better when the problem is simple repetition.

Examples:

```text
Print numbers 1 to 10
Calculate sum
Calculate factorial
Loop through array
Count items
```

For simple tasks, loops are often easier and use less memory.

---

## Important Exam Statement

```text
Recursion and iteration can often solve the same problem.
Recursion uses method calls and stops at a base case.
Iteration uses loops and stops when the loop condition becomes false.
Recursion may be easier for problems that naturally divide into smaller subproblems, but it uses extra stack memory.
```

---

# Part 13: How to Design Recursive Methods Yourself

When designing recursion, ask these 3 questions:

```text
1. What is the smallest/simple case?
2. How can I reduce the problem?
3. How do I combine the answer?
```

---

## Question 1: What is the Smallest Case?

This becomes the base case.

Examples:

Factorial:

```text
factorial(0) = 1
```

Base case:

```java
if (n == 0) {
    return 1;
}
```

Sum:

```text
sum(1) = 1
```

Base case:

```java
if (n == 1) {
    return 1;
}
```

Reverse string:

```text
reverse("a") = "a"
reverse("") = ""
```

Base case:

```java
if (str.length() <= 1) {
    return str;
}
```

Print digit:

```text
printDigit(4)
```

A one-digit number is already simple.

Base case:

```java
if (n < 10) {
    System.out.print(n + " ");
}
```

---

## Question 2: How Can I Reduce the Problem?

This becomes the recursive call.

Factorial:

```text
factorial(5) → factorial(4)
```

Recursive call:

```java
factorial(n - 1)
```

Sum:

```text
sum(5) → sum(4)
```

Recursive call:

```java
sum(n - 1)
```

Reverse string:

```text
reverse("String") → reverse("tring")
```

Recursive call:

```java
reverse(str.substring(1))
```

Print digit:

```text
printDigit(4567) → printDigit(456)
```

Recursive call:

```java
printDigit(n / 10)
```

---

## Question 3: How Do I Combine the Answer?

Factorial:

```text
factorial(5) = 5 × factorial(4)
```

Code:

```java
return n * factorial(n - 1);
```

Sum:

```text
sum(5) = 5 + sum(4)
```

Code:

```java
return n + sum(n - 1);
```

Reverse string:

```text
reverse("String") = reverse("tring") + "S"
```

Code:

```java
return reverse(str.substring(1)) + str.charAt(0);
```

Print digit:

```text
printDigit(4567) = printDigit(456), then print 7
```

Code:

```java
printDigit(n / 10);
System.out.print(n % 10 + " ");
```

---

# Part 14: Recursion Templates

## Return-Type Recursive Method

```java
public static returnType method(parameter) {
    if (base case condition) {
        return base case answer;
    }

    return smaller problem combined with current value;
}
```

Example:

```java
public static int sum(int n) {
    if (n == 1) {
        return 1;
    }

    return n + sum(n - 1);
}
```

---

## Void Recursive Method

Some recursive methods do not return a value.

Example:

```java
printDigit(4567);
```

It only prints.

Template:

```java
public static void method(parameter) {
    if (base case condition) {
        do something;
        return;
    }

    recursive call;
    do something;
}
```

Example:

```java
public static void printDigit(int n) {
    if (n < 10) {
        System.out.print(n + " ");
        return;
    }

    printDigit(n / 10);
    System.out.print(n % 10 + " ");
}
```

---

# Part 15: Print Before vs Print After Recursion

## Pattern 1: Recursion Before Action

Example:

```java
printDigit(n / 10);
System.out.print(n % 10 + " ");
```

This means:

```text
Go smaller first.
Then print.
```

For 4567, output:

```text
4 5 6 7
```

Because it reaches 4 first, then prints while returning.

---

## Pattern 2: Action Before Recursion

Example:

```java
System.out.print(n % 10 + " ");
printDigit(n / 10);
```

This means:

```text
Print first.
Then go smaller.
```

For 4567, output:

```text
7 6 5 4
```

So the order of recursion matters.

---

# Part 16: Print Numbers Down

Problem:

```text
Input: 5
Output: 5 4 3 2 1
```

Smallest case:

```text
n == 0
```

Reduce:

```text
n - 1
```

Print before recursion because we want descending order.

Code:

```java
public static void printDown(int n) {
    if (n == 0) {
        return;
    }

    System.out.print(n + " ");
    printDown(n - 1);
}
```

Trace:

```text
printDown(5)
print 5
printDown(4)
print 4
printDown(3)
print 3
printDown(2)
print 2
printDown(1)
print 1
printDown(0)
stop
```

Output:

```text
5 4 3 2 1
```

---

# Part 17: Print Numbers Up

Problem:

```text
Input: 5
Output: 1 2 3 4 5
```

Now we want smaller numbers printed first.

So recursive call comes before printing.

Code:

```java
public static void printUp(int n) {
    if (n == 0) {
        return;
    }

    printUp(n - 1);
    System.out.print(n + " ");
}
```

Trace:

```text
printUp(5)
    printUp(4)
        printUp(3)
            printUp(2)
                printUp(1)
                    printUp(0)
                    stop
                print 1
            print 2
        print 3
    print 4
print 5
```

Output:

```text
1 2 3 4 5
```

---

## Same Problem, Different Print Order

Descending:

```java
System.out.print(n + " ");
printDown(n - 1);
```

Output:

```text
5 4 3 2 1
```

Ascending:

```java
printUp(n - 1);
System.out.print(n + " ");
```

Output:

```text
1 2 3 4 5
```

The only difference is:

```text
Print before recursion or after recursion.
```

---

# Part 18: How to Trace Recursion Properly

Use this format:

```text
method(input)
    if not base case
    call method(smaller input)

        method(smaller input)
            if not base case
            call method(even smaller input)

                base case reached
                return

            continue previous method

        continue previous method
```

Always separate:

```text
1. Going down
2. Coming back up
```

---

## Example Trace: printUp(3)

Code:

```java
public static void printUp(int n) {
    if (n == 0) {
        return;
    }

    printUp(n - 1);
    System.out.print(n + " ");
}
```

Call:

```java
printUp(3);
```

Going down:

```text
printUp(3)
    printUp(2)
        printUp(1)
            printUp(0)
                return
```

Coming back up:

```text
printUp(1) prints 1
printUp(2) prints 2
printUp(3) prints 3
```

Output:

```text
1 2 3
```

---

# Part 19: Recursion Checklist

Before submitting recursive code, check:

```text
1. Do I have a base case?
2. Does the base case return or stop?
3. Does the recursive case call the same method?
4. Does the input become smaller or closer to base case?
5. Will every valid input eventually reach the base case?
```

If the answer to any one is no, your recursion is probably wrong.

---

# Part 20: Common Design Mistakes

## Mistake 1: No Base Case

```java
public static void f(int n) {
    f(n - 1);
}
```

Problem:

```text
Never stops.
```

---

## Mistake 2: Moves Away from Base Case

```java
public static void f(int n) {
    if (n == 0) {
        return;
    }

    f(n + 1);
}
```

If start with 5:

```text
5 → 6 → 7 → 8 → ...
```

Never reaches 0.

---

## Mistake 3: Wrong Base Case for Input

```java
public static int f(int n) {
    if (n == 1) {
        return 1;
    }

    return n * f(n - 1);
}
```

This works for:

```text
n = 5
```

But fails for:

```text
n = 0
```

Because:

```text
0 → -1 → -2 → ...
```

---

## Mistake 4: Recursive Call Does Not Reduce

```java
public static int f(int n) {
    if (n == 0) {
        return 0;
    }

    return f(n);
}
```

Problem:

```text
n never changes.
```

So it never gets closer to base case.

---

# Part 21: Quick Formula Table

| Problem        | Base Case           | Recursive Case                              |
| -------------- | ------------------- | ------------------------------------------- |
| Factorial      | `n == 0`            | `n * factorial(n - 1)`                      |
| Sum            | `n == 1`            | `n + sum(n - 1)`                            |
| Reverse string | `str.length() <= 1` | `reverse(str.substring(1)) + str.charAt(0)` |
| Print digit    | `n < 10`            | `printDigit(n / 10); print n % 10`          |
| Fibonacci      | `n <= 1`            | `fib(n - 1) + fib(n - 2)`                   |
| Print down     | `n == 0`            | `print n; printDown(n - 1)`                 |
| Print up       | `n == 0`            | `printUp(n - 1); print n`                   |

---

# Part 22: Important Viva Questions

## Question 1: What is recursion?

Recursion is a programming technique where a method calls itself.

---

## Question 2: What are the two main parts of recursion?

The two main parts are:

```text
1. Base case
2. Recursive case
```

Base case stops the recursion.

Recursive case calls the method itself with a smaller problem.

---

## Question 3: Why is base case important?

The base case prevents infinite recursion.

Without a base case, the method keeps calling itself until StackOverflowError occurs.

---

## Question 4: What is StackOverflowError?

StackOverflowError happens when too many method calls are stored in the call stack.

It usually happens when recursion never reaches the base case.

---

## Question 5: What is the base case for factorial?

```text
factorial(0) = 1
```

In Java:

```java
if (n == 0) {
    return 1;
}
```

---

## Question 6: What is the recursive case for factorial?

```java
return n * factorial(n - 1);
```

---

## Question 7: What is the base case for Fibonacci?

```text
fib(0) = 0
fib(1) = 1
```

In Java:

```java
if (index <= 1) {
    return index;
}
```

---

## Question 8: What is the recursive case for Fibonacci?

```java
return fib(index - 1) + fib(index - 2);
```

---

## Question 9: Why is Fibonacci recursion slow?

Because it makes two recursive calls and repeats the same calculations many times.

Example:

```text
fib(5)
```

calls:

```text
fib(4)
fib(3)
fib(3)
fib(2)
...
```

Some values are calculated again and again.

---

## Question 10: What is the difference between recursion and iteration?

Recursion uses method calls and stops at a base case.

Iteration uses loops and stops when the loop condition becomes false.

Recursion uses extra stack memory.

Iteration usually uses less memory.

---

## Question 11: Why does printDigit(4567) print in correct order?

Because the recursive call happens first:

```java
printDigit(n / 10);
System.out.print(n % 10 + " ");
```

This processes earlier digits first, then prints the last digit while returning.

---

## Question 12: How do you reverse a string recursively?

Use:

```java
return reverse(str.substring(1)) + str.charAt(0);
```

This reverses the rest of the string first, then moves the first character to the back.

---

# Part 23: Practice Questions

## Practice 1

Write recursion to print:

```text
5 4 3 2 1
```

Answer:

```java
public static void printDown(int n) {
    if (n == 0) {
        return;
    }

    System.out.print(n + " ");
    printDown(n - 1);
}
```

---

## Practice 2

Write recursion to print:

```text
1 2 3 4 5
```

Answer:

```java
public static void printUp(int n) {
    if (n == 0) {
        return;
    }

    printUp(n - 1);
    System.out.print(n + " ");
}
```

---

## Practice 3

Write recursion to calculate:

```text
1 + 2 + 3 + ... + n
```

Answer:

```java
public static int sum(int n) {
    if (n == 1) {
        return 1;
    }

    return n + sum(n - 1);
}
```

---

## Practice 4

Write recursion to calculate factorial.

Answer:

```java
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

---

## Practice 5

Write recursion to reverse a string.

Answer:

```java
public static String reverse(String str) {
    if (str.length() <= 1) {
        return str;
    }

    return reverse(str.substring(1)) + str.charAt(0);
}
```

---

## Practice 6

Write recursion to print digits of a number.

Answer:

```java
public static void printDigit(int n) {
    if (n < 10) {
        System.out.print(n + " ");
    } else {
        printDigit(n / 10);
        System.out.print(n % 10 + " ");
    }
}
```

---

## Practice 7

Write recursion to calculate Fibonacci.

Answer:

```java
public static int fib(int index) {
    if (index <= 1) {
        return index;
    }

    return fib(index - 1) + fib(index - 2);
}
```

---

# Part 24: Final Summary

Recursion means:

```text
A method calls itself.
```

Every recursive method must have:

```text
1. Base case
2. Recursive case
3. Progress toward base case
```

Base case:

```text
The stopping condition.
```

Recursive case:

```text
The method calls itself with a smaller or simpler problem.
```

If recursion does not reach base case:

```text
StackOverflowError
```

---

## Main Recursion Examples

Factorial:

```java
factorial(n) = n * factorial(n - 1)
factorial(0) = 1
```

Sum:

```java
sum(n) = n + sum(n - 1)
sum(1) = 1
```

Reverse string:

```java
reverse(str) = reverse(str.substring(1)) + str.charAt(0)
```

Print digit:

```java
printDigit(n / 10)
print n % 10
```

Fibonacci:

```java
fib(n) = fib(n - 1) + fib(n - 2)
fib(0) = 0
fib(1) = 1
```

---

## Recursion vs Iteration

Recursion:

```text
Method calls itself
Stops at base case
Uses stack memory
Can cause StackOverflowError
```

Iteration:

```text
Uses loops
Stops when loop condition becomes false
Usually uses less memory
Can cause infinite loop
```

---

## Most Important Memory Tricks

```text
Recursion = solve smaller version of same problem

Base case = stop

Recursive case = call itself

Every call must move closer to base case

Going down = recursive calls

Coming back up = returning answers

Print before recursion = output before going deeper

Print after recursion = output while returning
```

---

# End of Recursion Notes

```

This is the complete Recursion chapter note for revision.
```
