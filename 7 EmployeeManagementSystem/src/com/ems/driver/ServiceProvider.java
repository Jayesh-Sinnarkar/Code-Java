package com.ems.driver;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.ems.core.Department;
import com.ems.core.Employee;
import com.ems.exceptions.EMSException;
import com.ems.utils.EmployeeValidator;

public interface ServiceProvider {

	public static void services(Scanner sc, Map<Integer, Employee> employeeMap) {
		boolean back = false;
		while (!back) {
			try {
				System.out.println("1. Add employee detail\n" + "2. Display all employee details\n"
						+ "3. Retrieve employee detail by employee ID\n" + "4. Delete employee detail\n"
						+ "5. Display employee details (from department and salary range)\n" + "6. Increment salary\n0. Back");
				switch (sc.nextInt()) {
					case 1:	// ADD EMPLOYEE
						
						// CHECK FOR DUPLICATE EMPLOYEE ID
						System.out.println("Enter employee id");
						int empId = EmployeeValidator.checkDuplicate(sc.nextInt(), employeeMap);
						
						// INPUT - NAME
						System.out.println("Enter employee name");
						String name = sc.next();
						
						// VALIDATE DEPARTMENT
						System.out.println("Enter employee department\n HR, MARKETING, ACCOUNTS, OPERATIONS, ADMINISTRATION");
						Department department = EmployeeValidator.validateDepartment(sc.next());
						
						// VALIDATE SALARY - MINIMUM WAGES
						System.out.println("Enter employee salary");
						Double salary = EmployeeValidator.validateSalary(sc.nextDouble());
						
						// VALIDATE JOINING DATE - CAN NOT JOIN IN ADVANCE
						System.out.println("Enter joining date (yyyy-MM-dd)");
						LocalDate joiningDate = EmployeeValidator.validateJoiningDate(sc.next());
						
						// ADD THE DATA IN RECORD
						employeeMap.put(empId, new Employee(empId, name, department, salary, joiningDate));
						
						// SUCCESS MESSAGE
						System.out.println("Employee successfully added to the system!");
						
						break;
						
					case 2:	// DISPLAY DETAILS OF ALL EMPLOYEES
						
						// CHECK FOR EMPTY MAP
						EmployeeValidator.isEmpty(employeeMap);
						
						// SHOW EMPLOYEE RECORDS
						employeeMap.values().forEach(System.out::println);
						
						break;
						
					case 3: // RETRIEVE EMPLOYEE DETAIL BY EMPLOYEE ID
						
						// CHECK FOR EMPTY MAP
						EmployeeValidator.isEmpty(employeeMap);
						
						// RETRIEVE EMPLOYEE RECORD
						System.out.println("Enter employee Id");
						empId = EmployeeValidator.checkExists(sc.nextInt(), employeeMap);
						
						// DISPLAY RECORD
						System.out.println(employeeMap.get(empId));
						
						break;
						
					case 4:	// DELETE EMPLOYEE BY EMPLOYEE ID
						
						// CHECK FOR EMPTY MAP
						EmployeeValidator.isEmpty(employeeMap);
						
						//DELETE EMPLOYEE RECORD
						System.out.println("Enter employee Id to be removed");
						empId = EmployeeValidator.checkExists(sc.nextInt(), employeeMap);
					
						employeeMap.values().removeIf(emp -> emp.getEmployeeId().equals(empId));
						
						// SUCCESS MESSAGE
						System.out.println("Employee removed successfully!");
						
						break;
						
					case 5: // DISPLAY EMPLOYEE DETAIL HAVING SPECIFIED DEPARTMENT AND WITH IN THE SPECIFIED SALARY RANGE
						
						// CHECK FOR EMPTY MAP
						EmployeeValidator.isEmpty(employeeMap);
						
						// RETRIEVAL OPERATIONS
						System.out.println("Enter department \n HR, MARKETING, ACCOUNTS, OPERATIONS, ADMINISTRATION");
						department = EmployeeValidator.validateDepartment(sc.next());
						
						System.out.println("Enter lower bound of salary range");
						double minSalary = sc.nextDouble();
						
						System.out.println("Enter upper bound of salary range");
						double maxSalary = sc.nextDouble();
						
						Employee.display(employeeMap, department, minSalary, maxSalary);
						
						break;
						
					case 6:	// INCREMENT SALARY OF EMPLOYEES
					
						// CHECK FOR EMPTY MAP
						EmployeeValidator.isEmpty(employeeMap);
						
						// INCREMENT OPERATIONS
						System.out.println("Enter employee Id");
						empId = EmployeeValidator.checkExists(sc.nextInt(), employeeMap);
						
						System.out.println("Enter increment amount");
						double increment = sc.nextDouble();
						
						employeeMap.get(empId).applyIncrement(increment);
						
						// SUCCESS MESSAGE
						System.out.println("Salary incremented successfully!");
						break;
						
					case 0:
						back = true;
						break;
					
					default:
						System.out.println("Invalid Input");
						break;
				}
			}
			catch (Exception e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
