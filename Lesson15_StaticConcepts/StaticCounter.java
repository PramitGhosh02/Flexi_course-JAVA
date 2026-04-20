class Tracked {
    static int instances = 0;
    Tracked() { instances++; }
}
public class StaticCounter {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) new Tracked();
        System.out.println("Created " + Tracked.instances + " objects");
    }
}
