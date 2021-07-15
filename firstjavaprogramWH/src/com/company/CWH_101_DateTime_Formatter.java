package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CWH_101_DateTime_Formatter {
    public static void main(String[] args) {

//        public String format(DateTimeFormatter formatter); ........SYNTAX

            //Parameter :
        //..The object of the formatter to be used is passed, and it can not be null.
            //Exception :
        //..This method throws DateTimeException.
            //Return Value :
        //..Returns the string in the format specified by the user.

        LocalDateTime dt = LocalDateTime.now();  //this is a date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");  //this is a format.....E=day, H=hours, m=min, a=am\pm.
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); //creating date string using date and format
        System.out.println(myDate);

        String myDate2 = dt.format(df2); //creating date string using date and format
        System.out.println(myDate2);


    }
}
