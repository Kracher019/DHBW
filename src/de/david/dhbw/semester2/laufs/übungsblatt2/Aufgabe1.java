package de.david.dhbw.semester2.laufs.übungsblatt2;

import javax.swing.*;
import java.awt.*;

public class Aufgabe1 {


    public static void main(String[] args) {

        JFrame f = new JFrame("Grid Layout");
        Container cp = f.getContentPane();
        f.setLayout(new GridLayout(5, 2));
        f.setVisible(true);
        f.setSize(500, 500);

        JLabel label0 = new JLabel("0/0");
        JLabel label1 = new JLabel("0/1");
        JLabel label2 = new JLabel("1/0");
        JLabel label3 = new JLabel("1/1");
        JLabel label4 = new JLabel("2/0");
        JLabel label5 = new JLabel("2/1");
        JLabel label6 = new JLabel("3/0");
        JLabel label7 = new JLabel("3/1");
        JLabel label8 = new JLabel("4/0");
        JLabel label9 = new JLabel("4/1");

        label0.setForeground(new Color(133, 200, 250));
        label1.setForeground(new Color(133, 55, 250));
        label2.setForeground(new Color(13, 200, 20));
        label3.setForeground(new Color(133, 98, 250));
        label4.setForeground(new Color(23, 20, 250));
        label5.setForeground(new Color(250, 71, 3));
        label6.setForeground(new Color(133, 23, 3));
        label7.setForeground(new Color(234, 4, 250));
        label8.setForeground(new Color(230, 226, 56));


        cp.add(label0);
        cp.add(label1);

        cp.add(label2);
        cp.add(label3);

        cp.add(label4);
        cp.add(label5);

        cp.add(label6);
        cp.add(label7);

        cp.add(label8);
        cp.add(label9);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
