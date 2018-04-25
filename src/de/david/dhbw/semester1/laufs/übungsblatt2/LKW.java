package de.david.dhbw.semester1.laufs.übungsblatt2;

public class LKW extends Kraftfahrzeug {

    int max_Last_in_Tonnen;

    LKW(String marke, int ps){
        super(marke, ps);
    }

    @Override
    public void ausgeben() {
        System.out.println("Typ: " + this.getClass().getSimpleName());
        super.ausgeben();
        System.out.println("Maximale Last in Tonnen: " + max_Last_in_Tonnen);
    }
}
