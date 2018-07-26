package com.philips.dxr.programs;

import com.philips.dxr.entity.Employee;
import com.philips.dxr.entity.InvalidSalaryException;

public class P03_WorkingWithInheritance {

	public static void main(String[] args) throws InvalidSalaryException {

		Employee e1 = new Employee();
		Employee e2 = new Employee(123, "Vinay", 34, 5.9, "PRODUCTION", 34000);
		
		e1.setId(123);
		e1.setName("Vinay");
		e1.setAge(34);
		e1.setHeight(5.9);
		e1.setDepartment("PRODUCTION");
		e1.setSalary(34000);
		
		
		System.out.println(e1);
		System.out.println(e2);
				
		System.out.println("e1==e2 is " + (e1==e2));
		System.out.println("e1.equals(e2) is " + (e1.equals(e2)));
	}
}
