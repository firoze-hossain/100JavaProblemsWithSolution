package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Check no is Armstrong or not in java Program
 *
 */
public class ArmstrongNumberCheck27 {

    public static void main(String[] args) {
        int n, temp, remainder, sum = 0, digits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the armstrong number: ");
        n = sc.nextInt();
        temp = n;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = n;

        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;

        }
        if (n == sum) {
            System.out.println("This is armstrong number");
        } else {
            System.out.println("This is not armstrong number!!");
        }

    }

    static int power(int n, int m) {
        int i, r = 1;
        for (i = 1; i <= m; i++) {
            r = r * n;
        }
        return r;
    }

}
