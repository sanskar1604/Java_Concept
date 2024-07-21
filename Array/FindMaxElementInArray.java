public class FindMaxElementInArray {

	public static void main (String[] args) {
		int arr[] = {2, 12, 4322, -32, 22};
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max Element: " +max);
	}
	
}
