package com.sandy.spring.boot.contact.repository;

import com.sandy.spring.boot.contact.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ContactRepository {

    @Autowired EntityManager entityManager;

    public List<Contact> findAll() {
        Query query = entityManager.createQuery("select new Contact(c.id, c.firstName, c.lastName, c.phoneNumber, c.emailAddress) from com.sandy.spring.boot.contact.model.Contact c");
       return  query.getResultList();
    }

    @Transactional
    public void save(final Contact contact) {
        entityManager.persist(contact);
    }
}
