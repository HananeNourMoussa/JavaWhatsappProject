/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Hanane Nour
 */
public class NameException extends Exception{
    
    String name;
    public NameException(String name)
    {
        super ("Too long name. The name shouldn't exceed 20 characters.");
        this.name = name;
    }
    
    public ArrayList<String> suggestNames (){
        
        ArrayList<String> suggested = new  ArrayList<>();
        StringTokenizer str1 = new StringTokenizer(name, " ");
        String str2 = name;
        while (str1.hasMoreTokens())
        {
            String next = str1.nextToken();
            if (next.length() <= 20)
            {
                suggested.add(next);
            }
                
        }
        
        String next = str2.substring(0, 10);
        suggested.add(next);
        
        return suggested;
        
    }
}
