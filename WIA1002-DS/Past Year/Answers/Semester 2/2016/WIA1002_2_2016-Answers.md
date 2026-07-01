# WIA1002 Semester 2 2015/2016 - Answers

## Question 1 - `Day`

### (a) UML

```text
+----------------------------------+
| Day                              |
+----------------------------------+
| - dayNumber: int                 |
| - NAMES: String[] {static}       |
+----------------------------------+
| + Day(dayNumber: int)            |
| + getName(): String              |
| + nextDay(): Day                 |
| + previousDay(): Day             |
| + addDays(days: int): Day        |
| + toString(): String             |
+----------------------------------+
```

### (b) Implementation

```java
public class Day {
    private static final String[] NAMES={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private final int dayNumber;
    public Day(int dayNumber){if(dayNumber<1||dayNumber>7)throw new IllegalArgumentException("day must be 1..7");this.dayNumber=dayNumber;}
    public String getName(){return NAMES[dayNumber-1];}
    public Day nextDay(){return addDays(1);}
    public Day previousDay(){return addDays(-1);}
    public Day addDays(int days){return new Day(Math.floorMod(dayNumber-1+days,7)+1);}
    public String toString(){return getName();}
}
```

### (c) Test program

```java
import java.util.Scanner;
public class TestDay{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);System.out.print("Specify day (1=Monday ... 7=Sunday): ");
        Day day=new Day(in.nextInt());System.out.println("The name of the day is: "+day);
        System.out.println("The following day of "+day+" is: "+day.nextDay());
        System.out.println("The previous day of "+day+" is: "+day.previousDay());
        System.out.print("How many days to add? ");int n=in.nextInt();
        System.out.println("The new day after addition is: "+day.addDays(n));
    }
}
```

## Question 2 - Matching brackets

### (a) Pseudocode

```text
create empty stack S; foundBracket = false
for each character c in input
    if c is one of ( [ { < : push c; foundBracket = true
    else if c is one of ) ] } >
        foundBracket = true
        if S is empty or pop(S) is not the matching opening bracket: NOT MATCHED
after loop:
    if not foundBracket: NO BRACKET
    else if S is empty: YES - ALL MATCHED
    else: NOT MATCHED
```

### (b) Java program reading `BracMatch.txt`

```java
import java.io.BufferedReader;
import java.io.FileReader;

public class BracketMatcher{
    static String check(String text){
        char[] stack=new char[text.length()];int top=-1;boolean found=false;
        for(char c:text.toCharArray()){
            if("([{<".indexOf(c)>=0){stack[++top]=c;found=true;}
            else if(")]}>".indexOf(c)>=0){
                found=true;if(top<0||!matches(stack[top--],c))return "Not all brackets are matched";
            }
        }
        if(!found)return "There is no bracket in the input";
        return top==-1?"YES - all matched!":"Not all brackets are matched";
    }
    static boolean matches(char left,char right){return left=='('&&right==')'||left=='['&&right==']'||left=='{'&&right=='}'||left=='<'&&right=='>';}
    public static void main(String[]args)throws Exception{
        try(BufferedReader r=new BufferedReader(new FileReader("BracMatch.txt"))){
            for(String line;(line=r.readLine())!=null;)System.out.println(line+" -> "+check(line));
        }
    }
}
```

## Question 3 - Queue and `ChangeOrder`

```java
class Queue<E>{
    private Object[]a=new Object[10];private int front,size;
    boolean isEmpty(){return size==0;}int size(){return size;}
    @SuppressWarnings("unchecked")E peek(){return isEmpty()?null:(E)a[front];}
    void enqueue(E e){if(size==a.length)grow();a[(front+size)%a.length]=e;size++;}
    @SuppressWarnings("unchecked")E dequeue(){if(isEmpty())return null;E e=(E)a[front];a[front]=null;front=(front+1)%a.length;size--;return e;}
    void ChangeOrder(int k){if(k<1||k>size)throw new IllegalArgumentException();for(int i=1;i<k;i++)enqueue(dequeue());}
    void grow(){Object[]b=new Object[a.length*2];for(int i=0;i<size;i++)b[i]=a[(front+i)%a.length];a=b;front=0;}
    public String toString(){StringBuilder s=new StringBuilder("[");for(int i=0;i<size;i++){if(i>0)s.append(", ");s.append(a[(front+i)%a.length]);}return s.append(']').toString();}
}
public class TestQueue{
    public static void main(String[]args){Queue<Integer>q=new Queue<>();for(int n=10;n<=90;n+=10)q.enqueue(n);q.ChangeOrder(4);System.out.println(q);}
}
```

Output: `[40, 50, 60, 70, 80, 90, 10, 20, 30]`.

## Question 4 - Singly linked list

```java
public class LinkedList{
    private static class Node{int value;Node next;Node(int v){value=v;}}
    private Node head,tail;
    void add(int v){Node n=new Node(v);if(tail==null)head=tail=n;else{tail.next=n;tail=n;}}
    boolean addAfter(int value,int after){Node p=find(after);if(p==null)return false;Node n=new Node(value);n.next=p.next;p.next=n;if(tail==p)tail=n;return true;}
    Integer deleteFront(){if(head==null)return null;int v=head.value;head=head.next;if(head==null)tail=null;return v;}
    boolean deleteAfter(int x){Node p=find(x);if(p==null||p.next==null)return false;if(p.next==tail)tail=p;p.next=p.next.next;return true;}
    Node find(int v){for(Node p=head;p!=null;p=p.next)if(p.value==v)return p;return null;}
    void traverse(){for(Node p=head;p!=null;p=p.next)System.out.print(p.value+" ");System.out.println();}
    public static void main(String[]args){LinkedList s=new LinkedList();for(int n=10;n<=50;n+=10)s.add(n);s.addAfter(11,10);s.addAfter(21,20);s.addAfter(31,30);s.addAfter(41,40);s.addAfter(51,50);s.traverse();s.deleteFront();s.deleteFront();s.traverse();s.deleteAfter(40);s.deleteAfter(40);s.deleteAfter(31);s.deleteAfter(40);s.traverse();}
}
```
