# WIA1002 Semester 2 2022/2023 - Answers

## Question 1 - `ExamStack`

The paper names the top-inspection method `peep`, so that spelling is retained.

```java
import java.util.LinkedList;

class ExamStack<E>{
    private final LinkedList<E>items=new LinkedList<>();
    E peep(){return items.isEmpty()?null:items.getLast();}
    E pop(){return items.isEmpty()?null:items.removeLast();}
    void push(E e){items.addLast(e);}
    int getSize(){return items.size();}
}
```

## Question 2 - Direct infix arithmetic evaluation

The expression is evaluated as read using one operand stack and one operator stack. It is never
converted to prefix or postfix notation.

```java
import java.util.Scanner;

public class ArithmeticEvaluator{
    static int precedence(char op){return(op=='+'||op=='-')?1:2;}
    static void apply(ExamStack<Double>values,ExamStack<Character>operators){
        double right=values.pop(),left=values.pop();char op=operators.pop();
        if(op=='+')values.push(left+right);else if(op=='-')values.push(left-right);
        else if(op=='*')values.push(left*right);else values.push(left/right);
    }
    static double evaluate(String expression){
        ExamStack<Double>values=new ExamStack<>();ExamStack<Character>operators=new ExamStack<>();
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);if(Character.isWhitespace(c))continue;
            if(Character.isDigit(c))values.push((double)(c-'0'));
            else if(c=='(')operators.push(c);
            else if(c==')'){
                while(operators.peep()!=null&&operators.peep()!='(')apply(values,operators);
                operators.pop();
            }else{
                while(operators.peep()!=null&&operators.peep()!='('&&precedence(operators.peep())>=precedence(c))apply(values,operators);
                operators.push(c);
            }
        }
        while(operators.getSize()>0)apply(values,operators);return values.pop();
    }
    public static void main(String[]args){Scanner in=new Scanner(System.in);System.out.print("Enter expression to evaluate: ");String e=in.nextLine();System.out.println(e+" = "+evaluate(e));}
}
```

Results: `5-3+4 = 6.0`, `2+4*5-(9+7*6) = -29.0`, and
`9-2*(5/2-3/5+2)/6 = 7.7`.

## Question 3 - Closest ancestor medical record

This program reads the three CSV files, follows each upcoming patient's parent chain, selects
the first ancestor with a medical record, and uses a wildcard method to display any table.

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyMedicalProfiler{
    static List<List<String>>readCsv(String file)throws Exception{
        List<List<String>>table=new ArrayList<>();
        for(String line:Files.readAllLines(Paths.get(file))){
            String[]cells=line.split(",",-1);List<String>row=new ArrayList<>();
            for(String cell:cells)row.add(cell.trim());table.add(row);
        }
        return table;
    }
    static String key(String first,String last){return first+"\u0000"+last;}
    static void displayTable(List<? extends List<?>>table){
        for(List<?>row:table){for(int i=0;i<row.size();i++){if(i>0)System.out.print('\t');System.out.print(row.get(i));}System.out.println();}
    }
    public static void main(String[]args)throws Exception{
        List<List<String>>family=readCsv("family_book.csv");
        List<List<String>>medical=readCsv("past_medical_record.csv");
        List<List<String>>upcoming=readCsv("upcoming_patients.csv");
        Map<String,String>parentOf=new HashMap<>();
        for(int i=1;i<family.size();i++){
            List<String>r=family.get(i);String child=key(r.get(0),r.get(1));
            parentOf.put(child,r.get(2).isEmpty()?null:key(r.get(2),r.get(3)));
        }
        Map<String,List<String>>recordOf=new HashMap<>();
        for(int i=1;i<medical.size();i++){List<String>r=medical.get(i);recordOf.put(key(r.get(0),r.get(1)),r);}

        List<List<String>>answer=new ArrayList<>();List<String>header=new ArrayList<>();
        header.add("FirstName");header.add("LastName");
        for(String h:medical.get(0))header.add("Parent"+h);answer.add(header);
        for(int i=1;i<upcoming.size();i++){
            List<String>patient=upcoming.get(i),out=new ArrayList<>();out.add(patient.get(0));out.add(patient.get(1));
            String ancestor=parentOf.get(key(patient.get(0),patient.get(1)));List<String>record=null;
            while(ancestor!=null){record=recordOf.get(ancestor);if(record!=null)break;ancestor=parentOf.get(ancestor);}
            if(record==null)for(int c=0;c<medical.get(0).size();c++)out.add("None");else out.addAll(record);
            answer.add(out);
        }
        displayTable(family);displayTable(medical);displayTable(upcoming);displayTable(answer);
    }
}
```

## Question 4 - AWS weather-data processing

The implementation identifies the six required columns by header, applies a trailing moving
median of width 3 to the five numeric series, converts wind degrees with the paper's boundary
tie rule, and computes saturated vapor pressure.

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AWSAnalysis{
    static class Reading{
        String time,cardinal;double humidity,temperature,pressure,windSpeed,windDirection,vaporPressure;
    }
    static String[]split(String line){return line.contains("\t")?line.split("\t+"):line.split("\\s*,\\s*");}
    static String norm(String s){return s.replaceAll("[^A-Za-z0-9]","").toLowerCase();}
    static int column(String[]header,String wanted){for(int i=0;i<header.length;i++)if(norm(header[i]).contains(norm(wanted)))return i;throw new IllegalArgumentException("Missing column "+wanted);}
    static double median(double a,double b,double c){double[]x={a,b,c};Arrays.sort(x);return x[1];}
    static void movingMedian(List<Reading>r){
        int n=r.size();double[]h=new double[n],t=new double[n],p=new double[n],s=new double[n],d=new double[n];
        for(int i=0;i<n;i++){h[i]=r.get(i).humidity;t[i]=r.get(i).temperature;p[i]=r.get(i).pressure;s[i]=r.get(i).windSpeed;d[i]=r.get(i).windDirection;}
        for(int i=2;i<n;i++){Reading x=r.get(i);x.humidity=median(h[i-2],h[i-1],h[i]);x.temperature=median(t[i-2],t[i-1],t[i]);x.pressure=median(p[i-2],p[i-1],p[i]);x.windSpeed=median(s[i-2],s[i-1],s[i]);x.windDirection=median(d[i-2],d[i-1],d[i]);}
    }
    static String cardinal(double degree){
        String[]names={"N","NNE","NE","ENE","E","ESE","SE","SSE","S","SSW","SW","WSW","W","WNW","NW","NNW"};
        double q=((degree%360)+360)%360/22.5;int lower=(int)Math.floor(q);double fraction=q-lower;
        int index=fraction<0.5?lower:fraction>0.5?lower+1:(lower%2==0?lower:lower+1);
        return names[index%16];
    }
    static double vaporPressure(double celsius){
        double a=celsius<100?8.07131:8.14019,b=celsius<100?1730.63:1810.94,c=celsius<100?233.426:244.485;
        double kelvin=celsius+273.15;return Math.pow(10,a-b/(c+kelvin)); // follows the paper's explicit Kelvin instruction
    }
    static void print(List<Reading>rows,boolean finalTable){
        System.out.println("Date/time\tRELHumidity\tAIRTemp\tATMPressure\tWindSPEED\tWindDIR"+(finalTable?"\tSaturatedVaporPressure":""));
        for(Reading r:rows)System.out.printf("%s\t%.3f\t%.3f\t%.3f\t%.3f\t%s%s%n",r.time,r.humidity,r.temperature,r.pressure,r.windSpeed,finalTable?r.cardinal:String.valueOf(r.windDirection),finalTable?String.format("\t%.6f",r.vaporPressure):"");
    }
    public static void main(String[]args)throws Exception{
        List<String>lines=Files.readAllLines(Paths.get("IOES_Bachok_14093367.03122014.elab"));String[]header=split(lines.get(0));
        int time=column(header,"datetime"),rh=column(header,"RELHumidityAve"),temp=column(header,"AIRTempAve"),pressure=column(header,"ATMPressureAve"),speed=column(header,"WindSPEEDAve"),direction=column(header,"WindDIRRisDir");
        List<Reading>rows=new ArrayList<>();
        for(int i=1;i<lines.size();i++){String[]v=split(lines.get(i));Reading r=new Reading();r.time=v[time];r.humidity=Double.parseDouble(v[rh]);r.temperature=Double.parseDouble(v[temp]);r.pressure=Double.parseDouble(v[pressure]);r.windSpeed=Double.parseDouble(v[speed]);r.windDirection=Double.parseDouble(v[direction]);rows.add(r);}
        print(rows,false);movingMedian(rows);
        for(Reading r:rows){r.cardinal=cardinal(r.windDirection);r.vaporPressure=vaporPressure(r.temperature);}print(rows,true);
    }
}
```

## Question 5 - English/Russian special ordering

```java
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class SpecialComparator<T extends CharSequence> implements Comparator<T>{
    private final Map<Character,Integer>rank=new HashMap<>();
    SpecialComparator(){
        put(0,'A','А');put(1,'B','Б');put(2,'C','Ц');put(3,'\0','Ч');put(4,'D','Д');put(5,'E','Е');put(6,'\0','Ё');put(7,'\0','Э');put(8,'F','Ф');
        put(9,'G','Г');put(10,'H','Х');put(11,'I','И');put(12,'J','Й');put(13,'\0','Я');put(14,'\0','Ю');put(15,'K','К');put(16,'L','Л');put(17,'M','М');
        put(18,'N','Н');put(19,'O','О');put(20,'P','П');put(21,'Q','\0');put(22,'R','Р');put(23,'S','С');put(24,'\0','Ш');put(25,'\0','Щ');put(26,'T','Т');
        put(27,'U','У');put(28,'V','В');put(29,'W','\0');put(30,'X','\0');put(31,'Y','Ы');put(32,'\0','Ж');put(33,'Z','З');put(34,'\0','Ъ');put(35,'\0','Ь');
    }
    private void put(int r,char en,char ru){if(en!='\0')rank.put(en,r);if(ru!='\0')rank.put(ru,r);}
    public int compare(T a,T b){int n=Math.min(a.length(),b.length());for(int i=0;i<n;i++){int c=Integer.compare(rank.get(a.charAt(i)),rank.get(b.charAt(i)));if(c!=0)return c;}return Integer.compare(a.length(),b.length());}
}

public class SpecialNames{
    static<T>void sort(T[]a,Comparator<? super T>c){for(int end=a.length-1;end>0;end--)for(int i=0;i<end;i++)if(c.compare(a[i],a[i+1])>0){T t=a[i];a[i]=a[i+1];a[i+1]=t;}}
    static<T>void printArray(T[]a,String delimiter){for(T e:a)System.out.print(e+delimiter);}
    static<T>int search(T[]a,T target){for(int i=0;i<a.length;i++)if(a[i].equals(target))return i;return-1;}
    static<T>int findMax(T[]a,Comparator<? super T>c){if(a.length==0)return-1;int max=0;for(int i=1;i<a.length;i++)if(c.compare(a[i],a[max])>0)max=i;return max;}
    public static void main(String[]args){
        String[]names={"DAVID","ELIZABETH","JAMES","JENNIFER","JOHN","LINDA","MARIA","MICHAEL","PATRICIA","ROBERT","АНТОНОВ","ВОЛКОВ","ГУРИН","ИВАНОВ","КОЛМОГОРОВ","МАРИА","МАРКОВ","ПЕТРОВ","ПУТИН","СТЕПАНОВ"};
        sort(names,new SpecialComparator<String>());System.out.println("# Sorted name list:");printArray(names,"\n");
        System.out.println("Index of АНТОНОВ: "+search(names,"АНТОНОВ"));System.out.println("Index of MARKOV: "+search(names,"MARKOV"));
        System.out.println("Index of МАРИА: "+search(names,"МАРИА"));System.out.println("Index of ВОЛКОВ: "+search(names,"ВОЛКОВ"));
        int longest=findMax(names,(a,b)->Integer.compare(a.length(),b.length()));System.out.println("Longest: "+names[longest]+" at "+longest);
    }
}
```

Expected search indexes are `0`, `-1`, `11`, and `19`; the longest is `КОЛМОГОРОВ` at index `8`.

## Question 6 - Binary search tree

### (a) Traversals

- Inorder: `12 18 27 29 31 33 34 36 38 40 56 64 66 99 100`
- Preorder: `34 27 12 18 31 29 33 56 36 40 38 66 64 100 99`
- Postorder: `18 12 29 33 31 27 38 40 36 64 99 100 66 56 34`

### (b) Successor-based deletion and comparison

```java
class BST{
    static class Node{int value;Node left,right;Node(int v){value=v;}}
    Node root;
    boolean deleteUsingSuccessor(int value){Node parent=null,current=root;while(current!=null&&current.value!=value){parent=current;current=value<current.value?current.left:current.right;}if(current==null)return false;
        if(current.left==null)replace(parent,current,current.right);else if(current.right==null)replace(parent,current,current.left);else{
            Node successorParent=current,successor=current.right;while(successor.left!=null){successorParent=successor;successor=successor.left;}
            current.value=successor.value;if(successorParent==current)successorParent.right=successor.right;else successorParent.left=successor.right;
        }return true;
    }
    void replace(Node parent,Node oldNode,Node newNode){if(parent==null)root=newNode;else if(parent.left==oldNode)parent.left=newNode;else parent.right=newNode;}
}
```

- Delete `12`: both strategies promote its only child `18`; outcomes are identical.
- Delete `34`: predecessor strategy uses `33` as the new root; successor strategy uses `36`.
  Under the successor strategy, `56.left` becomes `40` (whose left child is `38`).
- Delete `66`: predecessor strategy replaces it with `64`; successor strategy replaces it with
  `99`, leaving `64` as its left child and `100` as its right child.

### (c) BST to circular doubly linked list

After conversion, `left` acts as `prev` and `right` acts as `next`.

```java
class BSTToCircularList{
    static class Node{int value;Node left,right;Node(int v){value=v;}}
    static Node concatenate(Node a,Node b){
        if(a==null)return b;if(b==null)return a;Node aLast=a.left,bLast=b.left;
        aLast.right=b;b.left=aLast;bLast.right=a;a.left=bLast;return a;
    }
    static Node convert(Node root){
        if(root==null)return null;Node left=convert(root.left),right=convert(root.right);
        root.left=root.right=root;return concatenate(concatenate(left,root),right);
    }
    static void print(Node head){if(head==null)return;Node p=head;do{System.out.print(p.value+" ");p=p.right;}while(p!=head);}
}
```

The circular list is in sorted in-order sequence and its head's `left` points to the tail while
the tail's `right` points back to the head.
