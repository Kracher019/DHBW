package de.david.dhbw.semester1.laufs.übungsblatt2;

public class Motorrad extends Kraftfahrzeug {

    Motorrad(String marke, int ps){
        super(marke, ps);
    }

    @Override
    public void ausgeben() {
        System.out.println("Typ: " + this.getClass().getSimpleName());
        super.ausgeben();
    }
}
