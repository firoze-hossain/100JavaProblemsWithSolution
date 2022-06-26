package com.roze;

import java.sql.Date;

/**
 *
 * @author firoze
 * How to SQL Date in java Program
 */
public class SQLDate54 {

    public static void main(String[] args) {
        String str = "2022-06-26";
        Date date = Date.valueOf(str);
        System.out.println(date);
    }

}
