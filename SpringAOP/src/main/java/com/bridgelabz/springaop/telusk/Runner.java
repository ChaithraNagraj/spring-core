package com.bridgelabz.springaop.telusk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Purpose is written for implementing spring aop functionality
 * Aspect oriented programming is used to solve the cross 
 * cutting concerns and programmer will able to focus on 
 * logic rather than maintaining log,security,transaction
 * @author chaithra B N
 *
 */
public class Runner {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	
	
	Alien alien=context.getBean("alien",Alien.class);
	alien.show();
	((AnnotationConfigApplicationContext) context).close();
}
}
