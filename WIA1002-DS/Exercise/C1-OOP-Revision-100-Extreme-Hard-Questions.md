# Chapter 1 OOP Revision: 100 Extreme-Hard Questions

> Topics: objects & classes, thinking in objects, UML, constructors, references, encapsulation, inheritance, polymorphism, abstract classes, interfaces. Mix of theory traps and code tracing. Choose the single best answer.

---

## Question 1

**Question:** A class declares `double radius = 1.0;` as an instance field and provides no constructor. What is the value of `radius` immediately after `new Circle()` executes?

**Choices:**
- **A.** 0.0
- **B.** Compilation fails because no constructor is defined
- **C.** 1.0
- **D.** undefined until a setter is called

**Correct Answer:** 1.0

**Explanation:** The field initializer runs during object construction even when only the implicit default constructor exists. The default constructor does not overwrite explicit initializers.

---

## Question 2

**Question:** Which statement about `Circle myCircle;` (with no assignment) is correct?

**Choices:**
- **A.** It creates a `Circle` object with default field values
- **B.** It is illegal without calling `new`
- **C.** It reserves memory for a full `Circle` object on the stack
- **D.** It declares a reference that currently points to no object

**Correct Answer:** It declares a reference that currently points to no object

**Explanation:** Declaring a reference variable only creates a variable capable of holding a reference; no object exists until `new` runs. The reference holds `null` for instance fields.

---

## Question 3

**Question:** In a UML class diagram, the constructor `Circle(newRadius: double)` and the method `getArea(): double` differ in that:

**Choices:**
- **A.** The method lists no return type while the constructor lists `double`
- **B.** Both must list `void` as return type
- **C.** The constructor lists no return type while the method lists `double`
- **D.** Constructors cannot appear in UML at all

**Correct Answer:** The constructor lists no return type while the method lists `double`

**Explanation:** UML follows Java: constructors have no return type shown, whereas ordinary methods display their return type after the colon.

---

## Question 4

**Question:** Consider two references: `Circle a = new Circle(5); Circle b = a;` then `b.setRadius(9);`. What does `a.getRadius()` return?

**Choices:**
- **A.** 5
- **B.** 0
- **C.** Compilation error
- **D.** 9

**Correct Answer:** 9

**Explanation:** `b = a` copies the reference, not the object. Both variables point to the same object, so a mutation through `b` is visible through `a`.

---

## Question 5

**Question:** True or false: An abstract class in Java must contain at least one abstract method.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** A class can be declared `abstract` with no abstract methods. Doing so simply prevents direct instantiation while allowing concrete methods.

---

## Question 6

**Question:** Which is the most accurate distinction between a class and an object?

**Choices:**
- **A.** A class is an instance of an object, which the definition guarantees in every case
- **B.** They are interchangeable terms in Java
- **C.** A class is a blueprint; an object is an instance created from it
- **D.** An object is a blueprint; a class is a runtime copy

**Correct Answer:** A class is a blueprint; an object is an instance created from it

**Explanation:** The class defines the structure and behavior; each object is a concrete instantiation with its own state.

---

## Question 7

**Question:** Given `private double radius;` with a public getter/setter, why is making the field private considered good design?

**Choices:**
- **A.** Private fields run faster at execution time
- **B.** It hides the field so subclasses can never inherit behavior
- **C.** Private fields are automatically thread-safe
- **D.** It enforces access through methods

**Correct Answer:** It enforces access through methods

**Explanation:** Encapsulation controls how state is read and written, so invariants can be validated in the setter and the internal representation can change without breaking callers.

---

## Question 8

**Question:** A subclass reference is assigned an object: `GeometricObject g = new Circle(3);`. Calling `g.getArea()` (where `getArea` is abstract in `GeometricObject` and overridden in `Circle`) invokes:

**Choices:**
- **A.** The `Circle` version because dynamic binding uses the actual object type
- **B.** The `GeometricObject` version because `g` is declared as `GeometricObject`
- **C.** Neither; the call is ambiguous
- **D.** A compile error because `g` cannot hold a `Circle`

**Correct Answer:** The `Circle` version because dynamic binding uses the actual object type

**Explanation:** Method calls on instance methods are dynamically bound to the runtime type of the object, not the declared type of the reference.

---

## Question 9

**Question:** Which line fails to compile?

```java
abstract class Shape { abstract double area(); }
```
```java
Shape s = new Shape();      // Line 1
Shape t = new Circle(2);    // Line 2, Circle extends Shape
```

**Choices:**
- **A.** Line 2
- **B.** Both lines
- **C.** Line 1
- **D.** Neither line

**Correct Answer:** Line 1

**Explanation:** Abstract classes cannot be instantiated with `new`. Line 2 is legal because a superclass reference may point to a concrete subclass object.

---

## Question 10

**Question:** In Java, a class may:

**Choices:**
- **A.** Extend multiple classes and implement one interface
- **B.** Extend multiple classes and implement multiple interfaces
- **C.** Only implement interfaces, never extend a class
- **D.** Extend one class and implement multiple interfaces

**Correct Answer:** Extend one class and implement multiple interfaces

**Explanation:** Java allows single inheritance of classes but multiple interface implementation, which is why interfaces are used to achieve multiple-supertype behavior.

---

## Question 11

**Question:** Given `interface Edible { String howToEat(); }` and `class Fruit implements Edible`, what must `Fruit` provide to compile as a concrete class?

**Choices:**
- **A.** A concrete implementation of `howToEat()`
- **B.** A field named `howToEat`
- **C.** A constructor that calls `howToEat()`
- **D.** Nothing; interface methods are optional

**Correct Answer:** A concrete implementation of `howToEat()`

**Explanation:** A concrete class implementing an interface must define all abstract interface methods, or it must itself be declared abstract.

---

## Question 12

**Question:** What is printed?

```java
Circle c2 = new Circle(25);
System.out.println(c2.getArea());
// getArea returns radius * radius * Math.PI
```

**Choices:**
- **A.** 25.0, so no traversal or comparison is ever needed
- **B.** 78.539...
- **C.** 1963.4954... (625 × π)
- **D.** 157.079...

**Correct Answer:** 1963.4954... (625 × π)

**Explanation:** The overloaded constructor sets `radius = 25`, so the area is 25 × 25 × π = 625π ≈ 1963.5.

---

## Question 13

**Question:** Which best describes "state" and "behavior" for an object?

**Choices:**
- **A.** State is the methods; behavior is the fields
- **B.** Both refer only to constructors, independent of the input size or ordering
- **C.** State exists only for static members
- **D.** State is the field values; behavior is what the methods do

**Correct Answer:** State is the field values; behavior is what the methods do

**Explanation:** An object's state is the current values of its data fields, and its behavior is defined by the methods that operate on that state.

---

## Question 14

**Question:** A class defines both `Circle()` and `Circle(double r)`. This is an example of:

**Choices:**
- **A.** Constructor overloading
- **B.** Method overriding
- **C.** Dynamic dispatch
- **D.** Interface inheritance

**Correct Answer:** Constructor overloading

**Explanation:** Multiple constructors differing in parameter lists in the same class are overloaded, resolved at compile time by argument types.

---

## Question 15

**Question:** If a class defines only `Circle(double r)` and no no-arg constructor, which statement is true?

**Choices:**
- **A.** Java still provides an implicit no-arg constructor
- **B.** `new Circle(2.0)` will fail to compile
- **C.** `new Circle()` will fail to compile
- **D.** The class cannot be instantiated at all

**Correct Answer:** `new Circle()` will fail to compile

**Explanation:** Once any constructor is explicitly declared, the compiler no longer supplies the implicit no-arg constructor, so `new Circle()` has no matching constructor.

---

## Question 16

**Question:** Within a setter `public void setRadius(double radius)`, the statement `this.radius = radius;` is needed because:

**Choices:**
- **A.** `this` makes the assignment static
- **B.** Java forbids assigning to fields without `this`
- **C.** It converts the parameter to double
- **D.** The parameter shadows the field

**Correct Answer:** The parameter shadows the field

**Explanation:** The parameter and field share the name; `this.radius` refers to the instance field while `radius` alone refers to the parameter.

---

## Question 17

**Question:** Which of the following is NOT a benefit of polymorphism through a superclass reference?

**Choices:**
- **A.** The reference automatically gains subclass-specific methods for direct calls
- **B.** Code can treat many subclass types uniformly
- **C.** New subclasses can be added without changing existing calling code
- **D.** Collections can store mixed subclass objects under one type

**Correct Answer:** The reference automatically gains subclass-specific methods for direct calls

**Explanation:** A superclass-typed reference can only invoke members visible in the superclass type; subclass-only methods require a cast. The other options are genuine polymorphism benefits.

---

## Question 18

**Question:** True or false: Two references of the same class type always refer to two distinct objects.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Two references can alias the same object (e.g., after `b = a`), so identical-type references do not imply distinct objects.

---

## Question 19

**Question:** What does `==` compare when applied to two object reference variables?

**Choices:**
- **A.** The contents of the objects field by field
- **B.** The result of `equals()`
- **C.** Whether the references point to the same object
- **D.** The hash codes only

**Correct Answer:** Whether the references point to the same object

**Explanation:** For reference types, `==` tests reference identity, not logical equality. Field-by-field comparison requires an `equals` implementation.

---

## Question 20

**Question:** Consider:

```java
class A { void show() { System.out.println("A"); } }
class B extends A { void show() { System.out.println("B"); } }
A obj = new B();
obj.show();
```
Output?

**Choices:**
- **A.** A
- **B.** Compile error
- **C.** Prints nothing
- **D.** B

**Correct Answer:** B

**Explanation:** `show` is overridden; dynamic binding selects the method of the actual object type `B` at runtime.

---

## Question 21

**Question:** Which statement about interfaces (classic pre-default-method view taught here) is correct?

**Choices:**
- **A.** An interface specifies a contract of methods that implementers must provide
- **B.** An interface can be instantiated directly with `new`
- **C.** An interface can extend a concrete class, making it the most efficient choice by design
- **D.** A class can implement at most one interface

**Correct Answer:** An interface specifies a contract of methods that implementers must provide

**Explanation:** Interfaces declare behavior that implementing classes must supply. They cannot be instantiated and are implemented (possibly many at once), not extended from concrete classes.

---

## Question 22

**Question:** Given `Circle c1 = new Circle(); Circle c2 = new Circle();`, which is true about `c1 == c2`?

**Choices:**
- **A.** true, because both have the same field values
- **B.** Compile error
- **C.** false, because they are two separate objects
- **D.** true, because `Circle` has one constructor

**Correct Answer:** false, because they are two separate objects

**Explanation:** Each `new` creates a distinct object with its own identity, so the two references differ even if their states are equal.

---

## Question 23

**Question:** A `GeometricObject` declares `public abstract double getArea();`. Which is required?

**Choices:**
- **A.** `getArea` must have a body
- **B.** `GeometricObject` must implement an interface
- **C.** `getArea` must be `static`
- **D.** `GeometricObject` must be declared `abstract`

**Correct Answer:** `GeometricObject` must be declared `abstract`

**Explanation:** A class containing an abstract method must itself be abstract; abstract methods have no body and cannot be static.

---

## Question 24

**Question:** Which describes the relationship "a Circle IS-A GeometricObject"?

**Choices:**
- **A.** Inheritance
- **B.** Composition
- **C.** Aggregation
- **D.** Association only

**Correct Answer:** Inheritance

**Explanation:** An IS-A relationship is modeled with inheritance (`Circle extends GeometricObject`), whereas HAS-A relationships use composition/aggregation.

---

## Question 25

**Question:** In `public class NewClass extends BaseClass implements I1, I2 {}`, the order in the header must be:

**Choices:**
- **A.** `implements` before `extends`
- **B.** `extends` before `implements`
- **C.** Either order is allowed
- **D.** Both keywords are optional and interchangeable

**Correct Answer:** `extends` before `implements`

**Explanation:** Java syntax requires the `extends` clause to precede the `implements` clause in a class declaration.

---

## Question 26

**Question:** What is the output?

```java
class Counter {
    int count;
    Counter() { count++; }
}
Counter x = new Counter();
Counter y = new Counter();
System.out.println(x.count + y.count);
```

**Choices:**
- **A.** 0
- **B.** 1
- **C.** 2
- **D.** Compile error

**Correct Answer:** 2

**Explanation:** `count` is an instance field (default 0). Each constructor increments its own object's field to 1, so the sum is 2. It is not shared because it is not static.

---

## Question 27

**Question:** Change the field in Q26 to `static int count;`. What is the output now?

**Choices:**
- **A.** 0
- **B.** 1
- **C.** 2
- **D.** 4

**Correct Answer:** 4

**Explanation:** A static field is shared by all objects. Two constructions raise the single shared `count` to 2, and both `x.count` and `y.count` read that same shared 2, so the printed sum is 2 + 2 = 4.

---

## Question 28

**Question:** Which correctly reads a private field from outside the class?

**Choices:**
- **A.** Through a public accessor `obj.getRadius()`
- **B.** Direct field access `obj.radius`
- **C.** Using `new` on the field
- **D.** It is impossible by any means

**Correct Answer:** Through a public accessor `obj.getRadius()`

**Explanation:** Private fields are not directly accessible outside the class; a public getter exposes a controlled read path.

---

## Question 29

**Question:** True or false: A constructor can have a return type of `void` if it returns nothing.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Constructors never declare a return type, not even `void`. Adding `void` turns it into an ordinary method that merely shares the class name.

---

## Question 30

**Question:** Consider a method with signature `void set(int radius)` in a class that also has `void set(double radius)`. Calling `set(5)` invokes:

**Choices:**
- **A.** `set(double)` because 5 widens to double
- **B.** `set(int)` because the exact type matches
- **C.** Ambiguous; compile error
- **D.** Neither; runtime error

**Correct Answer:** `set(int)` because the exact type matches

**Explanation:** Overload resolution prefers the most specific exact match; the literal `5` is an `int`, so `set(int)` is chosen over the widening candidate.

---

## Question 31

**Question:** Which is a valid reason an abstract class can be more powerful than an interface (in the classic model taught)?

**Choices:**
- **A.** An abstract class supports multiple inheritance of implementation
- **B.** An abstract class can be instantiated directly
- **C.** An abstract class can provide concrete methods and instance fields with shared state
- **D.** An abstract class cannot have constructors, as a direct consequence of the structure's shape

**Correct Answer:** An abstract class can provide concrete methods and instance fields with shared state

**Explanation:** Abstract classes can hold state and concrete behavior for subclasses to inherit, which classic interfaces cannot. They still cannot be instantiated and can have constructors called via subclasses.

---

## Question 32

**Question:** What happens here?

```java
class Animal { Animal() { System.out.print("A"); } }
class Dog extends Animal { Dog() { System.out.print("D"); } }
new Dog();
```
Output?

**Choices:**
- **A.** D
- **B.** A
- **C.** DA
- **D.** AD

**Correct Answer:** AD

**Explanation:** A subclass constructor implicitly calls `super()` first, so the `Animal` constructor runs before the `Dog` constructor body.

---

## Question 33

**Question:** In `Chicken implements Edible` and `Fruit implements Edible`, treating both via `Edible[] items` demonstrates:

**Choices:**
- **A.** Polymorphism via a common interface type
- **B.** Encapsulation, which holds even for empty or degenerate inputs
- **C.** Constructor chaining
- **D.** Static binding of fields

**Correct Answer:** Polymorphism via a common interface type

**Explanation:** Storing different implementers under the shared interface type and invoking `howToEat()` on each is interface-based polymorphism.

---

## Question 34

**Question:** Which declaration correctly overrides `getArea` from an abstract superclass?

**Choices:**
- **A.** `public int getArea() { return 0; }`
- **B.** `public double getArea() { return r*r*Math.PI; }`
- **C.** `private double getArea() { return 0; }`
- **D.** `public double getarea() { return 0; }`

**Correct Answer:** `public double getArea() { return r*r*Math.PI; }`

**Explanation:** An override must match name, parameters, and compatible return type, and cannot reduce visibility. Changing return type to `int`, lowering access to `private`, or renaming to `getarea` all break the override.

---

## Question 35

**Question:** True or false: `this` can be used inside a static method to refer to the current object.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Static methods belong to the class, not an instance, so there is no `this` reference available inside them.

---

## Question 36

**Question:** A UML diagram shows `- radius: double`. The `-` sign indicates:

**Choices:**
- **A.** public visibility
- **B.** protected visibility
- **C.** private visibility
- **D.** static field

**Correct Answer:** private visibility

**Explanation:** In UML, `-` denotes private, `+` denotes public, and `#` denotes protected.

---

## Question 37

**Question:** What is the value of `s` after this runs?

```java
String s = null;
Circle c = new Circle();
if (c != null) s = "created";
```

**Choices:**
- **A.** null
- **B.** empty string
- **C.** NullPointerException
- **D.** "created"

**Correct Answer:** "created"

**Explanation:** `new Circle()` produces a non-null reference, so the condition is true and `s` is assigned `"created"`.

---

## Question 38

**Question:** Which statement about default field values is correct for instance fields not explicitly initialized?

**Choices:**
- **A.** `int` defaults to 0, `boolean` to false, references to null
- **B.** `int` defaults to 1, `boolean` to true, references to a new object
- **C.** All numeric types default to null
- **D.** Uninitialized fields cause a compile error

**Correct Answer:** `int` defaults to 0, `boolean` to false, references to null

**Explanation:** Instance fields receive type defaults: numeric 0, boolean false, and object references null. (Local variables, in contrast, must be assigned before use.)

---

## Question 39

**Question:** Given overloaded constructors calling each other, `this(1.0)` inside `Circle()` must be:

**Choices:**
- **A.** the last statement of the constructor
- **B.** the first statement of the constructor
- **C.** placed anywhere
- **D.** inside a loop

**Correct Answer:** the first statement of the constructor

**Explanation:** An explicit `this(...)` (or `super(...)`) call must be the first statement in a constructor body.

---

## Question 40

**Question:** Why can a `GeometricObject[]` array hold both `Circle` and `Rectangle` objects?

**Choices:**
- **A.** Because arrays ignore types, because the elements are always stored contiguously
- **B.** Because they share the same constructor
- **C.** Because both are subclasses, satisfying the IS-A relationship with the element type
- **D.** Because the array is declared abstract

**Correct Answer:** Because both are subclasses, satisfying the IS-A relationship with the element type

**Explanation:** A reference-typed array can store any object whose type is a subtype of the element type, enabling polymorphic collections.

---

## Question 41

**Question:** What does this print?

```java
class Box { int v = 5; }
Box a = new Box();
Box b = new Box();
b.v = 10;
System.out.println(a.v);
```

**Choices:**
- **A.** 10
- **B.** 0
- **C.** 15
- **D.** 5

**Correct Answer:** 5

**Explanation:** `a` and `b` are separate objects, so mutating `b.v` does not affect `a.v`. Contrast with aliasing where `b = a`.

---

## Question 42

**Question:** Which is true about calling an abstract method from within a concrete method of the same abstract class?

**Choices:**
- **A.** It is legal; at runtime the subclass's overriding implementation runs
- **B.** It is illegal because the abstract method has no body
- **C.** It always causes infinite recursion, and this is true regardless of how the data was built
- **D.** It runs a compiler-generated empty body

**Correct Answer:** It is legal; at runtime the subclass's overriding implementation runs

**Explanation:** A concrete method may call an abstract method; dynamic binding routes the call to the concrete override supplied by the instantiated subclass (a template-method pattern).

---

## Question 43

**Question:** Consider the "nouns suggest attributes, verbs suggest methods" heuristic. In "The machine dispenses candy and returns change," which are likely methods?

**Choices:**
- **A.** machine, candy
- **B.** dispenses, returns
- **C.** change only
- **D.** machine only

**Correct Answer:** dispenses, returns

**Explanation:** Verbs (dispenses, returns) map to behaviors/methods; nouns (machine, candy, change) map to classes/attributes.

---

## Question 44

**Question:** A `CandyMachine` HAS-A `CashRegister` field. This design relationship is:

**Choices:**
- **A.** Inheritance
- **B.** Interface implementation
- **C.** Composition
- **D.** Polymorphism

**Correct Answer:** Composition

**Explanation:** Holding another object as a field to reuse its behavior is composition (a HAS-A relationship), not inheritance.

---

## Question 45

**Question:** What is the printed result?

```java
class Circle {
    double r;
    Circle(double r) { this.r = r; }
    double getArea() { return r * r * Math.PI; }
}
Circle c = new Circle(0);
System.out.println(c.getArea());
```

**Choices:**
- **A.** NaN
- **B.** 3.14159
- **C.** Exception
- **D.** 0.0

**Correct Answer:** 0.0

**Explanation:** With `r = 0`, the area is 0 × 0 × π = 0.0. No exception occurs.

---

## Question 46

**Question:** Which is the correct order of execution when `new Circle(4)` runs?

**Choices:**
- **A.** `super()`, then field initializers, then constructor body
- **B.** Constructor body, then field initializers
- **C.** Only the constructor body
- **D.** Field initializers only, constructor is skipped

**Correct Answer:** `super()`, then field initializers, then constructor body

**Explanation:** Object creation calls the superclass constructor first, then runs instance field initializers, then the remainder of the constructor body.

---

## Question 47

**Question:** True or false: If `equals` is not overridden, it behaves the same as `==` for object references.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The inherited `Object.equals` compares reference identity, which is the same behavior as `==` for references.

---

## Question 48

**Question:** Which member can be accessed without creating any object of the class?

**Choices:**
- **A.** An instance field
- **B.** A static field or static method
- **C.** A constructor body's local variable
- **D.** An abstract method

**Correct Answer:** A static field or static method

**Explanation:** Static members belong to the class and are accessible via the class name without instantiating an object.

---

## Question 49

**Question:** In `Edible[] list = { new Chicken(), new Fruit() };`, calling `list[1].howToEat()` invokes:

**Choices:**
- **A.** `Chicken`'s method
- **B.** The interface's default body
- **C.** `Fruit`'s method
- **D.** Compile error

**Correct Answer:** `Fruit`'s method

**Explanation:** `list[1]` refers to the `Fruit` object; dynamic binding calls `Fruit.howToEat()` despite the declared element type being `Edible`.

---

## Question 50

**Question:** Which is the strongest reason to program to an interface type (e.g., `Edible ref`) rather than a concrete type?

**Choices:**
- **A.** Interfaces execute faster than classes
- **B.** It prevents the object from having any state
- **C.** It removes the need for constructors, which the definition guarantees in every case
- **D.** It decouples calling code from specific implementations, easing substitution

**Correct Answer:** It decouples calling code from specific implementations, easing substitution

**Explanation:** Depending on an abstraction lets you swap implementations without changing client code, improving flexibility and testability.

---

## Question 51

**Question:** What is the result of compiling and running?

```java
abstract class Shape {
    abstract double area();
    void describe() { System.out.println("Area=" + area()); }
}
class Sq extends Shape {
    double s;
    Sq(double s) { this.s = s; }
    double area() { return s * s; }
}
new Sq(3).describe();
```

**Choices:**
- **A.** Area=9.0
- **B.** Compile error: abstract method called
- **C.** Area=3.0
- **D.** Runtime exception

**Correct Answer:** Area=9.0

**Explanation:** `describe` (concrete) calls the abstract `area`, dynamically bound to `Sq.area()` returning 9.0.

---

## Question 52

**Question:** A method parameter of type `Circle` receives an argument. Modifying the object's fields inside the method:

**Choices:**
- **A.** Never affects the caller's object
- **B.** Affects the caller's object because the reference points to the same object
- **C.** Creates a deep copy automatically
- **D.** Causes a compile error, so no traversal or comparison is ever needed

**Correct Answer:** Affects the caller's object because the reference points to the same object

**Explanation:** Java passes the reference by value; the parameter references the same object, so field mutations are visible to the caller.

---

## Question 53

**Question:** Reassigning the parameter itself, `param = new Circle(9);`, inside a method:

**Choices:**
- **A.** Changes which object the caller's variable points to
- **B.** Throws an exception
- **C.** Only rebinds the local parameter; the caller's variable is unchanged
- **D.** Is illegal in Java, independent of the input size or ordering

**Correct Answer:** Only rebinds the local parameter; the caller's variable is unchanged

**Explanation:** Because references are passed by value, rebinding the local parameter does not affect the caller's reference variable.

---

## Question 54

**Question:** Which best defines "instance"?

**Choices:**
- **A.** A static copy of a class
- **B.** A method inside a class
- **C.** An interface's field, making it the most efficient choice by design
- **D.** A specific object created from a class

**Correct Answer:** A specific object created from a class

**Explanation:** An instance is a concrete object built from a class blueprint via `new`.

---

## Question 55

**Question:** What prints?

```java
class P { String id() { return "P"; } }
class C extends P { String id() { return "C-" + super.id(); } }
System.out.println(new C().id());
```

**Choices:**
- **A.** C-P
- **B.** C
- **C.** P
- **D.** P-C

**Correct Answer:** C-P

**Explanation:** `C.id()` returns `"C-"` concatenated with `super.id()`, which invokes the parent's `id()` returning `"P"`, giving `"C-P"`.

---

## Question 56

**Question:** True or false: An interface variable can be `null`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** An interface-typed reference is still a reference and can hold `null` before an implementing object is assigned.

---

## Question 57

**Question:** Which is a legal field declaration triggering encapsulation best practice?

**Choices:**
- **A.** `public double radius;`, as a direct consequence of the structure's shape
- **B.** `private double radius;` with public getter/setter
- **C.** `radius double private;`
- **D.** `double public radius;`

**Correct Answer:** `private double radius;` with public getter/setter

**Explanation:** Private fields exposed via public accessors follow encapsulation. The other options are either poor practice or syntactically invalid.

---

## Question 58

**Question:** Consider `Object o = new Circle(2);`. Which call compiles?

**Choices:**
- **A.** `o.getArea()`
- **B.** `o.setRadius(3)`
- **C.** `o.toString()`
- **D.** `o.radius`

**Correct Answer:** `o.toString()`

**Explanation:** Only members visible through the declared type `Object` compile without a cast; `toString()` is defined in `Object`. The Circle-specific members require a cast to `Circle`.

---

## Question 59

**Question:** What allows `System.out.println(myCircle)` to print something meaningful about a Circle?

**Choices:**
- **A.** Making all fields public
- **B.** Declaring the class abstract
- **C.** Adding a static block
- **D.** Overriding `toString()` in `Circle`

**Correct Answer:** Overriding `toString()` in `Circle`

**Explanation:** `println` calls the object's `toString()`; overriding it yields a meaningful representation instead of the default class@hashcode string.

---

## Question 60

**Question:** Which of these is TRUE about abstract methods and constructors?

**Choices:**
- **A.** An abstract class can have constructors invoked via subclass construction
- **B.** Constructors can be abstract, which holds even for empty or degenerate inputs
- **C.** Abstract methods can be private
- **D.** Abstract methods must be static

**Correct Answer:** An abstract class can have constructors invoked via subclass construction

**Explanation:** Abstract classes may define constructors that run during subclass instantiation. Constructors cannot be abstract, and abstract methods cannot be private or static (they must be overridable).

---

## Question 61

**Question:** What is the output?

```java
class Node { int val; Node next; Node(int v){ val=v; } }
Node a = new Node(1);
Node b = new Node(2);
a.next = b;
System.out.println(a.next.val);
```

**Choices:**
- **A.** 1
- **B.** 2
- **C.** null
- **D.** 0

**Correct Answer:** 2

**Explanation:** `a.next` references `b`, whose `val` is 2. This is the reference-linking idea underlying linked structures.

---

## Question 62

**Question:** After `a.next = b; b.next = a;`, what is `a.next.next.val` given `a.val=1`?

**Choices:**
- **A.** 2
- **B.** null pointer exception
- **C.** 1
- **D.** 0

**Correct Answer:** 1

**Explanation:** `a.next` is `b`, `b.next` is `a`, and `a.val` is 1, so the chain returns 1 (a small cycle).

---

## Question 63

**Question:** Which statement about method overloading vs overriding is correct?

**Choices:**
- **A.** Overloading is resolved at runtime; overriding at compile time
- **B.** Both are resolved at runtime, because the elements are always stored contiguously
- **C.** Both are resolved at compile time, and this is true regardless of how the data was built
- **D.** Overloading is resolved at compile time by signatures; overriding is resolved at runtime by object type

**Correct Answer:** Overloading is resolved at compile time by signatures; overriding is resolved at runtime by object type

**Explanation:** Overload selection uses static argument types at compile time; override selection uses the dynamic type of the receiver at runtime.

---

## Question 64

**Question:** True or false: A subclass can override a method to throw a broader checked exception than the superclass method declares.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** An overriding method may not declare broader checked exceptions than the overridden method; it may throw the same, narrower, or none.

---

## Question 65

**Question:** Which correctly casts and calls a subclass method?

```java
GeometricObject g = new Circle(2);
```

**Choices:**
- **A.** `((Circle) g).getRadius()`
- **B.** `(Circle) g.getRadius()`
- **C.** `Circle(g).getRadius()`
- **D.** `g.(Circle)getRadius()`

**Correct Answer:** `((Circle) g).getRadius()`

**Explanation:** The cast must be parenthesized around the reference before the method call: `((Circle) g).getRadius()`. Option B casts the method result instead.

---

## Question 66

**Question:** What is printed?

```java
class A { int x = 1; int get() { return x; } }
class B extends A { int x = 2; }
A r = new B();
System.out.println(r.x + " " + r.get());
```

**Choices:**
- **A.** 2 2, which the definition guarantees in every case
- **B.** 1 1 (fields not overridden, method inherited)
- **C.** 1 1
- **D.** 2 1

**Correct Answer:** 1 1 (fields not overridden, method inherited)

**Explanation:** Fields are not polymorphic; `r.x` uses the declared type `A` giving 1. `get()` is inherited from `A` and reads `A`'s `x`, also 1. Field hiding differs from method overriding.

---

## Question 67

**Question:** Why does the code in Q66 not print `2` for the field access?

**Choices:**
- **A.** Because `B` failed to compile, independent of the input size or ordering
- **B.** Because `x` in `B` is private
- **C.** Because fields are accessed by the reference's declared (static) type, not the object type
- **D.** Because `get()` is abstract, so no traversal or comparison is ever needed

**Correct Answer:** Because fields are accessed by the reference's declared (static) type, not the object type

**Explanation:** Field access is statically bound to the compile-time type of the reference; only instance methods are dynamically bound.

---

## Question 68

**Question:** Which is the correct meaning of "encapsulation"?

**Choices:**
- **A.** Creating multiple constructors
- **B.** Extending multiple interfaces, making it the most efficient choice by design
- **C.** Overriding a superclass method
- **D.** Bundling data and the methods that operate on it, and restricting direct access

**Correct Answer:** Bundling data and the methods that operate on it, and restricting direct access

**Explanation:** Encapsulation groups state with behavior and hides internal representation behind a controlled interface.

---

## Question 69

**Question:** What is the result?

```java
interface Shape { double area(); }
Shape s = () -> 4.0;   // lambda (treated as anonymous implementer)
System.out.println(s.area());
```

**Choices:**
- **A.** 4.0
- **B.** Compile error: interfaces cannot be assigned lambdas
- **C.** 0.0
- **D.** Runtime exception

**Correct Answer:** 4.0

**Explanation:** A single-abstract-method interface can be implemented by a lambda; `s.area()` returns 4.0. (Functional-interface behavior.)

---

## Question 70

**Question:** In the vending-machine analogy for ADTs, the "buttons" correspond to:

**Choices:**
- **A.** The internal storage implementation
- **B.** The public operations exposed to the user
- **C.** The private data fields
- **D.** The constructor

**Correct Answer:** The public operations exposed to the user

**Explanation:** The buttons are the interface (operations) the user interacts with, hiding the internal mechanism—mirroring an ADT's public operations.

---

## Question 71

**Question:** What prints?

```java
class Circle {
    static int count = 0;
    Circle() { count++; }
}
new Circle(); new Circle(); new Circle();
System.out.println(Circle.count);
```

**Choices:**
- **A.** 0
- **B.** 1
- **C.** 3
- **D.** Compile error (static accessed via class)

**Correct Answer:** 3

**Explanation:** The shared static counter increments once per construction; after three objects it is 3, accessible via the class name.

---

## Question 72

**Question:** True or false: A class can be both `abstract` and `final`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** `abstract` requires subclassing to be useful, while `final` forbids subclassing; the combination is contradictory and illegal.

---

## Question 73

**Question:** Which best explains why constructors are not inherited?

**Choices:**
- **A.** Because they are always private
- **B.** Because Java forbids more than one constructor
- **C.** Because they are static, as a direct consequence of the structure's shape
- **D.** Because they have the class's own name and construct that specific class

**Correct Answer:** Because they have the class's own name and construct that specific class

**Explanation:** A constructor is tied to its exact class name and purpose; subclasses define their own and invoke the parent's via `super(...)`.

---

## Question 74

**Question:** What is the output?

```java
class A { A() { init(); } void init() { System.out.print("A"); } }
class B extends A { void init() { System.out.print("B"); } }
new B();
```

**Choices:**
- **A.** B
- **B.** A
- **C.** AB
- **D.** Nothing

**Correct Answer:** B

**Explanation:** During `A`'s constructor, `init()` is dynamically dispatched to `B`'s override (even though `B`'s constructor hasn't run yet), printing "B". This is a classic virtual-call-in-constructor pitfall.

---

## Question 75

**Question:** Which is NOT a valid visibility modifier discussed for data fields?

**Choices:**
- **A.** public
- **B.** external
- **C.** private
- **D.** protected

**Correct Answer:** external

**Explanation:** Java visibility modifiers are `public`, `private`, `protected`, and package-private (default). `external` is not a Java keyword.

---

## Question 76

**Question:** What does `getFrequencyOf`-style thinking illustrate about object behavior vs data?

**Choices:**
- **A.** Data is computed by constructors only
- **B.** State cannot be read by methods, which holds even for empty or degenerate inputs
- **C.** Behavior (a method) computes over the object's stored data
- **D.** Methods cannot depend on fields

**Correct Answer:** Behavior (a method) computes over the object's stored data

**Explanation:** Methods (behavior) operate on the object's fields (state) to produce results, the essence of object-oriented design.

---

## Question 77

**Question:** Given `Circle` with no explicit `equals`, what does `new Circle(2).equals(new Circle(2))` return?

**Choices:**
- **A.** true
- **B.** Compile error
- **C.** NullPointerException
- **D.** false

**Correct Answer:** false

**Explanation:** Without overriding `equals`, the inherited identity comparison returns false for two distinct objects even with equal state.

---

## Question 78

**Question:** Which statement about `super` is correct?

**Choices:**
- **A.** `super.method()` bypasses dynamic binding to call the parent's version
- **B.** `super()` can be called anywhere in the constructor
- **C.** `super` refers to a static copy of the parent class
- **D.** `super` can be used in a static context, because the elements are always stored contiguously

**Correct Answer:** `super.method()` bypasses dynamic binding to call the parent's version

**Explanation:** `super.method()` explicitly invokes the superclass implementation. `super()` must be first in the constructor and `super` is not available in static contexts.

---

## Question 79

**Question:** A design has `class Book` and `class Library { Book[] books; }`. This is:

**Choices:**
- **A.** Library IS-A Book
- **B.** Library HAS-A collection of Books
- **C.** Book extends Library
- **D.** An interface relationship

**Correct Answer:** Library HAS-A collection of Books

**Explanation:** Holding an array of `Book` is a HAS-A relationship, modeling aggregation, not inheritance.

---

## Question 80

**Question:** What is printed?

```java
class Circle {
    double r = 2;
    double area() { return r * r * Math.PI; }
    void grow() { r = r * 2; }
}
Circle c = new Circle();
c.grow();
System.out.printf("%.2f%n", c.area());
```

**Choices:**
- **A.** 12.57
- **B.** 3.14
- **C.** 50.27
- **D.** 25.13

**Correct Answer:** 50.27

**Explanation:** `grow` doubles `r` to 4; area = 4 × 4 × π = 16π ≈ 50.27.

---

## Question 81

**Question:** True or false: Overloaded methods must differ in return type.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Overloading requires different parameter lists; return type alone cannot distinguish overloads and differing only in return type is a compile error.

---

## Question 82

**Question:** Which correctly describes an "accessor" and a "mutator"?

**Choices:**
- **A.** Accessor sets a value; mutator reads a value
- **B.** Both read values
- **C.** Both change values
- **D.** Accessor reads (getter); mutator changes (setter)

**Correct Answer:** Accessor reads (getter); mutator changes (setter)

**Explanation:** Accessors (getters) return field values without modifying state; mutators (setters) modify field values.

---

## Question 83

**Question:** What is the output?

```java
class A { void m() { System.out.print("A"); } }
class B extends A { void m() { System.out.print("B"); } }
class C extends B { void m() { super.m(); System.out.print("C"); } }
new C().m();
```

**Choices:**
- **A.** BC
- **B.** C
- **C.** ABC
- **D.** AC

**Correct Answer:** BC

**Explanation:** `C.m()` calls `super.m()` which is `B.m()` (the immediate parent), printing "B", then "C". `A.m()` is not reached.

---

## Question 84

**Question:** Which is true about instantiating an interface?

**Choices:**
- **A.** `new Edible()` is legal, and this is true regardless of how the data was built
- **B.** You cannot instantiate an interface, but you can instantiate a class implementing it
- **C.** Interfaces are instantiated automatically at load time
- **D.** Only abstract classes can implement interfaces

**Correct Answer:** You cannot instantiate an interface, but you can instantiate a class implementing it

**Explanation:** Interfaces have no constructors and cannot be directly instantiated; concrete implementers provide the objects.

---

## Question 85

**Question:** In `Circle c = new Circle(5);`, which parts are the type, the reference, and the object?

**Choices:**
- **A.** `c`=type, `Circle`=reference, `5`=object
- **B.** `new`=type, `Circle`=object, `c`=reference
- **C.** `Circle`=type, `c`=reference, `new Circle(5)`=object creation
- **D.** All three are the same thing, which the definition guarantees in every case

**Correct Answer:** `Circle`=type, `c`=reference, `new Circle(5)`=object creation

**Explanation:** `Circle` is the declared type, `c` is the reference variable, and `new Circle(5)` creates the object the reference points to.

---

## Question 86

**Question:** What prints?

```java
class Wallet { int money; }
void addTen(Wallet w) { w.money += 10; }
Wallet w = new Wallet();
addTen(w);
addTen(w);
System.out.println(w.money);
```

**Choices:**
- **A.** 0
- **B.** 10
- **C.** Compile error
- **D.** 20

**Correct Answer:** 20

**Explanation:** Both calls mutate the same object through the passed reference, so `money` accumulates to 20.

---

## Question 87

**Question:** Which of the following breaks encapsulation the most?

**Choices:**
- **A.** A public field directly modifiable by any code
- **B.** A public getter returning a copy
- **C.** A private field with a validating setter
- **D.** A protected field accessed by subclasses only

**Correct Answer:** A public field directly modifiable by any code

**Explanation:** Exposing a public mutable field lets any code change state without validation, the strongest encapsulation violation among the options.

---

## Question 88

**Question:** True or false: A subclass object can always be assigned to a superclass reference without a cast (upcasting).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Upcasting from subclass to superclass is implicit and always safe because the subclass IS-A superclass.

---

## Question 89

**Question:** What happens?

```java
GeometricObject g = new GeometricObject();  // abstract class
```

**Choices:**
- **A.** Creates an empty object
- **B.** Compile error: abstract class cannot be instantiated
- **C.** Runtime exception, so no traversal or comparison is ever needed
- **D.** Creates a subclass automatically

**Correct Answer:** Compile error: abstract class cannot be instantiated

**Explanation:** Abstract classes cannot be instantiated directly; the compiler rejects `new GeometricObject()`.

---

## Question 90

**Question:** Which is the correct signature to make `Circle` comparable by radius?

**Choices:**
- **A.** `class Circle extends Comparable` with `compareTo`
- **B.** `class Circle implements Comparable` with `equals`
- **C.** `class Circle implements Comparable<Circle>` with `public int compareTo(Circle o)`
- **D.** `class Circle comparable Circle`, independent of the input size or ordering

**Correct Answer:** `class Circle implements Comparable<Circle>` with `public int compareTo(Circle o)`

**Explanation:** Implementing `Comparable<Circle>` and defining `compareTo(Circle)` provides natural ordering; `Comparable` is implemented, not extended.

---

## Question 91

**Question:** What is the output?

```java
class Base { Base() { System.out.print("1"); } Base(int x){ System.out.print("2"); } }
class Sub extends Base { Sub() { super(5); System.out.print("3"); } }
new Sub();
```

**Choices:**
- **A.** 13
- **B.** 123
- **C.** 3
- **D.** 23

**Correct Answer:** 23

**Explanation:** `Sub()` explicitly calls `super(5)`, running `Base(int)` (prints 2), then prints 3. The no-arg `Base()` is not called.

---

## Question 92

**Question:** Why might a designer choose an interface over an abstract class for `Edible`?

**Choices:**
- **A.** A class can implement many interfaces but extend only one class
- **B.** Interfaces allow shared instance-field state
- **C.** Interfaces can be instantiated directly
- **D.** Interfaces run without the JVM, making it the most efficient choice by design

**Correct Answer:** A class can implement many interfaces but extend only one class

**Explanation:** Interfaces enable a type to participate in multiple contracts, avoiding the single-inheritance limitation of classes.

---

## Question 93

**Question:** What prints?

```java
class Circle {
    double r;
    Circle(double r){ this.r = r; }
    boolean bigger(Circle o){ return this.r > o.r; }
}
System.out.println(new Circle(3).bigger(new Circle(5)));
```

**Choices:**
- **A.** true
- **B.** false
- **C.** Compile error
- **D.** 0

**Correct Answer:** false

**Explanation:** `3 > 5` is false, so `bigger` returns false. The method compares the receiver's radius with the argument's.

---

## Question 94

**Question:** Which statement about `protected` visibility is correct?

**Choices:**
- **A.** Accessible only within the same class
- **B.** Accessible from anywhere, as a direct consequence of the structure's shape
- **C.** Accessible within the same package and by subclasses
- **D.** Accessible only by static methods

**Correct Answer:** Accessible within the same package and by subclasses

**Explanation:** `protected` grants access to same-package classes and to subclasses (even in other packages), broader than private but narrower than public.

---

## Question 95

**Question:** What is the printed value?

```java
class A { int f() { return 1; } }
class B extends A { int f() { return 2; } int g() { return super.f() + f(); } }
System.out.println(new B().g());
```

**Choices:**
- **A.** 2
- **B.** 4
- **C.** 1
- **D.** 3

**Correct Answer:** 3

**Explanation:** `super.f()` returns 1 (A's version) and `f()` returns 2 (B's override), summing to 3.

---

## Question 96

**Question:** Which is TRUE about the `default` (package-private) access with no modifier?

**Choices:**
- **A.** It restricts access to classes within the same package
- **B.** It is the same as public, which holds even for empty or degenerate inputs
- **C.** It restricts access to subclasses only
- **D.** It makes the member static

**Correct Answer:** It restricts access to classes within the same package

**Explanation:** With no modifier, a member has package-private access—visible only within the same package.

---

## Question 97

**Question:** What is printed?

```java
class Circle {
    double r = 1;
    Circle scale(double f){ r *= f; return this; }
}
Circle c = new Circle().scale(2).scale(3);
System.out.println(c.r);
```

**Choices:**
- **A.** 1.0
- **B.** 6.0
- **C.** 5.0
- **D.** 2.0

**Correct Answer:** 6.0

**Explanation:** Returning `this` enables method chaining: `r` becomes 1×2×3 = 6.0.

---

## Question 98

**Question:** True or false: If a superclass has only a parameterized constructor and a subclass constructor does not explicitly call `super(...)`, the subclass compiles fine.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** The compiler inserts an implicit `super()`, but if no no-arg superclass constructor exists, this fails to compile; an explicit `super(args)` is required.

---

## Question 99

**Question:** Which describes "dynamic binding" precisely?

**Choices:**
- **A.** Method selection based on the reference's declared type at compile time
- **B.** Field selection based on the object's type at runtime
- **C.** Method selection based on the actual object's type at runtime
- **D.** Constructor selection at runtime

**Correct Answer:** Method selection based on the actual object's type at runtime

**Explanation:** Dynamic (late) binding resolves overridden instance-method calls using the runtime type of the object, not the static reference type.

---

## Question 100

**Question:** A `toArray()`-style method on a container returns a new array of its elements. Modifying that returned array's references (reassigning slots) does what to the container's internal storage?

**Choices:**
- **A.** Corrupts the container immediately
- **B.** Deletes the container, because the elements are always stored contiguously
- **C.** Always throws an exception
- **D.** Has no effect on the container's own internal array

**Correct Answer:** Has no effect on the container's own internal array

**Explanation:** Reassigning slots in the returned array changes only that array's references. However, mutating the shared objects those references point to would be visible—an important distinction between shallow copy of an array and copies of the objects.

---

### Answer distribution (self-check)
Answers are spread across A/B/C/D positions; correct choices are intentionally not always the longest option. Questions marked "True/False" alternate outcomes. Q27 includes a deliberate correction note showing the static-sharing trap.
