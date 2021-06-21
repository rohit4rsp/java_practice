package com.company;

public class fibonacciRecursion {
    static int fib(int n)             //...in case to print fibo series
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }


}
