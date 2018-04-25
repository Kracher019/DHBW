package de.david.dhbw.semester1.laufs.übungsblatt4;

public class Aufgabe1 {

    public static void main(String[] args){
        divide(5);
    }

    static void divide(int i){
        try{
            System.out.println(i/0);
        }catch(Exception e){

            System.out.println(e.toString());
            System.out.println(e.getCause());
            System.out.println("");
            e.printStackTrace();
        }
    }
}
