package com.roze;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author firoze 
 * How to create HashMap using map interface program in java
 */
public class HashMap93 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Md. Firoze Hossain");
        map.put(102, "Java Developer");
        map.put(103, "Spring Boot Developer");

        for (Map.Entry m : map.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
