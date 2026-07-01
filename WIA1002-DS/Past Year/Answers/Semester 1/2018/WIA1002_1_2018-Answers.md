# WIA1002 Semester 1 2017/2018 - Answers

## Question 1 - Towers of Hanoi

```java
public class Hanoi {
    static void move(int n, char source, char auxiliary, char destination) {
        if (n == 0) return;
        move(n - 1, source, destination, auxiliary);
        System.out.println("Move disc " + n + " from " + source + " to " + destination);
        move(n - 1, auxiliary, source, destination);
    }
    public static void main(String[] args) { move(3, 'A', 'B', 'C'); }
}
```

## Question 2 - Fixed-capacity queue

```java
public class Queue<E> {
    private final Object[] data;
    private int front, size;
    public Queue(int capacity) { data = new Object[capacity]; }
    public boolean isEmpty() { return size == 0; }
    @SuppressWarnings("unchecked") public E peek() {
        return isEmpty() ? null : (E) data[front];
    }
    public boolean enqueue(E e) {
        if (size == data.length) return false;
        data[(front + size) % data.length] = e; size++; return true;
    }
    @SuppressWarnings("unchecked") public E dequeue() {
        if (isEmpty()) return null;
        E e = (E) data[front]; data[front] = null;
        front = (front + 1) % data.length; size--; return e;
    }
    public void display() {
        for (int i = 0; i < size; i++) System.out.printf("+------------");
        System.out.println("+");
        for (int i = 0; i < size; i++)
            System.out.printf("| %-10s ", data[(front + i) % data.length]);
        System.out.println("|");
        for (int i = 0; i < size; i++) System.out.printf("+------------");
        System.out.println("+");
        for (int i = 0; i < size; i++) System.out.printf("     [%d]     ", i);
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<String> q = new Queue<>(5);
        q.enqueue("hello"); q.enqueue("ali"); q.enqueue("who");
        q.enqueue("wants"); q.enqueue("ice cream");
        q.dequeue(); q.dequeue(); q.enqueue("1000"); q.enqueue("2000");
        System.out.println("Peek() = " + q.peek()); // who
        q.display();
    }
}
```

## Question 3 - Generic stack

One generic array implementation satisfies both the original and modified requirements.

```java
public class StackWithGeneric<E> {
    private final Object[] data;
    private int size;
    public StackWithGeneric(int capacity) { data = new Object[capacity]; }
    public boolean isEmpty() { return size == 0; }
    public boolean push(E e) {
        if (size == data.length) return false; data[size++] = e; return true;
    }
    @SuppressWarnings("unchecked") public E peek() {
        return isEmpty() ? null : (E) data[size - 1];
    }
    @SuppressWarnings("unchecked") public E pop() {
        if (isEmpty()) return null;
        E e = (E) data[--size]; data[size] = null; return e;
    }
    public void popAll() { while (!isEmpty()) System.out.println("Removing " + pop()); }
    public void display() {
        for (int i = 0; i < size; i++) System.out.println(data[i]);
    }
    public void displayReverse() {
        for (int i = size - 1; i >= 0; i--) System.out.println(data[i]);
    }
}
```

```java
public class TestStacks {
    public static void main(String[] args) {
        StackWithGeneric<String> s1 = new StackWithGeneric<>(4);
        for (String s : new String[]{"one","two","three","four"}) s1.push(s);
        System.out.println(s1.peek()); s1.display(); s1.displayReverse(); s1.popAll();
        StackWithGeneric<Integer> s2 = new StackWithGeneric<>(4);
        for (int n : new int[]{100,200,300,400}) s2.push(n);
        System.out.println(s2.peek()); s2.display(); s2.displayReverse(); s2.popAll();
    }
}
```

## Question 4 - Course linked list and total credit hours

```java
public class LList {
    private static class Node {
        String course; int hours; Node next;
        Node(String c, int h, Node n) { course = c; hours = h; next = n; }
    }
    private Node head;
    public boolean isEmpty() { return head == null; }
    public void add(String course, int hours) { head = new Node(course, hours, head); }
    public boolean addAfter(String existing, String course, int hours) {
        Node p = find(existing); if (p == null) return false;
        p.next = new Node(course, hours, p.next); return true;
    }
    public boolean remove(String course, int hours) {
        Node prev = null, cur = head;
        while (cur != null && !(cur.course.equals(course) && cur.hours == hours)) {
            prev = cur; cur = cur.next;
        }
        if (cur == null) return false;
        if (prev == null) head = cur.next; else prev.next = cur.next; return true;
    }
    private Node find(String course) {
        for (Node p = head; p != null; p = p.next) if (p.course.equals(course)) return p;
        return null;
    }
    public void display() {
        for (Node p = head; p != null; p = p.next)
            System.out.printf("%s: %d hours%n", p.course, p.hours);
    }
    public int totalCreditHours() {
        int total = 0; for (Node p = head; p != null; p = p.next) total += p.hours;
        System.out.println("Total credit hours taken: " + total); return total;
    }
    public static void main(String[] args) {
        LList list = new LList();
        list.add("Computing Mathematics 1",3); list.add("Principles of AI",3);
        list.add("Programming 1",5); list.add("Data Structure",5);
        list.display(); list.totalCreditHours();
        list.addAfter("Programming 1","Software Architecture",4);
        list.addAfter("Software Architecture","Networking",4); list.totalCreditHours();
        list.remove("Networking",4); list.remove("Principles of AI",3);
        list.display(); list.totalCreditHours(); // 17
    }
}
```
