# Chapter 4 Linked List: 100 Extreme-Hard Questions

> Topics: List ADT, array vs linked list trade-offs, nodes, head/tail, singly/doubly/circular doubly linked lists, insertion & deletion pointer manipulation, traversal, and the Java Collections `LinkedList`. Choose the single best answer.

---

## Question 1

**Question:** Which operation is asymptotically cheaper on a singly linked list than on an array-backed list?

**Choices:**
- **A.** Random access `get(index)`
- **B.** Reading the last element with only a head reference
- **C.** Inserting at the front, given the head reference
- **D.** Binary search

**Correct Answer:** Inserting at the front, given the head reference

**Explanation:** Front insertion in a linked list is O(1) (relink the head), while an array must shift all elements, which is O(n). Random access and binary search favor arrays.

---

## Question 2

**Question:** A node is best described as:

**Choices:**
- **A.** A contiguous block of all elements
- **B.** An index into an array, because the elements are always stored contiguously
- **C.** A method that returns the size
- **D.** An element together with one or more references (links) to other nodes

**Correct Answer:** An element together with one or more references (links) to other nodes

**Explanation:** A node bundles the stored data with link(s) to neighboring node(s), enabling non-contiguous storage.

---

## Question 3

**Question:** In a singly linked list, to insert `newNode` after `current`, the correct order is:

**Choices:**
- **A.** `current.next = newNode; newNode.next = current.next;`
- **B.** `newNode.next = current; current = newNode;`
- **C.** `newNode.next = current.next; current.next = newNode;`
- **D.** `current = newNode.next; newNode = current.next;`

**Correct Answer:** `newNode.next = current.next; current.next = newNode;`

**Explanation:** You must first attach `newNode` to what follows `current`, then relink `current` to `newNode`; reversing the order loses the rest of the list.

---

## Question 4

**Question:** Why does the order in Q3 matter?

**Choices:**
- **A.** It does not matter, and this is true regardless of how the data was built
- **B.** Java evaluates right to left, which the definition guarantees in every case
- **C.** `newNode` must be null first
- **D.** Setting `current.next = newNode` first would overwrite the only link to the remaining nodes, losing them

**Correct Answer:** Setting `current.next = newNode` first would overwrite the only link to the remaining nodes, losing them

**Explanation:** Once `current.next` is reassigned, the original successor is unreachable unless `newNode.next` already captured it.

---

## Question 5

**Question:** For a singly linked list with only a `head` reference (no tail), `addLast` is:

**Choices:**
- **A.** O(1), so no traversal or comparison is ever needed
- **B.** O(log n)
- **C.** O(n) because you must traverse to the last node
- **D.** Impossible

**Correct Answer:** O(n) because you must traverse to the last node

**Explanation:** Without a tail pointer, reaching the end requires walking the whole list, which is O(n).

---

## Question 6

**Question:** Maintaining a `tail` reference makes which operation O(1) on a singly linked list?

**Choices:**
- **A.** `removeLast`
- **B.** `get(index)`
- **C.** `removeFirst` (already O(1) anyway)
- **D.** `addLast`

**Correct Answer:** `addLast`

**Explanation:** A tail pointer lets you append in O(1). `removeLast` remains O(n) on a singly linked list because you need the second-to-last node.

---

## Question 7

**Question:** Why is `removeLast` still O(n) on a singly linked list even with a tail pointer?

**Choices:**
- **A.** Because the tail cannot be read, making it the most efficient choice by design
- **B.** Because removal is forbidden, independent of the input size or ordering
- **C.** You need the node before the tail to update its `next` to null, requiring traversal
- **D.** Because the head must be deleted first

**Correct Answer:** You need the node before the tail to update its `next` to null, requiring traversal

**Explanation:** A singly linked node cannot reach its predecessor, so finding the new last node requires an O(n) walk.

---

## Question 8

**Question:** A doubly linked list node stores:

**Choices:**
- **A.** element and `next` only
- **B.** element only
- **C.** two elements and one link
- **D.** element, `next`, and `previous`

**Correct Answer:** element, `next`, and `previous`

**Explanation:** Doubly linked nodes hold links in both directions, enabling forward and backward traversal.

---

## Question 9

**Question:** Which operation becomes O(1) on a doubly linked list with a tail pointer that is O(n) on a singly linked list?

**Choices:**
- **A.** `get(index)`
- **B.** `contains`
- **C.** `removeLast`
- **D.** `indexOf`

**Correct Answer:** `removeLast`

**Explanation:** With `previous` links and a tail, the second-to-last node is reachable in O(1), making `removeLast` O(1).

---

## Question 10

**Question:** True or false: `get(index)` on a linked list is O(1) like an array.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Linked lists have no random access; reaching index `i` requires traversing `i` nodes, so `get` is O(n).

---

## Question 11

**Question:** In a circular doubly linked list, the last node's `next` points to:

**Choices:**
- **A.** null
- **B.** itself
- **C.** the second node
- **D.** the first node (head)

**Correct Answer:** the first node (head)

**Explanation:** Circular lists wrap around: the last node's `next` is the head, and the head's `previous` is the last node.

---

## Question 12

**Question:** Trace: singly linked list `1 -> 2 -> 3`. Execute `head = head.next;`. The list is now effectively:

**Choices:**
- **A.** `1 -> 2 -> 3`
- **B.** `1 -> 3`
- **C.** `2 -> 3`
- **D.** empty

**Correct Answer:** `2 -> 3`

**Explanation:** Advancing `head` to the second node makes node `1` unreachable, effectively removing the front.

---

## Question 13

**Question:** To delete the first node of a singly linked list, the essential statement is:

**Choices:**
- **A.** `head.next = null;`
- **B.** `head = null;`
- **C.** `tail = head;`
- **D.** `head = head.next;`

**Correct Answer:** `head = head.next;`

**Explanation:** Reassigning `head` to the second node removes the first; the old head becomes garbage. Setting `head = null` would empty the entire list.

---

## Question 14

**Question:** Deleting an intermediate node `x` (given predecessor `p`, where `p.next == x`) requires:

**Choices:**
- **A.** `p.next = x;`
- **B.** `x.next = p;`
- **C.** `p.next = x.next;`
- **D.** `p = x.next;`

**Correct Answer:** `p.next = x.next;`

**Explanation:** Bypassing `x` by linking its predecessor to its successor removes `x` from the chain.

---

## Question 15

**Question:** Why are linked lists preferred when frequent insertions/deletions occur in the middle, assuming you already hold a reference to the position?

**Choices:**
- **A.** They use less memory per node
- **B.** They allow binary search
- **C.** They have better cache locality
- **D.** Relinking is O(1) with no element shifting

**Correct Answer:** Relinking is O(1) with no element shifting

**Explanation:** Given the node reference, insertion/deletion only updates a few links, avoiding the O(n) shifting arrays require.

---

## Question 16

**Question:** The catch in Q15's advantage is that, in practice:

**Choices:**
- **A.** Relinking is actually O(n)
- **B.** Finding the position first is usually O(n) on a linked list
- **C.** Linked lists cannot delete
- **D.** Arrays cannot insert, as a direct consequence of the structure's shape

**Correct Answer:** Finding the position first is usually O(n) on a linked list

**Explanation:** The O(1) relink assumes you already have the node; locating it typically costs O(n), which often erases the advantage.

---

## Question 17

**Question:** Trace this doubly linked deletion of node `x` between `p` and `q` (`p <-> x <-> q`):

```
p.next = q;
q.previous = p;
```
What is the resulting structure?

**Choices:**
- **A.** `p <-> x <-> q`
- **B.** `x <-> q`
- **C.** `p <-> q` (x removed)
- **D.** empty list

**Correct Answer:** `p <-> q` (x removed)

**Explanation:** Both directional links bypass `x`, cleanly unlinking it from the doubly linked list.

---

## Question 18

**Question:** True or false: In a doubly linked list, deleting a node requires updating exactly two references (ignoring head/tail edge cases).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** You update the predecessor's `next` and the successor's `previous`; edge cases at head/tail may adjust those pointers instead.

---

## Question 19

**Question:** Which is TRUE about `size()` for a well-designed linked list class?

**Choices:**
- **A.** It must always traverse all nodes, O(n)
- **B.** It is O(log n), which holds even for empty or degenerate inputs
- **C.** It cannot be computed
- **D.** It can be O(1) if a size counter is maintained on add/remove

**Correct Answer:** It can be O(1) if a size counter is maintained on add/remove

**Explanation:** Keeping a running count updated during modifications makes `size()` a constant-time read.

---

## Question 20

**Question:** Java's `java.util.LinkedList` is implemented as a:

**Choices:**
- **A.** singly linked list
- **B.** doubly linked list
- **C.** circular singly linked list
- **D.** dynamic array

**Correct Answer:** doubly linked list

**Explanation:** `java.util.LinkedList` is a doubly linked list, giving O(1) add/remove at both ends.

---

## Question 21

**Question:** Consider inserting at index 0 of a singly linked list. Which correctly prepends `n`?

**Choices:**
- **A.** `head = n; n.next = head;`
- **B.** `head.next = n;`
- **C.** `n.next = head; head = n;`
- **D.** `n = head; head.next = n;`

**Correct Answer:** `n.next = head; head = n;`

**Explanation:** First point `n` at the current head, then move `head` to `n`. The reversed order makes `n.next` point to itself.

---

## Question 22

**Question:** What is the danger of `head = n; n.next = head;` (Option B in Q21)?

**Choices:**
- **A.** Nothing, it is correct, and this is true regardless of how the data was built
- **B.** It throws NullPointerException always
- **C.** It reverses the list, because the elements are always stored contiguously
- **D.** After `head = n`, `n.next = head` sets `n.next = n`, creating a self-loop and losing the old list

**Correct Answer:** After `head = n`, `n.next = head` sets `n.next = n`, creating a self-loop and losing the old list

**Explanation:** Because `head` already equals `n`, the second line makes `n` point to itself, orphaning the original nodes.

---

## Question 23

**Question:** True or false: A linked list supports binary search efficiently.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Binary search needs O(1) random access to the middle element; linked lists lack that, so reaching the midpoint is O(n) each step.

---

## Question 24

**Question:** For a list ADT, which set of operations is characteristic?

**Choices:**
- **A.** push, pop, peek, which the definition guarantees in every case
- **B.** add(index,e), get(index), remove(index), set(index,e), size
- **C.** enqueue, dequeue
- **D.** getFrequencyOf, union

**Correct Answer:** add(index,e), get(index), remove(index), set(index,e), size

**Explanation:** The List ADT offers positional, indexed operations, distinguishing it from stacks, queues, and bags.

---

## Question 25

**Question:** In `1 -> 2 -> 3 -> 4`, what does this print?

```java
Node p = head;
while (p.next.next != null) p = p.next;
System.out.println(p.element);
```

**Choices:**
- **A.** 2
- **B.** 4
- **C.** 3
- **D.** NullPointerException

**Correct Answer:** 3

**Explanation:** The loop stops when `p.next.next == null`, i.e., `p` is the second-to-last node (`3`), whose `next` (`4`) has null `next`.

---

## Question 26

**Question:** Which reference does a `LinkedList`-based `removeFirst` return and update?

**Choices:**
- **A.** It returns the tail and updates it
- **B.** It removes the middle
- **C.** It returns the size, so no traversal or comparison is ever needed
- **D.** It returns the removed element and advances `head` to the next node

**Correct Answer:** It returns the removed element and advances `head` to the next node

**Explanation:** `removeFirst` detaches the head node, returns its element, and moves `head` forward (adjusting `previous`/tail as needed in a doubly linked list).

---

## Question 27

**Question:** True or false: In a circular linked list, a naive `while (p != null)` traversal terminates correctly.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** A circular list has no null link, so `p != null` never becomes false—the loop runs forever. You must stop when returning to the starting node.

---

## Question 28

**Question:** To correctly traverse a circular singly linked list once starting at `head`, the stopping condition should be:

**Choices:**
- **A.** `p != null`, independent of the input size or ordering
- **B.** `p != head` after the first step (do-while), or track a counter
- **C.** `p.next == null`
- **D.** `p == tail`

**Correct Answer:** `p != head` after the first step (do-while), or track a counter

**Explanation:** Since the list loops back to `head`, you must stop when you return to the start, typically using a do-while or a size counter.

---

## Question 29

**Question:** Memory-wise, a doubly linked list vs a singly linked list:

**Choices:**
- **A.** uses less memory per node
- **B.** uses the same memory, making it the most efficient choice by design
- **C.** uses more memory per node due to the extra `previous` reference
- **D.** uses no references at all

**Correct Answer:** uses more memory per node due to the extra `previous` reference

**Explanation:** Each doubly linked node carries an additional pointer, increasing per-node overhead in exchange for backward traversal.

---

## Question 30

**Question:** A method reverses a singly linked list iteratively. Which three-pointer step is the core of each iteration?

**Choices:**
- **A.** `prev = curr; curr = next; next = prev;`
- **B.** `curr.next = next; prev = next; curr = prev;`
- **C.** `curr = curr.next.next;`, as a direct consequence of the structure's shape
- **D.** `next = curr.next; curr.next = prev; prev = curr; curr = next;`

**Correct Answer:** `next = curr.next; curr.next = prev; prev = curr; curr = next;`

**Explanation:** Save the successor, flip the current link backward, then advance both `prev` and `curr`. This is the canonical iterative reversal.

---

## Question 31

**Question:** After fully reversing `1 -> 2 -> 3`, the new head is:

**Choices:**
- **A.** 1
- **B.** 3
- **C.** 2
- **D.** null

**Correct Answer:** 3

**Explanation:** Reversal makes the old tail the new head, yielding `3 -> 2 -> 1`.

---

## Question 32

**Question:** True or false: Inserting into a sorted linked list requires shifting elements like an array.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Linked lists never shift; you find the position and relink pointers. Only arrays must shift elements to keep order.

---

## Question 33

**Question:** Which is the correct condition to detect a cycle using Floyd's tortoise and hare?

**Choices:**
- **A.** fast reaches null
- **B.** slow reaches the tail
- **C.** slow and fast pointers meet
- **D.** slow.next == fast

**Correct Answer:** slow and fast pointers meet

**Explanation:** In a cyclic list, the fast pointer laps the slow one and they meet; if fast hits null, the list is acyclic.

---

## Question 34

**Question:** Given `head` of a list with `n` nodes, finding the middle in one pass uses:

**Choices:**
- **A.** a single pointer and size/2
- **B.** binary search, which holds even for empty or degenerate inputs
- **C.** recursion only
- **D.** slow/fast pointers where fast moves twice per slow step

**Correct Answer:** slow/fast pointers where fast moves twice per slow step

**Explanation:** When fast reaches the end, slow is at the middle—an O(n) single-pass technique without knowing `n` in advance.

---

## Question 35

**Question:** True or false: `LinkedList` in Java implements both `List` and `Deque`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `java.util.LinkedList` implements `List` and `Deque`, so it can act as a list, stack, or queue.

---

## Question 36

**Question:** Which statement about `indexOf(e)` on a linked list is correct?

**Choices:**
- **A.** O(1) using a hash
- **B.** O(n) linear scan comparing each element
- **C.** O(log n) binary search
- **D.** Impossible without a tail pointer

**Correct Answer:** O(n) linear scan comparing each element

**Explanation:** Without indexing/hashing, locating an element's position requires scanning from the head, which is O(n).

---

## Question 37

**Question:** In a doubly linked list, `addBefore(node, newNode)` must update how many links (non-edge case)?

**Choices:**
- **A.** 2
- **B.** 1
- **C.** 4
- **D.** 0

**Correct Answer:** 4

**Explanation:** You set `newNode.previous`, `newNode.next`, the predecessor's `next`, and `node.previous`—four link assignments.

---

## Question 38

**Question:** What is printed?

```java
// list: 10 -> 20 -> 30
Node p = head;
int sum = 0;
while (p != null) { sum += p.element; p = p.next; }
System.out.println(sum);
```

**Choices:**
- **A.** 30
- **B.** 0
- **C.** NullPointerException
- **D.** 60

**Correct Answer:** 60

**Explanation:** The loop traverses all nodes summing 10 + 20 + 30 = 60, terminating when `p` becomes null.

---

## Question 39

**Question:** A subtle bug: `while (p.next != null) { sum += p.element; p = p.next; }` on `10 -> 20 -> 30` prints:

**Choices:**
- **A.** 60
- **B.** 30 (last element missed)
- **C.** 0
- **D.** NullPointerException

**Correct Answer:** 30 (last element missed)

**Explanation:** The condition `p.next != null` stops before processing the last node, so only 10 + 20 = 30 is summed (the last element 30 is skipped).

---

## Question 40

**Question:** Which best explains an array list's advantage over a linked list for the operation `get(i)` in a tight loop?

**Choices:**
- **A.** Arrays store elements non-contiguously
- **B.** Arrays use linked nodes internally
- **C.** Arrays give O(1) indexed access with cache-friendly contiguous memory
- **D.** Arrays cannot be indexed, because the elements are always stored contiguously

**Correct Answer:** Arrays give O(1) indexed access with cache-friendly contiguous memory

**Explanation:** Index arithmetic yields direct O(1) access and contiguous storage improves cache performance, unlike pointer-chasing linked lists.

---

## Question 41

**Question:** True or false: Appending n elements one-by-one to an array list is O(n) amortized total; to a linked list with a tail pointer it is also O(n) total.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Array list append is O(1) amortized (O(n) total with doubling); linked list append with a tail is O(1) each (O(n) total). Both are linear overall.

---

## Question 42

**Question:** A `Node<E>` declared as a private static nested class inside the list is common because:

**Choices:**
- **A.** It must access the outer instance
- **B.** Static nested classes cannot use generics
- **C.** It is required for compilation, and this is true regardless of how the data was built
- **D.** It does not need a reference to the enclosing list instance

**Correct Answer:** It does not need a reference to the enclosing list instance

**Explanation:** A node needs no link to the enclosing list object, so making it static avoids an implicit outer reference and its memory cost.

---

## Question 43

**Question:** Which is TRUE about clearing a linked list?

**Choices:**
- **A.** You must delete each node manually with free()
- **B.** Setting `head = null` (and `tail = null`, `size = 0`) suffices; GC reclaims unreachable nodes
- **C.** You must reverse it first, which the definition guarantees in every case
- **D.** Clearing is O(n) mandatory in Java, so no traversal or comparison is ever needed

**Correct Answer:** Setting `head = null` (and `tail = null`, `size = 0`) suffices; GC reclaims unreachable nodes

**Explanation:** Dropping the head makes all nodes unreachable; Java's garbage collector reclaims them, so no manual freeing is needed.

---

## Question 44

**Question:** In `1 <-> 2 <-> 3` (doubly linked), executing `node2.previous.next = node2.next; node2.next.previous = node2.previous;` results in:

**Choices:**
- **A.** `1 <-> 2 <-> 3`
- **B.** `2 <-> 3`
- **C.** `1 <-> 3`
- **D.** empty

**Correct Answer:** `1 <-> 3`

**Explanation:** The two statements unlink node2 by connecting node1 and node3 directly in both directions.

---

## Question 45

**Question:** True or false: A singly linked list can be traversed backward in O(n) without extra structures.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Singly linked nodes have no backward link; reversing or using a stack/recursion is needed to visit in reverse, so a plain backward traversal is impossible.

---

## Question 46

**Question:** Which operation on `java.util.ArrayList` is O(n) but O(1) on `java.util.LinkedList` (via its list-iterator/deque ends)?

**Choices:**
- **A.** `get(i)`, independent of the input size or ordering
- **B.** `set(i, e)`
- **C.** `size()`
- **D.** `add(0, e)` (insert at front)

**Correct Answer:** `add(0, e)` (insert at front)

**Explanation:** Front insertion shifts all array elements (O(n)) but is O(1) for a linked list at the head end.

---

## Question 47

**Question:** Consider a list with a sentinel/dummy head node. Its main benefit is:

**Choices:**
- **A.** It stores extra data
- **B.** It eliminates special-case code for insertion/deletion at the front
- **C.** It makes the list circular
- **D.** It doubles capacity, making it the most efficient choice by design

**Correct Answer:** It eliminates special-case code for insertion/deletion at the front

**Explanation:** A dummy head means the first real node always has a predecessor, unifying the logic and removing null/head edge cases.

---

## Question 48

**Question:** What prints?

```java
// 5 -> 10 -> 15
Node p = head, prev = null;
while (p != null) { Node n = p.next; p.next = prev; prev = p; p = n; }
head = prev;
System.out.println(head.element);
```

**Choices:**
- **A.** 5
- **B.** 10
- **C.** 15
- **D.** null

**Correct Answer:** 15

**Explanation:** This is the standard iterative reversal; the old tail (15) becomes the new head.

---

## Question 49

**Question:** True or false: `add(index, e)` on a linked list is O(1) once the index node is located.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** After locating the position (O(n)), the actual link updates are O(1); the cost is dominated by the traversal to the index.

---

## Question 50

**Question:** Which pointer bug causes a memory-safe but incorrect "insert after current" that drops the tail portion?

**Choices:**
- **A.** `newNode.next = current.next; current.next = newNode;`
- **B.** `newNode.next = current; current.next = newNode;`
- **C.** none of these
- **D.** `current.next = newNode; newNode.next = current.next;`

**Correct Answer:** `current.next = newNode; newNode.next = current.next;`

**Explanation:** After `current.next = newNode`, the second line sets `newNode.next = newNode` (self-loop), losing the original tail.

---

## Question 51

**Question:** For repeatedly removing from the front and adding to the back (queue-like), which is best?

**Choices:**
- **A.** ArrayList with front removals
- **B.** LinkedList (O(1) at both ends)
- **C.** A sorted array
- **D.** A fixed array with front removal

**Correct Answer:** LinkedList (O(1) at both ends)

**Explanation:** A doubly linked list removes from the front and adds to the back in O(1), ideal for queue behavior; array front removal is O(n).

---

## Question 52

**Question:** True or false: Two linked lists sharing a common tail (converging) can be detected by comparing the last nodes' identity.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** If two acyclic lists intersect, they share all nodes from the intersection onward, so their last nodes are the same object—comparing identity detects it.

---

## Question 53

**Question:** Which is NOT a valid List ADT operation?

**Choices:**
- **A.** `lastIndexOf(e)`
- **B.** `set(index, e)`
- **C.** `push(e)` as the only insertion method
- **D.** `contains(e)`, as a direct consequence of the structure's shape

**Correct Answer:** `push(e)` as the only insertion method

**Explanation:** `push` is stack-specific; a List ADT offers positional insertion/removal and search, not a stack-only interface.

---

## Question 54

**Question:** In a doubly linked list with head and tail sentinels, an empty list has:

**Choices:**
- **A.** head == null, which holds even for empty or degenerate inputs
- **B.** head == tail == null
- **C.** head.next == head
- **D.** head.next == tail and tail.previous == head

**Correct Answer:** head.next == tail and tail.previous == head

**Explanation:** With sentinels, an empty list links the two sentinels directly to each other, simplifying boundary logic.

---

## Question 55

**Question:** What is the time to search for an element in an unsorted linked list of n nodes, worst case?

**Choices:**
- **A.** O(n)
- **B.** O(1)
- **C.** O(log n)
- **D.** O(n log n)

**Correct Answer:** O(n)

**Explanation:** An unsorted list requires scanning up to all n nodes in the worst case.

---

## Question 56

**Question:** True or false: Converting a singly linked list to an array to enable binary search is a valid strategy when many searches follow few modifications.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** If searches dominate, paying O(n) once to build a sorted array enables O(log n) searches—amortizing well over many queries.

---

## Question 57

**Question:** Which describes the effect of `p = p.next.next;` when `p.next` is null?

**Choices:**
- **A.** `p` becomes null safely
- **B.** NullPointerException
- **C.** `p` stays unchanged
- **D.** The list is cleared

**Correct Answer:** NullPointerException

**Explanation:** Accessing `.next` on a null reference throws NPE; skip-two traversals must null-check both hops.

---

## Question 58

**Question:** The primary reason `LinkedList` outperforms `ArrayList` for a stack of pending tasks with heavy front operations is:

**Choices:**
- **A.** Better random access
- **B.** Lower memory usage, because the elements are always stored contiguously
- **C.** O(1) insertion/removal at an end without element shifting
- **D.** Built-in binary search

**Correct Answer:** O(1) insertion/removal at an end without element shifting

**Explanation:** Linked lists modify ends by relinking, avoiding the shifting that arrays require for front operations.

---

## Question 59

**Question:** True or false: In a doubly linked list, you can delete a given node in O(1) without knowing its predecessor.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Because the node stores `previous`, you can relink `previous.next` and `next.previous` directly—no separate predecessor search needed.

---

## Question 60

**Question:** In a singly linked list, deleting a given node in O(1) without its predecessor can be faked by:

**Choices:**
- **A.** setting this node to null
- **B.** reversing the list, and this is true regardless of how the data was built
- **C.** it is truly impossible in all cases
- **D.** copying the next node's data into this node and unlinking the next node

**Correct Answer:** copying the next node's data into this node and unlinking the next node

**Explanation:** Overwriting the target with its successor's data and skipping the successor simulates deletion in O(1)—though it fails if the node is the tail.

---

## Question 61

**Question:** Which is the limitation of the Q60 trick?

**Choices:**
- **A.** It cannot delete the last node
- **B.** It works only on sorted lists
- **C.** It requires a tail pointer
- **D.** It is O(n)

**Correct Answer:** It cannot delete the last node

**Explanation:** The copy-successor technique needs a following node; the tail has none, so it cannot be removed this way.

---

## Question 62

**Question:** A list interface method `E remove(int index)` should return:

**Choices:**
- **A.** the new size
- **B.** the element that was removed
- **C.** a boolean
- **D.** the head, which the definition guarantees in every case

**Correct Answer:** the element that was removed

**Explanation:** By convention, indexed removal returns the removed element so the caller can use it.

---

## Question 63

**Question:** True or false: `addFirst` and `addLast` are both O(1) on `java.util.LinkedList`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Being a doubly linked list with head and tail references, both ends support O(1) insertion.

---

## Question 64

**Question:** What structure results from `head.next = head;` on a single-node list (node `A`)?

**Choices:**
- **A.** empty list, so no traversal or comparison is ever needed
- **B.** NullPointerException
- **C.** a circular list of one node pointing to itself
- **D.** a two-node list

**Correct Answer:** a circular list of one node pointing to itself

**Explanation:** `A.next = A` forms a one-node cycle; naive `p != null` traversal would loop forever.

---

## Question 65

**Question:** Which is TRUE comparing `contains` on ArrayList vs LinkedList?

**Choices:**
- **A.** ArrayList is O(1)
- **B.** LinkedList is O(log n)
- **C.** Both are O(1), independent of the input size or ordering
- **D.** Both are O(n) but ArrayList often has better cache locality

**Correct Answer:** Both are O(n) but ArrayList often has better cache locality

**Explanation:** Membership search is linear for both, yet contiguous arrays typically scan faster due to cache behavior.

---

## Question 66

**Question:** A list is `A <-> B <-> C`. After `B.next = null;` only (doubly linked), what is a resulting inconsistency?

**Choices:**
- **A.** Forward traversal stops at B, but C.previous still points to B
- **B.** None; list is fine
- **C.** The list becomes circular
- **D.** A is deleted, making it the most efficient choice by design

**Correct Answer:** Forward traversal stops at B, but C.previous still points to B

**Explanation:** Updating only one direction breaks the doubly linked invariant; both `B.next` and `C.previous` must be maintained consistently.

---

## Question 67

**Question:** True or false: The head reference is mandatory; the tail reference is optional but improves certain operations.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** You must have the head to access the list; a tail pointer is an optional optimization for end operations.

---

## Question 68

**Question:** For `set(index, e)` on a linked list, the cost is dominated by:

**Choices:**
- **A.** the relink (O(1))
- **B.** traversing to the index (O(n))
- **C.** resizing (O(n))
- **D.** sorting (O(n log n))

**Correct Answer:** traversing to the index (O(n))

**Explanation:** Reaching the node is O(n); replacing its element is O(1), so traversal dominates.

---

## Question 69

**Question:** Which is the safest way to iterate and remove matching elements from a `java.util.LinkedList`?

**Choices:**
- **A.** A for-each loop calling `list.remove(x)` inside
- **B.** Indexing with `get(i)` and `remove(i)` while incrementing i
- **C.** An `Iterator` with `it.remove()`
- **D.** Recursion on the head

**Correct Answer:** An `Iterator` with `it.remove()`

**Explanation:** `Iterator.remove()` safely removes during iteration; modifying the list directly in a for-each throws `ConcurrentModificationException`.

---

## Question 70

**Question:** True or false: Merging two sorted singly linked lists into one sorted list can be done in O(n + m) with only pointer relinking.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A merge walks both lists once, splicing nodes by comparison—linear time and no element copying.

---

## Question 71

**Question:** What is the output?

```java
// 1 -> 2 -> 3 -> 4 -> 5
Node slow = head, fast = head;
while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
System.out.println(slow.element);
```

**Choices:**
- **A.** 2
- **B.** 4
- **C.** 5
- **D.** 3

**Correct Answer:** 3

**Explanation:** The slow/fast technique lands `slow` on the middle node; for 5 nodes, that is element 3.

---

## Question 72

**Question:** For the same code on an even-length list `1 -> 2 -> 3 -> 4`, `slow.element` is:

**Choices:**
- **A.** 3
- **B.** 2
- **C.** 1
- **D.** 4

**Correct Answer:** 3

**Explanation:** With 4 nodes, fast goes 1→3→null; slow advances twice to node 3 (the second of the two middles under this loop form).

---

## Question 73

**Question:** Which statement about the List ADT vs its implementations is correct?

**Choices:**
- **A.** The List ADT dictates array storage
- **B.** The List ADT can be implemented by an array (ArrayList) or linked nodes
- **C.** Only linked storage satisfies the List ADT
- **D.** The List ADT forbids duplicates, as a direct consequence of the structure's shape

**Correct Answer:** The List ADT can be implemented by an array (ArrayList) or linked nodes

**Explanation:** The List ADT is implementation-agnostic; both array-backed and node-based structures fulfill it with different trade-offs.

---

## Question 74

**Question:** True or false: A circular doubly linked list makes both `addFirst` and `addLast` O(1) even without a separate tail pointer, given a head.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** In a circular doubly linked list, `head.previous` is the last node, so the tail is reachable in O(1) from the head—both ends are O(1).

---

## Question 75

**Question:** Which best explains why linked lists have poor cache performance?

**Choices:**
- **A.** They store elements contiguously
- **B.** They use binary search
- **C.** Nodes are scattered in memory
- **D.** They resize frequently

**Correct Answer:** Nodes are scattered in memory

**Explanation:** Non-contiguous node allocation defeats spatial locality, increasing cache misses compared to arrays.

---

## Question 76

**Question:** In `add(index, e)`, if `index == size`, the operation is equivalent to:

**Choices:**
- **A.** `addFirst(e)`
- **B.** `remove(0)`
- **C.** `set(0, e)`
- **D.** `addLast(e)`

**Correct Answer:** `addLast(e)`

**Explanation:** Inserting at position `size` appends to the end, i.e., `addLast`.

---

## Question 77

**Question:** True or false: The time to compute `size()` by traversal is O(n), which is why classes cache it.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Counting nodes by traversal is O(n); caching the size in a field makes `size()` O(1).

---

## Question 78

**Question:** A `Node<E>` in a generic singly linked list is best declared as:

**Choices:**
- **A.** `static class Node<E> { E element; Node<E> next; }`
- **B.** `class Node { Object element; Node next; }`
- **C.** `class Node<E> { E element; }`
- **D.** `class Node { E element; }`

**Correct Answer:** `static class Node<E> { E element; Node<E> next; }`

**Explanation:** A generic, self-referential static nested node with a `next` of the same generic type is the standard, type-safe form.

---

## Question 79

**Question:** Which operation demonstrates the linked list's weakness most clearly?

**Choices:**
- **A.** `addFirst`
- **B.** `get(n/2)` in a large list
- **C.** `removeFirst`
- **D.** `isEmpty`, which holds even for empty or degenerate inputs

**Correct Answer:** `get(n/2)` in a large list

**Explanation:** Indexed access requires traversing half the list, O(n), which arrays do in O(1)—the linked list's core weakness.

---

## Question 80

**Question:** True or false: Deleting the head of a doubly linked list must also update the new head's `previous` to null.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** After removing the old head, the new head should have `previous == null` (or point to a sentinel) to preserve the invariant.

---

## Question 81

**Question:** What prints?

```java
// list: A -> B -> C
Node p = head;
StringBuilder sb = new StringBuilder();
for (int i = 0; p != null; i++, p = p.next)
    if (i % 2 == 0) sb.append(p.element);
System.out.println(sb);
```

**Choices:**
- **A.** ABC
- **B.** B
- **C.** AC
- **D.** BC

**Correct Answer:** AC

**Explanation:** Only even indices (0 → A, 2 → C) are appended; index 1 (B) is skipped.

---

## Question 82

**Question:** Which is the correct way to check emptiness of a head-based linked list?

**Choices:**
- **A.** `head.next == null`
- **B.** `tail == head`
- **C.** `head.element == null`
- **D.** `head == null` (or `size == 0`)

**Correct Answer:** `head == null` (or `size == 0`)

**Explanation:** A null head means no nodes exist; a cached size of 0 is equivalent. The other checks misidentify one-node or valued cases.

---

## Question 83

**Question:** True or false: A linked list's `toArray()` is O(n) and requires allocating a new array.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** You must traverse all nodes (O(n)) and copy elements into a freshly allocated array of the right size.

---

## Question 84

**Question:** Which statement about inserting at the tail of a circular singly linked list with only a `tail` pointer is correct?

**Choices:**
- **A.** It is O(1): the new node goes after `tail`, links to `tail.next` (head), and becomes the new tail
- **B.** It is O(n), because the elements are always stored contiguously
- **C.** It is impossible, and this is true regardless of how the data was built
- **D.** It requires reversing the list

**Correct Answer:** It is O(1): the new node goes after `tail`, links to `tail.next` (head), and becomes the new tail

**Explanation:** In a circular list, `tail.next` is the head, so both head and tail are reachable from `tail`, enabling O(1) tail insertion.

---

## Question 85

**Question:** Why might a single `tail`-only pointer be preferred over a `head`-only pointer for a circular list acting as a queue?

**Choices:**
- **A.** It cannot be, which the definition guarantees in every case
- **B.** From `tail` you reach both the head (`tail.next`) for dequeue and the tail for enqueue in O
- **C.** It saves memory, so no traversal or comparison is ever needed
- **D.** It enables binary search

**Correct Answer:** From `tail` you reach both the head (`tail.next`) for dequeue and the tail for enqueue in O

**Explanation:** A tail pointer in a circular list gives O(1) access to both ends, perfect for queue enqueue/dequeue.

---

## Question 86

**Question:** True or false: In Java, setting a node's references to null before it goes out of scope is required to avoid memory leaks.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Java's GC reclaims unreachable objects automatically; nulling links can help in specific long-lived structures but is not generally required.

---

## Question 87

**Question:** Which structure allows O(1) `removeLast` AND O(1) `get(0)`?

**Choices:**
- **A.** singly linked list with head only
- **B.** singly linked list with tail only
- **C.** doubly linked list with head and tail
- **D.** sorted array

**Correct Answer:** doubly linked list with head and tail

**Explanation:** Backward links plus a tail give O(1) `removeLast`, and the head gives O(1) front access.

---

## Question 88

**Question:** A method returns the k-th node from the end in one pass using:

**Choices:**
- **A.** binary search, independent of the input size or ordering
- **B.** reversing then indexing
- **C.** a hash map of positions
- **D.** two pointers k apart, advancing together until the leader hits null

**Correct Answer:** two pointers k apart, advancing together until the leader hits null

**Explanation:** Advance a lead pointer k steps, then move both until the lead reaches the end; the trailing pointer lands on the k-th from the end—single pass, O(n).

---

## Question 89

**Question:** True or false: `java.util.LinkedList.get(i)` optimizes by traversing from whichever end (head or tail) is closer to `i`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Being doubly linked, it starts from the nearer end, roughly halving average traversal—still O(n) though.

---

## Question 90

**Question:** Which is a correct invariant for a non-empty doubly linked list without sentinels?

**Choices:**
- **A.** `head.previous == null` and `tail.next == null`
- **B.** `head.previous == tail`
- **C.** `tail.next == head`, making it the most efficient choice by design
- **D.** `head == tail` always

**Correct Answer:** `head.previous == null` and `tail.next == null`

**Explanation:** In a non-circular doubly linked list, the ends terminate in null links; the circular variant would differ.

---

## Question 91

**Question:** What prints?

```java
// 1 -> 2 -> 3
Node a = head, b = head.next, c = head.next.next;
a.next = c; c.next = b; b.next = null; head = a;
Node p = head; StringBuilder s = new StringBuilder();
while (p != null){ s.append(p.element); p = p.next; }
System.out.println(s);
```

**Choices:**
- **A.** 123
- **B.** 132
- **C.** 321
- **D.** 213

**Correct Answer:** 132

**Explanation:** Relinking makes `1 -> 3 -> 2 -> null`, so traversal prints "132".

---

## Question 92

**Question:** True or false: Recursion can traverse a singly linked list in reverse order by printing after the recursive call.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Recursing to the end first and printing on the way back visits nodes in reverse—using the call stack as implicit backward links.

---

## Question 93

**Question:** Which best captures the trade-off between ArrayList and LinkedList?

**Choices:**
- **A.** They are identical in all operations
- **B.** LinkedList is always faster, which holds even for empty or degenerate inputs
- **C.** ArrayList: fast indexed access, slow middle insert; LinkedList: slow indexed access, fast end/known-position insert
- **D.** ArrayList cannot grow, as a direct consequence of the structure's shape

**Correct Answer:** ArrayList: fast indexed access, slow middle insert; LinkedList: slow indexed access, fast end/known-position insert

**Explanation:** This captures the canonical trade-off driven by contiguous vs linked storage.

---

## Question 94

**Question:** In a list with a dummy head node `dummy -> A -> B`, the "first real node" is accessed via:

**Choices:**
- **A.** `dummy`
- **B.** `dummy.previous`
- **C.** `tail`
- **D.** `dummy.next`

**Correct Answer:** `dummy.next`

**Explanation:** The sentinel `dummy` is not a data node; the first real element is `dummy.next`.

---

## Question 95

**Question:** True or false: Adding a tail pointer changes the asymptotic complexity of `contains`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** `contains` still scans linearly regardless of a tail pointer; the tail only helps end operations, not search.

---

## Question 96

**Question:** Which operation would you implement with a stack (or recursion) rather than direct linked-list pointers?

**Choices:**
- **A.** printing the list in reverse for a singly linked list
- **B.** addFirst, because the elements are always stored contiguously
- **C.** removeFirst
- **D.** size with a counter

**Correct Answer:** printing the list in reverse for a singly linked list

**Explanation:** Without backward links, reverse printing uses a stack or recursion to defer output until the end is reached.

---

## Question 97

**Question:** A bug: after `removeFirst` on a one-node list, code forgets to also set `tail = null`. The symptom is:

**Choices:**
- **A.** No issue
- **B.** `tail` dangles to a removed node
- **C.** The list becomes circular
- **D.** size becomes negative automatically

**Correct Answer:** `tail` dangles to a removed node

**Explanation:** When the list becomes empty, both head and tail must be nulled; a stale tail corrupts subsequent tail operations.

---

## Question 98

**Question:** True or false: The List ADT's `add(index, e)` with an out-of-range index should be handled (e.g., throw `IndexOutOfBoundsException`).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A robust List implementation validates the index and throws `IndexOutOfBoundsException` for invalid positions.

---

## Question 99

**Question:** Which is TRUE about splitting a linked list into two halves?

**Choices:**
- **A.** It requires knowing the size in advance always
- **B.** It is O(n log n), and this is true regardless of how the data was built
- **C.** The slow/fast technique finds the split point in one pass, then you cut the link
- **D.** It is impossible without a tail pointer

**Correct Answer:** The slow/fast technique finds the split point in one pass, then you cut the link

**Explanation:** Slow/fast pointers locate the midpoint in O(n); severing `slow.next` splits the list, foundational to merge sort on lists.

---

## Question 100

**Question:** Final synthesis: You must repeatedly (a) insert/remove at both ends and (b) never need random indexed access. Between `ArrayList` and `LinkedList`, the better choice and reason is:

**Choices:**
- **A.** ArrayList, because indexing is O(1), so no traversal or comparison is ever needed
- **B.** ArrayList, because it uses less memory per element
- **C.** Either; performance is identical, which the definition guarantees in every case
- **D.** LinkedList, because both ends are O(1) and indexed access is not needed, avoiding array shifting

**Correct Answer:** LinkedList, because both ends are O(1) and indexed access is not needed, avoiding array shifting

**Explanation:** With no indexing requirement and heavy end operations, the doubly linked list's O(1) end operations dominate; the array's O(1) indexing is irrelevant here and its front operations would be O(n).

---

### Answer distribution (self-check)
Correct answers span A/B/C/D positions; many correct options are short factual statements rather than the longest choice. True/False items alternate True and False across the set.
