package java_hw_4.Task_2;

public class BankAccount {

    public int accountNumber;
    public String name;
    private int balance;

    public BankAccount(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amount) {
        if (amount >= 100000) {
            System.out.println("Limit exceeded");
        } else if (amount > balance) {
            System.out.println("Not enough money on your account");
            System.out.println(balance);
        } else if (amount > 0) {
            balance -= amount;
            System.out.println(balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}





