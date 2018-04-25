package de.david.dhbw.semester1.sander;

import java.util.Arrays;

public class Aufgabe5 {


    public static void main(String[] args) {

        int zahl1 = 5;
        int zahl2 = 23;
        int zahl3 = 45;
        int[] numArray = {zahl1, zahl2, zahl3};

        Arrays.sort(numArray);
        double median;
        if (numArray.length % 2 == 0)
            median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
        else
            median = (double) numArray[numArray.length/2];

        System.out.println("Der Median von " + zahl1 +", "+ zahl2 +" und "+ zahl3 + " ist: " + median);

        
    }
}