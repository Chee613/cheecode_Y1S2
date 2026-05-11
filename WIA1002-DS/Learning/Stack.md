# Stack Full Notes

---

# Part 1: What is a Stack?

## 1. Definition

A stack is a data structure that follows this rule:

Last In, First Out

Short form:

LIFO

Meaning:

The last item you put in is the first item you take out.

---

## 2. Real-life Example

Imagine a stack of plates.

Top
 ↓
[Plate 3]
[Plate 2]
[Plate 1]

If you want to take a plate, you take from the top first.

So Plate 3 is removed first.

Why?

Because it was the last plate added.

Last added: Plate 3  
First removed: Plate 3  

That is:

Last In, First Out

---

## 3. Stack Visualisation

Suppose we push these items:

push("A");
push("B");
push("C");

The stack becomes:

Top
 ↓
[C]
[B]
[A]

The last item pushed is C.

So if we call:

pop();

It removes:

C

After popping:

Top
 ↓
[B]
[A]

---

## 4. Main Stack Operations

A stack usually has these operations:

push(e)
    Add an element to the top of the stack.

pop()
    Remove and return the top element.

peek()
    Return the top element without removing it.

isEmpty()
    Check whether the stack is empty.

size()
    Return the number of elements.

---

# push(e)

## 5. Meaning

push(e)

means:

Add a new item to the top of the stack.

Example:

Before:

Top
 ↓
[B]
[A]

Call:

push("C");

After:

Top
 ↓
[C]
[B]
[A]

So C becomes the new top.

---

# pop()

## 6. Meaning

pop()

means:

Remove and return the top item.

Example:

Before:

Top
 ↓
[C]
[B]
[A]

Call:

pop();

Removed value:

C

After:

Top
 ↓
[B]
[A]

---

# peek()

## 7. Meaning

peek()

means:

Look at the top item without removing it.

Example:

Before:

Top
 ↓
[C]
[B]
[A]

Call:

peek();

Returned value:

C

But the stack is still:

Top
 ↓
[C]
[B]
[A]

So:

pop() removes.  
peek() only looks.

---

# isEmpty()

## 8. Meaning

isEmpty()

means:

Check whether the stack has no elements.

Example:

Empty stack

isEmpty();

returns:

true

If the stack has elements:

Top
 ↓
[A]

isEmpty();

returns:

false

---

# size()

## 9. Meaning

size()

means:

Return how many elements are inside the stack.

Example:

Top
 ↓
[C]
[B]
[A]

There are 3 elements.

So:

size();

returns:

3

---

## 10. Stack Rule: Only Access the Top

In a stack, we normally only work with the top element.

Example:

Top
 ↓
[C]
[B]
[A]

You can easily access:

C

But you should not directly remove B or A.

To reach A, you must remove:

C first  
B next  
A last  

That is why stack is LIFO.

---

# Stack Using Linked List Idea

## 11. Stack Can Be Implemented Using

A stack can be implemented using:

1. Array
2. ArrayList
3. Linked List

Since we already learned linked list, we can use a linked list to build a stack.

The easiest linked-list-based stack is:

top = head

Meaning:

The head of the linked list is the top of the stack.

---

## 12. Stack View vs Linked List View

Stack view:

Top
 ↓
[C]
[B]
[A]

Linked list view:

head
 ↓
[C] → [B] → [A] → null

So:

push(e) = addFirst(e)  
pop() = removeFirst()  
peek() = getFirst()  

This is very important.

---

## 13. Why Use Head as Top?

Because adding and removing at the head is easy.

For singly linked list:

addFirst() is fast.  
removeFirst() is fast.  

So if:

top = head

Then:

push = addFirst  
pop = removeFirst  
peek = getFirst  

---

## 14. Example Using Linked List

Start with empty stack:

top/head = null

Call:

push('A');

Linked list:

head/top
 ↓
[A] → null

Call:

push('B');

Linked list:

head/top
 ↓
[B] → [A] → null

Call:

push('C');

Linked list:

head/top
 ↓
[C] → [B] → [A] → null

Call:

pop();

Removed:

C

After:

head/top
 ↓
[B] → [A] → null

---

## 15. Stack vs Linked List

A linked list is more flexible.

You can:

addFirst  
addLast  
add(index)  
removeFirst  
removeLast  
remove(index)  
get(index)  

But stack is more restricted.

A stack usually only allows:

push  
pop  
peek  

So stack is like a controlled version of a list.

---

## 16. Mini Checkpoint

Question:

stack.push('A');
stack.push('B');
stack.push('C');

System.out.println(stack.pop());
System.out.println(stack.peek());
System.out.println(stack.size());

Stack before pop:

Top
 ↓
[C]
[B]
[A]

Output:

C
B
2

Why?

pop() removes C.  
peek() now sees B.  
size is now 2.  

Key rule:

Stack follows LIFO: Last In, First Out.

---

# Part 2: Implement Stack Using Linked List in Java

## 1. Key Mapping

Stack operation     Linked list operation

push(e)             addFirst(e)
pop()               removeFirst()
peek()              getFirst()

So we make the top of the stack become the head of the linked list.

---

## 2. Stack Structure

Stack view:

Top
 ↓
[C]
[B]
[A]

Linked list view:

head/top
 ↓
[C] → [B] → [A] → null

So:

head = top

The first node is always the top of the stack.

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

## 4. Stack Class Skeleton

class MyStack<E> {
    private Node<E> top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }
}

Here we use:

top

instead of:

head

because this is a stack.

But conceptually:

top = head

---

## 5. Empty Stack

When the stack is empty:

top = null  
size = 0  

Diagram:

top
 ↓
null

---

# push(E e)

## 6. Meaning

push(E e)

means:

Add a new element to the top of the stack.

Example:

Before:

Top
 ↓
[B]
[A]

Call:

push('C');

After:

Top
 ↓
[C]
[B]
[A]

---

## 7. Linked List Idea

Before:

top
 ↓
[B] → [A] → null

Create new node:

[C] → null

Connect new node to old top:

[C] → [B] → [A] → null

Move top to new node:

top
 ↓
[C] → [B] → [A] → null

---

## 8. push() Code

public void push(E e) {
    Node<E> newNode = new Node<>(e);

    newNode.next = top;
    top = newNode;

    size++;
}

---

## 9. push() Explanation

Node<E> newNode = new Node<>(e);
    Create a new node.

newNode.next = top;
    Make the new node point to the old top.

top = newNode;
    Move top to the new node.

size++;
    Increase the stack size by 1.

---

# pop()

## 10. Meaning

pop()

means:

Remove and return the top element.

Example:

Before:

Top
 ↓
[C]
[B]
[A]

Call:

pop();

Removed:

C

After:

Top
 ↓
[B]
[A]

---

## 11. Empty Stack Case

If:

top = null  
size = 0  

There is nothing to remove.

So return:

null

---

## 12. Non-empty Stack Idea

Before:

top
 ↓
[C] → [B] → [A] → null

Save the top value:

E removedElement = top.element;

Move top to next node:

top = top.next;

After:

top
 ↓
[B] → [A] → null

---

## 13. pop() Code

public E pop() {
    if (isEmpty()) {
        return null;
    }

    E removedElement = top.element;
    top = top.next;
    size--;

    return removedElement;
}

---

## 14. pop() Explanation

if (isEmpty()) {
    return null;
}
    If the stack is empty, there is nothing to remove.

E removedElement = top.element;
    Save the top value before removing it.

top = top.next;
    Move top to the next node.
    This removes the old top from the stack.

size--;
    Decrease the size by 1.

return removedElement;
    Return the removed value.

---

# peek()

## 15. Meaning

peek()

means:

Return the top element without removing it.

Example:

Before:

Top
 ↓
[C]
[B]
[A]

Call:

peek();

Returns:

C

But the stack remains:

Top
 ↓
[C]
[B]
[A]

---

## 16. peek() Code

public E peek() {
    if (isEmpty()) {
        return null;
    }

    return top.element;
}

---

## 17. Difference Between pop() and peek()

pop()
    Return top element and remove it.

peek()
    Return top element but do not remove it.

Example:

stack.push('A');
stack.push('B');

System.out.println(stack.peek());
System.out.println(stack.peek());

Output:

B
B

Because peek() does not remove B.

But:

System.out.println(stack.pop());
System.out.println(stack.pop());

Output:

B
A

Because pop() removes each top element.

---

# isEmpty()

## 18. Meaning

isEmpty()

means:

Check whether the stack has no elements.

Code:

public boolean isEmpty() {
    return size == 0;
}

or:

public boolean isEmpty() {
    return top == null;
}

Both are correct if your code always updates size properly.

We will use:

return size == 0;

---

# size()

## 19. Meaning

size()

means:

Return how many elements are in the stack.

Code:

public int size() {
    return size;
}

---

# print()

## 20. Meaning

A stack usually prints from top to bottom.

Example:

Top
 ↓
[C]
[B]
[A]

Output:

C B A

Code:

public void print() {
    Node<E> current = top;

    while (current != null) {
        System.out.print(current.element + " ");
        current = current.next;
    }

    System.out.println();
}

This is normal linked list traversal because stack linked list is not circular.

---

# Complete MyStack Code

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}

class MyStack<E> {
    private Node<E> top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(E e) {
        Node<E> newNode = new Node<>(e);

        newNode.next = top;
        top = newNode;

        size++;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }

        E removedElement = top.element;
        top = top.next;
        size--;

        return removedElement;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return top.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node<E> current = top;

        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }

        System.out.println();
    }
}

---

# Test Program

public class TestStack {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();

        System.out.println("Is empty: " + stack.isEmpty());

        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.print("Stack: ");
        stack.print();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Size: " + stack.size());

        System.out.println("Popped: " + stack.pop());

        System.out.print("After pop: ");
        stack.print();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Size: " + stack.size());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Is empty: " + stack.isEmpty());
    }
}

---

# Expected Output

Is empty: true
Stack: C B A
Top element: C
Size: 3
Popped: C
After pop: B A
Top element: B
Size: 2
Popped: B
Popped: A
Popped: null
Is empty: true

---

# Trace Example

Code:

stack.push('A');
stack.push('B');
stack.push('C');

Step by step:

push('A')

top
 ↓
[A] → null

push('B')

top
 ↓
[B] → [A] → null

push('C')

top
 ↓
[C] → [B] → [A] → null

Now:

stack.pop();

removes C.

top
 ↓
[B] → [A] → null

Then:

stack.peek();

returns:

B

Stack remains:

top
 ↓
[B] → [A] → null

---

## Most Important Idea

Stack top = linked list head

So:

push(e) = addFirst(e)  
pop()   = removeFirst()  
peek()  = getFirst()  

Key rule:

Stack follows LIFO: Last In, First Out.

---

# Part 3: Stack Using Java Built-in Classes and Common Stack Questions

## 1. Java Built-in Stack Structures

In Java, you can use:

Stack<E>

or:

ArrayDeque<E>

For beginner level, many courses first introduce:

Stack<E>

Example:

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

Output:

C
B

Why?

push A  
push B  
push C  

Top is C.

pop() removes C.  
Now top is B.  

peek() returns B without removing it.

---

## 2. Built-in Stack Methods

Java Stack commonly uses these methods:

push(e)
    Add an element to the top.

pop()
    Remove and return the top element.

peek()
    Return the top element without removing it.

empty()
    Check whether the stack is empty.

size()
    Return the number of elements.

Example:

Stack<String> stack = new Stack<>();

stack.push("Apple");
stack.push("Banana");
stack.push("Cherry");

System.out.println(stack.peek());
System.out.println(stack.size());
System.out.println(stack.empty());

Output:

Cherry
3
false

---

## 3. empty() vs isEmpty()

For Java built-in Stack, you can use:

stack.empty()

or:

stack.isEmpty()

Both can work because Stack inherits from Vector.

Example:

Stack<Integer> stack = new Stack<>();

System.out.println(stack.empty());
System.out.println(stack.isEmpty());

Output:

true
true

For your own stack class, we usually write:

public boolean isEmpty() {
    return size == 0;
}

---

## 4. pop() on Empty Stack

In our custom stack, we wrote:

if (isEmpty()) {
    return null;
}

So if the stack is empty:

stack.pop();

returns:

null

But Java built-in Stack behaves differently.

If you call:

pop()

on an empty built-in Stack, it throws an error.

Example:

Stack<Integer> stack = new Stack<>();

System.out.println(stack.pop());

This causes:

EmptyStackException

So before popping, check:

if (!stack.empty()) {
    System.out.println(stack.pop());
}

---

# Stack Using ArrayDeque

## 5. ArrayDeque Example

In modern Java, ArrayDeque is often preferred for stack operations.

Example:

import java.util.ArrayDeque;

public class Test {
    public static void main(String[] args) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

Output:

C
B

The logic is the same:

Last In, First Out

---

# Stack Using ArrayList

## 6. ArrayList Stack Idea

You can also implement a stack using ArrayList.

In this version, the top is the last index.

Example:

ArrayList:

Index:  0   1   2
Value:  A   B   C
                ↑
               top

So:

push(e) = add(e)  
pop() = remove(size - 1)  
peek() = get(size - 1)  

---

## 7. Stack Using ArrayList Code

import java.util.ArrayList;

class MyArrayListStack<E> {
    private ArrayList<E> list;

    public MyArrayListStack() {
        list = new ArrayList<>();
    }

    public void push(E e) {
        list.add(e);
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }

        return list.remove(list.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void print() {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }
}

---

## 8. Test ArrayList Stack

public class TestArrayListStack {
    public static void main(String[] args) {
        MyArrayListStack<Character> stack = new MyArrayListStack<>();

        stack.push('A');
        stack.push('B');
        stack.push('C');

        stack.print();

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}

Output:

C B A
C
B
2

---

# Linked-list Stack vs ArrayList Stack

## 9. Linked-list Stack

top/head
 ↓
[C] → [B] → [A] → null

Top is at the head.

push = addFirst  
pop = removeFirst  
peek = getFirst  

---

## 10. ArrayList Stack

Index:  0   1   2
Value:  A   B   C
                ↑
               top

Top is at the last index.

push = add at end  
pop = remove last  
peek = get last  

Both follow:

LIFO: Last In, First Out

---

# Common Stack Question 1: Trace Output

## 11. Question

Stack<Character> stack = new Stack<>();

stack.push('A');
stack.push('B');
stack.push('C');

System.out.println(stack.pop());
stack.push('D');
System.out.println(stack.pop());
System.out.println(stack.peek());

Trace:

push A:

Top → A

push B:

Top → B, A

push C:

Top → C, B, A

pop:

remove C  
print C  

Stack now:

Top → B, A

push D:

Top → D, B, A

pop:

remove D  
print D  

Stack now:

Top → B, A

peek:

print B

Output:

C
D
B

---

# Common Stack Question 2: Reverse a String

## 12. Why Stack Can Reverse Data

A stack can reverse data because it removes the last item first.

Example:

Input:

JAVA

Push each character:

J  
A  
V  
A  

Stack top becomes:

A  
V  
A  
J  

Pop all:

A V A J

So reversed string is:

AVAJ

---

## 13. Java Code: Reverse String Using Stack

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String word = "JAVA";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.empty()) {
            reversed += stack.pop();
        }

        System.out.println(reversed);
    }
}

Output:

AVAJ

---

# Common Stack Question 3: Check Balanced Brackets

## 14. What Are Balanced Brackets?

Examples of brackets:

( )
[ ]
{ }

Balanced:

(a + b)

{[()]}

Not balanced:

(a + b

{[(])}

---

## 15. Basic Idea

When you see an opening bracket:

(
[
{

push it into the stack.

When you see a closing bracket:

)
]
}

check whether it matches the top of the stack.

If it matches, pop the opening bracket.

If it does not match, the expression is not balanced.

At the end, the stack should be empty.

---

## 16. Example: {[()]}

Read one by one:

Read {  → push {  
Read [  → push [  
Read (  → push (  
Read )  → top is (, match, pop (  
Read ]  → top is [, match, pop [  
Read }  → top is {, match, pop {  
End     → stack empty, balanced  

So:

{[()]} is balanced

---

## 17. Example: {[(])}

Read one by one:

Read {  → push {  
Read [  → push [  
Read (  → push (  
Read ]  → top is (, but ] does not match (  

So:

{[(])} is not balanced

---

## 18. Java Code: Balanced Brackets

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String expression = "{[()]}";

        if (isBalanced(expression)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.empty()) {
                    return false;
                }

                char top = stack.pop();

                if (!isMatching(top, ch)) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '[' && close == ']')
            || (open == '{' && close == '}');
    }
}

---

# Stack Time Complexity

## 19. Time Complexity

For a good stack implementation:

push()      O(1)  
pop()       O(1)  
peek()      O(1)  
isEmpty()   O(1)  
size()      O(1)  

Why?

Because all operations only work with the top element.

They do not need to search through the whole stack.

---

# Key Summary

## 20. Stack Summary

Stack rule:

Last In, First Out

Short form:

LIFO

Main operations:

push  
pop  
peek  

---

## 21. Linked-list Stack Summary

top = head

push = addFirst  
pop = removeFirst  
peek = getFirst  

Visual:

top/head
 ↓
[C] → [B] → [A] → null

---

## 22. ArrayList Stack Summary

top = last index

push = add at end  
pop = remove last  
peek = get last  

Visual:

Index:  0   1   2
Value:  A   B   C
                ↑
               top

---

## 23. Most Important Rule

Stack follows:

Last In, First Out

The last item pushed is the first item popped.