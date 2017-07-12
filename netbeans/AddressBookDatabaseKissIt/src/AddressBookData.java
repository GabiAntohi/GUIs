/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsd10
 */
public class AddressBookData {

    //private member variables
    private int id;
    private String firtsname;
    private String lastname;
    private String email;
    private String phoneNumber;

    public AddressBookData(int id, String firtsname, String lastname, String email, String phoneNumber) {
        this.id = id;
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nid: " + id + "\nfirts name: " + firtsname + "\nlast name: " + lastname + "\nemail: " + email + "\nphoneNumber: " + phoneNumber;
    }

}
