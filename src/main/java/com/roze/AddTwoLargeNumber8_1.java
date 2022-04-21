package com.roze;


import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author firoze 
 * Add Two Large Numbers
 */
public class AddTwoLargeNumber8_1 {

    public static void main(String[] args) {
        String firstNum, secondNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        firstNum = sc.nextLine();
        System.out.println("Enter the Second Number: ");
        secondNum = sc.nextLine();

        BigInteger firstBigInteger = new BigInteger(firstNum);
        BigInteger secondBigInteger = new BigInteger(secondNum);
        BigInteger summation;
        summation = firstBigInteger.add(secondBigInteger);
        System.out.println("Summation of Two Large Number: " + summation);

    }

}
