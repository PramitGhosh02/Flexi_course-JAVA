class Node {}
public class NullingReferences {
    public static void main(String[] args) {
        Node n = new Node();
        n = null; // Unlink reference
    }
}
