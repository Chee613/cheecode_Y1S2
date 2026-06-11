# Graph Revision Notes

## Part 1: What is a Graph?

A graph is a data structure made of:

- Vertices
- Edges

A graph is written as:

G = (V, E)

Where:

- V = set of vertices
- E = set of edges

Example:

A → B

Meaning:

- A is a vertex
- B is a vertex
- A → B is an edge

---

## Vertex

A vertex is a point or node in a graph.

Example:

A, B, C, D

In real life:

- Cities
- People
- Computers
- Web pages
- Locations

---

## Edge

An edge is a connection between two vertices.

Example:

A → B

This means A is connected to B.

In real life:

- Road between cities
- Friendship between people
- Network connection between computers
- Flight route between airports

---

## Adjacent Vertices

Two vertices are adjacent if they are directly connected by an edge.

Example:

A → B

A and B are adjacent.

---

## Path

A path is a route from one vertex to another through edges.

Example:

A → B → C → D

This is a path from A to D.

---

# Part 2: Types of Graph

## 1. Directed Graph

A directed graph has arrows.

Example:

A → B

This means:

A can go to B.

But it does not mean:

B can go to A.

So:

A → B is not the same as B → A.

---

## 2. Undirected Graph

An undirected graph has no direction.

Example:

A — B

This means:

A connects to B.

B also connects to A.

In code, we usually store it as:

A → B  
B → A

---

## 3. Unweighted Graph

An unweighted graph has edges without values.

Example:

A → B

There is just a connection.

No distance, no cost, no weight.

---

## 4. Weighted Graph

A weighted graph has values on edges.

Example:

A --5→ B

The value 5 can mean:

- Distance
- Cost
- Time
- Weight

---

## Four Main Types

1. Directed unweighted graph
2. Directed weighted graph
3. Undirected unweighted graph
4. Undirected weighted graph

---

# Part 3: Adjacency Matrix and Adjacency List

Graphs must be represented in programming.

There are two common ways:

1. Adjacency Matrix
2. Adjacency List

---

## Adjacency Matrix

Adjacency matrix uses a 2D array.

If there are n vertices, the matrix size is:

n × n

Example vertices:

A, B, C

Matrix size:

3 × 3

For unweighted graph:

1 = edge exists  
0 = no edge

Example:

A → B  
A → C  
B → C

Matrix:

      A  B  C
   ----------
A |   0  1  1
B |   0  0  1
C |   0  0  0

Row = source  
Column = destination

So:

matrix[A][B] = 1

means:

A → B exists

---

## Undirected Matrix

For undirected graph:

A — B

We mark both:

matrix[A][B] = 1  
matrix[B][A] = 1

So the matrix is symmetrical.

---

## Weighted Matrix

For weighted graph:

A --5→ B

Instead of putting 1, we put the weight:

matrix[A][B] = 5

---

## Adjacency List

Adjacency list stores neighbours of each vertex.

Example:

A → B  
A → C  
B → D

Adjacency list:

A: B, C  
B: D  
C:  
D:

This means:

- A points to B and C
- B points to D
- C points to nobody
- D points to nobody

---

## Matrix vs List

### Adjacency Matrix

Good for:

- Dense graph
- Fast edge checking

Bad because:

- Uses more memory
- Wastes space if graph is sparse

### Adjacency List

Good for:

- Sparse graph
- Saving memory
- Linked-list implementation

Bad because:

- Checking edge may require traversal

---

# Part 4: Create Matrix/List from Diagram

Steps:

1. List all vertices
2. List all edges
3. Create adjacency list
4. Create adjacency matrix

Example:

A → B  
A → C  
B → D  
C → D

Vertices:

A, B, C, D

Edges:

A → B  
A → C  
B → D  
C → D

Adjacency list:

A: B, C  
B: D  
C: D  
D:

Adjacency matrix:

      A  B  C  D
   --------------
A |   0  1  1  0
B |   0  0  0  1
C |   0  0  0  1
D |   0  0  0  0

Java 2D array:

~~~java
int[][] graph = {
    {0, 1, 1, 0},
    {0, 0, 0, 1},
    {0, 0, 0, 1},
    {0, 0, 0, 0}
};
~~~

---

# Part 5: Graph Implementation Idea

In Java, our graph uses:

1. Vertex class
2. Edge class
3. WeightedGraph class

The main idea:

Graph = linked list of vertices

Each vertex has its own linked list of edges.

Example:

Vertex list:

A → B → C → D

Edge list of A:

B → C

This means:

A → B  
A → C

---

# Part 6: Vertex Class

A vertex stores:

- vertexInfo
- indeg
- outdeg
- nextVertex
- firstEdge

Meaning:

vertexInfo  
Stores the data, example "A"

indeg  
Number of incoming edges

outdeg  
Number of outgoing edges

nextVertex  
Points to the next vertex in the vertex list

firstEdge  
Points to the first edge in this vertex's edge list

Code:

~~~java
class Vertex<T extends Comparable<T>, N extends Comparable<N>> {
    T vertexInfo;
    int indeg;
    int outdeg;
    Vertex<T, N> nextVertex;
    Edge<T, N> firstEdge;

    public Vertex() {
        vertexInfo = null;
        indeg = 0;
        outdeg = 0;
        nextVertex = null;
        firstEdge = null;
    }

    public Vertex(T vInfo, Vertex<T, N> next) {
        vertexInfo = vInfo;
        indeg = 0;
        outdeg = 0;
        nextVertex = next;
        firstEdge = null;
    }
}
~~~

---

# Part 7: Edge Class

An edge stores:

- toVertex
- weight
- nextEdge

Meaning:

toVertex  
The destination vertex

weight  
The weight of the edge

nextEdge  
The next edge in the edge linked list

Code:

~~~java
class Edge<T extends Comparable<T>, N extends Comparable<N>> {
    Vertex<T, N> toVertex;
    N weight;
    Edge<T, N> nextEdge;

    public Edge() {
        toVertex = null;
        weight = null;
        nextEdge = null;
    }

    public Edge(Vertex<T, N> destination, N w, Edge<T, N> a) {
        toVertex = destination;
        weight = w;
        nextEdge = a;
    }
}
~~~

---

# Part 8: WeightedGraph Class Skeleton

~~~java
class WeightedGraph<T extends Comparable<T>, N extends Comparable<N>> {
    Vertex<T, N> head;
    int size;

    public WeightedGraph() {
        head = null;
        size = 0;
    }
}
~~~

Meaning:

head  
Points to the first vertex

size  
Number of vertices in the graph

---

# Part 9: hasVertex()

Purpose:

Check whether a vertex exists.

Example:

A → B → C

hasVertex("B") returns true  
hasVertex("D") returns false

Code:

~~~java
public boolean hasVertex(T v) {
    if (head == null) {
        return false;
    }

    Vertex<T, N> temp = head;

    while (temp != null) {
        if (temp.vertexInfo.compareTo(v) == 0) {
            return true;
        }

        temp = temp.nextVertex;
    }

    return false;
}
~~~

Important:

compareTo() == 0 means same value.

---

# Part 10: addVertex()

Purpose:

Add a new vertex into the graph.

Cases:

1. Vertex already exists → return false
2. Graph is empty → new vertex becomes head
3. Graph not empty → add at the end

Code:

~~~java
public boolean addVertex(T v) {
    if (hasVertex(v)) {
        return false;
    }

    Vertex<T, N> newVertex = new Vertex<>(v, null);

    if (head == null) {
        head = newVertex;
    } else {
        Vertex<T, N> temp = head;

        while (temp.nextVertex != null) {
            temp = temp.nextVertex;
        }

        temp.nextVertex = newVertex;
    }

    size++;
    return true;
}
~~~

---

# Part 11: getIndex()

Purpose:

Return the index of a vertex.

Example:

Index:  0   1   2  
List:   A → B → C

getIndex("A") returns 0  
getIndex("B") returns 1  
getIndex("C") returns 2  
getIndex("X") returns -1

Code:

~~~java
public int getIndex(T v) {
    Vertex<T, N> temp = head;
    int pos = 0;

    while (temp != null) {
        if (temp.vertexInfo.compareTo(v) == 0) {
            return pos;
        }

        temp = temp.nextVertex;
        pos++;
    }

    return -1;
}
~~~

---

# Part 12: getSize()

Purpose:

Return number of vertices.

Code:

~~~java
public int getSize() {
    return size;
}
~~~

---

# Part 13: getVertex()

Purpose:

Return vertex object at a position.

Example:

Index:  0   1   2  
List:   A → B → C

getVertex(1) returns vertex B

Code:

~~~java
public Vertex<T, N> getVertex(int pos) {
    if (pos < 0 || pos >= size) {
        return null;
    }

    Vertex<T, N> temp = head;

    for (int i = 0; i < pos; i++) {
        temp = temp.nextVertex;
    }

    return temp;
}
~~~

---

# Part 14: getAllVertexObjects()

Purpose:

Return all vertex information in an ArrayList.

Example:

A → B → C

Returns:

[A, B, C]

Code:

~~~java
public ArrayList<T> getAllVertexObjects() {
    ArrayList<T> list = new ArrayList<>();

    Vertex<T, N> temp = head;

    while (temp != null) {
        list.add(temp.vertexInfo);
        temp = temp.nextVertex;
    }

    return list;
}
~~~

---

# Part 15: hasEdge()

Purpose:

Check whether a direct edge exists.

Example:

A → B  
A → C

hasEdge("A", "B") returns true  
hasEdge("A", "D") returns false

Important:

A → B → D does not mean A → D.

hasEdge() only checks direct edge.

Code:

~~~java
public boolean hasEdge(T source, T destination) {
    if (head == null) {
        return false;
    }

    Vertex<T, N> temp = head;

    while (temp != null) {
        if (temp.vertexInfo.compareTo(source) == 0) {
            Edge<T, N> currentEdge = temp.firstEdge;

            while (currentEdge != null) {
                if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0) {
                    return true;
                }

                currentEdge = currentEdge.nextEdge;
            }
        }

        temp = temp.nextVertex;
    }

    return false;
}
~~~

Flow:

1. Find source vertex
2. Go to source.firstEdge
3. Traverse edge linked list
4. Compare destination
5. Found → true
6. Not found → false

---

# Part 16: addEdge()

Purpose:

Add a directed edge.

Example:

addEdge("A", "B", 5)

Creates:

A --5→ B

Code:

~~~java
public boolean addEdge(T source, T destination, N weight) {
    if (head == null) {
        return false;
    }

    if (!hasVertex(source) || !hasVertex(destination)) {
        return false;
    }

    if (hasEdge(source, destination)) {
        return false;
    }

    Vertex<T, N> sourceVertex = head;

    while (sourceVertex != null) {
        if (sourceVertex.vertexInfo.compareTo(source) == 0) {
            Vertex<T, N> destinationVertex = head;

            while (destinationVertex != null) {
                if (destinationVertex.vertexInfo.compareTo(destination) == 0) {
                    Edge<T, N> newEdge =
                            new Edge<>(destinationVertex, weight, sourceVertex.firstEdge);

                    sourceVertex.firstEdge = newEdge;

                    sourceVertex.outdeg++;
                    destinationVertex.indeg++;

                    return true;
                }

                destinationVertex = destinationVertex.nextVertex;
            }
        }

        sourceVertex = sourceVertex.nextVertex;
    }

    return false;
}
~~~

Flow:

1. Check graph is not empty
2. Check source exists
3. Check destination exists
4. Check edge does not already exist
5. Find source vertex
6. Find destination vertex
7. Create new edge
8. Insert edge at front of source edge list
9. Increase source outdeg
10. Increase destination indeg

Important:

Adding edge is like linked list addFirst.

newEdge.nextEdge = sourceVertex.firstEdge  
sourceVertex.firstEdge = newEdge

---

# Part 17: addUndirectedEdge()

Purpose:

Add an undirected weighted edge.

Example:

A --5-- B

In code, store as:

A --5→ B  
B --5→ A

Code:

~~~java
public boolean addUndirectedEdge(T vertex1, T vertex2, N weight) {
    if (!hasVertex(vertex1) || !hasVertex(vertex2)) {
        return false;
    }

    if (hasEdge(vertex1, vertex2) || hasEdge(vertex2, vertex1)) {
        return false;
    }

    addEdge(vertex1, vertex2, weight);
    addEdge(vertex2, vertex1, weight);

    return true;
}
~~~

Important:

Undirected edge = call addEdge() twice.

---

# Part 18: removeEdge()

Purpose:

Remove a directed edge.

Example:

A → B  
A → C  
A → D

removeEdge("A", "C")

Result:

A → B  
A → D

This is linked list deletion inside source vertex's edge list.

Code:

~~~java
public boolean removeEdge(T source, T destination) {
    if (head == null) {
        return false;
    }

    Vertex<T, N> sourceVertex = head;

    while (sourceVertex != null) {
        if (sourceVertex.vertexInfo.compareTo(source) == 0) {
            Edge<T, N> current = sourceVertex.firstEdge;
            Edge<T, N> previous = null;

            while (current != null) {
                if (current.toVertex.vertexInfo.compareTo(destination) == 0) {
                    if (previous == null) {
                        sourceVertex.firstEdge = current.nextEdge;
                    } else {
                        previous.nextEdge = current.nextEdge;
                    }

                    sourceVertex.outdeg--;
                    current.toVertex.indeg--;

                    return true;
                }

                previous = current;
                current = current.nextEdge;
            }
        }

        sourceVertex = sourceVertex.nextVertex;
    }

    return false;
}
~~~

Cases:

Case 1: Remove first edge

sourceVertex.firstEdge = current.nextEdge

Case 2: Remove middle or last edge

previous.nextEdge = current.nextEdge

Important:

Update degrees:

sourceVertex.outdeg--  
current.toVertex.indeg--

---

# Part 19: removeUndirectedEdge()

Purpose:

Remove an undirected edge.

Since undirected edge is stored as two directed edges:

A → B  
B → A

We must remove both.

Code:

~~~java
public boolean removeUndirectedEdge(T vertex1, T vertex2) {
    if (!hasEdge(vertex1, vertex2) || !hasEdge(vertex2, vertex1)) {
        return false;
    }

    removeEdge(vertex1, vertex2);
    removeEdge(vertex2, vertex1);

    return true;
}
~~~

---

# Part 20: getNeighbours()

Purpose:

Return all direct neighbours of a vertex.

Example:

A → B  
A → C  
A → D

getNeighbours("A") returns:

[B, C, D]

Code:

~~~java
public ArrayList<T> getNeighbours(T v) {
    ArrayList<T> list = new ArrayList<>();

    Vertex<T, N> temp = head;

    while (temp != null) {
        if (temp.vertexInfo.compareTo(v) == 0) {
            Edge<T, N> currentEdge = temp.firstEdge;

            while (currentEdge != null) {
                list.add(currentEdge.toVertex.vertexInfo);
                currentEdge = currentEdge.nextEdge;
            }

            return list;
        }

        temp = temp.nextVertex;
    }

    return null;
}
~~~

Important:

Neighbours are only direct connections.

A → B → C

C is not neighbour of A.

B is neighbour of A.

---

# Part 21: getIndeg()

In-degree = number of incoming edges.

Example:

B → A  
C → A  
D → A

indeg(A) = 3

Code:

~~~java
public int getIndeg(T v) {
    Vertex<T, N> temp = head;

    while (temp != null) {
        if (temp.vertexInfo.compareTo(v) == 0) {
            return temp.indeg;
        }

        temp = temp.nextVertex;
    }

    return -1;
}
~~~

---

# Part 22: getOutdeg()

Out-degree = number of outgoing edges.

Example:

A → B  
A → C  
A → D

outdeg(A) = 3

Code:

~~~java
public int getOutdeg(T v) {
    Vertex<T, N> temp = head;

    while (temp != null) {
        if (temp.vertexInfo.compareTo(v) == 0) {
            return temp.outdeg;
        }

        temp = temp.nextVertex;
    }

    return -1;
}
~~~

---

# Part 23: getEdgeWeight()

Purpose:

Return the weight of an edge.

Example:

A --5→ B

getEdgeWeight("A", "B") returns 5

Code:

~~~java
public N getEdgeWeight(T source, T destination) {
    Vertex<T, N> temp = head;

    while (temp != null) {
        if (temp.vertexInfo.compareTo(source) == 0) {
            Edge<T, N> currentEdge = temp.firstEdge;

            while (currentEdge != null) {
                if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0) {
                    return currentEdge.weight;
                }

                currentEdge = currentEdge.nextEdge;
            }
        }

        temp = temp.nextVertex;
    }

    return null;
}
~~~

---

# Part 24: printEdges()

Purpose:

Print the adjacency list of the graph.

Code:

~~~java
public void printEdges() {
    Vertex<T, N> temp = head;

    while (temp != null) {
        System.out.print(temp.vertexInfo + ": ");

        Edge<T, N> currentEdge = temp.firstEdge;

        while (currentEdge != null) {
            System.out.print(currentEdge.toVertex.vertexInfo + "(" + currentEdge.weight + ") ");
            currentEdge = currentEdge.nextEdge;
        }

        System.out.println();
        temp = temp.nextVertex;
    }
}
~~~

Example output:

A: C(8) B(5)  
B: D(10)  
C:  
D:

---

# Part 25: BFS

BFS stands for:

Breadth First Search

Main idea:

Visit nearby vertices first, then go further.

BFS uses:

Queue

Queue = First In, First Out

BFS is like water spreading level by level.

Example graph:

A → B  
A → C  
B → D  
B → E  
C → F

BFS from A:

A B C D E F

depending on neighbour order.

---

## BFS Algorithm

1. Create queue
2. Create visited list
3. Mark start as visited
4. Enqueue start
5. While queue is not empty:
   - Dequeue current
   - Visit current
   - Get neighbours
   - For each unvisited neighbour:
     - Mark visited
     - Enqueue neighbour

Code:

~~~java
public void bfs(T start) {
    Queue<T> queue = new LinkedList<>();
    ArrayList<T> visited = new ArrayList<>();

    visited.add(start);
    queue.offer(start);

    while (!queue.isEmpty()) {
        T current = queue.poll();
        System.out.print(current + " ");

        ArrayList<T> neighbours = getNeighbours(current);

        if (neighbours != null) {
            for (T neighbour : neighbours) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.offer(neighbour);
                }
            }
        }
    }
}
~~~

Important:

BFS = Graph + Queue

Use BFS for:

- Shortest path in unweighted graph
- Level-order traversal
- Network distance
- Friends of friends

Time complexity:

O(V + E)

---

# Part 26: DFS

DFS stands for:

Depth First Search

Main idea:

Go as deep as possible first.

DFS uses:

Stack

or recursion.

Stack = Last In, First Out

Example graph:

A → B  
A → C  
B → D  
B → E  
C → F

DFS from A may be:

A C F B E D

or:

A B D E C F

depending on neighbour order.

---

## DFS Using Stack

Code:

~~~java
public void dfs(T start) {
    Stack<T> stack = new Stack<>();
    ArrayList<T> visited = new ArrayList<>();

    stack.push(start);

    while (!stack.empty()) {
        T current = stack.pop();

        if (!visited.contains(current)) {
            System.out.print(current + " ");
            visited.add(current);

            ArrayList<T> neighbours = getNeighbours(current);

            if (neighbours != null) {
                for (T neighbour : neighbours) {
                    if (!visited.contains(neighbour)) {
                        stack.push(neighbour);
                    }
                }
            }
        }
    }
}
~~~

Important:

DFS = Graph + Stack

Use DFS for:

- Path finding
- Cycle detection
- Connected graph checking
- Deep exploration

---

# Part 27: Recursive DFS

Recursive DFS means the method calls itself.

Code:

~~~java
public void dfsRecursive(T start) {
    ArrayList<T> visited = new ArrayList<>();
    dfsHelper(start, visited);
}

private void dfsHelper(T current, ArrayList<T> visited) {
    if (visited.contains(current)) {
        return;
    }

    System.out.print(current + " ");
    visited.add(current);

    ArrayList<T> neighbours = getNeighbours(current);

    if (neighbours != null) {
        for (T neighbour : neighbours) {
            if (!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited);
            }
        }
    }
}
~~~

Flow:

dfsRecursive(A)

creates visited list

calls dfsHelper(A)

dfsHelper(A):
- visit A
- call dfsHelper(B)
- B calls D
- D ends
- back to B
- B calls E
- E ends
- back to A
- A calls C

Memory trick:

DFS recursion = go deep, return, continue

---

# Part 28: BFS vs DFS

## BFS

Uses queue

Visits level by level

Good for shortest path in unweighted graph

Example:

A B C D E F

---

## DFS

Uses stack or recursion

Goes deep first

Good for path finding and cycle detection

Example:

A B D E C F

---

# Part 29: Weighted Graph vs Unweighted Graph

## Weighted Graph

Class:

WeightedGraph<T, N>

T = vertex type  
N = weight type

Example:

WeightedGraph<String, Integer> graph = new WeightedGraph<>();

Edge has:

toVertex  
weight  
nextEdge

addEdge has weight:

addEdge(source, destination, weight)

---

## Unweighted Graph

Class:

Graph<T>

Only needs vertex type.

Example:

Graph<String> graph = new Graph<>();

Edge has:

toVertex  
nextEdge

No weight.

addEdge has no weight:

addEdge(source, destination)

---

# Part 30: Unweighted Edge Class

Weighted edge:

toVertex  
weight  
nextEdge

Unweighted edge:

toVertex  
nextEdge

Code:

~~~java
class Edge<T extends Comparable<T>> {
    Vertex<T> toVertex;
    Edge<T> nextEdge;

    public Edge() {
        toVertex = null;
        nextEdge = null;
    }

    public Edge(Vertex<T> destination, Edge<T> a) {
        toVertex = destination;
        nextEdge = a;
    }
}
~~~

---

# Part 31: Unweighted addEdge()

Code:

~~~java
public boolean addEdge(T source, T destination) {
    if (head == null) {
        return false;
    }

    if (!hasVertex(source) || !hasVertex(destination)) {
        return false;
    }

    if (hasEdge(source, destination)) {
        return false;
    }

    Vertex<T> sourceVertex = head;

    while (sourceVertex != null) {
        if (sourceVertex.vertexInfo.compareTo(source) == 0) {
            Vertex<T> destinationVertex = head;

            while (destinationVertex != null) {
                if (destinationVertex.vertexInfo.compareTo(destination) == 0) {
                    Edge<T> newEdge =
                            new Edge<>(destinationVertex, sourceVertex.firstEdge);

                    sourceVertex.firstEdge = newEdge;

                    sourceVertex.outdeg++;
                    destinationVertex.indeg++;

                    return true;
                }

                destinationVertex = destinationVertex.nextVertex;
            }
        }

        sourceVertex = sourceVertex.nextVertex;
    }

    return false;
}
~~~

Main change:

Remove weight.

---

# Part 32: Unweighted addUndirectedEdge()

Code:

~~~java
public boolean addUndirectedEdge(T vertex1, T vertex2) {
    if (!hasVertex(vertex1) || !hasVertex(vertex2)) {
        return false;
    }

    if (hasEdge(vertex1, vertex2) || hasEdge(vertex2, vertex1)) {
        return false;
    }

    addEdge(vertex1, vertex2);
    addEdge(vertex2, vertex1);

    return true;
}
~~~

---

# Part 33: Important Viva Questions

## Question 1: What is a graph?

A graph is a data structure made of vertices and edges.

---

## Question 2: What is the difference between directed and undirected graph?

Directed graph has direction.

A → B does not mean B → A.

Undirected graph has no direction.

A — B means A connects to B and B connects to A.

---

## Question 3: What is the difference between weighted and unweighted graph?

Weighted graph has values on edges.

Unweighted graph has no values on edges.

---

## Question 4: What is adjacency matrix?

A 2D array used to represent graph connections.

1 means edge exists.

0 means no edge.

---

## Question 5: What is adjacency list?

A list where each vertex stores its neighbours.

Example:

A: B, C  
B: D

---

## Question 6: Why does BFS use queue?

Because BFS visits vertices level by level.

Queue is First In, First Out, so earlier discovered vertices are visited first.

---

## Question 7: Why does DFS use stack?

Because DFS goes deep first.

Stack is Last In, First Out, so the newest discovered vertex is visited first.

---

## Question 8: Why do we need visited list?

To avoid visiting the same vertex repeatedly.

Without visited, a cycle can cause infinite loop.

Example:

A → B  
B → A

---

## Question 9: Why does addUndirectedEdge() call addEdge() twice?

Because our graph stores directed edges.

To represent:

A — B

we store:

A → B  
B → A

---

## Question 10: How does removeEdge() work?

It finds the source vertex, then searches the source edge linked list.

When it finds the destination edge, it removes the edge node using linked list deletion.

If deleting first edge:

sourceVertex.firstEdge = current.nextEdge

If deleting middle or last edge:

previous.nextEdge = current.nextEdge

---

# Part 34: Final Summary

Graph is built using:

Vertex linked list  
Edge linked lists

Main idea:

Graph = linked list of linked lists

Vertex stores:

vertexInfo  
indeg  
outdeg  
nextVertex  
firstEdge

Edge stores:

toVertex  
weight  
nextEdge

For unweighted graph, Edge does not store weight.

Core functions:

hasVertex()  
addVertex()  
getIndex()  
getVertex()  
getAllVertexObjects()  
getSize()  
hasEdge()  
addEdge()  
addUndirectedEdge()  
removeEdge()  
removeUndirectedEdge()  
getNeighbours()  
getIndeg()  
getOutdeg()  
getEdgeWeight()  
printEdges()  
bfs()  
dfs()  
dfsRecursive()

Most important memory trick:

BFS = Queue = level by level

DFS = Stack/Recursion = go deep first

Undirected edge = two directed edges

removeEdge() = linked list deletion inside edge list

WeightedGraph has weight

Graph has no weight