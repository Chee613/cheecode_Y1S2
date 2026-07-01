# Tutorial 6 - Stack Answers

## Question 1(a) - Non-removing access

**c. `peek`**

## Question 1(b) - Three-stack trace

Initial `s1` is bottom `[zero, one, two]` top; `s2` and `s3` are empty. After all six
operations:

```text
s1: empty
s2: bottom [one, two] top
s3: empty
```

The values move as follows: `two` to `s2`, `one` to `s3`, `zero` is discarded, `two` back
to `s1`, `one` to `s2`, then `two` onto `s2`.

## Question 3 - Possible pop sequences

All four are possible (`PUSH n` is abbreviated `+n`; `POP` is `-`):

- (a) `1-2-3`: `+1, -, +2, -, +3, -`
- (b) `2-3-1`: `+1, +2, -, +3, -, -`
- (c) `3-2-1`: `+1, +2, +3, -, -, -`
- (d) `1-3-2`: `+1, -, +2, +3, -, -`

## Question 4 - Infix to postfix

- (a) `a b c * +`
- (b) `a b * c d / -`
- (c) `a b c * d + e / +`

## Question 5 - Postfix to infix

- (a) `(a + b) * c`
- (b) `a * (b + c)`

## Question 6 - Stack application

**D. all of the above.** Recursion can compute factorial and Tower of Hanoi using the call
stack, while operator stacks are used for infix-to-postfix conversion.
