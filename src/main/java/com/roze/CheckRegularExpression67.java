package com.roze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author firoze
 * How to check Regular expression in java Program
 */
public class CheckRegularExpression67 {

    public static void main(String[] args) {
        Pattern pat = Pattern.compile(".s");
        Matcher mat = pat.matcher("as");
        boolean b = mat.matches();
        boolean b1 = Pattern.compile(".s").matcher("as").matches();
        boolean b2 = Pattern.matches(".s", "as");
        System.out.println(b + " " + b1 + " " + b2);
    }
}
