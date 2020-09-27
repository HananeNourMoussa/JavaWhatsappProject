package generic;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Soundous
 */
public class Collection<T> implements Serializable{

    public LinkedList<T> elements;

    public Collection() {
        this.elements = new LinkedList<>();
    }

    public void addElement(T element) {

        elements.add(element);
    }

    public LinkedList<T> getElements() {
        return this.elements;
    }
    

    public boolean removeElement(T element) {
        return elements.remove(element);
    }

    public void modifyElement(T key, T element) {

        int i = elements.indexOf(key);
        if (i >= 0) {
            elements.set(i, element);
        }
    }

    public void sortElement(Comparator c) {
        Collections.sort(elements, c);
    }

    public T searchElement(T key) throws NotFoundException {
        int i = elements.indexOf(key);
        if (i>=0)
            return elements.get(i);
        else
           throw new NotFoundException();
            
        
    }
    
     public LinkedList<T> searchElement (Comparator c,T key){
    
       LinkedList<T> returnedElements = new LinkedList<>();
       ListIterator<T> i = elements.listIterator();
       while(i.hasNext()){
           T temp = i.next();
           if(c.compare(temp,key)==0){
               returnedElements.add(temp);
              
           }
       }
      return returnedElements;
    }

    @Override
    public String toString() {
        Iterator<T> iter = this.elements.iterator();
        String returnedString = "";
        while (iter.hasNext()) {
            returnedString = returnedString + iter.next().toString() + "\n";
        }

        return returnedString;
    }
    
    public void display ()
    {
        Iterator <T> iter= this.elements.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next().toString());
        }
    }
     public void save(String path) {

        FileOutputStream fout = null;
        ObjectOutputStream oout = null;

        try {
            fout = new FileOutputStream(path);
            oout = new ObjectOutputStream(fout);
        } catch (FileNotFoundException fex) {
            System.out.println(fex.getMessage());
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
        try {
            oout.writeObject(elements);
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
    }

    public void load(String path) {
        FileInputStream fin = null;
        ObjectInputStream oin = null;

        try {
            fin = new FileInputStream(path);
            oin = new ObjectInputStream(fin);
        } catch (FileNotFoundException fex) {
            System.out.println("file not found");
            // System.out.println(fex.getMessage());
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
        try {
            elements = (LinkedList<T>) oin.readObject();
            // null ptr ex if path validity is not guaranteed
        } catch (ClassNotFoundException cex){
            System.out.println(cex.getMessage());
        } catch (EOFException eofex){
            return;
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
    }


}
