package de.david.dhbw.semester2.laufs.übungsblatt2;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class Aufgabe3 {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Aufgabe3");


        //top
        JPanel topPanel = new JPanel();
        JLabel lt_etchedBorder_l = new JLabel("EtchedBorder LOWERED");
        JLabel lt_etchedBorder_r = new JLabel("EtchedBorder LOWRAISEDERED");


        //LeftPanel
        JPanel leftPanel = new JPanel();

        JLabel ll_dashed_red = new JLabel("DashedBorder Color Red");
        JLabel ll_dashed_blue = new JLabel("DashedBorder Color Blue");
        JLabel ll_line_green = new JLabel("LineBorder Green Thickness 5");

        ll_dashed_red.setBorder(BorderFactory.createDashedBorder(Color.RED));
        ll_dashed_blue.setBorder(BorderFactory.createDashedBorder(Color.BLUE));
        ll_line_green.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));

        //RightPanel
        JPanel rightPanel = new JPanel();

        JLabel lr_softBevelBorder_l = new JLabel("SoftBevelBorder LOWERED");
        JLabel lr_softBevelBorder_r = new JLabel("SoftBevelBorder RAISED");
        JLabel lr_compBorder = new JLabel("CompoundBorder mit EtchedBorders");

        lr_softBevelBorder_l.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        lr_softBevelBorder_r.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        lr_compBorder.setBorder(new CompoundBorder(BorderFactory.createEtchedBorder(), BorderFactory.createEtchedBorder()));

        //-----
        leftPanel.setLayout(new FlowLayout());
        leftPanel.add(ll_dashed_red);
        leftPanel.add(ll_dashed_blue);
        leftPanel.add(ll_line_green);

        rightPanel.setLayout(new FlowLayout());
        rightPanel.add(lr_softBevelBorder_l);
        rightPanel.add(lr_softBevelBorder_r);
        rightPanel.add(lr_compBorder);

        topPanel.add(lt_etchedBorder_l, BorderLayout.CENTER);
        topPanel.add(lt_etchedBorder_r, BorderLayout.CENTER);


        frame.setLayout(new BorderLayout());


        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }
}
