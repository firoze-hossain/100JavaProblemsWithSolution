package com.roze;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author firoze
 * How to add checkbox in Swing program in java
 */
public class AddCheckBoxInSwing79 {

    public AddCheckBoxInSwing79() {
        JFrame f = new JFrame("Designed By Firoze");
        JCheckBox check1 = new JCheckBox("Java", true);
        check1.setBounds(100, 100, 200, 50);
        JCheckBox check2 = new JCheckBox("Spring Boot", true);
        check2.setBounds(100, 150, 200, 50);
        JCheckBox check3 = new JCheckBox("JPA & Hibernate");
        check3.setBounds(100, 200, 200, 50);
        f.add(check1);
        f.add(check2);
        f.add(check3);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AddCheckBoxInSwing79();
    }

}
