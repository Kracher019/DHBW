package de.david.dhbw.semester1.laufs.übungsblatt1;


public class Parkplatz {

    Auto[] parkplätze;

    Parkplatz(int plätze){
        this.parkplätze = new Auto[plätze];

    }

    int parked = 0;

    public boolean parkCar(Auto a){
        if(!isFree()) return false;
        a.printInfo();
        parkplätze[parked] = a;
        parked++;
        return true;
    }

    public boolean isFree(){
        if(parked>=20) return false;
        return true;
    }
}
