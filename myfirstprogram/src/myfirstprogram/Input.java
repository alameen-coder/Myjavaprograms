package myfirstprogram;
import java.util.Scanner;


public class Input {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your first name?");
		String firstname = scanner.nextLine();
		
		
		System.out.println("what is yout last name?");
		String lastname = scanner.nextLine();
		
		System.out.println("How old are you?");
		// boolean age = scanner.nextBoolean();
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What's your favorite food?");
		String food = scanner.nextLine();
		
		
		System.out.println("Hello, " + firstname + " " + lastname);
		System.out.println("You're " + age + "years  old");
		System.out.println("Your favorite food is "+ food);
		
		
	}

}
