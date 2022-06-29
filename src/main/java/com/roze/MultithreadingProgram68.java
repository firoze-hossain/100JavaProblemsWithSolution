package com.roze;

/**
 *
 * @author firoze 
 * How to create Multithreading program in java
 */
public class MultithreadingProgram68 extends Thread {

    public void run() {
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        MultithreadingProgram68 th = new MultithreadingProgram68();
        th.start();
    }
}
