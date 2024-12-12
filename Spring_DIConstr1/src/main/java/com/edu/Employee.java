package com.edu;

public class Employee {

	private int empid;
	private String empname;
	private float empsalary;
	public Employee() {
		super();
		System.out.println("Constructore with no args");
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, float empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		
		System.out.println("Constrcutore with argument");
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	
	public void displayEmployeeData() {
		System.out.println("Name = "+empname);
		System.out.println("Empid = "+empid);
		System.out.println("Empsalary ="+empsalary);
	}
	
	
}
