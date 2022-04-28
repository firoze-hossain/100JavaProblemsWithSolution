package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze
 * Nested If Else clause in java
 */
public class NestedIfElseClause11 {

    public static void main(String[] args) {
        int obtainedMarks, passingMarks = 40;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your obtained marks: ");
        obtainedMarks = sc.nextInt();

        if (obtainedMarks >= passingMarks) {

            if (obtainedMarks >= 90) {
                grade = 'A';
            } else if (obtainedMarks >= 80) {
                grade = 'B';

            } else if (obtainedMarks >= 70) {
                grade = 'C';
            } else {
                grade = 'D';

            }
            System.out.println("You pass the exam is grade: " + grade);
        } else {
            grade = 'F';
            System.out.println("You failed and grade is: " + grade);
        }

    }

}
