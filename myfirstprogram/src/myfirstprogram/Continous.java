package myfirstprogram;
import java.util.Scanner;


public class Continous {

	public static void main(String[] args) {
		
		// while loop = excutes ablock of code as long as a it's condition remain true
		
		Scanner scanner = new Scanner(System.in);
		String name = " ";
		
		/** do {
			System.out.print( "Enter your name: ");		
		  name = scanner.nextLine();	
		}
		while(name.isBlank());
		**/
		
		while(name.isBlank()) {
			System.out.print( "Enter your name: ");		
		  name = scanner.nextLine();	
		}
		
		
		System.out.println("Hello " + name);
	}

}
