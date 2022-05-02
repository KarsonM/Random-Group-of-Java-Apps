//****************************************************
//Programmer:  Karson Mathews
//Homework 1:  Distance
//Date:        9/14/21
//Description: Ask user for input of two coordinates (x & y)
//			   then computes the distance b/w the two points
//		       using the formula: Distance = the square root
//			   (x2-x1)^2 + (y2-y1)^2
//****************************************************** 
import java.util.*;

public class Distance{
	public static void main(String arg[]) {
		int x1, y1, x2, y2;
		double dist;
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		
		//Obtaining input from user for points necessary
	    System.out.println("Enter the cordinate for point #1, x: ");
	    x1 = scan.nextInt();
	    System.out.println("Enter the cordinate for point #1, y: ");
	    y1 = scan.nextInt();
	    System.out.println("Enter the cordinate for point #2, x: ");
	    x2 = scan.nextInt();
	    System.out.println("Enter the cordinate for point #2, y: ");
	    y2 = scan.nextInt();
	    
	    //Formula to calculate distance
	    dist = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	    
	    //Printing answer back to screen with 2 decimal places
	    System.out.printf("The distance between Point #1(" +x1+ "," +y1+") and Point #2("+x2+ "," +y2+") is: %.2f", dist);
	}
} 
