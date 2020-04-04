package com.bridgelabz.autowire.byname;
/******************************************************************************
 *  Purpose: Program is written for consuming the Heart class in this class
 *
 *  
 ******************************************************************************/

public class Human {

	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();
	}
}
