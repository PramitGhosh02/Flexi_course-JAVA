class Secret {
    private String msg = "Hidden";
    void peek() { System.out.println(msg); }
}
public class PrivateVariables {
    public static void main(String[] args) {
        new Secret().peek(); // msg cannot be accessed directly
    }
}
