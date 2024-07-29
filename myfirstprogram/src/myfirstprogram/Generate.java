/**
 * 
 */
package myfirstprogram;
import java.util.Random;

public class Generate {

	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt();
		double y = random.nextDouble();
		long z = random.nextLong();
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
