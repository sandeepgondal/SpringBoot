package com.sandy.spring.boot.contact.repository;

import com.sandy.spring.boot.contact.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactRepository {

    List<Contact> contacts = new ArrayList<Contact>();

    public List<Contact> findAll() {
        return contacts;
    }

    public void save(final Contact contact) {
        contacts.add(contact);
    }
}
