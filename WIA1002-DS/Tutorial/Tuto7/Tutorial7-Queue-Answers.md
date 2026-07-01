# Tutorial 7 - Queue Answers

## Question 1 - Four everyday queues

1. Print jobs waiting for a printer.
2. Cars waiting at a toll booth.
3. Customer-support calls waiting for an agent.
4. Network packets waiting at a router.

## Question 2 - Queue versus stack

A queue is FIFO: insertion is at the rear and removal is from the front. A stack is LIFO:
both insertion and removal occur at the top.

## Question 3

The extra closing brace after the `for` loop in the question is assumed to be a typo.

### (a)

For `true false false true true`, values 1, 4, and 5 print immediately; 2 and 3 are queued.

```text
1 4 5 2 3
```

### (b)

No. Values printed on `true` appear first in increasing order, followed by queued values in
increasing FIFO order. The required queued suffix `4 2` is decreasing and cannot occur.

### (c)

At least these inputs produce `1 2 3 4 5`:

```text
true  true  true  true  true
false false false false false
true  false false false false
```

Other valid choices are any `true` prefix followed only by `false` values.

## Question 4 - Hand trace

After the given setup, `X` is front `[5, 7, 9, 2, 4]` rear and `Y == 3`. Treating parts
(a)-(d) sequentially:

- (a) `X.front()` returns `5`; the queue is unchanged.
- (b) `Y = X.dequeue()` makes `Y == 5`; after enqueueing 10, `X.front()` returns `7`.
  Queue: `[7, 9, 2, 4, 10]`.
- (c) `Y = X.dequeue()` makes `Y == 7`. Queue: `[9, 2, 4, 10]`.
- (d) `X.front()` returns `9`.

## Question 5 - Three additional linked-list queue operations

```java
public E peek() {                 // inspect without removal
    return head == null ? null : head.element;
}

public boolean contains(E value) { // linear search
    for (Node<E> p = head; p != null; p = p.next)
        if (java.util.Objects.equals(p.element, value)) return true;
    return false;
}

public boolean isEmpty() {        // constant-time emptiness test
    return head == null;
}
```
