package de.david.dhbw.semester1.laufs.übungsblatt5;

public class Aufgabe4 {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        int aktZ = 0;
        for (int i = 1; i < 25; i++) {
            aktZ= aktZ+i;
            str.append(aktZ+", ");
        }
        System.out.println(str.toString());
    }
}
