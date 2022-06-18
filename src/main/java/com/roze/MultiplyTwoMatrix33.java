package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * How to multiply two matrix in java Program
 */
public class MultiplyTwoMatrix33 {

    public static void main(String[] args) {
        int m, n, o, p, sum = 0, i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int first[][] = new int[m][n];
        System.out.println("Enter the elements of first matrix: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                first[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of second matrix: ");
        o = sc.nextInt();
        p = sc.nextInt();

        if (n != o) {
            System.out.println("Matrices with entered orders can not be multiplied with eacxh other.");

        } else {
            int[][] second = new int[o][p];
            int multiply[][] = new int[m][p];
            System.out.println("Enter the elements of second matrix: ");

            for (i = 0; i < o; i++) {
                for (j = 0; j < p; j++) {
                    second[i][j] = sc.nextInt();
                }
            }

            for (i = 0; i < m; i++) {
                for (j = 0; j < p; j++) {
                    for (k = 0; k < o; k++) {
                        sum = sum + first[i][k] * second[k][j];
                    }
                    multiply[i][j] = sum;
                    sum = 0;

                }
            }

            System.out.println("Product of entered matrices: ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < p; j++) {
                    System.out.print(multiply[i][j] + "\t");
                }
                System.out.print("\n");

            }

        }
    }

}
