public class PrimitiveDatatypes {

	public static void main(String[] args) {
		//Integral Number
			byte age1 = 20;		//1 byte
			short age2 = 30;	//2 byte
			int age = 20;		//4 byte
			long age3 = 40;		//8 byte
			
			//Byte Min and Max Value
			System.out.println("Byte Min Value: " + Byte.MIN_VALUE);	//-128
			System.out.println("Byte Max Value: "+ Byte.MAX_VALUE);		//127
			
			//Short Min and Max Value
			System.out.println("Short Min Value: " + Short.MIN_VALUE);	//-32768
			System.out.println("Short Max Value: " + Short.MAX_VALUE);	//32767
			
			//Integer Min and Max Value
			System.out.println("Int Min Value: " + Integer.MIN_VALUE);	//-2147483648
			System.out.println("Int Max Value: " + Integer.MAX_VALUE);	//2147483647
			
			//Long Min and Max Value
			System.out.println("Long Min Value: " + Long.MIN_VALUE);	//-9223372036854775808
			System.out.println("Long Max Value: " + Long.MAX_VALUE);	//9223372036854775807
			
		//decimal Number
			float mySalary = 100.11231123122341f;	//4 byte
			double yourSalary = 100.11231123122341;	// 8 byte
			System.out.println(mySalary);	//100.11231
			System.out.println(yourSalary);	//100.11231123122342
			
			//Float Min and Max Value
			System.out.println("Float Min Value: " + Float.MIN_VALUE);	//1.4E-45
			System.out.println("Float Max Value: " + Float.MAX_VALUE);	//3.4028235E38
			
			//Double Min and Max Value
			System.out.println("Double Min Value: " + Double.MIN_VALUE);	//4.9E-324
			System.out.println("Double Max Value: " + Double.MAX_VALUE);	//1.7976931348623157E308
			
			//characters
				char myCharacter = 'a';	// 2 byte.
				
				//Character Min and Max Value
				//We can find character Min and Max value by converting it to interger (typeCasting) only.
				System.out.println("Characte Min Value: " + (int) Character.MIN_VALUE);		//0
				System.out.println("Character Max Value: " + (int) Character.MAX_VALUE);
				
			//booleans
				boolean a = true;	// 1 bit
				boolean b = false;
				
				System.out.println(a);
				System.out.println(b);

	}

}
