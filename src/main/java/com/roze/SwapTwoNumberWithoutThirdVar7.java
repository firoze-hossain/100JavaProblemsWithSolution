package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * swap 2 no without using 3rd variable
 */
public class SwapTwoNumberWithoutThirdVar7 {

    public static void main(String[] args) {
        int firstNum, secondNum;
        System.out.println("Enter First and Second Number: ");
        Scanner sc = new Scanner(System.in);
        firstNum = sc.nextInt();
        secondNum = sc.nextInt();
        System.out.println("Before Swapping: \nFirst Number = " + firstNum + "\nSecond Number = " + secondNum);

        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;

        System.out.println("After Swapping: \nFirst Number = " + firstNum + "\nSecond Number = " + secondNum);

    }

}
