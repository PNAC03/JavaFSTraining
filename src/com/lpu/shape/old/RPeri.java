package com.lpu;

public class RPeri {
    double len;
    double bdt;

    RPeri(double len, double bdt) {
        this.len = len;
        this.bdt = bdt;
    }

    double getperimeter(){
        return(2*len+2*bdt);
    }

    public static void main(String[] args) {
        RPeri obj = new RPeri(11.000000, 2.000000);
        System.out.println("The Perimeter is " + obj.getperimeter());
    }
}





