package myfirstprogram;

public class TwoDarrray {

	public static void main(String[] args) {
		// 2D Array = an array of arrays
		
/**		String [][] cars = new String [3][3];
		
		cars[0][0] = "Camero";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Telsa";
		cars[2][2] = "Toyota";
		
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
		    for ( int j = 0; j < cars.length; j++) {
		    	System.out.print(cars[i][j] + " ");
		    }
		    **/
	

		String [][] cars = {
				{"Camero", "Corvette", "Silverado"},
				{"Mustang", "Ranger", "F-150" },
				{ "Ferrari", "Telsa", "Toyota" }
		};
		
	
		
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
		    for ( int j = 0; j < cars.length; j++) {
		    	System.out.print(cars[j][i] + " ");
		    }
		
		}

	}

}
