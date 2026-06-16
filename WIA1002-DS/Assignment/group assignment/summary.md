# Smart Library WIA1002 — Complete Revision Notes

## 1. Project Overview

Smart Library is a Java console-based library management system.

It allows:

- Admin to manage books
- Student to borrow and return books
- System to store user information
- System to save and load data from text files

The project mainly uses three important data structures:

| Data Structure | Used For | File |
|---|---|---|
| Binary Search Tree | Store available books sorted by ISBN | `BookBST.java` |
| Stack | Store each student's borrowing history, newest first | `BorrowHistoryStack.java` |
| Map / LinkedHashMap | Store users and student histories by ID | `UserStore.java`, `SmartLibrary.java` |

---

## 2. Project File Structure

```text
src/smartlibrary/
├── Main.java
├── LibraryADT.java
├── SmartLibrary.java
├── BookBST.java
├── BorrowHistoryStack.java
├── Book.java
├── LoanRecord.java
├── User.java
└── UserStore.java
````

Simple meaning:

```text
Main.java
→ Console menu and user interaction

LibraryADT.java
→ Interface / contract for library operations

SmartLibrary.java
→ Main library logic

BookBST.java
→ Stores available books using BST

BorrowHistoryStack.java
→ Stores student borrowing history using stack

Book.java
→ Represents one book

LoanRecord.java
→ Represents one borrow/return record

User.java
→ Represents one user

UserStore.java
→ Handles user registration, login lookup, and user saving/loading
```

---

# 3. Overall Program Flow

```text
Program starts
        ↓
Main.java creates SmartLibrary
        ↓
SmartLibrary loads books and loans from smart_library_data.txt
        ↓
Main.java creates UserStore
        ↓
UserStore loads users from user_info.txt
        ↓
Main menu appears
        ↓
User can login, register, or exit
```

---

# 4. Main Data Structures

## 4.1 Binary Search Tree

Used in:

```text
BookBST.java
```

Purpose:

```text
Store available books sorted by ISBN.
```

Rule:

```text
Smaller ISBN → left
Larger ISBN  → right
```

Example:

```text
        50
       /  \
     30    70
    /  \
  20    40
```

If searching for `40`:

```text
Start at 50
40 < 50 → go left
40 > 30 → go right
40 == 40 → found
```

Why BST?

Because searching by ISBN can be faster than checking every book one by one.

---

## 4.2 Stack

Used in:

```text
BorrowHistoryStack.java
```

Purpose:

```text
Store each student's borrowing history.
Newest record appears first.
```

Stack rule:

```text
Last In, First Out
```

Example:

```text
top
 ↓
Loan C  ← newest
Loan B
Loan A  ← oldest
```

When a student borrows a book:

```text
New LoanRecord is pushed onto top of stack.
```

---

## 4.3 Map / LinkedHashMap

Used in:

```text
SmartLibrary.java
UserStore.java
```

Purpose:

```text
Store data using key-value pairs.
```

Example in `SmartLibrary.java`:

```text
studentId → BorrowHistoryStack
```

Example:

```text
S001 → stack of S001 loan records
S002 → stack of S002 loan records
```

Example in `UserStore.java`:

```text
userId → User object
```

Example:

```text
A001 → Admin user
S001 → Student user
```

Why Map?

Because searching by ID is easy.

---

# 5. `Book.java`

## Purpose

`Book.java` represents one book in the system.

Each book has:

```text
isbn
title
author
```

## Important fields

```java
private final long isbn;
private final String title;
private final String author;
```

Meaning:

```text
isbn   → unique number for the book
title  → book title
author → book author
```

`final` means the value cannot be changed after the object is created.

So if the system wants to edit a book, it creates a new `Book` object.

---

## Constructor

```java
public Book(long isbn, String title, String author) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
}
```

Meaning:

```text
Create a new Book object and store its data.
```

Example:

```java
Book book = new Book(111, "Java Basics", "Ali");
```

---

## Getters

```java
public long getIsbn()
public String getTitle()
public String getAuthor()
```

Purpose:

```text
Allow other classes to read the book data.
```

Because the fields are private, other classes cannot directly access them.

---

## `toString()`

```java
@Override
public String toString()
```

Purpose:

```text
Return book information as a readable string.
```

---

# 6. `LoanRecord.java`

## Purpose

`LoanRecord.java` represents one borrowing transaction.

It stores:

```text
studentId
book
borrowDate
dueDate
returned status
```

---

## Important fields

```java
private final String studentId;
private final Book book;
private final LocalDate borrowDate;
private final LocalDate dueDate;
private boolean returned;
```

Meaning:

```text
studentId  → who borrowed the book
book       → which book was borrowed
borrowDate → date borrowed
dueDate    → date the book should be returned
returned   → true or false
```

Only `returned` is not final because it can change.

At first:

```text
returned = false
```

After returning:

```text
returned = true
```

---

## `markReturned()`

```java
public void markReturned() {
    returned = true;
}
```

Purpose:

```text
Change loan status from Borrowed to Returned.
```

Important:

```text
The loan record is not deleted.
It stays in the borrowing history.
Only its status changes.
```

---

## `getStatus()`

```java
public String getStatus() {
    return returned ? "Returned" : "Borrowed";
}
```

Meaning:

```text
If returned is true, show "Returned".
If returned is false, show "Borrowed".
```

This uses the ternary operator:

```java
condition ? valueIfTrue : valueIfFalse
```

---

# 7. `User.java`

## Purpose

`User.java` represents one registered user.

Each user has:

```text
userId
name
role
```

---

## Fields

```java
private final String userId;
private final String name;
private final String role;
```

Example:

```text
A001 → Default Admin → ADMIN
S001 → Default Student → STUDENT
```

---

## Role

Role can be:

```text
ADMIN
STUDENT
```

Admin can manage books.

Student can borrow and return books.

---

# 8. `BorrowHistoryStack.java`

## Purpose

This file stores one student's borrowing history using a stack.

Newest loan appears first.

Example:

```text
top
 ↓
Loan C
Loan B
Loan A
```

---

## Node structure

```java
private static class Node {
    private final LoanRecord loanRecord;
    private final Node next;
}
```

Each node stores:

```text
LoanRecord
next node
```

This is similar to linked list node.

Linked list node:

```text
data + next
```

Stack node:

```text
loanRecord + next
```

---

## `top`

```java
private Node top;
```

`top` points to the newest loan record.

If stack is empty:

```text
top = null
```

---

## `push()`

```java
public void push(LoanRecord loanRecord) {
    top = new Node(loanRecord, top);
}
```

Purpose:

```text
Add a new loan record to the top of the stack.
```

Example before push:

```text
top → Loan B → Loan A
```

Push Loan C:

```text
top → Loan C → Loan B → Loan A
```

---

## `isEmpty()`

```java
public boolean isEmpty() {
    return top == null;
}
```

Meaning:

```text
If top is null, stack is empty.
```

---

## `findActiveLoanByIsbn()`

```java
public LoanRecord findActiveLoanByIsbn(long isbn)
```

Purpose:

```text
Find an unreturned loan with matching ISBN.
```

Important condition:

```java
!loanRecord.isReturned() && loanRecord.getBook().getIsbn() == isbn
```

Meaning:

```text
loan is not returned
AND
ISBN matches
```

If found:

```java
return loanRecord;
```

Important:

```text
return exits the whole method immediately.
It does not just exit the if statement.
```

So this method returns only the first matching active loan.

That is okay because the system removes a book from the available BST when borrowed.

---

## `toList()`

```java
public List<LoanRecord> toList()
```

Purpose:

```text
Convert stack into a list so Main.java can print it.
```

Order remains:

```text
newest first
```

---

# 9. `BookBST.java`

## Purpose

`BookBST.java` stores available books using a Binary Search Tree.

Books are sorted by ISBN.

---

## Main field

```java
private Node root;
```

`root` is the first/top node of the BST.

Empty tree:

```text
root = null
```

---

## Node structure

```java
private static class Node {
    private Book book;
    private Node left;
    private Node right;
}
```

Each BST node stores:

```text
Book
left child
right child
```

Rule:

```text
left  = smaller ISBN
right = larger ISBN
```

---

## `insert()`

```java
public boolean insert(Book book)
```

Purpose:

```text
Insert a book into the BST.
```

Returns:

```text
true  = inserted successfully
false = duplicate ISBN
```

If tree is empty:

```java
root = new Node(book);
```

If tree is not empty:

```java
insertRecursive(root, book);
```

---

## `insertRecursive()`

Logic:

```text
If new ISBN == current ISBN
→ duplicate, return false

If new ISBN < current ISBN
→ go left

If new ISBN > current ISBN
→ go right
```

Example insert order:

```text
50, 30, 70, 20, 40
```

Tree becomes:

```text
        50
       /  \
     30    70
    /  \
  20    40
```

---

## `search()`

```java
public Book search(long isbn)
```

Purpose:

```text
Search available book by ISBN.
```

Returns:

```text
Book object = found
null        = not found
```

Search rule:

```text
If target ISBN == current ISBN → found
If target ISBN < current ISBN  → search left
If target ISBN > current ISBN  → search right
If current is null             → not found
```

---

## `deleteByIsbn()`

```java
public boolean deleteByIsbn(long isbn)
```

Purpose:

```text
Delete a book from the BST.
```

Used when:

```text
1. Student borrows a book
2. Admin removes a book
3. Admin edits a book
```

Returns:

```text
true  = deleted
false = not found
```

---

## BST delete cases

There are 3 cases.

### Case 1: Delete node with no child

Example:

```text
    50
   /
 30
```

Delete `30`.

Result:

```text
50
```

---

### Case 2: Delete node with one child

Example:

```text
    50
   /
 30
 /
20
```

Delete `30`.

Result:

```text
    50
   /
 20
```

The child replaces the deleted node.

---

### Case 3: Delete node with two children

Example:

```text
        50
       /  \
     30    70
    /  \
  20    40
```

Delete `30`.

Use successor:

```text
successor = smallest node in right subtree
```

Right subtree of `30` is:

```text
40
```

So `40` replaces `30`.

Result:

```text
        50
       /  \
     40    70
    /
  20
```

---

## `findSmallest()`

```java
private Node findSmallest(Node current)
```

Purpose:

```text
Find smallest node in a subtree.
```

In BST:

```text
Smallest value is always at the far left.
```

---

## `toList()`

```java
public List<Book> toList()
```

Purpose:

```text
Convert BST into List<Book>.
```

Used when printing all available books.

---

## `addBooksInOrder()`

Uses in-order traversal:

```text
Left → Current → Right
```

For BST, this gives sorted order by ISBN.

Example tree:

```text
        50
       /  \
     30    70
    /  \
  20    40
```

In-order result:

```text
20, 30, 40, 50, 70
```

---

# 10. `LibraryADT.java`

## Purpose

`LibraryADT.java` is an interface.

An interface is like a contract.

It says:

```text
Any class that implements this interface must provide these methods.
```

---

## Important idea

```text
LibraryADT.java
→ what the system can do

SmartLibrary.java
→ how the system does it
```

---

## Methods in `LibraryADT`

```java
boolean addBook(long isbn, String title, String author);
Book searchBook(long isbn);
LoanRecord borrowBook(String studentId, long isbn);
LoanRecord returnBook(String studentId, long isbn);
List<LoanRecord> viewBorrowHistory(String studentId);
List<Book> viewAvailableBooks();
boolean editBook(long isbn, String title, String author);
Book removeBook(long isbn);
List<Book> searchByTitleOrAuthor(String keyword);
```

---

## Why use interface?

Because `Main.java` can use:

```java
LibraryADT LIBRARY = new SmartLibrary();
```

Meaning:

```text
Main.java depends on the contract, not the internal details.
```

This hides data structures like BST and stack from the UI.

---

# 11. `SmartLibrary.java`

## Purpose

`SmartLibrary.java` is the main library service.

It implements:

```java
LibraryADT
```

It connects:

```text
BookBST
BorrowHistoryStack
Book
LoanRecord
File saving/loading
```

---

## Main fields

```java
private final BookBST catalogue;
private final Map<String, BorrowHistoryStack> borrowHistories;
```

Meaning:

```text
catalogue
→ stores available books in BST

borrowHistories
→ maps each student ID to that student's borrowing stack
```

Example:

```text
borrowHistories
├── S001 → stack of S001 loans
├── S002 → stack of S002 loans
└── S003 → stack of S003 loans
```

---

## Constants

```java
private static final Path DATA_FILE = Path.of("smart_library_data.txt");
private static final int LOAN_DAYS = 14;
```

Meaning:

```text
Data is saved into smart_library_data.txt.
Borrowing period is 14 days.
```

---

## Constructor

```java
public SmartLibrary() {
    catalogue = new BookBST();
    borrowHistories = new LinkedHashMap<>();
    loadFromFile();
    saveToFile();
}
```

Flow:

```text
Create empty BST
Create empty map
Load saved data from file
Save current state back to file
```

---

## `addBook()`

Flow:

```text
Validate ISBN, title, author
Create Book object
Insert into BST
If successful, save file
Return true or false
```

---

## `searchBook()`

Flow:

```text
Check ISBN is positive
Search BST
Return Book or null
```

---

## `borrowBook()`

Purpose:

```text
Let student borrow a book.
```

Flow:

```text
Normalize student ID
Check ISBN
Search book in available BST
If not found → return null
Delete book from BST
Create LoanRecord
Push LoanRecord into student's stack
Save file
Return LoanRecord
```

Important:

```text
Borrowed books are removed from the available catalogue.
```

So another student cannot borrow the same available copy.

---

## `returnBook()`

Purpose:

```text
Let student return a borrowed book.
```

Flow:

```text
Normalize student ID
Get student's history stack
Find active loan by ISBN
If not found → return null
Mark loan as returned
Insert book back into BST
Save file
Return LoanRecord
```

Important:

```text
The LoanRecord stays in the history stack.
Only its status changes.
```

---

## Borrow vs Return

| Action | BST Catalogue             | Student Stack                        |
| ------ | ------------------------- | ------------------------------------ |
| Borrow | Remove book from BST      | Push new LoanRecord                  |
| Return | Insert book back into BST | Mark existing LoanRecord as returned |

---

## `viewBorrowHistory()`

Flow:

```text
Normalize student ID
Get student's history stack
If no stack, return empty list
Convert stack to list
Return List<LoanRecord>
```

Important:

```text
Returns empty list, not null.
```

---

## `viewAvailableBooks()`

Flow:

```text
Convert BST to list using in-order traversal
Return List<Book>
```

Books are sorted by ISBN.

---

## `editBook()`

Flow:

```text
Validate input
Check book exists in available BST
Delete old book
Insert new Book with same ISBN and new title/author
Save file
Return true
```

Why delete and insert?

Because `Book` fields are final.

The old object cannot be changed directly.

---

## `removeBook()`

Flow:

```text
Check ISBN
Search book
If not found → return null
Delete from BST
Save file
Return removed Book
```

Important:

```text
Only available books can be removed.
Borrowed books are not in the available BST.
```

---

## `searchByTitleOrAuthor()`

Flow:

```text
Create empty matches list
Clean keyword
Convert BST to list
Loop through all books
Check title contains keyword
Check author contains keyword
Add matching books
Return matches
```

Important:

```text
BST is sorted by ISBN, not title.
So title/author search must scan all available books.
```

---

# 12. `SmartLibrary.java` File Persistence

## Purpose

Persistence means:

```text
Data remains after program closes.
```

Files used:

```text
smart_library_data.txt
```

Stores:

```text
1. available books
2. loan records
```

---

## File format

```text
[CATALOGUE]
isbn|title|author

[LOANS]
studentId|isbn|title|author|borrowDate|dueDate|returned
```

Example:

```text
[CATALOGUE]
111|Java Basics|Ali

[LOANS]
S001|222|Clean Code|Robert Martin|2026-06-15|2026-06-29|false
```

---

## `loadFromFile()`

Purpose:

```text
Read smart_library_data.txt and rebuild the program data.
```

Flow:

```text
If file does not exist → return
Read all lines
Track current section
If section is [CATALOGUE]
    parse line into Book
    insert Book into BST

If section is [LOANS]
    parse line into LoanRecord
    store temporarily in Map<String, List<LoanRecord>>

After reading all lines
    rebuild stacks using loadHistoryStacks()
```

---

## Why use temporary loan list?

Because stack order matters.

If file order is:

```text
Loan C
Loan B
Loan A
```

and we push normally:

```text
push C
push B
push A
```

Final stack becomes:

```text
top → A → B → C
```

Wrong.

So the system pushes in reverse order:

```text
push A
push B
push C
```

Final stack:

```text
top → C → B → A
```

Correct.

---

## `saveToFile()`

Purpose:

```text
Write current data back to smart_library_data.txt.
```

Flow:

```text
Create empty list of lines
Add [CATALOGUE]
Convert BST to list
Format each book
Add [LOANS]
Loop through all student stacks
Convert each stack to list
Format each loan
Write all lines to file
```

---

## `formatBook()`

Converts:

```text
Book object
```

into:

```text
isbn|title|author
```

---

## `formatLoanRecord()`

Converts:

```text
LoanRecord object
```

into:

```text
studentId|isbn|title|author|borrowDate|dueDate|returned
```

---

## `parseBook()`

Converts:

```text
isbn|title|author
```

into:

```java
Book
```

---

## `parseLoanRecord()`

Converts:

```text
studentId|isbn|title|author|borrowDate|dueDate|returned
```

into:

```java
LoanRecord
```

---

## `escape()` and `splitLine()`

Why needed?

Because the file uses `|` as separator.

If title contains `|`, it can break the file.

Example title:

```text
Java | Beginner
```

Saved as:

```text
Java \| Beginner
```

`escape()` is used when saving.

`splitLine()` is used when loading.

---

# 13. `UserStore.java`

## Purpose

`UserStore.java` manages registered users.

It handles:

```text
1. Loading users
2. Saving users
3. Finding users
4. Registering users
5. Checking user ID
6. Deciding role
```

---

## Main file

```text
user_info.txt
```

Format:

```text
[USERS]
userId|name|role
```

Example:

```text
[USERS]
A001|Default Admin|ADMIN
S001|Default Student|STUDENT
```

---

## Main field

```java
private final Map<String, User> users;
```

Meaning:

```text
userId → User object
```

Example:

```text
A001 → Default Admin
S001 → Default Student
```

---

## Default users

If no user file exists or no user is loaded:

```text
A001 → Default Admin → ADMIN
S001 → Default Student → STUDENT
```

---

## User ID rule

```text
Starts with A → ADMIN
Starts with S → STUDENT
```

Examples:

```text
A001 → valid admin
S001 → valid student
B001 → invalid
001  → invalid
```

---

## `findUser()`

Flow:

```text
Check userId is not null
Normalize userId
Search users map
Return User or null
```

Example:

```text
" s001 " → "S001"
```

---

## `registerUser()`

Flow:

```text
Normalize user ID
Check ID starts with A or S
Check name not blank
Check user ID not already used
Create User object
Put into users map
Save users
Return true
```

---

## `isValidUserId()`

Returns true if:

```text
userId starts with A or S
```

---

## `getRoleFromUserId()`

```text
A → ADMIN
S → STUDENT
```

---

## `loadUsers()`

Flow:

```text
If user_info.txt does not exist → return
Read all lines
Find [USERS] section
Parse each user row
Store User in map
```

---

## `saveUsers()`

Flow:

```text
Create lines
Add [USERS]
Format each user
Write to user_info.txt
```

---

# 14. `Main.java`

## Purpose

`Main.java` is the console user interface.

It handles:

```text
1. Menu printing
2. Input reading
3. Login
4. Registration
5. Admin options
6. Student options
7. Output tables
```

Important:

```text
Main.java does not directly manage BST or stack.
It calls SmartLibrary and UserStore.
```

---

## Main objects

```java
private static final Scanner SCANNER = new Scanner(System.in);
private static final LibraryADT LIBRARY = new SmartLibrary();
private static final UserStore USER_STORE = new UserStore();
```

Meaning:

```text
SCANNER
→ reads keyboard input

LIBRARY
→ handles book and loan operations

USER_STORE
→ handles user registration and lookup
```

---

## `main()`

Flow:

```text
running = true

while running:
    print entry menu
    read choice

    1 → login
    2 → register
    3 → exit
```

---

## Entry menu

```text
1. Login
2. Register
3. Exit
```

---

## `login()`

Flow:

```text
Ask user ID
Clean input
If empty → return
Find user in UserStore
If not found → return
Identify role
If ADMIN → runAdminMenu()
If STUDENT → runStudentMenu()
```

Important:

```text
There is no password in this project.
Login uses user ID only.
```

---

## `registerUser()`

Flow:

```text
Ask new user ID
Check ID starts with A or S
Ask full name
Call USER_STORE.registerUser()
Print success or fail
```

---

## `identifyRole()`

```text
If user ID starts with A → ADMIN
If user ID starts with S → STUDENT
```

---

# 15. Admin Menu

Admin options:

```text
1. Add Book
2. Search Book by ISBN
3. View All Available Books
4. Edit Book Details
5. Remove Book
6. Search by Title or Author
7. View Student History
8. Logout
```

Admin can manage books.

---

# 16. Student Menu

Student options:

```text
1. Search Book by ISBN
2. Borrow Book
3. Return Book
4. View My History
5. View All Available Books
6. Search by Title or Author
7. Logout
```

Student can borrow, return, and view own history.

---

# 17. `Main.java` Action Methods

## `addBook()`

Flow:

```text
Read ISBN
Read title
Read author
Call LIBRARY.addBook()
Print success or fail
```

---

## `searchBookByIsbn()`

Flow:

```text
Read ISBN
Call LIBRARY.searchBook()
If null → not found
Else → print book table
```

---

## `borrowBook(studentId)`

Flow:

```text
Read ISBN
Call LIBRARY.borrowBook(studentId, isbn)
If null → borrow failed
Else → print loan record
```

---

## `returnBook(studentId)`

Flow:

```text
Read ISBN
Call LIBRARY.returnBook(studentId, isbn)
If null → return failed
Else → print returned loan record
```

---

## `viewStudentHistoryByAdmin()`

Flow:

```text
Admin enters student ID
Call viewStudentHistory(studentId)
```

---

## `viewStudentHistory(studentId)`

Flow:

```text
Call LIBRARY.viewBorrowHistory(studentId)
If empty → no history
Else → print loan table
```

---

## `viewAllAvailableBooks()`

Flow:

```text
Call LIBRARY.viewAvailableBooks()
If empty → no books
Else → print book table
```

---

## `editBookDetails()`

Flow:

```text
Read ISBN
Search current book
If not found → fail
Print current book
Read new title
Read new author
Call LIBRARY.editBook()
Print result
```

---

## `removeBook()`

Flow:

```text
Read ISBN
Call LIBRARY.removeBook()
If null → fail
Else → print removed book
```

---

## `searchByTitleOrAuthor()`

Flow:

```text
Read keyword
Call LIBRARY.searchByTitleOrAuthor()
If empty → no match
Else → print matching books
```

---

# 18. Printing Methods

## `printBooks()`

Prints books in a table:

```text
No | ISBN | Title | Author
```

It calculates column width based on longest content.

So long titles do not break the table.

---

## `printLoanRecords()`

Prints loan records in a table:

```text
No | ISBN | Title | Borrowed | Due | Status
```

Status can be:

```text
Borrowed
Returned
```

---

## `readPositiveIsbn()`

Purpose:

```text
Read and validate ISBN.
```

Rejects:

```text
blank input
letters
zero
negative numbers
```

Returns:

```text
Long value = valid ISBN
null       = invalid ISBN
```

It returns `Long`, not `long`, because `Long` can be null.

---

## `readRequiredText()`

Purpose:

```text
Read required text input.
```

Rejects blank input.

Returns:

```text
String = valid input
null   = blank input
```

---

# 19. Full Borrow Flow

Example:

```text
Student S001 borrows ISBN 111.
```

Flow:

```text
Main.java
borrowBook("S001")
        ↓
Read ISBN 111
        ↓
LIBRARY.borrowBook("S001", 111)
        ↓
SmartLibrary.borrowBook()
        ↓
Search BookBST for ISBN 111
        ↓
If found, delete ISBN 111 from BookBST
        ↓
Create LoanRecord
        ↓
Get S001 BorrowHistoryStack
        ↓
Push LoanRecord onto stack
        ↓
Save to smart_library_data.txt
        ↓
Return LoanRecord to Main.java
        ↓
Main.java prints loan table
```

After borrow:

```text
Book removed from available BST.

S001 stack:
top → LoanRecord ISBN 111, Borrowed
```

---

# 20. Full Return Flow

Example:

```text
Student S001 returns ISBN 111.
```

Flow:

```text
Main.java
returnBook("S001")
        ↓
Read ISBN 111
        ↓
LIBRARY.returnBook("S001", 111)
        ↓
SmartLibrary.returnBook()
        ↓
Get S001 BorrowHistoryStack
        ↓
Find active loan by ISBN 111
        ↓
Mark loan as returned
        ↓
Insert book back into BookBST
        ↓
Save to smart_library_data.txt
        ↓
Return LoanRecord to Main.java
        ↓
Main.java prints returned loan table
```

After return:

```text
Book is available again in BST.

S001 stack:
top → LoanRecord ISBN 111, Returned
```

---

# 21. Full Add Book Flow

```text
Admin chooses Add Book
        ↓
Main reads ISBN, title, author
        ↓
LIBRARY.addBook()
        ↓
SmartLibrary validates input
        ↓
Create Book object
        ↓
Insert into BookBST
        ↓
Save file
        ↓
Print result
```

---

# 22. Full View Available Books Flow

```text
User chooses View All Available Books
        ↓
Main calls LIBRARY.viewAvailableBooks()
        ↓
SmartLibrary calls catalogue.toList()
        ↓
BookBST uses in-order traversal
        ↓
Returns sorted List<Book>
        ↓
Main prints book table
```

---

# 23. Important Java Concepts Used

## `private`

Means only this class can access it.

Example:

```java
private Node root;
```

---

## `final`

Means value cannot be changed after assigned.

Example:

```java
private final String title;
```

---

## `static`

Means belongs to the class, not one object.

Example:

```java
private static final Scanner SCANNER;
```

---

## `return`

Means exit the current method immediately.

Example:

```java
if (isbn == null) {
    return;
}
```

This exits the method, not the whole program.

---

## `continue`

Means skip current loop round and go to next round.

---

## `try-catch`

Used to handle errors safely.

Example:

```java
try {
    long isbn = Long.parseLong(input);
} catch (NumberFormatException error) {
    return null;
}
```

---

## `List`

General list type.

Example:

```java
List<Book> books = new ArrayList<>();
```

---

## `ArrayList`

Actual resizable list implementation.

---

## `Map`

Stores key-value pairs.

Example:

```java
Map<String, User> users;
```

---

## `LinkedHashMap`

A map that keeps insertion order.

---

## `interface`

A contract that lists methods.

Example:

```java
public interface LibraryADT
```

---

## `implements`

Means a class promises to provide methods from an interface.

Example:

```java
public class SmartLibrary implements LibraryADT
```

---

# 24. Common Mistakes

## Mistake 1: Thinking `Main.java` stores books

Wrong.

`Main.java` only handles menu and input.

Books are stored inside `SmartLibrary`, using `BookBST`.

---

## Mistake 2: Thinking borrowed books stay available

Wrong.

When borrowed, the book is deleted from the available BST.

---

## Mistake 3: Thinking return creates a new loan record

Wrong.

Return finds the active loan and marks it as returned.

---

## Mistake 4: Thinking BST sorts by title

Wrong.

The BST sorts by ISBN only.

---

## Mistake 5: Thinking title search uses BST search

Wrong.

Title/author search loops through all available books.

---

## Mistake 6: Thinking stack removes returned records

Wrong.

The stack keeps all history.

Returned records stay in the stack.

---

## Mistake 7: Thinking interface contains full logic

Wrong.

`LibraryADT.java` only declares methods.

`SmartLibrary.java` implements the actual logic.

---

## Mistake 8: Thinking `return` exits a loop only

Wrong.

`return` exits the whole method.

---

## Mistake 9: Thinking `List` and `ArrayList` are the same

Not exactly.

```text
List = general type / interface
ArrayList = actual implementation
```

Common style:

```java
List<Book> books = new ArrayList<>();
```

---

## Mistake 10: Thinking user role is typed manually

Wrong.

Role is decided by user ID prefix:

```text
A → ADMIN
S → STUDENT
```

---

# 25. Viva / Exam Questions and Answers

## Q1. What is the main purpose of this project?

It is a Java console library system that allows admins to manage books and students to borrow, return, and view borrowing history.

---

## Q2. What data structure stores available books?

A Binary Search Tree.

---

## Q3. Why use BST for books?

Because books are searched and sorted by ISBN.

BST allows left/right searching based on ISBN.

---

## Q4. What is the BST rule?

```text
Smaller ISBN goes left.
Larger ISBN goes right.
```

---

## Q5. What data structure stores borrowing history?

A stack.

---

## Q6. Why use stack for borrowing history?

Because the newest borrowing record should appear first.

Stack supports Last In, First Out.

---

## Q7. What does `top` mean in stack?

`top` points to the newest node in the stack.

---

## Q8. What happens when a student borrows a book?

The book is removed from the available BST, a `LoanRecord` is created, and the record is pushed into the student's stack.

---

## Q9. What happens when a student returns a book?

The active loan is found, marked as returned, and the book is inserted back into the BST.

---

## Q10. Why is the loan record not deleted after return?

Because the system wants to keep borrowing history.

---

## Q11. What is `LibraryADT.java`?

It is an interface that defines the library operations.

---

## Q12. What class implements `LibraryADT`?

`SmartLibrary.java`.

---

## Q13. What does `UserStore.java` do?

It manages registered users and saves/loads them from `user_info.txt`.

---

## Q14. How does the system decide admin or student?

By user ID prefix.

```text
A → ADMIN
S → STUDENT
```

---

## Q15. What file stores books and loans?

```text
smart_library_data.txt
```

---

## Q16. What file stores users?

```text
user_info.txt
```

---

## Q17. What is in-order traversal?

Traversal order:

```text
Left → Current → Right
```

For BST, it returns sorted order.

---

## Q18. What are the three BST delete cases?

```text
1. Node has no child
2. Node has one child
3. Node has two children
```

---

## Q19. What is successor in BST deletion?

The smallest node in the right subtree.

---

## Q20. Why does `readPositiveIsbn()` return `Long` instead of `long`?

Because `Long` can be null when input is invalid.

---

# 26. Quick Final Revision

```text
Book.java
→ Stores book data.

LoanRecord.java
→ Stores borrowing transaction.

User.java
→ Stores user data.

BorrowHistoryStack.java
→ Stack for one student's loan history.

BookBST.java
→ BST for available books.

LibraryADT.java
→ Interface / contract for library operations.

SmartLibrary.java
→ Main library logic. Connects BST, stack, map, and files.

UserStore.java
→ User registration, lookup, role, and file saving.

Main.java
→ Console menu, input, and output.
```

---

# 27. One-Sentence Summary

Smart Library is a Java console system where available books are stored in a BST by ISBN, each student’s borrowing history is stored in a stack, users are stored in a map, and all data is saved into text files for persistence.
