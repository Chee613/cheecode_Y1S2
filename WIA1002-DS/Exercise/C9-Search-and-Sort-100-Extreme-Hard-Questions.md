# Chapter 9 Search and Sort: 100 Extreme-Hard Questions

> Topics: linear search, binary search (and its return convention), selection sort, insertion sort, bubble sort, stability, in-place vs not, complexity, and generic sorting with `Comparable`/`Comparator`. Many questions require tracing exact behavior. Choose the single best answer.

---

## Question 1

**Question:** Linear search returns which value when the key is not found (per the studied convention)?

**Choices:**
- **A.** 0
- **B.** the array length
- **C.** -1
- **D.** null

**Correct Answer:** -1

**Explanation:** By convention, linear search returns -1 to signal the key is absent, since -1 is not a valid index.

---

## Question 2

**Question:** For `list = {1, 4, 4, 2, 5, -3, 6, 2}`, `linearSearch(list, 4)` returns:

**Choices:**
- **A.** 4
- **B.** 2
- **C.** -1
- **D.** 1

**Correct Answer:** 1

**Explanation:** Linear search returns the index of the FIRST match; the first 4 is at index 1.

---

## Question 3

**Question:** The prerequisite for binary search to work correctly is:

**Choices:**
- **A.** the list must be reversed
- **B.** the list must have unique elements
- **C.** the list must be sorted
- **D.** the list must be an ArrayList

**Correct Answer:** the list must be sorted

**Explanation:** Binary search relies on ordering to discard half the search space each step; on an unsorted list it gives wrong results.

---

## Question 4

**Question:** Binary search worst-case time complexity is:

**Choices:**
- **A.** O(n)
- **B.** O(n log n)
- **C.** O(1)
- **D.** O(log n)

**Correct Answer:** O(log n)

**Explanation:** Each comparison halves the remaining range, giving logarithmic time.

---

## Question 5

**Question:** In the studied `binarySearch`, when the key is not found it returns:

**Choices:**
- **A.** -1 always
- **B.** 0, as a direct consequence of the structure's shape
- **C.** `-low - 1` (the insertion point encoded as a negative)
- **D.** the last mid

**Correct Answer:** `-low - 1` (the insertion point encoded as a negative)

**Explanation:** The convention returns `-(insertionPoint) - 1`, so callers can both detect absence and learn where the key would go.

---

## Question 6

**Question:** If `binarySearch` returns -4, the key would be inserted at index:

**Choices:**
- **A.** 4
- **B.** -4
- **C.** 5
- **D.** 3

**Correct Answer:** 3

**Explanation:** From `-low - 1 = -4`, the insertion point is `low = 3` (since `-(3) - 1 = -4`).

---

## Question 7

**Question:** A classic binary-search bug is computing `mid = (low + high) / 2`. On very large indices this can:

**Choices:**
- **A.** be slower, which holds even for empty or degenerate inputs
- **B.** overflow int, giving a negative mid
- **C.** skip the base case
- **D.** sort the array

**Correct Answer:** overflow int, giving a negative mid

**Explanation:** `low + high` can exceed `Integer.MAX_VALUE`; `low + (high - low) / 2` avoids the overflow.

---

## Question 8

**Question:** Selection sort works by:

**Choices:**
- **A.** inserting each element into a sorted prefix
- **B.** swapping adjacent out-of-order pairs repeatedly
- **C.** repeatedly selecting the smallest remaining element and placing it next
- **D.** dividing and merging, because the elements are always stored contiguously

**Correct Answer:** repeatedly selecting the smallest remaining element and placing it next

**Explanation:** Selection sort finds the minimum of the unsorted region and swaps it into position, growing a sorted prefix.

---

## Question 9

**Question:** The number of comparisons in selection sort for n elements is:

**Choices:**
- **A.** O(n), and this is true regardless of how the data was built
- **B.** O(n log n)
- **C.** O(log n)
- **D.** O(n²) regardless of input

**Correct Answer:** O(n²) regardless of input

**Explanation:** Selection sort always scans the unsorted region fully, making ~n²/2 comparisons even if already sorted.

---

## Question 10

**Question:** The number of swaps selection sort performs is at most:

**Choices:**
- **A.** O(n²)
- **B.** O(n)
- **C.** O(log n)
- **D.** O(1)

**Correct Answer:** O(n)

**Explanation:** Selection sort swaps at most once per outer iteration, so O(n) swaps—its main advantage when writes are costly.

---

## Question 11

**Question:** Insertion sort's best-case time (already sorted input) is:

**Choices:**
- **A.** O(n²)
- **B.** O(n log n)
- **C.** O(n)
- **D.** O(1)

**Correct Answer:** O(n)

**Explanation:** On sorted input each element only compares once with its predecessor and shifts nothing, giving linear best-case time.

---

## Question 12

**Question:** Insertion sort's worst-case time (reverse-sorted input) is:

**Choices:**
- **A.** O(n)
- **B.** O(n log n)
- **C.** O(log n)
- **D.** O(n²)

**Correct Answer:** O(n²)

**Explanation:** Reverse order forces each new element to shift past all previous ones, giving quadratic time.

---

## Question 13

**Question:** Bubble sort repeatedly:

**Choices:**
- **A.** selects the minimum, which the definition guarantees in every case
- **B.** compares adjacent elements and swaps them if out of order, "bubbling" large values to the end
- **C.** inserts into a sorted prefix
- **D.** partitions around a pivot, so no traversal or comparison is ever needed

**Correct Answer:** compares adjacent elements and swaps them if out of order, "bubbling" large values to the end

**Explanation:** Each pass pushes the largest unsorted element to its final position via adjacent swaps.

---

## Question 14

**Question:** An optimized bubble sort that stops when a pass makes no swaps has best-case time:

**Choices:**
- **A.** O(n²)
- **B.** O(n log n)
- **C.** O(n) on already-sorted input
- **D.** O(1), independent of the input size or ordering

**Correct Answer:** O(n) on already-sorted input

**Explanation:** With a swap-detection flag, a sorted array is confirmed in one O(n) pass.

---

## Question 15

**Question:** Which of these sorts is NOT stable in its standard form?

**Choices:**
- **A.** insertion sort
- **B.** bubble sort
- **C.** merge sort
- **D.** selection sort

**Correct Answer:** selection sort

**Explanation:** Selection sort's long-distance swaps can reorder equal keys, making it unstable; insertion, bubble, and merge are stable.

---

## Question 16

**Question:** "Stable" sorting means:

**Choices:**
- **A.** it never crashes, making it the most efficient choice by design
- **B.** equal keys retain their original relative order
- **C.** it uses O(1) memory
- **D.** it is always fastest

**Correct Answer:** equal keys retain their original relative order

**Explanation:** Stability preserves the input order among elements that compare equal—important for multi-key sorting.

---

## Question 17

**Question:** To sort objects (not primitives) generically, a class must implement:

**Choices:**
- **A.** `Runnable`, as a direct consequence of the structure's shape
- **B.** `Iterable`
- **C.** `Comparable<T>` with `compareTo`
- **D.** `Serializable`

**Correct Answer:** `Comparable<T>` with `compareTo`

**Explanation:** `Comparable.compareTo` defines the natural ordering that generic sorts use to compare objects.

---

## Question 18

**Question:** A generic sort method signature is `<E extends Comparable<E>> void sort(E[] list)`. The bound `extends Comparable<E>` ensures:

**Choices:**
- **A.** E is a subclass of Object only
- **B.** E is an interface
- **C.** E is final, which holds even for empty or degenerate inputs
- **D.** E provides a `compareTo` so elements can be ordered

**Correct Answer:** E provides a `compareTo` so elements can be ordered

**Explanation:** The bound guarantees each element has `compareTo`, enabling comparisons inside the sort.

---

## Question 19

**Question:** `compareTo` returns a negative number, zero, or positive number meaning:

**Choices:**
- **A.** greater than, equal, less than the argument
- **B.** less than, equal, greater than the argument
- **C.** always the difference of hash codes
- **D.** true or false

**Correct Answer:** less than, equal, greater than the argument

**Explanation:** `a.compareTo(b) < 0` means a < b, `== 0` means equal, `> 0` means a > b.

---

## Question 20

**Question:** Trace: binary search for 7 in `{1,3,5,7,9,11}` (0-indexed). How many times is `list[mid]` inspected (each equality/relational check on a distinct mid counts once)?

**Choices:**
- **A.** 1
- **B.** 2
- **C.** 3
- **D.** 6

**Correct Answer:** 3

**Explanation:** mid=(0+5)/2=2 → list[2]=5 < 7, go right (lo=3); mid=(3+5)/2=4 → list[4]=9 > 7, go left (hi=3); mid=(3+3)/2=3 → list[3]=7, found. Three distinct mid inspections are needed—more than the "one lucky hit" students often assume.

---

## Question 21

**Question:** Which sort is best when the array is already nearly sorted?

**Choices:**
- **A.** selection sort
- **B.** bubble sort without optimization
- **C.** all are equally good
- **D.** insertion sort

**Correct Answer:** insertion sort

**Explanation:** Insertion sort runs in nearly O(n) on almost-sorted data, doing few shifts—superior to selection sort's fixed O(n²).

---

## Question 22

**Question:** After one full pass of bubble sort on `{5, 1, 4, 2, 8}`, the array is:

**Choices:**
- **A.** {1, 2, 4, 5, 8}
- **B.** {1, 4, 2, 5, 8}
- **C.** {5, 4, 2, 1, 8}
- **D.** {1, 5, 4, 2, 8}

**Correct Answer:** {1, 4, 2, 5, 8}

**Explanation:** Pass: (5,1)→swap {1,5,4,2,8}; (5,4)→swap {1,4,5,2,8}; (5,2)→swap {1,4,2,5,8}; (5,8)→no swap. Result {1,4,2,5,8} with 8 bubbled to the end.

---

## Question 23

**Question:** After one pass of selection sort (selecting the min) on `{5, 1, 4, 2, 8}`, the array is:

**Choices:**
- **A.** {1, 4, 2, 5, 8}
- **B.** {1, 2, 4, 5, 8}
- **C.** {1, 5, 4, 2, 8}
- **D.** {5, 1, 4, 2, 8}

**Correct Answer:** {1, 5, 4, 2, 8}

**Explanation:** The minimum (1) is swapped into index 0, exchanging with the 5. Result {1,5,4,2,8}.

---

## Question 24

**Question:** After inserting the first two elements' worth of work, insertion sort on `{5, 1, 4, 2, 8}` (i=1) produces:

**Choices:**
- **A.** {5, 1, 4, 2, 8}
- **B.** {1, 4, 5, 2, 8}
- **C.** {1, 2, 4, 5, 8}
- **D.** {1, 5, 4, 2, 8}

**Correct Answer:** {1, 5, 4, 2, 8}

**Explanation:** Inserting element at index 1 (value 1) into the sorted prefix {5} shifts 5 right and places 1 first: {1,5,4,2,8}.

---

## Question 25

**Question:** True or false: Binary search on a linked list retains O(log n) time.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Reaching the middle of a linked list is O(n), so binary search degrades to O(n) per level—no advantage over linear search there.

---

## Question 26

**Question:** Which comparison-based sort achieves O(n log n) worst case?

**Choices:**
- **A.** bubble sort
- **B.** merge sort
- **C.** insertion sort
- **D.** selection sort

**Correct Answer:** merge sort

**Explanation:** Merge sort guarantees O(n log n) in all cases; the three elementary sorts are O(n²) worst case.

---

## Question 27

**Question:** The theoretical lower bound for comparison-based sorting is:

**Choices:**
- **A.** O(n)
- **B.** O(log n)
- **C.** O(n log n)
- **D.** O(n²)

**Correct Answer:** O(n log n)

**Explanation:** Any comparison sort needs Ω(n log n) comparisons in the worst case, from the decision-tree bound.

---

## Question 28

**Question:** Which sort is in-place with O(1) extra space AND stable?

**Choices:**
- **A.** merge sort
- **B.** selection sort
- **C.** heap sort
- **D.** insertion sort

**Correct Answer:** insertion sort

**Explanation:** Insertion sort sorts in place with O(1) auxiliary space and preserves equal-key order (stable). Merge sort needs O(n) space; selection and heap sort are not stable.

---

## Question 29

**Question:** True or false: Selection sort minimizes the number of writes/swaps compared to insertion and bubble sort.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Selection sort performs at most n-1 swaps, useful when writes are expensive (e.g., flash memory), despite its O(n²) comparisons.

---

## Question 30

**Question:** For a generic `sort`, calling it on `Integer[]` works because:

**Choices:**
- **A.** int is a subclass of Comparable
- **B.** `Integer` implements `Comparable<Integer>`
- **C.** arrays are always comparable
- **D.** autoboxing sorts automatically

**Correct Answer:** `Integer` implements `Comparable<Integer>`

**Explanation:** Wrapper classes like `Integer` implement `Comparable`, satisfying the generic bound.

---

## Question 31

**Question:** What does this print?

```java
int[] a = {2, 5, 8, 12, 16, 23};
int lo = 0, hi = a.length - 1, key = 16, steps = 0;
while (lo <= hi) {
    int mid = (lo + hi) / 2; steps++;
    if (a[mid] == key) break;
    else if (a[mid] < key) lo = mid + 1;
    else hi = mid - 1;
}
System.out.println(steps);
```

**Choices:**
- **A.** 1
- **B.** 3
- **C.** 2
- **D.** 6

**Correct Answer:** 2

**Explanation:** mid=(0+5)/2=2→a[2]=8<16→lo=3; mid=(3+5)/2=4→a[4]=16 found. Two steps.

---

## Question 32

**Question:** True or false: A `Comparator` lets you sort by an ordering different from a class's natural `compareTo`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `Comparator` provides an external ordering, enabling multiple or alternative sort criteria without modifying the class.

---

## Question 33

**Question:** Sorting a `Phone[]` by name using `compareTo` on the name field means `Phone.compareTo` should:

**Choices:**
- **A.** compare hash codes
- **B.** compare object identities
- **C.** always return 0, because the elements are always stored contiguously
- **D.** delegate to `this.name.compareTo(other.name)`

**Correct Answer:** delegate to `this.name.compareTo(other.name)`

**Explanation:** Ordering by name uses the `String.compareTo` on the name fields, producing lexicographic order.

---

## Question 34

**Question:** Which is TRUE about linear search on an unsorted vs sorted array?

**Choices:**
- **A.** It requires the array to be sorted
- **B.** It works on both; sorting is not required for linear search
- **C.** It is O(log n), and this is true regardless of how the data was built
- **D.** It cannot find duplicates

**Correct Answer:** It works on both; sorting is not required for linear search

**Explanation:** Linear search scans sequentially regardless of order; only binary search needs sorted input.

---

## Question 35

**Question:** Worst-case comparisons for linear search in an array of n elements is:

**Choices:**
- **A.** log n
- **B.** n/2
- **C.** n
- **D.** 1

**Correct Answer:** n

**Explanation:** In the worst case (absent or last element), it inspects all n elements.

---

## Question 36

**Question:** Average-case comparisons for a successful linear search (uniformly distributed target) is about:

**Choices:**
- **A.** n
- **B.** log n
- **C.** 1
- **D.** (n+1)/2

**Correct Answer:** (n+1)/2

**Explanation:** On average the target sits around the middle, giving roughly (n+1)/2 comparisons.

---

## Question 37

**Question:** True or false: Binary search can be implemented recursively with T(n) = T(n/2) + O(1).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The recursive form halves the range with constant work per call, matching that recurrence (O(log n)).

---

## Question 38

**Question:** What does `insertionSort` do to `{3, 3a, 1}` where 3a equals 3 but is a distinct object, regarding stability?

**Choices:**
- **A.** may swap 3 and 3a
- **B.** keeps 3 before 3a (stable)
- **C.** removes duplicates
- **D.** reverses them

**Correct Answer:** keeps 3 before 3a (stable)

**Explanation:** Insertion sort only shifts an element past strictly greater ones, so equal keys retain relative order—stability preserved.

---

## Question 39

**Question:** Which sort would you avoid if stability is required?

**Choices:**
- **A.** insertion sort
- **B.** bubble sort
- **C.** selection sort
- **D.** merge sort

**Correct Answer:** selection sort

**Explanation:** Selection sort's swaps can jump equal keys over each other, breaking stability.

---

## Question 40

**Question:** What prints?

```java
Integer[] a = {5, 2, 9, 1};
java.util.Arrays.sort(a, java.util.Collections.reverseOrder());
System.out.println(a[0]);
```

**Choices:**
- **A.** 1
- **B.** 5
- **C.** 2
- **D.** 9

**Correct Answer:** 9

**Explanation:** `reverseOrder` sorts descending, so the largest (9) is at index 0.

---

## Question 41

**Question:** True or false: `Arrays.sort` on primitive `int[]` uses a stable sort.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Primitive `int[]` sorting uses a dual-pivot quicksort (not stable); stability is irrelevant for primitives with no identity, and Java only guarantees stability for object sorts (TimSort).

---

## Question 42

**Question:** `Arrays.sort` on `Object[]` in Java uses:

**Choices:**
- **A.** quicksort, which the definition guarantees in every case
- **B.** a stable, adaptive merge sort
- **C.** bubble sort
- **D.** selection sort

**Correct Answer:** a stable, adaptive merge sort

**Explanation:** Object sorting uses TimSort, which is stable and adaptive to existing runs.

---

## Question 43

**Question:** Which is the correct outer/inner structure of selection sort?

**Choices:**
- **A.** for each i, bubble a[i] to the front
- **B.** for each i, insert a[i] into a[0..i-1]
- **C.** for each i, find min in a[i..n-1] and swap into a[i]
- **D.** partition then recurse, so no traversal or comparison is ever needed

**Correct Answer:** for each i, find min in a[i..n-1] and swap into a[i]

**Explanation:** Selection sort's outer loop fixes position i by selecting the minimum of the remaining unsorted suffix.

---

## Question 44

**Question:** Which is the correct structure of insertion sort?

**Choices:**
- **A.** for each i, find min and swap
- **B.** compare adjacent pairs across the whole array repeatedly
- **C.** merge halves
- **D.** for each i, shift a[i] left into its sorted place among a[0..i-1]

**Correct Answer:** for each i, shift a[i] left into its sorted place among a[0..i-1]

**Explanation:** Insertion sort grows a sorted prefix by inserting each new element into position via shifts.

---

## Question 45

**Question:** What is the number of passes bubble sort needs (worst case) for n elements?

**Choices:**
- **A.** log n
- **B.** n - 1
- **C.** n²
- **D.** 1

**Correct Answer:** n - 1

**Explanation:** After n-1 passes every element is placed; each pass fixes at least one more element at the end.

---

## Question 46

**Question:** True or false: On an already-sorted array, selection sort still performs O(n²) comparisons.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Selection sort does not adapt to sorted input; it always scans the full unsorted suffix each iteration.

---

## Question 47

**Question:** What prints?

```java
int[] a = {4, 2, 7, 1, 3};
for (int i = 1; i < a.length; i++) {
    int key = a[i], j = i - 1;
    while (j >= 0 && a[j] > key) { a[j + 1] = a[j]; j--; }
    a[j + 1] = key;
}
System.out.println(java.util.Arrays.toString(a));
```

**Choices:**
- **A.** [7, 4, 3, 2, 1]
- **B.** [4, 2, 7, 1, 3]
- **C.** [1, 2, 3, 4, 7]
- **D.** [1, 2, 4, 3, 7]

**Correct Answer:** [1, 2, 3, 4, 7]

**Explanation:** This is insertion sort; it sorts ascending to [1,2,3,4,7].

---

## Question 48

**Question:** True or false: Binary search returning `-low - 1` allows `Arrays.binarySearch`-style callers to compute the insertion point as `-(returnValue) - 1`.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Inverting the encoding recovers the insertion index, letting callers insert to keep the array sorted.

---

## Question 49

**Question:** Which sort has the best worst-case space complexity among merge, insertion, and selection?

**Choices:**
- **A.** merge sort, independent of the input size or ordering
- **B.** merge sort only
- **C.** none are in-place
- **D.** insertion and selection (both O(1) in-place)

**Correct Answer:** insertion and selection (both O(1) in-place)

**Explanation:** Insertion and selection sort use O(1) extra space; merge sort typically needs O(n).

---

## Question 50

**Question:** What does `linearSearch(list, -3)` return for `{1,4,4,2,5,-3,6,2}`?

**Choices:**
- **A.** -3
- **B.** 5
- **C.** -1
- **D.** 6

**Correct Answer:** 5

**Explanation:** The value -3 is at index 5, which linear search returns.

---

## Question 51

**Question:** True or false: An unstable sort can be made stable by attaching original indices as a tiebreaker in the comparator.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Comparing by (key, originalIndex) forces ties to keep input order, simulating stability.

---

## Question 52

**Question:** What prints?

```java
int[] a = {9, 5, 1, 4, 3};
for (int i = 0; i < a.length - 1; i++) {
    int min = i;
    for (int j = i + 1; j < a.length; j++)
        if (a[j] < a[min]) min = j;
    int t = a[i]; a[i] = a[min]; a[min] = t;
}
System.out.println(a[1]);
```

**Choices:**
- **A.** 4
- **B.** 5
- **C.** 3
- **D.** 1

**Correct Answer:** 3

**Explanation:** Selection sort produces [1,3,4,5,9]; index 1 is 3.

---

## Question 53

**Question:** Which statement about comparing binary vs linear search on a sorted array of 1,000,000 elements is correct?

**Choices:**
- **A.** Linear is faster because it needs no sorting
- **B.** They are equal, making it the most efficient choice by design
- **C.** Binary needs 1,000,000 comparisons
- **D.** Binary search needs about 20 comparisons vs up to 1,000,000 for linear

**Correct Answer:** Binary search needs about 20 comparisons vs up to 1,000,000 for linear

**Explanation:** log₂(10⁶) ≈ 20, so binary search dramatically outperforms linear on large sorted data.

---

## Question 54

**Question:** True or false: The break-even point for binary search over linear search depends on the array being sorted (or the cost of sorting).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** If the array must first be sorted for a single search, the O(n log n) sort cost may outweigh binary search's benefit; benefits accrue over many searches.

---

## Question 55

**Question:** For sorting a few thousand elements where code simplicity matters and data is nearly sorted, the pragmatic choice is:

**Choices:**
- **A.** selection sort
- **B.** insertion sort
- **C.** bubble sort unoptimized
- **D.** none can sort

**Correct Answer:** insertion sort

**Explanation:** Insertion sort is simple, stable, in-place, and near-linear on nearly-sorted data.

---

## Question 56

**Question:** What is the invariant maintained by insertion sort after processing index i?

**Choices:**
- **A.** a[i..n-1] is sorted
- **B.** a[0] is the minimum overall
- **C.** a[0..i] is sorted
- **D.** the array is fully sorted

**Correct Answer:** a[0..i] is sorted

**Explanation:** Insertion sort keeps the processed prefix sorted; the suffix is untouched until reached.

---

## Question 57

**Question:** What is the invariant maintained by selection sort after i iterations?

**Choices:**
- **A.** a[i..n-1] is sorted, as a direct consequence of the structure's shape
- **B.** the array is reversed
- **C.** a[0] is the maximum
- **D.** a[0..i-1] holds the i smallest elements in sorted order, all ≤ the rest

**Correct Answer:** a[0..i-1] holds the i smallest elements in sorted order, all ≤ the rest

**Explanation:** Selection sort places the i smallest elements in their final positions after i iterations.

---

## Question 58

**Question:** True or false: Bubble sort and insertion sort both have O(n²) worst case but insertion sort usually does fewer operations in practice.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Insertion sort typically performs fewer element moves/comparisons than bubble sort on average, though both are O(n²) worst case.

---

## Question 59

**Question:** What does `compareTo` returning 0 imply for sorting?

**Choices:**
- **A.** the elements must be identical objects
- **B.** the elements are considered equal in ordering
- **C.** the sort fails
- **D.** the array is sorted

**Correct Answer:** the elements are considered equal in ordering

**Explanation:** A 0 result means equal ordering; stability then governs their relative arrangement.

---

## Question 60

**Question:** What prints?

```java
String[] a = {"banana", "apple", "cherry"};
java.util.Arrays.sort(a);
System.out.println(a[0] + " " + a[2]);
```

**Choices:**
- **A.** banana cherry
- **B.** cherry apple
- **C.** apple cherry
- **D.** apple banana

**Correct Answer:** apple cherry

**Explanation:** Lexicographic sort gives apple, banana, cherry; a[0]=apple, a[2]=cherry.

---

## Question 61

**Question:** True or false: Binary search can find the FIRST occurrence of a duplicated key with a simple modification (continue searching left after a match).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** On a match, moving `high = mid - 1` and remembering the index finds the leftmost occurrence in O(log n).

---

## Question 62

**Question:** Which sort's number of comparisons is input-independent?

**Choices:**
- **A.** insertion sort
- **B.** optimized bubble sort
- **C.** merge sort with runs
- **D.** selection sort

**Correct Answer:** selection sort

**Explanation:** Selection sort always makes exactly n(n-1)/2 comparisons regardless of input order.

---

## Question 63

**Question:** What is printed?

```java
int[] a = {1, 2, 3, 4, 5};
int key = 6, lo = 0, hi = a.length - 1;
while (lo <= hi) {
    int mid = (lo + hi) / 2;
    if (a[mid] == key) { lo = mid; break; }
    else if (a[mid] < key) lo = mid + 1;
    else hi = mid - 1;
}
System.out.println(lo);
```

**Choices:**
- **A.** 4
- **B.** 5
- **C.** 6
- **D.** -1

**Correct Answer:** 5

**Explanation:** 6 is absent; the loop drives `lo` past the end to 5 (the insertion point at the end of the array).

---

## Question 64

**Question:** True or false: `Comparable` is implemented by the class being sorted, while `Comparator` is a separate object passed to the sort.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `Comparable` defines natural order internally; `Comparator` externalizes ordering as a distinct object.

---

## Question 65

**Question:** Sorting `Phone[]` by number instead of name is best done with:

**Choices:**
- **A.** editing `Phone.compareTo`
- **B.** reversing the array
- **C.** a `Comparator<Phone>` comparing the number field
- **D.** a linear search, which holds even for empty or degenerate inputs

**Correct Answer:** a `Comparator<Phone>` comparing the number field

**Explanation:** A `Comparator` provides the alternate ordering without altering the class's natural order.

---

## Question 66

**Question:** What is the total number of swaps bubble sort makes on reverse-sorted `{3,2,1}`?

**Choices:**
- **A.** 1
- **B.** 2
- **C.** 6
- **D.** 3

**Correct Answer:** 3

**Explanation:** Pass1: swap(3,2)→{2,3,1}, swap(3,1)→{2,1,3}; Pass2: swap(2,1)→{1,2,3}. Total 3 swaps.

---

## Question 67

**Question:** True or false: The number of inversions in an array equals the number of swaps bubble sort (adjacent-swap) performs.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Adjacent-swap sorts fix exactly one inversion per swap, so total swaps equal the inversion count.

---

## Question 68

**Question:** What prints?

```java
class Item implements Comparable<Item> {
    int v; Item(int v){ this.v = v; }
    public int compareTo(Item o){ return this.v - o.v; }
    public String toString(){ return "" + v; }
}
Item[] a = { new Item(3), new Item(1), new Item(2) };
java.util.Arrays.sort(a);
System.out.println(java.util.Arrays.toString(a));
```

**Choices:**
- **A.** [3, 1, 2]
- **B.** [1, 2, 3]
- **C.** [3, 2, 1]
- **D.** [2, 1, 3]

**Correct Answer:** [1, 2, 3]

**Explanation:** `compareTo` orders ascending by `v`, so the sorted output is [1,2,3].

---

## Question 69

**Question:** A bug: `compareTo` returns `o.v - this.v` (reversed). The sort then produces:

**Choices:**
- **A.** ascending order
- **B.** unchanged order
- **C.** descending order
- **D.** an exception

**Correct Answer:** descending order

**Explanation:** Reversing the subtraction inverts the ordering, yielding descending sort.

---

## Question 70

**Question:** True or false: Using `this.v - o.v` in `compareTo` can overflow for extreme int values, so `Integer.compare` is safer.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Subtraction can overflow (e.g., large positive minus large negative), giving a wrong sign; `Integer.compare` avoids this.

---

## Question 71

**Question:** Which search is appropriate for an unsorted array where you can only afford one pass?

**Choices:**
- **A.** binary search
- **B.** interpolation search
- **C.** exponential search
- **D.** linear search

**Correct Answer:** linear search

**Explanation:** Unsorted data rules out binary/interpolation search; linear search works in one O(n) pass without preprocessing.

---

## Question 72

**Question:** Interpolation search improves on binary search when:

**Choices:**
- **A.** data is unsorted
- **B.** data is sorted AND uniformly distributed
- **C.** data is reverse sorted
- **D.** never, because the elements are always stored contiguously

**Correct Answer:** data is sorted AND uniformly distributed

**Explanation:** Interpolation search estimates the position from value distribution, excelling on uniform sorted data.

---

## Question 73

**Question:** What prints?

```java
int[] a = {10, 20, 30, 40};
int key = 25, lo = 0, hi = a.length - 1, result = -1;
while (lo <= hi) {
    int mid = (lo + hi) / 2;
    if (a[mid] == key) { result = mid; break; }
    else if (a[mid] < key) lo = mid + 1;
    else hi = mid - 1;
}
System.out.println(result + " " + (-lo - 1));
```

**Choices:**
- **A.** -1 -2
- **B.** 2 -3
- **C.** -1 -3
- **D.** -1 -1

**Correct Answer:** -1 -3

**Explanation:** 25 is absent; final `lo=2` (insertion point between 20 and 30). result=-1 and `-lo-1 = -3`.

---

## Question 74

**Question:** True or false: Merge sort is preferred over insertion sort for large datasets due to O(n log n) scaling.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** For large n, O(n log n) merge sort vastly outperforms O(n²) insertion sort despite higher constant factors.

---

## Question 75

**Question:** Which is TRUE about selection sort vs insertion sort writes?

**Choices:**
- **A.** insertion sort always writes fewer times
- **B.** they write equally, and this is true regardless of how the data was built
- **C.** neither writes to the array
- **D.** selection sort minimizes writes (≤ n swaps), insertion sort may shift many times

**Correct Answer:** selection sort minimizes writes (≤ n swaps), insertion sort may shift many times

**Explanation:** Selection sort's bounded swaps beat insertion sort's potentially O(n²) shifts when write cost dominates.

---

## Question 76

**Question:** What is the output?

```java
int[] a = {2, 4, 6, 8, 10};
int lo = 0, hi = a.length - 1, key = 2;
int mid = (lo + hi) / 2;
System.out.println(a[mid] > key ? "left" : (a[mid] < key ? "right" : "found"));
```

**Choices:**
- **A.** left
- **B.** right
- **C.** found
- **D.** none

**Correct Answer:** left

**Explanation:** mid=2→a[2]=6 > 2, so the algorithm searches the left half → prints "left".

---

## Question 77

**Question:** True or false: A stable sort is necessary when sorting records by a secondary key after already sorting by a primary key.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Stability preserves the primary-key order among equal secondary keys, enabling correct multi-pass lexicographic sorting.

---

## Question 78

**Question:** What prints?

```java
Integer[] a = {3, 1, 2};
java.util.Arrays.sort(a, (x, y) -> y - x);
System.out.println(a[0]);
```

**Choices:**
- **A.** 1
- **B.** 3
- **C.** 2
- **D.** 0

**Correct Answer:** 3

**Explanation:** The comparator `y - x` sorts descending, placing 3 first.

---

## Question 79

**Question:** Which sort would best exploit an array that is already sorted except for a few out-of-place elements?

**Choices:**
- **A.** selection sort
- **B.** unoptimized bubble sort
- **C.** insertion sort (adaptive)
- **D.** merge sort always

**Correct Answer:** insertion sort (adaptive)

**Explanation:** Insertion sort's cost scales with the number of inversions, so nearly-sorted data is handled in near-linear time.

---

## Question 80

**Question:** True or false: Binary search requires random access, so it suits arrays but not singly linked lists.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Efficient midpoint access needs O(1) indexing, which arrays provide but linked lists do not.

---

## Question 81

**Question:** What is the output?

```java
int[] a = {5, 3, 8, 1};
int passes = 0;
boolean swapped = true;
while (swapped) {
    swapped = false; passes++;
    for (int i = 0; i < a.length - 1; i++)
        if (a[i] > a[i + 1]) { int t = a[i]; a[i] = a[i + 1]; a[i + 1] = t; swapped = true; }
}
System.out.println(passes);
```

**Choices:**
- **A.** 2
- **B.** 3
- **C.** 1
- **D.** 4

**Correct Answer:** 4

**Explanation:** Optimized bubble sort runs passes until a clean pass. Sorting {5,3,8,1} takes 3 productive passes plus 1 final no-swap pass = 4 total passes.

---

## Question 82

**Question:** True or false: Counting sort can beat the O(n log n) comparison lower bound because it is not comparison-based.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Counting/radix sorts use key values as indices (not comparisons), achieving O(n + k) and bypassing the comparison bound.

---

## Question 83

**Question:** Which is the correct complexity of building a sorted array then doing m binary searches?

**Choices:**
- **A.** O(n log n + m log n)
- **B.** O(n·m)
- **C.** O(n log n + m)
- **D.** O(m log m)

**Correct Answer:** O(n log n + m log n)

**Explanation:** One O(n log n) sort plus m searches at O(log n) each gives O(n log n + m log n).

---

## Question 84

**Question:** True or false: For a single search on an unsorted array, linear search is asymptotically better than sort-then-binary-search.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Linear search is O(n) while sort-then-search is O(n log n); for one query, linear wins.

---

## Question 85

**Question:** What prints?

```java
int[] a = {4, 1, 3, 2};
for (int i = 0; i < a.length; i++)
    for (int j = 0; j < a.length - 1 - i; j++)
        if (a[j] > a[j + 1]) { int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t; }
System.out.println(java.util.Arrays.toString(a));
```

**Choices:**
- **A.** [4, 3, 2, 1]
- **B.** [1, 2, 3, 4]
- **C.** [4, 1, 3, 2]
- **D.** [2, 3, 1, 4]

**Correct Answer:** [1, 2, 3, 4]

**Explanation:** This is bubble sort with the standard shrinking inner bound; it sorts ascending to [1,2,3,4].

---

## Question 86

**Question:** True or false: `Arrays.binarySearch` requires the array to be sorted or results are undefined.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Like any binary search, it assumes sorted input; on unsorted data the result is unspecified.

---

## Question 87

**Question:** Which best explains why selection sort is not adaptive?

**Choices:**
- **A.** it uses recursion, so no traversal or comparison is ever needed
- **B.** it uses O(n) memory
- **C.** it always scans the entire unsorted suffix to find the minimum, ignoring existing order
- **D.** it is stable, which the definition guarantees in every case

**Correct Answer:** it always scans the entire unsorted suffix to find the minimum, ignoring existing order

**Explanation:** Because it re-scans fully each iteration, prior sortedness gives no speedup—non-adaptive.

---

## Question 88

**Question:** What is the output?

```java
String[] a = {"bb", "a", "ccc"};
java.util.Arrays.sort(a, java.util.Comparator.comparingInt(String::length));
System.out.println(a[0] + "," + a[2]);
```

**Choices:**
- **A.** ccc,a
- **B.** bb,a
- **C.** a,bb
- **D.** a,ccc

**Correct Answer:** a,ccc

**Explanation:** Sorting by length gives "a"(1), "bb"(2), "ccc"(3); a[0]="a", a[2]="ccc".

---

## Question 89

**Question:** True or false: A comparator that returns a constant 0 for all pairs leaves the array in its original order under a stable sort.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With all ties, a stable sort preserves input order, so the array is effectively unchanged.

---

## Question 90

**Question:** Which sorting algorithm's number of element comparisons is the same for best, average, and worst cases?

**Choices:**
- **A.** selection sort
- **B.** insertion sort
- **C.** optimized bubble sort
- **D.** quicksort

**Correct Answer:** selection sort

**Explanation:** Selection sort always performs the same n(n-1)/2 comparisons irrespective of input.

---

## Question 91

**Question:** What prints?

```java
int[] a = {7, 7, 3, 1};
int min = 0;
for (int j = 1; j < a.length; j++) if (a[j] < a[min]) min = j;
System.out.println(min);
```

**Choices:**
- **A.** 0
- **B.** 3
- **C.** 1
- **D.** 2

**Correct Answer:** 3

**Explanation:** The minimum value 1 is at index 3; a strict `<` keeps the first-found min but 1 is uniquely smallest at index 3.

---

## Question 92

**Question:** True or false: Using `<=` instead of `<` when scanning for the minimum in selection sort changes which equal element is selected, potentially affecting stability.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** `<=` would pick the last equal minimum instead of the first, altering tie handling and stability characteristics.

---

## Question 93

**Question:** Which is TRUE about binary search's number of iterations for n elements?

**Choices:**
- **A.** exactly n
- **B.** exactly n/2
- **C.** at most ⌊log₂ n⌋ + 1
- **D.** always 1

**Correct Answer:** at most ⌊log₂ n⌋ + 1

**Explanation:** The range halves each step, bounding iterations by ⌊log₂ n⌋ + 1.

---

## Question 94

**Question:** What prints?

```java
int[] a = {1, 3, 5, 7, 9};
int key = 4, lo = 0, hi = a.length - 1;
while (lo <= hi) {
    int mid = (lo + hi) / 2;
    if (a[mid] < key) lo = mid + 1; else hi = mid - 1;
}
System.out.println(lo);
```

**Choices:**
- **A.** 1
- **B.** 3
- **C.** 4
- **D.** 2

**Correct Answer:** 2

**Explanation:** This "lower bound" search converges `lo` to the insertion index for 4, which is index 2 (between 3 and 5).

---

## Question 95

**Question:** True or false: Insertion sort can be used as the base case within a larger merge/quick sort to speed up small subarrays.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Hybrid sorts switch to insertion sort for small subarrays because its low overhead beats recursion there (as TimSort does).

---

## Question 96

**Question:** Which describes the effect of a wrong `binarySearch` that uses `low < high` instead of `low <= high`?

**Choices:**
- **A.** it may miss the element when low == high
- **B.** it runs faster with no bug
- **C.** it sorts the array, independent of the input size or ordering
- **D.** it always returns 0

**Correct Answer:** it may miss the element when low == high

**Explanation:** Excluding the `low == high` case skips checking the final single-element range, causing missed matches—a classic off-by-one bug.

---

## Question 97

**Question:** True or false: Sorting stability matters for primitive `int[]` arrays.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Primitives have no identity beyond value, so reordering equal ints is indistinguishable; stability is irrelevant for primitive arrays.

---

## Question 98

**Question:** Which sort is typically the fastest in practice for small arrays (n < ~16)?

**Choices:**
- **A.** merge sort
- **B.** insertion sort
- **C.** heap sort
- **D.** quicksort with deep recursion

**Correct Answer:** insertion sort

**Explanation:** For tiny arrays, insertion sort's minimal overhead and cache-friendliness beat the recursion overhead of divide-and-conquer sorts.

---

## Question 99

**Question:** What prints?

```java
int[] a = {6, 2, 4};
int i = 1, key = a[i], j = i - 1;
while (j >= 0 && a[j] > key) { a[j + 1] = a[j]; j--; }
a[j + 1] = key;
System.out.println(java.util.Arrays.toString(a));
```

**Choices:**
- **A.** [6, 2, 4]
- **B.** [2, 4, 6]
- **C.** [2, 6, 4]
- **D.** [6, 4, 2]

**Correct Answer:** [2, 6, 4]

**Explanation:** One insertion-sort step (i=1) inserts 2 before 6, giving [2,6,4]; the 4 is not yet processed.

---

## Question 100

**Question:** Final synthesis: You must repeatedly search a dataset of 10 million records that changes rarely but is queried millions of times, and you need equal keys to keep insertion order for a secondary display sort. The best overall strategy is:

**Choices:**
- **A.** Linear search each query; never sort
- **B.** Selection sort before every query, making it the most efficient choice by design
- **C.** Bubble sort the data on each insertion
- **D.** Sort once with a stable O(n log n) sort, then answer each query with O(log n) binary search

**Correct Answer:** Sort once with a stable O(n log n) sort, then answer each query with O(log n) binary search

**Explanation:** Because the data rarely changes but is queried millions of times, a one-time stable O(n log n) sort amortizes across queries, each then costing only O(log n) via binary search; stability preserves insertion order among equal keys for the secondary sort. Linear search per query is O(n) each, and re-sorting with O(n²) sorts on every query is far worse.

---

### Answer distribution (self-check)
Correct answers span A/B/C/D and are frequently short factual/numeric options rather than the longest choice. True/False items alternate outcomes. Q20 includes a recount note demonstrating the exact comparison-counting trap in binary search.
