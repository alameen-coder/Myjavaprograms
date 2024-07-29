package myfirstprogram;

public class Wrapper {

	public static void main(String[] args) {
		/** wrapper class = provides a way to use primitive data types as reference data types 
		 *                  reference data types contain useful methods
		 *                   can be used with collections (ex.ArrayList) 
		 *
		 */

		//Primitive      // wrapper
		// --------      // -------
		// boolean        Boolean
		// char           Character
		// int            Integer
		// double         Double
		
		
		// autoboxing = the automatic conversion that the java complier makes between the primitive types and their corresponding object wrapper classes  
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive 
		
		//autoboxing
		Boolean a = true;
		Character b = '$';
		Integer c = 123;
		Double d = 3.14;
		String e = "Al-ameen";
		
		// unboxing
		if (a == true) {
			System.out.println("This is true"); 
		}
		
		
	}

}
