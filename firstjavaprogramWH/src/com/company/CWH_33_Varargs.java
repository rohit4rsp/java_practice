package com.company;

public class CWH_33_Varargs {
    //static int sum(int a,int b){
    //  return a+b;
    //}
    //static int sum(int a,int b,int c){
    //  return a+b+c;
    //}
    static int sum(int ...arr){
        // available as int [] arr;
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    static int sum1(int x,int ...arr){             //..x will be compulsory arguments
        int result = x;
        for(int a: arr) {
            result += a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to VARARGS tutorial");
        System.out.println("the sum of 3 and 5 is "+sum(3,5));
        System.out.println("the sum of 3 and 5 abd 7 is "+sum(3,5,7));
        System.out.println("sum of 4 & 5 is " + sum1(4,5));

    }
}
