//****************************************************
//Programmer:  Karson Mathews
//Array
//Homework 1:  MyNumbers
//Date:        10/26/21
//Description: Creates an array of 10 numbers and initializes
//			   them with a for loop starting with the number 5
//			   and adding 5 each position of the array after. 
//			   Prints the array to screen using a for loop.
//			   Resigns index [6], or number 35, with 77.
//             Finally, prints array to screen with the updated
//			   number change.
//****************************************************** 

public class MyNumbers {
	public static void main(String[] args) {
		//Creating my array with 10 digits
		int[] arrayOfNumbers = new int[10];
		
		//Initializing my array starting with the value of 5 and incrementing
		//by 5 each time using a for loop
		for (int i = 0; i < arrayOfNumbers.length; i++) 
			arrayOfNumbers[i] = 5+i*5;
		
		//Printing my array using a for loop
		for(int i = 0; i < arrayOfNumbers.length; i++) 
			System.out.print(arrayOfNumbers[i] + "\t");
		
		//Adding a space between outputs
		System.out.println();
		
		//Assigning the value 77 to the value 35 at index [6]
		arrayOfNumbers[6] = 77;
		
		//Printing my array using a for loop
		for(int i = 0; i < arrayOfNumbers.length; i++) 
			System.out.print(arrayOfNumbers[i] + "\t");
	
	}
}
