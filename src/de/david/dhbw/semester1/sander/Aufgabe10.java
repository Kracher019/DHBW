package de.david.dhbw.semester1.sander;


public class Aufgabe10 {


    public static void main(String[] args) {

        int startzahl = 1;

        for (int i = 0; i<8; i++){

            for(int j = 0; j<8; j++){
                System.out.printf("%5d", j+startzahl);
            }
            System.out.println("\n");
            startzahl++;
        }

    }
}