public class CheckingAccountTest {
    public static void main(String[] args) {
        // Create a CheckingAccount object
        CheckingAccount account = new CheckingAccount(500.0);

        // Display initial balance
        System.out.println("Initial Balance: $" + account.getBalance());

        // Valid withdrawal
        account.withdraw(200.0);
        System.out.println("Balance after withdrawing $200: $" + account.getBalance());

        // First overdraft withdrawal
        account.withdraw(400.0);
        System.out.println("Balance after attempting to withdraw $400 (first overdraft): $" + account.getBalance());

        // Second overdraft withdrawal
        account.withdraw(200.0);
        System.out.println("Balance after attempting to withdraw $200 (subsequent overdraft): $" + account.getBalance());

        // Reset overdraft count (new month)
        account.resetOverdraftCount();

        // Another overdraft withdrawal after reset
        account.withdraw(100.0);
        System.out.println("Balance after overdraft (new month): $" + account.getBalance());
    }
}

