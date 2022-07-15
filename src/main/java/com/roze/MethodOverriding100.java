package com.roze;

/**
 *
 * @author firoze
 * How to create Method Overriding program in java
 */
public class MethodOverriding100 {

    public static void main(String[] args) {
        DutchBanglaBank db = new DutchBanglaBank();
        IslamiBank ib = new IslamiBank();
        System.out.println("Dutch Bangla Bank Interest Rate: " + db.getRateOfInterest());
        System.out.println("Islami Bank Interest Rate: " + ib.getRateOfInterest());
    }

}

class Bank {

    public int getRateOfInterest() {
        return 0;
    }
}

class DutchBanglaBank extends Bank {

    public int getRateOfInterest() {
        return 3;
    }
}

class IslamiBank extends Bank {

    public int getRateOfInterest() {
        return 5;
    }
}
