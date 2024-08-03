package com.techlabs.creational.Factory.model;

public class SavingsAccount implements IAccount {
    private double balance;

    @Override
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        System.out.println("Savings Account Balance after crediting: " + balance);
    }

    @Override
    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        System.out.println("Savings Account Balance after debiting :" +balance);
    }
}
