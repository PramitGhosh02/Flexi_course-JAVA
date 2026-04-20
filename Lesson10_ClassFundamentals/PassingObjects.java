class DataContainer { int val = 5; }

public class PassingObjects {
    static void modify(DataContainer d) {
        d.val = 10;
    }
    public static void main(String[] args) {
        DataContainer obj = new DataContainer();
        modify(obj);
        System.out.println("Modified val: " + obj.val); // Passes by reference value
    }
}
