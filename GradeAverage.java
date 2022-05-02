//****************************************************
//Programmer:  Karson Mathews
//Conditionals
//Homework 2:  GradeAverage
//Date:        10/12/21
//Description: Ask user for input of 10 student grades
//			   (using JOptionPane instead of Scanner class)
//			   using a while loop. Then calculates the class
//		       average of the grades and outputs the answer 
//			   back to the user using DecimalFormat (0.00)
//****************************************************** 

//Packages used
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class GradeAverage {
	public static void main(String[] args) {
		//Formatting for final output to two decimal places
		DecimalFormat fmt = new DecimalFormat ("0.00");
		
		//Variables Used
		int totalStudents = 0;  
		int totalGrade = 0;
		
		//Intro using JOptionPane instead of scanner class
		JOptionPane.showMessageDialog(null , "This program takes 10 student's grades and computes the class average.");
		
		//While loop receiving all 10 inputs from user  
		while (totalStudents <= 9) {
			int grade = Integer.parseInt( JOptionPane.showInputDialog ("Enter the grade for the students: "));
			totalGrade = totalGrade + grade;
			totalStudents++; 
		}
		
		//Calculating the class average 
		double avg = totalGrade/10.00;
		
		//Applying the DecimalFormat to our avg variable
		String formattedAvg = fmt.format(avg);

		//Outputting to user final class average
		JOptionPane.showMessageDialog(null , "The class average from the 10 grades you enter is: " + formattedAvg);
		System.exit(0);
	}
}
