package com.ems.core;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.Map;

@SuppressWarnings("serial")
public class Employee implements Serializable{
	private Integer employeeId;
	private String name;
	private Department department;
	private Double salary;
	private LocalDate joiningDate;
	
	// CONSTRUCTOR
	public Employee(Integer employeeId, String name, Department department, Double salary, LocalDate joiningDate) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	// OVERRIDING - toString
	@Override
	public String toString() {
		return "\n--------------- Employee Details ---------------" 
				+ "\nEmployee ID = " + employeeId 
				+ "\nName = " + name 
				+ "\nDepartment = " 
				+ department + "\nSalary = " + salary 
				+ "\nJoining Date = " + joiningDate 
				+ "\n-------------------------------------------------";
	}
	
	// GETTERS AND SETTERS
	public Integer getEmployeeId() {
		return employeeId;
	}

	public Department getDepartment() {
		return department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//DISPLAY EMPLOYEE
	public static void display(Map<Integer, Employee> employeeMap, Department department, double minSalary, double maxSalary) {
		employeeMap.values().stream()
		.filter(emp -> emp.getDepartment().equals(department) && emp.getSalary() >= minSalary && emp.getSalary() <= maxSalary)
		.forEach(System.out::println);
		 
	}
	
	//APPLY INCREMENT
	public void applyIncrement(Double increment) {
		this.setSalary(this.getSalary() + increment);
	}
}
