package de.david.dhbw.semester2.laufs.übungsblatt3;

public class Aufgabe3_Kunde {

    private static int akdnr = 12010;
    private int kdnr;
    private String vorname;
    private String nachname;
    private Anrede anrede;

    Aufgabe3_Kunde(Anrede anrede, String vorname, String nachname){
        kdnr = ++akdnr;
        this.vorname = vorname;
        this.nachname = nachname;
        this.anrede = anrede;
    }

    public int getKdnr() {
        return kdnr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getAnrede() {
        return anrede.pref;
    }

    @Override
    public String toString(){
        return getNachname() + ", " + getVorname();
    }

    public enum Anrede {
        m("Herr"),
        w("Frau"),
        u("");

        String pref;

        Anrede(String pref){
            this.pref = pref;
        }
    }
}
