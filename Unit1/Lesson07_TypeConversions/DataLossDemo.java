public class DataLossDemo {
    public static void main(String[] args) {
        int outOfByteRange = 130;
        byte b = (byte) outOfByteRange; // Overflow, byte is -128 to 127
        System.out.println("Lost data byte: " + b); // Prints -126
    }
}
