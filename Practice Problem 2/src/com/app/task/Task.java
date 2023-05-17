package com.app.task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Task implements Comparable<Task> {
	
	//Data Members
	private static int idCounter=100;
	private int taskId;
	private String taskName;
	private String description; 
	private LocalDate taskDate; 
	private boolean active;
	Status status;
	public static ArrayList<Task> taskList = new ArrayList<>();
	
	//Constructors:
	
	private Task(int id)
	{
		this.taskId = id;
	}
	
	//Param Constructor for creation of the task.
	public Task(String taskName, String description, LocalDate taskDate) {
		
		idCounter = idCounter+1;
		this.taskId = idCounter;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.active = true;
		this.status = Status.PENDING;
	}

	
	//Setters and Getters
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	//Overriden methods
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Task)
		{
		Task other = (Task) obj;
		return taskId == other.taskId;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return " Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", active=" + active + ", status=" + status + "]\n";
	}
	
	@Override
	public int compareTo(Task task) {
		
		if(this.taskDate.isBefore(task.taskDate))
			return -1;
		else if(this.taskDate.isAfter(task.taskDate))
			return 1;
		
		return 0;
	}

	//Methods:
	//Method for creation of the task
	public static void createTask(Scanner sc)
	{ 
		System.out.print("\nEnter Task Name: ");
		String taskName = sc.nextLine();
		
		System.out.print("\nEnter Task Description: ");
		String description = sc.nextLine();
		
		System.out.print("\nEnter Task Date (yyyy-MM-dd):");
		LocalDate taskDate = LocalDate.parse(sc.nextLine());
		
		Task task = new Task(taskName,description,taskDate);
		
		taskList.add(task);
		System.out.println("Task Created Successfully...");
		
	}
	
	//Method for deleting task
	public static void deleteTask(int taskId)
	{
		Task tempTask = new Task(taskId);
		int index = taskList.indexOf(tempTask);
		taskList.remove(index);
		System.out.println("Task Deleted Successfully...");
	}
	
	public static void updateTaskStatus(int taskId, Scanner sc)
	{	
		//find task in arraylist with same id mensioned by user.
		Task tempTask = new Task(taskId);
		int index = taskList.indexOf(tempTask);
		
		//set new status for found object in arraylist.
		System.out.print("\nEnter new status of this task (PENDING, IN_PROGRESS, COMPLETED):");
		String status = sc.next().toUpperCase();
		Status newStatus = Status.valueOf(status);
		
		taskList.get(index).setStatus(newStatus);
		
		System.out.println("Index of Task Id:"+taskList.get(index).getTaskId()+" is successfully updated to: "+taskList.get(index).getStatus());
	}

	
	
	
	
	
	

}
