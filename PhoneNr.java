//****************************************************
//Programmer:  Karson Mathews
//Homework 1:  PhoneNr
//Date:        9/14/21
//Description: Generate and print out a random phone #
//			   in the format XXX-XXX-XXXX. Do not let the first
//		       3 digits contain an 8 or 9 and second set of 3 digits
//			   is not greater than 742 and cannot be 000.
//****************************************************** 

//Packages used
import java.util.*;
import java.text.*;

public class PhoneNr{
	public static void main(String arg[]) {
		Random generator = new Random(); //Assigning Generator as our object to call
		
		//Variables used
		int res1, res2, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		Locale locale = new Locale("en");
		
		num1 = generator.nextInt(8); //Generates random # b/w 0-7
		num2 = generator.nextInt(8); //Generates random # b/w 0-7
		num3 = generator.nextInt(8); //Generates random # b/w 0-7
		num4 = generator.nextInt(8); //Generates random # b/w 0-7
		if (num4 == 7) {
			num5 = generator.nextInt(5); //Generates random # b/w 0-4
			num6 = generator.nextInt(3); //Generates random # b/w 0-2
		} else if (num4 == 0) {
			num5 = generator.nextInt(10) +1; //Generates random # b/w 0-9
			num6 = generator.nextInt(8) +1; //Generates random # b/w 1-9
		} else {
			num5 = generator.nextInt(10); //Generates random # b/w 0-9
			num6 = generator.nextInt(10); //Generates random # b/w 0-9
		}
		num7 = generator.nextInt(10); //Generates random # b/w 0-9
		num8 = generator.nextInt(10); //Generates random # b/w 0-9
		num9 = generator.nextInt(10); //Generates random # b/w 0-9
		num10 = generator.nextInt(10); //Generates random # b/w 0-9
		
		//Changing grouping symbol to a dash
		DecimalFormatSymbols newSymbol = new DecimalFormatSymbols(locale);
		newSymbol.setGroupingSeparator('-');
		
		//Using two different formats to make the phone # format: XXX-XXX-XXXX
		DecimalFormat fmt = new DecimalFormat ("000,000", newSymbol);
		DecimalFormat fmt2 = new DecimalFormat ("0000", newSymbol);
		
		//Converting my randomly generated numbers to strings
		String s1 = Integer.toString(num1);
		String s2 = Integer.toString(num2);
		String s3 = Integer.toString(num3);
		String s4 = Integer.toString(num4);
		String s5 = Integer.toString(num5);
		String s6 = Integer.toString(num6);
		String s7 = Integer.toString(num7);
		String s8 = Integer.toString(num8);
		String s9 = Integer.toString(num9);
		String s10 = Integer.toString(num10);
		
		//Combing my strings together to then convert back to an int to format
		String number = s1+s2+s3+s4+s5+s6;
		String number2 = s7+s8+s9+s10;
		res1 = Integer.parseInt(number);
		res2 = Integer.parseInt(number2);
		
		//Printing the number
		System.out.println("The Random Phone number is: " + fmt.format(res1) + "-" + fmt2.format(res2));

	}
}
