package com.company;

public class CWH_35_Ps_Methods {
            //....Problem 1
    static void  multiplication(int x){
        int ans=0;
        for(int i=0; i<=10; i++){
            ans = x * i;
            System.out.printf("%d x %d = %d",x,i,ans);
            System.out.println("");
        }
        //return ans;          .....if void is not used in line4
    }

    //Problem 2
    static void pattern1(int n){     //n=rows
        for(int i=0;i<n;i++){            //for(int i=n;i>0;i--){
            for(int j=0; j<i+1 ;j++){    //     for(int j=0;j<i;j++){
                System.out.print("*");   //        System.out.print("*");      ....other pattern vise_versa
            }                            //      }
            System.out.println(" ");     //      System.out.println(" ");
        }                                //    }
    }
                       //Problem 3
    static int sumRec(int n){
        //base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

                 //Problem 4

    static void pattern2(int n){
        for(int i=n;i>0;i--){
            for(int j=0; j<i ;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
                //Problem 5
    static int fib(int n)                   //in case to print "nth" term of series
    {
        if (n == 1) {
            return 0;
        }
        else if(n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

                  //Problem 06
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result += a;
        }
        return result;
    }

                   //Problem 07  .....pblm2 using "recursion"

    static void pattern1_rec(int n){
        if(n>0) {
            pattern1(n - 1);             //..recursion

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



                  //...MAIN FUNCTION...
    public static void main(String[] args) {
        multiplication(5);              //....pblm01

        pattern1(4);                    //....pblm02

        int c = sumRec(3);              //....pblm03
        System.out.println(c);

        pattern2(4);                    //....pblm04

        int n = 9;                         //....pblm05
        System.out.println(fib(n));

        System.out.println(sum(2,3,5));       //....pblm06

        pattern1_rec(6);                        //....pblm07



    }
}
