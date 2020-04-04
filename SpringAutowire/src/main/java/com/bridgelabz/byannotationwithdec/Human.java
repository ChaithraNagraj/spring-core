package com.bridgelabz.byannotationwithdec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/******************************************************************************
 *  Purpose: Program is written for consuming the Heart class in this class
 *
 * 
 ******************************************************************************/

public class Human {
	@Autowired
	@Qualifier("heartObj6")
	private Heart heart;

	public void startPumping() {
		heart.pump();
	}
}
