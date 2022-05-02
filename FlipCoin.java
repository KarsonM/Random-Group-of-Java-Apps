//****************************************************
//Programmer:  Karson Mathews
//Conditionals
//Homework 3:  FlipCoin
//Date:        10/14/21
//Description: Driver Program for class "Coins" setup to flip
//			   a coin 100 times and output the amount of times
//			   the coin flipped heads or tails. 
//****************************************************** 

//Packages used
import java.util.Random;

public class FlipCoin {
	public static void main(String[] args) {
		//Creating new objects for class 'Coins' and the 'Random' class.
		Coins coin = new Coins();
		Random generator = new Random(); 
		
		int numberOfTimes = 0;  //counter
		int totalHeads = 0;     //counter for total number of heads.
		int totalTails = 0;     //counter for total number of tails.
		
		//looping 100 times to get results from 100 flips. 
		while (numberOfTimes !=100) {
			int result = generator.nextInt(2);  //Random pick of 0 (heads) or 1 (tails)
			if (coin.heads == result)			//If coin.heads (0) == result (0 or 1) then
				totalHeads = totalHeads + 1;    //Keeping count of heads by adding one every time a heads flips
			else if (coin.tails == result)		//If coin.tails (1) == result (0 or 1) then
				totalTails = totalTails + 1;    //Keeping count of heads by adding one every time a tails flips
			numberOfTimes++;  					//Counting to 100
		}
		
		//Print total of both heads and tails to screen
		System.out.println("You flipped heads " + totalHeads + " times.");
		System.out.println("You flipped tails " + totalTails + " times.");
	}
}
