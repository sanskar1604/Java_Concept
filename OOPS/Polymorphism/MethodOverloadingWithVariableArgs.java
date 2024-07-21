/*
 * using ... we can pass any number of parameter separated using comma.
 */
public class MethodOverloadingWithVariableArgs {
	
	public static void main(String[] args) {
		System.out.println(multi(1,2,3,4,5));
	}
	
	public static int multi(int... a) {
		int mul = 1;
		for(int i: a) {
			mul *= i;
		}
		return mul;
	}

}