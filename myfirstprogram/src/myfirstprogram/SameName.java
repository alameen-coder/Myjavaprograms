package myfirstprogram;

public class SameName {

	public static void main(String[] args) {
		// overloaded methods = methods that share the same name but have different parameters
  		//                       method name + parameters = method signature

		int x = add(5,3,6,1);
		
		System.out.println(x);
	}

	static int add(int a, int b) {
		System.out.println("This is overload method #1");	
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overload method #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overload method #3");
		return a + b + c + d;
	}
	
	
	
}
