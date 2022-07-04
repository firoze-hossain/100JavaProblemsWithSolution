package com.roze;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author firoze
 * How to create LinkedHashSet program in java
 */
public class CreateLinkedHashSet90 {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Md. Firoze Hosaain");
        set.add("Java Developer");
        set.add("Software Engineer");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
