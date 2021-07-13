package com.company;
import java.util.Calendar;

/*
 Field	                                            Default Value

ERA	AD
YEAR	                                                1970
MONTH	                                                JANUARY
DAY_OF_MONTH	                                        1
DAY_OF_WEEK	                                            the first day of week
WEEK_OF_MONTH                                          	0
DAY_OF_WEEK_IN_MONTH                                   	1
AM_PM	                                                AM
HOUR, HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND      	0

*/
public class CWH_98_Calendar_Class {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(" The maximum no. of weeks in a year : "+ c.getMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println(c.getWeeksInWeekYear());


    }
}
          //some Errors Caused......due to ide version