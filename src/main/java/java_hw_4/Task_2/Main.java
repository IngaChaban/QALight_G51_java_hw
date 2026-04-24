package java_hw_4.Task_2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(234561, "Inga", 190000);

        account.getBalance();


        account.deposit(6666);
        account.deposit(0);
        account.withdraw(100000);
        account.withdraw(-9);
        account.withdraw(99999);


    }

}
