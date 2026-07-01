# Lab 7 - Queue Answers

## Question 1 - Generic `MyQueue` and test

```java
import java.util.Arrays;
import java.util.LinkedList;

public class MyQueue<E> {
    private final LinkedList<E> list = new LinkedList<>();
    public MyQueue() {}
    public MyQueue(E[] values) { list.addAll(Arrays.asList(values)); }
    public void enqueue(E e) { list.addLast(e); }
    public E dequeue() { return list.removeFirst(); }
    public E getElement(int i) { return list.get(i); }
    public E peek() { return list.getFirst(); }
    public int getSize() { return list.size(); }
    public boolean contains(E e) { return list.contains(e); }
    public boolean isEmpty() { return list.isEmpty(); }
    @Override public String toString() { return list.toString(); }
}
```

```java
public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<String> fruitQ = new MyQueue<>(new String[]{"Durian", "Blueberry"});
        fruitQ.enqueue("Apple"); fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes"); fruitQ.enqueue("Cherry");
        System.out.println(fruitQ);                          // all six values
        System.out.println("Top: " + fruitQ.peek());        // Durian
        System.out.println("Size: " + fruitQ.getSize());    // 6
        System.out.println("Deleted: " + fruitQ.dequeue()); // Durian
        System.out.println("Index 2: " + fruitQ.getElement(2)); // Orange
        System.out.println("Contains Cherry: " + fruitQ.contains("Cherry")); // true
        System.out.println("Contains Durian: " + fruitQ.contains("Durian")); // false
        while (!fruitQ.isEmpty()) System.out.print(fruitQ.dequeue() + " ");
    }
}
```

## Question 2 - Queue palindrome

```java
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueuePalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = in.nextLine();
        String normalized = original.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        Queue<Character> queue = new ArrayDeque<>();
        for (char c : normalized.toCharArray()) queue.offer(c);

        boolean palindrome = true;
        for (int right = normalized.length() - 1; right >= 0; right--)
            if (queue.remove() != normalized.charAt(right)) { palindrome = false; break; }
        System.out.println(palindrome ? "Palindrome" : "Not a palindrome");
    }
}
```

## Question 3 - FIFO stock gain/loss

Each purchase becomes a FIFO lot. A sale consumes the oldest lots first; each consumed share
contributes `sellingPrice - purchasePrice` to the total.

```java
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StockFIFO {
    private static class Lot {
        int shares;
        final int price;
        Lot(int shares, int price) { this.shares = shares; this.price = price; }
    }

    public static void main(String[] args) {
        Queue<Lot> lots = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        Pattern command = Pattern.compile(
                "(?i)(buy|sell)\\s+(\\d+)\\s+shares?\\s+at\\s+\\$?(\\d+)\\s+each");
        long totalGainOrLoss = 0;
        int availableShares = 0;

        System.out.println("Enter transactions; submit a blank line to finish.");
        while (true) {
            String line = in.nextLine().trim();
            if (line.isEmpty()) break;
            Matcher m = command.matcher(line);
            if (!m.matches()) {
                System.out.println("Invalid format; try again.");
                continue;
            }
            String action = m.group(1).toLowerCase();
            int shares = Integer.parseInt(m.group(2));
            int price = Integer.parseInt(m.group(3));

            if (action.equals("buy")) {
                lots.offer(new Lot(shares, price));
                availableShares += shares;
            } else {
                if (shares > availableShares) {
                    System.out.println("Rejected: not enough shares.");
                    continue;
                }
                int remaining = shares;
                while (remaining > 0) {
                    Lot oldest = lots.peek();
                    int sold = Math.min(remaining, oldest.shares);
                    totalGainOrLoss += (long) sold * (price - oldest.price);
                    remaining -= sold;
                    oldest.shares -= sold;
                    if (oldest.shares == 0) lots.remove();
                }
                availableShares -= shares;
                System.out.println("Running gain/loss: $" + totalGainOrLoss);
            }
        }
        System.out.println("Total gain/loss: $" + totalGainOrLoss);
    }
}
```

For the PDF example (buy 100 at 20, buy 20 at 24, buy 200 at 36, sell 150 at 30),
the result is `(100 x 10) + (20 x 6) + (30 x -6) = $940`.
