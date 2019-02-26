package de.david.dhbw.semester4;


public class A2_Parkhaus {

    static A2_Parkplatz[] parkplätze = new A2_Parkplatz[10];

    public static void main(String[] args) {

        for (int i = 0; i < parkplätze.length; i++) {
            parkplätze[i] = new A2_Parkplatz();
        }

        for (int i = 1; i < 26; i++) {
            new A2_Auto();
        }
    }


    synchronized static A2_Parkplatz getFreeParkplatz() {
        for (A2_Parkplatz parkplatz : parkplätze) {
            if (parkplatz.free()) {
                parkplatz.free = false;
                return parkplatz;
            }
        }

        return null;

    }
}
