class Shadow {
    int x = 1;
    void print(int x) {
        System.out.println("Local: " + x + ", Instance: " + this.x);
    }
}
public class Shadowing {
    public static void main(String[] args) {
        new Shadow().print(5);
    }
}
