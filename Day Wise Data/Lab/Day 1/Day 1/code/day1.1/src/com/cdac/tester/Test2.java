package com.cdac.tester;

import com.cdac.Faculty;
import com.cdac.Person;
import com.cdac.Student;

public class Test2 {

	public static void main(String[] args) {
		Person p;
		// indirect referencing , since type of ref m type of instance : different!
		// super class ref can DIRECTLY refer to ANY sub class instance!
		p = new Student("Mihir", "Mujumdar", "Java", 12345, 78, 2020);// up casting : impl done by javac : since extends
																		// keyword : Every Student IS-A Person!
		System.out.println(p);// run time poly : dynamic method dispatch : student dtls
		p = new Faculty("Riya", "sen", 10, "Java DBT React");// up casting!
		System.out.println(p);// run time poly : dynamic method dispatch : faculty dtls

	}

}
