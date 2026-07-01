# Chapter 6 Queue: 100 Extreme-Hard Questions

> Topics: FIFO semantics, enqueue/dequeue/peek/isEmpty/getSize, LinkedList-based implementation, inheritance vs composition, circular array queues, and priority queues (including `java.util.PriorityQueue` and heap behavior). Choose the single best answer.

---

## Question 1

**Question:** A queue enforces which ordering?

**Choices:**
- **A.** LIFO
- **B.** priority
- **C.** FIFO
- **D.** sorted

**Correct Answer:** FIFO

**Explanation:** A queue is First-In, First-Out: elements leave in the order they arrived.

---

## Question 2

**Question:** In a standard queue, `enqueue` adds at the ___ and `dequeue` removes from the ___.

**Choices:**
- **A.** front; rear
- **B.** front; front
- **C.** rear; rear
- **D.** rear; front

**Correct Answer:** rear; front

**Explanation:** New elements join at the rear; elements are served from the front, preserving arrival order.

---

## Question 3

**Question:** Why is `java.util.LinkedList` a good backing store for a queue?

**Choices:**
- **A.** It allows binary search, which holds even for empty or degenerate inputs
- **B.** It has O(1) random access
- **C.** It removes from the front and adds to the rear in O
- **D.** It sorts elements automatically

**Correct Answer:** It removes from the front and adds to the rear in O

**Explanation:** Being doubly linked, `LinkedList` supports O(1) operations at both ends—ideal for FIFO.

---

## Question 4

**Question:** Why is a plain `ArrayList` poor for a queue that dequeues from index 0?

**Choices:**
- **A.** It cannot store objects
- **B.** It has no size method
- **C.** It cannot append, because the elements are always stored contiguously
- **D.** Removing from index 0 shifts all remaining elements, costing O

**Correct Answer:** Removing from index 0 shifts all remaining elements, costing O

**Explanation:** Front removal in an array requires shifting every later element left, making dequeue O(n).

---

## Question 5

**Question:** For `GenericQueue<E>` composed of a `LinkedList<E> list`, `enqueue(e)` is:

**Choices:**
- **A.** `list.addFirst(e)`
- **B.** `list.removeFirst()`
- **C.** `list.addLast(e)`
- **D.** `list.add(0, e)`

**Correct Answer:** `list.addLast(e)`

**Explanation:** Enqueue appends at the rear via `addLast`, keeping FIFO with O(1) cost.

---

## Question 6

**Question:** For the same queue, `dequeue()` is:

**Choices:**
- **A.** `list.removeLast()`
- **B.** `list.getLast()`
- **C.** `list.remove(list.size())`
- **D.** `list.removeFirst()`

**Correct Answer:** `list.removeFirst()`

**Explanation:** Dequeue serves from the front via `removeFirst`, returning the oldest element in O(1).

---

## Question 7

**Question:** Enqueue 1,2,3 then dequeue twice. The value returned by the second dequeue is:

**Choices:**
- **A.** 1
- **B.** 2
- **C.** 3
- **D.** exception

**Correct Answer:** 2

**Explanation:** Dequeues return 1 then 2 in arrival order.

---

## Question 8

**Question:** A priority queue removes the element that is:

**Choices:**
- **A.** most recently added
- **B.** oldest (arrival order)
- **C.** highest priority per the ordering rule
- **D.** at a random index, and this is true regardless of how the data was built

**Correct Answer:** highest priority per the ordering rule

**Explanation:** Priority queues serve by priority, not arrival order—overriding FIFO.

---

## Question 9

**Question:** In a min-priority queue of integers, `poll()` returns:

**Choices:**
- **A.** the largest value
- **B.** the first inserted value
- **C.** the last inserted value
- **D.** the smallest value

**Correct Answer:** the smallest value

**Explanation:** A min-priority queue treats smaller as higher priority, so `poll` removes the minimum.

---

## Question 10

**Question:** `java.util.PriorityQueue` by default is a:

**Choices:**
- **A.** max-heap, which the definition guarantees in every case
- **B.** min-heap (natural ordering)
- **C.** FIFO queue
- **D.** LIFO stack

**Correct Answer:** min-heap (natural ordering)

**Explanation:** Java's `PriorityQueue` orders by natural ordering (or a comparator), with the least element at the head—a min-heap.

---

## Question 11

**Question:** To make `java.util.PriorityQueue<Integer>` behave as a max-heap, you:

**Choices:**
- **A.** call `sort()` each time
- **B.** override `equals`, independent of the input size or ordering
- **C.** pass `Collections.reverseOrder()` (or a reversed comparator) to the constructor
- **D.** it is impossible, so no traversal or comparison is ever needed

**Correct Answer:** pass `Collections.reverseOrder()` (or a reversed comparator) to the constructor

**Explanation:** Supplying a reverse comparator inverts the priority so the largest element sits at the head.

---

## Question 12

**Question:** In the emergency-room analogy, a patient with higher urgency is treated before an earlier-arriving less-urgent patient. This models a:

**Choices:**
- **A.** FIFO queue
- **B.** LIFO stack
- **C.** deque
- **D.** priority queue

**Correct Answer:** priority queue

**Explanation:** Service by urgency rather than arrival time is exactly priority-queue behavior.

---

## Question 13

**Question:** True or false: A priority queue always preserves insertion order among equal-priority elements.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Standard binary-heap priority queues are not stable; ties may be broken arbitrarily unless the comparator or a tiebreaker enforces order.

---

## Question 14

**Question:** `peek()` on a queue returns:

**Choices:**
- **A.** the rear element without removing it
- **B.** the front element without removing it
- **C.** the front element and removes it
- **D.** the size

**Correct Answer:** the front element without removing it

**Explanation:** `peek` inspects the front (next to be dequeued) without modifying the queue.

---

## Question 15

**Question:** Which design is generally safer: `GenericQueue extends LinkedList` or `GenericQueue has-a LinkedList`?

**Choices:**
- **A.** Inheritance, because it inherits all methods
- **B.** Neither compiles
- **C.** Composition, because it hides non-queue operations
- **D.** They are equally safe

**Correct Answer:** Composition, because it hides non-queue operations

**Explanation:** Extending `LinkedList` exposes arbitrary insertion/removal, breaking FIFO; composition limits the interface to queue operations.

---

## Question 16

**Question:** In a circular array queue of capacity n, indices wrap using:

**Choices:**
- **A.** `index = index * 2`
- **B.** `index = index - n`
- **C.** `index = n - index`
- **D.** `index = (index + 1) % n`

**Correct Answer:** `index = (index + 1) % n`

**Explanation:** Modulo arithmetic wraps front/rear indices around the array end, reusing freed slots.

---

## Question 17

**Question:** The main advantage of a circular array queue over a linear array queue is:

**Choices:**
- **A.** binary search support
- **B.** reusing vacated front slots without shifting
- **C.** unlimited capacity
- **D.** automatic sorting, making it the most efficient choice by design

**Correct Answer:** reusing vacated front slots without shifting

**Explanation:** Wrapping indices reclaim space freed by dequeues, avoiding the shifting that plagues linear array queues.

---

## Question 18

**Question:** A common way to distinguish "full" from "empty" in a circular array queue is to:

**Choices:**
- **A.** ignore the difference
- **B.** always assume full, as a direct consequence of the structure's shape
- **C.** keep a separate size/count, or leave one slot unused
- **D.** compare front to capacity

**Correct Answer:** keep a separate size/count, or leave one slot unused

**Explanation:** When front == rear, the queue could be full or empty; a count field or a sacrificed slot disambiguates the two states.

---

## Question 19

**Question:** Enqueue A,B,C,D into a circular array of capacity 4, dequeue twice, then enqueue E,F. What happens to F?

**Choices:**
- **A.** It overflows (queue is rejected)
- **B.** It overwrites A
- **C.** It is silently dropped
- **D.** It fits by wrapping into a freed front slot

**Correct Answer:** It fits by wrapping into a freed front slot

**Explanation:** After enqueuing A,B,C,D (size 4) and dequeuing twice, only C,D remain (size 2), freeing two front slots. Enqueuing E then F reuses those wrapped slots, bringing the queue to C,D,E,F (size 4 = capacity). F fits exactly; only a further enqueue would overflow.

---

## Question 20

**Question:** True or false: `getSize()` on a LinkedList-backed queue is O(1) if the list tracks size.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `LinkedList.size()` returns a maintained count in O(1), so the queue's `getSize()` is constant time.

---

## Question 21

**Question:** What prints?

```java
GenericQueue<Integer> q = new GenericQueue<>();
q.enqueue(5); q.enqueue(10); q.enqueue(15);
System.out.println(q.dequeue() + q.peek());
```

**Choices:**
- **A.** 25
- **B.** 15
- **C.** 20
- **D.** 30

**Correct Answer:** 15

**Explanation:** `dequeue` returns 5; `peek` returns the new front 10; 5 + 10 = 15.

---

## Question 22

**Question:** Which application naturally uses a FIFO queue?

**Choices:**
- **A.** undo/redo, which holds even for empty or degenerate inputs
- **B.** expression evaluation
- **C.** printer job spooling in arrival order
- **D.** DFS backtracking

**Correct Answer:** printer job spooling in arrival order

**Explanation:** Print jobs are served in the order submitted—classic FIFO.

---

## Question 23

**Question:** Breadth-First Search (BFS) uses which structure to visit nodes level by level?

**Choices:**
- **A.** stack
- **B.** priority queue only
- **C.** binary search tree
- **D.** queue

**Correct Answer:** queue

**Explanation:** BFS enqueues neighbors and dequeues in FIFO order, exploring the graph level by level.

---

## Question 24

**Question:** True or false: A deque (double-ended queue) allows insertion and removal at both ends.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A deque generalizes queue and stack, permitting operations at both front and rear.

---

## Question 25

**Question:** Dijkstra's shortest-path algorithm typically uses which structure to pick the next closest vertex?

**Choices:**
- **A.** FIFO queue
- **B.** min-priority queue
- **C.** stack
- **D.** deque

**Correct Answer:** min-priority queue

**Explanation:** Dijkstra repeatedly extracts the minimum-distance vertex, which a min-priority queue provides efficiently.

---

## Question 26

**Question:** For a binary-heap priority queue of n elements, `insert` and `poll` each cost:

**Choices:**
- **A.** O(1)
- **B.** O(n)
- **C.** O(log n)
- **D.** O(n log n)

**Correct Answer:** O(log n)

**Explanation:** Heap insert sift-up and poll sift-down each traverse the tree height, O(log n).

---

## Question 27

**Question:** Building a heap from n elements via repeated `insert` is O(n log n), but the bottom-up `heapify` is:

**Choices:**
- **A.** O(n log n)
- **B.** O(log n)
- **C.** O(n²)
- **D.** O(n)

**Correct Answer:** O(n)

**Explanation:** Bottom-up heap construction (heapify) runs in linear time, tighter than n successive inserts.

---

## Question 28

**Question:** True or false: `peek()` on an empty queue should be handled (return null or throw), not return garbage.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** An empty queue has no front; a robust implementation returns null (per `Queue.peek`) or throws (per `element`).

---

## Question 29

**Question:** In `java.util.Queue`, which method returns null on an empty queue rather than throwing?

**Choices:**
- **A.** `element()`
- **B.** `peek()`
- **C.** `remove()`
- **D.** `add()`

**Correct Answer:** `peek()`

**Explanation:** `peek`/`poll` return null when empty; `element`/`remove` throw `NoSuchElementException`. This is the two-flavor `Queue` API.

---

## Question 30

**Question:** Enqueue 1..5, dequeue 3 times, enqueue 6,7. The current front is:

**Choices:**
- **A.** 1
- **B.** 3
- **C.** 4
- **D.** 6

**Correct Answer:** 4

**Explanation:** Dequeuing 1,2,3 leaves 4,5; enqueuing 6,7 gives 4,5,6,7 with front 4.

---

## Question 31

**Question:** True or false: A priority queue can be used to sort by inserting all elements then polling until empty.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Polling a heap repeatedly yields sorted order—this is heapsort's core idea, O(n log n).

---

## Question 32

**Question:** What prints?

```java
java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
pq.add(4); pq.add(1); pq.add(3); pq.add(2);
StringBuilder sb = new StringBuilder();
while (!pq.isEmpty()) sb.append(pq.poll());
System.out.println(sb);
```

**Choices:**
- **A.** 4321
- **B.** 4132
- **C.** 2341
- **D.** 1234

**Correct Answer:** 1234

**Explanation:** The default min-heap polls in ascending order: 1,2,3,4.

---

## Question 33

**Question:** True or false: Iterating a `java.util.PriorityQueue` with a for-each visits elements in sorted (priority) order.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** The iterator does not guarantee priority order; only `poll` extracts in order. The internal array is heap-ordered, not fully sorted.

---

## Question 34

**Question:** A circular queue reports "full" when:

**Choices:**
- **A.** front == rear always
- **B.** size == capacity (using a count) or (rear + 1) % n == front
- **C.** rear == 0, because the elements are always stored contiguously
- **D.** front == 0

**Correct Answer:** size == capacity (using a count) or (rear + 1) % n == front

**Explanation:** Fullness is detected via a size counter reaching capacity or the "next rear equals front" rule when one slot is intentionally left empty.

---

## Question 35

**Question:** Which is TRUE about enqueue/dequeue complexity in a well-built queue?

**Choices:**
- **A.** enqueue O(n), dequeue O(1)
- **B.** enqueue O(1), dequeue O(n)
- **C.** both O(1)
- **D.** both O(log n)

**Correct Answer:** both O(1)

**Explanation:** With a linked list or circular array, both operations touch only an end/index in O(1).

---

## Question 36

**Question:** True or false: A stack and a queue differ only in which end elements are removed from.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Both add at one end; a stack removes from the same end (LIFO) while a queue removes from the opposite end (FIFO)—the removal end is the distinguishing factor.

---

## Question 37

**Question:** In a linked-list queue, maintaining a `tail` pointer is essential because:

**Choices:**
- **A.** dequeue needs it, and this is true regardless of how the data was built
- **B.** it enables binary search
- **C.** it stores the size
- **D.** enqueue at the rear would otherwise be O(n) without it

**Correct Answer:** enqueue at the rear would otherwise be O(n) without it

**Explanation:** Without a tail pointer, appending requires traversing to the end; a tail makes enqueue O(1).

---

## Question 38

**Question:** What is printed?

```java
GenericQueue<String> q = new GenericQueue<>();
q.enqueue("a"); q.enqueue("b"); q.enqueue("c");
q.dequeue();
q.enqueue("d");
StringBuilder sb = new StringBuilder();
while (!q.isEmpty()) sb.append(q.dequeue());
System.out.println(sb);
```

**Choices:**
- **A.** abcd
- **B.** bcd
- **C.** dcb
- **D.** abc

**Correct Answer:** bcd

**Explanation:** After removing "a" and adding "d", the queue is b,c,d; dequeuing all prints "bcd".

---

## Question 39

**Question:** True or false: A priority queue is a valid ADT that can be implemented with a heap, a sorted list, or an unsorted list.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The priority-queue ADT admits several implementations with different trade-offs; the heap is the common balanced choice.

---

## Question 40

**Question:** For an unsorted-list priority queue, `insert` is O(1) but `poll` is:

**Choices:**
- **A.** O(1), which the definition guarantees in every case
- **B.** O(log n)
- **C.** O(n) (must scan for the min/max)
- **D.** O(n log n)

**Correct Answer:** O(n) (must scan for the min/max)

**Explanation:** Insertion is trivial, but extracting the highest priority requires scanning all elements, O(n).

---

## Question 41

**Question:** For a sorted-list priority queue, `poll` is O(1) but `insert` is:

**Choices:**
- **A.** O(1)
- **B.** O(log n) guaranteed
- **C.** O(n log n)
- **D.** O(n) (must find the position)

**Correct Answer:** O(n) (must find the position)

**Explanation:** Keeping the list sorted means insertion must locate and place the element, costing O(n) (linked) even if the compare is quick.

---

## Question 42

**Question:** The heap wins over sorted/unsorted lists because it balances both operations at:

**Choices:**
- **A.** O(1) each
- **B.** O(log n) each
- **C.** O(n) each
- **D.** O(n log n) each

**Correct Answer:** O(log n) each

**Explanation:** A binary heap makes both insert and poll O(log n), a good balance versus the O(1)/O(n) extremes.

---

## Question 43

**Question:** True or false: In a min-heap array, the parent of index i is at index (i-1)/2 (0-based).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** For a 0-based array heap, parent = (i-1)/2, left child = 2i+1, right child = 2i+2.

---

## Question 44

**Question:** In a 0-based array heap, the left child of index i is at:

**Choices:**
- **A.** 2i
- **B.** 2i - 1
- **C.** 2i + 1
- **D.** i/2

**Correct Answer:** 2i + 1

**Explanation:** Left child is 2i+1 and right child is 2i+2 in a 0-based binary heap.

---

## Question 45

**Question:** After inserting into a min-heap, restoring the heap property uses:

**Choices:**
- **A.** sift-down from the root
- **B.** a full sort, independent of the input size or ordering
- **C.** nothing, so no traversal or comparison is ever needed
- **D.** sift-up (bubble the new element toward the root while smaller than its parent)

**Correct Answer:** sift-up (bubble the new element toward the root while smaller than its parent)

**Explanation:** A newly appended leaf is percolated up while it violates the min-heap order with its parent.

---

## Question 46

**Question:** After `poll` from a min-heap, restoration uses:

**Choices:**
- **A.** sift-up, making it the most efficient choice by design
- **B.** move the last element to the root and sift-down
- **C.** reverse the array
- **D.** binary search

**Correct Answer:** move the last element to the root and sift-down

**Explanation:** The root is removed, the last leaf fills it, then it is percolated down to restore order.

---

## Question 47

**Question:** True or false: A binary heap is always a complete binary tree.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Heaps maintain the complete-tree shape (filled left to right), enabling compact array storage.

---

## Question 48

**Question:** Which statement about `dequeue` on an empty queue is correct?

**Choices:**
- **A.** It returns 0, as a direct consequence of the structure's shape
- **B.** It duplicates the last element
- **C.** It should throw or return null, not undefined behavior
- **D.** It resizes the queue

**Correct Answer:** It should throw or return null, not undefined behavior

**Explanation:** A robust queue signals emptiness (exception or null) rather than returning garbage.

---

## Question 49

**Question:** A round-robin CPU scheduler uses a queue by:

**Choices:**
- **A.** always serving the highest priority
- **B.** using LIFO, which holds even for empty or degenerate inputs
- **C.** sorting processes each tick, because the elements are always stored contiguously
- **D.** dequeuing a process, running it a time slice, and enqueuing it again if unfinished

**Correct Answer:** dequeuing a process, running it a time slice, and enqueuing it again if unfinished

**Explanation:** Round-robin cycles processes through a FIFO queue, giving each a fair time slice.

---

## Question 50

**Question:** True or false: `java.util.LinkedList` implements the `Queue` interface.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `LinkedList` implements `Queue` (and `Deque`), so it can be used directly with `offer`/`poll`/`peek`.

---

## Question 51

**Question:** What prints?

```java
java.util.Queue<Integer> q = new java.util.LinkedList<>();
q.offer(1); q.offer(2); q.offer(3);
System.out.println(q.poll() + " " + q.peek());
```

**Choices:**
- **A.** 3 2
- **B.** 1 2
- **C.** 1 1
- **D.** 2 3

**Correct Answer:** 1 2

**Explanation:** `poll` removes and returns 1; `peek` shows the new front 2.

---

## Question 52

**Question:** True or false: In a circular queue, after many wrap-arounds, the logical order of elements can still be read correctly using front and size.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Starting at `front` and reading `size` elements with modulo indexing recovers the correct FIFO order regardless of wrapping.

---

## Question 53

**Question:** Which is a correct reason to prefer `ArrayDeque` over `LinkedList` for a queue?

**Choices:**
- **A.** `ArrayDeque` allows null elements
- **B.** `ArrayDeque` supports indexing
- **C.** `ArrayDeque` is array-backed with better cache locality and less per-node overhead
- **D.** `LinkedList` cannot dequeue, and this is true regardless of how the data was built

**Correct Answer:** `ArrayDeque` is array-backed with better cache locality and less per-node overhead

**Explanation:** `ArrayDeque` avoids node allocation and is cache-friendly, generally outperforming `LinkedList` as a queue.

---

## Question 54

**Question:** A priority queue with a comparator `(a,b) -> b - a` on integers behaves as a:

**Choices:**
- **A.** min-heap
- **B.** FIFO queue
- **C.** stack
- **D.** max-heap

**Correct Answer:** max-heap

**Explanation:** The reversed comparator makes larger values "smaller" in ordering, so the maximum sits at the head.

---

## Question 55

**Question:** True or false: `offer` and `add` differ in that `add` throws on capacity failure while `offer` returns false.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** For capacity-restricted queues, `add` throws `IllegalStateException` on failure whereas `offer` returns false—the two-flavor insertion API.

---

## Question 56

**Question:** What is the head of `PriorityQueue<String>` after adding "banana","apple","cherry" (natural order)?

**Choices:**
- **A.** cherry
- **B.** apple
- **C.** banana
- **D.** undefined

**Correct Answer:** apple

**Explanation:** Natural (lexicographic) ordering makes "apple" the minimum, placing it at the head.

---

## Question 57

**Question:** True or false: A queue is the natural structure for level-order traversal of a binary tree.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Level-order (BFS) enqueues children and dequeues parents in FIFO order, visiting level by level.

---

## Question 58

**Question:** Enqueue 10,20,30 and dequeue all while summing. The sum is:

**Choices:**
- **A.** 30
- **B.** 0
- **C.** 60
- **D.** 50

**Correct Answer:** 60

**Explanation:** All three elements are dequeued and summed: 10+20+30 = 60.

---

## Question 59

**Question:** Which invariant defines a circular queue's emptiness with a count field?

**Choices:**
- **A.** front == rear
- **B.** rear == capacity
- **C.** front == 0
- **D.** count == 0

**Correct Answer:** count == 0

**Explanation:** With an explicit count, emptiness is simply `count == 0`, avoiding the front/rear ambiguity.

---

## Question 60

**Question:** True or false: A deque can implement both a stack and a queue.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A deque's dual-end operations let it serve as a stack (one end) or a queue (opposite ends).

---

## Question 61

**Question:** In BFS on an unweighted graph, the queue guarantees:

**Choices:**
- **A.** the longest path is found
- **B.** nodes are visited in order of increasing distance from the source
- **C.** depth-first order, which the definition guarantees in every case
- **D.** sorted node values

**Correct Answer:** nodes are visited in order of increasing distance from the source

**Explanation:** FIFO processing ensures closer nodes (fewer edges) are dequeued before farther ones, yielding shortest unweighted paths.

---

## Question 62

**Question:** What prints?

```java
java.util.PriorityQueue<Integer> pq =
    new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
pq.add(2); pq.add(9); pq.add(4);
System.out.println(pq.poll());
```

**Choices:**
- **A.** 2
- **B.** 4
- **C.** 9
- **D.** null

**Correct Answer:** 9

**Explanation:** The reverse-order comparator makes it a max-heap, so `poll` returns the largest, 9.

---

## Question 63

**Question:** True or false: A priority queue's `poll` on an empty queue returns null (Java `PriorityQueue`).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `PriorityQueue.poll()` returns null when empty, consistent with the `Queue` peek/poll contract.

---

## Question 64

**Question:** Which best explains why a plain array with a fixed front index of 0 is bad for queues?

**Choices:**
- **A.** It cannot store enough elements
- **B.** It cannot enqueue, so no traversal or comparison is ever needed
- **C.** It sorts on dequeue, independent of the input size or ordering
- **D.** Every dequeue shifts all elements to keep the front at index 0, O(n) per dequeue

**Correct Answer:** Every dequeue shifts all elements to keep the front at index 0, O(n) per dequeue

**Explanation:** Fixing the front forces shifting on each removal; a moving front index (circular) or a linked list avoids this.

---

## Question 65

**Question:** True or false: A monotonic queue (deque maintaining sorted order) can compute sliding-window maxima in O(n).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A monotonic deque discards dominated elements, yielding amortized O(n) sliding-window maximum computation.

---

## Question 66

**Question:** Enqueue A,B,C. Which output order is impossible for a pure FIFO queue?

**Choices:**
- **A.** A,B,C, making it the most efficient choice by design
- **B.** only A,B,C is possible
- **C.** C,B,A
- **D.** B,A,C

**Correct Answer:** only A,B,C is possible

**Explanation:** A FIFO queue can only produce the exact arrival order, so A,B,C is the sole valid output.

---

## Question 67

**Question:** True or false: Unlike a stack, a queue has no notion of a "permutation count" (Catalan) because its output order is fixed.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A pure queue yields exactly one output order (arrival order), so there is a single permutation, not a Catalan-many set as with stacks.

---

## Question 68

**Question:** Which structure is best for a task scheduler where tasks have deadlines and the earliest deadline must run next?

**Choices:**
- **A.** FIFO queue, as a direct consequence of the structure's shape
- **B.** LIFO stack
- **C.** min-priority queue keyed by deadline
- **D.** unsorted array

**Correct Answer:** min-priority queue keyed by deadline

**Explanation:** Earliest-deadline-first scheduling extracts the minimum deadline each time—a min-priority queue.

---

## Question 69

**Question:** True or false: `PriorityQueue` in Java permits `null` elements.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** `PriorityQueue` disallows null because it must compare elements to order them; null cannot be compared.

---

## Question 70

**Question:** What prints?

```java
GenericQueue<Integer> q = new GenericQueue<>();
for (int i = 1; i <= 4; i++) q.enqueue(i);
q.dequeue(); q.dequeue();
q.enqueue(5);
System.out.println(q.peek() + " " + q.getSize());
```

**Choices:**
- **A.** 1 4
- **B.** 3 2
- **C.** 5 3
- **D.** 3 3

**Correct Answer:** 3 3

**Explanation:** Queue 1,2,3,4; dequeue 1,2 → 3,4; enqueue 5 → 3,4,5; front 3, size 3.

---

## Question 71

**Question:** True or false: In a heap, the largest element of a min-heap is always at a leaf.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** In a min-heap every parent ≤ its children, so the maximum cannot have children—it must be a leaf.

---

## Question 72

**Question:** Which is the correct index of the right child of index 2 in a 0-based array heap?

**Choices:**
- **A.** 4
- **B.** 6
- **C.** 5
- **D.** 3

**Correct Answer:** 6

**Explanation:** Right child = 2i+2 = 2(2)+2 = 6.

---

## Question 73

**Question:** A queue-based BFS marks nodes as visited when they are:

**Choices:**
- **A.** dequeued only
- **B.** never marked
- **C.** enqueued (to avoid enqueuing duplicates)
- **D.** sorted, which holds even for empty or degenerate inputs

**Correct Answer:** enqueued (to avoid enqueuing duplicates)

**Explanation:** Marking on enqueue prevents the same node from being added multiple times, keeping BFS correct and efficient.

---

## Question 74

**Question:** True or false: A priority queue can degrade to a normal FIFO queue if all elements have equal priority and ties break by insertion order.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With equal priorities and a stable tiebreak on arrival, extraction order equals insertion order—FIFO behavior.

---

## Question 75

**Question:** Which is TRUE about enqueueing into a full fixed-capacity circular queue?

**Choices:**
- **A.** It silently overwrites the front
- **B.** It always resizes, because the elements are always stored contiguously
- **C.** It converts to a stack, and this is true regardless of how the data was built
- **D.** It should report overflow (throw or return false) unless designed as a ring buffer that overwrites intentionally

**Correct Answer:** It should report overflow (throw or return false) unless designed as a ring buffer that overwrites intentionally

**Explanation:** A standard bounded queue signals overflow; a ring buffer may intentionally overwrite the oldest element, which is a deliberate design choice.

---

## Question 76

**Question:** True or false: Reversing a queue can be done using a stack.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Dequeue all into a stack, then pop all back into the queue; the LIFO stack reverses the order.

---

## Question 77

**Question:** In `PriorityQueue`, adding elements one by one to build a heap of n items costs at most:

**Choices:**
- **A.** O(n)
- **B.** O(n log n)
- **C.** O(log n)
- **D.** O(1)

**Correct Answer:** O(n log n)

**Explanation:** Each of n inserts is O(log n), so successive insertion is O(n log n) (whereas bulk heapify is O(n)).

---

## Question 78

**Question:** Which is TRUE comparing a queue implemented with one linked list vs two stacks?

**Choices:**
- **A.** Two stacks are always faster, which the definition guarantees in every case
- **B.** They cannot both implement a queue
- **C.** The linked-list queue has worst-case O(1) per op; the two-stack queue is only amortized O
- **D.** The linked list is O(n) per op, so no traversal or comparison is ever needed

**Correct Answer:** The linked-list queue has worst-case O(1) per op; the two-stack queue is only amortized O

**Explanation:** The two-stack queue occasionally transfers all elements (O(n) in that step) but averages O(1); a linked-list queue is O(1) every operation.

---

## Question 79

**Question:** What prints?

```java
java.util.Deque<Integer> dq = new java.util.ArrayDeque<>();
dq.offerFirst(1); dq.offerLast(2); dq.offerFirst(3);
System.out.println(dq.pollFirst() + " " + dq.pollLast());
```

**Choices:**
- **A.** 1 2
- **B.** 3 1
- **C.** 1 3
- **D.** 3 2

**Correct Answer:** 3 2

**Explanation:** After offers, deque is [3,1,2]; `pollFirst`→3, `pollLast`→2.

---

## Question 80

**Question:** True or false: A queue's front and rear can point to the same node when it holds exactly one element (linked implementation).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With a single element, head and tail reference the same node; care is needed to null both on removing that last element.

---

## Question 81

**Question:** A subtle bug: a linked-list queue dequeues its last element but forgets to null the `tail`. The symptom is:

**Choices:**
- **A.** none, independent of the input size or ordering
- **B.** a later enqueue links onto a removed node, corrupting the queue
- **C.** the queue becomes a stack, making it the most efficient choice by design
- **D.** size goes negative automatically

**Correct Answer:** a later enqueue links onto a removed node, corrupting the queue

**Explanation:** When the queue empties, both head and tail must be nulled; a dangling tail breaks the next enqueue.

---

## Question 82

**Question:** Which operation distinguishes a priority queue ADT from a plain queue ADT?

**Choices:**
- **A.** isEmpty, as a direct consequence of the structure's shape
- **B.** enqueue
- **C.** the removal order is by priority rather than arrival
- **D.** getSize

**Correct Answer:** the removal order is by priority rather than arrival

**Explanation:** Both support enqueue/isEmpty/getSize; the defining difference is priority-based removal.

---

## Question 83

**Question:** True or false: A max-priority queue can find the k largest elements of a stream in O(n log k) using a size-k min-heap.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Keeping a min-heap of the k largest seen so far, evicting the smallest when exceeding k, gives O(n log k) for top-k.

---

## Question 84

**Question:** Which is the head element after `PriorityQueue` with comparator by string length receives "bb","a","ccc"?

**Choices:**
- **A.** ccc
- **B.** bb
- **C.** undefined
- **D.** a

**Correct Answer:** a

**Explanation:** Ordering by length makes the shortest ("a", length 1) the minimum at the head.

---

## Question 85

**Question:** True or false: A queue can be implemented on a circular array using only front index and count (no explicit rear).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The rear position is derivable as `(front + count) % capacity`, so front and count suffice.

---

## Question 86

**Question:** Which best describes the relationship between `GenericQueue` and its inner `LinkedList` in a composition design?

**Choices:**
- **A.** IS-A
- **B.** HAS-A, exposing only queue operations
- **C.** the list extends the queue
- **D.** unrelated

**Correct Answer:** HAS-A, exposing only queue operations

**Explanation:** Composition wraps a `LinkedList` and presents only enqueue/dequeue/peek/etc.

---

## Question 87

**Question:** True or false: In a priority queue, decreasing a key (increasing priority) may require a sift-up to restore order.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Raising an element's priority in a min-heap can violate the parent relationship, requiring percolation upward.

---

## Question 88

**Question:** What prints?

```java
GenericQueue<Integer> q = new GenericQueue<>();
q.enqueue(1); q.enqueue(2);
q.enqueue(q.dequeue() + 10);
StringBuilder sb = new StringBuilder();
while (!q.isEmpty()) sb.append(q.dequeue()).append(" ");
System.out.println(sb.toString().trim());
```

**Choices:**
- **A.** 1 2
- **B.** 11 2
- **C.** 2 11
- **D.** 1 11

**Correct Answer:** 2 11

**Explanation:** dequeue→1, enqueue 1+10=11; queue becomes 2,11; draining prints "2 11".

---

## Question 89

**Question:** True or false: A queue is appropriate for implementing a cache eviction policy of "first-in-first-out".

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** FIFO cache eviction removes the oldest inserted entry—exactly queue behavior.

---

## Question 90

**Question:** Which is TRUE about `element()` vs `peek()` on `java.util.Queue`?

**Choices:**
- **A.** Both return null when empty
- **B.** Both throw when empty, which holds even for empty or degenerate inputs
- **C.** `element()` removes the head
- **D.** `element()` throws `NoSuchElementException` when empty; `peek()` returns null

**Correct Answer:** `element()` throws `NoSuchElementException` when empty; `peek()` returns null

**Explanation:** The examine operations mirror the two-flavor API: `element` throws, `peek` returns null.

---

## Question 91

**Question:** A deque used as a "sliding window maximum" keeps indices in the deque in ___ order of their values.

**Choices:**
- **A.** increasing
- **B.** decreasing (front holds the current max)
- **C.** random
- **D.** sorted ascending with max at rear

**Correct Answer:** decreasing (front holds the current max)

**Explanation:** The monotonic deque keeps values decreasing from front to rear so the maximum is always at the front.

---

## Question 92

**Question:** True or false: Converting a min-heap to a max-heap requires re-heapifying with the opposite comparator, O(n).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Reordering under a new comparator needs a bulk heapify, which is O(n).

---

## Question 93

**Question:** Which correctly identifies the head of a queue after `enqueue(x)` on an initially empty queue?

**Choices:**
- **A.** null
- **B.** the previous element
- **C.** x (it is both front and rear)
- **D.** undefined

**Correct Answer:** x (it is both front and rear)

**Explanation:** The first enqueued element becomes both the front and the rear of the queue.

---

## Question 94

**Question:** True or false: A priority queue does not guarantee that iteration order equals extraction order.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Only sequential `poll` gives priority order; the internal array/iterator is merely heap-ordered.

---

## Question 95

**Question:** Which structure gives O(1) enqueue and O(1) dequeue with unbounded growth and no resizing?

**Choices:**
- **A.** circular fixed array
- **B.** sorted array
- **C.** binary heap, because the elements are always stored contiguously
- **D.** singly linked list with head and tail pointers

**Correct Answer:** singly linked list with head and tail pointers

**Explanation:** Head for dequeue and tail for enqueue give O(1) each, and linked growth needs no resizing.

---

## Question 96

**Question:** True or false: A queue's `clear()` should reset it to empty (size 0, front/rear nulled or indices reset).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `clear()` restores the empty state, dropping references (linked) or resetting indices and count (array).

---

## Question 97

**Question:** In a bank simulation, customers served in arrival order use a queue; if VIPs jump ahead, you need a:

**Choices:**
- **A.** stack, and this is true regardless of how the data was built
- **B.** priority queue (VIP as higher priority)
- **C.** plain FIFO queue
- **D.** binary search tree

**Correct Answer:** priority queue (VIP as higher priority)

**Explanation:** Allowing higher-priority customers to be served first requires priority-based extraction.

---

## Question 98

**Question:** True or false: A heap-backed priority queue stores its complete binary tree compactly in an array with no explicit child pointers.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The complete-tree shape lets array-index arithmetic locate parents/children, eliminating pointer overhead.

---

## Question 99

**Question:** What prints?

```java
java.util.PriorityQueue<int[]> pq =
    new java.util.PriorityQueue<>((a, b) -> a[1] - b[1]);
pq.add(new int[]{1, 5});
pq.add(new int[]{2, 2});
pq.add(new int[]{3, 8});
System.out.println(pq.poll()[0]);
```

**Choices:**
- **A.** 1
- **B.** 3
- **C.** 2
- **D.** 8

**Correct Answer:** 2

**Explanation:** The comparator orders by index 1 (the second value); the minimum second value is 2 (from `{2,2}`), whose index 0 is 2.

---

## Question 100

**Question:** Final synthesis: A system processes network packets, most FIFO but "urgent" packets must skip ahead. A developer used a plain `LinkedList` queue and manually inserted urgent packets at the front, causing incorrect ordering among multiple urgent packets and O(n) scans. The best redesign is:

**Choices:**
- **A.** Keep the LinkedList but sort it on every insert
- **B.** Switch to a stack, which the definition guarantees in every case
- **C.** Use two LinkedLists and never merge them, so no traversal or comparison is ever needed
- **D.** Use a `PriorityQueue` keyed by (urgency, arrivalTime) so urgent packets lead and ties preserve arrival order

**Correct Answer:** Use a `PriorityQueue` keyed by (urgency, arrivalTime) so urgent packets lead and ties preserve arrival order

**Explanation:** A priority queue with a composite key gives O(log n) ordered insertion/extraction, correctly ranking urgent packets while a secondary arrival-time key keeps FIFO order among equals—unlike ad-hoc front insertion or repeated sorting.

---

### Answer distribution (self-check)
Correct answers are spread across A/B/C/D and are frequently short factual options, not the longest choice. True/False items alternate outcomes. Q19 includes a correction note illustrating the full/empty circular-queue trap.
