public class MainMethodVariations {
    // The arguments array allows reading command line input
    public static void main(String... args) { // Alternative array syntax
        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        } else {
            System.out.println("No arguments passed.");
        }
    }
}
