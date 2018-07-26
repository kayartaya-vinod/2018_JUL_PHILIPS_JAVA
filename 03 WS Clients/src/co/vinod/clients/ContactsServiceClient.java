package co.vinod.clients;

import java.util.List;

import com.philps.soapws.Contact;
import com.philps.soapws.ContactsService;
import com.philps.soapws.ContactsServiceSoap;
import com.philps.soapws.DaoException_Exception;

public class ContactsServiceClient {

	public static void main(String[] args) throws DaoException_Exception {
		ContactsServiceSoap client;

		client = new ContactsService().getContactsServiceSoap();

		Contact c1 = client.getContact(12);

		System.out.println("Name = " + c1.getName());
		System.out.println("Email = " + c1.getEmail());
		System.out.println("Phone = " + c1.getPhone());

		List<Contact> list = client.getAllContacts();
		System.out.println("List of all contacts: ");
		for (Contact c : list) {
			System.out.println(c.getName() + " (" + c.getEmail() + ", " + c.getPhone() + ")");
		}
	}
}
