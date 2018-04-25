package de.david.dhbw.semester1.laufs.übungsblatt2;

public abstract class Kraftfahrzeug {

    private int ps;
    private String marke;

    Kraftfahrzeug(String marke, int ps){
        this.ps = ps;
        this.marke = marke;
    }

    public void ausgeben(){
        System.out.println("Marke: " + marke);
        System.out.println("Ps: " + ps);
    }

    public int getPS(){ return ps;}
    public void setPS(int newps){  ps = newps;}

    public String getmarke(){ return marke;}
    public void setMarke(String newmarke){  marke = newmarke;}

}
