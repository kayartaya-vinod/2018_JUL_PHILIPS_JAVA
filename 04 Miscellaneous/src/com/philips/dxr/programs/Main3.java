package com.philips.dxr.programs;

import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.philips.dxr.entity.Contact;
import com.philips.dxr.entity.Contacts;

public class Main3 {

	public static void main(String[] args) throws Exception {
		JAXBContext ctx = JAXBContext.newInstance(Contacts.class);
		Unmarshaller um = ctx.createUnmarshaller();
		FileReader file = new FileReader("contacts.xml");
		Contacts list = (Contacts) um.unmarshal(file);
		
		for(Contact c: list.getContacts()) {
			System.out.println(c);
		}
		
	}

	public static void main_ex1(String[] args) throws Exception {

		JAXBContext ctx = JAXBContext.newInstance(Contact.class);
		Contact c1 = new Contact(12, "John Doe", "johndoe@example.com", "5558392344");

		Marshaller m = ctx.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(c1, System.out);

	}
}
