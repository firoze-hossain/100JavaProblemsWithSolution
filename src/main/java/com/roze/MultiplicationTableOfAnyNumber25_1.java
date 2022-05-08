package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Print Multiplication table Program in java For Any Number
 */
public class MultiplicationTableOfAnyNumber25_1 {

    public static void main(String[] args) {
        int startNum, endNum;
        System.out.println("Enter the range of number to print it's multiplication: ");
        Scanner sc = new Scanner(System.in);
        startNum = sc.nextInt();
        endNum = sc.nextInt();
        for (int i = startNum; i <= endNum; i++) {
            System.out.println("Multiplicaation table of: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}
