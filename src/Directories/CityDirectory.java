/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.City;
import java.util.ArrayList;

/**
 *
 * @author kashishdesai
 */
public class CityDirectory {
    
    ArrayList<City> cityDirectory;

    public CityDirectory() {
        this.cityDirectory =  new ArrayList<City>();
    }

    public ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(ArrayList<City> cityDirectory) {
        this.cityDirectory = cityDirectory;
    }
    
    
    public City addCity()
    {
        City c = new City();
        cityDirectory.add(c);
        return c;
    }
    
    
    
    
    
}
