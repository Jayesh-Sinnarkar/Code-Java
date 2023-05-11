package com.ems.utils;

import java.time.LocalDate;
import java.util.Map;

import com.ems.core.Department;
import com.ems.core.Employee;
import com.ems.exceptions.EMSException;

public class EmployeeValidator {
	
	private static double MIN_WAGE;
	
	static {
		MIN_WAGE = 7000;
	}
	
	// EMPLOYEE ID VALIDATION - DUPLICATES NOT ALLOWED
	public static int checkDuplicate(int empId, Map<Integer, Employee> employeeMap) throws EMSException {
		Employee emp = employeeMap.get(empId);
		if(emp != null)
			throw new EMSException("Employee already exists in the system");
		return empId;
	}
	
	// CHECK IF EMPLOYEE EXISTS
	public static int checkExists(int empId, Map<Integer,Employee> employeeMap) throws EMSException {
		Employee emp = employeeMap.get(empId);
		if(emp == null)
			throw new EMSException("Employee does not exist in the system");
		return empId;
	}
	
	// EMPLOYEE DEPARTMENT VALIDATION - MUST SELECT AN EXISTING DEPARTMENT
	public static Department validateDepartment(String department) throws EMSException {
		for(Department d : Department.values()) {
			if(d.name().equals(department.toUpperCase()))
				return d;
		}
		throw new EMSException("Invalid Department");
	}
	
	// EMPLOYEE SALARY VALIDATION - MINIMUM SALARY
	public static Double validateSalary(double salary) throws EMSException {
		if(salary < MIN_WAGE)
			throw new EMSException("Salary can not be less than minimum wage " + MIN_WAGE);
		return salary;
	}
	
	// JOINING DATE VALIDATION - CAN NOT JOIN IN ADVANCE
	public static LocalDate validateJoiningDate(String date) throws EMSException {
		LocalDate testDate = LocalDate.parse(date);
		if(testDate.isAfter(LocalDate.now()))
			throw new EMSException("Invalid date. Employee can not join in advance.");
		return testDate;
	}
	
	// CHECK FOR EMPTY MAP
	public static void isEmpty(Map<Integer, Employee> employeeMap) throws EMSException {
		if(employeeMap.isEmpty())
			throw new EMSException("No data records found");
	}
}
