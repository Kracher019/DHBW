package de.david.dhbw.semester1.laufs.übungsblatt3;

public class PKW extends Kraftfahrzeug {


    int sitzplätze;

    PKW(String marke, int ps, int sitzplätze){
        super(marke, ps, 50, 5.7);
        System.out.println(super.getmarke());
        this.sitzplätze = sitzplätze;
    }

    @Override
    public void ausgeben() {
        System.out.println("Typ: " + this.getClass().getSimpleName());
        super.ausgeben();
        System.out.println("Sitzplätze: " + sitzplätze);
    }
}
