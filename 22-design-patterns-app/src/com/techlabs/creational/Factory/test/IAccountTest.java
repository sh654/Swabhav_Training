package com.techlabs.creational.Factory.test;

import com.techlabs.creational.Factory.model.AccountFactory;
import com.techlabs.creational.Factory.model.IAccount;

import com.techlabs.creational.Factory.model.AccountTypes;

public class IAccountTest {
    public static void main(String[] args) {
        // Create a Savings Account
        IAccount savingsAccount = AccountFactory.makeAccount(AccountTypes.SAVINGSACCOUNT);
        savingsAccount.credit(1000);
       
        savingsAccount.debit(500);
       

        // Create a Current Account
        IAccount currentAccount = AccountFactory.makeAccount(AccountTypes.CURRENTACCOUNT);
        currentAccount.credit(2000);
       
        currentAccount.debit(1500);
        
//        implemet min balance and draft limit using same approach 
        
    }
}
