public class BasicAccount extends BankAccount {
    // Constructor with initial balance
    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    // Overridden withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Withdrawal denied: Insufficient balance.");
        } else {
            super.withdraw(amount);
        }
    }
}
