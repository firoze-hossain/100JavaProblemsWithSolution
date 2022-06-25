package com.roze;

/**
 *
 * @author firoze 
 * Advantage of Finally in Exception Handling java Program
 */
public class FinallyBlock51 {

    public static void main(String[] args) {
        try {
            long data[] = new long[1000000000];

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally Block will be always excuted.");
        }
    }

}
