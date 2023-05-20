package com.cdac.tester;

import java.util.Scanner;

import com.cdac.Faculty;
import com.cdac.Person;
import com.cdac.Student;

public class EventOrganizer {

	public static void main(String[] args) {
		// create scanner cls instance to wrap std in
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max no of participants");
		Person[] participants = new Person[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out
					.println("1. Register Student 2. Register Faculty " + "3. Display all participant details 0.Exit");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:// student reg
				if (counter < participants.length) {
					System.out.println(
							"Enter student details : first nm,  lastnm,  courseName,  fees,  marks,  grad yr ");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(),
							sc.nextInt());// up casting
				} else
					System.out.println("Event Full!!!!!!!!!!!!!!!!");

				break;
			case 2: // faculty reg
				if (counter < participants.length) {
					System.out.println("Enter faculty details : first nm,  lastnm, exp in yrs , sme");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());// up casting
				} else
					System.out.println("Event Full!!!!!!!!!!!!!!!!");

				break;
			case 3:
				System.out.println("Display info");
				//{s1,s2,s3,f1,s4,s5,null...null}
				for (Person p : participants)// p=participants[0],.....p=participants[participants.length-1]
					if (p != null)
						System.out.println(p);
				break;
			case 0:
				exit = true;
				break;

			}
		}
		sc.close();

	}

}
