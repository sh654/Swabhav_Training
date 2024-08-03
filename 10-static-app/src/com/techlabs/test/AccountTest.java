package com.techlabs.test;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account(0, null, 0);
		account1.display();
		
		System.out.println("Total Account created : "+ account1.getCount());
	}

}
