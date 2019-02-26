package de.david.dhbw.semester4;

import java.util.Random;

public class A2_Auto extends Thread {

    private static int autoNummer = 1;
    private static Random random = new Random();
    int carNumber;
    private A2_Parkplatz parkplatz = null;

    A2_Auto() {
        carNumber = autoNummer++;
        start();
    }

    @Override
    public void run() {

        int stayTime = (random.nextInt(5) + random.nextInt(10)) * 1000;
        parken();
        try {
            sleep(stayTime);
            verlassen();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private void parken() {
        while (parkplatz == null) {
            parkplatz = A2_Parkhaus.getFreeParkplatz();
        }
        synchronized (A2_Parkhaus.parkplätze[parkplatz.number]) {
            parkplatz.parken(this);
        }
    }

    private void verlassen() {
        parkplatz.verlassen();
    }
}
