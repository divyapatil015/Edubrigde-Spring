package com.edu;

public class Product {
private String pname;

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public Product(String pname) {
	super();
	System.out.println("constructor with arg");
	this.pname = pname;
}
void init() {
	System.out.println("init method called");

}
void destroy() {
	System.out.println("Destroy method is called");
}
}
