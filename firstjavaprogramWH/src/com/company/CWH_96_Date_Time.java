package com.company;

/*
  Q)..How java stores a Date?
Date in java is stored in the form of a long number. This long number holds the number of milliseconds passed since 1 jan 1970

Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever We ask it for years passed

System.currentTimeMillis() returns no of milliseconds passed Once no. of ms are calculated, we can calculate minutes, seconds & years passed
*/

public class CWH_96_Date_Time {
    public static void main(String[] args) {

        long d = System.currentTimeMillis();  //......can be saved in a long number form variable
        System.out.println(d);


        System.out.println("\nno of milliseconds passed since 1st Jan 1970");
        System.out.println(System.currentTimeMillis());

        System.out.println("\nno of seconds passed since 1st Jan 1970");
        System.out.println(System.currentTimeMillis()/1000);

        System.out.println("\nno of minutes passed since 1st Jan 1970");
        System.out.println(System.currentTimeMillis()/1000/60);

        System.out.println("\nno of hours passed since 1st Jan 1970");
        System.out.println(System.currentTimeMillis()/1000/60/60);

        System.out.println("\nno of days passed since 1st Jan 1970");
        System.out.println(System.currentTimeMillis()/1000/60/60/24);

        System.out.println("\nno of years passed since 1st Jan 1970");
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

    }
}
