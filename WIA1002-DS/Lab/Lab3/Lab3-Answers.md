# Lab 3 - ADTs and Bags Answers

## Questions 1-4 - Interface and `ArrayBag`

The interface below contains the core operations from Question 1 and the fully specified
`union`, `intersection`, and `difference` operations requested in Questions 2-4.

```java
public interface BagInterface<T> {
    int getCurrentSize();
    boolean isFull();
    boolean isEmpty();
    boolean add(T newEntry);
    T remove();
    boolean remove(T anEntry);
    void clear();
    int getFrequencyOf(T anEntry);
    boolean contains(T anEntry);
    T[] toArray();

    /**
     * Returns a new bag containing every occurrence in this bag followed by every
     * occurrence in otherBag. Neither source bag is changed.
     * @param otherBag non-null bag to combine with this bag
     * @return a new bag whose size is the sum of both source sizes
     */
    BagInterface<T> union(BagInterface<T> otherBag);

    /**
     * Returns a new bag containing each value min(frequency in this bag,
     * frequency in otherBag) times. Neither source bag is changed.
     * @param otherBag non-null bag to compare with this bag
     * @return a new bag containing the overlapping occurrences
     */
    BagInterface<T> intersection(BagInterface<T> otherBag);

    /**
     * Returns a new bag containing each value max(frequency in this bag -
     * frequency in otherBag, 0) times. Neither source bag is changed.
     * @param otherBag non-null bag whose occurrences are subtracted
     * @return a new bag containing the remaining occurrences
     */
    BagInterface<T> difference(BagInterface<T> otherBag);
}
```

```java
import java.util.Arrays;
import java.util.Objects;

public class ArrayBag<T> implements BagInterface<T> {
    private static final int DEFAULT_CAPACITY = 25;
    private T[] bag;
    private int numberOfEntries;

    public ArrayBag() { this(DEFAULT_CAPACITY); }

    @SuppressWarnings("unchecked")
    public ArrayBag(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("negative capacity");
        bag = (T[]) new Object[capacity];
    }

    public int getCurrentSize() { return numberOfEntries; }
    public boolean isFull() { return numberOfEntries == bag.length; }
    public boolean isEmpty() { return numberOfEntries == 0; }

    public boolean add(T newEntry) {
        if (isFull()) return false;
        bag[numberOfEntries++] = newEntry;
        return true;
    }

    public T remove() {
        if (isEmpty()) return null;
        T removed = bag[numberOfEntries - 1];
        bag[--numberOfEntries] = null;
        return removed;
    }

    public boolean remove(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (Objects.equals(bag[i], anEntry)) {
                bag[i] = bag[numberOfEntries - 1];
                bag[--numberOfEntries] = null;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(bag, 0, numberOfEntries, null);
        numberOfEntries = 0;
    }

    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for (int i = 0; i < numberOfEntries; i++)
            if (Objects.equals(bag[i], anEntry)) count++;
        return count;
    }

    public boolean contains(T anEntry) { return getFrequencyOf(anEntry) > 0; }

    public T[] toArray() { return Arrays.copyOf(bag, numberOfEntries); }

    public BagInterface<T> union(BagInterface<T> otherBag) {
        Objects.requireNonNull(otherBag);
        T[] other = otherBag.toArray();
        ArrayBag<T> result = new ArrayBag<>(numberOfEntries + other.length);
        for (T value : toArray()) result.add(value);
        for (T value : other) result.add(value);
        return result;
    }

    public BagInterface<T> intersection(BagInterface<T> otherBag) {
        Objects.requireNonNull(otherBag);
        ArrayBag<T> available = copyOf(otherBag);
        ArrayBag<T> result = new ArrayBag<>(Math.min(numberOfEntries,
                otherBag.getCurrentSize()));
        for (T value : toArray()) {
            if (available.remove(value)) result.add(value);
        }
        return result;
    }

    public BagInterface<T> difference(BagInterface<T> otherBag) {
        Objects.requireNonNull(otherBag);
        ArrayBag<T> available = copyOf(otherBag);
        ArrayBag<T> result = new ArrayBag<>(numberOfEntries);
        for (T value : toArray()) {
            if (!available.remove(value)) result.add(value);
        }
        return result;
    }

    private ArrayBag<T> copyOf(BagInterface<T> source) {
        T[] values = source.toArray();
        ArrayBag<T> copy = new ArrayBag<>(values.length);
        for (T value : values) copy.add(value);
        return copy;
    }
}
```

The temporary copy in `intersection` and `difference` is important: removing a matched value
from the copy gives the correct duplicate-frequency behavior without changing either input bag.

## Question 5 - `ArrayBagDemo`

```java
public class ArrayBagDemo {
    private static void testAdd(BagInterface<String> aBag, String[] content) {
        System.out.print("Adding ");
        for (String value : content) {
            System.out.print(value + " ");
            if (!aBag.add(value)) throw new IllegalStateException("bag is full");
        }
        System.out.println();
    }

    private static void displayBag(BagInterface<String> aBag) {
        System.out.println("The bag contains " + aBag.getCurrentSize()
                + " string(s), as follows:");
        // The textbook T[] API is erased to Object[] at runtime.
        Object[] values = aBag.toArray();
        for (Object value : values) System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};

        System.out.println("bag1:"); testAdd(bag1, contentsOfBag1); displayBag(bag1);
        System.out.println("bag2:"); testAdd(bag2, contentsOfBag2); displayBag(bag2);

        BagInterface<String> bag3 = bag1.union(bag2);
        System.out.println("bag3, union:"); displayBag(bag3); // 14 values

        BagInterface<String> bag4 = bag1.intersection(bag2);
        System.out.println("bag4, intersection:"); displayBag(bag4); // A A B C

        BagInterface<String> bag5 = bag1.difference(bag2);
        System.out.println("bag5, difference:"); displayBag(bag5); // A A
    }
}
```
