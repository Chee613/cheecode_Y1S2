# Tutorial 5 - Linked List and Doubly Linked List Answers

## Question 1

### (a) Explanation of lines 10-21

- For `index == 0`, the code saves `head` in `temp`, replaces `head.element`, and returns the
  former element.
- Otherwise it advances `current` to the node before `index`, saves the target node in `temp`,
  replaces the target node's element, and returns its former element.

### (b) Purpose of `xyz`

It is intended to be the list's `set(index, e)` operation: replace the element at an existing
index and return the old value.

### (c) Correct concise code

The original incorrectly appends when `index >= size - 1`, accepts invalid indexes, and performs
unnecessary special cases.

```java
public E set(int index, E e) {
    if (index < 0 || index >= size)
        throw new IndexOutOfBoundsException("index=" + index);

    Node<E> current = head;
    for (int i = 0; i < index; i++) current = current.next;
    E old = current.element;
    current.element = e;
    return old;
}
```

## Question 2

### (a) Trace for `index == 3`

`temp` starts at `head` and moves three links, so it refers to the node at index 3. Its element
is saved. The successor's `prev` is changed to `temp.prev`, and the predecessor's `next` is
changed to `temp.next`, bypassing `temp`. The removed node's two links are cleared and `size`
is decremented.

### (b) Link changes in lines 7-10

```text
Before:
previous <-> temp(index 3) <-> next

After lines 7-8:
previous <-----------------> next
             temp

After lines 9-10:
previous <-----------------> next    null <- temp -> null
```

For production code, also handle index 0 and the last index separately because
`temp.prev` or `temp.next` can be `null`.

## Question 3

Create `z`, connect it after `c`, set its `prev` to the old tail, and update `tail`.

```java
Node<Character> z = new Node<>('z');
z.prev = tail;       // old tail contains 'c'
tail.next = z;
tail = z;
size++;
```

```text
null <- ['a'] <-> ['b'] <-> ['c'] <-> ['z'] -> null
        head                         tail
```
