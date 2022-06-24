package com.roze;

/**
 *
 * @author firoze 
 * Difference between Static and Instance method working in java Program
 */
public class StaticAndInstanceMethod45 {

    public static void main(String[] args) {
        display();
        StaticAndInstanceMethod45 st = new StaticAndInstanceMethod45();
        st.show();
    }

    static void display() {
        System.out.println("Firoze is Java Developer");
    }

    void show() {
        System.out.println("Firoze is Spring Boot Developer");
    }

}
