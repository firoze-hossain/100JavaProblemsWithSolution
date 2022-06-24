package com.roze;

/**
 *
 * @author firoze 
 * How Static block working in java Program
 */
public class StaticBlock44 {

    public static void main(String[] args) {
        System.out.println("This is main method");
    }

    static {
        System.out.println("Static method will be executed before main method");
    }
}
