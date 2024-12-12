package com.edu;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int sid;
	private String sname;
	private Set<String> phones;
	private List<String> address;
	private Map<String, String> course;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", phones=" + phones + ", address=" + address + ", course="
				+ course + "]";
	}
	
	
}
