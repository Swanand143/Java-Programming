package multidimensionalarray;

public class UpperLowerTriangle {

	public static void main(String[] args) {
		int [][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println("Sum Of Lower Triangle : "+sumOfLowerTri(a));
		System.out.println("Sum Of Upper Triangle : "+sumOfUpperTri(a));
		System.out.println("Result : "+sumOfLowerUpper(a));
	}
	public static int sumOfUpperTri(int[][]ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				//here we run iteration where the j is bigger than i 
				//for accessing only the upper tringle of matrix
				//if (j>i) {
					sum += ar[i][j];
			//}
			}
		}
		return sum;
	}
	public static int sumOfLowerTri(int[][]ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < i; j++) {
				//here we run iteration where the j is lesser than i 
				//for accessing only the lower tringle of matrix
				//if (j<i) {
					sum += ar[i][j];
			//}
			}
		}
		return sum;
	}
	
	public static boolean sumOfLowerUpper(int[][]a) {
		return sumOfUpperTri(a)==sumOfLowerTri(a);
	}
	
}