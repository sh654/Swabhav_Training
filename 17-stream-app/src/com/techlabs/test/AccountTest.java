package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Account> accounts = Arrays.asList(
				new Account(1201202323, "Shivam", 35000),
				new Account(1201202323, "Yuvraj", 135000),
				new Account(1201202323, "Gautam", 25000),
				new Account(1201202323, "Shubham", 5000),
				new Account(1201202323, "Kunal", 75000));
		
		System.out.println("Account with Minimum Balance: ");
		Optional<Account> minBalance = accounts.stream().min(Comparator.comparingDouble(Account :: getBalance));
		if(minBalance.isPresent())
			System.out.println(minBalance);
		
		System.out.println("Account with Max Balance: ");
		Optional<Account> maxBalance = accounts.stream().max(Comparator.comparingDouble(Account :: getBalance));
		if(maxBalance.isPresent())	
			System.out.println(maxBalance);
		
		Optional<Account> maxBalance2 = accounts.stream().max( (account1, account2 )-> account1.getBalance() - account2.getBalance());
		
		
		List<String> nameGreaterThanSix = accounts.stream().map(Account :: getAccountName).filter(name -> name.length()>6).collect(Collectors.toList());
		System.out.println(nameGreaterThanSix);
		
		double totalBalance = accounts.stream().mapToDouble(Account::getBalance).sum();
		System.out.println("Total Amount in all Accounts : "+ totalBalance);
		
		
		
	}

}
