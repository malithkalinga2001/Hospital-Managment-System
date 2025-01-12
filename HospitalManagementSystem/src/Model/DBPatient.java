/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL PC
 */
public class DBPatient {
    Statement stmt;
    ResultSet rs;
    Connection conn;
    
    public void patient(Integer Patient_ID, String Name, String Phone, String Address, String Gender, Integer Age, String Blood_Group, String Major_Disease){
        try {
            stmt = DBConnection.getStatementConnection(); //create statment-> Statement statement = connection.createStatement();
            stmt.executeUpdate("INSERT INTO parienttbl VALUES('"+Patient_ID+"', '"+Name+"', '"+Phone+"','"+Address+"','"+Gender+"', '"+Age+"', '"+Blood_Group+"', '"+Major_Disease+"')");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
          
    }
    
}
