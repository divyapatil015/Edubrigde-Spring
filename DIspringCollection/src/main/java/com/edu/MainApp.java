package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
     Student sobj = (Student) context.getBean("studentobj");
     System.out.println("Sid="+sobj.getSid());  
     System.out.println("Student name="+sobj.getSname());
     System.out.println("Phones="+sobj.getPhones());
     
     System.out.println("Adress="+sobj.getAddress());
     System.out.println("Courses="+sobj.getCourse());
	}

}
