package de.david.dhbw.semester2.wuerfel;

import java.util.Random;

public class Aufgabe2 {

    private static int[] F;

    static {
        randomF();
    }

    private static void randomF() {
        int n = 10;
        F = new int[n];
        for (int i = 0; i < n; i++) {
            F[i] = new Random().nextInt(30);
        }
    }

    public static void main(String[] args) {
        randomF();
        printF("InsertionSort-Initial: ");
        insertionSort();
        printF("InsertionSort-Sorted: ");
        System.out.println("\n");

        randomF();
        printF("SelectionSort-Initial: ");
        selectionSort();
        printF("SelectionSort-Sorted: ");

    }

    private static void selectionSort() {

        int p = F.length - 1;
        while (p > 0) {
            int g = 0;
            for (int i = 1; i <= p; i++) {
                if (F[i] > F[g]) g = i;
            }

            swap(p, g);
            p--;
        }
    }

    private static void insertionSort() {
        for (int i = 1; i < F.length; i++) {
            int m = F[i];
            int j = i;
            while (j > 0) {
                if (F[j - 1] >= m) {
                    F[j] = F[j - 1];
                    j--;
                } else break;
            }
            F[j] = m;
        }
    }

    private static void swap(int pos1, int pos2) {
        final int f1 = F[pos1];
        final int f2 = F[pos2];

        F[pos1] = f2;
        F[pos2] = f1;
    }

    private static void printF(String pref) {
        StringBuilder ini = new StringBuilder();
        for (int i : F) {
            ini.append(i).append(", ");
        }
        System.out.println(pref + ini.toString());

    }
}
