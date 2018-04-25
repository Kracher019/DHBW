package de.david.dhbw.semester2.laufs.übungsblatt1;

import javax.swing.*;
import java.awt.*;

public class Aufgabe4 {

    public static Type type = Type.NULL;

    public static void main(String[] args) {
        JFrame f = type.getFrame();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private static JFrame borderFrame() {
        JFrame f = new JFrame("Border Layout");
        Container cp = f.getContentPane();
        f.setLayout(new BorderLayout());

        JLabel north = new JLabel("NORTH");
        JLabel west = new JLabel("WEST");
        JLabel center = new JLabel("CENTER");
        JLabel east = new JLabel("EAST");
        JLabel south = new JLabel("SOUTH");

        cp.add(north, BorderLayout.NORTH);
        cp.add(west, BorderLayout.WEST);
        cp.add(center, BorderLayout.CENTER);
        cp.add(east, BorderLayout.EAST);
        cp.add(south, BorderLayout.SOUTH);

        return f;
    }

    private static JFrame gridFrame() {
        JFrame f = new JFrame("Grid Layout");
        Container cp = f.getContentPane();
        f.setLayout(new GridLayout(5, 2));

        cp.add(new JLabel("0/0"));
        cp.add(new JLabel("0/1"));

        cp.add(new JLabel("1/0"));
        cp.add(new JLabel("1/1"));

        cp.add(new JLabel("2/0"));
        cp.add(new JLabel("2/1"));

        cp.add(new JLabel("3/0"));
        cp.add(new JLabel("3/1"));

        cp.add(new JLabel("4/0"));
        cp.add(new JLabel("4/1"));

        return f;
    }

    private static JFrame nullFrame() {
        JFrame f = new JFrame("Null Layout");
        Container cp = f.getContentPane();
        f.setLayout(null);
        Insets inset = f.getInsets();

        Dimension d;
        int i = 10;

        JLabel label0 = new JLabel("Label 0");
        d = label0.getPreferredSize();
        label0.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label1 = new JLabel("Label 1");
        d = label1.getPreferredSize();
        label1.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label2 = new JLabel("Label 2");
        d = label2.getPreferredSize();
        label2.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label3 = new JLabel("Label 3");
        d = label3.getPreferredSize();
        label3.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label4 = new JLabel("Label 4");
        d = label4.getPreferredSize();
        label4.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label5 = new JLabel("Label 5");
        d = label5.getPreferredSize();
        label5.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label6 = new JLabel("Label 6");
        d = label6.getPreferredSize();
        label6.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label7 = new JLabel("Label 7");
        d = label7.getPreferredSize();
        label7.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label8 = new JLabel("Label 8");
        d = label8.getPreferredSize();
        label8.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        JLabel label9 = new JLabel("Label 9");
        d = label9.getPreferredSize();
        label9.setBounds(i+inset.left, (i/2)+inset.top, d.width , d.height);
        i = i+i;

        cp.add(label0);
        cp.add(label1);
        cp.add(label2);
        cp.add(label3);
        cp.add(label4);
        cp.add(label5);
        cp.add(label6);
        cp.add(label7);
        cp.add(label8);
        cp.add(label9);

        return f;
    }

    private static JFrame flowFrame() {
        JFrame f = new JFrame("Flow Layout");
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(new JLabel("Label 0"));
        cp.add(new JLabel("Label 1"));
        cp.add(new JLabel("Label 2"));
        cp.add(new JLabel("Label 3"));
        cp.add(new JLabel("Label 4"));
        cp.add(new JLabel("Label 5"));
        cp.add(new JLabel("Label 6"));
        cp.add(new JLabel("Label 7"));
        cp.add(new JLabel("Label 8"));
        cp.add(new JLabel("Label 9"));

        return f;
    }

    private enum Type {
        BORDER(borderFrame()),
        GRID(gridFrame()),
        NULL(nullFrame()),
        FLOW(flowFrame());

        JFrame f;

        Type(JFrame f) {
            this.f = f;
        }

        public JFrame getFrame() {
            return f;
        }
    }

}
