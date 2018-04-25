package de.david.dhbw.semester1.laufs.übungsblatt3;

public class Motorrad extends Kraftfahrzeug {

    Motorrad(String marke, int ps){
        super(marke, ps,12,2.13);
    }

    @Override
    public void ausgeben() {
        System.out.println("Typ: " + this.getClass().getSimpleName());
        super.ausgeben();
    }
}
