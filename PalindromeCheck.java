/***********************************************
*PalindromeCheck.java
************************************************
*Determines if a 4-digit number is a palindrome. 
*Connie Truong
*February 6th, 2020
*CMSC 255 Section 003
***********************************************/

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String [] args) {

		/*************************
		*Create scanner
		**************************/
		Scanner input = new Scanner(System.in);


		/*****************************
		*Prompt user to enter a value
		******************************/
		System.out.println("Enter 0 if you would like to enter a 4-digit number.  Enter 1 if you would like to have the computer generate it.");


		/********************************************************
		*Allows for storage of input and also declaring variables
		*********************************************************/
		int answer = input.nextInt ();
		int userChoice = 1;
		int randomNumber = 2;


		/******************************************************************
		*Allows for user to enter own number or generation of random number
		*******************************************************************/
		
		if (answer == 1) {
			randomNumber = (int) (1000 + Math.random() * 8999);
			System.out.println(randomNumber);
		}
		else if (answer == 0) {
			System.out.println("Enter the 4-digit number:");
			userChoice = input.nextInt();

			if ((userChoice < 1000) || (userChoice > 9999))
			System.out.println("Incorrect input");
		}
		else
			System.out.println("Incorrect input");


		/*************************************
		*Check if the numbers are palindromes
		**************************************/
		int digOneChoice = userChoice / 1000;
		int digTwoChoice = (userChoice / 100) % 10;
		int digThreeChoice = (userChoice / 10) % 10;
		int digFourChoice = userChoice % 10;

		int digOneRan = randomNumber / 1000;
		int digTwoRan = (randomNumber / 100) % 10;
		int digThreeRan = (randomNumber / 10) % 10;
		int digFourRan = randomNumber % 10;


		/*****************************************************************************
		*Check to see if 1st and 4th match and 2nd and 3rd match by giving the answers
		******************************************************************************/
		if ((userChoice != 1) && (userChoice < 10000) && (userChoice > 1000))

		if (digOneChoice == digFourChoice && digTwoChoice == digThreeChoice)
			System.out.println(userChoice + " is a palindrome");
		else
			System.out.println(userChoice + " is not a palindrome"); 



		if (randomNumber != 2)
		
		if (digOneRan == digFourRan && digTwoRan == digThreeRan)
				System.out.println(randomNumber + " is a palindrome"); 
		else 
			System.out.println(randomNumber + " is not a palindrome"); 
	}
}