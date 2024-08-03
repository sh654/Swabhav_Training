package com.techlabs.test;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Using parameterized type
        ArrayList<String> list = new ArrayList<>();
        
        List<String> listL = new ArrayList<>();
        
        // Initializing list with integers
        List<Integer> integers = Arrays.asList(10, 20, 30, 40);
        
        listL.add("Chirag");
        listL.add("Shivam");
        listL.add("Neha");
        
        System.out.println("ListL: " + listL);
        
        // Using for loop on ListL
        System.out.println("Now using for loop on ListL:");
        for (int i = 0; i < listL.size(); i++) {
            System.out.println(listL.get(i));
        }
        
        // Using enhanced for loop on ListL
        System.out.println("Now using advanced for loop on ListL:");
        for (String name : listL) {
            System.out.println(name);
        }
        
        // Using Iterator on ListL
        Iterator<String> iterator = listL.iterator();
        System.out.println("Now using iterator on ListL:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Using ListIterator on ListL
        ListIterator<String> listIterator = listL.listIterator();
        System.out.println("Now using ListIterator on ListL:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        
        System.out.println("Now using ListIterator on ListL in reverse:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        
        // Operations on the list
        list.add("Chirag");
        list.add("Shivam");
        
        System.out.println("List after adding elements: " + list);
        
        list.add(1, "Suyash");
        System.out.println("List after adding element at index 1: " + list);
        
        // Since list is of type String, we cannot add Integer to it
        // list.add(5); // This line will cause a compile-time error
        
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);
        
        list.set(1, "Chirag Padiyal");
        System.out.println("List after setting element at index 1: " + list);
        
        list.add(null);
        System.out.println("List after adding null: " + list);
        
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
