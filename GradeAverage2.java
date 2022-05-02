//****************************************************
//Programmer:  Karson Mathews
//Conditionals
//Homework 3:  GradeAverage2
//Date:        10/14/21
//Description: Ask user for input of student grades (using
//			   JOptionPane instead of Scanner class) while
//			   using a sentinel controlled do-while loop. 
//			   Then calculates the class average of the grades
//			   and outputs the answer back to the user 
//			   using DecimalFormat (0.00)
//****************************************************** 

/*To Exit the program simply input
 *the sentinel value of '200' provided
 *in the Messages to the user.
 */

//Packages used
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class GradeAverage2 {
	public static void main(String[] args) {
		//Formatting for final output to two decimal places
		DecimalFormat fmt = new DecimalFormat ("0.00");
		
		//Variables Used
		int totalStudents = 0;  
		int students = 0;
		int totalGrade = 0;
		int grade;
		int SENTINEL = 200;
		
		//Intro using JOptionPane instead of scanner class
		JOptionPane.showMessageDialog(null , "This program takes student's grades and computes the class average.");
		JOptionPane.showMessageDialog(null , "When you are finished entering grades, enter the 'SENTINEL' value.");
		
		//do-while loop using sentinel value to end the loop 
		do {
			grade = Integer.parseInt( JOptionPane.showInputDialog ("Enter the grades for up to 10 students (SENTINEL VALUE = '200'):"));
			totalGrade += grade;
			students++; 
		}
		while (grade != SENTINEL);
		
		totalStudents = students - 1;
		totalGrade -= SENTINEL;
		//Calculating the class average 
		double avg = (double) (totalGrade)/(totalStudents);
		
		//Applying the DecimalFormat to our avg variable
		String formattedAvg = fmt.format(avg);
		
		//Outputting to user final class average
		JOptionPane.showMessageDialog(null , "The class average from the "+ totalStudents +" grades you enter is: " + formattedAvg);
		System.exit(0);
	}
}
