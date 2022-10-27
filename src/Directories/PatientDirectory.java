/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Patient;
import java.util.ArrayList;

/**
 *
 * @author kashishdesai
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    
    public Patient addPatient(){
        Patient p =new Patient();
        patientDirectory.add(p);
        return p;
    }
    
    public void removePatient( Patient p)
    {
        patientDirectory.remove(p);
    }
    
    
    
    
    
    
    
}
