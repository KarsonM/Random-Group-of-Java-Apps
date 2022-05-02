//Using a switch case, ask user for 'X' referring to months and the year all in a loop until SENTINEL is hit. 
//Output to the user the Month following how many days are in the month that year.

import java.util.Scanner;

public class DaysInMonths {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		
		String year, month;
		String SENTINEL = "Good Bye";
		
		do {
		System.out.println("Please enter the digit referencing the month you would like: (X)");
		month = scan.next();
		int months = Integer.parseInt(month);  //Changing input from A String to an int
		System.out.println("Please enter the year you would like: (XXXX) ");
		year = scan.next();
		int years = Integer.parseInt(year);
		
		int ans1 = years%4;
		int ans3 = years%400;
		int ans2 = years%100;
		
		
		
		switch (months) {
			case 12:
				System.out.println("December of " + years + " has 31 days.");
				break;
			case 11:
				System.out.println("November of " + years + " has 30 days.");
				break;
			case 10:
				System.out.println("October of " + years + " has 31 days.");
				break;
			case 9:
				System.out.println("September of " + years + " has 30 days.");
				break;
			case 8:
				System.out.println("August of " + years + " has 31 days.");
				break;
			case 7:
				System.out.println("July of " + years + " has 30 days.");
				break;
			case 6:
				System.out.println("June of " + years + " has 31 days.");
				break;
			case 5:
				System.out.println("May of " + years + " has 30 days.");
				break;
			case 4:
				System.out.println("April of " + years + " has 31 days.");
				break;
			case 3:
				System.out.println("May of " + years + " has 30 days.");
				break;
			case 2:
				if (ans3==0) {
					System.out.println("February of " + years+ " has 29 days.");
				}
				else if (ans1==0) {
					if (ans2==0) {
						System.out.println("February of " + years + " has 30 days.");
					}
					
						
				}
				break;
			case 1:
				System.out.println("January of " + years + " has 31 days.");
				break;
				
		}
		
	}
	while (month != SENTINEL || year != SENTINEL);
}
}
