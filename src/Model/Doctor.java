/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Directories.PatientDirectory;
import java.util.Date;

/**
 *
 * @author kashishdesai
 */
public class Doctor extends Person {
    
    private String degree;
    private Hospital hospital;

   

    public Doctor(String degree, PatientDirectory patientDirectory, String name, String password, Address address, Date dob, long phone, String gender,Hospital hospital) {
        super(name, password, address, dob, phone, gender);
        this.degree = degree;
        this.hospital=hospital;
        
        
    }

    public Doctor() {
    }
    
    

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    
     public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

  
    
    

    
    

   
   
    
    
    
    
    
    
    
}
