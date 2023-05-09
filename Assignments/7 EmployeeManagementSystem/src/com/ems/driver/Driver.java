package com.ems.driver;
import java.util.HashMap;
import java.util.Scanner;

import com.ems.core.Employee;
import com.ems.utils.IOUtils;

public class Driver {

	public static void main(String[] args) {
	

		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;
			String fileName = null; // default file - employeeData.txt

			
			HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

			while (!exit) {
				try {
					System.out.println(
							"Select an option\n" + "1. Restore data from file\n" + "2. Enter EMS\n" + "0. Exit");
					switch (sc.nextInt()) {

					case 1: // RESTORE DATA FROM FILE - INITIALIZATION PHASE

						// INPUT - FILE NAME
						System.out.println("Enter the file name");
						fileName = sc.next();

						// PERFORM DESERIALIZATION
						employeeMap = (HashMap<Integer, Employee>) IOUtils.restoreEmployeeData(fileName);

						break;

					case 2: // PERFORM OPERATIONS - SERVICE PHASE
						ServiceProvider.services(sc, employeeMap);
						break;

					case 0: // STORE DATA TO FILE - TERMINATION PHASE

						// CHECK IF FILE NAME HAS BEEN PROVIDED
						if (fileName == null) {
							System.out.println("No file selected for backup. Please select a file.");
							System.out.println("Enter the file name");
							fileName = sc.next();
						}
						
						// PERFORM SERIALIZATION
						IOUtils.storeEmployeeData(employeeMap, fileName);

						// SET EXIT
						exit = true;

						// EXIT SUCCESS MESSGE
						System.out.println("Exited successfully!");

						break;

					default:
						System.out.println("Invalid Input");
						break;
					}
				} catch (Exception e) { // INNER CATCH-ALL BLOCK
//					e.printStackTrace();
					System.out.println(e.getMessage());

				}
			} // END OF WHILE LOOP

		} catch (Exception e) { // OUTER CATCH-ALL BLOCK
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
