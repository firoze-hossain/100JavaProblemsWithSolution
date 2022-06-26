package com.roze;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author firoze
 * How to print date and time both in java Program
 */
public class DateAndTime53_1 {

    public static void main(String[] args) {
        int day, month, year;
        int hour, minute, second;

        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        hour = date.get(Calendar.HOUR);
        minute = date.get(Calendar.MINUTE);
        second = date.get(Calendar.SECOND);

        System.out.println("Current Date: " + day + "-" + (month + 1) + "-" + year);
        System.out.println("Current Time: " + hour + ":" + minute + ":" + second);
    }
}
