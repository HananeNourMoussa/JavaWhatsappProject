/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chats;

import collection.Collection;
import users.Contact;

/**
 *
 * @author Soundous
 */
public class Conversation {
    private Collection<Message> messages;

    public Conversation() {
        messages = new Collection();
    }

    public void send(Message message)
            
    {
        getMessages().addElement(message);
    }
    
    public Message receive()
    {
        Contact contact = messages.elements.getLast().getContact();
        TextMessage TxtMessage =new TextMessage ("Hello!", contact); 
        messages.addElement(TxtMessage);
        return (TxtMessage);
    }

    /**
     * @return the messages
     */
    public Collection<Message> getMessages() {
        return messages;
    }
    
}
