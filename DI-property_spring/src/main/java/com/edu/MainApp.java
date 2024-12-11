package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
	     Student sob = (Student) context.getBean("sobj");
	     System.out.println("Name="+sob.getSname());
	     System.out.println("Age="+sob.getSage());
	     System.out.println("fees ="+sob.getSfees());
	}

}
