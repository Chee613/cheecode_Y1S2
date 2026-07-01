# Tutorial 7b - Priority Queue Answers

## Question 1

A normal queue removes items strictly in FIFO order. A priority queue removes the item with
the highest scheduling priority (for Java's default min-heap, the smallest item) regardless of
insertion time; equal-priority items do not necessarily preserve FIFO order.

## Question 2 - Real-life examples

1. Hospital triage, where critical patients are treated first.
2. CPU scheduling, where higher-priority processes run first.
3. Emergency dispatch, where incidents are ordered by severity.

## Question 3 - Output

`peek()` is deterministic:

```text
peek() gives us: C++
```

A Java `PriorityQueue` iterator is **not guaranteed to be sorted**. On a typical current
OpenJDK, the heap-array iteration shown by this exact insertion sequence is:

```text
The queue elements:
C++
Fortran
Java
Python
After poll():
Fortran
Python
Java
After remove():
Fortran
Python
Priority queue contains Ruby or not?: false
Value in array:
Value: Fortran
Value: Python
```

Only `peek()`/`poll()` guarantee that the least element is returned. Code must not depend on
the iterator or `toArray()` order; copy to a list and sort if sorted display is required.

## Question 4

### (a) Comparator purpose

`PriorityQueueComparator` orders strings by increasing length. A shorter string has higher
priority. Equal-length strings compare as equal.

### (b) Output

The typical OpenJDK heap iteration is:

```text
Ali
Jason
Muhamad
```

Again, iteration order is unspecified. The only portable claim is that `pq.peek()` would be
`Ali`; repeatedly calling `poll()` would return `Ali`, `Jason`, `Muhamad`.
