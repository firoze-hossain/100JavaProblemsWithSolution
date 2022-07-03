package com.roze;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author firoze
 * How to create LinkedList program in java
 */
public class CreateLinkedList87 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Md. Firoze Hossain");
        list.add("01765002428");
        list.add("firoze.hossain01@gmail.com");
        list.add("Java Developer");

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
