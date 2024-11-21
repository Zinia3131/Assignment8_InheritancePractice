public class BankAccountTest2 {
    public static void main(String[] args) {

        BasicAccount account = new BasicAccount(500.0);

        System.out.println("Initial Balance: $" + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawing $200: $" + account.getBalance());

        // Overdraft withdrawal
        account.withdraw(400.0);
        System.out.println("Balance after attempting to withdraw $400 (with penalty): $" + account.getBalance());

        // Deposit to recover from overdraft
        account.deposit(100.0);
        System.out.println("Balance after depositing $100: $" + account.getBalance());
    }
}

