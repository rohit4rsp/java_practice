package com.company;

import java.util.Locale;

public class CWH_14_string_methods {

    public static void main(String[] args) {

        String a = "Prithviraj";
        String a1 = new String("Rohit");
        System.out.println(a+ " is a good boy and weighs 100kg.");

        // Strings Methods

        /*int len = a.length();                                 //string.length();
        System.out.println("length is: "+len);*/


        /*String low = a.toLowerCase();                           //string.toLowerCase();
        System.out.println("lowercase is: "+low);*/


        /*String nonTrimmedString = "      Sneha     ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();           // string.trim();
        System.out.println(trimmedString);*/


       /* System.out.println(a.substring(2));  */         // string.substring(index); ...from index to end

        /*System.out.println(a.substring(2,5));*/           // string.substring(index); ...from index to before given end

        /*System.out.println(a.replace('i','o'));*/          //string.replace();
        /*System.out.println(a1.replace("t","raj"));*/         //targeted string changed


    }
}
