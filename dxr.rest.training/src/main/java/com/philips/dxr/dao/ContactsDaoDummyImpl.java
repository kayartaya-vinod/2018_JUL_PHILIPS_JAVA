package com.philips.dxr.dao;

import java.util.Arrays;
import java.util.List;

import com.philips.dxr.entity.Contact;

public class ContactsDaoDummyImpl implements ContactsDao {

	@Override
	public void createNewContact(Contact contact) throws DaoException {
		System.out.println("Got this contact..." + contact);
		System.out.println("Adding contact to database...");
	}

	@Override
	public Contact getContactById(int id) throws DaoException {
		return new Contact(id, "John Doe", "johndoe@example.com", "5558383322");
	}

	@Override
	public List<Contact> getAllContacts() throws DaoException {
		return Arrays.asList(
				new Contact(1, "John Doe", "johndoe@example.com", "5558383322"),
				new Contact(2, "Jane Doe", "janedoe@example.com", "5558384567"),
				new Contact(3, "Robert Keller", "robertkeller@example.com", "5559876543")
			);
	}

}
