package com.roze;

/**
 *
 * @author firoze 
 * How to create constructor overloading in java Program
 */
public class ConstructorOverloading48 {

    String name;

    public ConstructorOverloading48() {
        System.out.println("Constructor method called");
    }

    public ConstructorOverloading48(String param) {
        this.name = param;
    }

    public static void main(String[] args) {
        ConstructorOverloading48 cpp = new ConstructorOverloading48();
        ConstructorOverloading48 java = new ConstructorOverloading48("Java");
        java.getName();
        cpp.setName("C++");
        cpp.getName();
    }

    public void setName(String param) {
        this.name = param;
    }

    public void getName() {
        System.out.println("Language Name= " + name);
    }
}
