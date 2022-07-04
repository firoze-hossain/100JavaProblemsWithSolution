package com.roze;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author firoze
 * How to create Hashset program in java
 */
public class CreateHasSet89 {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Md. Firoze Hossain");
        hs.add("Java Developer");
        hs.add("Spring Boot Dveloper");
        hs.add("Software Engineer");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
