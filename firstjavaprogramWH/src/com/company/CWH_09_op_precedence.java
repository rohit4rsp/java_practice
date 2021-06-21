package com.company;

public class CWH_09_op_precedence {

    public static void main(String[] args) {

        int a = 6*5-34/2;  //BODMAS....  left to right
        int b = 60/5-34*2;     // left to right..... precedene & associativity

        System.out.println(a);
        System.out.println(b);
    }
}
