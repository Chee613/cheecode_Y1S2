# Lab 1 - Programming Fundamentals Answers

## Question 1 - Two-part letter

### Part 1: `TanCheeKeat_25006123.txt`

Personal details that are not known (major, prior grade, and target grade) can be edited before
submission.

```text
Thursday, 19 March 2021.

My name is Tan Chee Keat with matrix number 25006123. I am majoring in Computer Science.
This is my first time taking the Data Structure subject. At the moment, I am excited and a
little nervous about taking this subject because it introduces more advanced ways to organize
and process data. I acquired a good grade for Programming 1, so I aim to earn an A for Data
Structure this term. To do well, I will attend class, practise every week, and ask questions
whenever a concept is unclear. Wish me luck!
```

### Parts 2 and 3: read, append console input, then display the complete file

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ReadMyLetter_25006123 {
    private static final Path FILE = Path.of("TanCheeKeat_25006123.txt");

    public static void main(String[] args) throws IOException {
        System.out.println("Part 1:\n" + Files.readString(FILE));

        Scanner in = new Scanner(System.in);
        System.out.print("How did you perform? ");
        String performance = in.nextLine();
        System.out.print("Are you happy with your performance? ");
        String happy = in.nextLine();
        System.out.print("What did Data Structure teach you? ");
        String learned = in.nextLine();
        System.out.print("Has your target grade changed? ");
        String grade = in.nextLine();
        System.out.print("What did you do well? ");
        String well = in.nextLine();
        System.out.print("What could have been better? ");
        String improve = in.nextLine();

        String part2 = String.format("""

                Thursday, 18 June 2021.

                It is me again. The term and the Data Structure class have finished.
                My performance: %s
                Am I happy with it? %s
                What I learned: %s
                Change to my target grade: %s
                What I did well: %s
                What I could improve: %s
                """, performance, happy, learned, grade, well, improve);

        Files.writeString(FILE, part2, StandardOpenOption.APPEND);
        System.out.println("\nComplete letter:\n" + Files.readString(FILE));
    }
}
```

## Question 2 - Read delimited files

This version counts and displays data tokens, excluding the delimiters. It handles the four
formats in the question.

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ReadDelimitedFiles {
    static void show(String file, String delimiterRegex) throws IOException {
        String input = Files.readString(Path.of(file)).trim();
        String[] values = Arrays.stream(input.split(delimiterRegex))
                .filter(s -> !s.isBlank()).toArray(String[]::new);
        System.out.println(file + ": " + values.length + " value(s)");
        System.out.println(String.join(" ", values));
    }

    public static void main(String[] args) throws IOException {
        show("text1.txt", "[,;\\s]+");       // letters separated by punctuation/space
        show("text2.txt", "[,;\\s]+");       // integers
        show("text3.txt", "[;\\s]+");        // real numbers
        show("text4.txt", "\\d+");           // alphabet groups separated by numbers
    }
}
```

For the supplied examples, the counts are 66 letters in `text1.txt`, 14 integers in
`text2.txt`, 12 real numbers in `text3.txt`, and 4 alphabet groups in `text4.txt`.

## Question 3 - `Account`

```java
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private final Date dateCreated;

    public Account() { this(0, 0); }
    public Account(int id, double balance) {
        this.id = id; this.balance = balance; dateCreated = new Date();
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public static double getAnnualInterestRate() { return annualInterestRate; }
    public static void setAnnualInterestRate(double rate) { annualInterestRate = rate; }
    public Date getDateCreated() { return new Date(dateCreated.getTime()); }
    public double getMonthlyInterestRate() { return annualInterestRate / 12.0 / 100.0; }
    public double getMonthlyInterest() { return balance * getMonthlyInterestRate(); }
    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) throw new IllegalArgumentException("Invalid amount");
        balance -= amount;
    }
    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Invalid amount");
        balance += amount;
    }
}
```

```java
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2_500);
        account.deposit(3_000);
        System.out.printf("Balance: $%.2f%n", account.getBalance());       // $20500.00
        System.out.printf("Monthly interest: $%.2f%n", account.getMonthlyInterest()); // $76.88
        System.out.println("Created: " + account.getDateCreated());
    }
}
```

## Question 4 - `Account1` and transactions

```java
import java.util.Date;

public class Transaction {
    private final Date date = new Date();
    private final char type;
    private final double amount;
    private final double balance;
    private final String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type; this.amount = amount; this.balance = balance;
        this.description = description;
    }
    public Date getDate() { return new Date(date.getTime()); }
    public char getType() { return type; }
    public double getAmount() { return amount; }
    public double getBalance() { return balance; }
    public String getDescription() { return description; }
    public String toString() {
        return String.format("%s | %c | $%.2f | balance $%.2f | %s",
                date, type, amount, balance, description);
    }
}
```

```java
import java.util.ArrayList;
import java.util.List;

public class Account1 extends Account {
    private final String name;
    private final ArrayList<Transaction> transactions = new ArrayList<>();

    public Account1(String name, int id, double balance) {
        super(id, balance); this.name = name;
    }
    public String getName() { return name; }
    public List<Transaction> getTransactions() { return List.copyOf(transactions); }

    @Override public void withdraw(double amount) {
        super.withdraw(amount);
        transactions.add(new Transaction('W', amount, getBalance(), "Withdrawal"));
    }
    @Override public void deposit(double amount) {
        super.deposit(amount);
        transactions.add(new Transaction('D', amount, getBalance(), "Deposit"));
    }
}
```

```java
public class TestAccount1 {
    public static void main(String[] args) {
        Account1 a = new Account1("George", 1122, 1000);
        Account.setAnnualInterestRate(1.5);
        a.deposit(30); a.deposit(40); a.deposit(50);
        a.withdraw(5); a.withdraw(4); a.withdraw(2);
        System.out.println("Name: " + a.getName());
        System.out.println("Interest rate: " + Account.getAnnualInterestRate() + "%");
        System.out.printf("Balance: $%.2f%n", a.getBalance()); // $1109.00
        a.getTransactions().forEach(System.out::println);
    }
}
```
