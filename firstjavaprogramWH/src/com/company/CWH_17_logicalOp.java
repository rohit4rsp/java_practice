package com.company;

public class CWH_17_logicalOp {

    public static void main(String[] args) {
        System.out.println("for logical AND...");
        boolean a = true;
        boolean b = false;

        if(a && b){
            System.out.println("Y");

        }

        else {
            System.out.println("N");
        }

        System.out.println("\nfor logical OR...");
        boolean a1 = true;
        boolean b1 = false;

        if(a || b){
            System.out.println("Y");

        }

        else {
            System.out.println("N");
        }

        System.out.println("\nfor logical NOT...inverts value");
        System.out.println(!a);
        System.out.println(!b);

    }
}
