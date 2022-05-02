//****************************************************
//Programmer:  Karson Mathews
//Array
//Homework 2:  Seasons
//Date:        11/01/21
//Description: Creates an array of seasons: Spring, Summer, Fall,
//			   and Winter and the prints the array out in 
//			    reverse order using a for loop.   
//****************************************************** 

public class Seasons {
	public static void main(String[] args) {
		//Defining and assigning values to my array
		String[] arrayOfSeasons = new String[] {"Spring","Summer","Fall","Winter"};
		
		System.out.println("The seasons in reverse order:");
		
		//Using a for loop, outputting the array in reverse
		for(int i = arrayOfSeasons.length-1; i >=0; i--) 
			System.out.println(arrayOfSeasons[i]);
	}
}
