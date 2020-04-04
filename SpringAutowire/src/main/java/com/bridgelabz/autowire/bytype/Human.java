package com.bridgelabz.autowire.bytype;
/******************************************************************************
 *  Purpose: Program is written for consuming the Heart class in this class
 *
 *******************************************************************************/



public class Human {
	
	private Heart heart123;

	public void setHeart(Heart heart) {
		this.heart123 = heart;
	}

	public void startPumping() {
		heart123.pump();
	}
}
