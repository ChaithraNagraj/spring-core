package com.bridgelabz.byannotationwithdec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by autowiring with declaration injection configure in xml
 *
 *****/

public class Body {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("humanAnnotationWithDec", Human.class);
		human.startPumping();
		((ClassPathXmlApplicationContext) context).close();
	}

}
