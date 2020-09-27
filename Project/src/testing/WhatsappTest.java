/*
 * To change this license header, choose License Headers in WhatsappTest Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import calls.Call;
import calls.CallComparator;
import chats.Message;
import calls.Status;
import calls.Type;
import chats.Conversation;
import chats.MediaMessage;
import chats.TextMessage;
import collection.NotFoundException;
import guis.ManageContacts;
import guis.ContactJFrame;
import java.util.Scanner;
import javax.swing.JFrame;
import settings.DataStorageSettings;
import settings.Media;
import settings.Network;
import users.AboutException;
import users.Account;
import users.Contact;
import users.ContactComparator;
import users.NameException;
import users.Profile;
import static guis.ManageContacts.contacts;
import static guis.ContactJFrame.pathToHome;

/**
 *
 * @author Hanane Nour
 */
public class WhatsappTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\t Welcome to Whatsapp! To sign up please fill in the following fields\n");
//        System.out.println("Phone Number: ");
//        String PN = sc.nextLine();
//        System.out.println("Photo Path: ");
//        String PP = sc.nextLine();
//        Profile profile = null;
//        while(true){
//        try{
//           System.out.println("Name: ");
//           String name = sc.nextLine();
//           profile = new Profile(PN, name, PP);
//           System.out.println("About Info: ");
//           String about = sc.nextLine();
//           profile = new Profile(PN, name, PP, about);
//           break;
//        }catch(NameException ex){
//            System.err.println(ex.getMessage());
//            System.err.println("You can use a name from the following, or you can type in another name: ");
//            for (String s: ex.suggestNames())
//            {
//                System.err.println("\t" + s);
//            }
//        }catch(AboutException ex){
//            System.err.println(ex.getMessage() + " Please Try a shorter about info.");
//        }
//        }
//        Account account = new Account (profile);
//        account.connect();
//        
//        Profile profile1 = null;
//        Profile profile2 = null;
//        Profile profile3 = null;
//
//        try {
//            //Fill in ContactList
//             profile1 = new Profile ("0530303030", "Toto", "Bonjour! Je suis toto!", "Galerie/mesphotos/1");
//        } catch (AboutException ex) {
//            System.err.println(ex.getMessage() + " Please try a shorter about info.");
//
//        } catch (NameException ex) {
//            System.err.println(ex.getMessage() + "You can choose a name from the following suggestions: ");
//                for (String s: ex.suggestNames())
//                {
//                    System.err.println("\t" + s);
//                }
//                System.err.println("Or you can type a new name.");
//        }
//        try {
//            //Fill in ContactList
//             profile2 = new Profile ("0630303030", "Foo", "Bonjour! Je suis Foo!", "Galerie/mesphotos/2");
//        } catch (AboutException ex) {
//            System.err.println(ex.getMessage() + " Please try a shorter about info.");
//
//        } catch (NameException ex){
//            System.err.println(ex.getMessage() + "You can choose a name from the following suggestions: ");
//                for (String s: ex.suggestNames())
//                {
//                    System.err.println("\t" +s);
//                }
//                System.err.println("Or you can type a new name.");
//        }
//        try {
//            //Fill in ContactList
//             profile3 = new Profile ("0730303030", "Bob", "Bonjour! Je suis Bob!", "Galerie/mesphotos/3");
//        } catch (AboutException ex) {
//            System.err.println(ex.getMessage() + " Please try a shorter about info.");
//
//        } catch (NameException ex) {
//            System.err.println(ex.getMessage() + "You can choose a name from the following suggestions: ");
//                for (String s: ex.suggestNames())
//                {
//                    System.err.println("\t" + s);
//                }
//                System.err.println("Or you can type a new name.");
//        }
//        
//        Contact contact1 = new Contact (profile1);
//        Contact contact2 = new Contact(profile2);
//        Contact contact3 = new Contact(profile3);
//        account.getContactList().addElement(contact1);
//        account.getContactList().addElement(contact2);
//        account.getContactList().addElement(contact3);
//        account.getContactList().sortElement(new ContactComparator());
//        System.err.println("Testing the contact list...");
//        account.getContactList().display();
//        System.out.println("\t Account Created! Please customize your Data and Storage Settings");
//        System.err.println("The user must be prompted here 4*3 = 12, for simplicity "
//                + "we'll prompt him 3 times, and we'll leave the details until we implement the GUI");
//        Media[] vals = Media.values();
//        System.out.println("Wifi ->>>");
//        for (Media m: vals)
//        {
//            System.out.println("\t"+m);
//        }
//        String str = sc.nextLine();
//        DataStorageSettings ds1 = new DataStorageSettings(Media.valueOf(str.toUpperCase()), Network.WIFI);
//        ds1.setAutoDownload(true);
//        System.out.println("Mobile Data ->>>");
//        for (Media m: vals)
//        {
//            System.out.println("\t"+m);
//        }
//         str = sc.nextLine();
//        DataStorageSettings ds2 = new DataStorageSettings(Media.valueOf(str.toUpperCase()), Network.MOBILEDATA);
//        ds2.setAutoDownload(true);
//        System.out.println("Roaming ->>>");
//        for (Media m: vals)
//        {
//            System.out.println("\t"+m);
//        }
//         str = sc.nextLine();
//        DataStorageSettings ds3 = new DataStorageSettings(Media.valueOf(str.toUpperCase()), Network.ROAMING);
//        ds3.setAutoDownload(true);
//        account.getDS_Settings().addElement(ds1);
//        account.getDS_Settings().addElement(ds2);
//        account.getDS_Settings().addElement(ds2);
//        System.out.println("You're all set! To start a conversation, type a contact number!");
//        Profile unknown = null;
//        Contact contact = null;
//         loop: while (true)
//        {
//            try{
//                 String contactNum = sc.nextLine();
//                try {
//                     unknown  = new Profile (contactNum, "Unknown", "Unkown", "Unknown" );
//                } catch (AboutException ex) {
//
//                } catch (NameException ex) {
//                }
//                 contact = new Contact(unknown);
//                 contact = account.getContactList().searchElement(contact);
//                 break loop;
//            }catch( NotFoundException ex)
//                    {
//                        System.err.println(ex.getMessage() + " Please try again");
//                    }
//        }
//          System.out.println("Type a message: ");
//          String text = sc.nextLine();
//          Message txtmessage  = new TextMessage(text, contact);
//          Conversation conversation  = new Conversation();
//          conversation.send(txtmessage);
//          System.out.print(contact.getProfile().getName()+":");
//          TextMessage txt = (TextMessage)conversation.receive();
//          System.out.println(txt.getText());
//          System.out.println("Send media: ");
//          System.out.println("Choose a media type ->>>");
//          for (Media m: vals)
//          {
//              System.out.println("\t" + m.name());
//          }
//          String media = sc.nextLine();
//          
//          Message mediamessage = new MediaMessage("Docs/mediaPath", media, contact);
//          conversation.send(mediamessage);
//          System.out.println("For better communication, Call a contact");
//          Call call1 = new Call(Status.OUTGOING, Type.AUDIO, contact1);
//          account.getCallLog().addElement(call1);
//          Call call2 = new Call(Status.OUTGOING, Type.AUDIO, contact2);
//          account.getCallLog().addElement(call2);
//          Call call3 = new Call(Status.OUTGOING, Type.AUDIO, contact3);
//          account.getCallLog().addElement(call3); 
//          account.getCallLog().sortElement(new CallComparator());
//          System.out.println("Testing the sort...");
//          account.getCallLog().display();

            ContactJFrame test = new ContactJFrame();
            test.setTitle("Whatsapp");
            test.setVisible(true);
            test.setResizable(false);
            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        

            
               
        
        
    }
    

