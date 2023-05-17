package com.validations;

import com.users.User;

public class Validations {
	
	public static User validateLogin(String uname, String passwd) throws AuthenticationException
	{
		if(!User.users.containsKey(uname))
		{
			throw new AuthenticationException("User does not exists in our record");
		}
		else if(!User.users.get(uname).equals(passwd))
		{
			throw new AuthenticationException("User does not exists in our record");
		}
		
		User userLogIn = new User(uname);
		
		System.out.println("Login Successful...");
		return userLogIn;
	}
	
	
	public static String validateCurrentSession(String uname) throws AuthenticationException
	{
		if(User.activeSession == null)
		{
			throw new AuthenticationException("You are not logged in... LogIn First...");
		}
		else if(User.activeSession.getLoginId().equals(uname))
		{
			return uname;
		}
		return null;
	}

}
