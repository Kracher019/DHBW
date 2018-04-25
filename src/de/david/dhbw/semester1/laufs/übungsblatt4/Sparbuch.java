package de.david.dhbw.semester1.laufs.übungsblatt4;

public class Sparbuch {

    private int kontostand, zinssatzprozent, kontonummer;
    private String besitzer;
    static int lastkontonummer = 10001;

    Sparbuch(String besitzer, int kontostand, int zinssatzprozent){
        this.besitzer = besitzer;
        this.kontostand = kontostand;
        this.zinssatzprozent = zinssatzprozent;
        this.kontonummer = lastkontonummer+1;

    }
    Sparbuch(String besitzer, int zinssatzprozent){
        this.besitzer = besitzer;
        this.kontostand = 0;
        this.zinssatzprozent = zinssatzprozent;
        this.kontonummer = lastkontonummer+1;
    }
    Sparbuch(String besitzer){
        this.kontostand = 0;
        this.zinssatzprozent = 3;
        this.besitzer = besitzer;
        this.kontonummer = lastkontonummer+1;
    }

    public void einzahlen(int einzahlung){
        if(!checkExistens()) throw new KontoException("Konto Existiert nicht mehr!");
        kontostand+= einzahlung;
    }

    public void abheben(int abheben){
        if(!checkExistens()) throw new KontoException("Konto Existiert nicht mehr!");
        if(kontostand-abheben<0) throw new KontoException("Konto überzogen!");
        kontostand-=abheben;
    }

    public void auflösen(){
        if(!checkExistens()) throw new KontoException("Konto wurde bereits aufgelöst!");
        besitzer="";
    }

    public void verzinsen(){
        if(!checkExistens()) throw new KontoException("Konto Existiert nicht mehr!");

        kontostand = kontostand*(zinssatzprozent/100);
    }

    public int getKontostand(){
        if(!checkExistens()) throw new KontoException("Konto Existiert nicht mehr!");
        return kontostand;
    }

    public int getKontonummer() {
        if(!checkExistens()) throw new KontoException("Konto Existiert nicht mehr!");
        return kontonummer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public void setZinssatzprozent(int zinssatzprozent) {
        if(!checkExistens()) throw new KontoException("Konto Existiert nicht mehr!");
        this.zinssatzprozent = zinssatzprozent;
    }

    private boolean checkExistens(){
        return (besitzer=="" ? false : true);
    }

}

/*
 Implementieren Sie eine Klasse Sparbuch mit den Methoden einzahlen(int eur),
abheben(int eur) auflösen() verzinsen() und mindestens den Attributen kontostand,
zinssatzProzent, kontonummer und besitzer.
Schreiben Sie die eigenen Exception-Klassen KontostandException und
KontoExistiertNichtException, sodass diese behandelt werden müssen. Werfen Sie in
der Klasse Sparbuch alle sinnvollen Exceptions, die bei der Benutzung der KontoKlasse
auftreten können (z.B. Kontostand reicht nicht aus, um Betrag abzuheben,
Konto wurde bereits aufgelöst). Deklarieren Sie alle Attribute der Klasse als private
und implementieren Sie getter und setter für alle gewünschten
Schreib/Lesemöglichkeiten.
 */