package com.users;

import java.util.HashMap;

public class User {
	
	private String loginId;
	private String password;
	public static HashMap<String,String> users = new HashMap<>();
	public static User activeSession;
	
	
	
	//costructors
	public User(String loginId)
	{
		this.loginId = loginId;
	}
	@Override
	public String toString() {
		return ("User Name =" + loginId );
	}
	public User(String loginId, String password) {
		
		this.loginId = loginId;
		this.password = password;
		users.put(loginId, password);
		
	}
	
	
	//Setters and Getters
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	
	
	

}
