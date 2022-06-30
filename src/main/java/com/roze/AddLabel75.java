package com.roze;

import java.awt.Frame;
import java.awt.Label;

/**
 *
 * @author firoze
 * How to add label in AWT program in java
 */
public class AddLabel75 {

    public static void main(String[] args) {
        Frame f = new Frame("Label Example by Firoze");
        Label l1, l2;
        l1 = new Label("First Label");
        l1.setBounds(30, 100, 80, 30);
        l2 = new Label("Second Label");
        l2.setBounds(40, 120, 90, 40);
        f.add(l1);
        f.add(l2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
