package com.roze;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author firoze
 * How to create PriorityQueue program in java
 */
public class PriorityQueue92 {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Md. Firoze Hossain");
        queue.add("Java Developer");
        queue.add("Spring Boot Developer");
        queue.add("Software Engineer");
        System.out.println("Head: " + queue.element());
        System.out.println("Head: " + queue.peek());
        System.out.println("=========================");
        System.out.println("Iterator the queue elements: ");
        Iterator itr = queue.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("=========================");
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements: ");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }

}
