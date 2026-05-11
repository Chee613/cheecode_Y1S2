# Circular Doubly Linked List Full Notes

---

# Part 1: What is a Circular Doubly Linked List?

## 1. Quick Revision

### Singly Linked List

A singly linked list looks like this:

A → B → C → null

Each node has:

element  
next  

The last node points to null.

tail.next = null

---

### Doubly Linked List

A doubly linked list looks like this:

null ← A ⇄ B ⇄ C → null

Each node has:

prev  
element  
next  

It can move forward and backward.

Example:

A.next = B  
B.prev = A  

---

### Circular Singly Linked List

A circular singly linked list looks like this:

A → B → C
↑       ↓
← ← ← ←

The last node points back to the first node.

tail.next = head

---

## 2. Circular Doubly Linked List

A circular doubly linked list combines:

Doubly Linked List + Circular Linked List

It means:

tail.next = head  
head.prev = tail  

So:

1. The last node points forward to the first node.
2. The first node points backward to the last node.

---

## 3. Visual Structure

Normal doubly linked list:

null ← A ⇄ B ⇄ C → null

Circular doubly linked list:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

Meaning:

A.next = B  
B.next = C  
C.next = A  

A.prev = C  
B.prev = A  
C.prev = B  

So:

head = A  
tail = C  

tail.next = head  
head.prev = tail  

---

## 4. Node Structure

A circular doubly linked list uses the same node structure as a normal doubly linked list.

+------+---------+------+
| prev | element | next |
+------+---------+------+

Java code:

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

## 5. Empty Circular Doubly Linked List

If the list is empty:

head = null  
tail = null  
size = 0  

Same as other linked lists.

---

## 6. One-node Circular Doubly Linked List

If there is only one node:

head
 ↓
[A]
 ↑↓
tail

Because it is circular doubly linked:

A.next = A  
A.prev = A  

The node points to itself in both directions.

Code idea:

head = newNode;
tail = newNode;
head.next = head;
head.prev = head;

or:

tail.next = head;
head.prev = tail;

Since head and tail are the same node, both work.

---

## 7. Three-node Circular Doubly Linked List

Suppose we have:

A, B, C

Structure:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

Connections:

A.next = B  
B.next = C  
C.next = A  

A.prev = C  
B.prev = A  
C.prev = B  

Important:

tail.next = head  
head.prev = tail  

---

## 8. Compare All Four Linked Lists

### Singly Linked List

A → B → C → null

tail.next = null

---

### Doubly Linked List

null ← A ⇄ B ⇄ C → null

head.prev = null  
tail.next = null  

---

### Circular Singly Linked List

A → B → C
↑       ↓
← ← ← ←

tail.next = head

---

### Circular Doubly Linked List

A ⇄ B ⇄ C
↑       ↓
← ⇄ ⇄ ←

tail.next = head  
head.prev = tail  

---

## 9. Why Use Circular Doubly Linked List?

Because it can move:

1. Forward
2. Backward
3. From tail back to head
4. From head back to tail

Example:

A ⇄ B ⇄ C

From A, you can go backward to C:

head.prev

From C, you can go forward to A:

tail.next

---

## 10. Main Danger

There is no null ending.

So this is dangerous:

while (current != null) {
    current = current.next;
}

Why?

Because current will never become null.

It will keep moving:

A → B → C → A → B → C → ...

So for traversal, use:

for (int i = 0; i < size; i++)

or stop when current returns to head.

---

## 11. Basic Class Skeleton

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

class MyCircularDoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyCircularDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
}

---

## 12. Most Important Rule

For circular doubly linked list, always maintain:

tail.next = head;
head.prev = tail;

This is the core rule.

---

# Part 2: addFirst() and addLast()

## 1. Main Rule

tail.next = head  
head.prev = tail  

This means:

The last node points forward to the first node.  
The first node points backward to the last node.

---

# addFirst(E e)

## 2. Meaning

addFirst(E e)

means:

Add a new node at the beginning of the list.

Example:

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

Call:

addFirst('X');

After:

head
 ↓
[X] ⇄ [A] ⇄ [B] ⇄ [C]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

---

## 3. addFirst() Case 1: Empty List

If the list is empty:

head = null  
tail = null  
size = 0  

Create new node:

Node<E> newNode = new Node<>(e);

Since this is the only node:

head = newNode  
tail = newNode  

Because it is circular and doubly linked:

newNode.next = newNode  
newNode.prev = newNode  

Diagram:

head
 ↓
[X]
 ↑↓
tail

Meaning:

X.next = X  
X.prev = X  

Code:

head = newNode;
tail = newNode;
head.next = head;
head.prev = head;

---

## 4. addFirst() Case 2: Non-empty List

Suppose we already have:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

We want to add X before A.

Step 1: Create new node.

Node<E> newNode = new Node<>(e);

Step 2: Connect X to old head and tail.

Old head is A.  
Old tail is C.

We need:

X.next = A  
X.prev = C  

Code:

newNode.next = head;
newNode.prev = tail;

Step 3: Connect old head and tail to X.

We also need:

A.prev = X  
C.next = X  

Code:

head.prev = newNode;
tail.next = newNode;

Step 4: Move head to X.

head = newNode;

Final:

head
 ↓
[X] ⇄ [A] ⇄ [B] ⇄ [C]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

---

## 5. addFirst() Code

public void addFirst(E e) {
    Node<E> newNode = new Node<>(e);

    if (head == null) {
        head = newNode;
        tail = newNode;
        head.next = head;
        head.prev = head;
    } else {
        newNode.next = head;
        newNode.prev = tail;

        head.prev = newNode;
        tail.next = newNode;

        head = newNode;
    }

    size++;
}

---

## 6. Important Links in addFirst()

For non-empty list:

newNode.next = head;
newNode.prev = tail;
head.prev = newNode;
tail.next = newNode;
head = newNode;

Think like this:

1. New node points forward to old head.
2. New node points backward to old tail.
3. Old head points backward to new node.
4. Old tail points forward to new node.
5. Move head to new node.

---

# addLast(E e)

## 7. Meaning

addLast(E e)

means:

Add a new node at the end of the list.

Example:

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

Call:

addLast('X');

After:

head
 ↓
[A] ⇄ [B] ⇄ [C] ⇄ [X]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

---

## 8. addLast() Case 1: Empty List

Same as addFirst().

If the list is empty:

head = newNode;
tail = newNode;
head.next = head;
head.prev = head;

Diagram:

head
 ↓
[X]
 ↑↓
tail

Meaning:

X.next = X  
X.prev = X  

---

## 9. addLast() Case 2: Non-empty List

Suppose we have:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

We want to add X after C.

Step 1: Create new node.

Node<E> newNode = new Node<>(e);

Step 2: Connect X to old tail and head.

Old tail is C.  
Old head is A.

We need:

X.prev = C  
X.next = A  

Code:

newNode.prev = tail;
newNode.next = head;

Step 3: Connect old tail and old head to X.

We also need:

C.next = X  
A.prev = X  

Code:

tail.next = newNode;
head.prev = newNode;

Step 4: Move tail to X.

tail = newNode;

Final:

head
 ↓
[A] ⇄ [B] ⇄ [C] ⇄ [X]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

---

## 10. addLast() Code

public void addLast(E e) {
    Node<E> newNode = new Node<>(e);

    if (tail == null) {
        head = newNode;
        tail = newNode;
        head.next = head;
        head.prev = head;
    } else {
        newNode.prev = tail;
        newNode.next = head;

        tail.next = newNode;
        head.prev = newNode;

        tail = newNode;
    }

    size++;
}

---

## 11. Important Links in addLast()

For non-empty list:

newNode.prev = tail;
newNode.next = head;
tail.next = newNode;
head.prev = newNode;
tail = newNode;

Think like this:

1. New node points backward to old tail.
2. New node points forward to old head.
3. Old tail points forward to new node.
4. Old head points backward to new node.
5. Move tail to new node.

---

## 12. Compare addFirst() and addLast()

### addFirst()

newNode.next = head;
newNode.prev = tail;

head.prev = newNode;
tail.next = newNode;

head = newNode;

Meaning:

Add before old head.  
New node becomes the new head.

---

### addLast()

newNode.prev = tail;
newNode.next = head;

tail.next = newNode;
head.prev = newNode;

tail = newNode;

Meaning:

Add after old tail.  
New node becomes the new tail.

---

## 13. Test Example

Code:

MyCircularDoublyLinkedList<Character> list = new MyCircularDoublyLinkedList<>();

list.addLast('A');
list.addLast('B');
list.addLast('C');
list.addFirst('X');
list.addLast('Y');

Step by step:

addLast('A'):

A points to itself using next and prev.

A

addLast('B'):

A ⇄ B

A.prev = B  
B.next = A  

addLast('C'):

A ⇄ B ⇄ C

A.prev = C  
C.next = A  

addFirst('X'):

X ⇄ A ⇄ B ⇄ C

X.prev = C  
C.next = X  

addLast('Y'):

X ⇄ A ⇄ B ⇄ C ⇄ Y

X.prev = Y  
Y.next = X  

Final logical order:

X ⇄ A ⇄ B ⇄ C ⇄ Y

Circular connections:

head = X  
tail = Y  

tail.next = head  
head.prev = tail  

---

# Part 3: printForward() and printBackward()

## 1. Main Rule

tail.next = head  
head.prev = tail  

Because of this, there is no null ending.

So we must not use:

while (current != null)

Otherwise, the loop will never stop.

---

## 2. Example List

Suppose we have:

head
 ↓
[A] ⇄ [B] ⇄ [C] ⇄ [D]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

Forward print:

A B C D

Backward print:

D C B A

---

## 3. Why Normal Traversal Is Dangerous

In a normal doubly linked list, we can do:

while (current != null) {
    System.out.print(current.element + " ");
    current = current.next;
}

Because the last node points to null.

But in circular doubly linked list:

D.next = A

So if we keep moving forward:

A → B → C → D → A → B → C → D → ...

It never stops.

So this is wrong:

while (current != null) {
    System.out.print(current.element + " ");
    current = current.next;
}

---

## 4. Correct Way: Use size

Since we know how many nodes are inside the list, print exactly size times.

for (int i = 0; i < size; i++) {
    ...
}

If size = 4, the loop prints only 4 nodes.

---

# printForward()

## 5. Meaning

printForward()

means:

Print from head to tail.

Movement:

A → B → C → D

Use:

current = current.next;

---

## 6. printForward() Code

public void printForward() {
    Node<E> current = head;

    for (int i = 0; i < size; i++) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

---

## 7. printForward() Example

List:

A ⇄ B ⇄ C ⇄ D

Start:

current = A

Trace:

i = 0: print A, move to B  
i = 1: print B, move to C  
i = 2: print C, move to D  
i = 3: print D, move to A  
i = 4: stop  

Output:

A B C D

Even though current returns to A, the loop stops because it only runs size times.

---

# printBackward()

## 8. Meaning

printBackward()

means:

Print from tail to head.

Movement:

D → C → B → A

Use:

current = current.prev;

---

## 9. printBackward() Code

public void printBackward() {
    Node<E> current = tail;

    for (int i = 0; i < size; i++) {
        System.out.print(current.element + " ");
        current = current.prev;
    }

    System.out.println();
}

---

## 10. printBackward() Example

List:

A ⇄ B ⇄ C ⇄ D

Start:

current = D

Trace:

i = 0: print D, move to C  
i = 1: print C, move to B  
i = 2: print B, move to A  
i = 3: print A, move to D  
i = 4: stop  

Output:

D C B A

Even though current returns to D, the loop stops after size nodes.

---

## 11. Alternative Forward Print

Stop when current returns to head:

public void printForward() {
    if (head == null) {
        System.out.println();
        return;
    }

    Node<E> current = head;

    do {
        System.out.print(current.element + " ");
        current = current.next;
    } while (current != head);

    System.out.println();
}

---

## 12. Alternative Backward Print

Stop when current returns to tail:

public void printBackward() {
    if (tail == null) {
        System.out.println();
        return;
    }

    Node<E> current = tail;

    do {
        System.out.print(current.element + " ");
        current = current.prev;
    } while (current != tail);

    System.out.println();
}

---

## 13. Recommended Beginner Method

Use the size method:

for (int i = 0; i < size; i++)

It is easier and safer.

---

## 14. Add Print Methods into Class

public void printForward() {
    Node<E> current = head;

    for (int i = 0; i < size; i++) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

public void printBackward() {
    Node<E> current = tail;

    for (int i = 0; i < size; i++) {
        System.out.print(current.element + " ");
        current = current.prev;
    }

    System.out.println();
}

public void print() {
    printForward();
}

---

## 15. Compare Print Methods

### Normal Doubly Linked List

Forward:

while (current != null) {
    current = current.next;
}

Backward:

while (current != null) {
    current = current.prev;
}

Because it has null endings:

head.prev = null  
tail.next = null  

---

### Circular Doubly Linked List

Forward:

for (int i = 0; i < size; i++) {
    current = current.next;
}

Backward:

for (int i = 0; i < size; i++) {
    current = current.prev;
}

Because it has circular endings:

tail.next = head  
head.prev = tail  

---

## 16. Important Mistakes to Avoid

Do not write:

while (current != null)

for circular doubly linked list traversal.

Also, do not move head or tail directly.

Wrong:

while (head != null) {
    System.out.print(head.element + " ");
    head = head.next;
}

Wrong:

while (tail != null) {
    System.out.print(tail.element + " ");
    tail = tail.prev;
}

Correct:

Node<E> current = head;

or:

Node<E> current = tail;

Use current to move, not head or tail.

---

# Part 4: add(int index, E e)

## 1. Meaning

add(int index, E e)

means:

Add a new node at a specific index.

Always maintain:

tail.next = head  
head.prev = tail  

---

## 2. Index Revision

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   D

Because it is circular doubly linked:

A.prev = D  
D.next = A  

Full structure:

head
 ↓
[A] ⇄ [B] ⇄ [C] ⇄ [D]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

---

## 3. Example: add at index 2

Call:

add(2, 'X');

Before:

A ⇄ B ⇄ C ⇄ D

After:

A ⇄ B ⇄ X ⇄ C ⇄ D

The new node X is inserted before the old index 2, which was C.

---

## 4. Special Cases

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

This is similar to normal doubly linked list.

The difference is that the list is circular, so the first and last nodes are also connected.

In the middle case, head and tail do not change.

---

## 5. Middle Insertion Idea

Suppose:

A ⇄ B ⇄ C ⇄ D

Call:

add(2, 'X');

We want to insert X between B and C.

So:

previous = B  
current = C  

Before:

B ⇄ C

After:

B ⇄ X ⇄ C

---

## 6. Four Links to Update

Before insertion:

B.next = C  
C.prev = B  

After inserting X:

B.next = X  
X.prev = B  
X.next = C  
C.prev = X  

Code:

newNode.prev = previous;
newNode.next = current;
previous.next = newNode;
current.prev = newNode;

This is the same middle-insertion logic as normal doubly linked list.

---

## 7. Step-by-step Example

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C] ⇄ [D]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

Call:

add(2, 'X');

Target area:

[A] ⇄ [B] ⇄ [C] ⇄ [D]
       ↑      ↑
   previous current

Create new node:

[X]

Connect:

X.prev = B  
X.next = C  
B.next = X  
C.prev = X  

Final:

head
 ↓
[A] ⇄ [B] ⇄ [X] ⇄ [C] ⇄ [D]
 ↑                          ↓
 └──────────────⇄───────────┘
                           ↑
                          tail

The circular connection is still correct:

tail.next = head  
head.prev = tail  

because head is still A and tail is still D.

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

We want current to stop at index 2, which is C.

Code:

Node<E> current = head;

for (int i = 0; i < index; i++) {
    current = current.next;
}

Trace:

Start:

current = A

i = 0:

0 < 2 is true  
current moves from A to B  

i = 1:

1 < 2 is true  
current moves from B to C  

i = 2:

2 < 2 is false  
stop  

Now:

current = C

Then:

Node<E> previous = current.prev;

So:

previous = B

Then insert X between B and C.

---

## 10. Why No Need to Update tail.next and head.prev in Middle Insertion?

Because the insertion is in the middle.

Before:

head = A  
tail = D  

D.next = A  
A.prev = D  

After inserting X between B and C:

head = A  
tail = D  

D.next = A  
A.prev = D  

The first and last nodes did not change.

So the circular connections are still correct.

But for addFirst() and addLast(), we must update circular connections because head or tail changes.

---

## 11. Compare Circular Singly and Circular Doubly add(index, e)

### Circular Singly Linked List

To insert between B and C:

B → C

We do:

newNode.next = previous.next;
previous.next = newNode;

Only two links.

---

### Circular Doubly Linked List

To insert between B and C:

B ⇄ C

We do:

newNode.prev = previous;
newNode.next = current;
previous.next = newNode;
current.prev = newNode;

Four links.

---

# Part 5: removeFirst() and removeLast()

## 1. Main Rule

tail.next = head  
head.prev = tail  

After removing a node, these two links must still be correct.

---

# removeFirst()

## 2. Meaning

removeFirst()

means:

Remove the first node from the circular doubly linked list.

Example:

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

After removeFirst():

head
 ↓
[B] ⇄ [C]
 ↑      ↓
 └──⇄───┘
       ↑
      tail

Removed value:

A

---

## 3. removeFirst() Case 1: Empty List

If the list is empty:

head = null  
tail = null  
size = 0  

There is nothing to remove.

Return:

null

---

## 4. removeFirst() Case 2: Only One Node

Before:

head
 ↓
[A]
 ↑↓
tail

Because it is circular doubly linked:

A.next = A  
A.prev = A  

If we remove A, the list becomes empty:

head = null  
tail = null  
size = 0  

So:

head = null;
tail = null;

---

## 5. removeFirst() Case 3: More Than One Node

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

We want to remove A.

Step 1:

Save removed value.

E removedElement = head.element;

Step 2:

Move head to the second node.

head = head.next;

Now head points to B.

Step 3:

Fix the circular links.

The new head is B.  
The tail is still C.

We need:

C.next = B  
B.prev = C  

Code:

tail.next = head;
head.prev = tail;

Final:

head
 ↓
[B] ⇄ [C]
 ↑      ↓
 └──⇄───┘
       ↑
      tail

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
        tail.next = head;
        head.prev = tail;
    }

    size--;
    return removedElement;
}

---

## 7. removeFirst() Explanation

if (size == 0)
    If the list is empty, return null.

E removedElement = head.element;
    Save the first value before removing it.

if (size == 1)
    If there is only one node, removing it makes the list empty.

head = head.next;
    Move head to the second node.

tail.next = head;
head.prev = tail;
    Reconnect the circle in both directions.

size--;
    Reduce size.

return removedElement;
    Return the removed value.

---

# removeLast()

## 8. Meaning

removeLast()

means:

Remove the last node from the circular doubly linked list.

Example:

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

After removeLast():

head
 ↓
[A] ⇄ [B]
 ↑      ↓
 └──⇄───┘
       ↑
      tail

Removed value:

C

---

## 9. Why removeLast() is Easier Here

In circular singly linked list, removing the last node was harder because we had to find the second last node from head.

But in circular doubly linked list:

A ⇄ B ⇄ C

The tail node C has:

C.prev = B

So we can directly move backward:

tail = tail.prev;

This is one advantage of having prev.

---

## 10. removeLast() Case 1: Empty List

If the list is empty:

head = null  
tail = null  
size = 0  

Return:

null

---

## 11. removeLast() Case 2: Only One Node

Before:

head
 ↓
[A]
 ↑↓
tail

After removing A:

head = null  
tail = null  
size = 0  

---

## 12. removeLast() Case 3: More Than One Node

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

We want to remove C.

Step 1:

Save removed value.

E removedElement = tail.element;

Step 2:

Move tail backward.

tail = tail.prev;

Now tail points to B.

Step 3:

Fix the circular links.

The new tail is B.  
The head is still A.

We need:

B.next = A  
A.prev = B  

Code:

tail.next = head;
head.prev = tail;

Final:

head
 ↓
[A] ⇄ [B]
 ↑      ↓
 └──⇄───┘
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
        tail.next = head;
        head.prev = tail;
    }

    size--;
    return removedElement;
}

---

## 14. removeLast() Explanation

if (size == 0)
    If the list is empty, return null.

E removedElement = tail.element;
    Save the last value before removing it.

if (size == 1)
    If there is only one node, removing it makes the list empty.

tail = tail.prev;
    Move tail to the second last node.

tail.next = head;
head.prev = tail;
    Reconnect the new tail and head in both directions.

size--;
    Reduce size.

return removedElement;
    Return the removed value.

---

## 15. Compare All removeLast() Versions

### Singly Linked List

A → B → C → null

Need to find second last node manually:

current = head;

for (int i = 0; i < size - 2; i++) {
    current = current.next;
}

tail = current;
tail.next = null;

---

### Doubly Linked List

null ← A ⇄ B ⇄ C → null

Can move backward:

tail = tail.prev;
tail.next = null;

---

### Circular Singly Linked List

A → B → C → back to A

Need to find second last node manually, then:

tail = current;
tail.next = head;

---

### Circular Doubly Linked List

A ⇄ B ⇄ C
↑       ↓
← ⇄ ⇄ ←

Can move backward, then reconnect circle:

tail = tail.prev;
tail.next = head;
head.prev = tail;

---

# Part 6: remove(int index)

## 1. Meaning

remove(int index)

means:

Remove the node at a specific index.

Main rule:

tail.next = head  
head.prev = tail  

After removing a node, the circular doubly linked list must still connect correctly in both directions.

---

## 2. Example

Suppose we have:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   D

Because it is circular:

D.next = A  
A.prev = D  

Full structure:

head
 ↓
[A] ⇄ [B] ⇄ [C] ⇄ [D]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

Call:

remove(2);

Index 2 is C.

After removing C:

A ⇄ B ⇄ D

Circular connections still remain:

D.next = A  
A.prev = D  

Removed value:

C

---

## 3. Special Cases

Case 1:

index < 0 or index >= size

Return null.

Case 2:

index == 0

Use removeFirst().

Case 3:

index == size - 1

Use removeLast().

Case 4:

index is in the middle

Remove middle node.

Why use removeFirst() and removeLast()?

Because those methods already fix:

tail.next = head  
head.prev = tail  

---

## 4. Middle Removal Idea

Suppose:

A ⇄ B ⇄ C ⇄ D

Call:

remove(2);

We want to remove C.

So:

previous = B  
current = C  
nextNode = D  

Before removing:

B ⇄ C ⇄ D

After removing:

B ⇄ D

So we need to change two links:

previous.next = nextNode;
nextNode.prev = previous;

---

## 5. Visual Step-by-step

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C] ⇄ [D]
 ↑                   ↓
 └──────────⇄────────┘
                    ↑
                   tail

Target node:

[A] ⇄ [B] ⇄ [C] ⇄ [D]
       ↑      ↑      ↑
   previous current nextNode

Remove C by connecting B and D:

[A] ⇄ [B] ⇄ [D]
 ↑            ↓
 └────⇄───────┘

Now C is skipped.

---

## 6. remove(index) Code

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

## 7. remove(index) Explanation

if (index < 0 || index >= size)
    Check invalid index.

else if (index == 0)
    Remove first node using removeFirst().

else if (index == size - 1)
    Remove last node using removeLast().

Node<E> current = head;
    Start from the first node.

for (int i = 0; i < index; i++)
    Move current until it reaches the node to remove.

Node<E> previous = current.prev;
Node<E> nextNode = current.next;
    Get the node before and after current.

E removedElement = current.element;
    Save the removed value.

previous.next = nextNode;
nextNode.prev = previous;
    Remove current by connecting previous and nextNode.

size--;
    Reduce size.

return removedElement;
    Return the removed value.

---

## 8. Loop Explanation

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   D

Call:

remove(2);

Trace:

Start:

current = A

i = 0:

current moves from A to B

i = 1:

current moves from B to C

i = 2:

stop

Now:

current = C

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

## 9. Why No Need to Update tail.next and head.prev in Middle Removal?

Because middle removal does not change head or tail.

Before:

A ⇄ B ⇄ C ⇄ D

head = A  
tail = D  

D.next = A  
A.prev = D  

Remove C.

After:

A ⇄ B ⇄ D

head = A  
tail = D  

D.next = A  
A.prev = D  

The circular connections are still correct.

But if you remove first or last node, then head or tail changes.

That is why we use removeFirst() and removeLast() for those cases.

---

## 10. Compare All remove(index) Versions

### Singly Linked List

A → B → C → D → null

To remove C:

previous.next = current.next;

Only one direction is fixed.

---

### Doubly Linked List

null ← A ⇄ B ⇄ C ⇄ D → null

To remove C:

previous.next = nextNode;
nextNode.prev = previous;

Two directions are fixed.

---

### Circular Singly Linked List

A → B → C → D → back to A

Middle removal is same as singly:

previous.next = current.next;

But first or last removal must maintain:

tail.next = head

---

### Circular Doubly Linked List

A ⇄ B ⇄ C ⇄ D
↑             ↓
← ⇄ ⇄ ⇄ ⇄ ⇄ ←

Middle removal is same as doubly:

previous.next = nextNode;
nextNode.prev = previous;

But first or last removal must maintain:

tail.next = head  
head.prev = tail  

---

# Part 7: get(), contains(), indexOf(), set(), clear()

## 1. Main Rule

tail.next = head  
head.prev = tail  

Also remember:

Do not use:

while (current != null)

because circular linked list has no natural null ending.

Use:

for (int i = 0; i < size; i++)

---

# get(int index)

## 2. Meaning

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

## 3. get(index) Code

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

## 4. get(index) Explanation

if (index < 0 || index >= size)
    Check invalid index.

Node<E> current = head;
    Start from the first node.

for (int i = 0; i < index; i++)
    Move forward until the target index.

return current.element;
    Return the element at the target index.

---

# getFirst() and getLast()

## 5. getFirst()

public E getFirst() {
    if (size == 0) {
        return null;
    }

    return head.element;
}

---

## 6. getLast()

public E getLast() {
    if (size == 0) {
        return null;
    }

    return tail.element;
}

---

# contains(E e)

## 7. Meaning

contains(E e)

means:

Check whether the list contains a specific value.

Example:

A ⇄ B ⇄ C

list.contains('B') returns true.

list.contains('X') returns false.

---

## 8. contains() Code

public boolean contains(E e) {
    Node<E> current = head;

    for (int i = 0; i < size; i++) {
        if (isEqual(current.element, e)) {
            return true;
        }

        current = current.next;
    }

    return false;
}

---

## 9. Why Use for Loop?

Because this is circular.

Wrong:

while (current != null)

Correct:

for (int i = 0; i < size; i++)

This checks exactly size nodes and stops.

---

## 10. Helper Method: isEqual()

private boolean isEqual(E a, E b) {
    if (a == null) {
        return b == null;
    }

    return a.equals(b);
}

This is safer than directly using:

current.element.equals(e)

because current.element might be null.

---

# indexOf(E e)

## 11. Meaning

indexOf(E e)

means:

Return the first index where the value appears.

If not found, return -1.

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   B

list.indexOf('B') returns 1.

---

## 12. indexOf() Code

public int indexOf(E e) {
    Node<E> current = head;

    for (int i = 0; i < size; i++) {
        if (isEqual(current.element, e)) {
            return i;
        }

        current = current.next;
    }

    return -1;
}

---

# lastIndexOf(E e)

## 13. Meaning

lastIndexOf(E e)

means:

Return the last index where the value appears.

If not found, return -1.

Example:

Index:   0     1     2     3
List:    A ⇄   B ⇄   C ⇄   B

list.lastIndexOf('B') returns 3.

---

## 14. lastIndexOf() Code

public int lastIndexOf(E e) {
    Node<E> current = head;
    int lastIndex = -1;

    for (int i = 0; i < size; i++) {
        if (isEqual(current.element, e)) {
            lastIndex = i;
        }

        current = current.next;
    }

    return lastIndex;
}

---

## 15. indexOf() vs lastIndexOf()

indexOf():
    Stops when it finds the first match.

lastIndexOf():
    Keeps searching until the end.

Example:

A ⇄ B ⇄ C ⇄ B

indexOf('B') returns 1.  
lastIndexOf('B') returns 3.  

---

# set(int index, E e)

## 16. Meaning

set(int index, E e)

means:

Replace the element at a specific index.

Example:

Index:   0     1     2
List:    A ⇄   B ⇄   C

list.set(1, 'X');

After:

A ⇄ X ⇄ C

The node is still there. Only the value changes.

---

## 17. set(index, e) Code

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

## 18. set(index, e) Explanation

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

# clear()

## 19. Meaning

clear()

means:

Remove all nodes from the list.

Before:

head
 ↓
[A] ⇄ [B] ⇄ [C]
 ↑             ↓
 └──────⇄──────┘
              ↑
             tail

size = 3

After:

head = null  
tail = null  
size = 0  

---

## 20. clear() Code

public void clear() {
    head = null;
    tail = null;
    size = 0;
}

---

# size() and isEmpty()

## 21. size()

public int size() {
    return size;
}

---

## 22. isEmpty()

public boolean isEmpty() {
    return size == 0;
}

---

# Complete MyCircularDoublyLinkedList Code

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

class MyCircularDoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyCircularDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }

        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);

        if (tail == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

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

            tail.next = head;
            head.prev = tail;
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

            tail.next = head;
            head.prev = tail;
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

        for (int i = 0; i < size; i++) {
            if (isEqual(current.element, e)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public int indexOf(E e) {
        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            if (isEqual(current.element, e)) {
                return i;
            }

            current = current.next;
        }

        return -1;
    }

    public int lastIndexOf(E e) {
        Node<E> current = head;
        int lastIndex = -1;

        for (int i = 0; i < size; i++) {
            if (isEqual(current.element, e)) {
                lastIndex = i;
            }

            current = current.next;
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

        for (int i = 0; i < size; i++) {
            System.out.print(current.element + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void printBackward() {
        Node<E> current = tail;

        for (int i = 0; i < size; i++) {
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

public class TestCircularDoublyLinkedList {
    public static void main(String[] args) {
        MyCircularDoublyLinkedList<Character> list =
                new MyCircularDoublyLinkedList<>();

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

        System.out.print("Backward: ");
        list.printBackward();

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

        System.out.print("Backward: ");
        list.printBackward();

        System.out.println();

        System.out.println("8. Clear list");
        list.clear();

        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());

        System.out.print("Forward: ");
        list.printForward();

        System.out.print("Backward: ");
        list.printBackward();
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
Backward: Y D C B M A X 

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
Backward: D C Q A 

8. Clear list
Size: 0
Is empty: true
Forward: 
Backward: 

---

# Big Picture

Normal Doubly Linked List:

null ← A ⇄ B ⇄ C → null

Circular Doubly Linked List:

A ⇄ B ⇄ C
↑       ↓
← ⇄ ⇄ ←

Main difference:

Normal doubly:

head.prev = null  
tail.next = null  

Circular doubly:

head.prev = tail  
tail.next = head  

---

# Most Important Coding Rules

1. Do not use while(current != null).

2. Use size-based traversal:

for (int i = 0; i < size; i++)

3. Always maintain:

tail.next = head  
head.prev = tail  

4. For one-node circular doubly linked list:

node.next = node  
node.prev = node  

5. Middle add/remove is same as normal doubly linked list.

6. addFirst(), addLast(), removeFirst(), removeLast() must carefully reconnect head and tail.

7. For middle insertion:

newNode.prev = previous  
newNode.next = current  
previous.next = newNode  
current.prev = newNode  

8. For middle removal:

previous.next = nextNode  
nextNode.prev = previous  