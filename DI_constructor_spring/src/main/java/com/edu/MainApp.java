package com.edu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		Student s1 =(Student) context.getBean("sobj");
		
		System.out.println("Name = "+s1.getSname());
		System.out.println("Age = "+s1.getSage());
		System.out.println("Fees = "+s1.getSfees());
		
		System.out.println(s1);
		s1.displayData();
		

	}

}
