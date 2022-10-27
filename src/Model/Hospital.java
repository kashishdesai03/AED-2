/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kashishdesai
 */
public class Hospital {
    
    String hospitalName;
    String hospitalCity;
    String hospitalCommunity;

    public Hospital(String hospitalName, String hospitalCity, String hospitalCommunity) {
        this.hospitalName = hospitalName;
        this.hospitalCity = hospitalCity;
        this.hospitalCommunity = hospitalCommunity;
    }

    public Hospital() {
    }
    
    

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

      
    @Override
    public String toString()
    {
        return hospitalName;
    }
    
    
}
