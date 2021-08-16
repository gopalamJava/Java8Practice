package com.collectionswithoutlambdaexpressions;

public class Employee {
	
	private int empId;
	private String name;
	private char bloodgroup;
	private String group;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", bloodgroup=" + bloodgroup + ", group=" + group + "]";
	}
	public Employee(int empId, String name, char bloodgroup, String group) {
		super();
		this.empId = empId;
		this.name = name;
		this.bloodgroup = bloodgroup;
		this.group = group;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(char bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	

}
