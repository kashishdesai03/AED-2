/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Encounter;
import java.util.ArrayList;

/**
 *
 * @author kashishdesai
 */
public class EncounterHistory {
    
    
    private ArrayList<Encounter> encounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<Encounter>();
    }
            
}
