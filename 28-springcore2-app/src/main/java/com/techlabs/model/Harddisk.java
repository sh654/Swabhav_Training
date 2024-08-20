package com.techlabs.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Harddisk {

    @Value("10")
    private int capacity;

    // Default constructor
    public Harddisk() {
        System.out.println("This is harddisk");
    }

    // Getters and setters
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Harddisk [capacity=" + capacity + "]";
    }
}
