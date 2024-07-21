public class Array {

	public static void main(String[] args) {
		
		int[] arr = new int[10]; // When we create object using new keyword then it will stored in Heap Memory. and starting address of array stored in Stack Memory.
		int a = 1;	//When we create variable then it will stored in Stack Memory
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
