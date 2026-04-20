class Account {
    private int balance;
    public void setBalance(int amount) {
        if(amount >= 0) balance = amount;
    }
    public int getBalance() { return balance; }
}
public class DataValidation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(-50); // Ignored
        acc.setBalance(100);
        System.out.println(acc.getBalance());
    }
}
