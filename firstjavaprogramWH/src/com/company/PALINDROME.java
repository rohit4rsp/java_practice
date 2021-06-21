package com.company;

//import java.util.Scanner;

public class PALINDROME {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. u want to check PALINDROME");

        int r,sum=0,temp;
        int n=454;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum) {
            System.out.println("palindrome number ");
        }
        else {
            System.out.println("not palindrome");
        }
    }


}
