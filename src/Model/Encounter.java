/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author kashishdesai
 */
public class Encounter {
    
    private VitalSigns vitalSigns;
    
    private Date encounterDate;
    
    private String diagnosis;

    public Encounter(VitalSigns vitalSigns, Date encounterDate, String diagnosis) {
        this.vitalSigns = vitalSigns;
        this.encounterDate = encounterDate;
        this.diagnosis = diagnosis;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
     

    @Override
    public String toString() {
        return "Encounter{" + encounterDate + '}';
    }
     
    
    
   
    
    
    
    
            
    
}


