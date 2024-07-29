package myfirstprogram;

public class Ifstatement {

	public static void main(String[] args) {
		
		// if statement = performs a block of code if it's condition evaluations to be true
       int age = 17 ;
       
       if (age >= 18) {
    	   System.out.println("You're an Adult");
    	  
       }
       
       else if ( age < 18) {
       System.out.println("You're a teenager");
       }
       
       else if ( age == 17 ) {
    	   System.out.println("You're not an Adult");
       }
		
		
	}

}
