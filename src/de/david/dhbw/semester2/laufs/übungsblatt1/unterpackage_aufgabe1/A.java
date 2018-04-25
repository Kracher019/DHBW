package de.david.dhbw.semester2.laufs.übungsblatt1.unterpackage_aufgabe1;

public class A {

    @Override
    public String toString(){

        return "Aufruf von toString() in " + this.getClass().getPackageName() +"." + this.getClass().getSimpleName();
    }
}
