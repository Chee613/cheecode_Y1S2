# WIA1002 Semester 1 2019/2020 - Answers

## Question 1 - Generic stack with `popMiddle`

```java
import java.util.function.Function;

class GenericStack<E>{
    private final Object[] data;private int size;private final Function<String,E> parser;
    GenericStack(int capacity,Function<String,E> parser){data=new Object[capacity];this.parser=parser;}
    boolean isEmpty(){return size==0;}boolean isFull(){return size==data.length;}
    @SuppressWarnings("unchecked")E peek(){return isEmpty()?null:(E)data[size-1];}
    boolean push(E e){if(isFull())return false;data[size++]=e;return true;}
    void pushMany(String s){for(String x:s.split(","))if(!push(parser.apply(x.trim())))break;}
    @SuppressWarnings("unchecked")E pop(){if(isEmpty())return null;E e=(E)data[--size];data[size]=null;return e;}
    @SuppressWarnings("unchecked")E popMiddle(){
        if(size%2==0)return null;int middle=size/2;E e=(E)data[middle];
        for(int i=middle;i<size-1;i++)data[i]=data[i+1];data[--size]=null;return e;
    }
    void popAll(){while(!isEmpty())System.out.println("Removing "+pop());}
    void display(){for(int i=size-1;i>=0;i--)System.out.println(data[i]);}
}

public class Q1{
    public static void main(String[] args){
        GenericStack<String>s=new GenericStack<>(7,x->x);s.push("apple");
        s.pushMany("broccoli,chicken sandwich,donut,french fries,juice,maruku");
        s.pop();s.pop();s.display();System.out.println("Middle: "+s.popMiddle());s.display();
        System.out.println("Middle: "+s.popMiddle()); // null because size is even
        GenericStack<Integer>n=new GenericStack<>(10,Integer::valueOf);
        n.push(1);n.push(2);n.pushMany("3,4,5,6,7");n.display();n.popAll();
    }
}
```

The paper's integer example contains tokens such as `"3 4"`, which cannot be stored in a
type-safe `GenericStack<Integer>`; commas must separate valid integer tokens as corrected above.

## Question 2 - Generic queue with `changeOrder`

```java
import java.util.function.Function;

class GenericQueue<E>{
    private final Object[]data;private int front,size;private final Function<String,E>parser;
    GenericQueue(int capacity,Function<String,E>parser){data=new Object[capacity];this.parser=parser;}
    boolean isEmpty(){return size==0;}boolean isFull(){return size==data.length;}
    @SuppressWarnings("unchecked")E peek(){return isEmpty()?null:(E)data[front];}
    boolean enqueue(E e){if(isFull())return false;data[(front+size)%data.length]=e;size++;return true;}
    void enqueueMany(String s){for(String x:s.split(","))if(!enqueue(parser.apply(x.trim())))break;}
    @SuppressWarnings("unchecked")E dequeue(){if(isEmpty())return null;E e=(E)data[front];data[front]=null;front=(front+1)%data.length;size--;return e;}
    void dequeueAll(){while(!isEmpty())System.out.println("Dequeue: "+dequeue());}
    void changeOrder(int k){if(k<1||k>size)throw new IllegalArgumentException();for(int i=1;i<k;i++)enqueue(dequeue());}
    void display(){for(int i=0;i<size;i++)System.out.print(data[(front+i)%data.length]+" | ");System.out.println();}
}

public class Q2{
    public static void main(String[]args){
        GenericQueue<String>q=new GenericQueue<>(10,x->x);
        q.enqueue("Dom T");q.enqueue("Rafa N");q.enqueueMany("Roger F,Daniil M,Novak D,Alex Z,Stef T,Karen K");
        q.display();q.dequeue();q.enqueue("Matt B");q.enqueue("Kei N");q.display();q.dequeueAll();
        GenericQueue<Integer>n=new GenericQueue<>(10,Integer::valueOf);
        n.enqueue(10);n.enqueue(20);n.enqueueMany("30,40,50,60,70,80,90");
        n.display();n.changeOrder(5);n.display(); // 50 ... 90 10 ... 40
    }
}
```

## Question 3 - Book-sales linked list

```java
class BookList{
    private static class Node{String title;long sold;Node next;Node(String t,long s,Node n){title=t;sold=s;next=n;}}
    private Node head;
    void createNode(String title,long millions){head=new Node(title,millions*1_000_000L,head);}
    boolean addAfter(String existing,String title,long millions){Node p=find(existing);if(p==null)return false;p.next=new Node(title,millions*1_000_000L,p.next);return true;}
    boolean removeNode(String title){Node prev=null,cur=head;while(cur!=null&&!cur.title.equals(title)){prev=cur;cur=cur.next;}if(cur==null)return false;if(prev==null)head=cur.next;else prev.next=cur.next;return true;}
    private Node find(String t){for(Node p=head;p!=null;p=p.next)if(p.title.equals(t))return p;return null;}
    long totalSold(){long total=0;for(Node p=head;p!=null;p=p.next)total+=p.sold;return total;}
    void display(){for(Node p=head;p!=null;p=p.next)System.out.printf("%s: %,d Sold%n",p.title,p.sold);}
}

public class Q3{
    public static void main(String[]args){
        BookList l=new BookList();l.createNode("Lord of The Rings",500);l.createNode("Tale of the Body Thief",1);
        l.createNode("Memnoch the Devil",100);l.createNode("Heart of a Samurai",10);l.display();
        l.addAfter("Memnoch the Devil","White Crane",10);l.addAfter("White Crane","Memoirs of a Geisha",90);
        l.removeNode("Harry Potter");l.removeNode("Heart of a Samurai");l.display();
        System.out.printf("Total sold: %,d%n",l.totalSold());
    }
}
```

## Question 4 - Custom hash map

```java
class Entry<K,V>{final K key;V value;Entry<K,V>next;Entry(K k,V v,Entry<K,V>n){key=k;value=v;next=n;}V getValue(){return value;}}
class MyHashMap<K,V>{
    private final Entry<K,V>[]buckets;
    @SuppressWarnings("unchecked")MyHashMap(){buckets=(Entry<K,V>[])new Entry[17];}
    int index(K k){return(k.hashCode()&0x7fffffff)%buckets.length;}
    Entry<K,V>get(K k){for(Entry<K,V>e=buckets[index(k)];e!=null;e=e.next)if(e.key.equals(k))return e;return null;}
    void put(K k,V v){int i=index(k);for(Entry<K,V>e=buckets[i];e!=null;e=e.next)if(e.key.equals(k)){e.value=v;return;}buckets[i]=new Entry<>(k,v,buckets[i]);}
}
public class Q4{
    public static void main(String[]args){
        MyHashMap<String,String>m=new MyHashMap<>();m.put("BruceW","011-8998990");m.put("DeanW","017-2274000");m.put("TonyS","019-4550800");m.put("LaraC","014-6402009");
        System.out.println("DeanW: "+m.get("DeanW").getValue());System.out.println("BruceW: "+m.get("BruceW").getValue());
        m.put("BruceW","011-5677900");m.put("JeanG","019-9001123");
        System.out.println("BruceW: "+m.get("BruceW").getValue());System.out.println("JeanG: "+m.get("JeanG").getValue());
    }
}
```
