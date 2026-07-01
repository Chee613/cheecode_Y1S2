# Chapter 3 ADT and Bag: 100 Extreme-Hard Questions

> Topics: abstract data types, collection vs container, the vending-machine analogy, Bag ADT and its operations, `BagInterface<T>`, array vs linked implementation, and OO design from a scenario (Candy Machine tutorial). Choose the single best answer.

---

## Question 1

**Question:** Which statement most precisely captures what an Abstract Data Type (ADT) specifies?

**Choices:**
- **A.** The exact memory layout used to store the data
- **B.** The specific class name in the standard library
- **C.** The operations available and their behavior, independent of implementation
- **D.** The number of CPU cycles each operation takes, because the elements are always stored contiguously

**Correct Answer:** The operations available and their behavior, independent of implementation

**Explanation:** An ADT defines *what* operations exist and how they behave, deliberately omitting *how* the data is stored or coded.

---

## Question 2

**Question:** A `Bag` and a `Set` both hold items. What single property most distinguishes a Bag?

**Choices:**
- **A.** A Bag maintains strict sorted order
- **B.** A Bag forbids duplicate entries
- **C.** A Bag can only hold primitive types
- **D.** A Bag allows duplicate entries

**Correct Answer:** A Bag allows duplicate entries

**Explanation:** A Bag is an unordered collection that permits duplicates, whereas a Set typically rejects duplicates.

---

## Question 3

**Question:** In the vending-machine analogy, the internal coin mechanism corresponds to:

**Choices:**
- **A.** The ADT's public operations
- **B.** The user pressing buttons, and this is true regardless of how the data was built
- **C.** The implementation hidden behind the interface
- **D.** The specification document

**Correct Answer:** The implementation hidden behind the interface

**Explanation:** The internal mechanism is the concealed implementation; users interact only through the buttons (the public operations).

---

## Question 4

**Question:** Which pair correctly maps the concepts "collection" and "container"?

**Choices:**
- **A.** Collection = concrete class; Container = abstract idea
- **B.** They are identical terms, which the definition guarantees in every case
- **C.** Collection = array only; Container = linked list only, so no traversal or comparison is ever needed
- **D.** Collection = abstract idea of grouping objects; Container = concrete class implementing it

**Correct Answer:** Collection = abstract idea of grouping objects; Container = concrete class implementing it

**Explanation:** A collection is the abstract notion of storing a group; a container is the concrete language-level class that realizes it.

---

## Question 5

**Question:** For `getFrequencyOf(anEntry)` on a Bag containing `{a, b, a, c, a}`, calling it with `a` returns:

**Choices:**
- **A.** 1
- **B.** 5
- **C.** 3
- **D.** true

**Correct Answer:** 3

**Explanation:** `getFrequencyOf` counts occurrences; `a` appears three times.

---

## Question 6

**Question:** Which `BagInterface<T>` method has a return type that is NOT `boolean`, `int`, or `void`?

**Choices:**
- **A.** `add(T newEntry)`
- **B.** `isEmpty()`
- **C.** `getCurrentSize()`
- **D.** `toArray()`

**Correct Answer:** `toArray()`

**Explanation:** `toArray()` returns `T[]`. `add` and `isEmpty` return `boolean`, and `getCurrentSize` returns `int`.

---

## Question 7

**Question:** What is the key difference between `remove()` and `remove(anEntry)` in a Bag?

**Choices:**
- **A.** `remove()` clears the whole bag; `remove(anEntry)` removes one item
- **B.** They are identical
- **C.** `remove()` removes an unspecified item; `remove(anEntry)` removes a specific item
- **D.** `remove()` removes a specific item; `remove(anEntry)` removes an unspecified one

**Correct Answer:** `remove()` removes an unspecified item; `remove(anEntry)` removes a specific item

**Explanation:** The no-arg `remove()` deletes and returns some item chosen by the implementation, while `remove(anEntry)` targets a matching entry.

---

## Question 8

**Question:** Why is the generic type parameter `<T>` used in `BagInterface<T>`?

**Choices:**
- **A.** To force the bag to hold only integers
- **B.** To make the bag run faster, independent of the input size or ordering
- **C.** To allow mixing incompatible types freely
- **D.** To allow the bag to hold any single reference type with compile-time type safety

**Correct Answer:** To allow the bag to hold any single reference type with compile-time type safety

**Explanation:** Generics parameterize the element type so one implementation serves many types while the compiler enforces type consistency.

---

## Question 9

**Question:** True or false: An ADT specification changes when you switch from an array implementation to a linked implementation.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** The ADT (operations and behavior) is unchanged; only the underlying implementation differs. That separation is the entire point of an ADT.

---

## Question 10

**Question:** Which is the best example of "programming to the interface" with a Bag?

**Choices:**
- **A.** `ArrayBag<String> b = new ArrayBag<>();`
- **B.** `ArrayBag b = new BagInterface();`
- **C.** `BagInterface<String> b = new ArrayBag<>();`
- **D.** `BagInterface b = new BagInterface();`

**Correct Answer:** `BagInterface<String> b = new ArrayBag<>();`

**Explanation:** Declaring the variable as the interface type while instantiating a concrete class decouples client code from the implementation. You cannot instantiate the interface itself.

---

## Question 11

**Question:** In the Candy Machine design tutorial, the guideline "nouns suggest attributes, verbs suggest methods" would map "dispense candy" to:

**Choices:**
- **A.** an attribute
- **B.** a class only
- **C.** an interface
- **D.** a method

**Correct Answer:** a method

**Explanation:** "Dispense" is a verb describing an action, which suggests a method.

---

## Question 12

**Question:** A `CandyMachine` contains four `Dispenser` objects and one `CashRegister`. This models:

**Choices:**
- **A.** inheritance
- **B.** polymorphism
- **C.** composition (HAS-A)
- **D.** interface implementation

**Correct Answer:** composition (HAS-A)

**Explanation:** The machine is built from parts it owns as fields—a HAS-A composition relationship.

---

## Question 13

**Question:** After `bag.add("x")` returns `false`, the most reasonable interpretation is:

**Choices:**
- **A.** The item was added successfully
- **B.** The bag was cleared, making it the most efficient choice by design
- **C.** The item already existed
- **D.** The add failed, e.g., a fixed-capacity array bag is full

**Correct Answer:** The add failed, e.g., a fixed-capacity array bag is full

**Explanation:** `add` returns a boolean success flag; `false` signals the operation could not complete, such as a full fixed-size array implementation.

---

## Question 14

**Question:** Which operation set best identifies a Bag ADT (as opposed to a List)?

**Choices:**
- **A.** `add`, `remove`, `get(index)`, `set(index)`
- **B.** `add`, `remove`, `getFrequencyOf`, `contains` with no positional access
- **C.** `push`, `pop`, `peek`
- **D.** `enqueue`, `dequeue`, as a direct consequence of the structure's shape

**Correct Answer:** `add`, `remove`, `getFrequencyOf`, `contains` with no positional access

**Explanation:** A Bag has no notion of position/index; it offers frequency and membership queries. Positional `get(index)` belongs to List; push/pop and enqueue/dequeue belong to Stack/Queue.

---

## Question 15

**Question:** Consider an array-based bag with capacity 3 currently holding `{5, 9, 2}`. `getCurrentSize()` after a successful `remove(9)` returns:

**Choices:**
- **A.** 3
- **B.** 1
- **C.** 2
- **D.** 0

**Correct Answer:** 2

**Explanation:** Removing one existing item reduces the count from 3 to 2.

---

## Question 16

**Question:** In an array bag, a common efficient technique to remove an element at index `i` without shifting is:

**Choices:**
- **A.** Set the slot to null and leave a gap
- **B.** Reverse the whole array
- **C.** Sort the array first, which holds even for empty or degenerate inputs
- **D.** Copy the last element into index `i`, then shrink the count

**Correct Answer:** Copy the last element into index `i`, then shrink the count

**Explanation:** Because a bag is unordered, replacing the removed slot with the last element and decrementing the count is O(1), avoiding a shift.

---

## Question 17

**Question:** True or false: `contains(anEntry)` and `getFrequencyOf(anEntry) > 0` always give the same boolean result.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** An item is contained iff its frequency is at least 1, so both expressions agree.

---

## Question 18

**Question:** Which is a valid reason to choose a linked implementation (LinkedBag) over an array implementation (ArrayBag)?

**Choices:**
- **A.** Constant-time random indexing
- **B.** No fixed capacity limit and no resizing/copying of a backing array
- **C.** Lower memory per element, because the elements are always stored contiguously
- **D.** Cache-friendly contiguous storage

**Correct Answer:** No fixed capacity limit and no resizing/copying of a backing array

**Explanation:** A linked bag grows one node at a time without a capacity cap or array-copy resizing. Arrays win on indexing, memory density, and cache locality.

---

## Question 19

**Question:** In a `LinkedBag<T>`, adding a new entry most efficiently at the:

**Choices:**
- **A.** end via full traversal
- **B.** middle after searching
- **C.** head (front), since order does not matter
- **D.** array index, and this is true regardless of how the data was built

**Correct Answer:** head (front), since order does not matter

**Explanation:** Because a bag is unordered, prepending at the head is O(1) and avoids traversal to the tail.

---

## Question 20

**Question:** Which statement about `clear()` is correct?

**Choices:**
- **A.** It removes only duplicates
- **B.** It removes the first entry only
- **C.** It returns the number of entries removed
- **D.** It removes all entries, leaving the bag empty

**Correct Answer:** It removes all entries, leaving the bag empty

**Explanation:** `clear()` empties the bag so that `isEmpty()` becomes true and `getCurrentSize()` is 0.

---

## Question 21

**Question:** A subtle correctness bug: an array bag's `remove(anEntry)` finds the item at index `i`, copies `array[numberOfEntries-1]` to `array[i]`, but forgets to decrement `numberOfEntries`. The most likely symptom is:

**Choices:**
- **A.** A compile error, which the definition guarantees in every case
- **B.** The bag size reports one too many and the last slot is duplicated logically
- **C.** The whole bag is cleared
- **D.** The item is never found, so no traversal or comparison is ever needed

**Correct Answer:** The bag size reports one too many and the last slot is duplicated logically

**Explanation:** Without decrementing the count, the copied last element still appears at its old index, so it is counted twice and the size is off by one.

---

## Question 22

**Question:** Which is TRUE about the abstraction barrier of an ADT?

**Choices:**
- **A.** Clients depend on internal fields
- **B.** Implementers must expose the backing array
- **C.** Clients depend only on the operations
- **D.** The barrier only applies to arrays

**Correct Answer:** Clients depend only on the operations

**Explanation:** The abstraction barrier lets implementations evolve without affecting clients, as long as the operation contract holds.

---

## Question 23

**Question:** For `toArray()` returning `T[]`, why is generic array creation tricky in Java?

**Choices:**
- **A.** Generics forbid arrays entirely
- **B.** Arrays cannot hold objects, independent of the input size or ordering
- **C.** `toArray` must return `int[]`, making it the most efficient choice by design
- **D.** You cannot write `new T[n]` directly due to type erasure; a cast or reflection is used

**Correct Answer:** You cannot write `new T[n]` directly due to type erasure; a cast or reflection is used

**Explanation:** Due to erasure, `new T[]` is illegal; implementations create `Object[]` and cast, or use `Array.newInstance`, often with an unchecked-cast warning.

---

## Question 24

**Question:** True or false: A Bag guarantees that items are returned by `toArray()` in insertion order.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** A bag is unordered by contract; `toArray()` may return items in any order depending on implementation.

---

## Question 25

**Question:** If `isEmpty()` returns true, which must also hold?

**Choices:**
- **A.** `contains(x)` returns true for some x
- **B.** `getCurrentSize()` returns 0
- **C.** `remove()` succeeds
- **D.** `getFrequencyOf(x)` returns 1

**Correct Answer:** `getCurrentSize()` returns 0

**Explanation:** An empty bag has size 0; membership queries fail and `remove()` cannot return an item.

---

## Question 26

**Question:** In the design step "find attributes," the best question to ask is:

**Choices:**
- **A.** What actions can the object perform?
- **B.** Which class extends which?
- **C.** What information must the object remember?
- **D.** How many CPU cycles are needed?

**Correct Answer:** What information must the object remember?

**Explanation:** Attributes capture the state an object must retain, e.g., cost, count, cash on hand.

---

## Question 27

**Question:** Which is an attribute rather than a method for a `CashRegister`?

**Choices:**
- **A.** `acceptAmount()`
- **B.** `returnChange()`
- **C.** `makeSale()`
- **D.** `cashOnHand`

**Correct Answer:** `cashOnHand`

**Explanation:** `cashOnHand` is stored state (a noun/attribute); the others are actions (verbs/methods).

---

## Question 28

**Question:** A method `add` in `BagInterface<T>` is declared `public boolean add(T newEntry)`. Which call is type-safe for `BagInterface<String>`?

**Choices:**
- **A.** `bag.add(42)`
- **B.** `bag.add("hello")`
- **C.** `bag.add(new Object())`
- **D.** `bag.add(null, null)`

**Correct Answer:** `bag.add("hello")`

**Explanation:** With `T = String`, only `String` (or null) arguments are accepted; integers and raw Objects fail to compile, and the method takes one argument.

---

## Question 29

**Question:** Which best explains why an ADT is compared to a "contract"?

**Choices:**
- **A.** It legally binds the programmer to a company
- **B.** It specifies exact runtime in nanoseconds
- **C.** It promises certain operations and behaviors that any valid implementation must honor
- **D.** It forbids all changes to code, as a direct consequence of the structure's shape

**Correct Answer:** It promises certain operations and behaviors that any valid implementation must honor

**Explanation:** An ADT is a behavioral contract: implementations must provide the specified operations with the specified semantics.

---

## Question 30

**Question:** Given a fixed-capacity ArrayBag, which strategy allows it to accept unlimited additions?

**Choices:**
- **A.** Reject all adds, which holds even for empty or degenerate inputs
- **B.** Convert to a Set
- **C.** Store only the last element
- **D.** Dynamically resize (allocate a larger array and copy) when full

**Correct Answer:** Dynamically resize (allocate a larger array and copy) when full

**Explanation:** Doubling the backing array and copying elements when full removes the practical capacity limit at the cost of occasional O(n) resizes.

---

## Question 31

**Question:** What is the amortized cost of `add` for a dynamically resizing ArrayBag that doubles capacity?

**Choices:**
- **A.** O(n) per add
- **B.** O(1) amortized
- **C.** O(log n) per add
- **D.** O(n²) total

**Correct Answer:** O(1) amortized

**Explanation:** Doubling makes the total copying work across n adds O(n), so each add is O(1) amortized despite occasional O(n) resizes.

---

## Question 32

**Question:** True or false: In a `LinkedBag`, `getCurrentSize()` requires traversing all nodes if the class maintains a size counter.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** If the class keeps an integer size field updated on add/remove, `getCurrentSize()` is O(1) and needs no traversal.

---

## Question 33

**Question:** A `LinkedBag` node is typically declared as:

**Choices:**
- **A.** `class Node { T data; }` with no link
- **B.** `class Node { T data; Node prev; Node next; T[] arr; }`
- **C.** `class Node { T data; Node next; }`
- **D.** `class Node { int[] data; }`

**Correct Answer:** `class Node { T data; Node next; }`

**Explanation:** A singly linked bag node stores the element and a reference to the next node.

---

## Question 34

**Question:** Which operation would you expect to be O(n) in BOTH array and linked bag implementations?

**Choices:**
- **A.** `isEmpty()`
- **B.** `getCurrentSize()` with a counter
- **C.** adding at the head (linked) / end (array with counter)
- **D.** `getFrequencyOf(anEntry)`

**Correct Answer:** `getFrequencyOf(anEntry)`

**Explanation:** Counting occurrences requires scanning every element in either representation, so it is O(n) in both.

---

## Question 35

**Question:** Why can two different classes both legitimately be called "a Bag"?

**Choices:**
- **A.** They share the same file name
- **B.** They both satisfy the same `BagInterface<T>` contract
- **C.** They both use arrays, because the elements are always stored contiguously
- **D.** They have identical private fields

**Correct Answer:** They both satisfy the same `BagInterface<T>` contract

**Explanation:** Conformance to the ADT's operation contract—not internal details—makes a class "a Bag."

---

## Question 36

**Question:** Which statement about `remove()` returning `null` (or a sentinel) is most reasonable?

**Choices:**
- **A.** It indicates success
- **B.** It indicates the bag is full
- **C.** It indicates the bag was empty
- **D.** It clears the bag

**Correct Answer:** It indicates the bag was empty

**Explanation:** A common contract is that `remove()` returns `null` (or throws) when there is no item to remove.

---

## Question 37

**Question:** In OO design, after identifying classes and attributes, the next step is to:

**Choices:**
- **A.** Immediately write the GUI
- **B.** Delete all attributes
- **C.** Choose a database, and this is true regardless of how the data was built
- **D.** Identify the methods (behaviors) each class needs

**Correct Answer:** Identify the methods (behaviors) each class needs

**Explanation:** Design proceeds classes → attributes → methods, deriving behaviors from the verbs/actions in the scenario.

---

## Question 38

**Question:** True or false: An ADT can be implemented in a language that has no classes.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** An ADT is a conceptual specification; it can be realized with structs and functions or any construct, not exclusively classes.

---

## Question 39

**Question:** Which is the best signature for a Bag method that reports how many times an item appears?

**Choices:**
- **A.** `boolean getFrequencyOf(T anEntry)`
- **B.** `int getFrequencyOf(T anEntry)`
- **C.** `void getFrequencyOf(T anEntry)`
- **D.** `T getFrequencyOf(int count)`

**Correct Answer:** `int getFrequencyOf(T anEntry)`

**Explanation:** A frequency count is a non-negative integer, so the method returns `int` given the entry to count.

---

## Question 40

**Question:** A client writes `if (bag.contains(x)) bag.remove(x);`. A thread-unsafe concern aside, what is the functional purpose?

**Choices:**
- **A.** Add x twice
- **B.** Clear the bag
- **C.** Guard removal so it targets an item known to exist
- **D.** Count x, which the definition guarantees in every case

**Correct Answer:** Guard removal so it targets an item known to exist

**Explanation:** The check ensures the specific removal is attempted only when the item is present, though `remove(x)` typically already reports success itself.

---

## Question 41

**Question:** Which is NOT part of the Bag ADT operation list studied?

**Choices:**
- **A.** `getCurrentSize()`
- **B.** `contains(anEntry)`
- **C.** `toArray()`
- **D.** `get(index)`

**Correct Answer:** `get(index)`

**Explanation:** Bags have no positional access; `get(index)` is a List operation, not a Bag operation.

---

## Question 42

**Question:** In an ArrayBag, storing `numberOfEntries` separately from `array.length` is important because:

**Choices:**
- **A.** `array.length` is the capacity while `numberOfEntries` is the actual count in use
- **B.** They are always equal, so no traversal or comparison is ever needed
- **C.** `numberOfEntries` is the capacity
- **D.** Java requires it syntactically, independent of the input size or ordering

**Correct Answer:** `array.length` is the capacity while `numberOfEntries` is the actual count in use

**Explanation:** The backing array may have unused trailing slots; the count field tracks how many are actually occupied.

---

## Question 43

**Question:** True or false: Using an interface type for a bag variable prevents you from ever calling implementation-specific methods.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Through an interface reference, only interface-declared methods are accessible without a downcast; implementation-specific methods are hidden by design.

---

## Question 44

**Question:** Consider a bag `{1,1,2,3,3,3}`. After `remove(3)` once (specific), `getFrequencyOf(3)` is:

**Choices:**
- **A.** 3
- **B.** 2
- **C.** 1
- **D.** 0

**Correct Answer:** 2

**Explanation:** Removing one occurrence of `3` leaves two, so the frequency drops from 3 to 2.

---

## Question 45

**Question:** Which design smell suggests you picked inheritance when composition was better?

**Choices:**
- **A.** `CandyMachine has Dispenser fields`
- **B.** `CandyMachine implements Sellable`
- **C.** `CandyMachine extends Dispenser`
- **D.** `Dispenser has a cost attribute`

**Correct Answer:** `CandyMachine extends Dispenser`

**Explanation:** A machine is not a kind of dispenser; it *has* dispensers. Modeling HAS-A as inheritance is a design smell.

---

## Question 46

**Question:** The main pedagogical reason to study the Bag before Lists/Stacks/Queues is that it:

**Choices:**
- **A.** Is the fastest structure, making it the most efficient choice by design
- **B.** Is required by the Java compiler, as a direct consequence of the structure's shape
- **C.** Cannot hold duplicates, simplifying logic
- **D.** Introduces the ADT idea and multiple implementations of one simple, unordered contract

**Correct Answer:** Introduces the ADT idea and multiple implementations of one simple, unordered contract

**Explanation:** The bag is simple and unordered, making it ideal to teach ADT-vs-implementation with array and linked variants.

---

## Question 47

**Question:** Which return value convention makes `add` most informative?

**Choices:**
- **A.** Return boolean success so callers can detect failure
- **B.** Always return void, which holds even for empty or degenerate inputs
- **C.** Return the whole array
- **D.** Return the item's index

**Correct Answer:** Return boolean success so callers can detect failure

**Explanation:** A boolean lets callers react to failures such as a full fixed-capacity bag; index has no meaning in an unordered bag.

---

## Question 48

**Question:** True or false: A bag's `equals` semantics, if defined, should consider two bags equal only if they contain the same items with the same multiplicities.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Because bags are multisets, equality must account for how many times each element appears, not just membership.

---

## Question 49

**Question:** Which is the correct interpretation of "the client does not care whether the bag uses an array or a linked list"?

**Choices:**
- **A.** The client must inspect the backing store
- **B.** The client relies only on the ADT operations and their contract
- **C.** Array and linked bags have different operation names
- **D.** The client must recompile when the implementation changes

**Correct Answer:** The client relies only on the ADT operations and their contract

**Explanation:** Encapsulation behind the ADT means clients program against operations, not storage details.

---

## Question 50

**Question:** For a LinkedBag `remove(anEntry)`, a clean technique is to find the node containing the entry, then:

**Choices:**
- **A.** Sort the list, because the elements are always stored contiguously
- **B.** Rebuild the entire list
- **C.** Copy the head node's data into the found node and unlink the head
- **D.** Convert to an array

**Correct Answer:** Copy the head node's data into the found node and unlink the head

**Explanation:** Since order is irrelevant, overwriting the found node with the head's data and removing the head is O(1) after the search, avoiding predecessor tracking.

---

## Question 51

**Question:** Which is TRUE about capacity in a LinkedBag?

**Choices:**
- **A.** It has a fixed capacity set at construction
- **B.** It must be a power of two
- **C.** It equals the number of dispensers
- **D.** It is limited only by available memory

**Correct Answer:** It is limited only by available memory

**Explanation:** Linked structures grow node by node with no preset capacity, bounded only by heap memory.

---

## Question 52

**Question:** A poorly designed `toArray()` returns the bag's internal backing array directly. The danger is:

**Choices:**
- **A.** Callers can mutate the bag's internal storage, breaking encapsulation
- **B.** It is faster and always safe
- **C.** It cannot compile, and this is true regardless of how the data was built
- **D.** It doubles memory use

**Correct Answer:** Callers can mutate the bag's internal storage, breaking encapsulation

**Explanation:** Returning the live internal array lets external code alter the bag's state directly; a defensive copy should be returned.

---

## Question 53

**Question:** True or false: `getCurrentSize()` and `isEmpty()` provide overlapping information.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `isEmpty()` is equivalent to `getCurrentSize() == 0`, so they overlap; `isEmpty` is a convenience.

---

## Question 54

**Question:** Which scenario best justifies choosing an ArrayBag over a LinkedBag?

**Choices:**
- **A.** Unknown, potentially unbounded size with frequent growth
- **B.** Roughly known bounded size with a need for compact, cache-friendly storage
- **C.** Frequent insertions with no capacity information
- **D.** Requirement to avoid any array copying ever, which the definition guarantees in every case

**Correct Answer:** Roughly known bounded size with a need for compact, cache-friendly storage

**Explanation:** Arrays shine when size is bounded/known and locality matters; linked bags suit unbounded, growth-heavy cases.

---

## Question 55

**Question:** In `BagInterface<T>`, why is `remove(T anEntry)` typed to return `boolean` while `remove()` returns `T`?

**Choices:**
- **A.** They should both return `T`, so no traversal or comparison is ever needed
- **B.** They should both return `boolean`
- **C.** `remove(T)` reports whether the specific item was found and removed; `remove()` must hand back which item it removed
- **D.** Java forbids `T` return types, independent of the input size or ordering

**Correct Answer:** `remove(T)` reports whether the specific item was found and removed; `remove()` must hand back which item it removed

**Explanation:** The targeted removal only needs a success flag; the unspecified removal must return the item it chose so the caller knows what was taken.

---

## Question 56

**Question:** A student claims "an ADT includes the Big-O costs of each operation." This is:

**Choices:**
- **A.** Fully correct, making it the most efficient choice by design
- **B.** Completely false; costs are never mentioned
- **C.** True only for arrays, as a direct consequence of the structure's shape
- **D.** Partly true—costs are often specified as part of the contract, but the concrete algorithm/data layout is not

**Correct Answer:** Partly true—costs are often specified as part of the contract, but the concrete algorithm/data layout is not

**Explanation:** Many ADT specifications state performance expectations, yet they still hide the specific storage and code that achieves them.

---

## Question 57

**Question:** Which of these is the abstraction, and which is the implementation? `BagInterface` vs `ArrayBag`.

**Choices:**
- **A.** `BagInterface` = abstraction, `ArrayBag` = implementation
- **B.** `BagInterface` = implementation, `ArrayBag` = abstraction
- **C.** Both are abstractions
- **D.** Both are implementations

**Correct Answer:** `BagInterface` = abstraction, `ArrayBag` = implementation

**Explanation:** The interface declares the contract (abstraction); `ArrayBag` provides concrete code (implementation).

---

## Question 58

**Question:** True or false: You can store a `LinkedBag<String>` object in a variable of type `BagInterface<String>`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A class that implements an interface can be referenced by that interface type—the foundation of polymorphic ADT use.

---

## Question 59

**Question:** What is the primary risk of exposing `numberOfEntries` as a public field?

**Choices:**
- **A.** Slower reads, which holds even for empty or degenerate inputs
- **B.** External code could corrupt the invariant between the count and the actual stored elements
- **C.** It cannot be an int, because the elements are always stored contiguously
- **D.** It forces linked implementation

**Correct Answer:** External code could corrupt the invariant between the count and the actual stored elements

**Explanation:** A public count lets clients desynchronize it from the real contents, breaking the bag's internal invariants.

---

## Question 60

**Question:** Which statement about a Set implemented "on top of" a Bag is most accurate?

**Choices:**
- **A.** Impossible—Set and Bag are unrelated
- **B.** A Set requires an array; a Bag requires a list
- **C.** A Set can be built by having `add` first check `contains` and reject duplicates
- **D.** A Set always holds duplicates, and this is true regardless of how the data was built

**Correct Answer:** A Set can be built by having `add` first check `contains` and reject duplicates

**Explanation:** Enforcing uniqueness on top of bag storage (reject if already present) yields set semantics, illustrating ADT layering.

---

## Question 61

**Question:** In the Candy Machine, `makeSale()` coordinating a dispenser and the cash register is an example of:

**Choices:**
- **A.** A static utility
- **B.** An abstract method with no body
- **C.** A constructor, which the definition guarantees in every case
- **D.** A method that delegates to composed objects

**Correct Answer:** A method that delegates to composed objects

**Explanation:** `makeSale()` orchestrates behavior across the composed `Dispenser` and `CashRegister`, delegating subtasks to them.

---

## Question 62

**Question:** True or false: Two ArrayBags with the same elements but different backing-array capacities are logically equal as bags.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Logical bag equality depends on contents and multiplicities, not on backing-array capacity or unused slots.

---

## Question 63

**Question:** Which is the best reason to define `BagInterface<T>` before writing any implementation?

**Choices:**
- **A.** It fixes the contract so multiple interchangeable implementations can be written and tested against it
- **B.** It compiles faster, so no traversal or comparison is ever needed
- **C.** It removes the need for methods
- **D.** It forces array storage, independent of the input size or ordering

**Correct Answer:** It fixes the contract so multiple interchangeable implementations can be written and tested against it

**Explanation:** Defining the interface first pins the behavior, enabling swappable implementations and consistent testing.

---

## Question 64

**Question:** A method `boolean add(T e)` in ArrayBag doubles the array when full and then adds. Under what condition would it ever return `false`?

**Choices:**
- **A.** Whenever the array is full
- **B.** Essentially never, unless a hard cap or memory failure is enforced
- **C.** On every third add, making it the most efficient choice by design
- **D.** When the item is a duplicate

**Correct Answer:** Essentially never, unless a hard cap or memory failure is enforced

**Explanation:** With automatic resizing, adds succeed unless an explicit maximum capacity is imposed or memory is exhausted.

---

## Question 65

**Question:** Which best describes why `contains` cannot be O(1) in a plain bag?

**Choices:**
- **A.** Bags forbid searching, as a direct consequence of the structure's shape
- **B.** Java arrays have no length
- **C.** Without an index/hash, membership requires scanning elements
- **D.** Duplicates make it impossible

**Correct Answer:** Without an index/hash, membership requires scanning elements

**Explanation:** A simple array or linked bag has no hashing, so `contains` must linearly scan, giving O(n).

---

## Question 66

**Question:** True or false: `add` in a bag may need to compare the new entry to existing entries.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** A plain bag allows duplicates, so `add` simply stores the entry without comparing—unlike a set.

---

## Question 67

**Question:** Which of these correctly orders the OO design steps for the Candy Machine tutorial?

**Choices:**
- **A.** Methods → attributes → classes
- **B.** Attributes → methods → classes
- **C.** Interfaces → GUI → database
- **D.** Classes → attributes → methods

**Correct Answer:** Classes → attributes → methods

**Explanation:** Identify the objects/classes first, then the data they hold, then the behaviors they perform.

---

## Question 68

**Question:** A `Dispenser` has attributes `numberOfItems` and `cost`, and a method `makeSale()`. Which is a method precondition worth checking?

**Choices:**
- **A.** `numberOfItems > 0` before dispensing
- **B.** `cost` is a String
- **C.** `cost` is negative
- **D.** The dispenser extends CashRegister

**Correct Answer:** `numberOfItems > 0` before dispensing

**Explanation:** You should not dispense when empty; verifying stock is a sensible precondition.

---

## Question 69

**Question:** True or false: An interface method in `BagInterface<T>` may be declared without a body.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Classic interface methods are implicitly abstract and have no body; implementers supply the code.

---

## Question 70

**Question:** Which statement about generic bags and primitives is correct?

**Choices:**
- **A.** `BagInterface<int>` is legal, which holds even for empty or degenerate inputs
- **B.** You must use wrapper types like `BagInterface<Integer>` because generics require reference types
- **C.** Generics work only with primitives
- **D.** Bags cannot store numbers at all, because the elements are always stored contiguously

**Correct Answer:** You must use wrapper types like `BagInterface<Integer>` because generics require reference types

**Explanation:** Java generics do not accept primitive type arguments; wrappers (`Integer`, `Double`) are used, with autoboxing.

---

## Question 71

**Question:** Consider `bag.add(a); bag.add(a); bag.remove();`. What can you say about `getFrequencyOf(a)` afterward?

**Choices:**
- **A.** It is exactly 2
- **B.** It is always 0, and this is true regardless of how the data was built
- **C.** It is 1 if `remove()` happened to remove an `a`, otherwise 2
- **D.** It is undefined and could be negative

**Correct Answer:** It is 1 if `remove()` happened to remove an `a`, otherwise 2

**Explanation:** `remove()` picks an unspecified item; if the bag holds only `a`s it must be an `a`, but in general the outcome depends on which item is removed. (Here the bag only contains two `a`s, so it becomes 1.)

---

## Question 72

**Question:** The most important invariant an ArrayBag must maintain is:

**Choices:**
- **A.** The array is always sorted, so no traversal or comparison is ever needed
- **B.** No duplicates exist, which the definition guarantees in every case
- **C.** The array length never changes
- **D.** Elements occupy indices `0..numberOfEntries-1` and `numberOfEntries` reflects the true count

**Correct Answer:** Elements occupy indices `0..numberOfEntries-1` and `numberOfEntries` reflects the true count

**Explanation:** Keeping used elements packed at the front and the count accurate is the core invariant enabling correct operations.

---

## Question 73

**Question:** True or false: Choosing the ADT (Bag) commits you to a particular time complexity for `contains`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** The ADT fixes behavior, not complexity; a hashed implementation could make `contains` O(1) while a plain one is O(n).

---

## Question 74

**Question:** Which is the cleanest way for `TestBag` client code to switch from array to linked storage?

**Choices:**
- **A.** Change only the `new ArrayBag<>()` to `new LinkedBag<>()`, keeping the `BagInterface` variable type
- **B.** Rewrite every method call, independent of the input size or ordering
- **C.** Change the interface definition, making it the most efficient choice by design
- **D.** It is impossible without recompiling the JVM

**Correct Answer:** Change only the `new ArrayBag<>()` to `new LinkedBag<>()`, keeping the `BagInterface` variable type

**Explanation:** Programming to the interface localizes the change to the single instantiation site.

---

## Question 75

**Question:** A bag operation `union(other)` that returns a new bag containing all items of both. Its size equals:

**Choices:**
- **A.** max of the two sizes
- **B.** sum of the two sizes
- **C.** number of distinct items
- **D.** min of the two sizes

**Correct Answer:** sum of the two sizes

**Explanation:** For multisets, union adds multiplicities, so the combined size is the sum of the individual sizes.

---

## Question 76

**Question:** True or false: `intersection` of two bags keeps, for each item, the minimum of the two frequencies.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Multiset intersection uses the minimum multiplicity of each element across the two bags.

---

## Question 77

**Question:** For `difference(other)` (this minus other) on bags, the frequency of an item is:

**Choices:**
- **A.** `freqThis + freqOther`
- **B.** `min(freqThis, freqOther)`
- **C.** `max(0, freqThis - freqOther)`
- **D.** always 0

**Correct Answer:** `max(0, freqThis - freqOther)`

**Explanation:** Multiset difference subtracts multiplicities but cannot go below zero.

---

## Question 78

**Question:** Which is a correct statement about the relationship between `BagInterface` and `ArrayBag`/`LinkedBag`?

**Choices:**
- **A.** `ArrayBag` extends `LinkedBag`
- **B.** `BagInterface` extends both classes
- **C.** They are unrelated types, as a direct consequence of the structure's shape
- **D.** Both `ArrayBag` and `LinkedBag` implement `BagInterface`

**Correct Answer:** Both `ArrayBag` and `LinkedBag` implement `BagInterface`

**Explanation:** The two concrete classes each implement the shared interface, making them interchangeable under the interface type.

---

## Question 79

**Question:** Why is it useful that `add` in the interface accepts `T` rather than `Object`?

**Choices:**
- **A.** It provides compile-time type checking so wrong-typed items are rejected before runtime
- **B.** It runs faster, which holds even for empty or degenerate inputs
- **C.** It allows any type at once
- **D.** It disables generics, because the elements are always stored contiguously

**Correct Answer:** It provides compile-time type checking so wrong-typed items are rejected before runtime

**Explanation:** Typing to `T` catches type errors at compile time and removes the need for casts on retrieval.

---

## Question 80

**Question:** A bag stores 1,000,000 items in an array that was never resized past 16. What went wrong?

**Choices:**
- **A.** Nothing; arrays auto-grow
- **B.** The resize logic is missing or broken
- **C.** The bag became a set
- **D.** Java increased the array automatically

**Correct Answer:** The resize logic is missing or broken

**Explanation:** Java arrays do not auto-grow; without correct resize logic, storing far more than capacity is impossible or causes bugs.

---

## Question 81

**Question:** True or false: The order of `add` calls can influence what `toArray()` returns, even though a bag is "unordered."

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** "Unordered" means order is not part of the contract, but a given implementation may still reflect insertion order in `toArray()`—clients just cannot rely on it.

---

## Question 82

**Question:** Which describes the purpose of a `Dispenser` class separate from `CandyMachine`?

**Choices:**
- **A.** To duplicate the machine's logic
- **B.** To store the cash, and this is true regardless of how the data was built
- **C.** To encapsulate per-product stock and cost, promoting reuse and single responsibility
- **D.** To replace the interface, which the definition guarantees in every case

**Correct Answer:** To encapsulate per-product stock and cost, promoting reuse and single responsibility

**Explanation:** Separating `Dispenser` gives each product its own state and behavior, following single-responsibility and enabling reuse across products.

---

## Question 83

**Question:** True or false: `clear()` on a LinkedBag typically just sets the head reference to null (and size to 0).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Dropping the head reference makes all nodes unreachable for garbage collection; resetting size to 0 completes the clear.

---

## Question 84

**Question:** Which of these best reflects "an ADT hides representation but exposes behavior"?

**Choices:**
- **A.** Public fields, private methods
- **B.** Everything public
- **C.** Everything private including operations
- **D.** Private data with public operations

**Correct Answer:** Private data with public operations

**Explanation:** Hiding the representation (private data) while exposing behavior (public operations) is the essence of ADT encapsulation.

---

## Question 85

**Question:** If `add` returns `boolean` and you ignore the result on a fixed-capacity bag, what bug can arise?

**Choices:**
- **A.** You may believe an item was added when it silently failed due to fullness
- **B.** The bag sorts itself
- **C.** The item is added twice
- **D.** The bag is cleared, so no traversal or comparison is ever needed

**Correct Answer:** You may believe an item was added when it silently failed due to fullness

**Explanation:** Ignoring the success flag hides failed adds on a full fixed-capacity bag, causing silent data loss.

---

## Question 86

**Question:** Which statement correctly contrasts a Bag ADT with a List ADT?

**Choices:**
- **A.** Both provide positional access by index
- **B.** A List provides positional/order semantics; a Bag does not
- **C.** A Bag forbids duplicates; a List allows them
- **D.** They are the same ADT, independent of the input size or ordering

**Correct Answer:** A List provides positional/order semantics; a Bag does not

**Explanation:** Lists define element positions and order; bags are unordered multisets without indexing.

---

## Question 87

**Question:** True or false: You can implement `getFrequencyOf` by calling `toArray()` and counting matches.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Iterating the array from `toArray()` and counting equal elements yields the frequency, though a direct internal scan avoids the extra copy.

---

## Question 88

**Question:** In a resizing ArrayBag, forgetting to copy old elements into the new larger array causes:

**Choices:**
- **A.** A faster bag, making it the most efficient choice by design
- **B.** Duplicated elements
- **C.** Loss of all previously stored elements
- **D.** A compile error

**Correct Answer:** Loss of all previously stored elements

**Explanation:** Allocating a new array without copying discards the old contents, wiping the bag's data.

---

## Question 89

**Question:** Which is the strongest argument that ADTs improve maintainability?

**Choices:**
- **A.** They make code shorter, as a direct consequence of the structure's shape
- **B.** They eliminate all bugs
- **C.** They remove the need for testing
- **D.** They localize implementation changes behind a stable interface

**Correct Answer:** They localize implementation changes behind a stable interface

**Explanation:** A stable operation contract insulates client code from internal changes, a core maintainability benefit.

---

## Question 90

**Question:** A `CashRegister` method `acceptAmount(int deposited)` and `returnChange(int cost)` model which real behaviors?

**Choices:**
- **A.** Taking payment and giving change—behaviors coordinating money state
- **B.** Attributes only, which holds even for empty or degenerate inputs
- **C.** Inheritance from Dispenser
- **D.** Interface declarations only

**Correct Answer:** Taking payment and giving change—behaviors coordinating money state

**Explanation:** These are methods that manipulate the register's money state to complete a transaction.

---

## Question 91

**Question:** True or false: A single class can implement `BagInterface<String>` and also implement another interface simultaneously.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Java allows a class to implement multiple interfaces, so a bag implementation can also implement, say, `Iterable<String>`.

---

## Question 92

**Question:** Which best explains why `remove()` (no-arg) is sometimes considered "nondeterministic" from the client's view?

**Choices:**
- **A.** It uses random numbers by requirement
- **B.** The ADT does not specify which item is removed
- **C.** It always removes the largest item
- **D.** It removes nothing

**Correct Answer:** The ADT does not specify which item is removed

**Explanation:** The contract permits any item to be removed, so clients cannot predict which one without knowing the implementation.

---

## Question 93

**Question:** For an ArrayBag, which `add` placement is O(1) (amortized) and why?

**Choices:**
- **A.** Insert at index 0, shifting everything right
- **B.** Insert in sorted position
- **C.** Append at index `numberOfEntries`, then increment the count
- **D.** Insert at a random index, because the elements are always stored contiguously

**Correct Answer:** Append at index `numberOfEntries`, then increment the count

**Explanation:** Appending at the end avoids shifting, giving O(1) amortized adds; front insertion would be O(n) due to shifting.

---

## Question 94

**Question:** True or false: An ADT can specify preconditions (e.g., "bag must be non-empty for remove()").

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** ADT contracts commonly include preconditions and postconditions defining valid usage and guaranteed effects.

---

## Question 95

**Question:** Which is the correct relationship between "abstraction" and "information hiding"?

**Choices:**
- **A.** They are unrelated, and this is true regardless of how the data was built
- **B.** Information hiding exposes all fields
- **C.** Abstraction requires public data, which the definition guarantees in every case
- **D.** Abstraction focuses on essential behavior; information hiding conceals implementation details—together they support ADTs

**Correct Answer:** Abstraction focuses on essential behavior; information hiding conceals implementation details—together they support ADTs

**Explanation:** Abstraction highlights what matters (operations) while information hiding conceals how it works (representation); ADTs use both.

---

## Question 96

**Question:** A bag exposes `Iterator<T> iterator()`. Modifying the bag during iteration typically risks:

**Choices:**
- **A.** A `ConcurrentModificationException` or undefined behavior
- **B.** Faster iteration, so no traversal or comparison is ever needed
- **C.** Automatic re-sorting
- **D.** Nothing—always safe

**Correct Answer:** A `ConcurrentModificationException` or undefined behavior

**Explanation:** Structural modification during iteration commonly invalidates the iterator, causing exceptions or undefined results.

---

## Question 97

**Question:** Which correctly states the effect of `add` on `getCurrentSize()` for a successful add?

**Choices:**
- **A.** Size stays the same
- **B.** Size increases by exactly one
- **C.** Size doubles
- **D.** Size decreases by one

**Correct Answer:** Size increases by exactly one

**Explanation:** A successful add stores one more element, incrementing the count by one.

---

## Question 98

**Question:** True or false: A LinkedBag needs a `previous` pointer in each node to support the studied bag operations.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** A singly linked node (data + next) suffices for bag operations; a previous pointer is unnecessary given order does not matter.

---

## Question 99

**Question:** Which most accurately explains why bags are called "multisets" in mathematics?

**Choices:**
- **A.** They store multiple types, making it the most efficient choice by design
- **B.** They must contain at least two elements
- **C.** They are sets that allow multiple copies (multiplicities) of the same element
- **D.** They are ordered sets, independent of the input size or ordering

**Correct Answer:** They are sets that allow multiple copies (multiplicities) of the same element

**Explanation:** A multiset generalizes a set by tracking how many times each element occurs, exactly the bag's semantics.

---

## Question 100

**Question:** Final synthesis: A team switches a `Bag`'s storage from array to linked list and observes that a tight loop calling `contains` in a hot path became slower on large inputs, despite identical ADT behavior. The best explanation is:

**Choices:**
- **A.** The ADT contract changed, as a direct consequence of the structure's shape
- **B.** Linked lists make `contains` O(log n), which holds even for empty or degenerate inputs
- **C.** The array version was O(1) for `contains`
- **D.** Both are O(n) for `contains`, but the linked list's pointer-chasing has worse cache locality

**Correct Answer:** Both are O(n) for `contains`, but the linked list's pointer-chasing has worse cache locality

**Explanation:** The asymptotic cost is the same, but arrays have contiguous, cache-friendly memory while linked lists chase scattered pointers, hurting real-world constant factors even under an unchanged ADT.

---

### Answer distribution (self-check)
Correct answers are spread across A/B/C/D and are frequently not the longest option (e.g., short factual answers). True/False items alternate outcomes throughout.
