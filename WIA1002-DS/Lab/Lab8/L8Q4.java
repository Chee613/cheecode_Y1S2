import java.util.ArrayList;

public class L8Q4 {
    public static void main(String[] args) {
        Graph<String> graph1 = new Graph<>();
        String[] cities = {"Alor Setar", "Kuching", "Langkawi", "Melaka", "Penang", "Tawau"};

        for (String city : cities) {
            graph1.addVertex(city);
        }

        System.out.println("The number of vertices in graph1: " + graph1.getSize());

        System.out.println("Cities and their vertices:");
        for (int i = 0; i <= graph1.getSize() - 1; i++) {
            System.out.print(i + ": " + graph1.getVertex(i) + "\t");
        }
        System.out.println();
        System.out.println();

        System.out.println("Is Melaka in the Graph? " + graph1.hasVertex("Melaka"));
        System.out.println("Is Ipoh in the Graph? " + graph1.hasVertex("Ipoh"));
        System.out.println();

        System.out.println("Kuching at index: " + graph1.getIndex("Kuching"));
        System.out.println("Ipoh at index: " + graph1.getIndex("Ipoh"));
        System.out.println();

        System.out.println("add edge Kuching - Melaka: " + graph1.addEdge("Kuching", "Melaka"));
        System.out.println("add edge Langkawi - Penang: " + graph1.addEdge("Langkawi", "Penang"));
        System.out.println("add edge Melaka - Penang: " + graph1.addEdge("Melaka", "Penang"));
        System.out.println("add edge Alor Setar - Kuching: " + graph1.addEdge("Alor Setar", "Kuching"));
        System.out.println("add edge Tawau - Alor Setar: " + graph1.addEdge("Tawau", "Alor Setar"));
        System.out.println("add edge Kuching - Tawau: " + graph1.addEdge("Kuching", "Tawau"));
        System.out.println("add edge Penang - Alor Setar as undirected: "
                + graph1.addUndirectedEdge("Penang", "Alor Setar"));
        System.out.println("add edge Langkawi - Ipoh: " + graph1.addEdge("Langkawi", "Ipoh"));
        System.out.println();

        System.out.println("has edge from Kuching to Melaka? " + graph1.hasEdge("Kuching", "Melaka"));
        System.out.println("has edge from Melaka to Kuching? " + graph1.hasEdge("Melaka", "Kuching"));
        System.out.println("has edge from Alor Setar to Penang? " + graph1.hasEdge("Alor Setar", "Penang"));
        System.out.println("has edge from Penang to Alor Setar? " + graph1.hasEdge("Penang", "Alor Setar"));
        System.out.println();

        System.out.println("In and out degree for Kuching is "
                + graph1.getIndeg("Kuching") + " and " + graph1.getOutdeg("Kuching"));
        System.out.println("In and out degree for Penang is "
                + graph1.getIndeg("Penang") + " and " + graph1.getOutdeg("Penang"));
        System.out.println("In and out degree for Ipoh is "
                + graph1.getIndeg("Ipoh") + " and " + graph1.getOutdeg("Ipoh"));
        System.out.println();

        System.out.println("Neighbours of Kuching: " + graph1.getNeighbours("Kuching"));
        System.out.println("\nPrint Edges:");
        graph1.printEdges();
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

        public int getIndex(T vertexInfo) {
            Vertex<T> current = head;
            int pos = 0;
            while (current != null) {
                if (current.vertexInfo.compareTo(vertexInfo) == 0) {
                    return pos;
                }
                current = current.nextVertex;
                pos++;
            }
            return -1;
        }

        public T getVertex(int pos) {
            if (pos > size - 1 || pos < 0) {
                return null;
            }

            Vertex<T> current = head;
            for (int i = 0; i < pos; i++) {
                current = current.nextVertex;
            }
            return current.vertexInfo;
        }

        public int getIndeg(T vertexInfo) {
            Vertex<T> vertex = findVertex(vertexInfo);
            return vertex == null ? -1 : vertex.indeg;
        }

        public int getOutdeg(T vertexInfo) {
            Vertex<T> vertex = findVertex(vertexInfo);
            return vertex == null ? -1 : vertex.outdeg;
        }

        public ArrayList<T> getNeighbours(T vertexInfo) {
            Vertex<T> vertex = findVertex(vertexInfo);
            if (vertex == null) {
                return null;
            }

            ArrayList<T> list = new ArrayList<>();
            Edge<T> currentEdge = vertex.firstEdge;
            while (currentEdge != null) {
                list.add(currentEdge.toVertex.vertexInfo);
                currentEdge = currentEdge.nextEdge;
            }
            return list;
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
