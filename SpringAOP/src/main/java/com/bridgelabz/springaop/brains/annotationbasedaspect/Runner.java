package com.bridgelabz.springaop.brains.annotationbasedaspect;
/******************************************************************************
 *  Purpose: Program is written for running the @Aspect which will be invoked 
 *  		 before the getName() method calls
 *  		 
 *
**/


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("annoShapeService", ShapeService.class);
		System.out.println(shapeService.getAnnocircle().getName());
		((ClassPathXmlApplicationContext) context).close();

	}

}
