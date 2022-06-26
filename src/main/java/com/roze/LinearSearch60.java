package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Linear search Program in java
 */
public class LinearSearch60 {

    public static void main(String[] args) {
        int num, i, search, array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        num = sc.nextInt();
        array = new int[num];
        System.out.println("Enter number of " + num + " integers: ");

        for (i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter number to find out: ");
        search = sc.nextInt();
        for (i = 0; i < num; i++) {
            if (array[i] == search) {
                System.out.println(search + " is found at location " + (i + 1));
                break;
            }
        }
        if (i == num) {
            System.out.println(search + " not found!!");

        }

    }

}
