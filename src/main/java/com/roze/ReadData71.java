package com.roze;

import java.io.FileInputStream;

import java.io.FileReader;

/**
 *
 * @author firoze 
 * How to read data from text file using java program
 */
public class ReadData71 {

    public static void main(String[] args) {
        try {
            // FileInputStream fout = new FileInputStream("/home/firoze/Documents/hello.txt");
            FileReader fr = new FileReader("/home/firoze/Documents/hello.txt");
            int i;
            while ((i = fr.read()) != -1) {
                //while((i=fout.read()) !=-1){
                System.out.print((char) i);
            }
            //fout.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
