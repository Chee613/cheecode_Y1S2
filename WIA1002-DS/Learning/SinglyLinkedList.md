# Linked List Full Notes
From Part 1 until Part 16

---

# Part 1: What is a Linked List?

## 1. What is a List?

A list is a collection of data arranged in sequence.

Example:

[a, b, c, d, e]

This means:

First item  = a  
Second item = b  
Third item  = c  
Fourth item = d  
Fifth item  = e  

A list stores data in sequential order.

Examples:
- A list of students
- A list of rooms
- A list of cities
- A list of books

Common list operations:
- Retrieve an element
- Insert a new element
- Delete an element
- Find how many elements are in the list
- Check whether an element exists
- Check whether the list is empty

---

## 2. Two Ways to Implement a List

A list can be implemented using:

1. Array
2. Linked List

---

## 3. Array

An array stores elements side by side in memory.

Example:

Index:   0   1   2   3
Value:   A   B   C   D

If we want index 2:

arr[2]

Array is fast for direct access.

However, inserting or deleting in the middle is slower because other elements may need to shift.

Example:

Before:
A B C D

Insert X between B and C:

A B X C D

C and D need to move to the right.

---

## 4. Linked List

A linked list is made of many nodes.

Each node contains:

1. element
2. next reference

Example:

[A | next] → [B | next] → [C | null]

Meaning:

A points to B  
B points to C  
C points to nothing  

The last node points to null.

---

## 5. What is a Node?

A node is one box in a linked list.

Structure:

+---------+------+
| element | next |
+---------+------+

Example:

+---------+------+
|   "A"   | next |
+---------+------+

Java code:

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

Explanation:

E element
    Stores the value.

Node<E> next
    Stores the reference to the next node.

---

## 6. What are head and tail?

head points to the first node.

tail points to the last node.

Example:

head
 ↓
[A | next] → [B | next] → [C | null]
                              ↑
                             tail

If the list is empty:

head = null
tail = null

---

## 7. Important Linked List Idea

A linked list does not store elements side by side.

It connects nodes using references.

The most important idea:

Each node knows where the next node is.

---

## 8. Array vs Linked List

Array:

[A][B][C][D]

Linked List:

[A] → [B] → [C] → [D] → null

Array is good when:
- You want to access data by index quickly.

Linked List is good when:
- You want to add or remove data more easily.

---

# Part 2: Create Nodes and Connect Them

## 1. Node class

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

---

## 2. Create two nodes

Node<Character> node1 = new Node<>('a');
Node<Character> node2 = new Node<>('z');

Now:

node1              node2
 ↓                  ↓
['a' | null]      ['z' | null]

They exist, but they are not connected yet.

---

## 3. Create head and tail

Node<Character> head = node1;
Node<Character> tail = node2;

Now:

head               tail
 ↓                  ↓
['a' | null]      ['z' | null]

Important:

This does not connect node1 to node2.

It only makes:
- head point to node1
- tail point to node2

---

## 4. Connect node1 to node2

node1.next = node2;

Now:

head
 ↓
['a' | next] → ['z' | null]
                 ↑
                tail

Meaning:

node1 contains 'a'  
node1.next points to node2  
node2 contains 'z'  
node2.next is null  

---

## 5. Full code example

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

public class TestNode {
    public static void main(String[] args) {
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');

        Node<Character> head = node1;
        Node<Character> tail = node2;

        node1.next = node2;

        System.out.println(head.element);
        System.out.println(head.next.element);
        System.out.println(tail.element);
    }
}

Output:

a
z
z

---

## 6. Why head.next.element gives z

head means node1.

head.next means node2.

head.next.element means the element inside node2.

Since node2 stores 'z', the answer is z.

---

# Part 3: addFirst()

## 1. Meaning

addFirst(E e)

means:

Add a new node at the beginning of the linked list.

---

## 2. Example

Current list:

head
 ↓
['a' | next] → ['z' | null]
                 ↑
                tail

We want to add 'x' at the front.

Final result:

x → a → z → null

---

## 3. Create new node

Node<Character> firstNode = new Node<>('x');

Now:

firstNode
 ↓
['x' | null]

head
 ↓
['a' | next] → ['z' | null]

---

## 4. Correct steps

Step 1:

firstNode.next = head;

Now:

firstNode
 ↓
['x' | next] → ['a' | next] → ['z' | null]
                 ↑              ↑
                head           tail

Step 2:

head = firstNode;

Now:

head
 ↓
['x' | next] → ['a' | next] → ['z' | null]
                                ↑
                               tail

---

## 5. Important order

Correct:

firstNode.next = head;
head = firstNode;

Wrong:

head = firstNode;
firstNode.next = head;

Why wrong?

Because firstNode.next will point to itself.

That creates a loop:

[x] → back to itself

Rule:

Connect first, then move head.

---

## 6. Empty list case

If the list is empty:

head = null
tail = null

After adding one node:

head
 ↓
[x | null]
 ↑
tail

The same node is both the first node and the last node.

---

## 7. addFirst() code

public void addFirst(E e) {
    Node<E> newNode = new Node<>(e);

    newNode.next = head;
    head = newNode;

    if (tail == null) {
        tail = head;
    }

    size++;
}

---

## 8. Explanation

Node<E> newNode = new Node<>(e);
    Create a new node.

newNode.next = head;
    Connect the new node to the old first node.

head = newNode;
    Move head to the new node.

if (tail == null) {
    tail = head;
}
    If the list was empty, tail must also point to the new node.

size++;
    Increase the number of nodes by 1.

---

# Part 4: addLast()

## 1. Meaning

addLast(E e)

means:

Add a new node at the end of the linked list.

---

## 2. Example

Current list:

head
 ↓
[a] → [z] → null
       ↑
      tail

Call:

addLast('c');

Final result:

a → z → c → null

---

## 3. Create new node

Node<E> newNode = new Node<>(e);

If e is 'c':

newNode
 ↓
[c | null]

---

## 4. Non-empty list steps

Step 1:

tail.next = newNode;

Now:

head
 ↓
[a] → [z] → [c] → null
       ↑
      tail

Step 2:

tail = newNode;

Now:

head
 ↓
[a] → [z] → [c] → null
              ↑
             tail

---

## 5. Empty list case

If the list is empty:

head = null
tail = null

After addLast('a'):

head
 ↓
[a | null]
 ↑
tail

So:

head = newNode;
tail = newNode;

---

## 6. addLast() code

public void addLast(E e) {
    Node<E> newNode = new Node<>(e);

    if (tail == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }

    size++;
}

---

## 7. Key rule

For non-empty list:

tail.next = newNode;
tail = newNode;

Meaning:

Connect old tail to new node, then move tail to new node.

---

# Part 5: add(int index, E e)

## 1. Meaning

add(int index, E e)

means:

Add a new node at a specific position.

---

## 2. Index starts from 0

Example:

Index:   0     1     2     3
List:    a  →  b  →  c  →  d  → null

index 0 = a  
index 1 = b  
index 2 = c  
index 3 = d  

---

## 3. Example

Call:

add(2, 'x');

Before:

Index:   0     1     2     3
List:    a  →  b  →  c  →  d  → null

After:

Index:   0     1     2     3     4
List:    a  →  b  →  x  →  c  →  d  → null

The new node is inserted before the old index 2.

---

## 4. Key idea

To insert at index 2, we need to stop at index 1.

Why?

Because we insert after index 1 and before index 2.

Before:

a → b → c → d → null
    ↑
 previous

After:

a → b → x → c → d → null

---

## 5. Important connection steps

Step 1:

newNode.next = previous.next;

Step 2:

previous.next = newNode;

Correct order:

newNode.next = previous.next;
previous.next = newNode;

Wrong order:

previous.next = newNode;
newNode.next = previous.next;

Why wrong?

Because newNode.next may point to itself and the rest of the list may be lost.

---

## 6. Special cases

Case 1:

index == 0

Use:

addFirst(e)

Case 2:

index >= size

Use:

addLast(e)

Case 3:

index is in the middle

Find index - 1, then insert.

---

## 7. add(index, e) code

public void add(int index, E e) {
    if (index == 0) {
        addFirst(e);
    } else if (index >= size) {
        addLast(e);
    } else {
        Node<E> current = head;

        for (int i = 1; i < index; i++) {
            current = current.next;
        }

        Node<E> newNode = new Node<>(e);

        newNode.next = current.next;
        current.next = newNode;

        size++;
    }
}

---

## 8. Loop explanation

Suppose:

Index:   0     1     2     3
List:    a  →  b  →  c  →  d

Call:

add(2, 'x');

Start:

current = head

So current is at index 0.

Loop:

for (int i = 1; i < index; i++)

Since index = 2:

i = 1  
1 < 2 is true  
current moves from a to b  

i = 2  
2 < 2 is false  
stop  

Now current is at index 1.

That is the node before the insertion point.

---

# Part 6: removeFirst()

## 1. Meaning

removeFirst()

means:

Remove the first node from the linked list.

---

## 2. Example

Before:

head
 ↓
[a] → [b] → [c] → null
              ↑
             tail

Call:

removeFirst();

After:

head
 ↓
[b] → [c] → null
       ↑
      tail

Removed value:

a

---

## 3. Key idea

To remove the first node, move head to the second node.

Important line:

head = head.next;

Before:

head points to a  
head.next points to b  

After:

head points to b  

---

## 4. Save removed value first

Before moving head, save the old first element:

E temp = head.element;

Then return temp after removal.

---

## 5. Empty list case

If the list is empty:

head = null
tail = null
size = 0

There is nothing to remove.

Return null.

---

## 6. One-node case

Before:

head
 ↓
[a] → null
 ↑
tail

After removeFirst():

head = null
tail = null
size = 0

---

## 7. removeFirst() code

public E removeFirst() {
    if (size == 0) {
        return null;
    } else {
        E temp = head.element;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return temp;
    }
}

---

## 8. Explanation

if (size == 0)
    The list is empty, so return null.

E temp = head.element;
    Save the removed value.

head = head.next;
    Move head to the second node.

size--;
    Decrease the number of nodes.

if (head == null) {
    tail = null;
}
    If the list becomes empty, tail must also be null.

return temp;
    Return the removed value.

---

# Part 7: removeLast()

## 1. Meaning

removeLast()

means:

Remove the last node from the linked list.

---

## 2. Example

Before:

head
 ↓
[a] → [b] → [c] → null
              ↑
             tail

Call:

removeLast();

After:

head
 ↓
[a] → [b] → null
       ↑
      tail

Removed value:

c

---

## 3. Why removeLast() is harder

In a singly linked list, each node only points forward.

a → b → c → null

To remove c, we need b.

But from c, we cannot go backward to b.

So we must start from head and find the second last node.

---

## 4. Empty list case

If size == 0:

return null;

---

## 5. One-node case

Before:

head
 ↓
[a] → null
 ↑
tail

After removeLast():

head = null
tail = null
size = 0

Return:

a

---

## 6. More than one node case

Before:

head
 ↓
[a] → [b] → [c] → null
              ↑
             tail

Find second last node:

current = b

Then:

tail = current;
tail.next = null;

After:

head
 ↓
[a] → [b] → null
       ↑
      tail

---

## 7. removeLast() code

public E removeLast() {
    if (size == 0) {
        return null;
    } else if (size == 1) {
        E temp = head.element;
        head = null;
        tail = null;
        size = 0;
        return temp;
    } else {
        Node<E> current = head;

        for (int i = 0; i < size - 2; i++) {
            current = current.next;
        }

        E temp = tail.element;
        tail = current;
        tail.next = null;
        size--;

        return temp;
    }
}

---

## 8. Loop explanation

Suppose:

Index:   0     1     2     3
List:    a  →  b  →  c  →  d
size = 4

Second last node is index 2.

Loop:

for (int i = 0; i < size - 2; i++)

size - 2 = 2

Start:
current = a

i = 0:
current moves to b

i = 1:
current moves to c

i = 2:
stop

Now current is c, the second last node.

---

## 9. Why tail.next = null?

After:

tail = current;

tail points to the second last node.

But tail.next may still point to the old last node.

So we must disconnect it:

tail.next = null;

---

# Part 8: remove(int index)

## 1. Meaning

remove(int index)

means:

Remove the node at a specific index.

---

## 2. Example

Before:

Index:   0     1     2     3
List:    a  →  b  →  c  →  d  → null

Call:

remove(2);

After:

Index:   0     1     2
List:    a  →  b  →  d  → null

Removed value:

c

---

## 3. Key idea

To remove a middle node, find the node before it.

Example:

a → b → c → d → null
    ↑   ↑
 previous
        current

To remove c:

previous.next = current.next;

Meaning:

b.next = d

Final:

a → b → d → null

---

## 4. Special cases

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

Middle index

Find previous node, then skip current node.

---

## 5. remove(index) code

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
        E temp = current.element;

        previous.next = current.next;
        size--;

        return temp;
    }
}

---

## 6. Loop explanation

Suppose:

Index:   0     1     2     3
List:    a  →  b  →  c  →  d

Call:

remove(2);

We need previous to stop at index 1.

Start:

previous = head

So previous = a.

Loop:

for (int i = 1; i < index; i++)

Since index = 2:

i = 1  
1 < 2 is true  
previous moves from a to b  

i = 2  
2 < 2 is false  
stop  

Now previous = b.

Then:

current = previous.next;

So current = c.

Then:

previous.next = current.next;

So b points to d.

---

# Part 9: Traversing and print()

## 1. Meaning

Traversing means visiting each node one by one.

In a linked list, we usually start from head and move until null.

---

## 2. Why traversal is needed

In an array, we can directly access:

arr[2]

But in a singly linked list, we cannot jump directly.

Example:

head
 ↓
[a] → [b] → [c] → [d] → null

To reach c:

Start at a  
Move to b  
Move to c  

---

## 3. Use current pointer

Do not move head directly.

Wrong:

head = head.next;

This destroys the starting point.

Correct:

Node<E> current = head;

Then move current:

current = current.next;

---

## 4. Traversal pattern

Node<E> current = head;

while (current != null) {
    System.out.print(current.element + " ");
    current = current.next;
}

---

## 5. print() code

public void print() {
    Node<E> current = head;

    while (current != null) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

---

## 6. Example

List:

a → b → c → null

list.print();

Output:

a b c

---

## 7. Important mistake

Wrong:

while (head != null) {
    System.out.print(head.element + " ");
    head = head.next;
}

This makes head become null.

The list loses its starting point.

Always use current.

---

# Part 10: contains(E e)

## 1. Meaning

contains(E e)

means:

Check whether the linked list contains a specific element.

Return true if found.

Return false if not found.

---

## 2. Example

List:

a → b → c → null

list.contains('b');

returns:

true

list.contains('x');

returns:

false

---

## 3. Key idea

Traverse the list.

Check each node.

If found, return true immediately.

If reach the end, return false.

---

## 4. contains() code

public boolean contains(E e) {
    Node<E> current = head;

    while (current != null) {
        if (current.element.equals(e)) {
            return true;
        }

        current = current.next;
    }

    return false;
}

---

## 5. Safer version with null support

private boolean isEqual(E a, E b) {
    if (a == null) {
        return b == null;
    }

    return a.equals(b);
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

---

## 6. Why use equals() instead of ==?

For objects, use:

.equals()

Because == checks whether two references point to the same object.

.equals() checks whether the values are equal.

---

# Part 11: get(int index), getFirst(), getLast()

## 1. get(int index)

Meaning:

Return the element at a specific index.

---

## 2. Example

Index:   0     1     2     3
List:    a  →  b  →  c  →  d

list.get(2);

returns:

c

---

## 3. get(index) code

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

## 4. Loop explanation

Call:

get(3)

List:

Index:   0     1     2     3
List:    a  →  b  →  c  →  d

Start:

current = a

i = 0:
current moves to b

i = 1:
current moves to c

i = 2:
current moves to d

Stop.

Return d.

---

## 5. getFirst()

Since head points to the first node:

public E getFirst() {
    if (size == 0) {
        return null;
    }

    return head.element;
}

---

## 6. getLast()

Since tail points to the last node:

public E getLast() {
    if (size == 0) {
        return null;
    }

    return tail.element;
}

---

# Part 12: indexOf(E e) and lastIndexOf(E e)

## 1. indexOf(E e)

Meaning:

Return the first index where e appears.

If not found, return -1.

---

## 2. Example

Index:   0     1     2     3
List:    j  →  a  →  v  →  a

list.indexOf('a');

returns:

1

Because the first a is at index 1.

---

## 3. indexOf() code

public int indexOf(E e) {
    Node<E> current = head;
    int index = 0;

    while (current != null) {
        if (current.element.equals(e)) {
            return index;
        }

        current = current.next;
        index++;
    }

    return -1;
}

---

## 4. lastIndexOf(E e)

Meaning:

Return the last index where e appears.

If not found, return -1.

---

## 5. Example

Index:   0     1     2     3
List:    j  →  a  →  v  →  a

list.lastIndexOf('a');

returns:

3

Because the last a is at index 3.

---

## 6. lastIndexOf() code

public int lastIndexOf(E e) {
    Node<E> current = head;
    int index = 0;
    int lastIndex = -1;

    while (current != null) {
        if (current.element.equals(e)) {
            lastIndex = index;
        }

        current = current.next;
        index++;
    }

    return lastIndex;
}

---

## 7. Difference

indexOf()
    Stops when it finds the first match.

lastIndexOf()
    Keeps searching until the end.

Example:

List:

j → a → v → a

indexOf('a') returns 1.

lastIndexOf('a') returns 3.

---

# Part 13: set(int index, E e)

## 1. Meaning

set(int index, E e)

means:

Replace the element at a specific index with a new element.

---

## 2. Example

Before:

Index:   0     1     2     3
List:    j  →  a  →  v  →  a

Call:

list.set(2, 'x');

After:

j → a → x → a

The node is still there.

Only the element changes.

---

## 3. Important idea

set() does not add a node.

set() does not remove a node.

set() only changes the element inside an existing node.

Therefore, size does not change.

---

## 4. Return value

set() usually returns the old value.

Example:

Before:

j → a → v → a

Call:

list.set(2, 'x');

Returned value:

v

After:

j → a → x → a

---

## 5. set() code

public E set(int index, E e) {
    if (index < 0 || index >= size) {
        return null;
    }

    Node<E> current = head;

    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    E oldValue = current.element;
    current.element = e;

    return oldValue;
}

---

## 6. Difference between add() and set()

add(index, e):

Before:
a → b → c

add(1, x)

After:
a → x → b → c

Size increases.

set(index, e):

Before:
a → b → c

set(1, x)

After:
a → x → c

Size stays the same.

---

# Part 14: clear(), size(), isEmpty()

## 1. clear()

Meaning:

Remove all nodes from the linked list.

---

## 2. Example

Before:

head
 ↓
[a] → [b] → [c] → null
              ↑
             tail

size = 3

After clear():

head = null
tail = null
size = 0

---

## 3. clear() code

public void clear() {
    head = null;
    tail = null;
    size = 0;
}

---

## 4. Why this works

If head no longer points to the first node, the whole chain becomes unreachable.

Java will later clean unused objects using garbage collection.

---

## 5. size()

Meaning:

Return the number of nodes.

Code:

public int size() {
    return size;
}

Example:

list.addLast('a');
list.addLast('b');

list.size();

returns:

2

---

## 6. isEmpty()

Meaning:

Check whether the list is empty.

Code:

public boolean isEmpty() {
    return size == 0;
}

Example:

Empty list:

isEmpty() returns true.

After adding one node:

isEmpty() returns false.

---

# Part 15: Reverse Printing Concept

## 1. Meaning

reverse()

in the lab means:

Print all elements in reverse order.

It does not necessarily mean changing the actual list structure.

---

## 2. Example

List:

a → b → c → d → null

Normal print:

a b c d

Reverse print:

d c b a

---

## 3. Why reverse is difficult in singly linked list

In a singly linked list, each node only knows the next node.

a → b → c → d → null

a knows b  
b knows c  
c knows d  
d knows null  

But d does not know c.

So we cannot easily move backward.

---

## 4. Beginner-friendly way: recursion

Idea:

To print a list in reverse:

1. Go to the end first.
2. Print while coming back.

---

## 5. reverse() code

public void reverse() {
    reverse(head);
    System.out.println();
}

private void reverse(Node<E> current) {
    if (current == null) {
        return;
    }

    reverse(current.next);
    System.out.print(current.element + " ");
}

---

# Part 16: How Recursive Reverse Works

## 1. Example list

a → b → c → null

Code:

private void reverse(Node<E> current) {
    if (current == null) {
        return;
    }

    reverse(current.next);
    System.out.print(current.element + " ");
}

---

## 2. Important idea

This line happens first:

reverse(current.next);

This means:

Go to the next node first.

This line happens later:

System.out.print(current.element + " ");

This means:

Print this node only after coming back.

---

## 3. Step-by-step flow

Call:

reverse(a)

Inside reverse(a):

reverse(b) is called first.

print a is waiting.

Then:

reverse(b)

Inside reverse(b):

reverse(c) is called first.

print b is waiting.

Then:

reverse(c)

Inside reverse(c):

reverse(null) is called first.

print c is waiting.

Then:

reverse(null)

Since current == null, return.

Now Java comes back.

It prints:

c
b
a

Output:

c b a

---

## 4. Flow diagram

reverse(a)
    reverse(b)
        reverse(c)
            reverse(null)
            return
        print c
    print b
print a

Output:

c b a

---

## 5. Room analogy

Imagine each node is a room:

Room a → Room b → Room c → End

Rule:

Do not say the room name when entering.
Say the room name only when leaving.

You enter:

Enter a
Enter b
Enter c
Reach end

Then leave backward:

Leave c, say c
Leave b, say b
Leave a, say a

Output:

c b a

---

## 6. Debug version

private void reverse(Node<E> current) {
    if (current == null) {
        System.out.println("Reached null, start returning");
        return;
    }

    System.out.println("Go forward from: " + current.element);

    reverse(current.next);

    System.out.println("Print while returning: " + current.element);
}

For list:

a → b → c → null

Output:

Go forward from: a
Go forward from: b
Go forward from: c
Reached null, start returning
Print while returning: c
Print while returning: b
Print while returning: a

---

## 7. Key sentence

Normal print:

Print first, then go next.

Reverse recursive print:

Go next first, then print.

---

# Complete MyLinkedList Code

## Node.java

public class Node<E> {
    E element;
    Node<E> next;

    public Node() {
        this.element = null;
        this.next = null;
    }

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

---

## MyLinkedList.java

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);

        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
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

            for (int i = 1; i < index; i++) {
                current = current.next;
            }

            Node<E> newNode = new Node<>(e);

            newNode.next = current.next;
            current.next = newNode;

            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        }

        E removedElement = head.element;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return removedElement;
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            E removedElement = head.element;
            head = null;
            tail = null;
            size = 0;
            return removedElement;
        } else {
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            E removedElement = tail.element;
            tail = current;
            tail.next = null;
            size--;

            return removedElement;
        }
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

    public void print() {
        Node<E> current = head;

        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void reverse() {
        reverse(head);
        System.out.println();
    }

    private void reverse(Node<E> current) {
        if (current == null) {
            return;
        }

        reverse(current.next);
        System.out.print(current.element + " ");
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

## TestLinkedList.java

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();

        System.out.println("1. Append a, b, c, d, e");
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');

        System.out.print("List: ");
        list.print();

        System.out.println();

        System.out.println("2. Print all elements in reverse order");
        System.out.print("Reverse: ");
        list.reverse();

        System.out.println();

        System.out.println("3. Retrieve the number of elements");
        System.out.println("Size: " + list.size());

        System.out.println();

        System.out.println("4. Retrieve the first and last value");
        System.out.println("First value: " + list.getFirst());
        System.out.println("Last value: " + list.getLast());

        System.out.println();

        System.out.println("5. Delete the third value");
        System.out.println("Deleted value: " + list.remove(2));

        System.out.print("List after deleting third value: ");
        list.print();

        System.out.println();

        System.out.println("6. Retrieve the index location for the second and third value");

        Character secondValue = list.get(1);
        Character thirdValue = list.get(2);

        System.out.println("Second value: " + secondValue);
        System.out.println("Index of second value: " + list.indexOf(secondValue));

        System.out.println("Third value: " + thirdValue);
        System.out.println("Index of third value: " + list.indexOf(thirdValue));

        System.out.println();

        System.out.println("7. Check if the list has the value 'c'");
        System.out.println("Contains c: " + list.contains('c'));

        System.out.println();

        System.out.println("8. Replace the items individually with j, a, v, a");
        list.set(0, 'j');
        list.set(1, 'a');
        list.set(2, 'v');
        list.set(3, 'a');

        System.out.print("Final list: ");
        list.print();

        System.out.println();

        System.out.println("9. Extra checking");
        System.out.println("First index of a: " + list.indexOf('a'));
        System.out.println("Last index of a: " + list.lastIndexOf('a'));
    }
}

---

# Expected Output

1. Append a, b, c, d, e
List: a b c d e 

2. Print all elements in reverse order
Reverse: e d c b a 

3. Retrieve the number of elements
Size: 5

4. Retrieve the first and last value
First value: a
Last value: e

5. Delete the third value
Deleted value: c
List after deleting third value: a b d e 

6. Retrieve the index location for the second and third value
Second value: b
Index of second value: 1
Third value: d
Index of third value: 2

7. Check if the list has the value 'c'
Contains c: false

8. Replace the items individually with j, a, v, a
Final list: j a v a 

9. Extra checking
First index of a: 1
Last index of a: 3