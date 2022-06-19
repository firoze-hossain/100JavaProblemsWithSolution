package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * How to get transpose of matrix in java Program
 */
public class TransposeMatrix34 {

    public static void main(String[] args) {
        int row, col, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        row = sc.nextInt();
        col = sc.nextInt();

        int matrix[][] = new int[row][col];

        System.out.println("Enter the elements of matrix: ");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int transpose[][] = new int[col][row];

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of entered matrix: ");

        for (i = 0; i < col; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + "\t");

            }
            System.out.print("\n");
        }

    }
}
