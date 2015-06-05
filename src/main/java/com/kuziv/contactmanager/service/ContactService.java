package com.kuziv.contactmanager.service;

import java.util.List;
import com.kuziv.contactmanager.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContacts();

	public void removeContact(Integer id);
}
