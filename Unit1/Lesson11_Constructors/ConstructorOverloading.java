class Box {
    int size;
    Box() { size = 10; }
    Box(int s) { size = s; }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(50);
        System.out.println(b1.size + " and " + b2.size);
    }
}
