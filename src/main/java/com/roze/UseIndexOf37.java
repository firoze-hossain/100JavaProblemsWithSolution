package com.roze;

/**
 *
 * @author firoze 
 * How to use indesOf() in java Program
 */
public class UseIndexOf37 {

    public static void main(String[] args) {
        String s1 = "This is Md. Firoze Hossain";

        int index1 = s1.indexOf("Md");
        int index2 = s1.indexOf("Firoze");
        System.out.println(index1 + " " + index2);

        int index3 = s1.indexOf("is", 4);
        System.out.println(index3);

        int index4 = s1.indexOf('s');
        System.out.println(index4);

    }

}
