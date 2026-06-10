public class L8Q1 {
    public static void main(String[] args) {
        WeightedGraph<String, Integer> graph = new WeightedGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        System.out.println("add undirected edge A-B: " + graph.addUndirectedEdge("A", "B", 10));
        System.out.println("has edge A-B: " + graph.hasEdge("A", "B"));
        System.out.println("has edge B-A: " + graph.hasEdge("B", "A"));
        graph.printEdges();
    }

    private static class WeightedGraph<T extends Comparable<T>, N extends Comparable<N>> {
        private Vertex<T, N> head;
        private int size;

        public boolean addVertex(T vertexInfo) {
            if (hasVertex(vertexInfo)) {
                return false;
            }

            Vertex<T, N> newVertex = new Vertex<>(vertexInfo);
            if (head == null) {
                head = newVertex;
            } else {
                Vertex<T, N> current = head;
                while (current.nextVertex != null) {
                    current = current.nextVertex;
                }
                current.nextVertex = newVertex;
            }

            size++;
            return true;
        }

        public boolean addEdge(T source, T destination, N weight) {
            Vertex<T, N> sourceVertex = findVertex(source);
            Vertex<T, N> destinationVertex = findVertex(destination);

            if (sourceVertex == null || destinationVertex == null || hasEdge(source, destination)) {
                return false;
            }

            sourceVertex.firstEdge = new Edge<>(destinationVertex, weight, sourceVertex.firstEdge);
            sourceVertex.outdeg++;
            destinationVertex.indeg++;
            return true;
        }

        public boolean addUndirectedEdge(T source, T destination, N weight) {
            if (source.compareTo(destination) == 0) {
                return addEdge(source, destination, weight);
            }

            if (findVertex(source) == null || findVertex(destination) == null) {
                return false;
            }

            if (hasEdge(source, destination) || hasEdge(destination, source)) {
                return false;
            }

            return addEdge(source, destination, weight) && addEdge(destination, source, weight);
        }

        public boolean hasEdge(T source, T destination) {
            Vertex<T, N> sourceVertex = findVertex(source);
            if (sourceVertex == null || findVertex(destination) == null) {
                return false;
            }

            Edge<T, N> currentEdge = sourceVertex.firstEdge;
            while (currentEdge != null) {
                if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0) {
                    return true;
                }
                currentEdge = currentEdge.nextEdge;
            }
            return false;
        }

        public boolean hasVertex(T vertexInfo) {
            return findVertex(vertexInfo) != null;
        }

        public int getSize() {
            return size;
        }

        public void printEdges() {
            Vertex<T, N> currentVertex = head;
            while (currentVertex != null) {
                System.out.print("# " + currentVertex.vertexInfo + " : ");
                Edge<T, N> currentEdge = currentVertex.firstEdge;
                while (currentEdge != null) {
                    System.out.print("[" + currentVertex.vertexInfo + ", "
                            + currentEdge.toVertex.vertexInfo + ", "
                            + currentEdge.weight + "] ");
                    currentEdge = currentEdge.nextEdge;
                }
                System.out.println();
                currentVertex = currentVertex.nextVertex;
            }
        }

        private Vertex<T, N> findVertex(T vertexInfo) {
            Vertex<T, N> current = head;
            while (current != null) {
                if (current.vertexInfo.compareTo(vertexInfo) == 0) {
                    return current;
                }
                current = current.nextVertex;
            }
            return null;
        }
    }

    private static class Vertex<T, N> {
        private final T vertexInfo;
        private int indeg;
        private int outdeg;
        private Vertex<T, N> nextVertex;
        private Edge<T, N> firstEdge;

        Vertex(T vertexInfo) {
            this.vertexInfo = vertexInfo;
        }
    }

    private static class Edge<T, N> {
        private final Vertex<T, N> toVertex;
        private final N weight;
        private Edge<T, N> nextEdge;

        Edge(Vertex<T, N> toVertex, N weight, Edge<T, N> nextEdge) {
            this.toVertex = toVertex;
            this.weight = weight;
            this.nextEdge = nextEdge;
        }
    }
}
