package com.company;
import java.util.Scanner;

public class CWH_16_conditionals_if {

    public static void main(String[] args) {

        System.out.println("we are learning if condition in Java");
        System.out.println("\t Let's check for driving liscense");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible for driving!");
        }

        else {
            System.out.println("not eligible.");
        }


    }
}
