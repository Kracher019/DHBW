package de.david.dhbw.semester1.sander;

public class Aufgabe13_Auto {

    private String typ;
    private int kmh;
    private int ps;
    private int sitzplätze;
    private boolean verliehen = false;


    public Aufgabe13_Auto(String typ, int kmh, int ps, int sitzplätze) {
        this.typ = typ;
        this.kmh = kmh;
        this.ps = ps;
        this.sitzplätze = sitzplätze;
    }

    public boolean isVerliehen() {
        return verliehen;
    }

    public int getKmh() {
        return kmh;
    }

    public int getPs() {
        return ps;
    }

    public int getSitzplätze() {
        return sitzplätze;
    }

    public String getTyp() {
        return typ;
    }

    public boolean ausleihen(){

        if(!isVerliehen()) {
            verliehen = !verliehen;
            return true;
        }

        return false;
    }


}