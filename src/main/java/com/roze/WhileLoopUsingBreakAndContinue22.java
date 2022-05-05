package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * While loop using break and continue Program in java
 */
public class WhileLoopUsingBreakAndContinue22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input an integer: ");
            int num = sc.nextInt();
            if (num != 0) {
                System.out.println("You entered: " + num);
                continue;
            } else {
                break;
            }

        }
    }

}
