package com.company;

public class CWH_13_Strings {

    public static void main(String[] args) {

        //String name= new String("Rohit");   ......can be written

        String name="Rohit";
        System.out.print("the name is:");
        System.out.println(name);


        //Ways to Print

        int a= 8;
        float b = 5.909f;
        System.out.printf("the value of a is %d and b is %f",
                a, b);                                       //format specifier %d for double
        System.out.println("");
        System.out.format("the value of a is %d and b is %f", // similar to above
                a, b);
        System.out.printf("the value of a is %d and b is %8.2f",a, b);  //%8.2 shows occupying 8spaces & 2nos after decimalpoint




    }
}
