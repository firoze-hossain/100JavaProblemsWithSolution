package com.roze;

/**
 *
 * @author firoze 
 * How Static block working in java Program for finding out os property
 *
 */
public class StaticBlock44_1 {

    public static void main(String[] args) {
        System.out.println("You are using Ubuntu 20.04.4 LTS");
    }

    static {
        String osName = System.getProperty("os.name");
        System.out.println("OS Name: " + osName);
        String osVersion = System.getProperty("os.version");
        System.out.println("OS Version: " + osVersion);

    }
}
