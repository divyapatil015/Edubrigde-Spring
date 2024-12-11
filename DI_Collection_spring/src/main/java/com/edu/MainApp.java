package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
     Employee eob =(Employee) context.getBean("employeeobj");
     System.out.println("Name= "+eob.getEname());
     System.out.println("Phones ="+eob.getPhones());
     System.out.println("Address = "+eob.getAddress());
     System.out.println("Courses = "+eob.getCourses());
	}

}
