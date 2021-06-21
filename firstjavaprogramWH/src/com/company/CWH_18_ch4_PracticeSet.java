package com.company;

import java.util.Scanner;

public class CWH_18_ch4_PracticeSet {
    public static void main(String[] args) {

        //PROBLEM 2
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marksof sub1");
        int sub1 = sc.nextInt();

        System.out.println("enter marksof sub2");
        int sub2 = sc.nextInt();

        System.out.println("enter marksof sub3");
        int sub3 = sc.nextInt();

        System.out.println("enter marksof sub4");
        int sub4 = sc.nextInt();

        System.out.println("enter marksof sub5");
        int sub5 = sc.nextInt();

        float per=((sub1+sub2+sub3+sub4+sub5)/500f)*(100);
        System.out.println("\tPercentage is: "+per);

        if(per>=40 &&  sub1>=33 && sub2>=33 && sub3>=33 && sub4>=33 && sub5>=33){
            System.out.println("U have Passed!");

        }

        else {
            System.out.println("Sorry Lad....FAILED!");

        }

    }
}
