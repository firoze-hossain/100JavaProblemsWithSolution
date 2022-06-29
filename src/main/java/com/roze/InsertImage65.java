package com.roze;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author firoze 
 * How to insert image using JDBC in java Program
 */
public class InsertImage65 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "firoze28");
            PreparedStatement pst = con.prepareStatement("insert into person values(?,?,?,?)");
            pst.setInt(1, 501);
            pst.setString(2, "Md. Firoze");
            pst.setString(3, "01611922882");
            FileInputStream fis = new FileInputStream("/home/firoze/Downloads/firoze.jpg");
            pst.setBinaryStream(4, fis, fis.available());
            int record = pst.executeUpdate();
            System.out.println(record + "has been added");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
