# Task 4 MCQ Answers

These questions are taken from the WIA1002 individual assignment.

## Question 1

The inventory module in the Grocery Store Management System uses `ArrayList<Product>` instead of a linked list. What is the primary reason for this choice?

A. ArrayList uses less memory than a linked list for storing products  
B. ArrayList provides O(1) access by index, which is beneficial for random product lookups by ID  
C. Linked lists cannot store objects of type Product  
D. ArrayList automatically sorts products alphabetically

**Answer:** B

**Explanation:** `ArrayList` is chosen because it supports fast indexed access, which fits inventory lookups better than a linked list.

## Question 2

The shopping cart uses a self-implemented singly linked list rather than `java.util.ArrayList`. Which of the following best justifies this design decision?

A. Singly linked lists allow O(1) insertion and deletion at arbitrary positions, which is common in cart operations  
B. ArrayList cannot store multiple quantities of the same product  
C. The cart requires frequent sequential traversal and insertions/removals at the ends, where linked lists excel, and random access by index is rarely needed  
D. Singly linked lists automatically prevent duplicate products in the car

**Answer:** C

**Explanation:** A singly linked list fits cart behavior because cart operations are mostly sequential and do not need random index access.

## Question 3

The undo feature uses a stack implemented with a singly linked list but exposes only `push()` and `pop()` methods. This design demonstrates which important computer science principle?

A. Dynamic polymorphism  
B. A stack is a restricted version of a linked list (LIFO access only)  
C. Inheritance over composition  
D. Garbage collection optimization

**Answer:** B

**Explanation:** A stack is a restricted linked-list usage pattern with LIFO behavior.

## Question 4

When a customer adds an item to the cart, the system pushes a `CartAction` object onto the undo stack. Later, when the customer requests undo, the system pops the last action and restores the stock. What would happen if the stack was implemented using an `ArrayList` instead of a linked list for this specific feature?

A. The undo feature would stop working completely  
B. Both implementations would work correctly, but the ArrayList might require occasional resizing and shifting of elements, making push/pop less efficient in some cases  
C. The ArrayList would be faster because it uses contiguous memory  
D. The ArrayList cannot store custom objects like CartAction

**Answer:** B

**Explanation:** An `ArrayList` could still implement undo, but it may be less efficient because resizing or element shifting can happen.

## Question 5

In the `LinkedListStack<T>` implementation, the `undo()` method removes the node from the head of the linked list. Why should the head be chosen as the "top" of the stack rather than the tail?

A. Removing from the head of a singly linked list is O(1), while removing from the tail would require O(n) traversal to find the previous node  
B. The head cannot be used because it would reverse the order of operations  
C. Java requires stacks to use the head as the top  
D. The tail is always null in a stack implementation

**Answer:** A

**Explanation:** In a singly linked list, using the head as the top of the stack gives `O(1)` push and pop.

## Question 6

Consider the following operations performed on the shopping cart and undo:

- Add Apple
- Add Banana
- Undo
- Add Orange

After these operations, which items remain in the shopping cart?

A. Apple, Banana, Orange  
B. Apple, Orange  
C. Banana, Orange  
D. Orange only

**Answer:** B

**Explanation:** After `Add Apple`, `Add Banana`, `Undo`, `Add Orange`, the cart contains `Apple` and `Orange`.
