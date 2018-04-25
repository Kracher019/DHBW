package de.david.dhbw.semester1.sander;

import java.util.Scanner;

public class Aufgabe2 {



    public static void main(String[] args) {

        System.out.println("Bitte gebe die umzurechnende Zahl ein:\n");
        Scanner scan = new Scanner(System.in);
        int zahl = scan.nextInt();
        System.out.println("Die Zahl " + zahl + " entspricht:");

        int gros = zahl/144;   // zahl/144 -> Gros
        zahl = zahl%144;
        int schock = zahl/60;   // zahl/60 -> Schock
        zahl = zahl%60;
        int dutzend = zahl/12;  // zahl/12 -> Dutzend
        zahl = zahl%12;         //-> Stück

        System.out.println("Gros: " + gros);
        System.out.println("Schock: " + schock);
        System.out.println("Dutzend: " + dutzend);
        System.out.println("Stück: " + zahl);


    }
}