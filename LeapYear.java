//****************************************************
//Programmer:  Karson Mathews
//Conditionals
//Homework:    LeapYear
//Date:        10/05/21
//Description: Reads in an input from user (year) and determines
//			   If the year provided is a leap year. Use (%)
//		       for the expressions. If year < 1582, output 
//			   error message. Else, output whether the year is
//			   a leap year or not.
//****************************************************** 
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		//Variables used to hold our inputs and expressions
		int year, ans1, ans2, ans3;
		
		// Create a Scanner object
		Scanner scan = new Scanner(System.in);  
		
		//Intro and prompting for input from user to obtain the year
		System.out.println("This program will determine whether the year you provide is a leap year in the Gregorian calender or not.");
		System.out.println("Please enter a year (Ex. 2020):");
		year = scan.nextInt();
		
		//The main if statement checking to make sure the year provided is after 1582
		if (year<1582) {
			System.out.println("ERROR: Cannot input any year before 1583.");
			System.exit(0);  //Close program if the input is less 1582
		}
		
		else {
			//Expressions used to figure out if the year is a leap year
			ans1 = year%4;
			ans3 = year%400;
			ans2 = year%100;
			
			//If year%400 is zero (remainder = 0), then the year is a leap year
			if (ans3 == 0) {
				System.out.println("The year " + year + " is a Leap Year.");
				System.exit(0);
			}
			
			//If the year%4 is zero (remainder=0), then we have to make sure
			//the year is not divisible by 100 and if so, the year is not a leap year.
			if(ans1 == 0) {
				if (ans2==0) 
					System.out.println("The year " + year + " is not a Leap Year.");
				if (ans2 != 0)
					System.out.println("The year " + year + " is a Leap Year.");	
			}
		}
	}
}
