//****************************************************
//Programmer:  Karson Mathews
//Writing Classes-
//Homework 2:  Kennel
//Date:        9/30/21
//Description: Driver program for class 'Dog'. This program
//			   creates to new objects from class 'Dog' and 
//		       prints out the dogs' descriptions as well as
//			   their age in human years.
//****************************************************** 


public class Kennel {
	public static void main(String[] args) {
		//Declaring and creating two new Dog objects
		Dog dog1 = new Dog("Bob", 7);
		Dog dog2 = new Dog("Butch", 2);
		
		//Intro
		System.out.println("This program computes and outputs descriptions of Dogs (Name and Age).");
		
		//Printing descriptions of both Dogs using the toString method.
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		
		//Setting the new name of dog1 to "Frank"
		dog1.setName("Frank");
		
		//Setting the age of dog2 +1 years, so 2+1 =3 years
		dog2.setAge(3);
		
		//Printing out the Dogs in human years
		System.out.println("The age of "+ dog1.getName() + " in person years is " + dog1.getPersonYears() + ".");
		System.out.println("The age of "+ dog2.getName() + " in person years is " + dog2.getPersonYears() + ".");
		
		//Printing both descriptions of the dogs (dog1 & dog2) again with the toString method.
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
	}
}
