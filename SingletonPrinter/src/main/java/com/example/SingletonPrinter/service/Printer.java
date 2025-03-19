package com.example.singletonprinter.service;

import org.springframework.stereotype.Service;

@Service  // Marks this class as a Singleton Bean
public class Printer {

    // Constructor to indicate instance creation
    public Printer() {
        System.out.println("Printer instance created.");
    }

    // Method to print messages
    public void printMessage(String message) {
        System.out.println("Printing: " + message);
    }
}
