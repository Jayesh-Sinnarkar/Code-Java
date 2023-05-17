package com.app.tester;

import java.time.LocalDate;

import com.app.task.Task;

public class StubbedData {

	public static void addStubbedData()
	{
		Task task1 = new Task("Study","Study for 2 hours",LocalDate.parse("2023-05-14"));
		Task task2 = new Task("Gaming","Gaming for 2 hours",LocalDate.parse("2023-05-11"));
		Task task3 = new Task("Watch Movie","Watch movie for 2 hours",LocalDate.parse("2023-05-12"));
		Task task4 = new Task("Cleaning","Gotta do house cleaning",LocalDate.parse("2023-05-13"));
		Task task5 = new Task("Laundry","Gotta fo laundry",LocalDate.parse("2023-05-15"));
		
		Task.taskList.add(task1);
		Task.taskList.add(task2);
		Task.taskList.add(task3);
		Task.taskList.add(task4);
		Task.taskList.add(task5);
	}
}
