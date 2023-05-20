package com.cdac;

public class Faculty extends Person {
//state : exp in yrs, sme
	private int expInYears;
	private String sme;

	public Faculty(String firstName, String lastName, int yrs, String sme) {
		// inovke immediate super cls's MATCHING ctor
		super(firstName, lastName);
		System.out.println("3");
		this.expInYears = yrs;
		this.sme = sme;
	}

	// override toString to ret complete details about the faculty
	@Override
	public String toString() {
		return "Faculty " + super.toString() + " no of yrs " + expInYears + " exeprt in " + sme;
	}
	//additional func
	public void teach()
	{
		System.out.println(getLastName()+" teaching for "+expInYears+" years in "+sme);
	}
}
