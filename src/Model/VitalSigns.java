/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kashishdesai
 */
public class VitalSigns {
    
    private int bloodPressure;
    private int heartRate;
    private int bodyTemperature;

    public VitalSigns(int bloodPressure, int heartRate, int bodyTemperature) {
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.bodyTemperature = bodyTemperature;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(int bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }
    
    
}
