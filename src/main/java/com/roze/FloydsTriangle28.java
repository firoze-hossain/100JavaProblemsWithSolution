package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze
 * Print Floyd’s Triangle in java Program
 */
public class FloydsTriangle28 {

    public static void main(String[] args) {
        int n, num = 1, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of Floyd's triangle you want: ");
        n = sc.nextInt();
        System.out.println("Floyd's Tiangle: ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

}
