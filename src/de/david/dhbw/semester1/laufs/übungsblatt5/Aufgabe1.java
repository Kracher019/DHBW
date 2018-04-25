package de.david.dhbw.semester1.laufs.übungsblatt5;

public class Aufgabe1 {

    public static void main(String[] args) {
        String st1 = "Wert";
        String st2 = "WERT";

        if(st1.toLowerCase().startsWith(st2.toLowerCase())) System.out.println("Variante 1");
        if(st1.equalsIgnoreCase(st2)) System.out.println("Variante 2");
    }
}
