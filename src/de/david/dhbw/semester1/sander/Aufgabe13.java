package de.david.dhbw.semester1.sander;

public class Aufgabe13 {


    public static void main(String[] args) {

        System.out.println("–––––––––––––––––––––––––––––––––––––––––––");
        Aufgabe13_Auto vw_passat = new Aufgabe13_Auto("VW Passat B8", 235, 160, 5);
        Aufgabe13_Auto audi_a3 = new Aufgabe13_Auto("Audi A3", 220, 150, 5);

        AutoInfoAusgabe(vw_passat);
        AutoInfoAusgabe(audi_a3);

        System.out.println(audi_a3.getTyp() + (audi_a3.ausleihen()? " ist nun Ausgeliehen" : " ist bereits ausgeliehen!"));
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––");
        AutoInfoAusgabe(audi_a3);
    }

    public static void AutoInfoAusgabe(Aufgabe13_Auto auto){

        String typ = auto.getTyp();
        int kmh = auto.getKmh();
        int ps = auto.getPs();
        int sitzplätze = auto.getSitzplätze();
        boolean isVerliehen = auto.isVerliehen();

        System.out.println("Auto Informationen zu: " + typ + "\n");
        System.out.println("Höchstgeschwindigkeiti in km/h = " + kmh);
        System.out.println("PS: " + ps);
        System.out.println("Sitzplätze: " + sitzplätze);
        System.out.println("Leihstatus: " + (isVerliehen? "Ausgeliehen" : "Verfügbar"));
        System.out.println("–––––––––––––––––––––––––––––––––––––––––––");

    }
}