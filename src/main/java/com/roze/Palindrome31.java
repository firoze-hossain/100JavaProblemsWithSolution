package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze
 * Check Given String is palindrome or Not in java Program
 */
public class Palindrome31 {

    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check it is palindrome or not: ");
        original = sc.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("This String is plaindrome.");
        } else {

            System.out.println("This String is not palindrome.");

        }
    }

}
