package com.app.tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;

import com.app.task.Status;
import com.app.task.Task;

public class TaskManager {
	
	public static void main(String[] args)
	{
		boolean exit =false;
		StubbedData.addStubbedData();
		
		try(Scanner sc = new Scanner(System.in))
		{
			while(!exit)
			{
				try {
						//displaying menu options
					   System.out.println("\na) Add New Task"
										+ "\nb) Delete a task"
										+ "\nc) Update task status"
										+ "\nd) Display all pending task"
										+ "\ne) Display all pending tasks for today"
										+ "\nf) Display all tasks sorted by taskDate"
										+ "\ng) Exit"
										+ "\nh) Display all tasks");
					   System.out.print("Enter Your Choice: ");
					   String choice = sc.next().toLowerCase(); 
					   sc.nextLine();
					   switch(choice){
					   
					   case "a": //a. Add New Task
						   		Task.createTask(sc);
						   break;
						   
					   case "b": //b. Delete a task
						   		System.out.print("Enter Task ID to delete task: ");
						   		Task.deleteTask(sc.nextInt());
						   break;
						   
					   case "c": //c. Update task status
						   	System.out.print("Enter Task ID to update task status: ");
					   		Task.updateTaskStatus(sc.nextInt(), sc);
						   break;
						   
					   case "d": //d. Display all pending task
						   for(Task t : Task.taskList)
						   {
							   if(t.getStatus().equals(Status.PENDING))
								   System.out.println(t);
						   }
						   break;
						   
					   case "e": //e. Display all pending tasks for today
						   for(Task t : Task.taskList)
						   {
							   if(t.getTaskDate().isEqual(LocalDate.now()) &&t.getStatus().equals(Status.PENDING))
								   System.out.println(t);
						   }
						   break;
						   
					   case "f": //f. Display all tasks sorted by taskDat
						   Collections.sort(Task.taskList);
						   System.out.println(Task.taskList);
						   break;
						   
					   case "g": //g. Exit
						   exit=true;
						   System.out.println("Thank you...!");
						   break;
						   
					   case "h": System.out.println(Task.taskList);
						   break; 
						   
						   default:
							   System.out.println("Invalid Input");
							   break;
					   }
					   
					   
					
					   
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
