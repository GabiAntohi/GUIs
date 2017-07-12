/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package addressbook;

import java.util.ArrayList;

/**
 *
 * @author dsd10
 */
public interface AddressBookDataDAO {
    public ArrayList<AddressBookData> getAllEntries();
    
    public abstract ArrayList<AddressBookData> searchByLastName(String lastname);
    
    public boolean insert (String firstname, String lastname, String email, String phonenumber);
    public boolean update (int id, String firstname, String lastname, String email, String phonenumber );
    public boolean delete(int id);
    
    
    
}
