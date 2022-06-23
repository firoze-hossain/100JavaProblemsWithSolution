package com.roze;

/**
 *
 * @author firoze
 * How to create method in java Program
 */
public class CreateMethod42 {

    public CreateMethod42() {
        System.out.println("Constructor Method will be called when the object of it's call will be created.");
    }

    public static void main(String[] args) {
        staticMethod();
        CreateMethod42 cm = new CreateMethod42();
        cm.nonStaticMethod();

    }

    static void staticMethod() {
        System.out.println("Static method can be called without creating any object");
    }

    void nonStaticMethod() {
        System.out.println("With creating object non static method can be called");
    }

}
