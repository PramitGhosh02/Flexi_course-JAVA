public class MatrixIteration {
    public static void main(String[] args) {
        int[][] grid = {{1,2}, {3,4}};
        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
