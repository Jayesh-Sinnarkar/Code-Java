package com.cdac;

public class Person {
//state => non static data members(instance vars)
	//tight encapsulation
	private String firstName;
	private String lastName;
	public Person(String firstName,String lastName)
	{
		System.out.println("2");
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//why override toString : to replace inherited hashCode version by the actual details
	@Override
	public String toString()
	{
		return this.firstName+" "+this.lastName;
	}
	//getter for firstname

	public String getFirstName()
	{
	//	 System.out.println(this);//this.toString
		return this.firstName;
	}
	//getter for last name
	public String getLastName() {
		return lastName;
	}
	
}
