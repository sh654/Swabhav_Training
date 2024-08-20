package com.techlabs.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    @Value("apple")
    private String name;

    @Autowired
    private Harddisk disk;

    // Default constructor
    public Computer() {
        System.out.println("This is computer");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Harddisk getDisk() {
        return disk;
    }

    public void setDisk(Harddisk disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer [name=" + name + ", disk=" + disk + "]";
    }
}
