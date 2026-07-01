# Lab 12 - Binary Search Tree Answers

## Question 1(a)-(b) - `TreeNode<E>` and `BST<E>`

### `TreeNode.java`

```java
package BST;

public class TreeNode<E extends Comparable<E>> {
    E element;
    TreeNode<E> left, right;
    public TreeNode(E element) { this.element = element; }
    public E getElement() { return element; }
    @Override public String toString() { return String.valueOf(element); }
}
```

### `BST.java`

```java
package BST;

import java.util.ArrayList;

public class BST<E extends Comparable<E>> {
    private TreeNode<E> root;
    private int size;

    public boolean search(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            int comparison = e.compareTo(current.element);
            if (comparison == 0) return true;
            current = comparison < 0 ? current.left : current.right;
        }
        return false;
    }

    public boolean insert(E e) {
        if (root == null) { root = new TreeNode<>(e); size = 1; return true; }
        TreeNode<E> parent = null, current = root;
        int comparison = 0;
        while (current != null) {
            comparison = e.compareTo(current.element);
            if (comparison == 0) return false;
            parent = current;
            current = comparison < 0 ? current.left : current.right;
        }
        if (comparison < 0) parent.left = new TreeNode<>(e);
        else parent.right = new TreeNode<>(e);
        size++;
        return true;
    }

    public int getSize() { return size; }
    public int height() { return height(root); }
    private int height(TreeNode<E> node) {
        return node == null ? -1 : 1 + Math.max(height(node.left), height(node.right));
    }
    public E getRoot() { return root == null ? null : root.element; }

    public E minValue() {
        if (root == null) return null;
        TreeNode<E> current = root;
        while (current.left != null) current = current.left;
        return current.element;
    }
    public E maxValue() {
        if (root == null) return null;
        TreeNode<E> current = root;
        while (current.right != null) current = current.right;
        return current.element;
    }

    public ArrayList<TreeNode<E>> path(E e) {
        ArrayList<TreeNode<E>> path = new ArrayList<>();
        TreeNode<E> current = root;
        while (current != null) {
            path.add(current);
            int comparison = e.compareTo(current.element);
            if (comparison == 0) break;
            current = comparison < 0 ? current.left : current.right;
        }
        return path;
    }

    public boolean delete(E e) {
        TreeNode<E> parent = null, current = root;
        while (current != null && e.compareTo(current.element) != 0) {
            parent = current;
            current = e.compareTo(current.element) < 0 ? current.left : current.right;
        }
        if (current == null) return false;

        if (current.left == null) {
            replaceChild(parent, current, current.right);
        } else {
            // Replace with the largest element in the left subtree.
            TreeNode<E> predecessorParent = current;
            TreeNode<E> predecessor = current.left;
            while (predecessor.right != null) {
                predecessorParent = predecessor;
                predecessor = predecessor.right;
            }
            current.element = predecessor.element;
            if (predecessorParent == current) predecessorParent.left = predecessor.left;
            else predecessorParent.right = predecessor.left;
        }
        size--;
        return true;
    }

    private void replaceChild(TreeNode<E> parent, TreeNode<E> oldChild,
                              TreeNode<E> newChild) {
        if (parent == null) root = newChild;
        else if (parent.left == oldChild) parent.left = newChild;
        else parent.right = newChild;
    }

    public boolean clear() {
        boolean changed = root != null;
        root = null; size = 0;
        return changed;
    }

    protected void inorder(TreeNode<E> node) {
        if (node == null) return;
        inorder(node.left); System.out.print(node.element + " "); inorder(node.right);
    }
    protected void postorder(TreeNode<E> node) {
        if (node == null) return;
        postorder(node.left); postorder(node.right); System.out.print(node.element + " ");
    }
    protected void preorder(TreeNode<E> node) {
        if (node == null) return;
        System.out.print(node.element + " "); preorder(node.left); preorder(node.right);
    }
    public void inorder() { inorder(root); }
    public void postorder() { postorder(root); }
    public void preorder() { preorder(root); }
}
```

## Question 1(c) - `TestBST`

```java
package BST;

public class TestBST {
    public static void main(String[] args) {
        Integer[] input = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42,
                100, 86, 32, 28, 65, 14};
        BST<Integer> tree = new BST<>();
        for (int value : input) tree.insert(value);

        System.out.print("Inorder (sorted): "); tree.inorder(); System.out.println();
        System.out.print("Postorder: "); tree.postorder(); System.out.println();
        System.out.print("Preorder: "); tree.preorder(); System.out.println();
        System.out.println("Height of BST: " + tree.height());
        System.out.println("Root for BST is: " + tree.getRoot());
        System.out.println("Check whether 10 is in the tree? " + tree.search(10));
        System.out.println("Delete 53: " + tree.delete(53));
        System.out.print("Updated Inorder data (sorted): "); tree.inorder(); System.out.println();
        System.out.println("Min Value: " + tree.minValue());
        System.out.println("Max Value: " + tree.maxValue());
        System.out.print("A path from the root to 6 is: ");
        for (TreeNode<Integer> node : tree.path(6)) System.out.print(node + " ");
        System.out.println();
    }
}
```

The height method counts edges (an empty tree is `-1` and a leaf is `0`), so the supplied tree
has height `6`, matching the PDF.
The traversals, updated in-order sequence, minimum `1`, maximum `100`, and path
`45 1 2 20 6` match the required output.
