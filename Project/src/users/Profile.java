/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;
import java.util.Date;
// used this class because it gives better formatting

/**
 *
 * @author Hanane Nour
 */
public class Profile implements Serializable{
    private static final long serialVersionUID = 456L;
    private String phoneNumber; 
    private String name;
    private String about;
    private Date lastSeen;
    private boolean onlineStatus;
    private String photoPath;
    
    
    
    public Profile (String phoneNumber, String name, String photoPath) throws NameException
    {
        this.phoneNumber = phoneNumber;
        this.photoPath = photoPath;
        setName(name);
        lastSeen = new Date();
        

    }
    public Profile (String phoneNumber, String name, String photoPath, String about) throws AboutException, NameException
    {  
        setAbout(about);
        this.phoneNumber = phoneNumber;
        this.photoPath = photoPath;
        setName(name);
        lastSeen = new Date();
    }
    

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    // setPhoneNumber was not implemented because it does not make sense to set 
    // phone number within the context of whatsapp

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) throws NameException {
        if (name.length()  <= 20)
            this.name = name;
        else
        {
            throw new NameException(name);
        }
    }

    /**
     * @return the about
     */
    public String getAbout() {
        return about;
    }

   

    /**
     * @return the lastSeen
     */
    public String getLastSeen() {
        return lastSeen.toString();
    }

    /**
     * @return the onlineStatus
     */
    public boolean isOnlineStatus() {
        return onlineStatus;
    }

   
    @Override
    public String toString ()
    {
        return "The profile name is: " + name + ", phone number: " + phoneNumber
                + ", about info: " + about + ", Last seen: " + lastSeen; 
    }
    
    public void connect ()
    {
        onlineStatus = true;
    }
    
    public void disconnect ()
    {
        lastSeen = new Date();
        onlineStatus = false;
    }
    
    public void display ()
    {
        System.out.print(name);
        if (onlineStatus == true)
        {
            System.out.print(" ,Online");
        }
        else
        {
            System.out.print (" ,Last seen on: " + lastSeen);
        }
        System.out.println("Number:  " + phoneNumber + "About info: " + about);
        
    }

    public void setAbout (String about_info) throws users.AboutException {
        if (about_info.length() <= 40){
            this.about = about_info;
        }
        else
        {
           throw new AboutException();
        }
    }
    
}
