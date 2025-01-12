 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL PC
 */
public class PatientController {
    
    public static void patient(Integer Patient_ID, String Name, String Phone, String Address, String Gender, Integer Age, String Blood_Group, String Major_Disease){
       new Model.DBPatient().patient(Patient_ID, Name, Phone, Address, Gender, Age, Blood_Group, Major_Disease);
       
    }
    
}
