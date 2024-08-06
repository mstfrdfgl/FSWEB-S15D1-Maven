package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;


    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }
    public boolean addNewContact(Contact contact){
        if(contact==null || contact.getName()==null || contact.getPhoneNumber()==null){
            return false;
        }else {
            if(!myContacts.contains(contact)){
                myContacts.add(contact);
                return true;
            }else{
                return false;
            }
        }

    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        if(findContact(oldContact)>=0){
            myContacts.set(myContacts.indexOf(oldContact),newContact);
            return true;
        }else {
            return false;
        }
    }
    public boolean removeContact(Contact contact){
        if(contact==null || !myContacts.contains(contact)){
            return false;
        }
        return this.myContacts.remove(contact);


    }
    public int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String name){
        for(int i=0;i<myContacts.size();i++){
            if(myContacts.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        for(int i=0;i<myContacts.size();i++){
            if(myContacts.get(i).getName().equalsIgnoreCase(name)){
                return myContacts.get(i);
            }
        }
        return null;
    }
    public void printContact(){
        for(Contact contact:myContacts){
            System.out.println(contact + "->" + myNumber);
        }
    }
}
