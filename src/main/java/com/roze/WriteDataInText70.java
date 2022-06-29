package com.roze;

import java.io.FileWriter;

/**
 *
 * @author firoze
 * How to write data in text file using java program
 */
public class WriteDataInText70 {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/home/firoze/Documents/hello.txt");
            writer.write("Hello Firoze. How are you? Are you a Java Developer?");
            writer.close();
            System.out.println("Write Successfully Done.");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
