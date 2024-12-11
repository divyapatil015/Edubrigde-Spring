package com.edu;

public class Student {

	private String sname;
	private String sage;
	private float sfees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String sage, float sfees) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.sfees = sfees;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSage() {
		return sage;
	}
	public void setSage(String sage) {
		this.sage = sage;
	}
	public float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sage=" + sage + ", sfees=" + sfees + "]";
	}
	public void displayData() {
		System.out.println("Name = "+sname);
		System.out.println("Age = "+sage);
		System.out.println("Fees = "+sfees);
	}
}
