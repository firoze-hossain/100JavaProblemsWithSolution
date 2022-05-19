package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Find All substring of string in java Program
 */
public class SubstringOfString29 {

    public static void main(String[] args) {
        int i, j, length;
        String str, sub;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print it's substring: ");
        str = sc.nextLine();

        length = str.length();
        System.out.println("The substrings of \"" + str + "\"+ are: ");
        for (i = 0; i < length; i++) {
            for (j = 1; j <= length - i; j++) {
                sub = str.substring(i, i + j);
                System.out.println(sub);
            }
        }
    }

}
