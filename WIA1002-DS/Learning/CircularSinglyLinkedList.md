# Circular Linked List Full Notes

---

# Part 1: What is a Circular Linked List?

## 1. Normal Singly Linked List

A normal singly linked list looks like this:

head
 ↓
[A] → [B] → [C] → null
              ↑
             tail

Meaning:

A.next = B  
B.next = C  
C.next = null  

The last node points to null.

So:

tail.next = null

---

## 2. Circular Singly Linked List

A circular singly linked list looks like this:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

Meaning:

A.next = B  
B.next = C  
C.next = A  

So:

tail.next = head

This is the main difference.

---

## 3. Key Difference

Normal singly linked list:

tail.next = null

Circular singly linked list:

tail.next = head

---

## 4. Why is it called circular?

Because if you keep moving using next, you eventually come back to the beginning.

Example:

A → B → C → A → B → C → A ...

It never naturally ends.

---

## 5. Important Problem

In a normal linked list, traversal can stop when:

current == null

Example:

while (current != null) {
    System.out.print(current.element + " ");
    current = current.next;
}

But in circular linked list, this causes an infinite loop because current never becomes null.

Wrong output:

A B C A B C A B C ...

---

## 6. How to stop traversal?

There are two common ways:

1. Use size
2. Stop when current comes back to head

Beginner-friendly way:

for (int i = 0; i < size; i++) {
    System.out.print(current.element + " ");
    current = current.next;
}

---

## 7. Node Class

The node class is the same as singly linked list.

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

A circular singly linked list still only has:

element  
next  

The difference is only:

tail.next = head

---

## 8. Empty Circular Linked List

If the list is empty:

head = null  
tail = null  
size = 0  

---

## 9. One-node Circular Linked List

If there is only one node:

head
 ↓
[A]
 ↑↓
tail

Meaning:

head = A  
tail = A  
A.next = A  

So the only node points to itself.

---

## 10. Three-node Circular Linked List

If we have:

A, B, C

The structure is:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

Meaning:

head = A  
tail = C  

A.next = B  
B.next = C  
C.next = A  

---

## 11. Compare Three Linked Lists

Singly Linked List:

head
 ↓
[A] → [B] → [C] → null
              ↑
             tail

tail.next = null

---

Doubly Linked List:

head
 ↓
null ← [A] ⇄ [B] ⇄ [C] → null
                         ↑
                        tail

head.prev = null  
tail.next = null  

---

Circular Singly Linked List:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

tail.next = head

---

## 12. Main Rule

In a circular linked list, the last node connects back to the first node.

In code:

tail.next = head;

---

# Part 2: addFirst() and addLast()

## 1. Basic Class

class MyCircularLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyCircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
}

Meaning:

head = first node  
tail = last node  
size = number of nodes  

---

# addFirst(E e)

## 2. Meaning

addFirst(E e)

means:

Add a new node at the beginning.

Example:

Before:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

addFirst(X)

After:

head
 ↓
[X] → [A] → [B] → [C]
↑                   ↓
← ← ← ← ← ← ← ← ← ←
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

Since it is the only node:

head = newNode  
tail = newNode  

Because this is circular:

newNode.next = newNode

Code:

head = newNode;
tail = newNode;
tail.next = head;

Diagram:

head
 ↓
[X]
 ↑↓
tail

---

## 4. addFirst() Case 2: Non-empty List

Suppose we have:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

We want to add X at the front.

Step 1:

newNode.next = head;

This makes X point to the old head.

Step 2:

head = newNode;

This moves head to X.

Step 3:

tail.next = head;

This makes the last node point back to the new head.

Final:

head
 ↓
[X] → [A] → [B] → [C]
↑                   ↓
← ← ← ← ← ← ← ← ← ←
                    ↑
                   tail

---

## 5. addFirst() Code

public void addFirst(E e) {
    Node<E> newNode = new Node<>(e);

    if (head == null) {
        head = newNode;
        tail = newNode;
        tail.next = head;
    } else {
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    size++;
}

---

# addLast(E e)

## 6. Meaning

addLast(E e)

means:

Add a new node at the end.

Example:

Before:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

addLast(X)

After:

head
 ↓
[A] → [B] → [C] → [X]
↑                   ↓
← ← ← ← ← ← ← ← ← ←
                    ↑
                   tail

---

## 7. addLast() Case 1: Empty List

Same as addFirst().

If the list is empty:

head = newNode;
tail = newNode;
tail.next = head;

Diagram:

head
 ↓
[X]
 ↑↓
tail

---

## 8. addLast() Case 2: Non-empty List

Suppose:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

We want to add X after C.

Step 1:

tail.next = newNode;

Old tail points to new node.

Step 2:

tail = newNode;

Move tail to new node.

Step 3:

tail.next = head;

New tail points back to head.

Final:

head
 ↓
[A] → [B] → [C] → [X]
↑                   ↓
← ← ← ← ← ← ← ← ← ←
                    ↑
                   tail

---

## 9. addLast() Code

public void addLast(E e) {
    Node<E> newNode = new Node<>(e);

    if (tail == null) {
        head = newNode;
        tail = newNode;
        tail.next = head;
    } else {
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    size++;
}

---

## 10. Compare Circular and Normal Singly Add

Normal singly addLast():

tail.next = newNode;
tail = newNode;

Final:

A → B → C → X → null

Circular singly addLast():

tail.next = newNode;
tail = newNode;
tail.next = head;

Final:

A → B → C → X → back to A

---

## 11. Important Rule

After every add operation, make sure:

tail.next = head

unless the list is empty.

---

# Part 3: print() and Traversal

## 1. Why normal print causes problem

In normal singly linked list:

A → B → C → null

This works:

while (current != null) {
    System.out.print(current.element + " ");
    current = current.next;
}

Because current eventually becomes null.

---

## 2. Circular linked list has no null

Circular linked list:

A → B → C → back to A

So this is wrong:

while (current != null) {
    System.out.print(current.element + " ");
    current = current.next;
}

Because current never becomes null.

It becomes:

A → B → C → A → B → C ...

This is an infinite loop.

---

## 3. Correct Way 1: Use size

public void print() {
    Node<E> current = head;

    for (int i = 0; i < size; i++) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

If size is 3, print exactly 3 nodes.

Example:

A → B → C → back to A

Trace:

i = 0: print A, move to B  
i = 1: print B, move to C  
i = 2: print C, move to A  
i = 3: stop  

Output:

A B C

---

## 4. Correct Way 2: Stop when current comes back to head

public void print() {
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

## 5. Why use do while?

Because we want to print head first before checking whether we returned to head.

Example:

A → B → C → back to A

Trace:

current = A  
print A  
move to B  

current != head, continue  

print B  
move to C  

current != head, continue  

print C  
move to A  

current == head, stop  

Output:

A B C

---

## 6. Recommended Beginner Method

Use size:

public void print() {
    Node<E> current = head;

    for (int i = 0; i < size; i++) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

---

## 7. size() and isEmpty()

public int size() {
    return size;
}

public boolean isEmpty() {
    return size == 0;
}

---

## 8. Important Rule

Circular linked list traversal must not depend on:

current == null

Use:

for (int i = 0; i < size; i++)

or:

do {
    ...
} while (current != head);

---

# Part 4: add(int index, E e)

## 1. Meaning

add(int index, E e)

means:

Add a new node at a specific position.

---

## 2. Index Revision

Example:

Index:   0     1     2     3
List:    A  →  B  →  C  →  D
         ↑                  ↓
         ← ← ← ← ← ← ← ← ← ←

index 0 = A  
index 1 = B  
index 2 = C  
index 3 = D  

Call:

add(2, 'X');

Before:

A → B → C → D → back to A

After:

A → B → X → C → D → back to A

---

## 3. Special Cases

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

Insert between two nodes.

---

## 4. Middle Insertion Idea

Suppose:

A → B → C → D → back to A

Call:

add(2, 'X');

We want to insert X before C.

So we stop at the node before index 2.

previous = B

Then:

newNode.next = previous.next;
previous.next = newNode;

Before:

B → C

After:

B → X → C

Final:

A → B → X → C → D → back to A

---

## 5. Why stop at index - 1?

If we insert at index 2:

A → B → C → D

The new node should be between B and C.

So we need B.

previous = node at index 1

Then:

B.next = X  
X.next = C  

---

## 6. add(index, e) Code

public void add(int index, E e) {
    if (index <= 0) {
        addFirst(e);
    } else if (index >= size) {
        addLast(e);
    } else {
        Node<E> previous = head;

        for (int i = 1; i < index; i++) {
            previous = previous.next;
        }

        Node<E> newNode = new Node<>(e);

        newNode.next = previous.next;
        previous.next = newNode;

        size++;
    }
}

---

## 7. Loop Explanation

Suppose:

Index:   0     1     2     3
List:    A  →  B  →  C  →  D

Call:

add(2, 'X');

We want previous to stop at index 1.

Start:

previous = A

Loop:

i = 1  
1 < 2 is true  
previous moves from A to B  

i = 2  
2 < 2 is false  
stop  

Now:

previous = B

Then insert X after B.

---

## 8. Why no need to update tail.next in middle insertion?

Because the tail does not change.

Before:

A → B → C → D → back to A  
tail = D  
D.next = A  

After adding X at index 2:

A → B → X → C → D → back to A  
tail = D  
D.next = A  

The circular link is still correct.

---

## 9. Compare Normal Singly and Circular Singly add(index)

Normal singly:

A → B → C → D → null

Middle insertion:

newNode.next = previous.next;
previous.next = newNode;

Circular singly:

A → B → C → D → back to A

Middle insertion is the same:

newNode.next = previous.next;
previous.next = newNode;

The difference is mainly at the end:

Normal singly:

tail.next = null

Circular singly:

tail.next = head

---

# Part 5: removeFirst() and removeLast()

# removeFirst()

## 1. Meaning

removeFirst()

means:

Remove the first node from the circular linked list.

Example:

Before:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

After removeFirst():

head
 ↓
[B] → [C]
↑      ↓
← ← ← ←
       ↑
      tail

Removed value:

A

---

## 2. removeFirst() Case 1: Empty List

If the list is empty:

head = null  
tail = null  
size = 0  

Return:

null

---

## 3. removeFirst() Case 2: Only One Node

Before:

head
 ↓
[A]
 ↑↓
tail

Meaning:

head = A  
tail = A  
A.next = A  

After removing A:

head = null  
tail = null  
size = 0  

---

## 4. removeFirst() Case 3: More Than One Node

Before:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

Step 1:

Save removed value:

E removedElement = head.element;

Step 2:

Move head to second node:

head = head.next;

Step 3:

Make tail.next point to new head:

tail.next = head;

Final:

head
 ↓
[B] → [C]
↑      ↓
← ← ← ←
       ↑
      tail

---

## 5. removeFirst() Code

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
    }

    size--;
    return removedElement;
}

---

# removeLast()

## 6. Meaning

removeLast()

means:

Remove the last node from the circular linked list.

Example:

Before:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

After removeLast():

head
 ↓
[A] → [B]
↑      ↓
← ← ← ←
       ↑
      tail

Removed value:

C

---

## 7. Why removeLast() is harder

Circular singly linked list only has next.

It does not have prev.

So from tail, we cannot move backward to the second last node.

To remove C:

A → B → C → back to A

We need to find B.

So we must start from head and move forward until current.next == tail.

---

## 8. removeLast() Case 1: Empty List

If the list is empty:

head = null  
tail = null  
size = 0  

Return:

null

---

## 9. removeLast() Case 2: Only One Node

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

## 10. removeLast() Case 3: More Than One Node

Before:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

Step 1:

Save removed value:

E removedElement = tail.element;

Step 2:

Find second last node:

Node<E> current = head;

while (current.next != tail) {
    current = current.next;
}

After loop:

current = B

Step 3:

Move tail to second last node:

tail = current;

Step 4:

Make new tail point back to head:

tail.next = head;

Final:

head
 ↓
[A] → [B]
↑      ↓
← ← ← ←
       ↑
      tail

---

## 11. removeLast() Code

public E removeLast() {
    if (size == 0) {
        return null;
    }

    E removedElement = tail.element;

    if (size == 1) {
        head = null;
        tail = null;
    } else {
        Node<E> current = head;

        while (current.next != tail) {
            current = current.next;
        }

        tail = current;
        tail.next = head;
    }

    size--;
    return removedElement;
}

---

## 12. Compare Circular and Normal Singly removeFirst()

Normal singly:

A → B → C → null

removeFirst():

head = head.next;

After:

B → C → null

Circular singly:

A → B → C → back to A

removeFirst():

head = head.next;
tail.next = head;

After:

B → C → back to B

Extra step:

tail.next = head;

---

## 13. Compare Circular and Normal Singly removeLast()

Normal singly:

After finding second last node:

tail = current;
tail.next = null;

Circular singly:

After finding second last node:

tail = current;
tail.next = head;

---

# Part 6: remove(int index)

## 1. Meaning

remove(int index)

means:

Remove the node at a specific index.

---

## 2. Example

Index:   0     1     2     3
List:    A  →  B  →  C  →  D
         ↑                  ↓
         ← ← ← ← ← ← ← ← ← ←

Call:

remove(2);

Index 2 is C.

After removing C:

A → B → D → back to A

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

---

## 4. Middle Removal Idea

Suppose:

A → B → C → D → back to A

Call:

remove(2);

We want to remove C.

We need the node before it:

previous = B  
current = C  

Then:

previous.next = current.next;

Since current.next = D:

B.next = D

Final:

A → B → D → back to A

---

## 5. remove(index) Code

public E remove(int index) {
    if (index < 0 || index >= size) {
        return null;
    } else if (index == 0) {
        return removeFirst();
    } else if (index == size - 1) {
        return removeLast();
    } else {
        Node<E> previous = head;

        for (int i = 1; i < index; i++) {
            previous = previous.next;
        }

        Node<E> current = previous.next;
        E removedElement = current.element;

        previous.next = current.next;

        size--;

        return removedElement;
    }
}

---

## 6. Loop Explanation

Suppose:

Index:   0     1     2     3
List:    A  →  B  →  C  →  D

Call:

remove(2);

We want previous to stop at index 1.

Start:

previous = A

Loop:

i = 1  
1 < 2 is true  
previous moves from A to B  

i = 2  
2 < 2 is false  
stop  

Now:

previous = B

Then:

current = previous.next

So:

current = C

Then:

previous.next = current.next

So:

B.next = D

Final:

A → B → D → back to A

---

## 7. Why no tail.next = head in middle removal?

Because tail does not change.

Before:

A → B → C → D → back to A  
tail = D  
tail.next = A  

Remove C.

After:

A → B → D → back to A  
tail = D  
tail.next = A  

The circular link is still correct.

But if you remove first or last node, you must update the circular link.

That is why we use removeFirst() and removeLast() for those cases.

---

## 8. Compare Normal Singly and Circular Singly remove(index)

Normal singly:

A → B → C → D → null

Middle removal:

previous.next = current.next;

Circular singly:

A → B → C → D → back to A

Middle removal is the same:

previous.next = current.next;

The difference is mainly when removing first or last.

---

# Part 7: get(), contains(), indexOf(), set(), clear()

## 1. Important Reminder

Because circular linked list has no null ending, traversal should not use:

while (current != null)

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
List:    A  →  B  →  C  →  D
         ↑                  ↓
         ← ← ← ← ← ← ← ← ← ←

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

# getFirst() and getLast()

## 4. getFirst()

public E getFirst() {
    if (size == 0) {
        return null;
    }

    return head.element;
}

---

## 5. getLast()

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

Check whether the circular linked list contains a specific value.

Example:

A → B → C → back to A

list.contains('B') returns true.

list.contains('X') returns false.

---

## 7. contains() Code

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

## 8. Helper Method isEqual()

private boolean isEqual(E a, E b) {
    if (a == null) {
        return b == null;
    }

    return a.equals(b);
}

This is safer than directly using:

current.element.equals(e)

because current.element may be null.

---

# indexOf(E e)

## 9. Meaning

indexOf(E e)

means:

Return the first index where the value appears.

If not found, return -1.

Example:

Index:   0     1     2     3
List:    A  →  B  →  C  →  B
         ↑                  ↓
         ← ← ← ← ← ← ← ← ← ←

list.indexOf('B') returns 1.

---

## 10. indexOf() Code

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

## 11. Meaning

lastIndexOf(E e)

means:

Return the last index where the value appears.

If not found, return -1.

Example:

A → B → C → B → back to A

lastIndexOf('B') returns 3.

---

## 12. lastIndexOf() Code

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

## 13. Difference between indexOf() and lastIndexOf()

indexOf():

Stops when it finds the first match.

lastIndexOf():

Keeps searching until the end.

Example:

A → B → C → B → back to A

indexOf('B') returns 1.

lastIndexOf('B') returns 3.

---

# set(int index, E e)

## 14. Meaning

set(int index, E e)

means:

Replace the element at a specific index.

Example:

A → B → C → back to A

list.set(1, 'X');

After:

A → X → C → back to A

The node is still there. Only the value changes.

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

## 16. Important Note

set() does not add a node.

set() does not remove a node.

set() does not change size.

It only changes:

current.element

---

# clear()

## 17. Meaning

clear()

means:

Remove all nodes from the circular linked list.

Before:

head
 ↓
[A] → [B] → [C]
↑             ↓
← ← ← ← ← ← ←
              ↑
             tail

size = 3

After:

head = null  
tail = null  
size = 0  

---

## 18. clear() Code

public void clear() {
    head = null;
    tail = null;
    size = 0;
}

---

# Complete MyCircularLinkedList Code

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

class MyCircularLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyCircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);

        if (tail == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        size++;
    }

    public void add(int index, E e) {
        if (index <= 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> newNode = new Node<>(e);

            newNode.next = previous.next;
            previous.next = newNode;

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
            Node<E> current = head;

            while (current.next != tail) {
                current = current.next;
            }

            tail = current;
            tail.next = head;
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
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            E removedElement = current.element;

            previous.next = current.next;

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

    public void print() {
        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            System.out.print(current.element + " ");
            current = current.next;
        }

        System.out.println();
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

public class TestCircularLinkedList {
    public static void main(String[] args) {
        MyCircularLinkedList<Character> list = new MyCircularLinkedList<>();

        System.out.println("1. Add A, B, C, D");
        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
        list.addLast('D');

        System.out.print("List: ");
        list.print();

        System.out.println();

        System.out.println("2. Add X at front and Y at back");
        list.addFirst('X');
        list.addLast('Y');

        System.out.print("List: ");
        list.print();

        System.out.println();

        System.out.println("3. Add M at index 2");
        list.add(2, 'M');

        System.out.print("List: ");
        list.print();

        System.out.println();

        System.out.println("4. Remove first, last, and index 2");
        System.out.println("Removed first: " + list.removeFirst());
        System.out.println("Removed last: " + list.removeLast());
        System.out.println("Removed index 2: " + list.remove(2));

        System.out.print("List: ");
        list.print();

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

        System.out.print("List: ");
        list.print();

        System.out.println();

        System.out.println("8. Clear list");
        list.clear();

        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());

        System.out.print("List: ");
        list.print();
    }
}

---

# Expected Output

1. Add A, B, C, D
List: A B C D 

2. Add X at front and Y at back
List: X A B C D Y 

3. Add M at index 2
List: X A M B C D Y 

4. Remove first, last, and index 2
Removed first: X
Removed last: Y
Removed index 2: B
List: A M C D 

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
List: A Q C D 

8. Clear list
Size: 0
Is empty: true
List:

---

# Big Picture

Normal Singly Linked List:

A → B → C → null

Circular Singly Linked List:

A → B → C
↑       ↓
← ← ← ←

Main difference:

Normal singly:

tail.next = null

Circular singly:

tail.next = head

---

# Most Important Coding Rules

1. Do not use while(current != null) for circular linked list.

2. Use size-based traversal:

for (int i = 0; i < size; i++)

3. After addFirst(), addLast(), removeFirst(), or removeLast(), make sure:

tail.next = head

if the list is not empty.

4. Middle add and middle remove are almost the same as singly linked list.

5. The biggest danger is infinite loop during traversal.