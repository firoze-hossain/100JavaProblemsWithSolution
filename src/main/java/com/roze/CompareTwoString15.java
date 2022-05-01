package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * How to compare 2 string in Java program
 */
public class CompareTwoString15 {

    public static void main(String[] args) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        str1 = sc.nextLine();
        System.out.println("Enter the second String: ");
        str2 = sc.nextLine();

        if (str1.compareTo(str2) > 0) {
            System.out.println("The first String is greater than second String");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("The first String is smaller than second String");
        } else {
            System.out.println("The two String is equal");
        }
    }

}
