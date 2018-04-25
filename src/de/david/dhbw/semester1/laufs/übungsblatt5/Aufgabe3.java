package de.david.dhbw.semester1.laufs.übungsblatt5;

public class Aufgabe3 {

    public static void main(String[] args) {

        String date = "2012-12-06 14:21:46.156";
        int year = Integer.valueOf(date.substring(0,4));
        int month = Integer.valueOf(date.substring(5,7));
        int day = Integer.valueOf(date.substring(8,10));;
        String time = String.valueOf(date.substring(11, 16));
        int sec = Integer.valueOf(date.substring(17,19));;
        int millisec = Integer.valueOf(date.substring(20,23));;

        System.out.println(day+"."+month+"."+year+", Uhrzeit: " + time +", "+ sec+" Sekunden "+millisec+" Millisekunden");
    }


}

/*
Erzeugen Sie einem String mit dem Wert „2012-12-06 14:21:46.156“. Der String
enthält einen Zeitpunkt (6.12.2012, Uhrzeit: 14:21, 46 Sekunden 156 Millisekunden).
Extrahieren Sie aus diesem String die einzelnen Zahlenwerte, sodass diese die
korrekten Werte enthalten, also z.B.
int jahr mit dem Wert 2012
int monat mit dem Wert 12,
usw.
Geben Sie nun das Ergebnis im Format „6.12.2012, Uhrzeit: 14:21, 46 Sekunden
156 Millisekunden“ aus.
 */
