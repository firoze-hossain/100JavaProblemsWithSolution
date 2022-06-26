package com.roze;

import java.util.Random;

/**
 *
 * @author firoze 
 * How to Generate random number in java Program
 */
public class RandomNumber56 {

    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println("Random Numbers: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(ran.nextInt(100));
        }
    }
}
