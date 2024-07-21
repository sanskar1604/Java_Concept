public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = new char[3][2];
		arr[0][0] = 'a';
		arr[0][1] = 'b';
		arr[1][0] = 'c';
		arr[1][1] = 'd';
		arr[2][0] = 'e';
		arr[2][1] = 'f';
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j] + " ");
			}
		}

	}

}
