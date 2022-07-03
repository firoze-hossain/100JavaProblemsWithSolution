package com.roze;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author firoze
 * Create ArrayList program in java
 */
public class CreateArrayList86 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Md. Firoze Hossain");
        list.add("Java Developer");
        list.add("Spring Boot Developer");
        list.add("Software Engineer");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
