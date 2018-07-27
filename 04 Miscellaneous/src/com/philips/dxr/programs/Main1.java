package com.philips.dxr.programs;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main1 {
	
	public static void main(String[] args) {
		
		// locates a properties file from the classpath, even if it is in a jar file
		ResourceBundle rb = ResourceBundle.getBundle("com.philips.dxr.resources.trainer");
		
		String name, email, phone;
		name = rb.getString("name");
		email = rb.getString("email");
		phone = rb.getString("phone");
		
		System.out.println("Name = " + name);
		System.out.println("Email = " + email);
		System.out.println("Phone = " + phone);
	}
	
	public static void main_ex3(String[] args) throws Exception {
		Properties props = new Properties();
		FileReader in = new FileReader("vinod.properties");
		props.load(in);
		in.close();

		System.out.println(props);
	}

	public static void main_ex2(String[] args) throws Exception {
		Properties props = new Properties();
		props.setProperty("name", "Vinod");
		props.setProperty("email", "vinod@vinod.co");
		props.setProperty("phone", "9731424784");

		FileWriter out = new FileWriter("vinod.properties");
		props.store(out, null);
		out.close();

		System.out.println("done");
	}

	@SuppressWarnings("unchecked")
	public static void main_ex1(String[] args) {
		Properties props = System.getProperties();

		Enumeration<String> propNames = (Enumeration<String>) props.propertyNames();

		while (propNames.hasMoreElements()) {
			String key = propNames.nextElement();
			String value = props.getProperty(key);
			System.out.printf("%s --> %s\n", key, value);
		}

	}

}
