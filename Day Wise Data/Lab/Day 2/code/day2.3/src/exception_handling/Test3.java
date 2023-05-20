package exception_handling;

import java.text.*;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// How to Parse(convert) String --> Date ?
		// 1. Create SDF instance
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter join date");
		//un comment a line below : to understand chked exc
	//	System.out.println("Join Date " + sdf.parse(sc.next()));// javac forces the handling of checked excs
		sc.close();

	}

}
