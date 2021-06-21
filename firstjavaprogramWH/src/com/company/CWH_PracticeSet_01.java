package com.company;
import java.util.Scanner;

public class CWH_PracticeSet_01 {

    public static void main(String[] args) {


        //sgpa calculations

        System.out.println("know your cgpa. enter marks of 3 subjects");
        Scanner sc = new Scanner(System.in);
        float math= sc.nextInt();
        float eng= sc.nextInt();
        float sci= sc.nextInt();

        float cgpa= (math+eng+sci)/30;

        System.out.println(cgpa);


        //input name

        System.out.println("enter your name");
        String name= sc.next();
        System.out.println("welcome " + name + " have a good day!");


        //km to miles
        System.out.println("kilometers to miles.......enter km:");

        double km= sc.nextDouble();
        double mile= (km/0.62137);

        System.out.println(km +" is equal to "+mile +" miles.");


        //using hasNextInt()
        System.out.println("enter your number:");
        Scanner st = new Scanner(System.in);
        System.out.println(st.hasNextInt());



    }
}
