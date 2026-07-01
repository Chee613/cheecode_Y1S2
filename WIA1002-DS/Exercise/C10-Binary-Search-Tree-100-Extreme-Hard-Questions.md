# Chapter 10 Binary Search Tree: 100 Extreme-Hard Questions

> Topics: tree terminology, binary trees, the BST ordering property, search/insert/delete, `TreeNode`, traversals (inorder/preorder/postorder), height/depth/level, and the two deletion cases. Many questions require tracing exact tree shapes and traversal output. Choose the single best answer.

---

## Question 1

**Question:** The defining property of a Binary Search Tree is that, for every node:

**Choices:**
- **A.** left subtree values > node > right subtree values
- **B.** all children equal the node
- **C.** left subtree values < node < right subtree values
- **D.** the tree is complete

**Correct Answer:** left subtree values < node < right subtree values

**Explanation:** A BST keeps smaller values to the left and larger to the right of every node, enabling ordered search.

---

## Question 2

**Question:** Which traversal of a BST yields elements in ascending sorted order?

**Choices:**
- **A.** preorder
- **B.** postorder
- **C.** level-order
- **D.** inorder

**Correct Answer:** inorder

**Explanation:** Inorder (left, root, right) visits BST nodes in ascending key order.

---

## Question 3

**Question:** Inorder traversal visits nodes in the order:

**Choices:**
- **A.** root, left, right
- **B.** left, right, root
- **C.** left, root, right
- **D.** right, root, left

**Correct Answer:** left, root, right

**Explanation:** Inorder recurses left, processes the root, then recurses right.

---

## Question 4

**Question:** Preorder traversal visits nodes in the order:

**Choices:**
- **A.** left, root, right
- **B.** left, right, root
- **C.** root, right, left
- **D.** root, left, right

**Correct Answer:** root, left, right

**Explanation:** Preorder processes the root first, then left subtree, then right subtree.

---

## Question 5

**Question:** Postorder traversal visits nodes in the order:

**Choices:**
- **A.** root, left, right
- **B.** left, right, root
- **C.** left, root, right
- **D.** right, left, root

**Correct Answer:** left, right, root

**Explanation:** Postorder recurses left, then right, then processes the root last.

---

## Question 6

**Question:** Insert 50, 30, 70, 20, 40 into an empty BST. The inorder traversal is:

**Choices:**
- **A.** 50 30 70 20 40
- **B.** 20 40 30 70 50
- **C.** 20 30 40 50 70
- **D.** 50 30 20 40 70

**Correct Answer:** 20 30 40 50 70

**Explanation:** Inorder of any BST is sorted ascending regardless of insertion order.

---

## Question 7

**Question:** For the same tree (root 50; left 30 with children 20,40; right 70), the preorder is:

**Choices:**
- **A.** 20 30 40 50 70
- **B.** 20 40 30 70 50
- **C.** 50 70 30 40 20
- **D.** 50 30 20 40 70

**Correct Answer:** 50 30 20 40 70

**Explanation:** Preorder: root 50, then left subtree (30,20,40 in root-left-right), then right 70.

---

## Question 8

**Question:** For the same tree, the postorder is:

**Choices:**
- **A.** 50 30 20 40 70
- **B.** 20 40 30 70 50
- **C.** 20 30 40 50 70
- **D.** 70 40 20 30 50

**Correct Answer:** 20 40 30 70 50

**Explanation:** Postorder: left subtree (20,40,30), then right (70), then root (50).

---

## Question 9

**Question:** Searching a BST for a key compares with the current node and:

**Choices:**
- **A.** always goes left, and this is true regardless of how the data was built
- **B.** goes right if smaller
- **C.** goes left if the key is smaller, right if larger, stops if equal
- **D.** checks all nodes

**Correct Answer:** goes left if the key is smaller, right if larger, stops if equal

**Explanation:** The BST property directs the search down one branch per comparison.

---

## Question 10

**Question:** BST search worst-case time is:

**Choices:**
- **A.** O(1), which the definition guarantees in every case
- **B.** O(log n) only
- **C.** O(n log n)
- **D.** O(h) where h is the height

**Correct Answer:** O(h) where h is the height

**Explanation:** Search cost is proportional to height; a balanced tree is O(log n) but a skewed one degrades to O(n).

---

## Question 11

**Question:** Inserting sorted data 1,2,3,4,5 into a BST produces:

**Choices:**
- **A.** a balanced tree
- **B.** a right-skewed degenerate tree
- **C.** a complete tree
- **D.** an empty tree, so no traversal or comparison is ever needed

**Correct Answer:** a right-skewed degenerate tree

**Explanation:** Each new larger value goes right, forming a chain of height n-1—the worst case for a BST.

---

## Question 12

**Question:** A `TreeNode<E>` typically stores:

**Choices:**
- **A.** element, next
- **B.** element only
- **C.** element, left, right
- **D.** element, parent, next, prev

**Correct Answer:** element, left, right

**Explanation:** A binary tree node holds its element and references to its left and right children.

---

## Question 13

**Question:** A leaf node is one that:

**Choices:**
- **A.** is the root
- **B.** has exactly one child
- **C.** has two children
- **D.** has no children

**Correct Answer:** has no children

**Explanation:** A leaf has both left and right references null.

---

## Question 14

**Question:** The height of a tree with a single node is:

**Choices:**
- **A.** 1
- **B.** 0
- **C.** -1
- **D.** 2

**Correct Answer:** 0

**Explanation:** By the common convention (height = number of edges on the longest root-to-leaf path), a single node has height 0. (Some texts define an empty tree's height as -1.)

---

## Question 15

**Question:** The number of nodes in a complete/perfect binary tree of height h is:

**Choices:**
- **A.** 2h
- **B.** h²
- **C.** 2^(h+1) - 1
- **D.** 2^h

**Correct Answer:** 2^(h+1) - 1

**Explanation:** A perfect binary tree of height h has 2^(h+1) − 1 nodes (with height counted in edges).

---

## Question 16

**Question:** A BST deletion Case 1 (the node has no left child) is handled by:

**Choices:**
- **A.** finding the smallest right-subtree node
- **B.** deleting the whole subtree
- **C.** rotating the tree, independent of the input size or ordering
- **D.** connecting the parent directly to the node's right child

**Correct Answer:** connecting the parent directly to the node's right child

**Explanation:** With no left child, splicing the parent to the node's right child (possibly null) removes the node cleanly.

---

## Question 17

**Question:** BST deletion Case 2 (the node has a left child) uses:

**Choices:**
- **A.** the smallest node of the right subtree
- **B.** the largest node (rightmost) of the left subtree to replace the deleted value
- **C.** the root, making it the most efficient choice by design
- **D.** any leaf, as a direct consequence of the structure's shape

**Correct Answer:** the largest node (rightmost) of the left subtree to replace the deleted value

**Explanation:** The in-order predecessor (rightmost of the left subtree) preserves the BST property when it replaces the deleted node's value.

---

## Question 18

**Question:** In Case 2 deletion, after copying the rightmost-left value into the target node, you must:

**Choices:**
- **A.** delete the root, which holds even for empty or degenerate inputs
- **B.** rebalance the whole tree
- **C.** unlink that rightmost node from the left subtree
- **D.** do nothing else

**Correct Answer:** unlink that rightmost node from the left subtree

**Explanation:** The predecessor node is then removed by connecting its parent (`parentOfRightMost`) to its left child, since a rightmost node has no right child.

---

## Question 19

**Question:** Why does the rightmost node of the left subtree have no right child?

**Choices:**
- **A.** because it is the root, because the elements are always stored contiguously
- **B.** because BSTs forbid right children, and this is true regardless of how the data was built
- **C.** because it is a leaf by definition
- **D.** because if it had a right child, that child would be larger and thus be the true rightmost

**Correct Answer:** because if it had a right child, that child would be larger and thus be the true rightmost

**Explanation:** "Rightmost" means no larger node exists in that subtree, so it cannot have a right child.

---

## Question 20

**Question:** An alternative to using the in-order predecessor for deletion is using the:

**Choices:**
- **A.** root
- **B.** in-order successor
- **C.** largest node overall
- **D.** any leaf

**Correct Answer:** in-order successor

**Explanation:** Symmetrically, the leftmost node of the right subtree (successor) can replace the deleted node while preserving order.

---

## Question 21

**Question:** Insert 8,3,10,1,6,14,4,7,13 into a BST. What is the root's left child?

**Choices:**
- **A.** 10
- **B.** 1
- **C.** 3
- **D.** 6

**Correct Answer:** 3

**Explanation:** 8 is the root; 3 < 8 becomes its left child.

---

## Question 22

**Question:** For the Q21 tree, the inorder traversal is:

**Choices:**
- **A.** 8 3 10 1 6 14 4 7 13
- **B.** 1 4 7 6 3 13 14 10 8
- **C.** 8 3 1 6 4 7 10 14 13
- **D.** 1 3 4 6 7 8 10 13 14

**Correct Answer:** 1 3 4 6 7 8 10 13 14

**Explanation:** Inorder yields sorted order of all inserted keys.

---

## Question 23

**Question:** For the Q21 tree, the preorder traversal is:

**Choices:**
- **A.** 1 3 4 6 7 8 10 13 14
- **B.** 8 3 1 6 4 7 10 14 13
- **C.** 1 4 7 6 3 13 14 10 8
- **D.** 8 10 14 13 3 6 7 4 1

**Correct Answer:** 8 3 1 6 4 7 10 14 13

**Explanation:** Preorder: root 8; left subtree of 3 (3,1,6,4,7); right subtree of 10 (10,14,13).

---

## Question 24

**Question:** For the Q21 tree, the postorder traversal is:

**Choices:**
- **A.** 8 3 1 6 4 7 10 14 13
- **B.** 1 3 4 6 7 8 10 13 14
- **C.** 1 4 7 6 3 13 14 10 8
- **D.** 8 3 10 1 6 14 4 7 13

**Correct Answer:** 1 4 7 6 3 13 14 10 8

**Explanation:** Postorder processes each subtree's children before the subtree root, ending with the overall root 8.

---

## Question 25

**Question:** True or false: A binary tree is a BST if and only if its inorder traversal is strictly increasing (for distinct keys).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The BST property is equivalent to a strictly increasing inorder sequence for distinct keys.

---

## Question 26

**Question:** Which check is INSUFFICIENT to validate a BST?

**Choices:**
- **A.** verifying inorder is sorted
- **B.** verifying every node against a valid (min, max) range
- **C.** all are sufficient, which the definition guarantees in every case
- **D.** checking only that each node's left child < node and right child > node

**Correct Answer:** checking only that each node's left child < node and right child > node

**Explanation:** A purely local parent-child check fails to catch violations deeper in a subtree; a range-based or inorder check is needed.

---

## Question 27

**Question:** Insert into an empty BST: 5,5,5 (duplicates go right by convention). The tree becomes:

**Choices:**
- **A.** a single node
- **B.** a right-skewed chain of three 5s
- **C.** a balanced tree
- **D.** an error, so no traversal or comparison is ever needed

**Correct Answer:** a right-skewed chain of three 5s

**Explanation:** With the "duplicates to the right" rule, each equal insert goes right, forming a chain.

---

## Question 28

**Question:** The `path(e)` method in the studied BST returns:

**Choices:**
- **A.** the shortest path in the whole tree
- **B.** the postorder traversal
- **C.** the list of nodes visited from the root while searching for e
- **D.** the height, independent of the input size or ordering

**Correct Answer:** the list of nodes visited from the root while searching for e

**Explanation:** `path` records the search route from the root toward e, useful for visualization and analysis.

---

## Question 29

**Question:** A `BST<E extends Comparable<E>>` requires `E extends Comparable<E>` because:

**Choices:**
- **A.** elements must be printable
- **B.** elements must be serializable
- **C.** the tree must be balanced, making it the most efficient choice by design
- **D.** insertion/search must compare elements to decide left/right

**Correct Answer:** insertion/search must compare elements to decide left/right

**Explanation:** The BST needs `compareTo` to order elements and navigate the tree.

---

## Question 30

**Question:** Level (depth) of the root is:

**Choices:**
- **A.** 1
- **B.** 0
- **C.** -1
- **D.** the height

**Correct Answer:** 0

**Explanation:** By the common convention, the root is at depth/level 0; each edge downward increases depth by 1.

---

## Question 31

**Question:** The maximum number of nodes at level k (root at level 0) is:

**Choices:**
- **A.** k
- **B.** 2k
- **C.** 2^k
- **D.** k²

**Correct Answer:** 2^k

**Explanation:** Each level can at most double the previous, so level k holds up to 2^k nodes.

---

## Question 32

**Question:** True or false: In a BST, the minimum element is always the leftmost node.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Following left children until none remain reaches the smallest key.

---

## Question 33

**Question:** The maximum element of a BST is found by:

**Choices:**
- **A.** following left children to the end
- **B.** taking the root
- **C.** an inorder traversal's first element
- **D.** following right children to the end

**Correct Answer:** following right children to the end

**Explanation:** The largest key is the rightmost node, reached by repeatedly going right.

---

## Question 34

**Question:** What is printed by an inorder traversal of a BST built by inserting 4,2,6,1,3,5,7?

**Choices:**
- **A.** 4 2 1 3 6 5 7
- **B.** 1 2 3 4 5 6 7
- **C.** 1 3 2 5 7 6 4
- **D.** 4 2 6 1 3 5 7

**Correct Answer:** 1 2 3 4 5 6 7

**Explanation:** This builds a perfect BST; inorder gives sorted 1..7.

---

## Question 35

**Question:** For the same perfect tree, the preorder is:

**Choices:**
- **A.** 1 2 3 4 5 6 7
- **B.** 1 3 2 5 7 6 4
- **C.** 4 2 1 3 6 5 7
- **D.** 4 6 7 5 2 3 1

**Correct Answer:** 4 2 1 3 6 5 7

**Explanation:** Preorder: 4, then left subtree (2,1,3), then right subtree (6,5,7).

---

## Question 36

**Question:** For the same perfect tree, the postorder is:

**Choices:**
- **A.** 4 2 1 3 6 5 7
- **B.** 1 2 3 4 5 6 7
- **C.** 4 6 7 5 2 3 1
- **D.** 1 3 2 5 7 6 4

**Correct Answer:** 1 3 2 5 7 6 4

**Explanation:** Postorder: left subtree (1,3,2), right subtree (5,7,6), then root 4.

---

## Question 37

**Question:** True or false: Preorder traversal of a BST can uniquely reconstruct the tree (for distinct keys).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** For a BST with distinct keys, the preorder sequence alone determines the tree because the BST property fixes subtree boundaries.

---

## Question 38

**Question:** True or false: For a general (non-BST) binary tree, inorder alone uniquely determines the tree.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** A general binary tree needs two traversals (e.g., inorder + preorder) to reconstruct uniquely; inorder alone is ambiguous.

---

## Question 39

**Question:** Which two traversals together uniquely reconstruct any binary tree with distinct keys?

**Choices:**
- **A.** preorder + postorder
- **B.** inorder + preorder
- **C.** level-order alone
- **D.** postorder alone

**Correct Answer:** inorder + preorder

**Explanation:** Inorder pinpoints left/right partitions while pre/postorder identifies roots; together they rebuild the tree. Preorder+postorder alone is ambiguous for general trees.

---

## Question 40

**Question:** Insert 30,20,40,10,25,35,50 then delete 20 (which has children 10 and 25). Using the in-order predecessor rule, 20 is replaced by:

**Choices:**
- **A.** 25
- **B.** 30
- **C.** 10
- **D.** 35

**Correct Answer:** 10

**Explanation:** The in-order predecessor of 20 is the rightmost node of its left subtree; the left subtree is just 10 (a leaf), so 10 replaces 20.

---

## Question 41

**Question:** In the same tree, if instead the in-order SUCCESSOR rule were used to delete 20, the replacement would be:

**Choices:**
- **A.** 10
- **B.** 35
- **C.** 30
- **D.** 25

**Correct Answer:** 25

**Explanation:** The successor is the leftmost node of the right subtree of 20; that subtree is just 25, so 25 replaces 20.

---

## Question 42

**Question:** Deleting the root of a BST is:

**Choices:**
- **A.** impossible, as a direct consequence of the structure's shape
- **B.** handled by the same two cases, adjusting the tree's root reference if needed
- **C.** always makes the tree empty
- **D.** only allowed for leaves, which holds even for empty or degenerate inputs

**Correct Answer:** handled by the same two cases, adjusting the tree's root reference if needed

**Explanation:** Root deletion follows the standard cases; special care updates the `root` field when the root itself changes.

---

## Question 43

**Question:** True or false: BST insertion never requires restructuring existing nodes; it only attaches a new leaf.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Plain BST insert walks to a null position and attaches a new leaf; no existing nodes move (unlike balanced trees).

---

## Question 44

**Question:** The height of a BST with n nodes is at best and at worst:

**Choices:**
- **A.** best O(n), worst O(log n)
- **B.** always O(log n)
- **C.** best O(log n), worst O(n)
- **D.** always O(n)

**Correct Answer:** best O(log n), worst O(n)

**Explanation:** A balanced BST has height O(log n); a degenerate (skewed) one has height O(n).

---

## Question 45

**Question:** Which self-balancing tree guarantees O(log n) height?

**Choices:**
- **A.** plain BST, because the elements are always stored contiguously
- **B.** binary heap
- **C.** linked list
- **D.** AVL tree (or red-black tree)

**Correct Answer:** AVL tree (or red-black tree)

**Explanation:** AVL and red-black trees enforce balance to keep height logarithmic, unlike a plain BST.

---

## Question 46

**Question:** What prints for an inorder traversal after inserting "banana","apple","cherry" into a `BST<String>`?

**Choices:**
- **A.** banana apple cherry
- **B.** apple banana cherry
- **C.** cherry banana apple
- **D.** apple cherry banana

**Correct Answer:** apple banana cherry

**Explanation:** Inorder yields lexicographic (natural) order for strings.

---

## Question 47

**Question:** True or false: A BST allows O(log n) in-order successor queries on average when balanced.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With parent links or subtree navigation, successor queries cost O(h), which is O(log n) for a balanced tree.

---

## Question 48

**Question:** The recursive inorder method structure is:

**Choices:**
- **A.** visit(node); inorder(left); inorder(right)
- **B.** inorder(left); inorder(right); visit(node)
- **C.** inorder(left); visit(node); inorder(right)
- **D.** inorder(right); visit(node); inorder(left)

**Correct Answer:** inorder(left); visit(node); inorder(right)

**Explanation:** Inorder recurses left, visits the node, then recurses right.

---

## Question 49

**Question:** For the memory aid, the expression tree of `1 + 2` gives which traversals?

**Choices:**
- **A.** inorder=12+, preorder=1+2, postorder=+12
- **B.** all three equal 1+2
- **C.** inorder=+12, preorder=12+, postorder=1+2
- **D.** inorder=1+2, preorder=+12, postorder=12+

**Correct Answer:** inorder=1+2, preorder=+12, postorder=12+

**Explanation:** Inorder gives infix (1+2), preorder gives prefix (+12), postorder gives postfix (12+).

---

## Question 50

**Question:** Postorder traversal of an expression tree produces:

**Choices:**
- **A.** infix notation
- **B.** postfix (reverse Polish) notation
- **C.** prefix notation
- **D.** level order, and this is true regardless of how the data was built

**Correct Answer:** postfix (reverse Polish) notation

**Explanation:** Visiting operands before operators (left,right,root) yields postfix, directly evaluable by a stack.

---

## Question 51

**Question:** True or false: Level-order traversal uses a queue.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** BFS/level-order enqueues children and dequeues parents in FIFO order, visiting level by level.

---

## Question 52

**Question:** What is the level-order traversal of the BST from inserting 4,2,6,1,3,5,7?

**Choices:**
- **A.** 1 2 3 4 5 6 7
- **B.** 4 2 1 3 6 5 7
- **C.** 4 2 6 1 3 5 7
- **D.** 1 3 2 5 7 6 4

**Correct Answer:** 4 2 6 1 3 5 7

**Explanation:** Level-order reads top to bottom, left to right: 4; then 2,6; then 1,3,5,7.

---

## Question 53

**Question:** True or false: In a BST, searching for a value not present ends at a null link where the value would be inserted.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** An unsuccessful search walks to a null child; that spot is exactly the insertion point.

---

## Question 54

**Question:** The number of leaf nodes in a perfect binary tree with n nodes is:

**Choices:**
- **A.** n/2
- **B.** n
- **C.** log n
- **D.** (n+1)/2

**Correct Answer:** (n+1)/2

**Explanation:** In a perfect binary tree, leaves number (n+1)/2 (the bottom level holds just over half the nodes).

---

## Question 55

**Question:** True or false: A full binary tree (every node has 0 or 2 children) can have any number of nodes.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** A full binary tree always has an odd number of nodes, since internal nodes each add two children.

---

## Question 56

**Question:** What does BST `search(45)` return for the tree built from 50,30,70,20,40 if 45 is absent?

**Choices:**
- **A.** true
- **B.** false
- **C.** null
- **D.** the nearest node, 40

**Correct Answer:** false

**Explanation:** 45 < 50 → go left to 30; 45 > 30 → go right to 40; 45 > 40 → right child is null, so the search fails and returns false. A boolean `search` does not return the nearest node.

---

## Question 57

**Question:** True or false: Deleting a leaf node from a BST simply sets its parent's corresponding child link to null.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A leaf has no children, so unlinking it from its parent (null) removes it—the simplest deletion case.

---

## Question 58

**Question:** Which node replaces a deleted node that has TWO children, to keep the BST valid?

**Choices:**
- **A.** any leaf, which the definition guarantees in every case
- **B.** the root
- **C.** its in-order predecessor or successor
- **D.** its parent

**Correct Answer:** its in-order predecessor or successor

**Explanation:** The predecessor (max of left subtree) or successor (min of right subtree) preserves ordering when substituted.

---

## Question 59

**Question:** What is the height of the BST from inserting 1,2,3,4 in order (root at height 0, height in edges)?

**Choices:**
- **A.** 0
- **B.** 1
- **C.** 2
- **D.** 3

**Correct Answer:** 3

**Explanation:** The tree is a right chain 1→2→3→4 with 3 edges, so height 3.

---

## Question 60

**Question:** True or false: The average-case time to build a BST from n random distinct keys is O(n log n).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Random insertion order gives expected height O(log n), so n inserts total O(n log n) on average.

---

## Question 61

**Question:** What prints?

```java
// BST insert order: 5, 3, 8, 2, 4
// inorder traversal
```
Inorder output?

**Choices:**
- **A.** 5 3 8 2 4
- **B.** 2 3 4 5 8
- **C.** 2 4 3 8 5
- **D.** 5 3 2 4 8

**Correct Answer:** 2 3 4 5 8

**Explanation:** Inorder of the BST is sorted ascending.

---

## Question 62

**Question:** For the Q61 tree, preorder is:

**Choices:**
- **A.** 2 3 4 5 8
- **B.** 2 4 3 8 5
- **C.** 5 3 2 4 8
- **D.** 5 8 3 4 2

**Correct Answer:** 5 3 2 4 8

**Explanation:** Preorder: root 5; left subtree (3,2,4); right 8.

---

## Question 63

**Question:** For the Q61 tree, postorder is:

**Choices:**
- **A.** 5 3 2 4 8
- **B.** 2 3 4 5 8
- **C.** 8 4 2 3 5
- **D.** 2 4 3 8 5

**Correct Answer:** 2 4 3 8 5

**Explanation:** Postorder: left subtree (2,4,3), right (8), root (5).

---

## Question 64

**Question:** True or false: A BST with n nodes always has exactly n-1 edges.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Any tree with n nodes has exactly n−1 edges, connected and acyclic.

---

## Question 65

**Question:** The `TreeNode` class in the studied BST is declared `protected static class` because:

**Choices:**
- **A.** it must access the enclosing BST instance
- **B.** it needs no outer reference (static) and is accessible to subclasses
- **C.** it is required to be public
- **D.** it must be final, so no traversal or comparison is ever needed

**Correct Answer:** it needs no outer reference (static) and is accessible to subclasses

**Explanation:** A node holds no reference to the tree object, so static avoids overhead; protected lets subclasses use it.

---

## Question 66

**Question:** What is the minimum height of a BST with 7 nodes (height in edges)?

**Choices:**
- **A.** 1
- **B.** 3
- **C.** 2
- **D.** 7

**Correct Answer:** 2

**Explanation:** A perfect BST with 7 nodes has 3 levels (0,1,2), so minimum height is 2 edges.

---

## Question 67

**Question:** What is the maximum height of a BST with 7 nodes (height in edges)?

**Choices:**
- **A.** 3
- **B.** 7
- **C.** 2
- **D.** 6

**Correct Answer:** 6

**Explanation:** A fully skewed tree of 7 nodes is a chain with 6 edges, so maximum height 6.

---

## Question 68

**Question:** True or false: An iterative inorder traversal can be implemented with an explicit stack.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Pushing left spine nodes and popping to visit and go right simulates recursion iteratively with a stack.

---

## Question 69

**Question:** What does searching a balanced BST of 1,000,000 nodes cost, approximately?

**Choices:**
- **A.** ~1,000,000 comparisons
- **B.** ~20 comparisons
- **C.** ~1,000 comparisons
- **D.** 1 comparison

**Correct Answer:** ~20 comparisons

**Explanation:** log₂(10⁶) ≈ 20, so a balanced BST search takes about 20 comparisons.

---

## Question 70

**Question:** True or false: Inserting the same set of keys in different orders can produce different BST shapes but the same inorder traversal.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Shape depends on insertion order, but inorder is always the sorted key sequence regardless of shape.

---

## Question 71

**Question:** Which traversal would you use to safely DELETE all nodes (free children before parents)?

**Choices:**
- **A.** preorder
- **B.** inorder
- **C.** postorder
- **D.** level-order

**Correct Answer:** postorder

**Explanation:** Postorder processes children before their parent, so deleting in postorder frees subtrees before the node referencing them.

---

## Question 72

**Question:** Which traversal is best to COPY/clone a tree (create parent before children)?

**Choices:**
- **A.** postorder
- **B.** inorder
- **C.** none
- **D.** preorder

**Correct Answer:** preorder

**Explanation:** Preorder creates the root first, then its subtrees, mirroring the structure top-down for cloning.

---

## Question 73

**Question:** What prints?

```java
// BST: insert 15, 10, 20, 8, 12, 17, 25
// delete 10 (children 8 and 12), using in-order predecessor
// then inorder traversal
```

**Choices:**
- **A.** 8 10 12 15 17 20 25
- **B.** 8 12 15 17 20 25
- **C.** 8 15 12 17 20 25
- **D.** 10 12 15 17 20 25

**Correct Answer:** 8 12 15 17 20 25

**Explanation:** Deleting 10 removes it; the predecessor 8 takes its place, and inorder of the remaining keys is 8,12,15,17,20,25.

---

## Question 74

**Question:** True or false: In a BST, the in-order predecessor of a node with a left subtree is the maximum of that left subtree.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With a left subtree present, the predecessor is its rightmost (maximum) node.

---

## Question 75

**Question:** A binary tree where every level except possibly the last is full, and the last is filled left to right, is called:

**Choices:**
- **A.** full binary tree
- **B.** perfect binary tree
- **C.** complete binary tree
- **D.** degenerate tree

**Correct Answer:** complete binary tree

**Explanation:** That is the definition of a complete binary tree—the shape used by binary heaps.

---

## Question 76

**Question:** True or false: A perfect binary tree is always both full and complete.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A perfect tree (all internal nodes with two children and all leaves at the same level) satisfies both full and complete definitions.

---

## Question 77

**Question:** What is printed by preorder of a BST after inserting 20,10,30,5,15,25,35 and deleting 30 (children 25,35) via successor?

**Choices:**
- **A.** 20 10 5 15 30 25 35
- **B.** 20 10 5 15 25 35 30
- **C.** 20 30 35 25 10 15 5
- **D.** 20 10 5 15 35 25

**Correct Answer:** 20 10 5 15 35 25

**Explanation:** Successor of 30 is 35 (min of right subtree). After replacement, right subtree root is 35 with left child 25. Preorder: 20; left(10,5,15); right(35,25).

---

## Question 78

**Question:** True or false: BST operations search, insert, and delete are all O(h) where h is the height.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** All three follow a root-to-position path bounded by the height h.

---

## Question 79

**Question:** Which is TRUE about an empty BST?

**Choices:**
- **A.** its root points to a sentinel with value 0
- **B.** its root is null and size is 0
- **C.** it cannot exist
- **D.** it has height 0

**Correct Answer:** its root is null and size is 0

**Explanation:** An empty tree has a null root and zero elements; the first insert creates the root.

---

## Question 80

**Question:** What prints?

```java
// BST insert: 50, 25, 75, 10, 30, 60, 80
// count nodes with two children
```

**Choices:**
- **A.** 1
- **B.** 2
- **C.** 3
- **D.** 4

**Correct Answer:** 3

**Explanation:** 50 (25,75), 25 (10,30), 75 (60,80) each have two children—three such nodes; the leaves have none.

---

## Question 81

**Question:** True or false: A BST can be used to implement a sorted set with O(log n) contains/add/remove when balanced.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A balanced BST supports ordered set operations in O(log n), which is how `TreeSet`/`TreeMap` are built (via red-black trees).

---

## Question 82

**Question:** Java's `TreeMap` and `TreeSet` are backed by a:

**Choices:**
- **A.** hash table
- **B.** plain BST
- **C.** array, independent of the input size or ordering
- **D.** red-black (self-balancing) BST

**Correct Answer:** red-black (self-balancing) BST

**Explanation:** They use a red-black tree to guarantee O(log n) ordered operations.

---

## Question 83

**Question:** What is the inorder successor of the root 50 in a BST where 50's right subtree is 70 with left child 60?

**Choices:**
- **A.** 60
- **B.** 70
- **C.** 50
- **D.** none

**Correct Answer:** 60

**Explanation:** The successor is the leftmost node of the right subtree; from 70 go left to 60.

---

## Question 84

**Question:** True or false: If a node has no right subtree, its in-order successor (if any) is one of its ancestors.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Without a right subtree, the successor is the lowest ancestor for which the node lies in its left subtree.

---

## Question 85

**Question:** What prints?

```java
// BST insert: 40, 20, 60, 10, 30, 50, 70
// level-order traversal
```

**Choices:**
- **A.** 10 20 30 40 50 60 70
- **B.** 40 20 60 10 30 50 70
- **C.** 40 20 10 30 60 50 70
- **D.** 10 30 20 50 70 60 40

**Correct Answer:** 40 20 60 10 30 50 70

**Explanation:** Level-order: 40; then 20,60; then 10,30,50,70.

---

## Question 86

**Question:** True or false: The number of distinct BST shapes on n distinct keys is the n-th Catalan number.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** The count of structurally distinct BSTs on n keys equals the n-th Catalan number.

---

## Question 87

**Question:** Which operation on a BST is NOT O(h)?

**Choices:**
- **A.** search, making it the most efficient choice by design
- **B.** insert
- **C.** inorder traversal of all nodes
- **D.** find minimum

**Correct Answer:** inorder traversal of all nodes

**Explanation:** A full traversal visits every node, costing O(n), not O(h).

---

## Question 88

**Question:** What prints?

```java
// BST insert: 8, 4, 12, 2, 6
// delete 4 (children 2 and 6) using in-order successor
// preorder traversal
```

**Choices:**
- **A.** 8 4 2 6 12
- **B.** 8 2 6 12
- **C.** 8 6 12 2
- **D.** 8 6 2 12

**Correct Answer:** 8 6 2 12

**Explanation:** Successor of 4 is 6 (min of right subtree). Replace 4 with 6; 6's old spot removed; left child 2 remains under 6. Preorder: 8; left(6,2); right(12) → 8 6 2 12.

---

## Question 89

**Question:** True or false: A threaded binary tree uses otherwise-null child pointers to speed up traversal without a stack.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Threaded trees repurpose null links to point to inorder predecessor/successor, enabling stackless traversal.

---

## Question 90

**Question:** Which is TRUE about `getSize()` for a BST that maintains a size field?

**Choices:**
- **A.** it is O(1)
- **B.** it is O(n)
- **C.** it is O(log n)
- **D.** it requires a traversal

**Correct Answer:** it is O(1)

**Explanation:** A maintained size counter makes `getSize()` a constant-time read.

---

## Question 91

**Question:** What is the output?

```java
// BST insert: 100, 50, 150, 25, 75
// find the path from root to 75 (values along the way)
```

**Choices:**
- **A.** 100 150 75
- **B.** 100 50 75
- **C.** 100 50 25 75
- **D.** 100 75

**Correct Answer:** 100 50 75

**Explanation:** 75 < 100 → 50; 75 > 50 → 75. Path: 100, 50, 75.

---

## Question 92

**Question:** True or false: Deleting a node with two children can be done without ever moving more than one value into the deleted node's position.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** You copy just the predecessor/successor value into the target node, then remove that single predecessor/successor node.

---

## Question 93

**Question:** What is the inorder traversal after inserting 3,1,2 into a BST?

**Choices:**
- **A.** 3 1 2
- **B.** 1 3 2
- **C.** 1 2 3
- **D.** 3 2 1

**Correct Answer:** 1 2 3

**Explanation:** Root 3, left 1 with right child 2; inorder gives 1,2,3.

---

## Question 94

**Question:** True or false: In the tree from Q93 (root 3, left 1, 1's right child 2), the preorder is 3 1 2.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Preorder: root 3; left subtree of 1 (1 then its right child 2). So 3,1,2.

---

## Question 95

**Question:** Which describes the worst-case shape that makes BST search O(n)?

**Choices:**
- **A.** a perfectly balanced tree
- **B.** a complete tree
- **C.** an empty tree
- **D.** a completely skewed tree (a chain)

**Correct Answer:** a completely skewed tree (a chain)

**Explanation:** A skewed BST behaves like a linked list, giving O(n) search.

---

## Question 96

**Question:** What prints?

```java
// BST insert: 7, 3, 9, 1, 5, 8, 10, 4, 6
// count leaf nodes
```

**Choices:**
- **A.** 5
- **B.** 3
- **C.** 4
- **D.** 2

**Correct Answer:** 5

**Explanation:** Build the tree: 7(root); 3 left, 9 right; under 3: 1 left, 5 right; under 5: 4 left, 6 right; under 9: 8 left, 10 right. The leaves (no children) are 1, 4, 6, 8, and 10 → 5 leaves.

---

## Question 97

**Question:** True or false: An AVL tree rebalances via rotations to keep the height difference of subtrees at most 1.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** AVL trees maintain a balance factor in {−1,0,1} using rotations after insertions/deletions.

---

## Question 98

**Question:** Which traversal on a BST prints keys in DESCENDING order?

**Choices:**
- **A.** standard inorder
- **B.** reverse inorder
- **C.** preorder
- **D.** postorder

**Correct Answer:** reverse inorder

**Explanation:** Visiting right before left in inorder yields descending order.

---

## Question 99

**Question:** What is the output?

```java
// BST insert: 60, 40, 80, 20, 50, 70, 90
// delete 60 (root, two children) using in-order predecessor
// what is the new root value?
```

**Choices:**
- **A.** 40
- **B.** 70
- **C.** 50
- **D.** 80

**Correct Answer:** 50

**Explanation:** The in-order predecessor of 60 is the max of its left subtree: from 40 go right to 50. So 50 becomes the new root value.

---

## Question 100

**Question:** Final synthesis: A logging system inserts millions of timestamps that arrive in strictly increasing order into a plain BST, then complains that lookups are as slow as scanning a list. The best diagnosis and fix is:

**Choices:**
- **A.** The BST property is wrong; swap left and right
- **B.** Inorder traversal is broken; rewrite it, as a direct consequence of the structure's shape
- **C.** The timestamps must be stored as strings, which holds even for empty or degenerate inputs
- **D.** Sorted insertion built a right-skewed degenerate BST (height O(n)); use a self-balancing tree (AVL/red-black) or bulk-build a balanced BST to restore O

**Correct Answer:** Sorted insertion built a right-skewed degenerate BST (height O(n)); use a self-balancing tree (AVL/red-black) or bulk-build a balanced BST to restore O

**Explanation:** Inserting already-sorted keys into a plain BST creates a chain of height O(n), so lookups degrade to O(n) like a list. A self-balancing tree keeps height O(log n) automatically, or building a balanced BST from the sorted data (choosing medians as roots) restores logarithmic lookups—addressing the root cause (unbalanced shape), not the traversal or storage type.

---

### Answer distribution (self-check)
Correct answers span A/B/C/D and are frequently short factual/numeric options rather than the longest choice. True/False items alternate outcomes. Q96 includes a recount note demonstrating the exact leaf-counting trap.
