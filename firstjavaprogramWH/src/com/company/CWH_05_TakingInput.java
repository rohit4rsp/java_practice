package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {


    public static void main(String[] args) {   //psvm shortcut
        System.out.println("taking input from user");      //sout shortcut
        Scanner sc= new Scanner(System.in);          //input
        System.out.println("enter number 1");
        int a=sc.nextInt();           //inputnumber
        System.out.println("enter number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of numbers is: ");
        System.out.println(sum);

        //sc.hasNextInt(); ....for knowing next input
        //sc.next(); .....give first word,  not spaces!

    }
}
