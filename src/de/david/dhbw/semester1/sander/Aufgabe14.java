package de.david.dhbw.semester1.sander;

import java.util.Calendar;
import java.util.Scanner;

public class Aufgabe14 {


    public static void main(String[] args) {

        boolean isSchatljahr = false;
        System.out.println("Bitte geben Sie eine Jahreszahl ein: \n");
        Scanner scan = new Scanner(System.in);
        int jahr = scan.nextInt();
        if(jahr%4==0){
            isSchatljahr = true;
        }
        if(jahr%100==0){
            isSchatljahr = false;
        }
        if(jahr%400==0){
            isSchatljahr = true;
        }


        int ajahr = Calendar.getInstance().get(Calendar.YEAR);
        if(ajahr>jahr){
            System.out.println(isSchatljahr? jahr + " war ein Schaltjahr": jahr + " war kein Schaltjahr");
        }else{
            System.out.println(isSchatljahr? jahr + " ist ein Schaltjahr": jahr + " ist kein Schaltjahr");
        }
    }

    /*
    * Schreiben Sie ein Programm, das zu einer eingegebenen Jahreszahl feststellt, ob
        dieses Jahr ein Schaltjahr war.
        Ein Schaltjahr liegt dann vor, wenn die Jahreszahl durch 4 teilbar ist.
        Keine Schaltjahre sind aber Jahreszahlen, die durch 100 teilbar sind. Ist die
        Jahreszahl durch 400 teilbar, gibt es wieder ein Schaltjahr!
    * */
}