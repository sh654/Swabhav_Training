package com.techlabs.creational.Factory.model;

public class CurrentAccount implements IAccount {
    private double balance;

    @Override
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        System.out.println("Savings Account Balance after debiting :" +balance);
    }

    @Override
    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        System.out.println("Savings Account Balance after Crediting :" +balance);
    }
}
