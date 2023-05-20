package exception_handling;

import java.text.*;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			// How to Parse(convert) String --> Date ?
			// 1. Create SDF instance
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Enter join date");
			System.out.println("Join Date " + sdf.parse(sc.next()));// javac forces the handling of checked excs
			System.out.println("end of try....");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		sc.close();
		System.out.println("main cntd....");

	}

}
