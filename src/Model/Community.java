/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author kashishdesai
 */
public class Community {
    
    private String communityName;

    public Community(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Community() {
    }
    
    
      
    @Override
    public String toString()
    {
        return communityName;
    }
     
     
    
    
   
    
}
