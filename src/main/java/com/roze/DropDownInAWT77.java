package com.roze;

import java.awt.Choice;
import java.awt.Frame;

/**
 *
 * @author firoze
 * How to dropdown in AWT program in java
 */
public class DropDownInAWT77 {

    public DropDownInAWT77() {
        Frame f = new Frame("Designed By Md. Firoze Hossain");
        Choice ch = new Choice();
        ch.setBounds(100, 100, 75, 75);
        ch.add("Item1");
        ch.add("Item2");
        ch.add("Item3");
        ch.add("Item4");
        ch.add("Item5");
        ch.add("Item6");
        f.add(ch);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new DropDownInAWT77();
    }

}
