public class FindElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {1, 4, 2, 55, 7, -2};
		int a = 55;
		
		for(int i: arr) {
			if(i == a) {
				System.out.println("Found");
			}
		}

	}

}
