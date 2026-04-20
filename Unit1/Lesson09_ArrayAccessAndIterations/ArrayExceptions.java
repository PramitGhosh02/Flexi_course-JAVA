public class ArrayExceptions {
    public static void main(String[] args) {
        int[] arr = {1};
        try {
            System.out.println(arr[5]); // Exception!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught out of bounds exception.");
        }
    }
}
