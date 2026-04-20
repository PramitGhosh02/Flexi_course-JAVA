class AppConfig {
    static String dbUrl;
    static {
        dbUrl = "jdbc:mysql://localhost:3306/db"; // Initialize complex static vars
        System.out.println("Static block ran");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("URL: " + AppConfig.dbUrl);
    }
}
