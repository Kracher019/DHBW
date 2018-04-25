package de.david.dhbw.semester1.sander;

import java.util.Scanner;

public class Aufgabe17 {


    public static void main(String[] args) {

        int[] augen = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        for(int w1=1; w1<=6;w1++){
            for(int w2=1; w2<=6;w2++){
                for(int w3=1; w3<=6;w3++){
                    for(int w4=1; w4<=6;w4++){
                        int zahl = w1+w2+w3+w4;
                        augen[zahl-4]++;
                    }
                }
            }
        }

        for(int i=0; i<augen.length; i++){
            System.out.println("Die Augenanzahl " + (i+4) + " kommt " + augen[i] + " mal vor.");
        }

    }

    /*
    Array [20]
    4 bis 24
    Schleife W1
        Schleife W2
            Schleife W3
                Schleife W4
                    Augenzusammen -> array stelle hochzählen

     */

    /*
    Ermitteln Sie, wie oft die verschiedenen Augensummen vorkommen beim Würfeln
    mit 4 Würfeln. Gehen Sie dabei aus, dass die Würfel absolut „fair“ arbeiten und jede
    mögliche Würfelkombination auch genau einmal vorkommt. Es ist also KEIN
    Zufallszahlengenerator notwendig!
    */

}