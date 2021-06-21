package com.company;
import java.util.Scanner;

public class CWH_10_Resulting_DataType {

    public static void main(String[] args) {

        byte x= 5;
        int y= 6;
        float b= 6.54f+ x;
        short z=8;
        int a= y + z;
        System.out.println(b);
        System.out.println(a);

        // increment & decrement operators

        Scanner sc= new Scanner(System.in);
        double p = sc.nextDouble();

        double k = ++p + 5;
        double m = p++ + 5;
        System.out.println("results");
        System.out.println(k);
        System.out.println(m);


    }
}
