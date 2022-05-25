package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze
 * Check Given Number is palindrome or Not in java Program
 */
public class Palindrome31_1 {

    public static void main(String[] args) {
        int number, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer Number to check the number is plaindrome or not: ");
        number = sc.nextInt();
        int temp = number;
        while (number != 0) {
            int remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }

        if (temp == reverse) {
            System.out.println("The number is palindrome.");
        } else {
            System.out.println("The number is not palindrome.");
        }

    }

}
