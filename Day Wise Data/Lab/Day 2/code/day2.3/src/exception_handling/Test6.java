package exception_handling;

import java.text.*;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		// How to Parse(convert) String --> Date ?
		// 1. Create SDF instance
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter join date");
		System.out.println("Join Date " + sdf.parse(sc.next()));// javac forces the handling of checked excs
		System.out.println("end of try....");
		sc.close();
		System.out.println("main cntd....");

	}

}
