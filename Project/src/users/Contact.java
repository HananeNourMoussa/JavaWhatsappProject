/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 *
 * @author Hanane Nour
 */
public class Contact implements Serializable {
    private static final long serialVersionUID = 123L;
    public Blocked blocked;
    private Profile profile; 
    
    public Contact (Profile profile, Blocked blocked)
    {   
        this.profile = profile;
        this.blocked = blocked;
    }
    public void viewInfo()
    {
        getProfile().display();
    }
    public void block()
    {
        blocked = Blocked.YES;
    }
    public void unblock ()
    {
        blocked = Blocked.NO;
    }
    @Override
    public String toString ()
    {
        return getProfile().getAbout() +  "        "+ getProfile().getName();
    }

    /**
     * @return the blocked
     */
    

    

    /**
     * @return the profile
     */
    public Profile getProfile() {
        return profile;
    }
    @Override
    public boolean equals (Object obj)
    {
        if (obj != null)
        {
            Contact c = (Contact)obj;
            return(c.getProfile().getPhoneNumber().equals(getProfile().getPhoneNumber()));
        }
        return false;
    }

    /**
     * @return the blocked
     */
    public Blocked getBlocked() {
        return blocked;
    }

    
    
}
