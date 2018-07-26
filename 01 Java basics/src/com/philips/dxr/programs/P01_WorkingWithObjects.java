package com.philips.dxr.programs;

import com.philips.dxr.entity.Person;

/**
 * This is a Java Program that creates variables of Person class
 * and instantiates, calls the setters, and prints the values.
 * 
 * The output of each object comes from respective toString() method
 *
 *  
 * @author <a href="mailto:vinod@vinod.co">Vinod Kumar</a>
 * @version 1.0
 * @see com.philips.dxr.entity.Person
 * 

 */
public class P01_WorkingWithObjects {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1;
		
		p1 = new Person();
		
		p1.setAge(44);
		p1.setHeight(5.8);
		p1.setName("John Doe");
		
		Person p2 = new Person("Jane Doe", 40, 5.2);

		System.out.println(p1);
		System.out.println(p2);

	}
}
