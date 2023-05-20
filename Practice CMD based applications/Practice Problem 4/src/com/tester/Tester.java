package com.tester;

import java.util.Scanner;

import com.app.Order;
import com.app.Pet;
import com.users.User;
import com.validations.AuthorizationException;
import com.validations.Validations;

public class Tester {
	
	public static void main(String[] args)
	{
		User admin = new User("admin","admin");
		User customer1 = new User("c1","c1");
		String uname = null; 
		
		boolean exit = false;
		try(Scanner sc = new Scanner(System.in))
		{
			while(!exit)
			{
				try {
					System.out.println("*****MENU*****\n"
							+ "1. Login\n"
							+ "2. Add new Pet (Admin only functionality)\n"
							+ "3. Update Pet details (Admin only functionality)\n"
							+ "4. Display all available pets\n"
							+ "5. Order a Pet\n"
							+ "6. Check order status by Order Id\n"
							+ "7. Update order status (Admin only functionality)\n"
							+ "0. Exit");
					System.out.print("\n\nEnter your choice: ");
					int choice = sc.nextInt();
					sc.nextLine();
					switch(choice)
					{
					
						case 1: //"1. Login\n"
							System.out.println("\n\n********Log In********");
							System.out.print("Enter Username: ");
						    uname = sc.nextLine();
							System.out.print("Enter Password: ");
							String passwd = sc.nextLine();
							User.activeSession = Validations.validateLogin(uname, passwd);
							break;
							
							
						case 2: //"2. Add new Pet (Admin only functionality)\n"
							
							if(Validations.validateCurrentSession(uname).equals("admin"))
								Pet.addNewPet(sc);
							else
								throw new AuthorizationException("You are not authorized to perform this action...");
							break;
							
							
						case 3: //"3. Update Pet details (Admin only functionality)\n"
							if(Validations.validateCurrentSession(uname).equals("admin"))
								Pet.updatePetDetails(sc);
							else
								throw new AuthorizationException("You are not authorized to perform this action...");
							break;
							
						case 4: //"4. Display all available pets\n"
							
							if(User.activeSession!=null)
							{
								System.out.println(Pet.petMap);
							}else {
								throw new AuthorizationException("You are not logged in...");								
							}
							
							break;
							
						case 5: //"5. Order a Pet\n"
							if(User.activeSession!=null)
							{
								Order.placeOrder(sc);
							}else {
								
								throw new AuthorizationException("You are not logged in...");								
							}
															break;
							
						case 6: //"6. Check order status by Order Id\n"
							if(User.activeSession!=null)
							{
								Order.checkOrderStatus(sc);
							}else {
								throw new AuthorizationException("You are not logged in...");								
							}
							break;
							
						case 7: //"7. Update order status (Admin only functionality)\n"
							break;
							
						case 0: //"0. Exit"
								System.out.println("Thank you...!");
								exit=true;						
							break;
							
					
					}
					
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("Press Enter to continue: ");
					sc.nextLine();				
				}
			}
		}
		
		
		
	}

}
