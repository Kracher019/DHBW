package de.david.dhbw.semester2.wuerfel;

import java.util.Random;

public class Aufgabe3 {

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
        printF("BubbleSort-Initial: ");
        bubbleSort();
        printF("BubbleSort-Sorted: ");
        System.out.println("\n");
    }

    private static void bubbleSort() {
        int j = F.length - 1;
        boolean nc = false;
        while (!nc) {
            nc = true;
            for (int i = 0; i < j; i++) {
                if (F[i] > F[i + 1]) {
                    swap(i, i + 1);
                    nc = false;
                }
            }
            j--;
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
