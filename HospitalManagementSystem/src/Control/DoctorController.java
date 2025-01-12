/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author DELL PC
 */
public class DoctorController {
    public static void doctor(Integer Doctor_ID, String Name, String Phone, String Address, String Type, String Password){
       new Model.DBDoctor().doctor(Doctor_ID, Name, Phone, Address, Type, Password);
       
    }
}
