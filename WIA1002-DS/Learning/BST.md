# Binary Search Tree (BST) Revision Notes

## Chapter Goal

In this chapter, we learn how to:

1. Understand tree and binary tree basics
2. Represent binary trees using linked nodes
3. Understand Binary Search Tree rules
4. Search an element in a BST
5. Insert an element into a BST
6. Traverse a BST
7. Delete an element from a BST
8. Build a complete BST class in Java

---

# Part 1: Tree Basics

## 1. What is a Tree?

A tree is a hierarchical data structure.

Example:

```text
        A
      / | \
     B  C  D
    / \
   E   F
```

Meaning:

```text
A is the root.
B, C, D are children of A.
E and F are children of B.
```

A tree is not linear like a linked list.

Linked list:

```text
10 -> 20 -> 30 -> 40
```

Tree:

```text
        10
       /  \
      5    20
```

A tree can branch.

---

## 2. Important Tree Terms

Use this tree:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
```

### Root

The top node.

```text
Root = 60
```

### Parent

A node that has child nodes.

```text
60 is parent of 55 and 100.
55 is parent of 45 and 57.
```

### Child

A node below another node.

```text
55 is child of 60.
100 is child of 60.
```

### Siblings

Nodes with the same parent.

```text
55 and 100 are siblings.
45 and 57 are siblings.
```

### Leaf

A node with no children.

```text
45, 57, 67, 107 are leaves.
```

### Edge

The connection between two nodes.

```text
60 -> 55 is one edge.
```

### Depth

Distance from root to a node.

```text
Depth of 60 = 0
Depth of 55 = 1
Depth of 45 = 2
```

### Height

Longest path from root to furthest leaf.

```text
60 -> 55 -> 45
```

There are 2 edges, so height is 2.

---

# Part 2: Binary Tree

## 1. What is a Binary Tree?

A binary tree is a tree where each node has at most two children.

Each node can have:

```text
0 child
1 child
2 children
```

Example:

```text
        60
       /  \
     55    100
```

A binary tree has:

```text
left subtree
right subtree
```

---

## 2. Binary Tree Structure

A binary tree can be empty, or it can have:

```text
root
left subtree
right subtree
```

Diagram:

```text
        root
       /    \
left subtree right subtree
```

Example:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
```

For node 60:

```text
Left subtree:
     55
    /  \
  45   57

Right subtree:
     100
     / \
    67 107
```

Important idea:

```text
A subtree is also a tree.
```

This is why tree is strongly related to recursion.

---

# Part 3: Binary Search Tree

## 1. What is a BST?

A Binary Search Tree is a special binary tree with an ordering rule.

BST rule:

```text
left subtree value < current node value < right subtree value
```

Simple version:

```text
Smaller value goes left.
Bigger value goes right.
Duplicate is not inserted.
```

Example valid BST:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
```

Check:

```text
55, 45, 57 are smaller than 60.
100, 67, 107 are greater than 60.
45 is smaller than 55.
57 is greater than 55.
67 is smaller than 100.
107 is greater than 100.
```

---

## 2. BST Does Not Follow Insertion Order

BST does not arrange nodes by insertion time.

BST arranges nodes by value comparison.

Example:

```text
Insert order: 60, 100, 50
```

Tree:

```text
      60
     /  \
   50    100
```

Even though 50 is inserted after 100, it goes left of 60 because:

```text
50 < 60
```

Important:

```text
BST does not follow insertion order.
BST follows sorted-position rule.
```

But insertion order affects the final tree shape.

Example:

```text
Insert: 10, 20, 30, 40
```

Tree:

```text
10
  \
   20
     \
      30
        \
         40
```

This is still a valid BST, but it is unbalanced.

---

## 3. Drawback of BST

The biggest drawback of a BST is that it can become unbalanced.

Balanced BST:

```text
        50
       /  \
     30    70
    / \    / \
  20  40 60 80
```

Unbalanced BST:

```text
10
  \
   20
     \
      30
        \
         40
```

When BST becomes unbalanced, it behaves like a linked list.

Searching becomes slower.

Exam answer:

```text
A BST can become skewed or unbalanced if data is inserted in sorted order.
When this happens, search, insert, and delete may become O(n), similar to linked list.
```

---

# Part 4: Representing BST Using Linked Nodes

## 1. TreeNode Structure

Each node stores:

```text
element
left child reference
right child reference
```

Java code:

```java
class TreeNode<E> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E element) {
        this.element = element;
    }
}
```

---

## 2. Meaning of Each Line

```java
E element;
```

Stores the value.

Example:

```text
60
```

---

```java
TreeNode<E> left;
```

Stores the reference to the left child.

---

```java
TreeNode<E> right;
```

Stores the reference to the right child.

---

```java
public TreeNode(E element) {
    this.element = element;
}
```

Constructor.

It stores the given value into the node.

---

## 3. Root

The root is the first node of the tree.

If the tree is empty:

```java
root = null;
```

Create root:

```java
TreeNode<Integer> root = new TreeNode<>(60);
```

Create children:

```java
root.left = new TreeNode<>(55);
root.right = new TreeNode<>(100);
```

Tree:

```text
      60
     /  \
   55    100
```

---

# Part 5: Search in BST

## 1. What is Search?

Search means checking whether a value exists in the BST.

Example:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
```

Search 67:

```text
Found
```

Search 90:

```text
Not found
```

---

## 2. Search Rule

At every node:

```text
target < current → go left
target > current → go right
target == current → found
current == null → not found
```

---

## 3. Search Code

```java
public boolean search(int element) {
    TreeNode current = root;

    while (current != null) {
        if (element < current.element) {
            current = current.left;
        } else if (element > current.element) {
            current = current.right;
        } else {
            return true;
        }
    }

    return false;
}
```

---

## 4. Line-by-line Explanation

```java
TreeNode current = root;
```

Start searching from root.

---

```java
while (current != null)
```

Keep searching while there is still a node.

---

```java
if (element < current.element)
```

If target is smaller, go left.

---

```java
else if (element > current.element)
```

If target is bigger, go right.

---

```java
else return true;
```

If equal, element is found.

---

```java
return false;
```

If current becomes null, element is not in the tree.

---

## 5. Search Trace Example

Tree:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
```

Search 67:

```text
Start at 60
67 > 60 → go right to 100
67 < 100 → go left to 67
67 == 67 → found
```

Path:

```text
60 -> 100 -> 67
```

Return:

```java
true
```

---

Search 90:

```text
Start at 60
90 > 60 → go right to 100
90 < 100 → go left to 67
90 > 67 → go right to null
```

Return:

```java
false
```

---

# Part 6: Insert in BST

## 1. What is Insert?

Insert means adding a new value into the BST while keeping the BST rule.

Rule:

```text
smaller → left
bigger → right
duplicate → not inserted
```

---

## 2. Why Need parent and current?

During insertion, we use:

```text
current
parent
```

`current` is the node we are checking.

`parent` remembers the node before current becomes null.

Why need parent?

Because when current becomes null, parent tells us where to attach the new node.

---

## 3. Insert Code

```java
public boolean insert(int element) {
    if (root == null) {
        root = new TreeNode(element);
        size++;
        return true;
    }

    TreeNode parent = null;
    TreeNode current = root;

    while (current != null) {
        if (element < current.element) {
            parent = current;
            current = current.left;
        } else if (element > current.element) {
            parent = current;
            current = current.right;
        } else {
            return false;
        }
    }

    if (element < parent.element) {
        parent.left = new TreeNode(element);
    } else {
        parent.right = new TreeNode(element);
    }

    size++;
    return true;
}
```

---

## 4. Line-by-line Explanation

```java
if (root == null)
```

If tree is empty.

---

```java
root = new TreeNode(element);
```

New node becomes root.

---

```java
TreeNode parent = null;
TreeNode current = root;
```

Start from root.

---

```java
parent = current;
current = current.left;
```

Save current as parent, then move left.

---

```java
parent = current;
current = current.right;
```

Save current as parent, then move right.

---

```java
return false;
```

Duplicate found, not inserted.

---

```java
parent.left = new TreeNode(element);
```

Attach new node as left child.

---

```java
parent.right = new TreeNode(element);
```

Attach new node as right child.

---

## 5. Insert Trace Example: Insert 101

Original tree:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
```

Insert 101:

```text
101 > 60 → go right to 100
101 > 100 → go right to 107
101 < 107 → go left to null
```

Parent is 107.

Since:

```text
101 < 107
```

101 becomes left child of 107.

Final:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
              /
            101
```

---

## 6. Insert Trace Example: Insert 50

Tree:

```text
        60
       /  \
     55    100
    /
  45
```

Insert 50:

```text
50 < 60 → go left to 55
50 < 55 → go left to 45
50 > 45 → go right to null
```

Final:

```text
        60
       /  \
     55    100
    /
  45
    \
     50
```

---

# Part 7: Traversal

## 1. What is Traversal?

Traversal means visiting each node in the tree exactly once.

Types:

```text
Inorder
Preorder
Postorder
Breadth-first / Level-order
```

---

## 2. Inorder Traversal

Rule:

```text
Left -> Root -> Right
```

Java:

```java
public void inorder() {
    inorder(root);
    System.out.println();
}

private void inorder(TreeNode node) {
    if (node == null) {
        return;
    }

    inorder(node.left);
    System.out.print(node.element + " ");
    inorder(node.right);
}
```

Important:

```text
Inorder traversal of BST prints values in sorted order.
```

Example:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
        \     /
        59   101
```

Inorder:

```text
45 55 57 59 60 67 100 101 107
```

---

## 3. Preorder Traversal

Rule:

```text
Root -> Left -> Right
```

Java:

```java
public void preorder() {
    preorder(root);
    System.out.println();
}

private void preorder(TreeNode node) {
    if (node == null) {
        return;
    }

    System.out.print(node.element + " ");
    preorder(node.left);
    preorder(node.right);
}
```

Example output:

```text
60 55 45 57 59 100 67 107 101
```

---

## 4. Postorder Traversal

Rule:

```text
Left -> Right -> Root
```

Java:

```java
public void postorder() {
    postorder(root);
    System.out.println();
}

private void postorder(TreeNode node) {
    if (node == null) {
        return;
    }

    postorder(node.left);
    postorder(node.right);
    System.out.print(node.element + " ");
}
```

Example output:

```text
45 59 57 55 67 101 107 100 60
```

---

## 5. Easy Way to Remember Traversal

```text
Inorder   = 1 + 2
Postorder = 1 2 +
Preorder  = + 1 2
```

Meaning:

```text
Inorder   = left, root, right
Postorder = left, right, root
Preorder  = root, left, right
```

---

## 6. Breadth-first / Level-order Traversal

Rule:

```text
Visit level by level.
```

Uses queue.

Example:

```text
        60
       /  \
     55    100
    /  \   /  \
  45   57 67  107
        \     /
        59   101
```

Breadth-first:

```text
60 55 100 45 57 67 107 59 101
```

Java:

```java
import java.util.Queue;
import java.util.LinkedList;

public void breadthFirst() {
    if (root == null) {
        return;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        TreeNode current = queue.poll();

        System.out.print(current.element + " ");

        if (current.left != null) {
            queue.offer(current.left);
        }

        if (current.right != null) {
            queue.offer(current.right);
        }
    }

    System.out.println();
}
```

Queue trace:

```text
Queue: [60]
Print 60, add 55 and 100

Queue: [55, 100]
Print 55, add 45 and 57

Queue: [100, 45, 57]
Print 100, add 67 and 107
```

---

# Part 8: Tree Interface and BST Class Design

## 1. Tree Interface

An interface is like a contract.

It says what methods a tree should have.

```java
interface Tree<E> {
    boolean search(E element);

    boolean insert(E element);

    boolean delete(E element);

    void inorder();

    void preorder();

    void postorder();

    int getSize();

    boolean isEmpty();

    void clear();
}
```

---

## 2. AbstractTree

```java
abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }
}
```

Explanation:

```text
If size is 0, tree is empty.
```

---

## 3. Generic BST

```java
class BST<E extends Comparable<E>> extends AbstractTree<E> {
```

Meaning:

```text
BST stores type E.
E must be comparable.
```

Why?

Because BST needs to compare values.

For generic type, use:

```java
element.compareTo(current.element)
```

Instead of:

```java
element < current.element
```

---

## 4. compareTo()

```java
element.compareTo(current.element)
```

Returns:

```text
negative value → element is smaller
positive value → element is bigger
0              → equal
```

Example:

```java
55.compareTo(60) < 0
100.compareTo(60) > 0
60.compareTo(60) == 0
```

---

# Part 9: Delete in BST

## 1. What is Delete?

Delete means removing a value from the BST while keeping the BST rule correct.

Deletion is harder than search and insert because the node may have children.

---

## 2. First Step: Locate current and parent

Before deleting, find:

```text
current = node to delete
parent = parent of current
```

Example:

```text
        50
       /  \
     20    80
    /  \
  10    40
```

Delete 20:

```text
parent = 50
current = 20
```

If deleting root:

```text
parent = null
current = root
```

---

## 3. Deletion Case 1: current has no left child

Condition:

```text
current.left == null
```

Action:

```text
Connect parent to current.right.
```

Example:

```text
Before:

        50
       /  \
     20    80
    /  \
  10    40
    \
    16
```

Delete 10.

10 has no left child.

Connect parent 20 to right child 16.

After:

```text
        50
       /  \
     20    80
    /  \
  16    40
```

---

## 4. Case 1 Code

```java
if (current.left == null) {
    if (parent == null) {
        root = current.right;
    } else {
        if (element.compareTo(parent.element) < 0) {
            parent.left = current.right;
        } else {
            parent.right = current.right;
        }
    }
}
```

---

## 5. Deletion Case 2: current has a left child

Condition:

```text
current.left != null
```

Action:

```text
Find rightMost in the left subtree.
Copy rightMost value into current.
Delete the old rightMost node.
```

Why rightMost?

```text
rightMost is the largest value smaller than current.
So it can replace current safely.
```

---

## 6. Case 2 Example: Delete 20

Before:

```text
        50
       /  \
     20    80
    /  \
  10    40
    \
    16
```

Delete 20.

Left subtree of 20:

```text
  10
    \
    16
```

Rightmost is 16.

Replace 20 with 16.

After:

```text
        50
       /  \
     16    80
    /  \
  10    40
```

---

## 7. Case 2 Code

```java
else {
    TreeNode<E> parentOfRightMost = current;
    TreeNode<E> rightMost = current.left;

    while (rightMost.right != null) {
        parentOfRightMost = rightMost;
        rightMost = rightMost.right;
    }

    current.element = rightMost.element;

    if (parentOfRightMost.right == rightMost) {
        parentOfRightMost.right = rightMost.left;
    } else {
        parentOfRightMost.left = rightMost.left;
    }
}
```

Important:

```text
rightMost cannot have a right child.
rightMost may have a left child.
```

---

## 8. Full Delete Code

```java
public boolean delete(E element) {
    TreeNode<E> parent = null;
    TreeNode<E> current = root;

    while (current != null) {
        if (element.compareTo(current.element) < 0) {
            parent = current;
            current = current.left;
        } else if (element.compareTo(current.element) > 0) {
            parent = current;
            current = current.right;
        } else {
            break;
        }
    }

    if (current == null) {
        return false;
    }

    if (current.left == null) {
        if (parent == null) {
            root = current.right;
        } else {
            if (element.compareTo(parent.element) < 0) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
    } else {
        TreeNode<E> parentOfRightMost = current;
        TreeNode<E> rightMost = current.left;

        while (rightMost.right != null) {
            parentOfRightMost = rightMost;
            rightMost = rightMost.right;
        }

        current.element = rightMost.element;

        if (parentOfRightMost.right == rightMost) {
            parentOfRightMost.right = rightMost.left;
        } else {
            parentOfRightMost.left = rightMost.left;
        }
    }

    size--;
    return true;
}
```

---

# Part 10: Complete BST Java Code

Copy into `Main.java`.

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

interface Tree<E> {
    boolean search(E element);

    boolean insert(E element);

    boolean delete(E element);

    void inorder();

    void preorder();

    void postorder();

    int getSize();

    boolean isEmpty();

    void clear();
}

abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }
}

class BST<E extends Comparable<E>> extends AbstractTree<E> {
    private TreeNode<E> root;
    private int size = 0;

    private static class TreeNode<E> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        TreeNode(E element) {
            this.element = element;
        }
    }

    public BST() {
    }

    public BST(E[] objects) {
        for (E object : objects) {
            insert(object);
        }
    }

    private TreeNode<E> createNewNode(E element) {
        return new TreeNode<>(element);
    }

    @Override
    public boolean search(E element) {
        TreeNode<E> current = root;

        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean insert(E element) {
        if (root == null) {
            root = createNewNode(element);
            size++;
            return true;
        }

        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                return false;
            }
        }

        if (element.compareTo(parent.element) < 0) {
            parent.left = createNewNode(element);
        } else {
            parent.right = createNewNode(element);
        }

        size++;
        return true;
    }

    @Override
    public boolean delete(E element) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                break;
            }
        }

        if (current == null) {
            return false;
        }

        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (element.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            current.element = rightMost.element;

            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                parentOfRightMost.left = rightMost.left;
            }
        }

        size--;
        return true;
    }

    @Override
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.element + " ");
        inorder(node.right);
    }

    @Override
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.element + " ");
        preorder(node.left);
        preorder(node.right);
    }

    @Override
    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.element + " ");
    }

    public void breadthFirst() {
        if (root == null) {
            return;
        }

        Queue<TreeNode<E>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<E> current = queue.poll();

            System.out.print(current.element + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        System.out.println();
    }

    public ArrayList<E> path(E element) {
        ArrayList<E> list = new ArrayList<>();

        TreeNode<E> current = root;

        while (current != null) {
            list.add(current.element);

            if (element.compareTo(current.element) < 0) {
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                break;
            }
        }

        return list;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);
        tree.insert(59);
        tree.insert(101);

        System.out.print("Inorder: ");
        tree.inorder();

        System.out.print("Preorder: ");
        tree.preorder();

        System.out.print("Postorder: ");
        tree.postorder();

        System.out.print("Breadth-first: ");
        tree.breadthFirst();

        System.out.println("Search 67: " + tree.search(67));
        System.out.println("Search 90: " + tree.search(90));

        System.out.println("Path to 67: " + tree.path(67));
        System.out.println("Path to 90: " + tree.path(90));

        System.out.println("Size: " + tree.getSize());

        System.out.println("\nDelete 45:");
        tree.delete(45);
        tree.inorder();

        System.out.println("Delete 57:");
        tree.delete(57);
        tree.inorder();

        System.out.println("Delete 100:");
        tree.delete(100);
        tree.inorder();

        System.out.println("Size after deletion: " + tree.getSize());

        tree.clear();
        System.out.println("After clear, is empty? " + tree.isEmpty());
    }
}
```

---

# Part 11: Expected Output

```text
Inorder: 45 55 57 59 60 67 100 101 107
Preorder: 60 55 45 57 59 100 67 107 101
Postorder: 45 59 57 55 67 101 107 100 60
Breadth-first: 60 55 100 45 57 67 107 59 101
Search 67: true
Search 90: false
Path to 67: [60, 100, 67]
Path to 90: [60, 100, 67]
Size: 9

Delete 45:
55 57 59 60 67 100 101 107
Delete 57:
55 59 60 67 100 101 107
Delete 100:
55 59 60 67 101 107
Size after deletion: 6
After clear, is empty? true
```

---

# Part 12: Common Mistakes

## Mistake 1: Thinking BST follows insertion order

Wrong.

BST follows value comparison.

```text
smaller → left
bigger → right
```

---

## Mistake 2: Reversing left and right

Wrong:

```java
if (element < current.element) {
    current = current.right;
}
```

Correct:

```java
if (element < current.element) {
    current = current.left;
}
```

---

## Mistake 3: Forgetting parent in insert

If current becomes null, you need parent to attach the new node.

---

## Mistake 4: Forgetting base case in traversal

Wrong:

```java
private void inorder(TreeNode node) {
    inorder(node.left);
    System.out.print(node.element);
    inorder(node.right);
}
```

Correct:

```java
if (node == null) {
    return;
}
```

---

## Mistake 5: Using `<` with generic type E

Wrong:

```java
if (element < current.element)
```

Correct:

```java
if (element.compareTo(current.element) < 0)
```

---

## Mistake 6: Forgetting duplicate handling

BST in this chapter does not insert duplicates.

```java
return false;
```

---

## Mistake 7: Forgetting root deletion

If deleting root:

```text
parent == null
```

So handle root separately.

---

## Mistake 8: Forgetting to remove old rightMost

In delete Case 2, after copying rightMost value, delete the old rightMost node.

---

# Part 13: Viva / Exam Questions

## Q1. What is a BST?

A BST is a binary tree where every node follows this rule:

```text
left subtree value < node value < right subtree value
```

---

## Q2. Is every binary tree a BST?

No.

A binary tree only has at most two children.

A BST must also follow the ordering rule.

---

## Q3. What happens if a value is smaller than current node?

Go left.

---

## Q4. What happens if a value is bigger than current node?

Go right.

---

## Q5. What happens if a duplicate value is inserted?

It is not inserted, and `insert()` returns false.

---

## Q6. Which traversal gives sorted order?

Inorder traversal.

---

## Q7. What traversal uses queue?

Breadth-first / level-order traversal.

---

## Q8. What is the drawback of BST?

BST can become unbalanced or skewed.

Then search, insert, and delete may become slow, like linked list.

---

## Q9. What is deletion Case 1?

The node to delete has no left child.

Connect parent to current.right.

---

## Q10. What is deletion Case 2?

The node to delete has a left child.

Find the rightmost node in the left subtree, copy its value to current, then delete the old rightmost node.

---

## Q11. Why use rightMost in deletion Case 2?

Because it is the largest value smaller than the deleted node.

So it can replace the deleted node without breaking the BST rule.

---

## Q12. Can rightMost have a right child?

No.

If it has a right child, it is not the rightmost yet.

---

## Q13. Can rightMost have a left child?

Yes.

If it has a left child, connect parentOfRightMost to that left child.

---

# Part 14: Practice Questions

Use this BST:

```text
        50
       /  \
     30    70
    /  \   / \
  20   40 60 80
```

## Practice A: Traversal

1. Inorder
2. Preorder
3. Postorder
4. Breadth-first

Answers:

```text
Inorder: 20 30 40 50 60 70 80
Preorder: 50 30 20 40 70 60 80
Postorder: 20 40 30 60 80 70 50
Breadth-first: 50 30 70 20 40 60 80
```

---

## Practice B: Search

Search 60:

```text
50 -> 70 -> 60
Found
```

Search 35:

```text
50 -> 30 -> 40 -> null
Not found
```

---

## Practice C: Insert

Insert 65:

```text
65 > 50 → right to 70
65 < 70 → left to 60
65 > 60 → right
```

Final:

```text
        50
       /  \
     30    70
    /  \   / \
  20   40 60 80
            \
            65
```

---

Insert 10:

```text
10 < 50 → left to 30
10 < 30 → left to 20
10 < 20 → left
```

Final:

```text
        50
       /  \
     30    70
    /  \   / \
  20   40 60 80
 /
10
```

---

## Practice D: Delete

Delete 20:

```text
20 has no left child.
Case 1.
30.left = null.
```

Delete 70:

```text
70 has left child 60.
Case 2.
rightMost in left subtree = 60.
70 becomes 60.
Old 60 is deleted.
```

Final:

```text
        50
       /  \
     30    60
    /  \     \
  20   40    80
```

---

# Part 15: Final Checklist

## Concepts

```text
[ ] I know what a tree is
[ ] I know root, parent, child, sibling, leaf, depth, height
[ ] I know what a binary tree is
[ ] I know what a BST is
[ ] I know BST does not follow insertion order
[ ] I know smaller goes left and bigger goes right
[ ] I know duplicates are not inserted
```

## Code

```text
[ ] I know TreeNode has element, left, right
[ ] I know root points to the first node
[ ] I know search()
[ ] I know insert()
[ ] I know inorder()
[ ] I know preorder()
[ ] I know postorder()
[ ] I know breadthFirst()
[ ] I know delete()
[ ] I know getSize()
[ ] I know isEmpty()
[ ] I know clear()
```

## Deletion

```text
[ ] I can locate parent and current
[ ] I can identify Case 1
[ ] I can identify Case 2
[ ] I can find rightMost
[ ] I can find parentOfRightMost
[ ] I know rightMost may have left child
[ ] I know rightMost cannot have right child
```

---

# Part 16: One-page Summary

```text
BST = Binary Search Tree

Rule:
left < root < right

Search:
start from root
smaller go left
bigger go right
equal found
null not found

Insert:
if root null, new node is root
else find correct parent
attach left if smaller
attach right if bigger
duplicate not inserted

Traversal:
Inorder = Left Root Right = sorted order
Preorder = Root Left Right
Postorder = Left Right Root
Breadth-first = level order using queue

Delete:
First locate parent and current

Case 1:
current has no left child
connect parent to current.right

Case 2:
current has left child
find rightMost in left subtree
copy rightMost value into current
delete old rightMost

Drawback:
BST can become unbalanced and behave like linked list.
```