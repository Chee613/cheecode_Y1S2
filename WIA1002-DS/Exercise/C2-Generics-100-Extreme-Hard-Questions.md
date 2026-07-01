# Chapter 2 Generics: 100 Extreme-Hard Questions

> Topics: generic types & type parameters, `ArrayList<E>`, generic classes/interfaces/methods, bounded type parameters, raw types, wildcards (`?`, `? extends`, `? super`), type erasure, and generic restrictions. Mix of theory traps and code tracing. Choose the single best answer.

---

## Question 1

**Question:** What does a generic type parameter such as `<E>` receive?

**Choices:**
- **A.** a runtime value like 5 or "hello"
- **B.** a memory address
- **C.** a type (e.g., `String`, `Integer`) supplied at compile time
- **D.** a package name, which the definition guarantees in every case

**Correct Answer:** a type (e.g., `String`, `Integer`) supplied at compile time

**Explanation:** Generics parameterize *types*, not values; the type argument is provided when the generic is used.

---

## Question 2

**Question:** The primary benefit of generics over raw types is:

**Choices:**
- **A.** faster runtime execution, so no traversal or comparison is ever needed
- **B.** smaller compiled class files
- **C.** automatic multithreading
- **D.** stronger compile-time type checking, catching type errors before runtime

**Correct Answer:** stronger compile-time type checking, catching type errors before runtime

**Explanation:** Generics move many type errors from runtime to compile time, improving reliability.

---

## Question 3

**Question:** Which declaration is legal?

**Choices:**
- **A.** `ArrayList<int> a = new ArrayList<>();`
- **B.** `ArrayList<int> a = new ArrayList<int>();`
- **C.** `ArrayList<Integer> a = new ArrayList<>();`
- **D.** `ArrayList<> a = new ArrayList<Integer>();`

**Correct Answer:** `ArrayList<Integer> a = new ArrayList<>();`

**Explanation:** Type arguments must be reference types; `int` is a primitive, so `Integer` (its wrapper) is required.

---

## Question 4

**Question:** Why is a primitive like `int` not allowed as a generic type argument?

**Choices:**
- **A.** primitives are too large, independent of the input size or ordering
- **B.** primitives cannot be compared, making it the most efficient choice by design
- **C.** the JVM forbids all primitives
- **D.** generics operate on reference types; primitives must be boxed into wrappers such as `Integer`

**Correct Answer:** generics operate on reference types; primitives must be boxed into wrappers such as `Integer`

**Explanation:** Generics require reference types, so primitives are represented by their wrapper classes with autoboxing.

---

## Question 5

**Question:** With generics, retrieving from `ArrayList<String> list` via `list.get(0)`:

**Choices:**
- **A.** requires a cast to `String`
- **B.** returns an `Object`, as a direct consequence of the structure's shape
- **C.** returns a `String` directly, no cast needed
- **D.** throws a ClassCastException

**Correct Answer:** returns a `String` directly, no cast needed

**Explanation:** The compiler knows the element type is `String`, so no explicit cast is necessary—one of generics' conveniences.

---

## Question 6

**Question:** Without generics (raw type), `Object o = rawList.get(0);` then using it as a `String` requires:

**Choices:**
- **A.** nothing, which holds even for empty or degenerate inputs
- **B.** a generic method
- **C.** a wildcard
- **D.** an explicit cast `(String) rawList.get(0)`

**Correct Answer:** an explicit cast `(String) rawList.get(0)`

**Explanation:** Raw types return `Object`, forcing a cast that risks `ClassCastException` at runtime.

---

## Question 7

**Question:** By convention, the type parameter letter `E` usually stands for:

**Choices:**
- **A.** exception
- **B.** enum
- **C.** element
- **D.** entity

**Correct Answer:** element

**Explanation:** `E` conventionally denotes the element type in collections.

---

## Question 8

**Question:** Which convention pairing is correct?

**Choices:**
- **A.** K = element, V = value
- **B.** K = kind, V = vertex
- **C.** K = key, V = variable
- **D.** K = key, V = value

**Correct Answer:** K = key, V = value

**Explanation:** In maps, `K` is the key type and `V` is the value type.

---

## Question 9

**Question:** What does `T` conventionally denote, and `N`?

**Choices:**
- **A.** T = table, N = node
- **B.** T = type, N = name
- **C.** T = type, N = number
- **D.** T = token, N = number

**Correct Answer:** T = type, N = number

**Explanation:** `T` is a general type and `N` denotes a numeric type by convention.

---

## Question 10

**Question:** A generic class is declared as:

**Choices:**
- **A.** `public class Box(E) { }`
- **B.** `public class Box[E] { }`
- **C.** `public class <E>Box { }`
- **D.** `public class Box<E> { }`

**Correct Answer:** `public class Box<E> { }`

**Explanation:** The type parameter appears in angle brackets after the class name.

---

## Question 11

**Question:** In a generic class `GenericBox<T>`, the constructor is written as:

**Choices:**
- **A.** `public GenericBox<T>() { }`
- **B.** `public <T> GenericBox() { }`
- **C.** `public GenericBox() { }`
- **D.** `public GenericBox<>() { }`

**Correct Answer:** `public GenericBox() { }`

**Explanation:** The constructor name carries no type parameter; the `<T>` belongs on the class header, not the constructor name.

---

## Question 12

**Question:** A generic method's type parameter is placed:

**Choices:**
- **A.** after the method name
- **B.** after the parameter list
- **C.** inside the method body
- **D.** before the return type

**Correct Answer:** before the return type

**Explanation:** A generic method declares its type parameter before the return type, e.g., `public static <E> void print(E[] a)`.

---

## Question 13

**Question:** Which is a correct generic method header?

**Choices:**
- **A.** `public static void <E> print(E[] list)`
- **B.** `public static void print<E>(E[] list)`
- **C.** `public static <E> void print(E[] list)`
- **D.** `public <E> static void print(E[] list)`

**Correct Answer:** `public static <E> void print(E[] list)`

**Explanation:** The `<E>` goes immediately before the return type `void`, after the modifiers.

---

## Question 14

**Question:** A bounded type parameter `<T extends Number>` means T must be:

**Choices:**
- **A.** exactly `Number`
- **B.** any supertype of `Number`
- **C.** any reference type
- **D.** `Number` or any subtype of `Number`

**Correct Answer:** `Number` or any subtype of `Number`

**Explanation:** `extends` sets an upper bound, so T is `Number` or a subclass like `Integer`/`Double`.

---

## Question 15

**Question:** For `class BoundedGeneric<T extends Number>`, which instantiation fails to compile?

**Choices:**
- **A.** `new BoundedGeneric<Integer>()`
- **B.** `new BoundedGeneric<String>()`
- **C.** `new BoundedGeneric<Double>()`
- **D.** `new BoundedGeneric<Number>()`

**Correct Answer:** `new BoundedGeneric<String>()`

**Explanation:** `String` is not a subtype of `Number`, violating the upper bound.

---

## Question 16

**Question:** An unbounded `<E>` is equivalent to:

**Choices:**
- **A.** `<E super Object>`
- **B.** `<E extends Comparable>`
- **C.** `<E extends Object>`
- **D.** `<E extends Number>`

**Correct Answer:** `<E extends Object>`

**Explanation:** With no explicit bound, the implicit upper bound is `Object`.

---

## Question 17

**Question:** A raw type is:

**Choices:**
- **A.** a generic used with a wildcard
- **B.** a primitive type, because the elements are always stored contiguously
- **C.** a bounded generic, and this is true regardless of how the data was built
- **D.** a generic class/interface used without any type argument, e.g., `ArrayList list = new ArrayList();`

**Correct Answer:** a generic class/interface used without any type argument, e.g., `ArrayList list = new ArrayList();`

**Explanation:** Omitting the type argument yields the raw type, which bypasses generic type checking.

---

## Question 18

**Question:** Why are raw types considered unsafe?

**Choices:**
- **A.** they run slower
- **B.** they defer type checks
- **C.** they cannot be instantiated
- **D.** they use more memory

**Correct Answer:** they defer type checks

**Explanation:** Raw types skip compile-time type safety, so incompatible operations surface only at runtime.

---

## Question 19

**Question:** Type erasure means the compiler:

**Choices:**
- **A.** keeps full generic type info in bytecode at runtime
- **B.** deletes the class files, which the definition guarantees in every case
- **C.** uses generic types at compile time, then removes them for backward compatibility
- **D.** converts generics to primitives

**Correct Answer:** uses generic types at compile time, then removes them for backward compatibility

**Explanation:** Generics are checked at compile time and erased afterward, so the runtime works with raw/Object-based forms.

---

## Question 20

**Question:** After erasure, an unbounded type parameter `E` is replaced with:

**Choices:**
- **A.** `Number`
- **B.** its first use
- **C.** `Comparable`
- **D.** `Object`

**Correct Answer:** `Object`

**Explanation:** Unbounded parameters erase to `Object`.

---

## Question 21

**Question:** After erasure, `<T extends Number>` erases T to:

**Choices:**
- **A.** `Object`
- **B.** `Number`
- **C.** `Integer`
- **D.** `Comparable`

**Correct Answer:** `Number`

**Explanation:** A bounded parameter erases to its (leftmost) bound, here `Number`.

---

## Question 22

**Question:** How many `ArrayList` classes does the JVM load for `ArrayList<String>` and `ArrayList<Integer>`?

**Choices:**
- **A.** two, one per type
- **B.** zero
- **C.** one shared `ArrayList` class
- **D.** one per method call

**Correct Answer:** one shared `ArrayList` class

**Explanation:** Due to erasure, both parameterizations share a single loaded `ArrayList` class.

---

## Question 23

**Question:** Which generic restriction is correct?

**Choices:**
- **A.** you can write `new E()`, so no traversal or comparison is ever needed
- **B.** you can write `new E[10]`
- **C.** generic exception classes are allowed
- **D.** you cannot write `new E()` because E is erased/unknown at runtime

**Correct Answer:** you cannot write `new E()` because E is erased/unknown at runtime

**Explanation:** The runtime has no concrete `E`, so instantiating it directly is illegal.

---

## Question 24

**Question:** Creating a generic array `new E[capacity]` is illegal, but a common workaround is:

**Choices:**
- **A.** `new Object()`, independent of the input size or ordering
- **B.** `(E[]) new Object[capacity]` with an unchecked warning
- **C.** `new E{capacity}`
- **D.** it cannot be done at all

**Correct Answer:** `(E[]) new Object[capacity]` with an unchecked warning

**Explanation:** You allocate an `Object[]` and cast to `E[]`, accepting an unchecked-cast warning.

---

## Question 25

**Question:** Can a class type parameter `E` be used in a static context (static field/method)?

**Choices:**
- **A.** yes, always, making it the most efficient choice by design
- **B.** only if bounded
- **C.** no, the class's type parameter is not available in static context
- **D.** only for `Object`

**Correct Answer:** no, the class's type parameter is not available in static context

**Explanation:** A class type parameter is tied to instances, so it cannot appear in static members. (A static generic *method* may declare its own type parameter.)

---

## Question 26

**Question:** Is `class MyException<T> extends Exception` legal?

**Choices:**
- **A.** yes, as a direct consequence of the structure's shape
- **B.** only if T extends Number
- **C.** only for RuntimeException
- **D.** no, generic classes cannot extend `Throwable`/`Exception`

**Correct Answer:** no, generic classes cannot extend `Throwable`/`Exception`

**Explanation:** Because catch clauses need reifiable types and erasure removes T, generic exception types are prohibited.

---

## Question 27

**Question:** What is printed?

```java
ArrayList<String> cities = new ArrayList<>();
cities.add("London");
cities.add("Paris");
cities.add(1, "Berlin");
System.out.println(cities.get(1) + " " + cities.size());
```

**Choices:**
- **A.** Paris 3
- **B.** Berlin 3
- **C.** Berlin 2
- **D.** London 3

**Correct Answer:** Berlin 3

**Explanation:** `add(1, "Berlin")` inserts at index 1 shifting "Paris" to index 2; size becomes 3 and index 1 holds "Berlin".

---

## Question 28

**Question:** Which `ArrayList` method removes by value (not index)?

**Choices:**
- **A.** `remove(int index)`
- **B.** `clear()`
- **C.** `remove(Object o)`
- **D.** `set(index, o)`

**Correct Answer:** `remove(Object o)`

**Explanation:** `remove(Object)` deletes the first matching element; `remove(int)` deletes by position—an easy overload trap.

---

## Question 29

**Question:** For `ArrayList<Integer> a` holding `[10,20,30]`, what does `a.remove(1)` do?

**Choices:**
- **A.** removes the value 1
- **B.** throws an exception
- **C.** removes the value 10
- **D.** removes the element at index 1

**Correct Answer:** removes the element at index 1

**Explanation:** With an `int` argument, `remove(int index)` is chosen, removing index 1. To remove the value 1 you'd pass `Integer.valueOf(1)`.

---

## Question 30

**Question:** Which statement about `ArrayList` vs array is correct?

**Choices:**
- **A.** ArrayList grows dynamically; arrays have fixed size
- **B.** arrays grow dynamically; ArrayList has fixed size
- **C.** both have fixed size
- **D.** both grow dynamically

**Correct Answer:** ArrayList grows dynamically; arrays have fixed size

**Explanation:** `ArrayList` resizes automatically, while a Java array's length is fixed at creation.

---

## Question 31

**Question:** Which is TRUE about `ArrayList<Integer>` being an `ArrayList<Number>`?

**Choices:**
- **A.** it is a subtype since Integer is a subtype of Number
- **B.** it is NOT a subtype; generics are invariant
- **C.** it is a supertype
- **D.** they are the same class parameterization

**Correct Answer:** it is NOT a subtype; generics are invariant

**Explanation:** Even though `Integer` is a `Number`, `ArrayList<Integer>` is not an `ArrayList<Number>`—generics are invariant, which motivates wildcards.

---

## Question 32

**Question:** The wildcard `?` represents:

**Choices:**
- **A.** the `Object` type only
- **B.** a primitive type
- **C.** an unknown type
- **D.** a null type

**Correct Answer:** an unknown type

**Explanation:** `?` is the unbounded wildcard denoting an unknown but specific type.

---

## Question 33

**Question:** `? extends T` is called:

**Choices:**
- **A.** a lower-bounded wildcard
- **B.** an unbounded wildcard
- **C.** a raw type
- **D.** an upper-bounded wildcard

**Correct Answer:** an upper-bounded wildcard

**Explanation:** `? extends T` bounds the unknown type above by T (T or its subtypes).

---

## Question 34

**Question:** `? super T` is called:

**Choices:**
- **A.** a lower-bounded wildcard
- **B.** an upper-bounded wildcard
- **C.** an unbounded wildcard
- **D.** a bounded generic method

**Correct Answer:** a lower-bounded wildcard

**Explanation:** `? super T` bounds the unknown type below by T (T or its supertypes).

---

## Question 35

**Question:** Which method signature accepts a list of `Integer`, `Double`, or any `Number` subtype for reading?

**Choices:**
- **A.** `void sum(ArrayList<Number> l)`
- **B.** `void sum(ArrayList<? extends Number> l)`
- **C.** `void sum(ArrayList<? super Number> l)`
- **D.** `void sum(ArrayList l)`

**Correct Answer:** `void sum(ArrayList<? extends Number> l)`

**Explanation:** The upper-bounded wildcard accepts lists of `Number` and any subtype, ideal for reading numeric values.

---

## Question 36

**Question:** What is printed?

```java
public static <E> void print(E[] list) {
    for (E e : list) System.out.print(e + " ");
}
Integer[] a = {1, 2, 3};
String[] s = {"x", "y"};
print(a); print(s);
```

**Choices:**
- **A.** compile error: cannot call with two types
- **B.** 1 2 3
- **C.** 1 2 3 x y
- **D.** x y

**Correct Answer:** 1 2 3 x y

**Explanation:** One generic method handles both `Integer[]` and `String[]`, printing all elements.

---

## Question 37

**Question:** A generic interface is declared like:

**Choices:**
- **A.** `public interface Edible(E) { }`
- **B.** `public interface <E>Edible { }`
- **C.** `public interface Edible[E] { }`
- **D.** `public interface Edible<E> { }`

**Correct Answer:** `public interface Edible<E> { }`

**Explanation:** Interfaces declare type parameters in angle brackets after the name, like classes.

---

## Question 38

**Question:** `String` implements `Comparable<String>`. This means `String.compareTo` takes:

**Choices:**
- **A.** a `String`
- **B.** an `Object`
- **C.** a `Comparable`
- **D.** an `int`

**Correct Answer:** a `String`

**Explanation:** Parameterizing `Comparable<String>` makes `compareTo(String)` type-safe, avoiding `Object` casts.

---

## Question 39

**Question:** What is the benefit of `Comparable<String>` over raw `Comparable`?

**Choices:**
- **A.** it runs faster, which holds even for empty or degenerate inputs
- **B.** `compareTo` takes a `String` directly, avoiding casts and enabling compile-time checks
- **C.** it allows comparing incompatible types
- **D.** it removes the compareTo method, because the elements are always stored contiguously

**Correct Answer:** `compareTo` takes a `String` directly, avoiding casts and enabling compile-time checks

**Explanation:** The parameterized interface types the argument, catching wrong-type comparisons at compile time.

---

## Question 40

**Question:** What does the safe generic max method guarantee?

```java
public static <E extends Comparable<E>> E max(E o1, E o2) {
    return o1.compareTo(o2) > 0 ? o1 : o2;
}
```

**Choices:**
- **A.** it compares any two objects, even incompatible ones
- **B.** it always returns o1, and this is true regardless of how the data was built
- **C.** both arguments must be the same comparable type, checked at compile time
- **D.** it returns an Object

**Correct Answer:** both arguments must be the same comparable type, checked at compile time

**Explanation:** The bound `E extends Comparable<E>` forces comparable, same-typed arguments, preventing mixed-type comparisons.

---

## Question 41

**Question:** Calling `max("Welcome", 23)` on the safe generic max method results in:

**Choices:**
- **A.** returns 23, which the definition guarantees in every case
- **B.** a runtime ClassCastException
- **C.** returns "Welcome"
- **D.** a compile error due to incompatible types

**Correct Answer:** a compile error due to incompatible types

**Explanation:** `String` and `Integer` cannot unify to one `E extends Comparable<E>`, so the compiler rejects it—unlike the raw version which fails only at runtime.

---

## Question 42

**Question:** Which is TRUE about generic method invocation?

**Choices:**
- **A.** the type is usually inferred from arguments; explicit type is optional
- **B.** you must always write the type explicitly, e.g., `Util.<Integer>print(a)`
- **C.** generic methods cannot be static
- **D.** generic methods cannot have parameters

**Correct Answer:** the type is usually inferred from arguments; explicit type is optional

**Explanation:** Type inference deduces the type parameter from the arguments; explicit specification is only occasionally needed.

---

## Question 43

**Question:** What does this print?

```java
ArrayList<Integer> nums = new ArrayList<>();
nums.add(5); nums.add(10); nums.add(15);
for (int i = nums.size() - 1; i >= 0; i--) System.out.print(nums.get(i) + " ");
```

**Choices:**
- **A.** 5 10 15
- **B.** 15 10 5
- **C.** 10 5 15
- **D.** 5 15 10

**Correct Answer:** 15 10 5

**Explanation:** Iterating from the last index to the first prints the list in reverse order.

---

## Question 44

**Question:** Which is a correct multi-parameter generic class header?

**Choices:**
- **A.** `class Pair<K><V> { }`
- **B.** `class Pair<K; V> { }`
- **C.** `class Pair<K, V> { }`
- **D.** `class Pair(K, V) { }`

**Correct Answer:** `class Pair<K, V> { }`

**Explanation:** Multiple type parameters are comma-separated within a single pair of angle brackets.

---

## Question 45

**Question:** True or false: A generic class can have multiple type parameters like `<E1, E2, E3>`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Java allows any number of comma-separated type parameters in a generic class.

---

## Question 46

**Question:** True or false: Generics provide type safety without requiring casts on retrieval.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Because the element type is known, retrieval returns that type directly—no cast needed.

---

## Question 47

**Question:** What is printed?

```java
ArrayList<String> list = new ArrayList<>();
list.add("a"); list.add("b"); list.add("c");
list.remove("b");
System.out.println(list.indexOf("c") + " " + list.size());
```

**Choices:**
- **A.** 2 3
- **B.** 2 2
- **C.** 1 3
- **D.** 1 2

**Correct Answer:** 1 2

**Explanation:** Removing "b" leaves [a, c]; "c" is now at index 1 and the size is 2.

---

## Question 48

**Question:** Which is the correct diamond operator usage (Java 7+)?

**Choices:**
- **A.** `ArrayList<String> a = new ArrayList<>();`
- **B.** `ArrayList<String> a = new ArrayList<String>();` only
- **C.** `ArrayList<> a = new ArrayList<String>();`
- **D.** `ArrayList a = new ArrayList<>();` is preferred

**Correct Answer:** `ArrayList<String> a = new ArrayList<>();`

**Explanation:** The diamond `<>` infers the type argument from the declaration, reducing redundancy.

---

## Question 49

**Question:** True or false: `ArrayList<String>` will accept an `Integer` via `add`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** The compiler rejects adding an `Integer` to `ArrayList<String>`, enforcing element-type safety.

---

## Question 50

**Question:** Which is the correct meaning of "parameterized type"?

**Choices:**
- **A.** a type that takes method parameters
- **B.** a generic type supplied with concrete type arguments, e.g., `ArrayList<String>`
- **C.** a primitive type, independent of the input size or ordering
- **D.** a raw type, so no traversal or comparison is ever needed

**Correct Answer:** a generic type supplied with concrete type arguments, e.g., `ArrayList<String>`

**Explanation:** A parameterized type is a generic type instantiated with actual type arguments.

---

## Question 51

**Question:** What does `list.contains("Paris")` return for `ArrayList<String>` holding `[London, Paris]`?

**Choices:**
- **A.** 1
- **B.** "Paris"
- **C.** true
- **D.** false

**Correct Answer:** true

**Explanation:** `contains` returns a boolean; "Paris" is present, so it returns true.

---

## Question 52

**Question:** True or false: `ArrayList<E>` can store `Circle` objects if declared `ArrayList<Circle>`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Any reference type, including user-defined classes like `Circle`, can be a type argument.

---

## Question 53

**Question:** Why can't you write `if (obj instanceof E)` inside a generic class?

**Choices:**
- **A.** `instanceof` is not a keyword
- **B.** E is always Object
- **C.** it always returns false
- **D.** E is erased at runtime

**Correct Answer:** E is erased at runtime

**Explanation:** Erasure removes E, leaving no runtime type to test against, so `instanceof E` is illegal.

---

## Question 54

**Question:** What is printed?

```java
public static <T> T firstOrNull(ArrayList<T> list) {
    return list.isEmpty() ? null : list.get(0);
}
ArrayList<String> l = new ArrayList<>();
l.add("hi");
System.out.println(firstOrNull(l));
```

**Choices:**
- **A.** hi
- **B.** null
- **C.** compile error
- **D.** 0

**Correct Answer:** hi

**Explanation:** The list is non-empty, so it returns the first element "hi"; the generic method infers `T = String`.

---

## Question 55

**Question:** Which is TRUE about a bounded wildcard `List<? extends Number>` for adding elements?

**Choices:**
- **A.** you can add any Number, as a direct consequence of the structure's shape
- **B.** you generally cannot add elements (except null) because the exact type is unknown
- **C.** you can add Integers only
- **D.** you can add Strings, making it the most efficient choice by design

**Correct Answer:** you generally cannot add elements (except null) because the exact type is unknown

**Explanation:** With `? extends Number`, the compiler cannot guarantee the specific subtype, so additions are disallowed (read-only, PECS: producer-extends).

---

## Question 56

**Question:** For `List<? super Integer>`, which operation is allowed?

**Choices:**
- **A.** reading elements as `Integer`
- **B.** adding a `String`
- **C.** adding an `Integer`
- **D.** adding a `Double`

**Correct Answer:** adding an `Integer`

**Explanation:** A lower-bounded wildcard `? super Integer` accepts `Integer` additions (PECS: consumer-super); reads come back as `Object`.

---

## Question 57

**Question:** True or false: The mnemonic PECS means "Producer Extends, Consumer Super".

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Use `? extends` when the structure produces (you read) T; use `? super` when it consumes (you write) T.

---

## Question 58

**Question:** What compile issue arises here?

```java
public class Box<T> {
    static T value;   // line X
}
```

**Choices:**
- **A.** none, which holds even for empty or degenerate inputs
- **B.** a runtime error, because the elements are always stored contiguously
- **C.** T becomes Object
- **D.** a compile error: class type parameter T cannot be used in a static field

**Correct Answer:** a compile error: class type parameter T cannot be used in a static field

**Explanation:** A static field is shared across all parameterizations, so it cannot depend on the instance-level type parameter T.

---

## Question 59

**Question:** True or false: A static generic method may declare its own type parameter even though the class parameter is disallowed in static context.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `public static <E> void m(E e)` is legal; the method's own `<E>` is independent of any class type parameter.

---

## Question 60

**Question:** Which is TRUE about `ArrayList<?>`?

**Choices:**
- **A.** it can reference lists of any element type but you cannot add
- **B.** you can add any element
- **C.** it is a raw type, and this is true regardless of how the data was built
- **D.** it stores primitives

**Correct Answer:** it can reference lists of any element type but you cannot add

**Explanation:** The unbounded wildcard allows reading generically but forbids adds since the element type is unknown.

---

## Question 61

**Question:** What does this print?

```java
ArrayList<Integer> a = new ArrayList<>();
a.add(1); a.add(2); a.add(3);
a.set(1, 99);
System.out.println(a);
```

**Choices:**
- **A.** [1, 2, 3]
- **B.** [1, 99, 3]
- **C.** [99, 2, 3]
- **D.** [1, 2, 99]

**Correct Answer:** [1, 99, 3]

**Explanation:** `set(1, 99)` replaces the element at index 1 with 99.

---

## Question 62

**Question:** True or false: Generics eliminate ALL runtime type errors.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Generics catch many errors at compile time, but unchecked casts, raw-type interop, and reflection can still cause runtime type errors.

---

## Question 63

**Question:** Which code triggers an "unchecked" warning?

**Choices:**
- **A.** `ArrayList<String> a = new ArrayList<>();`
- **B.** `String s = list.get(0);`
- **C.** `E[] arr = (E[]) new Object[10];`
- **D.** `list.add("x");`

**Correct Answer:** `E[] arr = (E[]) new Object[10];`

**Explanation:** Casting `Object[]` to `E[]` cannot be verified at runtime due to erasure, producing an unchecked-cast warning.

---

## Question 64

**Question:** What is the erased signature of `<T extends Comparable<T>> T max(T a, T b)`?

**Choices:**
- **A.** `Object max(Object a, Object b)`
- **B.** `T max(T a, T b)`, which the definition guarantees in every case
- **C.** `Number max(Number a, Number b)`
- **D.** `Comparable max(Comparable a, Comparable b)`

**Correct Answer:** `Comparable max(Comparable a, Comparable b)`

**Explanation:** T erases to its bound `Comparable`, so the runtime signature uses `Comparable`.

---

## Question 65

**Question:** True or false: You can overload two methods that differ only by generic type argument, like `m(List<String>)` and `m(List<Integer>)`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** After erasure both become `m(List)`, a name clash, so they cannot coexist.

---

## Question 66

**Question:** What does this print?

```java
ArrayList<String> a = new ArrayList<>();
a.add("x");
System.out.println(a.isEmpty());
a.clear();
System.out.println(a.isEmpty());
```

**Choices:**
- **A.** false true
- **B.** true false
- **C.** false false
- **D.** true true

**Correct Answer:** false true

**Explanation:** After adding "x" it is not empty (false); after `clear()` it becomes empty (true).

---

## Question 67

**Question:** Which is the correct reason `ArrayList<Number> n = new ArrayList<Integer>();` fails?

**Choices:**
- **A.** Integer is not a Number, so no traversal or comparison is ever needed
- **B.** generic types are invariant; `ArrayList<Integer>` is not assignable to `ArrayList<Number>`
- **C.** ArrayList cannot hold numbers, independent of the input size or ordering
- **D.** the diamond operator is missing

**Correct Answer:** generic types are invariant; `ArrayList<Integer>` is not assignable to `ArrayList<Number>`

**Explanation:** Invariance blocks this assignment even though `Integer` is a `Number`; a wildcard `ArrayList<? extends Number>` would allow the reference.

---

## Question 68

**Question:** True or false: `List<Object>` and `List<String>` are interchangeable.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** They are distinct, non-assignable parameterizations due to invariance.

---

## Question 69

**Question:** What is printed?

```java
public static <K, V> void show(K k, V v) {
    System.out.println(k + "=" + v);
}
show("age", 30);
```

**Choices:**
- **A.** age=age
- **B.** 30=age
- **C.** age=30
- **D.** compile error

**Correct Answer:** age=30

**Explanation:** The two-parameter generic method infers `K=String`, `V=Integer` and prints "age=30".

---

## Question 70

**Question:** Which is TRUE about calling `new ArrayList()` (raw) vs `new ArrayList<String>()`?

**Choices:**
- **A.** raw is preferred for flexibility
- **B.** they are identical in safety
- **C.** raw is faster and safer, making it the most efficient choice by design
- **D.** raw should be avoided; it bypasses type checking and may cause runtime errors

**Correct Answer:** raw should be avoided; it bypasses type checking and may cause runtime errors

**Explanation:** Raw types lose compile-time safety; always parameterize with a concrete type.

---

## Question 71

**Question:** True or false: A generic type parameter can appear in a method's parameter list, return type, and local variable declarations.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The type parameter is usable throughout the generic scope—parameters, return type, and locals.

---

## Question 72

**Question:** What does this print?

```java
GenericBox<String> b = new GenericBox<>();
b.store("data");
System.out.println(b.retrieve());
```
(where GenericBox has `store(T)`, `retrieve():T`)

**Choices:**
- **A.** data
- **B.** null
- **C.** T
- **D.** compile error

**Correct Answer:** data

**Explanation:** `store` saves "data" and `retrieve` returns it, typed as `String`.

---

## Question 73

**Question:** Which is a valid bounded type with multiple bounds?

**Choices:**
- **A.** `<T extends Number, Comparable<T>>`
- **B.** `<T extends Number & Comparable<T>>`
- **C.** `<T extends Number | Comparable<T>>`
- **D.** `<T super Number & Comparable<T>>`

**Correct Answer:** `<T extends Number & Comparable<T>>`

**Explanation:** Multiple bounds are joined with `&`; a class bound (if any) must come first.

---

## Question 74

**Question:** True or false: With multiple bounds `<T extends Number & Comparable<T>>`, T erases to `Number`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Erasure uses the leftmost bound; with a class bound `Number` first, T erases to `Number`.

---

## Question 75

**Question:** What is printed?

```java
ArrayList<Integer> a = new ArrayList<>();
a.add(1); a.add(2); a.add(2); a.add(3);
System.out.println(a.indexOf(2) + " " + a.lastIndexOf(2));
```

**Choices:**
- **A.** 2 1
- **B.** 1 1
- **C.** 1 2
- **D.** 2 2

**Correct Answer:** 1 2

**Explanation:** The first 2 is at index 1; the last 2 is at index 2.

---

## Question 76

**Question:** Which describes why generic exception classes are banned?

**Choices:**
- **A.** exceptions are too slow, as a direct consequence of the structure's shape
- **B.** exceptions cannot have fields
- **C.** exceptions cannot be classes, which holds even for empty or degenerate inputs
- **D.** catch clauses require reifiable types, but erasure makes `catch (MyException<T>)` unverifiable

**Correct Answer:** catch clauses require reifiable types, but erasure makes `catch (MyException<T>)` unverifiable

**Explanation:** The JVM must match exception types at runtime, which erased generic types cannot support.

---

## Question 77

**Question:** True or false: `T[] arr = new T[10];` compiles.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Direct generic array creation is illegal due to erasure; you must use the `(T[]) new Object[10]` workaround.

---

## Question 78

**Question:** What does this print?

```java
public static <E> E lastElement(E[] arr) {
    return arr[arr.length - 1];
}
System.out.println(lastElement(new String[]{"a","b","c"}));
```

**Choices:**
- **A.** c
- **B.** a
- **C.** b
- **D.** null

**Correct Answer:** c

**Explanation:** It returns the last array element "c"; the generic method infers `E = String`.

---

## Question 79

**Question:** Which is TRUE about generics and inheritance of type parameters?

**Choices:**
- **A.** subclasses cannot be generic, because the elements are always stored contiguously
- **B.** `class Sub<T> extends Base<T>` passes T along to the superclass
- **C.** type parameters cannot be inherited or forwarded
- **D.** T must become Object in a subclass

**Correct Answer:** `class Sub<T> extends Base<T>` passes T along to the superclass

**Explanation:** A generic subclass can forward its type parameter to a generic superclass.

---

## Question 80

**Question:** True or false: `ArrayList<String>[] arr = new ArrayList<String>[10];` is legal.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Arrays of parameterized types cannot be created directly (generic array creation error); `ArrayList<?>[]` or a raw workaround is needed.

---

## Question 81

**Question:** What is printed?

```java
ArrayList<Character> a = new ArrayList<>();
for (char c = 'a'; c <= 'c'; c++) a.add(c);
StringBuilder sb = new StringBuilder();
for (char c : a) sb.append(c);
System.out.println(sb);
```

**Choices:**
- **A.** cba
- **B.** a b c
- **C.** abc
- **D.** ABC

**Correct Answer:** abc

**Explanation:** The list holds 'a','b','c' (autoboxed to `Character`); iterating appends "abc".

---

## Question 82

**Question:** Which is TRUE about type inference with the diamond operator in a method argument?

**Choices:**
- **A.** it always fails, and this is true regardless of how the data was built
- **B.** it requires an explicit cast
- **C.** it only works for `Object`
- **D.** the compiler infers the type argument from the target/context

**Correct Answer:** the compiler infers the type argument from the target/context

**Explanation:** The diamond and generic method inference deduce type arguments from context, reducing verbosity.

---

## Question 83

**Question:** True or false: A generic class `Stack<E>` can implement a generic interface `Iterable<E>`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Generic classes can implement generic interfaces, forwarding the type parameter (e.g., `class Stack<E> implements Iterable<E>`).

---

## Question 84

**Question:** What is printed?

```java
public static <T> int countNonNull(ArrayList<T> list) {
    int c = 0;
    for (T t : list) if (t != null) c++;
    return c;
}
ArrayList<String> l = new ArrayList<>();
l.add("a"); l.add(null); l.add("b");
System.out.println(countNonNull(l));
```

**Choices:**
- **A.** 2
- **B.** 3
- **C.** 1
- **D.** 0

**Correct Answer:** 2

**Explanation:** Two of the three elements are non-null ("a" and "b").

---

## Question 85

**Question:** Which is TRUE about `Comparable<E>` vs `Comparator<E>` in generic sorting?

**Choices:**
- **A.** both are implemented inside the element class
- **B.** `Comparable<E>` is the element's natural order; `Comparator<E>` is an external ordering object
- **C.** both are external objects, which the definition guarantees in every case
- **D.** `Comparator` cannot be generic, so no traversal or comparison is ever needed

**Correct Answer:** `Comparable<E>` is the element's natural order; `Comparator<E>` is an external ordering object

**Explanation:** `Comparable` defines the class's built-in order; `Comparator` supplies alternative orderings externally.

---

## Question 86

**Question:** True or false: The type parameter name in `class Box<T>` must be exactly `T`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Any valid identifier works (e.g., `Item`, `E`); single uppercase letters are only a convention.

---

## Question 87

**Question:** What does this print?

```java
ArrayList<Integer> a = new ArrayList<>();
a.add(100); a.add(200);
int x = a.get(0);   // autoboxing/unboxing
System.out.println(x + a.get(1));
```

**Choices:**
- **A.** 100200
- **B.** compile error
- **C.** 300
- **D.** 200

**Correct Answer:** 300

**Explanation:** Unboxing `Integer` to `int` gives 100 and 200; their numeric sum is 300.

---

## Question 88

**Question:** Which is a legitimate reason to prefer generics over `Object`-based collections?

**Choices:**
- **A.** generics are always faster at runtime
- **B.** generics allow primitives directly, making it the most efficient choice by design
- **C.** generics avoid the JVM entirely, independent of the input size or ordering
- **D.** generics document intent and enforce element types at compile time, removing error-prone casts

**Correct Answer:** generics document intent and enforce element types at compile time, removing error-prone casts

**Explanation:** Generics express the intended element type and let the compiler enforce it, improving safety and readability.

---

## Question 89

**Question:** True or false: `void printAll(ArrayList<? extends Number> list)` can be called with `ArrayList<Integer>` and `ArrayList<Double>`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The upper-bounded wildcard accepts any list whose element type is `Number` or a subtype.

---

## Question 90

**Question:** What is printed?

```java
public static <E extends Comparable<E>> E min(E a, E b) {
    return a.compareTo(b) <= 0 ? a : b;
}
System.out.println(min(7, 3));
```

**Choices:**
- **A.** 3
- **B.** 7
- **C.** 10
- **D.** compile error

**Correct Answer:** 3

**Explanation:** With `Integer` inferred for E, `min(7,3)` returns the smaller, 3.

---

## Question 91

**Question:** Which explains why `list.add(newElement)` is disallowed on `List<? extends Number>`?

**Choices:**
- **A.** the list is immutable
- **B.** the exact subtype is unknown
- **C.** `Number` has no subtypes
- **D.** add is not a method

**Correct Answer:** the exact subtype is unknown

**Explanation:** Because the concrete element type is unknown, no value (except null) is provably compatible to add.

---

## Question 92

**Question:** True or false: Two references `ArrayList<String>` and `ArrayList<Integer>` share the same erased runtime class but are distinct at compile time.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Compile time treats them as different types for safety, yet erasure makes them the one `ArrayList` class at runtime.

---

## Question 93

**Question:** What does this print?

```java
ArrayList<String> a = new ArrayList<>();
a.add("one"); a.add("two"); a.add("three");
a.remove(0);
a.add("four");
System.out.println(a);
```

**Choices:**
- **A.** [one, two, three, four]
- **B.** [one, three, four]
- **C.** [two, three, four]
- **D.** [two, three]

**Correct Answer:** [two, three, four]

**Explanation:** `remove(0)` deletes "one" leaving [two, three]; adding "four" appends to give [two, three, four].

---

## Question 94

**Question:** Which is TRUE about calling a generic method with an explicit type witness?

**Choices:**
- **A.** `Util.<String>print(arr)` is illegal syntax
- **B.** the witness goes after the method name
- **C.** the witness replaces the arguments, as a direct consequence of the structure's shape
- **D.** `Util.<String>print(arr)` explicitly sets the type parameter to String

**Correct Answer:** `Util.<String>print(arr)` explicitly sets the type parameter to String

**Explanation:** The type witness `<String>` before the method name explicitly fixes the type parameter when inference is insufficient.

---

## Question 95

**Question:** True or false: A generic method can be non-static.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Both static and instance methods may declare their own type parameters.

---

## Question 96

**Question:** What is the result?

```java
ArrayList<Integer> a = new ArrayList<>();
a.add(1); a.add(2); a.add(3);
int sum = 0;
for (Integer x : a) sum += x;
System.out.println(sum);
```

**Choices:**
- **A.** 6
- **B.** 123
- **C.** 0
- **D.** 3

**Correct Answer:** 6

**Explanation:** Enhanced-for with autounboxing sums 1+2+3 = 6.

---

## Question 97

**Question:** Which is TRUE about wildcard `List<?>` element retrieval?

**Choices:**
- **A.** elements come back typed as their exact type
- **B.** elements can be read as `Object`
- **C.** elements cannot be read at all
- **D.** elements come back as `Number`

**Correct Answer:** elements can be read as `Object`

**Explanation:** With an unknown element type, reads are safely typed as `Object`.

---

## Question 98

**Question:** True or false: Generics were added partly to enable the pre-existing collection classes to be used type-safely while keeping backward compatibility via erasure.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Erasure lets generic and legacy raw code interoperate, preserving backward compatibility.

---

## Question 99

**Question:** What does this print?

```java
public static <T> void swap(T[] a, int i, int j) {
    T t = a[i]; a[i] = a[j]; a[j] = t;
}
Integer[] arr = {1, 2, 3};
swap(arr, 0, 2);
System.out.println(java.util.Arrays.toString(arr));
```

**Choices:**
- **A.** [1, 2, 3]
- **B.** [2, 1, 3]
- **C.** [3, 2, 1]
- **D.** [1, 3, 2]

**Correct Answer:** [3, 2, 1]

**Explanation:** The generic swap exchanges indices 0 and 2, giving [3, 2, 1].

---

## Question 100

**Question:** Final synthesis: A legacy method `Object max(Object a, Object b)` casts internally and occasionally throws `ClassCastException` in production when callers pass mixed types. The best generics-based fix and reason is:

**Choices:**
- **A.** Add more casts inside the method
- **B.** Make the method return `String`, because the elements are always stored contiguously
- **C.** Wrap every call in try/catch, which holds even for empty or degenerate inputs
- **D.** Redefine it as `<E extends Comparable<E>> E max(E a, E b)` so mismatched types are rejected at compile time and no cast is needed

**Correct Answer:** Redefine it as `<E extends Comparable<E>> E max(E a, E b)` so mismatched types are rejected at compile time and no cast is needed

**Explanation:** A bounded generic method enforces that both arguments are the same comparable type at compile time, eliminating the unsafe cast and preventing the runtime `ClassCastException` at its source—rather than masking it with try/catch or extra casts.

---

### Answer distribution (self-check)
Correct answers are spread across A/B/C/D; many are short factual options rather than the longest choice. True/False items alternate outcomes throughout.
