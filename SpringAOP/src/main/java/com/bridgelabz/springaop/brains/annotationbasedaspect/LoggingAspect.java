package com.bridgelabz.springaop.brains.annotationbasedaspect;
import org.aspectj.lang.ProceedingJoinPoint;

/******************************************************************************
 *  Purpose: Program is written for putting the aspect by using @Aspect 
 *  		 annotation @Before will be invoked before getName() method called
 *  		 this class has now elaborated so much of annotations
 *  		 @After @Before @AfterReturning @BeforeReturning
 *  		 @AfterThrowing @BeforeThrowing
 *  		 @Pointcut
 *  		 JoinPoint in order to support around advice in aspect
 *  		 @Around
 **/


public class LoggingAspect {

	public Object aroundAdviceReturnedAllGetters(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnedObject = null;
		try {
			System.out.println("Before advice");
			returnedObject = proceedingJoinPoint.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			System.out.println("After Throwing");
			e.printStackTrace();
		}
		System.out.println("After finally");
		return returnedObject;
	}
}
