/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chats;
import settings.Media;
import users.Contact;

/**
 *
 * @author Hanane Nour
 */
public class MediaMessage extends Message{
   private String mediaPath;
   private Media type; 

    public MediaMessage(String mediaPath, String type, Contact contact) {
        super(contact);
        this.mediaPath = mediaPath;
        this.type = Media.valueOf(type.toUpperCase());
    }

    /**
     * @return the mediaPath
     */
    public String getMediaPath() {
        return mediaPath;
    }

    /**
     * @return the type
     */
    public Media getType() {
        return type;
    }
    
   @Override
   public String toString ()
   {
       return super.toString() + ", Type: " + type.name() + ", media path: " + mediaPath;
   }
}
