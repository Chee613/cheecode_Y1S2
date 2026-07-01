# Lab 4 - Linked List Answers

## Question 1 - `Node`, `MyLinkedList`, and test program

```java
class Node<E> {
    E element;
    Node<E> next;
    Node() {}
    Node(E element) { this.element = element; }
}
```

```java
import java.util.Objects;

public class MyLinkedList<E> {
    private Node<E> head, tail;
    private int size;

    public MyLinkedList() {}
    public int getSize() { return size; }
    public boolean isEmpty() { return size == 0; }

    public void addFirst(E e) {
        Node<E> n = new Node<>(e);
        n.next = head; head = n;
        if (tail == null) tail = n;
        size++;
    }

    public void addLast(E e) {
        Node<E> n = new Node<>(e);
        if (tail == null) head = tail = n;
        else { tail.next = n; tail = n; }
        size++;
    }

    public void add(int index, E e) {
        checkPosition(index);
        if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> previous = node(index - 1);
            Node<E> n = new Node<>(e);
            n.next = previous.next; previous.next = n; size++;
        }
    }

    public E removeFirst() {
        if (head == null) return null;
        E old = head.element; head = head.next;
        if (--size == 0) tail = null;
        return old;
    }

    public E removeLast() {
        if (head == null) return null;
        if (size == 1) return removeFirst();
        Node<E> previous = node(size - 2);
        E old = tail.element; previous.next = null; tail = previous; size--;
        return old;
    }

    public E remove(int index) {
        checkElement(index);
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();
        Node<E> previous = node(index - 1);
        E old = previous.next.element;
        previous.next = previous.next.next; size--;
        return old;
    }

    public boolean contains(E e) { return indexOf(e) >= 0; }
    public E get(int index) { checkElement(index); return node(index).element; }
    public E getFirst() { return head == null ? null : head.element; }
    public E getLast() { return tail == null ? null : tail.element; }

    public int indexOf(E e) {
        int i = 0;
        for (Node<E> p = head; p != null; p = p.next, i++)
            if (Objects.equals(p.element, e)) return i;
        return -1;
    }

    public int lastIndexOf(E e) {
        int answer = -1, i = 0;
        for (Node<E> p = head; p != null; p = p.next, i++)
            if (Objects.equals(p.element, e)) answer = i;
        return answer;
    }

    public E set(int index, E e) {
        checkElement(index); Node<E> p = node(index);
        E old = p.element; p.element = e; return old;
    }

    public void clear() { head = tail = null; size = 0; }

    public void print() {
        for (Node<E> p = head; p != null; p = p.next) System.out.print(p.element + " ");
        System.out.println();
    }

    // Prints in reverse order without changing the links.
    public void reverse() { printReverse(head); System.out.println(); }
    private void printReverse(Node<E> p) {
        if (p == null) return;
        printReverse(p.next); System.out.print(p.element + " ");
    }

    private Node<E> node(int index) {
        Node<E> p = head;
        for (int i = 0; i < index; i++) p = p.next;
        return p;
    }
    private void checkElement(int i) {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("index=" + i);
    }
    private void checkPosition(int i) {
        if (i < 0 || i > size) throw new IndexOutOfBoundsException("index=" + i);
    }

    // Question 2
    public E getMiddleValue() {
        if (head == null) return null;
        Node<E> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; fast = fast.next.next;
        }
        return slow.element; // for an even size, returns the second middle value
    }
}
```

```java
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        for (char c : new char[]{'a','b','c','d','e'}) list.addLast(c); // (a)
        list.print();                                                   // (b)
        list.reverse();                                                 // (c): e d c b a
        System.out.println("Size: " + list.getSize());                  // (d): 5
        System.out.println("First: " + list.getFirst());                // (e): a
        System.out.println("Last: " + list.getLast());                  // (e): e
        System.out.println("Deleted: " + list.remove(2));               // (f): c
        System.out.println("Index of b: " + list.indexOf('b'));         // (g): 1
        System.out.println("Index of d: " + list.indexOf('d'));         // (g): 2
        System.out.println("Contains c: " + list.contains('c'));        // (h): false
        char[] replacement = {'j','a','v','a'};
        for (int i = 0; i < replacement.length; i++) list.set(i, replacement[i]);
        list.print();                                                   // (i): j a v a
        System.out.println("Middle: " + list.getMiddleValue());         // v
    }
}
```

## Question 2 - `getMiddleValue`

The implementation is included in `MyLinkedList` above. A slow pointer advances one node while
a fast pointer advances two. When the fast pointer reaches the end, the slow pointer is at the
middle. Its time complexity is O(n) and extra space is O(1).
