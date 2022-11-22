package com.example.demo.component;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Contact;
import com.example.demo.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {
    public Contact convertContactModel2Contact(ContactModel contactModel){
        Contact contact = new Contact();
        contact.setCity(contactModel.getCity());
        contact.setFirstname(contactModel.getFirstname());
        contact.setLastname(contactModel.getLastname());
        contact.setPhone(contactModel.getPhone());
        contact.setId(contactModel.getId());
        return contact;
    }
    public ContactModel convertContact2ContactModel(Contact contact){
        ContactModel contactModel = new ContactModel();
        contactModel.setCity(contact.getCity());
        contactModel.setFirstname(contact.getFirstname());
        contactModel.setLastname(contact.getLastname());
        contactModel.setPhone(contact.getPhone());
        contactModel.setId(contactModel.getId());
        return contactModel;
    }
}
