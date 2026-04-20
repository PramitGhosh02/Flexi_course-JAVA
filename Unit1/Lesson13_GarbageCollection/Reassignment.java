class Ref {}
public class Reassignment {
    public static void main(String[] args) {
        Ref r1 = new Ref(); // Object 1
        Ref r2 = new Ref(); // Object 2
        r1 = r2; // Object 1 now eligible for GC
    }
}
