package com.roze;

/**
 *
 * @author firoze
 * How to Find Factorial using Recursion Program in java
 */
public class FactorialUsingRecursion99 {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 6: " + factorial(6));
    }
    
}
