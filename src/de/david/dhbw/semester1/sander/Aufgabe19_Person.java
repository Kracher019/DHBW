package de.david.dhbw.semester1.sander;

public class Aufgabe19_Person {

    private int persNr;
    private String Nachname;
    private double Gehalt = 4036.35;

    public Aufgabe19_Person(int personalnummer, String Nachname, double Gehalt){
        this.persNr = personalnummer;
        this.Nachname = Nachname;
        this.Gehalt = Gehalt;

    }

    public Aufgabe19_Person(int personalnummer, String Nachname){
        this.persNr = personalnummer;
        this.Nachname = Nachname;

    }

    public void showInfo(){

        System.out.printf("Personalnummer: %d, Nachname: %s, Gehalt: %6.2f\n", persNr, Nachname, Gehalt);
        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
    }

    public int getPersNr() {
        return persNr;
    }

    public void setPersNr(int persNr) {
        this.persNr = persNr;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public double getGehalt() {
        return Gehalt;
    }

    public void setGehalt(double gehalt) {
        Gehalt = gehalt;
    }
}