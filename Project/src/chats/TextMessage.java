/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chats;

import chats.Message;
import users.Contact;

/**
 *
 * @author Hanane Nour
 */
public class TextMessage extends Message {
    private String text; 

    public TextMessage(String text, Contact contact) {
        super(contact);
        this.text = text;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }
   
     
    @Override
    public String toString ()
    {
        return super.toString() + ", Content: " + getText();
    }
}
  
    




