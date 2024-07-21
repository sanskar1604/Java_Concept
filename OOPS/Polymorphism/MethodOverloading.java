/*
 * Method Overloading -- 
 * means method name is same, but parameters is different.
 * Parameters different means -- Either number of parameter is different or Data type of parameter is different
 */

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		

	}
	
	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int sum(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	
	

}