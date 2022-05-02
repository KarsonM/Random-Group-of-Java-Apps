//****************************************************
//Programmer:  Karson Mathews
//Conditionals 
//Homework:    Conditionals_1
//Date:        10/05/21
//Description: Provided a code fragment, provide the output
//			   of the code. Below, I have created a program 
//		       to run the code fragment provided and wrote
//			   in comments the exact output. 
//****************************************************** 
//The output of the following code fragment will be:
//lime
//grape
public class Conditionals_1 {
	public static void main(String[] args) {
		
//      ------------Code Fragment-------------
		int limit = 100, num1 = 15, num2 = 40;
		if (limit <= limit)  //limit = limit so we enter if statement
		{
		    if (num1 == num2)  // num1 != num2 so we dont enter this if statement
			System.out.println("lemon");
		    System.out.println("lime");  //print, outside of if
		}
		System.out.println("grape");  //print
//      ------------Code Fragment-------------
		/*
		output should be:
		lime
		grape
		*/
	}

}
