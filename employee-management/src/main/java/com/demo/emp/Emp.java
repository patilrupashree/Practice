package com.demo.emp;

public class Emp {
 
	private int empId;
	private String name;
	private String city;
	private double salary;
	
	//no args constructor
	//constructor using all fields
	//setter and getter for all fields
	
	
	public Emp(int id, String name,String city, double salary) {
		this.empId = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public String getDetails() {
		return empId + " " + name + " " + city +""+ salary;
	}

	public int getId() {
	
		return empId;
	}

	public void setId(int id) {
		this.empId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
