class Factory {
    String product = "Item";
}

public class ReturningObjects {
    static Factory create() {
        return new Factory();
    }
    public static void main(String[] args) {
        Factory f = create();
        System.out.println("Received: " + f.product);
    }
}
