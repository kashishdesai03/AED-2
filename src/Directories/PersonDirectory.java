/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Person;
import java.util.ArrayList;

/**
 *
 * @author kashishdesai
 */
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
//    
//      public Employee addNewEmployee(){
//        Employee e = new Employee();
//        history.add(e);
//        return e;
//             
//    }
//    
    
    
    
    public Person addPerson(){
        Person p = new Person();
        personDirectory.add(p);
        return p;
    }
    
    public void deletePerson(Person p)
    {
        personDirectory.remove(p);
        
    }
    
    
    
    
}
