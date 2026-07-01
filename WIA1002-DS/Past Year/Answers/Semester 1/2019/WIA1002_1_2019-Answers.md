# WIA1002 Semester 1 2018/2019 - Answers

## Question 1 - Generic stack

The paper's `GenericStack<Integer>.pushMany("3 4,5,6 7")` example is not type-safe:
`"3 4"` and `"6 7"` are strings, not integers. The solution below uses a parser so `pushMany`
remains genuinely generic; the integer call should use comma-separated integer tokens.

```java
import java.util.function.Function;

class GenericStack<E> {
    private final Object[] data;
    private int size;
    private final Function<String,E> parser;
    GenericStack(int capacity, Function<String,E> parser) {
        data = new Object[capacity]; this.parser = parser;
    }
    boolean isEmpty() { return size == 0; }
    boolean isFull() { return size == data.length; }
    @SuppressWarnings("unchecked") E peek() { return isEmpty() ? null : (E)data[size-1]; }
    boolean push(E e) { if (isFull()) return false; data[size++] = e; return true; }
    void pushMany(String input) {
        for (String token : input.split(","))
            if (!push(parser.apply(token.trim()))) break;
    }
    @SuppressWarnings("unchecked") E pop() {
        if (isEmpty()) return null;
        E e=(E)data[--size]; data[size]=null; return e;
    }
    void popAll() { while (!isEmpty()) System.out.println("Removing " + pop()); }
    void display() {
        if (isEmpty()) { System.out.println("Stack is empty, nothing to display."); return; }
        for (int i=size-1;i>=0;i--) System.out.println(data[i]);
    }
}

public class Q1 {
    public static void main(String[] args) {
        GenericStack<String> s1 = new GenericStack<>(5, s -> s);
        s1.push("one"); s1.display();
        s1.pushMany("two,three four,five,six seven"); s1.display();
        s1.pop(); s1.pop(); s1.display();

        GenericStack<Integer> s2 = new GenericStack<>(5, Integer::valueOf);
        s2.push(1); s2.push(2); s2.pushMany("3,4,5,6,7");
        s2.display(); s2.popAll(); s2.display();
    }
}
```

## Question 2 - Generic queue

```java
import java.util.function.Function;

class GenericQueue<E> {
    private final Object[] data;
    private int front, size;
    private final Function<String,E> parser;
    GenericQueue(int capacity, Function<String,E> parser) {
        data=new Object[capacity]; this.parser=parser;
    }
    boolean isEmpty(){return size==0;} boolean isFull(){return size==data.length;}
    @SuppressWarnings("unchecked") E peek(){return isEmpty()?null:(E)data[front];}
    boolean enqueue(E e){
        if(isFull()){System.out.println("Queue is full");return false;}
        data[(front+size)%data.length]=e;size++;return true;
    }
    void enqueueMany(String s){
        for(String token:s.split(",")) if(!enqueue(parser.apply(token.trim()))) break;
    }
    @SuppressWarnings("unchecked") E dequeue(){
        if(isEmpty())return null; E e=(E)data[front];data[front]=null;
        front=(front+1)%data.length;size--;return e;
    }
    void dequeueAll(){while(!isEmpty())System.out.println("Dequeue: "+dequeue());}
    void display(){
        if(isEmpty()){System.out.println("Nothing to display");return;}
        for(int i=0;i<size;i++)System.out.println(data[(front+i)%data.length]);
    }
}

public class Q2 {
    public static void main(String[] args){
        GenericQueue<String> q=new GenericQueue<>(6,s->s);
        q.enqueue("Hello");q.enqueueMany("ali,who,wants,ice cream,or cookies");
        q.display();q.dequeue();q.dequeueAll();q.display();
        GenericQueue<Integer> q2=new GenericQueue<>(6,Integer::valueOf);
        q2.enqueue(1000);q2.enqueue(2000);q2.enqueueMany("3000,4000,5000,6000,7000");
        q2.display();q2.dequeue();q2.dequeue();q2.enqueue(8000);q2.dequeueAll();
    }
}
```

## Question 3 - Course linked list

```java
class CourseList {
    private static class Node{String name;int hours;Node next;Node(String n,int h,Node x){name=n;hours=h;next=x;}}
    private Node head;
    boolean isEmpty(){return head==null;}
    void add(String n,int h){head=new Node(n,h,head);}
    boolean addAfter(String existing,String n,int h){
        Node p=find(existing);if(p==null)return false;p.next=new Node(n,h,p.next);return true;
    }
    boolean remove(String n,int h){
        Node previous=null,current=head;
        while(current!=null&&!(current.name.equals(n)&&current.hours==h)){previous=current;current=current.next;}
        if(current==null)return false;if(previous==null)head=current.next;else previous.next=current.next;return true;
    }
    private Node find(String n){for(Node p=head;p!=null;p=p.next)if(p.name.equals(n))return p;return null;}
    int totalCreditHours(){int total=0;for(Node p=head;p!=null;p=p.next)total+=p.hours;return total;}
    void display(){for(Node p=head;p!=null;p=p.next)System.out.println(p.name+": "+p.hours+" hours");}
}

public class Q3 {
    public static void main(String[] args){
        CourseList l=new CourseList();
        l.add("Computing Mathematics",3);l.add("Network Architecture",3);
        l.add("Final Year Project",5);l.add("Data Structure",5);l.display();
        System.out.println("Total credit hours: "+l.totalCreditHours());
        l.addAfter("Final Year Project","Software Modelling",4);
        l.addAfter("Software Modelling","Intelligent Robot",3);
        l.addAfter("Computing Mathematics","Gamification",4);
        System.out.println("Total credit hours: "+l.totalCreditHours()); // 27
        l.remove("Network Architecture",3);l.remove("Software Modelling",4);
        l.display();System.out.println("Total credit hours: "+l.totalCreditHours()); // 20
    }
}
```

## Question 4 - Custom hash map

```java
class Entry<K,V>{final K key;V value;Entry<K,V> next;Entry(K k,V v,Entry<K,V> n){key=k;value=v;next=n;}V getValue(){return value;}}

class MyHashMap<K,V>{
    private final Entry<K,V>[] table;
    @SuppressWarnings("unchecked") MyHashMap(){table=(Entry<K,V>[])new Entry[16];}
    private int index(K key){return (key.hashCode()&0x7fffffff)%table.length;}
    Entry<K,V> get(K key){for(Entry<K,V> e=table[index(key)];e!=null;e=e.next)if(e.key.equals(key))return e;return null;}
    void put(K key,V value){
        int i=index(key);for(Entry<K,V> e=table[i];e!=null;e=e.next)if(e.key.equals(key)){e.value=value;return;}
        table[i]=new Entry<>(key,value,table[i]);
    }
}

public class Q4{
    public static void main(String[] args){
        MyHashMap<String,String> m=new MyHashMap<>();
        m.put("BruceW","011-8998990");m.put("DeanW","017-2274000");
        m.put("TonyS","019-4550800");m.put("LaraC","014-6402009");
        System.out.println(m.get("DeanW").getValue());
        System.out.println(m.get("TonyS").getValue());
        m.put("BruceW","011-5677900");m.put("JeanG","019-9001123");
        System.out.println(m.get("BruceW").getValue());
        System.out.println(m.get("JeanG").getValue());
    }
}
```
