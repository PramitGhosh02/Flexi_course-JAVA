public class MethodCalling {
    void stepOne() {
        System.out.println("Step 1");
        stepTwo();
    }
    void stepTwo() {
        System.out.println("Step 2");
    }
    public static void main(String[] args) {
        new MethodCalling().stepOne();
    }
}
