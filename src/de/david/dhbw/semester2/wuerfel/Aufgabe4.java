package de.david.dhbw.semester2.wuerfel;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe4 {

    private static int[] array;

    static {
        randomF();
    }

    private static void randomF() {
        int n = 10;
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Random().nextInt(100);
        }
    }

    public static void main(String[] args) {

        printF("MergeSort-Initial: ");
        array = mergeSort(array);
        printF("MergeSort-Sorted: ");
        System.out.println("\n");
    }

    private static int[] mergeSort(int[] F) {
        if (F.length == 1) return F;
        else {
            int mid = F.length / 2;
            int[] F1 = mergeSort(Arrays.copyOfRange(F, 0, mid));
            int[] F2 = mergeSort(Arrays.copyOfRange(F, mid, F.length));

            return merge(F1, F2);
        }

    }

    private static int[] merge(int[] F1, int[] F2) {
        int[] F = new int[F1.length + F2.length];

        int pos = 0;
        while (F1.length > 0 && F2.length > 0) {
            int toadd;
            if (F1[0] < F2[0]) {
                toadd = F1[0];
                F1 = Arrays.copyOfRange(F1, 1, F1.length);
            } else {
                toadd = F2[0];
                F2 = Arrays.copyOfRange(F2, 1, F2.length);
            }
            F[pos] = toadd;
            pos++;
        }
        if (F1.length == 0) {
            for (int aF2 : F2) {
                F[pos] = aF2;
                pos++;
            }
        } else {
            for (int aF1 : F1) {
                F[pos] = aF1;
                pos++;
            }
        }
        return F;
    }

    private static void printF(String pref) {
        StringBuilder ini = new StringBuilder();
        for (int i : array) {
            ini.append(i).append(", ");
        }
        System.out.println(pref + ini.toString());

    }
}
