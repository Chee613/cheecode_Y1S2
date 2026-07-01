# Lab 8 - Graph Answers

Complete runnable answers are already stored beside this sheet:

- Question 1: [`L8Q1.java`](L8Q1.java)
- Question 2: [`L8Q2.java`](L8Q2.java)
- Question 3: [`L8Q3.java`](L8Q3.java)
- Question 4: [`L8Q4.java`](L8Q4.java)

## Question 1 - `addUndirectedEdge`

The method validates both vertices and rejects an existing edge before adding both directed
halves. A self-loop only needs one directed edge.

```java
public boolean addUndirectedEdge(T source, T destination, N weight) {
    if (source.compareTo(destination) == 0) return addEdge(source, destination, weight);
    if (findVertex(source) == null || findVertex(destination) == null) return false;
    if (hasEdge(source, destination) || hasEdge(destination, source)) return false;
    return addEdge(source, destination, weight)
            && addEdge(destination, source, weight);
}
```

## Question 2 - `removeEdge`

Walk the source vertex's edge list while retaining the previous link. Bypass the matching edge
and update both degree counters. `L8Q2.java` contains the full implementation and test.

## Question 3 - Unweighted `Graph`

`L8Q3.java` removes the weight type and weight field from the weighted framework. It implements
directed `addEdge(source, destination)` and symmetric
`addUndirectedEdge(source, destination)` using linked adjacency lists.

## Question 4 - Test the unweighted graph

`L8Q4.java` adapts the lecture's weighted-graph test to `Graph<String>`. It tests vertices,
indexes, directed and undirected edges, in/out degrees, neighbours, invalid vertices, and edge
printing.
