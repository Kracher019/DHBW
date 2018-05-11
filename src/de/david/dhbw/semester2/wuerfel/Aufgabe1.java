package de.david.dhbw.semester2.wuerfel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {
        loop();
    }


    private static void loop() {
        for (int i = 0; i <= 60; i++) {
            printFib(i);
        }
    }

    private static int scan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte gib eine ganzzahlige Zahl ein:\n");
        int n = 0;
        try {
            n = scan.nextInt();
        } catch (InputMismatchException ec) {
            System.out.println("Das war wohl keine Zahl.\nProgramm wird beendet.");
        }
        return n;
    }

    private static void print(int n) {
        System.out.println("n = " + n);
        printFib(n);
        printFak(n);

    }

    private static void printFib(int n) {
        System.out.println("Fibonacci Iterativ: " + fibonacciIte(n));
        System.out.println("Fibonacci Recursiv: " + fibonacciRec(n));
    }

    private static void printFak(int n) {
        System.out.println("Fakultät Iterativ: " + fakultaetIte(n));
        System.out.println("Fakultät Recursiv: " + fakultaetRec(n));
    }


    private static long fibonacciIte(long n) {
        long erg = 0, n2 = 1, n1 = 1;
        for (int i = 0; i < n; i++) {
            erg = n2;
            n2 = n1;
            n1 = erg + n2;
        }
        return erg;
    }

    private static long fibonacciRec(long n) {
        if ((n == 1) || (n == 0)) return n;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    private static long fakultaetRec(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return n * fakultaetRec(n - 1);
    }

    private static long fakultaetIte(long n) {
        if (n == 0) return 0;
        long ergb = 1;
        while (n > 0) {
            ergb = ergb * n--;
        }

        return ergb;
    }

}
