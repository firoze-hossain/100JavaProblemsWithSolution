package com.roze;

/**
 *
 * @author firoze
 * Print Star console using Loop
 */
public class PrintStarConsoleUsingLoop17 {

    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
