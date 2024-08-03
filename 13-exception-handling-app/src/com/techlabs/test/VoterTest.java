package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {

	public static void main(String[] args)  { //throws AgeNotValidException
		Voter voter1 = null;
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter voter Id:");
		int voterId = scanner.nextInt();
		System.out.println("Enter your Name: ");
		String firstName = scanner.next();
		System.out.println("Enter your Name: ");
		String lastName = scanner.next();
		System.out.println("Enter your Age: ");
		int Age = scanner.nextInt();
		
		voter1 = new Voter(voterId, firstName, lastName, Age);
		System.out.println(voter1);
		} catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
		}
	}

}
