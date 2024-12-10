import java.util.ArrayList;
import java.util.List;



    class BankAccount {

    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    // Create a new account
    public void createAccount(String accountNumber, double initialBalance) {
        accounts.add(new BankAccount(accountNumber, initialBalance));
    }

    // Transfer money between accounts
    public void transfer(String fromAccount, String toAccount, double amount) {
        BankAccount from = findAccount(fromAccount);
        BankAccount to = findAccount(toAccount);

        if (from != null && to != null && from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
        }
    }

    // Find account by account number
    private BankAccount findAccount(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }
}
