/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chats;

import java.util.Comparator;

/**
 *
 * @author Hanane Nour
 */
public class GroupConversationComparator implements Comparator<GroupConversation>{
    @Override
    public int compare (GroupConversation c1, GroupConversation c2)
    {
        return c1.getMessages().elements.getLast().getDateAndTime().compareTo(c2.getMessages().elements.getLast().getDateAndTime());
    }
}
