/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
//import static model.DBConnection.conn;
/**
 *
 * @author DELL PC
 */

public class DBConnection {
    static Connection conn;
    static Statement stmt = null;
 
     public static Statement getStatementConnection() {
        try{
            //Establish the connection
            
            String url = "jdbc:mysql://localhost:3306/hospital_information";
            conn = DriverManager.getConnection(url, "root", "");
            
            //create the connection
            stmt = conn.createStatement();
                  
            
        }
        catch(Exception e){
         e.printStackTrace();
        }
        return stmt;
    }
    //close connection
    public static void closeCon() throws SQLException {
        conn.close();
    }
    
}
