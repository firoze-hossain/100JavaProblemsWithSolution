package com.roze;

/**
 *
 * @author firoze 
 * How to join thread in java program
 */
public class JoinThread69 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        JoinThread69 t1 = new JoinThread69();
        JoinThread69 t2 = new JoinThread69();
        JoinThread69 t3 = new JoinThread69();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }

}
