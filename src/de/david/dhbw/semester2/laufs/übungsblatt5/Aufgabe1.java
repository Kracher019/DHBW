package de.david.dhbw.semester2.laufs.übungsblatt5;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.text.DecimalFormat;

public class Aufgabe1 {

    private static JLabel erg =  new JLabel("Betrag eingeben");
    private static JTextField jfEingabe = new JTextField(20);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Währungsrechner");
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JLabel("EUR in USD (Wechselkurs 1,38)"), BorderLayout.NORTH);

        //Bottom Panel für Ausgabe
        JPanel bottom = new JPanel();
        bottom.add(erg, BorderLayout.CENTER);
        bottom.setVisible(true);
        bottom.setBorder(new EtchedBorder());

        //Top Panel für Eingabefeld
        JPanel top = new JPanel();
        jfEingabe.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleText();
            }
        });
        JLabel eingabeLabel = new JLabel("EUR");

        top.setLayout(new FlowLayout());
        top.add(jfEingabe);
        top.add(eingabeLabel);
        top.setVisible(true);
        top.setBorder(new EtchedBorder());

        //End Frame
        frame.add(top, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.pack();
    }

    private static void handleText(){

        DecimalFormat format = new DecimalFormat("####.00");
        try{
            int eingabe = Integer.parseInt(jfEingabe.getText());
            erg.setForeground(Color.BLACK);
            erg.setText(format.format(eingabe*1.38) + " USD");

        }catch(Exception ex){
            if(jfEingabe.getText().length()==0){
                erg.setText("Betrag eingeben");
                erg.setForeground(Color.BLACK);
            }else {
                erg.setText("ungültiger Wert");
                erg.setForeground(Color.RED);
            }
        }
    }
}
