public class ExplicitConversion {

	public static void main(String[] args) {
		// Explicit Conversion or Narrowing Conversion
		
		double doubleValue = 123.456;
		float floatValue = (float) doubleValue;	//Narrowing conversion from double to float.
		long longValue = (long) floatValue;	//Narrowing conversion from float to long.
		int intValue = (int) longValue;	//Narrowing conversion from long to int.
		
		System.out.println("double: " +doubleValue);
		System.out.println("float: " + floatValue);
		System.out.println("long: " + longValue);
		System.out.println("int: " +intValue);

	}

}
