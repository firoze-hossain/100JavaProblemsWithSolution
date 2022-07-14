package com.roze;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author firoze
 * How to create LinkedHashMap program in java
 */
public class LinkedHashMap94 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Anika Yasmin Ria");
        map.put(102, "Afia Nur");
        map.put(103, "Niece");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
