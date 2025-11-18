package com.example.mavendemo;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main Application Class
 * 
 * This class demonstrates a simple Maven application that uses:
 * - Apache Commons Lang for string utilities
 * - SLF4J/Logback for logging
 * 
 * Run this application using:
 *   mvn exec:java
 * Or with explicit mainClass (Windows PowerShell):
 *   mvn exec:java "-Dexec.mainClass=com.example.mavendemo.MavenDemoApp"
 * Or after building:
 *   mvn package
 *   java -jar target/maven-sample-project-1.0.0-SNAPSHOT.jar
 */
public class MavenDemoApp {
    
    // Logger instance using SLF4J (dependency from pom.xml)
    private static final Logger logger = LoggerFactory.getLogger(MavenDemoApp.class);
    
    /**
     * Main method - Entry point of the application
     */
    public static void main(String[] args) {
        logger.info("Starting Maven Demo Application");
        
        // Demonstrate using Apache Commons Lang (dependency from pom.xml)
        String message = "Hello, Maven World!";
        String reversed = StringUtils.reverse(message);
        boolean isEmpty = StringUtils.isEmpty(message);
        
        System.out.println("========================================");
        System.out.println("Maven Sample Project Demo");
        System.out.println("========================================");
        System.out.println("Original Message: " + message);
        System.out.println("Reversed Message: " + reversed);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("========================================");
        
        // Demonstrate Calculator class
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 20);
        int product = calculator.multiply(5, 6);
        
        System.out.println("Calculator Demo:");
        System.out.println("10 + 20 = " + sum);
        System.out.println("5 * 6 = " + product);
        System.out.println("========================================");
        
        logger.info("Application completed successfully");
    }
}