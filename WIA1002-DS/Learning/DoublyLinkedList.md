# Doubly Linked List Full Notes

---

# Part 1: What is a Doubly Linked List?

## 1. Quick Revision: Singly Linked List

In a singly linked list, each node has:

1. element
2. next

Example:

head
 ↓
[A] → [B] → [C] → null
                  ↑
                 tail

Each node only knows the next node.

So you can move forward:

A → B → C

But you cannot directly move backward:

C → B → A

This is why removeLast() is harder in singly linked list because we must start from head to find the second last node.

---

## 2. What is a Doubly Linked List?

A doubly linked list is a linked list where each node has two pointers:

1. prev
2. next

So each node can point to:

1. previous node
2. next node

A doubly linked list can move forward and backward.

---

## 3. Doubly Linked List Node Structure

Singly linked list node:

+---------+------+
| element | next |
+---------+------+

Doubly linked list node:

+------+---------+------+
| prev | element | next |
+------+---------+------+

Java node class:

class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;

    public Node(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}

---

## 4. Visual Example

Singly linked list:

[A] → [B] → [C] → null

Doubly linked list:

null ← [A] ⇄ [B] ⇄ [C] → null

More detailed:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

Meaning:

A.next = B
B.next = C
C.next = null

C.prev = B
B.prev = A
A.prev = null

---

## 5. What does prev do?

prev means previous.

Example:

[A] ⇄ [B] ⇄ [C]

For node B:

B.prev = A
B.next = C

So from B, we can move forward:

B → C

and backward:

B → A

This is the biggest advantage of a doubly linked list.

---

## 6. Why use Doubly Linked List?

Because it allows movement in both directions.

Example:

In singly linked list:

A → B → C

If you are at C, you cannot directly go back to B.

But in doubly linked list:

A ⇄ B ⇄ C

If you are at C, you can go back to B using:

current = current.prev;

---

## 7. Disadvantage of Doubly Linked List

A doubly linked list needs extra memory.

Why?

Because every node has one extra pointer:

prev

Singly node:

[element | next]

Doubly node:

[prev | element | next]

So doubly linked list is more flexible, but it uses more memory.

---

## 8. Compare Singly vs Doubly Linked List

Singly Linked List:

Node:
[element | next]

Movement:
Forward only

Example:
A → B → C → null

Doubly Linked List:

Node:
[prev | element | next]

Movement:
Forward and backward

Example:
null ← A ⇄ B ⇄ C → null

---

## 9. Head and Tail in Doubly Linked List

Same as singly linked list:

head = first node
tail = last node

Example:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

For the first node:

head.prev = null

For the last node:

tail.next = null

---

## 10. Empty Doubly Linked List

If the list is empty:

head = null
tail = null
size = 0

---

## 11. One-node Doubly Linked List

If there is only one node:

head
 ↓
null ← [A] → null
 ↑
tail

For node A:

A.prev = null
A.next = null

And:

head points to A
tail points to A

Because the only node is both the first and last node.

---

## 12. Key Sentences

A singly linked list has next only.

A doubly linked list has next and prev.

In doubly linked list, every connection must be fixed in two directions.

Example:

A ⇄ B

means:

A.next = B
B.prev = A

---

# Part 2: Node Class and addFirst()

## 1. Doubly Linked List Node

In singly linked list, each node has:

element
next

In doubly linked list, each node has:

prev
element
next

Structure:

+------+---------+------+
| prev | element | next |
+------+---------+------+

---

## 2. Node Class

class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;

    public Node(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}

Explanation:

E element
    Stores the value.

Node<E> next
    Points to the next node.

Node<E> prev
    Points to the previous node.

---

## 3. Basic Doubly Linked List Class

class MyDoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
}

Meaning:

head points to the first node.
tail points to the last node.
size stores the number of nodes.

---

## 4. What is addFirst(E e)?

addFirst(E e)

means:

Add a new node at the beginning of the doubly linked list.

Example:

Before:
null ← [A] ⇄ [B] ⇄ [C] → null

addFirst(X)

After:
null ← [X] ⇄ [A] ⇄ [B] ⇄ [C] → null

---

## 5. Case 1: Empty List

If the list is empty:

head = null
tail = null
size = 0

Create new node:

Node<E> newNode = new Node<>(e);

Example:

newNode
 ↓
null ← [X] → null

Since this is the only node:

head points to X
tail points to X

Code:

head = newNode;
tail = newNode;

Final:

head
 ↓
null ← [X] → null
 ↑
tail

Because the only node is both the first and last node.

---

## 6. Case 2: Non-empty List

Suppose we already have:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

We want to add X at the front.

Create new node:

newNode
 ↓
null ← [X] → null

Now we need to connect X and A in two directions.

---

## 7. Step 1: New Node Points to Old Head

newNode.next = head;

Diagram:

[X] → [A] ⇄ [B] ⇄ [C]
       ↑
      head

Now X.next points to A.

---

## 8. Step 2: Old Head Points Back to New Node

head.prev = newNode;

Diagram:

[X] ⇄ [A] ⇄ [B] ⇄ [C]
       ↑
      head

Now:

X.next = A
A.prev = X

This creates the two-way connection.

---

## 9. Step 3: Move Head to New Node

head = newNode;

Final:

head
 ↓
null ← [X] ⇄ [A] ⇄ [B] ⇄ [C] → null
                                  ↑
                                 tail

Now X is the first node.

---

## 10. Why Order Matters

Correct order:

newNode.next = head;
head.prev = newNode;
head = newNode;

Why?

Because before moving head, head still points to the old first node.

So this line works correctly:

head.prev = newNode;

It means:

old first node's prev points to new node

If you do this first:

head = newNode;

Then head no longer points to the old first node.

You may lose access to the old first node from head.

Rule:

Connect first, then move head.

---

## 11. Complete addFirst() Code

public void addFirst(E e) {
    Node<E> newNode = new Node<>(e);

    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    size++;
}

---

## 12. Explanation

Node<E> newNode = new Node<>(e);
    Create a new node.

if (head == null)
    Check whether the list is empty.

head = newNode;
tail = newNode;
    If the list is empty, the new node becomes both head and tail.

newNode.next = head;
    Connect new node to old first node.

head.prev = newNode;
    Connect old first node back to new node.

head = newNode;
    Move head to the new first node.

size++;
    Increase the number of nodes by 1.

---

## 13. Test Example

MyDoublyLinkedList<Character> list = new MyDoublyLinkedList<>();

list.addFirst('A');
list.addFirst('B');
list.addFirst('C');

After list.addFirst('A'):

head
 ↓
null ← [A] → null
 ↑
tail

After list.addFirst('B'):

head
 ↓
null ← [B] ⇄ [A] → null
              ↑
             tail

After list.addFirst('C'):

head
 ↓
null ← [C] ⇄ [B] ⇄ [A] → null
                     ↑
                    tail

Final list:

C ⇄ B ⇄ A

---

## 14. Compare Singly addFirst() and Doubly addFirst()

Singly Linked List:

newNode.next = head;
head = newNode;

Only one direction:

X → A

Doubly Linked List:

newNode.next = head;
head.prev = newNode;
head = newNode;

Two directions:

X ⇄ A

---

## 15. Most Important Rule

For doubly linked list:

Whenever you connect two nodes, update both directions.

Example:

X ⇄ A

means:

X.next = A;
A.prev = X;

---

# Part 3: addLast()

## 1. Meaning

addLast(E e)

means:

Add a new node at the end of the doubly linked list.

---

## 2. Example

Current list:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

Call:

addLast('X');

Final result:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] ⇄ [X] → null
                                ↑
                               tail

The new node X is added after the current tail.

---

## 3. Case 1: Empty List

If the list is empty:

head = null
tail = null
size = 0

Create new node:

Node<E> newNode = new Node<>(e);

Example:

newNode
 ↓
null ← [X] → null

Since this is the only node, it is both the first and last node.

So:

head = newNode;
tail = newNode;

Final:

head
 ↓
null ← [X] → null
 ↑
tail

---

## 4. Case 2: Non-empty List

Suppose we already have:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

We want to add X at the end.

Create new node:

newNode
 ↓
null ← [X] → null

Now we need to connect C and X in two directions.

---

## 5. Step 1: Old Tail Points to New Node

tail.next = newNode;

Now:

[A] ⇄ [B] ⇄ [C] → [X]
              ↑
             tail

This means:

C.next = X

---

## 6. Step 2: New Node Points Back to Old Tail

newNode.prev = tail;

Now:

[A] ⇄ [B] ⇄ [C] ⇄ [X]
              ↑
             tail

This means:

X.prev = C

Now C and X are connected both ways:

C.next = X
X.prev = C

---

## 7. Step 3: Move Tail to New Node

tail = newNode;

Final:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] ⇄ [X] → null
                                ↑
                               tail

Now X is the last node.

---

## 8. Why Order Matters

Correct order:

tail.next = newNode;
newNode.prev = tail;
tail = newNode;

Why?

Because before moving tail, tail still points to the old last node.

So this line works correctly:

newNode.prev = tail;

It means:

newNode.prev points to the old tail

Rule:

Connect first, then move tail.

---

## 9. Complete addLast() Code

public void addLast(E e) {
    Node<E> newNode = new Node<>(e);

    if (tail == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    size++;
}

---

## 10. Explanation

Node<E> newNode = new Node<>(e);
    Create a new node.

if (tail == null)
    Check whether the list is empty.

head = newNode;
tail = newNode;
    If the list is empty, the new node becomes both first and last node.

tail.next = newNode;
    Connect the old last node to the new node.

newNode.prev = tail;
    Connect the new node back to the old last node.

tail = newNode;
    Move tail to the new last node.

size++;
    Increase the number of nodes by 1.

---

## 11. Test Example

MyDoublyLinkedList<Character> list = new MyDoublyLinkedList<>();

list.addLast('A');
list.addLast('B');
list.addLast('C');

After list.addLast('A'):

head
 ↓
null ← [A] → null
 ↑
tail

After list.addLast('B'):

head
 ↓
null ← [A] ⇄ [B] → null
              ↑
             tail

After list.addLast('C'):

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                     ↑
                    tail

Final list:

A ⇄ B ⇄ C

---

## 12. Compare Singly addLast() and Doubly addLast()

Singly Linked List:

tail.next = newNode;
tail = newNode;

Only one direction:

C → X

Doubly Linked List:

tail.next = newNode;
newNode.prev = tail;
tail = newNode;

Two directions:

C ⇄ X

---

## 13. Compare addFirst() and addLast()

addFirst():

newNode.next = head;
head.prev = newNode;
head = newNode;

Visual:

X ⇄ A

New node is added before the old head.

addLast():

tail.next = newNode;
newNode.prev = tail;
tail = newNode;

Visual:

C ⇄ X

New node is added after the old tail.

---

## 14. Mini Example

Code:

list.addLast('A');
list.addLast('B');
list.addLast('C');
list.addFirst('X');
list.addLast('Y');

Step by step:

addLast('A')  → A
addLast('B')  → A ⇄ B
addLast('C')  → A ⇄ B ⇄ C
addFirst('X') → X ⇄ A ⇄ B ⇄ C
addLast('Y')  → X ⇄ A ⇄ B ⇄ C ⇄ Y

Final:

head
 ↓
null ← [X] ⇄ [A] ⇄ [B] ⇄ [C] ⇄ [Y] → null
                                      ↑
                                     tail

---

# Part 4: add(int index, E e)

## 1. Meaning

add(int index, E e)

means:

Add a new node at a specific index.

---

## 2. Index Revision

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   D

So:

index 0 = A
index 1 = B
index 2 = C
index 3 = D

If we call:

add(2, 'X');

It means:

Insert X at index 2.

Before:

A ⇄ B ⇄ C ⇄ D

After:

A ⇄ B ⇄ X ⇄ C ⇄ D

The new node is inserted before the old index 2.

---

## 3. Main Idea

To insert in the middle, we need two nodes:

1. previous node
2. current node

Example:

A ⇄ B ⇄ C ⇄ D

To insert X at index 2:

previous = B
current = C

We want:

B ⇄ X ⇄ C

So we must update four links.

---

## 4. Visual Example

Before:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] ⇄ [D] → null
                              ↑
                             tail

Call:

add(2, 'X');

Target position:

null ← [A] ⇄ [B] ⇄ [C] ⇄ [D] → null
              ↑      ↑
          previous  current

After:

null ← [A] ⇄ [B] ⇄ [X] ⇄ [C] ⇄ [D] → null

---

## 5. The Four Important Links

Before insertion:

B.next = C
C.prev = B

After inserting X:

B.next = X
X.prev = B
X.next = C
C.prev = X

The four links:

newNode.prev = previous;
newNode.next = current;
previous.next = newNode;
current.prev = newNode;

---

## 6. Step-by-step Insertion

Suppose:

A ⇄ B ⇄ C ⇄ D

We want:

A ⇄ B ⇄ X ⇄ C ⇄ D

Step 1:
Find the current node at the target index.

For:

add(2, 'X');

current = C

Then:

previous = current.prev

So:

previous = B

Step 2:
Create new node.

Node<E> newNode = new Node<>(e);

Step 3:
Connect new node to previous and current.

newNode.prev = previous;
newNode.next = current;

Now:

B ← [X] → C

Meaning:

X.prev = B
X.next = C

Step 4:
Connect previous and current to new node.

previous.next = newNode;
current.prev = newNode;

Now:

B ⇄ X ⇄ C

Final list:

A ⇄ B ⇄ X ⇄ C ⇄ D

---

## 7. Special Cases

For add(index, e), handle:

Case 1:
index <= 0

Use:

addFirst(e)

Case 2:
index >= size

Use:

addLast(e)

Case 3:
index is in the middle

Insert between two existing nodes.

---

## 8. add(index, e) Code

public void add(int index, E e) {
    if (index <= 0) {
        addFirst(e);
    } else if (index >= size) {
        addLast(e);
    } else {
        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node<E> previous = current.prev;
        Node<E> newNode = new Node<>(e);

        newNode.prev = previous;
        newNode.next = current;

        previous.next = newNode;
        current.prev = newNode;

        size++;
    }
}

---

## 9. Loop Explanation

Suppose:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   D

Call:

add(2, 'X');

We want current to stop at index 2.

Start:

Node<E> current = head;

So:

current = A

Loop:

for (int i = 0; i < index; i++) {
    current = current.next;
}

Since index = 2:

i = 0:
current moves from A to B

i = 1:
current moves from B to C

i = 2:
stop

Now:

current = C

Then:

Node<E> previous = current.prev;

So:

previous = B

Then insert X between B and C.

---

## 10. Difference between Singly and Doubly add(index, e)

Singly Linked List:

To insert between B and C:

B → C

We do:

newNode.next = previous.next;
previous.next = newNode;

Only two links are updated.

Doubly Linked List:

To insert between B and C:

B ⇄ C

We do:

newNode.prev = previous;
newNode.next = current;
previous.next = newNode;
current.prev = newNode;

Four links are updated.

---

## 11. Mini Example

Code:

list.addLast('A');
list.addLast('B');
list.addLast('D');
list.add(2, 'C');
list.add(0, 'X');
list.add(5, 'Y');

Step by step:

addLast('A') → A
addLast('B') → A ⇄ B
addLast('D') → A ⇄ B ⇄ D
add(2, 'C') → A ⇄ B ⇄ C ⇄ D
add(0, 'X') → X ⇄ A ⇄ B ⇄ C ⇄ D
add(5, 'Y') → X ⇄ A ⇄ B ⇄ C ⇄ D ⇄ Y

Final:

head
 ↓
null ← [X] ⇄ [A] ⇄ [B] ⇄ [C] ⇄ [D] ⇄ [Y] → null
                                            ↑
                                           tail

---

# Part 5: removeFirst() and removeLast()

## 1. Quick Idea

In doubly linked list, every node has:

prev
element
next

Example:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

When we remove a node, we must fix:

1. next link
2. prev link

---

# removeFirst()

## 2. Meaning

removeFirst()

means:

Remove the first node from the doubly linked list.

Example:

Before:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

After removeFirst():

head
 ↓
null ← [B] ⇄ [C] → null
                  ↑
                 tail

Removed value:

A

---

## 3. Case 1: Empty List

If the list is empty:

head = null
tail = null
size = 0

There is nothing to remove.

Return:

null

---

## 4. Case 2: Only One Node

Before:

head
 ↓
null ← [A] → null
 ↑
tail

If we remove A, the list becomes empty.

After:

head = null
tail = null
size = 0

So we need:

head = null;
tail = null;

---

## 5. Case 3: More Than One Node

Before:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

We want to remove A.

Step 1:
Save removed value.

E removedElement = head.element;

Step 2:
Move head to the second node.

head = head.next;

Now:

       head
        ↓
[A] ⇄ [B] ⇄ [C] → null

Step 3:
Make new head's prev become null.

head.prev = null;

Final:

head
 ↓
null ← [B] ⇄ [C] → null
                  ↑
                 tail

This is the important difference from singly linked list.

For singly linked list, we only move head.

For doubly linked list, after moving head, we must also set:

head.prev = null;

because the first node should not point backward to anything.

---

## 6. removeFirst() Code

public E removeFirst() {
    if (size == 0) {
        return null;
    }

    E removedElement = head.element;

    if (size == 1) {
        head = null;
        tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }

    size--;
    return removedElement;
}

---

## 7. Explanation

if (size == 0)
    If the list is empty, return null.

E removedElement = head.element;
    Save the first value before removing it.

if (size == 1)
    If there is only one node, removing it makes the list empty.

head = head.next;
    Move head from old first node to the second node.

head.prev = null;
    Make sure the new first node does not point backward to the removed node.

size--;
    Reduce size.

return removedElement;
    Return the removed value.

---

# removeLast()

## 8. Meaning

removeLast()

means:

Remove the last node from the doubly linked list.

Example:

Before:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

After removeLast():

head
 ↓
null ← [A] ⇄ [B] → null
                  ↑
                 tail

Removed value:

C

---

## 9. Why removeLast() is Easier in Doubly Linked List

In singly linked list, removeLast() was harder because we had to start from head to find the second last node.

But in doubly linked list:

[A] ⇄ [B] ⇄ [C]

The tail node C has:

C.prev = B

So we can directly find the second last node using:

tail.prev

This is one main advantage of doubly linked list.

---

## 10. Case 1: Empty List

If the list is empty:

head = null
tail = null
size = 0

Return:

null

---

## 11. Case 2: Only One Node

Before:

head
 ↓
null ← [A] → null
 ↑
tail

After removing A:

head = null
tail = null
size = 0

---

## 12. Case 3: More Than One Node

Before:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

We want to remove C.

Step 1:
Save removed value.

E removedElement = tail.element;

Step 2:
Move tail to the previous node.

tail = tail.prev;

Now:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C]
                  ↑    ↑
                 tail old last

Step 3:
Make new tail's next become null.

tail.next = null;

Final:

head
 ↓
null ← [A] ⇄ [B] → null
                  ↑
                 tail

---

## 13. removeLast() Code

public E removeLast() {
    if (size == 0) {
        return null;
    }

    E removedElement = tail.element;

    if (size == 1) {
        head = null;
        tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }

    size--;
    return removedElement;
}

---

## 14. Explanation

if (size == 0)
    If the list is empty, return null.

E removedElement = tail.element;
    Save the last value before removing it.

if (size == 1)
    If there is only one node, removing it makes the list empty.

tail = tail.prev;
    Move tail backward to the second last node.

tail.next = null;
    Make sure the new last node does not point forward to the removed node.

size--;
    Reduce size.

return removedElement;
    Return the removed value.

---

## 15. Compare Singly and Doubly removeLast()

Singly Linked List:

A → B → C → null

To remove C, we must find B by starting from head.

Node<E> current = head;

for (int i = 0; i < size - 2; i++) {
    current = current.next;
}

tail = current;
tail.next = null;

Doubly Linked List:

A ⇄ B ⇄ C

To remove C, we can move backward directly:

tail = tail.prev;
tail.next = null;

This is shorter because C.prev already points to B.

---

## 16. Mini Example

Code:

list.addLast('A');
list.addLast('B');
list.addLast('C');

System.out.println(list.removeFirst());
System.out.println(list.removeLast());
System.out.println(list.removeLast());
System.out.println(list.removeLast());

Step by step:

Start:

A ⇄ B ⇄ C

removeFirst() removes A
List: B ⇄ C

removeLast() removes C
List: B

removeLast() removes B
List: empty

removeLast() removes nothing
List: empty

Output:

A
C
B
null

---

# Part 6: remove(int index)

## 1. Meaning

remove(int index)

means:

Remove the node at a specific index.

---

## 2. Example

Suppose we have:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   D

Call:

remove(2);

Index 2 is C.

After removing C:

A ⇄ B ⇄ D

Removed value:

C

---

## 3. What Needs to Happen?

Before removing:

A ⇄ B ⇄ C ⇄ D
        ↑
     remove this

To remove C, connect B and D directly.

Before:

B.next = C
C.prev = B
C.next = D
D.prev = C

After:

B.next = D
D.prev = B

So C is skipped.

Final:

A ⇄ B ⇄ D

---

## 4. Important Idea

If current is the node we want to remove:

previous = current.prev
nextNode = current.next

Then connect:

previous.next = nextNode;
nextNode.prev = previous;

This removes current from the chain.

---

## 5. Visual Step-by-step

Current list:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] ⇄ [D] → null
                              ↑
                             tail

Call:

remove(2);

So:

current = C
previous = B
nextNode = D

Before:

[B] ⇄ [C] ⇄ [D]

After:

[B] ⇄ [D]

The node C is no longer connected to the list.

---

## 6. Special Cases

For remove(index), handle:

Case 1:
index < 0 or index >= size

Invalid index.
Return null.

Case 2:
index == 0

Remove first node.
Use removeFirst().

Case 3:
index == size - 1

Remove last node.
Use removeLast().

Case 4:
index is in the middle

Remove a middle node.

---

## 7. remove(index) Code

public E remove(int index) {
    if (index < 0 || index >= size) {
        return null;
    } else if (index == 0) {
        return removeFirst();
    } else if (index == size - 1) {
        return removeLast();
    } else {
        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node<E> previous = current.prev;
        Node<E> nextNode = current.next;

        E removedElement = current.element;

        previous.next = nextNode;
        nextNode.prev = previous;

        size--;

        return removedElement;
    }
}

---

## 8. Explanation

if (index < 0 || index >= size)
    Check invalid index.

else if (index == 0)
    Remove first node using removeFirst().

else if (index == size - 1)
    Remove last node using removeLast().

Node<E> current = head;
    Start from the first node.

for (int i = 0; i < index; i++)
    Move current to the node we want to remove.

Node<E> previous = current.prev;
    Get the node before current.

Node<E> nextNode = current.next;
    Get the node after current.

E removedElement = current.element;
    Save the value to return.

previous.next = nextNode;
    Connect previous node to next node.

nextNode.prev = previous;
    Connect next node back to previous node.

size--;
    Reduce size.

return removedElement;
    Return the removed value.

---

## 9. Loop Explanation

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   D

Call:

remove(2);

Start:

current = A

Loop:

i = 0:
current moves to B

i = 1:
current moves to C

i = 2:
stop

Now current = C.

Then:

previous = current.prev = B
nextNode = current.next = D

Then:

previous.next = nextNode;
nextNode.prev = previous;

So:

B.next = D
D.prev = B

Final:

A ⇄ B ⇄ D

---

## 10. Compare Singly and Doubly remove(index)

Singly Linked List:

A → B → C → D

To remove C, we need to find B first.

Then:

previous.next = current.next;

Only the forward link is fixed.

Doubly Linked List:

A ⇄ B ⇄ C ⇄ D

Once we reach C, we can get:

current.prev
current.next

Then:

current.prev.next = current.next;
current.next.prev = current.prev;

Both directions are fixed.

---

## 11. Mini Example

Code:

list.addLast('A');
list.addLast('B');
list.addLast('C');
list.addLast('D');
list.addLast('E');

System.out.println(list.remove(1));
System.out.println(list.remove(2));

Start:

A ⇄ B ⇄ C ⇄ D ⇄ E

First:

remove(1)

removes:

B

List becomes:

A ⇄ C ⇄ D ⇄ E

Second:

remove(2)

Now index 2 is D.

It removes:

D

List becomes:

A ⇄ C ⇄ E

Output:

B
D

---

# Part 7: Print Forward and Print Backward

## 1. Meaning

Doubly linked list can print in two directions:

printForward()
printBackward()

Because doubly linked list has both next and prev, we can move:

forward:
head → tail

backward:
tail → head

---

## 2. Example List

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] ⇄ [D] → null
                              ↑
                             tail

Forward print:

A B C D

Backward print:

D C B A

---

## 3. Print Forward

To print forward, start from head.

Start at A
Move to B
Move to C
Move to D
Stop at null

Use next to move forward:

current = current.next;

---

## 4. printForward() Code

public void printForward() {
    Node<E> current = head;

    while (current != null) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

---

## 5. Print Forward Explanation

Node<E> current = head;
    Start from the first node.

while (current != null)
    Continue while current still points to a node.

System.out.print(current.element + " ");
    Print the value inside the current node.

current = current.next;
    Move to the next node.

---

## 6. Visual Forward Traversal

List:

null ← [A] ⇄ [B] ⇄ [C] ⇄ [D] → null

Step by step:

current = A
print A
move to B

current = B
print B
move to C

current = C
print C
move to D

current = D
print D
move to null

current = null
stop

Output:

A B C D

---

## 7. Print Backward

To print backward, start from tail.

Start at D
Move to C
Move to B
Move to A
Stop at null

Use prev to move backward:

current = current.prev;

---

## 8. printBackward() Code

public void printBackward() {
    Node<E> current = tail;

    while (current != null) {
        System.out.print(current.element + " ");
        current = current.prev;
    }

    System.out.println();
}

---

## 9. Print Backward Explanation

Node<E> current = tail;
    Start from the last node.

while (current != null)
    Continue while current still points to a node.

System.out.print(current.element + " ");
    Print the value inside the current node.

current = current.prev;
    Move to the previous node.

---

## 10. Visual Backward Traversal

List:

null ← [A] ⇄ [B] ⇄ [C] ⇄ [D] → null

Step by step:

current = D
print D
move to C

current = C
print C
move to B

current = B
print B
move to A

current = A
print A
move to null

current = null
stop

Output:

D C B A

---

## 11. Compare with Singly Linked List

Singly Linked List:

A → B → C → D → null

Can move forward:

A → B → C → D

Cannot easily move backward because there is no prev.

To print backward in singly linked list, we used recursion.

Doubly Linked List:

null ← A ⇄ B ⇄ C ⇄ D → null

Can move forward using:

current = current.next;

Can move backward using:

current = current.prev;

So backward printing is much easier.

---

## 12. Important Mistake to Avoid

Do not move head directly when printing forward.

Wrong:

while (head != null) {
    System.out.print(head.element + " ");
    head = head.next;
}

This destroys the list because head will become null.

Do not move tail directly when printing backward.

Wrong:

while (tail != null) {
    System.out.print(tail.element + " ");
    tail = tail.prev;
}

This destroys the list because tail will become null.

Correct:

Node<E> current = head;

or:

Node<E> current = tail;

Use current to move, not head or tail.

---

## 13. Is printForward() Same as Singly Linked List print?

Yes.

printForward() in a doubly linked list is almost the same as print() in a singly linked list.

Both start from head and move using next.

Singly linked list print:

public void print() {
    Node<E> current = head;

    while (current != null) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

Doubly linked list printForward():

public void printForward() {
    Node<E> current = head;

    while (current != null) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

Same logic:

Start from head
Move using next
Print each element

The difference appears when printing backward.

Singly linked list cannot directly move backward.

Doubly linked list can move backward using prev.

---

# Part 8: get(), contains(), indexOf(), set(), clear()

These methods are very similar to singly linked list because most of them only need forward traversal from head.

---

# get(int index)

## 1. Meaning

get(int index)

means:

Return the element at a specific index.

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   D

list.get(2);

returns:

C

---

## 2. get(index) Code

public E get(int index) {
    if (index < 0 || index >= size) {
        return null;
    }

    Node<E> current = head;

    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    return current.element;
}

---

## 3. Explanation

if (index < 0 || index >= size)
    Check invalid index.

Node<E> current = head;
    Start at the first node.

for (int i = 0; i < index; i++)
    Move forward until the target index.

return current.element;
    Return the value at that node.

---

# getFirst() and getLast()

## 4. getFirst()

Because head points to the first node:

public E getFirst() {
    if (size == 0) {
        return null;
    }

    return head.element;
}

---

## 5. getLast()

Because tail points to the last node:

public E getLast() {
    if (size == 0) {
        return null;
    }

    return tail.element;
}

---

# contains(E e)

## 6. Meaning

contains(E e)

means:

Check whether the list contains a specific value.

Example:

A ⇄ B ⇄ C

list.contains('B');

returns:

true

list.contains('X');

returns:

false

---

## 7. contains() Code

public boolean contains(E e) {
    Node<E> current = head;

    while (current != null) {
        if (isEqual(current.element, e)) {
            return true;
        }

        current = current.next;
    }

    return false;
}

---

## 8. Helper Method isEqual()

private boolean isEqual(E a, E b) {
    if (a == null) {
        return b == null;
    }

    return a.equals(b);
}

Why use this?

Because if current.element is null, current.element.equals(e) will cause an error.

isEqual() is safer.

---

# indexOf(E e)

## 9. Meaning

indexOf(E e)

means:

Return the first index where the value appears.

If not found, return -1.

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   B

list.indexOf('B');

returns:

1

Because the first B is at index 1.

---

## 10. indexOf() Code

public int indexOf(E e) {
    Node<E> current = head;
    int index = 0;

    while (current != null) {
        if (isEqual(current.element, e)) {
            return index;
        }

        current = current.next;
        index++;
    }

    return -1;
}

---

# lastIndexOf(E e)

## 11. Meaning

lastIndexOf(E e)

means:

Return the last index where the value appears.

If not found, return -1.

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   B

list.lastIndexOf('B');

returns:

3

Because the last B is at index 3.

---

## 12. lastIndexOf() Code

public int lastIndexOf(E e) {
    Node<E> current = head;
    int index = 0;
    int lastIndex = -1;

    while (current != null) {
        if (isEqual(current.element, e)) {
            lastIndex = index;
        }

        current = current.next;
        index++;
    }

    return lastIndex;
}

---

## 13. indexOf() vs lastIndexOf()

indexOf()
    Stops once it finds the first match.

lastIndexOf()
    Keeps searching until the end.

Example:

A ⇄ B ⇄ C ⇄ B

indexOf('B') returns 1.

lastIndexOf('B') returns 3.

---

# set(int index, E e)

## 14. Meaning

set(int index, E e)

means:

Replace the element at a specific index.

Example:

Index:   0     1     2
List:    A ⇄   B ⇄   C

list.set(1, 'X');

After:

A ⇄ X ⇄ C

The node is still there.

Only the value changes.

---

## 15. set(index, e) Code

public E set(int index, E e) {
    if (index < 0 || index >= size) {
        return null;
    }

    Node<E> current = head;

    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    E oldElement = current.element;
    current.element = e;

    return oldElement;
}

---

## 16. Explanation

This method returns the old value.

Example:

Before:

A ⇄ B ⇄ C

Call:

list.set(1, 'X');

Returned value:

B

After:

A ⇄ X ⇄ C

Important:

set() does not add a node.
set() does not remove a node.
set() does not change size.

---

## 17. Are get() and set() Same as Singly Linked List?

Yes.

get() and set() are almost the same in singly and doubly linked list.

Because both methods usually:

1. Start from head
2. Move forward using next
3. Access or change current.element

They do not need to change links.

So they do not really use prev.

The difference between singly and doubly linked list appears mainly in operations that change links:

addFirst()
addLast()
add(index, e)
removeFirst()
removeLast()
remove(index)
printBackward()

---

# clear()

## 18. Meaning

clear()

means:

Remove all nodes from the list.

Before:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

size = 3

After:

head = null
tail = null
size = 0

---

## 19. clear() Code

public void clear() {
    head = null;
    tail = null;
    size = 0;
}

---

# size() and isEmpty()

## 20. size()

public int size() {
    return size;
}

---

## 21. isEmpty()

public boolean isEmpty() {
    return size == 0;
}

Example:

MyDoublyLinkedList<Character> list = new MyDoublyLinkedList<>();

System.out.println(list.isEmpty());

list.addLast('A');

System.out.println(list.size());
System.out.println(list.isEmpty());

Output:

true
1
false

---

# Complete MyDoublyLinkedList Code

class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;

    public Node(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}

class MyDoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void add(int index, E e) {
        if (index <= 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Node<E> previous = current.prev;
            Node<E> newNode = new Node<>(e);

            newNode.prev = previous;
            newNode.next = current;

            previous.next = newNode;
            current.prev = newNode;

            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        }

        E removedElement = head.element;

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return removedElement;
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        }

        E removedElement = tail.element;

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return removedElement;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Node<E> previous = current.prev;
            Node<E> nextNode = current.next;

            E removedElement = current.element;

            previous.next = nextNode;
            nextNode.prev = previous;

            size--;

            return removedElement;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.element;
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        }

        return head.element;
    }

    public E getLast() {
        if (size == 0) {
            return null;
        }

        return tail.element;
    }

    public boolean contains(E e) {
        Node<E> current = head;

        while (current != null) {
            if (isEqual(current.element, e)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        int index = 0;

        while (current != null) {
            if (isEqual(current.element, e)) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    public int lastIndexOf(E e) {
        Node<E> current = head;
        int index = 0;
        int lastIndex = -1;

        while (current != null) {
            if (isEqual(current.element, e)) {
                lastIndex = index;
            }

            current = current.next;
            index++;
        }

        return lastIndex;
    }

    public E set(int index, E e) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        E oldElement = current.element;
        current.element = e;

        return oldElement;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void printForward() {
        Node<E> current = head;

        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void printBackward() {
        Node<E> current = tail;

        while (current != null) {
            System.out.print(current.element + " ");
            current = current.prev;
        }

        System.out.println();
    }

    public void print() {
        printForward();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isEqual(E a, E b) {
        if (a == null) {
            return b == null;
        }

        return a.equals(b);
    }
}

---

# Test Program

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        MyDoublyLinkedList<Character> list = new MyDoublyLinkedList<>();

        System.out.println("1. Add A, B, C, D");
        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
        list.addLast('D');

        System.out.print("Forward: ");
        list.printForward();

        System.out.print("Backward: ");
        list.printBackward();

        System.out.println();

        System.out.println("2. Add X at front and Y at back");
        list.addFirst('X');
        list.addLast('Y');

        System.out.print("Forward: ");
        list.printForward();

        System.out.print("Backward: ");
        list.printBackward();

        System.out.println();

        System.out.println("3. Add M at index 2");
        list.add(2, 'M');

        System.out.print("Forward: ");
        list.printForward();

        System.out.println();

        System.out.println("4. Remove first, last, and index 2");
        System.out.println("Removed first: " + list.removeFirst());
        System.out.println("Removed last: " + list.removeLast());
        System.out.println("Removed index 2: " + list.remove(2));

        System.out.print("Forward: ");
        list.printForward();

        System.out.print("Backward: ");
        list.printBackward();

        System.out.println();

        System.out.println("5. Get values");
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Index 1: " + list.get(1));

        System.out.println();

        System.out.println("6. Search values");
        System.out.println("Contains B: " + list.contains('B'));
        System.out.println("Contains Z: " + list.contains('Z'));
        System.out.println("Index of B: " + list.indexOf('B'));
        System.out.println("Last index of B: " + list.lastIndexOf('B'));

        System.out.println();

        System.out.println("7. Set index 1 to Q");
        System.out.println("Old value: " + list.set(1, 'Q'));

        System.out.print("Forward: ");
        list.printForward();

        System.out.println();

        System.out.println("8. Clear list");
        list.clear();

        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());

        System.out.print("Forward: ");
        list.printForward();
    }
}

---

# Expected Output

1. Add A, B, C, D
Forward: A B C D 
Backward: D C B A 

2. Add X at front and Y at back
Forward: X A B C D Y 
Backward: Y D C B A X 

3. Add M at index 2
Forward: X A M B C D Y 

4. Remove first, last, and index 2
Removed first: X
Removed last: Y
Removed index 2: B
Forward: A M C D 
Backward: D C M A 

5. Get values
First: A
Last: D
Index 1: M

6. Search values
Contains B: false
Contains Z: false
Index of B: -1
Last index of B: -1

7. Set index 1 to Q
Old value: M
Forward: A Q C D 

8. Clear list
Size: 0
Is empty: true
Forward:

---

# Big Picture Comparison

Singly Linked List:

A → B → C → null

Each node has:

element
next

Doubly Linked List:

null ← A ⇄ B ⇄ C → null

Each node has:

prev
element
next

Main advantage:

Doubly linked list can move forward and backward.

Main disadvantage:

Each node uses more memory because it stores an extra prev reference.

Most important rule:

In doubly linked list, whenever you connect or remove nodes, you must fix both next and prev links.