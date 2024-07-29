package myfirstprogram;
import java.util.ArrayList;

public class Resizable {

	public static void main(String[] args) {
		/** ArrayList = a resizable array.
	                    Elements can be added and removed after compilation phase
	                    Store reference data types	
**/
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("Hamburger");
		food.add("hotdog");
		
		food.set(0, "Sushi");
		food.remove(2);
		food.clear();
		
		for (int i = 0; i< food.size(); i++) {
			System.out.println(food.get(i)); 
		}
		
		
	}

}