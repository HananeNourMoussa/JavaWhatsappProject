/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calls;

import java.util.Comparator;

/**
 *
 * @author Hanane Nour
 */
public class CallComparator implements Comparator<Call>{
    @Override
    public int compare(Call c1, Call c2)
    {
        return c1.getTime().compareTo(c2.getTime());
    }
}
