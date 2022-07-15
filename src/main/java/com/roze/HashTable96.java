package com.roze;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author firoze
 * How to create Hashtable program in java
 */
public class HashTable96 {

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(101, "Anjir Mahmud Jihad");
        table.put(102, "Age-03 Years");
        table.put(103, "Nephew");
        for (Map.Entry t : table.entrySet()) {
            System.out.println(t.getKey() + " " + t.getValue());
        }
    }

}
