package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * How to check Odd and Even Number in java.
 */
public class EvenOrOdd13 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to check if number is even or odd: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }

}
