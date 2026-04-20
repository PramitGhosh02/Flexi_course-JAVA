public class FloatingNaN {
    public static void main(String[] args) {
        System.out.println("Divide by zero: " + (5.0 / 0.0)); // Infinity
        System.out.println("Zero by zero: " + (0.0 / 0.0)); // NaN
    }
}
