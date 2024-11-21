public class CheckingAccount2 {
    private double balance;
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 1.0;

    // Constructor
    public CheckingAccount2(double initialBalance) {
        this.balance = initialBalance;
        this.transactionCount = 0;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        transactionCount++;
        applyTransactionFee();
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionCount++;
            applyTransactionFee();
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Helper method to apply fees
    private void applyTransactionFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            balance -= TRANSACTION_FEE;
            System.out.println("Transaction fee of $1 applied.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Reset transaction count for a new month
    public void resetTransactions() {
        transactionCount = 0;
    }
}

