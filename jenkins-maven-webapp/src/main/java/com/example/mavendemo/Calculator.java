package com.example.mavendemo;

/**
 * Simple Calculator Class
 * 
 * This class provides basic arithmetic operations.
 * It's used to demonstrate unit testing with JUnit.
 */
public class Calculator {
    
    /**
     * Adds two integers
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts second number from first
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplies two integers
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divides first number by second
     * @param a Dividend
     * @param b Divisor
     * @return Quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}