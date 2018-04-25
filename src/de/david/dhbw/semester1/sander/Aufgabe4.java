package de.david.dhbw.semester1.sander;

public class Aufgabe4 {


    public static void main(String[] args) {

        double money = 500;
        double zins = 1.05;
        int days = 360;
        double years = days/360;

        double zinsen = (money*Math.pow(zins,years))-money;
        System.out.println("In " + years + " Jahr(en) bekommt man " + zinsen + "€ Zinsen:");
        System.out.println("zinsen = " + zinsen);
        System.out.println("years = " + years);
        System.out.println("days = " + days);
        System.out.println("zins = " + zins);
        System.out.println("money = " + money);


    }
}