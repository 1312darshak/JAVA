package bankingSystem;

public class Main {

	public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(500);
        CheckingAccount checking = new CheckingAccount(1000);

        Transaction transaction = new Transaction();

        System.out.println("Performing transactions on Savings Account:");
        transaction.performTransaction(savings, 200, true); // Deposit
        transaction.performTransaction(savings, 100, false); // Withdraw

        System.out.println("Performing transactions on Checking Account:");
        transaction.performTransaction(checking, 300, true); // Deposit
        transaction.performTransaction(checking, 150, false); // Withdraw

        System.out.println("Total number of accounts: " + Bank.getTotalAccounts());
    }

}
