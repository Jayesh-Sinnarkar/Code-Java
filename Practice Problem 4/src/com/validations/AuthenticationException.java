package com.validations;

@SuppressWarnings("serial")
public class AuthenticationException extends Exception
{
	AuthenticationException(String err)
	{
		super(err);
	}

}
