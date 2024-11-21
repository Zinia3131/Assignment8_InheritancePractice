public class TestCheckingAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(100);

        account.deposit(20); // Free
        account.deposit(30); // Free
        account.withdraw(50); // Free
        account.deposit(40); // Fee applied
        account.withdraw(10); // Fee applied

        System.out.println("Final balance: $" + account.getBalance());
    }
}
