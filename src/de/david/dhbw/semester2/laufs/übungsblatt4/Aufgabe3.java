package de.david.dhbw.semester2.laufs.übungsblatt4;

import javax.swing.*;
import java.awt.*;

public class Aufgabe3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Chooser");
        frame.setSize(500, 300);


        //JRadioButton
        JRadioButton cbOne = new JRadioButton("1");
        JRadioButton cbTwo = new JRadioButton("2");
        JRadioButton cbThree = new JRadioButton("3");

        ButtonGroup bg = new ButtonGroup();
        bg.add(cbOne);
        bg.add(cbTwo);
        bg.add(cbThree);


        frame.setLayout(new FlowLayout());
        frame.add(cbOne);
        frame.add(cbTwo);
        frame.add(cbThree);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
