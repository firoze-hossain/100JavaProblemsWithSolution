package com.roze;

/**
 *
 * @author firoze 
 * How to split string in java Program
 */
public class SplitString39 {

    public static void main(String[] args) {
        String s1 = "She is so much pretty.";
        String[] words = s1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
