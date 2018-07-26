package com.philips.dxr.entity;

public class Employee extends Person{
	private static final long serialVersionUID = 1L;
	private int id;
	private String department;
	private Double salary;
	
	
	transient private Project[] projects;

	public Employee() {
		// super(); // not needed; implicitly done
	}

	public Employee(int id, String name, int age, double height, 
			String department, double salary) throws InvalidSalaryException {
		super(name, age, height);
		this.id = id;
		this.department = department;
		this.setSalary(salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}
	
	public Project[] getProjects() {
		return projects;
	}
	
	public void setProjects(Project[] projects) {
		this.projects = projects;
	}
	
	

	public void setSalary(double salary) throws InvalidSalaryException {
		if(salary <15000 || salary>150000) {
			throw new InvalidSalaryException("Salary must be between 15000 and 150000");
		}
		this.salary = salary;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", department=" + department + ", salary=" + salary + ", name=" + getName()
				+ ", age=" + getAge() + ", height=" + getHeight() + "]";
	}

}
