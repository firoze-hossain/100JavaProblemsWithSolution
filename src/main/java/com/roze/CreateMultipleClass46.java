package com.roze;

/**
 *
 * @author firoze
 * How to create Multiple class in java Program
 */
public class CreateMultipleClass46 {

    public static void main(String[] args) {
        Desktop desk = new Desktop();
        desk.desktopWarning();

        Laptop lap = new Laptop();
        lap.laptopWarning();
    }
}

class Desktop {

    public Desktop() {
        System.out.println("Constructor class of Desktop");
    }

    public void desktopWarning() {
        System.out.println("Power gone!! Please shut down Desktop.");
    }

}

class Laptop {

    public Laptop() {
        System.out.println("Constructor of Laptop Class");
    }

    public void laptopWarning() {
        System.out.println("Bateery Low!! Please plug the charger.");
    }

}
