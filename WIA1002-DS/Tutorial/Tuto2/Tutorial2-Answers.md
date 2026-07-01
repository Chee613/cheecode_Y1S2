# Tutorial 2 - Generics Answers

## Question 1 - `Container<T>`

```java
public class Container<T> {
    private T t;

    public Container() {}
    public void add(T value) { t = value; }
    public T retrieve() { return t; }

    public static void main(String[] args) {
        Container<Integer> number = new Container<>();
        Container<String> word = new Container<>();
        number.add(50);
        word.add("Java");
        System.out.println(number.retrieve()); // 50
        System.out.println(word.retrieve());   // Java
    }
}
```

## Question 2 - Generic `listAll`

```java
public class MyArray {
    public static <T> void listAll(T[] values) {
        for (T value : values) System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] letters = {'a', 'b', 'c'};
        listAll(integers);
        listAll(names);
        listAll(letters);
    }
}
```

## Question 3 - Raw types

A raw type omits a generic type argument, for example `List list` instead of
`List<String> list`. It is unsafe because the compiler cannot enforce the element type, so an
invalid value can be inserted and cause a `ClassCastException` later. Java permits raw types
for backward compatibility with code written before generics were added in Java 5.

## Question 4 - Erasure

Type erasure is the compiler process that removes generic type parameters from bytecode. An
unbounded type becomes `Object`; a bounded type becomes its first bound. The compiler also
inserts casts and bridge methods where needed. Java uses erasure so generic code remains binary
compatible with older JVMs and pre-generics libraries.

## Question 5 - `Duo<A,B>`

```java
public class Duo<A, B> {
    private A first;
    private B second;

    public Duo(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() { return first; }
    public B getSecond() { return second; }
}
```

## Question 6 - Create two `Duo` objects

```java
Duo<String, Integer> sideShape = new Duo<>("Triangle", 3);
Duo<Double, Double> points = new Duo<>(3.5, 7.2);
```

## Question 7 - Wildcard method header

```java
public static void allTransportation(
        java.util.ArrayList<?> vehicle,
        java.util.ArrayList<?> transportation) {
    vehicle.forEach(System.out::println);
    transportation.forEach(System.out::println);
}
```

`ArrayList<?>` accepts both `ArrayList<String>` and `ArrayList<Object>` without allowing
unsafe insertion into either list.

## Question 8 - Display lists using `<?>`

```java
public static void display(java.util.ArrayList<?> list) {
    for (Object value : list) System.out.println(value);
}

// display(numOfCars);
// display(milesPerHour);
```

## Question 9 - Erasure of an unbounded parameter

It is replaced with `Object`.

## Question 10 - Erasure of a bounded parameter

It is replaced with its first bound: `Number` for `<T extends Number>` and `Comparable`
for `<E extends Comparable>`.
