package de.david.dhbw.semester2.laufs.übungsblatt1;

import de.david.dhbw.semester2.laufs.übungsblatt1.unterpackage_aufgabe1.A;

public class Aufgabe2 {

    public static void main(String[] args) {
        System.out.println(new A().toString());
        A a = new A(){
          @Override
          public String toString(){
              return "Aufruf von toString() in anonymer Klasse";
          }
        };

        System.out.println(a.toString());
    }
}
