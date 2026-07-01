# WIA1002 Semester 1 2016/2017 - Answers

## Question 1 - Towers of Hanoi

### (a) Recursive algorithm for three discs

```text
HANOI(n, source, auxiliary, destination)
    if n == 1
        move disc 1 from source to destination
        return
    HANOI(n - 1, source, destination, auxiliary)
    move disc n from source to destination
    HANOI(n - 1, auxiliary, source, destination)
```

For three discs this produces seven moves: 1->3, 1->2, 3->2, 1->3, 2->1,
2->3, 1->3.

### (b) Java program

```java
public class Hanoi {
    static void solve(int n, int from, int auxiliary, int to) {
        if (n == 0) return;
        solve(n - 1, from, to, auxiliary);
        System.out.printf("Move disc %d from pole %d to pole %d%n", n, from, to);
        solve(n - 1, auxiliary, from, to);
    }
    public static void main(String[] args) { solve(3, 1, 2, 3); }
}
```

Time is O(2^n); the minimum number of moves is `2^n - 1`.

## Question 2 - Queue and `ChangeOrder`

```java
public class MyQueue<E> {
    private Object[] data = new Object[10];
    private int front, size;

    public MyQueue() {}
    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }
    @SuppressWarnings("unchecked")
    public E peek() { return isEmpty() ? null : (E) data[front]; }
    public void enqueue(E value) {
        if (size == data.length) grow();
        data[(front + size) % data.length] = value; size++;
    }
    @SuppressWarnings("unchecked")
    public E dequeue() {
        if (isEmpty()) return null;
        E value = (E) data[front]; data[front] = null;
        front = (front + 1) % data.length; size--; return value;
    }
    public void changeOrder(int k) {
        if (k < 1 || k > size) throw new IllegalArgumentException("k out of range");
        for (int i = 1; i < k; i++) enqueue(dequeue());
    }
    private void grow() {
        Object[] larger = new Object[data.length * 2];
        for (int i = 0; i < size; i++) larger[i] = data[(front + i) % data.length];
        data = larger; front = 0;
    }
    public String toString() {
        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) out.append(", ");
            out.append(data[(front + i) % data.length]);
        }
        return out.append(']').toString();
    }
    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<>();
        for (int n = 10; n <= 90; n += 10) q.enqueue(n);
        q.changeOrder(4);
        System.out.println(q); // [40, 50, 60, 70, 80, 90, 10, 20, 30]
    }
}
```

## Question 3 - Character stack and word reversal

```java
public class CharStack {
    private final char[] data;
    private int top = -1;
    public CharStack(int capacity) { data = new char[capacity]; }
    public boolean isStackEmpty() { return top == -1; }
    public boolean isStackFull() { return top == data.length - 1; }
    public void push(char c) {
        if (isStackFull()) throw new IllegalStateException("stack full");
        data[++top] = c;
    }
    public char peek() {
        if (isStackEmpty()) throw new IllegalStateException("stack empty");
        return data[top];
    }
    public char pop() {
        char value = peek(); top--; return value;
    }
    public static void main(String[] args) {
        String word = "MALAYSIA";
        CharStack stack = new CharStack(word.length());
        for (char c : word.toCharArray()) stack.push(c);
        while (!stack.isStackEmpty()) System.out.print(stack.pop()); // AISYALAM
    }
}
```

## Question 4 - Singly linked list

```java
public class SinglyLinkedListFinals {
    private static class Node { int value; Node next; Node(int v) { value = v; } }
    private Node head, tail;

    public void add(int value) {
        Node n = new Node(value);
        if (tail == null) head = tail = n; else { tail.next = n; tail = n; }
    }
    public boolean addAfter(int value, int after) {
        Node p = find(after); if (p == null) return false;
        Node n = new Node(value); n.next = p.next; p.next = n;
        if (tail == p) tail = n; return true;
    }
    public Integer deleteFront() {
        if (head == null) return null;
        int value = head.value; head = head.next; if (head == null) tail = null; return value;
    }
    public boolean deleteAfter(int x) {
        Node p = find(x);
        if (p == null || p.next == null) return false;
        if (p.next == tail) tail = p; p.next = p.next.next; return true;
    }
    private Node find(int value) {
        for (Node p = head; p != null; p = p.next) if (p.value == value) return p;
        return null;
    }
    public void traverse() {
        for (Node p = head; p != null; p = p.next) System.out.print(p.value + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedListFinals s = new SinglyLinkedListFinals();
        for (int n = 10; n <= 50; n += 10) s.add(n);
        s.addAfter(11,10); s.addAfter(21,20); s.addAfter(31,30);
        s.addAfter(41,40); s.addAfter(51,50); s.traverse();
        s.deleteFront(); s.deleteFront(); s.traverse();
        s.deleteAfter(40); s.deleteAfter(40); s.deleteAfter(31); s.deleteAfter(40);
        s.traverse(); // 20 21 30 31 51
    }
}
```
