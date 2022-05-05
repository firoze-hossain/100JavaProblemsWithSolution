package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Print Multiplication table Program in java
 */
public class MultiplicationTable25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to print it's multiplication table: ");

        int num = sc.nextInt();

        System.out.println("Multiplication table of " + num + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }

}
