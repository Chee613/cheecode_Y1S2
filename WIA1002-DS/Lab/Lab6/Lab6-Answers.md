# Lab 6 - Stack Answers

## Question 1 - Generic `MyStack` and tests

```java
import java.util.ArrayList;

public class MyStack<E> {
    private final ArrayList<E> list = new ArrayList<>();
    public void push(E o) { list.add(o); }
    public E pop() { return list.remove(list.size() - 1); }
    public E peek() { return list.get(list.size() - 1); }
    public int getSize() { return list.size(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public boolean search(E o) { return list.contains(o); }
    @Override public String toString() { return list.toString(); }
}
```

```java
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> chars = new MyStack<>();
        chars.push('a'); chars.push('b'); chars.push('c');
        System.out.println(chars);                    // [a, b, c], c is top
        System.out.println("Contains b: " + chars.search('b')); // true
        System.out.println("Contains k: " + chars.search('k')); // false

        MyStack<Integer> integers = new MyStack<>();
        integers.push(1); integers.push(2); integers.push(3);
        System.out.println(integers);                 // [1, 2, 3]
        System.out.println("Contains 6: " + integers.search(6)); // false
    }
}
```

## Question 2 - Push 1 through `n`, then pop

```java
import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        MyStack<Integer> stack = new MyStack<>();
        for (int i = 1; i <= n; i++) stack.push(i);
        System.out.println("Size: " + stack.getSize());
        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }
}
```

For input 5, the output elements are `5 4 3 2 1`. The order is reversed because a stack is
LIFO: the last value pushed is the first value popped.

## Question 3 - Sum every element in a stack

This version uses only stack ADT operations and restores `S` to its original order.

```java
static int sum(MyStack<Integer> s) {
    MyStack<Integer> temporary = new MyStack<>();
    int total = 0;
    while (!s.isEmpty()) {
        int value = s.pop();
        total += value;
        temporary.push(value);
    }
    while (!temporary.isEmpty()) s.push(temporary.pop());
    return total;
}
```

Time is O(n) and auxiliary space is O(n).

## Question 4 - Palindrome using a stack

```java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter at most 15 characters: ");
        String text = in.nextLine();
        if (text.length() > 15) throw new IllegalArgumentException("maximum length is 15");

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : text.toCharArray()) stack.push(c);
        boolean palindrome = true;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != stack.pop()) { palindrome = false; break; }
        System.out.println(palindrome ? "Palindrome" : "Not a palindrome");
    }
}
```

## Question 5 - Tower of Hanoi using stacks

Each rod is represented by a stack. The recursive procedure chooses legal top-disk moves;
`move` also checks the puzzle rule before changing the stacks.

```java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TowerOfHanoiStacks {
    private static final Deque<Integer> A = new ArrayDeque<>();
    private static final Deque<Integer> B = new ArrayDeque<>();
    private static final Deque<Integer> C = new ArrayDeque<>();

    static void solve(int n, Deque<Integer> from, String fromName,
                      Deque<Integer> auxiliary, String auxiliaryName,
                      Deque<Integer> to, String toName) {
        if (n == 0) return;
        solve(n - 1, from, fromName, to, toName, auxiliary, auxiliaryName);
        move(from, fromName, to, toName);
        solve(n - 1, auxiliary, auxiliaryName, from, fromName, to, toName);
    }

    static void move(Deque<Integer> from, String fromName,
                     Deque<Integer> to, String toName) {
        int disk = from.pop();
        if (!to.isEmpty() && to.peek() < disk)
            throw new IllegalStateException("larger disk on smaller disk");
        to.push(disk);
        System.out.printf("Move disk %d from %s to %s%n", disk, fromName, toName);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of disks: "); int n = in.nextInt();
        for (int disk = n; disk >= 1; disk--) A.push(disk);
        solve(n, A, "A", B, "B", C, "C");
        System.out.println("Destination rod C: " + C);
    }
}
```

The algorithm performs `2^n - 1` legal moves.
