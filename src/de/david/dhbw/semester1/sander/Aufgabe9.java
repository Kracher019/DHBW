package de.david.dhbw.semester1.sander;

import java.util.HashSet;

public class Aufgabe9 {


    public static void main(String[] args) {
        HashSet<String> codes = new HashSet<>();

        for(int z1=0; z1<9; z1++) {
//            System.out.println("Debug zahl1 " + z1);

            for (int z2=0; z2<=9; z2++) {
//                System.out.println("Debug zahl2 " + z2);

                for (int z3=0; z3<=9; z3++) {
//                    System.out.println("Debug zahl3 " + z3);
                    if(z1 == z2 | z2 == z3 | z1 == z3) continue;
                    String c = "" + z1 + z2 + z3;
                    codes.add(c);
                }
            }
        }


        int i = 1;
        for( String code : codes){

            System.out.print(code + " ");

            if(i==8){
                System.out.print("\n");
                i=0;
            }
            i++;
        }

    }

}