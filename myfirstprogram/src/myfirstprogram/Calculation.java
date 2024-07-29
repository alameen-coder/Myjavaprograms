package myfirstprogram;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		
/**		double x = 3.14;
		double y = 10;
		
		//double z = Math.max(x, y);
		//double z = Math.min(x, y);
		//double z = Math.abs(x);
		//double z = Math.sqrt(y);
		//double z = Math.round(x);
		//double z = Math.ceil(x); //round up
		double z = Math.floor(x); //round down
		
		System.out.println(z);
		**/
		
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x) + (y*y));
		System.out.println(z);
		
		
		scanner.close();
		
		
		
		

	}

}
