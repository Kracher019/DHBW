package de.david.dhbw.semester1.laufs.übungsblatt4;

public class Dividierer {

    public double dividiere(int a, int b){
     double result = 0;

//     if(b==0) throw new RuntimeException();
     if(b==0) throw new DivisionDurchNullException();

     result = a/b;
        return result;
    }
}
