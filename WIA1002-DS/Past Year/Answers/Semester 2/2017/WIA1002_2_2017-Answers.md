# WIA1002 Semester 2 2016/2017 - Answers

## Question 1 - Handbag linked list

```java
public class HandbagList{
    private static class Node{String brand;long sold;Node next;Node(String b,long s,Node n){brand=b;sold=s;next=n;}}
    private Node head;
    void insertFirstLink(String brand,int millions){head=new Node(brand,millions*1_000_000L,head);}
    boolean addAfter(String existing,String brand,int millions){Node p=find(existing);if(p==null)return false;p.next=new Node(brand,millions*1_000_000L,p.next);return true;}
    boolean removeLink(String brand){Node prev=null,cur=head;while(cur!=null&&!cur.brand.equals(brand)){prev=cur;cur=cur.next;}if(cur==null)return false;if(prev==null)head=cur.next;else prev.next=cur.next;return true;}
    Node find(String b){for(Node p=head;p!=null;p=p.next)if(p.brand.equals(b))return p;return null;}
    void display(){for(Node p=head;p!=null;p=p.next)System.out.printf("%s: %,d Sold%n",p.brand,p.sold);}
    public static void main(String[]args){
        HandbagList l=new HandbagList();
        l.insertFirstLink("Tods",500);l.insertFirstLink("Prada",1);l.insertFirstLink("Chanel",100);l.insertFirstLink("Louis Vuitton",10);
        l.display();l.addAfter("Chanel","Coach",10);l.display();l.addAfter("Coach","Mulberry",90);l.display();
        l.removeLink("Chanel");l.display();l.removeLink("Coach");l.display();
    }
}
```

## Question 2 - Stack interface and generic implementation

### (a) Interface design

Java interfaces cannot declare constructors or per-object `ArrayList` attributes; interface
fields are implicitly `public static final`. Those belong in the implementing class.

```java
interface StackInterface<E>{
    int getSize();E peek();E pop();void push(E e);boolean isEmpty();
}
```

### (b) `GenericStack<E>`

```java
import java.util.ArrayList;
class GenericStack<E> implements StackInterface<E>{
    private final ArrayList<E> elements=new ArrayList<>();
    public int getSize(){return elements.size();}
    public E peek(){return elements.get(elements.size()-1);}
    public E pop(){return elements.remove(elements.size()-1);}
    public void push(E e){elements.add(e);}
    public boolean isEmpty(){return elements.isEmpty();}
    public String toString(){return elements.toString();}
}
```

### (c) `TestPileStack`

```java
import java.util.Scanner;
public class TestPileStack{
    public static void main(String[]args){
        GenericStack<String>pile=new GenericStack<>();Scanner in=new Scanner(System.in);
        System.out.println("isEmpty() returns "+pile.isEmpty());
        for(int i=1;i<=3;i++){System.out.print("Enter book title "+i+": ");pile.push(in.nextLine());}
        System.out.println("Books: "+pile);System.out.println("The pile has "+pile.getSize()+" books.");
        while(!pile.isEmpty()){System.out.println(pile.peek()+" is at the top.");System.out.println(pile.pop()+" is removed.");}
        System.out.println("isEmpty() returns "+pile.isEmpty());
    }
}
```

## Question 3 - Generic BST methods

```java
import java.util.ArrayDeque;

class BinarySearchTree<E extends Comparable<E>>{
    static class Node<E>{E item;Node<E>left,right;Node(E item){this.item=item;}}
    private Node<E>root;
    public boolean add(E item){if(root==null){root=new Node<>(item);return true;}return add(root,item);}
    public boolean add(Node<E>node,E item){
        int c=item.compareTo(node.item);if(c==0)return false;
        if(c<0){if(node.left==null){node.left=new Node<>(item);return true;}return add(node.left,item);}
        if(node.right==null){node.right=new Node<>(item);return true;}return add(node.right,item);
    }
    public void printTreeInOrder(){
        ArrayDeque<Node<E>>stack=new ArrayDeque<>();Node<E>cur=root;
        while(cur!=null||!stack.isEmpty()){while(cur!=null){stack.push(cur);cur=cur.left;}cur=stack.pop();System.out.print(cur.item+" ");cur=cur.right;}
        System.out.println();
    }
    public boolean contains(E item){Node<E>p=root;while(p!=null){int c=item.compareTo(p.item);if(c==0)return true;p=c<0?p.left:p.right;}return false;}
}
```

## Question 4 - Queue alphabet decoder

```java
import java.util.Arrays;
import java.util.Scanner;

class Queue<E>{
    private Object[]data;private int front,size;
    Queue(){this(10);}Queue(int capacity){data=new Object[capacity];}Queue(E[]items){this(items.length);for(E e:items)enqueue(e);}
    void enqueue(E e){if(size==data.length)data=Arrays.copyOf(data,Math.max(1,data.length*2));data[(front+size)%data.length]=e;size++;}
    @SuppressWarnings("unchecked")E dequeue(){if(isEmpty())return null;E e=(E)data[front];data[front]=null;front=(front+1)%data.length;size--;return e;}
    @SuppressWarnings("unchecked")E getElement(int i){if(i<0||i>=size)throw new IndexOutOfBoundsException();return(E)data[(front+i)%data.length];}
    int getSize(){return size;}boolean isEmpty(){return size==0;}
    public String toString(){StringBuilder s=new StringBuilder("[");for(int i=0;i<size;i++){if(i>0)s.append(", ");s.append(getElement(i));}return s.append(']').toString();}
}

public class Decoder{
    public static void main(String[]args){
        Character[]letters=new Character[26];for(int i=0;i<26;i++)letters[i]=(char)('a'+i);Queue<Character>q=new Queue<>(letters);
        Scanner in=new Scanner(System.in);System.out.println("Queue: "+q);System.out.print("How many numbers? ");int count=in.nextInt();
        int[]entered=new int[count];StringBuilder word=new StringBuilder();
        for(int i=0;i<count;i++){System.out.print("Enter number "+(i+1)+": ");entered[i]=in.nextInt();if(entered[i]<0||entered[i]>=26)throw new IllegalArgumentException("valid indexes are 0..25");word.append(q.getElement(entered[i]));}
        System.out.println("The entered numbers are "+Arrays.toString(entered));
        System.out.println(count==0?"Cannot decipher. No value was entered.":"The deciphered values are "+word);
    }
}
```

For `3,0,19,0,18,19,17,20,2,19,20,17,4`, the result is `datastructure`.
The paper prints index 26, but a 26-letter zero-based array has valid indexes `0..25`.
