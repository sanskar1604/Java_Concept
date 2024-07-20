public class ArithematicOperator {

	public static void main(String[] args) {
		
		int d = 10;
		int e = 20;
		
		//Addition
		int f = d + e;	//30
		
		int yourSalary = 1000;
		int deduction = 500;
		
		//Subtraction
		int monthlyTotal = yourSalary - deduction;	//500
		
		//Multiplication
		int yearlyTotal = monthlyTotal * 12;	//6000
		
		//Division
		int perchild = yearlyTotal / 3;		//2000
		
		int a = 5;
		int b = 3;
		
		//Modulus
		int remainder = a % b;	//2
		
		float floatValue = 12.2f;
		double doubleValue = 23723.2234;
		
		//Implicit conversion of float to double
		System.out.println(floatValue + doubleValue);

	}

}
