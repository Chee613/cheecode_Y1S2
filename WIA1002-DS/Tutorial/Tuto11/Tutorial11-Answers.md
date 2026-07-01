# Tutorial 11 - Binary Search Tree Answers

## Question 1

A binary search tree is a binary tree in which every key in a node's left subtree is smaller
than the node's key and every key in its right subtree is larger (under the chosen duplicate-key
policy). Search, insertion, and deletion follow these ordering rules.

## Question 2 - Build the BST

For input `50, 30, 25, 71, 80, 99, 40, 1, 7, 5`:

```text
             50
           /    \
         30      71
        /  \       \
      25   40       80
     /                \
    1                  99
     \
      7
     /
    5
```

## Question 3 - Height

The longest root-to-leaf path is `50 -> 30 -> 25 -> 1 -> 7 -> 5`. Following the course's
edge-count convention, the height is **5** (the path contains **6 levels/nodes**).

## Question 4 - Traversals of the given BST

- (a) Pre-order: `0100 0050 0025 0001 0030 0070 0065 0085 0150 0135 0169 0180`
- (b) In-order: `0001 0025 0030 0050 0065 0070 0085 0100 0135 0150 0169 0180`
- (c) Post-order: `0001 0030 0025 0065 0085 0070 0050 0135 0180 0169 0150 0100`

## Question 5 - Delete `0030`

`0030` is a leaf, so its parent's right link becomes `null`.

```text
                  0100
                /      \
             0050      0150
            /    \     /   \
         0025   0070 0135 0169
         /      /  \          \
      0001    0065 0085       0180
```

## Question 6 - Delete `0050` from the original tree

Using the in-order successor, replace `0050` with the smallest key in its right subtree,
`0065`, then remove the original `0065` leaf.

```text
                  0100
                /      \
             0065      0150
            /    \     /   \
         0025   0070 0135 0169
         /  \      \          \
      0001 0030   0085        0180
```

Using the in-order predecessor (`0030`) instead is also a valid BST deletion strategy, but it
produces a different, equally valid shape.
