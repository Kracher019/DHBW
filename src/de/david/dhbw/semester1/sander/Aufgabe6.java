package de.david.dhbw.semester1.sander;

public class Aufgabe6 {


    public static void main(String[] args) {

        int sterne = 6;
        String s = "*";

        for(int i=0;i<=sterne;i++){ //Zeilen

                for (int j = 0; j < i; j++) { //Zeile
                    System.out.print(s);
                }

                System.out.println("");

        }

    }
}