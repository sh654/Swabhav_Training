package com.techlabs.test;

import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentAccount acc1 = new CurrentAccount(1223345666, "Sam Altman", 2000000,20);
		System.out.println(acc1);
		SavingsAccount acc2 = new SavingsAccount(1223445677, "Chris Woaks", 200000, 2000);
		System.out.println(acc2);
	}

}
