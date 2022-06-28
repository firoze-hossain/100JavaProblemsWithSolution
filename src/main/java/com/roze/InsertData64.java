package com.roze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author firoze 
 * How to insert data in table using JDBC in java Program
 */
public class InsertData64 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "firoze28");
            PreparedStatement pst = con.prepareStatement("insert into person values(1,'Md. Firoze Hossain','01765002428')");
            int i = pst.executeUpdate();
            System.out.println(i + "record inserted");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
