package com.techlabs.model;

public class Harddisk {

    private int capacity;

    // Public constructor for Spring to use
    public Harddisk(int capacity) {
        this.capacity = capacity;
    }

    // Default constructor
    public Harddisk() {}

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
