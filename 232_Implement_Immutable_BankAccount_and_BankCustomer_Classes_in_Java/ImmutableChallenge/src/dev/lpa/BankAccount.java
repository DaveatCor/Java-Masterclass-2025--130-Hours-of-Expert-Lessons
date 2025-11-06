package dev.lpa;

public class BankAccount {
    public enum AccountType {CHECKING, SAVING}

    private final AccountType accountType;

    private final double balance;

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(AccountType accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "%s %.2f".formatted(accountType, balance);
    }
}
