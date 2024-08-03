package com.techlabs.test;
 
import java.util.Scanner;
 
import com.techlabs.exceptions.InsufficientBalanceException;
import com.techlabs.model.Account;
 
public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter account holder name: ");
			String name = scanner.next();
			System.out.println("Enter account initial balance: ");
			double balance = scanner.nextDouble();
			Account account = new Account(name, balance);
			accountTransaction(scanner, account);
			account.toString();
		}catch(InsufficientBalanceException exception) {
			System.out.println(exception.getMessage());
		}catch(Exception exception) {
			System.out.println("Enter valid input!");
		}finally {
			scanner.close();
		}
 
	}
 
	private static void accountTransaction(Scanner scanner, Account bankAccount) {
		System.out.println("Enter the choice! \n 1. check balance \n 2. credit \n 3. debit \n 4.Exit");
		int choice = scanner.nextInt();
		double amount;
		switch (choice) {
		case 1:
			System.out.println("Your acoount has : " + bankAccount.getBalance());
			break;
		case 2:
			System.out.println("Enter the amount to credit: ");
			amount = scanner.nextDouble();
			bankAccount.credit(amount);
			System.out.println("Your acoount has : " + bankAccount.getBalance());
			break;
		case 3:
			System.out.println("Enter the amount to debit: ");
			amount = scanner.nextDouble();
			bankAccount.debit(amount);
			System.out.println("Your acoount has : " + bankAccount.getBalance());
		case 4:
			System.out.println("Thank you for using app, Good Bye!");
			return;
		default:
			break;
		}
		AccountTest.accountTransaction(scanner, bankAccount);
	}
}