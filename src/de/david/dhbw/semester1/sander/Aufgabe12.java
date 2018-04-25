package de.david.dhbw.semester1.sander;

public class Aufgabe12 {


    public static void main(String[] args) {

        int anfangszahl = 398765443;//Integer.valueOf(args[0]);
        int zahl = anfangszahl;


        int Jahre = zahl / (60 * 60 * 24 * 356);      // 60*60*24*356
        zahl = zahl % (60 * 60 * 24 * 356);
        int Tage = zahl / (60 * 60 * 24);       // 60*60*24
        zahl = zahl % (60 * 60 * 24);
        int Stunden = zahl / (60 * 60);    // 60*60
        zahl = zahl % (60 * 60);
        int Minuten = zahl / 60;    // 60
        zahl = zahl % (60);
        int Sekunden = zahl;


        System.out.println(anfangszahl + " Sekunden entsprechen: ");
        System.out.println("Jahre: " + Jahre);
        System.out.println("Tage: " + Tage);
        System.out.println("Stunden: " + Stunden);
        System.out.println("Minuten: " + Minuten);
        System.out.println("Sekunden: " + Sekunden);


    }
}