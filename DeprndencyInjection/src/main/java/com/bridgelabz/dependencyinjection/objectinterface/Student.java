/******************************************************************************
 *  Purpose: Class which has setter method of object which will inject from 
 *  		 bean
 *
 *  @author  chaithra
 *
 ******************************************************************************/

package com.bridgelabz.dependencyinjection.objectinterface;

public class Student {
	private Cheat cheat;

	public void setCheat(Cheat cheat) {

		this.cheat = cheat;
	}

	public void startCheat() {
		cheat.cheat();
	}

}
