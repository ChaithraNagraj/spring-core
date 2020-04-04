package com.bridgelabz.beanlifecycle.callingbyinterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 /**
  *   Purpose: Program is written for dependency injection of spring using
 *  		 by using interface injection of InitializingBean DisposableBean 
 *  		 and it uses init and destroy method of spring bean life cycle
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = context.getBean("hello", Hello.class);
		hello.service();
		context.close();
	}

}
