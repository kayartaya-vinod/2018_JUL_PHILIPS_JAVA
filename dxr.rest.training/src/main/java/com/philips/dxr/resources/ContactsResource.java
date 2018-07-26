package com.philips.dxr.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.philips.dxr.dao.ContactsDao;
import com.philips.dxr.dao.DaoException;
import com.philips.dxr.dao.DaoFactory;
import com.philips.dxr.entity.Contact;

@Path("/contacts")
public class ContactsResource {

	ContactsDao dao;

	public ContactsResource() throws DaoException {
		dao = DaoFactory.getContactsDao();
	}
	
	@GET
	@Path("/{x}")
	@Produces({ "application/json", "application/xml" })
	public Contact getOneContact(@PathParam("x") int id) throws DaoException {
		return dao.getContactById(id);
	}
	

	@GET
	@Produces({ "application/json", "application/xml" })
	public List<Contact> getAllContacts() throws DaoException {
		return dao.getAllContacts();
	}
	
	@POST
	@Consumes({ "application/json", "application/xml" })
	public void addNewContact(Contact contact) throws DaoException{
		System.out.println("Recd. a new contact: " + contact);
		dao.createNewContact(contact);
	}

}









