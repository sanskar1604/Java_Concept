public class StringDataype {

	public static void main(String[] args) {
		
		//Below two ways to define string in Java
		// one way
		String address = new String("India");
		
		//second way
		String name = "Sanskar";
		
		
		String x = "Ram";	//x will point memory location of Ram stored in String Pool.
		String a = new String ("Ram");	// a will point location of Ram stored in Heap Memory.
		String b = new String (x);		// b will point location of Ram stored in Heap Memory.
		String c = "Ram";	// c will point memory location of Ram stored in String pool.
		String d = "Ram";	// d will point memory location od Ram stored in String pool.
		
		// == operator is used to check location reference for string in Java 
		System.out.println(a==b);	//false -- because in a and b creating new memory location for Ram, so both a and b are pointing to different location.
		System.out.println(c==d);	//true	-- because for c and d, Ram is stored in string pool, so location is same.
	}
}