package com.bridgelabz.springaop.telusk;
/**purpose  is writen for ahowing simple messaage on console
it uses @component annotation for making object of the class
**/


public class Alien {
public void show() {
	// lets assume that

			// this method should also -> log
			// also has -> security
			// also has -> transaction
			// transaction -> begin

			// method has 15 lines of statements -> business login

			// programmer should always concern about business login of this method not
			// concern about any other method in this method

			// if we are keeping method somewhere and calling that method will also increase
			// overhead by calling each method in this method

			// recommended to use spring aop
System.out.println("Hello all aliens");
//transaction commit
// log
}
}
