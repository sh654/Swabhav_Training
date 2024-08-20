package com.techlabs.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {
        // Load Spring context from configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // Retrieve the Computer bean from the context
        Computer computer = context.getBean(Computer.class);

        // Print the Computer bean with injected Harddisk details
        System.out.println(computer);
    }
}
