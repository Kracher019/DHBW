package de.david.dhbw.semester2.laufs.übungsblatt3;

import javax.swing.*;
import java.awt.*;

public class Aufgabe1 {

    public static void main(String[] args) {

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = env.getAvailableFontFamilyNames();

        JFrame frame = new JFrame("Select Font");
        frame.setSize(500, 300);


        //MidPanel
        String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.   \n" +
                "\n" +
                "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet";
        JTextArea ta = new JTextArea(text);
        ta.setLineWrap(true);
        ta.setFont(new Font(fontNames[0], Font.PLAIN, 12));
        ta.setSize(500, 300);
        ta.setWrapStyleWord(true);
        ta.setVisible(true);

        JScrollPane midPanel = new JScrollPane(ta);
        midPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //top
        JPanel topPanel = new JPanel();

        JComboBox<String> cb = new JComboBox<String>();
        JLabel l_text = new JLabel("Schrift: " + fontNames[0] + " 12 pt");
        cb.setModel(new DefaultComboBoxModel<>(fontNames));
        cb.addItemListener(iel -> {
            ta.setFont(new Font((String) iel.getItem(), Font.PLAIN, 12));
            l_text.setText("Schrift: " + (String) iel.getItem() + " 12 pt");
        });

        topPanel.add(cb, BorderLayout.CENTER);
        topPanel.add(l_text, BorderLayout.CENTER);

        //midPanel.add(ta);

        frame.setLayout(new BorderLayout());

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(midPanel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.pack();

    }

}
