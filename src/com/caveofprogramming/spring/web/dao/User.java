package com.caveofprogramming.spring.web.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.caveofprogramming.spring.web.validation.ValidEmail;

public class User {
@Size(min = 5, max = 100, message = "Name must be between 5 and 100 characters.") 
public User(String unm,String pwd,boolean enb)
{
		this.username = unm;
		this.enabled = enb;
		this.password = pwd;
	}

	@Size(min=5, max=100, message="Name must be between 5 and 100 characters.")
	private String username;
	
	@NotNull
	//@Pattern(regexp=".*\\@.*\\..*", message="This does not appear to be a valid email address")
	@ValidEmail(min=6, message="This email address is not valid.")
	private boolean enabled;
	
	@Size(min=5, max=100, message="Text must be between 20 and 255 characters.")
	private String password;

	public String getUsername() {
		return  this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean val) {
		this.enabled = val;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
