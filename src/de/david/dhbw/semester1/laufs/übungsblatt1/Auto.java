package de.david.dhbw.semester1.laufs.übungsblatt1;

public class Auto {

    private String marke;
    private int ps;
    private static int aktuellesnr = 10000;
    private int seriennummer;
    private int sitzplätze;

    public Auto(String marke, int ps, int sitzplätze){
        this.seriennummer = ++aktuellesnr;
        this.marke = marke;
        this.ps = ps;
        this.sitzplätze = sitzplätze;

    }

    public void printInfo(){
        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");

        System.out.println("Fahrzeug-Seriennummer: " + seriennummer);
        System.out.println("Marke: " + marke);
        System.out.println("PS: " + ps);
        System.out.println("Sitzplätze: " + sitzplätze);

        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
    }
}


/*
Eigenschaften „Marke“, „Anzahl PS“,
„Seriennummer“ und „Anzahl Sitzplätze“ hat. Die Seriennummer soll automatisch in
Form einer laufenden Nummer erzeugt werden, sodass keine zwei Autos eine
identische Seriennummer haben können. Die Klasse Auto soll eine Methode haben,
welche alle Eigenschaften des Autos gut lesbar in der Konsole ausgibt. Schreiben
Sie eine weitere Klasse „Fabrik“ mit einer Methode „produziereAuto“, welche AutoObjekte
mit den gewünschten Eigenschaften erzeugt und zurückgibt. Erzeugen sie
unter Nutzung der Fabrik-Klasse Auto-Objekte derselben Marke, die zufällige aber
sinnvolle Werte für die Anzahl der PS und die Anzahl der Sitzplätze haben.
*/