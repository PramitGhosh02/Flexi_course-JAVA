public class SystemGC {
    public static void main(String[] args) {
        // Requesting Garbage Collection explicitly
        System.gc();
        System.out.println("Requested GC.");
    }
}
