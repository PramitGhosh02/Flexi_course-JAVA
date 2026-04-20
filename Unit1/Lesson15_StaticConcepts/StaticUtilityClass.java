// Cannot be instantiated, only static members
final class StringUtils {
    private StringUtils() {} // Prevent instantiation
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
public class StaticUtilityClass {
    public static void main(String[] args) {
        System.out.println("Is empty: " + StringUtils.isEmpty(""));
    }
}
