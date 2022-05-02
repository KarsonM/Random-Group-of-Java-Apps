//****************************************************
//Programmer:  Karson Mathews
//Array
//Homework 1:  SStates
//Date:        10/26/21
//Description: Create an ArrayList of the following States:
//			   Texas, New Mexico, Arizona, Colorado, and Arkansas.
//			   Prints out the list. Then, adds a new state, Oklahoma
//			   in the 4th position of the arrayList. Delete Arkansas,
//             and finally prints out the list of southwest states
//			   each on a seperate line.
//****************************************************** 

//Needed package to use an ArrayList
import java.util.ArrayList;

public class SStates {
	public static void main(String[] args) {
		
		//Creating my arrayList for the states
		ArrayList<String> southwestStates = new ArrayList<String>();
		
		//Adding the states to my arrayList
		southwestStates.add("Texas");
		southwestStates.add("New Mexico");
		southwestStates.add("Arizona");
		southwestStates.add("Colorado");
		southwestStates.add("Arkansas");
		
		//Printing the arrayList
		System.out.println(southwestStates);
		
		//Adding to index [3], Oklahoma
		southwestStates.add(3, "Oklahoma");
		
		//Removing Arkansas from the arrayList at index[5]
		southwestStates.remove(5);
		
		//Printing the arrayList with each component of a new line 
		for(String value : southwestStates) 
			System.out.println(value);
	
	}
}
