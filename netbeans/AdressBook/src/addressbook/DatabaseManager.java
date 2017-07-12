/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//CONTROLLER - implements the addressbookdata DAO, which is a contract that says if you want to access data for the addressbook you must implement the following methods:
//getAllEntries()
//inset()
//update()
//delete()
//searchByLastName()
//DAO stands for data access object, it is a design pattern.
package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dsd10
 */
public class DatabaseManager implements AddressBookDataDAO {
//create arraylist to hold entries from the database

    int position;
   

    @Override
    public ArrayList<AddressBookData> getAllEntries(){
 ArrayList<AddressBookData> listOfData = new ArrayList<>();
        String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";
        try (
                Connection conn = DriverManager.getConnection(url)) {
            String sql = "SELECT* From  AddressBookEntries";
            //prepared statement = interface
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
//looping through the result - getting the result from each field
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString(4);
                String phonenumber = rs.getString(5);
                // txtArea.setText(records);
                AddressBookData data = new AddressBookData(id, firstname, lastname, email, phonenumber);
                //add that data object to the arraylist
                position = 0;//reset the position in the array list back to 0
                listOfData.add(data);
                // populateFields();

            }
        } catch (SQLException e) {
            e.printStackTrace();
           JOptionPane.showMessageDialog(null, "unable to connect to the database");
        }
        return listOfData;// return the arraylist
    }

    @Override
    public ArrayList<AddressBookData> searchByLastName(String lastname) {
        /* Create an ArrayList to hold the entries from the database */
        ArrayList<AddressBookData> listOfData = new ArrayList<>();
        /* URL for connecting to the database */
        String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";
        /* Creating the Connection */
        try (Connection conn = DriverManager.getConnection(url)) {
            /* SQL to get records from the database */
            String sql = "SELECT * FROM AddressBookEntries WHERE lastname = ?";
            /* PreparedStatement is used to execute SQL against the DB */
            PreparedStatement stmt = conn.prepareStatement(sql);
            /* Specify what the question mark will be */
            stmt.setString(1, lastnameSearch);
             
            /* A select stmt gives back a ResultSet = table of data */
            ResultSet rs = stmt.executeQuery();
            /* Looping through the ResultSet */
            while (rs.next()) {
                /* Getting the value from each field */
                int id = rs.getInt(1);
                String firstname = rs.getString(2);
                String lastname = rs.getString(3);
                String email = rs.getString(4);
                String phoneNumber = rs.getString(5);
                 
                /* Using the data from one row in the resultset to
                create an AddressBookData object */
                AddressBookData data = new AddressBookData(id,
                        firstname, lastname, email, phoneNumber);
                /* Add that data object to the arraylist  */
                listOfData.add(data);
            }
             
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                    "Error connecting/ retrieving data");
        }
        /* Return the ArrayList */
        return listOfData;
    }

    @Override
    public boolean insert(String firstname, String lastname, String email, String phonenumber) {
        String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";

        try (
                Connection conn = DriverManager.getConnection(url)) {
            // the ? are parameters and after you specified a prepared statement with 
            //this sql you need to specify what each parameter will be/ where each parameter will get 
            //its value from and you will do that using statement.setstring parameter number and value
            String sql = "insert into AddressBookEntries values (?, ?, ?, ?)";
            //prepared statements are very secure
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstname);
            stmt.setString(2, lastname);
            stmt.setString(3, email);
            stmt.setString(4, phonenumber);

            int rowcount = stmt.executeUpdate();
            return rowcount == 1;//if rowcount 1, a row wa inserted and returns one, if rowcount is not one false will be returned
            //JOptionPane.showMessageDialog(null, rowcount + " row inserted");
            //after insertion, get all records from the database and show the last one 
        
        } catch (SQLException e) { 
            e.printStackTrace();
            
           return false;
        }
    
    }

    @Override
    public boolean update(int id, String firstname, String lastname, String email, String phonenumber) {
 String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";
         
        try (Connection conn = DriverManager.getConnection(url)) {
             
            String sql = "UPDATE AddressBookEntries "
                    + "SET firstname = ?, lastname = ?, "
                    + "email = ?, phoneNumber = ? "
                    + "WHERE id = ?";
             
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstname);
            stmt.setString(2, lastname);
            stmt.setString(3, email);
            stmt.setString(4, phonenumber);
            stmt.setInt(5, id);
             
            int rowCount = stmt.executeUpdate();
            /* rowCount will be 1 if the delete was successful */
            return rowCount == 1;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
       String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";
         
        try (Connection conn = DriverManager.getConnection(url)) {
             
            String sql = "DELETE FROM AddressBookEntries WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowCount = stmt.executeUpdate();
            /* rowCount will be 1 if the delete was successful */
            return rowCount == 1;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
        
    }

}
