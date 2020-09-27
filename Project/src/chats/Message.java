/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chats;

import java.util.Date;
import users.Contact;

/**
 *
 * @author Hanane Nour
 */
public class Message {
    private Date dateAndTime;
    private Contact contact; 
    
    public Message (Contact contact)
    {
        dateAndTime = new Date();
        this.contact = contact;
    }

    /**
     * @return the dateAndTime
     */
    public Date getDateAndTime() {
        return dateAndTime;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }
    @Override
    public String toString ()
    {
      return "Message sent to: " + getContact().getProfile().getName() + ", on : " + getDateAndTime();
    }
    
    @Override 
    public boolean equals(Object obj)
    {
        return (obj != null && obj instanceof Message &&
                ((Message)obj).getContact().getProfile().getName().equals(this.getContact().getProfile().getName())
                && ((Message)obj).getDateAndTime().compareTo(this.dateAndTime)==0);
    }
    
    
}
