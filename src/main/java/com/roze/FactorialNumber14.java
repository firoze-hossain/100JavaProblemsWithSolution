package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Find factorial for given no Program in Java
 */
public class FactorialNumber14 {

    public static void main(String[] args) {
        int num, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to calculate it's factorial: ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("The number must not be negative");
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of " + num + " is =" + fact);
        }
    }

}
