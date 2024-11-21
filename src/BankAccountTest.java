public class BankAccountTest {
    public static void main(String[] args) {
        // Create a BasicAccount object
        BasicAccount account = new BasicAccount(500.0);

        // Display initial balance
        System.out.println("Initial Balance: $" + account.getBalance());

        // Attempt to withdraw a valid amount
        account.withdraw(200.0);
        System.out.println("Balance after withdrawing $200: $" + account.getBalance());

        // Attempt to withdraw an amount exceeding the balance
        account.withdraw(400.0);
        System.out.println("Balance after attempting to withdraw $400: $" + account.getBalance());

        // Deposit some money
        account.deposit(100.0);
        System.out.println("Balance after depositing $100: $" + account.getBalance());
    }
}

