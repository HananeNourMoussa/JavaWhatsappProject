/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author Hanane Nour
 */
public class NotFoundException extends Exception{
    public NotFoundException()
    {
        super("Field entered Not found. Please make sure you enter an existing field.");
    }
}
