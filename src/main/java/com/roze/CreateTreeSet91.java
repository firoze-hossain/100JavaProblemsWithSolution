package com.roze;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author firoze
 * How to create TreeSet program in java
 */
public class CreateTreeSet91 {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Md. Firoze Hossain");
        set.add("Java Developer");
        set.add("Spring Developer");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
