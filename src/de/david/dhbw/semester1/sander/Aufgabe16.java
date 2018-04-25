package de.david.dhbw.semester1.sander;

import java.text.NumberFormat;
import java.util.Scanner;

public class Aufgabe16 {


    public static void main(String[] args) {

        int[] tage_im_monat = {31,28,31,30,31,30,31,31,30,31,30,31};

        /*  Schreiben Sie ein Programm, das für jede Datumsangabe eines Jahres in der Form
            Tag (zweistellig) und Monat (zweistellig) die Nummer des Tages im Jahr (also
            zwischen 1 und 365) angibt. Gehen Sie davon aus, dass kein Schaltjahr vorliegt.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben sie ein Datum im Format dd.mm. ein. (z.B. 13.10.): \n");
        String in = scan.next();
        String[] date = in.split("\\.");

        int tage = Integer.valueOf(date[0]);

        int monat = Integer.valueOf(date[1]);

        int tag_im_jahr = 0;
        for(int i=1; i<monat;i++){
            tag_im_jahr += tage_im_monat[i];
        }
        tag_im_jahr+=tage;

        System.out.println("Der " + tage + "." + monat + " ist der " + tag_im_jahr + ". Tag im Jahr.");


    }

}