package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze
 * While loop Program in java
 */
public class WhileLoop19 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        while ((num = sc.nextInt()) != 0) {
            System.out.println("You entered " + num);
            System.out.println("Enter an integer: ");
        }
        System.out.println("Out of Loop");

    }
}
