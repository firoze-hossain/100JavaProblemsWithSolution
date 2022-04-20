package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze How to get Using input using Scanner Program in java
 */
public class UsingScanner {

    public static void main(String[] args) {
        int a;
        float b;
        String s;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an String: ");
        s = sc.nextLine();
        System.out.println("The string is: " + s);
        
        System.out.println("Enter an interger: ");
        a = sc.nextInt();
        System.out.println("The integer is: " + a);

        System.out.println("Enter a float number: ");
        b = sc.nextFloat();
        System.out.println("The float number is: " + b);

    }
}
