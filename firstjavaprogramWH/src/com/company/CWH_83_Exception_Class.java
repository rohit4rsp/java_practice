package com.company;
/*The Exception class has the following important methods:
        1) Strings toString() executed when sout (e) is ran
        2) Void printStackTrace() - prints Stack trace
        3) String getMessage() - prints the exception message*/

import java.util.Scanner;

class MyException extends Exception{          //...#Exception classS
    @Override
    public String toString() {
        String s = "I am toString()";
        return s;
    }

    @Override
    public String getMessage() {
        String s = "I am getMessage()";
        return s;
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        String s ="Age cannot be greater than 125";
        return s;
    }

    @Override
    public String getMessage() {
        String s ="Make sure that the value of age entered is correct";
        return s;
    }
}


public class CWH_83_Exception_Class {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is an exception");    //...#throw
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }

    }
}
