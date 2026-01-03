package com.corejava.exceptions;

// Demonstrates exception hierarchy, handling, throw vs throws
public class ExceptionDemo {

    // throws: declares exception to be handled by caller
    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b; // may cause ArithmeticException
        System.out.println("Result: " + result);
    }

    // throw: explicitly throws an exception
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Valid age");
    }

    public static void main(String[] args) {

        // Handling ArithmeticException using try-catch-finally
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes");
        }

        // Handling exception thrown using throw keyword
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Handling NullPointerException
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }
}
