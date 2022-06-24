package com.roze;

/**
 *
 * @author firoze Find Length, Concatenate and Replace String in Java Program
 */
public class LengthConcateReplace43 {

    public static void main(String[] args) {
        int length;
        String str = "Java Programming", replace , concatenation ;

        System.out.println(str);

        length = str.length();
        System.out.println("Number of characters: " + length);

        replace = str.replace("Java", "C");
        System.out.println(str);
        System.out.println(replace);

        concatenation = str.concat(" "+"is great");
        System.out.println(str);
        System.out.println(concatenation);

    }

}
