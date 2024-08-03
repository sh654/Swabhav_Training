// File: FactorialTest.java
package com.techlabs.test;

import com.techlabs.model.IFactorial;

public class FactorialTest {

    public static void main(String[] args) {
        double input = 5;

        // Define the factorial computation using a lambda expression
        IFactorial factorial = (double input) -> {
            double fact = 1;
            for (double n = 1; n <= number; n++) {
                fact *= n;
            }
            return fact;
        };

        // Compute the factorial and print the result
        double result = factorial.compute(input);
        System.out.println("Factorial of " + input + " is " + result);

        // Call the display method
        display(factorial, input);
    }

    public static void display(IFactorial factorial, double input) {
        double result = factorial.compute(input);
        System.out.println("Factorial of " + input + " is " + result);
    }
}
