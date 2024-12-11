package com.edu;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String ename;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String>courses;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String ename, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.ename = ename;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", phones=" + phones + ", address=" + address + ", courses=" + courses
				+ "]";
	}
	
}
