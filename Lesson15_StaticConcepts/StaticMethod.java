class MathUtil {
    static int add(int a, int b) { return a + b; }
}
public class StaticMethod {
    public static void main(String[] args) {
        // Called on class, not object
        System.out.println("Add: " + MathUtil.add(5, 10)); 
    }
}
