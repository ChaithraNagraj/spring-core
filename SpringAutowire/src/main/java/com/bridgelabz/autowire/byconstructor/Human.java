package com.bridgelabz.autowire.byconstructor;
/******************************************************************************
 *  Purpose: Program is written for consuming the Heart class in this class
 *
 ******************************************************************************/

public class Human {

	private Heart heart;

	public Human(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();
	}
}
