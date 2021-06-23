                    // **** INTERFACES ****
package com.company;

interface Bicycle{
    void  applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycles implements Bicycle{
    int a = 45;
    void blowHorn(){
        System.out.println("PO PO po po");
    }
    @Override
    public void applyBrake(int decrement) {       //...implemented methods of interfaces: use 'Public'
        this.a = a - decrement;
        System.out.println("Applying Brake");
    }
    @Override
    public void speedUp(int increment) {
        this.a = a + increment;
        System.out.println("Applying speedUp");
    }
}

public class CWH_54_Interfaces {
    public static void main(String[] args) {

        AvonCycles cycle = new AvonCycles();
        cycle.applyBrake(1);
//        cycle.speedUp(3);
        System.out.println(cycle.a);
    }
}
