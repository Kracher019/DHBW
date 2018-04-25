package de.david.dhbw.semester1.laufs.übungsblatt5;

public class Aufgabe2 {

    public static void main(String[] args) {
        String s = "Dies ist ein langer String.";
        s = s.replace("langer ", "");
        System.out.println(s);

        String s2 = "Dies ist ein langer String.";
        StringBuffer sb = new StringBuffer(s2);
        sb.delete(12,19);
        System.out.println(sb.toString());
    }


}

/*
 Erzeugen Sie einen String mit dem Wert „Dies ist ein langer String.“.
Verwenden Sie die Methoden der Klasse String, sodass daraus einen String mit dem
Wert „Dies ist ein String.“ entsteht.
 */
