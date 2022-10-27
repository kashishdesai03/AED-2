/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Directories.EncounterHistory;
import java.util.Date;

/**
 *
 * @author kashishdesai
 */
public class Patient extends Person{
    
    private EncounterHistory encounterHistory;

    public Patient() {
    }
    
    
    

    public Patient(EncounterHistory encounterHistory, String name, String password, Address address, Date dob, long phone, String gender) {
        super(name, password, address, dob, phone, gender);
        this.encounterHistory = encounterHistory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
  
     
     

    
    
    

  
    
    
    
    
    
    
    
    
    
}
