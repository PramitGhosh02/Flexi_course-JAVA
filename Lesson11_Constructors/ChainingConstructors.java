class Chain {
    Chain() {
        this(5); // Calls parameterized constructor
        System.out.println("Default");
    }
    Chain(int x) {
        System.out.println("Param: " + x);
    }
}
public class ChainingConstructors {
    public static void main(String[] args) {
        new Chain();
    }
}
