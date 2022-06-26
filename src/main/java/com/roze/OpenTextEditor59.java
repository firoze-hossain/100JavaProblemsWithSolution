package com.roze;

import java.io.IOException;

/**
 *
 * @author firoze 
 * How to open Text Editor(gedit) in ubuntu in java Program
 */
public class OpenTextEditor59 {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("gedit");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
