package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Bubble sort Program in java
 */
public class BubbleSort62 {

    public static void main(String[] args) {
        int i, j, num, swap;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of integers to sort: ");
        num = sc.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers");

        for (i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        for (i = 0; i < num - 1; i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers: ");
        for (i = 0; i < num; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
