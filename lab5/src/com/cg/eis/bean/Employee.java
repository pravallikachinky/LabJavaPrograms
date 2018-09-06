package com.cg.eis.bean;

public class Employee {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInssch() {
		return inssch;
	}
	public String setInssch(String inssch) {
		return this.inssch = inssch;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	private String name,designation,inssch;
	private long salary;
	public Employee(String id, String name, String designation,
			long salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		
		this.salary = salary;
	}
			
	
}
