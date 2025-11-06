package dev.bank;

import dev.lpa.BankAccount;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {
    private static int lastCustomerId = 10_000_000;

    private final String name;
    private final int customerId;
    private final List<BankAccount> accounts = new ArrayList<>();

    public BankCustomer(String name, double checkingAccount, double savingsAmount) {
        this.name = name;
        this.customerId = lastCustomerId;
        accounts.add(new BankAccount(BankAccount.AccountType.CHECKING, checkingAccount));
        accounts.add(new BankAccount(BankAccount.AccountType.SAVING, savingsAmount));
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public String toString() {
        String[] accountStrings = new String[accounts.size()];
        Arrays.setAll(accountStrings, i -> accounts.get(i).toString());
        System.out.println("Test" + String.join("\n\t", accountStrings));
        return "Customer: %s (id:%015d)%n\t%s%n".formatted(
            name, customerId, String.join("\n\t", accountStrings)
        );
    }
}
