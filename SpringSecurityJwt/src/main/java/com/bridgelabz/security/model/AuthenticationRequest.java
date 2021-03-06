package com.bridgelabz.security.model;

import java.io.Serializable;

public class AuthenticationRequest  implements Serializable{

	/**Authentication request checking info provided here
	 * its going to defined the input auth
	 */
	private static final long serialVersionUID=1l;
	private String username;
	private String password;
	public String getUsername() {
		return username;
		}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	//we need default constructor for json pasing

	public AuthenticationRequest() {
		
	}
	public AuthenticationRequest(String username,String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	
}
