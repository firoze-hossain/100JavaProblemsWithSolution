package com.roze;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author firoze
 * How to ArrayList using list interface program in java
 */
public class UsingListInterface88 {

    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Book book1 = new Book(101, "Life of Roze", "Written by Roze", "Roze Tech");
        Book book2 = new Book(102, "Hallowan", "Written by Roze Shake", "Roze Tech Universe");
        Book book3 = new Book(103, "Criticism", "Written by Roze Holder", "Roze Tech Multiverse");
        list.add(book1);
        list.add(book2);
        list.add(book3);

        System.out.println("Original Content of List: ");

        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher);
        }
        System.out.println();
        ListIterator<Book> itr = list.listIterator();
        System.out.println("Modified Content of List: ");
        while (itr.hasNext()) {
            Book bk = itr.next();
            System.out.println(bk.id + " " + bk.name + " " + bk.author + " " + bk.publisher);
        }
    }

}

class Book {

    int id;
    String name, author, publisher;

    public Book(int id, String name, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

}
