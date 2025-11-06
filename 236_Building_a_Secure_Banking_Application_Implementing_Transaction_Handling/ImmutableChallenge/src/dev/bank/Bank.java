package dev.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    public final int routingNumber;
    private long lastTransactionId = 1;
    private final Map<String, BankCustomer> customers;

    public Bank(int routingNumber) {
        this.routingNumber = routingNumber;
        customers = new HashMap<>();
    }

    public BankCustomer getCustomer(String id){
        return customers.get(id);
    }

    public void addCustomer(String name, double checkingInitialDeposit, double savingsInitialDesposit){

        BankCustomer customer = new BankCustomer(
          name, checkingInitialDeposit, savingsInitialDesposit
        );

        customers.put(customer.getCustomerId(), customer);
    }

    public  boolean doTransactions(String id, BankAccount.AccountType accountType, double amount){
        BankCustomer customer = customers.get(id);
        if (customer != null){
            BankAccount account = customer.getAccount(accountType);
            if (account != null){
                if ((account.getBalance() + amount) < 0){
                    System.out.println("Insufficient funds");
                } else {
                    account.commitTransaction(
                        routingNumber, lastTransactionId++, id, amount
                    );
                    return  true;
                }
            }
        } else {
            System.out.println("Invalid customer id");
        }
        return false;
    }
}
