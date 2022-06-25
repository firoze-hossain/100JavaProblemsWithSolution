package com.roze;

/**
 *
 * @author firoze 
 * How to throw exception in java Program
 */
public class ThrowException50 {

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");

        } else {
            System.out.println("You are welcome in bd vote");
        }
    }

    public static void main(String[] args) {
        validate(18);
        System.out.println("Hello Md. Firoze Hossain");
    }
}
