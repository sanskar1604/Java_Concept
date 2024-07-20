public class ImplicitConversion {
	public static void main(String[] args) {
		
		//Widening Conversion or Implicit Conversion (Automatic Conversion)
		byte byteValue = 10;	//  -- 1 byte
		short shortValue = byteValue;	//Widening conversion from byte to short	-- 2 byte
		int intValue = shortValue;	//Widening conversion from short to int	-- 4 byte
		long longValue = intValue;	//Widening conversion from int to long. -- 8 byte
		float floatValue = longValue;	//Widening conversion from long to float.	-- 4 byte
		double doubleValue = floatValue;	//Widening conversion from float to double.	-- 8 byte
		
		System.out.println("int: " + intValue);
		System.out.println("long: " + longValue);
		System.out.println("float: " + floatValue);
		System.out.println("double: " + doubleValue);
		
		
		char charValue = 'A';	// 2 byte
		int intValueChar = charValue;	//Widening conversion from char to int
		float floatValueChar = charValue;	//Widening conversion from char to float.
		
		System.out.println("char: " + charValue);
		System.out.println("intChar: " + intValueChar);
		System.out.println("floatChar: " + floatValueChar);
		
	}

}
