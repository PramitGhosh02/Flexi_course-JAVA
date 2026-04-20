class Counter {
    static int globalCount = 0;
    Counter() { globalCount++; }
}
public class StaticVariable {
    public static void main(String[] args) {
        new Counter(); new Counter();
        System.out.println("Total: " + Counter.globalCount); // 2
    }
}
