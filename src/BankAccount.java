public class BankAccount {
    private double balance;

    // Default Constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Constructor with initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        balance -= amount; // Basic withdrawal logic
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
