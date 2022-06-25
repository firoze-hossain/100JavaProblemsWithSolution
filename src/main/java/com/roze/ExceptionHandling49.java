package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * Exception Handling java Program
 */
public class ExceptionHandling49 {

    public static void main(String[] args) {
        int num1, num2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        try {
            result = num1 / num2;
            System.out.println("Result is: " + result);

        } catch (ArithmeticException ex) {
            System.out.println("Error caught");
        }
    }

}
