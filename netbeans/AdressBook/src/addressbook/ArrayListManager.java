/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//controller
package addressbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author dsd10
 */
public class ArrayListManager implements AddressBookDataDAO {

    //arraylist holding all entries
    private ArrayList<AddressBookData> listOfData = new ArrayList<>();

    public void populateAddressBookList() {
        //this ethod populates and arry lost with addressbook data objects and returns that arraylist
        AddressBookData data1 = new AddressBookData("John", "Stone", "johnstone@gmail.com", "0876544454");

        AddressBookData data2 = new AddressBookData("Kat", "Malone", "katmalone@gmail.com", "0863524255");

        AddressBookData data3 = new AddressBookData("Aaron", "Bishop", "abishop@gmail.com", "0875242485");

        AddressBookData data4 = new AddressBookData("Dana", "Scully", "scullydana@gmail.com", "0875524452");

        AddressBookData data5 = new AddressBookData("Carter", "Jones", "jonesxxx@gmail.com", "0875524452");

        AddressBookData data6 = new AddressBookData("Sissy", "Dimitri", "sissysis@gmail.com", "0875524452");

        AddressBookData data7 = new AddressBookData("Daniel", "Marlowe", "mdaniel@gmail.com", "0875524452");

        // puts them into an array
        AddressBookData[] arrayOfData = {data1, data2, data3, data4, data5, data6, data7};
        listOfData.addAll(Arrays.asList(arrayOfData));//takes an array and converts it into a list, addAll ads the contents of the list into my listofdata
        System.out.println(listOfData);
    }

    public ArrayList<AddressBookData> getAllEntries() {

        return listOfData;

    }

    public ArrayList<AddressBookData> searchByLastName(String lastname) {
        ArrayList<AddressBookData> list = new ArrayList<>();
        for (AddressBookData data : listOfData) {
            if (data.getLastname().equals(lastname)) {
                list.add(data);
            }
        }
        return list;
    }
    // declare an array list to hold the matching entries, those with the smae last name as the parameter
    // loop through the array list, see if the last name of the current element in the loop matches the parameter, if there is a match add that entry into the
    //new array list and after the loop is finished return new array list

    @Override
    /* public ArrayList<AddressBookData> searchByLastName(String lastname) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }*/

    public boolean insert(String firstname, String lastname, String email, String phonenumber) {
        AddressBookData data = new AddressBookData(firstname, lastname, email, phonenumber);
        //take all parameters and construct a new address book object
        //the array lists add method returns true if successful     
        return listOfData.add(data);

    }

    @Override
    public boolean update(int id, String firstname, String lastname, String email, String phonenumber) {

        return true;

    }

    @Override
    public boolean delete(int id) {
        Iterator<AddressBookData> i = listOfData.iterator();
        while (i.hasNext()) {
            AddressBookData data = i.next();
            if (data.getId() == id) {
                i.remove();
                return true;
            }

        }
        return false;
    }

}
