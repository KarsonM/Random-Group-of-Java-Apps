//****************************************************
//Programmer:  Karson Mathews
//Array
//Homework 2:  NegNumbers
//Date:        11/01/21
//Description: Using a loop, assign the values 0,-.1,-.2,..,-1.0
//			   to an array. Then, prints out the array to the console
//			   with a tab between each number.
//****************************************************** 

import java.text.DecimalFormat;

public class NegNumbers {
	public static void main(String[] args) {
		//Creating my array with a size of 11
		double[] arrayOfNumbers = new double[11];
		
		//Variables
		int index = 0;
		double total = .1;
		
		//Assigning values to my array using a while loop incrementing by -.1 starting at 0
		while (index < arrayOfNumbers.length) {
			total = total-0.1;
			arrayOfNumbers[index] = total;
			index++;
		}
		
		//Formatting for my output
		DecimalFormat fmt = new DecimalFormat ("#.0");

		//Printing my array using a for loop and my formatting
		for(int i = 0; i < arrayOfNumbers.length; i++) 
			System.out.print(fmt.format(arrayOfNumbers[i]) + "\t");
	}
}
