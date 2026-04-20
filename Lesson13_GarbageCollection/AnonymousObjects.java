class Temp {
    Temp() { System.out.println("Temp created"); }
}
public class AnonymousObjects {
    public static void main(String[] args) {
        new Temp(); // Immediately eligible for GC
    }
}
