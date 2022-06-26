package com.roze;

import java.sql.Date;

/**
 *
 * @author firoze 
 * How to print date and time in java Program
 */
public class DateAndTime53 {

    public static void main(String[] args) {
        long milis = System.currentTimeMillis();
        Date date = new Date(milis);
        System.out.println(date);
    }

}
