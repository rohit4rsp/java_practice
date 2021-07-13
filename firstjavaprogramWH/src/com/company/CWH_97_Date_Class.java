package com.company;

/*
  --Date Class In Java :
   *Date class in java is available in java.util package.
   *This class provides the instant in time with precision of millisecond.
*/
import java.util.Date;   // ...or import java.util.*;

public class CWH_97_Date_Class {
    public static void main(String[] args) {

 /*  --Constructors of the date class :
      *Date(): This constructor is used when we need an object of current date and time.
      *Date(long milliseconds): This constructor creates a date object from the number of milliseconds passed since January 1, 1970.
  */
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());
        System.out.println(d.getDate());   //returns the day of the month represented by this date
        System.out.println(d.getMinutes());  //..returns the number of minutes past the hour represented by this date.
        System.out.println(d.getYear());    //..returns the year represented by this date, minus 1900.

//        long b = 1200424324;
//        Date d1 = new Date(b);
//        System.out.println("after "+b+" milliseconds , the date is " +d1);

//        Date d1= new Date(2021,12, 24);  //both dates are different
//        System.out.println(d1.compareTo(d));    //Returns 0 if the dates are equal; else, returns 1.

//        Date d1= new Date(2021,5,23);
//        System.out.println("The number of milliseconds passed since Jan 1, 1970 :" +d1.getTime() );



    }
}
