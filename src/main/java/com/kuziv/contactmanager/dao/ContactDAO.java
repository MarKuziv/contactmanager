package com.kuziv.contactmanager.dao;

import java.util.List;

import com.kuziv.contactmanager.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContacts();

	public void removeContact(Integer id);
}
