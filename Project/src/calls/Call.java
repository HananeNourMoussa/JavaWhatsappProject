/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calls;

import java.text.SimpleDateFormat;
import java.util.Date;
import users.Contact;

/**
 *
 * @author Soundous
 */
public class Call {
    private Status status;//incoming, outgoing, missed
    public Date time;
    private Type type;
    public Contact caller_or_called; 
    
   public Call(Status status, Type type, Contact caller_or_called){
        this.status=status;
        this.time = new Date();
        this.type=type;
        this.caller_or_called = caller_or_called;
        
      }
  
    public Status getStatus(){
        return status;
    }
    
    
    
    public Type getType(){
        return type;
    }
    
@Override    
     public String toString(){
        return "Contact: " + caller_or_called + ", at time: " + getTime() + ", This call was: "
                + status.name();
               
    }

    /**
     * @return the caller_or_called
     */
    public Contact getCaller_or_called() {
        return caller_or_called;
    }

    /**
     * @return the time
     */
    public Date getTime() {
        return time;
    }
    @Override 
    public boolean equals(Object obj)
    {
       return (obj!= null && obj instanceof Call && ((Call)obj).getTime().compareTo(this.time)==0);
    }

    
    
}
