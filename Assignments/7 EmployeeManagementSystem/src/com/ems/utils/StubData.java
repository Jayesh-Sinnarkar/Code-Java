package com.ems.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.ems.core.Department;
import com.ems.core.Employee;

public class StubData {
	public static Map<Integer, Employee> getEmployeeData(){
		HashMap<Integer, Employee> employeeMap = new HashMap<>();
		
		employeeMap.put(101, new Employee(101, "Raj", Department.ACCOUNTS, 25000.0, LocalDate.parse("2022-07-14")));
		employeeMap.put(102, new Employee(102, "Viraj", Department.HR, 15500.0, LocalDate.parse("2023-01-04")));
		employeeMap.put(103, new Employee(103, "Siraj", Department.ADMINISTRATION, 30500.0, LocalDate.parse("2022-02-21")));
		employeeMap.put(104, new Employee(104, "Miraj", Department.MARKETING, 22500.0, LocalDate.parse("2023-01-15")));
		employeeMap.put(105, new Employee(105, "Ninaj", Department.OPERATIONS, 45000.0, LocalDate.parse("2020-03-02")));
		
		return employeeMap;
	}
}
