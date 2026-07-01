# Chapter 7 Graph: 100 Extreme-Hard Questions

> Topics: graph concept (G=(V,E)), vertices/edges, adjacency & paths, directed/undirected & weighted/unweighted graphs, adjacency matrix vs adjacency list, the linked `Vertex`/`Edge`/`Graph` implementation (in-degree/out-degree, addVertex/addEdge, neighbours), and traversal (DFS with a stack, BFS with a queue, spanning trees). Choose the single best answer.

---

## Question 1

**Question:** A graph is formally defined as:

**Choices:**
- **A.** G = (V) where V is a list of values
- **B.** G = (E) where E is a set of nodes
- **C.** G = (V, E) where V is a set of vertices and E is a set of edges
- **D.** G = (root, children), and this is true regardless of how the data was built

**Correct Answer:** G = (V, E) where V is a set of vertices and E is a set of edges

**Explanation:** A graph consists of vertices (entities) and edges (connections between them).

---

## Question 2

**Question:** Two vertices are "adjacent" when:

**Choices:**
- **A.** they have the same weight
- **B.** they are at the same level
- **C.** they share a common neighbour
- **D.** they are directly connected by an edge

**Correct Answer:** they are directly connected by an edge

**Explanation:** Adjacency means a single edge directly links the two vertices.

---

## Question 3

**Question:** A "path" between two vertices means:

**Choices:**
- **A.** they must be adjacent, which the definition guarantees in every case
- **B.** you can travel from one to the other through one or more edges
- **C.** they have equal degree
- **D.** they are in different components

**Correct Answer:** you can travel from one to the other through one or more edges

**Explanation:** A path is a sequence of edges connecting the two vertices, possibly via intermediate vertices.

---

## Question 4

**Question:** In a weighted graph, an edge carries:

**Choices:**
- **A.** only a direction
- **B.** a color only, so no traversal or comparison is ever needed
- **C.** a value such as distance or cost
- **D.** nothing extra

**Correct Answer:** a value such as distance or cost

**Explanation:** Weighted edges store a numeric weight (e.g., distance between cities).

---

## Question 5

**Question:** In a directed graph, an edge from A to B:

**Choices:**
- **A.** implies an edge from B to A
- **B.** must be weighted
- **C.** connects A to itself
- **D.** does not imply an edge from B to A

**Correct Answer:** does not imply an edge from B to A

**Explanation:** Directed edges are one-way; A→B says nothing about B→A.

---

## Question 6

**Question:** In an undirected graph, an edge between A and B:

**Choices:**
- **A.** is one-directional
- **B.** allows travel both A→B and B→A
- **C.** must have weight 0
- **D.** connects three vertices

**Correct Answer:** allows travel both A→B and B→A

**Explanation:** Undirected edges are bidirectional, connecting the two vertices symmetrically.

---

## Question 7

**Question:** For a graph with n vertices, an adjacency matrix has size:

**Choices:**
- **A.** n
- **B.** 2n
- **C.** n × n
- **D.** n²  + n

**Correct Answer:** n × n

**Explanation:** The adjacency matrix is an n-by-n grid indexed by vertex pairs.

---

## Question 8

**Question:** In an unweighted adjacency matrix, `edge[i][j] = 1` means:

**Choices:**
- **A.** vertices i and j are not connected
- **B.** the weight is 1000
- **C.** i equals j
- **D.** vertex i is adjacent to vertex j

**Correct Answer:** vertex i is adjacent to vertex j

**Explanation:** A 1 marks an edge between i and j; 0 marks no edge.

---

## Question 9

**Question:** In a weighted adjacency matrix, the cell `edge[i][j]` typically stores:

**Choices:**
- **A.** always 1, independent of the input size or ordering
- **B.** the weight of the edge from i to j
- **C.** the vertex name
- **D.** the degree of i

**Correct Answer:** the weight of the edge from i to j

**Explanation:** For weighted graphs the matrix stores edge weights instead of a plain 1.

---

## Question 10

**Question:** The adjacency matrix is best suited for:

**Choices:**
- **A.** sparse graphs
- **B.** graphs with no edges
- **C.** dense graphs, with fast O(1) edge lookup
- **D.** trees only, making it the most efficient choice by design

**Correct Answer:** dense graphs, with fast O(1) edge lookup

**Explanation:** Matrices give constant-time edge checks and pay off when the graph has many edges.

---

## Question 11

**Question:** The main disadvantage of the adjacency matrix is:

**Choices:**
- **A.** slow edge lookup
- **B.** it cannot store weights
- **C.** it cannot represent directed graphs
- **D.** it wastes memory (O(n²)) for sparse graphs

**Correct Answer:** it wastes memory (O(n²)) for sparse graphs

**Explanation:** With few edges, most of the n² cells are empty, wasting space—an adjacency list is better there.

---

## Question 12

**Question:** The adjacency list is best suited for:

**Choices:**
- **A.** dense graphs, as a direct consequence of the structure's shape
- **B.** sparse graphs, storing only existing edges
- **C.** complete graphs
- **D.** graphs with weights only

**Correct Answer:** sparse graphs, storing only existing edges

**Explanation:** Lists store just the edges that exist, saving memory when the graph is sparse.

---

## Question 13

**Question:** A disadvantage of the adjacency list versus the matrix is:

**Choices:**
- **A.** it uses more memory for sparse graphs
- **B.** it cannot store neighbours, which holds even for empty or degenerate inputs
- **C.** checking whether a specific edge exists may require traversing a list
- **D.** it cannot represent weights

**Correct Answer:** checking whether a specific edge exists may require traversing a list

**Explanation:** Edge lookup in a list is O(degree), whereas a matrix is O(1).

---

## Question 14

**Question:** In the studied linked implementation, each edge node stores:

**Choices:**
- **A.** only the destination vertex
- **B.** the source and destination only
- **C.** the whole graph, because the elements are always stored contiguously
- **D.** the destination vertex, the weight, and a reference to the next edge

**Correct Answer:** the destination vertex, the weight, and a reference to the next edge

**Explanation:** An `Edge` holds `toVertex`, `weight`, and `nextEdge` to form the per-vertex edge list.

---

## Question 15

**Question:** In the linked implementation, a `Vertex` node stores:

**Choices:**
- **A.** vertex info only
- **B.** vertex info, in-degree, out-degree, next vertex, first edge
- **C.** left and right children
- **D.** a 2D matrix, and this is true regardless of how the data was built

**Correct Answer:** vertex info, in-degree, out-degree, next vertex, first edge

**Explanation:** The `Vertex` holds its data, degree counts, a link to the next vertex, and a link to its first edge.

---

## Question 16

**Question:** The out-degree of a vertex is:

**Choices:**
- **A.** the number of edges coming into it
- **B.** the total number of vertices
- **C.** the number of edges going out of it
- **D.** its weight

**Correct Answer:** the number of edges going out of it

**Explanation:** Out-degree counts outgoing edges; in-degree counts incoming edges.

---

## Question 17

**Question:** The in-degree of a vertex is:

**Choices:**
- **A.** the number of outgoing edges
- **B.** the number of neighbours' weights
- **C.** always equal to out-degree
- **D.** the number of incoming edges

**Correct Answer:** the number of incoming edges

**Explanation:** In-degree is the count of edges pointing into the vertex.

---

## Question 18

**Question:** In an undirected graph, the sum of all vertex degrees equals:

**Choices:**
- **A.** the number of vertices
- **B.** twice the number of edges
- **C.** the number of edges
- **D.** half the number of edges

**Correct Answer:** twice the number of edges

**Explanation:** Each edge contributes to the degree of both endpoints (the handshaking lemma).

---

## Question 19

**Question:** `getInDeg(v)` returns -1 when:

**Choices:**
- **A.** the vertex has no incoming edges
- **B.** the graph is weighted
- **C.** the vertex is not found in the graph
- **D.** the vertex is the head

**Correct Answer:** the vertex is not found in the graph

**Explanation:** A return of -1 signals the vertex does not exist (a degree of 0 is different from "not found").

---

## Question 20

**Question:** DFS (Depth-First Search) uses which data structure?

**Choices:**
- **A.** a queue
- **B.** a priority queue
- **C.** a binary search tree
- **D.** a stack

**Correct Answer:** a stack

**Explanation:** DFS uses a stack (explicit or the call stack) to go as deep as possible before backtracking.

---

## Question 21

**Question:** BFS (Breadth-First Search) uses which data structure?

**Choices:**
- **A.** a stack
- **B.** a queue
- **C.** a heap
- **D.** a linked list of edges

**Correct Answer:** a queue

**Explanation:** BFS uses a FIFO queue to visit vertices level by level.

---

## Question 22

**Question:** DFS explores the graph by:

**Choices:**
- **A.** visiting all neighbours before going deeper
- **B.** visiting vertices in sorted order
- **C.** going as deep as possible along one path before backtracking
- **D.** visiting only leaves, which the definition guarantees in every case

**Correct Answer:** going as deep as possible along one path before backtracking

**Explanation:** DFS dives down one branch fully, then backtracks to explore alternatives.

---

## Question 23

**Question:** BFS explores the graph by:

**Choices:**
- **A.** going deep first
- **B.** visiting random vertices
- **C.** following only the heaviest edges
- **D.** visiting vertices level by level

**Correct Answer:** visiting vertices level by level

**Explanation:** BFS processes all vertices at distance k before those at distance k+1.

---

## Question 24

**Question:** A graph traversal produces a:

**Choices:**
- **A.** sorted array
- **B.** spanning tree
- **C.** adjacency matrix
- **D.** hash table

**Correct Answer:** spanning tree

**Explanation:** The tree edges used to first reach each vertex during traversal form a spanning tree of the visited component.

---

## Question 25

**Question:** BFS on an unweighted graph finds:

**Choices:**
- **A.** the maximum-weight path
- **B.** a cycle, so no traversal or comparison is ever needed
- **C.** the shortest path by number of edges from the source
- **D.** the minimum spanning tree

**Correct Answer:** the shortest path by number of edges from the source

**Explanation:** Because BFS visits nearer vertices first, it yields fewest-edge shortest paths in unweighted graphs.

---

## Question 26

**Question:** Which is TRUE about memory usage of BFS vs DFS?

**Choices:**
- **A.** DFS always uses more memory
- **B.** they always use the same memory
- **C.** BFS uses no memory, independent of the input size or ordering
- **D.** BFS often uses more memory because the queue can hold a whole wide level

**Correct Answer:** BFS often uses more memory because the queue can hold a whole wide level

**Explanation:** BFS may store an entire level (which can be O(V) wide), whereas DFS's stack depth is bounded by the longest path.

---

## Question 27

**Question:** DFS is commonly used to:

**Choices:**
- **A.** find the shortest unweighted path
- **B.** detect cycles, find paths, and check connectivity
- **C.** sort vertices by degree
- **D.** compute edge weights, making it the most efficient choice by design

**Correct Answer:** detect cycles, find paths, and check connectivity

**Explanation:** DFS naturally supports cycle detection, path finding, and connectivity checks.

---

## Question 28

**Question:** A graph is "connected" when:

**Choices:**
- **A.** it has no edges, as a direct consequence of the structure's shape
- **B.** all edges have equal weight
- **C.** there is a path between every pair of vertices
- **D.** it has exactly one vertex

**Correct Answer:** there is a path between every pair of vertices

**Explanation:** Connectivity means every vertex is reachable from every other (in the undirected sense).

---

## Question 29

**Question:** A cycle in a graph is:

**Choices:**
- **A.** an isolated vertex
- **B.** any edge, which holds even for empty or degenerate inputs
- **C.** a vertex with degree 1
- **D.** a path that starts and ends at the same vertex

**Correct Answer:** a path that starts and ends at the same vertex

**Explanation:** A cycle is a closed path returning to its start.

---

## Question 30

**Question:** A bipartite graph is one whose vertices can be split into two sets such that:

**Choices:**
- **A.** every edge connects two vertices in the same set
- **B.** every edge connects a vertex in one set to a vertex in the other set
- **C.** there are no edges, because the elements are always stored contiguously
- **D.** all vertices have equal degree

**Correct Answer:** every edge connects a vertex in one set to a vertex in the other set

**Explanation:** Bipartite graphs have edges only between the two parts, none within a part; BFS 2-coloring can check this.

---

## Question 31

**Question:** For the adjacency matrix of an undirected graph, the matrix is:

**Choices:**
- **A.** always the identity matrix
- **B.** upper triangular only
- **C.** symmetric (edge[i][j] == edge[j][i])
- **D.** never symmetric

**Correct Answer:** symmetric (edge[i][j] == edge[j][i])

**Explanation:** Undirected edges are mutual, so the matrix mirrors across the diagonal.

---

## Question 32

**Question:** For a directed graph, the adjacency matrix is:

**Choices:**
- **A.** always symmetric
- **B.** always the identity
- **C.** always empty
- **D.** not necessarily symmetric

**Correct Answer:** not necessarily symmetric

**Explanation:** A directed edge i→j sets edge[i][j] without requiring edge[j][i], so symmetry is not guaranteed.

---

## Question 33

**Question:** `addVertex(v)` returns false when:

**Choices:**
- **A.** the graph is empty
- **B.** the vertex already exists
- **C.** the vertex is the first added
- **D.** the weight is negative

**Correct Answer:** the vertex already exists

**Explanation:** Duplicate vertices are rejected, so `addVertex` returns false if `v` is already present.

---

## Question 34

**Question:** In `addVertex`, when the graph is empty, the code:

**Choices:**
- **A.** returns false
- **B.** throws an exception
- **C.** makes `head` point to the new vertex
- **D.** adds an edge, and this is true regardless of how the data was built

**Correct Answer:** makes `head` point to the new vertex

**Explanation:** The first vertex becomes the head of the vertex linked list.

---

## Question 35

**Question:** `hasVertex(v)` works by:

**Choices:**
- **A.** checking the adjacency matrix diagonal
- **B.** hashing the vertex, which the definition guarantees in every case
- **C.** reading the edge list only
- **D.** traversing the vertex linked list and comparing with `compareTo`

**Correct Answer:** traversing the vertex linked list and comparing with `compareTo`

**Explanation:** It walks the vertex chain, using `compareTo` to test for a match.

---

## Question 36

**Question:** `hasEdge(source, destination)` first checks:

**Choices:**
- **A.** the edge weight, so no traversal or comparison is ever needed
- **B.** whether the graph is empty and whether both vertices exist
- **C.** the spanning tree
- **D.** the in-degree only

**Correct Answer:** whether the graph is empty and whether both vertices exist

**Explanation:** It guards against an empty graph and missing endpoints before searching the source's edge list.

---

## Question 37

**Question:** In `hasEdge`, once the source vertex is found, the inner loop:

**Choices:**
- **A.** deletes the source
- **B.** recomputes weights
- **C.** searches the destination among the source's edge list
- **D.** builds the matrix, independent of the input size or ordering

**Correct Answer:** searches the destination among the source's edge list

**Explanation:** The inner loop scans the source vertex's edges looking for the destination.

---

## Question 38

**Question:** `addEdge(source, destination, w)` differs from `hasEdge` mainly in that:

**Choices:**
- **A.** it searches for the source only
- **B.** it removes an edge, making it the most efficient choice by design
- **C.** it ignores the weight
- **D.** once the destination vertex is found, it creates a new edge

**Correct Answer:** once the destination vertex is found, it creates a new edge

**Explanation:** After locating both endpoints, `addEdge` constructs and links a weighted edge node.

---

## Question 39

**Question:** When inserting a new edge at the front of a vertex's edge list, the pointer steps are:

**Choices:**
- **A.** point the vertex to the new edge, then discard the old list
- **B.** point the new edge's next to the existing first edge, then point the vertex's firstEdge to the new edge
- **C.** point the new edge to itself, which holds even for empty or degenerate inputs
- **D.** reverse the whole edge list, as a direct consequence of the structure's shape

**Correct Answer:** point the new edge's next to the existing first edge, then point the vertex's firstEdge to the new edge

**Explanation:** Prepending links the new edge to the current list first, then updates `firstEdge`, an O(1) insertion.

---

## Question 40

**Question:** After successfully adding a directed edge source→destination, which degree counts change?

**Choices:**
- **A.** source's in-degree and destination's out-degree
- **B.** only the source's out-degree
- **C.** source's out-degree and destination's in-degree
- **D.** neither changes

**Correct Answer:** source's out-degree and destination's in-degree

**Explanation:** An outgoing edge raises the source's out-degree; the incoming edge raises the destination's in-degree.

---

## Question 41

**Question:** `getNeighbours(v)` returns:

**Choices:**
- **A.** all vertices in the graph
- **B.** only v itself
- **C.** the in-degree of v
- **D.** all vertices adjacent to v

**Correct Answer:** all vertices adjacent to v

**Explanation:** It collects the destination vertices along v's edge list into an `ArrayList`.

---

## Question 42

**Question:** `getVertex(pos)` returns null when:

**Choices:**
- **A.** the position is invalid
- **B.** the position is valid
- **C.** the graph is weighted
- **D.** pos equals 0

**Correct Answer:** the position is invalid

**Explanation:** An out-of-range index yields null since no vertex occupies that position.

---

## Question 43

**Question:** `getSize()` returns:

**Choices:**
- **A.** the number of edges
- **B.** the number of vertices
- **C.** the sum of weights
- **D.** the maximum degree

**Correct Answer:** the number of vertices

**Explanation:** `size` tracks how many vertices are in the graph.

---

## Question 44

**Question:** `printEdges()` prints, for each vertex, its:

**Choices:**
- **A.** in-degree only
- **B.** neighbours' neighbours
- **C.** outgoing edges
- **D.** spanning tree

**Correct Answer:** outgoing edges

**Explanation:** The outer loop iterates vertices and the inner loop prints each vertex's outgoing edges.

---

## Question 45

**Question:** Consider the graph: A→B, A→C, B→C. The out-degree of A is:

**Choices:**
- **A.** 0
- **B.** 1
- **C.** 3
- **D.** 2

**Correct Answer:** 2

**Explanation:** A has outgoing edges to B and C, so out-degree 2.

---

## Question 46

**Question:** For the same graph A→B, A→C, B→C, the in-degree of C is:

**Choices:**
- **A.** 2
- **B.** 0
- **C.** 1
- **D.** 3

**Correct Answer:** 2

**Explanation:** C receives edges from A and B, so in-degree 2.

---

## Question 47

**Question:** A DFS starting at A on A→B, A→C, B→D (pushing neighbours) could visit in the order:

**Choices:**
- **A.** A, B, C, D always
- **B.** A, B, D, C (deep along B first)
- **C.** D, C, B, A, because the elements are always stored contiguously
- **D.** A, C, B, D always

**Correct Answer:** A, B, D, C (deep along B first)

**Explanation:** DFS dives deep: from A to B to D, then backtracks to visit C. (Exact order depends on neighbour ordering, but it goes deep before wide.)

---

## Question 48

**Question:** A BFS starting at A on A→B, A→C, B→D visits in the order:

**Choices:**
- **A.** A, B, D, C, and this is true regardless of how the data was built
- **B.** A, D, C, B
- **C.** A, B, C, D (level by level)
- **D.** D, B, C, A

**Correct Answer:** A, B, C, D (level by level)

**Explanation:** BFS visits A, then its neighbours B and C, then the next level D.

---

## Question 49

**Question:** Which structure gives O(1) time to check if edge (i, j) exists?

**Choices:**
- **A.** adjacency list
- **B.** edge linked list
- **C.** a queue
- **D.** adjacency matrix

**Correct Answer:** adjacency matrix

**Explanation:** A matrix lookup `edge[i][j]` is direct-index O(1); a list requires scanning.

---

## Question 50

**Question:** Space complexity of an adjacency matrix for n vertices is:

**Choices:**
- **A.** O(n²)
- **B.** O(n)
- **C.** O(V + E)
- **D.** O(E)

**Correct Answer:** O(n²)

**Explanation:** The full n×n grid uses O(n²) space regardless of edge count.

---

## Question 51

**Question:** Space complexity of an adjacency list for a graph with V vertices and E edges is:

**Choices:**
- **A.** O(V²)
- **B.** O(V + E)
- **C.** O(E²)
- **D.** O(1)

**Correct Answer:** O(V + E)

**Explanation:** Lists store each vertex plus each edge once, giving O(V + E).

---

## Question 52

**Question:** DFS time complexity using an adjacency list is:

**Choices:**
- **A.** O(V²)
- **B.** O(E²)
- **C.** O(V + E)
- **D.** O(log V)

**Correct Answer:** O(V + E)

**Explanation:** Each vertex and edge is examined once, giving O(V + E) with adjacency lists.

---

## Question 53

**Question:** BFS time complexity using an adjacency matrix is:

**Choices:**
- **A.** O(V + E)
- **B.** O(E)
- **C.** O(log V)
- **D.** O(V²)

**Correct Answer:** O(V²)

**Explanation:** Scanning each vertex's row to find neighbours costs O(V) per vertex, so O(V²) overall with a matrix.

---

## Question 54

**Question:** Why must graph traversal mark vertices as visited?

**Choices:**
- **A.** to avoid revisiting and infinite loops in cyclic graphs
- **B.** to sort them, which the definition guarantees in every case
- **C.** to compute weights
- **D.** to delete edges

**Correct Answer:** to avoid revisiting and infinite loops in cyclic graphs

**Explanation:** Without a visited set, cycles would cause endless re-processing of the same vertices.

---

## Question 55

**Question:** In the `Vertex`/`Edge` generic classes, the type bound `<T extends Comparable<T>>` is used so that:

**Choices:**
- **A.** vertices can be printed
- **B.** vertices can be compared (e.g., in `hasVertex`) using `compareTo`
- **C.** edges can be weighted, so no traversal or comparison is ever needed
- **D.** the graph can be directed

**Correct Answer:** vertices can be compared (e.g., in `hasVertex`) using `compareTo`

**Explanation:** Comparability lets vertex-search methods match vertices via `compareTo`.

---

## Question 56

**Question:** The type parameter `N extends Comparable<N>` in the graph classes represents:

**Choices:**
- **A.** the vertex info type
- **B.** the node count
- **C.** the numeric weight type
- **D.** the neighbour list

**Correct Answer:** the numeric weight type

**Explanation:** `N` is the (comparable) weight type stored on edges.

---

## Question 57

**Question:** A complete graph on n vertices has how many undirected edges?

**Choices:**
- **A.** n
- **B.** n²
- **C.** 2n
- **D.** n(n-1)/2

**Correct Answer:** n(n-1)/2

**Explanation:** Every pair of vertices is connected once, giving C(n,2) = n(n-1)/2 edges.

---

## Question 58

**Question:** A graph with V vertices and V-1 edges that is connected and acyclic is:

**Choices:**
- **A.** a tree
- **B.** a complete graph
- **C.** a cycle
- **D.** a bipartite graph only

**Correct Answer:** a tree

**Explanation:** Connected + acyclic + exactly V−1 edges characterizes a tree (a special graph).

---

## Question 59

**Question:** Which best describes why a graph is more general than a linked list?

**Choices:**
- **A.** a graph cannot store data
- **B.** in a graph a vertex can connect to many vertices, not just one successor
- **C.** a linked list has no nodes
- **D.** a graph must be sorted, independent of the input size or ordering

**Correct Answer:** in a graph a vertex can connect to many vertices, not just one successor

**Explanation:** Linked lists are linear (one next), whereas graph vertices can have many adjacencies.

---

## Question 60

**Question:** DFS can be implemented recursively using:

**Choices:**
- **A.** an explicit queue
- **B.** a priority queue
- **C.** the call stack (implicit stack)
- **D.** an adjacency matrix only

**Correct Answer:** the call stack (implicit stack)

**Explanation:** Recursive DFS relies on the method-call stack in place of an explicit stack.

---

## Question 61

**Question:** For a directed graph, the sum of all in-degrees equals:

**Choices:**
- **A.** the number of vertices
- **B.** twice the number of edges
- **C.** zero
- **D.** the number of edges

**Correct Answer:** the number of edges

**Explanation:** Each directed edge contributes exactly one to some vertex's in-degree, so the total in-degree equals |E| (as does total out-degree).

---

## Question 62

**Question:** A vertex with in-degree 0 in a directed graph is called a:

**Choices:**
- **A.** source
- **B.** sink
- **C.** leaf
- **D.** root of a cycle

**Correct Answer:** source

**Explanation:** A source has no incoming edges; a sink has no outgoing edges.

---

## Question 63

**Question:** A vertex with out-degree 0 in a directed graph is called a:

**Choices:**
- **A.** source
- **B.** sink
- **C.** hub
- **D.** bridge

**Correct Answer:** sink

**Explanation:** A sink has no outgoing edges.

---

## Question 64

**Question:** Which traversal would you use to find the fewest-hops route in an unweighted flight network?

**Choices:**
- **A.** DFS
- **B.** postorder
- **C.** BFS
- **D.** inorder

**Correct Answer:** BFS

**Explanation:** BFS finds shortest paths by edge count, matching "fewest hops."

---

## Question 65

**Question:** Which algorithm finds shortest paths in a WEIGHTED graph with non-negative weights?

**Choices:**
- **A.** plain BFS
- **B.** plain DFS
- **C.** inorder traversal
- **D.** Dijkstra's algorithm

**Correct Answer:** Dijkstra's algorithm

**Explanation:** Plain BFS ignores weights; Dijkstra uses a priority queue to handle weighted shortest paths.

---

## Question 66

**Question:** The `getIndex(v)` method returns the vertex's:

**Choices:**
- **A.** position/index by traversing from head
- **B.** in-degree
- **C.** weight, making it the most efficient choice by design
- **D.** neighbour count

**Correct Answer:** position/index by traversing from head

**Explanation:** It walks the vertex list counting positions until it finds `v`.

---

## Question 67

**Question:** `getAllVertexObjects()` returns:

**Choices:**
- **A.** an adjacency matrix
- **B.** an `ArrayList<T>` of all vertex info
- **C.** the edge list, as a direct consequence of the structure's shape
- **D.** the head vertex only

**Correct Answer:** an `ArrayList<T>` of all vertex info

**Explanation:** It collects every vertex's info into an `ArrayList` by traversing the vertex chain.

---

## Question 68

**Question:** For a self-loop (an edge from v to v), which is TRUE in an adjacency matrix?

**Choices:**
- **A.** it is impossible to represent
- **B.** it sets the whole row to 1
- **C.** edge[v][v] is set
- **D.** it clears the diagonal

**Correct Answer:** edge[v][v] is set

**Explanation:** A self-loop marks the diagonal cell edge[v][v].

---

## Question 69

**Question:** Which is TRUE about DFS and cycle detection in a directed graph?

**Choices:**
- **A.** DFS cannot detect cycles
- **B.** cycles are detected only by BFS
- **C.** cycles require a matrix, which holds even for empty or degenerate inputs
- **D.** a back edge to a vertex currently on the recursion stack indicates a cycle

**Correct Answer:** a back edge to a vertex currently on the recursion stack indicates a cycle

**Explanation:** Encountering an edge to an ancestor still in the active DFS stack reveals a cycle.

---

## Question 70

**Question:** Consider vertices {1,2,5} with 1 adjacent to 2 and 5, and 2 adjacent to 1,3,5. The neighbours of 1 are:

**Choices:**
- **A.** {2, 5}
- **B.** {3, 5}
- **C.** {1, 2}
- **D.** {2, 3, 5}

**Correct Answer:** {2, 5}

**Explanation:** Vertex 1's adjacency list is {2, 5} per the description.

---

## Question 71

**Question:** True or false: An adjacency list stores, for each vertex, a list of its adjacent vertices (and edge weights if weighted).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Each vertex owns a list of its edges/neighbours, optionally with weights.

---

## Question 72

**Question:** True or false: In an undirected graph stored as an adjacency list, one edge {A,B} typically appears in both A's and B's lists.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Undirected edges are stored on both endpoints' lists to reflect bidirectionality.

---

## Question 73

**Question:** True or false: DFS always finds the shortest path in an unweighted graph.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** DFS may reach a target via a long deep path; BFS is the one that guarantees fewest edges.

---

## Question 74

**Question:** What does this DFS-style pseudocode print first after the start vertex?

```text
push start; mark start
while stack not empty:
    v = pop
    visit v
    push each unvisited neighbour (mark them)
```
Given start=A with neighbours pushed in order B then C, the pop order after A visits:

**Choices:**
- **A.** B, because the stack pops the first pushed neighbour first
- **B.** C, because the stack pops the most recently pushed neighbour first
- **C.** A is visited again
- **D.** neither B nor C is visited next

**Correct Answer:** C, because the stack pops the most recently pushed neighbour first

**Explanation:** With B then C pushed, the stack (LIFO) pops C next, so DFS descends via C first.

---

## Question 75

**Question:** True or false: BFS visits every vertex reachable from the source exactly once.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** With visited-marking, BFS processes each reachable vertex once.

---

## Question 76

**Question:** A disconnected graph traversed by a single BFS/DFS from one source will:

**Choices:**
- **A.** visit all vertices
- **B.** throw an error, because the elements are always stored contiguously
- **C.** visit only vertices in the source's connected component
- **D.** visit vertices in other components too

**Correct Answer:** visit only vertices in the source's connected component

**Explanation:** Unreachable components require separate traversals from a vertex in each.

---

## Question 77

**Question:** True or false: To traverse all vertices of a possibly disconnected graph, you loop over vertices and start a traversal from each unvisited one.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Restarting from each unvisited vertex covers all components.

---

## Question 78

**Question:** In the linked graph implementation, adding a vertex when non-empty appends at the end using:

**Choices:**
- **A.** the adjacency matrix
- **B.** the edge list, and this is true regardless of how the data was built
- **C.** recursion on edges
- **D.** a `previous` pointer to reach the last vertex

**Correct Answer:** a `previous` pointer to reach the last vertex

**Explanation:** The code walks with a `previous` reference to the tail of the vertex list and links the new vertex there.

---

## Question 79

**Question:** True or false: `getEdgeWeight(source, destination)` logic resembles `hasEdge`, but returns the weight when the edge is found.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** It searches like `hasEdge` and, upon finding the edge, returns its stored weight.

---

## Question 80

**Question:** Which is TRUE about representing a very sparse graph (few edges) with 10,000 vertices?

**Choices:**
- **A.** an adjacency list is far more memory-efficient than a 10,000×10,000 matrix
- **B.** an adjacency matrix is memory-efficient
- **C.** both use the same memory, which the definition guarantees in every case
- **D.** neither can represent it

**Correct Answer:** an adjacency list is far more memory-efficient than a 10,000×10,000 matrix

**Explanation:** A matrix would need 10⁸ cells; a list stores only the few actual edges plus vertices.

---

## Question 81

**Question:** True or false: An edge with weight can still exist in an unweighted-graph representation by treating the weight as 1.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Unweighted graphs can be modeled as weighted with uniform weight 1 (or a 1 in the matrix).

---

## Question 82

**Question:** Which traversal is typically better for exploring deep, tree-like structures with limited memory?

**Choices:**
- **A.** BFS
- **B.** DFS
- **C.** neither can traverse trees
- **D.** both use identical memory

**Correct Answer:** DFS

**Explanation:** DFS's memory is bounded by path depth, often less than BFS's level-width memory in deep structures.

---

## Question 83

**Question:** True or false: A spanning tree of a connected graph with V vertices always has exactly V-1 edges.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** A spanning tree connects all V vertices acyclically, which requires exactly V−1 edges.

---

## Question 84

**Question:** Which is TRUE about checking if a graph is bipartite?

**Choices:**
- **A.** it is impossible, so no traversal or comparison is ever needed
- **B.** only a matrix can do it
- **C.** BFS/DFS 2-coloring works: color levels alternately and check no edge joins same-colored vertices
- **D.** it requires sorting, independent of the input size or ordering

**Correct Answer:** BFS/DFS 2-coloring works: color levels alternately and check no edge joins same-colored vertices

**Explanation:** Alternate-coloring during traversal detects bipartiteness; a same-color edge means it is not bipartite.

---

## Question 85

**Question:** Consider a directed graph A→B→C→A. This graph:

**Choices:**
- **A.** is acyclic
- **B.** is bipartite
- **C.** has a sink
- **D.** contains a cycle

**Correct Answer:** contains a cycle

**Explanation:** A→B→C→A returns to A, forming a directed cycle (and it has no sink).

---

## Question 86

**Question:** True or false: In the adjacency-list linked implementation, each vertex's edges are typically stored in their own linked list.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Every vertex points to a linked list of its outgoing edges via `firstEdge`.

---

## Question 87

**Question:** What is the out-degree of a vertex whose edge linked list has 4 edge nodes?

**Choices:**
- **A.** 4
- **B.** 0
- **C.** 2
- **D.** depends on weights

**Correct Answer:** 4

**Explanation:** Each edge node is one outgoing edge, so 4 nodes mean out-degree 4.

---

## Question 88

**Question:** True or false: Adjacency-matrix edge insertion is O(1), while adjacency-list edge insertion at the head is also O(1).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Setting a matrix cell is O(1); prepending to a vertex's edge list is also O(1).

---

## Question 89

**Question:** Which is TRUE about finding all neighbours of a vertex?

**Choices:**
- **A.** both are O(1), making it the most efficient choice by design
- **B.** matrix: scan the whole row O(V); list: scan the edge list O
- **C.** both are O(V²)
- **D.** neither can list neighbours

**Correct Answer:** matrix: scan the whole row O(V); list: scan the edge list O

**Explanation:** A matrix must scan a full row of length V; a list only visits that vertex's actual edges.

---

## Question 90

**Question:** True or false: DFS and BFS can both determine whether two vertices are in the same connected component.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Either traversal from one vertex reveals whether the other is reachable, indicating the same component.

---

## Question 91

**Question:** What does this print (conceptually)?

```text
Graph: A→B (5), A→C (3)
getEdgeWeight(A, C)
```

**Choices:**
- **A.** 5
- **B.** 8
- **C.** 3
- **D.** -1

**Correct Answer:** 3

**Explanation:** The A→C edge has weight 3.

---

## Question 92

**Question:** For the same graph, `getEdgeWeight(B, A)` (no such edge) returns (per the "not found" convention):

**Choices:**
- **A.** 0, as a direct consequence of the structure's shape
- **B.** 5
- **C.** 3
- **D.** a sentinel/negative value (e.g., -1) indicating no edge

**Correct Answer:** a sentinel/negative value (e.g., -1) indicating no edge

**Explanation:** With no B→A edge, the method signals absence via a sentinel (consistent with the -1 "not found" pattern used elsewhere).

---

## Question 93

**Question:** True or false: An adjacency matrix easily supports weighted edges by storing the weight instead of 1 (using a sentinel like ∞/0 for no edge).

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Weighted matrices hold weights in cells and a chosen sentinel where no edge exists.

---

## Question 94

**Question:** Which is TRUE about the order BFS enqueues vertices?

**Choices:**
- **A.** FIFO: neighbours are enqueued and dequeued in arrival order
- **B.** LIFO, which holds even for empty or degenerate inputs
- **C.** by weight
- **D.** by vertex value

**Correct Answer:** FIFO: neighbours are enqueued and dequeued in arrival order

**Explanation:** The queue processes vertices first-in-first-out, producing level-order traversal.

---

## Question 95

**Question:** True or false: A graph can have parallel edges (multiple edges between the same pair) unless explicitly disallowed.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Multigraphs permit parallel edges; simple graphs disallow them—it depends on the graph's definition.

---

## Question 96

**Question:** Which representation makes "list all edges" most natural in O(V + E)?

**Choices:**
- **A.** adjacency matrix
- **B.** adjacency list
- **C.** a single integer
- **D.** a stack

**Correct Answer:** adjacency list

**Explanation:** Walking each vertex's edge list enumerates all edges in O(V + E); a matrix needs O(V²).

---

## Question 97

**Question:** True or false: In a directed graph, in-degree and out-degree of a vertex can differ.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** Incoming and outgoing edge counts are independent in directed graphs.

---

## Question 98

**Question:** What is the degree of vertex B in the undirected graph with edges {A-B, B-C, B-D}?

**Choices:**
- **A.** 1
- **B.** 2
- **C.** 3
- **D.** 0

**Correct Answer:** 3

**Explanation:** B connects to A, C, and D, giving degree 3.

---

## Question 99

**Question:** True or false: Traversal from a source in a weighted graph using plain BFS may NOT yield the minimum-weight path.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** True

**Explanation:** BFS minimizes edge count, not total weight; a fewer-edge path can have larger total weight than a longer one.

---

## Question 100

**Question:** Final synthesis: A social network with 5 million users but only ~200 million friend links (very sparse relative to 5M² potential) needs fast "who are my friends?" queries and shortest-connection (fewest intermediaries) searches. The best design and reason is:

**Choices:**
- **A.** An adjacency matrix, because edge lookup is O(1)
- **B.** A single sorted array of users with binary search
- **C.** DFS on an adjacency matrix for shortest paths, because the elements are always stored contiguously
- **D.** An adjacency list for O(V+E) memory plus BFS for fewest-intermediary shortest paths

**Correct Answer:** An adjacency list for O(V+E) memory plus BFS for fewest-intermediary shortest paths

**Explanation:** A 5M×5M matrix is astronomically wasteful for a sparse graph, so an adjacency list (O(V+E)) is the right storage, giving fast neighbour enumeration; BFS then finds fewest-intermediary (shortest unweighted) connections. DFS does not guarantee shortest paths, and a matrix is infeasible here.

---

### Answer distribution (self-check)
Correct answers span A/B/C/D and are frequently short factual options rather than the longest choice. True/False items alternate outcomes. Q74 deliberately embeds a common LIFO-order misread to test careful stack reasoning.
