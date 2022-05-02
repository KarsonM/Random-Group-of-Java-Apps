//****************************************************
//Programmer:  Karson Mathews
//Writing Classes-
//Homework 2:  Dog
//Date:        9/30/21
//Description: Class containing variables name and age for the dog.
//			   Also, get and set methods for both name and age as well
//		       as age in human years. A toString method returning a 
//			   one-line description of the dog.
//****************************************************** 

//Class
public class Dog {
	//Instance data variables
	private String name;
	private int age, humanYears;
	
	//The class Constructor
	public Dog(String n, int a) {
		name = n;
		age = a;
	}
	
	//setName method to set a new name.
	public void setName(String ans) {
		name = ans;
	}
	
	//getName method to get the name of a certain dog.
	public String getName() {
		return name;
	}
	
	//setAge method to set a dog's desired age.
	public void setAge(int ans) {
		age = ans;
	}
	
	//getAge method to get the age of a certain dog.
	public int getAge() {
		return age;
	}
	
	//setPersonYears method sets the dogs current age to human years (age * 7)
	public void setPersonYears(int age) {
		humanYears = age*7;	
	}
	
	//getPersonYears method uses the setPersonYears method to then return their age in human years.
	public int getPersonYears() {
		setPersonYears(age);
		return humanYears;
	}
	
	//toString method that converts the age to a string and prints a one-line description of the dog.
	public String toString() {
		String ageString = Integer.toString(age);
		return "The Dog's name is " + name + " and he is " + ageString + " years old.";
	}
}

