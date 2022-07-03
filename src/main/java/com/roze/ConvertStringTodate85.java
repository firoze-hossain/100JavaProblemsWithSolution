package com.roze;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author firoze
 * How to convert string to date in java program
 */
public class ConvertStringTodate85 {

    public static void main(String[] args) throws ParseException {
        String date1 = "04/07/2022";
        String date2 = "05-July-2022";
        String date3 = "07 06,2022";
        String date4 = "Thu, July 07 2022";
        String date5 = "Thu, July 08 2022 11:25:08";
        String date6 = "05-July-2022 10:38:28";

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat formatter3 = new SimpleDateFormat("MM dd,yyyy");
        SimpleDateFormat formatter4 = new SimpleDateFormat("E, MMM dd yyyy");
        SimpleDateFormat formatter5 = new SimpleDateFormat("E, MMM dd yyyy hh:mm:ss");
        SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");

        Date datep1 = formatter1.parse(date1);
        Date datep2 = formatter2.parse(date2);
        Date datep3 = formatter3.parse(date3);
        Date datep4 = formatter4.parse(date4);
        Date datep5 = formatter5.parse(date5);
        Date datep6 = formatter6.parse(date6);

        System.out.println(date1 + "\t" + datep1);
        System.out.println(date2 + "\t" + datep2);
        System.out.println(date3 + "\t" + datep3);
        System.out.println(date4 + "\t" + datep4);
        System.out.println(date5 + "\t" + datep5);
        System.out.println(date6 + "\t" + datep6);
    }

}
