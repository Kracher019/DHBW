package de.david.dhbw.semester1.laufs.übungsblatt2;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Kraftfahrzeug> kfz = new ArrayList<Kraftfahrzeug>();

        LKW lkw = new LKW("Mercedes", 320);
        PKW pkw = new PKW("VW", 130, 5);
        Motorrad mtr = new Motorrad("BMW", 60);

        kfz.add(lkw);
        kfz.add(pkw);
        kfz.add(mtr);



        for(Kraftfahrzeug fahrzeug : kfz){
            fahrzeug.ausgeben();
        }


    }

}
