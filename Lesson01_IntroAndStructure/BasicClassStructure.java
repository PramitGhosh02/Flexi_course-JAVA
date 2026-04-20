// File name must match public class name
public class BasicClassStructure {
    // Member variable (State)
    int demoVariable = 10;
    
    // Member method (Behavior)
    public void display() {
        System.out.println("Variable value: " + demoVariable);
    }
    
    public static void main(String[] args) {
        // Object creation to access non-static methods
        BasicClassStructure obj = new BasicClassStructure();
        obj.display();
    }
}
