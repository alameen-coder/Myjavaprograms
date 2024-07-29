 package myfirstprogram;
 import java.util.ArrayList;

public class TraversingLoop {

	public static void main(String[] args) {
		/* for-each = traversing technique to iterate through the elements in array/collection
		             less steps, more readable
		             less flexible
		
		 */
		
		// String[] animals  = {"cats", "eagle", "dog", "duck"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("duck");
		animals.add("eagle");
		
		for (String i : animals) {
		  System.out.println(i);
		}

	}

}
