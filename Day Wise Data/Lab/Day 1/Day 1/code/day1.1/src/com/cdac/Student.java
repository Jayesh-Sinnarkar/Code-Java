package com.cdac;

public class Student extends Person {
	private String courseName;
	private int fees;
	private int marks;
	private int gradYear;

//what will javac impl add in a subclass ctor ?
//	public Student()
//	{
//		super();//invoke immediate super cls's def ctor
//	}
	public Student(String fn, String ln, String courseName, int fees, int marks, int yr) {
		// super();
		// how to invoke parameterized super cls ctor?
		super(fn, ln);
		System.out.println("1");
		this.courseName = courseName;
		this.fees = fees;
		this.marks = marks;
		gradYear = yr;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + " " + courseName + " fees paid " + fees + " passed in " + gradYear
				+ " marks " + marks;
	}

	// can u add student specific functionality ?
	public void study() {
		// display first name studying in course name
		System.out.println(super.getFirstName() + " studying in " + this.courseName);// super n this keyword : optional!
	}
}
