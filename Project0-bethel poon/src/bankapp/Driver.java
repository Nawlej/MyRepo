package bankapp;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {
	//runs the application
	
	// serves as the id that determines the administrator, employee, or customer
	int personID;
		
	public static void main(String[] args) {
		Customer.options();
		
//		Driver HUD = new Driver();
//		int userID = HUD.getPersonID(1,3);
//		//System.out.println(userID);
//		switch (userID) {
//		case 1:
//			//if admin, show options
//			break;
//		case 2:
//			//if employee, show options
//			Customer.options();
//			break;
//		case 3:
//			//if customer, prompt for login or register and go on from there
//			//Customer a = new Customer();
//			
//			Customer.options();
//			break;
//	}
//		
//		
	}
	
	public int getPersonID(int min, int max) {
		//greet the user and tell them to pick which person they will run the program as
		
		System.out.println("Please tell the AI who you are.");				
		System.out.println(" Press 1 for Admin.\n Press 2 for Employee.\n Press 3 for Customer.");
			
				String person = null;
				int personID=-1;
				Scanner input = null;
				while (personID <min || personID >max) {
					
					try {
						input = new Scanner(System.in);
						personID = input.nextInt();
						input.nextLine();
						if (personID<min || personID >max) {
							//if user doesn't put in 1,2, or 3
							throw new Exception("Number not found");
						}
					} catch (Exception e) {
						System.out.println("Sorry, I didn't quite catch that. Could you try again?");
						}	
					
				}
				input.close();
				switch (personID) {
					case 1:
						person = "Admin";
						break;
					case 2:
						person = "Employee";
						break;
					case 3:
						person = "Customer";
						break;
				}
				
				//inform the user which person they have selected
				System.out.println("You have selected " + person);
				return personID;
	}
}
