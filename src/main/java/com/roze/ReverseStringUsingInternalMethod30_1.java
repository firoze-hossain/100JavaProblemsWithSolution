package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze
 * Print reverse string in java Program Using Internal java
 * Method
 */
public class ReverseStringUsingInternalMethod30_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to reverse: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        StringBuilder sbl = new StringBuilder(sb);
        System.out.println(sbl.reverse());

    }

}
