package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Binary search Program in java
 */
public class BinarySearch61 {

    public static void main(String[] args) {
        int i, first, last, middle, num, search, array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        num = sc.nextInt();
        array = new int[num];

        System.out.println("Enter " + num + " integers");
        for (i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter value to find: ");
        search = sc.nextInt();

        first = 0;
        last = num - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                System.out.println(search + " is found at location " + (middle + 1));
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;

        }

        if (first > last) {
            System.out.println(search + " is not present in the list\n");
        }

    }

}
