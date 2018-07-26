package com.philips.dxr.programs;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.philips.dxr.entity.Employee;
import com.philips.dxr.entity.Person;
import com.philips.dxr.entity.Project;

public class P08_ReadWriteTextFiles {

	public static void main(String[] args) {
		
		
		
		
		
		String name1 = "Vinod";
		String name2 = "Vinay";
		
		System.out.println("name1.hashCode is: " + name1.hashCode());
		System.out.println("name2.hashCode is: " + name2.hashCode());
		
		Person p1 = new Person("Vimay", 45, 5.3);
		Person p2 = new Person("Vimay", 45, 5.3);
		System.out.println("p1.hashCode is: " + p1.hashCode());
		System.out.println("p2.hashCode is: " + p2.hashCode());
	}
	
	public static void exampl5(String[] args) {
		
		try(
			FileInputStream file = new FileInputStream("emps.data");
			ObjectInputStream in = new ObjectInputStream(file);
			){
			
			while(true) {
				try {
					Employee emp = (Employee) in.readObject();
					if(emp.getProjects()!=null) {
						for(Project p: emp.getProjects()) {
							System.out.println(p.getName());
						}
					}
					System.out.println(emp);
					
				} catch (EOFException e) {
					break;
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void example4(String[] args) throws Exception {
		Employee[] emps = { new Employee(1, "John", 23, 6.2, "ADMIN", 22000),
				new Employee(2, "Jane", 25, 5.5, "ADMIN", 26000),
				new Employee(3, "Smith", 44, 5.8, "PRODUCTION", 36000) };
		
		
		Project[] projects = { new Project("Project1"), new Project("Project2")};
		
		emps[0].setProjects(projects );

		try (FileOutputStream file = new FileOutputStream("emps.data");
				ObjectOutputStream out = new ObjectOutputStream(file);) {
			for (Employee e : emps) {
				out.writeObject(e);
			}
			System.out.println("Done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void example3(String[] args) {
		String filename = "/Users/vinodkumar/Documents/__temp/response_report.csv";
		String outputFilename = "temp.txt";

		try (FileReader reader = new FileReader(filename);
				BufferedReader in = new BufferedReader(reader);
				FileWriter out = new FileWriter(outputFilename);) {

			Date dt1 = new Date();
			String line;
			while ((line = in.readLine()) != null) {
				out.write(line.toUpperCase());
				out.write("\n");
			}
			Date dt2 = new Date();
			System.out.println("Copied the file in " + (dt2.getTime() - dt1.getTime()) + " ms");
		} catch (Exception e) {
		}

	}

	public static void example2(String[] args) {
		String filename = "./src/com/philips/dxr/programs/HelloWorld.java";
		try (FileInputStream in = new FileInputStream(filename)) {
			int size = in.available();
			byte[] bytes = new byte[size];
			in.read(bytes);
			String content = new String(bytes);
			System.out.println(content);
		} catch (Exception e) {
			System.out.println("There was an error!");
		}

	}

	public static void example1(String[] args) throws Exception {
		String filename = "./src/com/philips/dxr/programs/HelloWorld.java";
		FileReader in = new FileReader(filename);

		int ch;
		while ((ch = in.read()) != -1) {
			System.out.print((char) ch);
		}
		in.close();

	}

}
