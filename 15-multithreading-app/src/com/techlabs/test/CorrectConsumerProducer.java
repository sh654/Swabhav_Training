
package com.techlabs.test;

import com.aurionpro.com.CorrectConsumer;
import com.aurionpro.com.CorrectProducer;
import com.aurionpro.com.CorrectQues;

public class CorrectConsumerProducer {
    public static void main(String[] args) {
        CorrectQues q = new CorrectQues();
        new CorrectProducer(q);
        new CorrectConsumer(q);
        System.out.println("Press Control-C to stop Method");
}
}
