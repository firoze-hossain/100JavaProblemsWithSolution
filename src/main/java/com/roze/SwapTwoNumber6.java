package com.roze;

import java.time.temporal.Temporal;
import java.util.Scanner;

/**
 *
 * @author firoze 
 * swap 2 no using 3rd variable Program
 */
public class SwapTwoNumber6 {

    public static void main(String[] args) {
        int firstNum, secondNum, temp;
        System.out.println("Enter First Number and Second Number : ");
        Scanner sc = new Scanner(System.in);
        firstNum = sc.nextInt();
        secondNum = sc.nextInt();
        System.out.println("Before swaping: \nFirst Number = " + firstNum + "\nSecond Num = " + secondNum);
        temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("After Swapping: \nFirst Number = " + firstNum + "\nSecond Number = " + secondNum);

    }

}
