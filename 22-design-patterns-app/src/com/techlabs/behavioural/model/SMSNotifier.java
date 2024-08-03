package com.techlabs.behavioural.model;

public class SMSNotifier implements INotifier {
    @Override
    public void notify(Account account) {
        sendSMS(account);
    }

    private void sendSMS(Account account) {
        System.out.println("Sending SMS notification for account: " + account.getAccountNumber() +" You balance : "+account.getBalance());
    }
}
