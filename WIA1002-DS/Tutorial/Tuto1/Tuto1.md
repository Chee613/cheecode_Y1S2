# WIA1002-DS TAN CHEE KEAT 25006123
# Tutorial 1: Programming Fundamentals (Revision)

### Question 1: Telephone Class Definition

Write the definition of a class `Telephone` that contains:

* An instance variable `areaCode`
* An instance variable `number`
* A static variable `numberOfTelephoneObject` that keeps track of the number of `Telephone` objects created
* A constructor that accepts two arguments used to initialize the two instance variables
* The accessor and mutator methods for `areaCode` and `number`
* A method `makeFullNumber` that does not accept any argument, concatenates `areaCode` and `number` with a dash in between, and returns the resultant `String`.

**Write the statements to:**

* Instantiate 5 `Telephone` objects and store them in an array. 
* Iterate through the array to print the full number of the 5 `Telephone` objects on the console. 

**Expected Output:**

```text
03-79676300
03-79676301
03-79676302
03-79676303
03-79676304
```
<details><summary><i> Answer</summary></i>

## Telephone.java
```java
public class Telephone {
    // Instance variables
    private String areaCode;
    private String number;
    
    // Static variable to keep track of created objects
    private static int numberOfTelephoneObject = 0;

    // Constructor to initialize instance variables
    public Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    // Accessor (getter) and mutator (setter) methods
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // Method to concatenate areaCode and number with a dash
    public String makeFullNumber() {
        return areaCode + "-" + number;
    }
    
    public static int getNumberOfTelephoneObject() {
        return numberOfTelephoneObject;
    }
}

```

## T1Q1.java

```java
public class T1Q1 {
    public static void main(String[] args) {
        // Instantiate 5 Telephone objects and store them in an array
        Telephone[] phones = new Telephone[5];
        
        for (int i = 0; i < 5; i++) {
            phones[i] = new Telephone("03", "7967630" + i);
        }

        // Iterate through the array to print the full number
        for (Telephone phone : phones) {
            System.out.println(phone.makeFullNumber());
        }
    }
}
```
</details>

_______

### Question2: What is the output for the following? Explain.
```java
class Person {
    public Person () {
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person {
    public Employee () {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
    
    public Employee (String s) {
        System.out.println(s);
    }
}

public class Faculty extends Employee {
    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }
    
    public static void main(String[] args) {
        new Faculty();
    }
}
```
<details><summary><i> Answer</summary></i>

### Output:
```
(1) Performs Person's tasks
(2) Invoke Employee' overloaded constructor
(3) Performs Employee's tasks 
(4) Performs Faculty's tasks
```
### Explaination:

1.	In the main method, new Faculty(); is called. 
This invokes the no-argument constructor of the Faculty class.
2.	The first implicit statement in the Faculty() constructor is super();, which calls the no-argument constructor of its superclass, Employee.
3.	Inside the Employee() constructor, the explicit call this("(2) Invoke Employee' overloaded constructor"); is made. 
This redirects to the overloaded Employee(String s) constructor within the same class.
4.	The first implicit statement in the Employee(String s) constructor is super();, which invokes the no-argument constructor of its superclass, Person.
5.	The Person() constructor executes and prints "(1) Performs Person's tasks".
6.	Control returns to Employee(String s), which prints the string passed to it: "(2) Invoke Employee' overloaded constructor".
7.	Control returns to the no-argument Employee() constructor, which executes its next line and prints "(3) Performs Employee's tasks ".
8.	Finally, control returns to the Faculty() constructor, which executes its print statement: "(4) Performs Faculty's tasks".
</details>

_________________________________________________________________________________________________________________________________

### Question3: What is the output for the following? Explain.
```java
public class C {
    public static void main(String[] args) {
        Object[] o = {new A(), new B()}; 
        System.out.print(o[0]);
        System.out.print(o[1]);
    }
}

class A extends B {
    public String toString() {
        return "A";
    }
}

class B {
    public String toString() {
        return "B";
    }
}
```
a. AB 
b. BA 
c. AA 
d. BB

<details><summary><i> Answer</summary></i>

### Output: a. AB

### Explaination:
The array `o` of type `Object` stores two objects: an instance of class `A` at index `0` and an instance of class `B` at index `1`.

* When `System.out.print(o[0])` is executed, Java implicitly calls the `toString()` method on the object at index `0`. Because the object is of type `A`, and class `A` overrides the `toString()` method to return `"A"`, **"A"** is printed.

* When `System.out.print(o[1])` is executed, Java implicitly calls `toString()` on the object at index `1`. This object is of type `B`, and class `B` overrides `toString()` to return `"B"`, so **"B"** is printed right after.

Therefore, the final output is **AB**.
</details>

_____________________________________________________________________________________________

### Question 4: Write a class definition for an abstract class, `Vehicle`, that contains:

* a `double` instance variable, `maxSpeed`
* a `protected double` instance variable, `currentSpeed`
* a constructor accepting a `double` used to initialize the `maxSpeed` instance variable
* an abstract method, `accelerate`, that accepts no parameters and returns nothing.
* a method `getCurrentSpeed` that returns the value of `currentSpeed`
* a method `getMaxSpeed` that returns the value of `maxSpeed`
* a method `pedalToTheMetal`, that repeatedly calls `accelerate` until the speed of the vehicle is equal to `maxSpeed`. `pedalToTheMetal` returns nothing.

Can you create an instance of `Vehicle`?

<details><summary><i> Answer</summary></i>

```java
public abstract class Vehicle {
    // Instance variables
    private double maxSpeed;
    protected double currentSpeed;

    // Constructor
    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0.0; // Defaulting to 0 initially
    }

    // Abstract method
    public abstract void accelerate();

    // Accessor methods
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Method to repeatedly call accelerate
    public void pedalToTheMetal() {
        while (currentSpeed < maxSpeed) {
            accelerate();
        }
    }
}
```
#### <i>No, you cannot create an instance of Vehicle directly using the new keyword because it is an abstract class. You can only create an instance of a concrete subclass that extends Vehicle and provides an implementation for the abstract accelerate() method.</i>
</details>

_______________________________________________________________________________________________
### Question 5: Assume the existence of an interface, `Account`, with the following methods:

* `deposit`: accepts an integer parameter and returns an integer
* `withdraw`: accepts an integer parameter and return a Boolean

Define a class, `BankAccount`, that implements the above interface and has the following members:
* an instance variable named `balance`
* a constructor that accepts an integer that is used to initialize the instance variable
* an implementation of the `deposit` method that adds its parameter to the `balance` variable. The new balance is returned as the value of the method.
* an implementation of the `withdraw` method that checks whether its parameter is less than or equal to the `balance` and if so, decreases the `balance` by the value of the parameter and returns `true`; otherwise, it leaves the `balance` unchanged and returns `false`.

<details><summary><i> Answer</summary></i>

```java
// Assuming the interface is defined as:
interface Account {
    int deposit(int amount);
    boolean withdraw(int amount);
}

public class BankAccount implements Account {
    // Instance variable
    private int balance;

    // Constructor
    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Implementation of the deposit method
    @Override
    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    // Implementation of the withdraw method
    @Override
    public boolean withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
```
</details>