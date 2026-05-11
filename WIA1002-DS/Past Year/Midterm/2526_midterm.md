# Questions

## Question 1
Which statement best describes the relationship between a class and an object?

A. A class is a blueprint, and an object is its instance  
B. An object is a blueprint, and a class is its instance  
C. A class and an object are always the same  
D. A class is used only to store methods, not data  

---

## Question 2
What is the main purpose of encapsulation in OOP?

A. To overload constructors in a class  
B. To allow a class to inherit from another class  
C. To create multiple objects from one class  
D. To hide internal data and control access through methods  

---

## Question 3
Consider the following code. Which OOP concept is illustrated?

```java
class Animal {
    void sound() {
        System.out.print("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.print("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
```

A. Encapsulation  
B. Constructor overloading  
C. Inheritance only  
D. Method overriding  

---

## Question 4
Which of the following statements about constructors in Java is correct?

A. A constructor must be declared as void  
B. A constructor has the same name as the class  
C. A constructor must always return an object  
D. A constructor can be called only once in the entire program  

---

## Question 5
When a generic type is instantiated without specifying an actual type parameter, what is this practice called?

A. Type Erasure  
B. Bounded Parameter  
C. Type Inference  
D. Raw Type  

---

## Question 6
Why does the Java compiler erase generic type information after checking it, rendering it unavailable at runtime?

A. To speed up execution time  
B. To enable backward compatibility with legacy code  
C. To allow a class to inherit from multiple generic interfaces  
D. To reduce memory overhead in the JVM  

---

## Question 7
When the compiler encounters an unbound generic type parameter such as `<T>` in a class declaration, what type does it replace it with during type erasure?

A. Void  
B. The specific type provided at runtime  
C. `java.lang.Class`  
D. Object  

---

## Question 8
In a singly linked list, which operation requires traversing the list to find the previous node?

A. `addLast(E e)`  
B. `removeLast()`  
C. `removeFirst()`  
D. `addFirst(E e)`  

---

## Question 9
In a doubly linked list, what must be updated when inserting a new node in the middle?

A. Only the previous pointer of the next node  
B. Only the new node's pointers  
C. Both next and previous pointers of adjacent nodes  
D. Only the next pointer of the previous node  

---

## Question 10
If we call `addFirst("X")` on an empty singly linked list, then `head.element` is:

A. error  
B. undefined  
C. null  
D. X  

---

## Question 11
In a singly linked list, to delete a node when you only have a reference to that node, not previous, you cannot:

A. Delete it without traversing from head  
B. Set element to null  
C. Update size  
D. Access next node  

---

## Question 12
Suppose an array-based stack has size 5 and currently contains 4 elements. What happens after the following operations?

```java
push(7);
push(9);
```

A. Only 7 is inserted; the second push causes overflow  
B. Both elements are inserted successfully  
C. Both operations cause overflow  
D. Only 9 is inserted; the first push causes overflow  

---

## Question 13
Which of the following applications is most directly based on stack usage?

A. Function call management in program execution  
B. Storing records in sorted order  
C. CPU FIFO scheduling  
D. Printer job scheduling  

---

## Question 14
What happens when `push()` is performed on a full array-based stack?

A. Stack overflow occurs  
B. The stack is automatically reversed  
C. The top element is removed  
D. Stack underflow occurs  

---

## Question 15
Consider a stack method `peek()` that returns `stack[top]` without checking whether the stack is empty. What is the main issue?

A. It may access an invalid position when the stack is empty  
B. It sorts the elements automatically  
C. It always removes the top element  
D. It converts the stack into a queue  

---

## Question 16
In a linked-list implementation of a stack, the `pop()` operation returns the top node's data but does not update `top` to `top.next`. What is the main problem?

A. The stack size becomes negative immediately  
B. The stack becomes a queue  
C. The top element is not actually removed from the stack  
D. The linked list becomes circular automatically  

---

## Question 17
What is the main advantage of using an ADT approach in a large team project?

A. It reduces the number of lines of code  
B. It allows team members to use a data structure without knowing its internal complexity  
C. It makes the code only compatible with one OS  
D. It eliminates the need for testing  

---

## Question 18
Which ADT follows the Last-In-First-Out, LIFO, principle?

A. Bag  
B. Queue  
C. List  
D. Stack  

---

## Question 19
A programmer uses an Array-based List ADT. They write a loop to remove all elements. Why might `list.remove(i)` inside a standard `for (int i = 0; i < list.size(); i++)` fail to remove every second item?

A. The indices of remaining elements shift left after a removal, skipping the next item  
B. The list ADT does not allow removal during iteration  
C. The size of the list increases  
D. Arrays cannot be resized  

---

## Question 20
Consider the following sequence of stack operations on an initially empty stack:

```java
push(10);
push(20);
pop();
push(30);
peek();
```

What is the result of `peek()`?

A. 10  
B. 20  
C. Stack underflow  
D. 30  

---

## Question 21
Consider the postfix expression:

```text
6 2 3 + -
```

What is the final result after evaluating it using a stack?

A. 11  
B. -1  
C. 5  
D. 1  

---

## Question 22
What is the output of the following code?

```java
class Test {
    int x = 5;
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = t1;
        t2.x = 8;
        System.out.print(t1.x);
    }
}
```

A. 5  
B. 0  
C. 8  
D. Compilation error  

---

## Question 23
An initially empty stack performs these operations:

```java
push('A');
push('B');
pop();
push('C');
pop();
```

Which element is removed by the last `pop()` operation?

A. No element is removed  
B. C  
C. B  
D. A  

---

## Question 24
A stack is implemented with the usual operations. Starting from an empty stack, the operations are:

```java
push(10);
push(20);
push(30);
pop();
peek();
```

What does `peek()` return?

A. 30  
B. 20  
C. 10  
D. Stack overflow  

---

## Question 25
Consider the following code. Why is `getMark()` used here?

```java
class Student {
    private int mark = 80;

    public int getMark() {
        return mark;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.print(s.getMark());
    }
}
```

A. Because mark is static  
B. Because constructors cannot store values  
C. Because private variables cannot be accessed directly from outside the class  
D. Because methods are faster than variables  

---

## Question 26
What is the output of the following code?

```java
class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void printName() {
        System.out.print(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.printName();
    }
}
```

A. Parent  
B. Parent Child  
C. Child  
D. Compilation error  

---

## Question 27
Consider the following code. What is printed?

```java
class Base {
    Base() {
        System.out.print("B ");
    }
}

class Derived extends Base {
    Derived() {
        System.out.print("D ");
    }
}

public class Main {
    public static void main(String[] args) {
        new Derived();
    }
}
```

A. D B  
B. D  
C. B  
D. B D  

---

## Question 28
Consider the following code. What is the output?

```java
class Data {
    int x = 3;
}

public class Main {
    static void change(Data d) {
        d.x = 7;
    }

    public static void main(String[] args) {
        Data obj = new Data();
        change(obj);
        System.out.print(obj.x);
    }
}
```

A. 3  
B. 7  
C. 0  
D. Compilation error  

---

## Question 29
Given the following generic method and its invocation, what is the output?

```java
public static <E> void printFirst(E[] arr) {
    System.out.print(arr[0]);
}

// Inside main method:
String[] s = {"Hello", "World"};

printFirst(s);
```

A. World  
B. Hello  
C. Compilation Error  
D. arr[0]  

---

## Question 30
What is the result of executing the following bounded generic method?

```java
public static <T extends Comparable<T>> boolean isLess(T a, T b) {
    return a.compareTo(b) < 0;
}

// Inside main method:
System.out.print(isLess(5, 10));
```

A. true  
B. false  
C. 0  
D. -1  

---

## Question 31
Consider a generic class with two parameters. What is the output of this code?

```java
class Pair<K, V> {
    K key;
    V value;

    Pair(K k, V v) {
        key = k;
        value = v;
    }
}

// Inside main method:
Pair<String, Double> p = new Pair<>("Pi", 3.14);

System.out.print(p.key + p.value);
```

A. 3.14Pi  
B. Pi + 3.14  
C. Compilation Error  
D. Pi3.14  

---

## Question 32
What is the fundamental issue with the following array declaration?

```java
ArrayList<Number> list = new ArrayList<Integer>();
```

A. Generic types are not covariant; an `ArrayList<Integer>` is not a subtype of `ArrayList<Number>`  
B. Integer is not a subclass of Number  
C. ArrayList does not support the Number interface  
D. Wildcards must be used on the right side of the assignment  

---

## Question 33
Why does the following generic class constructor produce a compilation error?

```java
class GenericCollection<T> {

    private T[] elements;

    public GenericCollection(int capacity) {

        // Attempting to instantiate an array of a generic type
        elements = new T[capacity];
    }
}
```

A. The elements array must be initialized outside of the constructor  
B. The capacity parameter must be explicitly cast to a generic type T  
C. Generic classes cannot contain array variables; they must use ArrayList or similar collections  
D. Arrays of generic types cannot be instantiated directly because the exact type is unknown at runtime due to type erasure  

---

## Question 34
Consider the generic interface implementation. Why might this specific snippet cause a compilation error?

```java
class Node<T> implements Comparable<Node<T>> {

    T data;

    // Overriding the compareTo method
    public int compareTo(Object o) {
        return 0;
    }
}
```

A. The `compareTo` method parameter must be `Node<T>`, not `Object`, to correctly override the generic interface method  
B. The class does not provide a constructor  
C. Data must be explicitly initialized  
D. The Comparable interface does not take generic parameters  

---

## Question 35
Consider this given code and choose the correct output.

```java
public class Q1 {
    static class Node {
        int val;
        Node next;

        Node(int v) {
            val = v;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);

        // Insert 99 at index 2, 0-based
        Node newNode = new Node(99);
        Node curr = head;

        for (int i = 0; i < 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
```

A. 5 10 15 99  
B. 5 10 15  
C. 5 99 10 15  
D. 5 10 99 15  

---

## Question 36
Consider the given code and choose the right output.

```java
public class Q2 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);

        int target = 7;
        Node curr = head;

        if (head.data == target) {
            head = head.next;
        } else {
            while (curr.next != null && curr.next.data != target) {
                curr = curr.next;
            }

            if (curr.next != null) {
                curr.next = curr.next.next;
            }
        }

        curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            curr = curr.next;
        }
    }
}
```

A. 37  
B. 739  
C. 793  
D. 379  

---

## Question 37
Consider the given code and select the correct output.

```java
public class Q3 {
    static class Node {
        int num;
        Node prev, next;

        Node(int n) {
            num = n;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        Node tail = head;

        int[] values = {4, 6, 8};
        for (int v : values) {
            Node n = new Node(v);
            tail.next = n;
            n.prev = tail;
            tail = n;
        }

        Node fwd = head;
        for (int i = 0; i < 2; i++) {
            fwd = fwd.next;
        }

        Node rev = tail;
        rev = rev.prev;

        int temp = fwd.num;
        fwd.num = rev.num;
        rev.num = temp;

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.num);
            curr = curr.next;
        }
    }
}
```

A. 6248  
B. 2846  
C. 2468  
D. 2648  

---

## Question 38
Consider the given code and select the correct output.

```java
public class LinkedListDebug2 {
    static class Node {
        int data;
        Node link;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        for (int i = 1; i <= 4; i++) {
            Node newNode = new Node(i * 2);
            newNode.link = head;
            head = newNode;
        }

        Node current = head;
        int result = 0;

        while (current != null) {
            if (current.data % 3 == 0) {
                result += current.data;
            }
            current = current.link;
        }

        System.out.println(result);
    }
}
```

A. 4  
B. 0  
C. 6  
D. 8  

---

## Question 39
Consider the following lines of code and pick the right output.

```java
Node head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);

Node temp = head.next;
System.out.println(temp.val);
```

A. 3  
B. null  
C. 1  
D. 2  

---

## Question 40
Consider the following line of code and choose the correct output.

```java
DNode head = new DNode(5);
DNode second = new DNode(10);

head.next = second;
second.prev = head;

System.out.println(head.next.val);
```

A. null  
B. 5  
C. 10  
D. 0  

---

## Question 41
In a university management system, both `Student` and `Lecturer` classes define a method named `displayInfo()`, but each class prints different information. Which OOP concept allows the same method name to behave differently?

A. Array indexing  
B. Polymorphism through method overriding  
C. Encapsulation  
D. Static binding of fields  

---

## Question 42
A `Result` class stores marks and grade information. The lecturer wants to ensure marks cannot be changed directly from another class, but they can still be read safely when needed. Which design is the best choice?

A. Make all variables public  
B. Remove all methods from the class  
C. Use private variables with public getter methods  
D. Store marks only in `main()`  

---

## Question 43
You are designing a `Student` class and want arrays of `Student` objects to be sortable using Java’s built-in sorting methods. How should you declare the class to correctly utilize generic comparison?

A. `class Student implements Comparable<Student>`  
B. `class Student implements Comparable`  
C. `class Student<T extends Comparable>`  
D. `class Student extends Comparable<Student>`  

---

## Question 44
You want to implement an LRU cache where the oldest item is removed from tail. Which is most efficient?

A. Stack  
B. Array  
C. Doubly linked list with head & tail  
D. Singly linked list with only head  

---

## Question 45
A text editor allows the user to undo the most recent typing action first. Which data structure is most appropriate for implementing Undo?

A. Linked list used only from the tail  
B. Binary tree  
C. Stack  
D. Queue  

---

# Answers and Explanations

## Question 1
Answer: A  
A class is a blueprint, while an object is an instance created from that blueprint.

## Question 2
Answer: D  
Encapsulation hides internal data and controls access using methods such as getters and setters.

## Question 3
Answer: D  
The `Dog` class provides its own version of `sound()`, so it overrides the method from `Animal`.

## Question 4
Answer: B  
A constructor must have the same name as the class and has no return type.

## Question 5
Answer: D  
Using a generic type without specifying its type parameter is called a raw type.

## Question 6
Answer: B  
Java uses type erasure mainly to maintain backward compatibility with older legacy code.

## Question 7
Answer: D  
An unbound generic type parameter such as `<T>` is replaced with `Object` during type erasure.

## Question 8
Answer: B  
In a singly linked list, `removeLast()` needs traversal to find the node before the last node.

## Question 9
Answer: C  
Inserting in the middle of a doubly linked list requires updating both next and previous pointers of adjacent nodes.

## Question 10
Answer: D  
After `addFirst("X")`, the new node becomes the head, so `head.element` is `X`.

## Question 11
Answer: A  
Without the previous node, you normally cannot delete the current node properly without traversing from the head.

## Question 12
Answer: A  
The stack has one empty space left. `push(7)` fills it, then `push(9)` causes overflow.

## Question 13
Answer: A  
Function calls are managed using a call stack.

## Question 14
Answer: A  
Pushing into a full stack causes stack overflow.

## Question 15
Answer: A  
If the stack is empty, `stack[top]` may access an invalid index.

## Question 16
Answer: C  
If `top` is not updated to `top.next`, the old top node remains in the stack.

## Question 17
Answer: B  
An ADT allows users to use operations without needing to know the internal implementation.

## Question 18
Answer: D  
A stack follows the Last-In-First-Out, LIFO, principle.

## Question 19
Answer: A  
After removal, elements shift left. Then `i++` skips the next shifted element.

## Question 20
Answer: D  
After pushing 10 and 20, `pop()` removes 20. Then 30 is pushed, so `peek()` returns 30.

## Question 21
Answer: D  
`2 + 3 = 5`, then `6 - 5 = 1`.

## Question 22
Answer: C  
`t1` and `t2` refer to the same object, so changing `t2.x` also changes `t1.x`.

## Question 23
Answer: B  
The first `pop()` removes B. Then C is pushed, so the last `pop()` removes C.

## Question 24
Answer: B  
30 is popped, so the new top is 20.

## Question 25
Answer: C  
`mark` is private, so it cannot be accessed directly from outside the class.

## Question 26
Answer: C  
Inside `Child`, the variable `name` refers to the child’s own `name`, so it prints `Child`.

## Question 27
Answer: D  
When a derived object is created, the base constructor runs first, then the derived constructor.

## Question 28
Answer: B  
The method receives a reference to the same object, so changing `d.x` changes `obj.x`.

## Question 29
Answer: B  
The method prints the first element of the array, which is `Hello`.

## Question 30
Answer: A  
`5.compareTo(10)` is less than 0, so the method returns `true`.

## Question 31
Answer: D  
String concatenation occurs, so `"Pi" + 3.14` becomes `Pi3.14`.

## Question 32
Answer: A  
Java generic types are not covariant. `ArrayList<Integer>` is not a subtype of `ArrayList<Number>`.

## Question 33
Answer: D  
Java cannot directly create arrays of generic types because of type erasure.

## Question 34
Answer: A  
The class implements `Comparable<Node<T>>`, so the method should be `compareTo(Node<T> other)`.

## Question 35
Answer: D  
The original list is `5 → 10 → 15`. The code inserts 99 after 10, producing `5 10 99 15`.

## Question 36
Answer: D  
The original list is `7 → 3 → 7 → 9`. Since the head contains 7, the head is removed, leaving `3 → 7 → 9`, printed as `379`.

## Question 37
Answer: C  
The list is `2 → 4 → 6 → 8`. Both `fwd` and `rev` point to 6, so swapping does not change the list.

## Question 38
Answer: C  
The list becomes `8 → 6 → 4 → 2`. Only 6 is divisible by 3, so the result is 6.

## Question 39
Answer: D  
`temp = head.next` points to the node containing 2.

## Question 40
Answer: C  
`head.next` points to `second`, and `second.val` is 10.

## Question 41
Answer: B  
Different classes can provide different versions of the same method through method overriding, showing polymorphism.

## Question 42
Answer: C  
Private variables protect the data, while public getter methods allow safe reading.

## Question 43
Answer: A  
To sort `Student` objects naturally, the class should implement `Comparable<Student>`.

## Question 44
Answer: C  
A doubly linked list with head and tail allows efficient removal from the tail and movement of nodes.

## Question 45
Answer: C  
Undo uses LIFO behavior, so a stack is the most suitable data structure.