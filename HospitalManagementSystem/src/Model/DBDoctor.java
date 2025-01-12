/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL PC
 */
public class DBDoctor {
    Statement stmt;
    ResultSet rs;
    Connection conn;
    
    public void doctor(Integer Doctor_ID, String Name, String Phone, String Address, String Type, String Password){
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO doctortbl VALUES('"+Doctor_ID+"', '"+Name+"', '"+Phone+"','"+Address+"','"+Type+"', '"+Password+"')");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
          
    }
}
