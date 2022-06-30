package com.roze;

import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author firoze
 * How to create AWT program in java
 */
public class AWTProgram74 extends Frame {

    public AWTProgram74() {
        Button b = new Button("Click Here");
        b.setBounds(70, 130, 80, 30);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        AWTProgram74 a = new AWTProgram74();

    }

}
