package com.philips.dxr.jaxws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.WebFault;

import com.philips.dxr.dao.ContactsDao;
import com.philips.dxr.dao.DaoException;
import com.philips.dxr.dao.DaoFactory;
import com.philips.dxr.entity.Contact;

@WebService(name = "ContactsServiceSoap", // the interface name on the clientside
		serviceName = "ContactsService", // the service class name, that provides a getter
		portName = "ContactsServiceSoap", // name of the getter in the service class
		targetNamespace = "http://philps.com/soapws/")
public class ContactsWebService {

	private ContactsDao dao;
	
	public ContactsWebService() throws DaoException {
		dao = DaoFactory.getContactsDao();
		System.out.println(">>>>> ContactsWebService instantiated!");
	}

	@WebMethod(operationName = "getContact")
	
	@WebResult(name = "getContactResponseOut")
	public Contact getContact(@WebParam(name = "getContactResponseIn", partName = "id") int id)  throws DaoException {
		return dao.getContactById(id);
	}

	@WebMethod
	public List<Contact> getAllContacts() throws DaoException {
		return dao.getAllContacts();
	}

}
