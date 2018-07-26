package com.philips.dxr.entity;

import java.io.Serializable;

// by implementing the marker interface 'Cloneable', the author
// of this class is permitting the JRE to clone an object of this class
// or objects of any of the subclasses to be cloned by the native code of the JVM
public class Person implements Cloneable, Serializable, Comparable<Person> {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double height;

	public Person() {
	}

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	// readable property (accessor) called "name"
	public String getName() {
		return name;
	}

	// writable property (mutator) called "name"
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Person other) {
		// return this.age - other.age;
		return this.name.compareTo(other.name);
		// return Double.compare(this.height, other.height);
	}

}
