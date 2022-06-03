package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Check Given String is palindrome or Not in java Program
 */
public class Palindrome31_2 {

    public static void main(String[] args) {
        String inputString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String: ");
        inputString = sc.nextLine();
        int length = inputString.length();
        int begin, middle, end, i;
        begin = 0;
        end = length - 1;
        middle = (begin + end) / 2;
        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;

            } else {
                break;
            }

        }
        if (i == middle + 1) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }

    }
}
