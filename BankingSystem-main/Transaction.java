package bankingSystem;

class Transaction {
    private final double transactionFee = 2.50;

    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount + transactionFee);
        }
        account.displayBalance();
    }
}
