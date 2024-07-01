package bankingSystem;

class CheckingAccount extends Account {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        Bank.incrementTotalAccounts();
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
