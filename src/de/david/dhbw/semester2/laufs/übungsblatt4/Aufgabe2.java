package de.david.dhbw.semester2.laufs.übungsblatt4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pet Chooser");
        frame.setSize(500, 300);


        //JCheckBox
        JCheckBox cbHund = new JCheckBox("Hund");
        JCheckBox cbKatze = new JCheckBox("Katze");
        JCheckBox cbMaus = new JCheckBox("Maus");

        cbHund.setVisible(true);
        cbKatze.setVisible(true);
        cbMaus.setVisible(true);

        //JLabel für Auswahl Anzeige:
        JLabel anzeige = new JLabel("Auswahl: keine");

        ActionListener al = e -> {
            if(e.getSource() instanceof JCheckBox){
                StringBuilder str = new StringBuilder("Auswahl: ");
                if(cbHund.isSelected()) str.append(cbHund.getText()).append(" ");
                if(cbKatze.isSelected()) str.append(cbKatze.getText()).append(" ");
                if(cbMaus.isSelected()) str.append(cbMaus.getText()).append(" ");

                anzeige.setText(str.toString());
            }
        };

        cbHund.addActionListener(al);
        cbKatze.addActionListener(al);
        cbMaus.addActionListener(al);

        frame.setLayout(new FlowLayout());
        frame.add(cbHund);
        frame.add(cbKatze);
        frame.add(cbMaus);
        frame.add(anzeige);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
