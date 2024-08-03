package com.techlabs.creational.AbstractFactory.test;

import com.techlabs.creational.AbstractFactory.model.Accountfactory;
import com.techlabs.creational.AbstractFactory.model.CurrentFactory;
import com.techlabs.creational.AbstractFactory.model.SavingsFactory;
import com.techlabs.creational.AbstractFactory.model.IAccount;

public class AccountFactoryTest {

	public static void main(String args[]) {
		
		Accountfactory savingsFactory = new SavingsFactory();
		IAccount savings = savingsFactory.makeAccounts("Shivam", 1201202323, 45000, 10000);
		savings.credit(1500);
		savings.debit(6200);
		
		Accountfactory currentFactory = new CurrentFactory();
		IAccount currents = currentFactory.makeAccounts("Shubham", 1201202424, 47890, 6000);
		currents.credit(2300);
		currents.credit(1200);
	}
}
