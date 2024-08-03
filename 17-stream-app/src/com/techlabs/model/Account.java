package com.techlabs.model;

public class Account {
    private long accountNo;
    private String accountName;
    private double balance;

    // Constructor
    public Account(long accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Getters
    public long getAccountNo() {
        return accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Account{" +
               "accountNo='" + accountNo + '\'' +
               ", accountName='" + accountName + '\'' +
               ", balance=" + balance +
               '}';
    }
}

