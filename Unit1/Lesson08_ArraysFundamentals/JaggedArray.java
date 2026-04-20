public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = new int[2][];
        jagged[0] = new int[3];
        jagged[1] = new int[5]; // Different column lengths
        System.out.println("Jagged length [1]: " + jagged[1].length);
    }
}
