class ThisDemo {
    int value;
    ThisDemo(int value) {
        this.value = value; // Resolving shadowing
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        ThisDemo d = new ThisDemo(99);
        System.out.println("Value: " + d.value);
    }
}
