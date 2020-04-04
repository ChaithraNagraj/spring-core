package com.bridgelabz.beanlifecycle.callingbyinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/******************************************************************************
 *  Purpose: Program is written for implementing the bean init and destroy
 *  		 method
 *
 *******************************************************************************/

public class Hello implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method");

	}
	
	public void service() {
		System.out.println("Service");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method");

	}

}
