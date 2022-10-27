/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Model.Community;
import java.util.ArrayList;

/**
 *
 * @author kashishdesai
 */
public class CommunityDirectory {
    
    
    ArrayList<Community> communityDirectory;

    public CommunityDirectory() {
        this.communityDirectory = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }
    public Community addCommunity()
    {
        Community c = new Community();
        communityDirectory.add(c);
        return c;
    }
    
    
    
    
}
