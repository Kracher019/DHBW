package de.david.dhbw.semester2.laufs.übungsblatt1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FensterMitKnopf extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        b.setText("You clicked :D");
        b.setEnabled(false);
    }

    public static void main(String[] args) {
        FensterMitKnopf f = new FensterMitKnopf();
        f.setVisible(true);
        f.setSize(500, 500);
    }


    public FensterMitKnopf(){
        this.setTitle("Mein Fenster mit Knopf");
        Container cp = this.getContentPane();
        JButton knopf = new JButton("Knopf");
        knopf.setSize(30,10);
        knopf.addActionListener(this);
        cp.add(knopf);

        // Anwendung beenden, wenn Fenster geschlossen wird

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
