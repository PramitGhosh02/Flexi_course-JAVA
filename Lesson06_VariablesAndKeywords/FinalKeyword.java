public class FinalKeyword {
    public static void main(String[] args) {
        final double PI = 3.14159;
        // PI = 3.14; // Compilation error, cannot reassign final variable
        System.out.println("Constant PI: " + PI);
    }
}
