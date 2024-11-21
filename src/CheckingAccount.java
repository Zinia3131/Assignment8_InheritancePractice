public class CheckingAccount extends BankAccount {
    private int overdraftCount;
    private static final double FIRST_OVERDRAFT_PENALTY = 20.0;
    private static final double SUBSEQUENT_OVERDRAFT_PENALTY = 30.0;

    // Constructor with initial balance
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        this.overdraftCount = 0;
    }

    // Overridden withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            overdraftCount++;
            if (overdraftCount == 1) {
                System.out.println("First overdraft! A penalty of $" + FIRST_OVERDRAFT_PENALTY + " will be applied.");
                super.withdraw(amount + FIRST_OVERDRAFT_PENALTY);
            } else {
                System.out.println("Subsequent overdraft! A penalty of $" + SUBSEQUENT_OVERDRAFT_PENALTY + " will be applied.");
                super.withdraw(amount + SUBSEQUENT_OVERDRAFT_PENALTY);
            }
        } else {
            super.withdraw(amount); // Normal withdrawal
        }
    }

    // Method to reset overdraft count (to be called at the start of a new month)
    public void resetOverdraftCount() {
        overdraftCount = 0;
        System.out.println("Overdraft count has been reset for the new month.");
    }
}
