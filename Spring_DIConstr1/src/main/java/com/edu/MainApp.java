package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method");
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
				Employee eob = (Employee) context.getBean("employeeobj");
				eob.displayEmployeeData();
				
				Employee eob1 = (Employee) context.getBean("employeeobj1");
				eob1.displayEmployeeData();
				
				Employee eob2 = (Employee) context.getBean("employeeobj2");
				eob2.displayEmployeeData();
	}

}
