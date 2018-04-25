package de.david.dhbw.semester1.sander;

import java.text.NumberFormat;
import java.util.Scanner;

public class Aufgabe15 {


    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        Scanner scan = new Scanner(System.in);
        int bjahr = 2010;
        int jahr = bjahr;
        System.out.println("Bitte geben Sie die Kredithöhe ein:\n");
        double kredithöhe = scan.nextDouble();    // 100000€
        double restkredit = kredithöhe;
        System.out.println("Bitte geben Sie den Zinssatz ein (z.B. 5):\n");
        double zinssatz = scan.nextDouble();      // 5 Prozent
        System.out.println("Bitte geben Sie die Tilgungsrate ein:\n");
        double tilgungsrate = scan.nextDouble();          // 1000€
        System.out.println("Bitte geben Sie die Laufzeit ein:\n");
        double laufzeit = scan.nextDouble();      // 5 Jahre

        for(int i=0;i<laufzeit;i++){
            System.out.println("Jahr: " + jahr);
            double zinsen = (zinssatz/100)*restkredit;
            System.out.println("Es fallen " + nf.format(zinsen) + "€ Zinsen an.");
            if(restkredit-(12*tilgungsrate)+zinsen<= 0){
                System.out.println("Der Kredit von " + kredithöhe +  "€ wird im Jahr " + jahr + " (nach " + (bjahr-jahr) + " Jahren)");
                return;
            }
            restkredit= restkredit-(12*tilgungsrate)+zinsen;
            System.out.println("Der Restkredit beträgt: " + nf.format(restkredit));
            jahr++;

        }
        /*
           Für aktuelles Jahr:
           Zinsen für restkredit

           wenn restkredit - Tilgung <=0 -> Der Kredit wird im Jahr jahr (nach bjahr -jahr) getilgt.
            Restkredit
        */



    }

    /*
    *
    *   Jemand nimmt zum 1. 1. des Jahres 2010 einen Kredit in einer bestimmten Höhe
    *   auf. Erfragen Sie per Programm die folgenden Angaben:
    *   Kredithöhe (z. B. 100.000€)
    *   Zinssatz (z. B. 5 Prozent)
    *   monatliche Rate (z. B. 1.000€)
    *   Laufzeit des Kredits (z. B. 5 Jahre)
    *
    *   Geben Sie aus, wie sich die Darlehnssumme im Laufe der Jahre entwickelt.
    *   Für das obige Beispiel sieht das so aus:
    *   Es fallen für das Jahr 2010 5.000€ Zinsen an. Gezahlt werden 12000€ (je 1000€ in
    *   12 Monaten), d. h. der Stand des Darlehns am 31. 12. 2010 beträgt 93.000€.
    *   Für das Folgejahr beträgt die Darlehnssumme dann nur noch 93.000€ und damit sind
    *   nur noch 4.650€ an Zinsen zu zahlen. Da aber nach wie vor 12.000€ eingezahlt
    *   werden, beträgt die Darlehnssumme nach Ablauf des Folgejahres noch 85650€.
    *   Geben Sie die jährlich verbleibenden Restsummen des Darlehnskontos aus für die
    *   Laufzeit des Kredits. Falls die Darlehnssumme bereits vor Ablauf der Laufzeit des
    *   Kredits vollständig abgezahlt wurde, geben Sie eine entsprechende Meldung aus.
    *
    * */
}