# Lab 2 - Generics Answers

## Question 1 - `MyGeneric`

```java
class MyGeneric<E> {
    private E e;
    MyGeneric() {}
    MyGeneric(E e) { this.e = e; }
    void set(E e) { this.e = e; }
    E get() { return e; }

    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        strObj.set("Data Structure"); intObj.set(1002);
        System.out.println(strObj.get());
        System.out.println(intObj.get());
    }
}
```

## Question 2 - Maximum of three values

```java
class CompareMax {
    static <T extends Comparable<? super T>> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximum(7, 12, 9)); // 12
    }
}
```

## Question 3 - `StorePairGeneric`

```java
import java.util.Objects;

class StorePairGeneric<T extends Comparable<? super T>>
        implements Comparable<StorePairGeneric<T>> {
    private T first, second;
    StorePairGeneric(T first, T second) { setPair(first, second); }
    T getFirst() { return first; }
    T getSecond() { return second; }
    void setPair(T first, T second) { this.first = first; this.second = second; }
    public String toString() { return "first = " + first + " second = " + second; }

    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof StorePairGeneric<?> other)) return false;
        return Objects.equals(first, other.first); // compare first values as required
    }
    @Override public int hashCode() { return Objects.hashCode(first); }
    @Override public int compareTo(StorePairGeneric<T> other) {
        return first.compareTo(other.first);
    }
}
```

```java
StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);
System.out.println(a.compareTo(b)); // positive
System.out.println(a.equals(b));    // false
System.out.println(a.compareTo(c)); // 0
System.out.println(a.equals(c));    // true (first values are equal)
```

## Question 4 - `minmax`

```java
static <T extends Comparable<? super T>> String minmax(T[] values) {
    if (values.length == 0) throw new IllegalArgumentException("empty array");
    T min = values[0], max = values[0];
    for (T value : values) {
        if (value.compareTo(min) < 0) min = value;
        if (value.compareTo(max) > 0) max = value;
    }
    return "Min = " + min + " Max = " + max;
}
```

For the arrays in the PDF, the results are `Min = 1 Max = 9` and
`Min = blue Max = tan` (lexicographic string order).

## Question 5 - Generic `max` and `Circle`

```java
class Circle implements Comparable<Circle> {
    private final double radius;
    Circle(double radius) { this.radius = radius; }
    @Override public int compareTo(Circle other) {
        return Double.compare(radius, other.radius);
    }
    public String toString() { return "Circle(radius=" + radius + ")"; }
}

class FindMax {
    static <E extends Comparable<E>> E max(E[] list) {
        if (list.length == 0) throw new IllegalArgumentException("empty array");
        E max = list[0];
        for (E value : list) if (value.compareTo(max) > 0) max = value;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max(new Integer[]{1, 2, 3}));
        System.out.println(max(new String[]{"red", "green", "blue"})); // red
        System.out.println(max(new Circle[]{new Circle(3), new Circle(2.9), new Circle(5.9)}));
    }
}
```

## Question 6 - Two-dimensional minimum and maximum

```java
class MinMaxTwoDArray {
    static <E extends Comparable<E>> E min(E[][] list) {
        E min = first(list);
        for (E[] row : list) for (E value : row)
            if (value.compareTo(min) < 0) min = value;
        return min;
    }
    static <E extends Comparable<E>> E max(E[][] list) {
        E max = first(list);
        for (E[] row : list) for (E value : row)
            if (value.compareTo(max) > 0) max = value;
        return max;
    }
    private static <E> E first(E[][] list) {
        if (list.length == 0 || list[0].length == 0)
            throw new IllegalArgumentException("empty array");
        return list[0][0];
    }
    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        System.out.println("Minimum: " + min(numbers)); // 1
        System.out.println("Maximum: " + max(numbers)); // 6
    }
}
```
