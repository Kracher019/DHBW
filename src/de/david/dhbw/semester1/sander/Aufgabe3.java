package de.david.dhbw.semester1.sander;

public class Aufgabe3 {


    public static void main(String[] args) {

        double radius = 3.4;
        double Fläche,Umfang;
        double pi = 3.1415;

        Fläche = pi*(radius*radius);
        Umfang = 2*pi*radius;

        System.out.println("Der Kreis mit dem Radius " + radius + " hat folgenden Fläche und Umfang: ");
        System.out.println("Fläche = " + Fläche);
        System.out.println("Umfang = " + Umfang);


    }
}