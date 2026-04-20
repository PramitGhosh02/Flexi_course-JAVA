public class VariableScopes {
    int instanceVar = 10;
    static int classVar = 20;
    
    public static void main(String[] args) {
        int localVar = 30; // Exists only in main
        System.out.println("Local: " + localVar);
    }
}
