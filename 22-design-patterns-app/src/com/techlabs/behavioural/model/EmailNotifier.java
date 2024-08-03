package com.techlabs.behavioural.model;

public class EmailNotifier implements INotifier {
    @Override
    public void notify(Account account) {
        sendEmail(account);
    }

    private void sendEmail(Account account) {
        System.out.println("Sending Email notification for account: " + account.getAccountNumber() +" You balance : "+account.getBalance());
    }
}
