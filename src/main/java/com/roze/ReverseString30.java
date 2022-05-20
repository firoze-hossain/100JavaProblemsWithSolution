package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Print reverse string in java Program
 */
public class ReverseString30 {

    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        original = sc.nextLine();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);

        }
        System.out.println("Reverse String is: " + reverse);

    }

}
