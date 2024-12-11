package com.edu;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		Product pobj1 = (Product) context.getBean("pobj");
		Product pobj2 = (Product) context.getBean("pobj");
		System.out.println("pobj1 ="+pobj1);
		System.out.println("pobj2 ="+pobj2);
		context.registerShutdownHook();
	}

}
