package de.david.dhbw.semester1.laufs.übungsblatt4;

public class Aufgabe5 {
    public static void main(String[] args) {
        int maxObjects = 100000;
        Aufgabe5[] objectPool = new Aufgabe5[maxObjects];
        for (int i = 0; i < maxObjects; i++)  {
            objectPool[i] = new Aufgabe5();
        }
    }
}