package com.philips.dxr.dao;

import java.util.List;

import com.philips.dxr.entity.Contact;

public interface ContactsDao {

	// CRUD OPERATIONS
	public void createNewContact(Contact contact) throws DaoException;

	public Contact getContactById(int id) throws DaoException;

	// QUERIES

	public List<Contact> getAllContacts() throws DaoException;
}
