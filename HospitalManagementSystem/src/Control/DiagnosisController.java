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
public class DiagnosisController {
    public static void diagnosisSave(Integer PatientID, String Symptom, String Diagnosis, String Medicines, String WardReq, String TypeWard){
       new Model.DBDiagnosis().diagnosisSave(PatientID, Symptom, Diagnosis, Medicines, WardReq, TypeWard);
       
    }
    
}
