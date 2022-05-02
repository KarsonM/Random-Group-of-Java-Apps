//****************************************************
//Programmer:  Karson Mathews
//Writing Classes-
//Homework 1:  Sphere2
//Date:        9/28/21
//Description: Class Sphere2 has the ability to get the following:
//			   Diameter, Area, and Volume as well as set them.
//		       Includes a toString method for diameter. 
//			   
//****************************************************** 

//Our class for Sphere2
public class Sphere2 {
	//Our private variables we will use within the class
	private double diameter, area, volume;

	//The class Constructor
	public Sphere2(double d) {
		diameter = d;
	}
	
	//getDiameter method to return diameter when called
	public double getDiameter() {
		return diameter;
	}
	
	//setDiameter method to set a new diameter
	public void setDiameter(double ans) {
		if(ans>0)
			diameter = ans;
	}
	
	//setArea method to set the area for the getArea function
	public void setArea(double diameter) {
		double radius = diameter/2;
		area = 4*Math.PI*Math.pow(radius, 2);
	}
	
	//getArea method to return the surface area when called
	public double getArea() {
		setArea(diameter);
		return area;
	}
	
	//setVolume method to set the volume for the getVolume function
	public void setVolume(double diameter) {
		double radius = diameter/2;
		volume = (4/3)*Math.PI*Math.pow(radius, 2);
	}
	
	//getVolume method to return the volume when called
	public double getVolume() {
		setVolume(diameter);
		return volume;
	}
	
	//toString method to change diameter from a double to a string and print 
	public String toString() {
		String diam = Double.toString(diameter);
		return "The Sphere has a diameter of " + diam + ".";
	}
}
