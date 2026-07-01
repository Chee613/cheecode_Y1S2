# Lab 5 - Singly and Doubly Linked List Answers

## Question 1 - Package `SList`

### `SNode.java`

```java
package SList;

class SNode<E> {
    E element;
    SNode<E> next;
    SNode() { this(null); }
    SNode(E element) { this.element = element; }
}
```

### `SList.java`

```java
package SList;

import java.util.Objects;

public class SList<E> {
    private SNode<E> head, tail;
    private int size;

    public void appendEnd(E e) {
        SNode<E> n = new SNode<>(e);
        if (tail == null) head = tail = n;
        else { tail.next = n; tail = n; }
        size++;
    }

    public E removeInitial() {
        if (head == null) return null;
        E value = head.element; head = head.next;
        if (--size == 0) tail = null;
        return value;
    }

    public boolean contains(E e) {
        for (SNode<E> p = head; p != null; p = p.next)
            if (Objects.equals(p.element, e)) return true;
        return false;
    }

    public void clear() {
        head = tail = null; size = 0;
        System.out.println("The list is empty.");
    }

    public void display() {
        for (SNode<E> p = head; p != null; p = p.next) System.out.print(p.element + " ");
        System.out.println();
    }
}
```

### `TestSList.java`

```java
package SList;

public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();
        list.appendEnd("Linked list"); list.appendEnd("is"); list.appendEnd("easy.");
        list.display();
        System.out.println("Removed: " + list.removeInitial());
        list.display();
        System.out.println("Contains difficult: " + list.contains("difficult"));
        list.clear();
    }
}
```

## Question 2 - Kindergarten student management

```java
import java.util.Objects;
import java.util.Scanner;

public class StudentManagement {
    private static class Node<E> {
        E value; Node<E> next;
        Node(E value) { this.value = value; }
    }

    private static class StudentList<E> {
        private Node<E> head, tail;
        private int size;

        public void add(E e) {
            Node<E> n = new Node<>(e);
            if (tail == null) head = tail = n;
            else { tail.next = n; tail = n; }
            size++;
        }
        public void removeElement(E e) {
            Node<E> previous = null, current = head;
            while (current != null && !Objects.equals(current.value, e)) {
                previous = current; current = current.next;
            }
            if (current == null) return;
            if (previous == null) head = current.next; else previous.next = current.next;
            if (current == tail) tail = previous;
            size--;
        }
        public void printList() {
            for (Node<E> p = head; p != null; p = p.next) System.out.print(p.value + " ");
            System.out.println();
        }
        public int getSize() { return size; }
        public boolean contains(E e) {
            for (Node<E> p = head; p != null; p = p.next)
                if (Objects.equals(p.value, e)) return true;
            return false;
        }
        public void replace(E e, E newE) {
            for (Node<E> p = head; p != null; p = p.next)
                if (Objects.equals(p.value, e)) { p.value = newE; return; }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentList<String> students = new StudentList<>();
        System.out.println("Enter names; type n to end:");
        while (true) {
            String name = in.nextLine().trim();
            if (name.equalsIgnoreCase("n")) break;
            if (!name.isEmpty()) students.add(name);
        }
        System.out.print("Students: "); students.printList();
        System.out.println("Number of students: " + students.getSize());

        System.out.print("Name to rename: "); String oldName = in.nextLine();
        if (students.contains(oldName)) {
            System.out.print("New name: "); students.replace(oldName, in.nextLine());
        } else System.out.println("Student not found.");
        System.out.print("Updated list: "); students.printList();

        System.out.print("Name to delete: "); String delete = in.nextLine();
        students.removeElement(delete);
        System.out.print("Final list: "); students.printList();
        System.out.println("Number of students: " + students.getSize());
    }
}
```

## Question 3 - Doubly linked list

Positions in this solution are **one-based**, matching the sample: insert 2 at position 2, then
remove position 3 (value 100).

```java
public class DoublyLinkedList<E> {
    private static class Node<E> {
        E value; Node<E> prev, next;
        Node(E value) { this.value = value; }
    }
    private Node<E> head, tail;
    private int size;

    public void addFirst(E e) {
        Node<E> n = new Node<>(e); n.next = head;
        if (head == null) tail = n; else head.prev = n;
        head = n; size++;
    }
    public void addLast(E e) {
        Node<E> n = new Node<>(e); n.prev = tail;
        if (tail == null) head = n; else tail.next = n;
        tail = n; size++;
    }
    public void addAt(int position, E e) {
        if (position < 1 || position > size + 1) throw new IndexOutOfBoundsException();
        if (position == 1) { addFirst(e); return; }
        if (position == size + 1) { addLast(e); return; }
        Node<E> next = nodeAt(position), n = new Node<>(e), previous = next.prev;
        n.prev = previous; n.next = next; previous.next = n; next.prev = n; size++;
    }
    public E removeAt(int position) {
        if (position < 1 || position > size) throw new IndexOutOfBoundsException();
        Node<E> target = nodeAt(position);
        if (target.prev == null) head = target.next; else target.prev.next = target.next;
        if (target.next == null) tail = target.prev; else target.next.prev = target.prev;
        size--; return target.value;
    }
    private Node<E> nodeAt(int position) {
        Node<E> p = head;
        for (int i = 1; i < position; i++) p = p.next;
        return p;
    }
    public void traverseForward() {
        for (Node<E> p = head; p != null; p = p.next) System.out.print(p.value + " ");
        System.out.println();
    }
    public void traverseBackward() {
        for (Node<E> p = tail; p != null; p = p.prev) System.out.print(p.value + " ");
        System.out.println();
    }
    public int getSize() { return size; }
    public void clear() { head = tail = null; size = 0; }
}
```

```java
public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(100);
        list.addAt(2, 2);                         // 1 2 100
        System.out.println("Deleted: " + list.removeAt(3)); // 100
        System.out.print("Forward: "); list.traverseForward();  // 1 2
        System.out.print("Backward: "); list.traverseBackward(); // 2 1
        System.out.println("Size: " + list.getSize());          // 2
        list.clear();
        System.out.println("Size after clear: " + list.getSize()); // 0
    }
}
```
