import java.util.Scanner;
//Using a loop require a positive number be enter until done properly by user.
public class positive {
	public static void main (String[] args) {
		int amount;
		Scanner scan = new Scanner(System.in);  
		System.out.print ("Enter a positive integer: ");
		amount = scan.nextInt ();

		while (amount < 0){
			System.out.println ("ERROR: The number you provided was not a positive integer.");
			System.out.print ("Enter a positive integer.");
			amount = scan.nextInt ();
		}

	}
}
