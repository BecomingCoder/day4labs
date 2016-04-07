package day4Labs;


import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("Welcome to the Fatorial Calculator!");
		System.out.println();
		
		// Scanner for user input and check for "y" loop
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		
		
		while (choice.equalsIgnoreCase("y")) {
			// Get input from user
			System.out.print("Enter an integer from 1 to 9: ");
			int userInput = sc.nextInt();
			sc.nextLine();
			int factored = 1;
			
			for (int i = 1; i <= userInput; i++) {
				factored = factored * i;
			}
			
			
			System.out.println("The factorial of " + userInput + " is " + factored);
			
			// Ask if you want to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
		
		
		sc.close();
		System.out.println("See ya!");
	}

}
