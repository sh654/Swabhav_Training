package com.aurionpro.com;

public class CorrectConsumer implements Runnable {
    CorrectQues q;

    public CorrectConsumer(CorrectQues q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while(true) {
            q.get();
        }
    }
}