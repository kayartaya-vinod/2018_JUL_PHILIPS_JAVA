package co.vinod.programs;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Main3 {
	
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse("contacts.xml");
		NodeList list = doc.getElementsByTagName("name");
		for(int i=0, j=list.getLength(); i<j; i++) {
			String name = list.item(i).getFirstChild().getTextContent();
			System.out.println(name);
		}
	}

}
