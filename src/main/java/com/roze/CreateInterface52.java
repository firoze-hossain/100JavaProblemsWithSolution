package com.roze;

/**
 *
 * @author firoze 
 * How to create Interface in java Program
 */
public class CreateInterface52 implements Test {

    public static void main(String[] args) {
        CreateInterface52 inter = new CreateInterface52();
        inter.display();
    }

    public void display() {
        System.out.println(language + " is awesome");
    }

}

interface Test {

    public static final String language = "Java";

    public void display();
}
