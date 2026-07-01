# Lab 7b - Priority Queue Answers

## Question 1 - Integer priority queue operations

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueIntegers {
    public static void main(String[] args) {
        int[] input = {4, 8, 1, 2, 9, 6, 3, 7};
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int n : input) q.add(n);
        System.out.println(q);                   // heap order, not guaranteed sorted
        System.out.println("poll: " + q.poll()); // 1
        q.add(5);
        System.out.println("array: " + Arrays.toString(q.toArray()));
        System.out.println("peek: " + q.peek()); // 2
        System.out.println("contains 1: " + q.contains(1)); // false after poll
        System.out.println("size: " + q.size()); // 8
        while (!q.isEmpty()) System.out.print(q.poll() + " "); // 2 3 4 5 6 7 8 9

        PriorityQueue<Integer> reverse = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : input) reverse.add(n);
        while (!reverse.isEmpty()) System.out.print(reverse.poll() + " "); // 9 ... 1
    }
}
```

## Question 2 - Union, difference, and intersection

Treating each queue as a set (each supplied name occurs once):

```java
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueSets {
    static PriorityQueue<String> queue(Collection<String> values) {
        return new PriorityQueue<>(values);
    }
    public static void main(String[] args) {
        TreeSet<String> a = new TreeSet<>(java.util.List.of(
                "George", "Jim", "John", "Blake", "Kevin", "Michael"));
        TreeSet<String> b = new TreeSet<>(java.util.List.of(
                "George", "Katie", "Kevin", "Michelle", "Ryan"));

        TreeSet<String> union = new TreeSet<>(a); union.addAll(b);
        TreeSet<String> differenceAB = new TreeSet<>(a); differenceAB.removeAll(b);
        TreeSet<String> intersection = new TreeSet<>(a); intersection.retainAll(b);

        System.out.println("Union: " + queue(union));
        System.out.println("A - B: " + queue(differenceAB));
        System.out.println("Intersection: " + queue(intersection));
    }
}
```

- Union: `Blake, George, Jim, John, Katie, Kevin, Michael, Michelle, Ryan`
- First minus second: `Blake, Jim, John, Michael`
- Intersection: `George, Kevin`

## Question 3 - `ComparableBook`

The natural priority below is ascending book ID.

```java
public class ComparableBook implements Comparable<ComparableBook> {
    private final int id;
    private final String title;

    public ComparableBook(int id, String title) {
        this.id = id; this.title = title;
    }
    public int getId() { return id; }
    public String getTitle() { return title; }

    @Override public int compareTo(ComparableBook other) {
        int byId = Integer.compare(id, other.id);
        return byId != 0 ? byId : title.compareTo(other.title);
    }
    @Override public String toString() { return id + " - " + title; }
}
```

Repeated `peek()`/`remove()` in the supplied main program produces IDs in this order:
`1065, 1097, 3012, 6481, 7063`.
