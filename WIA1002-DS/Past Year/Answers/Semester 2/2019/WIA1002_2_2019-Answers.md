# WIA1002 Semester 2 2018/2019 - Answers

## Question 1 - Merge two sorted linked lists

### (a)-(b) `Node` and `MyLinkedList`

```java
class Node<E>{E element;Node<E>next;Node(E e){element=e;}}

class MyLinkedList<E>{
    private Node<E>head,tail;private int size;
    MyLinkedList(){head=tail=null;size=0;}
    int getSize(){return size;}
    void addFirst(E e){Node<E>n=new Node<>(e);n.next=head;head=n;if(tail==null)tail=n;size++;}
    void addLast(E e){Node<E>n=new Node<>(e);if(tail==null)head=tail=n;else{tail.next=n;tail=n;}size++;}
    E removeFirst(){if(head==null)return null;E e=head.element;head=head.next;if(--size==0)tail=null;return e;}
    public String toString(){StringBuilder s=new StringBuilder("[size="+size+"]");for(Node<E>p=head;p!=null;p=p.next)s.append(" >> ").append(p.element);return s.toString();}

    static MyLinkedList<Integer> combine(MyLinkedList<Integer>a,MyLinkedList<Integer>b){
        MyLinkedList<Integer>result=new MyLinkedList<>();Node<Integer>p=a.head,q=b.head;
        while(p!=null&&q!=null){if(p.element<=q.element){result.addLast(p.element);p=p.next;}else{result.addLast(q.element);q=q.next;}}
        while(p!=null){result.addLast(p.element);p=p.next;}while(q!=null){result.addLast(q.element);q=q.next;}
        return result;
    }
}
```

### (c)-(d) Test and merge

```java
public class Q1{
    public static void main(String[]args){
        MyLinkedList<Integer>list1=new MyLinkedList<>(),list2=new MyLinkedList<>();
        for(int n:new int[]{2,10,38,41,51})list1.addLast(n);
        for(int n:new int[]{5,12,18,21,35,41,56})list2.addLast(n);
        MyLinkedList<Integer>newList=MyLinkedList.combine(list1,list2);
        System.out.println(list1);System.out.println(list2);System.out.println("The newList is:\n"+newList);
    }
}
```

`newList` is `[size=12] >> 2 >> 5 >> 10 >> 12 >> 18 >> 21 >> 35 >> 38 >> 41 >> 41 >> 51 >> 56`.

## Question 2 - Sales sorting

```java
class SalesList implements Comparable<SalesList>{
    String region,representative;int sales;
    SalesList(){}
    SalesList(String region,int sales,String representative){this.region=region;this.sales=sales;this.representative=representative;}
    public int compareTo(SalesList other){return region.compareTo(other.region);}
    public String toString(){return String.format("%-10s %4d %s",region,sales,representative);}
}

public class SortSalesList{
    static void selectionRegionDescending(SalesList[]a){
        for(int i=0;i<a.length-1;i++){int max=i;for(int j=i+1;j<a.length;j++)if(a[j].compareTo(a[max])>0)max=j;SalesList t=a[i];a[i]=a[max];a[max]=t;}
    }
    static void insertionSalesAscending(SalesList[]a){
        for(int i=1;i<a.length;i++){SalesList key=a[i];int j=i-1;while(j>=0&&a[j].sales>key.sales){a[j+1]=a[j--];}a[j+1]=key;}
    }
    static void bubbleRepresentativeAscending(SalesList[]a){
        for(int end=a.length-1;end>0;end--)for(int i=0;i<end;i++)if(a[i].representative.compareTo(a[i+1].representative)>0){SalesList t=a[i];a[i]=a[i+1];a[i+1]=t;}
    }
    static SalesList[]copy(SalesList[]a){return a.clone();}
    static void print(SalesList[]a){for(SalesList s:a)System.out.println(s);}
    public static void main(String[]args){
        SalesList[]data={new SalesList("Asia",456,"Ahmad"),new SalesList("Europe",518,"Hemish"),new SalesList("Europe",658,"Banny"),new SalesList("Greenland",268,"Ain"),new SalesList("Asia",396,"Ali"),new SalesList("Greenland",676,"Ben"),new SalesList("Asia",796,"Lee")};
        SalesList[]r=copy(data);selectionRegionDescending(r);System.out.println("Region:");print(r);
        SalesList[]s=copy(data);insertionSalesAscending(s);System.out.println("Sales:");print(s);
        SalesList[]p=copy(data);bubbleRepresentativeAscending(p);System.out.println("Representative:");print(p);
    }
}
```

## Question 3 - Triwizard maze using a custom stack

### (a) Generic stack

```java
class GenericStack<E>{
    private Object[]data=new Object[16];private int size;
    void push(E e){if(size==data.length){Object[]b=new Object[data.length*2];System.arraycopy(data,0,b,0,size);data=b;}data[size++]=e;}
    @SuppressWarnings("unchecked")E pop(){if(size==0)return null;E e=(E)data[--size];data[size]=null;return e;}
    @SuppressWarnings("unchecked")E peek(){return size==0?null:(E)data[size-1];}
    @SuppressWarnings("unchecked")E get(int i){return(E)data[i];}
    int size(){return size;}boolean isEmpty(){return size==0;}
}
```

### (b) Backtracking program

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TriwizardMaze{
    static class Frame{int row,col,nextDirection;Frame(int r,int c){row=r;col=c;}public String toString(){return"("+row+","+col+")";}}
    static final int[]DR={1,0,-1,0},DC={0,1,0,-1}; // down, right, up, left

    static GenericStack<Frame>find(char[][]maze){
        GenericStack<Frame>path=new GenericStack<>();boolean[][]seen=new boolean[maze.length][maze[0].length];
        if(maze[0][0]=='0')return path;path.push(new Frame(0,0));seen[0][0]=true;
        while(!path.isEmpty()){
            Frame f=path.peek();if(maze[f.row][f.col]=='C')return path;
            if(f.nextDirection==4){path.pop();continue;}
            int d=f.nextDirection++,r=f.row+DR[d],c=f.col+DC[d];
            if(r>=0&&r<maze.length&&c>=0&&c<maze[r].length&&!seen[r][c]&&(maze[r][c]=='1'||maze[r][c]=='C')){seen[r][c]=true;path.push(new Frame(r,c));}
        }
        return path;
    }
    public static void main(String[]args)throws Exception{
        List<String>lines=Files.readAllLines(Paths.get("maze.txt"));char[][]maze=new char[lines.size()][];
        for(int i=0;i<lines.size();i++)maze[i]=lines.get(i).replaceAll("\\s+","").toCharArray();
        System.out.println("The Triwizard Maze:");for(char[]row:maze)System.out.println(row);
        GenericStack<Frame>path=find(maze);
        if(path.isEmpty())System.out.println("Oh no!!! Harry couldn't find the Triwizard Cup!");
        else{Frame cup=path.peek();System.out.println("Hurray!!! Harry found the Triwizard Cup at "+cup);System.out.print("This is the path Harry has taken: ");for(int i=0;i<path.size();i++){if(i>0)System.out.print(" > ");System.out.print(path.get(i));}System.out.println();}
    }
}
```

For the supplied maze, the displayed path is `(0,0) > (1,0) > (1,1) > (2,1) > (3,1) > (4,1) > (4,2) > (4,3) > (3,3) > (2,3) > (2,4)`.

## Question 4(a) - Print without a semicolon

```java
public class Q4a{
    public static void main(String[]args){
        if(System.out.printf("Hello-World")==null){}
    }
}
```

## Question 4(b) - Tree traversals

For the tree rooted at 9, with children `(5,20)`, and leaves `(3,8,12,30)`:

- Preorder: `9 5 3 8 20 12 30`
- Inorder: `3 5 8 9 12 20 30`
- Postorder: `3 8 5 12 30 20 9`
