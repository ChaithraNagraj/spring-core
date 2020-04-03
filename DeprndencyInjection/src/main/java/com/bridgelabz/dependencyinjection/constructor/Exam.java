package com.bridgelabz.dependencyinjection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Purpose:Program is written for dependecy injection of spring using
 *         construction injection
 * @author chaithra B N 
 *
 */
public class Exam {
public static void main(String[] args) {
	// dependency injection is used using setter method
//	@SuppressWarnings("resource")
//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	Student student = context.getBean("student", Student.class);

//	System.out.println("Student id is: " + student.getId());
//	  System.out.println("Student name is: "+student.getName());

	// dependency injection is used using constructor injection
	//
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Student student=context.getBean("studentcons",Student.class);

System.out.println(student);
((ClassPathXmlApplicationContext)context).close();
}
}
