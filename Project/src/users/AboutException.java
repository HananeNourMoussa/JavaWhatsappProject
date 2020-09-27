/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author Hanane Nour
 */
public class AboutException extends Exception{
    
    public AboutException ()
    {
        super("Too long About Info; Shouldn't exceed 40 characters.");
    }
    
}
