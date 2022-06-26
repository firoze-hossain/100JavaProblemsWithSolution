package com.roze;

/**
 *
 * @author firoze
 * How perform garbage collection in java Program
 */
public class GarbageCollection57 {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Free memory in JVM before garbage collection: " + rt.freeMemory());
        rt.gc();
        System.out.println("Free memory in JVM after garbage collection: " + rt.freeMemory());

    }

}
