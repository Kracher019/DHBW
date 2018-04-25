package de.david.dhbw.semester2.laufs.übungsblatt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe5 extends JFrame implements ActionListener {

    public static int counter = 0;

    public static void main(String[] args) {
        Aufgabe5 f = new Aufgabe5();
        f.setVisible(true);
        f.setSize(500, 500);
    }


    public Aufgabe5(){
        this.setTitle("Click Counter");
        Container cp = this.getContentPane();
        JButton knopf = new JButton("Click me! :D");
        knopf.setSize(30,10);
        knopf.addActionListener(this);
        JLabel l = new JLabel(counter +" mal gedrückt!");
        cp.add(knopf, BorderLayout.NORTH);
        cp.add(l, BorderLayout.CENTER);

        // Anwendung beenden, wenn Fenster geschlossen wird

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        JLabel l = (JLabel) this.getContentPane().getComponent(1);
        l.setText(counter +" mal gedrückt!");
    }
}
