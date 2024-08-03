
package com.aurionpro.com;

public class CorrectProducer implements Runnable {
    CorrectQues q;

    public CorrectProducer(CorrectQues q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}