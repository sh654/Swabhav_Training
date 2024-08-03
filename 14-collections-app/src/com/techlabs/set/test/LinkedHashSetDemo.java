package com.techlabs.set.test;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String args[]) {
        
        LinkedHashSet<String> linkset = new LinkedHashSet<>();
        
        linkset.add("Kaivalya");
        linkset.add("Mrunalini");
        linkset.add("Shivam");
        linkset.add("Chirag");
        linkset.add("Chirag"); // Duplication not allowed
        
        System.out.println(linkset);
        
    }
}
