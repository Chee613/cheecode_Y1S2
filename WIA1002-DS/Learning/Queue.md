# Queue Full Notes

---

# Part 1: What is a Queue?

## 1. Definition

A queue is a data structure that follows this rule:

First In, First Out

Short form:

FIFO

Meaning:

The first item you put in is the first item you take out.

---

## 2. Real-life Example

Imagine people lining up at a counter.

Front                           Rear
 ↓                               ↓
[Person A] → [Person B] → [Person C]

Person A came first.

So Person A is served first.

This is:

First In, First Out

---

## 3. Queue Visualisation

Suppose we add these items:

enqueue("A");
enqueue("B");
enqueue("C");

The queue becomes:

Front                           Rear
 ↓                               ↓
[A] → [B] → [C]

The first item added is A.

So if we remove one item:

dequeue();

It removes:

A

After removing:

Front                    Rear
 ↓                        ↓
[B] → [C]

---

## 4. Queue vs Stack

Stack follows:

Last In, First Out

Example:

Top
 ↓
[C]
[B]
[A]

If we remove, C comes out first.

Because C was added last.

---

Queue follows:

First In, First Out

Example:

Front                           Rear
 ↓                               ↓
[A] → [B] → [C]

If we remove, A comes out first.

Because A was added first.

---

## 5. Main Queue Operations

A queue usually has these operations:

enqueue(e)
    Add an element to the rear/back of the queue.

dequeue()
    Remove and return the front element.

peek()
    Return the front element without removing it.

isEmpty()
    Check whether the queue is empty.

size()
    Return the number of elements.

---

# enqueue(e)

## 6. Meaning

enqueue(e)

means:

Add a new item to the rear of the queue.

Example:

Before:

Front             Rear
 ↓                 ↓
[A] → [B]

Call:

enqueue("C");

After:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

So C is added at the back.

---

# dequeue()

## 7. Meaning

dequeue()

means:

Remove and return the front item.

Example:

Before:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

Call:

dequeue();

Removed value:

A

After:

Front             Rear
 ↓                 ↓
[B] → [C]

---

# peek()

## 8. Meaning

peek()

means:

Return the front item without removing it.

Example:

Before:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

Call:

peek();

Returned value:

A

The queue is still:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

So:

dequeue() removes.  
peek() only looks.

---

# isEmpty()

## 9. Meaning

isEmpty()

means:

Check whether the queue has no elements.

If the queue is empty:

front = null  
rear = null  
size = 0  

Then:

isEmpty();

returns:

true

If the queue has elements:

Front
 ↓
[A]

Then:

isEmpty();

returns:

false

---

# size()

## 10. Meaning

size()

means:

Return how many elements are inside the queue.

Example:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

There are 3 elements.

So:

size();

returns:

3

---

## 11. Queue Rule

The most important idea:

enqueue = add at rear  
dequeue = remove from front  
peek    = look at front  

Example:

queue.enqueue('A');
queue.enqueue('B');
queue.enqueue('C');

Queue:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

Then:

queue.dequeue();

removes:

A

Because A entered first.

---

# Queue Using Linked List Idea

## 12. Queue Can Be Implemented Using

A queue can be implemented using:

1. Array
2. ArrayList
3. Linked List

Since we already learned linked list, we can use a linked list to build a queue.

The easiest linked-list-based queue is:

front = head  
rear  = tail  

Meaning:

The head of the linked list is the front of the queue.  
The tail of the linked list is the rear of the queue.  

---

## 13. Queue View vs Linked List View

Queue view:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

Linked list view:

head                     tail
 ↓                        ↓
[A] → [B] → [C] → null

So:

enqueue(e) = addLast(e)  
dequeue()  = removeFirst()  
peek()     = getFirst()  

This is very important.

---

## 14. Why Use Head as Front and Tail as Rear?

Because queue needs to:

Add at the back  
Remove from the front  

In linked list:

addLast() is fast if we have tail.  
removeFirst() is fast.  

So:

front = head  
rear = tail  

Then:

enqueue = addLast  
dequeue = removeFirst  
peek = getFirst  

---

## 15. Example Using Linked List

Start with empty queue:

front/head = null  
rear/tail = null  

Call:

enqueue('A');

Queue:

Front/Rear
 ↓
[A] → null

Call:

enqueue('B');

Queue:

Front          Rear
 ↓              ↓
[A] → [B] → null

Call:

enqueue('C');

Queue:

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

Call:

dequeue();

Removed:

A

After:

Front          Rear
 ↓              ↓
[B] → [C] → null

---

## 16. Queue vs Linked List

A linked list is flexible.

You can:

addFirst  
addLast  
add(index)  
removeFirst  
removeLast  
remove(index)  
get(index)  

But queue is more restricted.

A queue usually only allows:

enqueue  
dequeue  
peek  

So queue is like a controlled version of a list.

---

## 17. Queue vs Stack Summary

Stack:

LIFO  
Last In, First Out  
Add and remove from the same end.  

Queue:

FIFO  
First In, First Out  
Add at rear, remove from front.  

Visual:

Stack:

Top
 ↓
[C]
[B]
[A]

pop removes C first.

Queue:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

dequeue removes A first.

---

## 18. Mini Checkpoint

Question:

queue.enqueue('A');
queue.enqueue('B');
queue.enqueue('C');

System.out.println(queue.dequeue());
System.out.println(queue.peek());
System.out.println(queue.size());

Queue before dequeue():

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

Output:

A
B
2

Why?

dequeue() removes A.  
peek() now sees B.  
size is now 2.  

Key rule:

Queue follows FIFO: First In, First Out.

---

# Part 2: Implement Queue Using Linked List in Java

## 1. Key Mapping

Queue operation      Linked list operation

enqueue(e)           addLast(e)  
dequeue()            removeFirst()  
peek()               getFirst()  

So we use:

front = head  
rear  = tail  

---

## 2. Queue Structure

Queue view:

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

Linked list view:

head                     tail
 ↓                        ↓
[A] → [B] → [C] → null

So:

front = head  
rear  = tail  

---

## 3. Node Class

We need a normal singly linked list node:

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

Explanation:

element
    Stores the data.

next
    Points to the next node.

---

## 4. Queue Class Skeleton

class MyQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }
}

Here:

front = first node  
rear  = last node  

---

## 5. Empty Queue

When the queue is empty:

front = null  
rear = null  
size = 0  

Diagram:

front
 ↓
null

rear
 ↓
null

---

# enqueue(E e)

## 6. Meaning

enqueue(E e)

means:

Add a new element to the rear of the queue.

Example:

Before:

Front          Rear
 ↓              ↓
[A] → [B] → null

Call:

enqueue('C');

After:

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

---

## 7. enqueue() Case 1: Empty Queue

Before:

front = null  
rear = null  

Create new node:

[C] → null

Since this is the only node:

front = newNode  
rear = newNode  

Diagram:

Front/Rear
 ↓
[C] → null

---

## 8. enqueue() Case 2: Non-empty Queue

Before:

Front          Rear
 ↓              ↓
[A] → [B] → null

Create new node:

[C] → null

Step 1:

rear.next = newNode;

Now:

[A] → [B] → [C] → null
       ↑
      rear still B

Step 2:

rear = newNode;

Now:

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

---

## 9. enqueue() Code

public void enqueue(E e) {
    Node<E> newNode = new Node<>(e);

    if (isEmpty()) {
        front = newNode;
        rear = newNode;
    } else {
        rear.next = newNode;
        rear = newNode;
    }

    size++;
}

---

# dequeue()

## 10. Meaning

dequeue()

means:

Remove and return the front element.

Example:

Before:

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

Call:

dequeue();

Removed value:

A

After:

Front          Rear
 ↓              ↓
[B] → [C] → null

---

## 11. dequeue() Case 1: Empty Queue

If:

front = null  
rear = null  
size = 0  

There is nothing to remove.

So return:

null

---

## 12. dequeue() Case 2: One-node Queue

Before:

Front/Rear
 ↓
[A] → null

Call:

dequeue();

After:

front = null  
rear = null  
size = 0  

This is important because after removing the only node, both front and rear must become null.

---

## 13. dequeue() Case 3: More Than One Node

Before:

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

Step 1:

Save the front value.

E removedElement = front.element;

Step 2:

Move front to the next node.

front = front.next;

After:

Front          Rear
 ↓              ↓
[B] → [C] → null

---

## 14. dequeue() Code

public E dequeue() {
    if (isEmpty()) {
        return null;
    }

    E removedElement = front.element;
    front = front.next;
    size--;

    if (front == null) {
        rear = null;
    }

    return removedElement;
}

---

## 15. Why Check front == null?

If the queue had only one node:

Front/Rear
 ↓
[A] → null

After:

front = front.next;

Then:

front = null

But rear may still point to old A.

So we must do:

if (front == null) {
    rear = null;
}

This keeps the empty queue correct.

---

# peek()

## 16. Meaning

peek()

means:

Return the front element without removing it.

Example:

Before:

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

Call:

peek();

Returned value:

A

Queue remains:

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

---

## 17. peek() Code

public E peek() {
    if (isEmpty()) {
        return null;
    }

    return front.element;
}

---

# isEmpty()

## 18. Meaning

isEmpty()

means:

Check whether the queue has no elements.

Code:

public boolean isEmpty() {
    return size == 0;
}

You can also use:

return front == null;

But we will use:

return size == 0;

---

# size()

## 19. Meaning

size()

means:

Return how many elements are in the queue.

Code:

public int size() {
    return size;
}

---

# print()

## 20. Meaning

A queue usually prints from front to rear.

Example:

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

Output:

A B C

Code:

public void print() {
    Node<E> current = front;

    while (current != null) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

---

# Complete MyQueue Code

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

class MyQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }

        E removedElement = front.element;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }

        return removedElement;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return front.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node<E> current = front;

        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }

        System.out.println();
    }
}

---

# Test Program

public class TestQueue {
    public static void main(String[] args) {
        MyQueue<Character> queue = new MyQueue<>();

        System.out.println("Is empty: " + queue.isEmpty());

        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        System.out.print("Queue: ");
        queue.print();

        System.out.println("Front element: " + queue.peek());
        System.out.println("Size: " + queue.size());

        System.out.println("Dequeued: " + queue.dequeue());

        System.out.print("After dequeue: ");
        queue.print();

        System.out.println("Front element: " + queue.peek());
        System.out.println("Size: " + queue.size());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Is empty: " + queue.isEmpty());
    }
}

---

# Expected Output

Is empty: true
Queue: A B C
Front element: A
Size: 3
Dequeued: A
After dequeue: B C
Front element: B
Size: 2
Dequeued: B
Dequeued: C
Dequeued: null
Is empty: true

---

## 21. Trace Example

Code:

queue.enqueue('A');
queue.enqueue('B');
queue.enqueue('C');

Step by step:

enqueue('A')

Front/Rear
 ↓
[A] → null

enqueue('B')

Front          Rear
 ↓              ↓
[A] → [B] → null

enqueue('C')

Front                 Rear
 ↓                     ↓
[A] → [B] → [C] → null

Now:

queue.dequeue();

removes A.

Front          Rear
 ↓              ↓
[B] → [C] → null

Then:

queue.peek();

returns:

B

Queue remains:

Front          Rear
 ↓              ↓
[B] → [C] → null

---

## 22. Most Important Idea

Queue front = linked list head  
Queue rear  = linked list tail  

So:

enqueue(e) = addLast(e)  
dequeue()  = removeFirst()  
peek()     = getFirst()  

Key rule:

Queue follows FIFO: First In, First Out.

---

# Part 3: Java Built-in Queue, ArrayDeque, Circular Queue, and Common Questions

## 1. Java Built-in Queue

In Java, Queue is an interface.

That means we usually write:

Queue<Character> queue = new LinkedList<>();

or:

Queue<Character> queue = new ArrayDeque<>();

But we need to import them first:

import java.util.Queue;
import java.util.LinkedList;

or:

import java.util.Queue;
import java.util.ArrayDeque;

---

## 2. Queue Using LinkedList

Example:

import java.util.Queue;
import java.util.LinkedList;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();

        queue.offer('A');
        queue.offer('B');
        queue.offer('C');

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}

Output:

A
B
2

Why?

offer A  
offer B  
offer C  

Queue:

Front → A B C ← Rear

poll() removes A.  
peek() now sees B.  
size is now 2.  

---

## 3. Built-in Queue Methods

Java Queue commonly uses:

offer(e)
    Add an element to the rear of the queue.

poll()
    Remove and return the front element.
    If empty, return null.

peek()
    Return the front element without removing it.
    If empty, return null.

isEmpty()
    Check whether the queue is empty.

size()
    Return the number of elements.

---

## 4. offer() vs add()

Both can add elements.

queue.offer('A');

and:

queue.add('A');

For normal simple queue usage, both may look similar.

But generally, offer() is preferred for queues because it is designed for queue insertion.

Use:

queue.offer('A');

instead of:

queue.add('A');

---

## 5. poll() vs remove()

Both remove the front element, but they behave differently when the queue is empty.

### poll()

If the queue is empty, it returns null.

Queue<Character> queue = new LinkedList<>();

System.out.println(queue.poll());

Output:

null

### remove()

If the queue is empty, it throws an error.

Queue<Character> queue = new LinkedList<>();

System.out.println(queue.remove());

This causes an exception.

So for beginner-safe code, use:

queue.poll();

---

## 6. peek() vs element()

Both look at the front element.

### peek()

If the queue is empty, it returns null.

Queue<Character> queue = new LinkedList<>();

System.out.println(queue.peek());

Output:

null

### element()

If the queue is empty, it throws an error.

So beginner-safe choice:

queue.peek();

---

## 7. Queue Using ArrayDeque

ArrayDeque can also be used as a queue.

Example:

import java.util.Queue;
import java.util.ArrayDeque;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Character> queue = new ArrayDeque<>();

        queue.offer('A');
        queue.offer('B');
        queue.offer('C');

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}

Output:

A
B
2

The logic is the same:

First In, First Out

---

## 8. LinkedList Queue vs ArrayDeque Queue

Both can work.

### LinkedList

Queue<Character> queue = new LinkedList<>();

It uses linked nodes internally.

### ArrayDeque

Queue<Character> queue = new ArrayDeque<>();

It uses a resizable array internally.

For most modern Java queue usage, ArrayDeque is often preferred unless you specifically need LinkedList.

For beginner learning, both are fine.

---

# Queue Using ArrayList

## 9. ArrayList Queue Idea

You can also make a queue using ArrayList, but it is not the best idea.

Queue rule:

enqueue = add at rear  
dequeue = remove from front  

ArrayList view:

Index:  0   1   2
Value:  A   B   C
        ↑       ↑
      front    rear

So:

enqueue(e) = add(e)  
dequeue()  = remove(0)  
peek()     = get(0)  

Problem:

remove(0)

is slow because all other elements must shift left.

Example:

Before:

A B C D

remove A

After:

B C D

B, C, and D must move one step left.

So ArrayList queue is simple but less efficient.

---

## 10. Queue Using ArrayList Code

import java.util.ArrayList;

class MyArrayListQueue<E> {
    private ArrayList<E> list;

    public MyArrayListQueue() {
        list = new ArrayList<>();
    }

    public void enqueue(E e) {
        list.add(e);
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }

        return list.remove(0);
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }
}

---

## 11. Test ArrayList Queue

public class TestArrayListQueue {
    public static void main(String[] args) {
        MyArrayListQueue<Character> queue = new MyArrayListQueue<>();

        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        queue.print();

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}

Output:

A B C
A
B
2

---

# Circular Queue

## 12. Circular Queue Idea

A circular queue is usually used with arrays.

It does not mean circular linked list.

It means the array indexes wrap around.

Example array size is 5:

Index:  0   1   2   3   4
Value:  A   B   C   -   -

If we remove A and B:

Index:  0   1   2   3   4
Value:  -   -   C   -   -
              ↑
            front

Then add D, E, F:

Index:  0   1   2   3   4
Value:  F   -   C   D   E
        ↑       ↑       ↑
       rear   front

Notice F goes back to index 0.

This is called wrap-around.

---

## 13. Why Circular Queue Is Useful

In a normal array queue, after many dequeues, empty spaces appear at the front.

Example:

Index:  0   1   2   3   4
Value:  -   -   C   D   -

There is empty space at index 0 and 1.

A circular queue can reuse those spaces by wrapping around.

Main formula:

rear = (rear + 1) % capacity;

front = (front + 1) % capacity;

The % makes the index return to 0 after reaching the end.

Example:

capacity = 5

If rear = 4:

(rear + 1) % capacity  
= (4 + 1) % 5  
= 5 % 5  
= 0  

So after index 4, it goes back to index 0.

---

# Common Queue Question 1: Trace Output

## 14. Question

Queue<Character> queue = new LinkedList<>();

queue.offer('A');
queue.offer('B');
queue.offer('C');

System.out.println(queue.poll());
queue.offer('D');
System.out.println(queue.poll());
System.out.println(queue.peek());

Trace:

offer A:

Front → A ← Rear

offer B:

Front → A B ← Rear

offer C:

Front → A B C ← Rear

poll:

remove A  
print A  

Queue now:

Front → B C ← Rear

offer D:

Front → B C D ← Rear

poll:

remove B  
print B  

Queue now:

Front → C D ← Rear

peek:

print C

Output:

A
B
C

---

# Common Queue Question 2: Service Counter Simulation

## 15. Queue for Arrival Order

Queue is useful when we process people or tasks in arrival order.

Example:

Queue<String> customers = new LinkedList<>();

customers.offer("Ali");
customers.offer("Bala");
customers.offer("Chen");

System.out.println("Serving: " + customers.poll());
System.out.println("Serving: " + customers.poll());
System.out.println("Next: " + customers.peek());

Output:

Serving: Ali
Serving: Bala
Next: Chen

Why?

Ali came first, so Ali is served first.  
Bala came second, so Bala is served next.  
Chen is still waiting at the front.  

---

# Common Queue Question 3: Print Binary Numbers from 1 to n

## 16. Question

For n = 5, output:

1  
10  
11  
100  
101  

Idea:

Start with "1" in the queue.

Repeat:

remove front  
print it  
add front + "0"  
add front + "1"  

---

## 17. Trace for n = 5

Start:

Queue: 1

Step 1:

Remove 1, print 1  
Add 10 and 11  
Queue: 10, 11  

Step 2:

Remove 10, print 10  
Add 100 and 101  
Queue: 11, 100, 101  

Step 3:

Remove 11, print 11  
Add 110 and 111  
Queue: 100, 101, 110, 111  

Step 4:

Remove 100, print 100  
Add 1000 and 1001  
Queue: 101, 110, 111, 1000, 1001  

Step 5:

Remove 101, print 101  
Stop after printing 5 numbers  

Output:

1  
10  
11  
100  
101  

---

## 18. Java Code: Binary Numbers

import java.util.Queue;
import java.util.LinkedList;

public class BinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 0; i < n; i++) {
            String current = queue.poll();

            System.out.println(current);

            queue.offer(current + "0");
            queue.offer(current + "1");
        }
    }
}

---

# Queue Time Complexity

## 19. Good Queue Implementation

For a good queue implementation using linked list or ArrayDeque:

enqueue()  O(1)  
dequeue()  O(1)  
peek()     O(1)  
isEmpty()  O(1)  
size()     O(1)  

---

## 20. ArrayList Queue Time Complexity

For ArrayList queue:

enqueue()  O(1) usually  
dequeue()  O(n)  
peek()     O(1)  

Why is dequeue() slow in ArrayList?

Because removing index 0 makes all remaining elements shift left.

---

# Key Summary

## 21. Queue Summary

Queue rule:

First In, First Out

Short form:

FIFO

Main operations:

enqueue  
dequeue  
peek  

---

## 22. Linked-list Queue Summary

front = head  
rear = tail  

enqueue = addLast  
dequeue = removeFirst  
peek = getFirst  

Visual:

front/head                 rear/tail
 ↓                          ↓
[A] → [B] → [C] → null

---

## 23. Java Queue Summary

Java Queue:

offer = enqueue  
poll = dequeue  
peek = peek  

Example:

Queue<Character> queue = new LinkedList<>();

queue.offer('A');
queue.offer('B');

System.out.println(queue.poll());

Output:

A

---

## 24. Stack vs Queue Final Comparison

Stack:

LIFO  
Last In, First Out  

Top
 ↓
[C]
[B]
[A]

pop removes C first.

---

Queue:

FIFO  
First In, First Out  

Front                    Rear
 ↓                        ↓
[A] → [B] → [C]

dequeue removes A first.

---

## 25. Most Important Rule

Queue follows:

First In, First Out

The first item enqueued is the first item dequeued.