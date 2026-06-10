public class T8Q2 {
    private static final String[] VERTICES = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I"
    };

    // A 2D array is best represented using an adjacency matrix.
    private static final int[][] ADJACENCY_MATRIX = {
        {0, 0, 1, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 1, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public static void main(String[] args) {
        System.out.println("Using adjacency matrix because a 2D array stores row-column relationships.");
        printMatrix();
    }

    private static void printMatrix() {
        System.out.print("   ");
        for (String vertex : VERTICES) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        for (int row = 0; row < ADJACENCY_MATRIX.length; row++) {
            System.out.print(VERTICES[row] + ": ");
            for (int col = 0; col < ADJACENCY_MATRIX[row].length; col++) {
                System.out.print(ADJACENCY_MATRIX[row][col] + " ");
            }
            System.out.println();
        }
    }
}
