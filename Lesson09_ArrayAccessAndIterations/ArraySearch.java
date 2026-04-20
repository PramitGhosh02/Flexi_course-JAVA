public class ArraySearch {
    public static void main(String[] args) {
        int[] data = {15, 22, 8, 42};
        int target = 8;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                System.out.println("Found at index " + i);
            }
        }
    }
}
