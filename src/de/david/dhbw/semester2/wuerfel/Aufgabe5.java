package de.david.dhbw.semester2.wuerfel;

import java.util.Scanner;

public class Aufgabe5 {

    private static int NO_KEY = -1;
    private static int[] F = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        System.out.println("Bitte gibt eine ganzzahlige Zahl ein:\n");
        Scanner scan = new Scanner(System.in);
        int k;
        try {
            k = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Du hast keine Zahl eingegeben. Beende Programm");
            return;
        }

        int erg = search(k);
        if (erg != NO_KEY) {
            System.out.println("Gefunden an der " + erg + ". Stelle");
        } else {
            System.out.println("Fehler: Zahl wurde nicht gefunden");
        }

    }

    private static int search(int key) {
        int m = F[(F.length / 2) - 1];
        int i, j = F.length;
        if (key > m) {
            i = key + 1;

        } else {
            i = 0;
        }
        for (int h = i; h < j; h++) {
            if (key == F[h]) {
                return h + 1;
            }
        }
        return NO_KEY;
    }

}
