package de.david.dhbw.semester1.laufs.übungsblatt3;

public abstract class Kraftfahrzeug implements I_Fahrzeug,I_BetankbaresFahrzeug{

    private int ps;
    private String marke;
    private int tankgröße;
    private int fuel;
    private double verbrauchProKm;

    Kraftfahrzeug(String marke, int ps, int tankgröße, double verbrauchProKm){
        this.ps = ps;
        this.marke = marke;
        this.tankgröße = tankgröße;
        this.verbrauchProKm = verbrauchProKm;
    }

    public void ausgeben(){
        System.out.println("Marke: " + marke);
        System.out.println("Ps: " + ps);
    }

    public int getPS(){ return ps;}
    public void setPS(int newps){  ps = newps;}

    public String getmarke(){ return marke;}
    public void setMarke(String newmarke){  marke = newmarke;}

    @Override
    public void fahren(double streckeKm) {
        if((streckeKm/100)*verbrauchProKm >= fuel) System.out.println("Tank ist leer");
        else{
            System.out.println(streckeKm + " km gefahren!");
        }
    }

    @Override
    public void tanken(int liter) {
        fuel += liter;
        if(fuel > tankgröße) fuel=tankgröße;
    }
}
