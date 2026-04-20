public class ExecuteFlow {
    // Static execution block runs before main
    static {
        System.out.println("1. Static initialization block runs when class loads.");
    }
    
    public static void main(String[] args) {
        System.out.println("2. Main method begins execution.");
    }
}
