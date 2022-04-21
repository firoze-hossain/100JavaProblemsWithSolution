package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * add two number
 */
public class AddTwoNumber8 {

    public static void main(String[] args) {
        int num1, num2, summation;

        System.out.println("Enter Two Number to calculate sum: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        summation = num1 + num2;
        System.out.println("The sum of Two Numbers: " + summation);

    }

}
