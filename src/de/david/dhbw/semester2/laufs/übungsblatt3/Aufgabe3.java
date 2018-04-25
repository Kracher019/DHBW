package de.david.dhbw.semester2.laufs.übungsblatt3;

import javax.swing.*;
import java.awt.*;

public class Aufgabe3 {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Auswahl Kunde");
        frame.setSize(500, 300);


        //MidPanel
        JPanel bottomPanel = new JPanel();
        JLabel l_name = new JLabel("Ausgewählt: none");

        //top
        JPanel topPanel = new JPanel();

        JComboBox<Aufgabe3_Kunde> cb = new JComboBox<>();
        cb.setSelectedItem(new Object[]{""});
        cb.setModel(new DefaultComboBoxModel<>(new Aufgabe3_Kunde[]{new Aufgabe3_Kunde(Aufgabe3_Kunde.Anrede.m,"Hans", "Dieter"), new Aufgabe3_Kunde(Aufgabe3_Kunde.Anrede.u,"Peter", "Wolfram"), new Aufgabe3_Kunde(Aufgabe3_Kunde.Anrede.w,"Auguste", "Niederwald")}));
        cb.addActionListener(al -> {
            Aufgabe3_Kunde kd = (Aufgabe3_Kunde)((JComboBox) al.getSource()).getSelectedItem();
            l_name.setText("Ausgewählt: " + kd.getAnrede() + " " + kd.getVorname() + " " + kd.getNachname() + " (Kundennummer: " + kd.getKdnr() + ")");
        });

        topPanel.add(cb, new GridLayout(1,1));

        bottomPanel.add(l_name, BorderLayout.WEST);

        frame.setLayout(new BorderLayout());

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
