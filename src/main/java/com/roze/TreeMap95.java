package com.roze;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author firoze
 * How to create TreeMap program in java
 */
public class TreeMap95 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Md. Firoze Hossain");
        map.put(102, "Software Engineer");
        map.put(103, "Java Developer");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
