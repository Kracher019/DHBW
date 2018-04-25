package de.david.dhbw.semester1.sander;

import java.util.*;

public class Aufgabe8 {


    public static void main(String[] args) {

        for(int i=0;i<30;i++) {
            Random r = new Random();
            int w1 = (int) (r.nextInt(6) + 1);
            int w2 = (int) (r.nextInt(6) + 1);

            String zwE = "";
            int ergebnis = 0;


            if (w1 < w2) {
                zwE = "" + w2 + w1;
            } else if (w1 > w2) {
                zwE = "" + w1 + w2;
            } else if (w1 == w2) {
                zwE = "" + w1*100;

            }
            ergebnis = Integer.valueOf(zwE);
            if (ergebnis == 21) ergebnis = 1000;
            PunkteAusgabe(ergebnis);
        }


    }

    static void PunkteAusgabe(int punkte){
        System.out.println("Der Wurf ergab: " + punkte + " Punkte!");
    }
}