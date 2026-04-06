public class BankAccount implements Account {
    // Instance variable
    private int balance;

    // Constructor
    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Implementation of the deposit method
    @Override
    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    // Implementation of the withdraw method
    @Override
    public boolean withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}