package day4Labs;

import java.util.*;

public class Bonus3 {

	public static void main(String[] args) {
		// Setup scanner for user input
		Scanner sc = new Scanner(System.in);
		// Assign variable to user input
		String choice = "y";
		
		// Welcome message
		System.out.println("Welcome to the Guess a Number Game!");
		System.out.println();
		
		
		// Set while loop to look for "y" from user input
		while (choice.equalsIgnoreCase("y")) {
			
			// Ask user how many dice sides to use
			System.out.println("I'm thinking of a number between 1 and 100 \nTry to guess it you noob.");
			System.out.println();
			
			System.out.println("Enter your guess fool:   ");
			// guess = sc.nextLine();
			
			
			// Ask if user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}


	}

	public static void randomGuess(int guessMe) {
		Random rand = new Random();
		int setNumber = 1;
		setNumber = rand.nextInt(guessMe) + 1;
		
	}
}
