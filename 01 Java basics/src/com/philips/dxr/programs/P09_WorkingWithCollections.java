package com.philips.dxr.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.philips.dxr.entity.Circle;
import com.philips.dxr.entity.Person;

public class P09_WorkingWithCollections {

	public static void main(String[] args) {

		// listExample();
		// setExample1();
		// setExample2();
		// setExample3();
		// collectionsExample();
		mapExample1();

	}

	static void mapExample1() {
		Map<Integer, Person> map = new TreeMap<>();
		
		
		map.put(31, new Person("Harish", 34, 5.5));
		map.put(11, new Person("Vinay", 45, 5.7));
		map.put(12, new Person("Ramesh", 22, 5.8));
		map.put(11, new Person("Vinay", 46, 5.7));
		
		
//		for(Integer i : map.keySet()) {
//			System.out.println(map.get(i));
//		}
		
		for(Entry<Integer, Person> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}

	static void collectionsExample() {
		List<Person> people = new ArrayList<>();
		Person p1;

		p1 = new Person("John", 44, 5.6);
		people.add(p1);
		p1 = new Person("Jane", 24, 5.2);
		people.add(p1);
		p1 = new Person("Smith", 26, 5.6);
		people.add(p1);
		p1 = new Person("Martin", 44, 5.6);
		people.add(p1);
		p1 = new Person("Jane", 24, 5.2);
		people.add(p1);
		p1 = new Person("Keller", 48, 5.2);
		people.add(p1);

		System.out.println("Before: ");
		for (Person p : people) {
			System.out.println(p);
		}

		// Collections.shuffle(people);
		// Collections.sort(people);
		// Collections.sort(people, (pr1, pr2) -> Integer.compare(pr1.getAge(), pr2.getAge()));
		// Collections.reverse(people);
		// Collections.swap(people, 0, people.size()-1);
		Collections.replaceAll(people, new Person("Jane", 24, 5.2), new Person("Kate", 24, 5.2));
		
//		System.out.println("After: ");
//		for (Person p : people) {
//			System.out.println(p);
//		}
		


	}

	static void setExample3() {

		Set<Circle> circles = new TreeSet<>((c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
		circles.add(new Circle(1.2));
		circles.add(new Circle(2.2));
		circles.add(new Circle(1.7));
		circles.add(new Circle(1.2));
		circles.add(new Circle(3.4));
		circles.add(new Circle(5.6));

		for (Circle c : circles) {
			System.out.println(c);
		}

	}

	static void setExample2() {
		Set<Person> people = new TreeSet<>();
		Person p1;

		p1 = new Person("John", 44, 5.6);
		people.add(p1);
		p1 = new Person("Jane", 33, 5.2);
		people.add(p1);
		p1 = new Person("Smith", 44, 5.6);
		people.add(p1);
		p1 = new Person("Martin", 44, 5.6);
		people.add(p1);
		p1 = new Person("Jane", 33, 5.2);
		people.add(p1);
		p1 = new Person("Keller", 33, 5.2);
		people.add(p1);

		System.out.println("No.of people = " + people.size());
		for (Person p : people) {
			System.out.println(p);
		}

	}

	static void setExample1() {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(123);
		numbers.add(22);
		numbers.add(34);
		numbers.add(55);
		numbers.add(55);
		// numbers.add(null); // not allowed in TreeSet
		// numbers.add(null); // not allowed in TreeSet
		numbers.add(0);
		// numbers.add(null); // not allowed in TreeSet
		// numbers.add(null); // not allowed in TreeSet
		numbers.add(22);
		numbers.add(123);
		numbers.add(-123);

		System.out.println("numbers are: " + numbers);

	}

	static void listExample() {
		List<String> names = new ArrayList<>();
		names.add("Vinod");
		names.add("Shyam");
		names.add("Vinod");
		names.add(null);
		names.add("Johnny");
		names.add(1, "Jane");
		names.set(4, "Smith");
		// names.remove("Vinod");
		names.remove(3);
		int index = names.indexOf("John");
		System.out.println("John's index = " + index);
		String name = names.get(4);
		System.out.println("Name at index 4 is: " + name);
		System.out.println(names);
		System.out.println("No.of names = " + names.size());

		// enhanced for loop (for each loop)
		for (String nam : names) {
			System.out.println(nam);
		}
		System.out.println();

		// prior to java 1.5
		for (int i = 0, j = names.size(); i < j; i++) {
			System.out.println(names.get(i));
		}
		System.out.println();

		// better method:
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String n = it.next();
			System.out.println(n);
		}
	}
}
