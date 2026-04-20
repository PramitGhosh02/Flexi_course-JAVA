public class ExplicitCasting {
    public static void main(String[] args) {
        double decimal = 100.99;
        int num = (int) decimal; // Manual narrowing
        System.out.println("Integer (truncated): " + num);
    }
}
