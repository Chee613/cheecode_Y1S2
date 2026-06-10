public class L8Q3 {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        System.out.println("add directed edge A-B: " + graph.addEdge("A", "B"));
        System.out.println("add undirected edge B-C: " + graph.addUndirectedEdge("B", "C"));
        graph.printEdges();
    }

    private static class Graph<T extends Comparable<T>> {
        private Vertex<T> head;
        private int size;

        public boolean addVertex(T vertexInfo) {
            if (hasVertex(vertexInfo)) {
                return false;
            }

            Vertex<T> newVertex = new Vertex<>(vertexInfo);
            if (head == null) {
                head = newVertex;
            } else {
                Vertex<T> current = head;
                while (current.nextVertex != null) {
                    current = current.nextVertex;
                }
                current.nextVertex = newVertex;
            }

            size++;
            return true;
        }

        public boolean addEdge(T source, T destination) {
            Vertex<T> sourceVertex = findVertex(source);
            Vertex<T> destinationVertex = findVertex(destination);

            if (sourceVertex == null || destinationVertex == null || hasEdge(source, destination)) {
                return false;
            }

            sourceVertex.firstEdge = new Edge<>(destinationVertex, sourceVertex.firstEdge);
            sourceVertex.outdeg++;
            destinationVertex.indeg++;
            return true;
        }

        public boolean addUndirectedEdge(T source, T destination) {
            if (source.compareTo(destination) == 0) {
                return addEdge(source, destination);
            }

            if (findVertex(source) == null || findVertex(destination) == null) {
                return false;
            }

            if (hasEdge(source, destination) || hasEdge(destination, source)) {
                return false;
            }

            return addEdge(source, destination) && addEdge(destination, source);
        }

        public boolean hasEdge(T source, T destination) {
            Vertex<T> sourceVertex = findVertex(source);
            if (sourceVertex == null || findVertex(destination) == null) {
                return false;
            }

            Edge<T> currentEdge = sourceVertex.firstEdge;
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
            Vertex<T> currentVertex = head;
            while (currentVertex != null) {
                System.out.print("# " + currentVertex.vertexInfo + " : ");
                Edge<T> currentEdge = currentVertex.firstEdge;
                while (currentEdge != null) {
                    System.out.print("[" + currentVertex.vertexInfo + ", "
                            + currentEdge.toVertex.vertexInfo + "] ");
                    currentEdge = currentEdge.nextEdge;
                }
                System.out.println();
                currentVertex = currentVertex.nextVertex;
            }
        }

        private Vertex<T> findVertex(T vertexInfo) {
            Vertex<T> current = head;
            while (current != null) {
                if (current.vertexInfo.compareTo(vertexInfo) == 0) {
                    return current;
                }
                current = current.nextVertex;
            }
            return null;
        }
    }

    private static class Vertex<T> {
        private final T vertexInfo;
        private int indeg;
        private int outdeg;
        private Vertex<T> nextVertex;
        private Edge<T> firstEdge;

        Vertex(T vertexInfo) {
            this.vertexInfo = vertexInfo;
        }
    }

    private static class Edge<T> {
        private final Vertex<T> toVertex;
        private Edge<T> nextEdge;

        Edge(Vertex<T> toVertex, Edge<T> nextEdge) {
            this.toVertex = toVertex;
            this.nextEdge = nextEdge;
        }
    }
}
