// Class and fields must be final to be truly immutable
final class ImmutablePoint {
    private final int x, y;
    ImmutablePoint(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
}
public class ImmutableClass {
    public static void main(String[] args) {
        ImmutablePoint p = new ImmutablePoint(10, 20);
        System.out.println(p.getX());
    }
}
