package com.myclass;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();
    //add contact
    public void addContact(Contact contact) {
        if(contact == null || contacts.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("contact exists/invalid");
        }

        contacts.put(contact.getContactID(), contact);
    }

    //delete contact    
    public void deleteContact(String contactID) {
        if(!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("contact doesn't exist");
        }

        contacts.remove(contactID);
    }

    //update contact
    public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {

        Contact contact = contacts.get(contactID);
        
        if(contact == null) {
            throw new IllegalArgumentException("Contact doesn't exist");
        } 
        if(firstName != null) {
            contact.setFirstName(firstName);
        }

        if(lastName != null) {
            contact.setLastName(lastName);
        }
        if(phone != null) {
            contact.setPhone(phone);
        }
        if(address != null) {
            contact.setAddress(address);
        }
    }

    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}

