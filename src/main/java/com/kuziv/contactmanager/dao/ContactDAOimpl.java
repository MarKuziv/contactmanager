package com.kuziv.contactmanager.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kuziv.contactmanager.domain.Contact;

@Repository
public class ContactDAOimpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addContact(Contact contact) {
		sessionFactory.getCurrentSession().save(contact);
	}

	@SuppressWarnings("unchecked")
	public List<Contact> listContacts() {
		List<Contact> list = sessionFactory.getCurrentSession().createQuery("FROM CONTACTS").list();
		return list;
	}

	public void removeContact(Integer id) {
		Contact con = (Contact) sessionFactory.getCurrentSession().load(Contact.class, id);
		if(con != null) sessionFactory.getCurrentSession().delete(con);
	}

}
