package de.david.dhbw.semester2.laufs.übungsblatt4;

import javax.swing.*;

public class Aufgabe1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea mit JScrollPane");
        frame.setSize(500, 300);


        //TextArea
        String text = "Lorem ipsum dolor sit amet\nDies ist ein Platzhalter Text.\nWenn du möchtest, kannst du ihn ändern";
        JTextArea ta = new JTextArea(text);
        ta.setLineWrap(true);
        ta.setSize(500, 300);
        ta.setWrapStyleWord(true);
        ta.setVisible(true);

        //JScrollPane
        JScrollPane pane = new JScrollPane(ta);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(pane);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
