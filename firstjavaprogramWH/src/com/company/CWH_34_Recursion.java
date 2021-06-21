package com.company;

public class CWH_34_Recursion {
    static int factorial_iterative(int n){
        int fact = 1;
            for (int i=1;i<=n;i++) {
                fact= fact*i;
            }
            if(n==0 || n==1){
                return 1;
            }
        return fact;
    }
    static int factorial(int n){
        int fact = 1;

        if(n==0 || n==1){
            return 1;
        }
        else{
           return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {

        int a = factorial(1);
        System.out.println(a);
        System.out.println("factorial of 4 is "+factorial_iterative(4));






    }

}
