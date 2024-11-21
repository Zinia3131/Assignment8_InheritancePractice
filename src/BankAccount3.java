public class BankAccount3 {
    private double balance;

    // Default Constructor
    public BankAccount3() {
        this.balance = 0.0;
    }

    // Constructor with initial balance
    public BankAccount3(double initialBalance) {
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
        balance -= amount;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}
