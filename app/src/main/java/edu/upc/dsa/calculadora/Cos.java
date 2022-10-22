package edu.upc.dsa.calculadora;

public class Cos implements Operations{

    @Override
    public double operation(double a, double b) {
        double result;
        if(b==0) //Radians
            result =  a;
        else //Degrees, b==1
            result = a*(Math.PI/180);
        return Math.cos(result);

    }
}
