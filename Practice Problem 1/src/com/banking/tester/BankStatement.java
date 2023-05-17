package com.banking.tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankStatement {
	
	
	public static void main(String[] args)
	{
		LocalDate transactionDate;
		String narration;
		double withdrawalAmount;
		double depositAmount;
		double sumOfDeposits=0;
		double maxDeposit=0;
		double maxWithdrawn=0;
		double shoppingExpenses=0;
		String dateOfMaxWithdrawal="";
		String line="";
		String[] tempStr;
		
		//adding BufferedReader to read Jan23.txt
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jayes\\OneDrive\\Documents\\Core-Java\\Practice Problem 1\\src\\com\\banking\\tester\\Jan23.txt")))
		{
			br.readLine(); //Neglecting first line containing column headings.
			line = br.readLine(); // Reading Second Line
			while(line!=null)
			{
				try {
					
					tempStr = line.split(",");//splitting String line with delimiter "," and storing result in tempStr String array
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");//Defining format for date
					transactionDate = LocalDate.parse(tempStr[0], dtf);//converting String transactionDate to LocalDate format
					narration = tempStr[1];//Reading Narration from file and storing in local variable
					withdrawalAmount = Double.parseDouble(tempStr[2]);//Converting withdrawal amount form string format to double and storing it in local variable withdrawalAmount
					
					if(narration.equals("Shopping"))//calculating total shopping expenses
					{
						shoppingExpenses += withdrawalAmount;
					}
					

					if(withdrawalAmount>maxWithdrawn) //Finding Maximum Withdrawal Amount & Date on which max amount withdrawn happened.
					{
						maxWithdrawn = withdrawalAmount;
						dateOfMaxWithdrawal=tempStr[0];
					}
					
					
					
					depositAmount = Double.parseDouble(tempStr[3]);//Converting depositAmount amount form string format to double and storing it in local variable depositAmount
					sumOfDeposits += depositAmount;//calculating sum of all deposits
					
					
					//finding maximum deposit amount
					if(depositAmount>maxDeposit)
					{
						maxDeposit = depositAmount;
					}
					
					line = br.readLine(); // Reading Next Line
					
				}catch(Exception e)
				{
					e.printStackTrace();
					
				}
				
			}
			//Printing Output on Console
			System.out.println("Sum of all deposits: "+sumOfDeposits);
			System.out.println("Max deposit amount: "+maxDeposit);
			System.out.println("Shopping expenses: "+shoppingExpenses);
			System.out.println("Date on which max amount withdrawn"+dateOfMaxWithdrawal);
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
