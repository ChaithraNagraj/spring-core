/******************************************************************************
 *  Purpose: Program is written for providing bike functionality in
 *  		 application it uses @Component annotation for making object of the
 *  		 class @Autowired used for injecting object of different class
 ******************************************************************************/

package com.bridgelabz.mavenproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	@Autowired
	private Tyre tyre;

	public void drive() {
		System.out.println("Bike running: " + tyre);
	}
}
