//****************************************************
//Programmer:  Karson Mathews
//Array
//Homework 1:  Cereal
//Date:        10/26/21
//Description: Create an ArrayList of the following Cereal:
//			   Frosted Flakes, Wheaties, Rice Krispies,
//			   Cheerios, and Fruit Loops. Next, add Corn Flakes
//			   to the arrayList. Printing out each of the cereals
//			   with a tab between each one. Finally, printing out
//             the size of the array.
//****************************************************** 

//Needed package to use an ArrayList
import java.util.ArrayList;

public class Cereal {
	public static void main(String[] args) {
		//Declaring my ArrayList, Cereal
		ArrayList<String> cereal = new ArrayList<String>();
		
		//Adding my elements to the ArrayList
	    cereal.add ("Frosted Flakes");
	    cereal.add ("Wheaties");
		cereal.add ("Rice Krispies");
		cereal.add ("Cheerios");
		cereal.add ("Fruit Loops");
		
		//Printing out list
		System.out.println(cereal);
		
		//Removing Fruit loops from my array list by its index number '4'
		cereal.remove(4);
		
		
		System.out.println(cereal);
		
		//Adding Corn Flakes to my arraylist in the second spot
		cereal.add (1, "Corn Flakes");

		
		//Print out list with a tab between each cereal
		for(String value : cereal) {
			System.out.print(value + "\t");
		}
		
		//Skipping to next line for next print
		System.out.println();
		
		//Printing out the Size of the array list
		System.out.println("Size of the ArrayList, Cereal: " + cereal.size());
		
	}
}
