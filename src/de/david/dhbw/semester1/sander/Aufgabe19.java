package de.david.dhbw.semester1.sander;

public class Aufgabe19 {


    public static void main(String[] args) {
        System.out.println("");

        Aufgabe19_Person p1 = new Aufgabe19_Person(10101, "Friedolin", 6540.57);
        Aufgabe19_Person p2 = new Aufgabe19_Person(10102, "Gustav");
        Aufgabe19_Person p3 = new Aufgabe19_Person(10103, "Peterson");

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();

        p1.setGehalt(6938.49);
        p2.setGehalt(4215.08);

        p1.showInfo();
        p2.showInfo();
    }

}