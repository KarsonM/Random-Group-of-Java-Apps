//*******************************************************************
//Programmer:  Karson Mathews
//Array
//Homework 2:  Checkbook
//Date:        11/01/21
//Description: Declares a starting balance of $100. Use a method 
//			   called 'checkBalance' that accepts parameters 
//			   (balance, deposit, checks[]) allowing multiple 
//			   checks to be inputed. This method returns the total
//			   balance after the deposit and checks were taken out.
//			   Finally the main method calls the method checkBalance()
//			   and outputs the new checkbook balance.
//*******************************************************************

import java.text.DecimalFormat;

public class Checkbook {
	public static void main(String[] args) {
		//Variables
		double current = 100;
		double total = 0;
		
		//Calling the method checkBalance with certain parameters
		total = checkBalance(current, 75, 40, 40);
		
		//Decimal formatting needed and printing output to screen
		DecimalFormat fmt = new DecimalFormat ("0.00");
		System.out.println("The new checkbook balance is $" + fmt.format(total) + "."); 
	}
	
	//Method checkBalance takes in the balance, the deposit, and can take multiple checks and returns the new total of your checkbook
	public static double checkBalance(double balance, double deposit, double... checks) {
		int sum = 0;
		
		//adding the checks together into sum
		for(double i : checks) {
			sum+=i;
		}
		
		//Totaling the overall balance by adding the deposits and subtracting the checks
		balance = balance+deposit-sum;
		return balance;
	}
}
