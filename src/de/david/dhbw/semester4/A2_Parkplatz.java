package de.david.dhbw.semester4;

class A2_Parkplatz {

    private static int pnumber = 0;
    int number = pnumber++;
    boolean free = true;
    private A2_Auto auto = null;
    private long time = 0L;

    void parken(A2_Auto auto) {
        this.auto = auto;
        free = false;
        time = System.currentTimeMillis();
        System.out.println("--> Auto Nr.: " + auto.carNumber + " parked in " + number);
    }

    void verlassen() {
        long stayed = System.currentTimeMillis() - time;
        System.out.println("<-- Auto Nr.: " + auto.carNumber + " stayed " + ((int) stayed / 1000) + " in Parkplatz: " + number);
        auto = null;
        free = true;
    }

    boolean free() {
        return free;
    }
}
