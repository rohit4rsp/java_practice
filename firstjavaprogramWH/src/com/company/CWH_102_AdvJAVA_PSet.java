package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWH_102_AdvJAVA_PSet {
    public static void main(String[] args) {

        System.out.println("Problem 01");
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object obj: ar){           //printing using forEachLoop
            System.out.println(obj);
        }

        System.out.println("\nProblem 02");
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        System.out.println("\nProblem 03");
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));


        System.out.println("\nProblem 04");
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);


    }
}
