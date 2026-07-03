# WIA1002 Data Structure — Time & Space Complexity Cheat Sheet

> Chapter-by-chapter reference. Notation: **n** = number of elements, **V / E** = vertices / edges, **h** = tree height, **e** = exponent. "Amortized" = occasionally costly (e.g. array resize) but averages out over many operations.

---

## Chapter 1 — OOP Revision
No algorithmic complexity to analyze (objects, classes, inheritance, polymorphism). Creating an object with `new` and invoking a method are both **O(1)**.

---

## Chapter 2 — Generics
Generics are a **compile-time** feature (type erasure), so they add **no runtime cost**. The relevant complexities are those of `ArrayList<E>`:

| Operation | Time | Space |
|---|---|---|
| `get(i)` / `set(i, e)` | O(1) | — |
| `add(e)` (at end) | O(1) amortized | — |
| `add(i, e)` (at index) | O(n) | — |
| `remove(i)` / `remove(Object)` | O(n) | — |
| `contains` / `indexOf` | O(n) | — |
| `size` / `isEmpty` | O(1) | — |
| Whole structure | — | O(n) |

---

## Chapter 3 — ADT & Bag

| Operation | ArrayBag (time) | LinkedBag (time) |
|---|---|---|
| `add` | O(1) amortized | O(1) (at head) |
| `remove()` (unspecified) | O(1) | O(1) |
| `remove(anEntry)` | O(n) | O(n) |
| `contains` | O(n) | O(n) |
| `getFrequencyOf` | O(n) | O(n) |
| `getCurrentSize` / `isEmpty` | O(1) | O(1) |
| `toArray` | O(n) | O(n) |
| **Space** | O(n) | O(n) |

---

## Chapter 4 — Linked List (vs array)

| Operation | Array / ArrayList | Singly Linked (head+tail) | Doubly Linked (head+tail) |
|---|---|---|---|
| `get(i)` / random access | O(1) | O(n) | O(n) |
| `addFirst` | O(n) | O(1) | O(1) |
| `addLast` | O(1) amortized | O(1) | O(1) |
| `removeFirst` | O(n) | O(1) | O(1) |
| `removeLast` | O(1) | O(n) | O(1) |
| insert/delete at known node | O(n) (shift) | O(1) | O(1) |
| `contains` / `indexOf` | O(n) | O(n) | O(n) |
| `size` (with counter) | O(1) | O(1) | O(1) |
| **Space** | O(n) | O(n) | O(n) (extra prev pointer) |

---

## Chapter 5 — Stack

| Operation | Time | Space |
|---|---|---|
| `push` | O(1) amortized (array) / O(1) (linked) | — |
| `pop` | O(1) | — |
| `peek` | O(1) | — |
| `isEmpty` / `getSize` | O(1) | — |
| search for an element | O(n) | — |
| Postfix (RPN) evaluation | O(n) | O(n) |
| Whole structure | — | O(n) |

---

## Chapter 6 — Queue

| Operation | FIFO Queue (LinkedList / circular array) | Priority Queue (binary heap) |
|---|---|---|
| `enqueue` / `add` / `offer` | O(1) | O(log n) |
| `dequeue` / `poll` | O(1) | O(log n) |
| `peek` | O(1) | O(1) |
| `isEmpty` / `getSize` | O(1) | O(1) |
| build from n items | O(n) | O(n) (bottom-up heapify) |
| **Space** | O(n) | O(n) |

---

## Chapter 7 — Graph (V vertices, E edges)

**Storage & structure operations**

| Aspect | Adjacency Matrix | Adjacency List |
|---|---|---|
| Space | O(V²) | O(V + E) |
| `hasEdge` / edge lookup | O(1) | O(degree) |
| `addEdge` | O(1) | O(1) (head insert) |
| `addVertex` | O(V²) (resize) | O(V) (append at tail) |
| `getNeighbours` | O(V) (scan row) | O(degree) |
| `hasVertex` / `getIndex` | O(V) | O(V) |

**Traversal**

| Traversal | Adjacency List | Adjacency Matrix | Extra Space |
|---|---|---|---|
| DFS (stack) | O(V + E) | O(V²) | O(V) |
| BFS (queue) | O(V + E) | O(V²) | O(V) (queue can be wider) |

---

## Chapter 8 — Recursion (classic examples)

| Algorithm | Time | Space (call stack) |
|---|---|---|
| Factorial | O(n) | O(n) |
| Fibonacci (naïve) | O(2ⁿ) | O(n) |
| Fibonacci (memoized) | O(n) | O(n) |
| Fast exponentiation (halving) | O(log e) | O(log e) |
| Binary search (recursive) | O(log n) | O(log n) |
| Towers of Hanoi | O(2ⁿ) | O(n) |
| Sum / Max of array | O(n) | O(n) |

---

## Chapter 9 — Search & Sort

| Algorithm | Best | Average | Worst | Space | Stable? |
|---|---|---|---|---|---|
| Linear search | O(1) | O(n) | O(n) | O(1) | — |
| Binary search (needs sorted) | O(1) | O(log n) | O(log n) | O(1) iter / O(log n) rec | — |
| Selection sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Bubble sort (optimized) | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Merge sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |

> Note: Selection sort performs only **O(n) swaps** (fewest writes) despite O(n²) comparisons — useful when writes are expensive.

---

## Chapter 10 — Binary Search Tree

| Operation | Balanced (avg) | Worst (skewed/degenerate) | Space |
|---|---|---|---|
| `search` | O(log n) | O(n) | — |
| `insert` | O(log n) | O(n) | — |
| `delete` | O(log n) | O(n) | — |
| find min / max | O(log n) | O(n) | — |
| traversal (in/pre/post/level order) | O(n) | O(n) | O(h) recursion / O(n) level-order queue |
| Whole structure | — | — | O(n) |

> General rule: all BST search/insert/delete are **O(h)** — h is O(log n) when balanced, O(n) when fully skewed (e.g. inserting already-sorted data). Self-balancing trees (AVL / red-black) guarantee O(log n).

---

## Quick "must-remember" list

- Array/ArrayList random access is **O(1)**; linked list random access is **O(n)**.
- Linked list wins on **front insert/delete** (O(1)); array wins on **indexing**.
- Stack & Queue core operations are all **O(1)**.
- Priority queue (heap) insert/poll are **O(log n)**; building a heap is **O(n)**.
- Binary search needs a **sorted** array and runs in **O(log n)**.
- Elementary sorts (selection/insertion/bubble) are **O(n²)**; merge sort is **O(n log n)**.
- Graph traversal (DFS/BFS) is **O(V + E)** with adjacency lists, **O(V²)** with a matrix.
- Naïve recursive Fibonacci is **O(2ⁿ)**; memoization makes it **O(n)**.
- BST operations are **O(h)** — great when balanced, degrade to O(n) when skewed.
