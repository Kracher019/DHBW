package de.david.dhbw.semester2.laufs.übungsblatt1;

import javax.swing.*;
import java.awt.*;

public class Aufgabe3 extends JFrame{

    public static void main(String[] args) {
        Aufgabe3 f = new Aufgabe3();
        f.setVisible(true);
        f.setSize(500, 500);
    }


    public Aufgabe3(){
        this.setTitle("Hello World!");
        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        JLabel l = new JLabel("Hello World!");
        cp.add(l, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
