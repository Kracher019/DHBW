package de.david.dhbw.semester2.laufs.übungsblatt2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class Aufgabe2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Eingabeformular");
        frame.setSize(500, 200);

        JPanel eingabePanel = new JPanel();

        JLabel l_kundennummer = new JLabel("Kundennummer");
        JLabel l_nachname = new JLabel("Nachname");
        JLabel l_vorname = new JLabel("Vorname");

        JTextField tf_kundennummer = new JTextField();
        JTextField tf_nachname = new JTextField();
        JTextField tf_vorname = new JTextField();
        JButton ok = new JButton("Ok");
        ok.setEnabled(false);

        DocumentListener dl = new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                int nummer = 0;
                String ntext = "";
                String vtext = "";
                try {
                    String nr = tf_kundennummer.getText();
                    nummer = Integer.parseInt(nr);

                    ntext = tf_nachname.getText();
                    vtext = tf_vorname.getText();


                } catch (Exception ignored) {
                    ok.setEnabled(false);
                }
                if (ntext.equalsIgnoreCase("") || vtext.equalsIgnoreCase("") || nummer == 0) ok.setEnabled(false);
                else ok.setEnabled(true);

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                int nummer = 0;
                String ntext = "";
                String vtext = "";
                try {
                    String nr = tf_kundennummer.getText();
                    nummer = Integer.parseInt(nr);

                    ntext = tf_nachname.getText();
                    vtext = tf_vorname.getText();


                } catch (Exception ignored) {
                    ok.setEnabled(false);
                }
                if (ntext.equalsIgnoreCase("") || vtext.equalsIgnoreCase("") || nummer == 0) ok.setEnabled(false);
                else ok.setEnabled(true);

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                int nummer = 0;
                try {
                    String nr = tf_kundennummer.getText();
                    nummer = Integer.parseInt(nr);

                    String ntext = tf_nachname.getText();
                    String vtext = tf_vorname.getText();

                    if(ntext.equalsIgnoreCase("") || vtext.equalsIgnoreCase("")) ok.setEnabled(false);
                    else ok.setEnabled(true);

                } catch (Exception ignored) {
                    ok.setEnabled(false);
                }
                if (nummer != 0) {
                    ok.setEnabled(true);
                }
            }
        };

        tf_kundennummer.getDocument().addDocumentListener(dl);
        tf_nachname.getDocument().addDocumentListener(dl);
        tf_nachname.getDocument().addDocumentListener(dl);

        ok.addActionListener(e -> {
            System.out.println("Eingabe:");
            System.out.println("    Kundennummer: " + tf_kundennummer.getText());
            System.out.println("    Nachname: " + tf_nachname.getText());
            System.out.println("    Vorname: " + tf_vorname.getText());
        });


        frame.setLayout(new BorderLayout());
        eingabePanel.setLayout(new GridLayout(3,2));

        eingabePanel.add(l_kundennummer);
        eingabePanel.add(tf_kundennummer);
        eingabePanel.add(l_nachname);
        eingabePanel.add(tf_nachname);
        eingabePanel.add(l_vorname);
        eingabePanel.add(tf_vorname);


        frame.add(eingabePanel, BorderLayout.NORTH);
        frame.add(ok, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
