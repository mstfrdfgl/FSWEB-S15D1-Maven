package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber, List<Contact> contacts) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }
    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        }else{
            return false;
        }
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        if(myContacts.contains(oldContact)){
            myContacts.set(myContacts.indexOf(oldContact),newContact);
            return true;
        }else {
            return false;
        }
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }else{
            return false;
        }
    }
    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String contact){
        if(myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        }else{
            return -1;
        }
    }
    public Contact queryContact(String contact){

        if(myContacts.contains(contact)){
            return myContacts.get(myContacts.indexOf(contact));
        }else{
            return null;
        }
    }
    public void printContact(){
        for(Contact contact:myContacts){
            System.out.println(contact + "->" + myNumber);
        }
    }
}
