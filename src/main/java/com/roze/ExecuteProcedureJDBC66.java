
package com.roze;

import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author firoze
 * How to execute Procedure in JDBC in java Program
 */
public class ExecuteProcedureJDBC66 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","firoze28");
            CallableStatement stat=(CallableStatement) con.prepareCall("{call simple(?,?)}");
           stat.setInt(1, 901);
           stat.setString(2, "Basir");
           
            stat.execute();
            System.out.println("Successfully done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
