package com.techlabs.behavioural.test;

import java.util.Scanner;

import com.techlabs.behavioural.model.Account;
import com.techlabs.behavioural.model.AppNotifier;
import com.techlabs.behavioural.model.EmailNotifier;
import com.techlabs.behavioural.model.SMSNotifier;
import com.techlabs.behavioural.model.InsufficientFundsException;


public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Account object
        Account account = new Account("John Doe", 1234678119, 10000.0);

        // Ask user which notifications they want
        System.out.println("Which notifications would you like to receive? (1: SMS, 2: Email, 3: Whatsapp, 4: All)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                account.registerNotifier(new SMSNotifier());
                break;
            case 2:
                account.registerNotifier(new EmailNotifier());
                break;
            case 3:
                account.registerNotifier(new AppNotifier());
                break;
            case 4:
                account.registerNotifier(new SMSNotifier());
                account.registerNotifier(new EmailNotifier());
                account.registerNotifier(new AppNotifier());
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Test deposit and withdrawal
        try {
            account.credit(500);
            System.out.println();
            account.debit(200);
            System.out.println();
            account.debit(15000); // This should raise an InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
