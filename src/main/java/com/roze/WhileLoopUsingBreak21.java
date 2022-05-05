package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * While loop using break Program in java
 */
public class WhileLoopUsingBreak21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Input an integer: ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            System.out.println("You entered: " + num);
        }
    }

}
