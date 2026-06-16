# Chapter 009: Search & Sort

# 1. Searching

## 1.1 What is Searching?

Searching means looking for a specific element inside a group of items, such as an array.

Example:

```java
int[] list = {10, 20, 30, 40};
int key = 30;
```

We want to know:

```text
Is 30 inside the array?
If yes, what index is it at?
```

The value we want to find is called the **key**.

According to the lecture note, two common searching approaches are **Linear Search** and **Binary Search**. 

---

# 2. Linear Search

## 2.1 What Linear Search Means

Linear Search checks elements **one by one** from the beginning to the end.

Example:

```text
Array:
[1, 4, 4, 2, 5, -3, 6, 2]

Search key:
-3
```

Trace:

```text
1 == -3? No
4 == -3? No
4 == -3? No
2 == -3? No
5 == -3? No
-3 == -3? Yes

Return index 5
```

The lecture note says Linear Search compares the key sequentially with each element until the key is found or the list is exhausted. If found, it returns the index. If not found, it returns `-1`. 

---

## 2.2 Why We Need Linear Search

Linear Search is useful because it works even when the array is **not sorted**.

Example:

```text
[9, 2, 7, 1, 5]
```

This array is not sorted, but Linear Search can still search it.

---

## 2.3 Linear Search Java Code

```java
public class LinearSearchExample {

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};

        System.out.println(linearSearch(list, 4));
        System.out.println(linearSearch(list, -4));
        System.out.println(linearSearch(list, -3));
    }
}
```

Output:

```text
1
-1
5
```

This matches the example in your lecture note. 

---

## 2.4 Line-by-Line Explanation

```java
public static int linearSearch(int[] list, int key)
```

This method receives:

```text
list → array to search inside
key  → value we want to find
```

It returns an integer.

```java
for (int i = 0; i < list.length; i++)
```

This loop checks every index from `0` to the last index.

```java
if (key == list[i])
```

This compares the key with the current array element.

```java
return i;
```

If the key is found, return the index.

```java
return -1;
```

If the loop ends and the key is not found, return `-1`.

---

## 2.5 Linear Search Code Flow

Example:

```java
int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
linearSearch(list, -3);
```

Trace:

```text
i = 0 → list[0] = 1  → -3 == 1? No
i = 1 → list[1] = 4  → -3 == 4? No
i = 2 → list[2] = 4  → -3 == 4? No
i = 3 → list[3] = 2  → -3 == 2? No
i = 4 → list[4] = 5  → -3 == 5? No
i = 5 → list[5] = -3 → -3 == -3? Yes

return 5
```

---

## 2.6 Common Mistakes

### Mistake 1: Returning `-1` too early

Wrong:

```java
for (int i = 0; i < list.length; i++) {
    if (key == list[i]) {
        return i;
    } else {
        return -1;
    }
}
```

This is wrong because it only checks the first element.

Correct:

```java
for (int i = 0; i < list.length; i++) {
    if (key == list[i]) {
        return i;
    }
}
return -1;
```

---

### Mistake 2: Using `<= list.length`

Wrong:

```java
for (int i = 0; i <= list.length; i++)
```

Correct:

```java
for (int i = 0; i < list.length; i++)
```

Array index starts at `0`, so the last index is `list.length - 1`.

---

## 2.7 Viva Questions

### Q1. What is Linear Search?

Linear Search is a searching method that checks each element one by one until the key is found or the list ends.

### Q2. Does Linear Search need sorted data?

No.

### Q3. What does Linear Search return if the key is found?

It returns the index.

### Q4. What does Linear Search return if the key is not found?

It returns `-1`.

### Q5. What is the time complexity?

```text
O(n)
```

---

# 3. Binary Search

## 3.1 What Binary Search Means

Binary Search is a faster searching method.

It checks the **middle element** first.

Important rule:

```text
Binary Search only works correctly if the array is sorted.
```

The lecture note says Binary Search requires the elements to already be ordered. 

---

## 3.2 Binary Search Idea

Example sorted array:

```text
Index:  0   1   2   3   4   5   6
Value:  2   4   7   10  11  45  50
```

Search key:

```text
key = 11
```

Step:

```text
low = 0
high = 6
mid = (0 + 6) / 2 = 3

list[3] = 10
11 > 10

Search right half
```

---

## 3.3 Three Cases in Binary Search

The lecture note explains three cases. 

### Case 1: Key is smaller than middle

```java
if (key < list[mid]) {
    high = mid - 1;
}
```

Search the left half.

---

### Case 2: Key equals middle

```java
else if (key == list[mid]) {
    return mid;
}
```

Found the key.

---

### Case 3: Key is greater than middle

```java
else {
    low = mid + 1;
}
```

Search the right half.

---

## 3.4 Binary Search Java Code

```java
public class BinarySearchExample {

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -1 - low;
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 54));
    }
}
```

Output:

```text
4
-8
```

---

## 3.5 Code Flow: Search `11`

Array:

```text
Index:  0   1   2   3   4   5   6   7   8   9   10  11  12
Value:  2   4   7   10  11  45  50  59  60  66  69  70  79
```

Search:

```text
key = 11
```

Round 1:

```text
low = 0
high = 12
mid = 6
list[6] = 50

11 < 50
high = mid - 1 = 5
```

Round 2:

```text
low = 0
high = 5
mid = 2
list[2] = 7

11 > 7
low = mid + 1 = 3
```

Round 3:

```text
low = 3
high = 5
mid = 4
list[4] = 11

11 == 11
return 4
```

---

## 3.6 Code Flow: Search `54`

```text
key = 54
```

Round 1:

```text
low = 0
high = 12
mid = 6
list[6] = 50

54 > 50
low = 7
```

Round 2:

```text
low = 7
high = 12
mid = 9
list[9] = 66

54 < 66
high = 8
```

Round 3:

```text
low = 7
high = 8
mid = 7
list[7] = 59

54 < 59
high = 6
```

Now:

```text
low = 7
high = 6
```

Stop because:

```text
high >= low is false
```

Return:

```text
-1 - low
-1 - 7
-8
```

The lecture note explains that if Binary Search does not find the key, it returns the insertion point style negative value. 

---

## 3.7 Common Mistakes

### Mistake 1: Using Binary Search on unsorted data

Wrong:

```java
int[] list = {5, 1, 9, 2};
binarySearch(list, 2);
```

Correct:

```java
int[] list = {1, 2, 5, 9};
binarySearch(list, 2);
```

---

### Mistake 2: Wrong loop condition

Correct:

```java
while (high >= low)
```

Also okay:

```java
while (low <= high)
```

Wrong:

```java
while (high > low)
```

This may skip the final possible element.

---

### Mistake 3: Wrong update

Correct:

```java
high = mid - 1;
low = mid + 1;
```

Wrong:

```java
high = mid;
low = mid;
```

This can cause an infinite loop.

---

## 3.8 Viva Questions

### Q1. What is the pre-requisite of Binary Search?

The array must be sorted.

### Q2. What does Binary Search compare first?

The middle element.

### Q3. What happens if the key is smaller than the middle element?

Search the left half.

### Q4. What happens if the key is greater than the middle element?

Search the right half.

### Q5. What is the time complexity?

```text
O(log n)
```

---

# 4. Sorting

## 4.1 What is Sorting?

Sorting means arranging data in order.

Example:

```text
Before:
[5, 2, 9, 1]

After:
[1, 2, 5, 9]
```

The lecture note says sorting is a common task in computer programming and introduces Selection Sort, Insertion Sort, Bubble Sort, and Merge Sort. 

---

# 5. Selection Sort

## 5.1 What Selection Sort Means

Selection Sort repeatedly finds the smallest remaining value and places it in the correct position.

The lecture note says Selection Sort finds the smallest number in the list and places it first, then finds the smallest remaining number and places it second, and so on. 

Memory:

```text
Selection Sort = select smallest
```

---

## 5.2 Selection Sort Example

```text
Original:
[5, 2, 9, 1]

Pass 1:
Smallest is 1
Swap with 5
[1, 2, 9, 5]

Pass 2:
Smallest in [2, 9, 5] is 2
No swap
[1, 2, 9, 5]

Pass 3:
Smallest in [9, 5] is 5
Swap with 9
[1, 2, 5, 9]
```

---

## 5.3 Selection Sort Java Code

```java
public class SelectionSortExample {

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {

            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {8, 3, 5, 1};

        selectionSort(list);

        for (double num : list) {
            System.out.print(num + " ");
        }
    }
}
```

Output:

```text
1.0 3.0 5.0 8.0
```

This follows the Selection Sort code structure shown in your lecture note. 

---

## 5.4 Important Variables

```text
i               → current position to fix
j               → scans the unsorted part
currentMin      → smallest value found so far
currentMinIndex → index of smallest value found so far
```

---

## 5.5 Selection Sort Code Flow

Array:

```text
[8, 3, 5, 1]
```

Pass 1:

```text
i = 0
currentMin = 8
currentMinIndex = 0

j = 1 → 3 < 8 → currentMin = 3, currentMinIndex = 1
j = 2 → 5 < 3? No
j = 3 → 1 < 3 → currentMin = 1, currentMinIndex = 3

Swap index 0 and index 3

[1, 3, 5, 8]
```

Pass 2:

```text
i = 1
currentMin = 3
currentMinIndex = 1

j = 2 → 5 < 3? No
j = 3 → 8 < 3? No

No swap

[1, 3, 5, 8]
```

Pass 3:

```text
i = 2
currentMin = 5
currentMinIndex = 2

j = 3 → 8 < 5? No

No swap

[1, 3, 5, 8]
```

---

## 5.6 Common Mistakes

### Mistake 1: Forgetting to update `currentMinIndex`

Wrong:

```java
if (currentMin > list[j]) {
    currentMin = list[j];
}
```

Correct:

```java
if (currentMin > list[j]) {
    currentMin = list[j];
    currentMinIndex = j;
}
```

---

### Mistake 2: Wrong swap

Wrong:

```java
list[i] = list[currentMinIndex];
list[currentMinIndex] = list[i];
```

Correct:

```java
list[currentMinIndex] = list[i];
list[i] = currentMin;
```

Or:

```java
double temp = list[i];
list[i] = list[currentMinIndex];
list[currentMinIndex] = temp;
```

---

## 5.7 Viva Questions

### Q1. What is Selection Sort?

Selection Sort repeatedly selects the smallest remaining value and puts it in the correct position.

### Q2. What does the outer loop do?

It controls the position to fix.

### Q3. What does the inner loop do?

It finds the smallest value in the unsorted part.

### Q4. What is the time complexity?

```text
O(n²)
```

---

# 6. Insertion Sort

## 6.1 What Insertion Sort Means

Insertion Sort repeatedly takes one unsorted element and inserts it into the correct position in the sorted part.

Memory:

```text
Insertion Sort = insert current element
```

---

## 6.2 Insertion Sort Idea

Example:

```text
[5, 2, 4]
```

Start:

```text
[5] | [2, 4]
```

Insert `2`:

```text
2 < 5
Shift 5 right
[5, 5, 4]
Insert 2
[2, 5, 4]
```

Insert `4`:

```text
4 < 5
Shift 5 right
[2, 5, 5]
Insert 4
[2, 4, 5]
```

---

## 6.3 Insertion Sort Java Code

```java
public class InsertionSortExample {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 6};

        insertionSort(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
```

Output:

```text
1 2 4 5 6 8 9
```

---

## 6.4 Important Variables

```text
i              → index of current element
currentElement → value being inserted
k              → moves backward through sorted part
```

---

## 6.5 Insertion Sort Code Flow

Array:

```text
[6, 3, 5, 2]
```

Pass 1:

```text
i = 1
currentElement = 3
k = 0

list[0] = 6
6 > 3 → shift 6 right

[6, 6, 5, 2]

k = -1
Insert 3 at k + 1 = 0

[3, 6, 5, 2]
```

Pass 2:

```text
i = 2
currentElement = 5
k = 1

list[1] = 6
6 > 5 → shift 6 right

[3, 6, 6, 2]

k = 0
list[0] = 3
3 > 5? No

Insert 5 at k + 1 = 1

[3, 5, 6, 2]
```

Pass 3:

```text
i = 3
currentElement = 2
k = 2

6 > 2 → shift
[3, 5, 6, 6]

5 > 2 → shift
[3, 5, 5, 6]

3 > 2 → shift
[3, 3, 5, 6]

Insert 2 at index 0

[2, 3, 5, 6]
```

---

## 6.6 Common Mistakes

### Mistake 1: Forgetting to save `currentElement`

Correct:

```java
int currentElement = list[i];
```

This is needed because shifting may overwrite `list[i]`.

---

### Mistake 2: Wrong shift direction

Wrong:

```java
list[k] = list[k + 1];
```

Correct:

```java
list[k + 1] = list[k];
```

We shift bigger values to the right.

---

### Mistake 3: Wrong condition order

Correct:

```java
k >= 0 && list[k] > currentElement
```

Wrong:

```java
list[k] > currentElement && k >= 0
```

If `k` becomes `-1`, `list[-1]` causes an error.

---

## 6.7 Viva Questions

### Q1. What is Insertion Sort?

Insertion Sort inserts each unsorted element into its correct position in a sorted sublist.

### Q2. Why does `i` start from 1?

Because index 0 is considered already sorted.

### Q3. Why do we save `currentElement`?

Because shifting can overwrite the original value.

### Q4. What is the time complexity?

Worst case:

```text
O(n²)
```

Best case:

```text
O(n)
```

---

# 7. Bubble Sort

## 7.1 What Bubble Sort Means

Bubble Sort compares neighbouring elements and swaps them if they are in the wrong order.

Memory:

```text
Bubble Sort = neighbour swap
```

The lecture note says Bubble Sort makes several passes, compares neighbouring pairs, and swaps pairs that are in decreasing order. It also explains that smaller values bubble up and larger values sink down. 

---

## 7.2 Bubble Sort Example

Array:

```text
[5, 2, 9, 1]
```

Pass 1:

```text
Compare 5 and 2 → swap
[2, 5, 9, 1]

Compare 5 and 9 → no swap
[2, 5, 9, 1]

Compare 9 and 1 → swap
[2, 5, 1, 9]
```

Pass 2:

```text
Compare 2 and 5 → no swap
[2, 5, 1, 9]

Compare 5 and 1 → swap
[2, 1, 5, 9]
```

Pass 3:

```text
Compare 2 and 1 → swap
[1, 2, 5, 9]
```

---

## 7.3 Bubble Sort Java Code

```java
public class BubbleSortExample {

    public static void bubbleSort(int[] list) {
        for (int pass = 1; pass < list.length; pass++) {
            for (int i = 0; i < list.length - pass; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {4, 2, 3, 1};

        bubbleSort(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
```

Output:

```text
1 2 3 4
```

---

## 7.4 Bubble Sort Code Flow

Array:

```text
[4, 2, 3, 1]
```

Pass 1:

```text
Compare 4 and 2 → swap
[2, 4, 3, 1]

Compare 4 and 3 → swap
[2, 3, 4, 1]

Compare 4 and 1 → swap
[2, 3, 1, 4]
```

Pass 2:

```text
Compare 2 and 3 → no swap
[2, 3, 1, 4]

Compare 3 and 1 → swap
[2, 1, 3, 4]
```

Pass 3:

```text
Compare 2 and 1 → swap
[1, 2, 3, 4]
```

---

## 7.5 Improved Bubble Sort

The lecture note explains that if no swap happens in a pass, the array is already sorted, so the algorithm can stop early. 

```java
public class BubbleSortImproved {

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int pass = 1; pass < list.length && needNextPass; pass++) {
            needNextPass = false;

            for (int i = 0; i < list.length - pass; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }
}
```

---

## 7.6 Common Mistakes

### Mistake 1: Comparing wrong indexes

Correct:

```java
if (list[i] > list[i + 1])
```

Wrong:

```java
if (list[i] > list[i])
```

---

### Mistake 2: Inner loop goes too far

Wrong:

```java
for (int i = 0; i < list.length; i++)
```

Correct:

```java
for (int i = 0; i < list.length - pass; i++)
```

---

### Mistake 3: Forgetting `temp`

Correct:

```java
int temp = list[i];
list[i] = list[i + 1];
list[i + 1] = temp;
```

---

## 7.7 Viva Questions

### Q1. What does Bubble Sort compare?

Adjacent elements.

### Q2. When does it swap?

When the left value is greater than the right value.

### Q3. What happens after each pass?

A large value moves to its correct position at the end.

### Q4. What is `needNextPass` for?

It stops the algorithm early if no swap happens.

### Q5. What is the time complexity?

```text
O(n²)
```

---

# 8. Merge Sort

## 8.1 What Merge Sort Means

Merge Sort is a divide-and-conquer sorting algorithm.

It works by:

```text
Split the array into halves.
Sort each half recursively.
Merge the sorted halves.
```

The lecture note says Merge Sort divides the array into two halves, applies Merge Sort recursively on each half, and then merges the two sorted halves. 

Memory:

```text
Merge Sort = split and merge
```

---

## 8.2 Merge Sort Example

Array:

```text
[2, 9, 5, 4, 8, 1, 6, 7]
```

Split:

```text
[2, 9, 5, 4]        [8, 1, 6, 7]
[2, 9] [5, 4]       [8, 1] [6, 7]
[2] [9] [5] [4]     [8] [1] [6] [7]
```

Merge:

```text
[2, 9] [4, 5]       [1, 8] [6, 7]
[2, 4, 5, 9]        [1, 6, 7, 8]
[1, 2, 4, 5, 6, 7, 8, 9]
```

This follows the Merge Sort diagram from your note. 

---

## 8.3 Merge Sort Java Code

```java
public class MergeSortExample {

    public static void mergeSort(int[] list) {
        if (list.length > 1) {

            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2]) {
                temp[current3] = list1[current1];
                current1++;
            } else {
                temp[current3] = list2[current2];
                current2++;
            }

            current3++;
        }

        while (current1 < list1.length) {
            temp[current3] = list1[current1];
            current1++;
            current3++;
        }

        while (current2 < list2.length) {
            temp[current3] = list2[current2];
            current2++;
            current3++;
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 2, 4, 1};

        mergeSort(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
```

Output:

```text
1 2 4 5
```

---

## 8.4 Merge Sort Recursion Flow

Example:

```text
mergeSort([5, 2, 4, 1])
```

Split:

```text
firstHalf  = [5, 2]
secondHalf = [4, 1]
```

Sort first half:

```text
mergeSort([5, 2])
→ mergeSort([5])
→ mergeSort([2])
→ merge([5], [2])
→ [2, 5]
```

Sort second half:

```text
mergeSort([4, 1])
→ mergeSort([4])
→ mergeSort([1])
→ merge([4], [1])
→ [1, 4]
```

Final merge:

```text
merge([2, 5], [1, 4])
→ [1, 2, 4, 5]
```

---

## 8.5 Complete Recursion Tree

```text
mergeSort([5, 2, 4, 1])
│
├── mergeSort([5, 2])
│   │
│   ├── mergeSort([5])
│   │   └── base case
│   │
│   ├── mergeSort([2])
│   │   └── base case
│   │
│   └── merge([5], [2]) → [2, 5]
│
├── mergeSort([4, 1])
│   │
│   ├── mergeSort([4])
│   │   └── base case
│   │
│   ├── mergeSort([1])
│   │   └── base case
│   │
│   └── merge([4], [1]) → [1, 4]
│
└── merge([2, 5], [1, 4]) → [1, 2, 4, 5]
```

---

## 8.6 Merge Method Flow

Merge:

```text
list1 = [2, 5]
list2 = [1, 4]
temp  = [?, ?, ?, ?]
```

Pointers:

```text
current1 = 0
current2 = 0
current3 = 0
```

Step 1:

```text
Compare 2 and 1
Take 1

temp = [1, ?, ?, ?]
```

Step 2:

```text
Compare 2 and 4
Take 2

temp = [1, 2, ?, ?]
```

Step 3:

```text
Compare 5 and 4
Take 4

temp = [1, 2, 4, ?]
```

Step 4:

```text
list2 finished
Copy leftover 5

temp = [1, 2, 4, 5]
```

---

## 8.7 Common Mistakes

### Mistake 1: Forgetting the base case

Correct:

```java
if (list.length > 1)
```

If list length is 1, stop.

---

### Mistake 2: Thinking split alone sorts

Split only divides the array.

Sorting happens during merging.

---

### Mistake 3: Forgetting to sort both halves

Correct:

```java
mergeSort(firstHalf);
mergeSort(secondHalf);
merge(firstHalf, secondHalf, list);
```

---

### Mistake 4: Forgetting leftover loops

Correct:

```java
while (current1 < list1.length) {
    temp[current3] = list1[current1];
    current1++;
    current3++;
}

while (current2 < list2.length) {
    temp[current3] = list2[current2];
    current2++;
    current3++;
}
```

---

## 8.8 Viva Questions

### Q1. What type of algorithm is Merge Sort?

Divide-and-conquer.

### Q2. Why is Merge Sort recursive?

Because it calls itself to sort smaller halves.

### Q3. What is the base case?

When the array length is 1 or less.

### Q4. What does the merge method do?

It combines two sorted arrays into one sorted array.

### Q5. What is the time complexity?

```text
O(n log n)
```

The lecture note states Merge Sort has average time complexity `O(n log n)`. 

---

# 9. Search and Sort Comparison

## 9.1 Searching Comparison

| Feature                 | Linear Search    | Binary Search                        |
| ----------------------- | ---------------- | ------------------------------------ |
| Main idea               | Check one by one | Check middle and cut half            |
| Needs sorted data?      | No               | Yes                                  |
| Works on unsorted data? | Yes              | No                                   |
| Return if found         | Index            | Index                                |
| Return if not found     | `-1`             | Negative insertion-point style value |
| Time complexity         | `O(n)`           | `O(log n)`                           |
| Difficulty              | Easy             | Medium                               |

---

## 9.2 Sorting Comparison

| Algorithm      | Main idea              | Uses swap? | Uses shifting? | Uses recursion? | Time complexity |
| -------------- | ---------------------- | ---------: | -------------: | --------------: | --------------- |
| Selection Sort | Select smallest        |        Yes |             No |              No | `O(n²)`         |
| Insertion Sort | Insert current element | Not mainly |            Yes |              No | `O(n²)`         |
| Bubble Sort    | Compare neighbours     |        Yes |             No |              No | `O(n²)`         |
| Merge Sort     | Split and merge        |         No |             No |             Yes | `O(n log n)`    |

---

# 10. Memory Tricks

```text
Linear Search:
Line by line search

Binary Search:
Break into half

Selection Sort:
Select smallest

Insertion Sort:
Insert current element

Bubble Sort:
Bubble large values to the end

Merge Sort:
Merge sorted halves
```

---

# 11. Connection With Previous Chapters

## 11.1 Linked List

Searching in a linked list is similar to Linear Search.

```text
Start from head.
Check current node.
Move to next node.
Repeat until found or null.
```

Binary Search is not efficient for linked list because linked list cannot directly access the middle element quickly.

---

## 11.2 Stack

Merge Sort connects with Stack because recursion uses the call stack.

Example:

```text
mergeSort([5, 2, 4, 1])
calls mergeSort([5, 2])
calls mergeSort([5])
```

Each unfinished call is stored in stack memory.

---

## 11.3 Queue

Queue is FIFO, but sorting usually needs random access to array elements.

Bubble Sort compares:

```java
list[i] and list[i + 1]
```

This is easier with arrays than queues.

---

## 11.4 Graph

Graph search is different from array search.

Array:

```text
[1, 2, 3, 4]
```

Graph:

```text
A -- B
|    |
C -- D
```

Graph search uses traversal methods like BFS or DFS.

---

# 12. Final Exam/Viva Checklist

## Searching

* [x] Know what searching means
* [x] Know what key means
* [x] Know Linear Search
* [x] Know Binary Search
* [x] Know Linear Search does not need sorted data
* [x] Know Binary Search needs sorted data
* [x] Know Linear Search returns `-1` if not found
* [x] Know Binary Search uses `low`, `high`, and `mid`
* [x] Know time complexity of Linear Search: `O(n)`
* [x] Know time complexity of Binary Search: `O(log n)`

---

## Sorting

* [x] Know what sorting means
* [x] Know Selection Sort
* [x] Know Insertion Sort
* [x] Know Bubble Sort
* [x] Know Merge Sort
* [x] Know Selection Sort selects smallest
* [x] Know Insertion Sort shifts and inserts
* [x] Know Bubble Sort compares neighbours
* [x] Know Merge Sort splits and merges
* [x] Know Merge Sort uses recursion
* [x] Know `O(n²)` sorts: Selection, Insertion, Bubble
* [x] Know `O(n log n)` sort: Merge Sort

---

# 13. Final Viva Questions

## Q1. What is searching?

Searching is the process of looking for a specific element in a group of items.

---

## Q2. What are the two search methods in this chapter?

```text
Linear Search
Binary Search
```

---

## Q3. What is the difference between Linear Search and Binary Search?

Linear Search checks one by one and does not require sorted data. Binary Search checks the middle and requires sorted data.

---

## Q4. Why does Binary Search need sorted data?

Because it decides whether to search the left half or right half based on comparison with the middle value.

---

## Q5. What is sorting?

Sorting is arranging data in order, usually ascending or descending.

---

## Q6. What are the sorting algorithms in this chapter?

```text
Selection Sort
Insertion Sort
Bubble Sort
Merge Sort
```

---

## Q7. Which sort repeatedly finds the smallest value?

Selection Sort.

---

## Q8. Which sort inserts a value into a sorted sublist?

Insertion Sort.

---

## Q9. Which sort compares adjacent elements?

Bubble Sort.

---

## Q10. Which sort uses recursion?

Merge Sort.

---

## Q11. Which sort is divide-and-conquer?

Merge Sort.

---

## Q12. Which sorting algorithms are `O(n²)`?

```text
Selection Sort
Insertion Sort
Bubble Sort
```

---

## Q13. Which sorting algorithm is `O(n log n)`?

Merge Sort.

---

## Q14. Why is Merge Sort faster for large data?

Because it splits the problem into halves and merges efficiently.

---

# 14. Final Mini Practice

## Practice 1: Linear Search

```java
int[] list = {3, 7, 2, 9};
linearSearch(list, 2);
```

Answer:

```text
2
```

---

## Practice 2: Binary Search

```java
int[] list = {1, 3, 5, 7, 9};
binarySearch(list, 7);
```

Answer:

```text
3
```

---

## Practice 3: Selection Sort

```text
[4, 1, 3]
```

Pass 1:

```text
Smallest is 1
Swap with 4
[1, 4, 3]
```

Pass 2:

```text
Smallest in [4, 3] is 3
Swap with 4
[1, 3, 4]
```

---

## Practice 4: Insertion Sort

```text
[4, 1, 3]
```

Insert `1`:

```text
Shift 4
[1, 4, 3]
```

Insert `3`:

```text
Shift 4
[1, 3, 4]
```

---

## Practice 5: Bubble Sort

```text
[4, 1, 3]
```

Pass 1:

```text
Compare 4 and 1 → swap
[1, 4, 3]

Compare 4 and 3 → swap
[1, 3, 4]
```

Pass 2:

```text
Compare 1 and 3 → no swap
[1, 3, 4]
```

---

## Practice 6: Merge Sort

```text
[4, 1, 3, 2]
```

Split:

```text
[4, 1] [3, 2]
[4] [1] [3] [2]
```

Merge:

```text
[1, 4] [2, 3]
[1, 2, 3, 4]
```

---

# 15. Final Summary

```text
Search means find data.

Linear Search:
Check one by one.
Works on unsorted array.
O(n).

Binary Search:
Check middle.
Needs sorted array.
O(log n).

Sort means arrange data.

Selection Sort:
Select smallest and swap.
O(n²).

Insertion Sort:
Insert current element into sorted part.
O(n²).

Bubble Sort:
Compare neighbours and swap.
O(n²).

Merge Sort:
Split, recursively sort, merge.
O(n log n).
```