/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guis;

import generic.Collection;
import generic.NotFoundException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import users.Blocked;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import users.AboutException;
import users.Contact;
import users.NameException;
import users.Profile;
/**
 *
 * @author Hanane Nour
 */

public class AddContact extends javax.swing.JPanel {

    /** Creates new form ContactSearch */
    DefaultListModel<Contact> listModel;
    public static Collection <Contact> contacts = new Collection<>() ;
    
    public AddContact() {
        initComponents();
        registerListeners();
        listModel = new DefaultListModel<>();
        contactsList.setModel(listModel);
        
    }
    
//    public void validateInput (String name, String pn)
//    {
//        if (name.isEmpty() || pn.isEmpty())
//        {
//            JOptionPane.showMessageDialog(AddContact.this, "At least one field is empty",
//                    "Adding Contact", JOptionPane.ERROR_MESSAGE );
//            return;
//            
//        }
//        if (name.length() >= 20)
//        {
//            JOptionPane.showMessageDialog(AddContact.this, "Name is too long. Shouldn't exceed 20 characters.",
//                    "Name...", JOptionPane.ERROR_MESSAGE );
//            return;
//        }
//    }
    
    public void registerListeners()
    {
        contactsList.addListSelectionListener(new ListSelectionListener ()
                {
                    @Override
                    public void valueChanged (ListSelectionEvent evt){
                        if (evt.getValueIsAdjusting()){
                            return;
                        }
                        Contact contact = contactsList.getSelectedValue();
                        if (contact == null)
                        {
                            return;
                         }
                        nameTxt.setText(contact.getProfile().getName());
                        phoneNumberTxt.setText(contact.getProfile().getPhoneNumber());
                        blockedCombo.setSelectedIndex(1);
                            
                    }
                }
        );
        addBtn.addActionListener(new ActionListener (){
        @Override  
        public void actionPerformed(ActionEvent evt) {                                       
        // TODO add your handling code here:
        // getting the attributes
        String name = nameTxt.getText();
        String pn = phoneNumberTxt.getText();
        if (name.isEmpty() || pn.isEmpty())
        {
            JOptionPane.showMessageDialog(AddContact.this, "At least one field is empty",
                    "Adding Contact", JOptionPane.ERROR_MESSAGE );
            return;
            
        }
        if (name.length() >= 20)
        {
            JOptionPane.showMessageDialog(AddContact.this, "Name is too long. Shouldn't exceed 20 characters.",
                    "Name...", JOptionPane.ERROR_MESSAGE );
            return;
        }
        Blocked blocked = (Blocked) blockedCombo.getSelectedItem();
        String photoPath = "PhotoPath";
        Profile profile = null;
        try {
           profile = new Profile ( pn, name, photoPath, "Hey there! I am using Whatsapp!" );
        } catch (AboutException ex) {
        } catch (NameException ex) {
        }
        Contact contact = new Contact (profile, blocked);
        contacts.addElement(contact);
        JOptionPane.showMessageDialog(AddContact.this, 
                "Contact Added successfully!", "Adding Contact", JOptionPane.INFORMATION_MESSAGE);
        listModel.addElement(contact);
        
        
        
    } 
        
    });
        
        clearBtn.addActionListener(new ActionListener ()
                {
                    @Override
                    public void actionPerformed (ActionEvent evt){
                    nameTxt.setText("");
                    phoneNumberTxt.setText("");
                    blockedCombo.setSelectedIndex(1);
                    }
                    
                }
        );
        editBtn.addActionListener (new ActionListener ()
                {
                    @Override 
                    public void actionPerformed (ActionEvent evt)
                {
                    Contact contact = contactsList.getSelectedValue();
                    if (nameTxt.getText().isEmpty() || phoneNumberTxt.getText().isEmpty())
                    {
                         JOptionPane.showMessageDialog(AddContact.this, "At least one field is empty",
                    "Adding Contact", JOptionPane.ERROR_MESSAGE );
                        return;
            
                    }
                    if (nameTxt.getText().length() >= 20)
                    {
                    JOptionPane.showMessageDialog(AddContact.this, "Name is too long. Shouldn't exceed 20 characters.",
                    "Name...", JOptionPane.ERROR_MESSAGE );
                    return;
                     }
                    Contact newContact = null;
                        try {
                             newContact = new Contact (new Profile(phoneNumberTxt.getText(),
                                    nameTxt.getText(), "/PhotoPath", "Hey there! I am using whatsapp"), Blocked.NO);
                        } catch (AboutException ex) {
                        } catch (NameException ex) {
                        }
                     contacts.modifyElement(contact, newContact);
                     listModel.set(listModel.indexOf(contact), newContact);
                     contactsList.setSelectedValue(contact, true);
                     JOptionPane.showMessageDialog(AddContact.this, "Contact Edited!", "Editing Contact",
                             JOptionPane.INFORMATION_MESSAGE);
                    
                    
                }
                }
        );
        deleteBtn.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed (ActionEvent evt)
                {
                    Contact contact = contactsList.getSelectedValue();
                    contacts.removeElement(contact);
                    listModel.removeElement(contact);
                    contactsList.setSelectedValue(null, true);
                    JOptionPane.showMessageDialog (AddContact.this, "Contact deleted!",
                            "Deleting Contact", JOptionPane.INFORMATION_MESSAGE);
                }
                }
        );
        
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phoneNumberTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        blockedCombo = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactsList = new javax.swing.JList<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_whatsapp_287520.png"))); // NOI18N
        jLabel1.setText("Manage Contacts");

        jLabel2.setText("Phone Number:");

        jLabel3.setText("Name:");

        jLabel5.setText("Blocked:");

        blockedCombo.setModel(new javax.swing.DefaultComboBoxModel<>(Blocked.values()));

        addBtn.setBackground(new java.awt.Color(0, 204, 102));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_sign-add_299068.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(0, 204, 102));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_edit_3855617.png"))); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(0, 204, 102));
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_edit-clear_29769.png"))); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 204, 102));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_cancel_3855592.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        contactsList.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(contactsList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneNumberTxt)
                                    .addComponent(nameTxt)
                                    .addComponent(blockedCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addBtn)
                                .addGap(27, 27, 27)
                                .addComponent(editBtn)
                                .addGap(30, 30, 30)
                                .addComponent(clearBtn)
                                .addGap(34, 34, 34)
                                .addComponent(deleteBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockedCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn)
                    .addComponent(clearBtn)
                    .addComponent(editBtn)
                    .addComponent(addBtn))
                .addGap(87, 87, 87))
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        // getting the attributes
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
//        String pn = phoneNumberTxt.getText();
//        try {
//            try {
//                Contact contact = contacts.searchElement(new Contact(new Profile(pn, "unknown", "unkown", "unknown"), Blocked.NO));
//            } catch (NotFoundException ex) {
//                JOptionPane.showMessageDialog(AddContact.this, "Contact Not found", pn, HEIGHT);
//            }
//        } catch (AboutException ex) {
//            Logger.getLogger(AddContact.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NameException ex) {
//            Logger.getLogger(AddContact.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<Blocked> blockedCombo;
    private javax.swing.JButton clearBtn;
    private javax.swing.JList<Contact> contactsList;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneNumberTxt;
    // End of variables declaration//GEN-END:variables

}
