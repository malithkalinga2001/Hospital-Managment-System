/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DELL PC
 */


import View.Diagnosis;
import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class DBDiagnosis {
    
    Statement stmt;
    ResultSet rs;
    Connection conn;
    
    public void diagnosisSave(Integer PatientID, String Symptom, String Diagnosis, String Medicines, String WardReq, String TypeWard){
        try {
               stmt = DBConnection.getStatementConnection();
               stmt.executeUpdate("insert into parientdiagnosis values('"+PatientID+"','"+Symptom+"','"+Diagnosis+"','"+Medicines+"','"+WardReq+"','"+TypeWard+"')");
               JOptionPane.showMessageDialog(null, "Successfully Updated");
               
               
           } catch (Exception e) {
               e.printStackTrace();
           }
        
        
    }
}
