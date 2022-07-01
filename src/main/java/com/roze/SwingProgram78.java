package com.roze;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author firoze 
 * How to create Swing program in java
 */
public class SwingProgram78 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Designed by Firoze");
        JButton btn = new JButton("Click");
        btn.setBounds(100, 130, 80, 90);
        jf.add(btn);
        jf.setSize(400, 500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    
}
