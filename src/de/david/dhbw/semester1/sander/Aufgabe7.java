package de.david.dhbw.semester1.sander;

import java.util.Random;

public class Aufgabe7 {


    public static void main(String[] args) {

        int one =0;
        int two =0;
        int three =0;
        int four =0;
        int five =0;
        int six =0;

        for(int i=0; i<1000; i++){
            Random r = new Random();

            int zzahl = (int) (r.nextInt(6)+1);
            switch (zzahl) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
            }

        }

        System.out.println("Einsen: " + one);
        System.out.println("Zweien: " + two);
        System.out.println("Dreien: " + three);
        System.out.println("Vieren: " + four);
        System.out.println("Fünfen: " + five);
        System.out.println("Sechsen: " + six);

    }
}