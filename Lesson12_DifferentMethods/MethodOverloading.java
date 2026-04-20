public class MethodOverloading {
    static void show(int a) { System.out.println("Int: " + a); }
    static void show(String s) { System.out.println("String: " + s); }
    
    public static void main(String[] args) {
        show(10);
        show("Hello");
    }
}
