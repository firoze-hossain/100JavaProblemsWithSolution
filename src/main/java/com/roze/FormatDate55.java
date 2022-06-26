package com.roze;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author firoze
 * How to Date format in java Program
 */
public class FormatDate55 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date Format changed by Md. Firoze Hossain");

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date format with MM/dd/yyyy = " + strDate);

        formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date format with dd-MM-yyyy hh:mm:ss = " + strDate);

        formatter = new SimpleDateFormat("dd MM yyyy zzz");
        strDate = formatter.format(date);
        System.out.println("Date format with dd MM yyyy zzz = " + strDate);

        formatter = new SimpleDateFormat("E, dd-MM-yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date format with E, dd MM yyy HH:mm:ss z = " + strDate);

    }

}
