// Only one public class per file
public class MultipleClasses {
    public static void main(String[] args) {
        HelperClass helper = new HelperClass();
        helper.doHelp();
    }
}

// Non-public class in the same file
class HelperClass {
    void doHelp() {
        System.out.println("Helper class method executed.");
    }
}
