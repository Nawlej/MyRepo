package bankapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {
	//can create their own accounts with name, and make transactions
	
	//list customer options
	public static void options() {
		System.out.println("What would you like to do? \n Press 1 to Login.\n Press 2 to register an account.");
		int a = getIntInput(1,2);
		switch (a) {
			case 1:
				System.out.println("Please enter your username:");
				String b = Customer.getStringInput();
				System.out.println(b);
				break;
			case 2:
				break;
		}
	}

	//if apply for account
	
	//if deposit
	
	//if withdraw
	
	//user string input, for usernames, passwords?
	public static String getStringInput() {
		String input=null;
		Scanner s = null;
		while (input==null) {
			try {	
				s = new Scanner(System.in);
				input = s.nextLine();
			} catch (Exception e) {
				System.out.println("Sorry, I didn't quite catch that. Could you try again?");
			} 
		}
		s.close();
		return input;
	}
	
	
	//user int input
	public static int getIntInput(int min,int max) {
		int input=0;
		Scanner s = null;
		while (input <min || input >max) {	
			try {	
				s = new Scanner(System.in);
				input = s.nextInt();
				s.nextLine();
				if (input<min || input >max) {
					throw new Exception("Number not found");
				}
				//need to handle issue if user decides to input a double or string to troll.
			} catch (Exception e) {
				System.out.println("Sorry, I didn't quite catch that. Could you try again?" + input);
			}
		}
		s.close();
		return input;
	}
	
	
}
