package com.philips.dxr.programs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.philips.dxr.entity.Contact;

public class Main2 {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document doc = builder.parse("contacts.xml");
		NodeList list = doc.getElementsByTagName("contact");

		List<Contact> contacts = new ArrayList<>();

		for (int i = 0, j = list.getLength(); i < j; i++) {
			Contact c1 = new Contact();
			Node currNode = list.item(i);
			NodeList childNodes = currNode.getChildNodes();
			// System.out.println("childNodes.length = " + childNodes.getLength());
			for (int p = 0, q = childNodes.getLength(); p < q; p++) {
				Node currChildNode = childNodes.item(p);
				if (currChildNode.getNodeType() != Node.ELEMENT_NODE)
					continue;

				String value = currChildNode.getFirstChild().getTextContent();
				switch (currChildNode.getNodeName()) {
				case "id":
					int id = Integer.parseInt(value);
					c1.setId(id);
					break;
				case "name":
					c1.setName(value);
					break;
				case "email":
					c1.setEmail(value);
					break;
				case "phone":
					c1.setPhone(value);
				}

			}
			contacts.add(c1);
		}

		for (Contact c : contacts) {
			System.out.println(c);
		}
	}

	public static void main_ex1(String[] args) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document doc = builder.parse("contacts.xml");
		NodeList list = doc.getElementsByTagName("name");

		for (int i = 0, j = list.getLength(); i < j; i++) {
			Node node = list.item(i);
			Node nameNode = node.getFirstChild();
			if (nameNode.getNodeType() == Node.TEXT_NODE) {
				String name = nameNode.getTextContent();
				System.out.println(name);
			}
		}

	}
}
