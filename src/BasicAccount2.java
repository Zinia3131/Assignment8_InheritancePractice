public class BasicAccount2 extends BankAccount {
    private static final double OVERDRAFT_PENALTY = 30.0;

    // Constructor with initial balance
    public BasicAccount2(double initialBalance) {
        super(initialBalance);
    }

    // Overridden withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Overdraft! A penalty of $" + OVERDRAFT_PENALTY + " will be applied.");
            super.withdraw(amount); // Withdraw the amount
            super.withdraw(OVERDRAFT_PENALTY); // Apply the penalty
        } else {
            super.withdraw(amount); // Proceed with normal withdrawal
        }
    }
}
