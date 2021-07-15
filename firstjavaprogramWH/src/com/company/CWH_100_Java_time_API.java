package com.company;

import java.time.*;   //...total combined!
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CWH_100_Java_time_API {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());

        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
        System.out.println(d2.isNegative());


    }
}
