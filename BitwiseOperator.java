public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		//and operator (&)
		System.out.println(Integer.toBinaryString(4));
		System.out.println(Integer.toBinaryString(5));
	
		System.out.println("5 & 4: " +(5&4)); 	// 4
		
		//or operator (|)
		System.out.println("5 |4: " +(5|4));	//5
		
		//xor operator(^)
		System.out.println("5 ^ 4: " + (5^4));	//1
		
		//Reverse all the bit of 5 after converting to binary
		//not operator (~)
		System.out.println("~5: " +(~5));	//-6
		
		//Shift each bit to left after converting 5 to binary
		//left shift (<<)
		int a = 5;
		int c = a<<1;
		System.out.println("a<<1: " + c); 	//10
		
		//Shift each bit to right after converting 5 to binary
		//left most bit will be 1, if shifting is performed on negative number
		//right shift (>>)
		int d = a>>1;
		System.out.println("a>>1: " +d);	//1
		
		//filled left most bit with 0 after shifting
		//unsigned right shift (>>>)
		int e = a>>>3;
		System.out.println("a>>>3: " + e); 	//0
	}
}
