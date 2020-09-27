/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;
import calls.Call;
import chats.Conversation;
import chats.GroupConversation;
import collection.Collection;
import settings.DataStorageSettings;

//import settings.DataStorageSettings;

/**
 *
 * @author Hanane Nour
 */
public class Account {
    private Profile profile;
    private Collection<Contact> ContactList;
    private Collection <Conversation> ChatLog;
    private Collection <Call> CallLog;
    private Collection <GroupConversation> Groups;
    private Collection<DataStorageSettings> DS_Settings;
    //public DataStorageSettings ds_settings; 

    public Account(Profile profile) {
        this.profile = profile;
        this.ContactList = new Collection();
        this.ChatLog = new Collection();
        this.CallLog = new Collection();
        this.Groups = new Collection();
        this.DS_Settings = new Collection();
    }

    
    
   
    
    public void connect ()
    {
        getProfile().connect();
    }
    
    public void disconnect ()
    {
        getProfile().disconnect();
    }

    /**
     * @return the profile
     */
    public Profile getProfile() {
        return profile;
    }

    
  
    @Override
    public String toString ()
    {
       return "Account of: " + getProfile().getName();
    }

    /**
     * @return the ContactList
     */
    public Collection<Contact> getContactList() {
        return ContactList;
    }

    /**
     * @return the ChatLog
     */
    public Collection <Conversation> getChatLog() {
        return ChatLog;
    }

    /**
     * @return the CallLog
     */
    public Collection <Call> getCallLog() {
        return CallLog;
    }

    /**
     * @return the Groups
     */
    public Collection <GroupConversation> getGroups() {
        return Groups;
    }

    /**
     * @return the DS_Settings
     */
    public Collection<DataStorageSettings> getDS_Settings() {
        return DS_Settings;
    }
    
    
    
     
   
    
    
    
}
