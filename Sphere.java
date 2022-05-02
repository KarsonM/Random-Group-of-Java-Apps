//****************************************************
//Programmer:  Karson Mathews
//Homework 1:  Sphere
//Date:        9/14/21
//Description: Ask user for input of radius (w/0 using scanner)
//			   Calculate surface area and volume (0.####)
//		       Calculate percentage of surface area in volume
//			   Print with percent number format
//****************************************************** 
//Packages used
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;

public class Sphere{
	public static void main(String arg[]) {
		//Variables Used:
		double r, volume, area, perc;
		
		//Formatting used
		DecimalFormat fmt = new DecimalFormat ("0.####");
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		//Obtaining input from user w/o scanner and converting from String to double
		String radius = JOptionPane.showInputDialog ("Enter the radius: ");
		r = Double.parseDouble(radius);
		
		//Formulas to calculate area and volume
		area = (4 * Math.PI * Math.pow(r,  2));
		volume = 4 / 3 * (Math.PI*Math.pow(r,  3));
		
		//Applying formatting to necessary variables and printing to screen with JOptionPane
		String formatarea = fmt.format(area);
		String formatvolume = fmt.format(volume);
		JOptionPane.showMessageDialog(null , "Surface Area of the circle: " + formatarea);
		JOptionPane.showMessageDialog(null , "Volume of the circle: " + formatvolume); 

		//Calculating percentage of area in volume, applying formatting and printing to screen
		perc =  area/volume;
		String percentage = percent.format(perc);
		JOptionPane.showMessageDialog(null , "Percentage of surface area in Volume: " + percentage);

		//Closing
		System.exit(0);
	}
}
