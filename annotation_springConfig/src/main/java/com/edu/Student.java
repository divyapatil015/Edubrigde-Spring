package com.edu;

import org.springframework.stereotype.Component;

@Component  // make object ready Student student = new Student();
public class Student {

	public void studentMethod() {
		
		System.out.println("Hello Welcome to Annotation based Configuration");
	}
}
