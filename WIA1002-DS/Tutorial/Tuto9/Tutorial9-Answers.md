# Tutorial 9 - Recursion Answers

## Question 1

`f(0)` does not reach the base case `n == 1`. It calls `f(-1)`, `f(-2)`, and so on until a
`StackOverflowError` occurs. For factorial-like input, reject negative values and use 0 or 1 as
the base case.

```java
static int f(int n) {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    if (n <= 1) return 1;
    return n * f(n - 1);
}
```

## Question 2

For any nonzero `n`, the recursive call is `f(n + 1)`, which moves away from the base case
`n == 0`. It therefore recurses forever until `StackOverflowError` (and the additions never
finish). It should move toward zero, for example `return n + f(n - 1)` for positive `n`.

## Question 3 - Reverse a string

```java
static String reverse(String s) {
    if (s == null || s.length() <= 1) return s;
    return reverse(s.substring(1)) + s.charAt(0);
}
```

`reverse("String")` returns `"gnirtS"` (the PDF's lowercase example is `string -> gnirts`).

## Question 4 - Recursive sum

```java
static int sum(int n) {
    if (n <= 0) return 0;  // base case
    return n + sum(n - 1); // recursive case
}
```

Trace for `n = 5`:

```text
sum(5)
= 5 + sum(4)
= 5 + 4 + sum(3)
= 5 + 4 + 3 + sum(2)
= 5 + 4 + 3 + 2 + sum(1)
= 5 + 4 + 3 + 2 + 1 + sum(0)
= 15
```

## Question 5 - `printDigit`

```java
static void printDigit(int n) {
    if (n < 0) {
        System.out.print("- ");
        n = -n;
    }
    printPositiveDigits(n);
    System.out.println();
}

private static void printPositiveDigits(int n) {
    if (n >= 10) printPositiveDigits(n / 10);
    System.out.print((n % 10) + " ");
}
```

`printDigit(4567)` prints `4 5 6 7`.
