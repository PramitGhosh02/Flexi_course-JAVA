public class ExpressionPromotion {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        // Result is promoted to int
        int result = b + s;
        System.out.println("Promoted result: " + result);
    }
}
