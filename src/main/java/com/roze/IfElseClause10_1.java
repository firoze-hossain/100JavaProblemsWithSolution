package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze 
 * If Else clause in java- Program2
 */
public class IfElseClause10_1 {

    public static void main(String[] args) {
        int obtainedMarks, passingMarks = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your obtained marks: ");
        obtainedMarks = sc.nextInt();
        if (obtainedMarks >= passingMarks) {
            System.out.println("You have passed the examination");
        } else {
            System.out.println("You have failed in examination.");
        }
    }

}
