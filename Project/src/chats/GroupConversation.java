/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chats;

import java.util.Date;
import users.Contact;
import collection.Collection;
import users.Account;

/**
 *
 * @author Hanane Nour
 */
public class GroupConversation extends Conversation{
       private String name;
       private Account myAccount;
       private Date dateCreated;
       private String iconPath;
       private Contact admin;
       private Collection <Contact> members;
       

    public GroupConversation(String name,String iconPath, Contact admin, Account myAccount)  {
        super();
        this.name = name;
        this.dateCreated = new Date();
        this.iconPath = iconPath;
        this.admin = admin;
        this.members = new Collection();
        this.myAccount = myAccount;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @return the iconPath
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * @return the admin
     */
    public Contact getAdmin() {
        return admin;
    }
    
       @Override
    public String toString ()
    {
       return "Group "+getName()+", admin "+getAdmin().getProfile().getName()+ ", date created"+getDateCreated();
    }
    
    
    
    public void Invite (Contact contact)
    {
        members.addElement(contact);
    }
    
    public void Unjoin ()
    {
        myAccount.getGroups().removeElement(this);
    }

    /**
     * @return the members
     */
    public Collection <Contact> getMembers() {
        return members;
    }
    
    @Override
    public boolean equals (Object obj)
    {
        return (obj != null && obj instanceof GroupConversation &&
                ((GroupConversation)obj).getName().equalsIgnoreCase(this.name));
    }
  
}
       

