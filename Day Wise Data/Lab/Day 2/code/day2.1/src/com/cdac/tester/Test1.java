package com.cdac.tester;

import com.cdac.Faculty;
import com.cdac.Student;

public class Test1 {

	public static void main(String[] args) {
		//String fn,String ln,String courseName,int fees,
		//int marks,int yr
		//direct referencing => type of the ref n type of object is SAME
		Student s1=new Student("Mihir", "Mujumdar", "Java", 12345, 78, 2020);
		System.out.println(s1);//s1.toString()
		s1.study();
		//create faculty instance n display details
		Faculty f1=new Faculty("Riya", "sen", 10, "Java DBT React");
		System.out.println(f1);
		f1.teach();
		

	}

}
