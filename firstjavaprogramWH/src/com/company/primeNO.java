package com.company;

import java.util.Scanner;

public class primeNO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to check whether prime or not!");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {          // num/2.....imp logic
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }

    }
}
