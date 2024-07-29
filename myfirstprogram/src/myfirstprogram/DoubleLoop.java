package myfirstprogram;

import java.util.Scanner;

public class DoubleLoop {

	public static void main(String[] args) {
		// nested loop = a loop inside of a loop

		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("ENTER # of ROWS: ");
		rows = scanner.nextInt();
		
		System.out.println("ENTER # of COLUMNS: ");
		columns = scanner.nextInt();
		
		System.out.println("ENTER SYMBOL to USE");
		symbol = scanner.next();
		
		
		// outer loop
		for (int i = 1; i <= rows; i++) {
			System.out.println();
			 
			for ( int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
				
		
	}

}
