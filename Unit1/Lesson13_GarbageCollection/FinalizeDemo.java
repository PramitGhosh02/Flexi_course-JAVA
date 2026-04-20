class Resource {
    @Override
    protected void finalize() {
        System.out.println("Resource cleaned up by GC.");
    }
}
public class FinalizeDemo {
    public static void main(String[] args) {
        Resource r = new Resource();
        r = null; // Eligible for GC
        System.gc(); // Suggest Collection (Not guaranteed)
    }
}
