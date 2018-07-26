package com.philips.dxr.programs;

import com.philips.dxr.entity.Employee;
import com.philips.dxr.entity.InvalidSalaryException;
import com.philips.dxr.entity.Person;

public class P07_CloningObjects {
	public static void main(String[] args) throws CloneNotSupportedException, InvalidSalaryException {

		Person p1 = new Person("Naveen", 34, 5.9);
		Person p2 = (Person) p1.clone();

		Employee e1 = new Employee(1, "John", 22, 5.9, "Unknown", 20000);
		Employee e2 = (Employee) e1.clone();

		System.out.println("p1 == p2 is " + (p1 == p2));
		System.out.println("p1.equals(p2) is " + p1.equals(p2));

		p1.setAge(35);
		
		
		
		System.out.println(p1);
		System.out.println(p2);

		System.out.println(e1);
		System.out.println(e2);

	}
}
