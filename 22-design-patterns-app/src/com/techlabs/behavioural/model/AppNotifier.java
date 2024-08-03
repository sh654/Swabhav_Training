package com.techlabs.behavioural.model;

public class AppNotifier implements INotifier {
    @Override
    public void notify(Account account) {
        sendAppNotification(account);
    }

    private void sendAppNotification(Account account) {
        System.out.println("Sending App notification for account: " + account.getAccountNumber() +" You balance : "+account.getBalance());
    }
}
