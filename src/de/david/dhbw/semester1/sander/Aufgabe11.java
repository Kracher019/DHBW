package de.david.dhbw.semester1.sander;

public class Aufgabe11 {


    public static void main(String[] args) {

        int zahl = 546;


        char[] zahlArray = String.valueOf(zahl).toCharArray();
        if (zahlArray.length != 3) {
            System.out.println("Die Zahl muss dreistellig sein!");
            return;
        }

        int z1 = Integer.valueOf(String.valueOf(zahlArray[0]));
        int z2 = Integer.valueOf(String.valueOf(zahlArray[1]));
        int z3 = Integer.valueOf(String.valueOf(zahlArray[2]));

        if (z1 != 0 && zahl % z1 == 0) {
            System.out.println(zahl + " ist durch " + z1 + " teilbar");
        }

        if (z2 != 0 && zahl % z2 == 0) {
            System.out.println(zahl + " ist durch " + z2 + " teilbar");
        }

        if (z3 != 0 && zahl % z3 == 0) {
            System.out.println(zahl + " ist durch " + z3 + " teilbar");
        }


    }
}