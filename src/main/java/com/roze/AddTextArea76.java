package com.roze;

import java.awt.Frame;
import java.awt.TextArea;

/**
 *
 * @author firoze
 * How to add text area program in java
 */
public class AddTextArea76 {

    public AddTextArea76() {

        Frame f = new Frame("Designed By Firoze");
        TextArea ta = new TextArea("Made By Firoze");
        ta.setBounds(30, 120, 150, 120);
        f.add(ta);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AddTextArea76 ata = new AddTextArea76();

    }

}
