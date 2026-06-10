import java.util.LinkedList;

public class T8Q3 {
    public static void main(String[] args) {
        String[] vertices = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        Graph graph = new Graph(vertices);

        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        graph.addEdge("C", "F");
        graph.addEdge("D", "E");
        graph.addEdge("E", "G");
        graph.addEdge("F", "H");
        graph.addEdge("G", "H");
        graph.addEdge("H", "I");

        System.out.println("Using adjacency list because linked-list representation stores neighbours as lists.");
        graph.printGraph();
    }

    private static class Graph {
        private final String[] vertices;
        private final LinkedList<String>[] adjacencyList;

        @SuppressWarnings("unchecked")
        Graph(String[] vertices) {
            this.vertices = vertices;
            this.adjacencyList = new LinkedList[vertices.length];

            for (int i = 0; i < vertices.length; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        void addEdge(String source, String destination) {
            int sourceIndex = getIndex(source);
            if (sourceIndex == -1 || getIndex(destination) == -1) {
                return;
            }
            adjacencyList[sourceIndex].add(destination);
        }

        void printGraph() {
            for (int i = 0; i < vertices.length; i++) {
                System.out.print(vertices[i] + ": ");

                if (adjacencyList[i].isEmpty()) {
                    System.out.println("-");
                } else {
                    System.out.println(String.join(", ", adjacencyList[i]));
                }
            }
        }

        private int getIndex(String vertex) {
            for (int i = 0; i < vertices.length; i++) {
                if (vertices[i].equals(vertex)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
