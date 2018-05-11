package de.david.dhbw.semester2.laufs.übungsblatt5;

import javax.swing.*;

public class Aufgabe3 {

    public static void main(String[] args) {
        errorPane();
        warningPane();
        questinoPane();
        infoPane();

    }

    private static void errorPane() {
        JOptionPane.showConfirmDialog(null, "Eggs aren't supposed to be green", "This is an error!", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    private static void warningPane() {
        JOptionPane.showConfirmDialog(null, "Eggs aren't supposed to be green", "This is a warning!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
    }

    private static void questinoPane() {
        JOptionPane.showConfirmDialog(null, "Eggs aren't supposed to be green", "Is this a question?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    private static void infoPane() {
        JOptionPane.showConfirmDialog(null, "Eggs aren't supposed to be green", "This is only to kepp you informed!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
}
