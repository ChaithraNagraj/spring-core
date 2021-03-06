package com.bridgelabz.autowire.byannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/******************************************************************************
 *  Purpose: Program is written for consuming the Heart class in this class
 *
  ******************************************************************************/

public class Human {
	private Heart heart;

	public Human() {

	}

	// autowired using constructor
	// @Autowired
	public Human(Heart heart) {
		System.out.println("In constructor");
		this.heart = heart;
	}

	// autowired using setter
	@Autowired
	@Qualifier("heartObj4")
	public void setHeart(Heart heart) {
		System.out.println("In setter");
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();
	}
}
