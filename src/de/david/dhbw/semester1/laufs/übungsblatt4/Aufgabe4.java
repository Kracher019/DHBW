package de.david.dhbw.semester1.laufs.übungsblatt4;

public class Aufgabe4 {

    public static void main(String[] args) {

        Sparbuch sb = new Sparbuch("Mustermann, Max");
        sb.einzahlen(1000);
        sb.verzinsen();
        sb.einzahlen(200);
        System.out.println(sb.getKontostand());
        sb.auflösen();
        sb.auflösen();
    }
}
