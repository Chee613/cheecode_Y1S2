# Tutorial 4 - Linked List Answers

Assume this node definition and zero-based indexes:

```java
class Node<E> {
    E element;
    Node<E> next;
    Node(E element) { this.element = element; }
}
```

## Question 1

### (a)-(c) Create and link `node1` and `node2`

```java
Node<Character> node1 = new Node<>('a');
Node<Character> node2 = new Node<>('z');
Node<Character> head = node1;
Node<Character> tail = node2;
node1.next = node2;                 // node1 accesses node2 through next
```

```text
head -> ['a' | next] -> ['z' | null] <- tail
```

### (d)-(g) Add `firstNode` at the front

Two cases must be considered: an empty list (`head == null`) and a non-empty list.

```java
Node<Character> firstNode = new Node<>('x');
if (head == null) {
    head = tail = firstNode;
} else {
    firstNode.next = head;
    head = firstNode;
}
size++;
```

```text
head -> ['x' | next] -> ['a' | next] -> ['z' | null] <- tail
```

### (h-i) `addLast('c')`

If empty, assign both `head` and `tail`; otherwise link the old tail to the new node and move
`tail`.

```java
Node<Character> n = new Node<>('c');
if (tail == null) head = tail = n;
else { tail.next = n; tail = n; }
size++;
```

### (h-ii) `add(index, 'd')`

Validate `0 <= index <= size`. Use `addFirst` for 0 and `addLast` for `size`; otherwise stop
at index - 1 and splice the new node between its predecessor and successor.

```java
Node<Character> previous = head;
for (int i = 1; i < index; i++) previous = previous.next;
Node<Character> n = new Node<>('d');
n.next = previous.next;
previous.next = n;
size++;
```

### (h-iii) `removeFirst()`

```java
if (head == null) return null;
Character removed = head.element;
head = head.next;
if (--size == 0) tail = null;
return removed;
```

### (h-iv) `removeLast()`

For one node, clear both references. Otherwise walk to the node before `tail`, set its `next`
to `null`, and make it the new tail.

```java
if (head == null) return null;
Character removed = tail.element;
if (head == tail) { head = tail = null; size = 0; }
else {
    Node<Character> p = head;
    while (p.next != tail) p = p.next;
    p.next = null; tail = p; size--;
}
return removed;
```

### (h-v) `remove(1)`

Stop at the predecessor (index 0), bypass its successor, update `tail` if necessary, decrement
`size`, and return the removed value.

```java
Node<Character> previous = head;
Node<Character> removed = previous.next;
previous.next = removed.next;
if (removed == tail) tail = previous;
size--;
return removed.element;
```

## Question 2

### (a) Method name

`contains(E e)`.

### (b) Correct method

```java
public boolean contains(E e) {
    Node<E> current = head;
    while (current != null) {
        if (java.util.Objects.equals(current.element, e)) return true;
        current = current.next;
    }
    return false;
}
```

## Question 3

### (a) Operation name

The figure represents `addLast(E e)`: `temp` becomes the new tail.

### (b) Code using the figure's variables

```java
Node<E> pointer1 = head;
while (pointer1.next != null) pointer1 = pointer1.next;
Node<E> temp = new Node<>(e);
pointer1.next = temp;
tail = temp;
size++;
```

```text
head -> [old node] -> [old tail / pointer1] -> [temp | null] <- tail
```
