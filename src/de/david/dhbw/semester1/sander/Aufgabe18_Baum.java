package de.david.dhbw.semester1.sander;

public class Aufgabe18_Baum {

    private int ghöhe,shöhe;
    String s = "*";


    public Aufgabe18_Baum(int gesamthöhe, int stammhöhe) {
        this.ghöhe = gesamthöhe;
        this.shöhe = stammhöhe;
        printTree();
    }

    private void printTree(){

        for(int i=1; i<=(ghöhe-shöhe);i++){
            System.out.println(buildLine(i));
        }
        for(int i=1; i<=shöhe;i++){
            System.out.println(buildLine(1));
        }



    }

    String buildLine(int zeile){
        StringBuilder str = new StringBuilder();

        for(int i=0;i<(ghöhe/2-zeile+2);i++){
            str.append(" ");
        }
        for(int i=0;i<zeile*2-1;i++){
            str.append(s);
        }

        return str.toString();
    }


    /*
    ghöhe/2-zeile+2
    */

}