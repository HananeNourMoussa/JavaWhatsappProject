/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.util.Comparator;

/**
 *
 * @author Hanane Nour
 */
public class ContactComparator implements Comparator <Contact>{
    @Override
    public int compare (Contact c1, Contact c2){
        return c1.getProfile().getName().compareTo(c2.getProfile().getName());
    }
}
