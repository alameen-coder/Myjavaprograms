package myfirstprogram;
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		/** logical operators = used to connect two or more expressions
		
		     && = (AND) both conditions must be true
		     || = (OR) either conditions must be true
		     ! = (NOT) reverses boolean value of a condition
		     
		**/
		
		//Scanner scanner = new Scanner(System.in);
		
	/**	int temp = 10;
		
		if (temp > 30 ) {
			System.out.println("It is Hot outside");
		}
		
		else if (temp >= 20 && temp <= 30) {
			System.out.println("It is warm outside");
		}

		else {
			System.out.println("It is cold outside");
		}
		**/
		
		
/**		Scanner scanner = new Scanner(System.in);
		System.out.println("You're playing a game!\n Press q or Q to quit");
		String response = scanner.next();
		
		if (response.equals("q") || response.equals("Q")) {
			
			System.out.println("You quit the game");
			
		}
		
		else {
			System.out.println("You are still paying the game 'pow pow' ");
		}
		
	**/	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You're playing a game!\n Press q or Q to quit");
		String response = scanner.next();
		
		if (!response.equals("q") && !response.equals("Q")) {
			
			System.out.println("You are still paying the game 'pow pow'");
			
		}
		
		else {
			System.out.println("You quit the game");
		}
		
		
		
		
	}

}