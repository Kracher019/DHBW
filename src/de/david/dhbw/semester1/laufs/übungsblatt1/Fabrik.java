package de.david.dhbw.semester1.laufs.übungsblatt1;

import java.util.Random;

public class Fabrik {

//    static List<Auto> cars = new ArrayList<Auto>();
    static Parkplatz firmenparkplatz = new Parkplatz(20);

    public static void main(String[] args) {

        for(int i=0; i<23; i++) {
            Auto auto = createRandomCar();
            auto.printInfo();
            System.out.println(firmenparkplatz.parkCar(auto)? "Das Auto wurde geparkt" :"Das Auto konnte nicht mehr geparkt werden!");

        }

    }

    public static Auto createRandomCar(){
        Random r = new Random();
        Auto auto = new Auto("Mercedes", (150-r.nextInt(20)), (5-r.nextInt(2)));
//        cars.add(auto);
        return auto;
    }

}
