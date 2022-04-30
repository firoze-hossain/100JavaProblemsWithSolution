package com.roze;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author firoze 
 * Calculate factorial for large No
 */
public class FactorialLargeNumber14_1 {

    public static void main(String[] args) {
        int num;
        BigInteger fact = new BigInteger("1");
        BigInteger inc = new BigInteger("1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(num + " != " + fact);
    }

}
