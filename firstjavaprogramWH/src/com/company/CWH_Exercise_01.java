package com.company;
import java.util.Scanner;


public class CWH_Exercise_01 {

    public static void main(String[] args) {

        System.out.println("enter your marks of 5 subjects out of 100 & get ur percentage");
        Scanner sc = new Scanner(System.in);
        int math= sc.nextInt();
        int eng= sc.nextInt();
        int sci= sc.nextInt();
        int hist= sc.nextInt();
        int geog= sc.nextInt();

        float sum= math+eng+sci+hist+geog;
        float percentage= (sum/500) * 100;
        System.out.println("total marks obtained:" +sum);
        System.out.println("percentage:"+ percentage);


    }
}
