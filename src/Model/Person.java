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
public class Person {

   
    
    private String name;
    private String password;
    private Address address;
    private Date dob;
    private long phone;
    private String gender;

    public Person() {
    }

    public Person(String name, String password, Address address, Date dob, long phone, String gender) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.dob = dob;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
      
    @Override
    public String toString()
    {
        return name;
    }
     
     
    
    

    
    
    
    
      
    
}
