package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppAnnotationConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		
		Student sobj = context.getBean("student",Student.class);
		DivyaPatil dobj = context.getBean("divyaPatil",DivyaPatil.class);
		sobj.studentMethod();
		dobj.myname();

	}

}
