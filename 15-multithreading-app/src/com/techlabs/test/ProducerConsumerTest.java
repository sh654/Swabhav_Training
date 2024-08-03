package com.techlabs.test;

import com.aurionpro.com.Consumer;
import com.aurionpro.com.Producer;
import com.aurionpro.com.Q;

public class ProducerConsumerTest {
 public static void main(String[] args) {
  
  Q q = new Q();
  new Producer(q);
  new Consumer(q);
  System.out.println("Press Control-C to stop.");

 }
}