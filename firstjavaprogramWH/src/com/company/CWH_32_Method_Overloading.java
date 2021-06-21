package com.company;

public class CWH_32_Method_Overloading {

    static void foo(){
        System.out.println("Good morning Bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " Bro!");
    }

    static void foo(int a,int b){
        System.out.println("Good morning " + a + " Bro!");
        System.out.println("Good morning " + b + " Bro!");
    }

    /*static int foo(int a,int b){                   //.....this will not work
        System.out.println("Good morning " + a + " Bro!");
        System.out.println("Good morning " + b + " Bro!");
        retutn 3;
    }*/

    static void change(int a){
        a=98;
    }

    static void change2(int [] arr){
        arr[0]=98;
    }

    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }


    public static void main(String[] args) {
        //tellJoke();
        //int[] marks = {44,45,55,67,88};

        //case:1  Changing the Integer
        //int x = 45;
        //change(x);
        //System.out.println("value of x after running change is: "+x);

        //case:2 Changing the array
        //change2(marks);
        //System.out.println("value of index-0 after running change2 is: "+marks[0]);

        //METHOD OVERLOADING
        foo();
        foo(3000);
        foo(3,4);
        //Arguments are actual!


    }
}
