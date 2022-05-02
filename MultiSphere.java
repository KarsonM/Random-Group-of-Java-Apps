//****************************************************
//Programmer:  Karson Mathews
//Writing Classes-
//Homework 1:  MultiSphere
//Date:        9/28/21
//Description: Class MultiSphere is the driver class for Sphere2.
//			   Here we are executing multiple different funtions
//		       within the class to set and get different desired 
//			   values. 
//****************************************************** 


public class MultiSphere {
	public static void main(String[] args) {
		//Creating new sphere objects
		Sphere2 sphere1 = new Sphere2(6.7999);
		Sphere2 sphere2 = new Sphere2(11.792);
		
		//Printing out intro
		System.out.println("Hello, this program has the ability to manipulate the diameter to obtain the area and volume of a Sphere.");
		//Printing diameters of both spheres by using getDiameter method
		System.out.println("The 1st Sphere has a diameter of " +sphere1.getDiameter() + ".");
		System.out.println("The 2nd Sphere has a diameter of " +sphere2.getDiameter() + ".");
		
		//Setting new diameter of sphere1 object with the setDiameter method
		sphere1.setDiameter(7.1379);
		
		//Printing new diameter of sphere1 by using getDiameter method
		System.out.println("After changing the diameter of 1st Sphere, the diameter is now = " + sphere1.getDiameter() + ".");
		
		//Printing Volume of both sphere1 and sphere2 by using the getVolume method
		System.out.println("The 1st Sphere has a volume of " +sphere1.getVolume() + ".");
		System.out.println("The 2nd Sphere has a volume of " +sphere2.getVolume() + ".");
		
		//Print out Area of both sphere1 and sphere2 by using the getArea method
		System.out.println("The 1st Sphere has a surface area of " +sphere1.getArea() + ".");
		System.out.println("The 2nd Sphere has a surface area of " +sphere2.getArea() + ".");
		
		//Printing out sphere1 diameter with the toString method
		System.out.println("Printing diameter of 1st Sphere with toString:" + sphere1.toString());
	}
}
